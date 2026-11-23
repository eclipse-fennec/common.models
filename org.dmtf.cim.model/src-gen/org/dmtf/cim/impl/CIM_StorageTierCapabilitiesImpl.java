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

import org.dmtf.cim.CIM_StorageTierCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Tier Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierCapabilitiesImpl#getStorageTierCharacteristics <em>Storage Tier Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierCapabilitiesImpl#getRelativePerformanceOrderMin <em>Relative Performance Order Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierCapabilitiesImpl#getRelativePerformanceOrderMax <em>Relative Performance Order Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierCapabilitiesImpl#getRelativePerformanceOrderDefault <em>Relative Performance Order Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierCapabilitiesImpl#getSupportedStorageTierMethodologies <em>Supported Storage Tier Methodologies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageTierCapabilitiesImpl extends CIM_StorageCapabilitiesImpl implements CIM_StorageTierCapabilities {
	/**
	 * The cached value of the '{@link #getStorageTierCharacteristics() <em>Storage Tier Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageTierCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> storageTierCharacteristics;

	/**
	 * The default value of the '{@link #getRelativePerformanceOrderMin() <em>Relative Performance Order Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrderMin() <em>Relative Performance Order Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderMin()
	 * @generated
	 * @ordered
	 */
	protected Integer relativePerformanceOrderMin = RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativePerformanceOrderMax() <em>Relative Performance Order Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrderMax() <em>Relative Performance Order Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderMax()
	 * @generated
	 * @ordered
	 */
	protected Integer relativePerformanceOrderMax = RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativePerformanceOrderDefault() <em>Relative Performance Order Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_PERFORMANCE_ORDER_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrderDefault() <em>Relative Performance Order Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer relativePerformanceOrderDefault = RELATIVE_PERFORMANCE_ORDER_DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedStorageTierMethodologies() <em>Supported Storage Tier Methodologies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageTierMethodologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageTierMethodologies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageTierCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageTierCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getStorageTierCharacteristics() {
		if (storageTierCharacteristics == null) {
			storageTierCharacteristics = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_TIER_CAPABILITIES__STORAGE_TIER_CHARACTERISTICS);
		}
		return storageTierCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativePerformanceOrderMin() {
		return relativePerformanceOrderMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePerformanceOrderMin(Integer newRelativePerformanceOrderMin) {
		Integer oldRelativePerformanceOrderMin = relativePerformanceOrderMin;
		relativePerformanceOrderMin = newRelativePerformanceOrderMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MIN, oldRelativePerformanceOrderMin, relativePerformanceOrderMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativePerformanceOrderMax() {
		return relativePerformanceOrderMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePerformanceOrderMax(Integer newRelativePerformanceOrderMax) {
		Integer oldRelativePerformanceOrderMax = relativePerformanceOrderMax;
		relativePerformanceOrderMax = newRelativePerformanceOrderMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MAX, oldRelativePerformanceOrderMax, relativePerformanceOrderMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativePerformanceOrderDefault() {
		return relativePerformanceOrderDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePerformanceOrderDefault(Integer newRelativePerformanceOrderDefault) {
		Integer oldRelativePerformanceOrderDefault = relativePerformanceOrderDefault;
		relativePerformanceOrderDefault = newRelativePerformanceOrderDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_DEFAULT, oldRelativePerformanceOrderDefault, relativePerformanceOrderDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageTierMethodologies() {
		if (supportedStorageTierMethodologies == null) {
			supportedStorageTierMethodologies = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_TIER_CAPABILITIES__SUPPORTED_STORAGE_TIER_METHODOLOGIES);
		}
		return supportedStorageTierMethodologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__STORAGE_TIER_CHARACTERISTICS:
				return getStorageTierCharacteristics();
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MIN:
				return getRelativePerformanceOrderMin();
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MAX:
				return getRelativePerformanceOrderMax();
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_DEFAULT:
				return getRelativePerformanceOrderDefault();
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__SUPPORTED_STORAGE_TIER_METHODOLOGIES:
				return getSupportedStorageTierMethodologies();
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
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__STORAGE_TIER_CHARACTERISTICS:
				getStorageTierCharacteristics().clear();
				getStorageTierCharacteristics().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MIN:
				setRelativePerformanceOrderMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MAX:
				setRelativePerformanceOrderMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_DEFAULT:
				setRelativePerformanceOrderDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__SUPPORTED_STORAGE_TIER_METHODOLOGIES:
				getSupportedStorageTierMethodologies().clear();
				getSupportedStorageTierMethodologies().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__STORAGE_TIER_CHARACTERISTICS:
				getStorageTierCharacteristics().clear();
				return;
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MIN:
				setRelativePerformanceOrderMin(RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MAX:
				setRelativePerformanceOrderMax(RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_DEFAULT:
				setRelativePerformanceOrderDefault(RELATIVE_PERFORMANCE_ORDER_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__SUPPORTED_STORAGE_TIER_METHODOLOGIES:
				getSupportedStorageTierMethodologies().clear();
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
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__STORAGE_TIER_CHARACTERISTICS:
				return storageTierCharacteristics != null && !storageTierCharacteristics.isEmpty();
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MIN:
				return RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT == null ? relativePerformanceOrderMin != null : !RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT.equals(relativePerformanceOrderMin);
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_MAX:
				return RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT == null ? relativePerformanceOrderMax != null : !RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT.equals(relativePerformanceOrderMax);
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__RELATIVE_PERFORMANCE_ORDER_DEFAULT:
				return RELATIVE_PERFORMANCE_ORDER_DEFAULT_EDEFAULT == null ? relativePerformanceOrderDefault != null : !RELATIVE_PERFORMANCE_ORDER_DEFAULT_EDEFAULT.equals(relativePerformanceOrderDefault);
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES__SUPPORTED_STORAGE_TIER_METHODOLOGIES:
				return supportedStorageTierMethodologies != null && !supportedStorageTierMethodologies.isEmpty();
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
		result.append(" (StorageTierCharacteristics: ");
		result.append(storageTierCharacteristics);
		result.append(", RelativePerformanceOrderMin: ");
		result.append(relativePerformanceOrderMin);
		result.append(", RelativePerformanceOrderMax: ");
		result.append(relativePerformanceOrderMax);
		result.append(", RelativePerformanceOrderDefault: ");
		result.append(relativePerformanceOrderDefault);
		result.append(", SupportedStorageTierMethodologies: ");
		result.append(supportedStorageTierMethodologies);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageTierCapabilitiesImpl
