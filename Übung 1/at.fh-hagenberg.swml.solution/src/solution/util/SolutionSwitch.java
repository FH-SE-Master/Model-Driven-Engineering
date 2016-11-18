/**
 */
package solution.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import solution.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see solution.SolutionPackage
 * @generated
 */
public class SolutionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SolutionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionSwitch() {
		if (modelPackage == null) {
			modelPackage = SolutionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SolutionPackage.WEB_APPLICATION: {
				WebApplication webApplication = (WebApplication)theEObject;
				T result = caseWebApplication(webApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.WEB_PAGE: {
				WebPage webPage = (WebPage)theEObject;
				T result = caseWebPage(webPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.STATIC_PAGE: {
				StaticPage staticPage = (StaticPage)theEObject;
				T result = caseStaticPage(staticPage);
				if (result == null) result = caseWebPage(staticPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.DYNAMIC_PAGE: {
				DynamicPage dynamicPage = (DynamicPage)theEObject;
				T result = caseDynamicPage(dynamicPage);
				if (result == null) result = caseWebPage(dynamicPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.ENTITY_PAGE: {
				EntityPage entityPage = (EntityPage)theEObject;
				T result = caseEntityPage(entityPage);
				if (result == null) result = caseDynamicPage(entityPage);
				if (result == null) result = caseWebPage(entityPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.INDEX_PAGE: {
				IndexPage indexPage = (IndexPage)theEObject;
				T result = caseIndexPage(indexPage);
				if (result == null) result = caseDynamicPage(indexPage);
				if (result == null) result = caseWebPage(indexPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.CREATE_PAGE: {
				CreatePage createPage = (CreatePage)theEObject;
				T result = caseCreatePage(createPage);
				if (result == null) result = caseEditablePage(createPage);
				if (result == null) result = caseEntityPage(createPage);
				if (result == null) result = caseDynamicPage(createPage);
				if (result == null) result = caseWebPage(createPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.UPDATE_PAGE: {
				UpdatePage updatePage = (UpdatePage)theEObject;
				T result = caseUpdatePage(updatePage);
				if (result == null) result = caseEditablePage(updatePage);
				if (result == null) result = caseEntityPage(updatePage);
				if (result == null) result = caseDynamicPage(updatePage);
				if (result == null) result = caseWebPage(updatePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.DELETE_PAGE: {
				DeletePage deletePage = (DeletePage)theEObject;
				T result = caseDeletePage(deletePage);
				if (result == null) result = caseEditablePage(deletePage);
				if (result == null) result = caseEntityPage(deletePage);
				if (result == null) result = caseDynamicPage(deletePage);
				if (result == null) result = caseWebPage(deletePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.NON_CONTEXTUAL_LINK: {
				NonContextualLink nonContextualLink = (NonContextualLink)theEObject;
				T result = caseNonContextualLink(nonContextualLink);
				if (result == null) result = caseLink(nonContextualLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.CONTEXTUAL_LINK: {
				ContextualLink contextualLink = (ContextualLink)theEObject;
				T result = caseContextualLink(contextualLink);
				if (result == null) result = caseLink(contextualLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolutionPackage.EDITABLE_PAGE: {
				EditablePage editablePage = (EditablePage)theEObject;
				T result = caseEditablePage(editablePage);
				if (result == null) result = caseEntityPage(editablePage);
				if (result == null) result = caseDynamicPage(editablePage);
				if (result == null) result = caseWebPage(editablePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebApplication(WebApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebPage(WebPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticPage(StaticPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicPage(DynamicPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityPage(EntityPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexPage(IndexPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreatePage(CreatePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatePage(UpdatePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletePage(DeletePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Contextual Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Contextual Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonContextualLink(NonContextualLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextual Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextual Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualLink(ContextualLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editable Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editable Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditablePage(EditablePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SolutionSwitch
