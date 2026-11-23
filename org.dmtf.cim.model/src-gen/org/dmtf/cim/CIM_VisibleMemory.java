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
 * A representation of the model object '<em><b>CIM Visible Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes an operating system visible memory extent. The term visible as used here indicates that the memory has been mapped directly or indirectly into the system address space.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VisibleMemory#getAccessGranularity <em>Access Granularity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VisibleMemory#getReplication <em>Replication</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VisibleMemory#getProcessAffinity <em>Process Affinity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VisibleMemory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Core' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_VisibleMemory extends CIM_Memory {
	/**
	 * Returns the value of the '<em><b>Access Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the granularity (block vs. byte) used by software accessing this memory. AccessGranularity is used to identify the units of read and write, while BlockSize and NumberOfBlocks is used to identify the capacity of the memory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Granularity</em>' attribute.
	 * @see #setAccessGranularity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VisibleMemory_AccessGranularity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Block Addressable\",\"Byte Addressable\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getAccessGranularity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VisibleMemory#getAccessGranularity <em>Access Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Granularity</em>' attribute.
	 * @see #getAccessGranularity()
	 * @generated
	 */
	void setAccessGranularity(Integer value);

	/**
	 * Returns the value of the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the contents of this extent are replicated either locally or on a remote system. Replication conveys the capabilities of memory controllers to mirror address ranges and the ability of system software/hardware to do RDMA type replication to another system. If Replication has a value, then PackageRedundancy and DataRedundancy would be used to expose the level of redundancy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication</em>' attribute.
	 * @see #setReplication(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VisibleMemory_Replication()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Not Replicated\",\"Local Replication\",\"Remote Replication\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getReplication();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VisibleMemory#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication</em>' attribute.
	 * @see #getReplication()
	 * @generated
	 */
	void setReplication(Integer value);

	/**
	 * Returns the value of the '<em><b>Process Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the controller has topology related constraints which limit its suitability for a given purpose, they can be exposed using this property. For example, if the visible memory is such that it can be accessed from one processor in a multi-processor system its accessed is constrained to usages from that processor. In that case, ProcessorAffinity is set to the DeviceID of the processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Affinity</em>' attribute.
	 * @see #setProcessAffinity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VisibleMemory_ProcessAffinity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_Processor.DeviceID\"]'"
	 * @generated
	 */
	String getProcessAffinity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VisibleMemory#getProcessAffinity <em>Process Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Affinity</em>' attribute.
	 * @see #getProcessAffinity()
	 * @generated
	 */
	void setProcessAffinity(String value);

} // CIM_VisibleMemory
