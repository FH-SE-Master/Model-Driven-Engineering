/**
 * generated by Xtext 2.10.0
 */
package at.fh.hagenberg.swml;

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
 *   <li>{@link at.fh.hagenberg.swml.WebApplication#getName <em>Name</em>}</li>
 *   <li>{@link at.fh.hagenberg.swml.WebApplication#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see at.fh.hagenberg.swml.SwmlPackage#getWebApplication()
 * @model
 * @generated
 */
public interface WebApplication extends EObject
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
   * @see at.fh.hagenberg.swml.SwmlPackage#getWebApplication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.fh.hagenberg.swml.WebApplication#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link at.fh.hagenberg.swml.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see at.fh.hagenberg.swml.SwmlPackage#getWebApplication_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

} // WebApplication
