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

import java.util.Collection;

import org.dmtf.cim.CIM_PolicyTimePeriodCondition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Policy Time Period Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyTimePeriodConditionImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyTimePeriodConditionImpl#getMonthOfYearMask <em>Month Of Year Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyTimePeriodConditionImpl#getDayOfMonthMask <em>Day Of Month Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyTimePeriodConditionImpl#getDayOfWeekMask <em>Day Of Week Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyTimePeriodConditionImpl#getTimeOfDayMask <em>Time Of Day Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyTimePeriodConditionImpl#getLocalOrUtcTime <em>Local Or Utc Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PolicyTimePeriodConditionImpl extends CIM_PolicyConditionImpl implements CIM_PolicyTimePeriodCondition {
	/**
	 * The default value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected String timePeriod = TIME_PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonthOfYearMask() <em>Month Of Year Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthOfYearMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> monthOfYearMask;

	/**
	 * The cached value of the '{@link #getDayOfMonthMask() <em>Day Of Month Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfMonthMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dayOfMonthMask;

	/**
	 * The cached value of the '{@link #getDayOfWeekMask() <em>Day Of Week Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeekMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dayOfWeekMask;

	/**
	 * The default value of the '{@link #getTimeOfDayMask() <em>Time Of Day Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDayMask()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_DAY_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfDayMask() <em>Time Of Day Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDayMask()
	 * @generated
	 * @ordered
	 */
	protected String timeOfDayMask = TIME_OF_DAY_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalOrUtcTime() <em>Local Or Utc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOrUtcTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCAL_OR_UTC_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalOrUtcTime() <em>Local Or Utc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOrUtcTime()
	 * @generated
	 * @ordered
	 */
	protected Integer localOrUtcTime = LOCAL_OR_UTC_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PolicyTimePeriodConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PolicyTimePeriodCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimePeriod(String newTimePeriod) {
		String oldTimePeriod = timePeriod;
		timePeriod = newTimePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_PERIOD, oldTimePeriod, timePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMonthOfYearMask() {
		if (monthOfYearMask == null) {
			monthOfYearMask = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__MONTH_OF_YEAR_MASK);
		}
		return monthOfYearMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDayOfMonthMask() {
		if (dayOfMonthMask == null) {
			dayOfMonthMask = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_MONTH_MASK);
		}
		return dayOfMonthMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDayOfWeekMask() {
		if (dayOfWeekMask == null) {
			dayOfWeekMask = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_WEEK_MASK);
		}
		return dayOfWeekMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfDayMask() {
		return timeOfDayMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfDayMask(String newTimeOfDayMask) {
		String oldTimeOfDayMask = timeOfDayMask;
		timeOfDayMask = newTimeOfDayMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_OF_DAY_MASK, oldTimeOfDayMask, timeOfDayMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocalOrUtcTime() {
		return localOrUtcTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalOrUtcTime(Integer newLocalOrUtcTime) {
		Integer oldLocalOrUtcTime = localOrUtcTime;
		localOrUtcTime = newLocalOrUtcTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__LOCAL_OR_UTC_TIME, oldLocalOrUtcTime, localOrUtcTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_PERIOD:
				return getTimePeriod();
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__MONTH_OF_YEAR_MASK:
				return getMonthOfYearMask();
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_MONTH_MASK:
				return getDayOfMonthMask();
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_WEEK_MASK:
				return getDayOfWeekMask();
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_OF_DAY_MASK:
				return getTimeOfDayMask();
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__LOCAL_OR_UTC_TIME:
				return getLocalOrUtcTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_PERIOD:
				setTimePeriod((String)newValue);
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__MONTH_OF_YEAR_MASK:
				getMonthOfYearMask().clear();
				getMonthOfYearMask().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_MONTH_MASK:
				getDayOfMonthMask().clear();
				getDayOfMonthMask().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_WEEK_MASK:
				getDayOfWeekMask().clear();
				getDayOfWeekMask().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_OF_DAY_MASK:
				setTimeOfDayMask((String)newValue);
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__LOCAL_OR_UTC_TIME:
				setLocalOrUtcTime((Integer)newValue);
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
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_PERIOD:
				setTimePeriod(TIME_PERIOD_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__MONTH_OF_YEAR_MASK:
				getMonthOfYearMask().clear();
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_MONTH_MASK:
				getDayOfMonthMask().clear();
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_WEEK_MASK:
				getDayOfWeekMask().clear();
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_OF_DAY_MASK:
				setTimeOfDayMask(TIME_OF_DAY_MASK_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__LOCAL_OR_UTC_TIME:
				setLocalOrUtcTime(LOCAL_OR_UTC_TIME_EDEFAULT);
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
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_PERIOD:
				return TIME_PERIOD_EDEFAULT == null ? timePeriod != null : !TIME_PERIOD_EDEFAULT.equals(timePeriod);
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__MONTH_OF_YEAR_MASK:
				return monthOfYearMask != null && !monthOfYearMask.isEmpty();
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_MONTH_MASK:
				return dayOfMonthMask != null && !dayOfMonthMask.isEmpty();
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__DAY_OF_WEEK_MASK:
				return dayOfWeekMask != null && !dayOfWeekMask.isEmpty();
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__TIME_OF_DAY_MASK:
				return TIME_OF_DAY_MASK_EDEFAULT == null ? timeOfDayMask != null : !TIME_OF_DAY_MASK_EDEFAULT.equals(timeOfDayMask);
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION__LOCAL_OR_UTC_TIME:
				return LOCAL_OR_UTC_TIME_EDEFAULT == null ? localOrUtcTime != null : !LOCAL_OR_UTC_TIME_EDEFAULT.equals(localOrUtcTime);
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
		result.append(" (TimePeriod: ");
		result.append(timePeriod);
		result.append(", MonthOfYearMask: ");
		result.append(monthOfYearMask);
		result.append(", DayOfMonthMask: ");
		result.append(dayOfMonthMask);
		result.append(", DayOfWeekMask: ");
		result.append(dayOfWeekMask);
		result.append(", TimeOfDayMask: ");
		result.append(timeOfDayMask);
		result.append(", LocalOrUtcTime: ");
		result.append(localOrUtcTime);
		result.append(')');
		return result.toString();
	}

} //CIM_PolicyTimePeriodConditionImpl
