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

import org.dmtf.cim.CIM_AdvancedStorageSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Advanced Storage Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdvancedStorageSettingImpl#getInitialStorageTierMethodology <em>Initial Storage Tier Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdvancedStorageSettingImpl#getInitialStorageTieringSelection <em>Initial Storage Tiering Selection</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdvancedStorageSettingImpl#getRelativePerformanceOrderLimit <em>Relative Performance Order Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdvancedStorageSettingImpl#getInitialRelativePerformanceOrderSet <em>Initial Relative Performance Order Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdvancedStorageSettingImpl#getStorageTieringFrozen <em>Storage Tiering Frozen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AdvancedStorageSettingImpl extends CIM_StorageSettingImpl implements CIM_AdvancedStorageSetting {
	/**
	 * The default value of the '{@link #getInitialStorageTierMethodology() <em>Initial Storage Tier Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStorageTierMethodology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_STORAGE_TIER_METHODOLOGY_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getInitialStorageTierMethodology() <em>Initial Storage Tier Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStorageTierMethodology()
	 * @generated
	 * @ordered
	 */
	protected Integer initialStorageTierMethodology = INITIAL_STORAGE_TIER_METHODOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialStorageTieringSelection() <em>Initial Storage Tiering Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStorageTieringSelection()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_STORAGE_TIERING_SELECTION_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getInitialStorageTieringSelection() <em>Initial Storage Tiering Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStorageTieringSelection()
	 * @generated
	 * @ordered
	 */
	protected Integer initialStorageTieringSelection = INITIAL_STORAGE_TIERING_SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativePerformanceOrderLimit() <em>Relative Performance Order Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_PERFORMANCE_ORDER_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrderLimit() <em>Relative Performance Order Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer relativePerformanceOrderLimit = RELATIVE_PERFORMANCE_ORDER_LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialRelativePerformanceOrderSet() <em>Initial Relative Performance Order Set</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialRelativePerformanceOrderSet()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> initialRelativePerformanceOrderSet;

	/**
	 * The default value of the '{@link #getStorageTieringFrozen() <em>Storage Tiering Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageTieringFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STORAGE_TIERING_FROZEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageTieringFrozen() <em>Storage Tiering Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageTieringFrozen()
	 * @generated
	 * @ordered
	 */
	protected Boolean storageTieringFrozen = STORAGE_TIERING_FROZEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AdvancedStorageSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AdvancedStorageSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialStorageTierMethodology() {
		return initialStorageTierMethodology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialStorageTierMethodology(Integer newInitialStorageTierMethodology) {
		Integer oldInitialStorageTierMethodology = initialStorageTierMethodology;
		initialStorageTierMethodology = newInitialStorageTierMethodology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIER_METHODOLOGY, oldInitialStorageTierMethodology, initialStorageTierMethodology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialStorageTieringSelection() {
		return initialStorageTieringSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialStorageTieringSelection(Integer newInitialStorageTieringSelection) {
		Integer oldInitialStorageTieringSelection = initialStorageTieringSelection;
		initialStorageTieringSelection = newInitialStorageTieringSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIERING_SELECTION, oldInitialStorageTieringSelection, initialStorageTieringSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativePerformanceOrderLimit() {
		return relativePerformanceOrderLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePerformanceOrderLimit(Integer newRelativePerformanceOrderLimit) {
		Integer oldRelativePerformanceOrderLimit = relativePerformanceOrderLimit;
		relativePerformanceOrderLimit = newRelativePerformanceOrderLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADVANCED_STORAGE_SETTING__RELATIVE_PERFORMANCE_ORDER_LIMIT, oldRelativePerformanceOrderLimit, relativePerformanceOrderLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getInitialRelativePerformanceOrderSet() {
		if (initialRelativePerformanceOrderSet == null) {
			initialRelativePerformanceOrderSet = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_RELATIVE_PERFORMANCE_ORDER_SET);
		}
		return initialRelativePerformanceOrderSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStorageTieringFrozen() {
		return storageTieringFrozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageTieringFrozen(Boolean newStorageTieringFrozen) {
		Boolean oldStorageTieringFrozen = storageTieringFrozen;
		storageTieringFrozen = newStorageTieringFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADVANCED_STORAGE_SETTING__STORAGE_TIERING_FROZEN, oldStorageTieringFrozen, storageTieringFrozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIER_METHODOLOGY:
				return getInitialStorageTierMethodology();
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIERING_SELECTION:
				return getInitialStorageTieringSelection();
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__RELATIVE_PERFORMANCE_ORDER_LIMIT:
				return getRelativePerformanceOrderLimit();
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_RELATIVE_PERFORMANCE_ORDER_SET:
				return getInitialRelativePerformanceOrderSet();
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__STORAGE_TIERING_FROZEN:
				return getStorageTieringFrozen();
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
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIER_METHODOLOGY:
				setInitialStorageTierMethodology((Integer)newValue);
				return;
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIERING_SELECTION:
				setInitialStorageTieringSelection((Integer)newValue);
				return;
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__RELATIVE_PERFORMANCE_ORDER_LIMIT:
				setRelativePerformanceOrderLimit((Integer)newValue);
				return;
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_RELATIVE_PERFORMANCE_ORDER_SET:
				getInitialRelativePerformanceOrderSet().clear();
				getInitialRelativePerformanceOrderSet().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__STORAGE_TIERING_FROZEN:
				setStorageTieringFrozen((Boolean)newValue);
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
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIER_METHODOLOGY:
				setInitialStorageTierMethodology(INITIAL_STORAGE_TIER_METHODOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIERING_SELECTION:
				setInitialStorageTieringSelection(INITIAL_STORAGE_TIERING_SELECTION_EDEFAULT);
				return;
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__RELATIVE_PERFORMANCE_ORDER_LIMIT:
				setRelativePerformanceOrderLimit(RELATIVE_PERFORMANCE_ORDER_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_RELATIVE_PERFORMANCE_ORDER_SET:
				getInitialRelativePerformanceOrderSet().clear();
				return;
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__STORAGE_TIERING_FROZEN:
				setStorageTieringFrozen(STORAGE_TIERING_FROZEN_EDEFAULT);
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
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIER_METHODOLOGY:
				return INITIAL_STORAGE_TIER_METHODOLOGY_EDEFAULT == null ? initialStorageTierMethodology != null : !INITIAL_STORAGE_TIER_METHODOLOGY_EDEFAULT.equals(initialStorageTierMethodology);
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_STORAGE_TIERING_SELECTION:
				return INITIAL_STORAGE_TIERING_SELECTION_EDEFAULT == null ? initialStorageTieringSelection != null : !INITIAL_STORAGE_TIERING_SELECTION_EDEFAULT.equals(initialStorageTieringSelection);
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__RELATIVE_PERFORMANCE_ORDER_LIMIT:
				return RELATIVE_PERFORMANCE_ORDER_LIMIT_EDEFAULT == null ? relativePerformanceOrderLimit != null : !RELATIVE_PERFORMANCE_ORDER_LIMIT_EDEFAULT.equals(relativePerformanceOrderLimit);
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__INITIAL_RELATIVE_PERFORMANCE_ORDER_SET:
				return initialRelativePerformanceOrderSet != null && !initialRelativePerformanceOrderSet.isEmpty();
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING__STORAGE_TIERING_FROZEN:
				return STORAGE_TIERING_FROZEN_EDEFAULT == null ? storageTieringFrozen != null : !STORAGE_TIERING_FROZEN_EDEFAULT.equals(storageTieringFrozen);
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
		result.append(" (InitialStorageTierMethodology: ");
		result.append(initialStorageTierMethodology);
		result.append(", InitialStorageTieringSelection: ");
		result.append(initialStorageTieringSelection);
		result.append(", RelativePerformanceOrderLimit: ");
		result.append(relativePerformanceOrderLimit);
		result.append(", InitialRelativePerformanceOrderSet: ");
		result.append(initialRelativePerformanceOrderSet);
		result.append(", StorageTieringFrozen: ");
		result.append(storageTieringFrozen);
		result.append(')');
		return result.toString();
	}

} //CIM_AdvancedStorageSettingImpl
