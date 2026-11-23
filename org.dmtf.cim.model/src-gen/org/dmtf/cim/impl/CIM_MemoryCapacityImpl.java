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

import org.dmtf.cim.CIM_MemoryCapacity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Memory Capacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapacityImpl#getMemoryType <em>Memory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapacityImpl#getMinimumMemoryCapacity <em>Minimum Memory Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapacityImpl#getMaximumMemoryCapacity <em>Maximum Memory Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MemoryCapacityImpl extends CIM_PhysicalCapacityImpl implements CIM_MemoryCapacity {
	/**
	 * The default value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEMORY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected Integer memoryType = MEMORY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumMemoryCapacity() <em>Minimum Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long MINIMUM_MEMORY_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumMemoryCapacity() <em>Minimum Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long minimumMemoryCapacity = MINIMUM_MEMORY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumMemoryCapacity() <em>Maximum Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_MEMORY_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumMemoryCapacity() <em>Maximum Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long maximumMemoryCapacity = MAXIMUM_MEMORY_CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MemoryCapacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MemoryCapacity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMemoryType() {
		return memoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryType(Integer newMemoryType) {
		Integer oldMemoryType = memoryType;
		memoryType = newMemoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_CAPACITY__MEMORY_TYPE, oldMemoryType, memoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinimumMemoryCapacity() {
		return minimumMemoryCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumMemoryCapacity(Long newMinimumMemoryCapacity) {
		Long oldMinimumMemoryCapacity = minimumMemoryCapacity;
		minimumMemoryCapacity = newMinimumMemoryCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_CAPACITY__MINIMUM_MEMORY_CAPACITY, oldMinimumMemoryCapacity, minimumMemoryCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumMemoryCapacity() {
		return maximumMemoryCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumMemoryCapacity(Long newMaximumMemoryCapacity) {
		Long oldMaximumMemoryCapacity = maximumMemoryCapacity;
		maximumMemoryCapacity = newMaximumMemoryCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_CAPACITY__MAXIMUM_MEMORY_CAPACITY, oldMaximumMemoryCapacity, maximumMemoryCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEMORY_CAPACITY__MEMORY_TYPE:
				return getMemoryType();
			case CimPackage.CIM_MEMORY_CAPACITY__MINIMUM_MEMORY_CAPACITY:
				return getMinimumMemoryCapacity();
			case CimPackage.CIM_MEMORY_CAPACITY__MAXIMUM_MEMORY_CAPACITY:
				return getMaximumMemoryCapacity();
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
			case CimPackage.CIM_MEMORY_CAPACITY__MEMORY_TYPE:
				setMemoryType((Integer)newValue);
				return;
			case CimPackage.CIM_MEMORY_CAPACITY__MINIMUM_MEMORY_CAPACITY:
				setMinimumMemoryCapacity((Long)newValue);
				return;
			case CimPackage.CIM_MEMORY_CAPACITY__MAXIMUM_MEMORY_CAPACITY:
				setMaximumMemoryCapacity((Long)newValue);
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
			case CimPackage.CIM_MEMORY_CAPACITY__MEMORY_TYPE:
				setMemoryType(MEMORY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_CAPACITY__MINIMUM_MEMORY_CAPACITY:
				setMinimumMemoryCapacity(MINIMUM_MEMORY_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_CAPACITY__MAXIMUM_MEMORY_CAPACITY:
				setMaximumMemoryCapacity(MAXIMUM_MEMORY_CAPACITY_EDEFAULT);
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
			case CimPackage.CIM_MEMORY_CAPACITY__MEMORY_TYPE:
				return MEMORY_TYPE_EDEFAULT == null ? memoryType != null : !MEMORY_TYPE_EDEFAULT.equals(memoryType);
			case CimPackage.CIM_MEMORY_CAPACITY__MINIMUM_MEMORY_CAPACITY:
				return MINIMUM_MEMORY_CAPACITY_EDEFAULT == null ? minimumMemoryCapacity != null : !MINIMUM_MEMORY_CAPACITY_EDEFAULT.equals(minimumMemoryCapacity);
			case CimPackage.CIM_MEMORY_CAPACITY__MAXIMUM_MEMORY_CAPACITY:
				return MAXIMUM_MEMORY_CAPACITY_EDEFAULT == null ? maximumMemoryCapacity != null : !MAXIMUM_MEMORY_CAPACITY_EDEFAULT.equals(maximumMemoryCapacity);
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
		result.append(" (MemoryType: ");
		result.append(memoryType);
		result.append(", MinimumMemoryCapacity: ");
		result.append(minimumMemoryCapacity);
		result.append(", MaximumMemoryCapacity: ");
		result.append(maximumMemoryCapacity);
		result.append(')');
		return result.toString();
	}

} //CIM_MemoryCapacityImpl
