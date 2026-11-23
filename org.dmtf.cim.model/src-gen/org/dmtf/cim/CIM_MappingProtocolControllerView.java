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
 * A representation of the model object '<em><b>CIM Mapping Protocol Controller View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_MappingProtocolControllerView instance is a view that is derived from CIM_LogicalPort, CIM_ProtocolController, CIM_ProtocolEndpoint, CIM_AuthorizedPrivilege and CIM_StorageHardwareID.
 * CIM_ElementView may associate CIM_MappingProtocolControllerView to its underlying elements (regardless of whether or not they are instantiated).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPCSystemCreationClassName <em>PC System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPCSystemName <em>PC System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPCCreationClassName <em>PC Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPCDeviceID <em>PC Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getSHIDInstanceID <em>SHID Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getSHIDStorageID <em>SHID Storage ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getSHIDIDType <em>SHIDID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPSystemCreationClassName <em>PEP System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPCreationClassName <em>PEP Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPSystemName <em>PEP System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPName <em>PEP Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPProtocolIFType <em>PEP Protocol IF Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPOtherTypeDescription <em>PEP Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPRole <em>PEP Role</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPConnectionType <em>PEP Connection Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getAPInstanceID <em>AP Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getAPPrivilegeGranted <em>AP Privilege Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getAPActivities <em>AP Activities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getAPElementName <em>AP Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPSystemCreationClassName <em>LP System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPSystemName <em>LP System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPCreationClassName <em>LP Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPDeviceID <em>LP Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPOperationalStatus <em>LP Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPUsageRestriction <em>LP Usage Restriction</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPPortType <em>LP Port Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Views' keys='PCSystemCreationClassName,PCSystemName,PCCreationClassName,PCDeviceID,SHIDInstanceID,PEPSystemCreationClassName,PEPCreationClassName,PEPSystemName,PEPName'"
 * @generated
 */
@ProviderType
public interface CIM_MappingProtocolControllerView extends CIM_LogicalDeviceView {
	/**
	 * Returns the value of the '<em><b>PC System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName for the ProtocolController as reported in the underlying ProtocolController instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PC System Creation Class Name</em>' attribute.
	 * @see #setPCSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PCSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_ProtocolController.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getPCSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPCSystemCreationClassName <em>PC System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PC System Creation Class Name</em>' attribute.
	 * @see #getPCSystemCreationClassName()
	 * @generated
	 */
	void setPCSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>PC System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName for the ProtocolController as reported in the underlying ProtocolController instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PC System Name</em>' attribute.
	 * @see #setPCSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PCSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_ProtocolController.SystemName\"]'"
	 * @generated
	 */
	String getPCSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPCSystemName <em>PC System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PC System Name</em>' attribute.
	 * @see #getPCSystemName()
	 * @generated
	 */
	void setPCSystemName(String value);

