package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the eu.artist.migration.mut.cmg.lob.tagging.queries.WebPart pattern.
 */
@SuppressWarnings("all")
public class WebPartEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final String supname) {
    boolean _equals = Objects.equal(supname, "WebPart");
    return Boolean.valueOf(_equals);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int supnamePosition = tupleNameMap.get("supname");
    java.lang.String supname = (java.lang.String) tuple.get(supnamePosition);
    return evaluateXExpressionGenerated(supname);
  }
}
