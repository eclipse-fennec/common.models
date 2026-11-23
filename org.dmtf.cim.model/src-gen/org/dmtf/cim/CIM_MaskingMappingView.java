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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Masking Mapping View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_MaskingMappingView instance is a view that is derived from CIM_StorageHardwareID, CIM_AuthorizedSubject, CIM_AuthorizedPrivilege, CIM_AuthorizedTarget, CIM_SCSIProtocolController, CIM_SAPAvailableForElement, CIM_SCSIProtocolEndpoint, CIM_ProtocolControllerForUnit and CIM_LogicalDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getStorageHardwareID <em>Storage Hardware ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getLogicalDevice <em>Logical Device</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getProtocolEndpoint <em>Protocol Endpoint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSHIDStorageID <em>SHID Storage ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSHIDIDType <em>SHIDID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getLDDeviceID <em>LD Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPSystemCreationClassName <em>SPEP System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPCreationClassName <em>SPEP Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPSystemName <em>SPEP System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPName <em>SPEP Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPProtocolIFType <em>SPEP Protocol IF Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPOtherTypeDescription <em>SPEP Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPConnectionType <em>SPEP Connection Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPRole <em>SPEP Role</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getAPInstanceID <em>AP Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getAPPrivilegeGranted <em>AP Privilege Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getAPActivities <em>AP Activities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getAPElementName <em>AP Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPCSystemCreationClassName <em>SPC System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPCCreationClassName <em>SPC Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPCSystemName <em>SPC System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getSPCDeviceID <em>SPC Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getPCFUDeviceNumber <em>PCFU Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingView#getPCFUDeviceAccess <em>PCFU Device Access</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device' keys='StorageHardwareID,LogicalDevice,ProtocolEndpoint'"
 * @generated
 */
@ProviderType
public interface CIM_MaskingMappingView extends EObject {
	/**
	 * Returns the value of the '<em><b>Storage Hardware ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CIM_StorageHardwareID instance that is associated to the CIM_LogicalDevice and CIM_ProtocolEndpoint instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Hardware ID</em>' reference.
	 * @see #setStorageHardwareID(CIM_StorageHardwareID)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_StorageHardwareID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageHardwareID REF' Key='true'"
	 * @generated
	 */
	CIM_StorageHardwareID getStorageHardwareID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getStorageHardwareID <em>Storage Hardware ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Hardware ID</em>' reference.
	 * @see #getStorageHardwareID()
	 * @generated
	 */
	void setStorageHardwareID(CIM_StorageHardwareID value);

	/**
	 * Returns the value of the '<em><b>Logical Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CIM_LogicalDevice instance that is associated to the CIM_StorageHardwareID and CIM_ProtocolEndpoint instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Device</em>' reference.
	 * @see #setLogicalDevice(CIM_LogicalDevice)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_LogicalDevice()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF' Key='true'"
	 * @generated
	 */
	CIM_LogicalDevice getLogicalDevice();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getLogicalDevice <em>Logical Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Device</em>' reference.
	 * @see #getLogicalDevice()
	 * @generated
	 */
	void setLogicalDevice(CIM_LogicalDevice value);

	/**
	 * Returns the value of the '<em><b>Protocol Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CIM_ProtocolEndpoint instance that is associated to the CIM_StorageHardwareID and CIM_LogicalDevice instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Endpoint</em>' reference.
	 * @see #setProtocolEndpoint(CIM_ProtocolEndpoint)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_ProtocolEndpoint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolEndpoint REF' Key='true'"
	 * @generated
	 */
	CIM_ProtocolEndpoint getProtocolEndpoint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getProtocolEndpoint <em>Protocol Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Endpoint</em>' reference.
	 * @see #getProtocolEndpoint()
	 * @generated
	 */
	void setProtocolEndpoint(CIM_ProtocolEndpoint value);

	/**
	 * Returns the value of the '<em><b>SHID Storage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StorageID from the referenced CIM_StorageHardwareID instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SHID Storage ID</em>' attribute.
	 * @see #setSHIDStorageID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SHIDStorageID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_StorageHardwareID.StorageID\"]'"
	 * @generated
	 */
	String getSHIDStorageID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSHIDStorageID <em>SHID Storage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SHID Storage ID</em>' attribute.
	 * @see #getSHIDStorageID()
	 * @generated
	 */
	void setSHIDStorageID(String value);

	/**
	 * Returns the value of the '<em><b>SHIDID Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IDType from the referenced CIM_StorageHardwareID instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SHIDID Type</em>' attribute.
	 * @see #setSHIDIDType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SHIDIDType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageHardwareID.IDType\"]'"
	 * @generated
	 */
	Integer getSHIDIDType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSHIDIDType <em>SHIDID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SHIDID Type</em>' attribute.
	 * @see #getSHIDIDType()
	 * @generated
	 */
	void setSHIDIDType(Integer value);

