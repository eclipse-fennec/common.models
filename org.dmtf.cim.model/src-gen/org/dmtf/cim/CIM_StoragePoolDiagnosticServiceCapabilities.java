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
 * A representation of the model object '<em><b>CIM Storage Pool Diagnostic Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the permissible settings that can be used for storage pool diagnostic tests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolDiagnosticServiceCapabilities#getSupportedDepths <em>Supported Depths</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolDiagnosticServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Storage' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StoragePoolDiagnosticServiceCapabilities extends CIM_DiagnosticServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>Supported Depths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used by a provider to advertise the depths that are supported for certain tests. The depth refers to the levels of indirection to reach a related element. If the test does not support the Depths setting, then this should be NULL. The possible non-values for depth include:
	 * * 0 - only test the pool
	 * * 1 - test one level removed from the pool
	 * * 2 - test two levels removed from the pool
	 * * 65535 - test all levels removed from the pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Depths</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolDiagnosticServiceCapabilities_SupportedDepths()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]'"
	 * @generated
	 */
	EList<Integer> getSupportedDepths();

} // CIM_StoragePoolDiagnosticServiceCapabilities
