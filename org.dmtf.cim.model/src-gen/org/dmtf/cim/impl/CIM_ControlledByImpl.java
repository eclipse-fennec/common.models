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

import org.dmtf.cim.CIM_ControlledBy;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Controlled By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControlledByImpl#getAccessState <em>Access State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControlledByImpl#getTimeOfDeviceReset <em>Time Of Device Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControlledByImpl#getNumberOfHardResets <em>Number Of Hard Resets</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControlledByImpl#getNumberOfSoftResets <em>Number Of Soft Resets</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControlledByImpl#getDeviceNumber <em>Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControlledByImpl#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControlledByImpl#getAccessPriority <em>Access Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ControlledByImpl extends CIM_DeviceConnectionImpl implements CIM_ControlledBy {
	/**
	 * The default value of the '{@link #getAccessState() <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessState() <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessState()
	 * @generated
	 * @ordered
	 */
	protected Integer accessState = ACCESS_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfDeviceReset() <em>Time Of Device Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDeviceReset()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_DEVICE_RESET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfDeviceReset() <em>Time Of Device Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDeviceReset()
	 * @generated
	 * @ordered
	 */
	protected String timeOfDeviceReset = TIME_OF_DEVICE_RESET_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfHardResets() <em>Number Of Hard Resets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfHardResets()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_HARD_RESETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfHardResets() <em>Number Of Hard Resets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfHardResets()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfHardResets = NUMBER_OF_HARD_RESETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSoftResets() <em>Number Of Soft Resets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSoftResets()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_SOFT_RESETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfSoftResets() <em>Number Of Soft Resets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSoftResets()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfSoftResets = NUMBER_OF_SOFT_RESETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceNumber() <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceNumber() <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected String deviceNumber = DEVICE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected Integer accessMode = ACCESS_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessPriority() <em>Access Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessPriority() <em>Access Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer accessPriority = ACCESS_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ControlledByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ControlledBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessState() {
		return accessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessState(Integer newAccessState) {
		Integer oldAccessState = accessState;
		accessState = newAccessState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLED_BY__ACCESS_STATE, oldAccessState, accessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfDeviceReset() {
		return timeOfDeviceReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfDeviceReset(String newTimeOfDeviceReset) {
		String oldTimeOfDeviceReset = timeOfDeviceReset;
		timeOfDeviceReset = newTimeOfDeviceReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLED_BY__TIME_OF_DEVICE_RESET, oldTimeOfDeviceReset, timeOfDeviceReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfHardResets() {
		return numberOfHardResets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfHardResets(Long newNumberOfHardResets) {
		Long oldNumberOfHardResets = numberOfHardResets;
		numberOfHardResets = newNumberOfHardResets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_HARD_RESETS, oldNumberOfHardResets, numberOfHardResets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfSoftResets() {
		return numberOfSoftResets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfSoftResets(Long newNumberOfSoftResets) {
		Long oldNumberOfSoftResets = numberOfSoftResets;
		numberOfSoftResets = newNumberOfSoftResets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_SOFT_RESETS, oldNumberOfSoftResets, numberOfSoftResets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceNumber() {
		return deviceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceNumber(String newDeviceNumber) {
		String oldDeviceNumber = deviceNumber;
		deviceNumber = newDeviceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLED_BY__DEVICE_NUMBER, oldDeviceNumber, deviceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessMode() {
		return accessMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessMode(Integer newAccessMode) {
		Integer oldAccessMode = accessMode;
		accessMode = newAccessMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLED_BY__ACCESS_MODE, oldAccessMode, accessMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessPriority() {
		return accessPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPriority(Integer newAccessPriority) {
		Integer oldAccessPriority = accessPriority;
		accessPriority = newAccessPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLED_BY__ACCESS_PRIORITY, oldAccessPriority, accessPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_STATE:
				return getAccessState();
			case CimPackage.CIM_CONTROLLED_BY__TIME_OF_DEVICE_RESET:
				return getTimeOfDeviceReset();
			case CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_HARD_RESETS:
				return getNumberOfHardResets();
			case CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_SOFT_RESETS:
				return getNumberOfSoftResets();
			case CimPackage.CIM_CONTROLLED_BY__DEVICE_NUMBER:
				return getDeviceNumber();
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_MODE:
				return getAccessMode();
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_PRIORITY:
				return getAccessPriority();
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
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_STATE:
				setAccessState((Integer)newValue);
				return;
			case CimPackage.CIM_CONTROLLED_BY__TIME_OF_DEVICE_RESET:
				setTimeOfDeviceReset((String)newValue);
				return;
			case CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_HARD_RESETS:
				setNumberOfHardResets((Long)newValue);
				return;
			case CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_SOFT_RESETS:
				setNumberOfSoftResets((Long)newValue);
				return;
			case CimPackage.CIM_CONTROLLED_BY__DEVICE_NUMBER:
				setDeviceNumber((String)newValue);
				return;
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_MODE:
				setAccessMode((Integer)newValue);
				return;
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_PRIORITY:
				setAccessPriority((Integer)newValue);
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
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_STATE:
				setAccessState(ACCESS_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_CONTROLLED_BY__TIME_OF_DEVICE_RESET:
				setTimeOfDeviceReset(TIME_OF_DEVICE_RESET_EDEFAULT);
				return;
			case CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_HARD_RESETS:
				setNumberOfHardResets(NUMBER_OF_HARD_RESETS_EDEFAULT);
				return;
			case CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_SOFT_RESETS:
				setNumberOfSoftResets(NUMBER_OF_SOFT_RESETS_EDEFAULT);
				return;
			case CimPackage.CIM_CONTROLLED_BY__DEVICE_NUMBER:
				setDeviceNumber(DEVICE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_MODE:
				setAccessMode(ACCESS_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_PRIORITY:
				setAccessPriority(ACCESS_PRIORITY_EDEFAULT);
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
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_STATE:
				return ACCESS_STATE_EDEFAULT == null ? accessState != null : !ACCESS_STATE_EDEFAULT.equals(accessState);
			case CimPackage.CIM_CONTROLLED_BY__TIME_OF_DEVICE_RESET:
				return TIME_OF_DEVICE_RESET_EDEFAULT == null ? timeOfDeviceReset != null : !TIME_OF_DEVICE_RESET_EDEFAULT.equals(timeOfDeviceReset);
			case CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_HARD_RESETS:
				return NUMBER_OF_HARD_RESETS_EDEFAULT == null ? numberOfHardResets != null : !NUMBER_OF_HARD_RESETS_EDEFAULT.equals(numberOfHardResets);
			case CimPackage.CIM_CONTROLLED_BY__NUMBER_OF_SOFT_RESETS:
				return NUMBER_OF_SOFT_RESETS_EDEFAULT == null ? numberOfSoftResets != null : !NUMBER_OF_SOFT_RESETS_EDEFAULT.equals(numberOfSoftResets);
			case CimPackage.CIM_CONTROLLED_BY__DEVICE_NUMBER:
				return DEVICE_NUMBER_EDEFAULT == null ? deviceNumber != null : !DEVICE_NUMBER_EDEFAULT.equals(deviceNumber);
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_MODE:
				return ACCESS_MODE_EDEFAULT == null ? accessMode != null : !ACCESS_MODE_EDEFAULT.equals(accessMode);
			case CimPackage.CIM_CONTROLLED_BY__ACCESS_PRIORITY:
				return ACCESS_PRIORITY_EDEFAULT == null ? accessPriority != null : !ACCESS_PRIORITY_EDEFAULT.equals(accessPriority);
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
		result.append(" (AccessState: ");
		result.append(accessState);
		result.append(", TimeOfDeviceReset: ");
		result.append(timeOfDeviceReset);
		result.append(", NumberOfHardResets: ");
		result.append(numberOfHardResets);
		result.append(", NumberOfSoftResets: ");
		result.append(numberOfSoftResets);
		result.append(", DeviceNumber: ");
		result.append(deviceNumber);
		result.append(", AccessMode: ");
		result.append(accessMode);
		result.append(", AccessPriority: ");
		result.append(accessPriority);
		result.append(')');
		return result.toString();
	}

} //CIM_ControlledByImpl
