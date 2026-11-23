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

import org.dmtf.cim.CIM_BGPRouteMap;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Route Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPRouteMapImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPRouteMapImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPRouteMapImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPRouteMapImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPRouteMapImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPRouteMapImpl#getMatchConditionType <em>Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPRouteMapImpl#getOtherMatchConditionType <em>Other Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPRouteMapImpl#getSetMetricType <em>Set Metric Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPRouteMapImpl#getSetMetricValue <em>Set Metric Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPRouteMapImpl extends CIM_LogicalElementImpl implements CIM_BGPRouteMap {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Integer direction = DIRECTION_EDEFAULT;

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
	 * The default value of the '{@link #getSetMetricType() <em>Set Metric Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMetricType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SET_METRIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetMetricType() <em>Set Metric Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMetricType()
	 * @generated
	 * @ordered
	 */
	protected Integer setMetricType = SET_METRIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetMetricValue() <em>Set Metric Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMetricValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_METRIC_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetMetricValue() <em>Set Metric Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMetricValue()
	 * @generated
	 * @ordered
	 */
	protected String setMetricValue = SET_METRIC_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPRouteMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPRouteMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ROUTE_MAP__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(Integer newDirection) {
		Integer oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ROUTE_MAP__DIRECTION, oldDirection, direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ROUTE_MAP__ACTION, oldAction, action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ROUTE_MAP__MATCH_CONDITION_TYPE, oldMatchConditionType, matchConditionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ROUTE_MAP__OTHER_MATCH_CONDITION_TYPE, oldOtherMatchConditionType, otherMatchConditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSetMetricType() {
		return setMetricType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetMetricType(Integer newSetMetricType) {
		Integer oldSetMetricType = setMetricType;
		setMetricType = newSetMetricType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_TYPE, oldSetMetricType, setMetricType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSetMetricValue() {
		return setMetricValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetMetricValue(String newSetMetricValue) {
		String oldSetMetricValue = setMetricValue;
		setMetricValue = newSetMetricValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_VALUE, oldSetMetricValue, setMetricValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_BGP_ROUTE_MAP__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_BGP_ROUTE_MAP__DIRECTION:
				return getDirection();
			case CimPackage.CIM_BGP_ROUTE_MAP__ACTION:
				return getAction();
			case CimPackage.CIM_BGP_ROUTE_MAP__MATCH_CONDITION_TYPE:
				return getMatchConditionType();
			case CimPackage.CIM_BGP_ROUTE_MAP__OTHER_MATCH_CONDITION_TYPE:
				return getOtherMatchConditionType();
			case CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_TYPE:
				return getSetMetricType();
			case CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_VALUE:
				return getSetMetricValue();
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
			case CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__DIRECTION:
				setDirection((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__ACTION:
				setAction((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__MATCH_CONDITION_TYPE:
				setMatchConditionType((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__OTHER_MATCH_CONDITION_TYPE:
				setOtherMatchConditionType((String)newValue);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_TYPE:
				setSetMetricType((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_VALUE:
				setSetMetricValue((String)newValue);
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
			case CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__MATCH_CONDITION_TYPE:
				setMatchConditionType(MATCH_CONDITION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__OTHER_MATCH_CONDITION_TYPE:
				setOtherMatchConditionType(OTHER_MATCH_CONDITION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_TYPE:
				setSetMetricType(SET_METRIC_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_VALUE:
				setSetMetricValue(SET_METRIC_VALUE_EDEFAULT);
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
			case CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_BGP_ROUTE_MAP__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_BGP_ROUTE_MAP__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_BGP_ROUTE_MAP__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case CimPackage.CIM_BGP_ROUTE_MAP__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case CimPackage.CIM_BGP_ROUTE_MAP__MATCH_CONDITION_TYPE:
				return MATCH_CONDITION_TYPE_EDEFAULT == null ? matchConditionType != null : !MATCH_CONDITION_TYPE_EDEFAULT.equals(matchConditionType);
			case CimPackage.CIM_BGP_ROUTE_MAP__OTHER_MATCH_CONDITION_TYPE:
				return OTHER_MATCH_CONDITION_TYPE_EDEFAULT == null ? otherMatchConditionType != null : !OTHER_MATCH_CONDITION_TYPE_EDEFAULT.equals(otherMatchConditionType);
			case CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_TYPE:
				return SET_METRIC_TYPE_EDEFAULT == null ? setMetricType != null : !SET_METRIC_TYPE_EDEFAULT.equals(setMetricType);
			case CimPackage.CIM_BGP_ROUTE_MAP__SET_METRIC_VALUE:
				return SET_METRIC_VALUE_EDEFAULT == null ? setMetricValue != null : !SET_METRIC_VALUE_EDEFAULT.equals(setMetricValue);
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", Direction: ");
		result.append(direction);
		result.append(", Action: ");
		result.append(action);
		result.append(", MatchConditionType: ");
		result.append(matchConditionType);
		result.append(", OtherMatchConditionType: ");
		result.append(otherMatchConditionType);
		result.append(", SetMetricType: ");
		result.append(setMetricType);
		result.append(", SetMetricValue: ");
		result.append(setMetricValue);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPRouteMapImpl
