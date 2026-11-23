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
 * A representation of the model object '<em><b>CIM Tape Partition On Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TapePartitionOnSurface represents the ability to have one or more TapePartitions on each surface of a PhysicalTape. The individual surfaces are represented as instances of CIM_StorageExtent.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TapePartitionOnSurface()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_StorageExtent REF' override.Antecedent.Max='1' override.Antecedent.Description='The StorageExtent that represents the Tape\'s surface.' override.Dependent='CIM_TapePartition REF' override.Dependent.Description='The TapePartition which is built on the Extent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_TapePartitionOnSurface extends CIM_BasedOn {
} // CIM_TapePartitionOnSurface
