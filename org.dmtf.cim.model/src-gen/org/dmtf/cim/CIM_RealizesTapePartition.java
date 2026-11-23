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
 * A representation of the model object '<em><b>CIM Realizes Tape Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TapePartitions are realized on PhysicalTape. This relationship is made explicit by the RealizesTapePartition association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RealizesTapePartition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_PhysicalTape REF' override.Antecedent.Max='1' override.Antecedent.Description='The PhysicalTape on which the Partition is realized.' override.Dependent='CIM_TapePartition REF' override.Dependent.Description='The TapePartition that is located on the Media.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RealizesTapePartition extends CIM_RealizesExtent {
} // CIM_RealizesTapePartition
