/**
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getName <em>Name</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getType <em>Type</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getDuring <em>During</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getNotify <em>Notify</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getClassName <em>Class Name</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getObserver()
 * @model
 * @generated
 */
public interface Observer extends EObject
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
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getObserver_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getObserver_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>During</b></em>' attribute.
   * The literals are from the enumeration {@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.During}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>During</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>During</em>' attribute.
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.During
   * @see #setDuring(During)
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getObserver_During()
   * @model
   * @generated
   */
  During getDuring();

  /**
   * Sets the value of the '{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getDuring <em>During</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>During</em>' attribute.
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.During
   * @see #getDuring()
   * @generated
   */
  void setDuring(During value);

  /**
   * Returns the value of the '<em><b>Notify</b></em>' attribute.
   * The literals are from the enumeration {@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Notify}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notify</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notify</em>' attribute.
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Notify
   * @see #setNotify(Notify)
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getObserver_Notify()
   * @model
   * @generated
   */
  Notify getNotify();

  /**
   * Sets the value of the '{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getNotify <em>Notify</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notify</em>' attribute.
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Notify
   * @see #getNotify()
   * @generated
   */
  void setNotify(Notify value);

  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getObserver_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' attribute.
   * @see #setQualifier(String)
   * @see at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage#getObserver_Qualifier()
   * @model
   * @generated
   */
  String getQualifier();

  /**
   * Sets the value of the '{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer#getQualifier <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' attribute.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(String value);

} // Observer
