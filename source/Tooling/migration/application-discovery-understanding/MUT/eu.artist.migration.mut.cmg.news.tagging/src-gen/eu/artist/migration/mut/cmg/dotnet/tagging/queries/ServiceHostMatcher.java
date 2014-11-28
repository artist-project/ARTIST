package eu.artist.migration.mut.cmg.dotnet.tagging.queries;

import eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHostMatch;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.util.ServiceHostQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import org.eclipse.uml2.uml.Property;

/**
 * Generated pattern matcher API of the eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHost pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ServiceHostMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern ServiceHost (cl : Class, pr : Property) {
 * 
 * 	StructuredClassifier.ownedAttribute(cl, pr);
 * 	Property.type(pr, typ);
 * 	Type.name(typ, nm);
 * 	check (
 * 		nm == "ServiceHost"
 * 	);
 * }
 * </pre></code>
 * 
 * @see ServiceHostMatch
 * @see ServiceHostProcessor
 * @see ServiceHostQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ServiceHostMatcher extends BaseMatcher<ServiceHostMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ServiceHostMatcher> querySpecification() throws IncQueryException {
    return ServiceHostQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ServiceHostMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ServiceHostMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ServiceHostMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CL = 0;
  
  private final static int POSITION_PR = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ServiceHostMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public ServiceHostMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public ServiceHostMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @return matches represented as a ServiceHostMatch object.
   * 
   */
  public Collection<ServiceHostMatch> getAllMatches(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
    return rawGetAllMatches(new Object[]{pCl, pPr});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @return a match represented as a ServiceHostMatch object, or null if no match is found.
   * 
   */
  public ServiceHostMatch getOneArbitraryMatch(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
    return rawGetOneArbitraryMatch(new Object[]{pCl, pPr});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
    return rawHasMatch(new Object[]{pCl, pPr});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
    return rawCountMatches(new Object[]{pCl, pPr});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final org.eclipse.uml2.uml.Class pCl, final Property pPr, final IMatchProcessor<? super ServiceHostMatch> processor) {
    rawForEachMatch(new Object[]{pCl, pPr}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final org.eclipse.uml2.uml.Class pCl, final Property pPr, final IMatchProcessor<? super ServiceHostMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCl, pPr}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<ServiceHostMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pCl, pPr});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ServiceHostMatch newMatch(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
    return ServiceHostMatch.newMatch(pCl, pPr);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for cl.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<org.eclipse.uml2.uml.Class> rawAccumulateAllValuesOfcl(final Object[] parameters) {
    Set<org.eclipse.uml2.uml.Class> results = new HashSet<org.eclipse.uml2.uml.Class>();
    rawAccumulateAllValues(POSITION_CL, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for cl.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfcl() {
    return rawAccumulateAllValuesOfcl(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cl.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfcl(final ServiceHostMatch partialMatch) {
    return rawAccumulateAllValuesOfcl(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cl.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfcl(final Property pPr) {
    return rawAccumulateAllValuesOfcl(new Object[]{null, pPr});
  }
  
  /**
   * Retrieve the set of values that occur in matches for pr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Property> rawAccumulateAllValuesOfpr(final Object[] parameters) {
    Set<Property> results = new HashSet<Property>();
    rawAccumulateAllValues(POSITION_PR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for pr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Property> getAllValuesOfpr() {
    return rawAccumulateAllValuesOfpr(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for pr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Property> getAllValuesOfpr(final ServiceHostMatch partialMatch) {
    return rawAccumulateAllValuesOfpr(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for pr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Property> getAllValuesOfpr(final org.eclipse.uml2.uml.Class pCl) {
    return rawAccumulateAllValuesOfpr(new Object[]{pCl, null});
  }
  
  @Override
  protected ServiceHostMatch tupleToMatch(final Tuple t) {
    try {
      return ServiceHostMatch.newMatch((org.eclipse.uml2.uml.Class) t.get(POSITION_CL), (org.eclipse.uml2.uml.Property) t.get(POSITION_PR));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected ServiceHostMatch arrayToMatch(final Object[] match) {
    try {
      return ServiceHostMatch.newMatch((org.eclipse.uml2.uml.Class) match[POSITION_CL], (org.eclipse.uml2.uml.Property) match[POSITION_PR]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected ServiceHostMatch arrayToMatchMutable(final Object[] match) {
    try {
      return ServiceHostMatch.newMutableMatch((org.eclipse.uml2.uml.Class) match[POSITION_CL], (org.eclipse.uml2.uml.Property) match[POSITION_PR]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
