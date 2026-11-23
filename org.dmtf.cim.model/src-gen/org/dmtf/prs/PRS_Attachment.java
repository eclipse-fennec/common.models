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
package org.dmtf.prs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Attachment describes file attachments. A PRS_Attachment may be associated to any object derived from PRS_ExchangeElement. PRS_Attachment is used to attach objects of any type including binary files, ASCII documents, or URLs. Only one object may be attached per PRS_Attachment. 
 * 
 * The actual attachment carried by the Attachment object is included by one of two methods: by reference or by value as embedded data. A 'by reference' approach links indirectly to the attachment through the use of a string identifier, e.g. a file name. An 'embedded data' approach means the actual binary data is included in PRS_Attachment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Attachment#getAttachmentReference <em>Attachment Reference</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Attachment#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Attachment#getFormat <em>Format</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Attachment#getAttachmentSize <em>Attachment Size</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Attachment#getAttachmentObject <em>Attachment Object</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Attachment#getAttachmentType <em>Attachment Type</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Attachment#getAttachmentName <em>Attachment Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Attachment()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Attachment extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Attachment Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the attachment is not embedded, where the attachment is located.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment Reference</em>' attribute.
	 * @see #setAttachmentReference(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Attachment_AttachmentReference()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAttachmentReference();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Attachment#getAttachmentReference <em>Attachment Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment Reference</em>' attribute.
	 * @see #getAttachmentReference()
	 * @generated
	 */
	void setAttachmentReference(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Protocol required to read the attachment (e.g., http).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Attachment_Protocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Attachment#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The file format of the attachment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Attachment_Format()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Attachment#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Attachment Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the attachment in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment Size</em>' attribute.
	 * @see #setAttachmentSize(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Attachment_AttachmentSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAttachmentSize();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Attachment#getAttachmentSize <em>Attachment Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment Size</em>' attribute.
	 * @see #getAttachmentSize()
	 * @generated
	 */
	void setAttachmentSize(String value);

	/**
	 * Returns the value of the '<em><b>Attachment Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attachment itself, if embedded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment Object</em>' attribute.
	 * @see #setAttachmentObject(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Attachment_AttachmentObject()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAttachmentObject();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Attachment#getAttachmentObject <em>Attachment Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment Object</em>' attribute.
	 * @see #getAttachmentObject()
	 * @generated
	 */
	void setAttachmentObject(String value);

	/**
	 * Returns the value of the '<em><b>Attachment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose of the attachment, as related to the diagnosis. 'Instructions' are compilable code. 'Background' is descriptive information. 'Log' is information captured in a log file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment Type</em>' attribute.
	 * @see #setAttachmentType(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Attachment_AttachmentType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"254\",\"255\"]' Values='[\"Instructions\",\"Background\",\"Log\",\"Unknown\",\"Undefined\"]'"
	 * @generated
	 */
	Integer getAttachmentType();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Attachment#getAttachmentType <em>Attachment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment Type</em>' attribute.
	 * @see #getAttachmentType()
	 * @generated
	 */
	void setAttachmentType(Integer value);

	/**
	 * Returns the value of the '<em><b>Attachment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The displayable attachment identifier. Used to define what will appear as the name of the attachment, as opposed to the specific attachment file name or URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment Name</em>' attribute.
	 * @see #setAttachmentName(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Attachment_AttachmentName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAttachmentName();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Attachment#getAttachmentName <em>Attachment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment Name</em>' attribute.
	 * @see #getAttachmentName()
	 * @generated
	 */
	void setAttachmentName(String value);

} // PRS_Attachment
