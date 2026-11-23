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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Disk Drive View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_DiskDriveView instance is a view that is derived from CIM_StorageExtent, CIM_MediaPresent, CIM_DiskDrive, CIM_Realizes, CIM_PhysicalPackage, CIM_ElementSoftwareIdentity and CIM_SoftwareIdentity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSESystemCreationClassName <em>SE System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSESystemName <em>SE System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSECreationClassName <em>SE Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSEDeviceID <em>SE Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSEBlockSize <em>SE Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSENumberOfBlocks <em>SE Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSEConsumableBlocks <em>SE Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSEExtentStatus <em>SE Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSEOperationalStatus <em>SE Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDSystemCreationClassName <em>DD System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDSystemName <em>DD System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDCreationClassName <em>DD Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDDeviceID <em>DD Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDName <em>DD Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDOperationalStatus <em>DD Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getPPCreationClassName <em>PP Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getPPTag <em>PP Tag</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getPPManufacturer <em>PP Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getPPModel <em>PP Model</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSIInstanceID <em>SI Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSIVersionString <em>SI Version String</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDLocationIndicator <em>DD Location Indicator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getPPSerialNumber <em>PP Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getPPPartNumber <em>PP Part Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSIManufacturer <em>SI Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSIBuildNumber <em>SI Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSIMajorVersion <em>SI Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSIRevisionNumber <em>SI Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getSIMinorVersion <em>SI Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDDiskType <em>DD Disk Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDEncryption <em>DD Encryption</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getDDFormFactor <em>DD Form Factor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveView#getLPPortType <em>LP Port Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::Views' keys='DDSystemCreationClassName,DDSystemName,DDCreationClassName,DDDeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiskDriveView extends CIM_LogicalDeviceView {
	/**
	 * Returns the value of the '<em><b>SE System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName for the StorageExtent of the Disk Drive as reported in the underlying primordial StorageExtent instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SE System Creation Class Name</em>' attribute.
	 * @see #setSESystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SESystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageExtent.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getSESystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSESystemCreationClassName <em>SE System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SE System Creation Class Name</em>' attribute.
	 * @see #getSESystemCreationClassName()
	 * @generated
	 */
	void setSESystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SE System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName for the StorageExtent of the Disk Drive as reported in the underlying primordial StorageExtent instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SE System Name</em>' attribute.
	 * @see #setSESystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SESystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageExtent.SystemName\"]'"
	 * @generated
	 */
	String getSESystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSESystemName <em>SE System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SE System Name</em>' attribute.
	 * @see #getSESystemName()
	 * @generated
	 */
	void setSESystemName(String value);

	/**
	 * Returns the value of the '<em><b>SE Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the StorageExtent of the Disk Drive as reported in the underlying primordial StorageExtent instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SE Creation Class Name</em>' attribute.
	 * @see #setSECreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SECreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageExtent.CreationClassName\"]'"
	 * @generated
	 */
	String getSECreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSECreationClassName <em>SE Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SE Creation Class Name</em>' attribute.
	 * @see #getSECreationClassName()
	 * @generated
	 */
	void setSECreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SE Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceID for the StorageExtent of the Disk Drive as reported in the underlying primordial StorageExtent instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SE Device ID</em>' attribute.
	 * @see #setSEDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SEDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageExtent.DeviceID\"]'"
	 * @generated
	 */
	String getSEDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSEDeviceID <em>SE Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SE Device ID</em>' attribute.
	 * @see #getSEDeviceID()
	 * @generated
	 */
	void setSEDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>SE Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BlockSize for the StorageExtent of the Disk Drive as reported in the underlying primordial StorageExtent instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SE Block Size</em>' attribute.
	 * @see #setSEBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SEBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageExtent.BlockSize\"]'"
	 * @generated
	 */
	Long getSEBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSEBlockSize <em>SE Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SE Block Size</em>' attribute.
	 * @see #getSEBlockSize()
	 * @generated
	 */
	void setSEBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>SE Number Of Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NumberOfBlocks for the StorageExtent of the Disk Drive as reported in the underlying primordial StorageExtent instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SE Number Of Blocks</em>' attribute.
	 * @see #setSENumberOfBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SENumberOfBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageExtent.NumberOfBlocks\"]'"
	 * @generated
	 */
	Long getSENumberOfBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSENumberOfBlocks <em>SE Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SE Number Of Blocks</em>' attribute.
	 * @see #getSENumberOfBlocks()
	 * @generated
	 */
	void setSENumberOfBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>SE Consumable Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConsumableBlocks for the StorageExtent of the Disk Drive as reported in the underlying primordial StorageExtent instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SE Consumable Blocks</em>' attribute.
	 * @see #setSEConsumableBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SEConsumableBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageExtent.ConsumableBlocks\"]'"
	 * @generated
	 */
	Long getSEConsumableBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSEConsumableBlocks <em>SE Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SE Consumable Blocks</em>' attribute.
	 * @see #getSEConsumableBlocks()
	 * @generated
	 */
	void setSEConsumableBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>SE Extent Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentStatus for the StorageExtent of the Disk Drive as reported in the underlying primordial StorageExtent instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SE Extent Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SEExtentStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageExtent.ExtentStatus\"]'"
	 * @generated
	 */
	EList<Integer> getSEExtentStatus();

	/**
	 * Returns the value of the '<em><b>SE Operational Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OperationalStatus for the StorageExtent of the Disk Drive as reported in the underlying primordial StorageExtent instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SE Operational Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SEOperationalStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageExtent.OperationalStatus\"]'"
	 * @generated
	 */
	EList<Integer> getSEOperationalStatus();

	/**
	 * Returns the value of the '<em><b>DD System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD System Creation Class Name</em>' attribute.
	 * @see #setDDSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_DiskDrive.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getDDSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getDDSystemCreationClassName <em>DD System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD System Creation Class Name</em>' attribute.
	 * @see #getDDSystemCreationClassName()
	 * @generated
	 */
	void setDDSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>DD System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD System Name</em>' attribute.
	 * @see #setDDSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_DiskDrive.SystemName\"]'"
	 * @generated
	 */
	String getDDSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getDDSystemName <em>DD System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD System Name</em>' attribute.
	 * @see #getDDSystemName()
	 * @generated
	 */
	void setDDSystemName(String value);

	/**
	 * Returns the value of the '<em><b>DD Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD Creation Class Name</em>' attribute.
	 * @see #setDDCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_DiskDrive.CreationClassName\"]'"
	 * @generated
	 */
	String getDDCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getDDCreationClassName <em>DD Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD Creation Class Name</em>' attribute.
	 * @see #getDDCreationClassName()
	 * @generated
	 */
	void setDDCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>DD Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceID for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD Device ID</em>' attribute.
	 * @see #setDDDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_DiskDrive.DeviceID\"]'"
	 * @generated
	 */
	String getDDDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getDDDeviceID <em>DD Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD Device ID</em>' attribute.
	 * @see #getDDDeviceID()
	 * @generated
	 */
	void setDDDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>DD Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD Name</em>' attribute.
	 * @see #setDDName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DiskDrive.Name\"]'"
	 * @generated
	 */
	String getDDName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getDDName <em>DD Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD Name</em>' attribute.
	 * @see #getDDName()
	 * @generated
	 */
	void setDDName(String value);

	/**
	 * Returns the value of the '<em><b>DD Operational Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OperationalStatus for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD Operational Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDOperationalStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_DiskDrive.OperationalStatus\"]'"
	 * @generated
	 */
	EList<Integer> getDDOperationalStatus();

	/**
	 * Returns the value of the '<em><b>PP Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the PhysicalPackage of the Disk Drive as reported in the underlying PhysicalPackage instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PP Creation Class Name</em>' attribute.
	 * @see #setPPCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_PPCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalPackage.CreationClassName\"]'"
	 * @generated
	 */
	String getPPCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getPPCreationClassName <em>PP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PP Creation Class Name</em>' attribute.
	 * @see #getPPCreationClassName()
	 * @generated
	 */
	void setPPCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>PP Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Tag for the PhysicalPackage of the Disk Drive as reported in the underlying PhysicalPackage instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PP Tag</em>' attribute.
	 * @see #setPPTag(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_PPTag()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalPackage.Tag\"]'"
	 * @generated
	 */
	String getPPTag();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getPPTag <em>PP Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PP Tag</em>' attribute.
	 * @see #getPPTag()
	 * @generated
	 */
	void setPPTag(String value);

	/**
	 * Returns the value of the '<em><b>PP Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Manufacturer for the PhysicalPackage of the Disk Drive as reported in the underlying PhysicalPackage instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PP Manufacturer</em>' attribute.
	 * @see #setPPManufacturer(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_PPManufacturer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalPackage.Manufacturer\"]'"
	 * @generated
	 */
	String getPPManufacturer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getPPManufacturer <em>PP Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PP Manufacturer</em>' attribute.
	 * @see #getPPManufacturer()
	 * @generated
	 */
	void setPPManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>PP Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Model for the PhysicalPackage of the Disk Drive as reported in the underlying PhysicalPackage instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PP Model</em>' attribute.
	 * @see #setPPModel(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_PPModel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalPackage.Model\"]'"
	 * @generated
	 */
	String getPPModel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getPPModel <em>PP Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PP Model</em>' attribute.
	 * @see #getPPModel()
	 * @generated
	 */
	void setPPModel(String value);

	/**
	 * Returns the value of the '<em><b>SI Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID for the SoftwareIdentity of the Disk Drive as reported in the underlying SoftwareIdentity instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SI Instance ID</em>' attribute.
	 * @see #setSIInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SIInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SoftwareIdentity.InstanceID\"]'"
	 * @generated
	 */
	String getSIInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSIInstanceID <em>SI Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SI Instance ID</em>' attribute.
	 * @see #getSIInstanceID()
	 * @generated
	 */
	void setSIInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>SI Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The VersionString for the SoftwareIdentity of the Disk Drive as reported in the underlying SoftwareIdentity instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SI Version String</em>' attribute.
	 * @see #setSIVersionString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SIVersionString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SoftwareIdentity.VersionString\"]'"
	 * @generated
	 */
	String getSIVersionString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSIVersionString <em>SI Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SI Version String</em>' attribute.
	 * @see #getSIVersionString()
	 * @generated
	 */
	void setSIVersionString(String value);

	/**
	 * Returns the value of the '<em><b>DD Location Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LocationIndicator for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD Location Indicator</em>' attribute.
	 * @see #setDDLocationIndicator(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDLocationIndicator()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_DiskDrive.LocationIndicator\"]'"
	 * @generated
	 */
	Integer getDDLocationIndicator();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getDDLocationIndicator <em>DD Location Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD Location Indicator</em>' attribute.
	 * @see #getDDLocationIndicator()
	 * @generated
	 */
	void setDDLocationIndicator(Integer value);

	/**
	 * Returns the value of the '<em><b>PP Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SerialNumber for the PhysicalPackage of the Disk Drive as reported in the underlying PhysicalPackage instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PP Serial Number</em>' attribute.
	 * @see #setPPSerialNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_PPSerialNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalPackage.SerialNumber\"]'"
	 * @generated
	 */
	String getPPSerialNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getPPSerialNumber <em>PP Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PP Serial Number</em>' attribute.
	 * @see #getPPSerialNumber()
	 * @generated
	 */
	void setPPSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>PP Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PartNumber for the PhysicalPackage of the Disk Drive as reported in the underlying PhysicalPackage instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PP Part Number</em>' attribute.
	 * @see #setPPPartNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_PPPartNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalPackage.PartNumber\"]'"
	 * @generated
	 */
	String getPPPartNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getPPPartNumber <em>PP Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PP Part Number</em>' attribute.
	 * @see #getPPPartNumber()
	 * @generated
	 */
	void setPPPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>SI Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Manufacturer for the SoftwareIdentity of the Disk Drive as reported in the underlying SoftwareIdentity instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SI Manufacturer</em>' attribute.
	 * @see #setSIManufacturer(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SIManufacturer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SoftwareIdentity.Manufacturer\"]'"
	 * @generated
	 */
	String getSIManufacturer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSIManufacturer <em>SI Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SI Manufacturer</em>' attribute.
	 * @see #getSIManufacturer()
	 * @generated
	 */
	void setSIManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>SI Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BuildNumber for the SoftwareIdentity of the Disk Drive as reported in the underlying SoftwareIdentity instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SI Build Number</em>' attribute.
	 * @see #setSIBuildNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SIBuildNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.BuildNumber\"]'"
	 * @generated
	 */
	Integer getSIBuildNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSIBuildNumber <em>SI Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SI Build Number</em>' attribute.
	 * @see #getSIBuildNumber()
	 * @generated
	 */
	void setSIBuildNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>SI Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MajorVersion for the SoftwareIdentity of the Disk Drive as reported in the underlying SoftwareIdentity instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SI Major Version</em>' attribute.
	 * @see #setSIMajorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SIMajorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.MajorVersion\"]'"
	 * @generated
	 */
	Integer getSIMajorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSIMajorVersion <em>SI Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SI Major Version</em>' attribute.
	 * @see #getSIMajorVersion()
	 * @generated
	 */
	void setSIMajorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>SI Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RevisionNumber for the SoftwareIdentity of the Disk Drive as reported in the underlying SoftwareIdentity instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SI Revision Number</em>' attribute.
	 * @see #setSIRevisionNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SIRevisionNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.RevisionNumber\"]'"
	 * @generated
	 */
	Integer getSIRevisionNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSIRevisionNumber <em>SI Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SI Revision Number</em>' attribute.
	 * @see #getSIRevisionNumber()
	 * @generated
	 */
	void setSIRevisionNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>SI Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MinorVersion for the SoftwareIdentity of the Disk Drive as reported in the underlying SoftwareIdentity instance for the Disk Drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SI Minor Version</em>' attribute.
	 * @see #setSIMinorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_SIMinorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.MinorVersion\"]'"
	 * @generated
	 */
	Integer getSIMinorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getSIMinorVersion <em>SI Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SI Minor Version</em>' attribute.
	 * @see #getSIMinorVersion()
	 * @generated
	 */
	void setSIMinorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>DD Disk Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DiskType for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD Disk Type</em>' attribute.
	 * @see #setDDDiskType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDDiskType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getDDDiskType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getDDDiskType <em>DD Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD Disk Type</em>' attribute.
	 * @see #getDDDiskType()
	 * @generated
	 */
	void setDDDiskType(Integer value);

	/**
	 * Returns the value of the '<em><b>DD Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encryption property for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD Encryption</em>' attribute.
	 * @see #setDDEncryption(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDEncryption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getDDEncryption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getDDEncryption <em>DD Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD Encryption</em>' attribute.
	 * @see #getDDEncryption()
	 * @generated
	 */
	void setDDEncryption(Integer value);

	/**
	 * Returns the value of the '<em><b>DD Form Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FormFactor for the Disk Drive as reported in the underlying DiskDrive instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD Form Factor</em>' attribute.
	 * @see #setDDFormFactor(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_DDFormFactor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getDDFormFactor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getDDFormFactor <em>DD Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD Form Factor</em>' attribute.
	 * @see #getDDFormFactor()
	 * @generated
	 */
	void setDDFormFactor(Integer value);

	/**
	 * Returns the value of the '<em><b>LP Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PortType for the LogicalPort as reported in the underlying target LogicalPort instance for the disk drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LP Port Type</em>' attribute.
	 * @see #setLPPortType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveView_LPPortType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLPPortType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveView#getLPPortType <em>LP Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LP Port Type</em>' attribute.
	 * @see #getLPPortType()
	 * @generated
	 */
	void setLPPortType(Integer value);

} // CIM_DiskDriveView
