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
 * A representation of the model object '<em><b>CIM Help Service Available To File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_HelpServiceAvailableToFile indicates that the service is available for accessing the help file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_HelpServiceAvailableToFile#getDocumentFormat <em>Document Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_HelpServiceAvailableToFile#getOtherDocumentFormatDescription <em>Other Document Format Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HelpServiceAvailableToFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.9.0' UMLPackagePath='CIM::System::Help' override.ServiceProvided='CIM_HelpService REF' override.ServiceProvided.Description='The Service that is available.' override.UserOfService='CIM_LogicalFile REF' override.UserOfService.Description='The file that make use of this Service.' keys='ServiceProvided,UserOfService'"
 * @generated
 */
@ProviderType
public interface CIM_HelpServiceAvailableToFile extends CIM_ServiceAvailableToElement {
	/**
	 * Returns the value of the '<em><b>Document Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document format for the associated file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Format</em>' attribute.
	 * @see #setDocumentFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_HelpServiceAvailableToFile_DocumentFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"XML\",\"HTML\",\"Binary\",\"Executable\",\".hlp\"]' ModelCorrespondence='[\"CIM_HelpServiceAvailableToFile.OtherDocumentFormatDescription\"]'"
	 * @generated
	 */
	Integer getDocumentFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_HelpServiceAvailableToFile#getDocumentFormat <em>Document Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Format</em>' attribute.
	 * @see #getDocumentFormat()
	 * @generated
	 */
	void setDocumentFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Document Format Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the format of the file when DocumentFormat= "Other" is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Document Format Description</em>' attribute.
	 * @see #setOtherDocumentFormatDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_HelpServiceAvailableToFile_OtherDocumentFormatDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_HelpServiceAvailableToFile.DocumentFormat\"]'"
	 * @generated
	 */
	String getOtherDocumentFormatDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_HelpServiceAvailableToFile#getOtherDocumentFormatDescription <em>Other Document Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Document Format Description</em>' attribute.
	 * @see #getOtherDocumentFormatDescription()
	 * @generated
	 */
	void setOtherDocumentFormatDescription(String value);

} // CIM_HelpServiceAvailableToFile
