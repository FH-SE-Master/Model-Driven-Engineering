/**
 */
package solution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see solution.SolutionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SolutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/solution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "solution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolutionPackage eINSTANCE = solution.impl.SolutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link solution.impl.WebApplicationImpl <em>Web Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.WebApplicationImpl
	 * @see solution.impl.SolutionPackageImpl#getWebApplication()
	 * @generated
	 */
	int WEB_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Webpages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__WEBPAGES = 2;

	/**
	 * The feature id for the '<em><b>Home Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__HOME_PAGE = 3;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__CREATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Go Live Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__GO_LIVE_DATE = 5;

	/**
	 * The number of structural features of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Creation Date Before Go Live</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION___CREATION_DATE_BEFORE_GO_LIVE = 0;

	/**
	 * The number of operations of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link solution.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.EntityImpl
	 * @see solution.impl.SolutionPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 2;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONSHIPS = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link solution.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.AttributeImpl
	 * @see solution.impl.SolutionPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link solution.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.RelationshipImpl
	 * @see solution.impl.SolutionPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OPPOSITE = 2;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ROLE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LOWER_BOUND = 4;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UPPER_BOUND = 5;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link solution.impl.WebPageImpl <em>Web Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.WebPageImpl
	 * @see solution.impl.SolutionPackageImpl#getWebPage()
	 * @generated
	 */
	int WEB_PAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__RELATIVE_URL = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__LINKS = 2;

	/**
	 * The feature id for the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__HOME_LINK = 3;

	/**
	 * The number of structural features of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link solution.impl.StaticPageImpl <em>Static Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.StaticPageImpl
	 * @see solution.impl.SolutionPackageImpl#getStaticPage()
	 * @generated
	 */
	int STATIC_PAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PAGE__NAME = WEB_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PAGE__RELATIVE_URL = WEB_PAGE__RELATIVE_URL;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PAGE__LINKS = WEB_PAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PAGE__HOME_LINK = WEB_PAGE__HOME_LINK;

	/**
	 * The number of structural features of the '<em>Static Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PAGE_FEATURE_COUNT = WEB_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PAGE_OPERATION_COUNT = WEB_PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.impl.DynamicPageImpl <em>Dynamic Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.DynamicPageImpl
	 * @see solution.impl.SolutionPackageImpl#getDynamicPage()
	 * @generated
	 */
	int DYNAMIC_PAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE__NAME = WEB_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE__RELATIVE_URL = WEB_PAGE__RELATIVE_URL;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE__LINKS = WEB_PAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE__HOME_LINK = WEB_PAGE__HOME_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE__ENTITY = WEB_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE_FEATURE_COUNT = WEB_PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dynamic Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE_OPERATION_COUNT = WEB_PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.impl.EntityPageImpl <em>Entity Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.EntityPageImpl
	 * @see solution.impl.SolutionPackageImpl#getEntityPage()
	 * @generated
	 */
	int ENTITY_PAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__NAME = DYNAMIC_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__RELATIVE_URL = DYNAMIC_PAGE__RELATIVE_URL;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__LINKS = DYNAMIC_PAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__HOME_LINK = DYNAMIC_PAGE__HOME_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__ENTITY = DYNAMIC_PAGE__ENTITY;

	/**
	 * The feature id for the '<em><b>Inner Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__INNER_PAGES = DYNAMIC_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE_FEATURE_COUNT = DYNAMIC_PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE_OPERATION_COUNT = DYNAMIC_PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.impl.IndexPageImpl <em>Index Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.IndexPageImpl
	 * @see solution.impl.SolutionPackageImpl#getIndexPage()
	 * @generated
	 */
	int INDEX_PAGE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__NAME = DYNAMIC_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__RELATIVE_URL = DYNAMIC_PAGE__RELATIVE_URL;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__LINKS = DYNAMIC_PAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__HOME_LINK = DYNAMIC_PAGE__HOME_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__ENTITY = DYNAMIC_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>Index Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_FEATURE_COUNT = DYNAMIC_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_OPERATION_COUNT = DYNAMIC_PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.impl.EditablePageImpl <em>Editable Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.EditablePageImpl
	 * @see solution.impl.SolutionPackageImpl#getEditablePage()
	 * @generated
	 */
	int EDITABLE_PAGE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_PAGE__NAME = ENTITY_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_PAGE__RELATIVE_URL = ENTITY_PAGE__RELATIVE_URL;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_PAGE__LINKS = ENTITY_PAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_PAGE__HOME_LINK = ENTITY_PAGE__HOME_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_PAGE__ENTITY = ENTITY_PAGE__ENTITY;

	/**
	 * The feature id for the '<em><b>Inner Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_PAGE__INNER_PAGES = ENTITY_PAGE__INNER_PAGES;

	/**
	 * The feature id for the '<em><b>Return Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_PAGE__RETURN_PAGE = ENTITY_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Editable Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_PAGE_FEATURE_COUNT = ENTITY_PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Editable Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_PAGE_OPERATION_COUNT = ENTITY_PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.impl.CreatePageImpl <em>Create Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.CreatePageImpl
	 * @see solution.impl.SolutionPackageImpl#getCreatePage()
	 * @generated
	 */
	int CREATE_PAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__NAME = EDITABLE_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__RELATIVE_URL = EDITABLE_PAGE__RELATIVE_URL;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__LINKS = EDITABLE_PAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__HOME_LINK = EDITABLE_PAGE__HOME_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__ENTITY = EDITABLE_PAGE__ENTITY;

	/**
	 * The feature id for the '<em><b>Inner Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__INNER_PAGES = EDITABLE_PAGE__INNER_PAGES;

	/**
	 * The feature id for the '<em><b>Return Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__RETURN_PAGE = EDITABLE_PAGE__RETURN_PAGE;

	/**
	 * The number of structural features of the '<em>Create Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE_FEATURE_COUNT = EDITABLE_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE_OPERATION_COUNT = EDITABLE_PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.impl.UpdatePageImpl <em>Update Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.UpdatePageImpl
	 * @see solution.impl.SolutionPackageImpl#getUpdatePage()
	 * @generated
	 */
	int UPDATE_PAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__NAME = EDITABLE_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__RELATIVE_URL = EDITABLE_PAGE__RELATIVE_URL;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__LINKS = EDITABLE_PAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__HOME_LINK = EDITABLE_PAGE__HOME_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__ENTITY = EDITABLE_PAGE__ENTITY;

	/**
	 * The feature id for the '<em><b>Inner Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__INNER_PAGES = EDITABLE_PAGE__INNER_PAGES;

	/**
	 * The feature id for the '<em><b>Return Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__RETURN_PAGE = EDITABLE_PAGE__RETURN_PAGE;

	/**
	 * The number of structural features of the '<em>Update Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE_FEATURE_COUNT = EDITABLE_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE_OPERATION_COUNT = EDITABLE_PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.impl.DeletePageImpl <em>Delete Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.DeletePageImpl
	 * @see solution.impl.SolutionPackageImpl#getDeletePage()
	 * @generated
	 */
	int DELETE_PAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__NAME = EDITABLE_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__RELATIVE_URL = EDITABLE_PAGE__RELATIVE_URL;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__LINKS = EDITABLE_PAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Home Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__HOME_LINK = EDITABLE_PAGE__HOME_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__ENTITY = EDITABLE_PAGE__ENTITY;

	/**
	 * The feature id for the '<em><b>Inner Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__INNER_PAGES = EDITABLE_PAGE__INNER_PAGES;

	/**
	 * The feature id for the '<em><b>Return Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__RETURN_PAGE = EDITABLE_PAGE__RETURN_PAGE;

	/**
	 * The number of structural features of the '<em>Delete Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE_FEATURE_COUNT = EDITABLE_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE_OPERATION_COUNT = EDITABLE_PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.LinkImpl
	 * @see solution.impl.SolutionPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link solution.impl.NonContextualLinkImpl <em>Non Contextual Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.NonContextualLinkImpl
	 * @see solution.impl.SolutionPackageImpl#getNonContextualLink()
	 * @generated
	 */
	int NON_CONTEXTUAL_LINK = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONTEXTUAL_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONTEXTUAL_LINK__TARGET = LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Non Contextual Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONTEXTUAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Contextual Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONTEXTUAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.impl.ContextualLinkImpl <em>Contextual Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.impl.ContextualLinkImpl
	 * @see solution.impl.SolutionPackageImpl#getContextualLink()
	 * @generated
	 */
	int CONTEXTUAL_LINK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_LINK__TARGET = LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_LINK__INFORMATION = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contextual Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contextual Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link solution.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see solution.DataType
	 * @see solution.impl.SolutionPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link solution.WebApplication <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application</em>'.
	 * @see solution.WebApplication
	 * @generated
	 */
	EClass getWebApplication();

	/**
	 * Returns the meta object for the attribute '{@link solution.WebApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see solution.WebApplication#getName()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link solution.WebApplication#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see solution.WebApplication#getEntities()
	 * @see #getWebApplication()
	 * @generated
	 */
	EReference getWebApplication_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link solution.WebApplication#getWebpages <em>Webpages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Webpages</em>'.
	 * @see solution.WebApplication#getWebpages()
	 * @see #getWebApplication()
	 * @generated
	 */
	EReference getWebApplication_Webpages();

	/**
	 * Returns the meta object for the reference '{@link solution.WebApplication#getHomePage <em>Home Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home Page</em>'.
	 * @see solution.WebApplication#getHomePage()
	 * @see #getWebApplication()
	 * @generated
	 */
	EReference getWebApplication_HomePage();

	/**
	 * Returns the meta object for the attribute '{@link solution.WebApplication#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see solution.WebApplication#getCreationDate()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link solution.WebApplication#getGoLiveDate <em>Go Live Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Go Live Date</em>'.
	 * @see solution.WebApplication#getGoLiveDate()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_GoLiveDate();

	/**
	 * Returns the meta object for the '{@link solution.WebApplication#creationDateBeforeGoLive() <em>Creation Date Before Go Live</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creation Date Before Go Live</em>' operation.
	 * @see solution.WebApplication#creationDateBeforeGoLive()
	 * @generated
	 */
	EOperation getWebApplication__CreationDateBeforeGoLive();

	/**
	 * Returns the meta object for class '{@link solution.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see solution.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link solution.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see solution.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link solution.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see solution.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the reference '{@link solution.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see solution.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link solution.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see solution.Entity#getRelationships()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relationships();

	/**
	 * Returns the meta object for class '{@link solution.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see solution.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link solution.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see solution.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link solution.Attribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see solution.Attribute#getDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataType();

	/**
	 * Returns the meta object for class '{@link solution.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see solution.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the container reference '{@link solution.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see solution.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link solution.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see solution.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link solution.Relationship#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see solution.Relationship#getOpposite()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link solution.Relationship#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see solution.Relationship#getRoleName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link solution.Relationship#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see solution.Relationship#getLowerBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link solution.Relationship#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see solution.Relationship#getUpperBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_UpperBound();

	/**
	 * Returns the meta object for class '{@link solution.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Page</em>'.
	 * @see solution.WebPage
	 * @generated
	 */
	EClass getWebPage();

	/**
	 * Returns the meta object for the attribute '{@link solution.WebPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see solution.WebPage#getName()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link solution.WebPage#getRelativeUrl <em>Relative Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Url</em>'.
	 * @see solution.WebPage#getRelativeUrl()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_RelativeUrl();

	/**
	 * Returns the meta object for the containment reference list '{@link solution.WebPage#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see solution.WebPage#getLinks()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Links();

	/**
	 * Returns the meta object for the containment reference '{@link solution.WebPage#getHomeLink <em>Home Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home Link</em>'.
	 * @see solution.WebPage#getHomeLink()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_HomeLink();

	/**
	 * Returns the meta object for class '{@link solution.StaticPage <em>Static Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Page</em>'.
	 * @see solution.StaticPage
	 * @generated
	 */
	EClass getStaticPage();

	/**
	 * Returns the meta object for class '{@link solution.DynamicPage <em>Dynamic Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Page</em>'.
	 * @see solution.DynamicPage
	 * @generated
	 */
	EClass getDynamicPage();

	/**
	 * Returns the meta object for the reference '{@link solution.DynamicPage#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see solution.DynamicPage#getEntity()
	 * @see #getDynamicPage()
	 * @generated
	 */
	EReference getDynamicPage_Entity();

	/**
	 * Returns the meta object for class '{@link solution.EntityPage <em>Entity Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Page</em>'.
	 * @see solution.EntityPage
	 * @generated
	 */
	EClass getEntityPage();

	/**
	 * Returns the meta object for the containment reference list '{@link solution.EntityPage#getInnerPages <em>Inner Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Pages</em>'.
	 * @see solution.EntityPage#getInnerPages()
	 * @see #getEntityPage()
	 * @generated
	 */
	EReference getEntityPage_InnerPages();

	/**
	 * Returns the meta object for class '{@link solution.IndexPage <em>Index Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Page</em>'.
	 * @see solution.IndexPage
	 * @generated
	 */
	EClass getIndexPage();

	/**
	 * Returns the meta object for class '{@link solution.CreatePage <em>Create Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Page</em>'.
	 * @see solution.CreatePage
	 * @generated
	 */
	EClass getCreatePage();

	/**
	 * Returns the meta object for class '{@link solution.UpdatePage <em>Update Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Page</em>'.
	 * @see solution.UpdatePage
	 * @generated
	 */
	EClass getUpdatePage();

	/**
	 * Returns the meta object for class '{@link solution.DeletePage <em>Delete Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Page</em>'.
	 * @see solution.DeletePage
	 * @generated
	 */
	EClass getDeletePage();

	/**
	 * Returns the meta object for class '{@link solution.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see solution.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link solution.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see solution.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for the reference '{@link solution.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see solution.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for class '{@link solution.NonContextualLink <em>Non Contextual Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Contextual Link</em>'.
	 * @see solution.NonContextualLink
	 * @generated
	 */
	EClass getNonContextualLink();

	/**
	 * Returns the meta object for class '{@link solution.ContextualLink <em>Contextual Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Link</em>'.
	 * @see solution.ContextualLink
	 * @generated
	 */
	EClass getContextualLink();

	/**
	 * Returns the meta object for the reference '{@link solution.ContextualLink#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Information</em>'.
	 * @see solution.ContextualLink#getInformation()
	 * @see #getContextualLink()
	 * @generated
	 */
	EReference getContextualLink_Information();

	/**
	 * Returns the meta object for class '{@link solution.EditablePage <em>Editable Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editable Page</em>'.
	 * @see solution.EditablePage
	 * @generated
	 */
	EClass getEditablePage();

	/**
	 * Returns the meta object for the reference '{@link solution.EditablePage#getReturnPage <em>Return Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Page</em>'.
	 * @see solution.EditablePage#getReturnPage()
	 * @see #getEditablePage()
	 * @generated
	 */
	EReference getEditablePage_ReturnPage();

	/**
	 * Returns the meta object for enum '{@link solution.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see solution.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolutionFactory getSolutionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link solution.impl.WebApplicationImpl <em>Web Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.WebApplicationImpl
		 * @see solution.impl.SolutionPackageImpl#getWebApplication()
		 * @generated
		 */
		EClass WEB_APPLICATION = eINSTANCE.getWebApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__NAME = eINSTANCE.getWebApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION__ENTITIES = eINSTANCE.getWebApplication_Entities();

		/**
		 * The meta object literal for the '<em><b>Webpages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION__WEBPAGES = eINSTANCE.getWebApplication_Webpages();

		/**
		 * The meta object literal for the '<em><b>Home Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION__HOME_PAGE = eINSTANCE.getWebApplication_HomePage();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__CREATION_DATE = eINSTANCE.getWebApplication_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Go Live Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__GO_LIVE_DATE = eINSTANCE.getWebApplication_GoLiveDate();

		/**
		 * The meta object literal for the '<em><b>Creation Date Before Go Live</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_APPLICATION___CREATION_DATE_BEFORE_GO_LIVE = eINSTANCE.getWebApplication__CreationDateBeforeGoLive();

		/**
		 * The meta object literal for the '{@link solution.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.EntityImpl
		 * @see solution.impl.SolutionPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONSHIPS = eINSTANCE.getEntity_Relationships();

		/**
		 * The meta object literal for the '{@link solution.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.AttributeImpl
		 * @see solution.impl.SolutionPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

		/**
		 * The meta object literal for the '{@link solution.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.RelationshipImpl
		 * @see solution.impl.SolutionPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__OPPOSITE = eINSTANCE.getRelationship_Opposite();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__ROLE_NAME = eINSTANCE.getRelationship_RoleName();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__LOWER_BOUND = eINSTANCE.getRelationship_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__UPPER_BOUND = eINSTANCE.getRelationship_UpperBound();

		/**
		 * The meta object literal for the '{@link solution.impl.WebPageImpl <em>Web Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.WebPageImpl
		 * @see solution.impl.SolutionPackageImpl#getWebPage()
		 * @generated
		 */
		EClass WEB_PAGE = eINSTANCE.getWebPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__NAME = eINSTANCE.getWebPage_Name();

		/**
		 * The meta object literal for the '<em><b>Relative Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__RELATIVE_URL = eINSTANCE.getWebPage_RelativeUrl();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__LINKS = eINSTANCE.getWebPage_Links();

		/**
		 * The meta object literal for the '<em><b>Home Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__HOME_LINK = eINSTANCE.getWebPage_HomeLink();

		/**
		 * The meta object literal for the '{@link solution.impl.StaticPageImpl <em>Static Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.StaticPageImpl
		 * @see solution.impl.SolutionPackageImpl#getStaticPage()
		 * @generated
		 */
		EClass STATIC_PAGE = eINSTANCE.getStaticPage();

		/**
		 * The meta object literal for the '{@link solution.impl.DynamicPageImpl <em>Dynamic Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.DynamicPageImpl
		 * @see solution.impl.SolutionPackageImpl#getDynamicPage()
		 * @generated
		 */
		EClass DYNAMIC_PAGE = eINSTANCE.getDynamicPage();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_PAGE__ENTITY = eINSTANCE.getDynamicPage_Entity();

		/**
		 * The meta object literal for the '{@link solution.impl.EntityPageImpl <em>Entity Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.EntityPageImpl
		 * @see solution.impl.SolutionPackageImpl#getEntityPage()
		 * @generated
		 */
		EClass ENTITY_PAGE = eINSTANCE.getEntityPage();

		/**
		 * The meta object literal for the '<em><b>Inner Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_PAGE__INNER_PAGES = eINSTANCE.getEntityPage_InnerPages();

		/**
		 * The meta object literal for the '{@link solution.impl.IndexPageImpl <em>Index Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.IndexPageImpl
		 * @see solution.impl.SolutionPackageImpl#getIndexPage()
		 * @generated
		 */
		EClass INDEX_PAGE = eINSTANCE.getIndexPage();

		/**
		 * The meta object literal for the '{@link solution.impl.CreatePageImpl <em>Create Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.CreatePageImpl
		 * @see solution.impl.SolutionPackageImpl#getCreatePage()
		 * @generated
		 */
		EClass CREATE_PAGE = eINSTANCE.getCreatePage();

		/**
		 * The meta object literal for the '{@link solution.impl.UpdatePageImpl <em>Update Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.UpdatePageImpl
		 * @see solution.impl.SolutionPackageImpl#getUpdatePage()
		 * @generated
		 */
		EClass UPDATE_PAGE = eINSTANCE.getUpdatePage();

		/**
		 * The meta object literal for the '{@link solution.impl.DeletePageImpl <em>Delete Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.DeletePageImpl
		 * @see solution.impl.SolutionPackageImpl#getDeletePage()
		 * @generated
		 */
		EClass DELETE_PAGE = eINSTANCE.getDeletePage();

		/**
		 * The meta object literal for the '{@link solution.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.LinkImpl
		 * @see solution.impl.SolutionPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '{@link solution.impl.NonContextualLinkImpl <em>Non Contextual Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.NonContextualLinkImpl
		 * @see solution.impl.SolutionPackageImpl#getNonContextualLink()
		 * @generated
		 */
		EClass NON_CONTEXTUAL_LINK = eINSTANCE.getNonContextualLink();

		/**
		 * The meta object literal for the '{@link solution.impl.ContextualLinkImpl <em>Contextual Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.ContextualLinkImpl
		 * @see solution.impl.SolutionPackageImpl#getContextualLink()
		 * @generated
		 */
		EClass CONTEXTUAL_LINK = eINSTANCE.getContextualLink();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_LINK__INFORMATION = eINSTANCE.getContextualLink_Information();

		/**
		 * The meta object literal for the '{@link solution.impl.EditablePageImpl <em>Editable Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.impl.EditablePageImpl
		 * @see solution.impl.SolutionPackageImpl#getEditablePage()
		 * @generated
		 */
		EClass EDITABLE_PAGE = eINSTANCE.getEditablePage();

		/**
		 * The meta object literal for the '<em><b>Return Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITABLE_PAGE__RETURN_PAGE = eINSTANCE.getEditablePage_ReturnPage();

		/**
		 * The meta object literal for the '{@link solution.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see solution.DataType
		 * @see solution.impl.SolutionPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //SolutionPackage
