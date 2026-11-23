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
 * A representation of the model object '<em><b>PRS Product Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_ProductComponent is used to describe 'has a' relationships between Products and their components parts. See PRS_ProductParentChild for 'is a' relationships.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ProductComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Product REF' override.Antecedent.Aggregate='true' override.Antecedent.Description='The PRS_Product which contains the component.' override.Dependent='PRS_Product REF' override.Dependent.Description='The component PRS_Product.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_ProductComponent extends CIM_Dependency {
} // PRS_ProductComponent
