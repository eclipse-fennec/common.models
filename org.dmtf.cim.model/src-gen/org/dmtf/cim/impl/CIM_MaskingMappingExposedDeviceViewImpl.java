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

import org.dmtf.cim.CIM_LogicalDevice;
import org.dmtf.cim.CIM_MaskingMappingExposedDeviceView;
import org.dmtf.cim.CIM_ProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Masking Mapping Exposed Device View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingExposedDeviceViewImpl#getProtocolEndpoint <em>Protocol Endpoint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingExposedDeviceViewImpl#getLogicalDevice <em>Logical Device</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingExposedDeviceViewImpl#getSPCSystemCreationClassName <em>SPC System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingExposedDeviceViewImpl#getSPCSystemName <em>SPC System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingExposedDeviceViewImpl#getSPCCreationClassName <em>SPC Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingExposedDeviceViewImpl#getSPCDeviceID <em>SPC Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingExposedDeviceViewImpl#getPCFUDeviceNumber <em>PCFU Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingExposedDeviceViewImpl#getPCFUDeviceAccess <em>PCFU Device Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MaskingMappingExposedDeviceViewImpl extends MinimalEObjectImpl.Container implements CIM_MaskingMappingExposedDeviceView {
	/**
	 * The cached value of the '{@link #getProtocolEndpoint() <em>Protocol Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolEndpoint()
	 * @generated
	 * @ordered
	 */
	protected CIM_ProtocolEndpoint protocolEndpoint;

	/**
	 * The cached value of the '{@link #getLogicalDevice() <em>Logical Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalDevice()
	 * @generated
	 * @ordered
	 */
	protected CIM_LogicalDevice logicalDevice;

	/**
	 * The default value of the '{@link #getSPCSystemCreationClassName() <em>SPC System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPCSystemCreationClassName() <em>SPC System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String spcSystemCreationClassName = SPC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPCSystemName() <em>SPC System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPC_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPCSystemName() <em>SPC System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCSystemName()
	 * @generated
	 * @ordered
	 */
	protected String spcSystemName = SPC_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPCCreationClassName() <em>SPC Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPC_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPCCreationClassName() <em>SPC Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String spcCreationClassName = SPC_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPCDeviceID() <em>SPC Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SPC_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPCDeviceID() <em>SPC Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String spcDeviceID = SPC_DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPCFUDeviceNumber() <em>PCFU Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCFUDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PCFU_DEVICE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPCFUDeviceNumber() <em>PCFU Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCFUDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected String pcfuDeviceNumber = PCFU_DEVICE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPCFUDeviceAccess() <em>PCFU Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCFUDeviceAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PCFU_DEVICE_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPCFUDeviceAccess() <em>PCFU Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCFUDeviceAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer pcfuDeviceAccess = PCFU_DEVICE_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MaskingMappingExposedDeviceViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MaskingMappingExposedDeviceView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolEndpoint getProtocolEndpoint() {
		if (protocolEndpoint != null && protocolEndpoint.eIsProxy()) {
			InternalEObject oldProtocolEndpoint = (InternalEObject)protocolEndpoint;
			protocolEndpoint = (CIM_ProtocolEndpoint)eResolveProxy(oldProtocolEndpoint);
			if (protocolEndpoint != oldProtocolEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PROTOCOL_ENDPOINT, oldProtocolEndpoint, protocolEndpoint));
			}
		}
		return protocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ProtocolEndpoint basicGetProtocolEndpoint() {
		return protocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolEndpoint(CIM_ProtocolEndpoint newProtocolEndpoint) {
		CIM_ProtocolEndpoint oldProtocolEndpoint = protocolEndpoint;
		protocolEndpoint = newProtocolEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PROTOCOL_ENDPOINT, oldProtocolEndpoint, protocolEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalDevice getLogicalDevice() {
		if (logicalDevice != null && logicalDevice.eIsProxy()) {
			InternalEObject oldLogicalDevice = (InternalEObject)logicalDevice;
			logicalDevice = (CIM_LogicalDevice)eResolveProxy(oldLogicalDevice);
			if (logicalDevice != oldLogicalDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__LOGICAL_DEVICE, oldLogicalDevice, logicalDevice));
			}
		}
		return logicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_LogicalDevice basicGetLogicalDevice() {
		return logicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalDevice(CIM_LogicalDevice newLogicalDevice) {
		CIM_LogicalDevice oldLogicalDevice = logicalDevice;
		logicalDevice = newLogicalDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__LOGICAL_DEVICE, oldLogicalDevice, logicalDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPCSystemCreationClassName() {
		return spcSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPCSystemCreationClassName(String newSPCSystemCreationClassName) {
		String oldSPCSystemCreationClassName = spcSystemCreationClassName;
		spcSystemCreationClassName = newSPCSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME, oldSPCSystemCreationClassName, spcSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPCSystemName() {
		return spcSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPCSystemName(String newSPCSystemName) {
		String oldSPCSystemName = spcSystemName;
		spcSystemName = newSPCSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_NAME, oldSPCSystemName, spcSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPCCreationClassName() {
		return spcCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPCCreationClassName(String newSPCCreationClassName) {
		String oldSPCCreationClassName = spcCreationClassName;
		spcCreationClassName = newSPCCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_CREATION_CLASS_NAME, oldSPCCreationClassName, spcCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPCDeviceID() {
		return spcDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPCDeviceID(String newSPCDeviceID) {
		String oldSPCDeviceID = spcDeviceID;
		spcDeviceID = newSPCDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_DEVICE_ID, oldSPCDeviceID, spcDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPCFUDeviceNumber() {
		return pcfuDeviceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPCFUDeviceNumber(String newPCFUDeviceNumber) {
		String oldPCFUDeviceNumber = pcfuDeviceNumber;
		pcfuDeviceNumber = newPCFUDeviceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_NUMBER, oldPCFUDeviceNumber, pcfuDeviceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPCFUDeviceAccess() {
		return pcfuDeviceAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPCFUDeviceAccess(Integer newPCFUDeviceAccess) {
		Integer oldPCFUDeviceAccess = pcfuDeviceAccess;
		pcfuDeviceAccess = newPCFUDeviceAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_ACCESS, oldPCFUDeviceAccess, pcfuDeviceAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PROTOCOL_ENDPOINT:
				if (resolve) return getProtocolEndpoint();
				return basicGetProtocolEndpoint();
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__LOGICAL_DEVICE:
				if (resolve) return getLogicalDevice();
				return basicGetLogicalDevice();
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME:
				return getSPCSystemCreationClassName();
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_NAME:
				return getSPCSystemName();
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_CREATION_CLASS_NAME:
				return getSPCCreationClassName();
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_DEVICE_ID:
				return getSPCDeviceID();
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_NUMBER:
				return getPCFUDeviceNumber();
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_ACCESS:
				return getPCFUDeviceAccess();
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
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PROTOCOL_ENDPOINT:
				setProtocolEndpoint((CIM_ProtocolEndpoint)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__LOGICAL_DEVICE:
				setLogicalDevice((CIM_LogicalDevice)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME:
				setSPCSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_NAME:
				setSPCSystemName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_CREATION_CLASS_NAME:
				setSPCCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_DEVICE_ID:
				setSPCDeviceID((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_NUMBER:
				setPCFUDeviceNumber((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_ACCESS:
				setPCFUDeviceAccess((Integer)newValue);
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
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PROTOCOL_ENDPOINT:
				setProtocolEndpoint((CIM_ProtocolEndpoint)null);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__LOGICAL_DEVICE:
				setLogicalDevice((CIM_LogicalDevice)null);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME:
				setSPCSystemCreationClassName(SPC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_NAME:
				setSPCSystemName(SPC_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_CREATION_CLASS_NAME:
				setSPCCreationClassName(SPC_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_DEVICE_ID:
				setSPCDeviceID(SPC_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_NUMBER:
				setPCFUDeviceNumber(PCFU_DEVICE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_ACCESS:
				setPCFUDeviceAccess(PCFU_DEVICE_ACCESS_EDEFAULT);
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
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PROTOCOL_ENDPOINT:
				return protocolEndpoint != null;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__LOGICAL_DEVICE:
				return logicalDevice != null;
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME:
				return SPC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? spcSystemCreationClassName != null : !SPC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(spcSystemCreationClassName);
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_SYSTEM_NAME:
				return SPC_SYSTEM_NAME_EDEFAULT == null ? spcSystemName != null : !SPC_SYSTEM_NAME_EDEFAULT.equals(spcSystemName);
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_CREATION_CLASS_NAME:
				return SPC_CREATION_CLASS_NAME_EDEFAULT == null ? spcCreationClassName != null : !SPC_CREATION_CLASS_NAME_EDEFAULT.equals(spcCreationClassName);
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__SPC_DEVICE_ID:
				return SPC_DEVICE_ID_EDEFAULT == null ? spcDeviceID != null : !SPC_DEVICE_ID_EDEFAULT.equals(spcDeviceID);
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_NUMBER:
				return PCFU_DEVICE_NUMBER_EDEFAULT == null ? pcfuDeviceNumber != null : !PCFU_DEVICE_NUMBER_EDEFAULT.equals(pcfuDeviceNumber);
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW__PCFU_DEVICE_ACCESS:
				return PCFU_DEVICE_ACCESS_EDEFAULT == null ? pcfuDeviceAccess != null : !PCFU_DEVICE_ACCESS_EDEFAULT.equals(pcfuDeviceAccess);
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
		result.append(" (SPCSystemCreationClassName: ");
		result.append(spcSystemCreationClassName);
		result.append(", SPCSystemName: ");
		result.append(spcSystemName);
		result.append(", SPCCreationClassName: ");
		result.append(spcCreationClassName);
		result.append(", SPCDeviceID: ");
		result.append(spcDeviceID);
		result.append(", PCFUDeviceNumber: ");
		result.append(pcfuDeviceNumber);
		result.append(", PCFUDeviceAccess: ");
		result.append(pcfuDeviceAccess);
		result.append(')');
		return result.toString();
	}

} //CIM_MaskingMappingExposedDeviceViewImpl
