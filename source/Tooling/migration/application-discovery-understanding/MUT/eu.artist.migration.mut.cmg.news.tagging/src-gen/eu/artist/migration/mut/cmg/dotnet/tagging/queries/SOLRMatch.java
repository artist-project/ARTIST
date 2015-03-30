package eu.artist.migration.mut.cmg.dotnet.tagging.queries;

import eu.artist.migration.mut.cmg.dotnet.tagging.queries.util.SOLRQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.uml2.uml.Comment;

/**
 * Pattern-specific match representation of the eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLR pattern,
 * to be used in conjunction with {@link SOLRMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SOLRMatcher
 * @see SOLRProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SOLRMatch extends BasePatternMatch {
  private org.eclipse.uml2.uml.Class fCls;
  
  private Comment fCmt;
  
  private static List<String> parameterNames = makeImmutableList("cls", "cmt");
  
  private SOLRMatch(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
    this.fCls = pCls;
    this.fCmt = pCmt;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("cls".equals(parameterName)) return this.fCls;
    if ("cmt".equals(parameterName)) return this.fCmt;
    return null;
    
  }
  
  public org.eclipse.uml2.uml.Class getCls() {
    return this.fCls;
    
  }
  
  public Comment getCmt() {
    return this.fCmt;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("cls".equals(parameterName) ) {
    	this.fCls = (org.eclipse.uml2.uml.Class) newValue;
    	return true;
    }
    if ("cmt".equals(parameterName) ) {
    	this.fCmt = (org.eclipse.uml2.uml.Comment) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setCls(final org.eclipse.uml2.uml.Class pCls) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCls = pCls;
    
  }
  
  public void setCmt(final Comment pCmt) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCmt = pCmt;
    
  }
  
  @Override
  public String patternName() {
    return "eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLR";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SOLRMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCls, fCmt};
    
  }
  
  @Override
  public SOLRMatch toImmutable() {
    return isMutable() ? newMatch(fCls, fCmt) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"cls\"=" + prettyPrintValue(fCls) + ", ");
    result.append("\"cmt\"=" + prettyPrintValue(fCmt));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCls == null) ? 0 : fCls.hashCode());
    result = prime * result + ((fCmt == null) ? 0 : fCmt.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SOLRMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SOLRMatch other = (SOLRMatch) obj;
    if (fCls == null) {if (other.fCls != null) return false;}
    else if (!fCls.equals(other.fCls)) return false;
    if (fCmt == null) {if (other.fCmt != null) return false;}
    else if (!fCmt.equals(other.fCmt)) return false;
    return true;
  }
  
  @Override
  public SOLRQuerySpecification specification() {
    try {
    	return SOLRQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static SOLRMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param pCmt the fixed value of pattern parameter cmt, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SOLRMatch newMutableMatch(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
    return new Mutable(pCls, pCmt);
    
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
  public static SOLRMatch newMatch(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
    return new Immutable(pCls, pCmt);
    
  }
  
  private static final class Mutable extends SOLRMatch {
    Mutable(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
      super(pCls, pCmt);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SOLRMatch {
    Immutable(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt) {
      super(pCls, pCmt);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
