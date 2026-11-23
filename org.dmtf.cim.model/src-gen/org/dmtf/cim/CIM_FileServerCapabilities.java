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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM File Server Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that implemets the CreateGoalSettings method that a client may use to secure CIM_Setting_Data subclasses that can be used in creating or modifying a FileServer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileServerCapabilities#getFileServerSettingsSupported <em>File Server Settings Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerCapabilities#getCIFSSupported <em>CIFS Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerCapabilities#getNFSSupported <em>NFS Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerCapabilities#getNISSupported <em>NIS Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerCapabilities#getDNSSupported <em>DNS Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerCapabilities#getNetworkVLANSupported <em>Network VLAN Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerCapabilities#getScaleOutSupported <em>Scale Out Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileServerCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::SystemResources' override.CreateGoalSettings='uint16' override.CreateGoalSettings.Description='Method to create a set of supported SettingData elements, from two sets of SettingData elements, provided by the caller. \nCreateGoalSettings should be used when the SettingData instances that represents the goal will not persist beyond the execution of the client and where those instances are not intended to be shared with other, non-cooperating clients. \nBoth TemplateGoalSettings and SupportedGoalSettings are arrays of elements that are strings containing EmbeddedInstances of a CIM_SettingData subclass. These embedded instances do not exist in the infrastructure supporting this method but are maintained by the caller/client. \nThis method should return CIM_Error(s) representing that a single named property of a setting (or other) parameter (either reference or embedded object) has an invalid value or that an invalid combination of named properties of a setting (or other) parameter (either reference or embedded object) has been requested. \nIf the input TemplateGoalSettings is NULL or the empty string, this method returns a default SettingData element that is supported by this Capabilities element. \nIf the TemplateGoalSettings specifies values that cannot be supported, this method shall return an appropriate CIM_Error and should return a best match for a SupportedGoalSettings. \nThe client proposes a goal using the TemplateGoalSettings parameter and gets back Success if the TemplateGoalSettings is exactly supportable. It gets back \"Alternative Proposed\" if the output SupportedGoalSettings represents a supported alternative. This alternative should be a best match, as defined by the implementation. \nIf the implementation is conformant to a RegisteredProfile, then that profile may specify the algorithms used to determine best match. A client may compare the returned value of each property against the requested value to determine if it is left unchanged, degraded or upgraded. \n\nOtherwise, if the TemplateGoalSettings is not applicable an \"Invalid Parameter\" error is returned. \n\nWhen a mutually acceptable SupportedGoalSettings has been achieved, the client may use the contained SettingData instances as input to methods for creating a new FileServer or modifying an existing one. Also the embedded SettingData instances returned in the SupportedGoalSettings may be instantiated via CreateInstance, either by a client or as a side-effect of the execution of an extrinsic method for which the returned SupportedGoalSettings is passed as an embedded instance.' override.CreateGoalSettings.ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' override.CreateGoalSettings.Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Alternative Proposed\",\"DMTF Reserved\",\"Vendor Specific\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileServerCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>File Server Settings Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that there will be a FileServerSettings instance associated with the FileServer ComputerSystem.False indicates there is no FileServerSettings instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Server Settings Supported</em>' attribute.
	 * @see #setFileServerSettingsSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerCapabilities_FileServerSettingsSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getFileServerSettingsSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerCapabilities#getFileServerSettingsSupported <em>File Server Settings Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Server Settings Supported</em>' attribute.
	 * @see #getFileServerSettingsSupported()
	 * @generated
	 */
	void setFileServerSettingsSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>CIFS Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the File Server ComputerSystem supports CIFS Shares.False indicates that CIFS is not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CIFS Supported</em>' attribute.
	 * @see #setCIFSSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerCapabilities_CIFSSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCIFSSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerCapabilities#getCIFSSupported <em>CIFS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CIFS Supported</em>' attribute.
	 * @see #getCIFSSupported()
	 * @generated
	 */
	void setCIFSSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>NFS Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the File Server ComputerSystem supports NFS Exports.False indicates that NFS Exports is not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NFS Supported</em>' attribute.
	 * @see #setNFSSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerCapabilities_NFSSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getNFSSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerCapabilities#getNFSSupported <em>NFS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NFS Supported</em>' attribute.
	 * @see #getNFSSupported()
	 * @generated
	 */
	void setNFSSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>NIS Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the File Server ComputerSystem supports NIS.False indicates that NIS is not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIS Supported</em>' attribute.
	 * @see #setNISSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerCapabilities_NISSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getNISSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerCapabilities#getNISSupported <em>NIS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIS Supported</em>' attribute.
	 * @see #getNISSupported()
	 * @generated
	 */
	void setNISSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>DNS Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the File Server ComputerSystem supports DNS.False indicates that DNS is not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DNS Supported</em>' attribute.
	 * @see #setDNSSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerCapabilities_DNSSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getDNSSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerCapabilities#getDNSSupported <em>DNS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DNS Supported</em>' attribute.
	 * @see #getDNSSupported()
	 * @generated
	 */
	void setDNSSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Network VLAN Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the File Server ComputerSystem supports network VLAN tagging.False indicates that VLAN tagging is not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network VLAN Supported</em>' attribute.
	 * @see #setNetworkVLANSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerCapabilities_NetworkVLANSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getNetworkVLANSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerCapabilities#getNetworkVLANSupported <em>Network VLAN Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network VLAN Supported</em>' attribute.
	 * @see #getNetworkVLANSupported()
	 * @generated
	 */
	void setNetworkVLANSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Scale Out Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the File Server ComputerSystem supports ScaleOut.False indicates that ScaleOut is not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale Out Supported</em>' attribute.
	 * @see #setScaleOutSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerCapabilities_ScaleOutSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getScaleOutSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerCapabilities#getScaleOutSupported <em>Scale Out Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Out Supported</em>' attribute.
	 * @see #getScaleOutSupported()
	 * @generated
	 */
	void setScaleOutSupported(Boolean value);

} // CIM_FileServerCapabilities
