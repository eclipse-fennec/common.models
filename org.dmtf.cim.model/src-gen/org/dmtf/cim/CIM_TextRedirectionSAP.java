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
 * A representation of the model object '<em><b>CIM Text Redirection SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TextRedirectionSAP describes an access point to start the text redirection. One access point represents access to a single text redirection stream.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TextRedirectionSAP#getSessionTerminateSequence <em>Session Terminate Sequence</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TextRedirectionSAP#getTextFlowType <em>Text Flow Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TextRedirectionSAP#getOtherTextFlowType <em>Other Text Flow Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TextRedirectionSAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.17.0' UMLPackagePath='CIM::Network::ConsoleProtocols' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_TextRedirectionSAP extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Session Terminate Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string sequence that allows the supervisor using the command line session to terminate the redirection stream. This is required because once the text redirection is started then the supervisor may lose the ability to interact with the command line session, and be unable to perform a RequestStateChange operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Terminate Sequence</em>' attribute.
	 * @see #setSessionTerminateSequence(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TextRedirectionSAP_SessionTerminateSequence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSessionTerminateSequence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TextRedirectionSAP#getSessionTerminateSequence <em>Session Terminate Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Terminate Sequence</em>' attribute.
	 * @see #getSessionTerminateSequence()
	 * @generated
	 */
	void setSessionTerminateSequence(String value);

	/**
	 * Returns the value of the '<em><b>Text Flow Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration specifying the type of the text stream supported on this SAP. In some cases this may be a raw character steam, with the characters having no special meaning. However, in other cases it may support a Terminal Mode where some characters have special meanings like backspace, positioning of the character on the screen, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Flow Type</em>' attribute.
	 * @see #setTextFlowType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TextRedirectionSAP_TextFlowType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Character Stream\",\"Terminal Mode\",\"DMTF Reserved\",\"Vendor Specified\"]' ModelCorrespondence='[\"CIM_TextRedirectionSAP.OtherTextFlowType\"]'"
	 * @generated
	 */
	Integer getTextFlowType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TextRedirectionSAP#getTextFlowType <em>Text Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Flow Type</em>' attribute.
	 * @see #getTextFlowType()
	 * @generated
	 */
	void setTextFlowType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Text Flow Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An string describing the TextFlowType when the value of the TextFlowType property is set to 1 = "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Text Flow Type</em>' attribute.
	 * @see #setOtherTextFlowType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TextRedirectionSAP_OtherTextFlowType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_TextRedirectionSAP.TextFlowType\"]'"
	 * @generated
	 */
	String getOtherTextFlowType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TextRedirectionSAP#getOtherTextFlowType <em>Other Text Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Text Flow Type</em>' attribute.
	 * @see #getOtherTextFlowType()
	 * @generated
	 */
	void setOtherTextFlowType(String value);

} // CIM_TextRedirectionSAP
