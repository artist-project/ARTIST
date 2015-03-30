package eu.artist.migration.mut.cmg.lob.tagging.queries;

import eu.artist.migration.mut.cmg.lob.tagging.queries.util.UIQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the eu.artist.migration.mut.cmg.lob.tagging.queries.UI pattern,
 * to be used in conjunction with {@link UIMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see UIMatcher
 * @see UIProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class UIMatch extends BasePatternMatch {
  private org.eclipse.uml2.uml.Class fSub;
  
  private static List<String> parameterNames = makeImmutableList("sub");
  
  private UIMatch(final org.eclipse.uml2.uml.Class pSub) {
    this.fSub = pSub;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sub".equals(parameterName)) return this.fSub;
    return null;
    
  }
  
  public org.eclipse.uml2.uml.Class getSub() {
    return this.fSub;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sub".equals(parameterName) ) {
    	this.fSub = (org.eclipse.uml2.uml.Class) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSub(final org.eclipse.uml2.uml.Class pSub) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSub = pSub;
    
  }
  
  @Override
  public String patternName() {
    return "eu.artist.migration.mut.cmg.lob.tagging.queries.UI";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return UIMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSub};
    
  }
  
  @Override
  public UIMatch toImmutable() {
    return isMutable() ? newMatch(fSub) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sub\"=" + prettyPrintValue(fSub));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSub == null) ? 0 : fSub.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof UIMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    UIMatch other = (UIMatch) obj;
    if (fSub == null) {if (other.fSub != null) return false;}
    else if (!fSub.equals(other.fSub)) return false;
    return true;
  }
  
  @Override
  public UIQuerySpecification specification() {
    try {
    	return UIQuerySpecification.instance();
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
  public static UIMatch newEmptyMatch() {
    return new Mutable(null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static UIMatch newMutableMatch(final org.eclipse.uml2.uml.Class pSub) {
    return new Mutable(pSub);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSub the fixed value of pattern parameter sub, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static UIMatch newMatch(final org.eclipse.uml2.uml.Class pSub) {
    return new Immutable(pSub);
    
  }
  
  private static final class Mutable extends UIMatch {
    Mutable(final org.eclipse.uml2.uml.Class pSub) {
      super(pSub);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends UIMatch {
    Immutable(final org.eclipse.uml2.uml.Class pSub) {
      super(pSub);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
