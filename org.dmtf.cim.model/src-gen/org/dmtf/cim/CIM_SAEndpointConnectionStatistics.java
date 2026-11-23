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
 * A representation of the model object '<em><b>CIM SA Endpoint Connection Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class captures statistical and time-related information about the use of the IPsec or IKE Security Associations, through their IPsecSAEndpoint or IKESAEndpoint. The relevant SAEndpoint is determined by traversing the ElementStatisticalData association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SAEndpointConnectionStatistics#getByteCount <em>Byte Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SAEndpointConnectionStatistics#getLastAccessed <em>Last Accessed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SAEndpointConnectionStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SAEndpointConnectionStatistics extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Byte Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bytes that have been protected by the associated SAEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Byte Count</em>' attribute.
	 * @see #setByteCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SAEndpointConnectionStatistics_ByteCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true' PUnit='byte'"
	 * @generated
	 */
	Long getByteCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SAEndpointConnectionStatistics#getByteCount <em>Byte Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Count</em>' attribute.
	 * @see #getByteCount()
	 * @generated
	 */
	void setByteCount(Long value);

	/**
	 * Returns the value of the '<em><b>Last Accessed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LastAccessed indicates when the SAEndpoint was last used. This property is helpful in determining if the SA (and its endpoint) will be deleted due to sitting idle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Accessed</em>' attribute.
	 * @see #setLastAccessed(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SAEndpointConnectionStatistics_LastAccessed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastAccessed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SAEndpointConnectionStatistics#getLastAccessed <em>Last Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Accessed</em>' attribute.
	 * @see #getLastAccessed()
	 * @generated
	 */
	void setLastAccessed(String value);

} // CIM_SAEndpointConnectionStatistics
