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
 * A representation of the model object '<em><b>CIM Docked</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A laptop, a type of Chassis, may be docked in another type of Chassis, a Docking Station. This is the relationship represented by the Docked association. Because this is such a typical relationship, it is explicitly described.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Docked()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Package' MappingStrings='[\"MIF.DMTF|Dynamic States|001.2\"]' override.Antecedent='CIM_Chassis REF' override.Antecedent.Max='1' override.Antecedent.Description='The Docking Station.' override.Dependent='CIM_Chassis REF' override.Dependent.Max='1' override.Dependent.Description='The Laptop that is \'Docked\'.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_Docked extends CIM_Dependency {
} // CIM_Docked
