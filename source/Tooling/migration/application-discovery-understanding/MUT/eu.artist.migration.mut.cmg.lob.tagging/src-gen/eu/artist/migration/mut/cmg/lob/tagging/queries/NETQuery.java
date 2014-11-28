package eu.artist.migration.mut.cmg.lob.tagging.queries;

import eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplicationMatcher;
import eu.artist.migration.mut.cmg.lob.tagging.queries.UIMatcher;
import eu.artist.migration.mut.cmg.lob.tagging.queries.WCFServiceMatcher;
import eu.artist.migration.mut.cmg.lob.tagging.queries.util.ServiceApplicationQuerySpecification;
import eu.artist.migration.mut.cmg.lob.tagging.queries.util.UIQuerySpecification;
import eu.artist.migration.mut.cmg.lob.tagging.queries.util.WCFServiceQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in NETQuery.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file NETQuery.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package eu.artist.migration.mut.cmg.lob.tagging.queries, the group contains the definition of the following patterns: <ul>
 * <li>ServiceApplication</li>
 * <li>WCFService</li>
 * <li>UI</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class NETQuery extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static NETQuery instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new NETQuery();
    }
    return INSTANCE;
    
  }
  
  private static NETQuery INSTANCE;
  
  private NETQuery() throws IncQueryException {
    querySpecifications.add(ServiceApplicationQuerySpecification.instance());
    querySpecifications.add(WCFServiceQuerySpecification.instance());
    querySpecifications.add(UIQuerySpecification.instance());
    
  }
  
  public ServiceApplicationQuerySpecification getServiceApplication() throws IncQueryException {
    return ServiceApplicationQuerySpecification.instance();
  }
  
  public ServiceApplicationMatcher getServiceApplication(final IncQueryEngine engine) throws IncQueryException {
    return ServiceApplicationMatcher.on(engine);
  }
  
  public WCFServiceQuerySpecification getWCFService() throws IncQueryException {
    return WCFServiceQuerySpecification.instance();
  }
  
  public WCFServiceMatcher getWCFService(final IncQueryEngine engine) throws IncQueryException {
    return WCFServiceMatcher.on(engine);
  }
  
  public UIQuerySpecification getUI() throws IncQueryException {
    return UIQuerySpecification.instance();
  }
  
  public UIMatcher getUI(final IncQueryEngine engine) throws IncQueryException {
    return UIMatcher.on(engine);
  }
}
