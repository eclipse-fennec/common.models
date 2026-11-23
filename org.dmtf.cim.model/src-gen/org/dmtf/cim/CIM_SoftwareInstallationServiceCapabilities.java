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
 * A representation of the model object '<em><b>CIM Software Installation Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of capabilities that defines the capabilities of a SoftwareInstallationService. A single instance of SoftwareInstallationServiceCapabilities is associated with a SoftwareInstallationService using ElementCapabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedTargetTypes <em>Supported Target Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedExtendedResourceTypes <em>Supported Extended Resource Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getCanAddToCollection <em>Can Add To Collection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedInstallOptions <em>Supported Install Options</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getOtherSupportedExtendedResourceTypeDescriptions <em>Other Supported Extended Resource Type Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedExtendedResourceTypesMajorVersions <em>Supported Extended Resource Types Major Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedExtendedResourceTypesMinorVersions <em>Supported Extended Resource Types Minor Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedExtendedResourceTypesRevisionNumbers <em>Supported Extended Resource Types Revision Numbers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedExtendedResourceTypesBuildNumbers <em>Supported Extended Resource Types Build Numbers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getSupportedURISchemes <em>Supported URI Schemes</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.28.0' UMLPackagePath='CIM::Core::Software' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareInstallationServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions then the underlying implementation is indicating that it may or may not create a job. If a Job is created, then the methods in SoftwareInstallationService return a reference to that Job as the Job parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"None supported\",\"Install From Software Identity\",\"Install from ByteStream\",\"Install from URI\"]' ModelCorrespondence='[\"CIM_SoftwareInstallationServiceCapabilities.SupportedSynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed without the creation of a job. If an operation is included in both this and SupportedAsynchronousActions then the underlying instrumentation is indicating that it may or may not create a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"None supported\",\"Install From Software Identity\",\"Install from ByteStream\",\"Install from URI\"]' ModelCorrespondence='[\"CIM_SoftwareInstallationServiceCapabilities.SupportedAsynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Target Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array containing a list of SoftwareIdentity.TargetType properties that this service 'knows' how to install. TargetType is an application specific string which is invariant across version or name changes of the SoftwareIdentity and so can be used by a client to select Software Identities compatible with this service. 
	 * If the service is generic (for example an OS installer), this array will be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Target Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedTargetTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' ModelCorrespondence='[\"CIM_SoftwareIdentity.TargetTypes\"]'"
	 * @generated
	 */
	EList<String> getSupportedTargetTypes();

	/**
	 * Returns the value of the '<em><b>Supported Extended Resource Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array containing a list of the binary format types that this service 'knows' how to install. The Values for this property are the subset of CIM_SoftwareIdentityResource.ExtendedResourceTypes that apply to the 'Installer and Payload', 'Installer' and ' Installability Checker' ResourceTypes. For example, an a Windows system, this property may be set to '4' indicating 'Windows MSI'. This property should be set to '2' (Not Applicable) if this service is not OS specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Extended Resource Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedExtendedResourceTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Linux RPM\",\"HP-UX Depot\",\"Windows MSI\",\"Solaris Package\",\"Macintosh Disk Image\",\"Debian linux Package\",\"VMware vSphere Installation Bundle\",\"VMware Software Bulletin\",\"HP Smart Component\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareInstallationServiceCapabilities.OtherSupportedExtendedResourceTypeDescriptions\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesMajorVersions\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesMinorVersions\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesRevisionNumbers\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesbuildNumbers\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedExtendedResourceTypes();

	/**
	 * Returns the value of the '<em><b>Can Add To Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether SoftwareInstallationService.InstallFromSoftwareIdentity supports adding a SoftwareIdentity to a Collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Add To Collection</em>' attribute.
	 * @see #setCanAddToCollection(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_CanAddToCollection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 * @generated
	 */
	Boolean getCanAddToCollection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities#getCanAddToCollection <em>Can Add To Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Add To Collection</em>' attribute.
	 * @see #getCanAddToCollection()
	 * @generated
	 */
	void setCanAddToCollection(Boolean value);

	/**
	 * Returns the value of the '<em><b>Supported Install Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the specific install related optionssupported by this service. Since this is an array, multiple values may be specified. See the InstallOptions parameter of theSoftwareInstallationService.InstallFromSoftwareIdentity method for the description of these values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Install Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedInstallOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"32768..65535\"]' Values='[\"Defer target/system reset\",\"Force installation\",\"Install\",\"Update\",\"Repair\",\"Reboot\",\"Password\",\"Uninstall\",\"Log\",\"SilentMode\",\"AdministrativeMode\",\"ScheduleInstallAt\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_SoftwareInstallationService.InstallFromSoftwareIdentity\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedInstallOptions();

	/**
	 * Returns the value of the '<em><b>Other Supported Extended Resource Type Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the binary format types that this service 'knows' how to install when the corresponding SupportedExtendedResourceTypes array includes the value 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Extended Resource Type Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_OtherSupportedExtendedResourceTypeDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesMajorVersions\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesMinorVersions\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesRevisionNumbers\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesbuildNumbers\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedExtendedResourceTypeDescriptions();

	/**
	 * Returns the value of the '<em><b>Supported Extended Resource Types Major Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the major number component of the installer version supported by the SoftwareInstallationService.The installer format is represented by the element at the same index in the SupportedExtendedResourceTypes array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Extended Resource Types Major Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedExtendedResourceTypesMajorVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeMajorVersion\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedExtendedResourceTypesMajorVersions();

	/**
	 * Returns the value of the '<em><b>Supported Extended Resource Types Minor Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the minor number component of the installer version supported by the SoftwareInstallationService.The installer format is represented by the element at the same index in the SupportedExtendedResourceTypes array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Extended Resource Types Minor Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedExtendedResourceTypesMinorVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeMinorVersion\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedExtendedResourceTypesMinorVersions();

	/**
	 * Returns the value of the '<em><b>Supported Extended Resource Types Revision Numbers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the revision number component of the installer version supported by the SoftwareInstallationService.The installer format is represented by the element at the same index in the SupportedExtendedResourceTypes array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Extended Resource Types Revision Numbers</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedExtendedResourceTypesRevisionNumbers()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeRevisionNumber\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedExtendedResourceTypesRevisionNumbers();

	/**
	 * Returns the value of the '<em><b>Supported Extended Resource Types Build Numbers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the build number component of the installer version supported by the SoftwareInstallationService.The installer format is represented by the element at the same index in the SupportedExtendedResourceTypes array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Extended Resource Types Build Numbers</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedExtendedResourceTypesBuildNumbers()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeBuildNumber\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedExtendedResourceTypesBuildNumbers();

	/**
	 * Returns the value of the '<em><b>Supported URI Schemes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property lists the URI schemes supported by the SoftwareInstallationService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported URI Schemes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationServiceCapabilities_SupportedURISchemes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"data\",\"file\",\"ftp\",\"http\",\"https\",\"nfs\",\"tftp\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedURISchemes();

} // CIM_SoftwareInstallationServiceCapabilities
