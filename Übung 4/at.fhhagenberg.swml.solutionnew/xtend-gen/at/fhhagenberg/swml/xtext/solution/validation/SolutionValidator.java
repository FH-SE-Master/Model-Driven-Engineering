/**
 * generated by Xtext 2.10.0
 */
package at.fhhagenberg.swml.xtext.solution.validation;

import at.fhhagenberg.swml.xtext.solution.solution.Entity;
import at.fhhagenberg.swml.xtext.solution.solution.SolutionPackage;
import at.fhhagenberg.swml.xtext.solution.validation.AbstractSolutionValidator;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SolutionValidator extends AbstractSolutionValidator {
  public final static String INVALID_NAME = "invalidName";
  
  @Check
  public void checkEntityStartsWithCapital(final Entity entity) {
    String _name = entity.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with a capital", SolutionPackage.Literals.ENTITY__NAME, SolutionValidator.INVALID_NAME);
    }
  }
}
