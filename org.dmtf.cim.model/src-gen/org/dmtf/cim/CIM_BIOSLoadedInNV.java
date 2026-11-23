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
 * A representation of the model object '<em><b>CIM BIOS Loaded In NV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between BIOSElement and Memory where the BIOS is loaded.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BIOSLoadedInNV#getStartingAddress <em>Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSLoadedInNV#getEndingAddress <em>Ending Address</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSLoadedInNV()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Device::Memory' override.Antecedent='CIM_Memory REF' override.Antecedent.Description='The memory storage.' override.Dependent='CIM_BIOSElement REF' override.Dependent.Description='The BIOS stored in the memory.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSLoadedInNV extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Starting Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting address where the BIOS is located in non-volatile storage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Address</em>' attribute.
	 * @see #setStartingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSLoadedInNV_StartingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getStartingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSLoadedInNV#getStartingAddress <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Address</em>' attribute.
	 * @see #getStartingAddress()
	 * @generated
	 */
	void setStartingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Ending Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ending address where the BIOS is located in non-volatile storage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ending Address</em>' attribute.
	 * @see #setEndingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSLoadedInNV_EndingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getEndingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSLoadedInNV#getEndingAddress <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Address</em>' attribute.
	 * @see #getEndingAddress()
	 * @generated
	 */
	void setEndingAddress(Long value);

} // CIM_BIOSLoadedInNV
