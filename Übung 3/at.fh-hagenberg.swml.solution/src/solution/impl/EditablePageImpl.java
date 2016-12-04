/**
 */
package solution.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import solution.EditablePage;
import solution.EntityPage;
import solution.SolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editable Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link solution.impl.EditablePageImpl#getReturnPage <em>Return Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EditablePageImpl extends EntityPageImpl implements EditablePage {
	/**
	 * The cached value of the '{@link #getReturnPage() <em>Return Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnPage()
	 * @generated
	 * @ordered
	 */
	protected EntityPage returnPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditablePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolutionPackage.Literals.EDITABLE_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPage getReturnPage() {
		if (returnPage != null && returnPage.eIsProxy()) {
			InternalEObject oldReturnPage = (InternalEObject)returnPage;
			returnPage = (EntityPage)eResolveProxy(oldReturnPage);
			if (returnPage != oldReturnPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolutionPackage.EDITABLE_PAGE__RETURN_PAGE, oldReturnPage, returnPage));
			}
		}
		return returnPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPage basicGetReturnPage() {
		return returnPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnPage(EntityPage newReturnPage) {
		EntityPage oldReturnPage = returnPage;
		returnPage = newReturnPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.EDITABLE_PAGE__RETURN_PAGE, oldReturnPage, returnPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolutionPackage.EDITABLE_PAGE__RETURN_PAGE:
				if (resolve) return getReturnPage();
				return basicGetReturnPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolutionPackage.EDITABLE_PAGE__RETURN_PAGE:
				setReturnPage((EntityPage)newValue);
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
			case SolutionPackage.EDITABLE_PAGE__RETURN_PAGE:
				setReturnPage((EntityPage)null);
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
			case SolutionPackage.EDITABLE_PAGE__RETURN_PAGE:
				return returnPage != null;
		}
		return super.eIsSet(featureID);
	}

} //EditablePageImpl
