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
 * A representation of the model object '<em><b>CIM Software Installation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of service which provides methods to install (or update) Software Identities in ManagedElements.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareInstallationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::Software' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareInstallationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method allows a client application to determine whether a specific SoftwareIdentity can be installed (or updated) on a ManagedElement. It also allows other characteristics to be determined such as whether install will require a reboot. In addition a client can check whether the SoftwareIdentity can be added simulataneously to a specified SofwareIndentityCollection. A client MAY specify either or both of the Collection and Target parameters. The Collection parameter is only supported if SoftwareInstallationServiceCapabilities.CanAddToCollection is TRUE.
	 * @param Source Reference to the SoftwareIdentity to be checked.
	 * @param Target Reference to the ManagedElement that the Software Identity is going to be installed in (or updated).
	 * @param Collection Reference to the Collection to which the Software Identity will be added.
	 * @param InstallCharacteristics
	 *   The parameter describes the characteristics of the installation/update that will take place if the Source Software Identity is installed: 
	 *   Target automatic reset: The target element will automatically reset once the installation is complete. 
	 *   System automatic reset: The containing system of the target ManagedElement (normally a logical device or the system itself) will automatically reset/reboot once the installation is complete. 
	 *   Separate target reset required: EnabledLogicalElement.RequestStateChange MUST be used to reset the target element after the SoftwareIdentity is installed. 
	 *   Separate system reset required: EnabledLogicalElement.RequestStateChange MUST be used to reset/reboot the containing system of the target ManagedElement after the SoftwareIdentity is installed. 
	 *   Manual Reboot Required: The system MUST be manually rebooted by the user. 
	 *   No reboot required : No reboot is required after installation. 
	 *   User Intervention Recomended : It is recommended that a user confirm installation of this SoftwareIdentity. Inappropriate application MAY have serious consequences. 
	 *   MAY be added to specified collection : The SoftwareIndentity MAY be added to specified Collection.
	 * <!-- end-model-doc -->
	 * @model SourceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SoftwareIdentity REF' In='true'" TargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" CollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF' In='true'" InstallCharacteristicsUnique="false" InstallCharacteristicsMany="true"
	 *        InstallCharacteristicsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='false' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x7FFF..0xFFFF\"]' Values='[\"Target automatic reset\",\"System automatic reset\",\"Separate target reset Required\",\"Separate system reset Required\",\"Manual Reboot Required\",\"No Reboot Required\",\"User Intervention recommended\",\"MAY be added to specified Collection\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101\",\"4102\",\"4103\",\"4104\",\"4105\",\"4106\",\"4107\",\"4108\",\"4109\",\"4110..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Target In Use\",\"DMTF Reserved\",\"Method Reserved\",\"Unsupported TargetType\",\"Unattended/silent installation not supported\",\"Downgrade/reinstall not supported\",\"Not enough memory\",\"Not enough swap-space\",\"Unsupported version transition\",\"Not enough disk space\",\"Software and target operating system mismatch\",\"Missing dependencies\",\"Not applicable to target\",\"No supported path to image\",\"Cannot add to Collection\",\"Asynchronous Job already in progress\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CheckSoftwareIdentity(CIM_SoftwareIdentity Source, CIM_ManagedElement Target, CIM_Collection Collection, EList<Integer> InstallCharacteristics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to install or update a SoftwareIdentity (Source) on a ManagedElement (Target). 
	 * In addition the method can be used to add the SoftwareIdentity simulataneously to a specified SofwareIndentityCollection. A client MAY specify either or both of the Collection and Target parameters. The Collection parameter is only supported if SoftwareInstallationServiceCapabilities.CanAddToCollection is TRUE. 
	 * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to perform the install. The Job's reference will be returned in the output parameter Job.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param InstallOptions
	 *   Options to control the install process.
	 *   Defer target/system reset : do not automatically reset the target/system.
	 *   Force installation : Force the installation of the same or an older SoftwareIdentity. Install: Perform an installation of this software on the managed element.
	 *   Update: Perform an update of this software on the managed element.
	 *   Repair: Perform a repair of the installation of this software on the managed element by forcing all the files required for installing the software to be reinstalled.
	 *   Reboot: Reboot or reset the system immediately after the install or update of this software, if the install or the update requires a reboot or reset.
	 *   Password: Password will be specified as clear text without any encryption for performing the install or update.
	 *   Uninstall: Uninstall the software on the managed element.
	 *   Log: Create a log for the install or update of the software.
	 *   SilentMode: Perform the install or update without displaying any user interface.
	 *   AdministrativeMode: Perform the install or update of the software in the administrative mode. ScheduleInstallAt: Indicates the time at which theinstall or update of the software will occur.
	 * @param InstallOptionsValues
	 *   InstallOptionsValues is an array of strings providing additional information to InstallOptions for the method to install the software. Each entry of this array is related to the entry in InstallOptions that is located at the same index providing additional information for InstallOptions. 
	 *   If the index in InstallOptions has the value "Password " then a value at the corresponding index of InstallOptionValues shall not be NULL. 
	 *   If the index in InstallOptions has the value "ScheduleInstallAt" then the value at the corresponding index of InstallOptionValues shall not be NULL and shall be in the datetime type format. 
	 *   If the index in InstallOptions has the value "Log " then a value at the corresponding index of InstallOptionValues may be NULL. 
	 *   If the index in InstallOptions has the value "Defer target/system reset", "Force installation","Install", "Update", "Repair" or "Reboot" then a value at the corresponding index of InstallOptionValues shall be NULL.
	 * @param Source Reference to the source of the install.
	 * @param Target The installation target. If NULL then the SOftwareIdentity will be added to Collection only. The underlying implementation is expected to be able to obtain any necessary metadata from the Software Identity.
	 * @param Collection Reference to the Collection to which the Software Identity SHALL be added. If NULL then the SOftware Identity will not be added to a Collection.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" InstallOptionsUnique="false" InstallOptionsMany="true"
	 *        InstallOptionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"32768..65535\"]' Values='[\"Defer target/system reset\",\"Force installation\",\"Install\",\"Update\",\"Repair\",\"Reboot\",\"Password\",\"Uninstall\",\"Log\",\"SilentMode\",\"AdministrativeMode\",\"ScheduleInstallAt\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareInstallationService.InstallOptionsValues[]\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedInstallOptions[]\"]'" InstallOptionsValuesUnique="false" InstallOptionsValuesMany="true"
	 *        InstallOptionsValuesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareInstallationService.InstallOptions[]\"]'" SourceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SoftwareIdentity REF' In='true'" TargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" CollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101\",\"4102\",\"4103\",\"4104\",\"4105\",\"4106\",\"4107\",\"4108\",\"4109..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Target In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Unsupported TargetType\",\"Unattended/silent installation not supported\",\"Downgrade/reinstall not supported\",\"Not enough memory\",\"Not enough swap-space\",\"Unsupported version transition\",\"Not enough disk space\",\"Software and target operating system mismatch\",\"Missing dependencies\",\"Not applicable to target\",\"No supported path to image\",\"Cannot add to Collection\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long InstallFromSoftwareIdentity(CIM_ConcreteJob Job, EList<Integer> InstallOptions, EList<String> InstallOptionsValues, CIM_SoftwareIdentity Source, CIM_ManagedElement Target, CIM_Collection Collection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to install software from a specific URI in a ManagedElement. 
	 * Note that this method is provided to support existing, alternative download mechanisms (such as used for firmware download). The 'normal' mechanism will be to use the InstallFromSoftwareIdentity method.
	 * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to to perform the install. The Job's reference will be returned in the output parameter Job.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param URI A URI for the software based on RFC 2079.
	 * @param Target The installation target.
	 * @param InstallOptions
	 *   Options to control the install process. 
	 *   See the InstallOptions parameter of the SoftwareInstallationService.InstallFromSoftwareIdentity method for the description of these values.
	 * @param InstallOptionsValues
	 *   InstallOptionsValues is an array of strings providing additionalinformation to InstallOptions for the method to install the software. Each entry of this array is related to the entry in InstallOptions that is located at the same index providing additional information for InstallOptions. 
	 *   For further information on the use of InstallOptionsValues parameter, see the description of the InstallOptionsValues parameter of the SoftwareInstallationService.InstallFromSoftwareIdentity method.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" URIAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" TargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" InstallOptionsUnique="false" InstallOptionsMany="true"
	 *        InstallOptionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"32768..65535\"]' Values='[\"Defer target/system reset\",\"Force installation\",\"Install\",\"Update\",\"Repair\",\"Reboot\",\"Password\",\"Uninstall\",\"Log\",\"SilentMode\",\"AdministrativeMode\",\"ScheduleInstallAt\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareInstallationService.InstallFromURI.InstallOptionsValues[]\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedInstallOptions[]\"]'" InstallOptionsValuesUnique="false" InstallOptionsValuesMany="true"
	 *        InstallOptionsValuesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareInstallationService.InstallFromByteStream.InstallOptions[]\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101\",\"4102\",\"4103\",\"4104\",\"4105\",\"4106\",\"4107\",\"4108..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Target In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Unsupported TargetType\",\"Unattended/silent installation not supported\",\"Downgrade/reinstall not supported\",\"Not enough memory\",\"Not enough swap-space\",\"Unsupported version transition\",\"Not enough disk space\",\"Software and target operating system mismatch\",\"Missing dependencies\",\"Not applicable to target\",\"URI not accessible\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long InstallFromURI(CIM_ConcreteJob Job, String URI, CIM_ManagedElement Target, EList<Integer> InstallOptions, EList<String> InstallOptionsValues);

} // CIM_SoftwareInstallationService
