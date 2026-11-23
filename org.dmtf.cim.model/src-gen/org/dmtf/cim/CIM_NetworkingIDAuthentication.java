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
 * A representation of the model object '<em><b>CIM Networking ID Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class describing a company's and/or administrator's credential requirements that should be authenticated in order to establish/trust a CIM_Identity. This class specifies that a networking ID or address should be verified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkingIDAuthentication#getNetworkingIdentityClassName <em>Networking Identity Class Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkingIDAuthentication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkingIDAuthentication extends CIM_AuthenticationCondition {
	/**
	 * Returns the value of the '<em><b>Networking Identity Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string defining the specific type/subclass of CIM_Identity which specifies the networking information. For example, CIM_StorageHardwareID would be entered in this property to identify that a 'known' port should be observed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networking Identity Class Name</em>' attribute.
	 * @see #setNetworkingIdentityClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkingIDAuthentication_NetworkingIdentityClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getNetworkingIdentityClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkingIDAuthentication#getNetworkingIdentityClassName <em>Networking Identity Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networking Identity Class Name</em>' attribute.
	 * @see #getNetworkingIdentityClassName()
	 * @generated
	 */
	void setNetworkingIdentityClassName(String value);

} // CIM_NetworkingIDAuthentication
