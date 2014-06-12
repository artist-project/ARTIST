package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplicationMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

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
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ServiceApplicationMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ServiceApplicationMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "eu.artist.migration.mut.cmg.lob.tagging";
    
  }
  
  @Override
  protected String patternName() {
    return "eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplication";
    
  }
  
  private ServiceApplicationQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ServiceApplicationQuerySpecification> {
    @Override
    public ServiceApplicationQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ServiceApplicationQuerySpecification INSTANCE = make();
    
    public static ServiceApplicationQuerySpecification make() {
      try {
      	return new ServiceApplicationQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
