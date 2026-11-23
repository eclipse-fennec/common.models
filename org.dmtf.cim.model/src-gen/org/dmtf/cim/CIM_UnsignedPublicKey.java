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
 * A representation of the model object '<em><b>CIM Unsigned Public Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CIM_UnsignedPublicKey represents an unsigned public key credential. Services accept the public key as authentic because of a direct trust relationship, rather than via a third-party Certificate Authority.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedPublicKey#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedPublicKey#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedPublicKey#getServiceCreationClassName <em>Service Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedPublicKey#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedPublicKey#getPeerIdentity <em>Peer Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedPublicKey#getPeerIdentityType <em>Peer Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedPublicKey#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedPublicKey()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_UnsignedCredential\"]' Version='2.16.0' UMLPackagePath='CIM::User::PublicKey' keys='SystemCreationClassName,SystemName,ServiceCreationClassName,ServiceName,PeerIdentity'"
 * @generated
 */
@ProviderType
public interface CIM_UnsignedPublicKey extends CIM_Credential {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CCN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedPublicKey_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_UnsignedCredential.InstanceID\"]' Key='true' MaxLen='256' Propagated='CIM_PublicKeyManagementService.SystemCreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedPublicKey#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedPublicKey_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_UnsignedCredential.InstanceID\"]' Key='true' MaxLen='256' Propagated='CIM_PublicKeyManagementService.SystemName'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedPublicKey#getSystemName <em>System Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedPublicKey_ServiceCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_UnsignedCredential.InstanceID\"]' Key='true' MaxLen='256' Propagated='CIM_PublicKeyManagementService.CreationClassName'"
	 * @generated
	 */
	String getServiceCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedPublicKey#getServiceCreationClassName <em>Service Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedPublicKey_ServiceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_UnsignedCredential.InstanceID\"]' Key='true' MaxLen='256' Propagated='CIM_PublicKeyManagementService.Name'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedPublicKey#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Peer Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Identity of the Peer with whom a direct trust relationship exists. The public key may be used for security functions with the Peer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Identity</em>' attribute.
	 * @see #setPeerIdentity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedPublicKey_PeerIdentity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_UnsignedCredential.PeerIdentity\"]' Key='true' MaxLen='256' ModelCorrespondence='[\"CIM_UnsignedPublicKey.PeerIdentityType\"]'"
	 * @generated
	 */
	String getPeerIdentity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedPublicKey#getPeerIdentity <em>Peer Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Identity</em>' attribute.
	 * @see #getPeerIdentity()
	 * @generated
	 */
	void setPeerIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Peer Identity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PeerIdentityType is used to describe the type of the PeerIdentity. The currently defined values are used for IKE identities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Identity Type</em>' attribute.
	 * @see #setPeerIdentityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedPublicKey_PeerIdentityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_UnsignedCredential.PeerIdentityType\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"Other\",\"IPV4_ADDR\",\"FQDN\",\"USER_FQDN\",\"IPV4_ADDR_SUBNET\",\"IPV6_ADDR\",\"IPV6_ADDR_SUBNET\",\"IPV4_ADDR_RANGE\",\"IPV6_ADDR_RANGE\",\"DER_ASN1_DN\",\"DER_ASN1_GN\",\"KEY_ID\"]' ModelCorrespondence='[\"CIM_UnsignedPublicKey.PeerIdentity\"]'"
	 * @generated
	 */
	Integer getPeerIdentityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedPublicKey#getPeerIdentityType <em>Peer Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Identity Type</em>' attribute.
	 * @see #getPeerIdentityType()
	 * @generated
	 */
	void setPeerIdentityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DER-encoded raw public key.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedPublicKey_PublicKey()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Deprecated='[\"CIM_UnsignedCredential.PublicKey\"]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getPublicKey();

} // CIM_UnsignedPublicKey
