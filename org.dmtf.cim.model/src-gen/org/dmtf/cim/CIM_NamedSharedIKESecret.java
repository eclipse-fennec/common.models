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
 * A representation of the model object '<em><b>CIM Named Shared IKE Secret</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_NamedSharedIKESecret indirectly represents a shared secret credential. The local identity, IKEIdentity, and the remote peer identity share the secret that is named by the SharedSecretName. The SharedSecretName is used by the SharedSecretService to reference the secret.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getServiceCreationClassName <em>Service Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getLocalIdentity <em>Local Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getLocalIdentityType <em>Local Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getPeerIdentity <em>Peer Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getPeerIdentityType <em>Peer Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getSharedSecretName <em>Shared Secret Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_NamedCredential\"]' Version='2.16.0' UMLPackagePath='CIM::User::SharedSecret' keys='SystemCreationClassName,SystemName,ServiceCreationClassName,ServiceName,LocalIdentity,LocalIdentityType,PeerIdentity,PeerIdentityType'"
 * @generated
 */
@ProviderType
public interface CIM_NamedSharedIKESecret extends CIM_Credential {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CCN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NamedCredential.InstanceID\"]' Key='true' MaxLen='256' Propagated='CIM_SharedSecretService.SystemCreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NamedCredential.InstanceID\"]' Key='true' MaxLen='256' Propagated='CIM_SharedSecretService.SystemName'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getSystemName <em>System Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret_ServiceCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NamedCredential.InstanceID\"]' Key='true' MaxLen='256' Propagated='CIM_SharedSecretService.CreationClassName'"
	 * @generated
	 */
	String getServiceCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getServiceCreationClassName <em>Service Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret_ServiceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NamedCredential.InstanceID\"]' Key='true' MaxLen='256' Propagated='CIM_SharedSecretService.Name'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Local Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The local Identity with whom the direct trust relationship exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Identity</em>' attribute.
	 * @see #setLocalIdentity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret_LocalIdentity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NamedCredential.LocalIdentity\"]' Key='true' MaxLen='256' ModelCorrespondence='[\"CIM_NamedSharedIKESecret.LocalIdentityType\"]'"
	 * @generated
	 */
	String getLocalIdentity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getLocalIdentity <em>Local Identity</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret_LocalIdentityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_NamedCredential.LocalIdentityType\"]' Key='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"IPV4_ADDR\",\"FQDN\",\"USER_FQDN\",\"IPV4_ADDR_SUBNET\",\"IPV6_ADDR\",\"IPV6_ADDR_SUBNET\",\"IPV4_ADDR_RANGE\",\"IPV6_ADDR_RANGE\",\"DER_ASN1_DN\",\"DER_ASN1_GN\",\"KEY_ID\"]' ModelCorrespondence='[\"CIM_NamedSharedIKESecret.LocalIdentity\"]'"
	 * @generated
	 */
	Integer getLocalIdentityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getLocalIdentityType <em>Local Identity Type</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret_PeerIdentity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NamedCredential.PeerIdentity\"]' Key='true' MaxLen='256' ModelCorrespondence='[\"CIM_NamedSharedIKESecret.PeerIdentityType\"]'"
	 * @generated
	 */
	String getPeerIdentity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getPeerIdentity <em>Peer Identity</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret_PeerIdentityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_NamedCredential.PeerIdentityType\"]' Key='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"IPV4_ADDR\",\"FQDN\",\"USER_FQDN\",\"IPV4_ADDR_SUBNET\",\"IPV6_ADDR\",\"IPV6_ADDR_SUBNET\",\"IPV4_ADDR_RANGE\",\"IPV6_ADDR_RANGE\",\"DER_ASN1_DN\",\"DER_ASN1_GN\",\"KEY_ID\"]' ModelCorrespondence='[\"CIM_NamedSharedIKESecret.PeerIdentity\"]'"
	 * @generated
	 */
	Integer getPeerIdentityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getPeerIdentityType <em>Peer Identity Type</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedSharedIKESecret_SharedSecretName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NamedCredential.SharedSecretName\"]'"
	 * @generated
	 */
	String getSharedSecretName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedSharedIKESecret#getSharedSecretName <em>Shared Secret Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Secret Name</em>' attribute.
	 * @see #getSharedSecretName()
	 * @generated
	 */
	void setSharedSecretName(String value);

} // CIM_NamedSharedIKESecret
