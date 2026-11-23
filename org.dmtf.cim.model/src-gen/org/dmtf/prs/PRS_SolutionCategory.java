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
 * A representation of the model object '<em><b>PRS Solution Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_SolutionCategory associates PRS_Solution with a PRS_Category for classification purposes.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_SolutionCategory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Solution REF' override.Antecedent.Min='1' override.Antecedent.Description='The PRS_Solution being classified.' override.Dependent='PRS_Category REF' override.Dependent.Description='The specific PRS_Category being used to classify the Solution.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_SolutionCategory extends CIM_Dependency {
} // PRS_SolutionCategory
