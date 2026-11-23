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

import org.dmtf.cim.CIM_WakeUpService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Wake Up Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WakeUpServiceImpl#getWakeUpType <em>Wake Up Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WakeUpServiceImpl#getOtherWakeUpTypeDescription <em>Other Wake Up Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WakeUpServiceImpl#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WakeUpServiceImpl#getFilterData <em>Filter Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WakeUpServiceImpl#getOtherFilterTypeDescription <em>Other Filter Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WakeUpServiceImpl extends CIM_ServiceImpl implements CIM_WakeUpService {
	/**
	 * The default value of the '{@link #getWakeUpType() <em>Wake Up Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWakeUpType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WAKE_UP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWakeUpType() <em>Wake Up Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWakeUpType()
	 * @generated
	 * @ordered
	 */
	protected Integer wakeUpType = WAKE_UP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherWakeUpTypeDescription() <em>Other Wake Up Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherWakeUpTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_WAKE_UP_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherWakeUpTypeDescription() <em>Other Wake Up Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherWakeUpTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherWakeUpTypeDescription = OTHER_WAKE_UP_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FILTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected Integer filterType = FILTER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilterData() <em>Filter Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterData()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> filterData;

	/**
	 * The default value of the '{@link #getOtherFilterTypeDescription() <em>Other Filter Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFilterTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_FILTER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherFilterTypeDescription() <em>Other Filter Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFilterTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherFilterTypeDescription = OTHER_FILTER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WakeUpServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WakeUpService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWakeUpType() {
		return wakeUpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWakeUpType(Integer newWakeUpType) {
		Integer oldWakeUpType = wakeUpType;
		wakeUpType = newWakeUpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WAKE_UP_SERVICE__WAKE_UP_TYPE, oldWakeUpType, wakeUpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherWakeUpTypeDescription() {
		return otherWakeUpTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherWakeUpTypeDescription(String newOtherWakeUpTypeDescription) {
		String oldOtherWakeUpTypeDescription = otherWakeUpTypeDescription;
		otherWakeUpTypeDescription = newOtherWakeUpTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WAKE_UP_SERVICE__OTHER_WAKE_UP_TYPE_DESCRIPTION, oldOtherWakeUpTypeDescription, otherWakeUpTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFilterType() {
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterType(Integer newFilterType) {
		Integer oldFilterType = filterType;
		filterType = newFilterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WAKE_UP_SERVICE__FILTER_TYPE, oldFilterType, filterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFilterData() {
		if (filterData == null) {
			filterData = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_WAKE_UP_SERVICE__FILTER_DATA);
		}
		return filterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherFilterTypeDescription() {
		return otherFilterTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherFilterTypeDescription(String newOtherFilterTypeDescription) {
		String oldOtherFilterTypeDescription = otherFilterTypeDescription;
		otherFilterTypeDescription = newOtherFilterTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WAKE_UP_SERVICE__OTHER_FILTER_TYPE_DESCRIPTION, oldOtherFilterTypeDescription, otherFilterTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WAKE_UP_SERVICE__WAKE_UP_TYPE:
				return getWakeUpType();
			case CimPackage.CIM_WAKE_UP_SERVICE__OTHER_WAKE_UP_TYPE_DESCRIPTION:
				return getOtherWakeUpTypeDescription();
			case CimPackage.CIM_WAKE_UP_SERVICE__FILTER_TYPE:
				return getFilterType();
			case CimPackage.CIM_WAKE_UP_SERVICE__FILTER_DATA:
				return getFilterData();
			case CimPackage.CIM_WAKE_UP_SERVICE__OTHER_FILTER_TYPE_DESCRIPTION:
				return getOtherFilterTypeDescription();
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
			case CimPackage.CIM_WAKE_UP_SERVICE__WAKE_UP_TYPE:
				setWakeUpType((Integer)newValue);
				return;
			case CimPackage.CIM_WAKE_UP_SERVICE__OTHER_WAKE_UP_TYPE_DESCRIPTION:
				setOtherWakeUpTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_WAKE_UP_SERVICE__FILTER_TYPE:
				setFilterType((Integer)newValue);
				return;
			case CimPackage.CIM_WAKE_UP_SERVICE__FILTER_DATA:
				getFilterData().clear();
				getFilterData().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_WAKE_UP_SERVICE__OTHER_FILTER_TYPE_DESCRIPTION:
				setOtherFilterTypeDescription((String)newValue);
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
			case CimPackage.CIM_WAKE_UP_SERVICE__WAKE_UP_TYPE:
				setWakeUpType(WAKE_UP_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_WAKE_UP_SERVICE__OTHER_WAKE_UP_TYPE_DESCRIPTION:
				setOtherWakeUpTypeDescription(OTHER_WAKE_UP_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_WAKE_UP_SERVICE__FILTER_TYPE:
				setFilterType(FILTER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_WAKE_UP_SERVICE__FILTER_DATA:
				getFilterData().clear();
				return;
			case CimPackage.CIM_WAKE_UP_SERVICE__OTHER_FILTER_TYPE_DESCRIPTION:
				setOtherFilterTypeDescription(OTHER_FILTER_TYPE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_WAKE_UP_SERVICE__WAKE_UP_TYPE:
				return WAKE_UP_TYPE_EDEFAULT == null ? wakeUpType != null : !WAKE_UP_TYPE_EDEFAULT.equals(wakeUpType);
			case CimPackage.CIM_WAKE_UP_SERVICE__OTHER_WAKE_UP_TYPE_DESCRIPTION:
				return OTHER_WAKE_UP_TYPE_DESCRIPTION_EDEFAULT == null ? otherWakeUpTypeDescription != null : !OTHER_WAKE_UP_TYPE_DESCRIPTION_EDEFAULT.equals(otherWakeUpTypeDescription);
			case CimPackage.CIM_WAKE_UP_SERVICE__FILTER_TYPE:
				return FILTER_TYPE_EDEFAULT == null ? filterType != null : !FILTER_TYPE_EDEFAULT.equals(filterType);
			case CimPackage.CIM_WAKE_UP_SERVICE__FILTER_DATA:
				return filterData != null && !filterData.isEmpty();
			case CimPackage.CIM_WAKE_UP_SERVICE__OTHER_FILTER_TYPE_DESCRIPTION:
				return OTHER_FILTER_TYPE_DESCRIPTION_EDEFAULT == null ? otherFilterTypeDescription != null : !OTHER_FILTER_TYPE_DESCRIPTION_EDEFAULT.equals(otherFilterTypeDescription);
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
		result.append(" (WakeUpType: ");
		result.append(wakeUpType);
		result.append(", OtherWakeUpTypeDescription: ");
		result.append(otherWakeUpTypeDescription);
		result.append(", FilterType: ");
		result.append(filterType);
		result.append(", FilterData: ");
		result.append(filterData);
		result.append(", OtherFilterTypeDescription: ");
		result.append(otherFilterTypeDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_WakeUpServiceImpl
