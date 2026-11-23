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
 * A representation of the model object '<em><b>CIM NIS Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The NISSettingData is a derived class of Settingdata that specifies the Network Information Service settings.The settings specify the NIS server that is to be used for host and user name lookup.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NISSettingData#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NISSettingData#getServerIP <em>Server IP</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NISSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileSystem' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NISSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the NIS domain to use for looking up hosts and usernames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NISSettingData_DomainName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NISSettingData#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Server IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address of a NIS server. The address type can be either IP4 or IP6.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server IP</em>' attribute.
	 * @see #setServerIP(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NISSettingData_ServerIP()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getServerIP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NISSettingData#getServerIP <em>Server IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server IP</em>' attribute.
	 * @see #getServerIP()
	 * @generated
	 */
	void setServerIP(String value);

} // CIM_NISSettingData
