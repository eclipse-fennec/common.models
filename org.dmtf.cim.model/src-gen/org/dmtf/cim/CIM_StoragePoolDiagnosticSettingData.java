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
 * A representation of the model object '<em><b>CIM Storage Pool Diagnostic Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the additional settings to be used for storage pool diagnostic tests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolDiagnosticSettingData#getDepth <em>Depth</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolDiagnosticSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Storage' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StoragePoolDiagnosticSettingData extends CIM_DiagnosticSettingData {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used by a client to identify the depth of search for related components. The depth refers to the levels of indirection to reach a related element. If the test does not support the Depths setting, then this should be NULL. The possible non-values for depth include:
	 * * 0 - only test the pool
	 * * 1 - test one level removed from the pool
	 * * 2 - test two levels removed from the pool
	 * * 65535 - test all levels removed from the pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolDiagnosticSettingData_Depth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolDiagnosticSettingData#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(Integer value);

} // CIM_StoragePoolDiagnosticSettingData