	/**
	 * Returns the value of the '<em><b>LD Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceID from the referenced CIM_LogicalDevice instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LD Device ID</em>' attribute.
	 * @see #setLDDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_LDDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogicalDevice.DeviceID\"]'"
	 * @generated
	 */
	String getLDDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getLDDeviceID <em>LD Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LD Device ID</em>' attribute.
	 * @see #getLDDeviceID()
	 * @generated
	 */
	void setLDDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>SPEP System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName from the referenced CIM_SCSIProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPEP System Creation Class Name</em>' attribute.
	 * @see #setSPEPSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPEPSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getSPEPSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPSystemCreationClassName <em>SPEP System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPEP System Creation Class Name</em>' attribute.
	 * @see #getSPEPSystemCreationClassName()
	 * @generated
	 */
	void setSPEPSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SPEP Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName from the referenced CIM_SCSIProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPEP Creation Class Name</em>' attribute.
	 * @see #setSPEPCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPEPCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.CreationClassName\"]'"
	 * @generated
	 */
	String getSPEPCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPCreationClassName <em>SPEP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPEP Creation Class Name</em>' attribute.
	 * @see #getSPEPCreationClassName()
	 * @generated
	 */
	void setSPEPCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SPEP System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName from the referenced CIM_SCSIProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPEP System Name</em>' attribute.
	 * @see #setSPEPSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPEPSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.SystemName\"]'"
	 * @generated
	 */
	String getSPEPSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPSystemName <em>SPEP System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPEP System Name</em>' attribute.
	 * @see #getSPEPSystemName()
	 * @generated
	 */
	void setSPEPSystemName(String value);

	/**
	 * Returns the value of the '<em><b>SPEP Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name from the referenced CIM_SCSIProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPEP Name</em>' attribute.
	 * @see #setSPEPName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPEPName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.Name\"]'"
	 * @generated
	 */
	String getSPEPName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPName <em>SPEP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPEP Name</em>' attribute.
	 * @see #getSPEPName()
	 * @generated
	 */
	void setSPEPName(String value);

	/**
	 * Returns the value of the '<em><b>SPEP Protocol IF Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ProtocolIFType value for the CIM_SCSIProtocolEndpoint used with the CIM_LogicalPort as reported in the underlying CIM_SCSIProtocolEndpoint instance for the CIM_LogicalPort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPEP Protocol IF Type</em>' attribute.
	 * @see #setSPEPProtocolIFType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPEPProtocolIFType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.ProtocolIFType\"]'"
	 * @generated
	 */
	Integer getSPEPProtocolIFType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPProtocolIFType <em>SPEP Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPEP Protocol IF Type</em>' attribute.
	 * @see #getSPEPProtocolIFType()
	 * @generated
	 */
	void setSPEPProtocolIFType(Integer value);

	/**
	 * Returns the value of the '<em><b>SPEP Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OtherTypeDescription value for the CIM_SCSIProtocolEndpoint used with the CIM_LogicalPort as reported in the underlying CIM_SCSIProtocolEndpoint instance for the CIM_LogicalPort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPEP Other Type Description</em>' attribute.
	 * @see #setSPEPOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPEPOtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.OtherTypeDescription\"]'"
	 * @generated
	 */
	String getSPEPOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPOtherTypeDescription <em>SPEP Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPEP Other Type Description</em>' attribute.
	 * @see #getSPEPOtherTypeDescription()
	 * @generated
	 */
	void setSPEPOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>SPEP Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectionType value for the CIM_SCSIProtocolEndpoint used with the CIM_LogicalPort as reported in the underlying CIM_SCSIProtocolEndpoint instance for the CIM_LogicalPort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPEP Connection Type</em>' attribute.
	 * @see #setSPEPConnectionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPEPConnectionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.ConnectionType\"]'"
	 * @generated
	 */
	Integer getSPEPConnectionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPConnectionType <em>SPEP Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPEP Connection Type</em>' attribute.
	 * @see #getSPEPConnectionType()
	 * @generated
	 */
	void setSPEPConnectionType(Integer value);

	/**
	 * Returns the value of the '<em><b>SPEP Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Role value for the CIM_SCSIProtocolEndpoint used with the CIM_LogicalPort as reported in the underlying CIM_SCSIProtocolEndpointinstance for the CIM_LogicalPort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPEP Role</em>' attribute.
	 * @see #setSPEPRole(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPEPRole()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.Role\"]'"
	 * @generated
	 */
	Integer getSPEPRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPEPRole <em>SPEP Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPEP Role</em>' attribute.
	 * @see #getSPEPRole()
	 * @generated
	 */
	void setSPEPRole(Integer value);

