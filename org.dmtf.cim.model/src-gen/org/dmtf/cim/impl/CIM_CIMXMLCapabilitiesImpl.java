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

import org.dmtf.cim.CIM_CIMXMLCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM CIMXML Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMXMLCapabilitiesImpl#getMultipleOperationsSupported <em>Multiple Operations Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMXMLCapabilitiesImpl#getValidated <em>Validated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CIMXMLCapabilitiesImpl extends CIM_WBEMProtocolServiceCapabilitiesImpl implements CIM_CIMXMLCapabilities {
	/**
	 * The default value of the '{@link #getMultipleOperationsSupported() <em>Multiple Operations Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOperationsSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipleOperationsSupported() <em>Multiple Operations Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOperationsSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean multipleOperationsSupported = MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidated() <em>Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VALIDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidated() <em>Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidated()
	 * @generated
	 * @ordered
	 */
	protected Boolean validated = VALIDATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CIMXMLCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CIMXMLCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMultipleOperationsSupported() {
		return multipleOperationsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleOperationsSupported(Boolean newMultipleOperationsSupported) {
		Boolean oldMultipleOperationsSupported = multipleOperationsSupported;
		multipleOperationsSupported = newMultipleOperationsSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMXML_CAPABILITIES__MULTIPLE_OPERATIONS_SUPPORTED, oldMultipleOperationsSupported, multipleOperationsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getValidated() {
		return validated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidated(Boolean newValidated) {
		Boolean oldValidated = validated;
		validated = newValidated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMXML_CAPABILITIES__VALIDATED, oldValidated, validated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CIMXML_CAPABILITIES__MULTIPLE_OPERATIONS_SUPPORTED:
				return getMultipleOperationsSupported();
			case CimPackage.CIM_CIMXML_CAPABILITIES__VALIDATED:
				return getValidated();
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
			case CimPackage.CIM_CIMXML_CAPABILITIES__MULTIPLE_OPERATIONS_SUPPORTED:
				setMultipleOperationsSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_CIMXML_CAPABILITIES__VALIDATED:
				setValidated((Boolean)newValue);
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
			case CimPackage.CIM_CIMXML_CAPABILITIES__MULTIPLE_OPERATIONS_SUPPORTED:
				setMultipleOperationsSupported(MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_CIMXML_CAPABILITIES__VALIDATED:
				setValidated(VALIDATED_EDEFAULT);
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
			case CimPackage.CIM_CIMXML_CAPABILITIES__MULTIPLE_OPERATIONS_SUPPORTED:
				return MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT == null ? multipleOperationsSupported != null : !MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT.equals(multipleOperationsSupported);
			case CimPackage.CIM_CIMXML_CAPABILITIES__VALIDATED:
				return VALIDATED_EDEFAULT == null ? validated != null : !VALIDATED_EDEFAULT.equals(validated);
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
		result.append(" (MultipleOperationsSupported: ");
		result.append(multipleOperationsSupported);
		result.append(", Validated: ");
		result.append(validated);
		result.append(')');
		return result.toString();
	}

} //CIM_CIMXMLCapabilitiesImpl
