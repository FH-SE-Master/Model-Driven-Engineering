/**
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localized Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry#getLocalizedKey <em>Localized Key</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry#getValues <em>Values</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getLocalizedEntry()
 * @model
 * @generated
 */
public interface LocalizedEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Localized Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Localized Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Localized Key</em>' attribute.
   * @see #setLocalizedKey(String)
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getLocalizedEntry_LocalizedKey()
   * @model
   * @generated
   */
  String getLocalizedKey();

  /**
   * Sets the value of the '{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry#getLocalizedKey <em>Localized Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Localized Key</em>' attribute.
   * @see #getLocalizedKey()
   * @generated
   */
  void setLocalizedKey(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getLocalizedEntry_Values()
   * @model containment="true"
   * @generated
   */
  EList<LocalizedValue> getValues();

  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute list.
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getLocalizedEntry_Args()
   * @model unique="false"
   * @generated
   */
  EList<String> getArgs();

} // LocalizedEntry