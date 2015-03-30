/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package at.ac.tuwien.big.momot.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import javax.script.ScriptEngine;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.Change;
import org.eclipse.emf.henshin.interpreter.Change.CompoundChange;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.PartitionedEGraph;
import org.eclipse.emf.henshin.interpreter.impl.ChangeImpl.CompoundChangeImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl;
import org.eclipse.emf.henshin.interpreter.info.ConditionInfo;
import org.eclipse.emf.henshin.interpreter.info.RuleInfo;
import org.eclipse.emf.henshin.interpreter.info.VariableInfo;
import org.eclipse.emf.henshin.interpreter.matching.conditions.AndFormula;
import org.eclipse.emf.henshin.interpreter.matching.conditions.ApplicationCondition;
import org.eclipse.emf.henshin.interpreter.matching.conditions.ConditionHandler;
import org.eclipse.emf.henshin.interpreter.matching.conditions.IFormula;
import org.eclipse.emf.henshin.interpreter.matching.conditions.NotFormula;
import org.eclipse.emf.henshin.interpreter.matching.conditions.OrFormula;
import org.eclipse.emf.henshin.interpreter.matching.conditions.XorFormula;
import org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot;
import org.eclipse.emf.henshin.interpreter.matching.constraints.Solution;
import org.eclipse.emf.henshin.interpreter.matching.constraints.SolutionFinder;
import org.eclipse.emf.henshin.interpreter.matching.constraints.TypeConstraint.PartitionThread;
import org.eclipse.emf.henshin.interpreter.matching.constraints.Variable;
import org.eclipse.emf.henshin.model.And;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Not;
import org.eclipse.emf.henshin.model.Or;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Xor;
import org.eclipse.emf.henshin.model.staticanalysis.PathFinder;

import at.ac.tuwien.big.momot.ocl.OCLScriptEngine;

/**
 * An extended version of the condition handler that allows to specify which 
 * scripting engine handles which protocol (specified in the attribute 
 * conditions).
 *  
 * The majority of the code has been copied from the original implementation of
 * {@link EngineImpl} provided under EPL as inner classes could not be 
 * inherited and overridden.
 * 
 * @deprecated
 */
public class OldMomotEngine extends EngineImpl implements Engine {

	/**
	 * Cached graph options.
	 */
	protected final Map<Graph,MatchingOptions> graphOptions;
	
		private Map<String, ScriptEngine> scriptEngines = new HashMap<>();
		
		private ScriptEngine oclEngine = new OCLScriptEngine();
		
		public ScriptEngine registerScriptEngine(String protocol, ScriptEngine engine) {
			return scriptEngines.put(protocol, engine);
		}
		
		public ScriptEngine getOCLEngine() {
			return oclEngine;
		}
		
		/**
		 * Default constructor.
		 */
		public OldMomotEngine() {
			this(true);
		}
		
