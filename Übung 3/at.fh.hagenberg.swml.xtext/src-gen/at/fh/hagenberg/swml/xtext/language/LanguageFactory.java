/**
 * generated by Xtext 2.10.0
 */
package at.fh.hagenberg.swml.xtext.language;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.fh.hagenberg.swml.xtext.language.LanguagePackage
 * @generated
 */
public interface LanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LanguageFactory eINSTANCE = at.fh.hagenberg.swml.xtext.language.impl.LanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Web Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Web Application</em>'.
   * @generated
   */
  WebApplication createWebApplication();

  /**
   * Returns a new object of class '<em>Relation Ship</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Ship</em>'.
   * @generated
   */
  RelationShip createRelationShip();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LanguagePackage getLanguagePackage();

} //LanguageFactory
