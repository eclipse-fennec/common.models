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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Message instances represent DMTF standard messages that contain identification of the message, dynamic message arguments and the expanded message text. They can be used for returning detailed information from methods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Message#getOwningEntity <em>Owning Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Message#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Message#getContinuedInNextMessage <em>Continued In Next Message</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Message#getMessage <em>Message</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Message#getMessageArguments <em>Message Arguments</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Message()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.45.0' Exception='true' UMLPackagePath='CIM::Interop' ModelCorrespondence='[\"CIM_Error\"]'"
 * @generated
 */
@ProviderType
public interface CIM_Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that uniquely identifies the entity that owns the definition of the message. OwningEntity shall include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Entity</em>' attribute.
	 * @see #setOwningEntity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Message_OwningEntity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_Message.MessageID\"]'"
	 * @generated
	 */
	String getOwningEntity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Message#getOwningEntity <em>Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Entity</em>' attribute.
	 * @see #getOwningEntity()
	 * @generated
	 */
	void setOwningEntity(String value);

	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An opaque string that uniquely identifies, within the scope of the OwningEntity, the format of the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message ID</em>' attribute.
	 * @see #setMessageID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Message_MessageID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_Message.OwningEntity\"]'"
	 * @generated
	 */
	String getMessageID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Message#getMessageID <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' attribute.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(String value);

	/**
	 * Returns the value of the '<em><b>Continued In Next Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indicator that allows combining multiple messages into one logical message. The messages being combined need to be consecutive messages in an ordered sequence of messages (e.g. an indexed array of embedded instances of CIM_Message).
	 * A value of True indicates that the logical message continues with the next message after this message.
	 * A value of False or Null indicates that the logical message ends at this message.
	 * For instances of CIM_Message that are not part of an ordered sequence of messages, this property is meaningless and shall be Null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continued In Next Message</em>' attribute.
	 * @see #setContinuedInNextMessage(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Message_ContinuedInNextMessage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getContinuedInNextMessage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Message#getContinuedInNextMessage <em>Continued In Next Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continued In Next Message</em>' attribute.
	 * @see #getContinuedInNextMessage()
	 * @generated
	 */
	void setContinuedInNextMessage(Boolean value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message text, with all dynamic elements expanded.
	 * The property value shall constructed by combining all static and dynamic message elements defined in the message definition in the order defined, using the values specified in the MessageArguments array property for the dynamic elements, in the order of the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Message_Message()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_Message.MessageArguments\"]'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Message#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Message Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array containing the values of the dynamic elements of the message, in the order in which the dynamic elements are defined in the message definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Arguments</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Message_MessageArguments()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Message.Message\"]'"
	 * @generated
	 */
	EList<String> getMessageArguments();

} // CIM_Message
