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
 * A representation of the model object '<em><b>CIM SA Static Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SAStaticAction is the base class for both key exchange as well as IPsec actions that require no negotiation. It is a concrete class that can be aggregated with other subclasses of PolicyAction (such as NetworkPacketAction) into a PolicyRule, to describe how packets are handled throughout the lifetime of the Security Association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SAStaticAction#getLifetimeSeconds <em>Lifetime Seconds</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SAStaticAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|SAStaticAction\"]' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_SAStaticAction extends CIM_SAAction {
	/**
	 * Returns the value of the '<em><b>Lifetime Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LifetimeSeconds specifies how long the SA created from this action should be used/exist. A value of 0 means an infinite lifetime. A non-zero value is typically used in conjunction with alternate SAActions performed when there is a negotiation failure of some sort. 
	 * 
	 * Note: If the referenced SAStaticAction object IS-A PreconfiguredSAAction (that is associated to several SATransforms), then the actual lifetime of the Security Association will be the lesser of the value of this LifetimeSeconds property and of the value of the MaxLifetimeSeconds property of the associated SATransform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifetime Seconds</em>' attribute.
	 * @see #setLifetimeSeconds(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SAStaticAction_LifetimeSeconds()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' MappingStrings='[\"IPSP Policy Model.IETF|SAStaticAction.LifetimeSeconds\"]' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.LifetimeSeconds\"]' PUnit='second'"
	 * @generated
	 */
	Long getLifetimeSeconds();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SAStaticAction#getLifetimeSeconds <em>Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime Seconds</em>' attribute.
	 * @see #getLifetimeSeconds()
	 * @generated
	 */
	void setLifetimeSeconds(Long value);

} // CIM_SAStaticAction
