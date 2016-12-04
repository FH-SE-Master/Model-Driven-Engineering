/**
 */
package solution;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link solution.WebApplication#getName <em>Name</em>}</li>
 *   <li>{@link solution.WebApplication#getEntities <em>Entities</em>}</li>
 *   <li>{@link solution.WebApplication#getWebpages <em>Webpages</em>}</li>
 *   <li>{@link solution.WebApplication#getHomePage <em>Home Page</em>}</li>
 *   <li>{@link solution.WebApplication#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link solution.WebApplication#getGoLiveDate <em>Go Live Date</em>}</li>
 * </ul>
 *
 * @see solution.SolutionPackage#getWebApplication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveName uniqueEntities pageForEntity singleHomePage checkDate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveName='not self.name.oclIsUndefined() and name <>\'\'' uniqueEntities='self.entities->forAll(e1 : Entity, e2 : Entity | e1 <> e2 implies e1.name <> e2.name)' pageForEntity='DynamicPage.allInstances()->collect(entity)->asSet() = Entity.allInstances()' singleHomePage='webpages->collect(homeLink.target)->forAll(p | p = self.homePage)' checkDate='creationDateBeforeGoLive()'"
 * @generated
 */
public interface WebApplication extends EObject {
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
	 * @see solution.SolutionPackage#getWebApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link solution.WebApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link solution.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see solution.SolutionPackage#getWebApplication_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Webpages</b></em>' containment reference list.
	 * The list contents are of type {@link solution.WebPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webpages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpages</em>' containment reference list.
	 * @see solution.SolutionPackage#getWebApplication_Webpages()
	 * @model containment="true"
	 * @generated
	 */
	EList<WebPage> getWebpages();

	/**
	 * Returns the value of the '<em><b>Home Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Page</em>' reference.
	 * @see #setHomePage(StaticPage)
	 * @see solution.SolutionPackage#getWebApplication_HomePage()
	 * @model required="true"
	 * @generated
	 */
	StaticPage getHomePage();

	/**
	 * Sets the value of the '{@link solution.WebApplication#getHomePage <em>Home Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Page</em>' reference.
	 * @see #getHomePage()
	 * @generated
	 */
	void setHomePage(StaticPage value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see solution.SolutionPackage#getWebApplication_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link solution.WebApplication#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Go Live Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Live Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Live Date</em>' attribute.
	 * @see #setGoLiveDate(Date)
	 * @see solution.SolutionPackage#getWebApplication_GoLiveDate()
	 * @model
	 * @generated
	 */
	Date getGoLiveDate();

	/**
	 * Sets the value of the '{@link solution.WebApplication#getGoLiveDate <em>Go Live Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Live Date</em>' attribute.
	 * @see #getGoLiveDate()
	 * @generated
	 */
	void setGoLiveDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean creationDateBeforeGoLive();

} // WebApplication
