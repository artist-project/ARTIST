package eu.artist.migration.mut.cmg.dotnet.tagging.queries.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHostMatch;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHostMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate ServiceHostMatcher in a type-safe way.
 * 
 * @see ServiceHostMatcher
 * @see ServiceHostMatch
 * 
 */
@SuppressWarnings("all")
public final class ServiceHostQuerySpecification extends BaseGeneratedQuerySpecification<ServiceHostMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ServiceHostQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected ServiceHostMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ServiceHostMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHost";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("cl","pr");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("cl", "org.eclipse.uml2.uml.Class"),new PParameter("pr", "org.eclipse.uml2.uml.Property"));
  }
  
  @Override
  public ServiceHostMatch newEmptyMatch() {
    return ServiceHostMatch.newEmptyMatch();
  }
  
  @Override
  public ServiceHostMatch newMatch(final Object... parameters) {
    return ServiceHostMatch.newMatch((org.eclipse.uml2.uml.Class) parameters[0], (org.eclipse.uml2.uml.Property) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_cl = body.getOrCreateVariableByName("cl");
      PVariable var_pr = body.getOrCreateVariableByName("pr");
      PVariable var_typ = body.getOrCreateVariableByName("typ");
      PVariable var_nm = body.getOrCreateVariableByName("nm");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_cl, "cl"), 
        new ExportedParameter(body, var_pr, "pr")
      ));
      
      new TypeUnary(body, var_cl, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      
      new TypeBinary(body, CONTEXT, var_cl, var_pr, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "StructuredClassifier", "ownedAttribute"), "http://www.eclipse.org/uml2/4.0.0/UML/StructuredClassifier.ownedAttribute");
      new TypeBinary(body, CONTEXT, var_pr, var_typ, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "TypedElement", "type"), "http://www.eclipse.org/uml2/4.0.0/UML/TypedElement.type");
      new TypeBinary(body, CONTEXT, var_typ, var_nm, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "NamedElement", "name"), "http://www.eclipse.org/uml2/4.0.0/UML/NamedElement.name");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern ServiceHost";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("nm");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String nm = (java.lang.String) provider.getValue("nm");
        	return evaluateExpression_1_1(nm);
        }
        
        },  null); 
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static ServiceHostQuerySpecification INSTANCE = make();
    
    public static ServiceHostQuerySpecification make() {
      return new ServiceHostQuerySpecification();					
      
    }
  }
  
  private boolean evaluateExpression_1_1(final String nm) {
    boolean _equals = Objects.equal(nm, "ServiceHost");
    return _equals;
  }
}
