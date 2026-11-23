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

import org.dmtf.cim.CIM_FlatPanel;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Flat Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FlatPanelImpl#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FlatPanelImpl#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FlatPanelImpl#getScanMode <em>Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FlatPanelImpl#getDisplayType <em>Display Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FlatPanelImpl#getLightSource <em>Light Source</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FlatPanelImpl#getSupportsColor <em>Supports Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FlatPanelImpl extends CIM_DisplayImpl implements CIM_FlatPanel {
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
	 * The default value of the '{@link #getLightSource() <em>Light Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightSource()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LIGHT_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLightSource() <em>Light Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightSource()
	 * @generated
	 * @ordered
	 */
	protected Integer lightSource = LIGHT_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportsColor() <em>Supports Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsColor()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTS_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportsColor() <em>Supports Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsColor()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportsColor = SUPPORTS_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FlatPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FlatPanel();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FLAT_PANEL__HORIZONTAL_RESOLUTION, oldHorizontalResolution, horizontalResolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FLAT_PANEL__VERTICAL_RESOLUTION, oldVerticalResolution, verticalResolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FLAT_PANEL__SCAN_MODE, oldScanMode, scanMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FLAT_PANEL__DISPLAY_TYPE, oldDisplayType, displayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLightSource() {
		return lightSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLightSource(Integer newLightSource) {
		Integer oldLightSource = lightSource;
		lightSource = newLightSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FLAT_PANEL__LIGHT_SOURCE, oldLightSource, lightSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportsColor() {
		return supportsColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsColor(Boolean newSupportsColor) {
		Boolean oldSupportsColor = supportsColor;
		supportsColor = newSupportsColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FLAT_PANEL__SUPPORTS_COLOR, oldSupportsColor, supportsColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FLAT_PANEL__HORIZONTAL_RESOLUTION:
				return getHorizontalResolution();
			case CimPackage.CIM_FLAT_PANEL__VERTICAL_RESOLUTION:
				return getVerticalResolution();
			case CimPackage.CIM_FLAT_PANEL__SCAN_MODE:
				return getScanMode();
			case CimPackage.CIM_FLAT_PANEL__DISPLAY_TYPE:
				return getDisplayType();
			case CimPackage.CIM_FLAT_PANEL__LIGHT_SOURCE:
				return getLightSource();
			case CimPackage.CIM_FLAT_PANEL__SUPPORTS_COLOR:
				return getSupportsColor();
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
			case CimPackage.CIM_FLAT_PANEL__HORIZONTAL_RESOLUTION:
				setHorizontalResolution((Long)newValue);
				return;
			case CimPackage.CIM_FLAT_PANEL__VERTICAL_RESOLUTION:
				setVerticalResolution((Long)newValue);
				return;
			case CimPackage.CIM_FLAT_PANEL__SCAN_MODE:
				setScanMode((Integer)newValue);
				return;
			case CimPackage.CIM_FLAT_PANEL__DISPLAY_TYPE:
				setDisplayType((Integer)newValue);
				return;
			case CimPackage.CIM_FLAT_PANEL__LIGHT_SOURCE:
				setLightSource((Integer)newValue);
				return;
			case CimPackage.CIM_FLAT_PANEL__SUPPORTS_COLOR:
				setSupportsColor((Boolean)newValue);
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
			case CimPackage.CIM_FLAT_PANEL__HORIZONTAL_RESOLUTION:
				setHorizontalResolution(HORIZONTAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_FLAT_PANEL__VERTICAL_RESOLUTION:
				setVerticalResolution(VERTICAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_FLAT_PANEL__SCAN_MODE:
				setScanMode(SCAN_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_FLAT_PANEL__DISPLAY_TYPE:
				setDisplayType(DISPLAY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FLAT_PANEL__LIGHT_SOURCE:
				setLightSource(LIGHT_SOURCE_EDEFAULT);
				return;
			case CimPackage.CIM_FLAT_PANEL__SUPPORTS_COLOR:
				setSupportsColor(SUPPORTS_COLOR_EDEFAULT);
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
			case CimPackage.CIM_FLAT_PANEL__HORIZONTAL_RESOLUTION:
				return HORIZONTAL_RESOLUTION_EDEFAULT == null ? horizontalResolution != null : !HORIZONTAL_RESOLUTION_EDEFAULT.equals(horizontalResolution);
			case CimPackage.CIM_FLAT_PANEL__VERTICAL_RESOLUTION:
				return VERTICAL_RESOLUTION_EDEFAULT == null ? verticalResolution != null : !VERTICAL_RESOLUTION_EDEFAULT.equals(verticalResolution);
			case CimPackage.CIM_FLAT_PANEL__SCAN_MODE:
				return SCAN_MODE_EDEFAULT == null ? scanMode != null : !SCAN_MODE_EDEFAULT.equals(scanMode);
			case CimPackage.CIM_FLAT_PANEL__DISPLAY_TYPE:
				return DISPLAY_TYPE_EDEFAULT == null ? displayType != null : !DISPLAY_TYPE_EDEFAULT.equals(displayType);
			case CimPackage.CIM_FLAT_PANEL__LIGHT_SOURCE:
				return LIGHT_SOURCE_EDEFAULT == null ? lightSource != null : !LIGHT_SOURCE_EDEFAULT.equals(lightSource);
			case CimPackage.CIM_FLAT_PANEL__SUPPORTS_COLOR:
				return SUPPORTS_COLOR_EDEFAULT == null ? supportsColor != null : !SUPPORTS_COLOR_EDEFAULT.equals(supportsColor);
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
		result.append(", ScanMode: ");
		result.append(scanMode);
		result.append(", DisplayType: ");
		result.append(displayType);
		result.append(", LightSource: ");
		result.append(lightSource);
		result.append(", SupportsColor: ");
		result.append(supportsColor);
		result.append(')');
		return result.toString();
	}

} //CIM_FlatPanelImpl
