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
 * A representation of the model object '<em><b>CIM Aggregate PS Extent Based On Aggregate PExtent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is deprecated in lieu of ProtectedSpaceBasedOn, since AggregatePExtents and AggregatePSExtents are themselves deprecated. The association describes that AggregatePSExtents are BasedOn a single AggregatePExtent.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AggregatePSExtentBasedOnAggregatePExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ProtectedExtentBasedOn\"]' Version='2.8.0' UMLPackagePath='CIM::Device::SccExtents' override.Antecedent='CIM_AggregatePExtent REF' override.Antecedent.Deprecated='[\"CIM_ProtectedExtentBasedOn.Antecedent\"]' override.Antecedent.Max='1' override.Antecedent.Description='The AggregatePExtent.' override.Dependent='CIM_AggregatePSExtent REF' override.Dependent.Deprecated='[\"CIM_ProtectedExtentBasedOn.Dependent\"]' override.Dependent.Description='The AggregatePSExtent which is built on the Aggregate PExtent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AggregatePSExtentBasedOnAggregatePExtent extends CIM_BasedOn {
} // CIM_AggregatePSExtentBasedOnAggregatePExtent
