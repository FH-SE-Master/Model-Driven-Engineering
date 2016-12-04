/**
 */
package solution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editable Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link solution.EditablePage#getReturnPage <em>Return Page</em>}</li>
 * </ul>
 *
 * @see solution.SolutionPackage#getEditablePage()
 * @model abstract="true"
 * @generated
 */
public interface EditablePage extends EntityPage {
	/**
	 * Returns the value of the '<em><b>Return Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Page</em>' reference.
	 * @see #setReturnPage(EntityPage)
	 * @see solution.SolutionPackage#getEditablePage_ReturnPage()
	 * @model
	 * @generated
	 */
	EntityPage getReturnPage();

	/**
	 * Sets the value of the '{@link solution.EditablePage#getReturnPage <em>Return Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Page</em>' reference.
	 * @see #getReturnPage()
	 * @generated
	 */
	void setReturnPage(EntityPage value);

} // EditablePage
