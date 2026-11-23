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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Formatted Indication Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of IndicationSubscription that defines the text formatting of Indication information. The TextFormatOwningEntity, TextFormatID, TextFormat, and TextFormatParameters properties are used to describe a human-readable representation of the Indication as defined by the referenced CIM_IndicationFilter. This representation MAY be used by the CIM_ListenerDestination when the intended consumer of the Indication is human. For example, this format could be used when writing the Indication to a system log or sending an e-mail notification to a system administrator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FormattedIndicationSubscription#getTextFormatOwningEntity <em>Text Format Owning Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FormattedIndicationSubscription#getTextFormatID <em>Text Format ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FormattedIndicationSubscription#getTextFormat <em>Text Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FormattedIndicationSubscription#getTextFormatParameters <em>Text Format Parameters</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FormattedIndicationSubscription()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Event' keys='Filter,Handler'"
 * @generated
 */
@ProviderType
public interface CIM_FormattedIndicationSubscription extends CIM_IndicationSubscription {
	/**
	 * Returns the value of the '<em><b>Text Format Owning Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TextFormatOwningEntity is a string that uniquely identifies the entity that owns the definition of the human-readable format described in this instance. OwningEntity MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Format Owning Entity</em>' attribute.
	 * @see #setTextFormatOwningEntity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FormattedIndicationSubscription_TextFormatOwningEntity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FormattedIndicationSubscription.TextFormatID\",\"CIM_FormattedIndicationSubscription.TextFormat\",\"CIM_FormattedIndicationSubscription.TextFormatParameters\"]'"
	 * @generated
	 */
	String getTextFormatOwningEntity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FormattedIndicationSubscription#getTextFormatOwningEntity <em>Text Format Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Format Owning Entity</em>' attribute.
	 * @see #getTextFormatOwningEntity()
	 * @generated
	 */
	void setTextFormatOwningEntity(String value);

	/**
	 * Returns the value of the '<em><b>Text Format ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An opaque string that uniquely identifies, within the scope of the TextFormatOwningEntity, a human-readable format for representing the Indications described by this Subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Format ID</em>' attribute.
	 * @see #setTextFormatID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FormattedIndicationSubscription_TextFormatID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FormattedIndicationSubscription.TextFormatOwningEntity\",\"CIM_FormattedIndicationSubscription.TextFormat\",\"CIM_FormattedIndicationSubscription.TextFormatParameters\"]'"
	 * @generated
	 */
	String getTextFormatID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FormattedIndicationSubscription#getTextFormatID <em>Text Format ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Format ID</em>' attribute.
	 * @see #getTextFormatID()
	 * @generated
	 */
	void setTextFormatID(String value);

	/**
	 * Returns the value of the '<em><b>Text Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the human-readable format for representing the Indications described by this Subscription. The actual text is constructed by applying the dynamic content, defined in the Indication, to the string specified in this property. /n /n The dynamic content is specified by embedding the following syntax in the appropriate places in the format string: 
	 * "{" <index>["["[<index>]"]"],<type>"}" 
	 * - the first occurrence of <index> defines the element of TextFormatParameters that contains the name of the Indication property to be used to populate the text message.
	 * - if the Indication property defined by the first <index> is an array property, then the first index MUST be followed by either empty brackets (i.e., []) or an index value enclosed in brackets (e.g., [1]). If empty brackets are specified (e.g., {4[], string}), then the dynamic content of the text message is populated with a list of the array elements. If an index is specified (e.g., {4[1], string}, then only the specified array element is used to populate the message. If the value of the dynamic content is not defined in the Indication, then the string "UNKNOWN" is used to populate the text message.
	 * - <type> defines the type of the dynamic content. Valid values for <type> are: 'boolean', 'string', 'char16', 'uint8', 'sint8', 'uint16', 'sint16', 'uint32', 'sint32', 'uint64', 'sint64', 'datetime', 'real32', 'real64' or 'ref'. 
	 * 
	 * The string encoding for the dynamic content MUST conform to the MOF Syntax Grammar described in the CIM Infrastructure Specification. The string encoding for a list of array elements MUST conform to the definition of the arrayInitializer element.
	 * As an example, a format string for a UPS AlertIndication could be defined as follows: "A {4,string} UPS Alert of type {5,uint16} was detected on the device {6,string} on the system {2,string} at {1,datetime}. The following actions have been recommended to resolve the alert: {3[],string}".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Format</em>' attribute.
	 * @see #setTextFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FormattedIndicationSubscription_TextFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getTextFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FormattedIndicationSubscription#getTextFormat <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Format</em>' attribute.
	 * @see #getTextFormat()
	 * @generated
	 */
	void setTextFormat(String value);

	/**
	 * Returns the value of the '<em><b>Text Format Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indexed array containing the names of properties defined in the select clause of the associated CIM_IndicationFilter Query. The values of these Indication properties are used to populate the dynamic content of the text message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Format Parameters</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FormattedIndicationSubscription_TextFormatParameters()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FormattedIndicationSubscription.TextFormatOwningEntity\",\"CIM_FormattedIndicationSubscription.TextFormatID\",\"CIM_FormattedIndicationSubscription.TextFormat\"]'"
	 * @generated
	 */
	EList<String> getTextFormatParameters();

} // CIM_FormattedIndicationSubscription
