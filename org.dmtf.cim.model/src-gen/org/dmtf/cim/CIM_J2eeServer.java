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
 * A representation of the model object '<em><b>CIM J2ee Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeServer class represents the J2EE Server core of one instance of a J2EE platform product as described in the Java 2 Enterprise Edition Platform specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeServer#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeServer#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServer()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Name='string' override.Name.Description='The name of a J2EE Server. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.Name.MaxLen='256' override.Name.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeServer extends CIM_ApplicationSystem {
	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the server's vendor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServer_Vendor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"JSR77.JCP|JSR77.3.3.1.4 serverVendor|V1.0\"]'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeServer#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The J2EE implementation version of the J2EE server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServer_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"JSR77.JCP|JSR77.3.3.1.5 serverVersion|V1.0\"]'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeServer#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // CIM_J2eeServer
