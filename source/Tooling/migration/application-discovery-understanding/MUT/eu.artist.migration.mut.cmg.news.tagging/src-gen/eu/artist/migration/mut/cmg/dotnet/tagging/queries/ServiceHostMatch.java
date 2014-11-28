package eu.artist.migration.mut.cmg.dotnet.tagging.queries;

import eu.artist.migration.mut.cmg.dotnet.tagging.queries.util.ServiceHostQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.uml2.uml.Property;

/**
 * Pattern-specific match representation of the eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHost pattern,
 * to be used in conjunction with {@link ServiceHostMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ServiceHostMatcher
 * @see ServiceHostProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ServiceHostMatch extends BasePatternMatch {
  private org.eclipse.uml2.uml.Class fCl;
  
  private Property fPr;
  
  private static List<String> parameterNames = makeImmutableList("cl", "pr");
  
  private ServiceHostMatch(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
    this.fCl = pCl;
    this.fPr = pPr;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("cl".equals(parameterName)) return this.fCl;
    if ("pr".equals(parameterName)) return this.fPr;
    return null;
    
  }
  
  public org.eclipse.uml2.uml.Class getCl() {
    return this.fCl;
    
  }
  
  public Property getPr() {
    return this.fPr;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("cl".equals(parameterName) ) {
    	this.fCl = (org.eclipse.uml2.uml.Class) newValue;
    	return true;
    }
    if ("pr".equals(parameterName) ) {
    	this.fPr = (org.eclipse.uml2.uml.Property) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setCl(final org.eclipse.uml2.uml.Class pCl) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCl = pCl;
    
  }
  
  public void setPr(final Property pPr) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPr = pPr;
    
  }
  
  @Override
  public String patternName() {
    return "eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHost";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return ServiceHostMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCl, fPr};
    
  }
  
  @Override
  public ServiceHostMatch toImmutable() {
    return isMutable() ? newMatch(fCl, fPr) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"cl\"=" + prettyPrintValue(fCl) + ", ");
    result.append("\"pr\"=" + prettyPrintValue(fPr));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCl == null) ? 0 : fCl.hashCode());
    result = prime * result + ((fPr == null) ? 0 : fPr.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ServiceHostMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ServiceHostMatch other = (ServiceHostMatch) obj;
    if (fCl == null) {if (other.fCl != null) return false;}
    else if (!fCl.equals(other.fCl)) return false;
    if (fPr == null) {if (other.fPr != null) return false;}
    else if (!fPr.equals(other.fPr)) return false;
    return true;
  }
  
  @Override
  public ServiceHostQuerySpecification specification() {
    try {
    	return ServiceHostQuerySpecification.instance();
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
  public static ServiceHostMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ServiceHostMatch newMutableMatch(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
    return new Mutable(pCl, pPr);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCl the fixed value of pattern parameter cl, or null if not bound.
   * @param pPr the fixed value of pattern parameter pr, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ServiceHostMatch newMatch(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
    return new Immutable(pCl, pPr);
    
  }
  
  private static final class Mutable extends ServiceHostMatch {
    Mutable(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
      super(pCl, pPr);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ServiceHostMatch {
    Immutable(final org.eclipse.uml2.uml.Class pCl, final Property pPr) {
      super(pCl, pPr);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
