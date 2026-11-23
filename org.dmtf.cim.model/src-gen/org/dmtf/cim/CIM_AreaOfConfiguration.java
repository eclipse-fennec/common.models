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
 * A representation of the model object '<em><b>CIM Area Of Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association connects an area configuration to its area. The OSPFAreaConfiguration class is defined to act as a focal point to bring together the router (indicated as a ComputerSystem with an instance of OSPFService, associated to the AreaConfiguration using OSPFServiceConfiguration), the area (indicated as an OSPFArea, associated to the AreaConfiguration using AreaOfConfiguration) and the address ranges for advertising (indicated as instances of RangeOfIPAddresses, associated to the AreaConfiguration using RangesOfConfiguration). There is an instance of OSPFAreaConfiguration for each connected area of a router/OSPFService.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AreaOfConfiguration()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::OSPF' override.Antecedent='CIM_OSPFArea REF' override.Antecedent.Max='1' override.Antecedent.Description='The OSPF area.' override.Dependent='CIM_OSPFAreaConfiguration REF' override.Dependent.Description='The configuration which is applied to an OSPF area. This is the Dependent reference in this association, since it depends on the area for any functional significance.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AreaOfConfiguration extends CIM_Dependency {
} // CIM_AreaOfConfiguration
