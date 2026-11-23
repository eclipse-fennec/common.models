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

import org.dmtf.cim.CIM_MonitorResolution;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Monitor Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MonitorResolutionImpl#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MonitorResolutionImpl#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MonitorResolutionImpl#getRefreshRate <em>Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MonitorResolutionImpl#getMinRefreshRate <em>Min Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MonitorResolutionImpl#getMaxRefreshRate <em>Max Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MonitorResolutionImpl#getScanMode <em>Scan Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MonitorResolutionImpl extends CIM_SettingImpl implements CIM_MonitorResolution {
	/**
	 * The default value of the '{@link #getHorizontalResolution() <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long HORIZONTAL_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalResolution() <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected Long horizontalResolution = HORIZONTAL_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalResolution() <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long VERTICAL_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalResolution() <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected Long verticalResolution = VERTICAL_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshRate() <em>Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long REFRESH_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshRate() <em>Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected Long refreshRate = REFRESH_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRefreshRate() <em>Min Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_REFRESH_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinRefreshRate() <em>Min Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected Long minRefreshRate = MIN_REFRESH_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRefreshRate() <em>Max Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_REFRESH_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRefreshRate() <em>Max Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected Long maxRefreshRate = MAX_REFRESH_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScanMode() <em>Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCAN_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScanMode() <em>Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanMode()
	 * @generated
	 * @ordered
	 */
	protected Integer scanMode = SCAN_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MonitorResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MonitorResolution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHorizontalResolution() {
		return horizontalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalResolution(Long newHorizontalResolution) {
		Long oldHorizontalResolution = horizontalResolution;
		horizontalResolution = newHorizontalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MONITOR_RESOLUTION__HORIZONTAL_RESOLUTION, oldHorizontalResolution, horizontalResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVerticalResolution() {
		return verticalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalResolution(Long newVerticalResolution) {
		Long oldVerticalResolution = verticalResolution;
		verticalResolution = newVerticalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MONITOR_RESOLUTION__VERTICAL_RESOLUTION, oldVerticalResolution, verticalResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRefreshRate() {
		return refreshRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshRate(Long newRefreshRate) {
		Long oldRefreshRate = refreshRate;
		refreshRate = newRefreshRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MONITOR_RESOLUTION__REFRESH_RATE, oldRefreshRate, refreshRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinRefreshRate() {
		return minRefreshRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinRefreshRate(Long newMinRefreshRate) {
		Long oldMinRefreshRate = minRefreshRate;
		minRefreshRate = newMinRefreshRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MONITOR_RESOLUTION__MIN_REFRESH_RATE, oldMinRefreshRate, minRefreshRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxRefreshRate() {
		return maxRefreshRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRefreshRate(Long newMaxRefreshRate) {
		Long oldMaxRefreshRate = maxRefreshRate;
		maxRefreshRate = newMaxRefreshRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MONITOR_RESOLUTION__MAX_REFRESH_RATE, oldMaxRefreshRate, maxRefreshRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getScanMode() {
		return scanMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanMode(Integer newScanMode) {
		Integer oldScanMode = scanMode;
		scanMode = newScanMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MONITOR_RESOLUTION__SCAN_MODE, oldScanMode, scanMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MONITOR_RESOLUTION__HORIZONTAL_RESOLUTION:
				return getHorizontalResolution();
			case CimPackage.CIM_MONITOR_RESOLUTION__VERTICAL_RESOLUTION:
				return getVerticalResolution();
			case CimPackage.CIM_MONITOR_RESOLUTION__REFRESH_RATE:
				return getRefreshRate();
			case CimPackage.CIM_MONITOR_RESOLUTION__MIN_REFRESH_RATE:
				return getMinRefreshRate();
			case CimPackage.CIM_MONITOR_RESOLUTION__MAX_REFRESH_RATE:
				return getMaxRefreshRate();
			case CimPackage.CIM_MONITOR_RESOLUTION__SCAN_MODE:
				return getScanMode();
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
			case CimPackage.CIM_MONITOR_RESOLUTION__HORIZONTAL_RESOLUTION:
				setHorizontalResolution((Long)newValue);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__VERTICAL_RESOLUTION:
				setVerticalResolution((Long)newValue);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__REFRESH_RATE:
				setRefreshRate((Long)newValue);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__MIN_REFRESH_RATE:
				setMinRefreshRate((Long)newValue);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__MAX_REFRESH_RATE:
				setMaxRefreshRate((Long)newValue);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__SCAN_MODE:
				setScanMode((Integer)newValue);
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
			case CimPackage.CIM_MONITOR_RESOLUTION__HORIZONTAL_RESOLUTION:
				setHorizontalResolution(HORIZONTAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__VERTICAL_RESOLUTION:
				setVerticalResolution(VERTICAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__REFRESH_RATE:
				setRefreshRate(REFRESH_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__MIN_REFRESH_RATE:
				setMinRefreshRate(MIN_REFRESH_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__MAX_REFRESH_RATE:
				setMaxRefreshRate(MAX_REFRESH_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_MONITOR_RESOLUTION__SCAN_MODE:
				setScanMode(SCAN_MODE_EDEFAULT);
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
			case CimPackage.CIM_MONITOR_RESOLUTION__HORIZONTAL_RESOLUTION:
				return HORIZONTAL_RESOLUTION_EDEFAULT == null ? horizontalResolution != null : !HORIZONTAL_RESOLUTION_EDEFAULT.equals(horizontalResolution);
			case CimPackage.CIM_MONITOR_RESOLUTION__VERTICAL_RESOLUTION:
				return VERTICAL_RESOLUTION_EDEFAULT == null ? verticalResolution != null : !VERTICAL_RESOLUTION_EDEFAULT.equals(verticalResolution);
			case CimPackage.CIM_MONITOR_RESOLUTION__REFRESH_RATE:
				return REFRESH_RATE_EDEFAULT == null ? refreshRate != null : !REFRESH_RATE_EDEFAULT.equals(refreshRate);
			case CimPackage.CIM_MONITOR_RESOLUTION__MIN_REFRESH_RATE:
				return MIN_REFRESH_RATE_EDEFAULT == null ? minRefreshRate != null : !MIN_REFRESH_RATE_EDEFAULT.equals(minRefreshRate);
			case CimPackage.CIM_MONITOR_RESOLUTION__MAX_REFRESH_RATE:
				return MAX_REFRESH_RATE_EDEFAULT == null ? maxRefreshRate != null : !MAX_REFRESH_RATE_EDEFAULT.equals(maxRefreshRate);
			case CimPackage.CIM_MONITOR_RESOLUTION__SCAN_MODE:
				return SCAN_MODE_EDEFAULT == null ? scanMode != null : !SCAN_MODE_EDEFAULT.equals(scanMode);
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
		result.append(" (HorizontalResolution: ");
		result.append(horizontalResolution);
		result.append(", VerticalResolution: ");
		result.append(verticalResolution);
		result.append(", RefreshRate: ");
		result.append(refreshRate);
		result.append(", MinRefreshRate: ");
		result.append(minRefreshRate);
		result.append(", MaxRefreshRate: ");
		result.append(maxRefreshRate);
		result.append(", ScanMode: ");
		result.append(scanMode);
		result.append(')');
		return result.toString();
	}

} //CIM_MonitorResolutionImpl
