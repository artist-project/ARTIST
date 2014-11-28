package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import eu.artist.migration.mut.cmg.lob.tagging.queries.WCFServiceMatch;
import eu.artist.migration.mut.cmg.lob.tagging.queries.WCFServiceMatcher;
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
 * A pattern-specific query specification that can instantiate WCFServiceMatcher in a type-safe way.
 * 
 * @see WCFServiceMatcher
 * @see WCFServiceMatch
 * 
 */
@SuppressWarnings("all")
public final class WCFServiceQuerySpecification extends BaseGeneratedQuerySpecification<WCFServiceMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WCFServiceQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected WCFServiceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WCFServiceMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "eu.artist.migration.mut.cmg.lob.tagging.queries.WCFService";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("client");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("client", "org.eclipse.uml2.uml.Class"));
  }
  
  @Override
  public WCFServiceMatch newEmptyMatch() {
    return WCFServiceMatch.newEmptyMatch();
  }
  
  @Override
  public WCFServiceMatch newMatch(final Object... parameters) {
    return WCFServiceMatch.newMatch((org.eclipse.uml2.uml.Class) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_client = body.getOrCreateVariableByName("client");
      PVariable var_Int = body.getOrCreateVariableByName("Int");
      PVariable var_supp = body.getOrCreateVariableByName("supp");
      PVariable var_suppName = body.getOrCreateVariableByName("suppName");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_client, "client")
      ));
      
      new TypeUnary(body, var_client, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      new TypeBinary(body, CONTEXT, var_Int, var_client, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Dependency", "client"), "http://www.eclipse.org/uml2/4.0.0/UML/Dependency.client");
      new TypeUnary(body, var_Int, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "InterfaceRealization"), "http://www.eclipse.org/uml2/4.0.0/UML/InterfaceRealization");
      new TypeBinary(body, CONTEXT, var_Int, var_supp, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Dependency", "supplier"), "http://www.eclipse.org/uml2/4.0.0/UML/Dependency.supplier");
      new TypeUnary(body, var_supp, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Interface"), "http://www.eclipse.org/uml2/4.0.0/UML/Interface");
      new TypeBinary(body, CONTEXT, var_supp, var_suppName, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "NamedElement", "name"), "http://www.eclipse.org/uml2/4.0.0/UML/NamedElement.name");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern WCFService";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("suppName");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String suppName = (java.lang.String) provider.getValue("suppName");
        	return evaluateExpression_1_1(suppName);
        }
        
        },  null); 
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static WCFServiceQuerySpecification INSTANCE = make();
    
    public static WCFServiceQuerySpecification make() {
      return new WCFServiceQuerySpecification();					
      
    }
  }
  
  private boolean evaluateExpression_1_1(final String suppName) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _or_3 = false;
    boolean _equals = Objects.equal(suppName, "IWorkflowService");
    if (_equals) {
      _or_3 = true;
    } else {
      boolean _equals_1 = Objects.equal(suppName, "ITaskService");
      _or_3 = _equals_1;
    }
    if (_or_3) {
      _or_2 = true;
    } else {
      boolean _equals_2 = Objects.equal(suppName, "IDirectoryService");
      _or_2 = _equals_2;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _equals_3 = Objects.equal(suppName, "IWorkflowHostService");
      _or_1 = _equals_3;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _equals_4 = Objects.equal(suppName, "IExternalEntityService");
      _or = _equals_4;
    }
    return _or;
  }
}
