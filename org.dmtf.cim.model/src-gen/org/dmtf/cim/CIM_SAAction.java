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
 * A representation of the model object '<em><b>CIM SA Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SAAction is the base class for the various types of key exchange or IPsec actions. It is abstract and used to categorize the different types of actions of SARules.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SAAction#getDoPacketLogging <em>Do Packet Logging</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SAAction()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|SAAction\"]' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_SAAction extends CIM_PolicyAction {
	/**
	 * Returns the value of the '<em><b>Do Packet Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DoPacketLogging causes a log message to be generated when the action is applied to a packet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Packet Logging</em>' attribute.
	 * @see #setDoPacketLogging(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SAAction_DoPacketLogging()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"IPSP Policy Model.IETF|SAAction.DoPacketLogging\"]' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.PacketLoggingActive\"]'"
	 * @generated
	 */
	Boolean getDoPacketLogging();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SAAction#getDoPacketLogging <em>Do Packet Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Packet Logging</em>' attribute.
	 * @see #getDoPacketLogging()
	 * @generated
	 */
	void setDoPacketLogging(Boolean value);

} // CIM_SAAction
