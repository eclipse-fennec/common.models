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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_OrgUnit;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Org Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrgUnitImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OrgUnitImpl extends CIM_OrganizationalEntityImpl implements CIM_OrgUnit {
	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected String businessCategory = BUSINESS_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacsimileTelephoneNumber() <em>Facsimile Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FACSIMILE_TELEPHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacsimileTelephoneNumber() <em>Facsimile Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String facsimileTelephoneNumber = FACSIMILE_TELEPHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalityName() <em>Locality Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalityName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalityName() <em>Locality Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalityName()
	 * @generated
	 * @ordered
	 */
	protected String localityName = LOCALITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOU() <em>OU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOU()
	 * @generated
	 * @ordered
	 */
	protected static final String OU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOU() <em>OU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOU()
	 * @generated
	 * @ordered
	 */
	protected String ou = OU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPostalAddress() <em>Postal Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> postalAddress;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_OR_PROVINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected String stateOrProvince = STATE_OR_PROVINCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String telephoneNumber = TELEPHONE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OrgUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OrgUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORG_UNIT__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORG_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBusinessCategory() {
		return businessCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusinessCategory(String newBusinessCategory) {
		String oldBusinessCategory = businessCategory;
		businessCategory = newBusinessCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORG_UNIT__BUSINESS_CATEGORY, oldBusinessCategory, businessCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacsimileTelephoneNumber() {
		return facsimileTelephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacsimileTelephoneNumber(String newFacsimileTelephoneNumber) {
		String oldFacsimileTelephoneNumber = facsimileTelephoneNumber;
		facsimileTelephoneNumber = newFacsimileTelephoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORG_UNIT__FACSIMILE_TELEPHONE_NUMBER, oldFacsimileTelephoneNumber, facsimileTelephoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalityName() {
		return localityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalityName(String newLocalityName) {
		String oldLocalityName = localityName;
		localityName = newLocalityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORG_UNIT__LOCALITY_NAME, oldLocalityName, localityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOU() {
		return ou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOU(String newOU) {
		String oldOU = ou;
		ou = newOU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORG_UNIT__OU, oldOU, ou));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPostalAddress() {
		if (postalAddress == null) {
			postalAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ORG_UNIT__POSTAL_ADDRESS);
		}
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORG_UNIT__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateOrProvince() {
		return stateOrProvince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateOrProvince(String newStateOrProvince) {
		String oldStateOrProvince = stateOrProvince;
		stateOrProvince = newStateOrProvince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORG_UNIT__STATE_OR_PROVINCE, oldStateOrProvince, stateOrProvince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelephoneNumber(String newTelephoneNumber) {
		String oldTelephoneNumber = telephoneNumber;
		telephoneNumber = newTelephoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORG_UNIT__TELEPHONE_NUMBER, oldTelephoneNumber, telephoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ORG_UNIT__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_ORG_UNIT__NAME:
				return getName();
			case CimPackage.CIM_ORG_UNIT__BUSINESS_CATEGORY:
				return getBusinessCategory();
			case CimPackage.CIM_ORG_UNIT__FACSIMILE_TELEPHONE_NUMBER:
				return getFacsimileTelephoneNumber();
			case CimPackage.CIM_ORG_UNIT__LOCALITY_NAME:
				return getLocalityName();
			case CimPackage.CIM_ORG_UNIT__OU:
				return getOU();
			case CimPackage.CIM_ORG_UNIT__POSTAL_ADDRESS:
				return getPostalAddress();
			case CimPackage.CIM_ORG_UNIT__POSTAL_CODE:
				return getPostalCode();
			case CimPackage.CIM_ORG_UNIT__STATE_OR_PROVINCE:
				return getStateOrProvince();
			case CimPackage.CIM_ORG_UNIT__TELEPHONE_NUMBER:
				return getTelephoneNumber();
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
			case CimPackage.CIM_ORG_UNIT__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ORG_UNIT__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_ORG_UNIT__BUSINESS_CATEGORY:
				setBusinessCategory((String)newValue);
				return;
			case CimPackage.CIM_ORG_UNIT__FACSIMILE_TELEPHONE_NUMBER:
				setFacsimileTelephoneNumber((String)newValue);
				return;
			case CimPackage.CIM_ORG_UNIT__LOCALITY_NAME:
				setLocalityName((String)newValue);
				return;
			case CimPackage.CIM_ORG_UNIT__OU:
				setOU((String)newValue);
				return;
			case CimPackage.CIM_ORG_UNIT__POSTAL_ADDRESS:
				getPostalAddress().clear();
				getPostalAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ORG_UNIT__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case CimPackage.CIM_ORG_UNIT__STATE_OR_PROVINCE:
				setStateOrProvince((String)newValue);
				return;
			case CimPackage.CIM_ORG_UNIT__TELEPHONE_NUMBER:
				setTelephoneNumber((String)newValue);
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
			case CimPackage.CIM_ORG_UNIT__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ORG_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ORG_UNIT__BUSINESS_CATEGORY:
				setBusinessCategory(BUSINESS_CATEGORY_EDEFAULT);
				return;
			case CimPackage.CIM_ORG_UNIT__FACSIMILE_TELEPHONE_NUMBER:
				setFacsimileTelephoneNumber(FACSIMILE_TELEPHONE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_ORG_UNIT__LOCALITY_NAME:
				setLocalityName(LOCALITY_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ORG_UNIT__OU:
				setOU(OU_EDEFAULT);
				return;
			case CimPackage.CIM_ORG_UNIT__POSTAL_ADDRESS:
				getPostalAddress().clear();
				return;
			case CimPackage.CIM_ORG_UNIT__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_ORG_UNIT__STATE_OR_PROVINCE:
				setStateOrProvince(STATE_OR_PROVINCE_EDEFAULT);
				return;
			case CimPackage.CIM_ORG_UNIT__TELEPHONE_NUMBER:
				setTelephoneNumber(TELEPHONE_NUMBER_EDEFAULT);
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
			case CimPackage.CIM_ORG_UNIT__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_ORG_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_ORG_UNIT__BUSINESS_CATEGORY:
				return BUSINESS_CATEGORY_EDEFAULT == null ? businessCategory != null : !BUSINESS_CATEGORY_EDEFAULT.equals(businessCategory);
			case CimPackage.CIM_ORG_UNIT__FACSIMILE_TELEPHONE_NUMBER:
				return FACSIMILE_TELEPHONE_NUMBER_EDEFAULT == null ? facsimileTelephoneNumber != null : !FACSIMILE_TELEPHONE_NUMBER_EDEFAULT.equals(facsimileTelephoneNumber);
			case CimPackage.CIM_ORG_UNIT__LOCALITY_NAME:
				return LOCALITY_NAME_EDEFAULT == null ? localityName != null : !LOCALITY_NAME_EDEFAULT.equals(localityName);
			case CimPackage.CIM_ORG_UNIT__OU:
				return OU_EDEFAULT == null ? ou != null : !OU_EDEFAULT.equals(ou);
			case CimPackage.CIM_ORG_UNIT__POSTAL_ADDRESS:
				return postalAddress != null && !postalAddress.isEmpty();
			case CimPackage.CIM_ORG_UNIT__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case CimPackage.CIM_ORG_UNIT__STATE_OR_PROVINCE:
				return STATE_OR_PROVINCE_EDEFAULT == null ? stateOrProvince != null : !STATE_OR_PROVINCE_EDEFAULT.equals(stateOrProvince);
			case CimPackage.CIM_ORG_UNIT__TELEPHONE_NUMBER:
				return TELEPHONE_NUMBER_EDEFAULT == null ? telephoneNumber != null : !TELEPHONE_NUMBER_EDEFAULT.equals(telephoneNumber);
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
		result.append(" (CreationClassName: ");
		result.append(creationClassName);
		result.append(", Name: ");
		result.append(name);
		result.append(", BusinessCategory: ");
		result.append(businessCategory);
		result.append(", FacsimileTelephoneNumber: ");
		result.append(facsimileTelephoneNumber);
		result.append(", LocalityName: ");
		result.append(localityName);
		result.append(", OU: ");
		result.append(ou);
		result.append(", PostalAddress: ");
		result.append(postalAddress);
		result.append(", PostalCode: ");
		result.append(postalCode);
		result.append(", StateOrProvince: ");
		result.append(stateOrProvince);
		result.append(", TelephoneNumber: ");
		result.append(telephoneNumber);
		result.append(')');
		return result.toString();
	}

} //CIM_OrgUnitImpl
