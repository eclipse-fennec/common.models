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
 * A representation of the model object '<em><b>CIM Persistent Memory Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_PersistentMemoryCapabilities describes the capabilities of pool(s) of persistent memory. Capabilities can be derived from the underlying persistent memory devices, memory controllers, platform firmware, or other available software.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PersistentMemoryCapabilities#getSecurityFeatures <em>Security Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PersistentMemoryCapabilities#getAccessGranularity <em>Access Granularity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PersistentMemoryCapabilities#getReplication <em>Replication</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PersistentMemoryCapabilities#getMemoryArchitecture <em>Memory Architecture</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PersistentMemoryCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::Device::ConfigurableMemory' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PersistentMemoryCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Security Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the available security features of the persistent memory pool(s). 
	 * "None" No security features are supported. 
	 * "Encryption" Data encryption is supported. 
	 * "Crypto Erase" Erasing data by destroying cryptographic keys is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PersistentMemoryCapabilities_SecurityFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"None\",\"Encryption\",\"Crypto Erase\",\"DMTF reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSecurityFeatures();

	/**
	 * Returns the value of the '<em><b>Access Granularity</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the access type(s) (block vs. byte) supported by the associated pool(s). 
	 * "Block Addressable" data is accessed by block reads and writes. 
	 * "Byte Addressable" data is accessed by load/store operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Granularity</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PersistentMemoryCapabilities_AccessGranularity()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Block Addressable\",\"Byte Addressable\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getAccessGranularity();

	/**
	 * Returns the value of the '<em><b>Replication</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether ssociated pool(s) supports replication either locally and/or on a remote system. 
	 * "Not Replicated" there is a single copy of the data. 
	 * "Local Replication" data is replicated on local resources. 
	 * "Remote Replication" data is replicated on local resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PersistentMemoryCapabilities_Replication()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Not Replicated\",\"Local Replication\",\"Remote Replication\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getReplication();

	/**
	 * Returns the value of the '<em><b>Memory Architecture</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which memory architecture types the associated pool(s) supports. 
	 * "UMA" Uniform Memory Access.
	 * "NUMA" Non-Uniform Memory Access.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Architecture</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PersistentMemoryCapabilities_MemoryArchitecture()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"UMA\",\"NUMA\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getMemoryArchitecture();

} // CIM_PersistentMemoryCapabilities
