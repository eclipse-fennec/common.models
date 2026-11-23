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
 * A representation of the model object '<em><b>CIM Switch Service VLAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is deprecated as a fall out of the previous deprecations within the existing model An association linking SwitchService to a component VLANService.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchServiceVLAN()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::Network::VLAN' override.GroupComponent='CIM_SwitchService REF' override.GroupComponent.Deprecated='[\"No value\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The SwitchService containing the VLANService.' override.PartComponent='CIM_VLANService REF' override.PartComponent.Deprecated='[\"No value\"]' override.PartComponent.Description='The VLANService that is a component of the SwitchService.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchServiceVLAN extends CIM_ServiceComponent {
} // CIM_SwitchServiceVLAN
