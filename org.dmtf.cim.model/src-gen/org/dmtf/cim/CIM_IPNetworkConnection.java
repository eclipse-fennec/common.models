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
 * A representation of the model object '<em><b>CIM IP Network Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * "CIM_IPNetworkConnection class represents service access point for the IP interface configuration in the system, Eg. "IP stack configuration on a Local Area Connection","IP stack configuration on a ethernet interface". 
 * An IP network connection is an aggregation point of different types of settings that can be applied to an IP interface to represent protocol end points".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPNetworkConnection#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPNetworkConnection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.0' UMLPackagePath='CIM::Network::IP' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPNetworkConnection extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This shall contain a free form string, that identifies the IP network connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPNetworkConnection_ID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPNetworkConnection#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // CIM_IPNetworkConnection
