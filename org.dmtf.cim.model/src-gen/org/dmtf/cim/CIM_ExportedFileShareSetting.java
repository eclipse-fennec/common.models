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
 * A representation of the model object '<em><b>CIM Exported File Share Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ExportedFileShareSetting describes the attribute values that were set when a FileShare was created for a LogicalFile by a FileExportService. These settings may be associated with the created Share via the ElementSettingData association; or, associated with an ExportedFileShareCapabilities element via SettingAssociatedToCapabilities; or, used as an EmbeddedInstanceparameter in a method (for instance, as a Goal). If the setting is associated with a FileShare, it cannot have undefined or NULL properties. If it is associated with an ExportedFileShareCapabilities, a NULL property indicates that the property is not supported or that the value is a vendor-specific context-dependent default that may not be changed. The FileSharingProtocol and ProtocolVersions properties cannot have a default value. If this Setting is associated with a ExportedFileShareCapabilities element via SettingAssociatedToCapabilities, the corresponding FileSharingProtocol and ProtocolVersions properties must match.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getFileSharingProtocol <em>File Sharing Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getProtocolVersions <em>Protocol Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getInitialEnabledState <em>Initial Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getOtherEnabledState <em>Other Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getDefaultReadWrite <em>Default Read Write</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getDefaultExecute <em>Default Execute</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getExecuteSupport <em>Execute Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getDefaultUserIdSupported <em>Default User Id Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getRootAccess <em>Root Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getWritePolicy <em>Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getAccessPoints <em>Access Points</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getCASupported <em>CA Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ExportedFileShareSetting extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>File Sharing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer indicating the filesharing protocol that this share can support. This property must exist and have a value. The version of the protocol must be specified in the corresponding ProtocolVersions property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Sharing Protocol</em>' attribute.
	 * @see #setFileSharingProtocol(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_FileSharingProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"NFS\",\"CIFS\",\"DAFS\",\"WebDAV\",\"HTTP\",\"FTP\",\"DMTF Reserved\",\"Vendor Defined\"]' ModelCorrespondence='[\"CIM_ExportedFileShareCapabilities.FileSharingProtocol\",\"CIM_ExportedFileShareSetting.ProtocolVersions\"]'"
	 * @generated
	 */
	Integer getFileSharingProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getFileSharingProtocol <em>File Sharing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Sharing Protocol</em>' attribute.
	 * @see #getFileSharingProtocol()
	 * @generated
	 */
	void setFileSharingProtocol(Integer value);

	/**
	 * Returns the value of the '<em><b>Protocol Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings listing the versions of the file sharing protocol that this share can support. This property must exist and have at least one entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_ProtocolVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ExportedFileShareCapabilities.ProtocolVersions\",\"CIM_ExportedFileShareSetting.FileSharingProtocol\"]'"
	 * @generated
	 */
	EList<String> getProtocolVersions();

	/**
	 * Returns the value of the '<em><b>Initial Enabled State</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InitialEnabledState is an integer enumeration that indicates the enabled/disabled states initially set for a file share element. Unlike FileShare.EnabledState it cannot indicate transitions between requested states because those states cannot be requested. The following text briefly summarizes the various enabled/disabled initial states: 
	 * Enabled (2) indicates that the element will execute commands, will process any queued commands, and will queue new requests. 
	 * Disabled (3) indicates that the element will not execute commands and will drop any new requests. 
	 * In Test (7) indicates that the element will be in a test state. 
	 * Deferred (8) indicates that the element will not process any commands but will queue new requests. 
	 * Quiesce (9) indicates that the element is enabled but in a restricted mode. The element's behavior is similar to the Enabled state, but it only processes a restricted set of commands. All other requests are queued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Enabled State</em>' attribute.
	 * @see #setInitialEnabledState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_InitialEnabledState()
	 * @model default="8"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"7\",\"8\",\"9\",\"11..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"In Test\",\"Deferred\",\"Quiesce\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.OtherEnabledState\",\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	Integer getInitialEnabledState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getInitialEnabledState <em>Initial Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Enabled State</em>' attribute.
	 * @see #getInitialEnabledState()
	 * @generated
	 */
	void setInitialEnabledState(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Enabled State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the element's initial enabled/disabled state when the InitialEnabledState property is set to 1 ("Other"). This property MUST be set to NULL when InitialEnabledState is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Enabled State</em>' attribute.
	 * @see #setOtherEnabledState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_OtherEnabledState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.InitialEnabledState\"]'"
	 * @generated
	 */
	String getOtherEnabledState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getOtherEnabledState <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled State</em>' attribute.
	 * @see #getOtherEnabledState()
	 * @generated
	 */
	void setOtherEnabledState(String value);

	/**
	 * Returns the value of the '<em><b>Default Read Write</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies the default privileges that can be supported for read-write authorization. These default privileges can be overridden by privileges explicitly defined by a supported authorization mechanism(s). 
	 * 'No Access' indicates that access is not allowed. 'Read Only' indicates that read-only access is implicitly granted to all clients and write access is implicitly denied to all clients. 'Read/Write' indicates that both read and write access is implicitly granted to all clients. Any other reading or writing privileges must be granted or denied explicitly using the vendor's authorization mechanism or by using the CIM_Privilege model. The resulting access privileges will be surfaced using the CIM_Privilege model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Read Write</em>' attribute.
	 * @see #setDefaultReadWrite(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_DefaultReadWrite()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"No Access\",\"Read Only\",\"Read/Write\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getDefaultReadWrite();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getDefaultReadWrite <em>Default Read Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Read Write</em>' attribute.
	 * @see #getDefaultReadWrite()
	 * @generated
	 */
	void setDefaultReadWrite(Integer value);

	/**
	 * Returns the value of the '<em><b>Default Execute</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies the default privileges that can be supported for 'execute' authorization in an appropriate operating environment. These default privileges can be overridden by privileges explicitly defined by a supported authorization mechanism(s). 
	 * 'No Access' indicates that execute access is not allowed. 'Execute' indicates that execute access is implicitly granted to all clients. Any other execution privileges must be granted or denied explicitly using the vendor's authorization mechanism or by using the CIM_Privilege model. The resulting access privileges will be surfaced using the CIM_Privilege model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Execute</em>' attribute.
	 * @see #setDefaultExecute(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_DefaultExecute()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"No Access\",\"Execute\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getDefaultExecute();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getDefaultExecute <em>Default Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Execute</em>' attribute.
	 * @see #getDefaultExecute()
	 * @generated
	 */
	void setDefaultExecute(Integer value);

	/**
	 * Returns the value of the '<em><b>Execute Support</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies whether this share can support executable objects in any way. For instance, can this share be used as a paging file by a client. 
	 * 'Not Supported' indicates that no special support for executable objects is provided. 'Execution Supported' indicates that execution is supported, though this does not specify the kind of support. A vendor can extend this to indicate specific support mechanisms that may be provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execute Support</em>' attribute.
	 * @see #setExecuteSupport(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_ExecuteSupport()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Not Supported\",\"Execution Supported\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getExecuteSupport();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getExecuteSupport <em>Execute Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute Support</em>' attribute.
	 * @see #getExecuteSupport()
	 * @generated
	 */
	void setExecuteSupport(Integer value);

	/**
	 * Returns the value of the '<em><b>Default User Id Supported</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer that indicates whether the FileShare will use a default user id to control access to the share if the id of the importing client is not provided. 'No Default User Id' indicates that a default user should not be used. 'System-Specified Default User Id' indicates that only system-specified id should be used. 'Share-Specified Default Used Id' indicates that the default user id will be specified by the method that created or modified the share. If a default user id is supported, all the default access privileges will provided through that user as proxy. The resulting access privileges will be surfaced using the CIM_Privilege model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default User Id Supported</em>' attribute.
	 * @see #setDefaultUserIdSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_DefaultUserIdSupported()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"No Default User Id\",\"System-Specified Default User Id\",\"Share-Specified Default User Id\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getDefaultUserIdSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getDefaultUserIdSupported <em>Default User Id Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default User Id Supported</em>' attribute.
	 * @see #getDefaultUserIdSupported()
	 * @generated
	 */
	void setDefaultUserIdSupported(Integer value);

	/**
	 * Returns the value of the '<em><b>Root Access</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies whether the Share supports default access by privileged, system administrator- level ('root') users from specific hosts. These default privileges can always be overridden by privileges explicitly defined by a supported authorization mechanism(s). 
	 * 'No Root Access' indicates that the Share will deny root access to all clients. 'Allow Root Access' indicates that the Share will allow root access as specified by the RootAccessHosts parameter when the FileShare was created. The actual access allowed will be mediated by the authorization mechanism supported by the device and provider. 
	 * Any other root-access privileges must be granted or denied explicitly using the vendor's authorization mechanism or by using the CIM-specified privilege model. The resulting access privileges will be surfaced using the CIM_Privilege model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Access</em>' attribute.
	 * @see #setRootAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_RootAccess()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"No Root Access\",\"Allow Root Access\",\"DMTF Reserved\",\"Vendor Defined\"]' ModelCorrespondence='[\"CIM_FileExportService.CreateExportedShare(RootAccessHosts)\",\"CIM_FileExportService.ModifyExportedShare(RootAccessHosts)\"]'"
	 * @generated
	 */
	Integer getRootAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getRootAccess <em>Root Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Access</em>' attribute.
	 * @see #getRootAccess()
	 * @generated
	 */
	void setRootAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Write Policy</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies the default policy followed by the Share for how to handle writes to the Share. 
	 * 'Synchronous' indicates that the Share will perform synchronous writes. 'Asynchronous' indicates that the Share may perform asynchronous writes. (The WritePolicy settings may be overridden in the future with use of the Policy model.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Policy</em>' attribute.
	 * @see #setWritePolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_WritePolicy()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Synchronous\",\"Asynchronous\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getWritePolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getWritePolicy <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Policy</em>' attribute.
	 * @see #getWritePolicy()
	 * @generated
	 */
	void setWritePolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Access Points</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies the service access points that are available to this FileShare by default for use by clients to connect. These default access points can always be overridden by the privileges explicitly defined by a supported authorization mechanism(s). 
	 * Any ServiceAccessPoints that actually connect to this share will be associated to it by CIM_SAPAvailableForElement. The resulting access privileges will be surfaced using the CIM_Privilege model. 
	 * 'None' implies that no SAPs will have access by default. 
	 * 'Service Default' indicates that any SAPs specified as the default port by the Service will have default access - this could be vendor-specific. 
	 * 'All' indicates that all SAPs supported by the service will have access by default. 
	 * 'Named Points' indicates that the Service Access Points that have default access may be specified as a parameter when this share was created or modified. These ports or endpoints will be given the necessary privileges to access this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Points</em>' attribute.
	 * @see #setAccessPoints(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_AccessPoints()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"None\",\"Service Default\",\"All\",\"Named Points\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getAccessPoints();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getAccessPoints <em>Access Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Points</em>' attribute.
	 * @see #getAccessPoints()
	 * @generated
	 */
	void setAccessPoints(Integer value);

	/**
	 * Returns the value of the '<em><b>CA Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to CIFS/SMB shares only. If it is true, it means that "Continuous Availability" is supported for this CIFS share. Continuous Availability (CA) - Client/Server mediated recovery from network and server failure with application transparency. Like Multi-Channel IO, this feature is somewhat analogous to capabilities available in NFSv4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CA Supported</em>' attribute.
	 * @see #setCASupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareSetting_CASupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCASupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareSetting#getCASupported <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CA Supported</em>' attribute.
	 * @see #getCASupported()
	 * @generated
	 */
	void setCASupported(Boolean value);

} // CIM_ExportedFileShareSetting
