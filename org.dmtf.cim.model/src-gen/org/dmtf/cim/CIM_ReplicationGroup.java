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
 * A representation of the model object '<em><b>CIM Replication Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a collection of storage objects, such as a group of StorageVolumes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationGroup#getPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationGroup#getDeleteOnEmptyElement <em>Delete On Empty Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationGroup#getDeleteOnUnassociated <em>Delete On Unassociated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationGroup#getConsistentPointInTime <em>Consistent Point In Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationGroup#getReservedAs <em>Reserved As</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationGroup#getSupportedSyncTypes <em>Supported Sync Types</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ReplicationGroup extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, the group, not the elements associated with the group, may be deleted at the completion of a copy operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationGroup_Persistent()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getPersistent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationGroup#getPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #getPersistent()
	 * @generated
	 */
	void setPersistent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delete On Empty Element</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true and empty groups are allowed, the group will be deleted when the last element is removed from the group. If empty groups are not allowed, the group will be deleted automatically when the group becomes empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete On Empty Element</em>' attribute.
	 * @see #setDeleteOnEmptyElement(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationGroup_DeleteOnEmptyElement()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDeleteOnEmptyElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationGroup#getDeleteOnEmptyElement <em>Delete On Empty Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete On Empty Element</em>' attribute.
	 * @see #getDeleteOnEmptyElement()
	 * @generated
	 */
	void setDeleteOnEmptyElement(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delete On Unassociated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the group will be deleted when the group is no longer associated with another group. This can happen if all synchronization associations to the individual elements of the group are dissolved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete On Unassociated</em>' attribute.
	 * @see #setDeleteOnUnassociated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationGroup_DeleteOnUnassociated()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDeleteOnUnassociated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationGroup#getDeleteOnUnassociated <em>Delete On Unassociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete On Unassociated</em>' attribute.
	 * @see #getDeleteOnUnassociated()
	 * @generated
	 */
	void setDeleteOnUnassociated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Consistent Point In Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to a group of elements. If it is true, it means the point-in-time was created at an exact time with no I/O activities in such a way the data is consistent among all the elements of the group. This property is only valid when the group is a target of a copy operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistent Point In Time</em>' attribute.
	 * @see #setConsistentPointInTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationGroup_ConsistentPointInTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getConsistentPointInTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationGroup#getConsistentPointInTime <em>Consistent Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistent Point In Time</em>' attribute.
	 * @see #getConsistentPointInTime()
	 * @generated
	 */
	void setConsistentPointInTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Reserved As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the group is reserved to be used only as the source, or as the target, or as either the source or the target of a copy operation. 
	 * If NULL, the group can be either the source or the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved As</em>' attribute.
	 * @see #setReservedAs(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationGroup_ReservedAs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Source Only\",\"Target Only\",\"Source or Target\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getReservedAs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationGroup#getReservedAs <em>Reserved As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved As</em>' attribute.
	 * @see #getReservedAs()
	 * @generated
	 */
	void setReservedAs(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Sync Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates replication group can be used for which SyncTypes. 
	 * If NULL, the replication group can be used for all SyncTypes the implementation supports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Sync Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationGroup_SupportedSyncTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSyncTypes();

} // CIM_ReplicationGroup
