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
 * A representation of the model object '<em><b>CIM Logical Element Performs Uo W</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association identifies a specific execution of a UnitOf Work with the specific LogicalElement that is performing/ has performed it. Where the LogicalElementUnitOfWorkDef association describes what an Element can do, this relationship describes what a particular Element is doing or has done.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalElementPerformsUoW()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Antecedent='CIM_LogicalElement REF' override.Antecedent.Description='The LogicalElement performing the UnitOfWork.' override.Dependent='CIM_UnitOfWork REF' override.Dependent.Description='The UnitOfWork being performed.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalElementPerformsUoW extends CIM_Dependency {
} // CIM_LogicalElementPerformsUoW
