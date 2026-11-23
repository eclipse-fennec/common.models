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
 * A representation of the model object '<em><b>CIM Boot Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Service that provides the controls to manage the boot configuration of a managed computer system or device. This includes changing the order of the boot devices and affecting settings on managed elements during the boot process. This service can also affect the load of a specific operating system on the computer system through a BootSourceSetting that points to a specific operating system image.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BootService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::System::Boot' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_BootService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates a new boot configuration by creating a replica of an existing boot configuration. The new boot configuration shall be a duplicate, with the exception of key property values, of the BootConfigSetting, and its associated classes, specified in the StartingBootConfig parameter. If "State Data Supported" is present in the BootServiceCapabilities.BootCapabilitiesSupported property, the new BootConfigSetting shall be associated via ElementSettingData to a 'State' BootConfigSetting, which is associated to the ComputerSystem specified by the ScopingComputerSystem parameter. Otherwise the new BootConfigSetting shall be directly associated via ElementSettingData data to the ComputerSystem.
	 * @param StartingBootConfig An existing BootConfigSetting instance used as a template to replicate. factory default configuration.
	 * @param ScopingComputerSystem directly or indirectly associated. If ScopingComputerSystem has a non-NULL value, the scoping system for NewBootConfig is explicitly identified. If ScopingComputerSystem has a value of NULL, the new BootConfigSetting shall be related to the same set of ComputerSystems as is the template configuration.
	 * @param NewBootConfig The BootConfigSetting instance created by the method. This parameter is not returned if the method is run as a Job.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model StartingBootConfigAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BootConfigSetting REF' Required='true' In='true'" ScopingComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' In='true'" NewBootConfigAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BootConfigSetting REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long CreateBootConfigSetting(CIM_BootConfigSetting StartingBootConfig, CIM_ComputerSystem ScopingComputerSystem, CIM_BootConfigSetting NewBootConfig, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to set the role of the BootConfigSetting that is directly or indirectly associated to one or more ComputerSystems. The method applies the new role equally to all related ComputerSystems. If a BootConfigSetting can be related to more than one ComputerSystem, but role modification applies to just one of them, the SetBootConfigUsage method shall be used instead.
	 * The method shall update the IsNext or IsDefault property of every ElementSettingData that directly or indirectly associates BootConfigSetting to a ComputerSystem. The method may also update the IsNext or IsDefault property of other ElementSettingDatas that reference the same ComputerSystems to satisfy cardinality constraints.
	 * @param BootConfigSetting An existing BootConfigSetting instance whose role will be updated.
	 * @param Role
	 *   The desired Role of the BootConfigSetting. 
	 *   "IsNext" updates the ElementSettingData.IsNext property and indicates that the specified BootConfigSetting is to be used in the future when any of its related ComputerSystems are enabled.
	 *   "IsNextSingleUse" updates the ElementSettingData.IsNext property. It is similar to IsNext, except the change applies only to the next time a related ComputerSystem is enabled.
	 *   "IsDefault" updates the ElementSettingData.IsDefault property to indicate that the BootConfigSetting is identified as the default boot configuration for any of its related ComputerSystems
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model BootConfigSettingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BootConfigSetting REF' Required='true' In='true'" RoleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3..32767\",\"32768..65535\"]' Values='[\"IsNext\",\"IsNextSingleUse\",\"IsDefault\",\"DMTF Reserved\",\"Vendor Specified\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long SetBootConfigRole(CIM_BootConfigSetting BootConfigSetting, Integer Role, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to set the role of the BootConfigSetting for a specific ComputerSystem. The method shall update the IsNext or IsDefault property of the ElementSettingData that directly or indirectly associates ScopingComputerSystem and BootConfigSetting. The method may also update the IsNext or IsDefault property of other ElementSettingDatas that reference ScopingComputerSystem to satisfy cardinality constraints.
	 * @param BootConfigSetting An existing BootConfigSetting instance whose role will be updated.
	 * @param ScopingComputerSystem The ComputerSystem to which the new Role applies. A value of NULL indicates that the Role is to be applied to each ComputerSystem that is directly or indirectly associated to BootConfigSetting.
	 * @param Role
	 *   The desired Role of the BootConfigSetting.
	 *   "IsNext" updates the ElementSettingData.IsNext property and indicates that the specified BootConfigSetting is to be used in the future when ScopingComputerSystem is enabled.
	 *   "IsNextSingleUse" updates the ElementSettingData.IsNext property. It is similar to IsNext, except the change applies only to the next time the ScopingComputerSystem is enabled.
	 *   "IsDefault" updates the ElementSettingData.IsDefault property to indicate that the BootConfigSetting is identified as the default boot configuration for ScopingComputerSystem
	 *   "IsNotNext" removes the IsNext or IsNextSingleUse designation. The ComputerSystem will not be automatically booted the next time it is enabled.
	 *   "IsDefault" removes the IsDefault designation.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model BootConfigSettingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BootConfigSetting REF' Required='true' In='true'" ScopingComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' In='true'" RoleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5..32767\",\"32768..65535\"]' Values='[\"IsNext\",\"IsNextSingleUse\",\"IsDefault\",\"IsNotNext\",\"IsNotDefault\",\"DMTF Reserved\",\"Vendor Specified\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long SetBootConfigUsage(CIM_BootConfigSetting BootConfigSetting, CIM_ComputerSystem ScopingComputerSystem, Integer Role, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to indicate to the referenced ComputerSystem to apply the referenced BootConfigSetting. This shall cause the referenced ComputerSystem's boot process to start and apply the referenced BootConfigSetting.
	 * @param ScopingComputerSystem Reference to an instance of ComputerSystem which will apply the BootConfigSetting referenced by the ApplyBootConfig parameter. A value of NULL indicates that the ApplyBootConfig is to be applied to each related ComputerSystem.
	 * @param ApplyBootConfig Reference to an instance of BootConfigSetting which will be applied to the instance of ComputerSystem referenced by the ComputerSystem parameter.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model ScopingComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Required='true' In='true'" ApplyBootConfigAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BootConfigSetting REF' Required='true' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ApplyBootConfigSetting(CIM_ComputerSystem ScopingComputerSystem, CIM_BootConfigSetting ApplyBootConfig, CIM_ConcreteJob Job);

} // CIM_BootService
