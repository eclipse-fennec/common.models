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
 * A representation of the model object '<em><b>CIM Realizes Aggregate PExtent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AggregatePExtents are realized on a PhysicalMedia. This is described by RealizesAggregatePExtent. However, there is no need for the specificity of this association. It is deprecated in lieu of the generic RealizesExtent relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RealizesAggregatePExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_RealizesExtent\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.Antecedent='CIM_PhysicalMedia REF' override.Antecedent.Deprecated='[\"CIM_RealizesExtent.Antecedent\"]' override.Antecedent.Max='1' override.Antecedent.Description='The PhysicalMedia on which the Extent is realized.' override.Dependent='CIM_AggregatePExtent REF' override.Dependent.Deprecated='[\"CIM_RealizesExtent.Dependent\"]' override.Dependent.Description='The AggregatePExtent that is located on the Media.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RealizesAggregatePExtent extends CIM_RealizesExtent {
} // CIM_RealizesAggregatePExtent
