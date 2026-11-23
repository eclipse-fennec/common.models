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
 * A representation of the model object '<em><b>CIM Peer Gateway For Tunnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PeerGatewayForTunnel identifies an ordered list of security gateways to be used in negotiating and constructing a tunnel. A security gateway is simply a particular instance of RemoteServiceAccessPoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PeerGatewayForTunnel#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PeerGatewayForTunnel()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|PeerGatewayForTunnel\"]' override.Antecedent='CIM_RemoteServiceAccessPoint REF' override.Antecedent.Description='The security gateway for the SA. Note that the absense of this association indicates that: \n- When acting as a responder, IKE will accept phase 1 negotiations with any other security gateway \n- When acting as an initiator, IKE will use the destination IP address (of the IP packets which triggered the SARule) as the IP address of the peer IKE entity.' override.Antecedent.MappingStrings='[\"IPSP Policy Model.IETF|PeerGatewayForTunnel.Antecedent\"]' override.Dependent='CIM_IPsecTunnelAction REF' override.Dependent.Description='The IPsecTunnelAction that requires a security gateway.' override.Dependent.MappingStrings='[\"IPSP Policy Model.IETF|PeerGatewayForTunnel.Dependent\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PeerGatewayForTunnel extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SequenceNumber indicates the ordering to be used when selecting a PeerGateway instance for an IPsecTunnelAction. Lower values are evaluated first.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PeerGatewayForTunnel_SequenceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"IPSP Policy Model.IETF|PeerGatewayForTunnel.SequenceNumber\"]'"
	 * @generated
	 */
	Integer getSequenceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PeerGatewayForTunnel#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(Integer value);

} // CIM_PeerGatewayForTunnel
