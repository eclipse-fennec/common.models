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
 * A representation of the model object '<em><b>CIM Policy Set In Role Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicySetInRoleCollection aggregates zero or more PolicyRules and PolicyGroups (i.e., the subclasses of PolicySet) into a PolicyRoleCollection object, representing a role supported/enforced by the PolicySet.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicySetInRoleCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::Policy' override.Collection='CIM_PolicyRoleCollection REF' override.Collection.Aggregate='true' override.Collection.Description='The PolicyRoleCollection.' override.Member='CIM_PolicySet REF' override.Member.Description='The PolicySet that supports/enforces the PolicyRole for the elements in the PolicyRoleCollection.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_PolicySetInRoleCollection extends CIM_MemberOfCollection {
} // CIM_PolicySetInRoleCollection
