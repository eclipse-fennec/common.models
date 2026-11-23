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
 * A representation of the model object '<em><b>CIM Storage Erasure Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities for the storage element erasure functionality
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageErasureCapabilities#getErasureMethods <em>Erasure Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageErasureCapabilities#getDefaultErasureMethod <em>Default Erasure Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageErasureCapabilities#getCanEraseOnReturnToStoragePool <em>Can Erase On Return To Storage Pool</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageErasureCapabilities#getElementTypesSupported <em>Element Types Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageErasureCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageErasureCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Erasure Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of erasure methods supported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erasure Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageErasureCapabilities_ErasureMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getErasureMethods();

	/**
	 * Returns the value of the '<em><b>Default Erasure Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erasure method to use if none is specified for the storage element being returned to the storage pool
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Erasure Method</em>' attribute.
	 * @see #setDefaultErasureMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageErasureCapabilities_DefaultErasureMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDefaultErasureMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageErasureCapabilities#getDefaultErasureMethod <em>Default Erasure Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Erasure Method</em>' attribute.
	 * @see #getDefaultErasureMethod()
	 * @generated
	 */
	void setDefaultErasureMethod(String value);

	/**
	 * Returns the value of the '<em><b>Can Erase On Return To Storage Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that a storage elements can be erased when returning to the storage pool. Whether they are erased or not is dependent upon the ErasureSetting associated to that storage element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Erase On Return To Storage Pool</em>' attribute.
	 * @see #setCanEraseOnReturnToStoragePool(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageErasureCapabilities_CanEraseOnReturnToStoragePool()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCanEraseOnReturnToStoragePool();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageErasureCapabilities#getCanEraseOnReturnToStoragePool <em>Can Erase On Return To Storage Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Erase On Return To Storage Pool</em>' attribute.
	 * @see #getCanEraseOnReturnToStoragePool()
	 * @generated
	 */
	void setCanEraseOnReturnToStoragePool(Boolean value);

	/**
	 * Returns the value of the '<em><b>Element Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of supported element types for ErasureService.Erase method .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageErasureCapabilities_ElementTypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"StorageVolume\",\"LogicalDisk\",\"StorageExtent\"]'"
	 * @generated
	 */
	EList<Integer> getElementTypesSupported();

} // CIM_StorageErasureCapabilities
