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
 * A representation of the model object '<em><b>CIM Switchable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A switch port has a LANEndpoint that is exposed via this relationship. The associaiton is deprecated since a binding is not the correct relationship. The SwitchPort is simply another aspect of the LANEndpoint - which is indicated by the EndpointIdentity relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Switchable()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_EndpointIdentity\"]' Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' override.Antecedent='CIM_LANEndpoint REF' override.Antecedent.Deprecated='[\"CIM_EndpointIdentity.SystemElement\"]' override.Antecedent.Max='1' override.Antecedent.Description='The switch port.' override.Dependent='CIM_SwitchPort REF' override.Dependent.Deprecated='[\"CIM_EndpointIdentity.SameElement\"]' override.Dependent.Max='1' override.Dependent.Description='The LAN endpoint.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_Switchable extends CIM_BindsToLANEndpoint {
} // CIM_Switchable
