/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.LeveragedAuthorization;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leveraged Authorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.LeveragedAuthorizationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.LeveragedAuthorizationImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.LeveragedAuthorizationImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.LeveragedAuthorizationImpl#getPartyUuid <em>Party Uuid</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.LeveragedAuthorizationImpl#getDateAuthorized <em>Date Authorized</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.LeveragedAuthorizationImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.LeveragedAuthorizationImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeveragedAuthorizationImpl extends MinimalEObjectImpl.Container implements LeveragedAuthorization {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The default value of the '{@link #getPartyUuid() <em>Party Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyUuid() <em>Party Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyUuid()
	 * @generated
	 * @ordered
	 */
	protected String partyUuid = PARTY_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateAuthorized() <em>Date Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAuthorized()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_AUTHORIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAuthorized() <em>Date Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAuthorized()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateAuthorized = DATE_AUTHORIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeveragedAuthorizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getLeveragedAuthorization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.LEVERAGED_AUTHORIZATION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.LEVERAGED_AUTHORIZATION__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.LEVERAGED_AUTHORIZATION__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyUuid() {
		return partyUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyUuid(String newPartyUuid) {
		String oldPartyUuid = partyUuid;
		partyUuid = newPartyUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.LEVERAGED_AUTHORIZATION__PARTY_UUID, oldPartyUuid, partyUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDateAuthorized() {
		return dateAuthorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateAuthorized(XMLGregorianCalendar newDateAuthorized) {
		XMLGregorianCalendar oldDateAuthorized = dateAuthorized;
		dateAuthorized = newDateAuthorized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.LEVERAGED_AUTHORIZATION__DATE_AUTHORIZED, oldDateAuthorized, dateAuthorized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.LEVERAGED_AUTHORIZATION__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.LEVERAGED_AUTHORIZATION__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.LEVERAGED_AUTHORIZATION__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.LEVERAGED_AUTHORIZATION__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.LEVERAGED_AUTHORIZATION__TITLE:
				return getTitle();
			case OSCALPackage.LEVERAGED_AUTHORIZATION__PROP:
				return getProp();
			case OSCALPackage.LEVERAGED_AUTHORIZATION__LINK:
				return getLink();
			case OSCALPackage.LEVERAGED_AUTHORIZATION__PARTY_UUID:
				return getPartyUuid();
			case OSCALPackage.LEVERAGED_AUTHORIZATION__DATE_AUTHORIZED:
				return getDateAuthorized();
			case OSCALPackage.LEVERAGED_AUTHORIZATION__REMARKS:
				return getRemarks();
			case OSCALPackage.LEVERAGED_AUTHORIZATION__UUID:
				return getUuid();
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
			case OSCALPackage.LEVERAGED_AUTHORIZATION__TITLE:
				setTitle((String)newValue);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__PARTY_UUID:
				setPartyUuid((String)newValue);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__DATE_AUTHORIZED:
				setDateAuthorized((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__UUID:
				setUuid((String)newValue);
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
			case OSCALPackage.LEVERAGED_AUTHORIZATION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__PROP:
				getProp().clear();
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__LINK:
				getLink().clear();
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__PARTY_UUID:
				setPartyUuid(PARTY_UUID_EDEFAULT);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__DATE_AUTHORIZED:
				setDateAuthorized(DATE_AUTHORIZED_EDEFAULT);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.LEVERAGED_AUTHORIZATION__UUID:
				setUuid(UUID_EDEFAULT);
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
			case OSCALPackage.LEVERAGED_AUTHORIZATION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OSCALPackage.LEVERAGED_AUTHORIZATION__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.LEVERAGED_AUTHORIZATION__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.LEVERAGED_AUTHORIZATION__PARTY_UUID:
				return PARTY_UUID_EDEFAULT == null ? partyUuid != null : !PARTY_UUID_EDEFAULT.equals(partyUuid);
			case OSCALPackage.LEVERAGED_AUTHORIZATION__DATE_AUTHORIZED:
				return DATE_AUTHORIZED_EDEFAULT == null ? dateAuthorized != null : !DATE_AUTHORIZED_EDEFAULT.equals(dateAuthorized);
			case OSCALPackage.LEVERAGED_AUTHORIZATION__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.LEVERAGED_AUTHORIZATION__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", partyUuid: ");
		result.append(partyUuid);
		result.append(", dateAuthorized: ");
		result.append(dateAuthorized);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //LeveragedAuthorizationImpl
