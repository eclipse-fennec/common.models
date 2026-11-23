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

import org.dmtf.cim.CIM_SerialController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Serial Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SerialControllerImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SerialControllerImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SerialControllerImpl#getMaxBaudRate <em>Max Baud Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SerialControllerImpl#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SerialControllerImpl extends CIM_ControllerImpl implements CIM_SerialController {
	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The default value of the '{@link #getMaxBaudRate() <em>Max Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBaudRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_BAUD_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxBaudRate() <em>Max Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBaudRate()
	 * @generated
	 * @ordered
	 */
	protected Long maxBaudRate = MAX_BAUD_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECURITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Integer security = SECURITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SerialControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SerialController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxBaudRate() {
		return maxBaudRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxBaudRate(Long newMaxBaudRate) {
		Long oldMaxBaudRate = maxBaudRate;
		maxBaudRate = newMaxBaudRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERIAL_CONTROLLER__MAX_BAUD_RATE, oldMaxBaudRate, maxBaudRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(Integer newSecurity) {
		Integer oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERIAL_CONTROLLER__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_SERIAL_CONTROLLER__MAX_BAUD_RATE:
				return getMaxBaudRate();
			case CimPackage.CIM_SERIAL_CONTROLLER__SECURITY:
				return getSecurity();
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
			case CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SERIAL_CONTROLLER__MAX_BAUD_RATE:
				setMaxBaudRate((Long)newValue);
				return;
			case CimPackage.CIM_SERIAL_CONTROLLER__SECURITY:
				setSecurity((Integer)newValue);
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
			case CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_SERIAL_CONTROLLER__MAX_BAUD_RATE:
				setMaxBaudRate(MAX_BAUD_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_SERIAL_CONTROLLER__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
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
			case CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_SERIAL_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_SERIAL_CONTROLLER__MAX_BAUD_RATE:
				return MAX_BAUD_RATE_EDEFAULT == null ? maxBaudRate != null : !MAX_BAUD_RATE_EDEFAULT.equals(maxBaudRate);
			case CimPackage.CIM_SERIAL_CONTROLLER__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
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
		result.append(" (Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", MaxBaudRate: ");
		result.append(maxBaudRate);
		result.append(", Security: ");
		result.append(security);
		result.append(')');
		return result.toString();
	}

} //CIM_SerialControllerImpl
