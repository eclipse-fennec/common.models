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
 * A representation of the model object '<em><b>CIM Allocated From Storage Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AllocatedFromStoragePool is an association describing how LogicalElements are allocated from underlying StoragePools. These elements typically would be subclasses of StorageExtents or StoragePools.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AllocatedFromStoragePool#getSpaceConsumed <em>Space Consumed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocatedFromStoragePool#getSpaceLimit <em>Space Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocatedFromStoragePool#getSpaceLimitWarningThreshold <em>Space Limit Warning Threshold</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedFromStoragePool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.Antecedent='CIM_StoragePool REF' override.Antecedent.Description='The StoragePool.' override.Dependent='CIM_LogicalElement REF' override.Dependent.Description='The subsidiary element.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AllocatedFromStoragePool extends CIM_ElementAllocatedFromPool {
	/**
	 * Returns the value of the '<em><b>Space Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Space consumed from this Pool, in bytes. This value MUST be maintained so that, relative to the Antecedent StoragePool, it is possible to compute TotalManagedSpace as StoragePool.RemainingManagedSpace plus the sum of SpaceConsumed from all of the AllocatedFromStoragePool references from the antecedent StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Consumed</em>' attribute.
	 * @see #setSpaceConsumed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedFromStoragePool_SpaceConsumed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' Units='Bytes' ModelCorrespondence='[\"CIM_StoragePool.TotalManagedSpace\",\"CIM_StoragePool.RemainingManagedSpace\"]' PUnit='byte'"
	 * @generated
	 */
	Long getSpaceConsumed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocatedFromStoragePool#getSpaceConsumed <em>Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Consumed</em>' attribute.
	 * @see #getSpaceConsumed()
	 * @generated
	 */
	void setSpaceConsumed(Long value);

	/**
	 * Returns the value of the '<em><b>Space Limit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SpaceLimit is the consumption limit for the allocated storage element from the associated StoragePool. If SpaceLimt is greater than zero, the assumption is that the storage element can grow, (for instance an element representing the storage for a delta replica) 
	 * If SpaceLimit is greater than zero, SpaceConsumed shall not exceed the value of SpaceLimit. 
	 * If SpaceLimit = 0 (the default) then no limits are asserted on SpaceConsumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Limit</em>' attribute.
	 * @see #setSpaceLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedFromStoragePool_SpaceLimit()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceConsumed\"]' PUnit='byte'"
	 * @generated
	 */
	Long getSpaceLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocatedFromStoragePool#getSpaceLimit <em>Space Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Limit</em>' attribute.
	 * @see #getSpaceLimit()
	 * @generated
	 */
	void setSpaceLimit(Long value);

	/**
	 * Returns the value of the '<em><b>Space Limit Warning Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the associated storage element may dynamically consume an increasing amount of space and a space limit is enforced on the element, then a non-zero warning threshold percentage indicates when a warning indication should be generated based on SpaceConsumed >= (SpaceLimit*SpaceLimitWarningThreshold)/100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Limit Warning Threshold</em>' attribute.
	 * @see #setSpaceLimitWarningThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedFromStoragePool_SpaceLimitWarningThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceConsumed\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getSpaceLimitWarningThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocatedFromStoragePool#getSpaceLimitWarningThreshold <em>Space Limit Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Limit Warning Threshold</em>' attribute.
	 * @see #getSpaceLimitWarningThreshold()
	 * @generated
	 */
	void setSpaceLimitWarningThreshold(Integer value);

} // CIM_AllocatedFromStoragePool
