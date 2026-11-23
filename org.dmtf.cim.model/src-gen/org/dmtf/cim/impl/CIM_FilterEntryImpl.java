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

import org.dmtf.cim.CIM_FilterEntry;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FilterEntryImpl#getTrafficType <em>Traffic Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FilterEntryImpl#getOtherTrafficType <em>Other Traffic Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FilterEntryImpl#getMatchConditionType <em>Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FilterEntryImpl#getOtherMatchConditionType <em>Other Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FilterEntryImpl#getMatchConditionValue <em>Match Condition Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FilterEntryImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FilterEntryImpl#getDefaultFilter <em>Default Filter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FilterEntryImpl#getTrafficClass <em>Traffic Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FilterEntryImpl extends CIM_FilterEntryBaseImpl implements CIM_FilterEntry {
	/**
	 * The default value of the '{@link #getTrafficType() <em>Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRAFFIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrafficType() <em>Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficType()
	 * @generated
	 * @ordered
	 */
	protected Integer trafficType = TRAFFIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTrafficType() <em>Other Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTrafficType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TRAFFIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTrafficType() <em>Other Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTrafficType()
	 * @generated
	 * @ordered
	 */
	protected String otherTrafficType = OTHER_TRAFFIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchConditionType() <em>Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MATCH_CONDITION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchConditionType() <em>Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected Integer matchConditionType = MATCH_CONDITION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherMatchConditionType() <em>Other Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_MATCH_CONDITION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherMatchConditionType() <em>Other Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected String otherMatchConditionType = OTHER_MATCH_CONDITION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchConditionValue() <em>Match Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_CONDITION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchConditionValue() <em>Match Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionValue()
	 * @generated
	 * @ordered
	 */
	protected String matchConditionValue = MATCH_CONDITION_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Integer action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFilter() <em>Default Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFilter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEFAULT_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultFilter() <em>Default Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFilter()
	 * @generated
	 * @ordered
	 */
	protected Boolean defaultFilter = DEFAULT_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrafficClass() <em>Traffic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAFFIC_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrafficClass() <em>Traffic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficClass()
	 * @generated
	 * @ordered
	 */
	protected String trafficClass = TRAFFIC_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FilterEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FilterEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTrafficType() {
		return trafficType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafficType(Integer newTrafficType) {
		Integer oldTrafficType = trafficType;
		trafficType = newTrafficType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILTER_ENTRY__TRAFFIC_TYPE, oldTrafficType, trafficType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTrafficType() {
		return otherTrafficType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTrafficType(String newOtherTrafficType) {
		String oldOtherTrafficType = otherTrafficType;
		otherTrafficType = newOtherTrafficType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILTER_ENTRY__OTHER_TRAFFIC_TYPE, oldOtherTrafficType, otherTrafficType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMatchConditionType() {
		return matchConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchConditionType(Integer newMatchConditionType) {
		Integer oldMatchConditionType = matchConditionType;
		matchConditionType = newMatchConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_TYPE, oldMatchConditionType, matchConditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherMatchConditionType() {
		return otherMatchConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherMatchConditionType(String newOtherMatchConditionType) {
		String oldOtherMatchConditionType = otherMatchConditionType;
		otherMatchConditionType = newOtherMatchConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE, oldOtherMatchConditionType, otherMatchConditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatchConditionValue() {
		return matchConditionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchConditionValue(String newMatchConditionValue) {
		String oldMatchConditionValue = matchConditionValue;
		matchConditionValue = newMatchConditionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_VALUE, oldMatchConditionValue, matchConditionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(Integer newAction) {
		Integer oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILTER_ENTRY__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDefaultFilter() {
		return defaultFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFilter(Boolean newDefaultFilter) {
		Boolean oldDefaultFilter = defaultFilter;
		defaultFilter = newDefaultFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILTER_ENTRY__DEFAULT_FILTER, oldDefaultFilter, defaultFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrafficClass() {
		return trafficClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafficClass(String newTrafficClass) {
		String oldTrafficClass = trafficClass;
		trafficClass = newTrafficClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILTER_ENTRY__TRAFFIC_CLASS, oldTrafficClass, trafficClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILTER_ENTRY__TRAFFIC_TYPE:
				return getTrafficType();
			case CimPackage.CIM_FILTER_ENTRY__OTHER_TRAFFIC_TYPE:
				return getOtherTrafficType();
			case CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_TYPE:
				return getMatchConditionType();
			case CimPackage.CIM_FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE:
				return getOtherMatchConditionType();
			case CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_VALUE:
				return getMatchConditionValue();
			case CimPackage.CIM_FILTER_ENTRY__ACTION:
				return getAction();
			case CimPackage.CIM_FILTER_ENTRY__DEFAULT_FILTER:
				return getDefaultFilter();
			case CimPackage.CIM_FILTER_ENTRY__TRAFFIC_CLASS:
				return getTrafficClass();
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
			case CimPackage.CIM_FILTER_ENTRY__TRAFFIC_TYPE:
				setTrafficType((Integer)newValue);
				return;
			case CimPackage.CIM_FILTER_ENTRY__OTHER_TRAFFIC_TYPE:
				setOtherTrafficType((String)newValue);
				return;
			case CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_TYPE:
				setMatchConditionType((Integer)newValue);
				return;
			case CimPackage.CIM_FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE:
				setOtherMatchConditionType((String)newValue);
				return;
			case CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_VALUE:
				setMatchConditionValue((String)newValue);
				return;
			case CimPackage.CIM_FILTER_ENTRY__ACTION:
				setAction((Integer)newValue);
				return;
			case CimPackage.CIM_FILTER_ENTRY__DEFAULT_FILTER:
				setDefaultFilter((Boolean)newValue);
				return;
			case CimPackage.CIM_FILTER_ENTRY__TRAFFIC_CLASS:
				setTrafficClass((String)newValue);
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
			case CimPackage.CIM_FILTER_ENTRY__TRAFFIC_TYPE:
				setTrafficType(TRAFFIC_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILTER_ENTRY__OTHER_TRAFFIC_TYPE:
				setOtherTrafficType(OTHER_TRAFFIC_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_TYPE:
				setMatchConditionType(MATCH_CONDITION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE:
				setOtherMatchConditionType(OTHER_MATCH_CONDITION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_VALUE:
				setMatchConditionValue(MATCH_CONDITION_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_FILTER_ENTRY__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_FILTER_ENTRY__DEFAULT_FILTER:
				setDefaultFilter(DEFAULT_FILTER_EDEFAULT);
				return;
			case CimPackage.CIM_FILTER_ENTRY__TRAFFIC_CLASS:
				setTrafficClass(TRAFFIC_CLASS_EDEFAULT);
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
			case CimPackage.CIM_FILTER_ENTRY__TRAFFIC_TYPE:
				return TRAFFIC_TYPE_EDEFAULT == null ? trafficType != null : !TRAFFIC_TYPE_EDEFAULT.equals(trafficType);
			case CimPackage.CIM_FILTER_ENTRY__OTHER_TRAFFIC_TYPE:
				return OTHER_TRAFFIC_TYPE_EDEFAULT == null ? otherTrafficType != null : !OTHER_TRAFFIC_TYPE_EDEFAULT.equals(otherTrafficType);
			case CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_TYPE:
				return MATCH_CONDITION_TYPE_EDEFAULT == null ? matchConditionType != null : !MATCH_CONDITION_TYPE_EDEFAULT.equals(matchConditionType);
			case CimPackage.CIM_FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE:
				return OTHER_MATCH_CONDITION_TYPE_EDEFAULT == null ? otherMatchConditionType != null : !OTHER_MATCH_CONDITION_TYPE_EDEFAULT.equals(otherMatchConditionType);
			case CimPackage.CIM_FILTER_ENTRY__MATCH_CONDITION_VALUE:
				return MATCH_CONDITION_VALUE_EDEFAULT == null ? matchConditionValue != null : !MATCH_CONDITION_VALUE_EDEFAULT.equals(matchConditionValue);
			case CimPackage.CIM_FILTER_ENTRY__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case CimPackage.CIM_FILTER_ENTRY__DEFAULT_FILTER:
				return DEFAULT_FILTER_EDEFAULT == null ? defaultFilter != null : !DEFAULT_FILTER_EDEFAULT.equals(defaultFilter);
			case CimPackage.CIM_FILTER_ENTRY__TRAFFIC_CLASS:
				return TRAFFIC_CLASS_EDEFAULT == null ? trafficClass != null : !TRAFFIC_CLASS_EDEFAULT.equals(trafficClass);
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
		result.append(" (TrafficType: ");
		result.append(trafficType);
		result.append(", OtherTrafficType: ");
		result.append(otherTrafficType);
		result.append(", MatchConditionType: ");
		result.append(matchConditionType);
		result.append(", OtherMatchConditionType: ");
		result.append(otherMatchConditionType);
		result.append(", MatchConditionValue: ");
		result.append(matchConditionValue);
		result.append(", Action: ");
		result.append(action);
		result.append(", DefaultFilter: ");
		result.append(defaultFilter);
		result.append(", TrafficClass: ");
		result.append(trafficClass);
		result.append(')');
		return result.toString();
	}

} //CIM_FilterEntryImpl
