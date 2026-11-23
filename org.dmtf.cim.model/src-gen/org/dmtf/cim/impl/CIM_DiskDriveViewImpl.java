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

import org.dmtf.cim.CIM_DiskDriveView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Disk Drive View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSESystemCreationClassName <em>SE System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSESystemName <em>SE System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSECreationClassName <em>SE Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSEDeviceID <em>SE Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSEBlockSize <em>SE Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSENumberOfBlocks <em>SE Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSEConsumableBlocks <em>SE Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSEExtentStatus <em>SE Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSEOperationalStatus <em>SE Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDSystemCreationClassName <em>DD System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDSystemName <em>DD System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDCreationClassName <em>DD Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDDeviceID <em>DD Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDName <em>DD Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDOperationalStatus <em>DD Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getPPCreationClassName <em>PP Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getPPTag <em>PP Tag</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getPPManufacturer <em>PP Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getPPModel <em>PP Model</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSIInstanceID <em>SI Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSIVersionString <em>SI Version String</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDLocationIndicator <em>DD Location Indicator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getPPSerialNumber <em>PP Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getPPPartNumber <em>PP Part Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSIManufacturer <em>SI Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSIBuildNumber <em>SI Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSIMajorVersion <em>SI Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSIRevisionNumber <em>SI Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getSIMinorVersion <em>SI Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDDiskType <em>DD Disk Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDEncryption <em>DD Encryption</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getDDFormFactor <em>DD Form Factor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveViewImpl#getLPPortType <em>LP Port Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiskDriveViewImpl extends CIM_LogicalDeviceViewImpl implements CIM_DiskDriveView {
	/**
	 * The default value of the '{@link #getSESystemCreationClassName() <em>SE System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSESystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSESystemCreationClassName() <em>SE System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSESystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String seSystemCreationClassName = SE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSESystemName() <em>SE System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSESystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SE_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSESystemName() <em>SE System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSESystemName()
	 * @generated
	 * @ordered
	 */
	protected String seSystemName = SE_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSECreationClassName() <em>SE Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSECreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SE_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSECreationClassName() <em>SE Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSECreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String seCreationClassName = SE_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSEDeviceID() <em>SE Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SE_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSEDeviceID() <em>SE Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String seDeviceID = SE_DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSEBlockSize() <em>SE Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SE_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSEBlockSize() <em>SE Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long seBlockSize = SE_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSENumberOfBlocks() <em>SE Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSENumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long SE_NUMBER_OF_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSENumberOfBlocks() <em>SE Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSENumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long seNumberOfBlocks = SE_NUMBER_OF_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSEConsumableBlocks() <em>SE Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long SE_CONSUMABLE_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSEConsumableBlocks() <em>SE Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long seConsumableBlocks = SE_CONSUMABLE_BLOCKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSEExtentStatus() <em>SE Extent Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEExtentStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> seExtentStatus;

	/**
	 * The cached value of the '{@link #getSEOperationalStatus() <em>SE Operational Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> seOperationalStatus;

	/**
	 * The default value of the '{@link #getDDSystemCreationClassName() <em>DD System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DD_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDSystemCreationClassName() <em>DD System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String ddSystemCreationClassName = DD_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDSystemName() <em>DD System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String DD_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDSystemName() <em>DD System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDSystemName()
	 * @generated
	 * @ordered
	 */
	protected String ddSystemName = DD_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDCreationClassName() <em>DD Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DD_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDCreationClassName() <em>DD Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String ddCreationClassName = DD_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDDeviceID() <em>DD Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DD_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDDeviceID() <em>DD Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String ddDeviceID = DD_DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDName() <em>DD Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDName()
	 * @generated
	 * @ordered
	 */
	protected static final String DD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDName() <em>DD Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDName()
	 * @generated
	 * @ordered
	 */
	protected String ddName = DD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDDOperationalStatus() <em>DD Operational Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> ddOperationalStatus;

	/**
	 * The default value of the '{@link #getPPCreationClassName() <em>PP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPCreationClassName() <em>PP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String ppCreationClassName = PP_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPPTag() <em>PP Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPTag()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPTag() <em>PP Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPTag()
	 * @generated
	 * @ordered
	 */
	protected String ppTag = PP_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPPManufacturer() <em>PP Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPManufacturer() <em>PP Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String ppManufacturer = PP_MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPPModel() <em>PP Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPModel()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPModel() <em>PP Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPModel()
	 * @generated
	 * @ordered
	 */
	protected String ppModel = PP_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIInstanceID() <em>SI Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SI_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIInstanceID() <em>SI Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String siInstanceID = SI_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIVersionString() <em>SI Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIVersionString()
	 * @generated
	 * @ordered
	 */
	protected static final String SI_VERSION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIVersionString() <em>SI Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIVersionString()
	 * @generated
	 * @ordered
	 */
	protected String siVersionString = SI_VERSION_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDLocationIndicator() <em>DD Location Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDLocationIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DD_LOCATION_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDLocationIndicator() <em>DD Location Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDLocationIndicator()
	 * @generated
	 * @ordered
	 */
	protected Integer ddLocationIndicator = DD_LOCATION_INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPPSerialNumber() <em>PP Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPSerialNumber() <em>PP Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String ppSerialNumber = PP_SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPPPartNumber() <em>PP Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPPartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_PART_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPPartNumber() <em>PP Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPPartNumber()
	 * @generated
	 * @ordered
	 */
	protected String ppPartNumber = PP_PART_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIManufacturer() <em>SI Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String SI_MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIManufacturer() <em>SI Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String siManufacturer = SI_MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIBuildNumber() <em>SI Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SI_BUILD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIBuildNumber() <em>SI Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer siBuildNumber = SI_BUILD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIMajorVersion() <em>SI Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SI_MAJOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIMajorVersion() <em>SI Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer siMajorVersion = SI_MAJOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIRevisionNumber() <em>SI Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SI_REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIRevisionNumber() <em>SI Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer siRevisionNumber = SI_REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIMinorVersion() <em>SI Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SI_MINOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIMinorVersion() <em>SI Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer siMinorVersion = SI_MINOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDDiskType() <em>DD Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDDiskType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DD_DISK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDDiskType() <em>DD Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDDiskType()
	 * @generated
	 * @ordered
	 */
	protected Integer ddDiskType = DD_DISK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDEncryption() <em>DD Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDEncryption()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DD_ENCRYPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDEncryption() <em>DD Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDEncryption()
	 * @generated
	 * @ordered
	 */
	protected Integer ddEncryption = DD_ENCRYPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDFormFactor() <em>DD Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDFormFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DD_FORM_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDFormFactor() <em>DD Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDFormFactor()
	 * @generated
	 * @ordered
	 */
	protected Integer ddFormFactor = DD_FORM_FACTOR_EDEFAULT;

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
	protected CIM_DiskDriveViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiskDriveView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSESystemCreationClassName() {
		return seSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSESystemCreationClassName(String newSESystemCreationClassName) {
		String oldSESystemCreationClassName = seSystemCreationClassName;
		seSystemCreationClassName = newSESystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_CREATION_CLASS_NAME, oldSESystemCreationClassName, seSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSESystemName() {
		return seSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSESystemName(String newSESystemName) {
		String oldSESystemName = seSystemName;
		seSystemName = newSESystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_NAME, oldSESystemName, seSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSECreationClassName() {
		return seCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSECreationClassName(String newSECreationClassName) {
		String oldSECreationClassName = seCreationClassName;
		seCreationClassName = newSECreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SE_CREATION_CLASS_NAME, oldSECreationClassName, seCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSEDeviceID() {
		return seDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSEDeviceID(String newSEDeviceID) {
		String oldSEDeviceID = seDeviceID;
		seDeviceID = newSEDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SE_DEVICE_ID, oldSEDeviceID, seDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSEBlockSize() {
		return seBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSEBlockSize(Long newSEBlockSize) {
		Long oldSEBlockSize = seBlockSize;
		seBlockSize = newSEBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SE_BLOCK_SIZE, oldSEBlockSize, seBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSENumberOfBlocks() {
		return seNumberOfBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSENumberOfBlocks(Long newSENumberOfBlocks) {
		Long oldSENumberOfBlocks = seNumberOfBlocks;
		seNumberOfBlocks = newSENumberOfBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SE_NUMBER_OF_BLOCKS, oldSENumberOfBlocks, seNumberOfBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSEConsumableBlocks() {
		return seConsumableBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSEConsumableBlocks(Long newSEConsumableBlocks) {
		Long oldSEConsumableBlocks = seConsumableBlocks;
		seConsumableBlocks = newSEConsumableBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SE_CONSUMABLE_BLOCKS, oldSEConsumableBlocks, seConsumableBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSEExtentStatus() {
		if (seExtentStatus == null) {
			seExtentStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DISK_DRIVE_VIEW__SE_EXTENT_STATUS);
		}
		return seExtentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSEOperationalStatus() {
		if (seOperationalStatus == null) {
			seOperationalStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DISK_DRIVE_VIEW__SE_OPERATIONAL_STATUS);
		}
		return seOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDDSystemCreationClassName() {
		return ddSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDSystemCreationClassName(String newDDSystemCreationClassName) {
		String oldDDSystemCreationClassName = ddSystemCreationClassName;
		ddSystemCreationClassName = newDDSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_CREATION_CLASS_NAME, oldDDSystemCreationClassName, ddSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDDSystemName() {
		return ddSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDSystemName(String newDDSystemName) {
		String oldDDSystemName = ddSystemName;
		ddSystemName = newDDSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_NAME, oldDDSystemName, ddSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDDCreationClassName() {
		return ddCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDCreationClassName(String newDDCreationClassName) {
		String oldDDCreationClassName = ddCreationClassName;
		ddCreationClassName = newDDCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__DD_CREATION_CLASS_NAME, oldDDCreationClassName, ddCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDDDeviceID() {
		return ddDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDDeviceID(String newDDDeviceID) {
		String oldDDDeviceID = ddDeviceID;
		ddDeviceID = newDDDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__DD_DEVICE_ID, oldDDDeviceID, ddDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDDName() {
		return ddName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDName(String newDDName) {
		String oldDDName = ddName;
		ddName = newDDName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__DD_NAME, oldDDName, ddName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDDOperationalStatus() {
		if (ddOperationalStatus == null) {
			ddOperationalStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DISK_DRIVE_VIEW__DD_OPERATIONAL_STATUS);
		}
		return ddOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPPCreationClassName() {
		return ppCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPCreationClassName(String newPPCreationClassName) {
		String oldPPCreationClassName = ppCreationClassName;
		ppCreationClassName = newPPCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__PP_CREATION_CLASS_NAME, oldPPCreationClassName, ppCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPPTag() {
		return ppTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPTag(String newPPTag) {
		String oldPPTag = ppTag;
		ppTag = newPPTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__PP_TAG, oldPPTag, ppTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPPManufacturer() {
		return ppManufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPManufacturer(String newPPManufacturer) {
		String oldPPManufacturer = ppManufacturer;
		ppManufacturer = newPPManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__PP_MANUFACTURER, oldPPManufacturer, ppManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPPModel() {
		return ppModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPModel(String newPPModel) {
		String oldPPModel = ppModel;
		ppModel = newPPModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__PP_MODEL, oldPPModel, ppModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSIInstanceID() {
		return siInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIInstanceID(String newSIInstanceID) {
		String oldSIInstanceID = siInstanceID;
		siInstanceID = newSIInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SI_INSTANCE_ID, oldSIInstanceID, siInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSIVersionString() {
		return siVersionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIVersionString(String newSIVersionString) {
		String oldSIVersionString = siVersionString;
		siVersionString = newSIVersionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SI_VERSION_STRING, oldSIVersionString, siVersionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDDLocationIndicator() {
		return ddLocationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDLocationIndicator(Integer newDDLocationIndicator) {
		Integer oldDDLocationIndicator = ddLocationIndicator;
		ddLocationIndicator = newDDLocationIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__DD_LOCATION_INDICATOR, oldDDLocationIndicator, ddLocationIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPPSerialNumber() {
		return ppSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPSerialNumber(String newPPSerialNumber) {
		String oldPPSerialNumber = ppSerialNumber;
		ppSerialNumber = newPPSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__PP_SERIAL_NUMBER, oldPPSerialNumber, ppSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPPPartNumber() {
		return ppPartNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPPartNumber(String newPPPartNumber) {
		String oldPPPartNumber = ppPartNumber;
		ppPartNumber = newPPPartNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__PP_PART_NUMBER, oldPPPartNumber, ppPartNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSIManufacturer() {
		return siManufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIManufacturer(String newSIManufacturer) {
		String oldSIManufacturer = siManufacturer;
		siManufacturer = newSIManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SI_MANUFACTURER, oldSIManufacturer, siManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSIBuildNumber() {
		return siBuildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIBuildNumber(Integer newSIBuildNumber) {
		Integer oldSIBuildNumber = siBuildNumber;
		siBuildNumber = newSIBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SI_BUILD_NUMBER, oldSIBuildNumber, siBuildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSIMajorVersion() {
		return siMajorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIMajorVersion(Integer newSIMajorVersion) {
		Integer oldSIMajorVersion = siMajorVersion;
		siMajorVersion = newSIMajorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SI_MAJOR_VERSION, oldSIMajorVersion, siMajorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSIRevisionNumber() {
		return siRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIRevisionNumber(Integer newSIRevisionNumber) {
		Integer oldSIRevisionNumber = siRevisionNumber;
		siRevisionNumber = newSIRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SI_REVISION_NUMBER, oldSIRevisionNumber, siRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSIMinorVersion() {
		return siMinorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIMinorVersion(Integer newSIMinorVersion) {
		Integer oldSIMinorVersion = siMinorVersion;
		siMinorVersion = newSIMinorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__SI_MINOR_VERSION, oldSIMinorVersion, siMinorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDDDiskType() {
		return ddDiskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDDiskType(Integer newDDDiskType) {
		Integer oldDDDiskType = ddDiskType;
		ddDiskType = newDDDiskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__DD_DISK_TYPE, oldDDDiskType, ddDiskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDDEncryption() {
		return ddEncryption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDEncryption(Integer newDDEncryption) {
		Integer oldDDEncryption = ddEncryption;
		ddEncryption = newDDEncryption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__DD_ENCRYPTION, oldDDEncryption, ddEncryption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDDFormFactor() {
		return ddFormFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDFormFactor(Integer newDDFormFactor) {
		Integer oldDDFormFactor = ddFormFactor;
		ddFormFactor = newDDFormFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__DD_FORM_FACTOR, oldDDFormFactor, ddFormFactor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_VIEW__LP_PORT_TYPE, oldLPPortType, lpPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_CREATION_CLASS_NAME:
				return getSESystemCreationClassName();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_NAME:
				return getSESystemName();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_CREATION_CLASS_NAME:
				return getSECreationClassName();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_DEVICE_ID:
				return getSEDeviceID();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_BLOCK_SIZE:
				return getSEBlockSize();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_NUMBER_OF_BLOCKS:
				return getSENumberOfBlocks();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_CONSUMABLE_BLOCKS:
				return getSEConsumableBlocks();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_EXTENT_STATUS:
				return getSEExtentStatus();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_OPERATIONAL_STATUS:
				return getSEOperationalStatus();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_CREATION_CLASS_NAME:
				return getDDSystemCreationClassName();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_NAME:
				return getDDSystemName();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_CREATION_CLASS_NAME:
				return getDDCreationClassName();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_DEVICE_ID:
				return getDDDeviceID();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_NAME:
				return getDDName();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_OPERATIONAL_STATUS:
				return getDDOperationalStatus();
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_CREATION_CLASS_NAME:
				return getPPCreationClassName();
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_TAG:
				return getPPTag();
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_MANUFACTURER:
				return getPPManufacturer();
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_MODEL:
				return getPPModel();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_INSTANCE_ID:
				return getSIInstanceID();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_VERSION_STRING:
				return getSIVersionString();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_LOCATION_INDICATOR:
				return getDDLocationIndicator();
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_SERIAL_NUMBER:
				return getPPSerialNumber();
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_PART_NUMBER:
				return getPPPartNumber();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MANUFACTURER:
				return getSIManufacturer();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_BUILD_NUMBER:
				return getSIBuildNumber();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MAJOR_VERSION:
				return getSIMajorVersion();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_REVISION_NUMBER:
				return getSIRevisionNumber();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MINOR_VERSION:
				return getSIMinorVersion();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_DISK_TYPE:
				return getDDDiskType();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_ENCRYPTION:
				return getDDEncryption();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_FORM_FACTOR:
				return getDDFormFactor();
			case CimPackage.CIM_DISK_DRIVE_VIEW__LP_PORT_TYPE:
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
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_CREATION_CLASS_NAME:
				setSESystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_NAME:
				setSESystemName((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_CREATION_CLASS_NAME:
				setSECreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_DEVICE_ID:
				setSEDeviceID((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_BLOCK_SIZE:
				setSEBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_NUMBER_OF_BLOCKS:
				setSENumberOfBlocks((Long)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_CONSUMABLE_BLOCKS:
				setSEConsumableBlocks((Long)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_EXTENT_STATUS:
				getSEExtentStatus().clear();
				getSEExtentStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_OPERATIONAL_STATUS:
				getSEOperationalStatus().clear();
				getSEOperationalStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_CREATION_CLASS_NAME:
				setDDSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_NAME:
				setDDSystemName((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_CREATION_CLASS_NAME:
				setDDCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_DEVICE_ID:
				setDDDeviceID((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_NAME:
				setDDName((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_OPERATIONAL_STATUS:
				getDDOperationalStatus().clear();
				getDDOperationalStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_CREATION_CLASS_NAME:
				setPPCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_TAG:
				setPPTag((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_MANUFACTURER:
				setPPManufacturer((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_MODEL:
				setPPModel((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_INSTANCE_ID:
				setSIInstanceID((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_VERSION_STRING:
				setSIVersionString((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_LOCATION_INDICATOR:
				setDDLocationIndicator((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_SERIAL_NUMBER:
				setPPSerialNumber((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_PART_NUMBER:
				setPPPartNumber((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MANUFACTURER:
				setSIManufacturer((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_BUILD_NUMBER:
				setSIBuildNumber((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MAJOR_VERSION:
				setSIMajorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_REVISION_NUMBER:
				setSIRevisionNumber((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MINOR_VERSION:
				setSIMinorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_DISK_TYPE:
				setDDDiskType((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_ENCRYPTION:
				setDDEncryption((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_FORM_FACTOR:
				setDDFormFactor((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__LP_PORT_TYPE:
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
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_CREATION_CLASS_NAME:
				setSESystemCreationClassName(SE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_NAME:
				setSESystemName(SE_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_CREATION_CLASS_NAME:
				setSECreationClassName(SE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_DEVICE_ID:
				setSEDeviceID(SE_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_BLOCK_SIZE:
				setSEBlockSize(SE_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_NUMBER_OF_BLOCKS:
				setSENumberOfBlocks(SE_NUMBER_OF_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_CONSUMABLE_BLOCKS:
				setSEConsumableBlocks(SE_CONSUMABLE_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_EXTENT_STATUS:
				getSEExtentStatus().clear();
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_OPERATIONAL_STATUS:
				getSEOperationalStatus().clear();
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_CREATION_CLASS_NAME:
				setDDSystemCreationClassName(DD_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_NAME:
				setDDSystemName(DD_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_CREATION_CLASS_NAME:
				setDDCreationClassName(DD_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_DEVICE_ID:
				setDDDeviceID(DD_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_NAME:
				setDDName(DD_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_OPERATIONAL_STATUS:
				getDDOperationalStatus().clear();
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_CREATION_CLASS_NAME:
				setPPCreationClassName(PP_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_TAG:
				setPPTag(PP_TAG_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_MANUFACTURER:
				setPPManufacturer(PP_MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_MODEL:
				setPPModel(PP_MODEL_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_INSTANCE_ID:
				setSIInstanceID(SI_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_VERSION_STRING:
				setSIVersionString(SI_VERSION_STRING_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_LOCATION_INDICATOR:
				setDDLocationIndicator(DD_LOCATION_INDICATOR_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_SERIAL_NUMBER:
				setPPSerialNumber(PP_SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_PART_NUMBER:
				setPPPartNumber(PP_PART_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MANUFACTURER:
				setSIManufacturer(SI_MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_BUILD_NUMBER:
				setSIBuildNumber(SI_BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MAJOR_VERSION:
				setSIMajorVersion(SI_MAJOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_REVISION_NUMBER:
				setSIRevisionNumber(SI_REVISION_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MINOR_VERSION:
				setSIMinorVersion(SI_MINOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_DISK_TYPE:
				setDDDiskType(DD_DISK_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_ENCRYPTION:
				setDDEncryption(DD_ENCRYPTION_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_FORM_FACTOR:
				setDDFormFactor(DD_FORM_FACTOR_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_VIEW__LP_PORT_TYPE:
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
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_CREATION_CLASS_NAME:
				return SE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? seSystemCreationClassName != null : !SE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(seSystemCreationClassName);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_SYSTEM_NAME:
				return SE_SYSTEM_NAME_EDEFAULT == null ? seSystemName != null : !SE_SYSTEM_NAME_EDEFAULT.equals(seSystemName);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_CREATION_CLASS_NAME:
				return SE_CREATION_CLASS_NAME_EDEFAULT == null ? seCreationClassName != null : !SE_CREATION_CLASS_NAME_EDEFAULT.equals(seCreationClassName);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_DEVICE_ID:
				return SE_DEVICE_ID_EDEFAULT == null ? seDeviceID != null : !SE_DEVICE_ID_EDEFAULT.equals(seDeviceID);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_BLOCK_SIZE:
				return SE_BLOCK_SIZE_EDEFAULT == null ? seBlockSize != null : !SE_BLOCK_SIZE_EDEFAULT.equals(seBlockSize);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_NUMBER_OF_BLOCKS:
				return SE_NUMBER_OF_BLOCKS_EDEFAULT == null ? seNumberOfBlocks != null : !SE_NUMBER_OF_BLOCKS_EDEFAULT.equals(seNumberOfBlocks);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_CONSUMABLE_BLOCKS:
				return SE_CONSUMABLE_BLOCKS_EDEFAULT == null ? seConsumableBlocks != null : !SE_CONSUMABLE_BLOCKS_EDEFAULT.equals(seConsumableBlocks);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_EXTENT_STATUS:
				return seExtentStatus != null && !seExtentStatus.isEmpty();
			case CimPackage.CIM_DISK_DRIVE_VIEW__SE_OPERATIONAL_STATUS:
				return seOperationalStatus != null && !seOperationalStatus.isEmpty();
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_CREATION_CLASS_NAME:
				return DD_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? ddSystemCreationClassName != null : !DD_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(ddSystemCreationClassName);
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_SYSTEM_NAME:
				return DD_SYSTEM_NAME_EDEFAULT == null ? ddSystemName != null : !DD_SYSTEM_NAME_EDEFAULT.equals(ddSystemName);
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_CREATION_CLASS_NAME:
				return DD_CREATION_CLASS_NAME_EDEFAULT == null ? ddCreationClassName != null : !DD_CREATION_CLASS_NAME_EDEFAULT.equals(ddCreationClassName);
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_DEVICE_ID:
				return DD_DEVICE_ID_EDEFAULT == null ? ddDeviceID != null : !DD_DEVICE_ID_EDEFAULT.equals(ddDeviceID);
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_NAME:
				return DD_NAME_EDEFAULT == null ? ddName != null : !DD_NAME_EDEFAULT.equals(ddName);
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_OPERATIONAL_STATUS:
				return ddOperationalStatus != null && !ddOperationalStatus.isEmpty();
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_CREATION_CLASS_NAME:
				return PP_CREATION_CLASS_NAME_EDEFAULT == null ? ppCreationClassName != null : !PP_CREATION_CLASS_NAME_EDEFAULT.equals(ppCreationClassName);
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_TAG:
				return PP_TAG_EDEFAULT == null ? ppTag != null : !PP_TAG_EDEFAULT.equals(ppTag);
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_MANUFACTURER:
				return PP_MANUFACTURER_EDEFAULT == null ? ppManufacturer != null : !PP_MANUFACTURER_EDEFAULT.equals(ppManufacturer);
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_MODEL:
				return PP_MODEL_EDEFAULT == null ? ppModel != null : !PP_MODEL_EDEFAULT.equals(ppModel);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_INSTANCE_ID:
				return SI_INSTANCE_ID_EDEFAULT == null ? siInstanceID != null : !SI_INSTANCE_ID_EDEFAULT.equals(siInstanceID);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_VERSION_STRING:
				return SI_VERSION_STRING_EDEFAULT == null ? siVersionString != null : !SI_VERSION_STRING_EDEFAULT.equals(siVersionString);
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_LOCATION_INDICATOR:
				return DD_LOCATION_INDICATOR_EDEFAULT == null ? ddLocationIndicator != null : !DD_LOCATION_INDICATOR_EDEFAULT.equals(ddLocationIndicator);
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_SERIAL_NUMBER:
				return PP_SERIAL_NUMBER_EDEFAULT == null ? ppSerialNumber != null : !PP_SERIAL_NUMBER_EDEFAULT.equals(ppSerialNumber);
			case CimPackage.CIM_DISK_DRIVE_VIEW__PP_PART_NUMBER:
				return PP_PART_NUMBER_EDEFAULT == null ? ppPartNumber != null : !PP_PART_NUMBER_EDEFAULT.equals(ppPartNumber);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MANUFACTURER:
				return SI_MANUFACTURER_EDEFAULT == null ? siManufacturer != null : !SI_MANUFACTURER_EDEFAULT.equals(siManufacturer);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_BUILD_NUMBER:
				return SI_BUILD_NUMBER_EDEFAULT == null ? siBuildNumber != null : !SI_BUILD_NUMBER_EDEFAULT.equals(siBuildNumber);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MAJOR_VERSION:
				return SI_MAJOR_VERSION_EDEFAULT == null ? siMajorVersion != null : !SI_MAJOR_VERSION_EDEFAULT.equals(siMajorVersion);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_REVISION_NUMBER:
				return SI_REVISION_NUMBER_EDEFAULT == null ? siRevisionNumber != null : !SI_REVISION_NUMBER_EDEFAULT.equals(siRevisionNumber);
			case CimPackage.CIM_DISK_DRIVE_VIEW__SI_MINOR_VERSION:
				return SI_MINOR_VERSION_EDEFAULT == null ? siMinorVersion != null : !SI_MINOR_VERSION_EDEFAULT.equals(siMinorVersion);
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_DISK_TYPE:
				return DD_DISK_TYPE_EDEFAULT == null ? ddDiskType != null : !DD_DISK_TYPE_EDEFAULT.equals(ddDiskType);
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_ENCRYPTION:
				return DD_ENCRYPTION_EDEFAULT == null ? ddEncryption != null : !DD_ENCRYPTION_EDEFAULT.equals(ddEncryption);
			case CimPackage.CIM_DISK_DRIVE_VIEW__DD_FORM_FACTOR:
				return DD_FORM_FACTOR_EDEFAULT == null ? ddFormFactor != null : !DD_FORM_FACTOR_EDEFAULT.equals(ddFormFactor);
			case CimPackage.CIM_DISK_DRIVE_VIEW__LP_PORT_TYPE:
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
		result.append(" (SESystemCreationClassName: ");
		result.append(seSystemCreationClassName);
		result.append(", SESystemName: ");
		result.append(seSystemName);
		result.append(", SECreationClassName: ");
		result.append(seCreationClassName);
		result.append(", SEDeviceID: ");
		result.append(seDeviceID);
		result.append(", SEBlockSize: ");
		result.append(seBlockSize);
		result.append(", SENumberOfBlocks: ");
		result.append(seNumberOfBlocks);
		result.append(", SEConsumableBlocks: ");
		result.append(seConsumableBlocks);
		result.append(", SEExtentStatus: ");
		result.append(seExtentStatus);
		result.append(", SEOperationalStatus: ");
		result.append(seOperationalStatus);
		result.append(", DDSystemCreationClassName: ");
		result.append(ddSystemCreationClassName);
		result.append(", DDSystemName: ");
		result.append(ddSystemName);
		result.append(", DDCreationClassName: ");
		result.append(ddCreationClassName);
		result.append(", DDDeviceID: ");
		result.append(ddDeviceID);
		result.append(", DDName: ");
		result.append(ddName);
		result.append(", DDOperationalStatus: ");
		result.append(ddOperationalStatus);
		result.append(", PPCreationClassName: ");
		result.append(ppCreationClassName);
		result.append(", PPTag: ");
		result.append(ppTag);
		result.append(", PPManufacturer: ");
		result.append(ppManufacturer);
		result.append(", PPModel: ");
		result.append(ppModel);
		result.append(", SIInstanceID: ");
		result.append(siInstanceID);
		result.append(", SIVersionString: ");
		result.append(siVersionString);
		result.append(", DDLocationIndicator: ");
		result.append(ddLocationIndicator);
		result.append(", PPSerialNumber: ");
		result.append(ppSerialNumber);
		result.append(", PPPartNumber: ");
		result.append(ppPartNumber);
		result.append(", SIManufacturer: ");
		result.append(siManufacturer);
		result.append(", SIBuildNumber: ");
		result.append(siBuildNumber);
		result.append(", SIMajorVersion: ");
		result.append(siMajorVersion);
		result.append(", SIRevisionNumber: ");
		result.append(siRevisionNumber);
		result.append(", SIMinorVersion: ");
		result.append(siMinorVersion);
		result.append(", DDDiskType: ");
		result.append(ddDiskType);
		result.append(", DDEncryption: ");
		result.append(ddEncryption);
		result.append(", DDFormFactor: ");
		result.append(ddFormFactor);
		result.append(", LPPortType: ");
		result.append(lpPortType);
		result.append(')');
		return result.toString();
	}

} //CIM_DiskDriveViewImpl
