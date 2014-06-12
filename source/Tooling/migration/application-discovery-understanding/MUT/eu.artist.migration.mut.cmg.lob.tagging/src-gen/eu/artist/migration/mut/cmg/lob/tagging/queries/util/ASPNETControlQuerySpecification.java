package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import eu.artist.migration.mut.cmg.lob.tagging.queries.ASPNETControlMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate ASPNETControlMatcher in a type-safe way.
 * 
 * @see ASPNETControlMatcher
 * @see ASPNETControlMatch
 * 
 */
@SuppressWarnings("all")
public final class ASPNETControlQuerySpecification extends BaseGeneratedQuerySpecification<ASPNETControlMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ASPNETControlQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ASPNETControlMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ASPNETControlMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "eu.artist.migration.mut.cmg.lob.tagging";
    
  }
  
  @Override
  protected String patternName() {
    return "eu.artist.migration.mut.cmg.lob.tagging.queries.ASPNETControl";
    
  }
  
  private ASPNETControlQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ASPNETControlQuerySpecification> {
    @Override
    public ASPNETControlQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ASPNETControlQuerySpecification INSTANCE = make();
    
    public static ASPNETControlQuerySpecification make() {
      try {
      	return new ASPNETControlQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
