/**
 */
package solution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link solution.EntityPage#getInnerPages <em>Inner Pages</em>}</li>
 * </ul>
 *
 * @see solution.SolutionPackage#getEntityPage()
 * @model
 * @generated
 */
public interface EntityPage extends DynamicPage {
	/**
	 * Returns the value of the '<em><b>Inner Pages</b></em>' containment reference list.
	 * The list contents are of type {@link solution.DynamicPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Pages</em>' containment reference list.
	 * @see solution.SolutionPackage#getEntityPage_InnerPages()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicPage> getInnerPages();

} // EntityPage
