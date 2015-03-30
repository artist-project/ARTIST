package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplicationMatch;
import eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplicationMatcher;
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
 * A pattern-specific query specification that can instantiate ServiceApplicationMatcher in a type-safe way.
 * 
 * @see ServiceApplicationMatcher
 * @see ServiceApplicationMatch
 * 
 */
@SuppressWarnings("all")
public final class ServiceApplicationQuerySpecification extends BaseGeneratedQuerySpecification<ServiceApplicationMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ServiceApplicationQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected ServiceApplicationMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ServiceApplicationMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplication";
    
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
  public ServiceApplicationMatch newEmptyMatch() {
    return ServiceApplicationMatch.newEmptyMatch();
  }
  
  @Override
  public ServiceApplicationMatch newMatch(final Object... parameters) {
    return ServiceApplicationMatch.newMatch((org.eclipse.uml2.uml.Class) parameters[0], (org.eclipse.uml2.uml.Class) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_sub = body.getOrCreateVariableByName("sub");
      PVariable var_sup = body.getOrCreateVariableByName("sup");
      PVariable var_Gen = body.getOrCreateVariableByName("Gen");
      PVariable var_supname = body.getOrCreateVariableByName("supname");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_sub, "sub"), 
        new ExportedParameter(body, var_sup, "sup")
      ));
      
      new TypeUnary(body, var_sub, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      
      new TypeBinary(body, CONTEXT, var_Gen, var_sub, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Generalization", "specific"), "http://www.eclipse.org/uml2/4.0.0/UML/Generalization.specific");
      new TypeBinary(body, CONTEXT, var_Gen, var_sup, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Generalization", "general"), "http://www.eclipse.org/uml2/4.0.0/UML/Generalization.general");
      new TypeUnary(body, var_sup, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      new TypeBinary(body, CONTEXT, var_sup, var_supname, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "NamedElement", "name"), "http://www.eclipse.org/uml2/4.0.0/UML/NamedElement.name");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern ServiceApplication";
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
    private final static ServiceApplicationQuerySpecification INSTANCE = make();
    
    public static ServiceApplicationQuerySpecification make() {
      return new ServiceApplicationQuerySpecification();					
      
    }
  }
  
  private boolean evaluateExpression_1_1(final String supname) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _or_3 = false;
    boolean _or_4 = false;
    boolean _or_5 = false;
    boolean _or_6 = false;
    boolean _equals = Objects.equal(supname, "SPIisWebService");
    if (_equals) {
      _or_6 = true;
    } else {
      boolean _equals_1 = Objects.equal(supname, "SPDatabase");
      _or_6 = _equals_1;
    }
    if (_or_6) {
      _or_5 = true;
    } else {
      boolean _equals_2 = Objects.equal(supname, "SPIisWebServiceApplication");
      _or_5 = _equals_2;
    }
    if (_or_5) {
      _or_4 = true;
    } else {
      boolean _equals_3 = Objects.equal(supname, "ServiceHost");
      _or_4 = _equals_3;
    }
    if (_or_4) {
      _or_3 = true;
    } else {
      boolean _equals_4 = Objects.equal(supname, "ServiceHostFactory");
      _or_3 = _equals_4;
    }
    if (_or_3) {
      _or_2 = true;
    } else {
      boolean _equals_5 = Objects.equal(supname, "SPIisWebServiceInstance");
      _or_2 = _equals_5;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _equals_6 = Objects.equal(supname, "SPIisWebServiceApplicationProxy");
      _or_1 = _equals_6;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _equals_7 = Objects.equal(supname, "SPIisWebServiceProxy");
      _or = _equals_7;
    }
    return _or;
  }
}
