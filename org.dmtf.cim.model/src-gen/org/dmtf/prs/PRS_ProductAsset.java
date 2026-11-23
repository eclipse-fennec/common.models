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
 * A representation of the model object '<em><b>PRS Product Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_ProductAsset is used to provide specific information about a PRS_Product. PRS_ProductAsset associates this information to a PRS_Product using one or more Statements associated to a PRS_Expression.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ProductAsset()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Product REF' override.Antecedent.Description='The product.' override.Dependent='PRS_Expression REF' override.Dependent.Description='The expression.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_ProductAsset extends CIM_Dependency {
} // PRS_ProductAsset
