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
 * A representation of the model object '<em><b>CIM Named Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_NamedCredential indirectly represents a shared secret credential. The local identity, IKEIdentity, and the remote peer identity share the secret that is named by the SharedSecretName. The SharedSecretName is used by the SharedSecretService to reference the secret.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NamedCredential#getLocalIdentity <em>Local Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedCredential#getLocalIdentityType <em>Local Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedCredential#getPeerIdentity <em>Peer Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedCredential#getPeerIdentityType <em>Peer Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedCredential#getSharedSecretName <em>Shared Secret Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NamedCredential()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::User::SharedSecret' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the organizational entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NamedCredential extends CIM_Credential {
	/**
	 * Returns the value of the '<em><b>Local Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The local Identity with whom the direct trust relationship exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Identity</em>' attribute.
	 * @see #setLocalIdentity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedCredential_LocalIdentity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_NamedCredential.LocalIdentityType\"]'"
	 * @generated
	 */
	String getLocalIdentity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedCredential#getLocalIdentity <em>Local Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Identity</em>' attribute.
	 * @see #getLocalIdentity()
	 * @generated
	 */
	void setLocalIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Local Identity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LocalIdentityType is used to describe the type of the LocalIdentity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Identity Type</em>' attribute.
	 * @see #setLocalIdentityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedCredential_LocalIdentityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"IPV4_ADDR\",\"FQDN\",\"USER_FQDN\",\"IPV4_ADDR_SUBNET\",\"IPV6_ADDR\",\"IPV6_ADDR_SUBNET\",\"IPV4_ADDR_RANGE\",\"IPV6_ADDR_RANGE\",\"DER_ASN1_DN\",\"DER_ASN1_GN\",\"KEY_ID\"]' ModelCorrespondence='[\"CIM_NamedCredential.LocalIdentity\"]'"
	 * @generated
	 */
	Integer getLocalIdentityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedCredential#getLocalIdentityType <em>Local Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Identity Type</em>' attribute.
	 * @see #getLocalIdentityType()
	 * @generated
	 */
	void setLocalIdentityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Peer Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The peer identity with whom the direct trust relationship exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Identity</em>' attribute.
	 * @see #setPeerIdentity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedCredential_PeerIdentity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_NamedCredential.PeerIdentityType\"]'"
	 * @generated
	 */
	String getPeerIdentity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedCredential#getPeerIdentity <em>Peer Identity</em>}' attribute.
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
	 * PeerIdentityType is used to describe the type of the PeerIdentity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Identity Type</em>' attribute.
	 * @see #setPeerIdentityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedCredential_PeerIdentityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"IPV4_ADDR\",\"FQDN\",\"USER_FQDN\",\"IPV4_ADDR_SUBNET\",\"IPV6_ADDR\",\"IPV6_ADDR_SUBNET\",\"IPV4_ADDR_RANGE\",\"IPV6_ADDR_RANGE\",\"DER_ASN1_DN\",\"DER_ASN1_GN\",\"KEY_ID\"]' ModelCorrespondence='[\"CIM_NamedCredential.PeerIdentity\"]'"
	 * @generated
	 */
	Integer getPeerIdentityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedCredential#getPeerIdentityType <em>Peer Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Identity Type</em>' attribute.
	 * @see #getPeerIdentityType()
	 * @generated
	 */
	void setPeerIdentityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Shared Secret Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SharedSecretName is an indirect reference to a shared secret. The SecretService does not expose the actual secret but rather provides access to the secret via a name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shared Secret Name</em>' attribute.
	 * @see #setSharedSecretName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedCredential_SharedSecretName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSharedSecretName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedCredential#getSharedSecretName <em>Shared Secret Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Secret Name</em>' attribute.
	 * @see #getSharedSecretName()
	 * @generated
	 */
	void setSharedSecretName(String value);

} // CIM_NamedCredential
