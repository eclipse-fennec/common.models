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
 * A representation of the model object '<em><b>CIM Volume Set Based On PS Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is deprecated in lieu of CompositeExtentBasedOn, since VolumeSets and ProtectedSpaceExtents are themselves deprecated. The relationship describes that VolumeSets are BasedOn on one or more ProtectedSpaceExtents.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VolumeSetBasedOnPSExtent#getLBAsMappedByDecrementing <em>LB As Mapped By Decrementing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeSetBasedOnPSExtent#getLBAMappingIncludesCheckData <em>LBA Mapping Includes Check Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VolumeSetBasedOnPSExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_CompositeExtentBasedOn\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.Antecedent='CIM_ProtectedSpaceExtent REF' override.Antecedent.Deprecated='[\"CIM_CompositeExtentBasedOn.Antecedent\"]' override.Antecedent.Min='1' override.Antecedent.Description='The ProtectedSpaceExtent.' override.Dependent='CIM_VolumeSet REF' override.Dependent.Deprecated='[\"CIM_CompositeExtentBasedOn.Dependent\"]' override.Dependent.Description='The VolumeSet which is built on the ProtectedSpace Extent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_VolumeSetBasedOnPSExtent extends CIM_BasedOn {
	/**
	 * Returns the value of the '<em><b>LB As Mapped By Decrementing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if logical blocks in the ProtectedSpaceExtent are mapped in decrementing order. This property corresponds to the INCDEC value in the SCC-2 Volume Set PS_Extent Descriptor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LB As Mapped By Decrementing</em>' attribute.
	 * @see #setLBAsMappedByDecrementing(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeSetBasedOnPSExtent_LBAsMappedByDecrementing()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_CompositeExtentBasedOn.LBAsMappedByDecrementing\"]'"
	 * @generated
	 */
	Boolean getLBAsMappedByDecrementing();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeSetBasedOnPSExtent#getLBAsMappedByDecrementing <em>LB As Mapped By Decrementing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LB As Mapped By Decrementing</em>' attribute.
	 * @see #getLBAsMappedByDecrementing()
	 * @generated
	 */
	void setLBAsMappedByDecrementing(Boolean value);

	/**
	 * Returns the value of the '<em><b>LBA Mapping Includes Check Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the logical block mapping algorithm includes check data bytes. This property corresponds to the NOCHKSKIP attribute in the SCC-2 Volume Set PS_Extent Descriptor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LBA Mapping Includes Check Data</em>' attribute.
	 * @see #setLBAMappingIncludesCheckData(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeSetBasedOnPSExtent_LBAMappingIncludesCheckData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_CompositeExtentBasedOn.LBAMappingIncludesCheckData\"]'"
	 * @generated
	 */
	Boolean getLBAMappingIncludesCheckData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeSetBasedOnPSExtent#getLBAMappingIncludesCheckData <em>LBA Mapping Includes Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LBA Mapping Includes Check Data</em>' attribute.
	 * @see #getLBAMappingIncludesCheckData()
	 * @generated
	 */
	void setLBAMappingIncludesCheckData(Boolean value);

} // CIM_VolumeSetBasedOnPSExtent