		public OldMomotEngine(boolean deterministic) {
			super();
			graphOptions = new HashMap<Graph,MatchingOptions>();
			registerScriptEngine("ocl:", new OCLScriptEngine());
			getOptions().put(Engine.OPTION_DETERMINISTIC, deterministic);
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Engine#findMatches(org.eclipse.emf.henshin.model.Rule, org.eclipse.emf.henshin.interpreter.EGraph, org.eclipse.emf.henshin.interpreter.Match)
		 */
		@Override
		public Iterable<Match> findMatches(Rule rule, EGraph graph, Match partialMatch) {
			if (rule==null || graph==null) {
				throw new NullPointerException("Rule and graph must not be null");
			}
			if (partialMatch==null) {
				partialMatch = new MatchImpl(rule);
			}
			return new MatchGenerator(rule, graph, partialMatch);
		}

		/**
		 * Match generator class. Delegates to {@link MatchFinder}.
		 */
		private final class MatchGenerator implements Iterable<Match> {

			/**
			 * Rule to be matched.
			 */
			private final Rule rule; 

			/**
			 * Object graph.
			 */
			private final EGraph graph;

			/**
			 * A partial match.
			 */
			private final Match partialMatch;

			/**
			 * Default constructor.
			 * @param rule Rule to be matched.
			 * @param graph Object graph.
			 * @param partialMatch Partial match.
			 */
			public MatchGenerator(Rule rule, EGraph graph, Match partialMatch) {
				this.rule = rule;
				this.graph = graph;
				this.partialMatch = partialMatch;
			}

			/*
			 * (non-Javadoc)
			 * @see java.lang.Iterable#iterator()
			 */
			@Override
			public Iterator<Match> iterator() {
				return new MatchFinder(rule, graph, partialMatch, new HashSet<EObject>());
			}

		} // MatchGenerator

		/**
		 * Match finder class. Uses {@link SolutionFinder} to find matches.
		 */
		private final class MatchFinder implements Iterator<Match> {

			/**
			 * The next match.
			 */
			private Match nextMatch;

			/**
			 * Flag indicating whether the next match was computed.
			 */
			private boolean computedNextMatch;

			/**
			 * Target graph.
			 */
			private final EGraph graph;

			/**
			 * Solution finder to be used.
			 */
			private final SolutionFinder solutionFinder;

			/**
			 * Rule to be matched.
			 */
			private final Rule rule;

			/**
			 * Cached rule info.
			 */
			private final RuleInfo ruleInfo;

			/**
			 * Used objects.
			 */
			private final Set<EObject> usedObjects;

			/**
			 * Default constructor.
			 * @param rule Rule to be matched.
			 * @param graph Object graph.
			 * @param partialMatch A partial match.
			 * @param usedObjects Used objects (for ensuring injectivity).
			 */
			public MatchFinder(Rule rule, EGraph graph, Match partialMatch, Set<EObject> usedObjects) {
				this.rule = rule;
				this.ruleInfo = getRuleInfo(rule);
				this.graph = graph;
				this.usedObjects = usedObjects;
				this.solutionFinder = createSolutionFinder(partialMatch);
			}

			/*
			 * (non-Javadoc)
			 * @see java.util.Iterator#hasNext()
			 */
			@Override
			public boolean hasNext() {
				if (!computedNextMatch) {
					computeNextMatch();
					computedNextMatch = true;
				}
				return (nextMatch!=null);
			}

			/*
			 * (non-Javadoc)
			 * @see java.util.Iterator#next()
			 */
			@Override
			public Match next() {
				if (hasNext()) {
					computedNextMatch = false;
				}
				return nextMatch;
			}

			/*
			 * (non-Javadoc)
			 * @see java.util.Iterator#remove()
			 */
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}

			/**
			 * Compute the next match.
			 */
			private void computeNextMatch() {

				// We definitely need a solution finder:
				if (solutionFinder==null) {
					nextMatch = null;
					return;
				}

				// Find the next solution:
				Solution solution = solutionFinder.getNextSolution();
				if (solution==null) {
					nextMatch = null;
					return;
				}

				// Create the new match:
				nextMatch = new MatchImpl(rule);

				// Parameter values:
				for (Entry<String,Object> entry : solution.parameterValues.entrySet()) {
					Parameter param = nextMatch.getUnit().getParameter(entry.getKey());
					if (param!=null) {
						nextMatch.setParameterValue(param, entry.getValue());
						for(ScriptEngine engine : scriptEngines.values())
							engine.put(param.getName(), entry.getValue());
					}
				}

				// LHS node targets:
				Map<Node,Variable> node2var = ruleInfo.getVariableInfo().getNode2variable();
				for (Node node : rule.getLhs().getNodes()) {
					nextMatch.setNodeTarget(node, solution.objectMatches.get(node2var.get(node)));
				}

				// Handle the multi-rules:
				for (Rule multiRule : rule.getMultiRules()) {

					// The used kernel objects:
					Set<EObject> usedKernelObjects = new HashSet<EObject>(usedObjects);
					usedKernelObjects.addAll(nextMatch.getNodeTargets());

					// Create the partial multi match:
					Match partialMultiMatch = new MatchImpl(multiRule);
					for (Parameter param : rule.getParameters()) {
						Parameter multiParam = multiRule.getParameter(param.getName());
						if (multiParam!=null) {
							partialMultiMatch.setParameterValue(multiParam, nextMatch.getParameterValue(param));
						}
					}
					for (Mapping mapping : multiRule.getMultiMappings()) {
						partialMultiMatch.setNodeTarget(mapping.getImage(),
								nextMatch.getNodeTarget(mapping.getOrigin()));
					}

					// Find nested multi-matches:
					List<Match> nestedMatches = nextMatch.getMultiMatches(multiRule);
					
					// Check if we can use worker threads:
					if (workerPool!=null && (graph instanceof PartitionedEGraph) && (multiRule.getLhs().getNodes().size() > 1)) {
						
						// Create match finder workers:
						List<Future<List<Match>>> matchFinderFutures = new ArrayList<Future<List<Match>>>();
						int partitions = ((PartitionedEGraph) graph).getNumPartitions();
						for (int p=0; p<partitions; p++) {
							Set<EObject> freshUsedObjects = new HashSet<EObject>(usedKernelObjects);
							MatchFinder matchFinder = new MatchFinder(multiRule, graph, partialMultiMatch, freshUsedObjects);
							MatchFinderWorker worker = new MatchFinderWorker(matchFinder, p);
							matchFinderFutures.add(workerPool.submit(worker));
						}
						
						// Collect found matches:
						try {
							for (Future<List<Match>> futures : matchFinderFutures) {
								nestedMatches.addAll(futures.get());
							}
						} catch (Throwable t) {
							throw new RuntimeException(t);
						}
						
					} else {
						
						// Otherwise execute directly in this thread:
						MatchFinder matchFinder = new MatchFinder(multiRule, graph, partialMultiMatch, usedKernelObjects);
//						if(printer != null) {
//							System.out.println("Find application for rule " + multiRule);
//							System.out.println("with: " + partialMultiMatch + " in: ");
//							System.out.println("with: " + usedKernelObjects + " in: ");
//							System.out.println(printer.print(graph));
//						}
						while (matchFinder.hasNext()) {
							nestedMatches.add(matchFinder.next());
						}
//						if(printer != null) {
//							System.out.println("FOUND: " + nestedMatches.size());
//							System.out.println("--------------");
//						}
					}
				}
			}
			
			/**
			 * Create a solution finder.
			 * @param partialMatch A partial match.
			 * @return The solution finder.
			 */
			protected SolutionFinder createSolutionFinder(Match partialMatch) {

				// Get the required info objects:
				final ConditionInfo conditionInfo = ruleInfo.getConditionInfo();
				final VariableInfo varInfo = ruleInfo.getVariableInfo();

				// Evaluates attribute conditions of the rule:
				ConditionHandler conditionHandler = new MomotConditionHandler(
						conditionInfo.getConditionParameters(), scriptEngine.getEngine(),
						scriptEngines);

				/* The set "usedObjects" ensures injective matching by removing *
				 * already matched objects from other DomainSlots               */

				/* Create a domain map where all variables are mapped to slots. *
				 * Different variables may share one domain slot, if there is a *
				 * mapping between the nodes of the variables.                  */

				Map<Variable,DomainSlot> domainMap = new HashMap<Variable,DomainSlot>();

				for (Variable mainVariable : varInfo.getMainVariables()) {
					Node node = varInfo.getVariableForNode(mainVariable);
					MatchingOptions opt = getMomotGraphOptions(node.getGraph());
					DomainSlot domainSlot = new DomainSlot(conditionHandler, 
							usedObjects, opt.injective, opt.dangling, opt.deterministic, 
							inverseMatchingOrder);

					// Fix this slot?
					EObject target = partialMatch.getNodeTarget(node);
					if (target!=null) {
						domainSlot.fixInstantiation(target);
					}

					// Add the dependent variables to the domain map:
					for (Variable dependendVariable : varInfo.getDependendVariables(mainVariable)) {
						domainMap.put(dependendVariable, domainSlot);
					}
				}

				// Check if any of the conditions failed:
				for (Parameter param : rule.getParameters()) {
					Object value = partialMatch.getParameterValue(param);
					if (value!=null && !conditionHandler.setParameter(param.getName(), value)) {
						return null;
					}
				}
				if(graph != null && graph.getRoots() != null)
					if(graph.getRoots().isEmpty())
						System.err.println("ROOOT EMPTY!?!?!");
					else
						conditionHandler.setParameter(OCLScriptEngine.CONTEXT_VARIABLE, graph.getRoots().get(0));

				// Sort the main variables based on the size of their domains:
				Map<Graph,List<Variable>> graphMap = new HashMap<Graph, List<Variable>>();
				for (Entry<Graph,List<Variable>> entry : ruleInfo.getVariableInfo().getGraph2variables().entrySet()) {
					List<Variable> vars = new ArrayList<Variable>(entry.getValue());
					if (sortVariables) {
						Collections.sort(vars, new VariableComparator(graph, varInfo, partialMatch));  // sorting the variables
					}
					graphMap.put(entry.getKey(), vars);
				}
				
				// Now initialize the match finder:
				SolutionFinder solutionFinder = new SolutionFinder(graph, domainMap, conditionHandler);
				solutionFinder.variables = graphMap.get(rule.getLhs());
				solutionFinder.formula = initFormula(rule.getLhs().getFormula(), graph, graphMap, domainMap);
				return solutionFinder;

			}

			/**
			 * Initialize a formula.
			 */
			private IFormula initFormula(Formula formula, EGraph graph, Map<Graph,List<Variable>> graphMap, Map<Variable,DomainSlot> domainMap) {
				if (formula instanceof And) {
					And and = (And) formula;
					IFormula left = initFormula(and.getLeft(), graph, graphMap, domainMap);
					IFormula right = initFormula(and.getRight(), graph, graphMap, domainMap);
					return new AndFormula(left, right);
				}
				else if (formula instanceof Or) {
					Or or = (Or) formula;
					IFormula left = initFormula(or.getLeft(), graph, graphMap, domainMap);
					IFormula right = initFormula(or.getRight(), graph, graphMap, domainMap);
					return new OrFormula(left, right);
				}
				else if (formula instanceof Xor) {
					Xor xor = (Xor) formula;
					IFormula left = initFormula(xor.getLeft(), graph, graphMap, domainMap);
					IFormula right = initFormula(xor.getRight(), graph, graphMap, domainMap);
					return new XorFormula(left, right);
				}
				else if (formula instanceof Not) {
					Not not = (Not) formula;
					IFormula child = initFormula(not.getChild(), graph, graphMap, domainMap);
					return new NotFormula(child);
				}
				else if (formula instanceof NestedCondition) {
					NestedCondition nc = (NestedCondition) formula;
					if (nc.isTrue() || PathFinder.pacConsistsOnlyOfPaths(nc)) { // check if we really need nested condition
						return IFormula.TRUE;
					}
					if (nc.isFalse()) {
						return IFormula.FALSE;
					}
					return initApplicationCondition(nc, graph, graphMap, domainMap);
				}
				return IFormula.TRUE;
			}

			/**
			 * Initialize an application condition.
			 */
			private ApplicationCondition initApplicationCondition(NestedCondition nc, EGraph graph, Map<Graph, List<Variable>> graphMap, Map<Variable,DomainSlot> domainMap) {
				ApplicationCondition ac = new ApplicationCondition(graph, domainMap);
				ac.variables = graphMap.get(nc.getConclusion());
				ac.formula = initFormula(nc.getConclusion().getFormula(), graph, graphMap, domainMap);
				return ac;
			}

		} // MatchFinder

