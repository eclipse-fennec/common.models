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
 * A representation of the model object '<em><b>CIM Logical Element Unit Of Work Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association links a LogicalElement to the UnitsOfWork that it can perform. For example, a Printer Device may have associated UnitOfWorkDefinitions representing PrintJobs. This is a Dependency relationship since the Definitions are given context by the LogicalElement.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalElementUnitOfWorkDef()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Antecedent='CIM_LogicalElement REF' override.Antecedent.Description='The LogicalElement that is providing the UnitOfWork.' override.Dependent='CIM_UnitOfWorkDefinition REF' override.Dependent.Description='The UnitOfWorkDefinition associated with the LogicalElement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalElementUnitOfWorkDef extends CIM_Dependency {
} // CIM_LogicalElementUnitOfWorkDef
