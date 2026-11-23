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
 * A representation of the model object '<em><b>CIM Protocol Controller Masking Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the Masking-related capabilities of a ProtocolController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getValidHardwareIdTypes <em>Valid Hardware Id Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getOtherValidHardwareIDTypes <em>Other Valid Hardware ID Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getPortsPerView <em>Ports Per View</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getClientSelectableDeviceNumbers <em>Client Selectable Device Numbers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getAttachDeviceSupported <em>Attach Device Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getOneHardwareIDPerView <em>One Hardware ID Per View</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getUniqueUnitNumbersPerPort <em>Unique Unit Numbers Per Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getPrivilegeDeniedSupported <em>Privilege Denied Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getProtocolControllerRequiresAuthorizedIdentity <em>Protocol Controller Requires Authorized Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getProtocolControllerSupportsCollections <em>Protocol Controller Supports Collections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getExposePathsSupported <em>Expose Paths Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getCreateProtocolControllerSupported <em>Create Protocol Controller Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getMaximumMapCount <em>Maximum Map Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSPCAllowsNoLUs <em>SPC Allows No LUs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSPCAllowsNoTargets <em>SPC Allows No Targets</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSPCAllowsNoInitiators <em>SPC Allows No Initiators</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSPCSupportsDefaultViews <em>SPC Supports Default Views</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getExposePathsWithNameAndHostTypeSupported <em>Expose Paths With Name And Host Type Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::ProtocolController' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolControllerMaskingCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Valid Hardware Id Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the valid values for StrorageHardwareID.IDType. iSCSI IDs MAY use one of three iSCSI formats - iqn, eui, or naa. This three letter format is the name prefix; so a single iSCSI type is provided here, the prefix can be used to further refine the format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Hardware Id Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_ValidHardwareIdTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"7\"]' Values='[\"Other\",\"Port WWN\",\"Node WWN\",\"Host Name\",\"iSCSI Name\",\"SAS Address\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_StorageHardwareID.IDType\"]'"
	 * @generated
	 */
	EList<Integer> getValidHardwareIdTypes();

	/**
	 * Returns the value of the '<em><b>Other Valid Hardware ID Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings describing types for valid StorageHardwareID.IDType. Used when the ValidHardwareIdTypes includes 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Valid Hardware ID Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_OtherValidHardwareIDTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<String> getOtherValidHardwareIDTypes();

	/**
	 * Returns the value of the '<em><b>Ports Per View</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration indicating the way that ports per view (ProtocolController) are handled by the underlying storage system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports Per View</em>' attribute.
	 * @see #setPortsPerView(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_PortsPerView()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"One Port per View\",\"Multiple Ports per View\",\"All Ports share the same View\"]'"
	 * @generated
	 */
	Integer getPortsPerView();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getPortsPerView <em>Ports Per View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports Per View</em>' attribute.
	 * @see #getPortsPerView()
	 * @generated
	 */
	void setPortsPerView(Integer value);

	/**
	 * Returns the value of the '<em><b>Client Selectable Device Numbers</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system allows the client to specify the DeviceNumber parameter when calling ControllerConfigurationService.AttachDevice() or specify the DeviceNumbers parameter when calling ControllerConfigurationService.ExposePaths(). Set to false if the implementation does not allow unit numbers to vary for a ProtocolController. However, if set to false and a Device is not the Dependent of a ProtocolControllerForUnit association, the client MUST provide a DeviceNumber parameter in ControllerConfigurationService.AttachDevice or ControllerConfigurationService.ExposePaths. If set to false and the Device is already the Dependent of a ProtocolControllerForUnit association, then the client can omit the DeviceNumber parameter (or supply the same value) in subsequent ControllerConfigurationService.AttachDevice calls.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Selectable Device Numbers</em>' attribute.
	 * @see #setClientSelectableDeviceNumbers(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_ClientSelectableDeviceNumbers()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getClientSelectableDeviceNumbers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getClientSelectableDeviceNumbers <em>Client Selectable Device Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Selectable Device Numbers</em>' attribute.
	 * @see #getClientSelectableDeviceNumbers()
	 * @generated
	 */
	void setClientSelectableDeviceNumbers(Boolean value);

	/**
	 * Returns the value of the '<em><b>Attach Device Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system supports the AttachDevice method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attach Device Supported</em>' attribute.
	 * @see #setAttachDeviceSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_AttachDeviceSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_ProtocolControllerMaskingCapabilities.SupportedAsynchronousActions\",\"CIM_ProtocolControllerMaskingCapabilities.SupportedSynchronousActions\"]'"
	 * @generated
	 */
	Boolean getAttachDeviceSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getAttachDeviceSupported <em>Attach Device Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach Device Supported</em>' attribute.
	 * @see #getAttachDeviceSupported()
	 * @generated
	 */
	void setAttachDeviceSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>One Hardware ID Per View</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system limits configurations to a single subject hardware ID per view. Otherwise, multiple hardware ID types can be used. The default is FALSE, that multiple ID types MAY be used in a single view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>One Hardware ID Per View</em>' attribute.
	 * @see #setOneHardwareIDPerView(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_OneHardwareIDPerView()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getOneHardwareIDPerView();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getOneHardwareIDPerView <em>One Hardware ID Per View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Hardware ID Per View</em>' attribute.
	 * @see #getOneHardwareIDPerView()
	 * @generated
	 */
	void setOneHardwareIDPerView(Boolean value);

	/**
	 * Returns the value of the '<em><b>Unique Unit Numbers Per Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When set to false, different ProtocolContollers attached to a LogicalPort can expose the same unit numbers. If true, then this storage system requires unique unit numbers across all the ProtocolControllers connected to a LogicalPort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Unit Numbers Per Port</em>' attribute.
	 * @see #setUniqueUnitNumbersPerPort(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_UniqueUnitNumbersPerPort()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getUniqueUnitNumbersPerPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getUniqueUnitNumbersPerPort <em>Unique Unit Numbers Per Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Unit Numbers Per Port</em>' attribute.
	 * @see #getUniqueUnitNumbersPerPort()
	 * @generated
	 */
	void setUniqueUnitNumbersPerPort(Boolean value);

	/**
	 * Returns the value of the '<em><b>Privilege Denied Supported</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system allows a client to create a Privilege instance with PrivilegeGranted set to FALSE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Privilege Denied Supported</em>' attribute.
	 * @see #setPrivilegeDeniedSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_PrivilegeDeniedSupported()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPrivilegeDeniedSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getPrivilegeDeniedSupported <em>Privilege Denied Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege Denied Supported</em>' attribute.
	 * @see #getPrivilegeDeniedSupported()
	 * @generated
	 */
	void setPrivilegeDeniedSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Protocol Controller Requires Authorized Identity</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this property indicates that a Privilege/Identity pair MUST be specified when CreateProtocolControllerWithPorts() is called. If false, then the Privilege/Identity pair in CreateProtocolControllerWithPorts() MUST NOT be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Controller Requires Authorized Identity</em>' attribute.
	 * @see #setProtocolControllerRequiresAuthorizedIdentity(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_ProtocolControllerRequiresAuthorizedIdentity()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getProtocolControllerRequiresAuthorizedIdentity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getProtocolControllerRequiresAuthorizedIdentity <em>Protocol Controller Requires Authorized Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Controller Requires Authorized Identity</em>' attribute.
	 * @see #getProtocolControllerRequiresAuthorizedIdentity()
	 * @generated
	 */
	void setProtocolControllerRequiresAuthorizedIdentity(Boolean value);

	/**
	 * Returns the value of the '<em><b>Protocol Controller Supports Collections</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this property indicates that the Identity parameter of CreateProtocolConntrollerWithPorts() MUST contain a reference to a CIM_Collection (or subclass) or to a CIM_Identity (or subclass). If ExposePathsSupported is true, this property indicates the storage system supports SystemSpecificCollections of StorageHardwareIDs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Controller Supports Collections</em>' attribute.
	 * @see #setProtocolControllerSupportsCollections(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_ProtocolControllerSupportsCollections()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getProtocolControllerSupportsCollections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getProtocolControllerSupportsCollections <em>Protocol Controller Supports Collections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Controller Supports Collections</em>' attribute.
	 * @see #getProtocolControllerSupportsCollections()
	 * @generated
	 */
	void setProtocolControllerSupportsCollections(Boolean value);

	/**
	 * Returns the value of the '<em><b>Expose Paths Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system supports the ExposePaths and HidePaths methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expose Paths Supported</em>' attribute.
	 * @see #setExposePathsSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_ExposePathsSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getExposePathsSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getExposePathsSupported <em>Expose Paths Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose Paths Supported</em>' attribute.
	 * @see #getExposePathsSupported()
	 * @generated
	 */
	void setExposePathsSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Create Protocol Controller Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system supports the CreateProtocolControllerWithPorts method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Create Protocol Controller Supported</em>' attribute.
	 * @see #setCreateProtocolControllerSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_CreateProtocolControllerSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCreateProtocolControllerSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getCreateProtocolControllerSupported <em>Create Protocol Controller Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Protocol Controller Supported</em>' attribute.
	 * @see #getCreateProtocolControllerSupported()
	 * @generated
	 */
	void setCreateProtocolControllerSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Map Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of ProtocolCOntrollerForUnit associations that can be associated with a single LogicalDevice (for example, StorageVolume). Zero indicates there is no limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Map Count</em>' attribute.
	 * @see #setMaximumMapCount(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_MaximumMapCount()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumMapCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getMaximumMapCount <em>Maximum Map Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Map Count</em>' attribute.
	 * @see #getMaximumMapCount()
	 * @generated
	 */
	void setMaximumMapCount(Integer value);

	/**
	 * Returns the value of the '<em><b>SPC Allows No LUs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if the instumentation allows a client to create a configuration where an SPC has no LogicalDevices associated via CIM_ProtocolControllerForUnit associations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC Allows No LUs</em>' attribute.
	 * @see #setSPCAllowsNoLUs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_SPCAllowsNoLUs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSPCAllowsNoLUs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSPCAllowsNoLUs <em>SPC Allows No LUs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC Allows No LUs</em>' attribute.
	 * @see #getSPCAllowsNoLUs()
	 * @generated
	 */
	void setSPCAllowsNoLUs(Boolean value);

	/**
	 * Returns the value of the '<em><b>SPC Allows No Targets</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if the instumentation allows a client to create a configuration where an SPC has no target SCSIProtocolEndpoints associated via CIM_SAPAvailableForELement associations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC Allows No Targets</em>' attribute.
	 * @see #setSPCAllowsNoTargets(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_SPCAllowsNoTargets()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSPCAllowsNoTargets();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSPCAllowsNoTargets <em>SPC Allows No Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC Allows No Targets</em>' attribute.
	 * @see #getSPCAllowsNoTargets()
	 * @generated
	 */
	void setSPCAllowsNoTargets(Boolean value);

	/**
	 * Returns the value of the '<em><b>SPC Allows No Initiators</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if the instumentation allows a client to create a configuration where an SPC has no StorageHardwareIDs associated via CIM_AuthorizedTarget/CIM_AuthorizedPrivilege/CIM_AuthorizedSubject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC Allows No Initiators</em>' attribute.
	 * @see #setSPCAllowsNoInitiators(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_SPCAllowsNoInitiators()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSPCAllowsNoInitiators();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSPCAllowsNoInitiators <em>SPC Allows No Initiators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC Allows No Initiators</em>' attribute.
	 * @see #getSPCAllowsNoInitiators()
	 * @generated
	 */
	void setSPCAllowsNoInitiators(Boolean value);

	/**
	 * Returns the value of the '<em><b>SPC Supports Default Views</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if it the instrumentation supports 'default view' SPCs that exposes logical units to all initiators (so called 'promiscuous LUNs'. Default view SPCs MUST have be associated to a CIM_StorageHardwareID instance with Name set to the null string. A target port MUST NOT be associated with more a single default view SPC. If PortsPerView is 'All Ports share the same View', then at most one default view SPC MAY be associated with the target system. If SPCAllowsNoLUs is true, the instrumentation MAY instantiate a static default view instance or let the client create one as needed using ExposePaths. For other values of PortsPerView, all default view SPC MUST share the same null-Name CIM_StorageHardwareID instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC Supports Default Views</em>' attribute.
	 * @see #setSPCSupportsDefaultViews(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_SPCSupportsDefaultViews()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_ProtocolControllerMaskingCapabilities.PortsPerView\"]'"
	 * @generated
	 */
	Boolean getSPCSupportsDefaultViews();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getSPCSupportsDefaultViews <em>SPC Supports Default Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC Supports Default Views</em>' attribute.
	 * @see #getSPCSupportsDefaultViews()
	 * @generated
	 */
	void setSPCSupportsDefaultViews(Boolean value);

	/**
	 * Returns the value of the '<em><b>Expose Paths With Name And Host Type Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system supports the ExposePathsWithNameAndHostType method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expose Paths With Name And Host Type Supported</em>' attribute.
	 * @see #setExposePathsWithNameAndHostTypeSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_ExposePathsWithNameAndHostTypeSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getExposePathsWithNameAndHostTypeSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities#getExposePathsWithNameAndHostTypeSupported <em>Expose Paths With Name And Host Type Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose Paths With Name And Host Type Supported</em>' attribute.
	 * @see #getExposePathsWithNameAndHostTypeSupported()
	 * @generated
	 */
	void setExposePathsWithNameAndHostTypeSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions then the underlying implementation is indicating that it may or may not create a job. Values are: 
	 * Create StorageHardwareID: The CreateStorageHardwareID extrinsic.
	 * Create StorageHardwareID by ExposePaths: The implicit creation of aStorageHardwareID by the ExposePaths extrinsic.
	 * Delete StorageHardwareID: The DeleteStorageHardwareID extrinsic.
	 * Delete StorageHardwareID by Delete Instance intrinsic: The DeleteInstance intrinsic of a StorageHardwareID.
	 * Create Gateway Path ID: The CreateGatewayPathID extrinsic.
	 * Delete Gateway Path ID: The DeleteInstance intrinsic of a GatewayPathID.
	 * Create StorageHardwareID Collection: The CreateHardwareIDCollection extrinsic.
	 * Delete StorageHardwareID Collection: The DeleteInstance intrinsic of a SystemSpecificCollection.
	 * Add StorageHardwareID to Collection: The AddHardwareIDsToCollection extrinsic.
	 * Remove StorageHardwareID from Collection: The DeleteInstance intrinsic of a MemberOfCollection.
	 * Expose Paths: The ExposePaths extrinsic.
	 * Hide Paths: The HidePaths extrinsic.
	 * Expose Default LUs: The ExposeDefaultLUs extrinsic.
	 * Hide Default LUs: The HideDefaultLUs extrinsic.
	 * Attach Device: The AttachDevice extrinsic.
	 * Detach Device: The DetachDevice extrinsic.
	 * Create ProtocolController With Ports: The CreateProtocolControllerWithPorts extrinsic.
	 * Delete ProtocolController: The DeleteProtocolController extrinsic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"..\",\"32768..65535\"]' Values='[\"Create StorageHardwareID\",\"Create StorageHardwareID by ExposePaths\",\"Delete StorageHardwareID\",\"Create Gateway Path ID\",\"Delete Gateway Path ID\",\"Create StorageHardwareID Collection\",\"Delete StorageHardwareID Collection\",\"Add StorageHardwareIDs to Collection\",\"Remove StorageHardwareIDs from Collection\",\"Expose Paths\",\"Hide Paths\",\"Expose Default Views\",\"Hide Default Views\",\"Attach Device\",\"Detach Device\",\"Create ProtocolController With Ports\",\"Delete ProtocolController\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ProtocolControllerMaskingCapabilities.SupportedSynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed without the creation of a job. If an operation is included in both this and SupportedAsynchronousActions then the underlying instrumentation is indicating that it may or may not create a job. Values are: 
	 * Create StorageHardwareID: The CreateStorageHardwareID extrinsic.
	 * Create StorageHardwareID by ExposePaths: The implicit creation of CreateStorageHardwareID by the ExposePaths extrinsic.
	 * Delete StorageHardwareID: The DeleteStorageHardwareID extrinsic.
	 * Delete StorageHardwareID by Delete Instance intrinsic: The DeleteInstance intrinsic of a StorageHardwareID.
	 * Create Gateway Path ID: The CreateGatewayPathID extrinsic.
	 * Delete Gateway Path ID: The DeleteInstance intrinsic of a GatewayPathID.
	 * Create StorageHardwareID Collection: The Delete StorageHardwareID Collection: The DeleteInstance intrinsic of a SystemSpecificCollection.
	 * Add StorageHardwareID to Collection: The AddHardwareIDsToCollection extrinsic.
	 * Remove StorageHardwareID from Collection: The DeleteInstance intrinsic of a MemberOfCollection.
	 * Expose Paths: The ExposePaths extrinsic.
	 * Hide Paths: The HidePaths extrinsic.
	 * Expose Default LUs: The ExposeDefaultLUs extrinsic.
	 * Hide Default LUs: The HideDefaultLUs extrinsic.
	 * Attach Device: The AttachDevice extrinsic.
	 * Detach Device: The DetachDevice extrinsic.
	 * Create ProtocolController With Ports: The CreateProtocolControllerWithPorts extrinsic.
	 * Delete ProtocolController: The DeleteProtocolController extrinsic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerMaskingCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"..\",\"32768..65535\"]' Values='[\"Create StorageHardwareID\",\"Create StorageHardwareID by ExposePaths\",\"Delete StorageHardwareID\",\"Create Gateway Path ID\",\"Delete Gateway Path ID\",\"Create StorageHardwareID Collection\",\"Delete StorageHardwareID Collection\",\"Add StorageHardwareIDs to Collection\",\"Remove StorageHardwareIDs from Collection\",\"Expose Paths\",\"Hide Paths\",\"Expose Default Views\",\"Hide Default Views\",\"Attach Device\",\"Detach Device\",\"Create ProtocolController With Ports\",\"Delete protocolController\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ProtocolControllerMaskingCapabilities.SupportedAsynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method indicates if ElementName can be specified as a part of invoking an appropriate method of the ControllerConfigurationService to create a new element. 
	 * Additionally, the returned data includes the methods that can be used to modify the ElementName of existing storage elements. 
	 * This method also returns the restrictions on the ElementName in the related "OUT" parameters.
	 * @param ElementType A value indicating the element type.
	 * @param Goal Properties of the Goal provide additional information about ElementType.
	 * @param SupportedFeatures
	 *   Enumeration indicating what methods can accept the element name for creation or modification of a storage element. 
	 *   ExposePaths is an example of an InvokeMethod. ModifyInstance and SetProperty are examples of intrinsic methods. 
	 *   An empty array indicates ElementNaming for ElementType is not supported, in which case the other OUT parameters are null.
	 * @param MaxElementNameLen Maximum supported ElementName length.
	 * @param ElementNameMask
	 *   This string expresses the restrictions on ElementName. The mask is expressed as a regular expression. See DMTF standard ABNF with the Management Profile Specification Usage Guide, Annex C for the regular expression syntax permitted. 
	 *   Since the ElementNameMask can describe the maximum length of the ElementName, any length defined in the regexp is in addition to the restriction defined in MaxElementNameLen (causing the smaller value to be the maximum length). The ElementName value satisfies the restriction, if and only if it matches the regular expression. 
	 *   If NULL, it indicates no restrictions on the ElementName.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"StorageHardwareID\",\"SCSIProtocolController\",\"DMTF Reserved\",\"Vendor Specific\"]'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" SupportedFeaturesUnique="false" SupportedFeaturesMany="true"
	 *        SupportedFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"ElementName can be supplied during creation\",\"ElementName can be modified with InvokeMethod\",\"ElementName can be modified with intrinsic method\",\"DMTF Reserved\",\"Vendor Specific\"]'" MaxElementNameLenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.MaxElementNameLen\"]'" ElementNameMaskAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.ElementNameMask\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ControllerConfigurationService.ExposePaths\",\"CIM_ControllerConfigurationService.ExposePathsWithNameAndHostType\",\"CIM_StorageHardwareIDManagementService.CreateStorageHardwareID\",\"CIM_GroupMaskingMappingService.CreateMaskingView\"]'"
	 * @generated
	 */
	Long GetElementNameCapabilities(Integer ElementType, CIM_ManagedElement Goal, EList<Integer> SupportedFeatures, Integer MaxElementNameLen, String ElementNameMask);

} // CIM_ProtocolControllerMaskingCapabilities
