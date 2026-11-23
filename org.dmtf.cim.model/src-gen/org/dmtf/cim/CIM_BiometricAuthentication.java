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
 * A representation of the model object '<em><b>CIM Biometric Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class describing a company's and/or administrator's credential requirements that should be authenticated in order to establish/trust a CIM_Identity. This class defines specific biometric data that should be authenticated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BiometricAuthentication#getTypeOfBiometric <em>Type Of Biometric</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BiometricAuthentication#getOtherBiometric <em>Other Biometric</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BiometricAuthentication#getPersonalIdentifier <em>Personal Identifier</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BiometricAuthentication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_BiometricAuthentication extends CIM_AuthenticationCondition {
	/**
	 * Returns the value of the '<em><b>Type Of Biometric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer enumeration identifying the biometric data that should be authenticated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Biometric</em>' attribute.
	 * @see #setTypeOfBiometric(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BiometricAuthentication_TypeOfBiometric()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Other\",\"Facial\",\"Retina\",\"Mark\",\"Finger\",\"Voice\",\"DNA-RNA\",\"EEG\"]' ModelCorrespondence='[\"CIM_BiometricAuthentication.OtherBiometric\"]'"
	 * @generated
	 */
	Integer getTypeOfBiometric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BiometricAuthentication#getTypeOfBiometric <em>Type Of Biometric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Biometric</em>' attribute.
	 * @see #getTypeOfBiometric()
	 * @generated
	 */
	void setTypeOfBiometric(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Biometric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String specifying the biometric when the TypeOfBiometric property is set to 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Biometric</em>' attribute.
	 * @see #setOtherBiometric(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BiometricAuthentication_OtherBiometric()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_BiometricAuthentication.TypeOfBiometric\"]'"
	 * @generated
	 */
	String getOtherBiometric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BiometricAuthentication#getOtherBiometric <em>Other Biometric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Biometric</em>' attribute.
	 * @see #getOtherBiometric()
	 * @generated
	 */
	void setOtherBiometric(String value);

	/**
	 * Returns the value of the '<em><b>Personal Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String defining a specific biometric code, which may be validated by the security infrastructure. If this property is left blank, it is the responsibility of the infrastructure to verify the biometric (which MUST be of a type specified by the TypeOfBiometric property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personal Identifier</em>' attribute.
	 * @see #setPersonalIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BiometricAuthentication_PersonalIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPersonalIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BiometricAuthentication#getPersonalIdentifier <em>Personal Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Identifier</em>' attribute.
	 * @see #getPersonalIdentifier()
	 * @generated
	 */
	void setPersonalIdentifier(String value);

} // CIM_BiometricAuthentication
