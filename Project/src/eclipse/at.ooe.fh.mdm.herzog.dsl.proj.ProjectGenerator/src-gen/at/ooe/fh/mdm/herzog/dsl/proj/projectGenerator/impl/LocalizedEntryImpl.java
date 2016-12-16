/**
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl;

import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedValue;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localized Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl.LocalizedEntryImpl#getLocalizedKey <em>Localized Key</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl.LocalizedEntryImpl#getValues <em>Values</em>}</li>
 *   <li>{@link at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl.LocalizedEntryImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalizedEntryImpl extends MinimalEObjectImpl.Container implements LocalizedEntry
{
  /**
   * The default value of the '{@link #getLocalizedKey() <em>Localized Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalizedKey()
   * @generated
   * @ordered
   */
  protected static final String LOCALIZED_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocalizedKey() <em>Localized Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalizedKey()
   * @generated
   * @ordered
   */
  protected String localizedKey = LOCALIZED_KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<LocalizedValue> values;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<String> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalizedEntryImpl()
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
    return ProjectGeneratorPackage.Literals.LOCALIZED_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocalizedKey()
  {
    return localizedKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalizedKey(String newLocalizedKey)
  {
    String oldLocalizedKey = localizedKey;
    localizedKey = newLocalizedKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectGeneratorPackage.LOCALIZED_ENTRY__LOCALIZED_KEY, oldLocalizedKey, localizedKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LocalizedValue> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<LocalizedValue>(LocalizedValue.class, this, ProjectGeneratorPackage.LOCALIZED_ENTRY__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getArgs()
  {
    if (args == null)
    {
      args = new EDataTypeEList<String>(String.class, this, ProjectGeneratorPackage.LOCALIZED_ENTRY__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__LOCALIZED_KEY:
        return getLocalizedKey();
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__VALUES:
        return getValues();
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__ARGS:
        return getArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__LOCALIZED_KEY:
        setLocalizedKey((String)newValue);
        return;
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends LocalizedValue>)newValue);
        return;
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends String>)newValue);
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
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__LOCALIZED_KEY:
        setLocalizedKey(LOCALIZED_KEY_EDEFAULT);
        return;
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__VALUES:
        getValues().clear();
        return;
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__ARGS:
        getArgs().clear();
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
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__LOCALIZED_KEY:
        return LOCALIZED_KEY_EDEFAULT == null ? localizedKey != null : !LOCALIZED_KEY_EDEFAULT.equals(localizedKey);
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__VALUES:
        return values != null && !values.isEmpty();
      case ProjectGeneratorPackage.LOCALIZED_ENTRY__ARGS:
        return args != null && !args.isEmpty();
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
    result.append(" (localizedKey: ");
    result.append(localizedKey);
    result.append(", args: ");
    result.append(args);
    result.append(')');
    return result.toString();
  }

} //LocalizedEntryImpl
