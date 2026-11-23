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
 * A representation of the model object '<em><b>CIM Group Masking Mapping Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Methods to work with masking groups.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_GroupMaskingMappingService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::ComponentElement' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_GroupMaskingMappingService extends CIM_ControllerConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates a masking group.
	 * @param GroupName If nameable, an end user relevant name for the group being created. If NULL or not nameable, then system assigns a name.
	 * @param Type The type of masking group to create.
	 * @param Members List of elements to add to the masking group. For device masking groups the order is maintained. If NULL, the group will be empty -- if empty groups are supported.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param DeleteOnEmpty If true and empty groups are allowed, the group will be deleted when the last element is removed from the group. If empty groups are not allowed, the group will be deleted automatically when the group becomes empty. If this parameter is not NULL, its value will be used to set the group's DeleteOnEmpty property. Use the intrinsic method ModifyInstance to change this property after the group is created.
	 * @param DeleteWhenBecomesUnassociated If true, the group will be deleted when the group is no longer associated with a masking view. This can happen when the masking view is deleted or the group is removed from the masking view. If this parameter is not NULL, its value will be used to set the group's DeleteWhenBecomesUnassociated property. Use the intrinsic method ModifyInstance to change this property after the group is created.
	 * @param ConsistentLogicalUnitNumber A volume may be visible to the same initiator through multiple paths. Depending on which path the volume is visible to an initiator, the volume may have a different logical unit number. To ensure a volume has the same logical unit number to a given initiator regardless of the path, the property InitiatorMaskingGroup.ConsistentLogicalUnitNumber shall be set to true. The value of this parameter, if not NULL, is used to set the property InitiatorMaskingGroup.ConsistentLogicalUnitNumber when the initiator masking group is created. Use the intrinsic method ModifyInstance to change the value of the property InitiatorMaskingGroup.ConsistentLogicalUnitNumber after the masking group is created.
	 * @param MaskingGroup Reference to the created group.
	 * <!-- end-model-doc -->
	 * @model GroupNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" TypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"InitiatorMaskingGroup\",\"TargetMaskingGroup\",\"DeviceMaskingGroup\"]'" MembersUnique="false" MembersMany="true"
	 *        MembersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" DeleteOnEmptyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" DeleteWhenBecomesUnassociatedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" ConsistentLogicalUnitNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" MaskingGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MaskingGroup REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateGroup(String GroupName, Integer Type, EList<CIM_ManagedElement> Members, CIM_ConcreteJob Job, Boolean DeleteOnEmpty, Boolean DeleteWhenBecomesUnassociated, Boolean ConsistentLogicalUnitNumber, CIM_MaskingGroup MaskingGroup);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delete a masking group. Deleting a masking group does not delete its constituents.
	 * @param MaskingGroup Reference to a masking group.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param Force Attempt to delete the masking group even though it is associated to a masking view, or the group is not empty. The intent of the Force parameter is to reduce the chance of accidental deletion of a masking group.
	 * <!-- end-model-doc -->
	 * @model MaskingGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MaskingGroup REF' Required='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteGroup(CIM_MaskingGroup MaskingGroup, CIM_ConcreteJob Job, Boolean Force);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add members to an existing masking group.
	 * @param MaskingGroup Reference to an existing masking group.
	 * @param Members List of elements to add to the group. New members are added, in the order supplied, to the end of the existing members of the group. It is not an error, if a new member is already in the group.
	 * @param DeviceNumbers List of device numbers that correspond to Members. This property is applicable when the group consists of storage volumes.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * <!-- end-model-doc -->
	 * @model MaskingGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MaskingGroup REF' Required='true'" MembersUnique="false" MembersMany="true"
	 *        MembersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]'" DeviceNumbersUnique="false" DeviceNumbersMany="true"
	 *        DeviceNumbersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddMembers(CIM_MaskingGroup MaskingGroup, EList<CIM_ManagedElement> Members, EList<String> DeviceNumbers, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remove members from a masking group.
	 * @param MaskingGroup Reference to an existing masking group.
	 * @param Members List of elements to remove from a group. Deleting all members of a group is equivalent to deleting the group if empty groups are not supported by the implementation.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param DeleteOnEmpty If true and removal of the members causes the group to become empty, the group will be deleted. Note, if empty groups are not allowed, the group will be deleted automatically when the group becomes empty. If this parameter is not NULL, it overrides the group's property DeleteOnEmpty.
	 * <!-- end-model-doc -->
	 * @model MaskingGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MaskingGroup REF' Required='true'" MembersUnique="false" MembersMany="true"
	 *        MembersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" DeleteOnEmptyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveMembers(CIM_MaskingGroup MaskingGroup, EList<CIM_ManagedElement> Members, CIM_ConcreteJob Job, Boolean DeleteOnEmpty);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expose a group of SCSI logical units (such as RAID volumes or tape drives) to a group of initiators through a group of target ports, through one or more SCSIProtocolControllers (SPCs). 
	 * If 0 is returned, the function completed successfully and no ConcreteJob instance is created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	 * @param ElementName A user relevant name for the masking view. If NULL, the implementation assigns a name.
	 * @param InitiatorMaskingGroup Reference to a group of initiators.
	 * @param TargetMaskingGroup Reference to a group of target ports.
	 * @param DeviceMaskingGroup Reference to a group of devices.
	 * @param DeviceNumbers List of device numbers that correspond to the elements of DeviceMaskingGroup. If this parameter is NULL, device numbers are assigned by the instrumentation.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param ProtocolController A reference to the created SCSIProtocolController, which represents the masking view.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" InitiatorMaskingGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MaskingGroup REF'" TargetMaskingGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MaskingGroup REF'" DeviceMaskingGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MaskingGroup REF'" DeviceNumbersUnique="false" DeviceNumbersMany="true"
	 *        DeviceNumbersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ProtocolControllerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateMaskingView(String ElementName, CIM_MaskingGroup InitiatorMaskingGroup, CIM_MaskingGroup TargetMaskingGroup, CIM_MaskingGroup DeviceMaskingGroup, EList<String> DeviceNumbers, CIM_ConcreteJob Job, CIM_SCSIProtocolController ProtocolController);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delete a masking view, i.e. a SCSIProtocolControllers. Deleting a masking view may also delete the associated masking groups -- see the applicable capabilities and group properties. If 0 is returned, the function completed successfully and no ConcreteJob instance is created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	 * @param ProtocolController A reference to the SCSIProtocolController to delete. The masking group associated with the view may also get deleted depending on the groups' applicable properties.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param DeleteWhenBecomesUnassociated Override the setting of the groups' property DeleteWhenBecomesUnassociated with the value of this parameter.
	 * <!-- end-model-doc -->
	 * @model ProtocolControllerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF' Required='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" DeleteWhenBecomesUnassociatedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteMaskingView(CIM_SCSIProtocolController ProtocolController, CIM_ConcreteJob Job, Boolean DeleteWhenBecomesUnassociated);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modify a masking view by adding a masking group or by removing a masking group from the masking view. If 0 is returned, the function completed successfully and no ConcreteJob instance was created. If 0x1000 is returned, a ConcreteJob was started and a reference to this Job is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition.
	 * @param Operation Operation describes the type of modification to be made to the masking view.
	 * @param ProtocolController The reference to the masking view to modify.
	 * @param MaskingGroup A reference to the masking group to add or to remove.
	 * @param DeviceNumbers This parameter applies to an "add group" operation. It is a list of device numbers that correspond to the elements of a MaskingGroup.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param Force If true, the client is not warned that the operation may render the masking view unusable.
	 * <!-- end-model-doc -->
	 * @model OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Add Group\",\"Remove Group\",\"DMTF Reserved\",\"Vendor Specific\"]'" ProtocolControllerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF' Required='true'" MaskingGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MaskingGroup REF'" DeviceNumbersUnique="false" DeviceNumbersMany="true"
	 *        DeviceNumbersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyMaskingView(Integer Operation, CIM_SCSIProtocolController ProtocolController, CIM_MaskingGroup MaskingGroup, EList<String> DeviceNumbers, CIM_ConcreteJob Job, Boolean Force);

} // CIM_GroupMaskingMappingService
