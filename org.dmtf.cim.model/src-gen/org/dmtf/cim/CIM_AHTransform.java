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
 * A representation of the model object '<em><b>CIM AH Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AHTransform defines the parameters used for a phase 2 AH (Authentication Header) Security Association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AHTransform#getAHTransformId <em>AH Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AHTransform#getOtherAHTransformId <em>Other AH Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AHTransform#getUseReplayPrevention <em>Use Replay Prevention</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AHTransform#getReplayPreventionWindowSize <em>Replay Prevention Window Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AHTransform()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' MappingStrings='[\"IPSP Model.IETF|AHTransform\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AHTransform extends CIM_SATransform {
	/**
	 * Returns the value of the '<em><b>AH Transform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AHTransformId is an enumeration that specifies the hash algorithm to be used. The list of values was generated from RFC2407, Section 4.4.3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AH Transform Id</em>' attribute.
	 * @see #setAHTransformId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AHTransform_AHTransformId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"MD5\",\"SHA-1\",\"DES\"]' MappingStrings='[\"IPSP Model.IETF|AHTransform.AHTransformID\",\"RFC2407.IETF|Section 4.4.3\"]' ModelCorrespondence='[\"CIM_AHTransform.OtherAHTransformId\"]'"
	 * @generated
	 */
	Integer getAHTransformId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AHTransform#getAHTransformId <em>AH Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AH Transform Id</em>' attribute.
	 * @see #getAHTransformId()
	 * @generated
	 */
	void setAHTransformId(Integer value);

	/**
	 * Returns the value of the '<em><b>Other AH Transform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the hash algorithm when the value 1 ("Other") is specified for the property, AHTransformId.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other AH Transform Id</em>' attribute.
	 * @see #setOtherAHTransformId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AHTransform_OtherAHTransformId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AHTransform.AHTransformId\"]'"
	 * @generated
	 */
	String getOtherAHTransformId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AHTransform#getOtherAHTransformId <em>Other AH Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other AH Transform Id</em>' attribute.
	 * @see #getOtherAHTransformId()
	 * @generated
	 */
	void setOtherAHTransformId(String value);

	/**
	 * Returns the value of the '<em><b>Use Replay Prevention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseReplayPrevention causes the local peer to enable replay prevention detection. This can be accomplished by using a sequence number when sending a packet or checking the sequence number upon receipt of a packet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Replay Prevention</em>' attribute.
	 * @see #setUseReplayPrevention(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AHTransform_UseReplayPrevention()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"IPSP Model.IETF|AHTransform.UseReplayPrevention\"]'"
	 * @generated
	 */
	Boolean getUseReplayPrevention();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AHTransform#getUseReplayPrevention <em>Use Replay Prevention</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_AHTransform_ReplayPreventionWindowSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits' MappingStrings='[\"IPSP Model.IETF|AHTransform.ReplayPreventionWindowSize\"]' PUnit='bit'"
	 * @generated
	 */
	Long getReplayPreventionWindowSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AHTransform#getReplayPreventionWindowSize <em>Replay Prevention Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replay Prevention Window Size</em>' attribute.
	 * @see #getReplayPreventionWindowSize()
	 * @generated
	 */
	void setReplayPreventionWindowSize(Long value);

} // CIM_AHTransform
