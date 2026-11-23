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
 * A representation of the model object '<em><b>CIM VLAN Endpoint Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities supported by the VLAN endpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpointCapabilities#getDot1QTagging <em>Dot1 QTagging</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpointCapabilities#getDot1qAcceptableVLANFramesTypes <em>Dot1q Acceptable VLAN Frames Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpointCapabilities#getDot1qIngressFiltering <em>Dot1q Ingress Filtering</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpointCapabilities#getSupportsTrunkEncapsulationNegotiation <em>Supports Trunk Encapsulation Negotiation</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.21.0' UMLPackagePath='CIM::Network::VLAN' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VLANEndpointCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Dot1 QTagging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates support for dot1Q tagging and GVRP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dot1 QTagging</em>' attribute.
	 * @see #setDot1QTagging(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointCapabilities_Dot1QTagging()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|P-BRIDGE-MIB.dot1dPortCapabilities\"]'"
	 * @generated
	 */
	Boolean getDot1QTagging();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpointCapabilities#getDot1QTagging <em>Dot1 QTagging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot1 QTagging</em>' attribute.
	 * @see #getDot1QTagging()
	 * @generated
	 */
	void setDot1QTagging(Boolean value);

	/**
	 * Returns the value of the '<em><b>Dot1q Acceptable VLAN Frames Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the type of frames that are accepted by the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dot1q Acceptable VLAN Frames Types</em>' attribute.
	 * @see #setDot1qAcceptableVLANFramesTypes(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointCapabilities_Dot1qAcceptableVLANFramesTypes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Accept All\",\"Admit VLAN Tagged Only\",\"Not Applicable\"]' MappingStrings='[\"MIB.IETF|P-BRIDGE-MIB.dot1dPortCapabilities\"]'"
	 * @generated
	 */
	Integer getDot1qAcceptableVLANFramesTypes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpointCapabilities#getDot1qAcceptableVLANFramesTypes <em>Dot1q Acceptable VLAN Frames Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot1q Acceptable VLAN Frames Types</em>' attribute.
	 * @see #getDot1qAcceptableVLANFramesTypes()
	 * @generated
	 */
	void setDot1qAcceptableVLANFramesTypes(Integer value);

	/**
	 * Returns the value of the '<em><b>Dot1q Ingress Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supports the discarding of any frame received on a ProtocolEndpoint whose VLAN classification does not include that ProtocolEndpoint in its Member set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dot1q Ingress Filtering</em>' attribute.
	 * @see #setDot1qIngressFiltering(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointCapabilities_Dot1qIngressFiltering()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|P-BRIDGE-MIB.dot1dPortCapabilities\"]'"
	 * @generated
	 */
	Boolean getDot1qIngressFiltering();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpointCapabilities#getDot1qIngressFiltering <em>Dot1q Ingress Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot1q Ingress Filtering</em>' attribute.
	 * @see #getDot1qIngressFiltering()
	 * @generated
	 */
	void setDot1qIngressFiltering(Boolean value);

	/**
	 * Returns the value of the '<em><b>Supports Trunk Encapsulation Negotiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether or not the protocol endpoint supports negotiation of the trunk encapsulation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Trunk Encapsulation Negotiation</em>' attribute.
	 * @see #setSupportsTrunkEncapsulationNegotiation(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointCapabilities_SupportsTrunkEncapsulationNegotiation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_VLANEndpoint.DesiredEndpointMode\"]'"
	 * @generated
	 */
	Boolean getSupportsTrunkEncapsulationNegotiation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpointCapabilities#getSupportsTrunkEncapsulationNegotiation <em>Supports Trunk Encapsulation Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Trunk Encapsulation Negotiation</em>' attribute.
	 * @see #getSupportsTrunkEncapsulationNegotiation()
	 * @generated
	 */
	void setSupportsTrunkEncapsulationNegotiation(Boolean value);

} // CIM_VLANEndpointCapabilities
