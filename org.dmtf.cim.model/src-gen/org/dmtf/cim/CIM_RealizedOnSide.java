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
 * A representation of the model object '<em><b>CIM Realized On Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Since removable PhysicalMedia can be dual-sided, there is the possibility for StorageExtents to be realized on a single side of the Media. This association is a specialization of the RealizesExtent relationship, adding a Side property to express the Media's orientation details.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RealizedOnSide#getSide <em>Side</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RealizedOnSide()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_PhysicalMedia REF' override.Antecedent.Max='1' override.Antecedent.Description='The PhysicalMedia on which the Extent is realized.' override.Dependent='CIM_StorageExtent REF' override.Dependent.Description='The StorageExtent that is located on the Component.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RealizedOnSide extends CIM_RealizesExtent {
	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration expressing on which 'Side' the Extent is realized. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see #setSide(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RealizedOnSide_Side()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Side 0\",\"Side 1\",\"Side A\",\"Side B\"]'"
	 * @generated
	 */
	Integer getSide();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RealizedOnSide#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(Integer value);

} // CIM_RealizedOnSide
