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
 * A representation of the model object '<em><b>CIM Group Synchronized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates that two replication groups are associated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_GroupSynchronized#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GroupSynchronized#getConsistencyEnabled <em>Consistency Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GroupSynchronized#getConsistencyType <em>Consistency Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GroupSynchronized#getConsistencyState <em>Consistency State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GroupSynchronized#getConsistencyStatus <em>Consistency Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_GroupSynchronized()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Core::CoreElements' override.SystemElement='CIM_ManagedElement REF' override.SystemElement.Key='true' override.SystemElement.Description='SystemElement represents the group that is the source of the replication.' override.SyncedElement='CIM_ManagedElement REF' override.SyncedElement.Key='true' override.SyncedElement.Description='SyncedElement represents the target that is the target of the replication.' keys='SystemElement,SyncedElement'"
 * @generated
 */
@ProviderType
public interface CIM_GroupSynchronized extends CIM_Synchronized {
	/**
	 * Returns the value of the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Name</em>' attribute.
	 * @see #setRelationshipName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_GroupSynchronized_RelationshipName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRelationshipName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GroupSynchronized#getRelationshipName <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Name</em>' attribute.
	 * @see #getRelationshipName()
	 * @generated
	 */
	void setRelationshipName(String value);

	/**
	 * Returns the value of the '<em><b>Consistency Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if consistency is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistency Enabled</em>' attribute.
	 * @see #setConsistencyEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_GroupSynchronized_ConsistencyEnabled()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getConsistencyEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GroupSynchronized#getConsistencyEnabled <em>Consistency Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency Enabled</em>' attribute.
	 * @see #getConsistencyEnabled()
	 * @generated
	 */
	void setConsistencyEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Consistency Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the consistency type used by the source and its associated target group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistency Type</em>' attribute.
	 * @see #setConsistencyType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_GroupSynchronized_ConsistencyType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"..\",\"0x8000..\"]' Values='[\"Sequentially Consistent\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getConsistencyType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GroupSynchronized#getConsistencyType <em>Consistency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency Type</em>' attribute.
	 * @see #getConsistencyType()
	 * @generated
	 */
	void setConsistencyType(Integer value);

	/**
	 * Returns the value of the '<em><b>Consistency State</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current state of consistency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistency State</em>' attribute.
	 * @see #setConsistencyState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_GroupSynchronized_ConsistencyState()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Consistent\",\"Inconsistent\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getConsistencyState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GroupSynchronized#getConsistencyState <em>Consistency State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency State</em>' attribute.
	 * @see #getConsistencyState()
	 * @generated
	 */
	void setConsistencyState(Integer value);

	/**
	 * Returns the value of the '<em><b>Consistency Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current status of consistency. Consistency may have been disabled or is experiencing an error condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistency Status</em>' attribute.
	 * @see #setConsistencyStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_GroupSynchronized_ConsistencyStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Completed\",\"Consistency-in-progress\",\"Consistency disabled\",\"Consistency-error\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getConsistencyStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GroupSynchronized#getConsistencyStatus <em>Consistency Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency Status</em>' attribute.
	 * @see #getConsistencyStatus()
	 * @generated
	 */
	void setConsistencyStatus(Integer value);

} // CIM_GroupSynchronized
