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
 * A representation of the model object '<em><b>CIM VLAN Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is deprecated following discussion as to the need of a modeling a VLAN as a service. It was determined that a VLAN service was not needed. VLANService represents the VLAN aspects of the function performed by a switch. Some VLAN-aware devices participate in protocols where VLAN information is propagated among switches, e.g., GVRP in 802.1Q switches and VTP in Cisco Catalyst switches. VLANService also represents the function performed by the switch as a participant in such a protocol. VLANService must be subclassed so that the type of instance can be distinguished by its class.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VLANService()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"No value\"]' Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Network::VLAN' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VLANService extends CIM_Service {
} // CIM_VLANService
