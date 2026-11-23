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
 * A representation of the model object '<em><b>CIM Started Uo W</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association links a UnitOfWork (which is a 'started' transaction) to its Definition.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StartedUoW()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Antecedent='CIM_UnitOfWorkDefinition REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The Definition object for the UnitOfWork.' override.Dependent='CIM_UnitOfWork REF' override.Dependent.Weak='true' override.Dependent.Description='An instance of a UnitOfWork that has started executing.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_StartedUoW extends CIM_Dependency {
} // CIM_StartedUoW
