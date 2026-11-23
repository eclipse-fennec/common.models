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
 * A representation of the model object '<em><b>PRS Categorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Categorization associates PRS_Reference, PRS_Problem or PRS_Resolution with a PRS_Category for classification purposes. For example, a Category named 'Printing Issues' can be defined for a Problem using the Categorization association between a PRS_Problem and a PRS_Category.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Categorization()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Category REF' override.Antecedent.Description='The PRS_Category used for classification.' override.Dependent='PRS_SolutionElement REF' override.Dependent.Min='1' override.Dependent.Description='The specific PRS_Reference, PRS_Problem or PRS_Resolution classified by this association.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_Categorization extends CIM_Dependency {
} // PRS_Categorization
