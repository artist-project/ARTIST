package eu.artist.migration.mut.cmg.dotnet.tagging.queries;

import eu.artist.migration.mut.cmg.dotnet.tagging.queries.RemoteObjectMatcher;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLRMatcher;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHostMatcher;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.SuperClassMatcher;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.util.RemoteObjectQuerySpecification;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.util.SOLRQuerySpecification;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.util.ServiceHostQuerySpecification;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.util.SuperClassQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in NEWSQuery.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file NEWSQuery.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package eu.artist.migration.mut.cmg.dotnet.tagging.queries, the group contains the definition of the following patterns: <ul>
 * <li>superClass</li>
 * <li>RemoteObject</li>
 * <li>ServiceHost</li>
 * <li>SOLR</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class NEWSQuery extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static NEWSQuery instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new NEWSQuery();
    }
    return INSTANCE;
    
  }
  
  private static NEWSQuery INSTANCE;
  
  private NEWSQuery() throws IncQueryException {
    querySpecifications.add(SuperClassQuerySpecification.instance());
    querySpecifications.add(RemoteObjectQuerySpecification.instance());
    querySpecifications.add(ServiceHostQuerySpecification.instance());
    querySpecifications.add(SOLRQuerySpecification.instance());
    
  }
  
  public SuperClassQuerySpecification getSuperClass() throws IncQueryException {
    return SuperClassQuerySpecification.instance();
  }
  
  public SuperClassMatcher getSuperClass(final IncQueryEngine engine) throws IncQueryException {
    return SuperClassMatcher.on(engine);
  }
  
  public RemoteObjectQuerySpecification getRemoteObject() throws IncQueryException {
    return RemoteObjectQuerySpecification.instance();
  }
  
  public RemoteObjectMatcher getRemoteObject(final IncQueryEngine engine) throws IncQueryException {
    return RemoteObjectMatcher.on(engine);
  }
  
  public ServiceHostQuerySpecification getServiceHost() throws IncQueryException {
    return ServiceHostQuerySpecification.instance();
  }
  
  public ServiceHostMatcher getServiceHost(final IncQueryEngine engine) throws IncQueryException {
    return ServiceHostMatcher.on(engine);
  }
  
  public SOLRQuerySpecification getSOLR() throws IncQueryException {
    return SOLRQuerySpecification.instance();
  }
  
  public SOLRMatcher getSOLR(final IncQueryEngine engine) throws IncQueryException {
    return SOLRMatcher.on(engine);
  }
}
