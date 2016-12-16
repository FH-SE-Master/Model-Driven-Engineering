/**
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Localized#getName <em>Name</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Localized#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getLocalized()
 * @model
 * @generated
 */
public interface Localized extends EObject
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
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getLocalized_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Localized#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getLocalized_Values()
   * @model containment="true"
   * @generated
   */
  EList<LocalizedEntry> getValues();

} // Localized