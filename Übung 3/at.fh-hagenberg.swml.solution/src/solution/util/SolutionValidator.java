/**
 */
package solution.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import solution.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see solution.SolutionPackage
 * @generated
 */
public class SolutionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SolutionValidator INSTANCE = new SolutionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "solution";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SolutionPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SolutionPackage.WEB_APPLICATION:
				return validateWebApplication((WebApplication)value, diagnostics, context);
			case SolutionPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case SolutionPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case SolutionPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case SolutionPackage.WEB_PAGE:
				return validateWebPage((WebPage)value, diagnostics, context);
			case SolutionPackage.STATIC_PAGE:
				return validateStaticPage((StaticPage)value, diagnostics, context);
			case SolutionPackage.DYNAMIC_PAGE:
				return validateDynamicPage((DynamicPage)value, diagnostics, context);
			case SolutionPackage.ENTITY_PAGE:
				return validateEntityPage((EntityPage)value, diagnostics, context);
			case SolutionPackage.INDEX_PAGE:
				return validateIndexPage((IndexPage)value, diagnostics, context);
			case SolutionPackage.CREATE_PAGE:
				return validateCreatePage((CreatePage)value, diagnostics, context);
			case SolutionPackage.UPDATE_PAGE:
				return validateUpdatePage((UpdatePage)value, diagnostics, context);
			case SolutionPackage.DELETE_PAGE:
				return validateDeletePage((DeletePage)value, diagnostics, context);
			case SolutionPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case SolutionPackage.NON_CONTEXTUAL_LINK:
				return validateNonContextualLink((NonContextualLink)value, diagnostics, context);
			case SolutionPackage.CONTEXTUAL_LINK:
				return validateContextualLink((ContextualLink)value, diagnostics, context);
			case SolutionPackage.EDITABLE_PAGE:
				return validateEditablePage((EditablePage)value, diagnostics, context);
			case SolutionPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebApplication(WebApplication webApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(webApplication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebApplication_mustHaveName(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebApplication_uniqueEntities(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebApplication_pageForEntity(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebApplication_singleHomePage(webApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebApplication_checkDate(webApplication, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveName constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_APPLICATION__MUST_HAVE_NAME__EEXPRESSION = "not self.name.oclIsUndefined() and name <>''";

	/**
	 * Validates the mustHaveName constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebApplication_mustHaveName(WebApplication webApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolutionPackage.Literals.WEB_APPLICATION,
				 webApplication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustHaveName",
				 WEB_APPLICATION__MUST_HAVE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueEntities constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_APPLICATION__UNIQUE_ENTITIES__EEXPRESSION = "self.entities->forAll(e1 : Entity, e2 : Entity | e1 <> e2 implies e1.name <> e2.name)";

	/**
	 * Validates the uniqueEntities constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebApplication_uniqueEntities(WebApplication webApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolutionPackage.Literals.WEB_APPLICATION,
				 webApplication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueEntities",
				 WEB_APPLICATION__UNIQUE_ENTITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the pageForEntity constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_APPLICATION__PAGE_FOR_ENTITY__EEXPRESSION = "DynamicPage.allInstances()->collect(entity)->asSet() = Entity.allInstances()";

	/**
	 * Validates the pageForEntity constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebApplication_pageForEntity(WebApplication webApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolutionPackage.Literals.WEB_APPLICATION,
				 webApplication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "pageForEntity",
				 WEB_APPLICATION__PAGE_FOR_ENTITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the singleHomePage constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_APPLICATION__SINGLE_HOME_PAGE__EEXPRESSION = "webpages->collect(homeLink.target)->forAll(p | p = self.homePage)";

	/**
	 * Validates the singleHomePage constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebApplication_singleHomePage(WebApplication webApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolutionPackage.Literals.WEB_APPLICATION,
				 webApplication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "singleHomePage",
				 WEB_APPLICATION__SINGLE_HOME_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkDate constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_APPLICATION__CHECK_DATE__EEXPRESSION = "creationDateBeforeGoLive()";

	/**
	 * Validates the checkDate constraint of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebApplication_checkDate(WebApplication webApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolutionPackage.Literals.WEB_APPLICATION,
				 webApplication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkDate",
				 WEB_APPLICATION__CHECK_DATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_uniqueAttributes(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueAttributes constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__UNIQUE_ATTRIBUTES__EEXPRESSION = "self.attributes->forAll(a1 : Attribute, a2 : Attribute | a1 <> a2 implies a1.name <> a2.name)";

	/**
	 * Validates the uniqueAttributes constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_uniqueAttributes(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolutionPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueAttributes",
				 ENTITY__UNIQUE_ATTRIBUTES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebPage(WebPage webPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(webPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_staticPageLinkTarget(webPage, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the staticPageLinkTarget constraint of '<em>Web Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_PAGE__STATIC_PAGE_LINK_TARGET__EEXPRESSION = "self.homeLink.target.oclIsTypeOf(StaticPage)";

	/**
	 * Validates the staticPageLinkTarget constraint of '<em>Web Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebPage_staticPageLinkTarget(WebPage webPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolutionPackage.Literals.WEB_PAGE,
				 webPage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "staticPageLinkTarget",
				 WEB_PAGE__STATIC_PAGE_LINK_TARGET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticPage(StaticPage staticPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_staticPageLinkTarget(staticPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicPage(DynamicPage dynamicPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamicPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_staticPageLinkTarget(dynamicPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityPage(EntityPage entityPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entityPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entityPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entityPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entityPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entityPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entityPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entityPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entityPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entityPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_staticPageLinkTarget(entityPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexPage(IndexPage indexPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(indexPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(indexPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(indexPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(indexPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(indexPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(indexPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(indexPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(indexPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(indexPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_staticPageLinkTarget(indexPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreatePage(CreatePage createPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_staticPageLinkTarget(createPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdatePage(UpdatePage updatePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(updatePage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(updatePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(updatePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(updatePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(updatePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(updatePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(updatePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(updatePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(updatePage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_staticPageLinkTarget(updatePage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeletePage(DeletePage deletePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deletePage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deletePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deletePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deletePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deletePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deletePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deletePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deletePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deletePage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_staticPageLinkTarget(deletePage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonContextualLink(NonContextualLink nonContextualLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonContextualLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextualLink(ContextualLink contextualLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextualLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditablePage(EditablePage editablePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(editablePage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(editablePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(editablePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(editablePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(editablePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(editablePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(editablePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(editablePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(editablePage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_staticPageLinkTarget(editablePage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SolutionValidator
