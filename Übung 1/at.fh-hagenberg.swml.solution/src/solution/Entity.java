/**
 */
package solution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link solution.Entity#getName <em>Name</em>}</li>
 *   <li>{@link solution.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link solution.Entity#getId <em>Id</em>}</li>
 *   <li>{@link solution.Entity#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @see solution.SolutionPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueAttributes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueAttributes='self.attributes->forAll(a1 : Attribute, a2 : Attribute | a1 <> a2 implies a1.name <> a2.name)'"
 * @generated
 */
public interface Entity extends EObject {
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
	 * @see solution.SolutionPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link solution.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link solution.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see solution.SolutionPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' reference.
	 * @see #setId(Attribute)
	 * @see solution.SolutionPackage#getEntity_Id()
	 * @model required="true"
	 * @generated
	 */
	Attribute getId();

	/**
	 * Sets the value of the '{@link solution.Entity#getId <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Attribute value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link solution.Relationship}.
	 * It is bidirectional and its opposite is '{@link solution.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see solution.SolutionPackage#getEntity_Relationships()
	 * @see solution.Relationship#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

} // Entity