	/**
	 * Returns the value of the '<em><b>PC Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the ProtocolController as reported in the underlying ProtocolController instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PC Creation Class Name</em>' attribute.
	 * @see #setPCCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PCCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_ProtocolController.CreationClassName\"]'"
	 * @generated
	 */
	String getPCCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPCCreationClassName <em>PC Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PC Creation Class Name</em>' attribute.
	 * @see #getPCCreationClassName()
	 * @generated
	 */
	void setPCCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>PC Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An opaque identifier of the underlying ProtocolController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PC Device ID</em>' attribute.
	 * @see #setPCDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PCDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_ProtocolController.DeviceID\"]'"
	 * @generated
	 */
	String getPCDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPCDeviceID <em>PC Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PC Device ID</em>' attribute.
	 * @see #getPCDeviceID()
	 * @generated
	 */
	void setPCDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>SHID Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the StorageHardwareID as reported in its underlying StorageHardwareID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SHID Instance ID</em>' attribute.
	 * @see #setSHIDInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_SHIDInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StorageHardwareID.InstanceID\"]'"
	 * @generated
	 */
	String getSHIDInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getSHIDInstanceID <em>SHID Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SHID Instance ID</em>' attribute.
	 * @see #getSHIDInstanceID()
	 * @generated
	 */
	void setSHIDInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>SHID Storage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StorageID of the StorageHardwareID as reported in its underlying StorageHardwareID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SHID Storage ID</em>' attribute.
	 * @see #setSHIDStorageID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_SHIDStorageID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageHardwareID.StorageID\"]'"
	 * @generated
	 */
	String getSHIDStorageID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getSHIDStorageID <em>SHID Storage ID</em>}' attribute.
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
	 * The IDType value supported by the StorageHardwareID as reported in its underlying StorageHardwareID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SHIDID Type</em>' attribute.
	 * @see #setSHIDIDType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_SHIDIDType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageHardwareID.IDType\"]'"
	 * @generated
	 */
	Integer getSHIDIDType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getSHIDIDType <em>SHIDID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SHIDID Type</em>' attribute.
	 * @see #getSHIDIDType()
	 * @generated
	 */
	void setSHIDIDType(Integer value);

	/**
	 * Returns the value of the '<em><b>PEP System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName for the ProtocolEndpoint as reported in the underlying ProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PEP System Creation Class Name</em>' attribute.
	 * @see #setPEPSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PEPSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_ProtocolEndpoint.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getPEPSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPSystemCreationClassName <em>PEP System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEP System Creation Class Name</em>' attribute.
	 * @see #getPEPSystemCreationClassName()
	 * @generated
	 */
	void setPEPSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>PEP Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the ProtocolEndpoint as reported in the underlying ProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PEP Creation Class Name</em>' attribute.
	 * @see #setPEPCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PEPCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_ProtocolEndpoint.CreationClassName\"]'"
	 * @generated
	 */
	String getPEPCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPCreationClassName <em>PEP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEP Creation Class Name</em>' attribute.
	 * @see #getPEPCreationClassName()
	 * @generated
	 */
	void setPEPCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>PEP System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName for the ProtocolEndpoint as reported in the underlying ProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PEP System Name</em>' attribute.
	 * @see #setPEPSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PEPSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_ProtocolEndpoint.SystemName\"]'"
	 * @generated
	 */
	String getPEPSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPSystemName <em>PEP System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEP System Name</em>' attribute.
	 * @see #getPEPSystemName()
	 * @generated
	 */
	void setPEPSystemName(String value);

	/**
	 * Returns the value of the '<em><b>PEP Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name for the ProtocolEndpoint as reported in the underlying ProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PEP Name</em>' attribute.
	 * @see #setPEPName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PEPName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_ProtocolEndpoint.Name\"]'"
	 * @generated
	 */
	String getPEPName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPName <em>PEP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEP Name</em>' attribute.
	 * @see #getPEPName()
	 * @generated
	 */
	void setPEPName(String value);

	/**
	 * Returns the value of the '<em><b>PEP Protocol IF Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ProtocolIFType for the ProtocolEndpoint as reported in the underlying ProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PEP Protocol IF Type</em>' attribute.
	 * @see #setPEPProtocolIFType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PEPProtocolIFType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ProtocolEndpoint.ProtocolIFType\"]'"
	 * @generated
	 */
	Integer getPEPProtocolIFType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPProtocolIFType <em>PEP Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEP Protocol IF Type</em>' attribute.
	 * @see #getPEPProtocolIFType()
	 * @generated
	 */
	void setPEPProtocolIFType(Integer value);

	/**
	 * Returns the value of the '<em><b>PEP Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OtherTypeDescription for the ProtocolEndpoint as reported in the underlying ProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PEP Other Type Description</em>' attribute.
	 * @see #setPEPOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PEPOtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ProtocolEndpoint.OtherTypeDescription\"]'"
	 * @generated
	 */
	String getPEPOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPOtherTypeDescription <em>PEP Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEP Other Type Description</em>' attribute.
	 * @see #getPEPOtherTypeDescription()
	 * @generated
	 */
	void setPEPOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>PEP Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Role for the ProtocolEndpoint as reported in the underlying ProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PEP Role</em>' attribute.
	 * @see #setPEPRole(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PEPRole()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPEPRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPRole <em>PEP Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEP Role</em>' attribute.
	 * @see #getPEPRole()
	 * @generated
	 */
	void setPEPRole(Integer value);

	/**
	 * Returns the value of the '<em><b>PEP Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectionType for the ProtocolEndpoint as reported in the underlying ProtocolEndpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PEP Connection Type</em>' attribute.
	 * @see #setPEPConnectionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_PEPConnectionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPEPConnectionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getPEPConnectionType <em>PEP Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEP Connection Type</em>' attribute.
	 * @see #getPEPConnectionType()
	 * @generated
	 */
	void setPEPConnectionType(Integer value);

	/**
	 * Returns the value of the '<em><b>AP Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the AuthorizedPrivilege as reported in its underlying AuthorizedPrivelege.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AP Instance ID</em>' attribute.
	 * @see #setAPInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_APInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AuthorizedPrivilege.InstanceID\"]'"
	 * @generated
	 */
	String getAPInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getAPInstanceID <em>AP Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AP Instance ID</em>' attribute.
	 * @see #getAPInstanceID()
	 * @generated
	 */
	void setAPInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>AP Privilege Granted</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PrivilegeGranted property of the AuthorizedPrivilege as reported in its underlying AuthorizedPrivelege.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AP Privilege Granted</em>' attribute.
	 * @see #setAPPrivilegeGranted(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_APPrivilegeGranted()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_AuthorizedPrivilege.PrivilegeGranted\"]'"
	 * @generated
	 */
	Boolean getAPPrivilegeGranted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getAPPrivilegeGranted <em>AP Privilege Granted</em>}' attribute.
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
	 * The Activities property of the AuthorizedPrivilege as reported in its underlying AuthorizedPrivelege.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AP Activities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_APActivities()
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
	 * The ElementName for the underlying AuthorizedPrivilege.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AP Element Name</em>' attribute.
	 * @see #setAPElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_APElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AuthorizedPrivilege.ElementName\"]'"
	 * @generated
	 */
	String getAPElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getAPElementName <em>AP Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AP Element Name</em>' attribute.
	 * @see #getAPElementName()
	 * @generated
	 */
	void setAPElementName(String value);

	/**
	 * Returns the value of the '<em><b>LP System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName for the LogicalPort as reported in the underlying LogicalPort instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LP System Creation Class Name</em>' attribute.
	 * @see #setLPSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_LPSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogicalPort.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getLPSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPSystemCreationClassName <em>LP System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LP System Creation Class Name</em>' attribute.
	 * @see #getLPSystemCreationClassName()
	 * @generated
	 */
	void setLPSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>LP System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName for the LogicalPort as reported in the underlying LogicalPort instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LP System Name</em>' attribute.
	 * @see #setLPSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_LPSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogicalPort.SystemName\"]'"
	 * @generated
	 */
	String getLPSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPSystemName <em>LP System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LP System Name</em>' attribute.
	 * @see #getLPSystemName()
	 * @generated
	 */
	void setLPSystemName(String value);

	/**
	 * Returns the value of the '<em><b>LP Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the LogicalPort as reported in the underlying LogicalPort instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LP Creation Class Name</em>' attribute.
	 * @see #setLPCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_LPCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogicalPort.CreationClassName\"]'"
	 * @generated
	 */
	String getLPCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPCreationClassName <em>LP Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LP Creation Class Name</em>' attribute.
	 * @see #getLPCreationClassName()
	 * @generated
	 */
	void setLPCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>LP Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An opaque identifier of the underlying LogicalPort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LP Device ID</em>' attribute.
	 * @see #setLPDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_LPDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogicalPort.DeviceID\"]'"
	 * @generated
	 */
	String getLPDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPDeviceID <em>LP Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LP Device ID</em>' attribute.
	 * @see #getLPDeviceID()
	 * @generated
	 */
	void setLPDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>LP Operational Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OperationalStatus for the LogicalPort as reported in the underlying LogicalPort instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LP Operational Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_LPOperationalStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_LogicalPort.OperationalStatus\"]'"
	 * @generated
	 */
	EList<Integer> getLPOperationalStatus();

	/**
	 * Returns the value of the '<em><b>LP Usage Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UsageRestriction for the LogicalPort as reported in the underlying LogicalPort instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LP Usage Restriction</em>' attribute.
	 * @see #setLPUsageRestriction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_LPUsageRestriction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_LogicalPort.UsageRestriction\"]'"
	 * @generated
	 */
	Integer getLPUsageRestriction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPUsageRestriction <em>LP Usage Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LP Usage Restriction</em>' attribute.
	 * @see #getLPUsageRestriction()
	 * @generated
	 */
	void setLPUsageRestriction(Integer value);

	/**
	 * Returns the value of the '<em><b>LP Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PortType for the LogicalPort as reported in the underlying LogicalPort instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LP Port Type</em>' attribute.
	 * @see #setLPPortType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MappingProtocolControllerView_LPPortType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_LogicalPort.PortType\"]'"
	 * @generated
	 */
	Integer getLPPortType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MappingProtocolControllerView#getLPPortType <em>LP Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LP Port Type</em>' attribute.
	 * @see #getLPPortType()
	 * @generated
	 */
	void setLPPortType(Integer value);

} // CIM_MappingProtocolControllerView
