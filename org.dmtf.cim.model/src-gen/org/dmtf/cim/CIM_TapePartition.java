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
 * A representation of the model object '<em><b>CIM Tape Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a TapePartition StorageExtent. Note that if a PhysicalTape is not partitioned, only a generic StorageExtent that represents the entire Tape should be instantiated. TapePartitions may be BasedOn other StorageExtents or directly Realized on a PhysicalTape.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TapePartition#getUnusedBlocks <em>Unused Blocks</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TapePartition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' override.NameFormat='uint16' override.NameFormat.Description='TapePartition names are application specific.' override.NameFormat.ValueMap='[\"0\",\"1\"]' override.NameFormat.Values='[\"Other\",\"Unknown\"]' override.NameNamespace='uint16' override.NameNamespace.Description='TapePartition names are application specific.' override.NameNamespace.ValueMap='[\"0\",\"1\"]' override.NameNamespace.Values='[\"Other\",\"Unknown\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_TapePartition extends CIM_MediaPartition {
	/**
	 * Returns the value of the '<em><b>Unused Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of blocks that are currently unused/not written on the Partition. When this number is multiplied by the BlockSize, inherited from StorageExtent, the total number of bytes available for writing can be computed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unused Blocks</em>' attribute.
	 * @see #setUnusedBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TapePartition_UnusedBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Gauge='true'"
	 * @generated
	 */
	Long getUnusedBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TapePartition#getUnusedBlocks <em>Unused Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unused Blocks</em>' attribute.
	 * @see #getUnusedBlocks()
	 * @generated
	 */
	void setUnusedBlocks(Long value);

} // CIM_TapePartition
