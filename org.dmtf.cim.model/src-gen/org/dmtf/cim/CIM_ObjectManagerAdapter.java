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
 * A representation of the model object '<em><b>CIM Object Manager Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ObjectManagerAdapter is deprececated. Client Object Manager Adapter is now modeled by ProtocolService. There is no replacement for the other types of adapters. 
 * A ObjectManagerAdapter is a Service of the CIM Object Manager. An adapter can be any service of the Object Manager that needs to be managed (e.g. started, stopped, monitored, ...). There MUST be an instance for each Adapter type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerAdapter#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerAdapter#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManagerAdapter#getOtherAdapterTypeDescription <em>Other Adapter Type Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_ProtocolService\",\"No value\"]' Version='2.39.0' UMLPackagePath='CIM::Interop' override.Name='string' override.Name.Description='A human-readable name that uniquely identifies the ObjectManager within a system.' override.ElementName='string' override.ElementName.Description='The ElmentName property is used as a name of the Object Manager Adapter for human interfaces. For example, \"ACME ObjectManager Adapter\".' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ObjectManagerAdapter extends CIM_WBEMService {
	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An implementation specific string that identifies the handle to the Object Manager Adapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerAdapter_Handle()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Required='true'"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ObjectManagerAdapter#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

	/**
	 * Returns the value of the '<em><b>Adapter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdapterType enumerates the kind of Object Manager Adapter. If 'Other' is specified, the OtherAdapterTypeDescription property MUST be populated. 
	 * Other - If the adapter does not fit into one of the other catagories in the list. If specified, the OtherAdapterTypeDescription property MUST be populated. 
	 * Client - A client side adapter that responds to client operation requests, such as CIM-XML or CIM-SOAP. 
	 * Provider - A provider adapter, such as DMI, SNMP, JSR48 or CMPI. 
	 * Indication Handler - An Indication Handler is a service that delivers indications to a subscriber. Examples of possible Indication Handlers are CIM-XML, CIM-SOAP, SMPT (e-mail) or any other delivery mechanism. 
	 * Repository - A repository is an adapter that can store/retrieve persistent data, such as CIM Qualifier Types, CIM Classes and CIM Instances. An Object Manager could use multiple repositiories at one time, for example one could be used for CIM Schema information only, while another is used for instance information. Repositories MAY be remote or local to the CIM Object Manager. Examples of repository implementations could be databases, LDAP or files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adapter Type</em>' attribute.
	 * @see #setAdapterType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerAdapter_AdapterType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Client\",\"Provider\",\"Indication Handler\",\"Repository\"]' ModelCorrespondence='[\"CIM_ObjectManagerAdapter.OtherAdapterTypeDescription\"]'"
	 * @generated
	 */
	Integer getAdapterType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ObjectManagerAdapter#getAdapterType <em>Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Type</em>' attribute.
	 * @see #getAdapterType()
	 * @generated
	 */
	void setAdapterType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Adapter Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type(s) of ObjectManagerAdapter when "Other" is included in ObjectManagerAdapterType property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Adapter Type Description</em>' attribute.
	 * @see #setOtherAdapterTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManagerAdapter_OtherAdapterTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' ModelCorrespondence='[\"CIM_ObjectManagerAdapter.AdapterType\"]'"
	 * @generated
	 */
	String getOtherAdapterTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ObjectManagerAdapter#getOtherAdapterTypeDescription <em>Other Adapter Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Adapter Type Description</em>' attribute.
	 * @see #getOtherAdapterTypeDescription()
	 * @generated
	 */
	void setOtherAdapterTypeDescription(String value);

} // CIM_ObjectManagerAdapter
