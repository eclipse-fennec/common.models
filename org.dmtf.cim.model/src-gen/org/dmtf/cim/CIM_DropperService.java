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
 * A representation of the model object '<em><b>CIM Dropper Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DropperService represents the ability to selectively drop network traffic, and/or to invoke another ConditioningService (indicated using the NextService association) for further processing of traffic that is not dropped. It is the base class for different types of droppers. Droppers are distinguished by the algorithm that they use to drop traffic. 
 * 
 * The NextService association has special semantics for droppers, in addition to conveying the general information of 'what happens next' (that apply to all Conditioning Services). The queue(s) from which a particular dropper drops packets are identified by following chain(s) of NextService associations 'rightwards' from the dropper, until they reach a queue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DropperService#getDropperType <em>Dropper Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DropperService#getOtherDropperType <em>Other Dropper Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DropperService#getAlwaysDrop <em>Always Drop</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DropperService#getDropFrom <em>Drop From</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DropperService#getDropStartMetric <em>Drop Start Metric</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DropperService#getDropMaintainMetric <em>Drop Maintain Metric</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DropperService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DropperService extends CIM_ConditioningService {
	/**
	 * Returns the value of the '<em><b>Dropper Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an enumerated 16-bit unsigned integer that defines the type of dropper. Its Values are: 
	 * 1: Other 
	 * 2: Random 
	 * 3: HeadTail 
	 * 4: Absolute Dropper 
	 * 
	 * Note: The DropperType property and the DropperService subclasses provide similar information. This property is defined for query purposes and to not require a subclass for all types of DropperServices (for example, to describe an Absolute Dropper in today's model). Therefore, DropperService can be instantiated directly and the Type property is needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dropper Type</em>' attribute.
	 * @see #setDropperType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DropperService_DropperType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Random\",\"HeadTail\",\"Absolute Dropper\"]' ModelCorrespondence='[\"CIM_DropperService.OtherDropperType\"]'"
	 * @generated
	 */
	Integer getDropperType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DropperService#getDropperType <em>Dropper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropper Type</em>' attribute.
	 * @see #getDropperType()
	 * @generated
	 */
	void setDropperType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Dropper Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains a vendor-specific value for the type of dropping that is done. It is used when the value of the DropperType property is 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Dropper Type</em>' attribute.
	 * @see #setOtherDropperType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DropperService_OtherDropperType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DropperService.DropperType\"]'"
	 * @generated
	 */
	String getOtherDropperType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DropperService#getOtherDropperType <em>Other Dropper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Dropper Type</em>' attribute.
	 * @see #getOtherDropperType()
	 * @generated
	 */
	void setOtherDropperType(String value);

	/**
	 * Returns the value of the '<em><b>Always Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether the Dropper will always drop incoming packets (value=1) regardless of their type. It is deprecated since its information is conveyed by the DropperType property (value=4, 'Absolute Dropper').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Always Drop</em>' attribute.
	 * @see #setAlwaysDrop(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DropperService_AlwaysDrop()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_DropperService.DropperType\"]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Always Drop\",\"Do Not Always Drop\"]'"
	 * @generated
	 */
	Integer getAlwaysDrop();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DropperService#getAlwaysDrop <em>Always Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Drop</em>' attribute.
	 * @see #getAlwaysDrop()
	 * @generated
	 */
	void setAlwaysDrop(Integer value);

	/**
	 * Returns the value of the '<em><b>Drop From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This enumeration indicates the point in the associated queue (associated via the NextService relationship) from which packets should be dropped. If the value is 0 "Unknown", then packets MAY be dropped from any location in the queue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drop From</em>' attribute.
	 * @see #setDropFrom(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DropperService_DropFrom()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Head\",\"Tail\"]'"
	 * @generated
	 */
	Integer getDropFrom();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DropperService#getDropFrom <em>Drop From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop From</em>' attribute.
	 * @see #getDropFrom()
	 * @generated
	 */
	void setDropFrom(Integer value);

	/**
	 * Returns the value of the '<em><b>Drop Start Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an enumerated unsigned 16-bit integer that defines the metric used to trigger the start of dropping packets. This does NOT mean that all packets will be dropped; it does mean that SOME packets will start to be dropped. The number and type of packets dropped is a function of the type of algorithm used by this Dropper. Values are: 
	 * 
	 * 1: Other 
	 * 2: Queue Threshold 
	 * 3: Arrival Rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drop Start Metric</em>' attribute.
	 * @see #setDropStartMetric(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DropperService_DropStartMetric()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"Queue Threshold\",\"Arrival Rate\"]'"
	 * @generated
	 */
	Integer getDropStartMetric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DropperService#getDropStartMetric <em>Drop Start Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Start Metric</em>' attribute.
	 * @see #getDropStartMetric()
	 * @generated
	 */
	void setDropStartMetric(Integer value);

	/**
	 * Returns the value of the '<em><b>Drop Maintain Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an enumerated unsigned 16-bit integer that defines the metric used to determine when ALL packets will be dropped REGARDLESS of the type of algorithm used by this Dropper. Values are: 
	 * 
	 * 1: Other 
	 * 2: Queue Threshold 
	 * 3: Arrival Rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drop Maintain Metric</em>' attribute.
	 * @see #setDropMaintainMetric(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DropperService_DropMaintainMetric()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"Queue Threshold\",\"Arrival Rate\"]'"
	 * @generated
	 */
	Integer getDropMaintainMetric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DropperService#getDropMaintainMetric <em>Drop Maintain Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Maintain Metric</em>' attribute.
	 * @see #getDropMaintainMetric()
	 * @generated
	 */
	void setDropMaintainMetric(Integer value);

} // CIM_DropperService
