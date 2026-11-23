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
 * A representation of the model object '<em><b>CIM Transparent Bridging Dynamic Forwarding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association links an instance of the Transparent BridgingService to the entries of its forwarding database. The forwarding database is weak to the Service.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TransparentBridgingDynamicForwarding()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::SwitchingBridging' override.Antecedent='CIM_TransparentBridgingService REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The transparent bridging service.' override.Dependent='CIM_DynamicForwardingEntry REF' override.Dependent.Weak='true' override.Dependent.Description='Dynamic Forwarding Entry of forwarding database.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_TransparentBridgingDynamicForwarding extends CIM_Dependency {
} // CIM_TransparentBridgingDynamicForwarding
