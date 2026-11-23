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
 * A representation of the model object '<em><b>CIM BGP Service Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specialization of the Component aggregation. This aggregation defines the set of BGPPathAttributes that are transmitted in per-path UPDATE messages. The association is deprecated since it is incorrectly defined as a Component relationship, and since the properties of BGPPathAttribute are path/endpoint-specific (not defined at the level of the Service).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPServiceAttributes()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::BGP' override.GroupComponent='CIM_BGPService REF' override.GroupComponent.Deprecated='[\"No value\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The BGPService that aggregates BGPPathAttributes as part of its routing information.' override.PartComponent='CIM_BGPPathAttributes REF' override.PartComponent.Deprecated='[\"No value\"]' override.PartComponent.Max='1' override.PartComponent.Description='The BGP attribute, which are part-of the BGP UPDATE message.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_BGPServiceAttributes extends CIM_Component {
} // CIM_BGPServiceAttributes
