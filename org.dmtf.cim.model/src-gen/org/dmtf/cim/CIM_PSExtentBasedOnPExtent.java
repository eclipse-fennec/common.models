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
 * A representation of the model object '<em><b>CIM PS Extent Based On PExtent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Covered by ProtectedExtentBasedOn or CompositeExtentBasedOn, since PhysicalExtent itself is deprecated in lieu of these associations. ProtectedSpaceExtents are BasedOn a PhysicalExtent. This relationship is made explicit by this association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PSExtentBasedOnPExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ProtectedExtentBasedOn\",\"CIM_CompositeExtentBasedOn\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.Antecedent='CIM_PhysicalExtent REF' override.Antecedent.Deprecated='[\"CIM_CompositeExtentBasedOn.Antecedent\",\"CIM_ProtectedExtentBasedOn.Antecedent\"]' override.Antecedent.Description='The PhysicalExtent.' override.Dependent='CIM_ProtectedSpaceExtent REF' override.Dependent.Deprecated='[\"CIM_CompositeExtentBasedOn.Dependent\",\"CIM_ProtectedExtentBasedOn.Dependent\"]' override.Dependent.Description='The ProtectedSpaceExtent which is built on the Physical Extent.' override.StartingAddress='uint64' override.StartingAddress.Deprecated='[\"CIM_CompositeExtentBasedOn.StartingAddress\",\"CIM_ProtectedExtentBasedOn.StartingAddress\"]' override.StartingAddress.Description='The starting logical block address of the PhysicalExtent from which this ProtectedSpaceExtent is derived.' override.StartingAddress.MappingStrings='[\"MIF.DMTF|Protected Space Extent|001.2\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PSExtentBasedOnPExtent extends CIM_BasedOn {
} // CIM_PSExtentBasedOnPExtent
