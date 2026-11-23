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
 * A representation of the model object '<em><b>CIM Statistical Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_StatisticalSetting is the class for setting the collection criteria of statistical data and/or metrics applicable to one or more ManagedElements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalSetting#getStartStatisticTime <em>Start Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalSetting#getEndStatisticTime <em>End Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalSetting#getSampleInterval <em>Sample Interval</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Core::Statistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StatisticalSetting extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Start Statistic Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time, relative to managed element where the statistic is to be collected, when the first measurement is to be taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Statistic Time</em>' attribute.
	 * @see #setStartStatisticTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalSetting_StartStatisticTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true' ModelCorrespondence='[\"CIM_StatisticalData.StartStatisticTime\"]'"
	 * @generated
	 */
	String getStartStatisticTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalSetting#getStartStatisticTime <em>Start Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Statistic Time</em>' attribute.
	 * @see #getStartStatisticTime()
	 * @generated
	 */
	void setStartStatisticTime(String value);

	/**
	 * Returns the value of the '<em><b>End Statistic Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time, relative to managed element where the statistic is to be collected, when the measurement is to end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Statistic Time</em>' attribute.
	 * @see #setEndStatisticTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalSetting_EndStatisticTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true'"
	 * @generated
	 */
	String getEndStatisticTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalSetting#getEndStatisticTime <em>End Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Statistic Time</em>' attribute.
	 * @see #getEndStatisticTime()
	 * @generated
	 */
	void setEndStatisticTime(String value);

	/**
	 * Returns the value of the '<em><b>Sample Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some statistics are sampled at consistent time intervals. This property when set indicates the desired minimum time that new statistics should be polled or calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sample Interval</em>' attribute.
	 * @see #setSampleInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalSetting_SampleInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true' ModelCorrespondence='[\"CIM_StatisticalData.SampleInterval\"]'"
	 * @generated
	 */
	String getSampleInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalSetting#getSampleInterval <em>Sample Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Interval</em>' attribute.
	 * @see #getSampleInterval()
	 * @generated
	 */
	void setSampleInterval(String value);

} // CIM_StatisticalSetting
