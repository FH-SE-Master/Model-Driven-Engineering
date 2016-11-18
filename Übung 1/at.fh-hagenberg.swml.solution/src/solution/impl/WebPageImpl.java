/**
 */
package solution.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import solution.Link;
import solution.NonContextualLink;
import solution.SolutionPackage;
import solution.WebPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link solution.impl.WebPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link solution.impl.WebPageImpl#getRelativeUrl <em>Relative Url</em>}</li>
 *   <li>{@link solution.impl.WebPageImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link solution.impl.WebPageImpl#getHomeLink <em>Home Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WebPageImpl extends MinimalEObjectImpl.Container implements WebPage {
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
	 * The default value of the '{@link #getRelativeUrl() <em>Relative Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIVE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativeUrl() <em>Relative Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeUrl()
	 * @generated
	 * @ordered
	 */
	protected String relativeUrl = RELATIVE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getHomeLink() <em>Home Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeLink()
	 * @generated
	 * @ordered
	 */
	protected NonContextualLink homeLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolutionPackage.Literals.WEB_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.WEB_PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelativeUrl() {
		return relativeUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeUrl(String newRelativeUrl) {
		String oldRelativeUrl = relativeUrl;
		relativeUrl = newRelativeUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.WEB_PAGE__RELATIVE_URL, oldRelativeUrl, relativeUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, SolutionPackage.WEB_PAGE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonContextualLink getHomeLink() {
		return homeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHomeLink(NonContextualLink newHomeLink, NotificationChain msgs) {
		NonContextualLink oldHomeLink = homeLink;
		homeLink = newHomeLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolutionPackage.WEB_PAGE__HOME_LINK, oldHomeLink, newHomeLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeLink(NonContextualLink newHomeLink) {
		if (newHomeLink != homeLink) {
			NotificationChain msgs = null;
			if (homeLink != null)
				msgs = ((InternalEObject)homeLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolutionPackage.WEB_PAGE__HOME_LINK, null, msgs);
			if (newHomeLink != null)
				msgs = ((InternalEObject)newHomeLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolutionPackage.WEB_PAGE__HOME_LINK, null, msgs);
			msgs = basicSetHomeLink(newHomeLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.WEB_PAGE__HOME_LINK, newHomeLink, newHomeLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolutionPackage.WEB_PAGE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case SolutionPackage.WEB_PAGE__HOME_LINK:
				return basicSetHomeLink(null, msgs);
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
			case SolutionPackage.WEB_PAGE__NAME:
				return getName();
			case SolutionPackage.WEB_PAGE__RELATIVE_URL:
				return getRelativeUrl();
			case SolutionPackage.WEB_PAGE__LINKS:
				return getLinks();
			case SolutionPackage.WEB_PAGE__HOME_LINK:
				return getHomeLink();
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
			case SolutionPackage.WEB_PAGE__NAME:
				setName((String)newValue);
				return;
			case SolutionPackage.WEB_PAGE__RELATIVE_URL:
				setRelativeUrl((String)newValue);
				return;
			case SolutionPackage.WEB_PAGE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case SolutionPackage.WEB_PAGE__HOME_LINK:
				setHomeLink((NonContextualLink)newValue);
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
			case SolutionPackage.WEB_PAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SolutionPackage.WEB_PAGE__RELATIVE_URL:
				setRelativeUrl(RELATIVE_URL_EDEFAULT);
				return;
			case SolutionPackage.WEB_PAGE__LINKS:
				getLinks().clear();
				return;
			case SolutionPackage.WEB_PAGE__HOME_LINK:
				setHomeLink((NonContextualLink)null);
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
			case SolutionPackage.WEB_PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SolutionPackage.WEB_PAGE__RELATIVE_URL:
				return RELATIVE_URL_EDEFAULT == null ? relativeUrl != null : !RELATIVE_URL_EDEFAULT.equals(relativeUrl);
			case SolutionPackage.WEB_PAGE__LINKS:
				return links != null && !links.isEmpty();
			case SolutionPackage.WEB_PAGE__HOME_LINK:
				return homeLink != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", relativeUrl: ");
		result.append(relativeUrl);
		result.append(')');
		return result.toString();
	}

} //WebPageImpl
