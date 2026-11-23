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
 * A representation of the model object '<em><b>CIM Endpoint Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_EndpointIdentity indicates that two ProtocolEndpoints represent different aspects of the same underlying address or protocol-specific ID. This association refines the CIM_LogicalIdentity superclass by restricting it to the Endpoint level and defining its use in well understood scenarios. One of these scenarios is to represent that an Endpoint has both 'LAN' and protocol-specific aspects. For example, an Endpoint could be both a LANEndpoint as well as a DHCPEndpoint.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EndpointIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.SystemElement='CIM_ProtocolEndpoint REF' override.SystemElement.Description='SystemElement represents one aspect of the Endpoint.' override.SameElement='CIM_ProtocolEndpoint REF' override.SameElement.Description='SameElement represents an alternate aspect of the Endpoint.' keys='SystemElement,SameElement'"
 * @generated
 */
@ProviderType
public interface CIM_EndpointIdentity extends CIM_LogicalIdentity {
} // CIM_EndpointIdentity
