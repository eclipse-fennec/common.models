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
 * A representation of the model object '<em><b>CIM Logical Disk Based On Volume Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association describes that LogicalDisks can be BasedOn a VolumeSet. However, there is no need for the specificity of this association. It is deprecated in lieu of the generic BasedOn relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDiskBasedOnVolumeSet()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_BasedOn\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.Antecedent='CIM_VolumeSet REF' override.Antecedent.Deprecated='[\"CIM_BasedOn.Antecedent\"]' override.Antecedent.Max='1' override.Antecedent.Description='The VolumeSet.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalDiskBasedOnVolumeSet extends CIM_LogicalDiskBasedOnVolume {
} // CIM_LogicalDiskBasedOnVolumeSet
