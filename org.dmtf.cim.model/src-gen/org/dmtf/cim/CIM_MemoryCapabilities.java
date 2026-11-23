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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Memory Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the capabilities of a set if primordial memory extents represented by a MemoryResources pool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapabilities#getMemoryModes <em>Memory Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapabilities#getReplicationSupport <em>Replication Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapabilities#getReliabilitySupport <em>Reliability Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapabilities#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapabilities#getChannelInterleaveSupport <em>Channel Interleave Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapabilities#getChannelInterleaveWaySupport <em>Channel Interleave Way Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapabilities#getMemoryControllerInterleaveSupport <em>Memory Controller Interleave Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapabilities#getMemoryAffinitySupport <em>Memory Affinity Support</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::Device::ConfigurableMemory' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_MemoryCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Memory Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the platform's support for various memory access modes. 
	 * "Direct Volatile" indicates support for traditional DRAM type volatile memory. 
	 * "Multi-Level Volatile" indicates support for multi-level volatile memory where one or more performance tiers act as a cache for one or more capacity tiers. 
	 * "Block" indicates support for synthetic block access. 
	 * "Direct Persistent" indicates support for load-store access of non-volatile data. 
	 * "Multi-Level Persistent" indicates support for multi-level persistent memory where one or more performance tiers act as a cache for a non-volatile capacity tier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Modes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapabilities_MemoryModes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Direct Volatile\",\"Multi-Level Volatile\",\"Block\",\"Direct Persistent\",\"Multi-Level Persistent\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getMemoryModes();

	/**
	 * Returns the value of the '<em><b>Replication Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates support for various types of memory replication. 
	 * "None" No replication is supported. 
	 * "Local Replication" Replication is supported in the context of a single system. 
	 * "Remote Replication" Replication is supported across multiple systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapabilities_ReplicationSupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"None\",\"Local Replication\",\"Remote Replication\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getReplicationSupport();

	/**
	 * Returns the value of the '<em><b>Reliability Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the platform's support for memory reliability features.
	 * "Die Sparing" Spare memory parts are supported at the memory die level. 
	 * "Rank Sparing" Spare memory parts are supported at the memory rank level. 
	 * "DIMM Sparing" Spare memory parts are supported at the memory DIMM level. 
	 * "Memory Migration" There is support for migrating the contents of a failing part to a spare part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reliability Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapabilities_ReliabilitySupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"None\",\"Die Sparing\",\"Rank Sparing\",\"DIMM Sparing\",\"Memory Migration\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getReliabilitySupport();

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the alignment requirement when configuring a memory region. This value is given as the exponent in an exponential expression with 2 as the base. Example: 64MB would be given as 26, 2**26=64MB.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #setAlignment(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapabilities_Alignment()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getAlignment();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryCapabilities#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(Integer value);

	/**
	 * Returns the value of the '<em><b>Channel Interleave Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the memory channel interleave sizes that are supported. This value is given as the exponent in an exponential expression with 2 as the base. Example: 64B would be given as 6, 2**6=64B
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Interleave Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapabilities_ChannelInterleaveSupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]'"
	 * @generated
	 */
	EList<Integer> getChannelInterleaveSupport();

	/**
	 * Returns the value of the '<em><b>Channel Interleave Way Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the number of memory channels a given interleave scheme can utilize. A 1 indicates that a 1 way channel interleave is supported; 2 indicates that a 2 way channel interleave is supported; and so on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Interleave Way Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapabilities_ChannelInterleaveWaySupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]'"
	 * @generated
	 */
	EList<Integer> getChannelInterleaveWaySupport();

	/**
	 * Returns the value of the '<em><b>Memory Controller Interleave Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the memory controller interleave sizes that are supported. This value is given as the exponent in an exponential expression with 2 as the base. Example: 64B would be given as 6, 2**6=64B
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Controller Interleave Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapabilities_MemoryControllerInterleaveSupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]'"
	 * @generated
	 */
	EList<Integer> getMemoryControllerInterleaveSupport();

	/**
	 * Returns the value of the '<em><b>Memory Affinity Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes platform memory architecture types supported.
	 * "UMA" Uniform Memory Access.
	 * "NUMA" Non-Uniform Memory Access.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Affinity Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapabilities_MemoryAffinitySupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"UMA\",\"NUMA\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getMemoryAffinitySupport();

} // CIM_MemoryCapabilities
