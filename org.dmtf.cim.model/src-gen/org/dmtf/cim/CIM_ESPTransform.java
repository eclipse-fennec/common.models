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
 * A representation of the model object '<em><b>CIM ESP Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ESPTransform defines the parameters used for a phase 2 ESP (Encapsulating Security Protocol) Security Association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ESPTransform#getIntegrityTransformId <em>Integrity Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ESPTransform#getOtherIntegrityTransformId <em>Other Integrity Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ESPTransform#getCipherTransformId <em>Cipher Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ESPTransform#getOtherCipherTransformId <em>Other Cipher Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ESPTransform#getCipherKeyLength <em>Cipher Key Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ESPTransform#getCipherKeyRounds <em>Cipher Key Rounds</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ESPTransform#getUseReplayPrevention <em>Use Replay Prevention</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ESPTransform#getReplayPreventionWindowSize <em>Replay Prevention Window Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ESPTransform()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' MappingStrings='[\"IPSP Model.IETF|ESPTransform\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ESPTransform extends CIM_SATransform {
	/**
	 * Returns the value of the '<em><b>Integrity Transform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IntegrityTransformId is an enumeration that specifies the ESP integrity algorithm to be used. The list of values is generated from the enumeration defined in RFC2407, Section 4.5. Note that the enumeration is different than the RFC list, since the values of Other and None are taken into account. Also, note that 2 ("None") is used when ESP is negotiated without authentication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity Transform Id</em>' attribute.
	 * @see #setIntegrityTransformId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ESPTransform_IntegrityTransformId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..61439\",\"61440..65535\"]' Values='[\"Other\",\"None\",\"MD5\",\"SHA-1\",\"DES\",\"KPDK\",\"DMTF/IANA Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Model.IETF|ESPTransform.IntegrityTransformId\",\"RFC2407.IETF|Section 4.5\"]' ModelCorrespondence='[\"CIM_ESPTransform.OtherIntegrityTransformId\"]'"
	 * @generated
	 */
	Integer getIntegrityTransformId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ESPTransform#getIntegrityTransformId <em>Integrity Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity Transform Id</em>' attribute.
	 * @see #getIntegrityTransformId()
	 * @generated
	 */
	void setIntegrityTransformId(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Integrity Transform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the integrity algorithm when the value 1 ("Other") is specified for the property, IntegrityTransformId.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Integrity Transform Id</em>' attribute.
	 * @see #setOtherIntegrityTransformId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ESPTransform_OtherIntegrityTransformId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ESPTransform.IntegrityTransformId\"]'"
	 * @generated
	 */
	String getOtherIntegrityTransformId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ESPTransform#getOtherIntegrityTransformId <em>Other Integrity Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Integrity Transform Id</em>' attribute.
	 * @see #getOtherIntegrityTransformId()
	 * @generated
	 */
	void setOtherIntegrityTransformId(String value);

	/**
	 * Returns the value of the '<em><b>Cipher Transform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CipherTransformId is an enumeration that specifies the ESP encrypion algorithm to be used. The list of values is defined in RFC2407, Section 4.4.4, where the RFC's NULL value maps to 2-"None". Note that the enumeration is different than the RFC list, since 'Other' is added to the enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cipher Transform Id</em>' attribute.
	 * @see #setCipherTransformId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ESPTransform_CipherTransformId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\"]' Values='[\"Other\",\"None\",\"DES_IV64\",\"DES\",\"3DES\",\"RC5\",\"IDEA\",\"CAST\",\"Blowfish\",\"3-IDEA\",\"DES_IV32\",\"RC4\"]' MappingStrings='[\"IPSP Model.IETF|ESPTransform.CipherTransformId\",\"RFC2407.IETF|Section 4.4.4\"]' ModelCorrespondence='[\"CIM_ESPTransform.OtherCipherTransformId\"]'"
	 * @generated
	 */
	Integer getCipherTransformId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ESPTransform#getCipherTransformId <em>Cipher Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Transform Id</em>' attribute.
	 * @see #getCipherTransformId()
	 * @generated
	 */
	void setCipherTransformId(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Cipher Transform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the encryption algorithm when the value 1 ("Other") is specified for the property, CipherTransformId.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Cipher Transform Id</em>' attribute.
	 * @see #setOtherCipherTransformId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ESPTransform_OtherCipherTransformId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ESPTransform.CipherTransformId\"]'"
	 * @generated
	 */
	String getOtherCipherTransformId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ESPTransform#getOtherCipherTransformId <em>Other Cipher Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Cipher Transform Id</em>' attribute.
	 * @see #getOtherCipherTransformId()
	 * @generated
	 */
	void setOtherCipherTransformId(String value);

	/**
	 * Returns the value of the '<em><b>Cipher Key Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CipherKeyLength specifies, in bits, the key length for the encryption algorithm. For algorithms with fixed key lengths, this value is ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cipher Key Length</em>' attribute.
	 * @see #setCipherKeyLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ESPTransform_CipherKeyLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bits' MappingStrings='[\"IPSP Model.IETF|ESPTransform.CipherKeyLength\"]' PUnit='bit'"
	 * @generated
	 */
	Integer getCipherKeyLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ESPTransform#getCipherKeyLength <em>Cipher Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Key Length</em>' attribute.
	 * @see #getCipherKeyLength()
	 * @generated
	 */
	void setCipherKeyLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Cipher Key Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CipherKeyRounds specifies the key rounds for the encryption algorithm. For algorithms with a fixed number of key rounds, this value is ignored. Currently, key rounds are NOT defined for any ESP encryption algorithms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cipher Key Rounds</em>' attribute.
	 * @see #setCipherKeyRounds(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ESPTransform_CipherKeyRounds()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"IPSP Model.IETF|ESPTransform.CipherKeyRounds\"]'"
	 * @generated
	 */
	Integer getCipherKeyRounds();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ESPTransform#getCipherKeyRounds <em>Cipher Key Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Key Rounds</em>' attribute.
	 * @see #getCipherKeyRounds()
	 * @generated
	 */
	void setCipherKeyRounds(Integer value);

	/**
	 * Returns the value of the '<em><b>Use Replay Prevention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseReplayPrevention causes the local peer to enable replay prevention detection. This can be accomplished by using a sequence number when sending a packet or checking the sequence number upon receipt of a packet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Replay Prevention</em>' attribute.
	 * @see #setUseReplayPrevention(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ESPTransform_UseReplayPrevention()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"IPSP Model.IETF|ESPTransform.UseReplayPrevention\"]'"
	 * @generated
	 */
	Boolean getUseReplayPrevention();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ESPTransform#getUseReplayPrevention <em>Use Replay Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Replay Prevention</em>' attribute.
	 * @see #getUseReplayPrevention()
	 * @generated
	 */
	void setUseReplayPrevention(Boolean value);

	/**
	 * Returns the value of the '<em><b>Replay Prevention Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ReplayPreventionWindowsSize specifies, in bits, the length of the sliding window used by the replay prevention mechanism. The value of this property is meaningless if UseReplayPrevention is false. The window size MUST be a power of 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replay Prevention Window Size</em>' attribute.
	 * @see #setReplayPreventionWindowSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ESPTransform_ReplayPreventionWindowSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits' MappingStrings='[\"IPSP Model.IETF|ESPTransform.ReplayPreventionWindowSize\"]' PUnit='bit'"
	 * @generated
	 */
	Long getReplayPreventionWindowSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ESPTransform#getReplayPreventionWindowSize <em>Replay Prevention Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replay Prevention Window Size</em>' attribute.
	 * @see #getReplayPreventionWindowSize()
	 * @generated
	 */
	void setReplayPreventionWindowSize(Long value);

} // CIM_ESPTransform
