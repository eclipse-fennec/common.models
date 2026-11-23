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
 * A representation of the model object '<em><b>CIM IPX Connectivity Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A network or subnet that uses the IPX protocol.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPXConnectivityNetwork#getNetworkNumber <em>Network Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPXConnectivityNetwork()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::Collections' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IPXConnectivityNetwork extends CIM_ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>Network Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IPX network number formatted as eight hexadecimal digits (e.g., "00112233").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Number</em>' attribute.
	 * @see #setNetworkNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPXConnectivityNetwork_NetworkNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getNetworkNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPXConnectivityNetwork#getNetworkNumber <em>Network Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Number</em>' attribute.
	 * @see #getNetworkNumber()
	 * @generated
	 */
	void setNetworkNumber(String value);

} // CIM_IPXConnectivityNetwork
