package eu.artist.migration.mut.cmg.dotnet.tagging.queries;

import eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLRMatch;
import eu.artist.migration.mut.cmg.dotnet.tagging.queries.util.SOLRQuerySpecification;
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
import org.eclipse.uml2.uml.Comment;

/**
 * Generated pattern matcher API of the eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLR pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SOLRMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern SOLR (cls : Class, cmt: Comment){
 * 	
 * 	StructuredClassifier.ownedComment(cls, cmt);
 * 	Comment.body(cmt, bdy);
 * 	check (
 * 		bdy.contains("Namespace:") && bdy.contains("SOLR")
 * 	);
 * 	
 * }
 * </pre></code>
 * 
 * @see SOLRMatch
 * @see SOLRProcessor
 * @see SOLRQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SOLRMatcher extends BaseMatcher<SOLRMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SOLRMatcher> querySpecification() throws IncQueryException {
    return SOLRQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SOLRMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SOLRMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SOLRMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CLS = 0;
  
  private final static int POSITION_CMT = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SOLRMatcher.class);
  
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
  public SOLRMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SOLRMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param pCmt the fixed value of pattern parameter cmt, or null if not bound.
   * @return matches represented as a SOLRMatch object.
   * 
   */
  public Collection<SOLRMatch> getAllMatches(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
    return rawGetAllMatches(new Object[]{pCls, pCmt});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param pCmt the fixed value of pattern parameter cmt, or null if not bound.
   * @return a match represented as a SOLRMatch object, or null if no match is found.
   * 
   */
  public SOLRMatch getOneArbitraryMatch(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
    return rawGetOneArbitraryMatch(new Object[]{pCls, pCmt});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param pCmt the fixed value of pattern parameter cmt, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
    return rawHasMatch(new Object[]{pCls, pCmt});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param pCmt the fixed value of pattern parameter cmt, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
    return rawCountMatches(new Object[]{pCls, pCmt});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param pCmt the fixed value of pattern parameter cmt, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt, final IMatchProcessor<? super SOLRMatch> processor) {
    rawForEachMatch(new Object[]{pCls, pCmt}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param pCmt the fixed value of pattern parameter cmt, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt, final IMatchProcessor<? super SOLRMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCls, pCmt}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param pCmt the fixed value of pattern parameter cmt, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<SOLRMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pCls, pCmt});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param pCmt the fixed value of pattern parameter cmt, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SOLRMatch newMatch(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
    return SOLRMatch.newMatch(pCls, pCmt);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for cls.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<org.eclipse.uml2.uml.Class> rawAccumulateAllValuesOfcls(final Object[] parameters) {
    Set<org.eclipse.uml2.uml.Class> results = new HashSet<org.eclipse.uml2.uml.Class>();
    rawAccumulateAllValues(POSITION_CLS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for cls.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfcls() {
    return rawAccumulateAllValuesOfcls(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cls.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfcls(final SOLRMatch partialMatch) {
    return rawAccumulateAllValuesOfcls(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cls.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<org.eclipse.uml2.uml.Class> getAllValuesOfcls(final Comment pCmt) {
    return rawAccumulateAllValuesOfcls(new Object[]{null, pCmt});
  }
  
  /**
   * Retrieve the set of values that occur in matches for cmt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Comment> rawAccumulateAllValuesOfcmt(final Object[] parameters) {
    Set<Comment> results = new HashSet<Comment>();
    rawAccumulateAllValues(POSITION_CMT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for cmt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Comment> getAllValuesOfcmt() {
    return rawAccumulateAllValuesOfcmt(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cmt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Comment> getAllValuesOfcmt(final SOLRMatch partialMatch) {
    return rawAccumulateAllValuesOfcmt(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cmt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Comment> getAllValuesOfcmt(final org.eclipse.uml2.uml.Class pCls) {
    return rawAccumulateAllValuesOfcmt(new Object[]{pCls, null});
  }
  
  @Override
  protected SOLRMatch tupleToMatch(final Tuple t) {
    try {
      return SOLRMatch.newMatch((org.eclipse.uml2.uml.Class) t.get(POSITION_CLS), (org.eclipse.uml2.uml.Comment) t.get(POSITION_CMT));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SOLRMatch arrayToMatch(final Object[] match) {
    try {
      return SOLRMatch.newMatch((org.eclipse.uml2.uml.Class) match[POSITION_CLS], (org.eclipse.uml2.uml.Comment) match[POSITION_CMT]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SOLRMatch arrayToMatchMutable(final Object[] match) {
    try {
      return SOLRMatch.newMutableMatch((org.eclipse.uml2.uml.Class) match[POSITION_CLS], (org.eclipse.uml2.uml.Comment) match[POSITION_CMT]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
