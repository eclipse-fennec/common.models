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
 * A representation of the model object '<em><b>CIM Group Masking Mapping Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of CIM_ProtocolControllerMaskingCapabilities that defines the group masking-related capabilities of a ProtocolController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_GroupMaskingMappingCapabilities#getSupportedFeatures <em>Supported Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GroupMaskingMappingCapabilities#getSupportedInitiatorGroupFeatures <em>Supported Initiator Group Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GroupMaskingMappingCapabilities#getSupportedTargetGroupFeatures <em>Supported Target Group Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GroupMaskingMappingCapabilities#getSupportedDeviceGroupFeatures <em>Supported Device Group Features</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_GroupMaskingMappingCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::ComponentElement' override.SupportedAsynchronousActions='uint16[]' override.SupportedAsynchronousActions.Description='Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions then the underlying implementation is indicating that it may or may not create a job. Values are: \nCreateGroup: Create Group\nDeleteGroup: Delete Group\nAddMembers: Add Members\nRemoveMembers: Remove Members\nCreateMaskingView: Create Masking View\nDeleteMaskingView: Delete Masking View\nModifyMaskingView: Modify Masking View' override.SupportedAsynchronousActions.ValueMap='[\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"..\",\"32768..65535\"]' override.SupportedAsynchronousActions.Values='[\"CreateGroup\",\"DeleteGroup\",\"AddMembers\",\"RemoveMembers\",\"CreateMaskingView\",\"DeleteMaskingView\",\"ModifyMaskingView\",\"DMTF Reserved\",\"Vendor Specific\"]' override.SupportedAsynchronousActions.ModelCorrespondence='[\"CIM_GroupMaskingMappingCapabilities.SupportedSynchronousActions\"]' override.SupportedSynchronousActions='uint16[]' override.SupportedSynchronousActions.Description='Enumeration indicating what operations will be executed without the creation of a job. If an operation is included in both this and SupportedAsynchronousActions then the underlying instrumentation is indicating that it may or may not create a job. Values are: \nCreateGroup: Create Group\nDeleteGroup: Delete Group\nAddMembers: Add Members\nRemoveMembers: Remove Members\nCreateMaskingView: Create Masking View\nDeleteMaskingView: Delete Masking View\nModifyMaskingView: Modify Masking View' override.SupportedSynchronousActions.ValueMap='[\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"..\",\"32768..65535\"]' override.SupportedSynchronousActions.Values='[\"CreateGroup\",\"DeleteGroup\",\"AddMembers\",\"RemoveMembers\",\"CreateMaskingView\",\"DeleteMaskingView\",\"ModifyMaskingView\",\"DMTF Reserved\",\"Vendor Specific\"]' override.SupportedSynchronousActions.ModelCorrespondence='[\"CIM_GroupMaskingMappingCapabilities.SupportedAsynchronousActions\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_GroupMaskingMappingCapabilities extends CIM_ProtocolControllerMaskingCapabilities {
	/**
	 * Returns the value of the '<em><b>Supported Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the capabilities of masking and mapping features having to do with masking groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_GroupMaskingMappingCapabilities_SupportedFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"32768..65535\"]' Values='[\"Supports initiator masking group\",\"Supports target masking group\",\"Supports device masking group\",\"Auto assigns host device numbers\",\"Maskview creation requires initiator masking group\",\"Maskview creation requires target masking group\",\"Maskview creation requires device masking group\",\"Maskview requires non-empty initiator masking group\",\"Maskview requires non-empty target masking group\",\"Maskview requires non-empty device masking group\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedFeatures();

	/**
	 * Returns the value of the '<em><b>Supported Initiator Group Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the capabilities of Initiator groups.
	 * Group can participate in multiple views: As long as the associated devices are not shared between these views.
	 * Maskview deletion deletes unassociated masking group: See the parameter DeleteWhenBecomesUnassociated of the CreateGroup method. 
	 * ConsistentLogicalUnitNumber must be true: Indicates a LogicalDevice visible to the same initiator through different paths, must have the same DeviceNumber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Initiator Group Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_GroupMaskingMappingCapabilities_SupportedInitiatorGroupFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"32768..65535\"]' Values='[\"Group is nameable\",\"Can add to an associated group\",\"Empty group is allowed\",\"Group associated with view can be empty\",\"Nested groups allowed\",\"Only one level of nested groups\",\"Group can participate in multiple views\",\"Maskview deletion deletes unassociated masking group\",\"Associated empty group indicates no access\",\"ConsistentLogicalUnitNumber must be true\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedInitiatorGroupFeatures();

	/**
	 * Returns the value of the '<em><b>Supported Target Group Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the capabilities of target port groups.
	 * Group can participate in multiple views: As long as the associated devices are not shared between these views.
	 * Maskview deletion deletes unassociated masking group: See the parameter DeleteWhenBecomesUnassociated of the CreateGroup method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Target Group Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_GroupMaskingMappingCapabilities_SupportedTargetGroupFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32768..65535\"]' Values='[\"Group is nameable\",\"Can add to an associated group\",\"Empty group is allowed\",\"Group associated with view can be empty\",\"Nested groups allowed\",\"Only one level of nested groups\",\"Group can participate in multiple views\",\"Maskview deletion deletes unassociated masking group\",\"Associated empty group indicates no access\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedTargetGroupFeatures();

	/**
	 * Returns the value of the '<em><b>Supported Device Group Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the capabilities of device masking groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Device Group Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_GroupMaskingMappingCapabilities_SupportedDeviceGroupFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"32768..65535\"]' Values='[\"Group is nameable\",\"Can add to an associated group\",\"Empty group is allowed\",\"Group associated with view can be empty\",\"Nested groups allowed\",\"Only one level of nested groups\",\"Group can participate in multiple views\",\"Maskview deletion deletes unassociated masking group\",\"Associated empty group indicates no access\",\"Unassociated group rejects device numbers\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedDeviceGroupFeatures();

} // CIM_GroupMaskingMappingCapabilities
