package eu.artist.migration.mut.cmg.j2ee.tagging.queries;

import eu.artist.migration.mut.cmg.j2ee.tagging.queries.EntityManagerMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.GenericServletMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.HttpServletMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.HttpServletRequestMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.HttpServletResponseMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.MessageListenerMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.SecurityImplMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.SecurityPropMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.ServletMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.ServletRequestMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.ServletResponseMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.EntityManagerQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.GenericServletQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.HttpServletQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.HttpServletRequestQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.HttpServletResponseQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.MessageListenerQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.SecurityImplQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.SecurityPropQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.ServletQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.ServletRequestQuerySpecification;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.ServletResponseQuerySpecification;
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
 * <li>SecurityImpl</li>
 * <li>SecurityProp</li>
 * <li>EntityManager</li>
 * <li>Servlet</li>
 * <li>ServletRequest</li>
 * <li>ServletResponse</li>
 * <li>GenericServlet</li>
 * <li>HttpServlet</li>
 * <li>HttpServletRequest</li>
 * <li>HttpServletResponse</li>
 * <li>MessageListener</li>
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
    querySpecifications.add(SecurityImplQuerySpecification.instance());
    querySpecifications.add(SecurityPropQuerySpecification.instance());
    querySpecifications.add(EntityManagerQuerySpecification.instance());
    querySpecifications.add(ServletQuerySpecification.instance());
    querySpecifications.add(ServletRequestQuerySpecification.instance());
    querySpecifications.add(ServletResponseQuerySpecification.instance());
    querySpecifications.add(GenericServletQuerySpecification.instance());
    querySpecifications.add(HttpServletQuerySpecification.instance());
    querySpecifications.add(HttpServletRequestQuerySpecification.instance());
    querySpecifications.add(HttpServletResponseQuerySpecification.instance());
    querySpecifications.add(MessageListenerQuerySpecification.instance());
    
  }
  
  public SecurityImplQuerySpecification getSecurityImpl() throws IncQueryException {
    return SecurityImplQuerySpecification.instance();
  }
  
  public SecurityImplMatcher getSecurityImpl(final IncQueryEngine engine) throws IncQueryException {
    return SecurityImplMatcher.on(engine);
  }
  
  public SecurityPropQuerySpecification getSecurityProp() throws IncQueryException {
    return SecurityPropQuerySpecification.instance();
  }
  
  public SecurityPropMatcher getSecurityProp(final IncQueryEngine engine) throws IncQueryException {
    return SecurityPropMatcher.on(engine);
  }
  
  public EntityManagerQuerySpecification getEntityManager() throws IncQueryException {
    return EntityManagerQuerySpecification.instance();
  }
  
  public EntityManagerMatcher getEntityManager(final IncQueryEngine engine) throws IncQueryException {
    return EntityManagerMatcher.on(engine);
  }
  
  public ServletQuerySpecification getServlet() throws IncQueryException {
    return ServletQuerySpecification.instance();
  }
  
  public ServletMatcher getServlet(final IncQueryEngine engine) throws IncQueryException {
    return ServletMatcher.on(engine);
  }
  
  public ServletRequestQuerySpecification getServletRequest() throws IncQueryException {
    return ServletRequestQuerySpecification.instance();
  }
  
  public ServletRequestMatcher getServletRequest(final IncQueryEngine engine) throws IncQueryException {
    return ServletRequestMatcher.on(engine);
  }
  
  public ServletResponseQuerySpecification getServletResponse() throws IncQueryException {
    return ServletResponseQuerySpecification.instance();
  }
  
  public ServletResponseMatcher getServletResponse(final IncQueryEngine engine) throws IncQueryException {
    return ServletResponseMatcher.on(engine);
  }
  
  public GenericServletQuerySpecification getGenericServlet() throws IncQueryException {
    return GenericServletQuerySpecification.instance();
  }
  
  public GenericServletMatcher getGenericServlet(final IncQueryEngine engine) throws IncQueryException {
    return GenericServletMatcher.on(engine);
  }
  
  public HttpServletQuerySpecification getHttpServlet() throws IncQueryException {
    return HttpServletQuerySpecification.instance();
  }
  
  public HttpServletMatcher getHttpServlet(final IncQueryEngine engine) throws IncQueryException {
    return HttpServletMatcher.on(engine);
  }
  
  public HttpServletRequestQuerySpecification getHttpServletRequest() throws IncQueryException {
    return HttpServletRequestQuerySpecification.instance();
  }
  
  public HttpServletRequestMatcher getHttpServletRequest(final IncQueryEngine engine) throws IncQueryException {
    return HttpServletRequestMatcher.on(engine);
  }
  
  public HttpServletResponseQuerySpecification getHttpServletResponse() throws IncQueryException {
    return HttpServletResponseQuerySpecification.instance();
  }
  
  public HttpServletResponseMatcher getHttpServletResponse(final IncQueryEngine engine) throws IncQueryException {
    return HttpServletResponseMatcher.on(engine);
  }
  
  public MessageListenerQuerySpecification getMessageListener() throws IncQueryException {
    return MessageListenerQuerySpecification.instance();
  }
  
  public MessageListenerMatcher getMessageListener(final IncQueryEngine engine) throws IncQueryException {
    return MessageListenerMatcher.on(engine);
  }
}
