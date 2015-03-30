package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import eu.artist.migration.mut.cmg.lob.tagging.queries.UIMatch;
import eu.artist.migration.mut.cmg.lob.tagging.queries.UIMatcher;
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
 * A pattern-specific query specification that can instantiate UIMatcher in a type-safe way.
 * 
 * @see UIMatcher
 * @see UIMatch
 * 
 */
@SuppressWarnings("all")
public final class UIQuerySpecification extends BaseGeneratedQuerySpecification<UIMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static UIQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected UIMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return UIMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "eu.artist.migration.mut.cmg.lob.tagging.queries.UI";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("sub");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("sub", "org.eclipse.uml2.uml.Class"));
  }
  
  @Override
  public UIMatch newEmptyMatch() {
    return UIMatch.newEmptyMatch();
  }
  
  @Override
  public UIMatch newMatch(final Object... parameters) {
    return UIMatch.newMatch((org.eclipse.uml2.uml.Class) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_sub = body.getOrCreateVariableByName("sub");
      PVariable var_Gen = body.getOrCreateVariableByName("Gen");
      PVariable var_sup = body.getOrCreateVariableByName("sup");
      PVariable var_supname = body.getOrCreateVariableByName("supname");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_sub, "sub")
      ));
      
      new TypeUnary(body, var_sub, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      new TypeBinary(body, CONTEXT, var_Gen, var_sub, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Generalization", "specific"), "http://www.eclipse.org/uml2/4.0.0/UML/Generalization.specific");
      new TypeBinary(body, CONTEXT, var_Gen, var_sup, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Generalization", "general"), "http://www.eclipse.org/uml2/4.0.0/UML/Generalization.general");
      new TypeUnary(body, var_sup, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      new TypeBinary(body, CONTEXT, var_sup, var_supname, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "NamedElement", "name"), "http://www.eclipse.org/uml2/4.0.0/UML/NamedElement.name");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern UI";
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
    private final static UIQuerySpecification INSTANCE = make();
    
    public static UIQuerySpecification make() {
      return new UIQuerySpecification();					
      
    }
  }
  
  private boolean evaluateExpression_1_1(final String supname) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals = Objects.equal(supname, "WebPart");
    if (_equals) {
      _or_1 = true;
    } else {
      boolean _equals_1 = Objects.equal(supname, "BaseUserControl");
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _equals_2 = Objects.equal(supname, "BasePage");
      _or = _equals_2;
    }
    return _or;
  }
}
