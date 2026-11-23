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
 * A representation of the model object '<em><b>CIM Bounded Priority Scheduling Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a subclass of the class PriorityScheduling Element, which is itself derived from the abstract class SchedulingElement. As is the case with all subclasses of SchedulingElement, the input associated with an instance of BoundedPrioritySchedulingElement is of one of two types: either a queue, or another scheduler. BoundedPriority SchedulingElement adds an upper bound (BandwidthBound in kilobits per second) on how much traffic can be handled from an input. This data is specific to that one input. It is needed when bounded strict priority scheduling is performed. Note that this class inherits from its superclass the restriction of the inherited boolean property WorkConserving to TRUE.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BoundedPrioritySchedulingElement#getBandwidthBound <em>Bandwidth Bound</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BoundedPrioritySchedulingElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.WorkConserving='boolean' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BoundedPrioritySchedulingElement extends CIM_PrioritySchedulingElement {
	/**
	 * Returns the value of the '<em><b>Bandwidth Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 32-bit unsigned integer that defines the upper limit on the amount of traffic that can be handled from the input (through this SchedulingElement). This is not a shaped upper bound, since bursts can occur. It is a strict bound, limiting the impact of the input. Units are kilobits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth Bound</em>' attribute.
	 * @see #setBandwidthBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BoundedPrioritySchedulingElement_BandwidthBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBits per Second' PUnit='bit / second * 10^3'"
	 * @generated
	 */
	Long getBandwidthBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BoundedPrioritySchedulingElement#getBandwidthBound <em>Bandwidth Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Bound</em>' attribute.
	 * @see #getBandwidthBound()
	 * @generated
	 */
	void setBandwidthBound(Long value);

} // CIM_BoundedPrioritySchedulingElement
