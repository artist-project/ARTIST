package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplication pattern.
 */
@SuppressWarnings("all")
public class ServiceApplicationEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final String supname) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _or_3 = false;
    boolean _or_4 = false;
    boolean _or_5 = false;
    boolean _or_6 = false;
    boolean _equals = Objects.equal(supname, "SPIisWebService");
    if (_equals) {
      _or_6 = true;
    } else {
      boolean _equals_1 = Objects.equal(supname, "SPDatabase");
      _or_6 = (_equals || _equals_1);
    }
    if (_or_6) {
      _or_5 = true;
    } else {
      boolean _equals_2 = Objects.equal(supname, "SPIisWebServiceApplication");
      _or_5 = (_or_6 || _equals_2);
    }
    if (_or_5) {
      _or_4 = true;
    } else {
      boolean _equals_3 = Objects.equal(supname, "ServiceHost");
      _or_4 = (_or_5 || _equals_3);
    }
    if (_or_4) {
      _or_3 = true;
    } else {
      boolean _equals_4 = Objects.equal(supname, "ServiceHostFactory");
      _or_3 = (_or_4 || _equals_4);
    }
    if (_or_3) {
      _or_2 = true;
    } else {
      boolean _equals_5 = Objects.equal(supname, "SPIisWebServiceInstance");
      _or_2 = (_or_3 || _equals_5);
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _equals_6 = Objects.equal(supname, "SPIisWebServiceApplicationProxy");
      _or_1 = (_or_2 || _equals_6);
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _equals_7 = Objects.equal(supname, "SPIisWebServiceProxy");
      _or = (_or_1 || _equals_7);
    }
    return Boolean.valueOf(_or);
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
