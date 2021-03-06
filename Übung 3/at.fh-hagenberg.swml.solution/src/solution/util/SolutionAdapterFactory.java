/**
 */
package solution.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import solution.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see solution.SolutionPackage
 * @generated
 */
public class SolutionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SolutionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SolutionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionSwitch<Adapter> modelSwitch =
		new SolutionSwitch<Adapter>() {
			@Override
			public Adapter caseWebApplication(WebApplication object) {
				return createWebApplicationAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseWebPage(WebPage object) {
				return createWebPageAdapter();
			}
			@Override
			public Adapter caseStaticPage(StaticPage object) {
				return createStaticPageAdapter();
			}
			@Override
			public Adapter caseDynamicPage(DynamicPage object) {
				return createDynamicPageAdapter();
			}
			@Override
			public Adapter caseEntityPage(EntityPage object) {
				return createEntityPageAdapter();
			}
			@Override
			public Adapter caseIndexPage(IndexPage object) {
				return createIndexPageAdapter();
			}
			@Override
			public Adapter caseCreatePage(CreatePage object) {
				return createCreatePageAdapter();
			}
			@Override
			public Adapter caseUpdatePage(UpdatePage object) {
				return createUpdatePageAdapter();
			}
			@Override
			public Adapter caseDeletePage(DeletePage object) {
				return createDeletePageAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseNonContextualLink(NonContextualLink object) {
				return createNonContextualLinkAdapter();
			}
			@Override
			public Adapter caseContextualLink(ContextualLink object) {
				return createContextualLinkAdapter();
			}
			@Override
			public Adapter caseEditablePage(EditablePage object) {
				return createEditablePageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link solution.WebApplication <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.WebApplication
	 * @generated
	 */
	public Adapter createWebApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.WebPage
	 * @generated
	 */
	public Adapter createWebPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.StaticPage <em>Static Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.StaticPage
	 * @generated
	 */
	public Adapter createStaticPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.DynamicPage <em>Dynamic Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.DynamicPage
	 * @generated
	 */
	public Adapter createDynamicPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.EntityPage <em>Entity Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.EntityPage
	 * @generated
	 */
	public Adapter createEntityPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.IndexPage <em>Index Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.IndexPage
	 * @generated
	 */
	public Adapter createIndexPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.CreatePage <em>Create Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.CreatePage
	 * @generated
	 */
	public Adapter createCreatePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.UpdatePage <em>Update Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.UpdatePage
	 * @generated
	 */
	public Adapter createUpdatePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.DeletePage <em>Delete Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.DeletePage
	 * @generated
	 */
	public Adapter createDeletePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.NonContextualLink <em>Non Contextual Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.NonContextualLink
	 * @generated
	 */
	public Adapter createNonContextualLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.ContextualLink <em>Contextual Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.ContextualLink
	 * @generated
	 */
	public Adapter createContextualLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link solution.EditablePage <em>Editable Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see solution.EditablePage
	 * @generated
	 */
	public Adapter createEditablePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SolutionAdapterFactory
