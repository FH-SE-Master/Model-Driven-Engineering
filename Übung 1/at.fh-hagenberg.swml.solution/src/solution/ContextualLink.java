/**
 */
package solution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextual Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link solution.ContextualLink#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @see solution.SolutionPackage#getContextualLink()
 * @model
 * @generated
 */
public interface ContextualLink extends Link {
	/**
	 * Returns the value of the '<em><b>Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' reference.
	 * @see #setInformation(Entity)
	 * @see solution.SolutionPackage#getContextualLink_Information()
	 * @model required="true"
	 * @generated
	 */
	Entity getInformation();

	/**
	 * Sets the value of the '{@link solution.ContextualLink#getInformation <em>Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' reference.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(Entity value);

} // ContextualLink
