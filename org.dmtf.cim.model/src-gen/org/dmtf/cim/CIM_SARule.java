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
 * A representation of the model object '<em><b>CIM SA Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SARule is a base class for defining IKE and IPsec Rules. Although concrete (because it subclasses from a concrete class), it is not intended to be instantiated. It defines a common connection point for associating conditions and actions for both types of rules. Note that each valid PolicyGroup containing SARules MUST use a unique priority number for the Rule in the aggregation, PolicySetComponent.Priority.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SARule#getLimitNegotiation <em>Limit Negotiation</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SARule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|SARule\"]' keys='SystemCreationClassName,SystemName,CreationClassName,PolicyRuleName'"
 * @generated
 */
@ProviderType
public interface CIM_SARule extends CIM_PolicyRule {
	/**
	 * Returns the value of the '<em><b>Limit Negotiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LimitNegotiation is used as part of processing either a key exchange or IPsec Rule. Before proceeding with either a phase 1 or a phase 2 negotiation, this property is checked to determine if the negotiation role of the Rule matches that defined for the negotiation being undertaken (e.g., Initiator, Responder, or Both). If this check fails, then the negotiation is stopped. Note that this only applies to new negotiations and has no effect on either renegotiation or refresh operations with peers for which an established Security Association already exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limit Negotiation</em>' attribute.
	 * @see #setLimitNegotiation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SARule_LimitNegotiation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Initiator-Only\",\"Responder-Only\",\"Either\"]' MappingStrings='[\"IPSP Policy Model.IETF|SARule.LimitNegotiation\"]'"
	 * @generated
	 */
	Integer getLimitNegotiation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SARule#getLimitNegotiation <em>Limit Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Negotiation</em>' attribute.
	 * @see #getLimitNegotiation()
	 * @generated
	 */
	void setLimitNegotiation(Integer value);

} // CIM_SARule
