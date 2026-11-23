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
 * A representation of the model object '<em><b>CIM X509CRL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_X509CRL describes Internet X509 Public Key Infrastructure (PKI) standard based Certificate Revocation List (CRL). CRL is issued by a Certificate Authority's (CA) to update the list of the certificates used in the authentication. Upon application of a CRL to a set of certificates, the certificates matched to those contained in the CRL would be revoked and invalidated for use in authentication. Refer to the Internet X.509 PKI standard (RFC 3280) for more information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_X509CRL#getNextUpdate <em>Next Update</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509CRL#getEncodedCRL <em>Encoded CRL</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509CRL#getSerialNumbers <em>Serial Numbers</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_X509CRL()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' ClassConstraint='[\"/* The constraints below aim to efficiently \052/  /* represent a singular OctetString. Each of the properties\052/  /* is a single encoded string, thus only the first element \052/  /* needs to be populated. \052/ inv:self.EncodedCRL-&gt;size()=1\"]' UMLPackagePath='CIM::User::PublicKey' override.Issued='datetime' override.Issued.Description='This property corresponds to the thisUpdate field in the Internet X509 PKI standard. The property represents the issue date of the CRL. Use a value of all \'00000101000000.000000+000\', (midnight, January 1, 1 BCE at coordinated universal time +0 minutes), if this information is not applicable. On CreateInstance, if this property is unspecified, or set to NULL, then current time is assumed.' override.Expires='datetime' override.Expires.Description='This property is not applicable for CIM_X509CRL class and shall either have value of \n\'99991231115959.999999-720\' as defined by DSP0004 to mean \"infinite future or NULL.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_X509CRL extends CIM_X509Infrastructure {
	/**
	 * Returns the value of the '<em><b>Next Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property represents the date by which the next CRL will be issued. The next CRL could be issued before the indicated date, but it will not be issued any later than the indicated date. If this information is not applicable, use a value of 
	 * '99991231115959.999999-720' as defined by DSP0004 to mean "infinite future.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Update</em>' attribute.
	 * @see #setNextUpdate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509CRL_NextUpdate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getNextUpdate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509CRL#getNextUpdate <em>Next Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Update</em>' attribute.
	 * @see #getNextUpdate()
	 * @generated
	 */
	void setNextUpdate(String value);

	/**
	 * Returns the value of the '<em><b>Encoded CRL</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full content of the CRL in binary form.Only the first element of the array property shall be populated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoded CRL</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509CRL_EncodedCRL()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getEncodedCRL();

	/**
	 * Returns the value of the '<em><b>Serial Numbers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of serial numbers of X.509 certificates that are part of CRL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Numbers</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509CRL_SerialNumbers()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getSerialNumbers();

} // CIM_X509CRL
