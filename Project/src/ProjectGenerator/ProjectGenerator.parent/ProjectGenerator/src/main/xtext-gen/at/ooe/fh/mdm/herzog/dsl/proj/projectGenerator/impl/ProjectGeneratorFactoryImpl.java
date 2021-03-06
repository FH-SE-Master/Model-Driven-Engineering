/**
 * generated by Xtext 2.9.2
 */
package at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.impl;

import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.DbType;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.During;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.JpaConfig;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Locale;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Localized;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedValue;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Module;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Notify;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorFactory;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ServiceConfig;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectGeneratorFactoryImpl extends EFactoryImpl implements ProjectGeneratorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProjectGeneratorFactory init()
  {
    try
    {
      ProjectGeneratorFactory theProjectGeneratorFactory = (ProjectGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(ProjectGeneratorPackage.eNS_URI);
      if (theProjectGeneratorFactory != null)
      {
        return theProjectGeneratorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProjectGeneratorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectGeneratorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProjectGeneratorPackage.MODULE: return createModule();
      case ProjectGeneratorPackage.SERVICE_CONFIG: return createServiceConfig();
      case ProjectGeneratorPackage.OBSERVER: return createObserver();
      case ProjectGeneratorPackage.JPA_CONFIG: return createJpaConfig();
      case ProjectGeneratorPackage.LOCALIZED: return createLocalized();
      case ProjectGeneratorPackage.LOCALIZED_ENTRY: return createLocalizedEntry();
      case ProjectGeneratorPackage.LOCALIZED_VALUE: return createLocalizedValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProjectGeneratorPackage.LOCALE:
        return createLocaleFromString(eDataType, initialValue);
      case ProjectGeneratorPackage.DB_TYPE:
        return createDbTypeFromString(eDataType, initialValue);
      case ProjectGeneratorPackage.BOOLEAN:
        return createBooleanFromString(eDataType, initialValue);
      case ProjectGeneratorPackage.DURING:
        return createDuringFromString(eDataType, initialValue);
      case ProjectGeneratorPackage.NOTIFY:
        return createNotifyFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProjectGeneratorPackage.LOCALE:
        return convertLocaleToString(eDataType, instanceValue);
      case ProjectGeneratorPackage.DB_TYPE:
        return convertDbTypeToString(eDataType, instanceValue);
      case ProjectGeneratorPackage.BOOLEAN:
        return convertBooleanToString(eDataType, instanceValue);
      case ProjectGeneratorPackage.DURING:
        return convertDuringToString(eDataType, instanceValue);
      case ProjectGeneratorPackage.NOTIFY:
        return convertNotifyToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceConfig createServiceConfig()
  {
    ServiceConfigImpl serviceConfig = new ServiceConfigImpl();
    return serviceConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observer createObserver()
  {
    ObserverImpl observer = new ObserverImpl();
    return observer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpaConfig createJpaConfig()
  {
    JpaConfigImpl jpaConfig = new JpaConfigImpl();
    return jpaConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Localized createLocalized()
  {
    LocalizedImpl localized = new LocalizedImpl();
    return localized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalizedEntry createLocalizedEntry()
  {
    LocalizedEntryImpl localizedEntry = new LocalizedEntryImpl();
    return localizedEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalizedValue createLocalizedValue()
  {
    LocalizedValueImpl localizedValue = new LocalizedValueImpl();
    return localizedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Locale createLocaleFromString(EDataType eDataType, String initialValue)
  {
    Locale result = Locale.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLocaleToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbType createDbTypeFromString(EDataType eDataType, String initialValue)
  {
    DbType result = DbType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDbTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Boolean createBooleanFromString(EDataType eDataType, String initialValue)
  {
    at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Boolean result = at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Boolean.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public During createDuringFromString(EDataType eDataType, String initialValue)
  {
    During result = During.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDuringToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Notify createNotifyFromString(EDataType eDataType, String initialValue)
  {
    Notify result = Notify.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNotifyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectGeneratorPackage getProjectGeneratorPackage()
  {
    return (ProjectGeneratorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProjectGeneratorPackage getPackage()
  {
    return ProjectGeneratorPackage.eINSTANCE;
  }

} //ProjectGeneratorFactoryImpl
