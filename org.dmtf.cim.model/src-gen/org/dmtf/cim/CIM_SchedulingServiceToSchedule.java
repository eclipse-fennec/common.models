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
 * A representation of the model object '<em><b>CIM Scheduling Service To Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a top-level association, representing the relationship between a scheduler (PacketSchedulingService) and a SchedulingElement, in a configuration involving cascaded schedulers. The SchedulingElement, in turn, represents the information in a packet scheduling service that is specific to this scheduler, such as relative priority or allocated bandwidth. 
 * 
 * Although it cannot be expressed formally with the association cardinalities, there is an additional constraint on participation in this association. A particular instance of (a subclass of) SchedulingElement always participates either in exactly one instance of this association, or in exactly one instance of the association QueueToSchedule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SchedulingServiceToSchedule#getSchedService <em>Sched Service</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SchedulingServiceToSchedule#getSchedElement <em>Sched Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SchedulingServiceToSchedule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SchedService,SchedElement'"
 * @generated
 */
@ProviderType
public interface CIM_SchedulingServiceToSchedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Sched Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduler being cascaded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sched Service</em>' reference.
	 * @see #setSchedService(CIM_PacketSchedulingService)
	 * @see org.dmtf.cim.CimPackage#getCIM_SchedulingServiceToSchedule_SchedService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PacketSchedulingService REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_PacketSchedulingService getSchedService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SchedulingServiceToSchedule#getSchedService <em>Sched Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Service</em>' reference.
	 * @see #getSchedService()
	 * @generated
	 */
	void setSchedService(CIM_PacketSchedulingService value);

	/**
	 * Returns the value of the '<em><b>Sched Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A SchedulingElement in the subsequent scheduler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sched Element</em>' reference.
	 * @see #setSchedElement(CIM_SchedulingElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_SchedulingServiceToSchedule_SchedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SchedulingElement REF' Key='true'"
	 * @generated
	 */
	CIM_SchedulingElement getSchedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SchedulingServiceToSchedule#getSchedElement <em>Sched Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Element</em>' reference.
	 * @see #getSchedElement()
	 * @generated
	 */
	void setSchedElement(CIM_SchedulingElement value);

} // CIM_SchedulingServiceToSchedule
