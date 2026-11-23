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
 * A representation of the model object '<em><b>CIM Scheduling Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SchedulingElement represents the configuration information that a PacketSchedulingService has for one of the elements that it is scheduling. The scheduled element is either a QueuingService or another Packet SchedulingService. 
 * 
 * Among the subclasses of this class, some are defined in such a way that all of their instances are work conserving. Other subclasses, however, have instances that either are or are not work conserving. In this class, the boolean property WorkConserving indicates whether an instance is or is not work conserving. Note that WorkConserving is restricted to TRUE in the subclasses that are inherently work conserving, since instances of these classes cannot be anything else.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SchedulingElement#getWorkConserving <em>Work Conserving</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SchedulingElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.19.0' UMLPackagePath='CIM::Network::QoS' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SchedulingElement extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Work Conserving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean property indicating whether the PacketSchedulingService tied to this instance (by the ElementInSchedulingService aggregation) is treating the queue/input tied to this instance, in a work-conserving manner. The queue/input is indicated by either the QueueToSchedule or SchedulingServiceToSchedule association. Note that this property is writeable, indicating that an administrator can change the behavior of the SchedulingElement - but only for those elements that can operate in a non-work conserving mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Conserving</em>' attribute.
	 * @see #setWorkConserving(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SchedulingElement_WorkConserving()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getWorkConserving();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SchedulingElement#getWorkConserving <em>Work Conserving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Conserving</em>' attribute.
	 * @see #getWorkConserving()
	 * @generated
	 */
	void setWorkConserving(Boolean value);

} // CIM_SchedulingElement
