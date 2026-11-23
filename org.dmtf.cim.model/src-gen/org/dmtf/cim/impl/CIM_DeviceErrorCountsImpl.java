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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_DeviceErrorCounts;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Device Error Counts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorCountsImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorCountsImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorCountsImpl#getDeviceCreationClassName <em>Device Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorCountsImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorCountsImpl#getIndeterminateErrorCount <em>Indeterminate Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorCountsImpl#getCriticalErrorCount <em>Critical Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorCountsImpl#getMajorErrorCount <em>Major Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorCountsImpl#getMinorErrorCount <em>Minor Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorCountsImpl#getWarningCount <em>Warning Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DeviceErrorCountsImpl extends CIM_StatisticalInformationImpl implements CIM_DeviceErrorCounts {
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
	 * The default value of the '{@link #getIndeterminateErrorCount() <em>Indeterminate Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndeterminateErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long INDETERMINATE_ERROR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndeterminateErrorCount() <em>Indeterminate Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndeterminateErrorCount()
	 * @generated
	 * @ordered
	 */
	protected Long indeterminateErrorCount = INDETERMINATE_ERROR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticalErrorCount() <em>Critical Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long CRITICAL_ERROR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriticalErrorCount() <em>Critical Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalErrorCount()
	 * @generated
	 * @ordered
	 */
	protected Long criticalErrorCount = CRITICAL_ERROR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMajorErrorCount() <em>Major Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAJOR_ERROR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMajorErrorCount() <em>Major Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorErrorCount()
	 * @generated
	 * @ordered
	 */
	protected Long majorErrorCount = MAJOR_ERROR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinorErrorCount() <em>Minor Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long MINOR_ERROR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinorErrorCount() <em>Minor Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorErrorCount()
	 * @generated
	 * @ordered
	 */
	protected Long minorErrorCount = MINOR_ERROR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarningCount() <em>Warning Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long WARNING_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarningCount() <em>Warning Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningCount()
	 * @generated
	 * @ordered
	 */
	protected Long warningCount = WARNING_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DeviceErrorCountsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DeviceErrorCounts();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_NAME, oldSystemName, systemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_CREATION_CLASS_NAME, oldDeviceCreationClassName, deviceCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_ID, oldDeviceID, deviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIndeterminateErrorCount() {
		return indeterminateErrorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndeterminateErrorCount(Long newIndeterminateErrorCount) {
		Long oldIndeterminateErrorCount = indeterminateErrorCount;
		indeterminateErrorCount = newIndeterminateErrorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_COUNTS__INDETERMINATE_ERROR_COUNT, oldIndeterminateErrorCount, indeterminateErrorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCriticalErrorCount() {
		return criticalErrorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriticalErrorCount(Long newCriticalErrorCount) {
		Long oldCriticalErrorCount = criticalErrorCount;
		criticalErrorCount = newCriticalErrorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_COUNTS__CRITICAL_ERROR_COUNT, oldCriticalErrorCount, criticalErrorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMajorErrorCount() {
		return majorErrorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMajorErrorCount(Long newMajorErrorCount) {
		Long oldMajorErrorCount = majorErrorCount;
		majorErrorCount = newMajorErrorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_COUNTS__MAJOR_ERROR_COUNT, oldMajorErrorCount, majorErrorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinorErrorCount() {
		return minorErrorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinorErrorCount(Long newMinorErrorCount) {
		Long oldMinorErrorCount = minorErrorCount;
		minorErrorCount = newMinorErrorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_COUNTS__MINOR_ERROR_COUNT, oldMinorErrorCount, minorErrorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWarningCount() {
		return warningCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWarningCount(Long newWarningCount) {
		Long oldWarningCount = warningCount;
		warningCount = newWarningCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_COUNTS__WARNING_COUNT, oldWarningCount, warningCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ResetCounter(Integer SelectedCounter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_CREATION_CLASS_NAME:
				return getDeviceCreationClassName();
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_ID:
				return getDeviceID();
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__INDETERMINATE_ERROR_COUNT:
				return getIndeterminateErrorCount();
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__CRITICAL_ERROR_COUNT:
				return getCriticalErrorCount();
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__MAJOR_ERROR_COUNT:
				return getMajorErrorCount();
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__MINOR_ERROR_COUNT:
				return getMinorErrorCount();
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__WARNING_COUNT:
				return getWarningCount();
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
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_CREATION_CLASS_NAME:
				setDeviceCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_ID:
				setDeviceID((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__INDETERMINATE_ERROR_COUNT:
				setIndeterminateErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__CRITICAL_ERROR_COUNT:
				setCriticalErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__MAJOR_ERROR_COUNT:
				setMajorErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__MINOR_ERROR_COUNT:
				setMinorErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__WARNING_COUNT:
				setWarningCount((Long)newValue);
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
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_CREATION_CLASS_NAME:
				setDeviceCreationClassName(DEVICE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_ID:
				setDeviceID(DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__INDETERMINATE_ERROR_COUNT:
				setIndeterminateErrorCount(INDETERMINATE_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__CRITICAL_ERROR_COUNT:
				setCriticalErrorCount(CRITICAL_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__MAJOR_ERROR_COUNT:
				setMajorErrorCount(MAJOR_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__MINOR_ERROR_COUNT:
				setMinorErrorCount(MINOR_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__WARNING_COUNT:
				setWarningCount(WARNING_COUNT_EDEFAULT);
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
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_CREATION_CLASS_NAME:
				return DEVICE_CREATION_CLASS_NAME_EDEFAULT == null ? deviceCreationClassName != null : !DEVICE_CREATION_CLASS_NAME_EDEFAULT.equals(deviceCreationClassName);
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceID != null : !DEVICE_ID_EDEFAULT.equals(deviceID);
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__INDETERMINATE_ERROR_COUNT:
				return INDETERMINATE_ERROR_COUNT_EDEFAULT == null ? indeterminateErrorCount != null : !INDETERMINATE_ERROR_COUNT_EDEFAULT.equals(indeterminateErrorCount);
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__CRITICAL_ERROR_COUNT:
				return CRITICAL_ERROR_COUNT_EDEFAULT == null ? criticalErrorCount != null : !CRITICAL_ERROR_COUNT_EDEFAULT.equals(criticalErrorCount);
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__MAJOR_ERROR_COUNT:
				return MAJOR_ERROR_COUNT_EDEFAULT == null ? majorErrorCount != null : !MAJOR_ERROR_COUNT_EDEFAULT.equals(majorErrorCount);
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__MINOR_ERROR_COUNT:
				return MINOR_ERROR_COUNT_EDEFAULT == null ? minorErrorCount != null : !MINOR_ERROR_COUNT_EDEFAULT.equals(minorErrorCount);
			case CimPackage.CIM_DEVICE_ERROR_COUNTS__WARNING_COUNT:
				return WARNING_COUNT_EDEFAULT == null ? warningCount != null : !WARNING_COUNT_EDEFAULT.equals(warningCount);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_DEVICE_ERROR_COUNTS___RESET_COUNTER__INTEGER:
				return ResetCounter((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", IndeterminateErrorCount: ");
		result.append(indeterminateErrorCount);
		result.append(", CriticalErrorCount: ");
		result.append(criticalErrorCount);
		result.append(", MajorErrorCount: ");
		result.append(majorErrorCount);
		result.append(", MinorErrorCount: ");
		result.append(minorErrorCount);
		result.append(", WarningCount: ");
		result.append(warningCount);
		result.append(')');
		return result.toString();
	}

} //CIM_DeviceErrorCountsImpl
