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
 * A representation of the model object '<em><b>CIM Boot Config Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from SettingData that provides the container to arrange all the BootSourceSetting instances in an ordered sequence. There can be one or more of the BootConfigSetting instances associated to a ComputerSystem. For example, one such BootConfigSetting could be a default boot configuration supplied by the manufacturer, a second one could be a configuration recommended by the IT Administrator. A third one could be the one actually to be used on next system boot.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BootConfigSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::System::Boot' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BootConfigSetting extends CIM_SettingData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to change the boot order within a boot configuration. An ordered array of BootSourceSetting instances is passed to this method. Each BootSourceSetting instance MUST already be associated with this BootConfigSetting instance via an instance of OrderedComponent. If not, the implementation MUST return a value of "Invalid Parameter" Upon execution of this method, the value of the AssignedSequence property on each instance of OrderedComponent will be updated such that the values are monotonically increasing in correlation with the position of the referenced BootSourceSetting instance in the source input parameter. That is, the first position in the array will have the lowest value for AssignedSequence. The second position will have the second lowest value, and so on. For BootSourceSetting instances which are associated with the BootConfigSetting instance via OrderedComponent and not present in the input array, the AssignedSequence property on the OrderedComponent association will be assigned a value of 0.
	 * @param Source An ordered array of BootSourceSettings.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model SourceUnique="false" SourceMany="true"
	 *        SourceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BootSourceSetting REF[]' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ChangeBootOrder(EList<CIM_BootSourceSetting> Source, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method validates all settings associated with the BootConfigSetting. This is to make sure that all the settings of the newly created BootConfigSetting are consistent with the system configuration. This method returns True or False. True would only mean that the instrumentation has made a consistency check based on its current knowledge of the system, and does not actually guarantee the success of boot process.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Settings Validated OK\",\"Conflicting Settings\",\"Unknown/Unspecified Error\",\"Busy\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ValidateSettings();

} // CIM_BootConfigSetting
