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
 * A representation of the model object '<em><b>CIM Support Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_SupportAccess association defines how to obtain assistance for a Product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SupportAccess#getSupportAccessId <em>Support Access Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SupportAccess#getCommunicationInfo <em>Communication Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SupportAccess#getCommunicationMode <em>Communication Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SupportAccess#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SupportAccess()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Core::ProductFRU' override.Description='string' override.Description.Description='A textual description of the type of Support provided.' override.Description.MappingStrings='[\"MIF.DMTF|Support|001.3\"]' keys='SupportAccessId'"
 * @generated
 */
@ProviderType
public interface CIM_SupportAccess extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Support Access Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportAccessID is an arbitrary, free form string defined by the Product Vendor or by the organization that deploys the Product. This property, since it is a key, should be unique throughout the enterprise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support Access Id</em>' attribute.
	 * @see #setSupportAccessId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SupportAccess_SupportAccessId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getSupportAccessId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SupportAccess#getSupportAccessId <em>Support Access Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Access Id</em>' attribute.
	 * @see #getSupportAccessId()
	 * @generated
	 */
	void setSupportAccessId(String value);

	/**
	 * Returns the value of the '<em><b>Communication Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationInfo provides the details of the Communication Mode. For example, if the CommunicationMode is 'Phone', CommunicationInfo specifies the phone number to be called.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Info</em>' attribute.
	 * @see #setCommunicationInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SupportAccess_CommunicationInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|FRU|002.11\",\"MIF.DMTF|FRU|002.12\"]'"
	 * @generated
	 */
	String getCommunicationInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SupportAccess#getCommunicationInfo <em>Communication Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Info</em>' attribute.
	 * @see #getCommunicationInfo()
	 * @generated
	 */
	void setCommunicationInfo(String value);

	/**
	 * Returns the value of the '<em><b>Communication Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationMode defines the form of communication in order to obtain support. For example, phone communication (value =2), fax (3) or email (8) can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Mode</em>' attribute.
	 * @see #setCommunicationMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SupportAccess_CommunicationMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Other\",\"Phone\",\"Fax\",\"BBS\",\"Online Service\",\"Web Page\",\"FTP\",\"E-mail\"]' MappingStrings='[\"MIF.DMTF|Support|001.5\"]'"
	 * @generated
	 */
	Integer getCommunicationMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SupportAccess#getCommunicationMode <em>Communication Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Mode</em>' attribute.
	 * @see #getCommunicationMode()
	 * @generated
	 */
	void setCommunicationMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Locale defines the geographic region and/or language dialect to which this Support resource pertains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SupportAccess_Locale()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' MappingStrings='[\"MIF.DMTF|Support|001.2\"]'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SupportAccess#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

} // CIM_SupportAccess
