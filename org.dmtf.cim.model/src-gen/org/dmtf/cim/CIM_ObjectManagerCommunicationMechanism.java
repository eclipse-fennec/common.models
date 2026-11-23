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
 * A representation of the model object '<em><b>CIM Object Manager Communication Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ObjectManagerCommunicationMechanism is deprecated. This class combined the concept of capabilities and accesspoint, but did not model the types of access properly. The new model uses CIM_ProtocolService, CIM_ServiceAccessPoint and Capabilities to describe the information.
 * The class, ObjectManagerCommunicationMechanism, describes access to an ObjectManager. It describes a protocol and data encoding that can be used for communication. When all instances of this class are enumerated for an ObjectManager (using the CommMechanismForManager association), all possible protocol and encoding schemes will be known. Also, specific capabilities (for example, basic read or query) that are supported in the protocol/encoding are described - using the ProfilesSupported property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getCommunicationMechanism <em>Communication Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getOtherCommunicationMechanismDescription <em>Other Communication Mechanism Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getFunctionalProfilesSupported <em>Functional Profiles Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getFunctionalProfileDescriptions <em>Functional Profile Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getMultipleOperationsSupported <em>Multiple Operations Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getAuthenticationMechanismsSupported <em>Authentication Mechanisms Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getAuthenticationMechanismDescriptions <em>Authentication Mechanism Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getAdvertiseTypes <em>Advertise Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getAdvertiseTypeDescriptions <em>Advertise Type Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_WBEMProtocolServiceCapabilities\"]' Version='2.39.0' UMLPackagePath='CIM::Interop' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ObjectManagerCommunicationMechanism extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Communication Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationMechanism describes an encoding and protocol which can be used to communicate with the server. ObjectManager, the specified string should be indicated. If Other is used, the value forOtherCommunicationMechanismDescription must not be null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Mechanism</em>' attribute.
	 * @see #setCommunicationMechanism(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_CommunicationMechanism()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_ProtocolService.Protocol\"]' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"CIM-XML\",\"SM-CLP\",\"WS-Management\",\"WSDM\"]' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.OtherCommunicationMechanismDescription\"]'"
	 * @generated
	 */
	Integer getCommunicationMechanism();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getCommunicationMechanism <em>Communication Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Mechanism</em>' attribute.
	 * @see #getCommunicationMechanism()
	 * @generated
	 */
	void setCommunicationMechanism(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Communication Mechanism Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string providing a description of the supported protocols when 1, "Other", is specified in the CommunicationMechanism.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Communication Mechanism Description</em>' attribute.
	 * @see #setOtherCommunicationMechanismDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_OtherCommunicationMechanismDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_ProtocolService.OtherProtocol\"]' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.CommunicationMechanism\"]'"
	 * @generated
	 */
	String getOtherCommunicationMechanismDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getOtherCommunicationMechanismDescription <em>Other Communication Mechanism Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Communication Mechanism Description</em>' attribute.
	 * @see #getOtherCommunicationMechanismDescription()
	 * @generated
	 */
	void setOtherCommunicationMechanismDescription(String value);

	/**
	 * Returns the value of the '<em><b>Functional Profiles Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerated array describing the types of operations supported by the ObjectManager, using this encoding/protocol. The enumeration is based on the Functional Profiles defined for conformance in the DMTF document, Specification for CIM Operations over HTTP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functional Profiles Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_FunctionalProfilesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\"]' Values='[\"Unknown\",\"Other\",\"Basic Read\",\"Basic Write\",\"Schema Manipulation\",\"Instance Manipulation\",\"Association Traversal\",\"Query Execution\",\"Qualifier Declaration\",\"Indications\",\"Pulled Read\",\"Pulled Read Count\",\"Pulled Query Execution\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.FunctionalProfileDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getFunctionalProfilesSupported();

	/**
	 * Returns the value of the '<em><b>Functional Profile Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free-form strings providing descriptions of the supported operations of the object manager. Entries in the array are correlated with those in the ProfilesSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in the FunctionalProfilesSupported array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functional Profile Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_FunctionalProfileDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.FunctionalProfilesSupported\"]'"
	 * @generated
	 */
	EList<String> getFunctionalProfileDescriptions();

	/**
	 * Returns the value of the '<em><b>Multiple Operations Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the ObjectManager supports multiple operation requests (TRUE) or only simple requests (FALSE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Operations Supported</em>' attribute.
	 * @see #setMultipleOperationsSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_MultipleOperationsSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]' Required='true'"
	 * @generated
	 */
	Boolean getMultipleOperationsSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getMultipleOperationsSupported <em>Multiple Operations Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Operations Supported</em>' attribute.
	 * @see #getMultipleOperationsSupported()
	 * @generated
	 */
	void setMultipleOperationsSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Authentication Mechanisms Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerated array describing the types of authentication supported by the ObjectManager, using the encoding/protocol. specified in the property, CommunicationMechanism. The defined values represent the authentication defined in the DMTF document, Specification for CIM Operations over HTTP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Mechanisms Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_AuthenticationMechanismsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_WBEMProtocolServiceCapabilities.AuthenticationMechanismsSupported\"]' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"None\",\"Basic\",\"Digest\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.AuthenticationMechanismDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getAuthenticationMechanismsSupported();

	/**
	 * Returns the value of the '<em><b>Authentication Mechanism Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free-form strings providing descriptions of the supported mechanisms. Entries in this array are correlated with those in the AuthenticationMechanismsSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in AuthenticationMechanismsSupported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Mechanism Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_AuthenticationMechanismDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_WBEMProtocolServiceCapabilities.AuthenticationMechanismsDescriptions\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.AuthenticationMechanismsSupported\"]'"
	 * @generated
	 */
	EList<String> getAuthenticationMechanismDescriptions();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the protocol version for this service access point. Version information MUST be in the form of M.N, where M is a numeric that describes the Major version and N is a numeric that describes the minor version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_CIMXMLCapabilities.WBEMProtocolVersionsSupported\"]' Required='true'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Advertise Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property signifies the advertisement for this access point. . It is used by the advertising services of the WBEM infrastructure to determine what should be advertised, via what mechanisms. The property is an array so that the communicationMechansim MAY be advertised using several mechanisms. Note: If this property is null/uninitialized, this is equivalent to specifying the value 2, "Not Advertised".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Advertise Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_AdvertiseTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' Required='true' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"Not Advertised\",\"SLP\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.AdvertiseTypeDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getAdvertiseTypes();

	/**
	 * Returns the value of the '<em><b>Advertise Type Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string providing additional information related to the AdvertiseType. A description MUST be provided when the AdvertiseType is 1, "Other". An entry in this array corresponds to the entry in the AdvertiseTypes array at the same index. It is not expected that additional descriptions are needed if the Type is set to "Not Advertised" or "SLP". However, as the SLP template expands, or as other advertisement mechanisms are defined, support for additional descriptions may be needed. This array is defined to support this.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Advertise Type Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerCommunicationMechanism_AdvertiseTypeDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.AdvertiseTypes\"]'"
	 * @generated
	 */
	EList<String> getAdvertiseTypeDescriptions();

} // CIM_ObjectManagerCommunicationMechanism
