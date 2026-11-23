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

import org.dmtf.cim.CIM_AutonomousSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Autonomous System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AutonomousSystemImpl#getASNumber <em>AS Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AutonomousSystemImpl#getIsSingleHomed <em>Is Single Homed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AutonomousSystemImpl#getIsTransit <em>Is Transit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AutonomousSystemImpl#getRequireIGPSync <em>Require IGP Sync</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AutonomousSystemImpl#getRoutingUpdateSource <em>Routing Update Source</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AutonomousSystemImpl#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AutonomousSystemImpl extends CIM_AdminDomainImpl implements CIM_AutonomousSystem {
	/**
	 * The default value of the '{@link #getASNumber() <em>AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getASNumber() <em>AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer asNumber = AS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSingleHomed() <em>Is Single Homed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSingleHomed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SINGLE_HOMED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSingleHomed() <em>Is Single Homed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSingleHomed()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSingleHomed = IS_SINGLE_HOMED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsTransit() <em>Is Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTransit()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_TRANSIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsTransit() <em>Is Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTransit()
	 * @generated
	 * @ordered
	 */
	protected Boolean isTransit = IS_TRANSIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequireIGPSync() <em>Require IGP Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireIGPSync()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRE_IGP_SYNC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequireIGPSync() <em>Require IGP Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireIGPSync()
	 * @generated
	 * @ordered
	 */
	protected Boolean requireIGPSync = REQUIRE_IGP_SYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingUpdateSource() <em>Routing Update Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingUpdateSource()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROUTING_UPDATE_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutingUpdateSource() <em>Routing Update Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingUpdateSource()
	 * @generated
	 * @ordered
	 */
	protected Integer routingUpdateSource = ROUTING_UPDATE_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AGGREGATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected Integer aggregationType = AGGREGATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AutonomousSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AutonomousSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getASNumber() {
		return asNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setASNumber(Integer newASNumber) {
		Integer oldASNumber = asNumber;
		asNumber = newASNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AUTONOMOUS_SYSTEM__AS_NUMBER, oldASNumber, asNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsSingleHomed() {
		return isSingleHomed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSingleHomed(Boolean newIsSingleHomed) {
		Boolean oldIsSingleHomed = isSingleHomed;
		isSingleHomed = newIsSingleHomed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED, oldIsSingleHomed, isSingleHomed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsTransit() {
		return isTransit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTransit(Boolean newIsTransit) {
		Boolean oldIsTransit = isTransit;
		isTransit = newIsTransit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_TRANSIT, oldIsTransit, isTransit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequireIGPSync() {
		return requireIGPSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireIGPSync(Boolean newRequireIGPSync) {
		Boolean oldRequireIGPSync = requireIGPSync;
		requireIGPSync = newRequireIGPSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC, oldRequireIGPSync, requireIGPSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRoutingUpdateSource() {
		return routingUpdateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutingUpdateSource(Integer newRoutingUpdateSource) {
		Integer oldRoutingUpdateSource = routingUpdateSource;
		routingUpdateSource = newRoutingUpdateSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE, oldRoutingUpdateSource, routingUpdateSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAggregationType() {
		return aggregationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationType(Integer newAggregationType) {
		Integer oldAggregationType = aggregationType;
		aggregationType = newAggregationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AUTONOMOUS_SYSTEM__AGGREGATION_TYPE, oldAggregationType, aggregationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__AS_NUMBER:
				return getASNumber();
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED:
				return getIsSingleHomed();
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_TRANSIT:
				return getIsTransit();
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC:
				return getRequireIGPSync();
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE:
				return getRoutingUpdateSource();
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__AGGREGATION_TYPE:
				return getAggregationType();
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
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__AS_NUMBER:
				setASNumber((Integer)newValue);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED:
				setIsSingleHomed((Boolean)newValue);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_TRANSIT:
				setIsTransit((Boolean)newValue);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC:
				setRequireIGPSync((Boolean)newValue);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE:
				setRoutingUpdateSource((Integer)newValue);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__AGGREGATION_TYPE:
				setAggregationType((Integer)newValue);
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
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__AS_NUMBER:
				setASNumber(AS_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED:
				setIsSingleHomed(IS_SINGLE_HOMED_EDEFAULT);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_TRANSIT:
				setIsTransit(IS_TRANSIT_EDEFAULT);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC:
				setRequireIGPSync(REQUIRE_IGP_SYNC_EDEFAULT);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE:
				setRoutingUpdateSource(ROUTING_UPDATE_SOURCE_EDEFAULT);
				return;
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__AGGREGATION_TYPE:
				setAggregationType(AGGREGATION_TYPE_EDEFAULT);
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
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__AS_NUMBER:
				return AS_NUMBER_EDEFAULT == null ? asNumber != null : !AS_NUMBER_EDEFAULT.equals(asNumber);
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED:
				return IS_SINGLE_HOMED_EDEFAULT == null ? isSingleHomed != null : !IS_SINGLE_HOMED_EDEFAULT.equals(isSingleHomed);
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__IS_TRANSIT:
				return IS_TRANSIT_EDEFAULT == null ? isTransit != null : !IS_TRANSIT_EDEFAULT.equals(isTransit);
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC:
				return REQUIRE_IGP_SYNC_EDEFAULT == null ? requireIGPSync != null : !REQUIRE_IGP_SYNC_EDEFAULT.equals(requireIGPSync);
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE:
				return ROUTING_UPDATE_SOURCE_EDEFAULT == null ? routingUpdateSource != null : !ROUTING_UPDATE_SOURCE_EDEFAULT.equals(routingUpdateSource);
			case CimPackage.CIM_AUTONOMOUS_SYSTEM__AGGREGATION_TYPE:
				return AGGREGATION_TYPE_EDEFAULT == null ? aggregationType != null : !AGGREGATION_TYPE_EDEFAULT.equals(aggregationType);
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
		result.append(" (ASNumber: ");
		result.append(asNumber);
		result.append(", IsSingleHomed: ");
		result.append(isSingleHomed);
		result.append(", IsTransit: ");
		result.append(isTransit);
		result.append(", RequireIGPSync: ");
		result.append(requireIGPSync);
		result.append(", RoutingUpdateSource: ");
		result.append(routingUpdateSource);
		result.append(", AggregationType: ");
		result.append(aggregationType);
		result.append(')');
		return result.toString();
	}

} //CIM_AutonomousSystemImpl
