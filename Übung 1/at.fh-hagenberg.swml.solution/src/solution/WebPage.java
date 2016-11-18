/**
 */
package solution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link solution.WebPage#getName <em>Name</em>}</li>
 *   <li>{@link solution.WebPage#getRelativeUrl <em>Relative Url</em>}</li>
 *   <li>{@link solution.WebPage#getLinks <em>Links</em>}</li>
 *   <li>{@link solution.WebPage#getHomeLink <em>Home Link</em>}</li>
 * </ul>
 *
 * @see solution.SolutionPackage#getWebPage()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='staticPageLinkTarget'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot staticPageLinkTarget='self.homeLink.target.oclIsTypeOf(StaticPage)'"
 * @generated
 */
public interface WebPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see solution.SolutionPackage#getWebPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link solution.WebPage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Url</em>' attribute.
	 * @see #setRelativeUrl(String)
	 * @see solution.SolutionPackage#getWebPage_RelativeUrl()
	 * @model
	 * @generated
	 */
	String getRelativeUrl();

	/**
	 * Sets the value of the '{@link solution.WebPage#getRelativeUrl <em>Relative Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Url</em>' attribute.
	 * @see #getRelativeUrl()
	 * @generated
	 */
	void setRelativeUrl(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link solution.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see solution.SolutionPackage#getWebPage_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Link</em>' containment reference.
	 * @see #setHomeLink(NonContextualLink)
	 * @see solution.SolutionPackage#getWebPage_HomeLink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonContextualLink getHomeLink();

	/**
	 * Sets the value of the '{@link solution.WebPage#getHomeLink <em>Home Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Link</em>' containment reference.
	 * @see #getHomeLink()
	 * @generated
	 */
	void setHomeLink(NonContextualLink value);

} // WebPage
