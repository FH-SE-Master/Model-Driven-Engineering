/**
 */
package solution.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import solution.Entity;
import solution.SolutionPackage;
import solution.StaticPage;
import solution.WebApplication;
import solution.WebPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link solution.impl.WebApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link solution.impl.WebApplicationImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link solution.impl.WebApplicationImpl#getWebpages <em>Webpages</em>}</li>
 *   <li>{@link solution.impl.WebApplicationImpl#getHomePage <em>Home Page</em>}</li>
 *   <li>{@link solution.impl.WebApplicationImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link solution.impl.WebApplicationImpl#getGoLiveDate <em>Go Live Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebApplicationImpl extends MinimalEObjectImpl.Container implements WebApplication {
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
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getWebpages() <em>Webpages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebpages()
	 * @generated
	 * @ordered
	 */
	protected EList<WebPage> webpages;

	/**
	 * The cached value of the '{@link #getHomePage() <em>Home Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePage()
	 * @generated
	 * @ordered
	 */
	protected StaticPage homePage;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoLiveDate() <em>Go Live Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoLiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date GO_LIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoLiveDate() <em>Go Live Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoLiveDate()
	 * @generated
	 * @ordered
	 */
	protected Date goLiveDate = GO_LIVE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolutionPackage.Literals.WEB_APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.WEB_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, SolutionPackage.WEB_APPLICATION__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebPage> getWebpages() {
		if (webpages == null) {
			webpages = new EObjectContainmentEList<WebPage>(WebPage.class, this, SolutionPackage.WEB_APPLICATION__WEBPAGES);
		}
		return webpages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticPage getHomePage() {
		if (homePage != null && homePage.eIsProxy()) {
			InternalEObject oldHomePage = (InternalEObject)homePage;
			homePage = (StaticPage)eResolveProxy(oldHomePage);
			if (homePage != oldHomePage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolutionPackage.WEB_APPLICATION__HOME_PAGE, oldHomePage, homePage));
			}
		}
		return homePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticPage basicGetHomePage() {
		return homePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomePage(StaticPage newHomePage) {
		StaticPage oldHomePage = homePage;
		homePage = newHomePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.WEB_APPLICATION__HOME_PAGE, oldHomePage, homePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.WEB_APPLICATION__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getGoLiveDate() {
		return goLiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoLiveDate(Date newGoLiveDate) {
		Date oldGoLiveDate = goLiveDate;
		goLiveDate = newGoLiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.WEB_APPLICATION__GO_LIVE_DATE, oldGoLiveDate, goLiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean creationDateBeforeGoLive() {
		return this.creationDate.before(this.goLiveDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolutionPackage.WEB_APPLICATION__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case SolutionPackage.WEB_APPLICATION__WEBPAGES:
				return ((InternalEList<?>)getWebpages()).basicRemove(otherEnd, msgs);
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
			case SolutionPackage.WEB_APPLICATION__NAME:
				return getName();
			case SolutionPackage.WEB_APPLICATION__ENTITIES:
				return getEntities();
			case SolutionPackage.WEB_APPLICATION__WEBPAGES:
				return getWebpages();
			case SolutionPackage.WEB_APPLICATION__HOME_PAGE:
				if (resolve) return getHomePage();
				return basicGetHomePage();
			case SolutionPackage.WEB_APPLICATION__CREATION_DATE:
				return getCreationDate();
			case SolutionPackage.WEB_APPLICATION__GO_LIVE_DATE:
				return getGoLiveDate();
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
			case SolutionPackage.WEB_APPLICATION__NAME:
				setName((String)newValue);
				return;
			case SolutionPackage.WEB_APPLICATION__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case SolutionPackage.WEB_APPLICATION__WEBPAGES:
				getWebpages().clear();
				getWebpages().addAll((Collection<? extends WebPage>)newValue);
				return;
			case SolutionPackage.WEB_APPLICATION__HOME_PAGE:
				setHomePage((StaticPage)newValue);
				return;
			case SolutionPackage.WEB_APPLICATION__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case SolutionPackage.WEB_APPLICATION__GO_LIVE_DATE:
				setGoLiveDate((Date)newValue);
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
			case SolutionPackage.WEB_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SolutionPackage.WEB_APPLICATION__ENTITIES:
				getEntities().clear();
				return;
			case SolutionPackage.WEB_APPLICATION__WEBPAGES:
				getWebpages().clear();
				return;
			case SolutionPackage.WEB_APPLICATION__HOME_PAGE:
				setHomePage((StaticPage)null);
				return;
			case SolutionPackage.WEB_APPLICATION__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case SolutionPackage.WEB_APPLICATION__GO_LIVE_DATE:
				setGoLiveDate(GO_LIVE_DATE_EDEFAULT);
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
			case SolutionPackage.WEB_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SolutionPackage.WEB_APPLICATION__ENTITIES:
				return entities != null && !entities.isEmpty();
			case SolutionPackage.WEB_APPLICATION__WEBPAGES:
				return webpages != null && !webpages.isEmpty();
			case SolutionPackage.WEB_APPLICATION__HOME_PAGE:
				return homePage != null;
			case SolutionPackage.WEB_APPLICATION__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case SolutionPackage.WEB_APPLICATION__GO_LIVE_DATE:
				return GO_LIVE_DATE_EDEFAULT == null ? goLiveDate != null : !GO_LIVE_DATE_EDEFAULT.equals(goLiveDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolutionPackage.WEB_APPLICATION___CREATION_DATE_BEFORE_GO_LIVE:
				return creationDateBeforeGoLive();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", goLiveDate: ");
		result.append(goLiveDate);
		result.append(')');
		return result.toString();
	}

} //WebApplicationImpl
