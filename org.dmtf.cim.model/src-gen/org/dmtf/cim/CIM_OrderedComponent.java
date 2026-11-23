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
 * A representation of the model object '<em><b>CIM Ordered Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_OrderedComponent is a generic association used to establish 'part of' relationships between ManagedElements. It arranges the PartComponents in a specific assigned order. The semantics of the order depends on the context and use by the referencing classes. For example, if this association is used to arrange settings in a hierarchical order, then this specifies the sequence in which the settings are applied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OrderedComponent#getAssignedSequence <em>Assigned Sequence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OrderedComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.19.1' UMLPackagePath='CIM::Core::CoreElements' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_OrderedComponent extends CIM_Component {
	/**
	 * Returns the value of the '<em><b>Assigned Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AssignedSequence is an unsigned integer 'n' that indicates the relative order of ManagedElement instances. When 'n' is a positive integer, it indicates a place in the sequence of members, with smaller integers indicating earlier positions in the sequence. The special value '0' indicates 'don't care'. If two or more members have the same non-zero sequence number, then the ordering between those members is irrelevant, but they must all be ordered at the appropriate place in the overall sequence. 
	 * 
	 * A series of examples will make ordering of members clearer: 
	 * If all members have the same sequence number, 
	 * regardless of whether it is '0' or non-zero, any 
	 * order is acceptable. 
	 * o The values: 
	 * 1:MEMBER A 
	 * 2:MEMBER B 
	 * 1:MEMBER C 
	 * 3:MEMBER D 
	 * indicate two acceptable orders: A,C,B,D or C,A,B,D, 
	 * since A and C can be ordered in either sequence, but 
	 * only at the '1' position. 
	 * 
	 * Note that the non-zero sequence numbers need not start with '1', and they need not be consecutive. All that matters is their relative magnitude.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned Sequence</em>' attribute.
	 * @see #setAssignedSequence(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OrderedComponent_AssignedSequence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getAssignedSequence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OrderedComponent#getAssignedSequence <em>Assigned Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Sequence</em>' attribute.
	 * @see #getAssignedSequence()
	 * @generated
	 */
	void setAssignedSequence(Long value);

} // CIM_OrderedComponent
