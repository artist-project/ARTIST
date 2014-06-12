package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import eu.artist.migration.mut.cmg.lob.tagging.queries.ASPNETControlMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the eu.artist.migration.mut.cmg.lob.tagging.queries.ASPNETControl pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ASPNETControlProcessor implements IMatchProcessor<ASPNETControlMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSub the value of pattern parameter sub in the currently processed match 
   * 
   */
  public abstract void process(final org.eclipse.uml2.uml.Class pSub);
  
  @Override
  public void process(final ASPNETControlMatch match) {
    process(match.getSub());
    
  }
}
