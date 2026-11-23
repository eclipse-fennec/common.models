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
 * A representation of the model object '<em><b>CIM Routing Protocol Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Routing Protocol Domain is a collection of routers which coordinate their routing knowledge using a single [instance of a] routing protocol. This class represents the area/layer/level/zone like property of a routing protocol, such as an OSPF (area), IS-IS (layer) or PNNI (level). It does not represent the entire routing domain in every case. For example for OSPF, it represents an Area, but in the case of RIP, it represents the whole RIP domain. Any common attributes of these routing domains can be placed in this class in future versions of CIM.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RoutingProtocolDomain()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::RoutingForwarding' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_RoutingProtocolDomain extends CIM_AdminDomain {
} // CIM_RoutingProtocolDomain
