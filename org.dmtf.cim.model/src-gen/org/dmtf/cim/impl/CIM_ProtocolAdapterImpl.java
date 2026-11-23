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

import org.dmtf.cim.CIM_ProtocolAdapter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Protocol Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolAdapterImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolAdapterImpl#getProtocolAdapterType <em>Protocol Adapter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolAdapterImpl#getOtherProtocolAdapterType <em>Other Protocol Adapter Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProtocolAdapterImpl extends CIM_WBEMServiceImpl implements CIM_ProtocolAdapter {
	/**
	 * The default value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected String handle = HANDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolAdapterType() <em>Protocol Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolAdapterType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_ADAPTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolAdapterType() <em>Protocol Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolAdapterType()
	 * @generated
	 * @ordered
	 */
	protected Integer protocolAdapterType = PROTOCOL_ADAPTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherProtocolAdapterType() <em>Other Protocol Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocolAdapterType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PROTOCOL_ADAPTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherProtocolAdapterType() <em>Other Protocol Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocolAdapterType()
	 * @generated
	 * @ordered
	 */
	protected String otherProtocolAdapterType = OTHER_PROTOCOL_ADAPTER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProtocolAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProtocolAdapter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandle() {
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandle(String newHandle) {
		String oldHandle = handle;
		handle = newHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_ADAPTER__HANDLE, oldHandle, handle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtocolAdapterType() {
		return protocolAdapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolAdapterType(Integer newProtocolAdapterType) {
		Integer oldProtocolAdapterType = protocolAdapterType;
		protocolAdapterType = newProtocolAdapterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_ADAPTER__PROTOCOL_ADAPTER_TYPE, oldProtocolAdapterType, protocolAdapterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherProtocolAdapterType() {
		return otherProtocolAdapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherProtocolAdapterType(String newOtherProtocolAdapterType) {
		String oldOtherProtocolAdapterType = otherProtocolAdapterType;
		otherProtocolAdapterType = newOtherProtocolAdapterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_ADAPTER__OTHER_PROTOCOL_ADAPTER_TYPE, oldOtherProtocolAdapterType, otherProtocolAdapterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROTOCOL_ADAPTER__HANDLE:
				return getHandle();
			case CimPackage.CIM_PROTOCOL_ADAPTER__PROTOCOL_ADAPTER_TYPE:
				return getProtocolAdapterType();
			case CimPackage.CIM_PROTOCOL_ADAPTER__OTHER_PROTOCOL_ADAPTER_TYPE:
				return getOtherProtocolAdapterType();
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
			case CimPackage.CIM_PROTOCOL_ADAPTER__HANDLE:
				setHandle((String)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_ADAPTER__PROTOCOL_ADAPTER_TYPE:
				setProtocolAdapterType((Integer)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_ADAPTER__OTHER_PROTOCOL_ADAPTER_TYPE:
				setOtherProtocolAdapterType((String)newValue);
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
			case CimPackage.CIM_PROTOCOL_ADAPTER__HANDLE:
				setHandle(HANDLE_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_ADAPTER__PROTOCOL_ADAPTER_TYPE:
				setProtocolAdapterType(PROTOCOL_ADAPTER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_ADAPTER__OTHER_PROTOCOL_ADAPTER_TYPE:
				setOtherProtocolAdapterType(OTHER_PROTOCOL_ADAPTER_TYPE_EDEFAULT);
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
			case CimPackage.CIM_PROTOCOL_ADAPTER__HANDLE:
				return HANDLE_EDEFAULT == null ? handle != null : !HANDLE_EDEFAULT.equals(handle);
			case CimPackage.CIM_PROTOCOL_ADAPTER__PROTOCOL_ADAPTER_TYPE:
				return PROTOCOL_ADAPTER_TYPE_EDEFAULT == null ? protocolAdapterType != null : !PROTOCOL_ADAPTER_TYPE_EDEFAULT.equals(protocolAdapterType);
			case CimPackage.CIM_PROTOCOL_ADAPTER__OTHER_PROTOCOL_ADAPTER_TYPE:
				return OTHER_PROTOCOL_ADAPTER_TYPE_EDEFAULT == null ? otherProtocolAdapterType != null : !OTHER_PROTOCOL_ADAPTER_TYPE_EDEFAULT.equals(otherProtocolAdapterType);
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
		result.append(" (Handle: ");
		result.append(handle);
		result.append(", ProtocolAdapterType: ");
		result.append(protocolAdapterType);
		result.append(", OtherProtocolAdapterType: ");
		result.append(otherProtocolAdapterType);
		result.append(')');
		return result.toString();
	}

} //CIM_ProtocolAdapterImpl
