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
 * A representation of the model object '<em><b>CIM RED Dropper Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * REDDropperService represents the ability to drop network traffic using a Random Early Detection (RED) algorithm. The purpose of a RED algorithm is to avoid congestion (as opposed to managing congestion). Instead of waiting for the queues to fill up, and then dropping large numbers of packets, RED works by monitoring average queue depth. When the queue depth exceeds a minimum threshold, packets are randomly discarded. These discards cause TCP to slow its transmission rate for those connections that experienced the packet discards. Other connections are not affected by these discards. 
 * 
 * A RED dropper always drops packets from a single queue, which is related to the dropper as the following Service in the NextService association. The queue(s) examined by the drop algorithm are found by following the CalculationServiceForDropper association(s) to determine the dropper's DropThresholdCalculationService(s), and then following the CalculationBasedOnQueue association to find the queue being watched by each CalculationService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_REDDropperService#getMinQueueThreshold <em>Min Queue Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_REDDropperService#getMaxQueueThreshold <em>Max Queue Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_REDDropperService#getStartProbability <em>Start Probability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_REDDropperService#getStopProbability <em>Stop Probability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_REDDropperService#getThresholdUnits <em>Threshold Units</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_REDDropperService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_REDDropperService extends CIM_DropperService {
	/**
	 * Returns the value of the '<em><b>Min Queue Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an unsigned 32-bit integer that defines the minimum average queue depth at which packets are subject to being dropped. (See the ThresholdUnits property to determine the units of the threshold.) The slope of the drop probability function is described by the Start/StopProbability properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Queue Threshold</em>' attribute.
	 * @see #setMinQueueThreshold(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_REDDropperService_MinQueueThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_REDDropperService.ThresholdUnits\"]'"
	 * @generated
	 */
	Long getMinQueueThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_REDDropperService#getMinQueueThreshold <em>Min Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Queue Threshold</em>' attribute.
	 * @see #getMinQueueThreshold()
	 * @generated
	 */
	void setMinQueueThreshold(Long value);

	/**
	 * Returns the value of the '<em><b>Max Queue Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an unsigned 32-bit integer that defines the maximum average queue length at which packets are subject to always being dropped, regardless of the dropping algorithm and probabilities being used. (See the ThresholdUnits property to determine the units of the threshold.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Queue Threshold</em>' attribute.
	 * @see #setMaxQueueThreshold(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_REDDropperService_MaxQueueThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='1000' ModelCorrespondence='[\"CIM_REDDropperService.ThresholdUnits\"]'"
	 * @generated
	 */
	Long getMaxQueueThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_REDDropperService#getMaxQueueThreshold <em>Max Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Queue Threshold</em>' attribute.
	 * @see #getMaxQueueThreshold()
	 * @generated
	 */
	void setMaxQueueThreshold(Long value);

	/**
	 * Returns the value of the '<em><b>Start Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an unsigned 32-bit integer, used in conjunction with the StopDropProbability property. The start and stop probabilities define the slope of the drop probability function. This function governs the rate at which packets are subject to being dropped, as a function of the queue length. 
	 * 
	 * This property expresses a drop probability in drops per thousand packets. For example, the value 100 indicates a drop probability of 100 per 1000 packets, that is, 10%. Min and max values are 0 to 1000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Probability</em>' attribute.
	 * @see #setStartProbability(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_REDDropperService_StartProbability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Per Thousand Packets' ModelCorrespondence='[\"CIM_REDDropperService.StopProbability\"]' PUnit='count / packet * 10^-3'"
	 * @generated
	 */
	Long getStartProbability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_REDDropperService#getStartProbability <em>Start Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Probability</em>' attribute.
	 * @see #getStartProbability()
	 * @generated
	 */
	void setStartProbability(Long value);

	/**
	 * Returns the value of the '<em><b>Stop Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an unsigned 32-bit integer, used in conjunction with the StartDropProbability property. The start and stop probabilities define the slope of the drop probability function. This function governs the rate at which packets are subject to being dropped, as a function of the queue length. 
	 * 
	 * This property expresses a drop probability in drops per thousand packets. For example, the value 100 indicates a drop probability of 100 per 1000 packets, that is, 10%. Min and max values are 0 to 1000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Probability</em>' attribute.
	 * @see #setStopProbability(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_REDDropperService_StopProbability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Per Thousand Packets' MinValue='0' MaxValue='1000' ModelCorrespondence='[\"CIM_REDDropperService.StartProbability\"]' PUnit='count / packet * 10^-3'"
	 * @generated
	 */
	Long getStopProbability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_REDDropperService#getStopProbability <em>Stop Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Probability</em>' attribute.
	 * @see #getStopProbability()
	 * @generated
	 */
	void setStopProbability(Long value);

	/**
	 * Returns the value of the '<em><b>Threshold Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ThresholdUnits is an enumerated integer that identifies the units for the Min and MaxQueueThreshold properties. The values are either bytes (1) or packets (2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold Units</em>' attribute.
	 * @see #setThresholdUnits(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_REDDropperService_ThresholdUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"Bytes\",\"Packets\"]'"
	 * @generated
	 */
	Integer getThresholdUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_REDDropperService#getThresholdUnits <em>Threshold Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Units</em>' attribute.
	 * @see #getThresholdUnits()
	 * @generated
	 */
	void setThresholdUnits(Integer value);

} // CIM_REDDropperService
