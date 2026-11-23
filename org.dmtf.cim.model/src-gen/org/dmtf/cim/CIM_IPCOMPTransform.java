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
 * A representation of the model object '<em><b>CIM IPCOMP Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The IPCOMPTransform specifies the IP compression algorithm to use for payload of the Security Association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPCOMPTransform#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPCOMPTransform#getOtherAlgorithm <em>Other Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPCOMPTransform#getPrivateAlgorithm <em>Private Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPCOMPTransform#getDictionarySize <em>Dictionary Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPCOMPTransform()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' MappingStrings='[\"IPSP Model.IETF|IPCOMPTransform\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IPCOMPTransform extends CIM_SATransform {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Algorithm is an enumeration that designates the IPCOMP compression algorithm to use. Its values are generated from RFC2407, Section 4.4.5. Note that the values are modified from the RFC, since 'Other' must be taken into account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPCOMPTransform_Algorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Vendor Algorithm/OUI\",\"DEFLATE\",\"LZS\"]' MappingStrings='[\"IPSP Model.IETF|IPCOMPTransform.Algorithm\",\"RFC2407.IETF|Section 4.4.5\"]' ModelCorrespondence='[\"CIM_IPCOMPTransform.PrivateAlgorithm\",\"CIM_IPCOMPTransform.OtherAlgorithm\"]'"
	 * @generated
	 */
	Integer getAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPCOMPTransform#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the compression algorithm when the value 1 ("Other") is specified for the property, Algorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Algorithm</em>' attribute.
	 * @see #setOtherAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPCOMPTransform_OtherAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IPCOMPTransform.Algorithm\"]'"
	 * @generated
	 */
	String getOtherAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPCOMPTransform#getOtherAlgorithm <em>Other Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Algorithm</em>' attribute.
	 * @see #getOtherAlgorithm()
	 * @generated
	 */
	void setOtherAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Private Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A private compression algorithm, used when the Algorithm property is set to 2, "Vendor Algorithm/OUI".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Algorithm</em>' attribute.
	 * @see #setPrivateAlgorithm(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPCOMPTransform_PrivateAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"IPSP Model.IETF|IPCOMPTransform.PrivateAlgorithm\"]' ModelCorrespondence='[\"CIM_IPCOMPTransform.Algorithm\"]'"
	 * @generated
	 */
	Long getPrivateAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPCOMPTransform#getPrivateAlgorithm <em>Private Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Algorithm</em>' attribute.
	 * @see #getPrivateAlgorithm()
	 * @generated
	 */
	void setPrivateAlgorithm(Long value);

	/**
	 * Returns the value of the '<em><b>Dictionary Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DictionarySize is an optional field that specifies the log2 maximum size of the dictionary for the compression algorithm. For dictionaries that have a fixed size, this value is ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dictionary Size</em>' attribute.
	 * @see #setDictionarySize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPCOMPTransform_DictionarySize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"IPSP Model.IETF|IPCOMPTransform.DictionarySize\"]'"
	 * @generated
	 */
	Integer getDictionarySize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPCOMPTransform#getDictionarySize <em>Dictionary Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Size</em>' attribute.
	 * @see #getDictionarySize()
	 * @generated
	 */
	void setDictionarySize(Integer value);

} // CIM_IPCOMPTransform
