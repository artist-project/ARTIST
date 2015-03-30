package eu.artist.migration.mut.cmg.lob.tagging.queries;

import eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplicationMatch;
import eu.artist.migration.mut.cmg.lob.tagging.queries.util.ServiceApplicationQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplication pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ServiceApplicationMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //Pattern for matching all classes extending one of the classes with the names listed below.
 * //SPIisWebService, SPIisWebService, SPIisWebServiceApplication, ServiceHost,
 * //ServiceHostFactory, SPIisWebServiceInstance, SPIisWebServiceApplicationProxy, SPIisWebServiceProxy
 * pattern ServiceApplication(sub : Class, sup : Class){
 * 	
 * 	Generalization.specific(Gen, sub);
 * 	Generalization.general(Gen, sup);
 * 	Class.name(sup, supname);
 * 	check (
 * 		supname == "SPIisWebService" || supname == "SPDatabase" || 
 * 		supname == "SPIisWebServiceApplication" || supname == "ServiceHost" ||
 * 		supname == "ServiceHostFactory" || supname == "SPIisWebServiceInstance" ||
 * 		supname == "SPIisWebServiceApplicationProxy" || supname == "SPIisWebServiceProxy"
 * 	); 
 * }
 * </pre></code>
 * 
 * @see ServiceApplicationMatch
 * @see ServiceApplicationProcessor
 * @see ServiceApplicationQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ServiceApplicationMatcher extends BaseMatcher<ServiceApplicationMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ServiceApplicationMatcher> querySpecification() throws IncQueryException {
    return ServiceApplicationQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ServiceApplicationMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ServiceApplicationMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ServiceApplicationMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SUB = 0;
  
  private final static int POSITION_SUP = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ServiceApplicationMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public ServiceApplicationMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public ServiceApplicationMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @param pSup the fixed value of pattern parameter sup, or null if not bound.
   * @return matches represented as a ServiceApplicationMatch object.
   * 
   */
  public Collection<ServiceApplicationMatch> getAllMatches(final org.eclipse.uml2.uml.Class pSub, final org.eclipse.uml2.uml.Class pSup) {
    return rawGetAllMatches(new Object[]{pSub, pSup});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @param pSup the fixed value of pattern parameter sup, or null if not bound.
   * @return a match represented as a ServiceApplicationMatch object, or null if no match is found.
   * 
   */
  public ServiceApplicationMatch getOneArbitraryMatch(final org.eclipse.uml2.uml.Class pSub, final org.eclipse.uml2.uml.Class pSup) {
    return rawGetOneArbitraryMatch(new Object[]{pSub, pSup});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @param pSup the fixed value of pattern parameter sup, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final org.eclipse.uml2.uml.Class pSub, final org.eclipse.uml2.uml.Class pSup) {
    return rawHasMatch(new Object[]{pSub, pSup});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @param pSup the fixed value of pattern parameter sup, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final org.eclipse.uml2.uml.Class pSub, final org.eclipse.uml2.uml.Class pSup) {
    return rawCountMatches(new Object[]{pSub, pSup});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @param pSup the fixed value of pattern parameter sup, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final org.eclipse.uml2.uml.Class pSub, final org.eclipse.uml2.uml.Class pSup, final IMatchProcessor<? super ServiceApplicationMatch> processor) {
    rawForEachMatch(new Object[]{pSub, pSup}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @param pSup the fixed value of pattern parameter sup, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final org.eclipse.uml2.uml.Class pSub, final org.eclipse.uml2.uml.Class pSup, final IMatchProcessor<? super ServiceApplicationMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSub, pSup}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @param pSup the fixed value of pattern parameter sup, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<ServiceApplicationMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final org.eclipse.uml2.uml.Class pSub, final org.eclipse.uml2.uml.Class pSup) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pSub, pSup});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @param pSup the fixed value of pattern parameter sup, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ServiceApplicationMatch newMatch(final org.eclipse.uml2.uml.Class pSub, final org.eclipse.uml2.uml.Class pSup) {
    return ServiceApplicationMatch.newMatch(pSub, pSup);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<org.eclipse.uml2.uml.Class> rawAccumulateAllValuesOfsub(final Object[] parameters) {
    Set<org.eclipse.uml2.uml.Class> results = new HashSet<org.eclipse.uml2.uml.Class>();
    rawAccumulateAllValues(POSITION_SUB, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfsub() {
    return rawAccumulateAllValuesOfsub(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfsub(final ServiceApplicationMatch partialMatch) {
    return rawAccumulateAllValuesOfsub(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfsub(final org.eclipse.uml2.uml.Class pSup) {
    return rawAccumulateAllValuesOfsub(new Object[]{null, pSup});
  }
  
  /**
   * Retrieve the set of values that occur in matches for sup.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<org.eclipse.uml2.uml.Class> rawAccumulateAllValuesOfsup(final Object[] parameters) {
    Set<org.eclipse.uml2.uml.Class> results = new HashSet<org.eclipse.uml2.uml.Class>();
    rawAccumulateAllValues(POSITION_SUP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sup.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfsup() {
    return rawAccumulateAllValuesOfsup(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sup.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfsup(final ServiceApplicationMatch partialMatch) {
    return rawAccumulateAllValuesOfsup(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sup.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfsup(final org.eclipse.uml2.uml.Class pSub) {
    return rawAccumulateAllValuesOfsup(new Object[]{pSub, null});
  }
  
  @Override
  protected ServiceApplicationMatch tupleToMatch(final Tuple t) {
    try {
      return ServiceApplicationMatch.newMatch((org.eclipse.uml2.uml.Class) t.get(POSITION_SUB), (org.eclipse.uml2.uml.Class) t.get(POSITION_SUP));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected ServiceApplicationMatch arrayToMatch(final Object[] match) {
    try {
      return ServiceApplicationMatch.newMatch((org.eclipse.uml2.uml.Class) match[POSITION_SUB], (org.eclipse.uml2.uml.Class) match[POSITION_SUP]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected ServiceApplicationMatch arrayToMatchMutable(final Object[] match) {
    try {
      return ServiceApplicationMatch.newMutableMatch((org.eclipse.uml2.uml.Class) match[POSITION_SUB], (org.eclipse.uml2.uml.Class) match[POSITION_SUP]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
