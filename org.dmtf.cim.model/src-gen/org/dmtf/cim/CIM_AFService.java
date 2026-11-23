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
 * A representation of the model object '<em><b>CIM AF Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a specialization to the general concept of forwarding network traffic by adding specific semantics that characterize the operation of the Assured Forwarding (AF) Service (RFC2597). This RFC defines four different AF classes to represent four different treatments of traffic (e.g., a different amount of forwarding resources, such as buffer space and bandwidth, are allocated). Within each AF class, IP packets are marked with one of three possible drop precedence values. The drop precedence of a packet determines the relative importance of that packet compared to other packets within the same AF class if congestion occurs. A congested interface will try to avoid dropping packets with a lower drop precedence value by instead discarding packets with a higher drop precedence value. 
 * 
 * Note that [R2597] defines 12 DSCPs that together represent the AF Per Hop Behavior (PHB) group. Implementations are free to extend this (e.g., add more classes and/or drop precedences). 
 * 
 * The AFService class is modeled as a specialization of DiffServService, which is in turn a specialization of QoSService. This enables it to be related to higher-level QoSServices, as well as to lower-level conditioning sub-services (e.g., classification, metering, dropping, queuing, and others).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AFService#getClassNumber <em>Class Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AFService#getDropperNumber <em>Dropper Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AFService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_AFService extends CIM_DiffServService {
	/**
	 * Returns the value of the '<em><b>Class Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an 8-bit unsigned integer that indicates the number of AF classes that this AF implementation uses. Among the instances aggregated into AFService (using QoSConditioningSubService), one SHOULD find markers with as many distinct values as is indicated by ClassNumber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Number</em>' attribute.
	 * @see #setClassNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AFService_ClassNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getClassNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AFService#getClassNumber <em>Class Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Number</em>' attribute.
	 * @see #getClassNumber()
	 * @generated
	 */
	void setClassNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Dropper Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an 8-bit unsigned integer that indicates the number of drop precedence values that this AF implementation uses. The number of drop precedence values is the number PER AF CLASS. The corresponding droppers are found in the collection of ConditioningServices aggregated by QoSConditioningSubService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dropper Number</em>' attribute.
	 * @see #setDropperNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AFService_DropperNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getDropperNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AFService#getDropperNumber <em>Dropper Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropper Number</em>' attribute.
	 * @see #getDropperNumber()
	 * @generated
	 */
	void setDropperNumber(Integer value);

} // CIM_AFService
