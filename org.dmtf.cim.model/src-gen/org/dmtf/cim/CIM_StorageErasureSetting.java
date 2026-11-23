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
 * A representation of the model object '<em><b>CIM Storage Erasure Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This setting is associated to a storage element and indicates default behavior to use when the element is returned to the storage pool
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageErasureSetting#getErasureMethod <em>Erasure Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageErasureSetting#getEraseOnReturnToPool <em>Erase On Return To Pool</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageErasureSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Settings' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageErasureSetting extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Erasure Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erasure method to use. Must be one of the erasure methods listed in CIM_ErasureCapabilities.ErasureMethodsSupported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erasure Method</em>' attribute.
	 * @see #setErasureMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageErasureSetting_ErasureMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getErasureMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageErasureSetting#getErasureMethod <em>Erasure Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erasure Method</em>' attribute.
	 * @see #getErasureMethod()
	 * @generated
	 */
	void setErasureMethod(String value);

	/**
	 * Returns the value of the '<em><b>Erase On Return To Pool</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if this volume should be erased when deleted. Default is false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erase On Return To Pool</em>' attribute.
	 * @see #setEraseOnReturnToPool(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageErasureSetting_EraseOnReturnToPool()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getEraseOnReturnToPool();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageErasureSetting#getEraseOnReturnToPool <em>Erase On Return To Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erase On Return To Pool</em>' attribute.
	 * @see #getEraseOnReturnToPool()
	 * @generated
	 */
	void setEraseOnReturnToPool(Boolean value);

} // CIM_StorageErasureSetting
