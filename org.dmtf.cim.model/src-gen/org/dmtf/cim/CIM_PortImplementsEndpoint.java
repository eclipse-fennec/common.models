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
 * A representation of the model object '<em><b>CIM Port Implements Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PortImplementsEndpoint associates a LogicalPort with one or more ProtocolEndpoints that are implemented on it. This class specializes the DeviceSAPImplementation association. It indicates that the referenced Endpoint is dependent on the operations of the Port Device.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PortImplementsEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::Ports' override.Antecedent='CIM_LogicalPort REF' override.Antecedent.Description='The LogicalPort that represents the Device behind the ProtocolEndpoint.' override.Dependent='CIM_ProtocolEndpoint REF' override.Dependent.Description='The ProtocolEndpoint that is implemented on the LogicalPort.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PortImplementsEndpoint extends CIM_DeviceSAPImplementation {
} // CIM_PortImplementsEndpoint
