/**
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl;

import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.During;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Notify;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl.ObserverImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl.ObserverImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl.ObserverImpl#getDuring <em>During</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl.ObserverImpl#getNotify <em>Notify</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl.ObserverImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl.ObserverImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObserverImpl extends MinimalEObjectImpl.Container implements Observer
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDuring() <em>During</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuring()
   * @generated
   * @ordered
   */
  protected static final During DURING_EDEFAULT = During.IN_PROG;

  /**
   * The cached value of the '{@link #getDuring() <em>During</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuring()
   * @generated
   * @ordered
   */
  protected During during = DURING_EDEFAULT;

  /**
   * The default value of the '{@link #getNotify() <em>Notify</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotify()
   * @generated
   * @ordered
   */
  protected static final Notify NOTIFY_EDEFAULT = Notify.ALWAYS;

  /**
   * The cached value of the '{@link #getNotify() <em>Notify</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotify()
   * @generated
   * @ordered
   */
  protected Notify notify = NOTIFY_EDEFAULT;

  /**
   * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected String className = CLASS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected String qualifier = QUALIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObserverImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProjectGeneratorPackage.Literals.OBSERVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectGeneratorPackage.OBSERVER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectGeneratorPackage.OBSERVER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public During getDuring()
  {
    return during;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuring(During newDuring)
  {
    During oldDuring = during;
    during = newDuring == null ? DURING_EDEFAULT : newDuring;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectGeneratorPackage.OBSERVER__DURING, oldDuring, during));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Notify getNotify()
  {
    return notify;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotify(Notify newNotify)
  {
    Notify oldNotify = notify;
    notify = newNotify == null ? NOTIFY_EDEFAULT : newNotify;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectGeneratorPackage.OBSERVER__NOTIFY, oldNotify, notify));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassName()
  {
    return className;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassName(String newClassName)
  {
    String oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectGeneratorPackage.OBSERVER__CLASS_NAME, oldClassName, className));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(String newQualifier)
  {
    String oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectGeneratorPackage.OBSERVER__QUALIFIER, oldQualifier, qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProjectGeneratorPackage.OBSERVER__NAME:
        return getName();
      case ProjectGeneratorPackage.OBSERVER__TYPE:
        return getType();
      case ProjectGeneratorPackage.OBSERVER__DURING:
        return getDuring();
      case ProjectGeneratorPackage.OBSERVER__NOTIFY:
        return getNotify();
      case ProjectGeneratorPackage.OBSERVER__CLASS_NAME:
        return getClassName();
      case ProjectGeneratorPackage.OBSERVER__QUALIFIER:
        return getQualifier();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProjectGeneratorPackage.OBSERVER__NAME:
        setName((String)newValue);
        return;
      case ProjectGeneratorPackage.OBSERVER__TYPE:
        setType((String)newValue);
        return;
      case ProjectGeneratorPackage.OBSERVER__DURING:
        setDuring((During)newValue);
        return;
      case ProjectGeneratorPackage.OBSERVER__NOTIFY:
        setNotify((Notify)newValue);
        return;
      case ProjectGeneratorPackage.OBSERVER__CLASS_NAME:
        setClassName((String)newValue);
        return;
      case ProjectGeneratorPackage.OBSERVER__QUALIFIER:
        setQualifier((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProjectGeneratorPackage.OBSERVER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProjectGeneratorPackage.OBSERVER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ProjectGeneratorPackage.OBSERVER__DURING:
        setDuring(DURING_EDEFAULT);
        return;
      case ProjectGeneratorPackage.OBSERVER__NOTIFY:
        setNotify(NOTIFY_EDEFAULT);
        return;
      case ProjectGeneratorPackage.OBSERVER__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
        return;
      case ProjectGeneratorPackage.OBSERVER__QUALIFIER:
        setQualifier(QUALIFIER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProjectGeneratorPackage.OBSERVER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProjectGeneratorPackage.OBSERVER__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case ProjectGeneratorPackage.OBSERVER__DURING:
        return during != DURING_EDEFAULT;
      case ProjectGeneratorPackage.OBSERVER__NOTIFY:
        return notify != NOTIFY_EDEFAULT;
      case ProjectGeneratorPackage.OBSERVER__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
      case ProjectGeneratorPackage.OBSERVER__QUALIFIER:
        return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", during: ");
    result.append(during);
    result.append(", notify: ");
    result.append(notify);
    result.append(", className: ");
    result.append(className);
    result.append(", qualifier: ");
    result.append(qualifier);
    result.append(')');
    return result.toString();
  }

} //ObserverImpl