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
 * A representation of the model object '<em><b>CIM Peer Gateway For Preconfigured Tunnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PeerGatewayForPreconfiguredTunnel identifies at most one security gateway be used in constructing a preconfigured tunnel. A security gateway is simply a particular instance of RemoteServiceAccessPoint.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PeerGatewayForPreconfiguredTunnel()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|PeerGatewayForPreconfiguredTunnel\"]' override.Antecedent='CIM_RemoteServiceAccessPoint REF' override.Antecedent.Max='1' override.Antecedent.Description='Security gateway for the preconfigured SA.' override.Antecedent.MappingStrings='[\"IPSP Policy Model.IETF|PeerGatewayForPreconfiguredTunnel.Antecedent\"]' override.Dependent='CIM_PreconfiguredTunnelAction REF' override.Dependent.Description='The PreconfiguredTunnelAction that requires a security gateway.' override.Dependent.MappingStrings='[\"IPSP Policy Model.IETF|PeerGatewayForPreconfiguredTunnel.Dependent\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PeerGatewayForPreconfiguredTunnel extends CIM_Dependency {
} // CIM_PeerGatewayForPreconfiguredTunnel
