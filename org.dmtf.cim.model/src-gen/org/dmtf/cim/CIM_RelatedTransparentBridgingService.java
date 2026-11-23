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
 * A representation of the model object '<em><b>CIM Related Transparent Bridging Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is deprecated as a fall out of the previous deprecations within the existing model The association between a VLAN and the forwarding database (some use the term filtering database) used to determine which port a packet should be transmitted on, given that it is assigned to the VLAN and that it has a particular destination MAC address. The TransparentBridgingService represents a forwarding database.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RelatedTransparentBridgingService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.8.0' UMLPackagePath='CIM::Network::VLAN' override.Antecedent='CIM_VLAN REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Description='The VLAN.' override.Dependent='CIM_TransparentBridgingService REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Description='The BridgingService that determines the port, given the the VLAN and addressing information.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RelatedTransparentBridgingService extends CIM_ServiceSAPDependency {
} // CIM_RelatedTransparentBridgingService
