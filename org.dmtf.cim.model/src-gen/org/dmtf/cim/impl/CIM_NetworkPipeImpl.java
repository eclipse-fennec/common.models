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

import org.dmtf.cim.CIM_NetworkPipe;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Pipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPipeImpl#getDirectionality <em>Directionality</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPipeImpl#getAggregationBehavior <em>Aggregation Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkPipeImpl extends CIM_EnabledLogicalElementImpl implements CIM_NetworkPipe {
	/**
	 * The default value of the '{@link #getDirectionality() <em>Directionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionality()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRECTIONALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectionality() <em>Directionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionality()
	 * @generated
	 * @ordered
	 */
	protected Integer directionality = DIRECTIONALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationBehavior() <em>Aggregation Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AGGREGATION_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationBehavior() <em>Aggregation Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationBehavior()
	 * @generated
	 * @ordered
	 */
	protected Integer aggregationBehavior = AGGREGATION_BEHAVIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPipe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDirectionality() {
		return directionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectionality(Integer newDirectionality) {
		Integer oldDirectionality = directionality;
		directionality = newDirectionality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PIPE__DIRECTIONALITY, oldDirectionality, directionality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAggregationBehavior() {
		return aggregationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationBehavior(Integer newAggregationBehavior) {
		Integer oldAggregationBehavior = aggregationBehavior;
		aggregationBehavior = newAggregationBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PIPE__AGGREGATION_BEHAVIOR, oldAggregationBehavior, aggregationBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_PIPE__DIRECTIONALITY:
				return getDirectionality();
			case CimPackage.CIM_NETWORK_PIPE__AGGREGATION_BEHAVIOR:
				return getAggregationBehavior();
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
			case CimPackage.CIM_NETWORK_PIPE__DIRECTIONALITY:
				setDirectionality((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_PIPE__AGGREGATION_BEHAVIOR:
				setAggregationBehavior((Integer)newValue);
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
			case CimPackage.CIM_NETWORK_PIPE__DIRECTIONALITY:
				setDirectionality(DIRECTIONALITY_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PIPE__AGGREGATION_BEHAVIOR:
				setAggregationBehavior(AGGREGATION_BEHAVIOR_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_PIPE__DIRECTIONALITY:
				return DIRECTIONALITY_EDEFAULT == null ? directionality != null : !DIRECTIONALITY_EDEFAULT.equals(directionality);
			case CimPackage.CIM_NETWORK_PIPE__AGGREGATION_BEHAVIOR:
				return AGGREGATION_BEHAVIOR_EDEFAULT == null ? aggregationBehavior != null : !AGGREGATION_BEHAVIOR_EDEFAULT.equals(aggregationBehavior);
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
		result.append(" (Directionality: ");
		result.append(directionality);
		result.append(", AggregationBehavior: ");
		result.append(aggregationBehavior);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkPipeImpl
