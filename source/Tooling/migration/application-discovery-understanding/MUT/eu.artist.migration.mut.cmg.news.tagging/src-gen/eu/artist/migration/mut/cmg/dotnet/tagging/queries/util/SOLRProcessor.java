package eu.artist.migration.mut.cmg.dotnet.tagging.queries.util;

import eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLRMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.uml2.uml.Comment;

/**
 * A match processor tailored for the eu.artist.migration.mut.cmg.dotnet.tagging.queries.SOLR pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SOLRProcessor implements IMatchProcessor<SOLRMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCls the value of pattern parameter cls in the currently processed match
   * @param pCmt the value of pattern parameter cmt in the currently processed match
   * 
   */
  public abstract void process(final org.eclipse.uml2.uml.Class pCls, final Comment pCmt);
  
  @Override
  public void process(final SOLRMatch match) {
    process(match.getCls(), match.getCmt());
    
  }
}
