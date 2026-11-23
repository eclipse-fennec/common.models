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

import org.dmtf.cim.CIM_DeviceStatisticalInformation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Device Statistical Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceStatisticalInformationImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceStatisticalInformationImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceStatisticalInformationImpl#getDeviceCreationClassName <em>Device Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceStatisticalInformationImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceStatisticalInformationImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DeviceStatisticalInformationImpl extends CIM_StatisticalInformationImpl implements CIM_DeviceStatisticalInformation {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceCreationClassName() <em>Device Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceCreationClassName() <em>Device Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String deviceCreationClassName = DEVICE_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String deviceID = DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DeviceStatisticalInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DeviceStatisticalInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceCreationClassName() {
		return deviceCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceCreationClassName(String newDeviceCreationClassName) {
		String oldDeviceCreationClassName = deviceCreationClassName;
		deviceCreationClassName = newDeviceCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_CREATION_CLASS_NAME, oldDeviceCreationClassName, deviceCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceID() {
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceID(String newDeviceID) {
		String oldDeviceID = deviceID;
		deviceID = newDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_ID, oldDeviceID, deviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_CREATION_CLASS_NAME:
				return getDeviceCreationClassName();
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_ID:
				return getDeviceID();
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__CREATION_CLASS_NAME:
				return getCreationClassName();
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
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_CREATION_CLASS_NAME:
				setDeviceCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_ID:
				setDeviceID((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
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
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_CREATION_CLASS_NAME:
				setDeviceCreationClassName(DEVICE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_ID:
				setDeviceID(DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
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
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_CREATION_CLASS_NAME:
				return DEVICE_CREATION_CLASS_NAME_EDEFAULT == null ? deviceCreationClassName != null : !DEVICE_CREATION_CLASS_NAME_EDEFAULT.equals(deviceCreationClassName);
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceID != null : !DEVICE_ID_EDEFAULT.equals(deviceID);
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", DeviceCreationClassName: ");
		result.append(deviceCreationClassName);
		result.append(", DeviceID: ");
		result.append(deviceID);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(')');
		return result.toString();
	}

} //CIM_DeviceStatisticalInformationImpl
