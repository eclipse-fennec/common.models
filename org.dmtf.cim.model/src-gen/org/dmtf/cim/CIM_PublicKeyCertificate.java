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
 * A representation of the model object '<em><b>CIM Public Key Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PublicKeyCertificate is a credential that is cryptographically signed by a trusted Certificate Authority (CA) and issued to an authenticated entity (e.g., human user, service, etc.) called the Subject in the certificate. The public key in the certificate is cryptographically related to a private key that is held and kept private by the authenticated Subject. The certificate and its related private key can then be used for establishing trust relationships and securing communications with the Subject. Refer to the ITU/CCITT X.509 standard as an example of such certificates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PublicKeyCertificate#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicKeyCertificate#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicKeyCertificate#getServiceCreationClassName <em>Service Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicKeyCertificate#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicKeyCertificate#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicKeyCertificate#getAltSubject <em>Alt Subject</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicKeyCertificate#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PublicKeyCertificate()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::User::PublicKey' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PublicKeyCertificate extends CIM_SignedCredential {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CCN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicKeyCertificate_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_SignedCredential.InstanceID\"]' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicKeyCertificate#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicKeyCertificate_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_SignedCredential.InstanceID\"]' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicKeyCertificate#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Service Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Service's CCN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Creation Class Name</em>' attribute.
	 * @see #setServiceCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicKeyCertificate_ServiceCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_SignedCredential.InstanceID\"]' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getServiceCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicKeyCertificate#getServiceCreationClassName <em>Service Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Creation Class Name</em>' attribute.
	 * @see #getServiceCreationClassName()
	 * @generated
	 */
	void setServiceCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Service's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicKeyCertificate_ServiceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_SignedCredential.InstanceID\"]' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicKeyCertificate#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificate subject identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicKeyCertificate_Subject()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicKeyCertificate#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Alt Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternate subject identifier for the Certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Subject</em>' attribute.
	 * @see #setAltSubject(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicKeyCertificate_AltSubject()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getAltSubject();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicKeyCertificate#getAltSubject <em>Alt Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Subject</em>' attribute.
	 * @see #getAltSubject()
	 * @generated
	 */
	void setAltSubject(String value);

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DER-encoded raw public key.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicKeyCertificate_PublicKey()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getPublicKey();

} // CIM_PublicKeyCertificate
