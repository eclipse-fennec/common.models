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

import org.dmtf.cim.CIM_DesktopMonitor;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Desktop Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DesktopMonitorImpl#getDisplayType <em>Display Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DesktopMonitorImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DesktopMonitorImpl#getScreenHeight <em>Screen Height</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DesktopMonitorImpl#getScreenWidth <em>Screen Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DesktopMonitorImpl extends CIM_DisplayImpl implements CIM_DesktopMonitor {
	/**
	 * The default value of the '{@link #getDisplayType() <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISPLAY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayType() <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayType()
	 * @generated
	 * @ordered
	 */
	protected Integer displayType = DISPLAY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final Long BANDWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected Long bandwidth = BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getScreenHeight() <em>Screen Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCREEN_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScreenHeight() <em>Screen Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenHeight()
	 * @generated
	 * @ordered
	 */
	protected Long screenHeight = SCREEN_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScreenWidth() <em>Screen Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCREEN_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScreenWidth() <em>Screen Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenWidth()
	 * @generated
	 * @ordered
	 */
	protected Long screenWidth = SCREEN_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DesktopMonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DesktopMonitor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDisplayType() {
		return displayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayType(Integer newDisplayType) {
		Integer oldDisplayType = displayType;
		displayType = newDisplayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DESKTOP_MONITOR__DISPLAY_TYPE, oldDisplayType, displayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBandwidth() {
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBandwidth(Long newBandwidth) {
		Long oldBandwidth = bandwidth;
		bandwidth = newBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DESKTOP_MONITOR__BANDWIDTH, oldBandwidth, bandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getScreenHeight() {
		return screenHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenHeight(Long newScreenHeight) {
		Long oldScreenHeight = screenHeight;
		screenHeight = newScreenHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DESKTOP_MONITOR__SCREEN_HEIGHT, oldScreenHeight, screenHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getScreenWidth() {
		return screenWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenWidth(Long newScreenWidth) {
		Long oldScreenWidth = screenWidth;
		screenWidth = newScreenWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DESKTOP_MONITOR__SCREEN_WIDTH, oldScreenWidth, screenWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DESKTOP_MONITOR__DISPLAY_TYPE:
				return getDisplayType();
			case CimPackage.CIM_DESKTOP_MONITOR__BANDWIDTH:
				return getBandwidth();
			case CimPackage.CIM_DESKTOP_MONITOR__SCREEN_HEIGHT:
				return getScreenHeight();
			case CimPackage.CIM_DESKTOP_MONITOR__SCREEN_WIDTH:
				return getScreenWidth();
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
			case CimPackage.CIM_DESKTOP_MONITOR__DISPLAY_TYPE:
				setDisplayType((Integer)newValue);
				return;
			case CimPackage.CIM_DESKTOP_MONITOR__BANDWIDTH:
				setBandwidth((Long)newValue);
				return;
			case CimPackage.CIM_DESKTOP_MONITOR__SCREEN_HEIGHT:
				setScreenHeight((Long)newValue);
				return;
			case CimPackage.CIM_DESKTOP_MONITOR__SCREEN_WIDTH:
				setScreenWidth((Long)newValue);
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
			case CimPackage.CIM_DESKTOP_MONITOR__DISPLAY_TYPE:
				setDisplayType(DISPLAY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DESKTOP_MONITOR__BANDWIDTH:
				setBandwidth(BANDWIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_DESKTOP_MONITOR__SCREEN_HEIGHT:
				setScreenHeight(SCREEN_HEIGHT_EDEFAULT);
				return;
			case CimPackage.CIM_DESKTOP_MONITOR__SCREEN_WIDTH:
				setScreenWidth(SCREEN_WIDTH_EDEFAULT);
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
			case CimPackage.CIM_DESKTOP_MONITOR__DISPLAY_TYPE:
				return DISPLAY_TYPE_EDEFAULT == null ? displayType != null : !DISPLAY_TYPE_EDEFAULT.equals(displayType);
			case CimPackage.CIM_DESKTOP_MONITOR__BANDWIDTH:
				return BANDWIDTH_EDEFAULT == null ? bandwidth != null : !BANDWIDTH_EDEFAULT.equals(bandwidth);
			case CimPackage.CIM_DESKTOP_MONITOR__SCREEN_HEIGHT:
				return SCREEN_HEIGHT_EDEFAULT == null ? screenHeight != null : !SCREEN_HEIGHT_EDEFAULT.equals(screenHeight);
			case CimPackage.CIM_DESKTOP_MONITOR__SCREEN_WIDTH:
				return SCREEN_WIDTH_EDEFAULT == null ? screenWidth != null : !SCREEN_WIDTH_EDEFAULT.equals(screenWidth);
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
		result.append(" (DisplayType: ");
		result.append(displayType);
		result.append(", Bandwidth: ");
		result.append(bandwidth);
		result.append(", ScreenHeight: ");
		result.append(screenHeight);
		result.append(", ScreenWidth: ");
		result.append(screenWidth);
		result.append(')');
		return result.toString();
	}

} //CIM_DesktopMonitorImpl
