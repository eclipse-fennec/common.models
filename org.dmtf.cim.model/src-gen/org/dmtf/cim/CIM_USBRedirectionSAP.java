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
 * A representation of the model object '<em><b>CIM USB Redirection SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * USBRedirectionSAP is a logical representation of a USB redirection session. One access point represents access to a single USB redirection session.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionSAP#getConnectionMode <em>Connection Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionSAP#getResetTimeout <em>Reset Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionSAP#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionSAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::USBRedirection' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_USBRedirectionSAP extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Connection Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration specifying the type of connection mode supported by the session. A value set to 2 = "Listen" shall indicate that the SAP will listen for a connection request from the remote USB redirection server. A CIM_BindsTo association to a CIM_ProtocolEndpoint may be used to represent where the SAP is listening for the connection request. A value set to 3 = "Connect" shall indicate that the the SAP shall initiate the connection to the remote USB redirection server. A CIM_RemoteAccessAvailableToElement association to a CIM_RemoteServiceAccessPoint may be used to represent where the SAP shall connect to the remote USB redirection server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Mode</em>' attribute.
	 * @see #setConnectionMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionSAP_ConnectionMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Listen\",\"Connect\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Integer getConnectionMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBRedirectionSAP#getConnectionMode <em>Connection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Mode</em>' attribute.
	 * @see #getConnectionMode()
	 * @generated
	 */
	void setConnectionMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Reset Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time the session shall wait after sending a Reset to the Remote System before concluding that the Remote System is not responding in a timely fashion, it may be hung or busy. When the Reset Timeout is exceeded the managed system tries to establish a new connection with the Remote System. This property uses the interval format of the datetime type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reset Timeout</em>' attribute.
	 * @see #setResetTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionSAP_ResetTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getResetTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBRedirectionSAP#getResetTimeout <em>Reset Timeout</em>}' attribute.
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
	 * The amount of time the session will wait for a Remote System to establish a new connection before the USB Device is detached. This property uses the interval format of the datetime type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Timeout</em>' attribute.
	 * @see #setSessionTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionSAP_SessionTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getSessionTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBRedirectionSAP#getSessionTimeout <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Timeout</em>' attribute.
	 * @see #getSessionTimeout()
	 * @generated
	 */
	void setSessionTimeout(String value);

} // CIM_USBRedirectionSAP
