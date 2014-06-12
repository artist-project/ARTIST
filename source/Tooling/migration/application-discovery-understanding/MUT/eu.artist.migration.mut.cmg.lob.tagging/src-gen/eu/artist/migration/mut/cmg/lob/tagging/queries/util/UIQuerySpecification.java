package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import eu.artist.migration.mut.cmg.lob.tagging.queries.UIMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

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
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected UIMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return UIMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "eu.artist.migration.mut.cmg.lob.tagging";
    
  }
  
  @Override
  protected String patternName() {
    return "eu.artist.migration.mut.cmg.lob.tagging.queries.UI";
    
  }
  
  private UIQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<UIQuerySpecification> {
    @Override
    public UIQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static UIQuerySpecification INSTANCE = make();
    
    public static UIQuerySpecification make() {
      try {
      	return new UIQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
