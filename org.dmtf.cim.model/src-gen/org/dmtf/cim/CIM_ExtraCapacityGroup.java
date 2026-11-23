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
 * A representation of the model object '<em><b>CIM Extra Capacity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from RedundancyGroup indicating that the aggregated elements have more capacity or capability than is needed. An example of this type of redundancy is the installation of N+1 power supplies or fans in a system. 
 * The use of this class is being deprecated in lieu of using RedundancySet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ExtraCapacityGroup#getMinNumberNeeded <em>Min Number Needed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExtraCapacityGroup#getLoadBalancedGroup <em>Load Balanced Group</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ExtraCapacityGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_RedundancySet\"]' Version='2.21.0' UMLPackagePath='CIM::Core::Redundancy' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ExtraCapacityGroup extends CIM_RedundancyGroup {
	/**
	 * Returns the value of the '<em><b>Min Number Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinNumberNeeded indicates the smallest number of elements that must be operational in order to have redundancy. For example, in an N+1 redundancy relationship, the MinNumberNeeded property should be set equal to N.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Number Needed</em>' attribute.
	 * @see #setMinNumberNeeded(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExtraCapacityGroup_MinNumberNeeded()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_RedundancySet.MinNumberNeeded\"]'"
	 * @generated
	 */
	Long getMinNumberNeeded();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExtraCapacityGroup#getMinNumberNeeded <em>Min Number Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Number Needed</em>' attribute.
	 * @see #getMinNumberNeeded()
	 * @generated
	 */
	void setMinNumberNeeded(Long value);

	/**
	 * Returns the value of the '<em><b>Load Balanced Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether load balancing is supported by the ExtraCapacityGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Balanced Group</em>' attribute.
	 * @see #setLoadBalancedGroup(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExtraCapacityGroup_LoadBalancedGroup()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_RedundancySet.TypeOfSet\"]'"
	 * @generated
	 */
	Boolean getLoadBalancedGroup();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExtraCapacityGroup#getLoadBalancedGroup <em>Load Balanced Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balanced Group</em>' attribute.
	 * @see #getLoadBalancedGroup()
	 * @generated
	 */
	void setLoadBalancedGroup(Boolean value);

} // CIM_ExtraCapacityGroup
