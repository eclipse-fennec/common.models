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
 * A representation of the model object '<em><b>CIM Notary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Notary is an AuthenticationService which compares the biometric characteristics of a person with known characteristics, to establish identity. An example is a bank teller who compares a picture ID with the person trying to cash a check, or a biometric login service that uses voice recognition to identify a 'user'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Notary#getComparitors <em>Comparitors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Notary#getSealProtocol <em>Seal Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Notary#getCharterIssued <em>Charter Issued</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Notary#getCharterExpired <em>Charter Expired</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Notary()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::User::UsersAccess' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Notary extends CIM_CredentialManagementService {
	/**
	 * Returns the value of the '<em><b>Comparitors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of biometric information which this Notary can compare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparitors</em>' attribute.
	 * @see #setComparitors(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Notary_Comparitors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"N/A\",\"Other\",\"Facial\",\"Retina\",\"Mark\",\"Finger\",\"Voice\",\"DNA-RNA\",\"EEG\"]'"
	 * @generated
	 */
	Integer getComparitors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Notary#getComparitors <em>Comparitors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparitors</em>' attribute.
	 * @see #getComparitors()
	 * @generated
	 */
	void setComparitors(Integer value);

	/**
	 * Returns the value of the '<em><b>Seal Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SealProtocol is how the decision of the Notary is recorded for future use by parties who will rely on its decision. For instance, a drivers licence frequently includes tamper-resistent coatings and markings to protect the recorded decision that a driver, having various biometric characteristics of height, weight, hair and eye color, using a particular name, has features represented in a photograph of their face.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seal Protocol</em>' attribute.
	 * @see #setSealProtocol(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Notary_SealProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSealProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Notary#getSealProtocol <em>Seal Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seal Protocol</em>' attribute.
	 * @see #getSealProtocol()
	 * @generated
	 */
	void setSealProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Charter Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CharterIssued documents when the Notary is first authorized, by whoever gave it responsibility, to perform its service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charter Issued</em>' attribute.
	 * @see #setCharterIssued(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Notary_CharterIssued()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCharterIssued();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Notary#getCharterIssued <em>Charter Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charter Issued</em>' attribute.
	 * @see #getCharterIssued()
	 * @generated
	 */
	void setCharterIssued(String value);

	/**
	 * Returns the value of the '<em><b>Charter Expired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CharterExpired documents when the Notary is no longer authorized, by whoever gave it responsibility, to perform its service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charter Expired</em>' attribute.
	 * @see #setCharterExpired(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Notary_CharterExpired()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCharterExpired();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Notary#getCharterExpired <em>Charter Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charter Expired</em>' attribute.
	 * @see #getCharterExpired()
	 * @generated
	 */
	void setCharterExpired(String value);

} // CIM_Notary
