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
 * A representation of the model object '<em><b>CIM Policy Rule Validity Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PolicyRuleValidityPeriod aggregation represents scheduled activation and deactivation of a PolicyRule. If a PolicyRule is associated with multiple policy time periods via this association, then the Rule is active if at least one of the time periods indicates that it is active. (In other words, the PolicyTimePeriodConditions are ORed to determine whether the Rule is active.) A Time Period may be aggregated by multiple PolicyRules. A Rule that does not point to a PolicyTimePeriodCondition via this association is, from the point of view of scheduling, always active. It may, however, be inactive for other reasons. For example, the Rule's Enabled property may be set to "disabled" (value=2).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRuleValidityPeriod()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PolicySetValidityPeriod\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_PolicyRule REF' override.GroupComponent.Deprecated='[\"CIM_PolicySetValidityPeriod.GroupComponent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='This property contains the name of a PolicyRule that contains one or more PolicyTimePeriodConditions.' override.PartComponent='CIM_PolicyTimePeriodCondition REF' override.PartComponent.Deprecated='[\"CIM_PolicySetValidityPeriod.PartComponent\"]' override.PartComponent.Description='This property contains the name of a PolicyTimePeriodCondition defining the valid time periods for one or more PolicyRules.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyRuleValidityPeriod extends CIM_PolicyComponent {
} // CIM_PolicyRuleValidityPeriod
