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

import org.dmtf.cim.CIM_SwitchPortSourceRouting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Switch Port Source Routing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingImpl#getHopCount <em>Hop Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingImpl#getLocalSegment <em>Local Segment</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingImpl#getBridgeNum <em>Bridge Num</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingImpl#getTargetSegment <em>Target Segment</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingImpl#getSTESpanMode <em>STE Span Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SwitchPortSourceRoutingImpl extends CIM_ServiceSAPDependencyImpl implements CIM_SwitchPortSourceRouting {
	/**
	 * The default value of the '{@link #getHopCount() <em>Hop Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHopCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOP_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHopCount() <em>Hop Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHopCount()
	 * @generated
	 * @ordered
	 */
	protected Integer hopCount = HOP_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalSegment() <em>Local Segment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalSegment()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCAL_SEGMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalSegment() <em>Local Segment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalSegment()
	 * @generated
	 * @ordered
	 */
	protected Integer localSegment = LOCAL_SEGMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBridgeNum() <em>Bridge Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeNum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BRIDGE_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeNum() <em>Bridge Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeNum()
	 * @generated
	 * @ordered
	 */
	protected Integer bridgeNum = BRIDGE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSegment() <em>Target Segment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSegment()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_SEGMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetSegment() <em>Target Segment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSegment()
	 * @generated
	 * @ordered
	 */
	protected Integer targetSegment = TARGET_SEGMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSTESpanMode() <em>STE Span Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTESpanMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STE_SPAN_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSTESpanMode() <em>STE Span Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTESpanMode()
	 * @generated
	 * @ordered
	 */
	protected Integer steSpanMode = STE_SPAN_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SwitchPortSourceRoutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SwitchPortSourceRouting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHopCount() {
		return hopCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHopCount(Integer newHopCount) {
		Integer oldHopCount = hopCount;
		hopCount = newHopCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__HOP_COUNT, oldHopCount, hopCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocalSegment() {
		return localSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalSegment(Integer newLocalSegment) {
		Integer oldLocalSegment = localSegment;
		localSegment = newLocalSegment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__LOCAL_SEGMENT, oldLocalSegment, localSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBridgeNum() {
		return bridgeNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeNum(Integer newBridgeNum) {
		Integer oldBridgeNum = bridgeNum;
		bridgeNum = newBridgeNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__BRIDGE_NUM, oldBridgeNum, bridgeNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTargetSegment() {
		return targetSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetSegment(Integer newTargetSegment) {
		Integer oldTargetSegment = targetSegment;
		targetSegment = newTargetSegment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__TARGET_SEGMENT, oldTargetSegment, targetSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSTESpanMode() {
		return steSpanMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSTESpanMode(Integer newSTESpanMode) {
		Integer oldSTESpanMode = steSpanMode;
		steSpanMode = newSTESpanMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__STE_SPAN_MODE, oldSTESpanMode, steSpanMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__HOP_COUNT:
				return getHopCount();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__LOCAL_SEGMENT:
				return getLocalSegment();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__BRIDGE_NUM:
				return getBridgeNum();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__TARGET_SEGMENT:
				return getTargetSegment();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__STE_SPAN_MODE:
				return getSTESpanMode();
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
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__HOP_COUNT:
				setHopCount((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__LOCAL_SEGMENT:
				setLocalSegment((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__BRIDGE_NUM:
				setBridgeNum((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__TARGET_SEGMENT:
				setTargetSegment((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__STE_SPAN_MODE:
				setSTESpanMode((Integer)newValue);
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
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__HOP_COUNT:
				setHopCount(HOP_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__LOCAL_SEGMENT:
				setLocalSegment(LOCAL_SEGMENT_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__BRIDGE_NUM:
				setBridgeNum(BRIDGE_NUM_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__TARGET_SEGMENT:
				setTargetSegment(TARGET_SEGMENT_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__STE_SPAN_MODE:
				setSTESpanMode(STE_SPAN_MODE_EDEFAULT);
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
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__HOP_COUNT:
				return HOP_COUNT_EDEFAULT == null ? hopCount != null : !HOP_COUNT_EDEFAULT.equals(hopCount);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__LOCAL_SEGMENT:
				return LOCAL_SEGMENT_EDEFAULT == null ? localSegment != null : !LOCAL_SEGMENT_EDEFAULT.equals(localSegment);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__BRIDGE_NUM:
				return BRIDGE_NUM_EDEFAULT == null ? bridgeNum != null : !BRIDGE_NUM_EDEFAULT.equals(bridgeNum);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__TARGET_SEGMENT:
				return TARGET_SEGMENT_EDEFAULT == null ? targetSegment != null : !TARGET_SEGMENT_EDEFAULT.equals(targetSegment);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING__STE_SPAN_MODE:
				return STE_SPAN_MODE_EDEFAULT == null ? steSpanMode != null : !STE_SPAN_MODE_EDEFAULT.equals(steSpanMode);
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
		result.append(" (HopCount: ");
		result.append(hopCount);
		result.append(", LocalSegment: ");
		result.append(localSegment);
		result.append(", BridgeNum: ");
		result.append(bridgeNum);
		result.append(", TargetSegment: ");
		result.append(targetSegment);
		result.append(", STESpanMode: ");
		result.append(steSpanMode);
		result.append(')');
		return result.toString();
	}

} //CIM_SwitchPortSourceRoutingImpl
