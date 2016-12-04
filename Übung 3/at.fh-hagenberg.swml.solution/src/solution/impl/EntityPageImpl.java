/**
 */
package solution.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import solution.DynamicPage;
import solution.EntityPage;
import solution.SolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link solution.impl.EntityPageImpl#getInnerPages <em>Inner Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityPageImpl extends DynamicPageImpl implements EntityPage {
	/**
	 * The cached value of the '{@link #getInnerPages() <em>Inner Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPages()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicPage> innerPages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolutionPackage.Literals.ENTITY_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicPage> getInnerPages() {
		if (innerPages == null) {
			innerPages = new EObjectContainmentEList<DynamicPage>(DynamicPage.class, this, SolutionPackage.ENTITY_PAGE__INNER_PAGES);
		}
		return innerPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolutionPackage.ENTITY_PAGE__INNER_PAGES:
				return ((InternalEList<?>)getInnerPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolutionPackage.ENTITY_PAGE__INNER_PAGES:
				return getInnerPages();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolutionPackage.ENTITY_PAGE__INNER_PAGES:
				getInnerPages().clear();
				getInnerPages().addAll((Collection<? extends DynamicPage>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolutionPackage.ENTITY_PAGE__INNER_PAGES:
				getInnerPages().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolutionPackage.ENTITY_PAGE__INNER_PAGES:
				return innerPages != null && !innerPages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityPageImpl
