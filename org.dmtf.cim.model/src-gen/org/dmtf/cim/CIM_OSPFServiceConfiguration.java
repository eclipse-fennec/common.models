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
 * A representation of the model object '<em><b>CIM OSPF Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OSPFServiceConfiguration connects an OSPF service to its area configurations. The configurations are defined for the OSPF Service, and so do not make sense as stand alone objects. This is the reason for the Min (1), Max (1) cardinalities on OSPFService. They mandate the instantiation of the service and of this association for the referenced instance of OSPFAreaConfiguration. The area configuration acts as a focal point to bring together the router (indicated as a ComputerSystem with an instance of OSPFService, associated to the AreaConfiguration using this relationship), the area (indicated as an OSPFArea, associated to the AreaConfiguration using AreaOfConfiguration) and the address ranges for advertising (indicated as instances of RangeOfIPAddresses, associated to the AreaConfiguration using RangesOfConfiguration). There would be an instance of OSPFAreaConfiguration for each connected area of a router/OSPFService.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OSPFServiceConfiguration()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::OSPF' override.Antecedent='CIM_OSPFService REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The OSPF service.' override.Dependent='CIM_OSPFAreaConfiguration REF' override.Dependent.Description='The area configuration.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_OSPFServiceConfiguration extends CIM_Dependency {
} // CIM_OSPFServiceConfiguration
