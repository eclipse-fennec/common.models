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

import org.dmtf.cim.CIM_ComputerSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Computer System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ComputerSystemImpl#getDedicated <em>Dedicated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ComputerSystemImpl#getOtherDedicatedDescriptions <em>Other Dedicated Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ComputerSystemImpl#getResetCapability <em>Reset Capability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ComputerSystemImpl#getPowerManagementCapabilities <em>Power Management Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ComputerSystemImpl extends CIM_SystemImpl implements CIM_ComputerSystem {
	/**
	 * The cached value of the '{@link #getDedicated() <em>Dedicated</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDedicated()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dedicated;

	/**
	 * The cached value of the '{@link #getOtherDedicatedDescriptions() <em>Other Dedicated Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDedicatedDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDedicatedDescriptions;

	/**
	 * The default value of the '{@link #getResetCapability() <em>Reset Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetCapability()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESET_CAPABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResetCapability() <em>Reset Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetCapability()
	 * @generated
	 * @ordered
	 */
	protected Integer resetCapability = RESET_CAPABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerManagementCapabilities() <em>Power Management Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerManagementCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> powerManagementCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ComputerSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ComputerSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDedicated() {
		if (dedicated == null) {
			dedicated = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_COMPUTER_SYSTEM__DEDICATED);
		}
		return dedicated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherDedicatedDescriptions() {
		if (otherDedicatedDescriptions == null) {
			otherDedicatedDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS);
		}
		return otherDedicatedDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getResetCapability() {
		return resetCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResetCapability(Integer newResetCapability) {
		Integer oldResetCapability = resetCapability;
		resetCapability = newResetCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPUTER_SYSTEM__RESET_CAPABILITY, oldResetCapability, resetCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPowerManagementCapabilities() {
		if (powerManagementCapabilities == null) {
			powerManagementCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_COMPUTER_SYSTEM__POWER_MANAGEMENT_CAPABILITIES);
		}
		return powerManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetPowerState(Long PowerState, String Time) {
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
			case CimPackage.CIM_COMPUTER_SYSTEM__DEDICATED:
				return getDedicated();
			case CimPackage.CIM_COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS:
				return getOtherDedicatedDescriptions();
			case CimPackage.CIM_COMPUTER_SYSTEM__RESET_CAPABILITY:
				return getResetCapability();
			case CimPackage.CIM_COMPUTER_SYSTEM__POWER_MANAGEMENT_CAPABILITIES:
				return getPowerManagementCapabilities();
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
			case CimPackage.CIM_COMPUTER_SYSTEM__DEDICATED:
				getDedicated().clear();
				getDedicated().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS:
				getOtherDedicatedDescriptions().clear();
				getOtherDedicatedDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_COMPUTER_SYSTEM__RESET_CAPABILITY:
				setResetCapability((Integer)newValue);
				return;
			case CimPackage.CIM_COMPUTER_SYSTEM__POWER_MANAGEMENT_CAPABILITIES:
				getPowerManagementCapabilities().clear();
				getPowerManagementCapabilities().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_COMPUTER_SYSTEM__DEDICATED:
				getDedicated().clear();
				return;
			case CimPackage.CIM_COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS:
				getOtherDedicatedDescriptions().clear();
				return;
			case CimPackage.CIM_COMPUTER_SYSTEM__RESET_CAPABILITY:
				setResetCapability(RESET_CAPABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_COMPUTER_SYSTEM__POWER_MANAGEMENT_CAPABILITIES:
				getPowerManagementCapabilities().clear();
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
			case CimPackage.CIM_COMPUTER_SYSTEM__DEDICATED:
				return dedicated != null && !dedicated.isEmpty();
			case CimPackage.CIM_COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS:
				return otherDedicatedDescriptions != null && !otherDedicatedDescriptions.isEmpty();
			case CimPackage.CIM_COMPUTER_SYSTEM__RESET_CAPABILITY:
				return RESET_CAPABILITY_EDEFAULT == null ? resetCapability != null : !RESET_CAPABILITY_EDEFAULT.equals(resetCapability);
			case CimPackage.CIM_COMPUTER_SYSTEM__POWER_MANAGEMENT_CAPABILITIES:
				return powerManagementCapabilities != null && !powerManagementCapabilities.isEmpty();
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
			case CimPackage.CIM_COMPUTER_SYSTEM___SET_POWER_STATE__LONG_STRING:
				return SetPowerState((Long)arguments.get(0), (String)arguments.get(1));
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
		result.append(" (Dedicated: ");
		result.append(dedicated);
		result.append(", OtherDedicatedDescriptions: ");
		result.append(otherDedicatedDescriptions);
		result.append(", ResetCapability: ");
		result.append(resetCapability);
		result.append(", PowerManagementCapabilities: ");
		result.append(powerManagementCapabilities);
		result.append(')');
		return result.toString();
	}

} //CIM_ComputerSystemImpl
