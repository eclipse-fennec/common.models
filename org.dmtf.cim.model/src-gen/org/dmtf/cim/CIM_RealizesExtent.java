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
 * A representation of the model object '<em><b>CIM Realizes Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageExtents can be realized by PhysicalComponents. For example, disks or tapes are realized by PhysicalMedia. Memory is realized by PhysicalMemory. This relationship of Extents to PhysicalComponents is made explicit by the RealizesExtent association. In addition, the StartingAddress of the StorageExtent on the Component is specified here.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RealizesExtent#getStartingAddress <em>Starting Address</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RealizesExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_PhysicalComponent REF' override.Antecedent.Max='1' override.Antecedent.Description='The PhysicalComponent on which the Extent is realized.' override.Dependent='CIM_StorageExtent REF' override.Dependent.Description='The StorageExtent that is located on the Component.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RealizesExtent extends CIM_Realizes {
	/**
	 * Returns the value of the '<em><b>Starting Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting address on the PhysicalComponent where the StorageExtent begins. Ending address of the StorageExtent is determined using the NumberOfBlocks and Block Size properties of the StorageExtent object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Address</em>' attribute.
	 * @see #setStartingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_RealizesExtent_StartingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getStartingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RealizesExtent#getStartingAddress <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Address</em>' attribute.
	 * @see #getStartingAddress()
	 * @generated
	 */
	void setStartingAddress(Long value);

} // CIM_RealizesExtent