		/**
		 * Match finding worker. To be used in a worker thread pool.
		 * It MUST be executed in a {@link PartitionThread}.
		 * @author Christian Krause
		 */
		private final class MatchFinderWorker implements Callable<List<Match>> {
			
			/**
			 * Match finder to be used.
			 */
			private final MatchFinder matchFinder;
			
			/**
			 * Partition to be used.
			 */
			private final int partition;

			/**
			 * Constructor.
			 * @param matchFinder Match finder to be used.
			 * @param partition Partition to be used.
			 */
			MatchFinderWorker(MatchFinder matchFinder, int partition) {
				this.matchFinder = matchFinder;
				this.partition = partition;
			}
			
			/*
			 * (non-Javadoc)
			 * @see java.util.concurrent.Callable#call()
			 */
			@Override
			public List<Match> call() throws Exception {
				Variable firstVar = matchFinder.solutionFinder.variables.get(0);
				PartitionThread thread = (PartitionThread) Thread.currentThread();
				thread.partition = partition;
				thread.firstDomainSlot = matchFinder.solutionFinder.domainMap.get(firstVar);
				List<Match> matches = new ArrayList<Match>();
				while (matchFinder.hasNext()) {
					matches.add(matchFinder.next());
				}
				return matches;
			}
		
		} // MatchFinderWorker

