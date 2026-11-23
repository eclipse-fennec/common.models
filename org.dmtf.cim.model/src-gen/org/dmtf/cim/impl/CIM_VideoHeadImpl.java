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

import org.dmtf.cim.CIM_VideoHead;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Video Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getCurrentBitsPerPixel <em>Current Bits Per Pixel</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getCurrentHorizontalResolution <em>Current Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getCurrentVerticalResolution <em>Current Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getMaxRefreshRate <em>Max Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getMinRefreshRate <em>Min Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getCurrentRefreshRate <em>Current Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getCurrentScanMode <em>Current Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getOtherCurrentScanMode <em>Other Current Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getCurrentNumberOfRows <em>Current Number Of Rows</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getCurrentNumberOfColumns <em>Current Number Of Columns</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoHeadImpl#getCurrentNumberOfColors <em>Current Number Of Colors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VideoHeadImpl extends CIM_LogicalDeviceImpl implements CIM_VideoHead {
	/**
	 * The default value of the '{@link #getCurrentBitsPerPixel() <em>Current Bits Per Pixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBitsPerPixel()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_BITS_PER_PIXEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentBitsPerPixel() <em>Current Bits Per Pixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBitsPerPixel()
	 * @generated
	 * @ordered
	 */
	protected Long currentBitsPerPixel = CURRENT_BITS_PER_PIXEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentHorizontalResolution() <em>Current Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_HORIZONTAL_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentHorizontalResolution() <em>Current Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected Long currentHorizontalResolution = CURRENT_HORIZONTAL_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentVerticalResolution() <em>Current Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_VERTICAL_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentVerticalResolution() <em>Current Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected Long currentVerticalResolution = CURRENT_VERTICAL_RESOLUTION_EDEFAULT;

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
	 * The default value of the '{@link #getCurrentRefreshRate() <em>Current Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_REFRESH_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentRefreshRate() <em>Current Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected Long currentRefreshRate = CURRENT_REFRESH_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentScanMode() <em>Current Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentScanMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_SCAN_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentScanMode() <em>Current Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentScanMode()
	 * @generated
	 * @ordered
	 */
	protected Integer currentScanMode = CURRENT_SCAN_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCurrentScanMode() <em>Other Current Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCurrentScanMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CURRENT_SCAN_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCurrentScanMode() <em>Other Current Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCurrentScanMode()
	 * @generated
	 * @ordered
	 */
	protected String otherCurrentScanMode = OTHER_CURRENT_SCAN_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentNumberOfRows() <em>Current Number Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNumberOfRows()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_NUMBER_OF_ROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentNumberOfRows() <em>Current Number Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNumberOfRows()
	 * @generated
	 * @ordered
	 */
	protected Long currentNumberOfRows = CURRENT_NUMBER_OF_ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentNumberOfColumns() <em>Current Number Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNumberOfColumns()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_NUMBER_OF_COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentNumberOfColumns() <em>Current Number Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNumberOfColumns()
	 * @generated
	 * @ordered
	 */
	protected Long currentNumberOfColumns = CURRENT_NUMBER_OF_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentNumberOfColors() <em>Current Number Of Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNumberOfColors()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_NUMBER_OF_COLORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentNumberOfColors() <em>Current Number Of Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNumberOfColors()
	 * @generated
	 * @ordered
	 */
	protected Long currentNumberOfColors = CURRENT_NUMBER_OF_COLORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VideoHeadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VideoHead();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentBitsPerPixel() {
		return currentBitsPerPixel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentBitsPerPixel(Long newCurrentBitsPerPixel) {
		Long oldCurrentBitsPerPixel = currentBitsPerPixel;
		currentBitsPerPixel = newCurrentBitsPerPixel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__CURRENT_BITS_PER_PIXEL, oldCurrentBitsPerPixel, currentBitsPerPixel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentHorizontalResolution() {
		return currentHorizontalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentHorizontalResolution(Long newCurrentHorizontalResolution) {
		Long oldCurrentHorizontalResolution = currentHorizontalResolution;
		currentHorizontalResolution = newCurrentHorizontalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__CURRENT_HORIZONTAL_RESOLUTION, oldCurrentHorizontalResolution, currentHorizontalResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentVerticalResolution() {
		return currentVerticalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentVerticalResolution(Long newCurrentVerticalResolution) {
		Long oldCurrentVerticalResolution = currentVerticalResolution;
		currentVerticalResolution = newCurrentVerticalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__CURRENT_VERTICAL_RESOLUTION, oldCurrentVerticalResolution, currentVerticalResolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__MAX_REFRESH_RATE, oldMaxRefreshRate, maxRefreshRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__MIN_REFRESH_RATE, oldMinRefreshRate, minRefreshRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentRefreshRate() {
		return currentRefreshRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRefreshRate(Long newCurrentRefreshRate) {
		Long oldCurrentRefreshRate = currentRefreshRate;
		currentRefreshRate = newCurrentRefreshRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__CURRENT_REFRESH_RATE, oldCurrentRefreshRate, currentRefreshRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentScanMode() {
		return currentScanMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentScanMode(Integer newCurrentScanMode) {
		Integer oldCurrentScanMode = currentScanMode;
		currentScanMode = newCurrentScanMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__CURRENT_SCAN_MODE, oldCurrentScanMode, currentScanMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCurrentScanMode() {
		return otherCurrentScanMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCurrentScanMode(String newOtherCurrentScanMode) {
		String oldOtherCurrentScanMode = otherCurrentScanMode;
		otherCurrentScanMode = newOtherCurrentScanMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__OTHER_CURRENT_SCAN_MODE, oldOtherCurrentScanMode, otherCurrentScanMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentNumberOfRows() {
		return currentNumberOfRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentNumberOfRows(Long newCurrentNumberOfRows) {
		Long oldCurrentNumberOfRows = currentNumberOfRows;
		currentNumberOfRows = newCurrentNumberOfRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_ROWS, oldCurrentNumberOfRows, currentNumberOfRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentNumberOfColumns() {
		return currentNumberOfColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentNumberOfColumns(Long newCurrentNumberOfColumns) {
		Long oldCurrentNumberOfColumns = currentNumberOfColumns;
		currentNumberOfColumns = newCurrentNumberOfColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLUMNS, oldCurrentNumberOfColumns, currentNumberOfColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentNumberOfColors() {
		return currentNumberOfColors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentNumberOfColors(Long newCurrentNumberOfColors) {
		Long oldCurrentNumberOfColors = currentNumberOfColors;
		currentNumberOfColors = newCurrentNumberOfColors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLORS, oldCurrentNumberOfColors, currentNumberOfColors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_BITS_PER_PIXEL:
				return getCurrentBitsPerPixel();
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_HORIZONTAL_RESOLUTION:
				return getCurrentHorizontalResolution();
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_VERTICAL_RESOLUTION:
				return getCurrentVerticalResolution();
			case CimPackage.CIM_VIDEO_HEAD__MAX_REFRESH_RATE:
				return getMaxRefreshRate();
			case CimPackage.CIM_VIDEO_HEAD__MIN_REFRESH_RATE:
				return getMinRefreshRate();
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_REFRESH_RATE:
				return getCurrentRefreshRate();
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_SCAN_MODE:
				return getCurrentScanMode();
			case CimPackage.CIM_VIDEO_HEAD__OTHER_CURRENT_SCAN_MODE:
				return getOtherCurrentScanMode();
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_ROWS:
				return getCurrentNumberOfRows();
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLUMNS:
				return getCurrentNumberOfColumns();
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLORS:
				return getCurrentNumberOfColors();
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
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_BITS_PER_PIXEL:
				setCurrentBitsPerPixel((Long)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_HORIZONTAL_RESOLUTION:
				setCurrentHorizontalResolution((Long)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_VERTICAL_RESOLUTION:
				setCurrentVerticalResolution((Long)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__MAX_REFRESH_RATE:
				setMaxRefreshRate((Long)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__MIN_REFRESH_RATE:
				setMinRefreshRate((Long)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_REFRESH_RATE:
				setCurrentRefreshRate((Long)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_SCAN_MODE:
				setCurrentScanMode((Integer)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__OTHER_CURRENT_SCAN_MODE:
				setOtherCurrentScanMode((String)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_ROWS:
				setCurrentNumberOfRows((Long)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLUMNS:
				setCurrentNumberOfColumns((Long)newValue);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLORS:
				setCurrentNumberOfColors((Long)newValue);
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
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_BITS_PER_PIXEL:
				setCurrentBitsPerPixel(CURRENT_BITS_PER_PIXEL_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_HORIZONTAL_RESOLUTION:
				setCurrentHorizontalResolution(CURRENT_HORIZONTAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_VERTICAL_RESOLUTION:
				setCurrentVerticalResolution(CURRENT_VERTICAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__MAX_REFRESH_RATE:
				setMaxRefreshRate(MAX_REFRESH_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__MIN_REFRESH_RATE:
				setMinRefreshRate(MIN_REFRESH_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_REFRESH_RATE:
				setCurrentRefreshRate(CURRENT_REFRESH_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_SCAN_MODE:
				setCurrentScanMode(CURRENT_SCAN_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__OTHER_CURRENT_SCAN_MODE:
				setOtherCurrentScanMode(OTHER_CURRENT_SCAN_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_ROWS:
				setCurrentNumberOfRows(CURRENT_NUMBER_OF_ROWS_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLUMNS:
				setCurrentNumberOfColumns(CURRENT_NUMBER_OF_COLUMNS_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLORS:
				setCurrentNumberOfColors(CURRENT_NUMBER_OF_COLORS_EDEFAULT);
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
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_BITS_PER_PIXEL:
				return CURRENT_BITS_PER_PIXEL_EDEFAULT == null ? currentBitsPerPixel != null : !CURRENT_BITS_PER_PIXEL_EDEFAULT.equals(currentBitsPerPixel);
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_HORIZONTAL_RESOLUTION:
				return CURRENT_HORIZONTAL_RESOLUTION_EDEFAULT == null ? currentHorizontalResolution != null : !CURRENT_HORIZONTAL_RESOLUTION_EDEFAULT.equals(currentHorizontalResolution);
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_VERTICAL_RESOLUTION:
				return CURRENT_VERTICAL_RESOLUTION_EDEFAULT == null ? currentVerticalResolution != null : !CURRENT_VERTICAL_RESOLUTION_EDEFAULT.equals(currentVerticalResolution);
			case CimPackage.CIM_VIDEO_HEAD__MAX_REFRESH_RATE:
				return MAX_REFRESH_RATE_EDEFAULT == null ? maxRefreshRate != null : !MAX_REFRESH_RATE_EDEFAULT.equals(maxRefreshRate);
			case CimPackage.CIM_VIDEO_HEAD__MIN_REFRESH_RATE:
				return MIN_REFRESH_RATE_EDEFAULT == null ? minRefreshRate != null : !MIN_REFRESH_RATE_EDEFAULT.equals(minRefreshRate);
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_REFRESH_RATE:
				return CURRENT_REFRESH_RATE_EDEFAULT == null ? currentRefreshRate != null : !CURRENT_REFRESH_RATE_EDEFAULT.equals(currentRefreshRate);
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_SCAN_MODE:
				return CURRENT_SCAN_MODE_EDEFAULT == null ? currentScanMode != null : !CURRENT_SCAN_MODE_EDEFAULT.equals(currentScanMode);
			case CimPackage.CIM_VIDEO_HEAD__OTHER_CURRENT_SCAN_MODE:
				return OTHER_CURRENT_SCAN_MODE_EDEFAULT == null ? otherCurrentScanMode != null : !OTHER_CURRENT_SCAN_MODE_EDEFAULT.equals(otherCurrentScanMode);
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_ROWS:
				return CURRENT_NUMBER_OF_ROWS_EDEFAULT == null ? currentNumberOfRows != null : !CURRENT_NUMBER_OF_ROWS_EDEFAULT.equals(currentNumberOfRows);
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLUMNS:
				return CURRENT_NUMBER_OF_COLUMNS_EDEFAULT == null ? currentNumberOfColumns != null : !CURRENT_NUMBER_OF_COLUMNS_EDEFAULT.equals(currentNumberOfColumns);
			case CimPackage.CIM_VIDEO_HEAD__CURRENT_NUMBER_OF_COLORS:
				return CURRENT_NUMBER_OF_COLORS_EDEFAULT == null ? currentNumberOfColors != null : !CURRENT_NUMBER_OF_COLORS_EDEFAULT.equals(currentNumberOfColors);
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
		result.append(" (CurrentBitsPerPixel: ");
		result.append(currentBitsPerPixel);
		result.append(", CurrentHorizontalResolution: ");
		result.append(currentHorizontalResolution);
		result.append(", CurrentVerticalResolution: ");
		result.append(currentVerticalResolution);
		result.append(", MaxRefreshRate: ");
		result.append(maxRefreshRate);
		result.append(", MinRefreshRate: ");
		result.append(minRefreshRate);
		result.append(", CurrentRefreshRate: ");
		result.append(currentRefreshRate);
		result.append(", CurrentScanMode: ");
		result.append(currentScanMode);
		result.append(", OtherCurrentScanMode: ");
		result.append(otherCurrentScanMode);
		result.append(", CurrentNumberOfRows: ");
		result.append(currentNumberOfRows);
		result.append(", CurrentNumberOfColumns: ");
		result.append(currentNumberOfColumns);
		result.append(", CurrentNumberOfColors: ");
		result.append(currentNumberOfColors);
		result.append(')');
		return result.toString();
	}

} //CIM_VideoHeadImpl
