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
 * A representation of the model object '<em><b>CIM Trap Source For SNMP Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TrapSourceForSNMPService specifies the protocol endpoint/interface (and hence its IP address) from which traps originate.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TrapSourceForSNMPService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::SNMP' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Max='1' override.Antecedent.Description='The endpoint that acts as the trap source.' override.Dependent='CIM_SNMPService REF' override.Dependent.Description='The SNMP service that sends the notifications.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_TrapSourceForSNMPService extends CIM_ServiceSAPDependency {
} // CIM_TrapSourceForSNMPService
