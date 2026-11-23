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

import org.dmtf.cim.CIM_TimeZone;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Time Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getTimeZoneID <em>Time Zone ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getTimeZoneStartDate <em>Time Zone Start Date</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getStandardName <em>Standard Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getStandardCaption <em>Standard Caption</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getStandardOffset <em>Standard Offset</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getStandardMonth <em>Standard Month</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getStandardDay <em>Standard Day</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getStandardDayOfWeek <em>Standard Day Of Week</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getStandardStartInterval <em>Standard Start Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getDaylightName <em>Daylight Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getDaylightCaption <em>Daylight Caption</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getDaylightOffset <em>Daylight Offset</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getDaylightMonth <em>Daylight Month</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getDaylightDay <em>Daylight Day</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getDaylightDayOfWeek <em>Daylight Day Of Week</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TimeZoneImpl#getDaylightStartInterval <em>Daylight Start Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TimeZoneImpl extends CIM_SettingImpl implements CIM_TimeZone {
	/**
	 * The default value of the '{@link #getTimeZoneID() <em>Time Zone ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneID()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ZONE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeZoneID() <em>Time Zone ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneID()
	 * @generated
	 * @ordered
	 */
	protected String timeZoneID = TIME_ZONE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeZoneStartDate() <em>Time Zone Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ZONE_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeZoneStartDate() <em>Time Zone Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneStartDate()
	 * @generated
	 * @ordered
	 */
	protected String timeZoneStartDate = TIME_ZONE_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardName() <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardName()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardName() <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardName()
	 * @generated
	 * @ordered
	 */
	protected String standardName = STANDARD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardCaption() <em>Standard Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardCaption() <em>Standard Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCaption()
	 * @generated
	 * @ordered
	 */
	protected String standardCaption = STANDARD_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardOffset() <em>Standard Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STANDARD_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardOffset() <em>Standard Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer standardOffset = STANDARD_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardMonth() <em>Standard Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STANDARD_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardMonth() <em>Standard Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardMonth()
	 * @generated
	 * @ordered
	 */
	protected Integer standardMonth = STANDARD_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardDay() <em>Standard Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STANDARD_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardDay() <em>Standard Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDay()
	 * @generated
	 * @ordered
	 */
	protected Integer standardDay = STANDARD_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardDayOfWeek() <em>Standard Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STANDARD_DAY_OF_WEEK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardDayOfWeek() <em>Standard Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected Integer standardDayOfWeek = STANDARD_DAY_OF_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardStartInterval() <em>Standard Start Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardStartInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_START_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardStartInterval() <em>Standard Start Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardStartInterval()
	 * @generated
	 * @ordered
	 */
	protected String standardStartInterval = STANDARD_START_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaylightName() <em>Daylight Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightName()
	 * @generated
	 * @ordered
	 */
	protected static final String DAYLIGHT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylightName() <em>Daylight Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightName()
	 * @generated
	 * @ordered
	 */
	protected String daylightName = DAYLIGHT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaylightCaption() <em>Daylight Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String DAYLIGHT_CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylightCaption() <em>Daylight Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightCaption()
	 * @generated
	 * @ordered
	 */
	protected String daylightCaption = DAYLIGHT_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaylightOffset() <em>Daylight Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DAYLIGHT_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylightOffset() <em>Daylight Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer daylightOffset = DAYLIGHT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaylightMonth() <em>Daylight Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DAYLIGHT_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylightMonth() <em>Daylight Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightMonth()
	 * @generated
	 * @ordered
	 */
	protected Integer daylightMonth = DAYLIGHT_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaylightDay() <em>Daylight Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DAYLIGHT_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylightDay() <em>Daylight Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightDay()
	 * @generated
	 * @ordered
	 */
	protected Integer daylightDay = DAYLIGHT_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaylightDayOfWeek() <em>Daylight Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DAYLIGHT_DAY_OF_WEEK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylightDayOfWeek() <em>Daylight Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected Integer daylightDayOfWeek = DAYLIGHT_DAY_OF_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaylightStartInterval() <em>Daylight Start Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightStartInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String DAYLIGHT_START_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylightStartInterval() <em>Daylight Start Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightStartInterval()
	 * @generated
	 * @ordered
	 */
	protected String daylightStartInterval = DAYLIGHT_START_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TimeZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TimeZone();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeZoneID() {
		return timeZoneID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeZoneID(String newTimeZoneID) {
		String oldTimeZoneID = timeZoneID;
		timeZoneID = newTimeZoneID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__TIME_ZONE_ID, oldTimeZoneID, timeZoneID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeZoneStartDate() {
		return timeZoneStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeZoneStartDate(String newTimeZoneStartDate) {
		String oldTimeZoneStartDate = timeZoneStartDate;
		timeZoneStartDate = newTimeZoneStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__TIME_ZONE_START_DATE, oldTimeZoneStartDate, timeZoneStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandardName() {
		return standardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardName(String newStandardName) {
		String oldStandardName = standardName;
		standardName = newStandardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__STANDARD_NAME, oldStandardName, standardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandardCaption() {
		return standardCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardCaption(String newStandardCaption) {
		String oldStandardCaption = standardCaption;
		standardCaption = newStandardCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__STANDARD_CAPTION, oldStandardCaption, standardCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStandardOffset() {
		return standardOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardOffset(Integer newStandardOffset) {
		Integer oldStandardOffset = standardOffset;
		standardOffset = newStandardOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__STANDARD_OFFSET, oldStandardOffset, standardOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStandardMonth() {
		return standardMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardMonth(Integer newStandardMonth) {
		Integer oldStandardMonth = standardMonth;
		standardMonth = newStandardMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__STANDARD_MONTH, oldStandardMonth, standardMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStandardDay() {
		return standardDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardDay(Integer newStandardDay) {
		Integer oldStandardDay = standardDay;
		standardDay = newStandardDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__STANDARD_DAY, oldStandardDay, standardDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStandardDayOfWeek() {
		return standardDayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardDayOfWeek(Integer newStandardDayOfWeek) {
		Integer oldStandardDayOfWeek = standardDayOfWeek;
		standardDayOfWeek = newStandardDayOfWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__STANDARD_DAY_OF_WEEK, oldStandardDayOfWeek, standardDayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandardStartInterval() {
		return standardStartInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardStartInterval(String newStandardStartInterval) {
		String oldStandardStartInterval = standardStartInterval;
		standardStartInterval = newStandardStartInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__STANDARD_START_INTERVAL, oldStandardStartInterval, standardStartInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDaylightName() {
		return daylightName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaylightName(String newDaylightName) {
		String oldDaylightName = daylightName;
		daylightName = newDaylightName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__DAYLIGHT_NAME, oldDaylightName, daylightName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDaylightCaption() {
		return daylightCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaylightCaption(String newDaylightCaption) {
		String oldDaylightCaption = daylightCaption;
		daylightCaption = newDaylightCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__DAYLIGHT_CAPTION, oldDaylightCaption, daylightCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDaylightOffset() {
		return daylightOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaylightOffset(Integer newDaylightOffset) {
		Integer oldDaylightOffset = daylightOffset;
		daylightOffset = newDaylightOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__DAYLIGHT_OFFSET, oldDaylightOffset, daylightOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDaylightMonth() {
		return daylightMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaylightMonth(Integer newDaylightMonth) {
		Integer oldDaylightMonth = daylightMonth;
		daylightMonth = newDaylightMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__DAYLIGHT_MONTH, oldDaylightMonth, daylightMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDaylightDay() {
		return daylightDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaylightDay(Integer newDaylightDay) {
		Integer oldDaylightDay = daylightDay;
		daylightDay = newDaylightDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY, oldDaylightDay, daylightDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDaylightDayOfWeek() {
		return daylightDayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaylightDayOfWeek(Integer newDaylightDayOfWeek) {
		Integer oldDaylightDayOfWeek = daylightDayOfWeek;
		daylightDayOfWeek = newDaylightDayOfWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY_OF_WEEK, oldDaylightDayOfWeek, daylightDayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDaylightStartInterval() {
		return daylightStartInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaylightStartInterval(String newDaylightStartInterval) {
		String oldDaylightStartInterval = daylightStartInterval;
		daylightStartInterval = newDaylightStartInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIME_ZONE__DAYLIGHT_START_INTERVAL, oldDaylightStartInterval, daylightStartInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TIME_ZONE__TIME_ZONE_ID:
				return getTimeZoneID();
			case CimPackage.CIM_TIME_ZONE__TIME_ZONE_START_DATE:
				return getTimeZoneStartDate();
			case CimPackage.CIM_TIME_ZONE__STANDARD_NAME:
				return getStandardName();
			case CimPackage.CIM_TIME_ZONE__STANDARD_CAPTION:
				return getStandardCaption();
			case CimPackage.CIM_TIME_ZONE__STANDARD_OFFSET:
				return getStandardOffset();
			case CimPackage.CIM_TIME_ZONE__STANDARD_MONTH:
				return getStandardMonth();
			case CimPackage.CIM_TIME_ZONE__STANDARD_DAY:
				return getStandardDay();
			case CimPackage.CIM_TIME_ZONE__STANDARD_DAY_OF_WEEK:
				return getStandardDayOfWeek();
			case CimPackage.CIM_TIME_ZONE__STANDARD_START_INTERVAL:
				return getStandardStartInterval();
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_NAME:
				return getDaylightName();
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_CAPTION:
				return getDaylightCaption();
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_OFFSET:
				return getDaylightOffset();
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_MONTH:
				return getDaylightMonth();
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY:
				return getDaylightDay();
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY_OF_WEEK:
				return getDaylightDayOfWeek();
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_START_INTERVAL:
				return getDaylightStartInterval();
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
			case CimPackage.CIM_TIME_ZONE__TIME_ZONE_ID:
				setTimeZoneID((String)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__TIME_ZONE_START_DATE:
				setTimeZoneStartDate((String)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_NAME:
				setStandardName((String)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_CAPTION:
				setStandardCaption((String)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_OFFSET:
				setStandardOffset((Integer)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_MONTH:
				setStandardMonth((Integer)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_DAY:
				setStandardDay((Integer)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_DAY_OF_WEEK:
				setStandardDayOfWeek((Integer)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_START_INTERVAL:
				setStandardStartInterval((String)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_NAME:
				setDaylightName((String)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_CAPTION:
				setDaylightCaption((String)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_OFFSET:
				setDaylightOffset((Integer)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_MONTH:
				setDaylightMonth((Integer)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY:
				setDaylightDay((Integer)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY_OF_WEEK:
				setDaylightDayOfWeek((Integer)newValue);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_START_INTERVAL:
				setDaylightStartInterval((String)newValue);
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
			case CimPackage.CIM_TIME_ZONE__TIME_ZONE_ID:
				setTimeZoneID(TIME_ZONE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__TIME_ZONE_START_DATE:
				setTimeZoneStartDate(TIME_ZONE_START_DATE_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_NAME:
				setStandardName(STANDARD_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_CAPTION:
				setStandardCaption(STANDARD_CAPTION_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_OFFSET:
				setStandardOffset(STANDARD_OFFSET_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_MONTH:
				setStandardMonth(STANDARD_MONTH_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_DAY:
				setStandardDay(STANDARD_DAY_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_DAY_OF_WEEK:
				setStandardDayOfWeek(STANDARD_DAY_OF_WEEK_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__STANDARD_START_INTERVAL:
				setStandardStartInterval(STANDARD_START_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_NAME:
				setDaylightName(DAYLIGHT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_CAPTION:
				setDaylightCaption(DAYLIGHT_CAPTION_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_OFFSET:
				setDaylightOffset(DAYLIGHT_OFFSET_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_MONTH:
				setDaylightMonth(DAYLIGHT_MONTH_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY:
				setDaylightDay(DAYLIGHT_DAY_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY_OF_WEEK:
				setDaylightDayOfWeek(DAYLIGHT_DAY_OF_WEEK_EDEFAULT);
				return;
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_START_INTERVAL:
				setDaylightStartInterval(DAYLIGHT_START_INTERVAL_EDEFAULT);
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
			case CimPackage.CIM_TIME_ZONE__TIME_ZONE_ID:
				return TIME_ZONE_ID_EDEFAULT == null ? timeZoneID != null : !TIME_ZONE_ID_EDEFAULT.equals(timeZoneID);
			case CimPackage.CIM_TIME_ZONE__TIME_ZONE_START_DATE:
				return TIME_ZONE_START_DATE_EDEFAULT == null ? timeZoneStartDate != null : !TIME_ZONE_START_DATE_EDEFAULT.equals(timeZoneStartDate);
			case CimPackage.CIM_TIME_ZONE__STANDARD_NAME:
				return STANDARD_NAME_EDEFAULT == null ? standardName != null : !STANDARD_NAME_EDEFAULT.equals(standardName);
			case CimPackage.CIM_TIME_ZONE__STANDARD_CAPTION:
				return STANDARD_CAPTION_EDEFAULT == null ? standardCaption != null : !STANDARD_CAPTION_EDEFAULT.equals(standardCaption);
			case CimPackage.CIM_TIME_ZONE__STANDARD_OFFSET:
				return STANDARD_OFFSET_EDEFAULT == null ? standardOffset != null : !STANDARD_OFFSET_EDEFAULT.equals(standardOffset);
			case CimPackage.CIM_TIME_ZONE__STANDARD_MONTH:
				return STANDARD_MONTH_EDEFAULT == null ? standardMonth != null : !STANDARD_MONTH_EDEFAULT.equals(standardMonth);
			case CimPackage.CIM_TIME_ZONE__STANDARD_DAY:
				return STANDARD_DAY_EDEFAULT == null ? standardDay != null : !STANDARD_DAY_EDEFAULT.equals(standardDay);
			case CimPackage.CIM_TIME_ZONE__STANDARD_DAY_OF_WEEK:
				return STANDARD_DAY_OF_WEEK_EDEFAULT == null ? standardDayOfWeek != null : !STANDARD_DAY_OF_WEEK_EDEFAULT.equals(standardDayOfWeek);
			case CimPackage.CIM_TIME_ZONE__STANDARD_START_INTERVAL:
				return STANDARD_START_INTERVAL_EDEFAULT == null ? standardStartInterval != null : !STANDARD_START_INTERVAL_EDEFAULT.equals(standardStartInterval);
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_NAME:
				return DAYLIGHT_NAME_EDEFAULT == null ? daylightName != null : !DAYLIGHT_NAME_EDEFAULT.equals(daylightName);
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_CAPTION:
				return DAYLIGHT_CAPTION_EDEFAULT == null ? daylightCaption != null : !DAYLIGHT_CAPTION_EDEFAULT.equals(daylightCaption);
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_OFFSET:
				return DAYLIGHT_OFFSET_EDEFAULT == null ? daylightOffset != null : !DAYLIGHT_OFFSET_EDEFAULT.equals(daylightOffset);
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_MONTH:
				return DAYLIGHT_MONTH_EDEFAULT == null ? daylightMonth != null : !DAYLIGHT_MONTH_EDEFAULT.equals(daylightMonth);
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY:
				return DAYLIGHT_DAY_EDEFAULT == null ? daylightDay != null : !DAYLIGHT_DAY_EDEFAULT.equals(daylightDay);
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_DAY_OF_WEEK:
				return DAYLIGHT_DAY_OF_WEEK_EDEFAULT == null ? daylightDayOfWeek != null : !DAYLIGHT_DAY_OF_WEEK_EDEFAULT.equals(daylightDayOfWeek);
			case CimPackage.CIM_TIME_ZONE__DAYLIGHT_START_INTERVAL:
				return DAYLIGHT_START_INTERVAL_EDEFAULT == null ? daylightStartInterval != null : !DAYLIGHT_START_INTERVAL_EDEFAULT.equals(daylightStartInterval);
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
		result.append(" (TimeZoneID: ");
		result.append(timeZoneID);
		result.append(", TimeZoneStartDate: ");
		result.append(timeZoneStartDate);
		result.append(", StandardName: ");
		result.append(standardName);
		result.append(", StandardCaption: ");
		result.append(standardCaption);
		result.append(", StandardOffset: ");
		result.append(standardOffset);
		result.append(", StandardMonth: ");
		result.append(standardMonth);
		result.append(", StandardDay: ");
		result.append(standardDay);
		result.append(", StandardDayOfWeek: ");
		result.append(standardDayOfWeek);
		result.append(", StandardStartInterval: ");
		result.append(standardStartInterval);
		result.append(", DaylightName: ");
		result.append(daylightName);
		result.append(", DaylightCaption: ");
		result.append(daylightCaption);
		result.append(", DaylightOffset: ");
		result.append(daylightOffset);
		result.append(", DaylightMonth: ");
		result.append(daylightMonth);
		result.append(", DaylightDay: ");
		result.append(daylightDay);
		result.append(", DaylightDayOfWeek: ");
		result.append(daylightDayOfWeek);
		result.append(", DaylightStartInterval: ");
		result.append(daylightStartInterval);
		result.append(')');
		return result.toString();
	}

} //CIM_TimeZoneImpl
