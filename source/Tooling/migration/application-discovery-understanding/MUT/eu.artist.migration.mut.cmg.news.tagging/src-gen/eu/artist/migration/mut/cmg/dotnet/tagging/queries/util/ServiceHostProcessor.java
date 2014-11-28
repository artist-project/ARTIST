package eu.artist.migration.mut.cmg.dotnet.tagging.queries.util;

import eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHostMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.uml2.uml.Property;

/**
 * A match processor tailored for the eu.artist.migration.mut.cmg.dotnet.tagging.queries.ServiceHost pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ServiceHostProcessor implements IMatchProcessor<ServiceHostMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCl the value of pattern parameter cl in the currently processed match
   * @param pPr the value of pattern parameter pr in the currently processed match
   * 
   */
  public abstract void process(final org.eclipse.uml2.uml.Class pCl, final Property pPr);
  
  @Override
  public void process(final ServiceHostMatch match) {
    process(match.getCl(), match.getPr());
    
  }
}
