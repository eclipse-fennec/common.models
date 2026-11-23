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
 * A representation of the model object '<em><b>CIM Media Redirection SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MediaRedirectionSAP is a logical representation of a Media redirection session. One access point represents access to a single Media redirection session.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionSAP#getConnectionMode <em>Connection Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionSAP#getCommandTimeout <em>Command Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionSAP#getResetTimeout <em>Reset Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionSAP#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionSAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::MediaRedirection' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_MediaRedirectionSAP extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Connection Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration specifying the type of connection mode supported by the session. A value set to 2 = "Listen" shall indicate that the SAP will listen for a connection request from the remote Media redirection server. A CIM_BindsTo association to a CIM_ProtocolEndpoint may be used to represent where the SAP is listening for the connection request. A value set to 3 = "Connect" shall indicate that the the SAP shall initiate the connection to the remote Media redirection server. A CIM_RemoteAccessAvailableToElement association to a CIM_RemoteServiceAccessPoint may be used to represent where the SAP shall connect to the remote Media redirection server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Mode</em>' attribute.
	 * @see #setConnectionMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionSAP_ConnectionMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Listen\",\"Connect\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Integer getConnectionMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaRedirectionSAP#getConnectionMode <em>Connection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Mode</em>' attribute.
	 * @see #getConnectionMode()
	 * @generated
	 */
	void setConnectionMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Command Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommandTimeout is configurable by management applications supporting Media Redirections. When the Redirection Service redirects a Media device command to a remote device, and the remote device does not respond before CommandTimeout times out, the Redirection Service will emulate a media eject event and re-try the command and/or try to re-establish the connection to the remote device. Commandtimeout shall be expressed using the interval format of the datetime type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Timeout</em>' attribute.
	 * @see #setCommandTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionSAP_CommandTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCommandTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaRedirectionSAP#getCommandTimeout <em>Command Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Timeout</em>' attribute.
	 * @see #getCommandTimeout()
	 * @generated
	 */
	void setCommandTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Reset Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time the session shall wait after sending a Reset to the Remote System before concluding that the Remote System is not responding in a timely fashion, it may be hung or busy. When the Reset Timeout is exceeded the managed system tries to establish a new connection with the Remote System. ResetTimeout shall be expressed using the interval format of the datetime type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reset Timeout</em>' attribute.
	 * @see #setResetTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionSAP_ResetTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getResetTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaRedirectionSAP#getResetTimeout <em>Reset Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Timeout</em>' attribute.
	 * @see #getResetTimeout()
	 * @generated
	 */
	void setResetTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time the session will wait for a Remote System to establish a new connection before the Media Device is detached. SessionTimeout shall be expressed using the interval format of the datetime type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Timeout</em>' attribute.
	 * @see #setSessionTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionSAP_SessionTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getSessionTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaRedirectionSAP#getSessionTimeout <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Timeout</em>' attribute.
	 * @see #getSessionTimeout()
	 * @generated
	 */
	void setSessionTimeout(String value);

} // CIM_MediaRedirectionSAP
