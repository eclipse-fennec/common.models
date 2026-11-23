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
 * A representation of the model object '<em><b>CIM Allocated Logical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AllocatedLogicalElement is the base class that models things that are allocated. Allocated things have an allocation state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AllocatedLogicalElement#getAllocationState <em>Allocation State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedLogicalElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Core::CoreElements'"
 * @generated
 */
@ProviderType
public interface CIM_AllocatedLogicalElement extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Allocation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allocation state of the managed element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation State</em>' attribute.
	 * @see #setAllocationState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedLogicalElement_AllocationState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_SettingData'"
	 * @generated
	 */
	String getAllocationState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocatedLogicalElement#getAllocationState <em>Allocation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation State</em>' attribute.
	 * @see #getAllocationState()
	 * @generated
	 */
	void setAllocationState(String value);

} // CIM_AllocatedLogicalElement
