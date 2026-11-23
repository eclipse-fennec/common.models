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
 * A representation of the model object '<em><b>CIM VLAN Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An endpoint on a switch or endstation which is assigned to a given VLAN or accepts traffic from one or more VLANs. As defined by the property, OperationalEndpointMode, the endpoint may be configured as trunking or nontrunking. Note that an endpoint may dynamically be converted to/from a trunking mode. When this occurs, simply update the OperationalEndpointMode property. This class is associated with a DataLink or IPProtocol Endpoint - as another aspect of that endpoint - using the LogicalIdentity relationship. In this case, the VLANEndpoint takes the role of SameElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpoint#getDesiredEndpointMode <em>Desired Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpoint#getOtherEndpointMode <em>Other Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpoint#getOperationalEndpointMode <em>Operational Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpoint#getDesiredVLANTrunkEncapsulation <em>Desired VLAN Trunk Encapsulation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpoint#getOtherTrunkEncapsulation <em>Other Trunk Encapsulation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpoint#getOperationalVLANTrunkEncapsulation <em>Operational VLAN Trunk Encapsulation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpoint#getGVRPStatus <em>GVRP Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.26.0' UMLPackagePath='CIM::Network::VLAN' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VLANEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Desired Endpoint Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The desired VLAN mode that is requested for use. (Note that the current mode is given by the OperationalEndpointMode property.) The following values are defined: 
	 * - Access: Puts the endpoint/switch port into permanent nontrunking mode and negotiates to convert the link into a nontrunk link. The endpoint becomes a nontrunk interface. 
	 * - Dynamic Auto: Makes the endpoint able to convert the link to a trunk link. The endpoint becomes a trunk interface if the neighboring interface is set to trunk or desirable mode. 
	 * - Dynamic Desirable: Makes the endpoint actively attempt to convert the link to a trunk link. The endpoint becomes a trunk interface if the neighboring interface is set to trunk, desirable, or auto mode. The default switch-port mode for all Ethernet interfaces is 'dynamic desirable.' 
	 * - Trunk: Puts the endpoint into permanent trunking mode and negotiates to convert the link into a trunk link. The endpoint becomes a trunk interface even if the neighboring interface is not a trunk interface. 
	 * - Dot1Q Tunnel: Configures the interface as a tunnel (nontrunking) endpoint/port to be connected in an asymmetric link with an 802.1Q trunk port. 802.1Q tunneling is used to maintain customer VLAN integrity across a service provider network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desired Endpoint Mode</em>' attribute.
	 * @see #setDesiredEndpointMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpoint_DesiredEndpointMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..32767\",\"..\"]' Values='[\"DMTF Reserved\",\"Other\",\"Access\",\"Dynamic Auto\",\"Dynamic Desirable\",\"Trunk\",\"Dot1Q Tunnel\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_VLANEndpoint.OperationalEndpointMode\",\"CIM_VLANEndpoint.OtherEndpointMode\"]'"
	 * @generated
	 */
	Integer getDesiredEndpointMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpoint#getDesiredEndpointMode <em>Desired Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Endpoint Mode</em>' attribute.
	 * @see #getDesiredEndpointMode()
	 * @generated
	 */
	void setDesiredEndpointMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Endpoint Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of VLAN endpoint model that is supported by this VLANEndpoint, when the value of the mode property is set to 1 (i.e., "Other"). This property should be set to NULL when the mode property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Endpoint Mode</em>' attribute.
	 * @see #setOtherEndpointMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpoint_OtherEndpointMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_VLANEndpoint.DesiredEndpointMode\",\"CIM_VLANEndpoint.OperationalEndpointMode\"]'"
	 * @generated
	 */
	String getOtherEndpointMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpoint#getOtherEndpointMode <em>Other Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Endpoint Mode</em>' attribute.
	 * @see #getOtherEndpointMode()
	 * @generated
	 */
	void setOtherEndpointMode(String value);

	/**
	 * Returns the value of the '<em><b>Operational Endpoint Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The configuration mode for the VLAN endpoint. The following values are defined: /n - Unknown: If the endpoint is not VLAN aware. /n - Access: Puts the endpoint into permanent nontrunking mode and negotiates to convert the link into a nontrunk link. The endpoint becomes a nontrunk interface. 
	 * - Dynamic Auto: Makes the endpoint able to convert the link to a trunk link. The endpoint becomes a trunk interface if the neighboring interface is set to trunk or desirable mode. 
	 * - Dynamic Desirable: Makes the endpoint actively attempt to convert the link to a trunk link. The endpoint becomes a trunk interface if the neighboring interface is set to trunk, desirable, or auto mode. The default switch-port mode for all Ethernet interfaces is 'dynamic desirable.' 
	 * - Trunk: Puts the endpoint into permanent trunking mode and negotiates to convert the link into a trunk link. The endpoint becomes a trunk interface even if the neighboring interface is not a trunk interface. 
	 * - Dot1Q Tunnel: Configures the interface as a tunnel (nontrunking) endpoint/port to be connected in an asymmetric link with an 802.1Q trunk port. 802.1Q tunneling is used to maintain customer VLAN integrity across a service provider network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operational Endpoint Mode</em>' attribute.
	 * @see #setOperationalEndpointMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpoint_OperationalEndpointMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..32767\",\"..\"]' Values='[\"DMTF Reserved\",\"Other\",\"Access\",\"Dynamic Auto\",\"Dynamic Desirable\",\"Trunk\",\"Dot1Q Tunnel\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_VLANEndpoint.DesiredEndpointMode\",\"CIM_VLANEndpoint.OtherEndpointMode\"]'"
	 * @generated
	 */
	Integer getOperationalEndpointMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpoint#getOperationalEndpointMode <em>Operational Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Endpoint Mode</em>' attribute.
	 * @see #getOperationalEndpointMode()
	 * @generated
	 */
	void setOperationalEndpointMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Desired VLAN Trunk Encapsulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of VLAN encapsulation that is requested for use. (Note that the encapsulation currently in use is given by the OperationalVLANTrunkEncapsulation property.) Note that this property is only applicable when the endpoint is operating in a trunking mode (see the OperationalEndpointMode property for additional details). This property is either 'not applicable' (i.e., the endpoint will never be placed in a trunking mode), a particular type (802.1q or Cisco ISL), or 'negotiate' (i.e., the result of the negotiation between this interface and its neighbor). The value, 'Negotiate' is not allowed if the endpoint does not support negotiation. This capability is hardware and vendor dependent. Refer to the associated VLANEndpointCapabilities.doesTrunkEncapsulationNegotiation property to validate whether a particular endpoint (port) supports encapsulation negotiation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desired VLAN Trunk Encapsulation</em>' attribute.
	 * @see #setDesiredVLANTrunkEncapsulation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpoint_DesiredVLANTrunkEncapsulation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..32767\",\"32768..\"]' Values='[\"DMTF Reserved\",\"Other\",\"Not Applicable\",\"802.1q\",\"Cisco ISL\",\"Negotiate\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_VLANEndpoint.OperationalVLANTrunkEncapsulation\",\"CIM_VLANEndpoint.OtherTrunkEncapsulation\"]'"
	 * @generated
	 */
	Integer getDesiredVLANTrunkEncapsulation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpoint#getDesiredVLANTrunkEncapsulation <em>Desired VLAN Trunk Encapsulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired VLAN Trunk Encapsulation</em>' attribute.
	 * @see #getDesiredVLANTrunkEncapsulation()
	 * @generated
	 */
	void setDesiredVLANTrunkEncapsulation(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Trunk Encapsulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of VLAN encapsulation that is supported by this VLANEndpoint, when the value of the encapsulation property is set to 1 (i.e., "Other"). This property should be set to NULL when the desired encapsulation property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Trunk Encapsulation</em>' attribute.
	 * @see #setOtherTrunkEncapsulation(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpoint_OtherTrunkEncapsulation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_VLANEndpoint.DesiredVLANTrunkEncapsulation\",\"CIM_VLANEndpoint.OperationalVLANTrunkEncapsulation\"]'"
	 * @generated
	 */
	String getOtherTrunkEncapsulation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpoint#getOtherTrunkEncapsulation <em>Other Trunk Encapsulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Trunk Encapsulation</em>' attribute.
	 * @see #getOtherTrunkEncapsulation()
	 * @generated
	 */
	void setOtherTrunkEncapsulation(String value);

	/**
	 * Returns the value of the '<em><b>Operational VLAN Trunk Encapsulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of VLAN encapsulation in use on a trunk endpoint/port. This property is either 'not applicable' (i.e., the endpoint is not operating in trunking mode), a particular type (802.1q or Cisco ISL), 'negotiating' (i.e., the endpoints are negotiating the encapsulation type). Note that this property is only applicable when the endpoint is operating in a trunking mode (see the OperationalEndpointMode property for additional details).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operational VLAN Trunk Encapsulation</em>' attribute.
	 * @see #setOperationalVLANTrunkEncapsulation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpoint_OperationalVLANTrunkEncapsulation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..32767\",\"32768..\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"802.1q\",\"Cisco ISL\",\"Negotiating\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_VLANEndpoint.OtherTrunkEncapsulation\",\"CIM_VLANEndpoint.DesiredVLANTrunkEncapsulation\"]'"
	 * @generated
	 */
	Integer getOperationalVLANTrunkEncapsulation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpoint#getOperationalVLANTrunkEncapsulation <em>Operational VLAN Trunk Encapsulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational VLAN Trunk Encapsulation</em>' attribute.
	 * @see #getOperationalVLANTrunkEncapsulation()
	 * @generated
	 */
	void setOperationalVLANTrunkEncapsulation(Integer value);

	/**
	 * Returns the value of the '<em><b>GVRP Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether GARP VLAN Registration Protocol (GVRP) is enabled or disabled on the trunk endpoint/port. This property is 'not applicable' unless GVRP is supported by the endpoint. This is indicated in the Capabilities property, VLANEndpointCapabilities.Dot1QTagging. This property is applicable only when the endpoint is operating in trunking mode (determined by examining the SwitchEndpointMode property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GVRP Status</em>' attribute.
	 * @see #setGVRPStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpoint_GVRPStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Not Applicable\",\"Enabled\",\"Disabled\"]' ModelCorrespondence='[\"CIM_VLANEndpoint.OperationalEndpointMode\",\"CIM_VLANEndpointCapabilities.Dot1QTagging\"]'"
	 * @generated
	 */
	Integer getGVRPStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpoint#getGVRPStatus <em>GVRP Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GVRP Status</em>' attribute.
	 * @see #getGVRPStatus()
	 * @generated
	 */
	void setGVRPStatus(Integer value);

} // CIM_VLANEndpoint