		/**
		 * Comparator for variables. Used to sort variables for optimal matching order.
		 */
		private class VariableComparator implements Comparator<Variable> {

			/**
			 * Target graph.
			 */
			private final EGraph graph;

			/**
			 * Variable info.
			 */
			private final VariableInfo varInfo;

			/**
			 * Partial match.
			 */
			private final Match partialMatch;

			/**
			 * Default sign to be used.
			 */
			private final int sign;
			
			/**
			 * Constructor.
			 * @param graph Target graph
			 * @param varInfo Variable info.
			 * @param partialMatch Partial match.
			 */
			public VariableComparator(EGraph graph, VariableInfo varInfo, Match partialMatch) {
				this.graph = graph;
				this.varInfo = varInfo;
				this.partialMatch = partialMatch;
				this.sign = inverseMatchingOrder ? 1 : -1;
			}

			/*
			 * (non-Javadoc)
			 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
			 */
			@Override
			public int compare(Variable v1, Variable v2) {

				// Get the corresponding nodes:
				Node n1 = varInfo.getVariableForNode(v1);
				if (n1==null) return sign;
				Node n2 = varInfo.getVariableForNode(v2);
				if (n2==null) return -sign;

				// One of the nodes already matched or an attribute given as a parameter?
				if (partialMatch!=null) {
					if (isNodeObjectMatched(n1) && !isNodeObjectMatched(n2)) return -sign;
					if (isNodeObjectMatched(n2) && !isNodeObjectMatched(n1)) return sign;
					if (isNodeAttributeMatched(n1) && !isNodeAttributeMatched(n2)) return -sign;
					if (isNodeAttributeMatched(n2) && !isNodeAttributeMatched(n1)) return sign;
				}

				// Get the domain sizes (smaller number wins):
				int s = (graph.getDomainSize(v1.typeConstraint.type, v1.typeConstraint.strictTyping) - 
						graph.getDomainSize(v2.typeConstraint.type, v2.typeConstraint.strictTyping));
				if (s!=0) return (sign * s);

				// Attribute count (larger number wins):
				int a = (n2.getAttributes().size() - n1.getAttributes().size());
				if (a!=0) return (sign * a);

				// Outgoing edge count (larger number wins):
				return (sign * (n2.getOutgoing().size() - n1.getOutgoing().size()));

			}

