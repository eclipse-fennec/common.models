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
 * A representation of the model object '<em><b>CIM IPX Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A network or subnet that uses the IPX protocol. Since this class' superclass (LogicalNetwork) has been deprecated (in order to define more consistent 'collection' semantics), this class is also deprecated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPXNetwork#getNetworkNumber <em>Network Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPXNetwork()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_IPXConnectivityNetwork\"]' Version='2.7.0' UMLPackagePath='CIM::Network::Collections' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPXNetwork extends CIM_LogicalNetwork {
	/**
	 * Returns the value of the '<em><b>Network Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IPX network number formatted as eight hexadecimal digits (e.g., "00112233").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Number</em>' attribute.
	 * @see #setNetworkNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPXNetwork_NetworkNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_IPXConnectivityNetwork.NetworkNumber\"]'"
	 * @generated
	 */
	String getNetworkNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPXNetwork#getNetworkNumber <em>Network Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Number</em>' attribute.
	 * @see #getNetworkNumber()
	 * @generated
	 */
	void setNetworkNumber(String value);

} // CIM_IPXNetwork
