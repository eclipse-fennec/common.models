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
 * A representation of the model object '<em><b>CIM Switch Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistical information regarding a generic SwitchPort, independent of the specific kind of switching done on frames arriving at the port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortStatistics#getDelayExceededDiscards <em>Delay Exceeded Discards</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortStatistics#getMtuExceededDiscards <em>Mtu Exceeded Discards</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,SAPCreationClassName,SAPName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchPortStatistics extends CIM_SAPStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Delay Exceeded Discards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames discarded by this port due to excessive transit delay through the bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay Exceeded Discards</em>' attribute.
	 * @see #setDelayExceededDiscards(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortStatistics_DelayExceededDiscards()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dBasePortDelayExceededDiscards\"]'"
	 * @generated
	 */
	Long getDelayExceededDiscards();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortStatistics#getDelayExceededDiscards <em>Delay Exceeded Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Exceeded Discards</em>' attribute.
	 * @see #getDelayExceededDiscards()
	 * @generated
	 */
	void setDelayExceededDiscards(Long value);

	/**
	 * Returns the value of the '<em><b>Mtu Exceeded Discards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames discarded by this port due to an excessive size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mtu Exceeded Discards</em>' attribute.
	 * @see #setMtuExceededDiscards(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortStatistics_MtuExceededDiscards()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dBasePortMtuExceededDiscards\"]'"
	 * @generated
	 */
	Long getMtuExceededDiscards();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortStatistics#getMtuExceededDiscards <em>Mtu Exceeded Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtu Exceeded Discards</em>' attribute.
	 * @see #getMtuExceededDiscards()
	 * @generated
	 */
	void setMtuExceededDiscards(Long value);

} // CIM_SwitchPortStatistics
