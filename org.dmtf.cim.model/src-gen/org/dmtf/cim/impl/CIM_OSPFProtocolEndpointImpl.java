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

import org.dmtf.cim.CIM_OSPFProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM OSPF Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFProtocolEndpointImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFProtocolEndpointImpl#getPollInterval <em>Poll Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFProtocolEndpointImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFProtocolEndpointImpl#getIfDemand <em>If Demand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OSPFProtocolEndpointImpl extends CIM_OSPFProtocolEndpointBaseImpl implements CIM_OSPFProtocolEndpoint {
	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollInterval() <em>Poll Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POLL_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPollInterval() <em>Poll Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer pollInterval = POLL_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected Integer cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIfDemand() <em>If Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfDemand()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IF_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfDemand() <em>If Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfDemand()
	 * @generated
	 * @ordered
	 */
	protected Boolean ifDemand = IF_DEMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OSPFProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OSPFProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Integer newPriority) {
		Integer oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPollInterval() {
		return pollInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPollInterval(Integer newPollInterval) {
		Integer oldPollInterval = pollInterval;
		pollInterval = newPollInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL, oldPollInterval, pollInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(Integer newCost) {
		Integer oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIfDemand() {
		return ifDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfDemand(Boolean newIfDemand) {
		Boolean oldIfDemand = ifDemand;
		ifDemand = newIfDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__IF_DEMAND, oldIfDemand, ifDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__PRIORITY:
				return getPriority();
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL:
				return getPollInterval();
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__COST:
				return getCost();
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__IF_DEMAND:
				return getIfDemand();
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
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL:
				setPollInterval((Integer)newValue);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__COST:
				setCost((Integer)newValue);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__IF_DEMAND:
				setIfDemand((Boolean)newValue);
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
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL:
				setPollInterval(POLL_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__COST:
				setCost(COST_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__IF_DEMAND:
				setIfDemand(IF_DEMAND_EDEFAULT);
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
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL:
				return POLL_INTERVAL_EDEFAULT == null ? pollInterval != null : !POLL_INTERVAL_EDEFAULT.equals(pollInterval);
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT__IF_DEMAND:
				return IF_DEMAND_EDEFAULT == null ? ifDemand != null : !IF_DEMAND_EDEFAULT.equals(ifDemand);
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
		result.append(" (Priority: ");
		result.append(priority);
		result.append(", PollInterval: ");
		result.append(pollInterval);
		result.append(", Cost: ");
		result.append(cost);
		result.append(", IfDemand: ");
		result.append(ifDemand);
		result.append(')');
		return result.toString();
	}

} //CIM_OSPFProtocolEndpointImpl
