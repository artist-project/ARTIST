package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import eu.artist.migration.mut.cmg.lob.tagging.queries.WebPartMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate WebPartMatcher in a type-safe way.
 * 
 * @see WebPartMatcher
 * @see WebPartMatch
 * 
 */
@SuppressWarnings("all")
public final class WebPartQuerySpecification extends BaseGeneratedQuerySpecification<WebPartMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WebPartQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected WebPartMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WebPartMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "eu.artist.migration.mut.cmg.lob.tagging";
    
  }
  
  @Override
  protected String patternName() {
    return "eu.artist.migration.mut.cmg.lob.tagging.queries.WebPart";
    
  }
  
  private WebPartQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<WebPartQuerySpecification> {
    @Override
    public WebPartQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static WebPartQuerySpecification INSTANCE = make();
    
    public static WebPartQuerySpecification make() {
      try {
      	return new WebPartQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
