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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Queue To Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a top-level association, representing the relationship between a queue (QueuingService) and a SchedulingElement. The SchedulingElement, in turn, represents the information in a packet scheduling service that is specific to this queue, such as relative priority or allocated bandwidth. 
 * 
 * Although it cannot be expressed formally with the association cardinalities, there is an additional constraint on participation in this association. A particular instance of (a subclass of) SchedulingElement always participates either in exactly one instance of this association, or in exactly one instance of the association SchedulingServiceToSchedule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_QueueToSchedule#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueueToSchedule#getSchedElement <em>Sched Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QueueToSchedule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='Queue,SchedElement'"
 * @generated
 */
@ProviderType
public interface CIM_QueueToSchedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The queue and its QueuingService from which packets are emptied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue</em>' reference.
	 * @see #setQueue(CIM_QueuingService)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueueToSchedule_Queue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_QueuingService REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_QueuingService getQueue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueueToSchedule#getQueue <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(CIM_QueuingService value);

	/**
	 * Returns the value of the '<em><b>Sched Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SchedulingElement for the input queue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sched Element</em>' reference.
	 * @see #setSchedElement(CIM_SchedulingElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueueToSchedule_SchedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SchedulingElement REF' Key='true'"
	 * @generated
	 */
	CIM_SchedulingElement getSchedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueueToSchedule#getSchedElement <em>Sched Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Element</em>' reference.
	 * @see #getSchedElement()
	 * @generated
	 */
	void setSchedElement(CIM_SchedulingElement value);

} // CIM_QueueToSchedule
