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
 * A representation of the model object '<em><b>CIM Launch In Context SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each instance provides a flexible representation of a URI stored in the AccessInfo property that is used to launch a management service. This URI may contain dynamic information in the form of parameters that can used to modify the URI for use in a specific context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getParameterDescription <em>Parameter Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getParameterDerivation <em>Parameter Derivation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getParameterConstraints <em>Parameter Constraints</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getSupportedFeatureName <em>Supported Feature Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getSupportedFeatureDescription <em>Supported Feature Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getManagedClasses <em>Managed Classes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getManagementIsRestricted <em>Management Is Restricted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getLaunchMessage <em>Launch Message</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextSAP#getLaunchMessageProtocolOperation <em>Launch Message Protocol Operation</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' ClassConstraint='[\"inv: AccessContext=10\",\"inv: InfoFormat=200 or InfoFormat=206\"]' UMLPackagePath='CIM::Core::LaunchInContext' override.AccessContext='uint16' override.AccessContext.Description='AccessContext shall specify a Management Service (10).' override.AccessContext.ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32768..65535\"]' override.AccessContext.Values='[\"Unknown\",\"Other\",\"Default Gateway\",\"DNS Server\",\"SNMP Trap Destination\",\"MPLS Tunnel Destination\",\"DHCP Server\",\"SMTP Server\",\"LDAP Server\",\"Network Time Protocol (NTP) Server\",\"Management Service\",\"DMTF Reserved\",\"Vendor Reserved\"]' override.AccessContext.ModelCorrespondence='[\"CIM_RemoteServiceAccessPoint.OtherAccessContext\"]' override.AccessInfo='string' override.AccessInfo.Description='The URL may contain ${ParameterName} strings. The client is responsible for replacing such strings with the values of the corresponding parameters. (See the properties Parameter&lt;Name, Description, Type, Constraint, and Derivation&gt; below for various ways for a client to obtain those values.' override.AccessInfo.ModelCorrespondence='[\"CIM_LaunchInContextSAP.ParameterName\",\"CIM_LaunchInContextSAP.InfoFormat\"]' override.InfoFormat='uint16' override.InfoFormat.Description='InfoFormat shall contain either 200(URL) or 206(Paramterized URL).' override.InfoFormat.ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"100\",\"101\",\"102\",\"103\",\"104\",\"200\",\"201\",\"202\",\"203\",\"204\",\"205\",\"206\",\"..\",\"32768..65535\"]' override.InfoFormat.Values='[\"Other\",\"Host Name\",\"IPv4 Address\",\"IPv6 Address\",\"IPX Address\",\"DECnet Address\",\"SNA Address\",\"Autonomous System Number\",\"MPLS Label\",\"IPv4 Subnet Address\",\"IPv6 Subnet Address\",\"IPv4 Address Range\",\"IPv6 Address Range\",\"Dial String\",\"Ethernet Address\",\"Token Ring Address\",\"ATM Address\",\"Frame Relay Address\",\"URL\",\"FQDN\",\"User FQDN\",\"DER ASN1 DN\",\"DER ASN1 GN\",\"Key ID\",\"Parameterized URL\",\"DMTF Reserved\",\"Vendor Reserved\"]' override.InfoFormat.ModelCorrespondence='[\"CIM_RemoteServiceAccessPoint.OtherInfoFormatDescription\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_LaunchInContextSAP extends CIM_RemoteServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each entry specifies the name of a parameter specified in the URL string stored in the AccessInfo property as ${ParameterName}.
	 * Parameter names should have the format orgName:specName:specVersion:parameterName. In this format: orgName shall be a trademarked, or otherwise owned name of the defining organization, specName together with specVersion shall name a specification within that organization and parameterName shall be a name defined by the specification.
	 * For DMTF defined parameters: orgName shall be 'DMTF'; specName shall be the DSP name of the specification defining the parameter; and specVersion shall have the form M.N.E where M is the major version number, N is the minor version number, and E shall be the errata number. Each number shall not include leading zeros.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_ParameterName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<String> getParameterName();

	/**
	 * Returns the value of the '<em><b>Parameter Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides information about each parameter to display for each entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Description</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_ParameterDescription()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LaunchInContextSAP.ParameterName\"]'"
	 * @generated
	 */
	EList<String> getParameterDescription();

	/**
	 * Returns the value of the '<em><b>Parameter Derivation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each non empty entry shall specify a derivation for the value of the corresponding ParameterName property. Each derivation shall be specified as an OCL Derive constraint. (See OMG Object Constraint Language, v2.0, http://www.omg.org/technology/documents/spec_catalog.htm)
	 * If specified, the derivation context is an instance of CIM_ManagedElement specified in the GetDerivedParametersForElement method of this class. The derivation context and the 'derive:' keywords are not explicitly specified here.
	 * Example: to return the Caption of the specified element, the entry would contain the string: "self.Caption".
	 * On retrieval, the values returned by the method are used to replace the corresponding ${ParameterName} string in Accessinfo or LaunchMessage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Derivation</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_ParameterDerivation()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LaunchInContextSAP.ParameterName\",\"CIM_LaunchInContextSAP.GetDerivedparametersForElement\"]'"
	 * @generated
	 */
	EList<String> getParameterDerivation();

	/**
	 * Returns the value of the '<em><b>Parameter Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each non-empty entry specifies additional constraints on the corresponding parameter value beyond those that can be inferred from the corresponding ParameterType entry.
	 * Each entry shall be empty if the corresponding ParameterDerivation value is not empty or null. Otherwise, this shall be an OCL Invariant constraint that limits the values of the string. 
	 * The OCL context, and therefore, the 'self' variable shall refer to the parameter's value.
	 * For patterns, the OCL syntax is extended to include the use string function 'Like()' with the regular expression grammar as defined in DSP0200 Annex C, (http://www.dmtf.org/standards/published_documents/DSP0202_1.0.0.pdf).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Constraints</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_ParameterConstraints()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LaunchInContextSAP.ParameterName\"]'"
	 * @generated
	 */
	EList<String> getParameterConstraints();

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each entry specifies the type of the corresponding entry in the ParameterName property. If not specified, 3(string) is assumed.Note, ParameterConstraint entries can be used to specify valid value ranges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_ParameterType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Integer\",\"String\",\"Boolean\",\"Real\",\"DateTime\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LaunchInContextSAP.ParameterName\"]'"
	 * @generated
	 */
	EList<Integer> getParameterType();

	/**
	 * Returns the value of the '<em><b>Supported Feature Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each entry names a feature supported by the service addressed by AccessInfo.
	 * Feature names shall have the format orgName:specName:specVersion:featureName,where orgName shall be a trademarked, or otherwise owned name of the defining organization, specName together with specVersion shall name a specification within that organization and featureName shall be a name defined by the specification.
	 * For DMTF defined features: orgName shall be 'DMTF'; specName shall be the DSP name of a management profile; and specVersion shall have the form M.N.E where M is the major version number, N is the minor version number, and E shall be the errata number. Each number shall not include leading zeros.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Feature Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_SupportedFeatureName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<String> getSupportedFeatureName();

	/**
	 * Returns the value of the '<em><b>Supported Feature Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each entry describes the corresponding feature named in SupportedFeatureName.
	 * Each entry should describe the required parameters and related information used to select the feature when the service is launched.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Feature Description</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_SupportedFeatureDescription()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LaunchInContextSAP.SupportedFeatureName\"]'"
	 * @generated
	 */
	EList<String> getSupportedFeatureDescription();

	/**
	 * Returns the value of the '<em><b>Managed Classes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property, together with ManagementIsRestricted defines the set of instances exposed in the namespace of this instance, that may be managed by the service addressed by this instance. 
	 * The entries of this property identify the classes that such instances must be a kind of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Classes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_ManagedClasses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_LaunchInContextSAP.ManagementIsRestricted\"]'"
	 * @generated
	 */
	EList<String> getManagedClasses();

	/**
	 * Returns the value of the '<em><b>Management Is Restricted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property, together with ManagementIsRestricted defines the set of instances exposed in the namespace of this instance, that may be managed by the service addressed by this instance. 
	 * If the value of this boolean is false, then all instances exposed by the namespace which are kinds of the classes named in the entries of ManagedClasses may be managed by the addressed service. If true, then only those instances that are associated via CIM_ManagedSAP may be managed by the addressed service. This value shall be true if such associations exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Management Is Restricted</em>' attribute.
	 * @see #setManagementIsRestricted(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_ManagementIsRestricted()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_LaunchInContextSAP.ManagedClasses\"]'"
	 * @generated
	 */
	Boolean getManagementIsRestricted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LaunchInContextSAP#getManagementIsRestricted <em>Management Is Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management Is Restricted</em>' attribute.
	 * @see #getManagementIsRestricted()
	 * @generated
	 */
	void setManagementIsRestricted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Launch Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaunchMessage is a template for a message, to be sent to the URL specified in the AccessContext property. Like the AccessInfo property, this template may contain parameter value placeholders as ${ParameterName}, where ParameterName matches an entry in the ParameterName property. The format of the template is defined by the protocol specified by the value of the LaunchMessageProtocol.
	 * The client that uses this information to send a request is responsible for understanding the side-effects of passing the message. For instance if the message causes a service to be invoked, the client is responsible for handling reply messages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Launch Message</em>' attribute.
	 * @see #setLaunchMessage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_LaunchMessage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LaunchInContextSAP.LaunchMessageProtocolOperation\"]'"
	 * @generated
	 */
	String getLaunchMessage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LaunchInContextSAP#getLaunchMessage <em>Launch Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Message</em>' attribute.
	 * @see #getLaunchMessage()
	 * @generated
	 */
	void setLaunchMessage(String value);

	/**
	 * Returns the value of the '<em><b>Launch Message Protocol Operation</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This enumeration defines the protocol used to send the LaunchMessage.
	 * The format shall be orgName:protocolName:protocolVersion:protocolOperation,where orgName shall be a trademarked, or otherwise owned name of the defining organization, protocolName together with protocolVersion shall name protocol defined by that organization and protocolOperation shall name an operation of the protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Launch Message Protocol Operation</em>' attribute.
	 * @see #setLaunchMessageProtocolOperation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextSAP_LaunchMessageProtocolOperation()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"IETF:HTTP:1.0:GET\",\"IETF:HTTP:1.0:POST\",\"IETF:HTTP:1.1:GET\",\"IETF:HTTP:1.1:POST\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getLaunchMessageProtocolOperation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LaunchInContextSAP#getLaunchMessageProtocolOperation <em>Launch Message Protocol Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Message Protocol Operation</em>' attribute.
	 * @see #getLaunchMessageProtocolOperation()
	 * @generated
	 */
	void setLaunchMessageProtocolOperation(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method evaluates the parameters in the context of a specified instance referenced by ManagedElement. For each parameter entry containing an empty ParameterDerivation entry, the corresponding ParameterValue entry shall be an empty string. Otherwise, the value of the corresponding entry shall be the result of evaluating the derivation expression contained in the corresponding ParameterDerivation property.
	 * 0'Completed with No Error' is returned on success.
	 * 1'Not Supported' is returned if this method is not supported.
	 * 2'Unknown or Unspecified Error' is not expected
	 * 3'Failed' is not expected
	 * 4'Invalid Parameter' can happen if Self is not a well-formed association.
	 * @param Self The ManagedElement used as 'self' in the derivation expressions contained in the ParameterDerivation array.
	 * @param ParameterValue An array of parameter values corresponding to the entries of the ParameterNames array
	 * <!-- end-model-doc -->
	 * @model SelfAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Required='true' In='true'" ParameterValueUnique="false" ParameterValueMany="true"
	 *        ParameterValueAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LaunchInContextSAP.ParameterName\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown or Unspecified Error\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetDerivedParametersForElement(CIM_ManagedElement Self, EList<String> ParameterValue);

} // CIM_LaunchInContextSAP
