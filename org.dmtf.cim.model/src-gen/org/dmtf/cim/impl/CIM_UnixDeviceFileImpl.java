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

import org.dmtf.cim.CIM_UnixDeviceFile;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unix Device File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixDeviceFileImpl#getDeviceFileType <em>Device File Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixDeviceFileImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixDeviceFileImpl#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixDeviceFileImpl#getDeviceDescription <em>Device Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixDeviceFileImpl#getDeviceMajor <em>Device Major</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixDeviceFileImpl#getDeviceMinor <em>Device Minor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnixDeviceFileImpl extends CIM_DeviceFileImpl implements CIM_UnixDeviceFile {
	/**
	 * The default value of the '{@link #getDeviceFileType() <em>Device File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFileType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEVICE_FILE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceFileType() <em>Device File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFileType()
	 * @generated
	 * @ordered
	 */
	protected Integer deviceFileType = DEVICE_FILE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected String deviceId = DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceDescription() <em>Device Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceDescription() <em>Device Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDescription()
	 * @generated
	 * @ordered
	 */
	protected String deviceDescription = DEVICE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceMajor() <em>Device Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceMajor()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_MAJOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceMajor() <em>Device Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceMajor()
	 * @generated
	 * @ordered
	 */
	protected String deviceMajor = DEVICE_MAJOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceMinor() <em>Device Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceMinor()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_MINOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceMinor() <em>Device Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceMinor()
	 * @generated
	 * @ordered
	 */
	protected String deviceMinor = DEVICE_MINOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnixDeviceFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnixDeviceFile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeviceFileType() {
		return deviceFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceFileType(Integer newDeviceFileType) {
		Integer oldDeviceFileType = deviceFileType;
		deviceFileType = newDeviceFileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_FILE_TYPE, oldDeviceFileType, deviceFileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_DEVICE_FILE__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceId(String newDeviceId) {
		String oldDeviceId = deviceId;
		deviceId = newDeviceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_ID, oldDeviceId, deviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceDescription() {
		return deviceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceDescription(String newDeviceDescription) {
		String oldDeviceDescription = deviceDescription;
		deviceDescription = newDeviceDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_DESCRIPTION, oldDeviceDescription, deviceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceMajor() {
		return deviceMajor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceMajor(String newDeviceMajor) {
		String oldDeviceMajor = deviceMajor;
		deviceMajor = newDeviceMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MAJOR, oldDeviceMajor, deviceMajor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceMinor() {
		return deviceMinor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceMinor(String newDeviceMinor) {
		String oldDeviceMinor = deviceMinor;
		deviceMinor = newDeviceMinor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MINOR, oldDeviceMinor, deviceMinor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_FILE_TYPE:
				return getDeviceFileType();
			case CimPackage.CIM_UNIX_DEVICE_FILE__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_ID:
				return getDeviceId();
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_DESCRIPTION:
				return getDeviceDescription();
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MAJOR:
				return getDeviceMajor();
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MINOR:
				return getDeviceMinor();
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
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_FILE_TYPE:
				setDeviceFileType((Integer)newValue);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_ID:
				setDeviceId((String)newValue);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_DESCRIPTION:
				setDeviceDescription((String)newValue);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MAJOR:
				setDeviceMajor((String)newValue);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MINOR:
				setDeviceMinor((String)newValue);
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
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_FILE_TYPE:
				setDeviceFileType(DEVICE_FILE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_ID:
				setDeviceId(DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_DESCRIPTION:
				setDeviceDescription(DEVICE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MAJOR:
				setDeviceMajor(DEVICE_MAJOR_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MINOR:
				setDeviceMinor(DEVICE_MINOR_EDEFAULT);
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
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_FILE_TYPE:
				return DEVICE_FILE_TYPE_EDEFAULT == null ? deviceFileType != null : !DEVICE_FILE_TYPE_EDEFAULT.equals(deviceFileType);
			case CimPackage.CIM_UNIX_DEVICE_FILE__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceId != null : !DEVICE_ID_EDEFAULT.equals(deviceId);
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_DESCRIPTION:
				return DEVICE_DESCRIPTION_EDEFAULT == null ? deviceDescription != null : !DEVICE_DESCRIPTION_EDEFAULT.equals(deviceDescription);
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MAJOR:
				return DEVICE_MAJOR_EDEFAULT == null ? deviceMajor != null : !DEVICE_MAJOR_EDEFAULT.equals(deviceMajor);
			case CimPackage.CIM_UNIX_DEVICE_FILE__DEVICE_MINOR:
				return DEVICE_MINOR_EDEFAULT == null ? deviceMinor != null : !DEVICE_MINOR_EDEFAULT.equals(deviceMinor);
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
		result.append(" (DeviceFileType: ");
		result.append(deviceFileType);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", DeviceId: ");
		result.append(deviceId);
		result.append(", DeviceDescription: ");
		result.append(deviceDescription);
		result.append(", DeviceMajor: ");
		result.append(deviceMajor);
		result.append(", DeviceMinor: ");
		result.append(deviceMinor);
		result.append(')');
		return result.toString();
	}

} //CIM_UnixDeviceFileImpl
