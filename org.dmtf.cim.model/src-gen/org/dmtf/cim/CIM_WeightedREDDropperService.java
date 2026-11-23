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
 * A representation of the model object '<em><b>CIM Weighted RED Dropper Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a logical entity that resides in the data forwarding path of a network device. It describes the ability to drop network traffic using a Weighted Random Early Detection (WRED) algorithm. Like RED, the purpose of WRED is to avoid congestion (as opposed to managing congestion). This modification of the basic RED algorithm enables packets belonging to different traffic classes to be dropped at different queue depths. This algorithm also enables discard to be done based on different information contained in the packet header, such as IP Precedence, RSVP session parameters, or even on other factors not directly encoded in the packet header, such as the queue depth. 
 * 
 * Implementation of this class has shown that weighting should not be a property of the class (but on an association to it), and that there is insufficient data to process the drop metric. The class is deprecated pending further definition by the DMTF.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WeightedREDDropperService#getDropMetric <em>Drop Metric</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WeightedREDDropperService#getOtherDropMetric <em>Other Drop Metric</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WeightedREDDropperService#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WeightedREDDropperService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"No value\"]' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_WeightedREDDropperService extends CIM_DropperService {
	/**
	 * Returns the value of the '<em><b>Drop Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an enumerated 16-bit unsigned integer, and defines the type of metric that is used to drop traffic. Values are: 
	 * 
	 * 1: Other 
	 * 2: IP Precedence 
	 * 3: DSCP Value 
	 * 4: 802.1P Priority Value 
	 * 5: RSVP Session 
	 * 6: Queue Depth 
	 * 7: Packet Arrival Rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drop Metric</em>' attribute.
	 * @see #setDropMetric(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WeightedREDDropperService_DropMetric()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Other\",\"IP Precedence\",\"DSCP Value\",\"802.1P Priority Value\",\"RSVP Session\",\"Queue Depth\",\"Packet Arrival Rate\"]' ModelCorrespondence='[\"CIM_WeightedREDDropperService.OtherDropMetric\"]'"
	 * @generated
	 */
	Integer getDropMetric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WeightedREDDropperService#getDropMetric <em>Drop Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Metric</em>' attribute.
	 * @see #getDropMetric()
	 * @generated
	 */
	void setDropMetric(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Drop Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This string property is used in conjunction with the DropMetric property. When the value of DropMetric is 1 (i.e., "Other"), then the type of metric to be used is defined in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Drop Metric</em>' attribute.
	 * @see #setOtherDropMetric(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WeightedREDDropperService_OtherDropMetric()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' ModelCorrespondence='[\"CIM_WeightedREDDropperService.DropMetric\"]'"
	 * @generated
	 */
	String getOtherDropMetric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WeightedREDDropperService#getOtherDropMetric <em>Other Drop Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Drop Metric</em>' attribute.
	 * @see #getOtherDropMetric()
	 * @generated
	 */
	void setOtherDropMetric(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a 32-bit real number that represents the weighting factor used to determine which queues get more service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_WeightedREDDropperService_Weight()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Deprecated='[\"CIM_DropThresholdCalculationService.SmoothingWeight\"]' MinValue='0' MaxValue='100'"
	 * @generated
	 */
	Float getWeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WeightedREDDropperService#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Float value);

} // CIM_WeightedREDDropperService
