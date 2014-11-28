package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import eu.artist.migration.mut.cmg.lob.tagging.queries.WCFServiceMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the eu.artist.migration.mut.cmg.lob.tagging.queries.WCFService pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WCFServiceProcessor implements IMatchProcessor<WCFServiceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pClient the value of pattern parameter client in the currently processed match
   * 
   */
  public abstract void process(final org.eclipse.uml2.uml.Class pClient);
  
  @Override
  public void process(final WCFServiceMatch match) {
    process(match.getClient());
    
  }
}
