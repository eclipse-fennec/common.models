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
 * A representation of the model object '<em><b>CIM Switch Port Static Forwarding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association links a static database entry and the SwitchPort to which the entry applies.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortStaticForwarding()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::SwitchingBridging' override.Antecedent='CIM_SwitchPort REF' override.Antecedent.Min='1' override.Antecedent.Description='The SwitchPort.' override.Dependent='CIM_StaticForwardingEntry REF' override.Dependent.Description='StaticForwardingEntry of static database.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchPortStaticForwarding extends CIM_Dependency {
} // CIM_SwitchPortStaticForwarding
