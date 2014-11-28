package eu.artist.migration.mut.cmg.j2ee.tagging.queries;

import eu.artist.migration.mut.cmg.j2ee.tagging.queries.SecurityMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.SecurityQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in J2EE.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file J2EE.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package eu.artist.migration.mut.cmg.j2ee.tagging.queries, the group contains the definition of the following patterns: <ul>
 * <li>security</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class J2EE extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static J2EE instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new J2EE();
    }
    return INSTANCE;
    
  }
  
  private static J2EE INSTANCE;
  
  private J2EE() throws IncQueryException {
    querySpecifications.add(SecurityQuerySpecification.instance());
    
  }
  
  public SecurityQuerySpecification getSecurity() throws IncQueryException {
    return SecurityQuerySpecification.instance();
  }
  
  public SecurityMatcher getSecurity(final IncQueryEngine engine) throws IncQueryException {
    return SecurityMatcher.on(engine);
  }
}
