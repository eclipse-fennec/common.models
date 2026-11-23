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

import org.dmtf.cim.CIM_HostedDependency;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Expression Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates a PRS_Expression with PRS_ExpressionElements such as PRS_Expression, PRS_Product, and PRS_Statement.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ExpressionLink()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Expression REF' override.Antecedent.Aggregate='true' override.Antecedent.Min='1' override.Antecedent.Description='The parent PRS_Expression.' override.Dependent='PRS_ExpressionElement REF' override.Dependent.Min='1' override.Dependent.Description='The child PRS_ExpressionElement, either a PRS_Expression, PRS_Product or PRS_Statement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_ExpressionLink extends CIM_HostedDependency {
} // PRS_ExpressionLink
