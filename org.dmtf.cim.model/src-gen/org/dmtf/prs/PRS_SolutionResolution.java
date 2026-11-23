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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Solution Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_SolutionResolution aggregates a Resolution into a Solution.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_SolutionResolution()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Solution REF' override.Antecedent.Aggregate='true' override.Antecedent.Min='1' override.Antecedent.Description='The PRS_Solution root object of the Solution.' override.Dependent='PRS_Resolution REF' override.Dependent.Description='The PRS_Solution aggregated into the Solution.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_SolutionResolution extends PRS_SolutionHasElement {
} // PRS_SolutionResolution
