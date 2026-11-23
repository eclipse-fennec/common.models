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
 * A representation of the model object '<em><b>CIM File Export Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FileExportCapabilities specifies the capability of a FileExportService to support the specified methods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileExportCapabilities#getFileSharingProtocol <em>File Sharing Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileExportCapabilities#getProtocolVersions <em>Protocol Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileExportCapabilities#getSupportedSynchronousMethods <em>Supported Synchronous Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileExportCapabilities#getSupportedAsynchronousMethods <em>Supported Asynchronous Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileExportCapabilities#getInitialEnabledState <em>Initial Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileExportCapabilities#getCASupported <em>CA Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileExportCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileExportCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>File Sharing Protocol</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers indicating the filesharing protocols that this service can support. Duplicate entries are permitted because they may be associated with different versions in the corresponding ProtocolVersions property. For each file sharing protocol supported nby the Service, there will be at least one FileExportCapabilities element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Sharing Protocol</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileExportCapabilities_FileSharingProtocol()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"NFS\",\"CIFS\",\"DAFS\",\"WebDAV\",\"HTTP\",\"FTP\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.FileSharingProtocol\",\"CIM_FileExportCapabilities.ProtocolVersions\"]'"
	 * @generated
	 */
	EList<Integer> getFileSharingProtocol();

	/**
	 * Returns the value of the '<em><b>Protocol Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings listing the versions of the file sharing protocol in the corresponding FileSharingProtocol property that can be supported by this FileExportService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileExportCapabilities_ProtocolVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.ProtocolVersions\",\"CIM_FileExportCapabilities.FileSharingProtocol\"]'"
	 * @generated
	 */
	EList<String> getProtocolVersions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of methods of this Service that are supported as synchronous methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileExportCapabilities_SupportedSynchronousMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"CreateExportedShare\",\"ModifyExportedShare\",\"ReleaseExportedShare\",\"CreateGoal\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousMethods();

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of methods of this Service that are supported as asynchronous methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileExportCapabilities_SupportedAsynchronousMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"CreateExportedShare\",\"ModifyExportedShare\",\"ReleaseExportedShare\",\"CreateGoal\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousMethods();

	/**
	 * Returns the value of the '<em><b>Initial Enabled State</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that indicates the enabled/disabled states to which the Service can initialize the created file share. Unlike FileShare.EnabledState it cannot indicate transitions between requested states because those states cannot be requested. The following text briefly summarizes the various enabled/disabled initial states: 
	 * Enabled (2) indicates that the element will execute commands, will process any queued commands, and will queue new requests. 
	 * Disabled (3) indicates that the element will not execute commands and will drop any new requests. 
	 * In Test (7) indicates that the element will be in a test state. 
	 * Deferred (8) indicates that the element will not process any commands but will queue new requests. 
	 * Quiesce (9) indicates that the element is enabled but in a restricted mode. The element's behavior is similar to the Enabled state, but it only processes a restricted set of commands. All other requests are queued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Enabled State</em>' attribute.
	 * @see #setInitialEnabledState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileExportCapabilities_InitialEnabledState()
	 * @model default="8"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Enabled\",\"Disabled\",\"In Test\",\"Deferred\",\"Quiesce\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getInitialEnabledState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileExportCapabilities#getInitialEnabledState <em>Initial Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Enabled State</em>' attribute.
	 * @see #getInitialEnabledState()
	 * @generated
	 */
	void setInitialEnabledState(Integer value);

	/**
	 * Returns the value of the '<em><b>CA Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to CIFS/SMB shares only. If it is true, it means that "Continuous Availability" is supported by this service. Continuous Availability (CA) - Client/Server mediated recovery from network and server failure with application transparency. Like Multi-Channel IO, this feature is somewhat analogous to capabilities available in NFSv4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CA Supported</em>' attribute.
	 * @see #setCASupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileExportCapabilities_CASupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCASupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileExportCapabilities#getCASupported <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CA Supported</em>' attribute.
	 * @see #getCASupported()
	 * @generated
	 */
	void setCASupported(Boolean value);

} // CIM_FileExportCapabilities
