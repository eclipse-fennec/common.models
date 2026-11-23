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
 * A representation of the model object '<em><b>CIM Transparent Bridging Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistical information regarding the TransparentBridging Service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TransparentBridgingStatistics#getLearnedEntryDiscards <em>Learned Entry Discards</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TransparentBridgingStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,ServiceCreationClassName,ServiceName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_TransparentBridgingStatistics extends CIM_ServiceStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Learned Entry Discards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of Forwarding Database entries, which have been or would have been learnt, but have been discarded due to a lack of space to store them in the Forwarding Database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Learned Entry Discards</em>' attribute.
	 * @see #setLearnedEntryDiscards(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TransparentBridgingStatistics_LearnedEntryDiscards()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dTpLearnedEntryDiscards\"]'"
	 * @generated
	 */
	Long getLearnedEntryDiscards();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TransparentBridgingStatistics#getLearnedEntryDiscards <em>Learned Entry Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learned Entry Discards</em>' attribute.
	 * @see #getLearnedEntryDiscards()
	 * @generated
	 */
	void setLearnedEntryDiscards(Long value);

} // CIM_TransparentBridgingStatistics
