package eu.artist.migration.mut.cmg.lob.tagging.queries;

import eu.artist.migration.mut.cmg.lob.tagging.queries.util.WCFServiceQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the eu.artist.migration.mut.cmg.lob.tagging.queries.WCFService pattern,
 * to be used in conjunction with {@link WCFServiceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WCFServiceMatcher
 * @see WCFServiceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WCFServiceMatch extends BasePatternMatch {
  private org.eclipse.uml2.uml.Class fClient;
  
  private static List<String> parameterNames = makeImmutableList("client");
  
  private WCFServiceMatch(final org.eclipse.uml2.uml.Class pClient) {
    this.fClient = pClient;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("client".equals(parameterName)) return this.fClient;
    return null;
    
  }
  
  public org.eclipse.uml2.uml.Class getClient() {
    return this.fClient;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("client".equals(parameterName) ) {
    	this.fClient = (org.eclipse.uml2.uml.Class) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setClient(final org.eclipse.uml2.uml.Class pClient) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fClient = pClient;
    
  }
  
  @Override
  public String patternName() {
    return "eu.artist.migration.mut.cmg.lob.tagging.queries.WCFService";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return WCFServiceMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fClient};
    
  }
  
  @Override
  public WCFServiceMatch toImmutable() {
    return isMutable() ? newMatch(fClient) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"client\"=" + prettyPrintValue(fClient));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fClient == null) ? 0 : fClient.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WCFServiceMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    WCFServiceMatch other = (WCFServiceMatch) obj;
    if (fClient == null) {if (other.fClient != null) return false;}
    else if (!fClient.equals(other.fClient)) return false;
    return true;
  }
  
  @Override
  public WCFServiceQuerySpecification specification() {
    try {
    	return WCFServiceQuerySpecification.instance();
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
  public static WCFServiceMatch newEmptyMatch() {
    return new Mutable(null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pClient the fixed value of pattern parameter client, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WCFServiceMatch newMutableMatch(final org.eclipse.uml2.uml.Class pClient) {
    return new Mutable(pClient);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pClient the fixed value of pattern parameter client, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WCFServiceMatch newMatch(final org.eclipse.uml2.uml.Class pClient) {
    return new Immutable(pClient);
    
  }
  
  private static final class Mutable extends WCFServiceMatch {
    Mutable(final org.eclipse.uml2.uml.Class pClient) {
      super(pClient);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WCFServiceMatch {
    Immutable(final org.eclipse.uml2.uml.Class pClient) {
      super(pClient);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
