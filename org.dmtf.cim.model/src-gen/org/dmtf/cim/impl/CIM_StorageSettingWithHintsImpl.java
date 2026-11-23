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

import org.dmtf.cim.CIM_StorageSettingWithHints;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Setting With Hints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingWithHintsImpl#getDataAvailabilityHint <em>Data Availability Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingWithHintsImpl#getAccessRandomnessHint <em>Access Randomness Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingWithHintsImpl#getAccessDirectionHint <em>Access Direction Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingWithHintsImpl#getAccessSizeHint <em>Access Size Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingWithHintsImpl#getAccessLatencyHint <em>Access Latency Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingWithHintsImpl#getAccessBandwidthWeight <em>Access Bandwidth Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingWithHintsImpl#getStorageCostHint <em>Storage Cost Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingWithHintsImpl#getStorageEfficiencyHint <em>Storage Efficiency Hint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageSettingWithHintsImpl extends CIM_AdvancedStorageSettingImpl implements CIM_StorageSettingWithHints {
	/**
	 * The default value of the '{@link #getDataAvailabilityHint() <em>Data Availability Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAvailabilityHint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_AVAILABILITY_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataAvailabilityHint() <em>Data Availability Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAvailabilityHint()
	 * @generated
	 * @ordered
	 */
	protected Integer dataAvailabilityHint = DATA_AVAILABILITY_HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessRandomnessHint() <em>Access Randomness Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRandomnessHint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_RANDOMNESS_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessRandomnessHint() <em>Access Randomness Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRandomnessHint()
	 * @generated
	 * @ordered
	 */
	protected Integer accessRandomnessHint = ACCESS_RANDOMNESS_HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessDirectionHint() <em>Access Direction Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessDirectionHint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_DIRECTION_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessDirectionHint() <em>Access Direction Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessDirectionHint()
	 * @generated
	 * @ordered
	 */
	protected Integer accessDirectionHint = ACCESS_DIRECTION_HINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessSizeHint() <em>Access Size Hint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessSizeHint()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> accessSizeHint;

	/**
	 * The default value of the '{@link #getAccessLatencyHint() <em>Access Latency Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLatencyHint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_LATENCY_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessLatencyHint() <em>Access Latency Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLatencyHint()
	 * @generated
	 * @ordered
	 */
	protected Integer accessLatencyHint = ACCESS_LATENCY_HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessBandwidthWeight() <em>Access Bandwidth Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessBandwidthWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_BANDWIDTH_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessBandwidthWeight() <em>Access Bandwidth Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessBandwidthWeight()
	 * @generated
	 * @ordered
	 */
	protected Integer accessBandwidthWeight = ACCESS_BANDWIDTH_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageCostHint() <em>Storage Cost Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCostHint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_COST_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageCostHint() <em>Storage Cost Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCostHint()
	 * @generated
	 * @ordered
	 */
	protected Integer storageCostHint = STORAGE_COST_HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageEfficiencyHint() <em>Storage Efficiency Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageEfficiencyHint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_EFFICIENCY_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageEfficiencyHint() <em>Storage Efficiency Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageEfficiencyHint()
	 * @generated
	 * @ordered
	 */
	protected Integer storageEfficiencyHint = STORAGE_EFFICIENCY_HINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageSettingWithHintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageSettingWithHints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataAvailabilityHint() {
		return dataAvailabilityHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataAvailabilityHint(Integer newDataAvailabilityHint) {
		Integer oldDataAvailabilityHint = dataAvailabilityHint;
		dataAvailabilityHint = newDataAvailabilityHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__DATA_AVAILABILITY_HINT, oldDataAvailabilityHint, dataAvailabilityHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessRandomnessHint() {
		return accessRandomnessHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessRandomnessHint(Integer newAccessRandomnessHint) {
		Integer oldAccessRandomnessHint = accessRandomnessHint;
		accessRandomnessHint = newAccessRandomnessHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_RANDOMNESS_HINT, oldAccessRandomnessHint, accessRandomnessHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessDirectionHint() {
		return accessDirectionHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessDirectionHint(Integer newAccessDirectionHint) {
		Integer oldAccessDirectionHint = accessDirectionHint;
		accessDirectionHint = newAccessDirectionHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_DIRECTION_HINT, oldAccessDirectionHint, accessDirectionHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAccessSizeHint() {
		if (accessSizeHint == null) {
			accessSizeHint = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_SIZE_HINT);
		}
		return accessSizeHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessLatencyHint() {
		return accessLatencyHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessLatencyHint(Integer newAccessLatencyHint) {
		Integer oldAccessLatencyHint = accessLatencyHint;
		accessLatencyHint = newAccessLatencyHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_LATENCY_HINT, oldAccessLatencyHint, accessLatencyHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessBandwidthWeight() {
		return accessBandwidthWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessBandwidthWeight(Integer newAccessBandwidthWeight) {
		Integer oldAccessBandwidthWeight = accessBandwidthWeight;
		accessBandwidthWeight = newAccessBandwidthWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_BANDWIDTH_WEIGHT, oldAccessBandwidthWeight, accessBandwidthWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStorageCostHint() {
		return storageCostHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageCostHint(Integer newStorageCostHint) {
		Integer oldStorageCostHint = storageCostHint;
		storageCostHint = newStorageCostHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_COST_HINT, oldStorageCostHint, storageCostHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStorageEfficiencyHint() {
		return storageEfficiencyHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageEfficiencyHint(Integer newStorageEfficiencyHint) {
		Integer oldStorageEfficiencyHint = storageEfficiencyHint;
		storageEfficiencyHint = newStorageEfficiencyHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_EFFICIENCY_HINT, oldStorageEfficiencyHint, storageEfficiencyHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__DATA_AVAILABILITY_HINT:
				return getDataAvailabilityHint();
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_RANDOMNESS_HINT:
				return getAccessRandomnessHint();
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_DIRECTION_HINT:
				return getAccessDirectionHint();
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_SIZE_HINT:
				return getAccessSizeHint();
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_LATENCY_HINT:
				return getAccessLatencyHint();
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_BANDWIDTH_WEIGHT:
				return getAccessBandwidthWeight();
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_COST_HINT:
				return getStorageCostHint();
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_EFFICIENCY_HINT:
				return getStorageEfficiencyHint();
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
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__DATA_AVAILABILITY_HINT:
				setDataAvailabilityHint((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_RANDOMNESS_HINT:
				setAccessRandomnessHint((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_DIRECTION_HINT:
				setAccessDirectionHint((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_SIZE_HINT:
				getAccessSizeHint().clear();
				getAccessSizeHint().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_LATENCY_HINT:
				setAccessLatencyHint((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_BANDWIDTH_WEIGHT:
				setAccessBandwidthWeight((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_COST_HINT:
				setStorageCostHint((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_EFFICIENCY_HINT:
				setStorageEfficiencyHint((Integer)newValue);
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
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__DATA_AVAILABILITY_HINT:
				setDataAvailabilityHint(DATA_AVAILABILITY_HINT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_RANDOMNESS_HINT:
				setAccessRandomnessHint(ACCESS_RANDOMNESS_HINT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_DIRECTION_HINT:
				setAccessDirectionHint(ACCESS_DIRECTION_HINT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_SIZE_HINT:
				getAccessSizeHint().clear();
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_LATENCY_HINT:
				setAccessLatencyHint(ACCESS_LATENCY_HINT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_BANDWIDTH_WEIGHT:
				setAccessBandwidthWeight(ACCESS_BANDWIDTH_WEIGHT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_COST_HINT:
				setStorageCostHint(STORAGE_COST_HINT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_EFFICIENCY_HINT:
				setStorageEfficiencyHint(STORAGE_EFFICIENCY_HINT_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__DATA_AVAILABILITY_HINT:
				return DATA_AVAILABILITY_HINT_EDEFAULT == null ? dataAvailabilityHint != null : !DATA_AVAILABILITY_HINT_EDEFAULT.equals(dataAvailabilityHint);
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_RANDOMNESS_HINT:
				return ACCESS_RANDOMNESS_HINT_EDEFAULT == null ? accessRandomnessHint != null : !ACCESS_RANDOMNESS_HINT_EDEFAULT.equals(accessRandomnessHint);
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_DIRECTION_HINT:
				return ACCESS_DIRECTION_HINT_EDEFAULT == null ? accessDirectionHint != null : !ACCESS_DIRECTION_HINT_EDEFAULT.equals(accessDirectionHint);
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_SIZE_HINT:
				return accessSizeHint != null && !accessSizeHint.isEmpty();
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_LATENCY_HINT:
				return ACCESS_LATENCY_HINT_EDEFAULT == null ? accessLatencyHint != null : !ACCESS_LATENCY_HINT_EDEFAULT.equals(accessLatencyHint);
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__ACCESS_BANDWIDTH_WEIGHT:
				return ACCESS_BANDWIDTH_WEIGHT_EDEFAULT == null ? accessBandwidthWeight != null : !ACCESS_BANDWIDTH_WEIGHT_EDEFAULT.equals(accessBandwidthWeight);
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_COST_HINT:
				return STORAGE_COST_HINT_EDEFAULT == null ? storageCostHint != null : !STORAGE_COST_HINT_EDEFAULT.equals(storageCostHint);
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS__STORAGE_EFFICIENCY_HINT:
				return STORAGE_EFFICIENCY_HINT_EDEFAULT == null ? storageEfficiencyHint != null : !STORAGE_EFFICIENCY_HINT_EDEFAULT.equals(storageEfficiencyHint);
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
		result.append(" (DataAvailabilityHint: ");
		result.append(dataAvailabilityHint);
		result.append(", AccessRandomnessHint: ");
		result.append(accessRandomnessHint);
		result.append(", AccessDirectionHint: ");
		result.append(accessDirectionHint);
		result.append(", AccessSizeHint: ");
		result.append(accessSizeHint);
		result.append(", AccessLatencyHint: ");
		result.append(accessLatencyHint);
		result.append(", AccessBandwidthWeight: ");
		result.append(accessBandwidthWeight);
		result.append(", StorageCostHint: ");
		result.append(storageCostHint);
		result.append(", StorageEfficiencyHint: ");
		result.append(storageEfficiencyHint);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageSettingWithHintsImpl
