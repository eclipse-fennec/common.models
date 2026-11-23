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
 * A representation of the model object '<em><b>CIM Port Active Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PortActiveConnection relationship indicates that a NetworkPort is using the referenced PhysicalConnector to output to the network. This relationship is important when the port can choose to output from one of several connectors. The connectors can be associated with the NetworkPort in a Realizes relationship, but this is not required. This association provides additional information (for instance,'in use for communication') different than Realizes.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PortActiveConnection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::Ports' override.Antecedent='CIM_PhysicalConnector REF' override.Antecedent.Description='The PhysicalConnector.' override.Dependent='CIM_NetworkPort REF' override.Dependent.Description='The NetworkPort that transmits using the Connector.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PortActiveConnection extends CIM_Dependency {
} // CIM_PortActiveConnection
