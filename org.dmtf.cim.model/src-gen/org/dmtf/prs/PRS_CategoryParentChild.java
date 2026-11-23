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
 * A representation of the model object '<em><b>PRS Category Parent Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_CategoryParentChild is used to define classification hierarchies.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_CategoryParentChild()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Category REF' override.Antecedent.Description='The parent PRS_Category used for classification.' override.Dependent='PRS_Category REF' override.Dependent.Description='The child PRS_Category used for classification.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_CategoryParentChild extends CIM_HostedDependency {
} // PRS_CategoryParentChild
