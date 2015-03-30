package eu.artist.migration.mut.cmg.dotnet.tagging.queries.util;

import com.google.common.collect.Sets;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLRMatch;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLRMatcher;
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
 * A pattern-specific query specification that can instantiate SOLRMatcher in a type-safe way.
 * 
 * @see SOLRMatcher
 * @see SOLRMatch
 * 
 */
@SuppressWarnings("all")
public final class SOLRQuerySpecification extends BaseGeneratedQuerySpecification<SOLRMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SOLRQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected SOLRMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SOLRMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLR";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("cls","cmt");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("cls", "org.eclipse.uml2.uml.Class"),new PParameter("cmt", "org.eclipse.uml2.uml.Comment"));
  }
  
  @Override
  public SOLRMatch newEmptyMatch() {
    return SOLRMatch.newEmptyMatch();
  }
  
  @Override
  public SOLRMatch newMatch(final Object... parameters) {
    return SOLRMatch.newMatch((org.eclipse.uml2.uml.Class) parameters[0], (org.eclipse.uml2.uml.Comment) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_cls = body.getOrCreateVariableByName("cls");
      PVariable var_cmt = body.getOrCreateVariableByName("cmt");
      PVariable var_bdy = body.getOrCreateVariableByName("bdy");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_cls, "cls"), 
        new ExportedParameter(body, var_cmt, "cmt")
      ));
      
      new TypeUnary(body, var_cls, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      
      new TypeBinary(body, CONTEXT, var_cls, var_cmt, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Element", "ownedComment"), "http://www.eclipse.org/uml2/4.0.0/UML/Element.ownedComment");
      new TypeBinary(body, CONTEXT, var_cmt, var_bdy, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Comment", "body"), "http://www.eclipse.org/uml2/4.0.0/UML/Comment.body");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern SOLR";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("bdy");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String bdy = (java.lang.String) provider.getValue("bdy");
        	return evaluateExpression_1_1(bdy);
        }
        
        },  null); 
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static SOLRQuerySpecification INSTANCE = make();
    
    public static SOLRQuerySpecification make() {
      return new SOLRQuerySpecification();					
      
    }
  }
  
  private boolean evaluateExpression_1_1(final String bdy) {
    boolean _and = false;
    boolean _contains = bdy.contains("Namespace:");
    if (!_contains) {
      _and = false;
    } else {
      boolean _contains_1 = bdy.contains("SOLR");
      _and = _contains_1;
    }
    return _and;
  }
}
