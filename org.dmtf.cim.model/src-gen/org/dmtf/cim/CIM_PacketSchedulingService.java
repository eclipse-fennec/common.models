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
 * A representation of the model object '<em><b>CIM Packet Scheduling Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the scheduling service, which is a process that determines whether a queued packet should be removed from a queue and sent to an output interface. Note that output interfaces can be physical network interfaces or interfaces to components internal to systems, such as crossbars or backplanes. In either case, if multiple queues are involved, schedulers are used to provide access to the interface. Each instance of a PacketSchedulingService describes a scheduler from the perspective of the queues that the scheduler is servicing. One can describe that different schedulers support different queues, or that a scheduler supports several queues. 
 * 
 * PacketSchedulingService is modeled as a ConditioningService so that it can be aggregated into a QoSService (using the QoSConditioningSubService association) to indicate that its functionality underlies that QoS service. It participates in the NextService association to identify a subsequent ConditioningService, if any, that acts on traffic after it has been processed by the scheduler.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PacketSchedulingService#getSchedulerType <em>Scheduler Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PacketSchedulingService#getOtherSchedulerType <em>Other Scheduler Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PacketSchedulingService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PacketSchedulingService extends CIM_ConditioningService {
	/**
	 * Returns the value of the '<em><b>Scheduler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an enumerated 16-bit unsigned integer, and defines the type of scheduler. Values are: 
	 * 1: Other 
	 * 2: FIFO 
	 * 3: Priority 
	 * 4: Allocation 
	 * 5: Bounded Priority 
	 * 6: Weighted Round Robin Packet 
	 * If no value is specified, 2 ("FIFO") should be assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduler Type</em>' attribute.
	 * @see #setSchedulerType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PacketSchedulingService_SchedulerType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"FIFO\",\"Priority\",\"Allocation\",\"Bounded Priority\",\"Weighted Round Robin Packet\"]' ModelCorrespondence='[\"CIM_PacketSchedulingService.OtherSchedulerType\"]'"
	 * @generated
	 */
	Integer getSchedulerType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PacketSchedulingService#getSchedulerType <em>Scheduler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler Type</em>' attribute.
	 * @see #getSchedulerType()
	 * @generated
	 */
	void setSchedulerType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Scheduler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This string property is used in conjunction with the SchedulerType property. When the value of SchedulerType is 1 (i.e., "Other"), then the type of scheduler to be used is defined in this attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Scheduler Type</em>' attribute.
	 * @see #setOtherSchedulerType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PacketSchedulingService_OtherSchedulerType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PacketSchedulingService.SchedulerType\"]'"
	 * @generated
	 */
	String getOtherSchedulerType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PacketSchedulingService#getOtherSchedulerType <em>Other Scheduler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Scheduler Type</em>' attribute.
	 * @see #getOtherSchedulerType()
	 * @generated
	 */
	void setOtherSchedulerType(String value);

} // CIM_PacketSchedulingService
