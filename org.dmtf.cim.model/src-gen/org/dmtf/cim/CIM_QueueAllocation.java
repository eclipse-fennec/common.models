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
 * A representation of the model object '<em><b>CIM Queue Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the reliance of a QueuingService on the availability of space in a BufferPool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_QueueAllocation#getAllocationPercentage <em>Allocation Percentage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QueueAllocation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_BufferPool REF' override.Antecedent.Description='The BufferPool supporting packet storage for a QueuingService.' override.Dependent='CIM_QueuingService REF' override.Dependent.Description='The QueuingService dependent on the BufferPool for storage space.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_QueueAllocation extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Allocation Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an 8-bit unsigned integer representing a percentage from 0 to 100. It defines the percentage of the BufferPool that should be allocated to the referenced QueuingService. If absolute sizes are desired, this is accomplished by defining individual BufferPools of the specified sizes, with QueueAllocation.AllocationPercentages set to 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Percentage</em>' attribute.
	 * @see #setAllocationPercentage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueueAllocation_AllocationPercentage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='Percent' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getAllocationPercentage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueueAllocation#getAllocationPercentage <em>Allocation Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Percentage</em>' attribute.
	 * @see #getAllocationPercentage()
	 * @generated
	 */
	void setAllocationPercentage(Integer value);

} // CIM_QueueAllocation
