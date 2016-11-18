/**
 */
package solution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see solution.SolutionPackage
 * @generated
 */
public interface SolutionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolutionFactory eINSTANCE = solution.impl.SolutionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Application</em>'.
	 * @generated
	 */
	WebApplication createWebApplication();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Static Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Page</em>'.
	 * @generated
	 */
	StaticPage createStaticPage();

	/**
	 * Returns a new object of class '<em>Entity Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Page</em>'.
	 * @generated
	 */
	EntityPage createEntityPage();

	/**
	 * Returns a new object of class '<em>Index Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Page</em>'.
	 * @generated
	 */
	IndexPage createIndexPage();

	/**
	 * Returns a new object of class '<em>Create Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Page</em>'.
	 * @generated
	 */
	CreatePage createCreatePage();

	/**
	 * Returns a new object of class '<em>Update Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Page</em>'.
	 * @generated
	 */
	UpdatePage createUpdatePage();

	/**
	 * Returns a new object of class '<em>Delete Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Page</em>'.
	 * @generated
	 */
	DeletePage createDeletePage();

	/**
	 * Returns a new object of class '<em>Non Contextual Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Contextual Link</em>'.
	 * @generated
	 */
	NonContextualLink createNonContextualLink();

	/**
	 * Returns a new object of class '<em>Contextual Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contextual Link</em>'.
	 * @generated
	 */
	ContextualLink createContextualLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolutionPackage getSolutionPackage();

} //SolutionFactory
