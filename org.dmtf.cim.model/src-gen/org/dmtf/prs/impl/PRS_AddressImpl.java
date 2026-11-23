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
package org.dmtf.prs.impl;

import org.dmtf.prs.PRS_Address;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getAddress3 <em>Address3</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getAddress4 <em>Address4</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AddressImpl#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_AddressImpl extends PRS_ExchangeElementImpl implements PRS_Address {
	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected Integer addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected String address1 = ADDRESS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected String address2 = ADDRESS2_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress3() <em>Address3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress3()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress3() <em>Address3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress3()
	 * @generated
	 * @ordered
	 */
	protected String address3 = ADDRESS3_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress4() <em>Address4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress4()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress4() <em>Address4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress4()
	 * @generated
	 * @ordered
	 */
	protected String address4 = ADDRESS4_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

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
	 * The default value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected String timeZone = TIME_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressType(Integer newAddressType) {
		Integer oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress1() {
		return address1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress1(String newAddress1) {
		String oldAddress1 = address1;
		address1 = newAddress1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__ADDRESS1, oldAddress1, address1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress2() {
		return address2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress2(String newAddress2) {
		String oldAddress2 = address2;
		address2 = newAddress2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__ADDRESS2, oldAddress2, address2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress3() {
		return address3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress3(String newAddress3) {
		String oldAddress3 = address3;
		address3 = newAddress3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__ADDRESS3, oldAddress3, address3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress4() {
		return address4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress4(String newAddress4) {
		String oldAddress4 = address4;
		address4 = newAddress4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__ADDRESS4, oldAddress4, address4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__REGION, oldRegion, region));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeZone(String newTimeZone) {
		String oldTimeZone = timeZone;
		timeZone = newTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__TIME_ZONE, oldTimeZone, timeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_ADDRESS__ADDRESS_TYPE:
				return getAddressType();
			case PrsPackage.PRS_ADDRESS__ADDRESS1:
				return getAddress1();
			case PrsPackage.PRS_ADDRESS__ADDRESS2:
				return getAddress2();
			case PrsPackage.PRS_ADDRESS__ADDRESS3:
				return getAddress3();
			case PrsPackage.PRS_ADDRESS__ADDRESS4:
				return getAddress4();
			case PrsPackage.PRS_ADDRESS__CITY:
				return getCity();
			case PrsPackage.PRS_ADDRESS__REGION:
				return getRegion();
			case PrsPackage.PRS_ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case PrsPackage.PRS_ADDRESS__TIME_ZONE:
				return getTimeZone();
			case PrsPackage.PRS_ADDRESS__COUNTRY:
				return getCountry();
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
			case PrsPackage.PRS_ADDRESS__ADDRESS_TYPE:
				setAddressType((Integer)newValue);
				return;
			case PrsPackage.PRS_ADDRESS__ADDRESS1:
				setAddress1((String)newValue);
				return;
			case PrsPackage.PRS_ADDRESS__ADDRESS2:
				setAddress2((String)newValue);
				return;
			case PrsPackage.PRS_ADDRESS__ADDRESS3:
				setAddress3((String)newValue);
				return;
			case PrsPackage.PRS_ADDRESS__ADDRESS4:
				setAddress4((String)newValue);
				return;
			case PrsPackage.PRS_ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case PrsPackage.PRS_ADDRESS__REGION:
				setRegion((String)newValue);
				return;
			case PrsPackage.PRS_ADDRESS__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case PrsPackage.PRS_ADDRESS__TIME_ZONE:
				setTimeZone((String)newValue);
				return;
			case PrsPackage.PRS_ADDRESS__COUNTRY:
				setCountry((String)newValue);
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
			case PrsPackage.PRS_ADDRESS__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
				return;
			case PrsPackage.PRS_ADDRESS__ADDRESS1:
				setAddress1(ADDRESS1_EDEFAULT);
				return;
			case PrsPackage.PRS_ADDRESS__ADDRESS2:
				setAddress2(ADDRESS2_EDEFAULT);
				return;
			case PrsPackage.PRS_ADDRESS__ADDRESS3:
				setAddress3(ADDRESS3_EDEFAULT);
				return;
			case PrsPackage.PRS_ADDRESS__ADDRESS4:
				setAddress4(ADDRESS4_EDEFAULT);
				return;
			case PrsPackage.PRS_ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case PrsPackage.PRS_ADDRESS__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case PrsPackage.PRS_ADDRESS__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case PrsPackage.PRS_ADDRESS__TIME_ZONE:
				setTimeZone(TIME_ZONE_EDEFAULT);
				return;
			case PrsPackage.PRS_ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
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
			case PrsPackage.PRS_ADDRESS__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
			case PrsPackage.PRS_ADDRESS__ADDRESS1:
				return ADDRESS1_EDEFAULT == null ? address1 != null : !ADDRESS1_EDEFAULT.equals(address1);
			case PrsPackage.PRS_ADDRESS__ADDRESS2:
				return ADDRESS2_EDEFAULT == null ? address2 != null : !ADDRESS2_EDEFAULT.equals(address2);
			case PrsPackage.PRS_ADDRESS__ADDRESS3:
				return ADDRESS3_EDEFAULT == null ? address3 != null : !ADDRESS3_EDEFAULT.equals(address3);
			case PrsPackage.PRS_ADDRESS__ADDRESS4:
				return ADDRESS4_EDEFAULT == null ? address4 != null : !ADDRESS4_EDEFAULT.equals(address4);
			case PrsPackage.PRS_ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case PrsPackage.PRS_ADDRESS__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case PrsPackage.PRS_ADDRESS__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case PrsPackage.PRS_ADDRESS__TIME_ZONE:
				return TIME_ZONE_EDEFAULT == null ? timeZone != null : !TIME_ZONE_EDEFAULT.equals(timeZone);
			case PrsPackage.PRS_ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
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
		result.append(" (AddressType: ");
		result.append(addressType);
		result.append(", Address1: ");
		result.append(address1);
		result.append(", Address2: ");
		result.append(address2);
		result.append(", Address3: ");
		result.append(address3);
		result.append(", Address4: ");
		result.append(address4);
		result.append(", City: ");
		result.append(city);
		result.append(", Region: ");
		result.append(region);
		result.append(", PostalCode: ");
		result.append(postalCode);
		result.append(", TimeZone: ");
		result.append(timeZone);
		result.append(", Country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //PRS_AddressImpl
