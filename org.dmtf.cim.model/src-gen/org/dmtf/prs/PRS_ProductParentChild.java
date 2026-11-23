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
 * A representation of the model object '<em><b>PRS Product Parent Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Products may exist in a hierarchy of relationships with related Products. If a Producer deems these hierarchy relationships are relevant to the current Problem or Resolution, then the position of the Product in a hierarchy can be implied using one of two types of relationships: 'is a' and 'has a'. An 'is a' relationship implies a classification, such as versioning or typing. A 'has a' relationship implies that one product contains another. The PRS_ProductParentChild association is used to imply an 'is a' hierarchy. Use the ProductComponent association to imply 'has a' relationships.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ProductParentChild()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Product REF' override.Antecedent.Aggregate='true' override.Antecedent.Description='The parent PRS_Product.' override.Dependent='PRS_Product REF' override.Dependent.Description='The child PRS_Product.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_ProductParentChild extends CIM_Dependency {
} // PRS_ProductParentChild
