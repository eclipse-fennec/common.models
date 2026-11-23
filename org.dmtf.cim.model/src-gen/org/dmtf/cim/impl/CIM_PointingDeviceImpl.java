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

import org.dmtf.cim.CIM_PointingDevice;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Pointing Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PointingDeviceImpl#getPointingType <em>Pointing Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PointingDeviceImpl#getNumberOfButtons <em>Number Of Buttons</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PointingDeviceImpl#getHandedness <em>Handedness</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PointingDeviceImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PointingDeviceImpl extends CIM_UserDeviceImpl implements CIM_PointingDevice {
	/**
	 * The default value of the '{@link #getPointingType() <em>Pointing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointingType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POINTING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointingType() <em>Pointing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointingType()
	 * @generated
	 * @ordered
	 */
	protected Integer pointingType = POINTING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfButtons() <em>Number Of Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfButtons()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_BUTTONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfButtons() <em>Number Of Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfButtons()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfButtons = NUMBER_OF_BUTTONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandedness() <em>Handedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandedness()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HANDEDNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandedness() <em>Handedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandedness()
	 * @generated
	 * @ordered
	 */
	protected Integer handedness = HANDEDNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected Long resolution = RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PointingDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PointingDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPointingType() {
		return pointingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointingType(Integer newPointingType) {
		Integer oldPointingType = pointingType;
		pointingType = newPointingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POINTING_DEVICE__POINTING_TYPE, oldPointingType, pointingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfButtons() {
		return numberOfButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfButtons(Integer newNumberOfButtons) {
		Integer oldNumberOfButtons = numberOfButtons;
		numberOfButtons = newNumberOfButtons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POINTING_DEVICE__NUMBER_OF_BUTTONS, oldNumberOfButtons, numberOfButtons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHandedness() {
		return handedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandedness(Integer newHandedness) {
		Integer oldHandedness = handedness;
		handedness = newHandedness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POINTING_DEVICE__HANDEDNESS, oldHandedness, handedness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(Long newResolution) {
		Long oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POINTING_DEVICE__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POINTING_DEVICE__POINTING_TYPE:
				return getPointingType();
			case CimPackage.CIM_POINTING_DEVICE__NUMBER_OF_BUTTONS:
				return getNumberOfButtons();
			case CimPackage.CIM_POINTING_DEVICE__HANDEDNESS:
				return getHandedness();
			case CimPackage.CIM_POINTING_DEVICE__RESOLUTION:
				return getResolution();
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
			case CimPackage.CIM_POINTING_DEVICE__POINTING_TYPE:
				setPointingType((Integer)newValue);
				return;
			case CimPackage.CIM_POINTING_DEVICE__NUMBER_OF_BUTTONS:
				setNumberOfButtons((Integer)newValue);
				return;
			case CimPackage.CIM_POINTING_DEVICE__HANDEDNESS:
				setHandedness((Integer)newValue);
				return;
			case CimPackage.CIM_POINTING_DEVICE__RESOLUTION:
				setResolution((Long)newValue);
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
			case CimPackage.CIM_POINTING_DEVICE__POINTING_TYPE:
				setPointingType(POINTING_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_POINTING_DEVICE__NUMBER_OF_BUTTONS:
				setNumberOfButtons(NUMBER_OF_BUTTONS_EDEFAULT);
				return;
			case CimPackage.CIM_POINTING_DEVICE__HANDEDNESS:
				setHandedness(HANDEDNESS_EDEFAULT);
				return;
			case CimPackage.CIM_POINTING_DEVICE__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
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
			case CimPackage.CIM_POINTING_DEVICE__POINTING_TYPE:
				return POINTING_TYPE_EDEFAULT == null ? pointingType != null : !POINTING_TYPE_EDEFAULT.equals(pointingType);
			case CimPackage.CIM_POINTING_DEVICE__NUMBER_OF_BUTTONS:
				return NUMBER_OF_BUTTONS_EDEFAULT == null ? numberOfButtons != null : !NUMBER_OF_BUTTONS_EDEFAULT.equals(numberOfButtons);
			case CimPackage.CIM_POINTING_DEVICE__HANDEDNESS:
				return HANDEDNESS_EDEFAULT == null ? handedness != null : !HANDEDNESS_EDEFAULT.equals(handedness);
			case CimPackage.CIM_POINTING_DEVICE__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
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
		result.append(" (PointingType: ");
		result.append(pointingType);
		result.append(", NumberOfButtons: ");
		result.append(numberOfButtons);
		result.append(", Handedness: ");
		result.append(handedness);
		result.append(", Resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

} //CIM_PointingDeviceImpl
