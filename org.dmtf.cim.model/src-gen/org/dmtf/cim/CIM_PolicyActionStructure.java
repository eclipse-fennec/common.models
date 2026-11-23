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
 * A representation of the model object '<em><b>CIM Policy Action Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicyActions may be aggregated into rules and into compound actions. PolicyActionStructure is the abstract aggregation class for the structuring of policy actions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PolicyActionStructure#getActionOrder <em>Action Order</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyActionStructure()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_Policy REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='PolicyAction instances may be aggregated into either PolicyRule instances or CompoundPolicyAction instances.' override.PartComponent='CIM_PolicyAction REF' override.PartComponent.Description='A PolicyAction aggregated by a PolicyRule or CompoundPolicyAction.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyActionStructure extends CIM_PolicyComponent {
	/**
	 * Returns the value of the '<em><b>Action Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActionOrder is an unsigned integer 'n' that indicates the relative position of a PolicyAction in the sequence of actions associated with a PolicyRule or CompoundPolicyAction. When 'n' is a positive integer, it indicates a place in the sequence of actions to be performed, with smaller integers indicating earlier positions in the sequence. The special value '0' indicates 'don't care'. If two or more PolicyActions have the same non-zero sequence number, they may be performed in any order, but they must all be performed at the appropriate place in the overall action sequence. 
	 * 
	 * A series of examples will make ordering of PolicyActions clearer: 
	 * o If all actions have the same sequence number, regardless of whether it is '0' or non-zero, any order is acceptable. 
	 * o The values: 
	 * 1:ACTION A 
	 * 2:ACTION B 
	 * 1:ACTION C 
	 * 3:ACTION D 
	 * indicate two acceptable orders: A,C,B,D or C,A,B,D, 
	 * since A and C can be performed in either order, but only at the '1' position. 
	 * o The values: 
	 * 0:ACTION A 
	 * 2:ACTION B 
	 * 3:ACTION C 
	 * 3:ACTION D 
	 * require that B,C, and D occur either as B,C,D or as B,D,C. Action A may appear at any point relative to B, C, and D. Thus the complete set of acceptable orders is: A,B,C,D; B,A,C,D; B,C,A,D; B,C,D,A; A,B,D,C; B,A,D,C; B,D,A,C; B,D,C,A. 
	 * 
	 * Note that the non-zero sequence numbers need not start with '1', and they need not be consecutive. All that matters is their relative magnitude.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Order</em>' attribute.
	 * @see #setActionOrder(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyActionStructure_ActionOrder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getActionOrder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyActionStructure#getActionOrder <em>Action Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Order</em>' attribute.
	 * @see #getActionOrder()
	 * @generated
	 */
	void setActionOrder(Integer value);

} // CIM_PolicyActionStructure