			private boolean isNodeObjectMatched(Node node) {
				return (partialMatch.getNodeTarget(node)!=null);
			}

			private boolean isNodeAttributeMatched(Node node) {
				for (Attribute attribute : node.getAttributes()) {
					String value = attribute.getValue();
					if (value!=null) {
						Parameter param = node.getGraph().getRule().getParameter(value);
						if (param!=null && partialMatch.getParameterValue(param)!=null) {
							return true;
						}
					}
				}
				return false;
			}

		} // VariableComparator

		/**
		 * Get the cached rule info for a given rule.
		 * @param rule Rule.
		 * @return The (cached) rule info.
		 */	 
		protected RuleInfo getRuleInfo(Rule rule) {
			RuleInfo ruleInfo = ruleInfos.get(rule);
			if (ruleInfo == null) {
				ruleInfo = new RuleInfo(rule, this);
				ruleInfos.put(rule, ruleInfo);
				
				// Listen to changes:
				rule.eAdapters().add(ruleListener);
		
				// Check for missing factories:			
				for (Node node : ruleInfo.getChangeInfo().getCreatedNodes()) {
					if (node.getType()==null) {
						throw new RuntimeException("Missing type for " + node);
					}
					if (node.getType().getEPackage()==null || 
						node.getType().getEPackage().getEFactoryInstance()==null) {
						throw new RuntimeException("Missing factory for '" + node + 
								"'. Register the corresponding package, e.g. using PackageName.eINSTANCE.getName().");
					}
				}
			}
			return ruleInfo;
		}
		
