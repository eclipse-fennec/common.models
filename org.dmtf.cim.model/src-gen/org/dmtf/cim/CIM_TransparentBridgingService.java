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
 * A representation of the model object '<em><b>CIM Transparent Bridging Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This service class represents the learning/transparent bridging aspect of a SwitchService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TransparentBridgingService#getAgingTime <em>Aging Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TransparentBridgingService#getFID <em>FID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TransparentBridgingService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_TransparentBridgingService extends CIM_ForwardingService {
	/**
	 * Returns the value of the '<em><b>Aging Time</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timeout period in seconds for aging out dynamically learned forwarding information. 802.1D-1990 recommends a default of 300 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aging Time</em>' attribute.
	 * @see #setAgingTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TransparentBridgingService_AgingTime()
	 * @model default="300"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dTpAgingTime\"]'"
	 * @generated
	 */
	Long getAgingTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TransparentBridgingService#getAgingTime <em>Aging Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aging Time</em>' attribute.
	 * @see #getAgingTime()
	 * @generated
	 */
	void setAgingTime(Long value);

	/**
	 * Returns the value of the '<em><b>FID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filtering Database Identifier used by VLAN-aware switches that have more than one filtering database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FID</em>' attribute.
	 * @see #setFID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TransparentBridgingService_FID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getFID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TransparentBridgingService#getFID <em>FID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FID</em>' attribute.
	 * @see #getFID()
	 * @generated
	 */
	void setFID(Long value);

} // CIM_TransparentBridgingService
