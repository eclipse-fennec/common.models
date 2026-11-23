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

import org.dmtf.cim.CIM_DeviceErrorData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Device Error Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorDataImpl#getIndeterminateErrorCount <em>Indeterminate Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorDataImpl#getCriticalErrorCount <em>Critical Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorDataImpl#getMajorErrorCount <em>Major Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorDataImpl#getMinorErrorCount <em>Minor Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorDataImpl#getWarningCount <em>Warning Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorDataImpl#getLastErrorCode <em>Last Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceErrorDataImpl#getErrorDescription <em>Error Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DeviceErrorDataImpl extends CIM_StatisticalDataImpl implements CIM_DeviceErrorData {
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
	 * The default value of the '{@link #getLastErrorCode() <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastErrorCode() <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastErrorCode()
	 * @generated
	 * @ordered
	 */
	protected String lastErrorCode = LAST_ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected String errorDescription = ERROR_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DeviceErrorDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DeviceErrorData();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_DATA__INDETERMINATE_ERROR_COUNT, oldIndeterminateErrorCount, indeterminateErrorCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_DATA__CRITICAL_ERROR_COUNT, oldCriticalErrorCount, criticalErrorCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_DATA__MAJOR_ERROR_COUNT, oldMajorErrorCount, majorErrorCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_DATA__MINOR_ERROR_COUNT, oldMinorErrorCount, minorErrorCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_DATA__WARNING_COUNT, oldWarningCount, warningCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastErrorCode() {
		return lastErrorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastErrorCode(String newLastErrorCode) {
		String oldLastErrorCode = lastErrorCode;
		lastErrorCode = newLastErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_DATA__LAST_ERROR_CODE, oldLastErrorCode, lastErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorDescription(String newErrorDescription) {
		String oldErrorDescription = errorDescription;
		errorDescription = newErrorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_ERROR_DATA__ERROR_DESCRIPTION, oldErrorDescription, errorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DEVICE_ERROR_DATA__INDETERMINATE_ERROR_COUNT:
				return getIndeterminateErrorCount();
			case CimPackage.CIM_DEVICE_ERROR_DATA__CRITICAL_ERROR_COUNT:
				return getCriticalErrorCount();
			case CimPackage.CIM_DEVICE_ERROR_DATA__MAJOR_ERROR_COUNT:
				return getMajorErrorCount();
			case CimPackage.CIM_DEVICE_ERROR_DATA__MINOR_ERROR_COUNT:
				return getMinorErrorCount();
			case CimPackage.CIM_DEVICE_ERROR_DATA__WARNING_COUNT:
				return getWarningCount();
			case CimPackage.CIM_DEVICE_ERROR_DATA__LAST_ERROR_CODE:
				return getLastErrorCode();
			case CimPackage.CIM_DEVICE_ERROR_DATA__ERROR_DESCRIPTION:
				return getErrorDescription();
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
			case CimPackage.CIM_DEVICE_ERROR_DATA__INDETERMINATE_ERROR_COUNT:
				setIndeterminateErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__CRITICAL_ERROR_COUNT:
				setCriticalErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__MAJOR_ERROR_COUNT:
				setMajorErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__MINOR_ERROR_COUNT:
				setMinorErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__WARNING_COUNT:
				setWarningCount((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__LAST_ERROR_CODE:
				setLastErrorCode((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__ERROR_DESCRIPTION:
				setErrorDescription((String)newValue);
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
			case CimPackage.CIM_DEVICE_ERROR_DATA__INDETERMINATE_ERROR_COUNT:
				setIndeterminateErrorCount(INDETERMINATE_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__CRITICAL_ERROR_COUNT:
				setCriticalErrorCount(CRITICAL_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__MAJOR_ERROR_COUNT:
				setMajorErrorCount(MAJOR_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__MINOR_ERROR_COUNT:
				setMinorErrorCount(MINOR_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__WARNING_COUNT:
				setWarningCount(WARNING_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__LAST_ERROR_CODE:
				setLastErrorCode(LAST_ERROR_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_ERROR_DATA__ERROR_DESCRIPTION:
				setErrorDescription(ERROR_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_DEVICE_ERROR_DATA__INDETERMINATE_ERROR_COUNT:
				return INDETERMINATE_ERROR_COUNT_EDEFAULT == null ? indeterminateErrorCount != null : !INDETERMINATE_ERROR_COUNT_EDEFAULT.equals(indeterminateErrorCount);
			case CimPackage.CIM_DEVICE_ERROR_DATA__CRITICAL_ERROR_COUNT:
				return CRITICAL_ERROR_COUNT_EDEFAULT == null ? criticalErrorCount != null : !CRITICAL_ERROR_COUNT_EDEFAULT.equals(criticalErrorCount);
			case CimPackage.CIM_DEVICE_ERROR_DATA__MAJOR_ERROR_COUNT:
				return MAJOR_ERROR_COUNT_EDEFAULT == null ? majorErrorCount != null : !MAJOR_ERROR_COUNT_EDEFAULT.equals(majorErrorCount);
			case CimPackage.CIM_DEVICE_ERROR_DATA__MINOR_ERROR_COUNT:
				return MINOR_ERROR_COUNT_EDEFAULT == null ? minorErrorCount != null : !MINOR_ERROR_COUNT_EDEFAULT.equals(minorErrorCount);
			case CimPackage.CIM_DEVICE_ERROR_DATA__WARNING_COUNT:
				return WARNING_COUNT_EDEFAULT == null ? warningCount != null : !WARNING_COUNT_EDEFAULT.equals(warningCount);
			case CimPackage.CIM_DEVICE_ERROR_DATA__LAST_ERROR_CODE:
				return LAST_ERROR_CODE_EDEFAULT == null ? lastErrorCode != null : !LAST_ERROR_CODE_EDEFAULT.equals(lastErrorCode);
			case CimPackage.CIM_DEVICE_ERROR_DATA__ERROR_DESCRIPTION:
				return ERROR_DESCRIPTION_EDEFAULT == null ? errorDescription != null : !ERROR_DESCRIPTION_EDEFAULT.equals(errorDescription);
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
		result.append(" (IndeterminateErrorCount: ");
		result.append(indeterminateErrorCount);
		result.append(", CriticalErrorCount: ");
		result.append(criticalErrorCount);
		result.append(", MajorErrorCount: ");
		result.append(majorErrorCount);
		result.append(", MinorErrorCount: ");
		result.append(minorErrorCount);
		result.append(", WarningCount: ");
		result.append(warningCount);
		result.append(", LastErrorCode: ");
		result.append(lastErrorCode);
		result.append(", ErrorDescription: ");
		result.append(errorDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_DeviceErrorDataImpl
