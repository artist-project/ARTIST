package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import eu.artist.migration.mut.cmg.lob.tagging.queries.UIMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the eu.artist.migration.mut.cmg.lob.tagging.queries.UI pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class UIProcessor implements IMatchProcessor<UIMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSub the value of pattern parameter sub in the currently processed match
   * 
   */
  public abstract void process(final org.eclipse.uml2.uml.Class pSub);
  
  @Override
  public void process(final UIMatch match) {
    process(match.getSub());
    
  }
}
