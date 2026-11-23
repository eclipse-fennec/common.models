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
 * A representation of the model object '<em><b>CIM Filter List In System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FilterLists are defined in the context of a ComputerSystem (e.g., a router, firewall or host). Note that this class is deprecated since its subclassing is not correct. It subclasses from SystemComponent, but a FilterList is NOT a Component of a System. Instead, it is hosted/scoped by the System. In versions up to CIM 2.6, FilterListInSystem was a mandatory, Weak relationship. This is no longer true, beginning with CIM V2.7.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FilterListInSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_HostedFilterList\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::Filtering' override.GroupComponent='CIM_ComputerSystem REF' override.GroupComponent.Deprecated='[\"CIM_HostedFilterList.Antecedent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The ComputerSystem/network device that scopes the FilterList and administers it.' override.PartComponent='CIM_FilterList REF' override.PartComponent.Deprecated='[\"CIM_HostedFilterList.Dependent\"]' override.PartComponent.Description='The FilterList on the System.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_FilterListInSystem extends CIM_SystemComponent {
} // CIM_FilterListInSystem
