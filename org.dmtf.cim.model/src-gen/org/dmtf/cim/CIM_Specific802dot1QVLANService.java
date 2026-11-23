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
 * A representation of the model object '<em><b>CIM Specific802dot1 QVLAN Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is deprecated following discussion as to the need of a modeling a 802.1Q as a service. It was determined that a 802.1Q service was not needed. If a switch supports 802.1Q, an instance of this class should be instantiated in the switch. If the switch supports GVRP, this class represents the function that the switch performs with respect to GVRP.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Specific802dot1QVLANService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"No value\"]' Version='2.8.0' UMLPackagePath='CIM::Network::VLAN' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Specific802dot1QVLANService extends CIM_VLANService {
} // CIM_Specific802dot1QVLANService
