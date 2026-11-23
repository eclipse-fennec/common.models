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
 * A representation of the model object '<em><b>CIM Storage Protection Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the Capabilities of a StorageProtectionService. An instance of StorageProtectionCapabilities is associated with a StorageProtectionService using ElementCapabilities. The properties in this class specify the capabilites of the service for protecting StorageVolumes and LogicalDisks from accidental or intentional destruction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionCapabilities#getProtectionTimeGranularity <em>Protection Time Granularity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionCapabilities#getSupportedStorageElementFeatures <em>Supported Storage Element Features</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Storage' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageProtectionCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Protection Time Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Granularity for the time period of StorageProtectionSetting.RemainingProtectionTime. 0: Unknown 
	 * 1: Other 
	 * 2: Second 
	 * 3: Minute 
	 * 4: Hour 
	 * 5: Day.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protection Time Granularity</em>' attribute.
	 * @see #setProtectionTimeGranularity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionCapabilities_ProtectionTimeGranularity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Second\",\"Minute\",\"Hour\",\"Day\"]'"
	 * @generated
	 */
	Integer getProtectionTimeGranularity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageProtectionCapabilities#getProtectionTimeGranularity <em>Protection Time Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Time Granularity</em>' attribute.
	 * @see #getProtectionTimeGranularity()
	 * @generated
	 */
	void setProtectionTimeGranularity(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which methods are executed asynchronously.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\"]' Values='[\"Storage element protection\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which methods are executed synchronously.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\"]' Values='[\"Storage element protection\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Storage Element Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which storage elements can be protected -- StorageVolumes and/or LogicalDisks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Element Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionCapabilities_SupportedStorageElementFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\"]' Values='[\"StorageVolume protection\",\"LogicalDisk protection\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageElementFeatures();

} // CIM_StorageProtectionCapabilities
