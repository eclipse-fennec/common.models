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
 * A representation of the model object '<em><b>CIM Sub Uo WDef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association defines the sub-UnitsOfWork (the sub- transactions) for a particular UnitOfWorkDefinition. For example, an 'AddOrder' UnitOfWork could have sub-Units of 'ValidateCustomer', 'ValidatePartNumber', 'UpdateDatabase', etc. This is a Dependency relationship since the sub-UnitsOf Work are put in context relative to the parent Unit. It is not an aggregation relationship - since (using another example) a 'DatabaseWrite' transaction is likely to be dependent upon a 'DiskWrite', but the two transactions are separate concepts and one is not 'contained' by the other.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SubUoWDef()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Antecedent='CIM_UnitOfWorkDefinition REF' override.Antecedent.Description='The parent UnitOfWorkDefinition.' override.Dependent='CIM_UnitOfWorkDefinition REF' override.Dependent.Description='The sub-UnitOfWorkDefinition.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SubUoWDef extends CIM_Dependency {
} // CIM_SubUoWDef
