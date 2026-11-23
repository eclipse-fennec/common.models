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

import org.dmtf.cim.CIM_Rack;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Rack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RackImpl#getTypeOfRack <em>Type Of Rack</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RackImpl#getCountryDesignation <em>Country Designation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RackImpl extends CIM_PhysicalFrameImpl implements CIM_Rack {
	/**
	 * The default value of the '{@link #getTypeOfRack() <em>Type Of Rack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfRack()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_RACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfRack() <em>Type Of Rack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfRack()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfRack = TYPE_OF_RACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountryDesignation() <em>Country Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryDesignation()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_DESIGNATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryDesignation() <em>Country Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryDesignation()
	 * @generated
	 * @ordered
	 */
	protected String countryDesignation = COUNTRY_DESIGNATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Rack();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfRack() {
		return typeOfRack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfRack(Integer newTypeOfRack) {
		Integer oldTypeOfRack = typeOfRack;
		typeOfRack = newTypeOfRack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RACK__TYPE_OF_RACK, oldTypeOfRack, typeOfRack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryDesignation() {
		return countryDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryDesignation(String newCountryDesignation) {
		String oldCountryDesignation = countryDesignation;
		countryDesignation = newCountryDesignation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RACK__COUNTRY_DESIGNATION, oldCountryDesignation, countryDesignation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RACK__TYPE_OF_RACK:
				return getTypeOfRack();
			case CimPackage.CIM_RACK__COUNTRY_DESIGNATION:
				return getCountryDesignation();
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
			case CimPackage.CIM_RACK__TYPE_OF_RACK:
				setTypeOfRack((Integer)newValue);
				return;
			case CimPackage.CIM_RACK__COUNTRY_DESIGNATION:
				setCountryDesignation((String)newValue);
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
			case CimPackage.CIM_RACK__TYPE_OF_RACK:
				setTypeOfRack(TYPE_OF_RACK_EDEFAULT);
				return;
			case CimPackage.CIM_RACK__COUNTRY_DESIGNATION:
				setCountryDesignation(COUNTRY_DESIGNATION_EDEFAULT);
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
			case CimPackage.CIM_RACK__TYPE_OF_RACK:
				return TYPE_OF_RACK_EDEFAULT == null ? typeOfRack != null : !TYPE_OF_RACK_EDEFAULT.equals(typeOfRack);
			case CimPackage.CIM_RACK__COUNTRY_DESIGNATION:
				return COUNTRY_DESIGNATION_EDEFAULT == null ? countryDesignation != null : !COUNTRY_DESIGNATION_EDEFAULT.equals(countryDesignation);
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
		result.append(" (TypeOfRack: ");
		result.append(typeOfRack);
		result.append(", CountryDesignation: ");
		result.append(countryDesignation);
		result.append(')');
		return result.toString();
	}

} //CIM_RackImpl
