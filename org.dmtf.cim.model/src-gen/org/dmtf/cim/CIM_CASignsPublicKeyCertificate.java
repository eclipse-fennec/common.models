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
 * A representation of the model object '<em><b>CIM CA Signs Public Key Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates a CertificateAuthority with the certificates it signs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CASignsPublicKeyCertificate#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CASignsPublicKeyCertificate#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CASignsPublicKeyCertificate#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CASignsPublicKeyCertificate#getCRLDistributionPoint <em>CRL Distribution Point</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CASignsPublicKeyCertificate()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceAffectsElement\"]' Version='2.16.0' UMLPackagePath='CIM::User::PublicKey' override.Antecedent='CIM_CertificateAuthority REF' override.Antecedent.Deprecated='[\"CIM_ServiceAffectsElement.AffectingElement\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The CA which signed the certificate.' override.Dependent='CIM_PublicKeyCertificate REF' override.Dependent.Deprecated='[\"CIM_ServiceAffectsElement.AffectedElement\"]' override.Dependent.Weak='true' override.Dependent.Description='The certificate issued by the CA.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CASignsPublicKeyCertificate extends CIM_ManagedCredential {
	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Serial Number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CASignsPublicKeyCertificate_SerialNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CASignsPublicKeyCertificate#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CASignsPublicKeyCertificate_Signature()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Deprecated='[\"No value\"]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getSignature();

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time it expires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CASignsPublicKeyCertificate_Expires()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Deprecated='[\"CIM_Credential.Expires\"]'"
	 * @generated
	 */
	String getExpires();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CASignsPublicKeyCertificate#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(String value);

	/**
	 * Returns the value of the '<em><b>CRL Distribution Point</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Authority's revocation list distribution points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRL Distribution Point</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CASignsPublicKeyCertificate_CRLDistributionPoint()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	EList<String> getCRLDistributionPoint();

} // CIM_CASignsPublicKeyCertificate
