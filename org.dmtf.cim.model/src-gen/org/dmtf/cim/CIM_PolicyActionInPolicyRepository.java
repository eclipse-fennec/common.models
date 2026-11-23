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
 * A representation of the model object '<em><b>CIM Policy Action In Policy Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ReusablePolicy association is a more general relationship that incorporates both Conditions and Actions as well as any other policy subclass. 
 * 
 * This class represents the hosting of reusable PolicyActions by a PolicyRepository. A reusable Policy Action is always related to a single PolicyRepository, via this association. 
 * 
 * Note, that an instance of PolicyAction can be either reusable or rule-specific. When the Action is rule- specific, it shall not be related to any PolicyRepository via the PolicyActionInPolicyRepository association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyActionInPolicyRepository()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ReusablePolicy\"]' Version='2.7.0' UMLPackagePath='CIM::Policy' override.Antecedent='CIM_PolicyRepository REF' override.Antecedent.Deprecated='[\"CIM_ReusablePolicy.Antecedent\"]' override.Antecedent.Max='1' override.Antecedent.Description='This property represents a PolicyRepository hosting one or more PolicyActions. A reusable PolicyAction is always related to exactly one PolicyRepository via the PolicyActionInPolicyRepository association. The [0..1] cardinality for this property covers the two types of PolicyActions: 0 for a rule-specific PolicyAction, 1 for a reusable one.' override.Dependent='CIM_PolicyAction REF' override.Dependent.Deprecated='[\"CIM_ReusablePolicy.Dependent\"]' override.Dependent.Description='This property holds the name of a PolicyAction hosted in the PolicyRepository.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyActionInPolicyRepository extends CIM_PolicyInSystem {
} // CIM_PolicyActionInPolicyRepository
