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

import gov.nist.csrc.ns.oscal.Address;
import gov.nist.csrc.ns.oscal.ExternalId;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Party;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.TelephoneNumber;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getLocationUuid <em>Location Uuid</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getMemberOfOrganization <em>Member Of Organization</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PartyImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends MinimalEObjectImpl.Container implements Party {
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
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalId() <em>External Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalId> externalId;

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
	 * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> emailAddress;

	/**
	 * The cached value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<TelephoneNumber> telephoneNumber;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> address;

	/**
	 * The cached value of the '{@link #getLocationUuid() <em>Location Uuid</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationUuid()
	 * @generated
	 * @ordered
	 */
	protected EList<String> locationUuid;

	/**
	 * The cached value of the '{@link #getMemberOfOrganization() <em>Member Of Organization</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOfOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<String> memberOfOrganization;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getParty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARTY__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalId> getExternalId() {
		if (externalId == null) {
			externalId = new EObjectContainmentEList<ExternalId>(ExternalId.class, this, OSCALPackage.PARTY__EXTERNAL_ID);
		}
		return externalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.PARTY__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.PARTY__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEmailAddress() {
		if (emailAddress == null) {
			emailAddress = new EDataTypeEList<String>(String.class, this, OSCALPackage.PARTY__EMAIL_ADDRESS);
		}
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TelephoneNumber> getTelephoneNumber() {
		if (telephoneNumber == null) {
			telephoneNumber = new EObjectContainmentEList<TelephoneNumber>(TelephoneNumber.class, this, OSCALPackage.PARTY__TELEPHONE_NUMBER);
		}
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Address> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<Address>(Address.class, this, OSCALPackage.PARTY__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLocationUuid() {
		if (locationUuid == null) {
			locationUuid = new EDataTypeEList<String>(String.class, this, OSCALPackage.PARTY__LOCATION_UUID);
		}
		return locationUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMemberOfOrganization() {
		if (memberOfOrganization == null) {
			memberOfOrganization = new EDataTypeEList<String>(String.class, this, OSCALPackage.PARTY__MEMBER_OF_ORGANIZATION);
		}
		return memberOfOrganization;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARTY__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARTY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARTY__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.PARTY__EXTERNAL_ID:
				return ((InternalEList<?>)getExternalId()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PARTY__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PARTY__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PARTY__TELEPHONE_NUMBER:
				return ((InternalEList<?>)getTelephoneNumber()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PARTY__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.PARTY__NAME:
				return getName();
			case OSCALPackage.PARTY__SHORT_NAME:
				return getShortName();
			case OSCALPackage.PARTY__EXTERNAL_ID:
				return getExternalId();
			case OSCALPackage.PARTY__PROP:
				return getProp();
			case OSCALPackage.PARTY__LINK:
				return getLink();
			case OSCALPackage.PARTY__EMAIL_ADDRESS:
				return getEmailAddress();
			case OSCALPackage.PARTY__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case OSCALPackage.PARTY__ADDRESS:
				return getAddress();
			case OSCALPackage.PARTY__LOCATION_UUID:
				return getLocationUuid();
			case OSCALPackage.PARTY__MEMBER_OF_ORGANIZATION:
				return getMemberOfOrganization();
			case OSCALPackage.PARTY__REMARKS:
				return getRemarks();
			case OSCALPackage.PARTY__TYPE:
				return getType();
			case OSCALPackage.PARTY__UUID:
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
			case OSCALPackage.PARTY__NAME:
				setName((String)newValue);
				return;
			case OSCALPackage.PARTY__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case OSCALPackage.PARTY__EXTERNAL_ID:
				getExternalId().clear();
				getExternalId().addAll((Collection<? extends ExternalId>)newValue);
				return;
			case OSCALPackage.PARTY__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.PARTY__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.PARTY__EMAIL_ADDRESS:
				getEmailAddress().clear();
				getEmailAddress().addAll((Collection<? extends String>)newValue);
				return;
			case OSCALPackage.PARTY__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				getTelephoneNumber().addAll((Collection<? extends TelephoneNumber>)newValue);
				return;
			case OSCALPackage.PARTY__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends Address>)newValue);
				return;
			case OSCALPackage.PARTY__LOCATION_UUID:
				getLocationUuid().clear();
				getLocationUuid().addAll((Collection<? extends String>)newValue);
				return;
			case OSCALPackage.PARTY__MEMBER_OF_ORGANIZATION:
				getMemberOfOrganization().clear();
				getMemberOfOrganization().addAll((Collection<? extends String>)newValue);
				return;
			case OSCALPackage.PARTY__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.PARTY__TYPE:
				setType((String)newValue);
				return;
			case OSCALPackage.PARTY__UUID:
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
			case OSCALPackage.PARTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OSCALPackage.PARTY__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case OSCALPackage.PARTY__EXTERNAL_ID:
				getExternalId().clear();
				return;
			case OSCALPackage.PARTY__PROP:
				getProp().clear();
				return;
			case OSCALPackage.PARTY__LINK:
				getLink().clear();
				return;
			case OSCALPackage.PARTY__EMAIL_ADDRESS:
				getEmailAddress().clear();
				return;
			case OSCALPackage.PARTY__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				return;
			case OSCALPackage.PARTY__ADDRESS:
				getAddress().clear();
				return;
			case OSCALPackage.PARTY__LOCATION_UUID:
				getLocationUuid().clear();
				return;
			case OSCALPackage.PARTY__MEMBER_OF_ORGANIZATION:
				getMemberOfOrganization().clear();
				return;
			case OSCALPackage.PARTY__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.PARTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OSCALPackage.PARTY__UUID:
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
			case OSCALPackage.PARTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OSCALPackage.PARTY__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case OSCALPackage.PARTY__EXTERNAL_ID:
				return externalId != null && !externalId.isEmpty();
			case OSCALPackage.PARTY__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.PARTY__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.PARTY__EMAIL_ADDRESS:
				return emailAddress != null && !emailAddress.isEmpty();
			case OSCALPackage.PARTY__TELEPHONE_NUMBER:
				return telephoneNumber != null && !telephoneNumber.isEmpty();
			case OSCALPackage.PARTY__ADDRESS:
				return address != null && !address.isEmpty();
			case OSCALPackage.PARTY__LOCATION_UUID:
				return locationUuid != null && !locationUuid.isEmpty();
			case OSCALPackage.PARTY__MEMBER_OF_ORGANIZATION:
				return memberOfOrganization != null && !memberOfOrganization.isEmpty();
			case OSCALPackage.PARTY__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.PARTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OSCALPackage.PARTY__UUID:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", emailAddress: ");
		result.append(emailAddress);
		result.append(", locationUuid: ");
		result.append(locationUuid);
		result.append(", memberOfOrganization: ");
		result.append(memberOfOrganization);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", type: ");
		result.append(type);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //PartyImpl
