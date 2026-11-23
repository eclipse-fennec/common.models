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
 * A representation of the model object '<em><b>CIM Allocation Scheduling Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a subclass of the abstract class SchedulingElement. It introduces five new properties to support bandwidth-based scheduling. As is the case with all subclasses of SchedulingElement, the input associated with an instance of AllocationSchedulingElement is of one of two types: either a queue, or another scheduler.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getAllocationUnits <em>Allocation Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getBandwidthAllocation <em>Bandwidth Allocation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getBurstAllocation <em>Burst Allocation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getCanShare <em>Can Share</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getWorkFlexible <em>Work Flexible</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AllocationSchedulingElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AllocationSchedulingElement extends CIM_SchedulingElement {
	/**
	 * Returns the value of the '<em><b>Allocation Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 16-bit unsigned integer enumeration that identifies the units in which the BandwidthAllocation and BurstAllocation properties are expressed. The following values are defined: 
	 * - Bytes(1) 
	 * - Packets(2) 
	 * - Cells(3) (fixed-size, for example, ATM) 
	 * If no value is specified, 1 ("Bytes") should be assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Units</em>' attribute.
	 * @see #setAllocationUnits(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationSchedulingElement_AllocationUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Bytes\",\"Packets\",\"Cells\"]'"
	 * @generated
	 */
	Integer getAllocationUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getAllocationUnits <em>Allocation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Units</em>' attribute.
	 * @see #getAllocationUnits()
	 * @generated
	 */
	void setAllocationUnits(Integer value);

	/**
	 * Returns the value of the '<em><b>Bandwidth Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 32-bit bit unsigned integer defining the number of 'units' per second that should be allocated to the associated input. 'Units' are identified by the AllocationUnits property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth Allocation</em>' attribute.
	 * @see #setBandwidthAllocation(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationSchedulingElement_BandwidthAllocation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_AllocationSchedulingElement.AllocationUnits\"]'"
	 * @generated
	 */
	Long getBandwidthAllocation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getBandwidthAllocation <em>Bandwidth Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Allocation</em>' attribute.
	 * @see #getBandwidthAllocation()
	 * @generated
	 */
	void setBandwidthAllocation(Long value);

	/**
	 * Returns the value of the '<em><b>Burst Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 32-bit bit unsigned integer specifying the amount of temporary or short-term bandwidth (in 'units' per second) that can be allocated to an input, beyond the amount of bandwidth allocated through the BandwidthAllocation property. If the maximum actual bandwidth allocation for the input were to be measured, it would be the sum of the BurstAllocation and the BandwidthAllocation properties. 'Units' are identified by the AllocationUnits property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Burst Allocation</em>' attribute.
	 * @see #setBurstAllocation(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationSchedulingElement_BurstAllocation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_AllocationSchedulingElement.AllocationUnits\"]'"
	 * @generated
	 */
	Long getBurstAllocation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getBurstAllocation <em>Burst Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Allocation</em>' attribute.
	 * @see #getBurstAllocation()
	 * @generated
	 */
	void setBurstAllocation(Long value);

	/**
	 * Returns the value of the '<em><b>Can Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean property that, if TRUE, enables unused bandwidth from the associated input to be allocated to other inputs serviced by the Scheduler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Share</em>' attribute.
	 * @see #setCanShare(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationSchedulingElement_CanShare()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCanShare();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getCanShare <em>Can Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Share</em>' attribute.
	 * @see #getCanShare()
	 * @generated
	 */
	void setCanShare(Boolean value);

	/**
	 * Returns the value of the '<em><b>Work Flexible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean property that, if TRUE, indicates that the behavior of the scheduler relative to this input can be altered by changing the value of the inherited property, WorkConserving.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Flexible</em>' attribute.
	 * @see #setWorkFlexible(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationSchedulingElement_WorkFlexible()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getWorkFlexible();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationSchedulingElement#getWorkFlexible <em>Work Flexible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Flexible</em>' attribute.
	 * @see #getWorkFlexible()
	 * @generated
	 */
	void setWorkFlexible(Boolean value);

} // CIM_AllocationSchedulingElement
