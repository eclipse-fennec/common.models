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
 * A representation of the model object '<em><b>CIM VTL Statistical Data Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Virtual Library System Statistical Data Capabilities
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalDataServiceCapabilities#getSupportedSyncActions <em>Supported Sync Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalDataServiceCapabilities#getSupportedAsyncActions <em>Supported Async Actions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalDataServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageStatistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VTLStatisticalDataServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Sync Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedSyncActions lists the statistical services implemented synchronously. Methods in this list would always return a null for the job output parameter.
	 * If the value "0" (none) is identified, no other value may be specified.
	 * Methods identified in this property should not be listed in the SupportedAsyncActions property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Sync Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalDataServiceCapabilities_SupportedSyncActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"none\",\"GetPhysicalCapacityUsage\",\"GetLogicalCapacityUsage\",\"GetSystemRatio\",\"GetDeduplicationRatio\",\"GetReplicationThroughput\",\"GetReplicationRatio\",\"GetPerformanceStatisticsReadWriteIO\",\"GetFCPortStatisticsSRR\",\"GetFCPortStatisticsAborts\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSyncActions();

	/**
	 * Returns the value of the '<em><b>Supported Async Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedAsyncActions lists the statistical services implemented asynchronously. Methods identified in this list may return a non-null Job parameter.
	 * If the value "0" (none) is identified, no other value may be specified and the Job parameter output, if it exists, would always be null.
	 * Methods in this list should not be identified in the SupportedSyncActions list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Async Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalDataServiceCapabilities_SupportedAsyncActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"none\",\"GetPhysicalCapacityUsage\",\"GetLogicalCapacityUsage\",\"GetSystemRatio\",\"GetDeduplicationRatio\",\"GetReplicationThroughput\",\"GetReplicationRatio\",\"GetPerformanceStatisticsReadWriteIO\",\"GetFCPortStatisticsSRR\",\"GetFCPortStatisticsAborts\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsyncActions();

} // CIM_VTLStatisticalDataServiceCapabilities
