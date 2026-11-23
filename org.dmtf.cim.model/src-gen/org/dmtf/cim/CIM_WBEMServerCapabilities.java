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
 * A representation of the model object '<em><b>CIM WBEM Server Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WBEMServerCapabilities describes the capabilities supported for managing the assicated WBEM Server.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WBEMServerCapabilities#getOperationsSupported <em>Operations Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WBEMServerCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.38.0' UMLPackagePath='CIM::Interop::WBEMServer' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_WBEMServerCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Operations Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationsSupported describes the type of operations that are supported for the assoicated WBEMServer .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WBEMServerCapabilities_OperationsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\"]' Values='[\"RequestStateChange\",\"CreateWBEMServerNamespace\",\"DeleteNamespace\",\"ModifyNamespace\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getOperationsSupported();

} // CIM_WBEMServerCapabilities
