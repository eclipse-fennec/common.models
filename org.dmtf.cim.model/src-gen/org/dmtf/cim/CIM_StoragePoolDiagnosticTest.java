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
 * A representation of the model object '<em><b>CIM Storage Pool Diagnostic Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class subclasses CIM_DiagnosticTest to define the tests specific to storage pools.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolDiagnosticTest#getStoragePoolTestType <em>Storage Pool Test Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolDiagnosticTest#getOtherStoragePoolTestType <em>Other Storage Pool Test Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolDiagnosticTest()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Storage' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_StoragePoolDiagnosticTest extends CIM_DiagnosticTest {
	/**
	 * Returns the value of the '<em><b>Storage Pool Test Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptions for each storage pool test type are below: 
	 * * "Other" (value=1) is specified for any vendor specific test. If other is specified, then OtherStoragePoolTestType should also be specified.
	 * * "Storage Pool Status Test" (value=2) is specified for the test that performs a small set of vendor-specific tests to verify that the pool is operating properly. 
	 * * "Storage Pool Self Test" (value=3) is specified for the tests that performs an extended set of vendor-specific tests to verify that the pool is operating properly. 
	 * * "Storage Pool RECE Test" (value=4) is specified for the test that performs a set of vendor-specific tests to identify component elements that result in the status of the pool.
	 * * "Storage Pool Impact Test" (value=5) is specified for the test that performs a set of vendor-specific tests to identify elements allocated from the pool that are impacted by the status of the pool. 
	 * * "Storage Pool Actions Test" (value=6) is specified for the test that performs a set of vendor-specific tests to identify recommended actions to get the status to OK.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Pool Test Type</em>' attribute.
	 * @see #setStoragePoolTestType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolDiagnosticTest_StoragePoolTestType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Storage Pool Status\",\"Storage Pool Self Test\",\"Storage Pool RECE Test\",\"Storage Pool Impact Test\",\"Storage Pool Actions Test\"]'"
	 * @generated
	 */
	Integer getStoragePoolTestType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolDiagnosticTest#getStoragePoolTestType <em>Storage Pool Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Pool Test Type</em>' attribute.
	 * @see #getStoragePoolTestType()
	 * @generated
	 */
	void setStoragePoolTestType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Storage Pool Test Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the test when the StoragePoolTestType property is set to 1 ("Other"). This property must be set to null when StoragePoolTestType is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Storage Pool Test Type</em>' attribute.
	 * @see #setOtherStoragePoolTestType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolDiagnosticTest_OtherStoragePoolTestType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherStoragePoolTestType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolDiagnosticTest#getOtherStoragePoolTestType <em>Other Storage Pool Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Storage Pool Test Type</em>' attribute.
	 * @see #getOtherStoragePoolTestType()
	 * @generated
	 */
	void setOtherStoragePoolTestType(String value);

} // CIM_StoragePoolDiagnosticTest