		/**
		 * Clear the cache of this engine.
		 */
		public void clearCache() {
			ruleInfos.clear();
			graphOptions.clear();
		}
		
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Engine#createChange(org.eclipse.emf.henshin.model.Rule, org.eclipse.emf.henshin.interpreter.EGraph, org.eclipse.emf.henshin.interpreter.Match, org.eclipse.emf.henshin.interpreter.Match)
		 */
		@Override
		public Change createChange(Rule rule, EGraph graph, Match completeMatch, Match resultMatch) {

			// We need a result match:
			if (resultMatch==null) {
				resultMatch = new MatchImpl(rule, true);
			}

			// Create the object changes:
			CompoundChangeImpl complexChange = new CompoundChangeImpl(graph);
			createChanges(rule, graph, completeMatch, resultMatch, complexChange);
			return complexChange;

		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Engine#getOptions()
		 */
		@Override
		public Map<String,Object> getOptions() {
			return options;
		}

		/**
		 * Data class for storing matching options.
		 */
		private static class MatchingOptions {
			boolean injective;
			boolean dangling;
			boolean deterministic;
		}

		/**
		 * Get the options for a specific rule graph. 
		 * The graph should be either the LHS or a nested condition.
		 * @param graph The graph.
		 * @return The cached options.
		 */
		protected MatchingOptions getMomotGraphOptions(Graph graph) {
			MatchingOptions options = graphOptions.get(graph);
			if (options==null) {
				
				// Use the base options:
				options = new MatchingOptions();
				Rule rule = graph.getRule();
				Boolean injective = (Boolean) this.options.get(OPTION_INJECTIVE_MATCHING);
				Boolean dangling = (Boolean) this.options.get(OPTION_CHECK_DANGLING);
				Boolean determistic = (Boolean) this.options.get(OPTION_DETERMINISTIC);
				options.injective = (injective!=null) ? injective.booleanValue() : rule.isInjectiveMatching();
				options.dangling = (dangling!=null) ? dangling.booleanValue() : rule.isCheckDangling();
				options.deterministic = (determistic==null || determistic.booleanValue());
				
				// Always use default values for nested conditions:
				if (graph!=rule.getLhs()) {
					options.injective = true;
					options.dangling = false;
					options.deterministic = true;
				}
				
				graphOptions.put(graph, options);
			}
			return options;
		}
		
//		private IMatchSolutionPrinter printer;
//		public void setGraphPrinter(IMatchSolutionPrinter printer) {
//			this.printer = printer;
//		}
		
		
		@Override
		public void createChanges(Rule rule, EGraph graph, Match completeMatch,
			Match resultMatch, CompoundChange complexChange) {
			for (Parameter param : rule.getParameters()) {
				Object value = completeMatch.getParameterValue(param);
				for(ScriptEngine engine : scriptEngines.values())
					engine.put(param.getName(), value);
			}
			super.createChanges(rule, graph, completeMatch, resultMatch, complexChange);
		}
		
		@Override
		public Object evalAttributeExpression(Attribute attribute, Rule rule) {
			return super.evalAttributeExpression(attribute, rule);
		}
}
