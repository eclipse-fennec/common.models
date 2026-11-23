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
 * A representation of the model object '<em><b>CIM Filter Entry In System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All filter entries (FilterEntryBase and its subclasses) are defined in the context of a ComputerSystem/network device, where they are used to identify and act on network traffic. Note that this class is deprecated since its subclassing is not correct. It subclasses from System Component, but a FilterEntryBase is NOT a Component of a System. Instead, it is hosted/scoped by the System. In versions up to CIM 2.6, FilterEntryInSystem was a mandatory, Weak relationship. This is no longer true, beginning with CIM V2.7.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntryInSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_HostedFilterEntryBase\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::Filtering' override.GroupComponent='CIM_ComputerSystem REF' override.GroupComponent.Deprecated='[\"CIM_HostedFilterEntryBase.Antecedent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The ComputerSystem/network device that scopes the FilterEntryBase.' override.PartComponent='CIM_FilterEntryBase REF' override.PartComponent.Deprecated='[\"CIM_HostedFilterEntryBase.Dependent\"]' override.PartComponent.Description='The FilterEntryBase on the System.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_FilterEntryInSystem extends CIM_SystemComponent {
} // CIM_FilterEntryInSystem
