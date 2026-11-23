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
 * A representation of the model object '<em><b>CIM VTL Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class provides statistical data representing the historical usage for resources exposed by the CIM_VTLStatisticalDataService methods
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalData#getData <em>Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalData#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalData#getXAxisName <em>XAxis Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalData#getYAxisName <em>YAxis Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalData#getXAxisUnit <em>XAxis Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalData#getYAxisUnit <em>YAxis Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalData#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLStatisticalData#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageStatistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VTLStatisticalData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that contains the graph data In CSV format
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalData_Data()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLStatisticalData#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the data as requested in the graph generation methods. Ex: '2' (CSV)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Format</em>' attribute.
	 * @see #setDataFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalData_DataFormat()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"CSV\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getDataFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLStatisticalData#getDataFormat <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format</em>' attribute.
	 * @see #getDataFormat()
	 * @generated
	 */
	void setDataFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>XAxis Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the X axis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XAxis Name</em>' attribute.
	 * @see #setXAxisName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalData_XAxisName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getXAxisName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLStatisticalData#getXAxisName <em>XAxis Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Name</em>' attribute.
	 * @see #getXAxisName()
	 * @generated
	 */
	void setXAxisName(String value);

	/**
	 * Returns the value of the '<em><b>YAxis Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the Y axis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YAxis Name</em>' attribute.
	 * @see #setYAxisName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalData_YAxisName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getYAxisName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLStatisticalData#getYAxisName <em>YAxis Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Name</em>' attribute.
	 * @see #getYAxisName()
	 * @generated
	 */
	void setYAxisName(String value);

	/**
	 * Returns the value of the '<em><b>XAxis Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit used for the X axis (e.g. seconds)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XAxis Unit</em>' attribute.
	 * @see #setXAxisUnit(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalData_XAxisUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' IsPUnit='true'"
	 * @generated
	 */
	String getXAxisUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLStatisticalData#getXAxisUnit <em>XAxis Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Unit</em>' attribute.
	 * @see #getXAxisUnit()
	 * @generated
	 */
	void setXAxisUnit(String value);

	/**
	 * Returns the value of the '<em><b>YAxis Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit used for the Y axis (e.g. byte * 10^6 / second)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YAxis Unit</em>' attribute.
	 * @see #setYAxisUnit(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalData_YAxisUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' IsPUnit='true'"
	 * @generated
	 */
	String getYAxisUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLStatisticalData#getYAxisUnit <em>YAxis Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Unit</em>' attribute.
	 * @see #getYAxisUnit()
	 * @generated
	 */
	void setYAxisUnit(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Begin time of the data point collection
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalData_StartTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLStatisticalData#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time interval in seconds between consecutive points in the data returned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalData_TimeInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='seconds' PUnit='second'"
	 * @generated
	 */
	Long getTimeInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLStatisticalData#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(Long value);

} // CIM_VTLStatisticalData
