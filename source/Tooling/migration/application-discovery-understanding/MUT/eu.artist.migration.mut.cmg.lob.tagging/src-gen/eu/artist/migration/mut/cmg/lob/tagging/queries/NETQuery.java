package eu.artist.migration.mut.cmg.lob.tagging.queries;

import eu.artist.migration.mut.cmg.lob.tagging.queries.ASPNETControlMatcher;
import eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplicationMatcher;
import eu.artist.migration.mut.cmg.lob.tagging.queries.UIMatcher;
import eu.artist.migration.mut.cmg.lob.tagging.queries.WebPartMatcher;
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
 * <li>UI</li>
 * <li>ASPNETControl</li>
 * <li>WebPart</li>
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
    querySpecifications.add(ASPNETControlMatcher.querySpecification());
    querySpecifications.add(WebPartMatcher.querySpecification());
    querySpecifications.add(UIMatcher.querySpecification());
    querySpecifications.add(ServiceApplicationMatcher.querySpecification());
    
  }
}
