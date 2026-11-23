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
 * A representation of the model object '<em><b>CIM Logical Disk Based On Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogicalDisks can be BasedOn a single Volume (for example, exposed by a software volume manager), or be BasedOn a Disk Partition directly. The former relationship is made explicit in this association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDiskBasedOnVolume()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_StorageVolume REF' override.Antecedent.Max='1' override.Antecedent.Description='The StorageVolume.' override.Dependent='CIM_LogicalDisk REF' override.Dependent.Description='The LogicalDisk which is built on the StorageExtent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalDiskBasedOnVolume extends CIM_LogicalDiskBasedOnExtent {
} // CIM_LogicalDiskBasedOnVolume
