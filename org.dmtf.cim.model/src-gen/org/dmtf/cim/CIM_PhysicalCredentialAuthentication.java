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
 * A representation of the model object '<em><b>CIM Physical Credential Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class describing a company's and/or administrator's credential requirements that should be authenticated in order to establish/trust a CIM_Identity. This class defines the specific type of physical credential that should be authenticated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalCredentialAuthentication#getTypeOfCredential <em>Type Of Credential</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalCredentialAuthentication#getOtherCredential <em>Other Credential</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalCredentialAuthentication#getPhysicalIdentifier <em>Physical Identifier</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalCredentialAuthentication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalCredentialAuthentication extends CIM_AuthenticationCondition {
	/**
	 * Returns the value of the '<em><b>Type Of Credential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer enumeration identifying the credential that should be authenticated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Credential</em>' attribute.
	 * @see #setTypeOfCredential(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalCredentialAuthentication_TypeOfCredential()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Magnetic Stripe Card\",\"Smart Card\",\"Password Generator Card\"]' ModelCorrespondence='[\"CIM_PhysicalCredentialAuthentication.OtherCredential\"]'"
	 * @generated
	 */
	Integer getTypeOfCredential();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalCredentialAuthentication#getTypeOfCredential <em>Type Of Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Credential</em>' attribute.
	 * @see #getTypeOfCredential()
	 * @generated
	 */
	void setTypeOfCredential(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Credential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String specifying the credential when the TypeOfCredential property is set to 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Credential</em>' attribute.
	 * @see #setOtherCredential(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalCredentialAuthentication_OtherCredential()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalCredentialAuthentication.TypeOfCredential\"]'"
	 * @generated
	 */
	String getOtherCredential();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalCredentialAuthentication#getOtherCredential <em>Other Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Credential</em>' attribute.
	 * @see #getOtherCredential()
	 * @generated
	 */
	void setOtherCredential(String value);

	/**
	 * Returns the value of the '<em><b>Physical Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String defining a character or binary sequence, which is built into the physical credential to identify it. If left blank, it is the responsibility of the security infrastructure to verify that a valid credential (of the specified type) has been used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Identifier</em>' attribute.
	 * @see #setPhysicalIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalCredentialAuthentication_PhysicalIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPhysicalIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalCredentialAuthentication#getPhysicalIdentifier <em>Physical Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Identifier</em>' attribute.
	 * @see #getPhysicalIdentifier()
	 * @generated
	 */
	void setPhysicalIdentifier(String value);

} // CIM_PhysicalCredentialAuthentication
