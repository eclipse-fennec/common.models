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
 * A representation of the model object '<em><b>CIM Ordered Member Of Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_OrderedMemberOfCollection is an aggregation used to establish an ordered membership of ManagedElements in a Collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OrderedMemberOfCollection#getAssignedSequence <em>Assigned Sequence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OrderedMemberOfCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Core::Collection' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_OrderedMemberOfCollection extends CIM_MemberOfCollection {
	/**
	 * Returns the value of the '<em><b>Assigned Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AssignedSequence is an unsigned integer 'n' that indicates the relative position of members within a Collection. When 'n' is a positive integer, it indicates a place in the sequence of members, with smaller integers indicating earlier positions in the sequence. The special value '0' indicates 'don't care'. If two or more members have the same non-zero sequence number, then the ordering between those members is irrelevant, but they must all be ordered at the appropriate place in the overall sequence. 
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
	 * because A and C can be ordered in either sequence, but 
	 * only at the '1' position. 
	 * 
	 * Note that the non-zero sequence numbers do not need to start with '1', and they do not need to be consecutive. However, the sequencenumbers must reflect their relative magnitude.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned Sequence</em>' attribute.
	 * @see #setAssignedSequence(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OrderedMemberOfCollection_AssignedSequence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getAssignedSequence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OrderedMemberOfCollection#getAssignedSequence <em>Assigned Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Sequence</em>' attribute.
	 * @see #getAssignedSequence()
	 * @generated
	 */
	void setAssignedSequence(Long value);

} // CIM_OrderedMemberOfCollection
