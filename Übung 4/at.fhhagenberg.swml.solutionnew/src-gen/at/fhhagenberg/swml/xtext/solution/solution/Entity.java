/**
 * generated by Xtext 2.10.0
 */
package at.fhhagenberg.swml.xtext.solution.solution;

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
 *   <li>{@link at.fhhagenberg.swml.xtext.solution.solution.Entity#getName <em>Name</em>}</li>
 *   <li>{@link at.fhhagenberg.swml.xtext.solution.solution.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.fhhagenberg.swml.xtext.solution.solution.Entity#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see at.fhhagenberg.swml.xtext.solution.solution.SolutionPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
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
   * @see at.fhhagenberg.swml.xtext.solution.solution.SolutionPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.fhhagenberg.swml.xtext.solution.solution.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link at.fhhagenberg.swml.xtext.solution.solution.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see at.fhhagenberg.swml.xtext.solution.solution.SolutionPackage#getEntity_Attributes()
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
   * @see at.fhhagenberg.swml.xtext.solution.solution.SolutionPackage#getEntity_Id()
   * @model
   * @generated
   */
  Attribute getId();

  /**
   * Sets the value of the '{@link at.fhhagenberg.swml.xtext.solution.solution.Entity#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(Attribute value);

} // Entity
