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
 * A representation of the model object '<em><b>CIM Exported File Share Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ExportedFileShareCapabilities specifies the combination of properties that a FileExportService can support when creating or maintaining FileShares. Each supported combination of properties is specified by a ExportedFileShareSetting that is associated with the ExportedFileShareCapabilities element via SettingAssociatedToCapabilities. 
 * An ExportedFileShareCapabilities element specifies the properties supported when using it. A CreateGoal method is provided that creates an ExportedFileShareSetting element to be used as a goal when creating or modifying a file share.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareCapabilities#getFileSharingProtocol <em>File Sharing Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareCapabilities#getProtocolVersions <em>Protocol Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareCapabilities#getSupportedProperties <em>Supported Properties</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExportedFileShareCapabilities#getCASupported <em>CA Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ExportedFileShareCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>File Sharing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer indicating the filesharing protocol that this share can support. All settings associated with this Capabilities must have the same value for the FileSharingProtocol property. This property must exist and have a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Sharing Protocol</em>' attribute.
	 * @see #setFileSharingProtocol(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareCapabilities_FileSharingProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"NFS\",\"CIFS\",\"DAFS\",\"WebDAV\",\"HTTP\",\"FTP\",\"DMTF Reserved\",\"Vendor Defined\"]' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.FileSharingProtocol\",\"CIM_ExportedFileShareCapabilities.ProtocolVersions\"]'"
	 * @generated
	 */
	Integer getFileSharingProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareCapabilities#getFileSharingProtocol <em>File Sharing Protocol</em>}' attribute.
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
	 * An array of strings listing the versions of the file sharing protocol that can be supported via these capabilities. All settings associated with this Capabilities must have a non-empty subset of these values in the corresponding ProtocolVersions property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareCapabilities_ProtocolVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.ProtocolVersions\",\"CIM_ExportedFileShareCapabilities.FileSharingProtocol\"]'"
	 * @generated
	 */
	EList<String> getProtocolVersions();

	/**
	 * Returns the value of the '<em><b>Supported Properties</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of property names of the Setting that this Capabilities element supports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Properties</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareCapabilities_SupportedProperties()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"DefaultReadWrite\",\"DefaultExecute\",\"DefaultUserId\",\"RootAccess\",\"WritePolicy\",\"AccessPoints\",\"InitialEnabledState\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedProperties();

	/**
	 * Returns the value of the '<em><b>CA Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to CIFS/SMB shares only. If it is true, it means that "Continuous Availability" is supported for CIFS shares. Continuous Availability (CA) - Client/Server mediated recovery from network and server failure with application transparency. Like Multi-Channel IO, this feature is somewhat analogous to capabilities available in NFSv4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CA Supported</em>' attribute.
	 * @see #setCASupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExportedFileShareCapabilities_CASupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCASupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExportedFileShareCapabilities#getCASupported <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CA Supported</em>' attribute.
	 * @see #getCASupported()
	 * @generated
	 */
	void setCASupported(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to create an ExportedFileShareSetting from an ExportedFileShareSetting provided by the caller. If the operation completes successfully and did not require a long-running ConcreteJob, it will return 0. If 4096/0x1000 is returned, a ConcreteJob will be started to create the element. A Reference to the ConcreteJob will be returned in the output parameter Job. 
	 * This method MAY return a CIM_Error representing that a single named property of a setting (or other) parameter (either reference or embedded object) has an invalid value or that an invalid combination of named properties of a setting (or other) parameter (either reference or embedded object) has been requested. 
	 * If the input TemplateGoal is NULL or the empty string, this method returns a default ExportedFileShareSetting that is supported by this ExportedFileShareCapabilities. 
	 * The output is returned as the SupportedGoal parameter. Both TemplateGoal and SupportedGoal are embedded objects and do not exist in the provider but are maintained by the client. 
	 * If the TemplateGoal specifies values that cannot be supported, this method must return an appropriate error and should return a best match for a SupportedGoal.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TemplateGoal This is an element of the CIM_ExportedFileShareSetting class, or a derived class, encoded as a string-valued embedded object parameter. It specifies the goal element to be used for matching.
	 * @param SupportedGoal This is an element of the CIM_ExportedFileShareSetting class, or a derived class, encoded as a string-valued embedded object parameter. It specifies the element that is returned as the best supported match to the TemplateGoal.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TemplateGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ExportedFileShareSetting'" SupportedGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='false' Out='true' EmbeddedInstance='CIM_ExportedFileShareSetting'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Template Goal cannot be matched.\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer CreateGoal(CIM_ConcreteJob Job, String TemplateGoal, String SupportedGoal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This returns the restrictions on the ElementName in the related "OUT" parameters.
	 * @param SupportedFeatures
	 *   Enumeration indicating what methods can accept the element name for creation or modification of a storage element. 
	 *   CreateExportedShare is an example of an InvokeMethod. ModifyInstance and SetProperty are examples of intrinsic methods. 
	 *   An empty array indicates ElementNaming for ElementType is not supported, in which case the other OUT parameters are null.
	 * @param MaxElementNameLen Maximum supported ElementName length in characters.
	 * @param ElementNameMask
	 *   This string expresses the restrictions on ElementName. The mask is expressed as a regular expression. See DMTF standard ABNF with the Management Profile Specification Usage Guide, appendix C for the regular expression syntax permitted. 
	 *   Since the ElementNameMask can describe the maximum length of the ElementName,any length defined in the regexp is in addition to the restriction defined in MaxElementNameLen (causing the smaller value to be the maximum length)The ElementName value satisfies the restriction, if and only if it matches the regular expression.
	 *   If NULL, it indicates no restrictions on the ElementName.
	 * <!-- end-model-doc -->
	 * @model SupportedFeaturesUnique="false" SupportedFeaturesMany="true"
	 *        SupportedFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"ElementName can be supplied during creation\",\"ElementName can be modified with InvokeMethod\",\"ElementName can be modified with intrinsic method\",\"DMTF Reserved\",\"Vendor Specific\"]'" MaxElementNameLenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' MaxValue='256' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_UNIT_CONFIG_CAPS_T|MaxNameChars\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.MaxElementNameLen\"]'" ElementNameMaskAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.ElementNameMask\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Failed\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetElementNameCapabilities(EList<Integer> SupportedFeatures, Integer MaxElementNameLen, String ElementNameMask);

} // CIM_ExportedFileShareCapabilities
