package eu.artist.migration.mut.cmg.dotnet.tagging.queries.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.RemoteObjectMatch;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.RemoteObjectMatcher;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.util.SuperClassQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RemoteObjectMatcher in a type-safe way.
 * 
 * @see RemoteObjectMatcher
 * @see RemoteObjectMatch
 * 
 */
@SuppressWarnings("all")
public final class RemoteObjectQuerySpecification extends BaseGeneratedQuerySpecification<RemoteObjectMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RemoteObjectQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected RemoteObjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RemoteObjectMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "eu.artist.migration.mut.cmg.dotnet.tagging.queries.RemoteObject";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("sub","sup");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("sub", "org.eclipse.uml2.uml.Class"),new PParameter("sup", "org.eclipse.uml2.uml.Class"));
  }
  
  @Override
  public RemoteObjectMatch newEmptyMatch() {
    return RemoteObjectMatch.newEmptyMatch();
  }
  
  @Override
  public RemoteObjectMatch newMatch(final Object... parameters) {
    return RemoteObjectMatch.newMatch((org.eclipse.uml2.uml.Class) parameters[0], (org.eclipse.uml2.uml.Class) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_sub = body.getOrCreateVariableByName("sub");
      PVariable var_sup = body.getOrCreateVariableByName("sup");
      PVariable var_supname = body.getOrCreateVariableByName("supname");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_sub, "sub"), 
        new ExportedParameter(body, var_sup, "sup")
      ));
      
      new TypeUnary(body, var_sub, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      
      new BinaryTransitiveClosure(body, new FlatTuple(var_sub, var_sup), SuperClassQuerySpecification.instance().instance());
      new TypeUnary(body, var_sup, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      new TypeBinary(body, CONTEXT, var_sup, var_supname, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "NamedElement", "name"), "http://www.eclipse.org/uml2/4.0.0/UML/NamedElement.name");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern RemoteObject";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("supname");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String supname = (java.lang.String) provider.getValue("supname");
        	return evaluateExpression_1_1(supname);
        }
        
        },  null); 
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static RemoteObjectQuerySpecification INSTANCE = make();
    
    public static RemoteObjectQuerySpecification make() {
      return new RemoteObjectQuerySpecification();					
      
    }
  }
  
  private boolean evaluateExpression_1_1(final String supname) {
    boolean _equals = Objects.equal(supname, "MarshalByRefObject");
    return _equals;
  }
}
