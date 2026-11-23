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
 * A representation of the model object '<em><b>CIM Spare Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the Capabilities of a SpareConfigurationService. An instance of SpareConfigurationCapabilities is associated with a top level ComputerSystem using ElementCapabilities. This allows systems that automatically manage sparing to describe their capabilities without implementing a SpareConfigurationService instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SpareConfigurationCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpareConfigurationCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpareConfigurationCapabilities#getSystemConfiguredSpares <em>System Configured Spares</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpareConfigurationCapabilities#getAutomaticFailOver <em>Automatic Fail Over</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpareConfigurationCapabilities#getMaximumSpareStorageExtents <em>Maximum Spare Storage Extents</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpareConfigurationCapabilities#getSupportedStorageElementCheck <em>Supported Storage Element Check</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SpareConfigurationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SpareConfigurationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions then the underlying implementation is indicating that it may or may not create a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SpareConfigurationCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Assign Spares\",\"Unassign Spares\",\"Rebuild Storage Extent\",\"Check Parity Consistency\",\"Repair Parity\",\"Fail Over\"]' ModelCorrespondence='[\"CIM_SpareConfigurationCapabilities.SupportedSynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed without the creation of a job. If an operation is included in both this and SupportedAsynchronousActions then the underlying instrumentation is indicating that it may or may not create a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SpareConfigurationCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Assign Spares\",\"Unassign Spares\",\"Rebuild Storage Extent\",\"Check Parity Consistency\",\"Repair Parity\",\"Fail Over\"]' ModelCorrespondence='[\"CIM_SpareConfigurationCapabilities.SupportedAsynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

	/**
	 * Returns the value of the '<em><b>System Configured Spares</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system automatically configures spares. If set to false, the client must use the extinsic methods AssignSpares and UnassignSpares.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Configured Spares</em>' attribute.
	 * @see #setSystemConfiguredSpares(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpareConfigurationCapabilities_SystemConfiguredSpares()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSystemConfiguredSpares();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpareConfigurationCapabilities#getSystemConfiguredSpares <em>System Configured Spares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Configured Spares</em>' attribute.
	 * @see #getSystemConfiguredSpares()
	 * @generated
	 */
	void setSystemConfiguredSpares(Boolean value);

	/**
	 * Returns the value of the '<em><b>Automatic Fail Over</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system automatically fails over. If set to false, the client must use the FailOver extinsic method, although that method may not be supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Fail Over</em>' attribute.
	 * @see #setAutomaticFailOver(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpareConfigurationCapabilities_AutomaticFailOver()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAutomaticFailOver();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpareConfigurationCapabilities#getAutomaticFailOver <em>Automatic Fail Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Fail Over</em>' attribute.
	 * @see #getAutomaticFailOver()
	 * @generated
	 */
	void setAutomaticFailOver(Boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Spare Storage Extents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of StorageExtents that can be configured as spares. A value of 0 indicates that all StorageExtents can be configured as spares. A value of NULL specifies that no StorageExtents may be configured as spares.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Spare Storage Extents</em>' attribute.
	 * @see #setMaximumSpareStorageExtents(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpareConfigurationCapabilities_MaximumSpareStorageExtents()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaximumSpareStorageExtents();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpareConfigurationCapabilities#getMaximumSpareStorageExtents <em>Maximum Spare Storage Extents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Spare Storage Extents</em>' attribute.
	 * @see #getMaximumSpareStorageExtents()
	 * @generated
	 */
	void setMaximumSpareStorageExtents(Long value);

	/**
	 * Returns the value of the '<em><b>Supported Storage Element Check</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration contains combinations of TargetElement and CheckType that are supported by CheckStorageElement().
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Element Check</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SpareConfigurationCapabilities_SupportedStorageElementCheck()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"32768..65535\"]' Values='[\"StoragePool Parity\",\"StoragePool Bad Block\",\"StoragePool Replication\",\"StorageVolume Parity\",\"StorageVolume Bad Block\",\"StorageVolume Replication\",\"StorageExtent Parity\",\"StorageExtent Bad Block\",\"StorageExtent Replication\",\"LogicalDisk Parity\",\"LogicalDisk Bad Block\",\"LogicalDisk Replication\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageElementCheck();

} // CIM_SpareConfigurationCapabilities
