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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_RedundancySet;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Redundancy Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedundancySetImpl#getRedundancyStatus <em>Redundancy Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedundancySetImpl#getTypeOfSet <em>Type Of Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedundancySetImpl#getMinNumberNeeded <em>Min Number Needed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedundancySetImpl#getMaxNumberSupported <em>Max Number Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedundancySetImpl#getVendorIdentifyingInfo <em>Vendor Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedundancySetImpl#getOtherTypeOfSet <em>Other Type Of Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedundancySetImpl#getLoadBalanceAlgorithm <em>Load Balance Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedundancySetImpl#getOtherLoadBalanceAlgorithm <em>Other Load Balance Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RedundancySetImpl extends CIM_SystemSpecificCollectionImpl implements CIM_RedundancySet {
	/**
	 * The default value of the '{@link #getRedundancyStatus() <em>Redundancy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedundancyStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REDUNDANCY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedundancyStatus() <em>Redundancy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedundancyStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer redundancyStatus = REDUNDANCY_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeOfSet() <em>Type Of Set</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfSet()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> typeOfSet;

	/**
	 * The default value of the '{@link #getMinNumberNeeded() <em>Min Number Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumberNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_NUMBER_NEEDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinNumberNeeded() <em>Min Number Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumberNeeded()
	 * @generated
	 * @ordered
	 */
	protected Long minNumberNeeded = MIN_NUMBER_NEEDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberSupported() <em>Max Number Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUMBER_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberSupported() <em>Max Number Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberSupported()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumberSupported = MAX_NUMBER_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorIdentifyingInfo() <em>Vendor Identifying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_IDENTIFYING_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorIdentifyingInfo() <em>Vendor Identifying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected String vendorIdentifyingInfo = VENDOR_IDENTIFYING_INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherTypeOfSet() <em>Other Type Of Set</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeOfSet()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherTypeOfSet;

	/**
	 * The default value of the '{@link #getLoadBalanceAlgorithm() <em>Load Balance Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalanceAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOAD_BALANCE_ALGORITHM_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getLoadBalanceAlgorithm() <em>Load Balance Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalanceAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Integer loadBalanceAlgorithm = LOAD_BALANCE_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLoadBalanceAlgorithm() <em>Other Load Balance Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLoadBalanceAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LOAD_BALANCE_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLoadBalanceAlgorithm() <em>Other Load Balance Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLoadBalanceAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String otherLoadBalanceAlgorithm = OTHER_LOAD_BALANCE_ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RedundancySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RedundancySet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRedundancyStatus() {
		return redundancyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedundancyStatus(Integer newRedundancyStatus) {
		Integer oldRedundancyStatus = redundancyStatus;
		redundancyStatus = newRedundancyStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REDUNDANCY_SET__REDUNDANCY_STATUS, oldRedundancyStatus, redundancyStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getTypeOfSet() {
		if (typeOfSet == null) {
			typeOfSet = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REDUNDANCY_SET__TYPE_OF_SET);
		}
		return typeOfSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinNumberNeeded() {
		return minNumberNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinNumberNeeded(Long newMinNumberNeeded) {
		Long oldMinNumberNeeded = minNumberNeeded;
		minNumberNeeded = newMinNumberNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REDUNDANCY_SET__MIN_NUMBER_NEEDED, oldMinNumberNeeded, minNumberNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumberSupported() {
		return maxNumberSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumberSupported(Long newMaxNumberSupported) {
		Long oldMaxNumberSupported = maxNumberSupported;
		maxNumberSupported = newMaxNumberSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REDUNDANCY_SET__MAX_NUMBER_SUPPORTED, oldMaxNumberSupported, maxNumberSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorIdentifyingInfo() {
		return vendorIdentifyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorIdentifyingInfo(String newVendorIdentifyingInfo) {
		String oldVendorIdentifyingInfo = vendorIdentifyingInfo;
		vendorIdentifyingInfo = newVendorIdentifyingInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REDUNDANCY_SET__VENDOR_IDENTIFYING_INFO, oldVendorIdentifyingInfo, vendorIdentifyingInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherTypeOfSet() {
		if (otherTypeOfSet == null) {
			otherTypeOfSet = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_REDUNDANCY_SET__OTHER_TYPE_OF_SET);
		}
		return otherTypeOfSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLoadBalanceAlgorithm() {
		return loadBalanceAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalanceAlgorithm(Integer newLoadBalanceAlgorithm) {
		Integer oldLoadBalanceAlgorithm = loadBalanceAlgorithm;
		loadBalanceAlgorithm = newLoadBalanceAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REDUNDANCY_SET__LOAD_BALANCE_ALGORITHM, oldLoadBalanceAlgorithm, loadBalanceAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLoadBalanceAlgorithm() {
		return otherLoadBalanceAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLoadBalanceAlgorithm(String newOtherLoadBalanceAlgorithm) {
		String oldOtherLoadBalanceAlgorithm = otherLoadBalanceAlgorithm;
		otherLoadBalanceAlgorithm = newOtherLoadBalanceAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REDUNDANCY_SET__OTHER_LOAD_BALANCE_ALGORITHM, oldOtherLoadBalanceAlgorithm, otherLoadBalanceAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Failover(CIM_ManagedElement FailoverFrom, CIM_ManagedElement FailoverTo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REDUNDANCY_SET__REDUNDANCY_STATUS:
				return getRedundancyStatus();
			case CimPackage.CIM_REDUNDANCY_SET__TYPE_OF_SET:
				return getTypeOfSet();
			case CimPackage.CIM_REDUNDANCY_SET__MIN_NUMBER_NEEDED:
				return getMinNumberNeeded();
			case CimPackage.CIM_REDUNDANCY_SET__MAX_NUMBER_SUPPORTED:
				return getMaxNumberSupported();
			case CimPackage.CIM_REDUNDANCY_SET__VENDOR_IDENTIFYING_INFO:
				return getVendorIdentifyingInfo();
			case CimPackage.CIM_REDUNDANCY_SET__OTHER_TYPE_OF_SET:
				return getOtherTypeOfSet();
			case CimPackage.CIM_REDUNDANCY_SET__LOAD_BALANCE_ALGORITHM:
				return getLoadBalanceAlgorithm();
			case CimPackage.CIM_REDUNDANCY_SET__OTHER_LOAD_BALANCE_ALGORITHM:
				return getOtherLoadBalanceAlgorithm();
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
			case CimPackage.CIM_REDUNDANCY_SET__REDUNDANCY_STATUS:
				setRedundancyStatus((Integer)newValue);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__TYPE_OF_SET:
				getTypeOfSet().clear();
				getTypeOfSet().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__MIN_NUMBER_NEEDED:
				setMinNumberNeeded((Long)newValue);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__MAX_NUMBER_SUPPORTED:
				setMaxNumberSupported((Long)newValue);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__VENDOR_IDENTIFYING_INFO:
				setVendorIdentifyingInfo((String)newValue);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__OTHER_TYPE_OF_SET:
				getOtherTypeOfSet().clear();
				getOtherTypeOfSet().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__LOAD_BALANCE_ALGORITHM:
				setLoadBalanceAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__OTHER_LOAD_BALANCE_ALGORITHM:
				setOtherLoadBalanceAlgorithm((String)newValue);
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
			case CimPackage.CIM_REDUNDANCY_SET__REDUNDANCY_STATUS:
				setRedundancyStatus(REDUNDANCY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__TYPE_OF_SET:
				getTypeOfSet().clear();
				return;
			case CimPackage.CIM_REDUNDANCY_SET__MIN_NUMBER_NEEDED:
				setMinNumberNeeded(MIN_NUMBER_NEEDED_EDEFAULT);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__MAX_NUMBER_SUPPORTED:
				setMaxNumberSupported(MAX_NUMBER_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__VENDOR_IDENTIFYING_INFO:
				setVendorIdentifyingInfo(VENDOR_IDENTIFYING_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__OTHER_TYPE_OF_SET:
				getOtherTypeOfSet().clear();
				return;
			case CimPackage.CIM_REDUNDANCY_SET__LOAD_BALANCE_ALGORITHM:
				setLoadBalanceAlgorithm(LOAD_BALANCE_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_REDUNDANCY_SET__OTHER_LOAD_BALANCE_ALGORITHM:
				setOtherLoadBalanceAlgorithm(OTHER_LOAD_BALANCE_ALGORITHM_EDEFAULT);
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
			case CimPackage.CIM_REDUNDANCY_SET__REDUNDANCY_STATUS:
				return REDUNDANCY_STATUS_EDEFAULT == null ? redundancyStatus != null : !REDUNDANCY_STATUS_EDEFAULT.equals(redundancyStatus);
			case CimPackage.CIM_REDUNDANCY_SET__TYPE_OF_SET:
				return typeOfSet != null && !typeOfSet.isEmpty();
			case CimPackage.CIM_REDUNDANCY_SET__MIN_NUMBER_NEEDED:
				return MIN_NUMBER_NEEDED_EDEFAULT == null ? minNumberNeeded != null : !MIN_NUMBER_NEEDED_EDEFAULT.equals(minNumberNeeded);
			case CimPackage.CIM_REDUNDANCY_SET__MAX_NUMBER_SUPPORTED:
				return MAX_NUMBER_SUPPORTED_EDEFAULT == null ? maxNumberSupported != null : !MAX_NUMBER_SUPPORTED_EDEFAULT.equals(maxNumberSupported);
			case CimPackage.CIM_REDUNDANCY_SET__VENDOR_IDENTIFYING_INFO:
				return VENDOR_IDENTIFYING_INFO_EDEFAULT == null ? vendorIdentifyingInfo != null : !VENDOR_IDENTIFYING_INFO_EDEFAULT.equals(vendorIdentifyingInfo);
			case CimPackage.CIM_REDUNDANCY_SET__OTHER_TYPE_OF_SET:
				return otherTypeOfSet != null && !otherTypeOfSet.isEmpty();
			case CimPackage.CIM_REDUNDANCY_SET__LOAD_BALANCE_ALGORITHM:
				return LOAD_BALANCE_ALGORITHM_EDEFAULT == null ? loadBalanceAlgorithm != null : !LOAD_BALANCE_ALGORITHM_EDEFAULT.equals(loadBalanceAlgorithm);
			case CimPackage.CIM_REDUNDANCY_SET__OTHER_LOAD_BALANCE_ALGORITHM:
				return OTHER_LOAD_BALANCE_ALGORITHM_EDEFAULT == null ? otherLoadBalanceAlgorithm != null : !OTHER_LOAD_BALANCE_ALGORITHM_EDEFAULT.equals(otherLoadBalanceAlgorithm);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_REDUNDANCY_SET___FAILOVER__CIM_MANAGEDELEMENT_CIM_MANAGEDELEMENT:
				return Failover((CIM_ManagedElement)arguments.get(0), (CIM_ManagedElement)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (RedundancyStatus: ");
		result.append(redundancyStatus);
		result.append(", TypeOfSet: ");
		result.append(typeOfSet);
		result.append(", MinNumberNeeded: ");
		result.append(minNumberNeeded);
		result.append(", MaxNumberSupported: ");
		result.append(maxNumberSupported);
		result.append(", VendorIdentifyingInfo: ");
		result.append(vendorIdentifyingInfo);
		result.append(", OtherTypeOfSet: ");
		result.append(otherTypeOfSet);
		result.append(", LoadBalanceAlgorithm: ");
		result.append(loadBalanceAlgorithm);
		result.append(", OtherLoadBalanceAlgorithm: ");
		result.append(otherLoadBalanceAlgorithm);
		result.append(')');
		return result.toString();
	}

} //CIM_RedundancySetImpl
