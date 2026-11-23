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
 * A representation of the model object '<em><b>CIM Queuing Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * QueuingService represents the ability to queue network traffic, and to specify the characteristics for determining long-term congestion. It is modeled as a ConditioningService so that it can be aggregated into a QoSService (using the QoSConditioningSubService association). This indicates that its functionality underlies the QoSService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_QueuingService#getCurrentQueueDepth <em>Current Queue Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueuingService#getDepthUnits <em>Depth Units</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QueuingService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_QueuingService extends CIM_ConditioningService {
	/**
	 * Returns the value of the '<em><b>Current Queue Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current depth of this queue in units specified by DepthUnits. This value may be important in diagnosing unexpected behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Queue Depth</em>' attribute.
	 * @see #setCurrentQueueDepth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueuingService_CurrentQueueDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Gauge='true' ModelCorrespondence='[\"CIM_QueuingService.DepthUnits\"]'"
	 * @generated
	 */
	Long getCurrentQueueDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueuingService#getCurrentQueueDepth <em>Current Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Queue Depth</em>' attribute.
	 * @see #getCurrentQueueDepth()
	 * @generated
	 */
	void setCurrentQueueDepth(Long value);

	/**
	 * Returns the value of the '<em><b>Depth Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DepthUnits is an enumerated integer that identifies the units for the CurrentQueueDepth property. The values are either bytes (1) or packets (2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depth Units</em>' attribute.
	 * @see #setDepthUnits(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueuingService_DepthUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"Bytes\",\"Packets\"]'"
	 * @generated
	 */
	Integer getDepthUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueuingService#getDepthUnits <em>Depth Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Units</em>' attribute.
	 * @see #getDepthUnits()
	 * @generated
	 */
	void setDepthUnits(Integer value);

} // CIM_QueuingService
