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

import org.dmtf.cim.CIM_MappingProtocolControllerView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Mapping Protocol Controller View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPCSystemCreationClassName <em>PC System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPCSystemName <em>PC System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPCCreationClassName <em>PC Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPCDeviceID <em>PC Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getSHIDInstanceID <em>SHID Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getSHIDStorageID <em>SHID Storage ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getSHIDIDType <em>SHIDID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPEPSystemCreationClassName <em>PEP System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPEPCreationClassName <em>PEP Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPEPSystemName <em>PEP System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPEPName <em>PEP Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPEPProtocolIFType <em>PEP Protocol IF Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPEPOtherTypeDescription <em>PEP Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPEPRole <em>PEP Role</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getPEPConnectionType <em>PEP Connection Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getAPInstanceID <em>AP Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getAPPrivilegeGranted <em>AP Privilege Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getAPActivities <em>AP Activities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getAPElementName <em>AP Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getLPSystemCreationClassName <em>LP System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getLPSystemName <em>LP System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getLPCreationClassName <em>LP Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getLPDeviceID <em>LP Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getLPOperationalStatus <em>LP Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getLPUsageRestriction <em>LP Usage Restriction</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MappingProtocolControllerViewImpl#getLPPortType <em>LP Port Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MappingProtocolControllerViewImpl extends CIM_LogicalDeviceViewImpl implements CIM_MappingProtocolControllerView {
	/**
	 * The default value of the '{@link #getPCSystemCreationClassName() <em>PC System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPCSystemCreationClassName() <em>PC System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String pcSystemCreationClassName = PC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPCSystemName() <em>PC System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String PC_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPCSystemName() <em>PC System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCSystemName()
	 * @generated
	 * @ordered
	 */
	protected String pcSystemName = PC_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPCCreationClassName() <em>PC Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PC_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPCCreationClassName() <em>PC Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String pcCreationClassName = PC_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPCDeviceID() <em>PC Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String PC_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPCDeviceID() <em>PC Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String pcDeviceID = PC_DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSHIDInstanceID() <em>SHID Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHIDInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SHID_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSHIDInstanceID() <em>SHID Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHIDInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String shidInstanceID = SHID_INSTANCE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPEPSystemCreationClassName() <em>PEP System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEPSystemCreationClassName() <em>PEP System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String pepSystemCreationClassName = PEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPEPCreationClassName() <em>PEP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PEP_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEPCreationClassName() <em>PEP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String pepCreationClassName = PEP_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPEPSystemName() <em>PEP System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String PEP_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEPSystemName() <em>PEP System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPSystemName()
	 * @generated
	 * @ordered
	 */
	protected String pepSystemName = PEP_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPEPName() <em>PEP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPName()
	 * @generated
	 * @ordered
	 */
	protected static final String PEP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEPName() <em>PEP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPName()
	 * @generated
	 * @ordered
	 */
	protected String pepName = PEP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPEPProtocolIFType() <em>PEP Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PEP_PROTOCOL_IF_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEPProtocolIFType() <em>PEP Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected Integer pepProtocolIFType = PEP_PROTOCOL_IF_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPEPOtherTypeDescription() <em>PEP Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PEP_OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEPOtherTypeDescription() <em>PEP Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String pepOtherTypeDescription = PEP_OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPEPRole() <em>PEP Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPRole()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PEP_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEPRole() <em>PEP Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPRole()
	 * @generated
	 * @ordered
	 */
	protected Integer pepRole = PEP_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPEPConnectionType() <em>PEP Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PEP_CONNECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEPConnectionType() <em>PEP Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEPConnectionType()
	 * @generated
	 * @ordered
	 */
	protected Integer pepConnectionType = PEP_CONNECTION_TYPE_EDEFAULT;

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
	protected static final Boolean AP_PRIVILEGE_GRANTED_EDEFAULT = Boolean.TRUE;

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
	 * The default value of the '{@link #getLPSystemCreationClassName() <em>LP System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String LP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLPSystemCreationClassName() <em>LP System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String lpSystemCreationClassName = LP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLPSystemName() <em>LP System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String LP_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLPSystemName() <em>LP System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPSystemName()
	 * @generated
	 * @ordered
	 */
	protected String lpSystemName = LP_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLPCreationClassName() <em>LP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String LP_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLPCreationClassName() <em>LP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String lpCreationClassName = LP_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLPDeviceID() <em>LP Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String LP_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLPDeviceID() <em>LP Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String lpDeviceID = LP_DEVICE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLPOperationalStatus() <em>LP Operational Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> lpOperationalStatus;

	/**
	 * The default value of the '{@link #getLPUsageRestriction() <em>LP Usage Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPUsageRestriction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LP_USAGE_RESTRICTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLPUsageRestriction() <em>LP Usage Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPUsageRestriction()
	 * @generated
	 * @ordered
	 */
	protected Integer lpUsageRestriction = LP_USAGE_RESTRICTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLPPortType() <em>LP Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPPortType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LP_PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLPPortType() <em>LP Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPPortType()
	 * @generated
	 * @ordered
	 */
	protected Integer lpPortType = LP_PORT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MappingProtocolControllerViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MappingProtocolControllerView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPCSystemCreationClassName() {
		return pcSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPCSystemCreationClassName(String newPCSystemCreationClassName) {
		String oldPCSystemCreationClassName = pcSystemCreationClassName;
		pcSystemCreationClassName = newPCSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_CREATION_CLASS_NAME, oldPCSystemCreationClassName, pcSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPCSystemName() {
		return pcSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPCSystemName(String newPCSystemName) {
		String oldPCSystemName = pcSystemName;
		pcSystemName = newPCSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_NAME, oldPCSystemName, pcSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPCCreationClassName() {
		return pcCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPCCreationClassName(String newPCCreationClassName) {
		String oldPCCreationClassName = pcCreationClassName;
		pcCreationClassName = newPCCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_CREATION_CLASS_NAME, oldPCCreationClassName, pcCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPCDeviceID() {
		return pcDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPCDeviceID(String newPCDeviceID) {
		String oldPCDeviceID = pcDeviceID;
		pcDeviceID = newPCDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_DEVICE_ID, oldPCDeviceID, pcDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSHIDInstanceID() {
		return shidInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSHIDInstanceID(String newSHIDInstanceID) {
		String oldSHIDInstanceID = shidInstanceID;
		shidInstanceID = newSHIDInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_INSTANCE_ID, oldSHIDInstanceID, shidInstanceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_STORAGE_ID, oldSHIDStorageID, shidStorageID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHIDID_TYPE, oldSHIDIDType, shididType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPEPSystemCreationClassName() {
		return pepSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEPSystemCreationClassName(String newPEPSystemCreationClassName) {
		String oldPEPSystemCreationClassName = pepSystemCreationClassName;
		pepSystemCreationClassName = newPEPSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_CREATION_CLASS_NAME, oldPEPSystemCreationClassName, pepSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPEPCreationClassName() {
		return pepCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEPCreationClassName(String newPEPCreationClassName) {
		String oldPEPCreationClassName = pepCreationClassName;
		pepCreationClassName = newPEPCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CREATION_CLASS_NAME, oldPEPCreationClassName, pepCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPEPSystemName() {
		return pepSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEPSystemName(String newPEPSystemName) {
		String oldPEPSystemName = pepSystemName;
		pepSystemName = newPEPSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_NAME, oldPEPSystemName, pepSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPEPName() {
		return pepName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEPName(String newPEPName) {
		String oldPEPName = pepName;
		pepName = newPEPName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_NAME, oldPEPName, pepName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPEPProtocolIFType() {
		return pepProtocolIFType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEPProtocolIFType(Integer newPEPProtocolIFType) {
		Integer oldPEPProtocolIFType = pepProtocolIFType;
		pepProtocolIFType = newPEPProtocolIFType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_PROTOCOL_IF_TYPE, oldPEPProtocolIFType, pepProtocolIFType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPEPOtherTypeDescription() {
		return pepOtherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEPOtherTypeDescription(String newPEPOtherTypeDescription) {
		String oldPEPOtherTypeDescription = pepOtherTypeDescription;
		pepOtherTypeDescription = newPEPOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_OTHER_TYPE_DESCRIPTION, oldPEPOtherTypeDescription, pepOtherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPEPRole() {
		return pepRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEPRole(Integer newPEPRole) {
		Integer oldPEPRole = pepRole;
		pepRole = newPEPRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_ROLE, oldPEPRole, pepRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPEPConnectionType() {
		return pepConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEPConnectionType(Integer newPEPConnectionType) {
		Integer oldPEPConnectionType = pepConnectionType;
		pepConnectionType = newPEPConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CONNECTION_TYPE, oldPEPConnectionType, pepConnectionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_INSTANCE_ID, oldAPInstanceID, apInstanceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_PRIVILEGE_GRANTED, oldAPPrivilegeGranted, apPrivilegeGranted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAPActivities() {
		if (apActivities == null) {
			apActivities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ACTIVITIES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ELEMENT_NAME, oldAPElementName, apElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLPSystemCreationClassName() {
		return lpSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLPSystemCreationClassName(String newLPSystemCreationClassName) {
		String oldLPSystemCreationClassName = lpSystemCreationClassName;
		lpSystemCreationClassName = newLPSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_CREATION_CLASS_NAME, oldLPSystemCreationClassName, lpSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLPSystemName() {
		return lpSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLPSystemName(String newLPSystemName) {
		String oldLPSystemName = lpSystemName;
		lpSystemName = newLPSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_NAME, oldLPSystemName, lpSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLPCreationClassName() {
		return lpCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLPCreationClassName(String newLPCreationClassName) {
		String oldLPCreationClassName = lpCreationClassName;
		lpCreationClassName = newLPCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_CREATION_CLASS_NAME, oldLPCreationClassName, lpCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLPDeviceID() {
		return lpDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLPDeviceID(String newLPDeviceID) {
		String oldLPDeviceID = lpDeviceID;
		lpDeviceID = newLPDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_DEVICE_ID, oldLPDeviceID, lpDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLPOperationalStatus() {
		if (lpOperationalStatus == null) {
			lpOperationalStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_OPERATIONAL_STATUS);
		}
		return lpOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLPUsageRestriction() {
		return lpUsageRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLPUsageRestriction(Integer newLPUsageRestriction) {
		Integer oldLPUsageRestriction = lpUsageRestriction;
		lpUsageRestriction = newLPUsageRestriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_USAGE_RESTRICTION, oldLPUsageRestriction, lpUsageRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLPPortType() {
		return lpPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLPPortType(Integer newLPPortType) {
		Integer oldLPPortType = lpPortType;
		lpPortType = newLPPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_PORT_TYPE, oldLPPortType, lpPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_CREATION_CLASS_NAME:
				return getPCSystemCreationClassName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_NAME:
				return getPCSystemName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_CREATION_CLASS_NAME:
				return getPCCreationClassName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_DEVICE_ID:
				return getPCDeviceID();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_INSTANCE_ID:
				return getSHIDInstanceID();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_STORAGE_ID:
				return getSHIDStorageID();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHIDID_TYPE:
				return getSHIDIDType();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_CREATION_CLASS_NAME:
				return getPEPSystemCreationClassName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CREATION_CLASS_NAME:
				return getPEPCreationClassName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_NAME:
				return getPEPSystemName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_NAME:
				return getPEPName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_PROTOCOL_IF_TYPE:
				return getPEPProtocolIFType();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_OTHER_TYPE_DESCRIPTION:
				return getPEPOtherTypeDescription();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_ROLE:
				return getPEPRole();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CONNECTION_TYPE:
				return getPEPConnectionType();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_INSTANCE_ID:
				return getAPInstanceID();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_PRIVILEGE_GRANTED:
				return getAPPrivilegeGranted();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ACTIVITIES:
				return getAPActivities();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ELEMENT_NAME:
				return getAPElementName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_CREATION_CLASS_NAME:
				return getLPSystemCreationClassName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_NAME:
				return getLPSystemName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_CREATION_CLASS_NAME:
				return getLPCreationClassName();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_DEVICE_ID:
				return getLPDeviceID();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_OPERATIONAL_STATUS:
				return getLPOperationalStatus();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_USAGE_RESTRICTION:
				return getLPUsageRestriction();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_PORT_TYPE:
				return getLPPortType();
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
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_CREATION_CLASS_NAME:
				setPCSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_NAME:
				setPCSystemName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_CREATION_CLASS_NAME:
				setPCCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_DEVICE_ID:
				setPCDeviceID((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_INSTANCE_ID:
				setSHIDInstanceID((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_STORAGE_ID:
				setSHIDStorageID((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHIDID_TYPE:
				setSHIDIDType((Integer)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_CREATION_CLASS_NAME:
				setPEPSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CREATION_CLASS_NAME:
				setPEPCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_NAME:
				setPEPSystemName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_NAME:
				setPEPName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_PROTOCOL_IF_TYPE:
				setPEPProtocolIFType((Integer)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_OTHER_TYPE_DESCRIPTION:
				setPEPOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_ROLE:
				setPEPRole((Integer)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CONNECTION_TYPE:
				setPEPConnectionType((Integer)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_INSTANCE_ID:
				setAPInstanceID((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_PRIVILEGE_GRANTED:
				setAPPrivilegeGranted((Boolean)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ACTIVITIES:
				getAPActivities().clear();
				getAPActivities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ELEMENT_NAME:
				setAPElementName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_CREATION_CLASS_NAME:
				setLPSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_NAME:
				setLPSystemName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_CREATION_CLASS_NAME:
				setLPCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_DEVICE_ID:
				setLPDeviceID((String)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_OPERATIONAL_STATUS:
				getLPOperationalStatus().clear();
				getLPOperationalStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_USAGE_RESTRICTION:
				setLPUsageRestriction((Integer)newValue);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_PORT_TYPE:
				setLPPortType((Integer)newValue);
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
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_CREATION_CLASS_NAME:
				setPCSystemCreationClassName(PC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_NAME:
				setPCSystemName(PC_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_CREATION_CLASS_NAME:
				setPCCreationClassName(PC_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_DEVICE_ID:
				setPCDeviceID(PC_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_INSTANCE_ID:
				setSHIDInstanceID(SHID_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_STORAGE_ID:
				setSHIDStorageID(SHID_STORAGE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHIDID_TYPE:
				setSHIDIDType(SHIDID_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_CREATION_CLASS_NAME:
				setPEPSystemCreationClassName(PEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CREATION_CLASS_NAME:
				setPEPCreationClassName(PEP_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_NAME:
				setPEPSystemName(PEP_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_NAME:
				setPEPName(PEP_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_PROTOCOL_IF_TYPE:
				setPEPProtocolIFType(PEP_PROTOCOL_IF_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_OTHER_TYPE_DESCRIPTION:
				setPEPOtherTypeDescription(PEP_OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_ROLE:
				setPEPRole(PEP_ROLE_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CONNECTION_TYPE:
				setPEPConnectionType(PEP_CONNECTION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_INSTANCE_ID:
				setAPInstanceID(AP_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_PRIVILEGE_GRANTED:
				setAPPrivilegeGranted(AP_PRIVILEGE_GRANTED_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ACTIVITIES:
				getAPActivities().clear();
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ELEMENT_NAME:
				setAPElementName(AP_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_CREATION_CLASS_NAME:
				setLPSystemCreationClassName(LP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_NAME:
				setLPSystemName(LP_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_CREATION_CLASS_NAME:
				setLPCreationClassName(LP_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_DEVICE_ID:
				setLPDeviceID(LP_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_OPERATIONAL_STATUS:
				getLPOperationalStatus().clear();
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_USAGE_RESTRICTION:
				setLPUsageRestriction(LP_USAGE_RESTRICTION_EDEFAULT);
				return;
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_PORT_TYPE:
				setLPPortType(LP_PORT_TYPE_EDEFAULT);
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
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_CREATION_CLASS_NAME:
				return PC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? pcSystemCreationClassName != null : !PC_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(pcSystemCreationClassName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_SYSTEM_NAME:
				return PC_SYSTEM_NAME_EDEFAULT == null ? pcSystemName != null : !PC_SYSTEM_NAME_EDEFAULT.equals(pcSystemName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_CREATION_CLASS_NAME:
				return PC_CREATION_CLASS_NAME_EDEFAULT == null ? pcCreationClassName != null : !PC_CREATION_CLASS_NAME_EDEFAULT.equals(pcCreationClassName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PC_DEVICE_ID:
				return PC_DEVICE_ID_EDEFAULT == null ? pcDeviceID != null : !PC_DEVICE_ID_EDEFAULT.equals(pcDeviceID);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_INSTANCE_ID:
				return SHID_INSTANCE_ID_EDEFAULT == null ? shidInstanceID != null : !SHID_INSTANCE_ID_EDEFAULT.equals(shidInstanceID);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHID_STORAGE_ID:
				return SHID_STORAGE_ID_EDEFAULT == null ? shidStorageID != null : !SHID_STORAGE_ID_EDEFAULT.equals(shidStorageID);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__SHIDID_TYPE:
				return SHIDID_TYPE_EDEFAULT == null ? shididType != null : !SHIDID_TYPE_EDEFAULT.equals(shididType);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_CREATION_CLASS_NAME:
				return PEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? pepSystemCreationClassName != null : !PEP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(pepSystemCreationClassName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CREATION_CLASS_NAME:
				return PEP_CREATION_CLASS_NAME_EDEFAULT == null ? pepCreationClassName != null : !PEP_CREATION_CLASS_NAME_EDEFAULT.equals(pepCreationClassName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_SYSTEM_NAME:
				return PEP_SYSTEM_NAME_EDEFAULT == null ? pepSystemName != null : !PEP_SYSTEM_NAME_EDEFAULT.equals(pepSystemName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_NAME:
				return PEP_NAME_EDEFAULT == null ? pepName != null : !PEP_NAME_EDEFAULT.equals(pepName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_PROTOCOL_IF_TYPE:
				return PEP_PROTOCOL_IF_TYPE_EDEFAULT == null ? pepProtocolIFType != null : !PEP_PROTOCOL_IF_TYPE_EDEFAULT.equals(pepProtocolIFType);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_OTHER_TYPE_DESCRIPTION:
				return PEP_OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? pepOtherTypeDescription != null : !PEP_OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(pepOtherTypeDescription);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_ROLE:
				return PEP_ROLE_EDEFAULT == null ? pepRole != null : !PEP_ROLE_EDEFAULT.equals(pepRole);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__PEP_CONNECTION_TYPE:
				return PEP_CONNECTION_TYPE_EDEFAULT == null ? pepConnectionType != null : !PEP_CONNECTION_TYPE_EDEFAULT.equals(pepConnectionType);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_INSTANCE_ID:
				return AP_INSTANCE_ID_EDEFAULT == null ? apInstanceID != null : !AP_INSTANCE_ID_EDEFAULT.equals(apInstanceID);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_PRIVILEGE_GRANTED:
				return AP_PRIVILEGE_GRANTED_EDEFAULT == null ? apPrivilegeGranted != null : !AP_PRIVILEGE_GRANTED_EDEFAULT.equals(apPrivilegeGranted);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ACTIVITIES:
				return apActivities != null && !apActivities.isEmpty();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__AP_ELEMENT_NAME:
				return AP_ELEMENT_NAME_EDEFAULT == null ? apElementName != null : !AP_ELEMENT_NAME_EDEFAULT.equals(apElementName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_CREATION_CLASS_NAME:
				return LP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? lpSystemCreationClassName != null : !LP_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(lpSystemCreationClassName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_SYSTEM_NAME:
				return LP_SYSTEM_NAME_EDEFAULT == null ? lpSystemName != null : !LP_SYSTEM_NAME_EDEFAULT.equals(lpSystemName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_CREATION_CLASS_NAME:
				return LP_CREATION_CLASS_NAME_EDEFAULT == null ? lpCreationClassName != null : !LP_CREATION_CLASS_NAME_EDEFAULT.equals(lpCreationClassName);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_DEVICE_ID:
				return LP_DEVICE_ID_EDEFAULT == null ? lpDeviceID != null : !LP_DEVICE_ID_EDEFAULT.equals(lpDeviceID);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_OPERATIONAL_STATUS:
				return lpOperationalStatus != null && !lpOperationalStatus.isEmpty();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_USAGE_RESTRICTION:
				return LP_USAGE_RESTRICTION_EDEFAULT == null ? lpUsageRestriction != null : !LP_USAGE_RESTRICTION_EDEFAULT.equals(lpUsageRestriction);
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW__LP_PORT_TYPE:
				return LP_PORT_TYPE_EDEFAULT == null ? lpPortType != null : !LP_PORT_TYPE_EDEFAULT.equals(lpPortType);
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
		result.append(" (PCSystemCreationClassName: ");
		result.append(pcSystemCreationClassName);
		result.append(", PCSystemName: ");
		result.append(pcSystemName);
		result.append(", PCCreationClassName: ");
		result.append(pcCreationClassName);
		result.append(", PCDeviceID: ");
		result.append(pcDeviceID);
		result.append(", SHIDInstanceID: ");
		result.append(shidInstanceID);
		result.append(", SHIDStorageID: ");
		result.append(shidStorageID);
		result.append(", SHIDIDType: ");
		result.append(shididType);
		result.append(", PEPSystemCreationClassName: ");
		result.append(pepSystemCreationClassName);
		result.append(", PEPCreationClassName: ");
		result.append(pepCreationClassName);
		result.append(", PEPSystemName: ");
		result.append(pepSystemName);
		result.append(", PEPName: ");
		result.append(pepName);
		result.append(", PEPProtocolIFType: ");
		result.append(pepProtocolIFType);
		result.append(", PEPOtherTypeDescription: ");
		result.append(pepOtherTypeDescription);
		result.append(", PEPRole: ");
		result.append(pepRole);
		result.append(", PEPConnectionType: ");
		result.append(pepConnectionType);
		result.append(", APInstanceID: ");
		result.append(apInstanceID);
		result.append(", APPrivilegeGranted: ");
		result.append(apPrivilegeGranted);
		result.append(", APActivities: ");
		result.append(apActivities);
		result.append(", APElementName: ");
		result.append(apElementName);
		result.append(", LPSystemCreationClassName: ");
		result.append(lpSystemCreationClassName);
		result.append(", LPSystemName: ");
		result.append(lpSystemName);
		result.append(", LPCreationClassName: ");
		result.append(lpCreationClassName);
		result.append(", LPDeviceID: ");
		result.append(lpDeviceID);
		result.append(", LPOperationalStatus: ");
		result.append(lpOperationalStatus);
		result.append(", LPUsageRestriction: ");
		result.append(lpUsageRestriction);
		result.append(", LPPortType: ");
		result.append(lpPortType);
		result.append(')');
		return result.toString();
	}

} //CIM_MappingProtocolControllerViewImpl
