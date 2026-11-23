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
 * A representation of the model object '<em><b>CIM Switch Service Transparent Bridging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association linking a SwitchService to a component TransparentBridgingService. The cardinality of the TransparentBridgingService is 0..1 for a VLAN-unaware switch.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchServiceTransparentBridging()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Network::SwitchingBridging' override.GroupComponent='CIM_SwitchService REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Description='The parent SwitchService.' override.PartComponent='CIM_TransparentBridgingService REF' override.PartComponent.Description='The component BridgingService.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchServiceTransparentBridging extends CIM_ServiceComponent {
} // CIM_SwitchServiceTransparentBridging
