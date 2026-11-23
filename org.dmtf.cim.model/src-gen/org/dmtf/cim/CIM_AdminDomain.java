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
 * A representation of the model object '<em><b>CIM Admin Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a special grouping of ManagedSystemElements. The grouping is viewed as a single entity, reflecting that all of its components are administered similarly, either by the same user, group of users, or policy. It serves as an aggregation point to associate one or more of the following elements: network devices, such as routers and switches, servers, and other resources that can be accessed by end systems. This grouping of devices plays an essential role in ensuring that the same administrative policy and actions are applied to all of the devices in the grouping. The specific behavior and/or semantics of the AdminDomain can be identified through its aggregated and associated entities.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AdminDomain()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Core::CoreElements' override.NameFormat='string' override.NameFormat.Description='The NameFormat property identifies how the Name of the AdminDomain is generated, using the heuristic specified in the CIM V2 System Model specification. The property assumes that to determine and assign a Name the documented rules are traversed in order. The NameFormat Values list defines the precedence order for assigning the Name of the AdminDomain. \n\n\"FC\" has been deprecated and replaced by \"WWN\" to be consistent with the other ValueMaps.' override.NameFormat.ValueMap='[\"Other\",\"AS\",\"NAP\",\"NOC\",\"POP\",\"RNP\",\"IP\",\"IPX\",\"SNA\",\"Dial\",\"WAN\",\"LAN\",\"ISDN\",\"Frame Relay\",\"ATM\",\"E.164\",\"IB\",\"FC\",\"Policy Repository\",\"WWN\"]' override.NameFormat.Values='[\"Other\",\"Autonomous System\",\"Network Access Provider\",\"Network Operations Center\",\"Point of Presence\",\"Regional Network Provider\",\"IP\",\"IPX\",\"SNA\",\"Dial\",\"WAN\",\"LAN\",\"ISDN\",\"Frame Relay\",\"ATM\",\"E.164\",\"Infiniband\",\"Fibre Channel\",\"Policy Repository\",\"Fibre Channel Worldwide Name\"]' override.NameFormat.ModelCorrespondence='[\"CIM_AdminDomain.Name\"]' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_AdminDomain extends CIM_System {
} // CIM_AdminDomain
