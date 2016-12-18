/**
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jpa Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.JpaConfig#getLocalizedEnums <em>Localized Enums</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.JpaConfig#getObservers <em>Observers</em>}</li>
 * </ul>
 *
 * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getJpaConfig()
 * @model
 * @generated
 */
public interface JpaConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Localized Enums</b></em>' reference list.
   * The list contents are of type {@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Localized}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Localized Enums</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Localized Enums</em>' reference list.
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getJpaConfig_LocalizedEnums()
   * @model
   * @generated
   */
  EList<Localized> getLocalizedEnums();

  /**
   * Returns the value of the '<em><b>Observers</b></em>' containment reference list.
   * The list contents are of type {@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observers</em>' containment reference list.
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getJpaConfig_Observers()
   * @model containment="true"
   * @generated
   */
  EList<Observer> getObservers();

} // JpaConfig
