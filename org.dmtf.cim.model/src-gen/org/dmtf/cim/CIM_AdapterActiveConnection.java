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
 * A representation of the model object '<em><b>CIM Adapter Active Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_AdapterActiveConnection class has been deprecated, because NetworkAdapter is deprecated. Instead use the CIM_PortActiveConnection class. 
 * Deprecated description: The AdapterActiveConnection relationship indicates that a NetworkAdapter is using the referenced PhysicalConnector to output to the network. This relationship is important when the Adapter can choose to output from one of several Connectors. The Connectors can be associated with the NetworkAdapter in a Realizes relationship but this is not required. This association provides additional information (such as, 'in use for communication') different from Realizes.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AdapterActiveConnection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PortActiveConnection\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' override.Antecedent='CIM_PhysicalConnector REF' override.Antecedent.Deprecated='[\"CIM_PortActiveConnection.Antecedent\"]' override.Antecedent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The PhysicalConnector.' override.Dependent='CIM_NetworkAdapter REF' override.Dependent.Deprecated='[\"CIM_PortActiveConnection.Dependent\"]' override.Dependent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The NetworkAdapter that transmits using the Connector.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AdapterActiveConnection extends CIM_Dependency {
} // CIM_AdapterActiveConnection
