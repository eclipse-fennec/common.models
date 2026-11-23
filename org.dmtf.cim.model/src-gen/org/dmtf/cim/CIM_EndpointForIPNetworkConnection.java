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
 * A representation of the model object '<em><b>CIM Endpoint For IP Network Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_EndpointForIPNetworkConnection associates the instance of CIM_IPNetworkConnection with the communication endpoint ( Eg "CIM_LANEndpoint". )
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EndpointForIPNetworkConnection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.32.0' UMLPackagePath='CIM::Network::IP' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Key='true' override.Antecedent.Description='The Protocol Endpoint for the network connection.' override.Dependent='CIM_IPNetworkConnection REF' override.Dependent.Key='true' override.Dependent.Description='The instance representing the IP network connection.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_EndpointForIPNetworkConnection extends CIM_SAPSAPDependency {
} // CIM_EndpointForIPNetworkConnection
