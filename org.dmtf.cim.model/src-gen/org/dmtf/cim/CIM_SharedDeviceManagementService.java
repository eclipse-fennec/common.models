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
 * A representation of the model object '<em><b>CIM Shared Device Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Service that describes the ability to control access to shared devices.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SharedDeviceManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::SCSI' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SharedDeviceManagementService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ShareDevice defines the ability to change the access of a System to a shared LogicalDevice. If this method completes successfully the value of CurrentAccess for the instance of CIM_SharingDependency which references the LogicalDevice will have the value of the RequestedAccess parameter. If 4096 (0x1000) is returned, then the task will take some time to complete, ConcreteJob will be created, and its reference returned in the output parameter Job.
	 * @param RequestedAccess The desired access of the System to the shared Logical Device.
	 * @param Device The LogicalDevice to change access to.
	 * @param System The System whose access to the LogicalDevice the change is requested for.
	 * @param TimeoutPeriod
	 *   A timeout period that specifies the maximum amount of time that the client is willing to wait for access to the shared device to be granted before the request should be abandoned. This value does not directly correlate to a timeout for the method invocation. That is, its possible for a job to be started to process the request and the method to return within the timeout period only to have the operation aborted later when the timeout period expires. The TimeoutPeriod shall be specified in interval format. A value of 0 indicates that if the requested access can not be granted immediately the client does not wish to wait and the request should fail. A null parameter indicates that the client has no time requirements for the request to be granted and wishes to wait indefinitely for access to be granted. 
	 *   If this property does not contain 0 or null and the implementation doesn't support this parameter, a return code of 'Use Of Timeout Parameter Not Supported' shall be returned.
	 * @param Force This parameter is used by a client to indicate that they wish the requested access to be granted even if it requires forcibly revoking access currently granted to another system. When the value of this parameter is true, and a valid TimeoutPeriod is specified, the implementation shall wait for the duration specified by TimeoutPeriod before forcibly modifying access. If the access requested can be granted without disruption prior to the TimeoutPeriod expiring, the implementation should complete the request and not wait for the expiration of the interval specified by TimeoutPeriod.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (may be null if task completed).
	 * <!-- end-model-doc -->
	 * @model RequestedAccessAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"No Access\",\"Exclusive Access\",\"Shared Read\",\"Shared Full\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_SharingDependency.CurrentAccess\",\"CIM_DeviceSharingCapabilities.SupportedAccessModes\"]'" DeviceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF' In='true'" SystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_System REF' In='true'" TimeoutPeriodAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" ForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11..4095\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Can NOT complete within Timeout Period\",\"Failed\",\"Invalid Parameter\",\"Unsupported Access\",\"Invalid Device\",\"Invalid System\",\"Use of Timeout Parameter Not Supported\",\"Busy\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ShareDevice(Integer RequestedAccess, CIM_LogicalDevice Device, CIM_System System, String TimeoutPeriod, Boolean Force, CIM_ConcreteJob Job);

} // CIM_SharedDeviceManagementService
