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
 * A representation of the model object '<em><b>CIM Virtual System Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Service to define and manipulate virtual systems and their components
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::Virtualization' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualSystemManagementService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds resources to a virtual system configuration
	 * .When applied to a "state" virtual system configuration, as a side effect resources are added to the active virtual system.
	 * @param AffectedConfiguration Reference to the affected virtual system configuration.
	 * @param ResourceSettings Array of strings each containing one embedded instance of class CIM_ResourceAllocationSettingData that describes the virtual aspects of a virtual resource to be added to the virtual system.
	 * @param ResultingResourceSettings Array of references to instances of class CIM_ResourceAllocationSettingData representing virtual aspects of the added virtual resources.
	 * @param Job If the operation is long running, then optionally a job may be returned. In this case, the instances of class CIM_ResourceAllocationSettingData representing the added resource settings are available via association CIM_ConreteComponent from the instance of class CIM_VirtualSystemSettingData representing the affected virtual system configuration.
	 * <!-- end-model-doc -->
	 * @model AffectedConfigurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualSystemSettingData REF'" ResourceSettingsUnique="false" ResourceSettingsMany="true"
	 *        ResourceSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_ResourceAllocationSettingData' ArrayType='Indexed'" ResultingResourceSettingsUnique="false" ResultingResourceSettingsMany="true"
	 *        ResultingResourceSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourceAllocationSettingData REF[]' In='false' Out='true' ArrayType='Indexed'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Timeout\",\"Invalid Parameter\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddResourceSettings(CIM_VirtualSystemSettingData AffectedConfiguration, EList<String> ResourceSettings, EList<CIM_ResourceAllocationSettingData> ResultingResourceSettings, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a virtual system.
	 * Input that is not completely specified may be filled out with default values.
	 * @param SystemSettings String containing an embedded instance of class CIM_VirtualSystemSettingData that is used to define attributes of the virtual system to be created.
	 * @param ResourceSettings Array of strings each containing an embedded instance of class CIM_ResourceAllocationSettingData that describes the virtual aspects of a virtual resource to be created in the scope of the new virtual system.
	 * @param ReferenceConfiguration Reference to an instance of class CIM_VirtualSystemSettingData object that is the top level object of a reference virtual system configuration. The reference configuration is used to complement the configuration of the new virtual system if parameters SystemSettings and ResourceSettings did not provide respective information.
	 * @param ResultingSystem If a virtual computer system is successfully defined, a reference to an instance of class CIM_ComputerSystem that represents the newly defined virtual computer system is returned.
	 * @param Job If the operation is long running, then optionally a job may be returned. In this case, the instance of class CIM_ComputerSystem representing the new virtual systemis presented via association CIM_AffectedJobElementwith property AffectedElement refering to the new instance of class CIM_ComputerSystem and property ElementEffects set to 5 (Create).
	 * <!-- end-model-doc -->
	 * @model SystemSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_VirtualSystemSettingData'" ResourceSettingsUnique="false" ResourceSettingsMany="true"
	 *        ResourceSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_ResourceAllocationSettingData' ArrayType='Indexed'" ReferenceConfigurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualSystemSettingData REF'" ResultingSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Timeout\",\"Invalid Parameter\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DefineSystem(String SystemSettings, EList<String> ResourceSettings, CIM_VirtualSystemSettingData ReferenceConfiguration, CIM_ComputerSystem ResultingSystem, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Destroys a virtual system.
	 * The referenced virtual system is destroyed, including any elements scoped by it. Virtual resources are returned to their resource pools, which may imply the destruction of those resources (implementation dependent). If the virtual system is active when the operation is invoked, it is first deactivated and then destroyed. If snapshots were created from the virtual system, these are destroyed as well.
	 * @param AffectedSystem Reference to an instance of class CIM_ComputerSystem representing the virtual computer system that it to be destroyed.
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model AffectedSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Timeout\",\"Invalid Parameter\",\"Invalid State\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DestroySystem(CIM_ComputerSystem AffectedSystem, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modifies virtual resource settings.
	 * When applied to parts of a "current" virtual system configuration, as a side effect resources of the active virtual system may be modified.
	 * @param ResourceSettings Array of strings each containing an embedded instance of class CIM_ResourceAllocationSettingData that describes modifications to the virtual aspects of an existing virtual resource. All instances must have a valid InstanceID in order to identify the virtual resource setting to be modified.
	 * @param ResultingResourceSettings Array of references to instances of class Cim_ResourceAllocationSettingData representing virtual aspects of the modified virtual resources.
	 * @param Job If the operation is long running, then optionally a job be returned. In this case, the instances of class CIM_ResourceAllocationSettingData representing the modified resource settings are available via association CIM_ConreteComponent from the instance of class CIM_VirtualSystemSettingData representing the affected virtual system configuration.
	 * <!-- end-model-doc -->
	 * @model ResourceSettingsUnique="false" ResourceSettingsMany="true"
	 *        ResourceSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_ResourceAllocationSettingData' ArrayType='Indexed'" ResultingResourceSettingsUnique="false" ResultingResourceSettingsMany="true"
	 *        ResultingResourceSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourceAllocationSettingData REF[]' In='false' Out='true' ArrayType='Indexed'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Timeout\",\"Invalid Parameter\",\"Invalid State\",\"Incompatible Parameters\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyResourceSettings(EList<String> ResourceSettings, EList<CIM_ResourceAllocationSettingData> ResultingResourceSettings, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modifies virtual system settings.
	 * When applied to the system settings of a "current" virtual system configuration, as a side effect the virtual system instance may be modified.
	 * @param SystemSettings String containing an instance of class CIM_VirtualSystemSettingData that is used to modify the settings of the virtual system. The instance must have a valid InstanceID in order to identify the virtual system setting to be modified.
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model SystemSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_VirtualSystemSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Timeout\",\"Invalid Parameter\",\"Invalid State\",\"Incompatible Parameters\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifySystemSettings(String SystemSettings, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes virtual resource settings from a virtual system configuration.
	 * When applied to parts of a "current" virtual system configuration, as a side effect resources of the active virtual system may be removed.
	 * @param ResourceSettings Array of references to instances of class CIM_ResourceAllocationSettingData where each instance represents the settings of a virtual resource within a virtual system configuration that are to be removed.
	 * @param Job If the operation is long running, then optionally a job my be returned.
	 * <!-- end-model-doc -->
	 * @model ResourceSettingsUnique="false" ResourceSettingsMany="true"
	 *        ResourceSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourceAllocationSettingData REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Timeout\",\"Invalid Parameter\",\"Invalid State\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveResourceSettings(EList<CIM_ResourceAllocationSettingData> ResourceSettings, CIM_ConcreteJob Job);

} // CIM_VirtualSystemManagementService
