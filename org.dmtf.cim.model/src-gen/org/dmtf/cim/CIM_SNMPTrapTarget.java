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
 * A representation of the model object '<em><b>CIM SNMP Trap Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SNMPTrapTarget contains information describing a remote system, to which Informs and Traps are sent. An SNMPService is related via a ServiceSAPDependency association to one or more instances of this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapTarget#getNotificationMessage <em>Notification Message</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapTarget#getSNMPVersion <em>SNMP Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapTarget#getCommunityString <em>Community String</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapTarget()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SNMP' override.AccessInfo='string' override.AccessInfo.Description='The host address.' override.PortProtocol='uint16' override.PortProtocol.Description='A UDP port to which the traps/informs are sent.' override.PortInfo='string' override.PortInfo.Description='The UDP port number to which the traps/informs are sent. The default is port 162.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SNMPTrapTarget extends CIM_RemotePort {
	/**
	 * Returns the value of the '<em><b>Notification Message</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the selection of the notification message - Traps or Informs. By default, Traps are selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notification Message</em>' attribute.
	 * @see #setNotificationMessage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapTarget_NotificationMessage()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"Traps\",\"Informs\"]'"
	 * @generated
	 */
	Integer getNotificationMessage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPTrapTarget#getNotificationMessage <em>Notification Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Message</em>' attribute.
	 * @see #getNotificationMessage()
	 * @generated
	 */
	void setNotificationMessage(Integer value);

	/**
	 * Returns the value of the '<em><b>SNMP Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SNMP version used to send the traps or informs. Note that v1 does not support informs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SNMP Version</em>' attribute.
	 * @see #setSNMPVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapTarget_SNMPVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"v1\",\"v2C\",\"v3\"]'"
	 * @generated
	 */
	Integer getSNMPVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPTrapTarget#getSNMPVersion <em>SNMP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SNMP Version</em>' attribute.
	 * @see #getSNMPVersion()
	 * @generated
	 */
	void setSNMPVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Community String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A community string/password to send with the trap operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Community String</em>' attribute.
	 * @see #setCommunityString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapTarget_CommunityString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCommunityString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPTrapTarget#getCommunityString <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Community String</em>' attribute.
	 * @see #getCommunityString()
	 * @generated
	 */
	void setCommunityString(String value);

} // CIM_SNMPTrapTarget
