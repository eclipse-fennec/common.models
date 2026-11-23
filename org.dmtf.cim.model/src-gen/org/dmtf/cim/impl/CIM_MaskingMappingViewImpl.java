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

import org.dmtf.cim.CIM_LogicalDevice;
import org.dmtf.cim.CIM_MaskingMappingView;
import org.dmtf.cim.CIM_ProtocolEndpoint;
import org.dmtf.cim.CIM_StorageHardwareID;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Masking Mapping View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getStorageHardwareID <em>Storage Hardware ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getLogicalDevice <em>Logical Device</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getProtocolEndpoint <em>Protocol Endpoint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSHIDStorageID <em>SHID Storage ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSHIDIDType <em>SHIDID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getLDDeviceID <em>LD Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPEPSystemCreationClassName <em>SPEP System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPEPCreationClassName <em>SPEP Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPEPSystemName <em>SPEP System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPEPName <em>SPEP Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPEPProtocolIFType <em>SPEP Protocol IF Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPEPOtherTypeDescription <em>SPEP Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPEPConnectionType <em>SPEP Connection Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPEPRole <em>SPEP Role</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getAPInstanceID <em>AP Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getAPPrivilegeGranted <em>AP Privilege Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getAPActivities <em>AP Activities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getAPElementName <em>AP Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPCSystemCreationClassName <em>SPC System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPCCreationClassName <em>SPC Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPCSystemName <em>SPC System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getSPCDeviceID <em>SPC Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getPCFUDeviceNumber <em>PCFU Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingMappingViewImpl#getPCFUDeviceAccess <em>PCFU Device Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MaskingMappingViewImpl extends MinimalEObjectImpl.Container implements CIM_MaskingMappingView {
	/**
	 * The cached value of the '{@link #getStorageHardwareID() <em>Storage Hardware ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageHardwareID()
	 * @generated
	 * @ordered
	 */
	protected CIM_StorageHardwareID storageHardwareID;

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
	 * The cached value of the '{@link #getProtocolEndpoint() <em>Protocol Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolEndpoint()
	 * @generated
	 * @ordered
	 */
	protected CIM_ProtocolEndpoint protocolEndpoint;

	/**
	 * The default value of the '{@link #getSHIDStorageID() <em>SHID Storage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHIDStorageID()
	 * @generated
	 * @ordered
	 */
	protected static final String SHID_STORAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSHIDStorageID() <em>SHID Storage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHIDStorageID()
	 * @generated
	 * @ordered
	 */
	protected String shidStorageID = SHID_STORAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSHIDIDType() <em>SHIDID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHIDIDType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SHIDID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSHIDIDType() <em>SHIDID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHIDIDType()
	 * @generated
	 * @ordered
	 */
	protected Integer shididType = SHIDID_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLDDeviceID() <em>LD Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String LD_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLDDeviceID() <em>LD Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String ldDeviceID = LD_DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPEPSystemCreationClassName() <em>SPEP System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPEPSystemCreationClassName() <em>SPEP System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String spepSystemCreationClassName = SPEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPEPCreationClassName() <em>SPEP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEP_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPEPCreationClassName() <em>SPEP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String spepCreationClassName = SPEP_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPEPSystemName() <em>SPEP System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEP_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPEPSystemName() <em>SPEP System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPSystemName()
	 * @generated
	 * @ordered
	 */
	protected String spepSystemName = SPEP_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPEPName() <em>SPEP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPEPName() <em>SPEP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPName()
	 * @generated
	 * @ordered
	 */
	protected String spepName = SPEP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPEPProtocolIFType() <em>SPEP Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPEP_PROTOCOL_IF_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPEPProtocolIFType() <em>SPEP Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected Integer spepProtocolIFType = SPEP_PROTOCOL_IF_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPEPOtherTypeDescription() <em>SPEP Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEP_OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPEPOtherTypeDescription() <em>SPEP Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String spepOtherTypeDescription = SPEP_OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPEPConnectionType() <em>SPEP Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPEP_CONNECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPEPConnectionType() <em>SPEP Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPConnectionType()
	 * @generated
	 * @ordered
	 */
	protected Integer spepConnectionType = SPEP_CONNECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPEPRole() <em>SPEP Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPRole()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPEP_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPEPRole() <em>SPEP Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPEPRole()
	 * @generated
	 * @ordered
	 */
	protected Integer spepRole = SPEP_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAPInstanceID() <em>AP Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String AP_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPInstanceID() <em>AP Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String apInstanceID = AP_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAPPrivilegeGranted() <em>AP Privilege Granted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPPrivilegeGranted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AP_PRIVILEGE_GRANTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPPrivilegeGranted() <em>AP Privilege Granted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPPrivilegeGranted()
	 * @generated
	 * @ordered
	 */
	protected Boolean apPrivilegeGranted = AP_PRIVILEGE_GRANTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPActivities() <em>AP Activities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> apActivities;

	/**
	 * The default value of the '{@link #getAPElementName() <em>AP Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String AP_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPElementName() <em>AP Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPElementName()
	 * @generated
	 * @ordered
	 */
	protected String apElementName = AP_ELEMENT_NAME_EDEFAULT;

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
	protected CIM_MaskingMappingViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MaskingMappingView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageHardwareID getStorageHardwareID() {
		if (storageHardwareID != null && storageHardwareID.eIsProxy()) {
			InternalEObject oldStorageHardwareID = (InternalEObject)storageHardwareID;
			storageHardwareID = (CIM_StorageHardwareID)eResolveProxy(oldStorageHardwareID);
			if (storageHardwareID != oldStorageHardwareID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_MASKING_MAPPING_VIEW__STORAGE_HARDWARE_ID, oldStorageHardwareID, storageHardwareID));
			}
		}
		return storageHardwareID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_StorageHardwareID basicGetStorageHardwareID() {
		return storageHardwareID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageHardwareID(CIM_StorageHardwareID newStorageHardwareID) {
		CIM_StorageHardwareID oldStorageHardwareID = storageHardwareID;
		storageHardwareID = newStorageHardwareID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__STORAGE_HARDWARE_ID, oldStorageHardwareID, storageHardwareID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_MASKING_MAPPING_VIEW__LOGICAL_DEVICE, oldLogicalDevice, logicalDevice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__LOGICAL_DEVICE, oldLogicalDevice, logicalDevice));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_MASKING_MAPPING_VIEW__PROTOCOL_ENDPOINT, oldProtocolEndpoint, protocolEndpoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__PROTOCOL_ENDPOINT, oldProtocolEndpoint, protocolEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSHIDStorageID() {
		return shidStorageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSHIDStorageID(String newSHIDStorageID) {
		String oldSHIDStorageID = shidStorageID;
		shidStorageID = newSHIDStorageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SHID_STORAGE_ID, oldSHIDStorageID, shidStorageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSHIDIDType() {
		return shididType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSHIDIDType(Integer newSHIDIDType) {
		Integer oldSHIDIDType = shididType;
		shididType = newSHIDIDType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SHIDID_TYPE, oldSHIDIDType, shididType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLDDeviceID() {
		return ldDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLDDeviceID(String newLDDeviceID) {
		String oldLDDeviceID = ldDeviceID;
		ldDeviceID = newLDDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__LD_DEVICE_ID, oldLDDeviceID, ldDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPEPSystemCreationClassName() {
		return spepSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPEPSystemCreationClassName(String newSPEPSystemCreationClassName) {
		String oldSPEPSystemCreationClassName = spepSystemCreationClassName;
		spepSystemCreationClassName = newSPEPSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_CREATION_CLASS_NAME, oldSPEPSystemCreationClassName, spepSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPEPCreationClassName() {
		return spepCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPEPCreationClassName(String newSPEPCreationClassName) {
		String oldSPEPCreationClassName = spepCreationClassName;
		spepCreationClassName = newSPEPCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CREATION_CLASS_NAME, oldSPEPCreationClassName, spepCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPEPSystemName() {
		return spepSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPEPSystemName(String newSPEPSystemName) {
		String oldSPEPSystemName = spepSystemName;
		spepSystemName = newSPEPSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_NAME, oldSPEPSystemName, spepSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPEPName() {
		return spepName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPEPName(String newSPEPName) {
		String oldSPEPName = spepName;
		spepName = newSPEPName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_NAME, oldSPEPName, spepName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSPEPProtocolIFType() {
		return spepProtocolIFType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPEPProtocolIFType(Integer newSPEPProtocolIFType) {
		Integer oldSPEPProtocolIFType = spepProtocolIFType;
		spepProtocolIFType = newSPEPProtocolIFType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_PROTOCOL_IF_TYPE, oldSPEPProtocolIFType, spepProtocolIFType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPEPOtherTypeDescription() {
		return spepOtherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPEPOtherTypeDescription(String newSPEPOtherTypeDescription) {
		String oldSPEPOtherTypeDescription = spepOtherTypeDescription;
		spepOtherTypeDescription = newSPEPOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_OTHER_TYPE_DESCRIPTION, oldSPEPOtherTypeDescription, spepOtherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSPEPConnectionType() {
		return spepConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPEPConnectionType(Integer newSPEPConnectionType) {
		Integer oldSPEPConnectionType = spepConnectionType;
		spepConnectionType = newSPEPConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CONNECTION_TYPE, oldSPEPConnectionType, spepConnectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSPEPRole() {
		return spepRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPEPRole(Integer newSPEPRole) {
		Integer oldSPEPRole = spepRole;
		spepRole = newSPEPRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_ROLE, oldSPEPRole, spepRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAPInstanceID() {
		return apInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAPInstanceID(String newAPInstanceID) {
		String oldAPInstanceID = apInstanceID;
		apInstanceID = newAPInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__AP_INSTANCE_ID, oldAPInstanceID, apInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAPPrivilegeGranted() {
		return apPrivilegeGranted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAPPrivilegeGranted(Boolean newAPPrivilegeGranted) {
		Boolean oldAPPrivilegeGranted = apPrivilegeGranted;
		apPrivilegeGranted = newAPPrivilegeGranted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__AP_PRIVILEGE_GRANTED, oldAPPrivilegeGranted, apPrivilegeGranted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAPActivities() {
		if (apActivities == null) {
			apActivities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ACTIVITIES);
		}
		return apActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAPElementName() {
		return apElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAPElementName(String newAPElementName) {
		String oldAPElementName = apElementName;
		apElementName = newAPElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ELEMENT_NAME, oldAPElementName, apElementName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME, oldSPCSystemCreationClassName, spcSystemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_CREATION_CLASS_NAME, oldSPCCreationClassName, spcCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_NAME, oldSPCSystemName, spcSystemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_DEVICE_ID, oldSPCDeviceID, spcDeviceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_NUMBER, oldPCFUDeviceNumber, pcfuDeviceNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_ACCESS, oldPCFUDeviceAccess, pcfuDeviceAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MASKING_MAPPING_VIEW__STORAGE_HARDWARE_ID:
				if (resolve) return getStorageHardwareID();
				return basicGetStorageHardwareID();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__LOGICAL_DEVICE:
				if (resolve) return getLogicalDevice();
				return basicGetLogicalDevice();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PROTOCOL_ENDPOINT:
				if (resolve) return getProtocolEndpoint();
				return basicGetProtocolEndpoint();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SHID_STORAGE_ID:
				return getSHIDStorageID();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SHIDID_TYPE:
				return getSHIDIDType();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__LD_DEVICE_ID:
				return getLDDeviceID();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_CREATION_CLASS_NAME:
				return getSPEPSystemCreationClassName();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CREATION_CLASS_NAME:
				return getSPEPCreationClassName();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_NAME:
				return getSPEPSystemName();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_NAME:
				return getSPEPName();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_PROTOCOL_IF_TYPE:
				return getSPEPProtocolIFType();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_OTHER_TYPE_DESCRIPTION:
				return getSPEPOtherTypeDescription();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CONNECTION_TYPE:
				return getSPEPConnectionType();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_ROLE:
				return getSPEPRole();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_INSTANCE_ID:
				return getAPInstanceID();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_PRIVILEGE_GRANTED:
				return getAPPrivilegeGranted();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ACTIVITIES:
				return getAPActivities();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ELEMENT_NAME:
				return getAPElementName();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME:
				return getSPCSystemCreationClassName();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_CREATION_CLASS_NAME:
				return getSPCCreationClassName();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_NAME:
				return getSPCSystemName();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_DEVICE_ID:
				return getSPCDeviceID();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_NUMBER:
				return getPCFUDeviceNumber();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_ACCESS:
				return getPCFUDeviceAccess();
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
			case CimPackage.CIM_MASKING_MAPPING_VIEW__STORAGE_HARDWARE_ID:
				setStorageHardwareID((CIM_StorageHardwareID)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__LOGICAL_DEVICE:
				setLogicalDevice((CIM_LogicalDevice)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PROTOCOL_ENDPOINT:
				setProtocolEndpoint((CIM_ProtocolEndpoint)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SHID_STORAGE_ID:
				setSHIDStorageID((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SHIDID_TYPE:
				setSHIDIDType((Integer)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__LD_DEVICE_ID:
				setLDDeviceID((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_CREATION_CLASS_NAME:
				setSPEPSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CREATION_CLASS_NAME:
				setSPEPCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_NAME:
				setSPEPSystemName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_NAME:
				setSPEPName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_PROTOCOL_IF_TYPE:
				setSPEPProtocolIFType((Integer)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_OTHER_TYPE_DESCRIPTION:
				setSPEPOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CONNECTION_TYPE:
				setSPEPConnectionType((Integer)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_ROLE:
				setSPEPRole((Integer)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_INSTANCE_ID:
				setAPInstanceID((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_PRIVILEGE_GRANTED:
				setAPPrivilegeGranted((Boolean)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ACTIVITIES:
				getAPActivities().clear();
				getAPActivities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ELEMENT_NAME:
				setAPElementName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME:
				setSPCSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_CREATION_CLASS_NAME:
				setSPCCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_NAME:
				setSPCSystemName((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_DEVICE_ID:
				setSPCDeviceID((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_NUMBER:
				setPCFUDeviceNumber((String)newValue);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_ACCESS:
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
			case CimPackage.CIM_MASKING_MAPPING_VIEW__STORAGE_HARDWARE_ID:
				setStorageHardwareID((CIM_StorageHardwareID)null);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__LOGICAL_DEVICE:
				setLogicalDevice((CIM_LogicalDevice)null);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PROTOCOL_ENDPOINT:
				setProtocolEndpoint((CIM_ProtocolEndpoint)null);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SHID_STORAGE_ID:
				setSHIDStorageID(SHID_STORAGE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SHIDID_TYPE:
				setSHIDIDType(SHIDID_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__LD_DEVICE_ID:
				setLDDeviceID(LD_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_CREATION_CLASS_NAME:
				setSPEPSystemCreationClassName(SPEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CREATION_CLASS_NAME:
				setSPEPCreationClassName(SPEP_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_NAME:
				setSPEPSystemName(SPEP_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_NAME:
				setSPEPName(SPEP_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_PROTOCOL_IF_TYPE:
				setSPEPProtocolIFType(SPEP_PROTOCOL_IF_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_OTHER_TYPE_DESCRIPTION:
				setSPEPOtherTypeDescription(SPEP_OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CONNECTION_TYPE:
				setSPEPConnectionType(SPEP_CONNECTION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_ROLE:
				setSPEPRole(SPEP_ROLE_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_INSTANCE_ID:
				setAPInstanceID(AP_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_PRIVILEGE_GRANTED:
				setAPPrivilegeGranted(AP_PRIVILEGE_GRANTED_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ACTIVITIES:
				getAPActivities().clear();
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ELEMENT_NAME:
				setAPElementName(AP_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME:
				setSPCSystemCreationClassName(SPC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_CREATION_CLASS_NAME:
				setSPCCreationClassName(SPC_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_NAME:
				setSPCSystemName(SPC_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_DEVICE_ID:
				setSPCDeviceID(SPC_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_NUMBER:
				setPCFUDeviceNumber(PCFU_DEVICE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_ACCESS:
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
			case CimPackage.CIM_MASKING_MAPPING_VIEW__STORAGE_HARDWARE_ID:
				return storageHardwareID != null;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__LOGICAL_DEVICE:
				return logicalDevice != null;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PROTOCOL_ENDPOINT:
				return protocolEndpoint != null;
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SHID_STORAGE_ID:
				return SHID_STORAGE_ID_EDEFAULT == null ? shidStorageID != null : !SHID_STORAGE_ID_EDEFAULT.equals(shidStorageID);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SHIDID_TYPE:
				return SHIDID_TYPE_EDEFAULT == null ? shididType != null : !SHIDID_TYPE_EDEFAULT.equals(shididType);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__LD_DEVICE_ID:
				return LD_DEVICE_ID_EDEFAULT == null ? ldDeviceID != null : !LD_DEVICE_ID_EDEFAULT.equals(ldDeviceID);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_CREATION_CLASS_NAME:
				return SPEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? spepSystemCreationClassName != null : !SPEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(spepSystemCreationClassName);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CREATION_CLASS_NAME:
				return SPEP_CREATION_CLASS_NAME_EDEFAULT == null ? spepCreationClassName != null : !SPEP_CREATION_CLASS_NAME_EDEFAULT.equals(spepCreationClassName);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_SYSTEM_NAME:
				return SPEP_SYSTEM_NAME_EDEFAULT == null ? spepSystemName != null : !SPEP_SYSTEM_NAME_EDEFAULT.equals(spepSystemName);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_NAME:
				return SPEP_NAME_EDEFAULT == null ? spepName != null : !SPEP_NAME_EDEFAULT.equals(spepName);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_PROTOCOL_IF_TYPE:
				return SPEP_PROTOCOL_IF_TYPE_EDEFAULT == null ? spepProtocolIFType != null : !SPEP_PROTOCOL_IF_TYPE_EDEFAULT.equals(spepProtocolIFType);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_OTHER_TYPE_DESCRIPTION:
				return SPEP_OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? spepOtherTypeDescription != null : !SPEP_OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(spepOtherTypeDescription);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_CONNECTION_TYPE:
				return SPEP_CONNECTION_TYPE_EDEFAULT == null ? spepConnectionType != null : !SPEP_CONNECTION_TYPE_EDEFAULT.equals(spepConnectionType);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPEP_ROLE:
				return SPEP_ROLE_EDEFAULT == null ? spepRole != null : !SPEP_ROLE_EDEFAULT.equals(spepRole);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_INSTANCE_ID:
				return AP_INSTANCE_ID_EDEFAULT == null ? apInstanceID != null : !AP_INSTANCE_ID_EDEFAULT.equals(apInstanceID);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_PRIVILEGE_GRANTED:
				return AP_PRIVILEGE_GRANTED_EDEFAULT == null ? apPrivilegeGranted != null : !AP_PRIVILEGE_GRANTED_EDEFAULT.equals(apPrivilegeGranted);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ACTIVITIES:
				return apActivities != null && !apActivities.isEmpty();
			case CimPackage.CIM_MASKING_MAPPING_VIEW__AP_ELEMENT_NAME:
				return AP_ELEMENT_NAME_EDEFAULT == null ? apElementName != null : !AP_ELEMENT_NAME_EDEFAULT.equals(apElementName);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_CREATION_CLASS_NAME:
				return SPC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? spcSystemCreationClassName != null : !SPC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(spcSystemCreationClassName);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_CREATION_CLASS_NAME:
				return SPC_CREATION_CLASS_NAME_EDEFAULT == null ? spcCreationClassName != null : !SPC_CREATION_CLASS_NAME_EDEFAULT.equals(spcCreationClassName);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_SYSTEM_NAME:
				return SPC_SYSTEM_NAME_EDEFAULT == null ? spcSystemName != null : !SPC_SYSTEM_NAME_EDEFAULT.equals(spcSystemName);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__SPC_DEVICE_ID:
				return SPC_DEVICE_ID_EDEFAULT == null ? spcDeviceID != null : !SPC_DEVICE_ID_EDEFAULT.equals(spcDeviceID);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_NUMBER:
				return PCFU_DEVICE_NUMBER_EDEFAULT == null ? pcfuDeviceNumber != null : !PCFU_DEVICE_NUMBER_EDEFAULT.equals(pcfuDeviceNumber);
			case CimPackage.CIM_MASKING_MAPPING_VIEW__PCFU_DEVICE_ACCESS:
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
		result.append(" (SHIDStorageID: ");
		result.append(shidStorageID);
		result.append(", SHIDIDType: ");
		result.append(shididType);
		result.append(", LDDeviceID: ");
		result.append(ldDeviceID);
		result.append(", SPEPSystemCreationClassName: ");
		result.append(spepSystemCreationClassName);
		result.append(", SPEPCreationClassName: ");
		result.append(spepCreationClassName);
		result.append(", SPEPSystemName: ");
		result.append(spepSystemName);
		result.append(", SPEPName: ");
		result.append(spepName);
		result.append(", SPEPProtocolIFType: ");
		result.append(spepProtocolIFType);
		result.append(", SPEPOtherTypeDescription: ");
		result.append(spepOtherTypeDescription);
		result.append(", SPEPConnectionType: ");
		result.append(spepConnectionType);
		result.append(", SPEPRole: ");
		result.append(spepRole);
		result.append(", APInstanceID: ");
		result.append(apInstanceID);
		result.append(", APPrivilegeGranted: ");
		result.append(apPrivilegeGranted);
		result.append(", APActivities: ");
		result.append(apActivities);
		result.append(", APElementName: ");
		result.append(apElementName);
		result.append(", SPCSystemCreationClassName: ");
		result.append(spcSystemCreationClassName);
		result.append(", SPCCreationClassName: ");
		result.append(spcCreationClassName);
		result.append(", SPCSystemName: ");
		result.append(spcSystemName);
		result.append(", SPCDeviceID: ");
		result.append(spcDeviceID);
		result.append(", PCFUDeviceNumber: ");
		result.append(pcfuDeviceNumber);
		result.append(", PCFUDeviceAccess: ");
		result.append(pcfuDeviceAccess);
		result.append(')');
		return result.toString();
	}

} //CIM_MaskingMappingViewImpl
