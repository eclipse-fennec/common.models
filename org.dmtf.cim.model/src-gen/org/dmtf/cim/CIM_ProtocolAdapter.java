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
 * A representation of the model object '<em><b>CIM Protocol Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ProtocolAdapter is deprecated in lieu of CIM_ObjectManagerAdapter. Since the CIM_ProtocolAdapter class does not have to support the protocols and can be any type of adapter, it was decided to change the name to ObjectManagerAdapter to better reflect the true meaning of the class. A ProtocolAdapter is a Service of the CIM Object Manager. It is responsible for accepting incoming requests on a particular protocol, and translating and forwarding the request to the CIM Object Manager. It is also responsible for translating and sending the response from the CIM Object Manager.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolAdapter#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolAdapter#getProtocolAdapterType <em>Protocol Adapter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolAdapter#getOtherProtocolAdapterType <em>Other Protocol Adapter Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_ObjectManagerAdapter\"]' Version='2.8.0' UMLPackagePath='CIM::Interop' override.Name='string' override.Name.Deprecated='[\"CIM_ObjectManagerAdapter.Name\"]' override.Name.Description='A human-readable name that uniquely identifies the Protocol Adapter within a system.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolAdapter extends CIM_WBEMService {
	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An implementation specific string that identifies the handle to the ProtocolAdapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolAdapter_Handle()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_ObjectManagerAdapter.Handle\"]' Required='true'"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolAdapter#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

	/**
	 * Returns the value of the '<em><b>Protocol Adapter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProtocolAdapterType enumerates the kind of Protocol Adapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Adapter Type</em>' attribute.
	 * @see #setProtocolAdapterType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolAdapter_ProtocolAdapterType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_ObjectManagerAdapter.AdapterType\"]' Required='true' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"Client\",\"Provider\"]' ModelCorrespondence='[\"CIM_ProtocolAdapter.OtherProtocolAdapterType\"]'"
	 * @generated
	 */
	Integer getProtocolAdapterType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolAdapter#getProtocolAdapterType <em>Protocol Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Adapter Type</em>' attribute.
	 * @see #getProtocolAdapterType()
	 * @generated
	 */
	void setProtocolAdapterType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Protocol Adapter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type(s) of ProtocolAdapter when "Other" is included in ProtocolAdapterType property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Protocol Adapter Type</em>' attribute.
	 * @see #setOtherProtocolAdapterType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolAdapter_OtherProtocolAdapterType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_ObjectManagerAdapter.OtherAdapterTypeDescription\"]' ModelCorrespondence='[\"CIM_ProtocolAdapter.ProtocolAdapterType\"]'"
	 * @generated
	 */
	String getOtherProtocolAdapterType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolAdapter#getOtherProtocolAdapterType <em>Other Protocol Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protocol Adapter Type</em>' attribute.
	 * @see #getOtherProtocolAdapterType()
	 * @generated
	 */
	void setOtherProtocolAdapterType(String value);

} // CIM_ProtocolAdapter
