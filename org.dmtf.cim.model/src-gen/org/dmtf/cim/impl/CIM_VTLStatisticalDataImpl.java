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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_VTLStatisticalData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VTL Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataImpl#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataImpl#getXAxisName <em>XAxis Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataImpl#getYAxisName <em>YAxis Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataImpl#getXAxisUnit <em>XAxis Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataImpl#getYAxisUnit <em>YAxis Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataImpl#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VTLStatisticalDataImpl extends CIM_StatisticalDataImpl implements CIM_VTLStatisticalData {
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_FORMAT_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer dataFormat = DATA_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxisName() <em>XAxis Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisName()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAxisName() <em>XAxis Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisName()
	 * @generated
	 * @ordered
	 */
	protected String xAxisName = XAXIS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisName() <em>YAxis Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisName()
	 * @generated
	 * @ordered
	 */
	protected static final String YAXIS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAxisName() <em>YAxis Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisName()
	 * @generated
	 * @ordered
	 */
	protected String yAxisName = YAXIS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxisUnit() <em>XAxis Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAxisUnit() <em>XAxis Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisUnit()
	 * @generated
	 * @ordered
	 */
	protected String xAxisUnit = XAXIS_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisUnit() <em>YAxis Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String YAXIS_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAxisUnit() <em>YAxis Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisUnit()
	 * @generated
	 * @ordered
	 */
	protected String yAxisUnit = YAXIS_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIME_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected Long timeInterval = TIME_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VTLStatisticalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VTLStatisticalData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_STATISTICAL_DATA__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataFormat() {
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFormat(Integer newDataFormat) {
		Integer oldDataFormat = dataFormat;
		dataFormat = newDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_STATISTICAL_DATA__DATA_FORMAT, oldDataFormat, dataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXAxisName() {
		return xAxisName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXAxisName(String newXAxisName) {
		String oldXAxisName = xAxisName;
		xAxisName = newXAxisName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_NAME, oldXAxisName, xAxisName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYAxisName() {
		return yAxisName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYAxisName(String newYAxisName) {
		String oldYAxisName = yAxisName;
		yAxisName = newYAxisName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_NAME, oldYAxisName, yAxisName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXAxisUnit() {
		return xAxisUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXAxisUnit(String newXAxisUnit) {
		String oldXAxisUnit = xAxisUnit;
		xAxisUnit = newXAxisUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_UNIT, oldXAxisUnit, xAxisUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYAxisUnit() {
		return yAxisUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYAxisUnit(String newYAxisUnit) {
		String oldYAxisUnit = yAxisUnit;
		yAxisUnit = newYAxisUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_UNIT, oldYAxisUnit, yAxisUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(String newStartTime) {
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_STATISTICAL_DATA__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeInterval(Long newTimeInterval) {
		Long oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_STATISTICAL_DATA__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VTL_STATISTICAL_DATA__DATA:
				return getData();
			case CimPackage.CIM_VTL_STATISTICAL_DATA__DATA_FORMAT:
				return getDataFormat();
			case CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_NAME:
				return getXAxisName();
			case CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_NAME:
				return getYAxisName();
			case CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_UNIT:
				return getXAxisUnit();
			case CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_UNIT:
				return getYAxisUnit();
			case CimPackage.CIM_VTL_STATISTICAL_DATA__START_TIME:
				return getStartTime();
			case CimPackage.CIM_VTL_STATISTICAL_DATA__TIME_INTERVAL:
				return getTimeInterval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_VTL_STATISTICAL_DATA__DATA:
				setData((String)newValue);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__DATA_FORMAT:
				setDataFormat((Integer)newValue);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_NAME:
				setXAxisName((String)newValue);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_NAME:
				setYAxisName((String)newValue);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_UNIT:
				setXAxisUnit((String)newValue);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_UNIT:
				setYAxisUnit((String)newValue);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__START_TIME:
				setStartTime((String)newValue);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__TIME_INTERVAL:
				setTimeInterval((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_VTL_STATISTICAL_DATA__DATA:
				setData(DATA_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__DATA_FORMAT:
				setDataFormat(DATA_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_NAME:
				setXAxisName(XAXIS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_NAME:
				setYAxisName(YAXIS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_UNIT:
				setXAxisUnit(XAXIS_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_UNIT:
				setYAxisUnit(YAXIS_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_VTL_STATISTICAL_DATA__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case CimPackage.CIM_VTL_STATISTICAL_DATA__DATA_FORMAT:
				return DATA_FORMAT_EDEFAULT == null ? dataFormat != null : !DATA_FORMAT_EDEFAULT.equals(dataFormat);
			case CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_NAME:
				return XAXIS_NAME_EDEFAULT == null ? xAxisName != null : !XAXIS_NAME_EDEFAULT.equals(xAxisName);
			case CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_NAME:
				return YAXIS_NAME_EDEFAULT == null ? yAxisName != null : !YAXIS_NAME_EDEFAULT.equals(yAxisName);
			case CimPackage.CIM_VTL_STATISTICAL_DATA__XAXIS_UNIT:
				return XAXIS_UNIT_EDEFAULT == null ? xAxisUnit != null : !XAXIS_UNIT_EDEFAULT.equals(xAxisUnit);
			case CimPackage.CIM_VTL_STATISTICAL_DATA__YAXIS_UNIT:
				return YAXIS_UNIT_EDEFAULT == null ? yAxisUnit != null : !YAXIS_UNIT_EDEFAULT.equals(yAxisUnit);
			case CimPackage.CIM_VTL_STATISTICAL_DATA__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CimPackage.CIM_VTL_STATISTICAL_DATA__TIME_INTERVAL:
				return TIME_INTERVAL_EDEFAULT == null ? timeInterval != null : !TIME_INTERVAL_EDEFAULT.equals(timeInterval);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Data: ");
		result.append(data);
		result.append(", DataFormat: ");
		result.append(dataFormat);
		result.append(", XAxisName: ");
		result.append(xAxisName);
		result.append(", YAxisName: ");
		result.append(yAxisName);
		result.append(", XAxisUnit: ");
		result.append(xAxisUnit);
		result.append(", YAxisUnit: ");
		result.append(yAxisUnit);
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(", TimeInterval: ");
		result.append(timeInterval);
		result.append(')');
		return result.toString();
	}

} //CIM_VTLStatisticalDataImpl
