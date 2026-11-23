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
 * A representation of the model object '<em><b>CIM Network Packet Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NetworkPacketAction standardizes different processing options that can be taken at the network packet level. The specific action is defined in the PacketAction enumerated property. Note that this property can be used in conjunction with other actions aggregated into a Rule, to fully define its effects. For example, when aggregated with the SAStaticAction class, NetworkPacketAction indicates whether a specific packet will be encrypted, bypassed or discarded for the lifetime of the Security Association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPacketAction#getPacketAction <em>Packet Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPacketAction#getOtherAction <em>Other Action</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPacketAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPacketAction extends CIM_PolicyAction {
	/**
	 * Returns the value of the '<em><b>Packet Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A network packet can be processed, bypassed for processing (i.e., allowed to continue without further processing, such as being forwarded in the clear versus being encrypted), or discarded. This enumeration indicates how a packet should be handled if a PolicyRule's PolicyConditions evaluate to TRUE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packet Action</em>' attribute.
	 * @see #setPacketAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPacketAction_PacketAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Processed\",\"Bypassed\",\"Discarded\"]' MappingStrings='[\"IPSP Policy Model.IETF|IPsecBypassAction\",\"IPSP Policy Model.IETF|IPsecDiscardAction\"]' ModelCorrespondence='[\"CIM_NetworkPacketAction.OtherAction\"]'"
	 * @generated
	 */
	Integer getPacketAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPacketAction#getPacketAction <em>Packet Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Action</em>' attribute.
	 * @see #getPacketAction()
	 * @generated
	 */
	void setPacketAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the action when the value 1 ("Other") is specified for the property, PacketAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Action</em>' attribute.
	 * @see #setOtherAction(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPacketAction_OtherAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_NetworkPacketAction.PacketAction\"]'"
	 * @generated
	 */
	String getOtherAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPacketAction#getOtherAction <em>Other Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Action</em>' attribute.
	 * @see #getOtherAction()
	 * @generated
	 */
	void setOtherAction(String value);

} // CIM_NetworkPacketAction
