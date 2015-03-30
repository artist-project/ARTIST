package eu.artist.migration.mut.cmg.dotnet.tagging.queries.util;

import com.google.common.collect.Sets;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.SuperClassMatch;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.SuperClassMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate SuperClassMatcher in a type-safe way.
 * 
 * @see SuperClassMatcher
 * @see SuperClassMatch
 * 
 */
@SuppressWarnings("all")
public final class SuperClassQuerySpecification extends BaseGeneratedQuerySpecification<SuperClassMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SuperClassQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected SuperClassMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SuperClassMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "eu.artist.migration.mut.cmg.dotnet.tagging.queries.superClass";
    
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
  public SuperClassMatch newEmptyMatch() {
    return SuperClassMatch.newEmptyMatch();
  }
  
  @Override
  public SuperClassMatch newMatch(final Object... parameters) {
    return SuperClassMatch.newMatch((org.eclipse.uml2.uml.Class) parameters[0], (org.eclipse.uml2.uml.Class) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_sub = body.getOrCreateVariableByName("sub");
      PVariable var_sup = body.getOrCreateVariableByName("sup");
      PVariable var_Gen = body.getOrCreateVariableByName("Gen");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_sub, "sub"), 
        new ExportedParameter(body, var_sup, "sup")
      ));
      
      new TypeUnary(body, var_sub, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      
      new TypeUnary(body, var_sup, getClassifierLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Class"), "http://www.eclipse.org/uml2/4.0.0/UML/Class");
      new TypeBinary(body, CONTEXT, var_Gen, var_sub, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Generalization", "specific"), "http://www.eclipse.org/uml2/4.0.0/UML/Generalization.specific");
      new TypeBinary(body, CONTEXT, var_Gen, var_sup, getFeatureLiteral("http://www.eclipse.org/uml2/4.0.0/UML", "Generalization", "general"), "http://www.eclipse.org/uml2/4.0.0/UML/Generalization.general");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static SuperClassQuerySpecification INSTANCE = make();
    
    public static SuperClassQuerySpecification make() {
      return new SuperClassQuerySpecification();					
      
    }
  }
}
