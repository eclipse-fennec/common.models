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
 * A representation of the model object '<em><b>CIM Document Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class describing a company's and/or administrator's credential requirements that should be authenticated in order to establish/trust a CIM_Identity. This class defines the specific document that should be authenticated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DocumentAuthentication#getTypeOfDocument <em>Type Of Document</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DocumentAuthentication#getOtherDocument <em>Other Document</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DocumentAuthentication#getDocumentIdentifier <em>Document Identifier</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DocumentAuthentication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_DocumentAuthentication extends CIM_AuthenticationCondition {
	/**
	 * Returns the value of the '<em><b>Type Of Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer enumeration identifying the document that should be authenticated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Document</em>' attribute.
	 * @see #setTypeOfDocument(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DocumentAuthentication_TypeOfDocument()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Other\",\"Passport\",\"Birth Certificate\",\"Credit Card\",\"Drivers License\",\"Membership Card\",\"Social Security Card\"]' ModelCorrespondence='[\"CIM_DocumentAuthentication.OtherDocument\"]'"
	 * @generated
	 */
	Integer getTypeOfDocument();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DocumentAuthentication#getTypeOfDocument <em>Type Of Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Document</em>' attribute.
	 * @see #getTypeOfDocument()
	 * @generated
	 */
	void setTypeOfDocument(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String specifying the document when the TypeOfDocument property is set to 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Document</em>' attribute.
	 * @see #setOtherDocument(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DocumentAuthentication_OtherDocument()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DocumentAuthentication.TypeOfDocument\"]'"
	 * @generated
	 */
	String getOtherDocument();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DocumentAuthentication#getOtherDocument <em>Other Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Document</em>' attribute.
	 * @see #getOtherDocument()
	 * @generated
	 */
	void setOtherDocument(String value);

	/**
	 * Returns the value of the '<em><b>Document Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String defining a particular document which may be used in the authentication process for example, a specific driver's license or passport number. If left blank, then any valid document matching the category specified by the TypeOfDocument property, can be accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Identifier</em>' attribute.
	 * @see #setDocumentIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DocumentAuthentication_DocumentIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDocumentIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DocumentAuthentication#getDocumentIdentifier <em>Document Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Identifier</em>' attribute.
	 * @see #getDocumentIdentifier()
	 * @generated
	 */
	void setDocumentIdentifier(String value);

} // CIM_DocumentAuthentication
