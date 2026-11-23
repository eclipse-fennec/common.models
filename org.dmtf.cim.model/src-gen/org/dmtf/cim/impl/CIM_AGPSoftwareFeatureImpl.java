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

import org.dmtf.cim.CIM_AGPSoftwareFeature;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM AGP Software Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPSoftwareFeatureImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPSoftwareFeatureImpl#getCharacteristicDescriptions <em>Characteristic Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AGPSoftwareFeatureImpl extends CIM_SoftwareFeatureImpl implements CIM_AGPSoftwareFeature {
	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> characteristics;

	/**
	 * The cached value of the '{@link #getCharacteristicDescriptions() <em>Characteristic Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> characteristicDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AGPSoftwareFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AGPSoftwareFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCharacteristicDescriptions() {
		if (characteristicDescriptions == null) {
			characteristicDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTIC_DESCRIPTIONS);
		}
		return characteristicDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTICS:
				return getCharacteristics();
			case CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTIC_DESCRIPTIONS:
				return getCharacteristicDescriptions();
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
			case CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTICS:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTIC_DESCRIPTIONS:
				getCharacteristicDescriptions().clear();
				getCharacteristicDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTICS:
				getCharacteristics().clear();
				return;
			case CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTIC_DESCRIPTIONS:
				getCharacteristicDescriptions().clear();
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
			case CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTICS:
				return characteristics != null && !characteristics.isEmpty();
			case CimPackage.CIM_AGP_SOFTWARE_FEATURE__CHARACTERISTIC_DESCRIPTIONS:
				return characteristicDescriptions != null && !characteristicDescriptions.isEmpty();
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
		result.append(" (Characteristics: ");
		result.append(characteristics);
		result.append(", CharacteristicDescriptions: ");
		result.append(characteristicDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_AGPSoftwareFeatureImpl
