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
 * A representation of the model object '<em><b>CIM Help Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HelpService provides the ability for a managed element to describe and provide access to its Help information. Support for various delivery mechanisms and data formats can be specified so that the most suitable data representation can be chosen. In adddition, a request can be made to launch a "Help" program, if available.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_HelpService#getDeliveryOptions <em>Delivery Options</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_HelpService#getOtherDeliveryOptionDescription <em>Other Delivery Option Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_HelpService#getDocumentsAvailable <em>Documents Available</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_HelpService#getDocumentDescriptions <em>Document Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_HelpService#getDocumentFormat <em>Document Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_HelpService#getOtherDocumentFormatDescription <em>Other Document Format Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HelpService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.9.0' UMLPackagePath='CIM::System::Help' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_HelpService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Delivery Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the delivery methods supported by this help service./n "File Contents" indicates that the contents of the Help file is returned by the GetHelp method. 
	 * "File Pointer" indicates that a fully specified path to the Help file is returned by the GetHelp method. 
	 * "Associated File" indicates that associations to CIM_LogicalFile instance(s) is available. 
	 * "URL" indicates that a URL to a website is returned by the GetHelp method. 
	 * "Program" indicates that a Help program is launched (on the local system) by the GetHelp method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_HelpService_DeliveryOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"File Contents\",\"File Pointer\",\"Associated File\",\"URL\",\"Program\"]' ModelCorrespondence='[\"CIM_HelpService.OtherDeliveryOptionDescription\",\"CIM_HelpServiceAvailableToFile\"]'"
	 * @generated
	 */
	EList<Integer> getDeliveryOptions();

	/**
	 * Returns the value of the '<em><b>Other Delivery Option Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the nature of the delivery method when DeliveryOptions = "Other" is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Delivery Option Description</em>' attribute.
	 * @see #setOtherDeliveryOptionDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_HelpService_OtherDeliveryOptionDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_HelpService.DeliveryOptions\"]'"
	 * @generated
	 */
	String getOtherDeliveryOptionDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_HelpService#getOtherDeliveryOptionDescription <em>Other Delivery Option Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Delivery Option Description</em>' attribute.
	 * @see #getOtherDeliveryOptionDescription()
	 * @generated
	 */
	void setOtherDeliveryOptionDescription(String value);

	/**
	 * Returns the value of the '<em><b>Documents Available</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of all of the document names/ids that are available via this help service and NOT exposed by the HelpServiceAvailableToFile association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documents Available</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_HelpService_DocumentsAvailable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_HelpService.DocumentDescriptions\",\"CIM_HelpService.DocumentFormat\"]'"
	 * @generated
	 */
	EList<String> getDocumentsAvailable();

	/**
	 * Returns the value of the '<em><b>Document Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of descriptions for the corresponding documents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_HelpService_DocumentDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_HelpService.DocumentsAvailable\",\"CIM_HelpService.DocumentFormat\"]'"
	 * @generated
	 */
	EList<String> getDocumentDescriptions();

	/**
	 * Returns the value of the '<em><b>Document Format</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of document formats for the corresponding documents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Format</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_HelpService_DocumentFormat()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"XML\",\"HTML\",\"Binary\",\"Executable\",\".hlp\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_HelpService.OtherDocumentFormatDescription\",\"CIM_HelpService.DocumentDescriptions\",\"CIM_HelpService.DocumentsAvailable\"]'"
	 * @generated
	 */
	EList<Integer> getDocumentFormat();

	/**
	 * Returns the value of the '<em><b>Other Document Format Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the format of the document when DocumentFormat= "Other" is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Document Format Description</em>' attribute.
	 * @see #setOtherDocumentFormatDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_HelpService_OtherDocumentFormatDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_HelpService.DocumentFormat\"]'"
	 * @generated
	 */
	String getOtherDocumentFormatDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_HelpService#getOtherDocumentFormatDescription <em>Other Document Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Document Format Description</em>' attribute.
	 * @see #getOtherDocumentFormatDescription()
	 * @generated
	 */
	void setOtherDocumentFormatDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GetHelp method produces, as an OUT parameter, a string containing document information as specified by the input parameters. The input parameters are expected to be valid sets of values from the corresponding indexed properties of this class.
	 * @param RequestedDocument The name/id of the requested document or the reference to the associated document.
	 * @param Format The requested document format is passed in. The actual document format is returned.
	 * @param RequestedDelivery The requested delivery mechanism.
	 * @param DocumentInfo
	 *   If RequestedDelivery = 
	 *   File Contents, then the string contains the contents. 
	 *   File Pointer, then the string contains a pointer to the file. 
	 *   File Reference, then the string contains a REF to a CIM_LogicalFile instance. 
	 *   URL, then then the string contains a URL to the help site. 
	 *   Program, then the string is empty; the program was launched.
	 * <!-- end-model-doc -->
	 * @model RequestedDocumentAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' ModelCorrespondence='[\"CIM_HelpService.DocumentsAvailable\",\"CIM_HelpServiceAvailableToFile.UserOfService\"]'" FormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' Out='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Don\'t Care\",\"Other\",\"XML\",\"HTML\",\"Binary\",\"Executable\",\".hlp\"]' ModelCorrespondence='[\"CIM_HelpService.DocumentFormat\"]'" RequestedDeliveryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"1\",\"2\",\"3\",\"5\",\"6\"]' Values='[\"Other\",\"File Contents\",\"File Pointer\",\"URL\",\"Program\"]' ModelCorrespondence='[\"CIM_HelpService.DeliveryOptions\"]'" DocumentInfoAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x1000\",\"0x1001\",\"0x1002..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Document returned with no error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Busy\",\"Requested Document not found\",\"Method Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long GetHelp(String RequestedDocument, Integer Format, Integer RequestedDelivery, String DocumentInfo);

} // CIM_HelpService
