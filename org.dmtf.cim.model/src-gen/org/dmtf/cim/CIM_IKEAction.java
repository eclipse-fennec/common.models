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
 * A representation of the model object '<em><b>CIM IKE Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IKEAction specifies the parameters to use for an IPsec IKE phase 1 negotiation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IKEAction#getExchangeMode <em>Exchange Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEAction#getUseIKEIdentityType <em>Use IKE Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEAction#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEAction#getAggressiveModeGroupID <em>Aggressive Mode Group ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IKEAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|IKEAction\"]' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_IKEAction extends CIM_SANegotiationAction {
	/**
	 * Returns the value of the '<em><b>Exchange Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExchangeMode designates the mode IKE should use for its key negotiations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Mode</em>' attribute.
	 * @see #setExchangeMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEAction_ExchangeMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Base\",\"Main\",\"Aggressive\"]' MappingStrings='[\"IPSP Policy Model.IETF|IKEAction.ExchangeMode\"]'"
	 * @generated
	 */
	Integer getExchangeMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEAction#getExchangeMode <em>Exchange Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Mode</em>' attribute.
	 * @see #getExchangeMode()
	 * @generated
	 */
	void setExchangeMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Use IKE Identity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseIKEIdentityType specifies what network identity type should be used when negotiating with the peer. It is used in conjunction with the available IPNetworkIdentity instances, that are associated with an IPProtocolEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use IKE Identity Type</em>' attribute.
	 * @see #setUseIKEIdentityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEAction_UseIKEIdentityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"IPV4 Address\",\"FQDN\",\"User FQDN\",\"IPV4 Subnet Address\",\"IPV6 Address\",\"IPV6 Subnet Address\",\"IPV4 Address Range\",\"IPV6 Address Range\",\"DER ASN1 DN\",\"DER ASN1 GN\",\"KEY ID\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IKEAction.UseIKEIdentityType\",\"RFC2407.IETF|Section 4.6.2.1\"]' ModelCorrespondence='[\"CIM_IPNetworkIdentity.IdentityType\"]'"
	 * @generated
	 */
	Integer getUseIKEIdentityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEAction#getUseIKEIdentityType <em>Use IKE Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use IKE Identity Type</em>' attribute.
	 * @see #getUseIKEIdentityType()
	 * @generated
	 */
	void setUseIKEIdentityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Vendor ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VendorID specifies the value to be used in the Vendor ID payload. An empty string (the default) means that the Vendor ID payload will not be generated or accepted. A non-NULL value means that a Vendor ID payload will be generated (when acting as an initiator) or is expected (when acting as a responder).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor ID</em>' attribute.
	 * @see #setVendorID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEAction_VendorID()
	 * @model default=""
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"IPSP Policy Model.IETF|IKEAction.VendorID\"]'"
	 * @generated
	 */
	String getVendorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEAction#getVendorID <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID</em>' attribute.
	 * @see #getVendorID()
	 * @generated
	 */
	void setVendorID(String value);

	/**
	 * Returns the value of the '<em><b>Aggressive Mode Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When IKEAction.ExchangeMode is set to "Aggressive" (4), this property specifies the key exchange groupID to use in the first packets of the phase 1 negotiation. This property is ignored unless the ExchangeMode is 'aggressive'. If the GroupID number is from the vendor- specific range (32768-65535), the VendorID qualifies the group number. Well-known group identifiers from RFC2412, Appendix E, are: Group 1='768 bit prime', Group 2='1024 bit prime', Group 3='Elliptic Curve Group with 155 bit field element', Group 4='Large Elliptic Curve Group with 185 bit field element', and Group 5='1536 bit prime'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggressive Mode Group ID</em>' attribute.
	 * @see #setAggressiveModeGroupID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEAction_AggressiveModeGroupID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"No Group/Non-Diffie-Hellman Exchange\",\"DH-768 bit prime\",\"DH-1024 bit prime\",\"EC2N-155 bit field element\",\"EC2N-185 bit field element\",\"DH-1536 bit prime\",\"Standard Group - Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IKEAction.AggressiveModeGroupID\",\"RFC2412.IETF|Appendix E\"]' ModelCorrespondence='[\"CIM_IKEAction.VendorID\"]'"
	 * @generated
	 */
	Integer getAggressiveModeGroupID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEAction#getAggressiveModeGroupID <em>Aggressive Mode Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggressive Mode Group ID</em>' attribute.
	 * @see #getAggressiveModeGroupID()
	 * @generated
	 */
	void setAggressiveModeGroupID(Integer value);

} // CIM_IKEAction
