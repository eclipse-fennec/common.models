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
 * A representation of the model object '<em><b>CIM Peer Of SA Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PeerOfIPsecSAEndpoint identifies the peer of the IPsecSAEndpoint.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PeerOfSAEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' override.Antecedent='CIM_RemoteServiceAccessPoint REF' override.Antecedent.Max='1' override.Antecedent.Description='The peer for the SAEndpoint.' override.Dependent='CIM_IPsecSAEndpoint REF' override.Dependent.Description='The IPsecSAEndpoint which has a peer.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PeerOfSAEndpoint extends CIM_Dependency {
} // CIM_PeerOfSAEndpoint
