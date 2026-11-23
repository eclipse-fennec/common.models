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

import org.dmtf.cim.CIM_SpanningTreeStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Spanning Tree Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeStatisticsImpl#getTimeSinceTopologyChange <em>Time Since Topology Change</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeStatisticsImpl#getTopChanges <em>Top Changes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SpanningTreeStatisticsImpl extends CIM_ServiceStatisticalInformationImpl implements CIM_SpanningTreeStatistics {
	/**
	 * The default value of the '{@link #getTimeSinceTopologyChange() <em>Time Since Topology Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSinceTopologyChange()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIME_SINCE_TOPOLOGY_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeSinceTopologyChange() <em>Time Since Topology Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSinceTopologyChange()
	 * @generated
	 * @ordered
	 */
	protected Long timeSinceTopologyChange = TIME_SINCE_TOPOLOGY_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopChanges() <em>Top Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopChanges()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOP_CHANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopChanges() <em>Top Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopChanges()
	 * @generated
	 * @ordered
	 */
	protected Long topChanges = TOP_CHANGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SpanningTreeStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SpanningTreeStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimeSinceTopologyChange() {
		return timeSinceTopologyChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeSinceTopologyChange(Long newTimeSinceTopologyChange) {
		Long oldTimeSinceTopologyChange = timeSinceTopologyChange;
		timeSinceTopologyChange = newTimeSinceTopologyChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_STATISTICS__TIME_SINCE_TOPOLOGY_CHANGE, oldTimeSinceTopologyChange, timeSinceTopologyChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTopChanges() {
		return topChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopChanges(Long newTopChanges) {
		Long oldTopChanges = topChanges;
		topChanges = newTopChanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_STATISTICS__TOP_CHANGES, oldTopChanges, topChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SPANNING_TREE_STATISTICS__TIME_SINCE_TOPOLOGY_CHANGE:
				return getTimeSinceTopologyChange();
			case CimPackage.CIM_SPANNING_TREE_STATISTICS__TOP_CHANGES:
				return getTopChanges();
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
			case CimPackage.CIM_SPANNING_TREE_STATISTICS__TIME_SINCE_TOPOLOGY_CHANGE:
				setTimeSinceTopologyChange((Long)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_STATISTICS__TOP_CHANGES:
				setTopChanges((Long)newValue);
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
			case CimPackage.CIM_SPANNING_TREE_STATISTICS__TIME_SINCE_TOPOLOGY_CHANGE:
				setTimeSinceTopologyChange(TIME_SINCE_TOPOLOGY_CHANGE_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_STATISTICS__TOP_CHANGES:
				setTopChanges(TOP_CHANGES_EDEFAULT);
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
			case CimPackage.CIM_SPANNING_TREE_STATISTICS__TIME_SINCE_TOPOLOGY_CHANGE:
				return TIME_SINCE_TOPOLOGY_CHANGE_EDEFAULT == null ? timeSinceTopologyChange != null : !TIME_SINCE_TOPOLOGY_CHANGE_EDEFAULT.equals(timeSinceTopologyChange);
			case CimPackage.CIM_SPANNING_TREE_STATISTICS__TOP_CHANGES:
				return TOP_CHANGES_EDEFAULT == null ? topChanges != null : !TOP_CHANGES_EDEFAULT.equals(topChanges);
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
		result.append(" (TimeSinceTopologyChange: ");
		result.append(timeSinceTopologyChange);
		result.append(", TopChanges: ");
		result.append(topChanges);
		result.append(')');
		return result.toString();
	}

} //CIM_SpanningTreeStatisticsImpl
