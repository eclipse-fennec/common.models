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
package org.dmtf.prs;

import org.dmtf.cim.CIM_Dependency;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Solution Has Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_SolutionHasElement is an abstract base class for associating PRS_Solution with objects derived from PRS_SolutionElement. This association class allows all PRS_Reference, PRS_Problem and PRS_Resolution objects to be retrieved with a single query.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_SolutionHasElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Aggregation='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Solution REF' override.Antecedent.Aggregate='true' override.Antecedent.Min='1' override.Antecedent.Description='The PRS_Solution root object of the Solution.' override.Dependent='PRS_SolutionElement REF' override.Dependent.Description='The PRS_Reference, PRS_Problem or PRS_Resolution aggregated into the Solution by this association.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_SolutionHasElement extends CIM_Dependency {
} // PRS_SolutionHasElement