	/**
	 * Returns the value of the '<em><b>AP Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the CIM_AuthorizedPrivilege instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AP Instance ID</em>' attribute.
	 * @see #setAPInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_APInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AuthorizedPrivilege.InstanceID\"]'"
	 * @generated
	 */
	String getAPInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getAPInstanceID <em>AP Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AP Instance ID</em>' attribute.
	 * @see #getAPInstanceID()
	 * @generated
	 */
	void setAPInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>AP Privilege Granted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PrivilegeGranted of the CIM_AuthorizedPrivilege instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AP Privilege Granted</em>' attribute.
	 * @see #setAPPrivilegeGranted(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_APPrivilegeGranted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_AuthorizedPrivilege.PrivilegeGranted\"]'"
	 * @generated
	 */
	Boolean getAPPrivilegeGranted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getAPPrivilegeGranted <em>AP Privilege Granted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AP Privilege Granted</em>' attribute.
	 * @see #getAPPrivilegeGranted()
	 * @generated
	 */
	void setAPPrivilegeGranted(Boolean value);

	/**
	 * Returns the value of the '<em><b>AP Activities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activities array of the CIM_AuthorizedPrivilege instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AP Activities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_APActivities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_AuthorizedPrivilege.Activities\"]'"
	 * @generated
	 */
	EList<Integer> getAPActivities();

	/**
	 * Returns the value of the '<em><b>AP Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ElementName of the CIM_AuthorizedPrivilege instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AP Element Name</em>' attribute.
	 * @see #setAPElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_APElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AuthorizedPrivilege.ElementName\"]'"
	 * @generated
	 */
	String getAPElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getAPElementName <em>AP Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AP Element Name</em>' attribute.
	 * @see #getAPElementName()
	 * @generated
	 */
	void setAPElementName(String value);

	/**
	 * Returns the value of the '<em><b>SPC System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName of the CIM_SCSIProtocolController instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC System Creation Class Name</em>' attribute.
	 * @see #setSPCSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPCSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolController.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getSPCSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPCSystemCreationClassName <em>SPC System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC System Creation Class Name</em>' attribute.
	 * @see #getSPCSystemCreationClassName()
	 * @generated
	 */
	void setSPCSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SPC Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName of the CIM_SCSIProtocolController instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC Creation Class Name</em>' attribute.
	 * @see #setSPCCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPCCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolController.CreationClassName\"]'"
	 * @generated
	 */
	String getSPCCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPCCreationClassName <em>SPC Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC Creation Class Name</em>' attribute.
	 * @see #getSPCCreationClassName()
	 * @generated
	 */
	void setSPCCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SPC System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName of the CIM_SCSIProtocolController instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC System Name</em>' attribute.
	 * @see #setSPCSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPCSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolController.SystemName\"]'"
	 * @generated
	 */
	String getSPCSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPCSystemName <em>SPC System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC System Name</em>' attribute.
	 * @see #getSPCSystemName()
	 * @generated
	 */
	void setSPCSystemName(String value);

	/**
	 * Returns the value of the '<em><b>SPC Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceID of the CIM_SCSIProtocolController instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC Device ID</em>' attribute.
	 * @see #setSPCDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_SPCDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolController.DeviceID\"]'"
	 * @generated
	 */
	String getSPCDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getSPCDeviceID <em>SPC Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC Device ID</em>' attribute.
	 * @see #getSPCDeviceID()
	 * @generated
	 */
	void setSPCDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>PCFU Device Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceNumber (LUN) of the CIM_ProtocolControllerForUnit association instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PCFU Device Number</em>' attribute.
	 * @see #setPCFUDeviceNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_PCFUDeviceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ProtocolControllerForUnit.DeviceNumber\"]'"
	 * @generated
	 */
	String getPCFUDeviceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getPCFUDeviceNumber <em>PCFU Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCFU Device Number</em>' attribute.
	 * @see #getPCFUDeviceNumber()
	 * @generated
	 */
	void setPCFUDeviceNumber(String value);

	/**
	 * Returns the value of the '<em><b>PCFU Device Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceAccess value of the CIM_ProtocolControllerForUnit association instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PCFU Device Access</em>' attribute.
	 * @see #setPCFUDeviceAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingView_PCFUDeviceAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ProtocolControllerForUnit.DeviceAccess\"]'"
	 * @generated
	 */
	Integer getPCFUDeviceAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingView#getPCFUDeviceAccess <em>PCFU Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCFU Device Access</em>' attribute.
	 * @see #getPCFUDeviceAccess()
	 * @generated
	 */
	void setPCFUDeviceAccess(Integer value);

} // CIM_MaskingMappingView
