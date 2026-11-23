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

import java.util.Collection;

import org.dmtf.cim.CIM_FCHBADiagnosticSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FCHBA Diagnostic Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getEchoMechanism <em>Echo Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getOtherEchoMechanism <em>Other Echo Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getTargetDeviceFormat <em>Target Device Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getTargetDevice <em>Target Device</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getLUN <em>LUN</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getBufferSizes <em>Buffer Sizes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getBufferPattern <em>Buffer Pattern</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getPingMechanism <em>Ping Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getOtherPingMechanism <em>Other Ping Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticSettingDataImpl#getOtherTargetDeviceFormat <em>Other Target Device Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCHBADiagnosticSettingDataImpl extends CIM_DiagnosticSettingDataImpl implements CIM_FCHBADiagnosticSettingData {
	/**
	 * The default value of the '{@link #getEchoMechanism() <em>Echo Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchoMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final Long ECHO_MECHANISM_EDEFAULT = Long.valueOf(2L);

	/**
	 * The cached value of the '{@link #getEchoMechanism() <em>Echo Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchoMechanism()
	 * @generated
	 * @ordered
	 */
	protected Long echoMechanism = ECHO_MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEchoMechanism() <em>Other Echo Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEchoMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ECHO_MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEchoMechanism() <em>Other Echo Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEchoMechanism()
	 * @generated
	 * @ordered
	 */
	protected String otherEchoMechanism = OTHER_ECHO_MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDeviceFormat() <em>Target Device Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDeviceFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DEVICE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDeviceFormat() <em>Target Device Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDeviceFormat()
	 * @generated
	 * @ordered
	 */
	protected String targetDeviceFormat = TARGET_DEVICE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDevice() <em>Target Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDevice() <em>Target Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDevice()
	 * @generated
	 * @ordered
	 */
	protected String targetDevice = TARGET_DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLUN() <em>LUN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLUN()
	 * @generated
	 * @ordered
	 */
	protected static final Long LUN_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getLUN() <em>LUN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLUN()
	 * @generated
	 * @ordered
	 */
	protected Long lun = LUN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBufferSizes() <em>Buffer Sizes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSizes()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> bufferSizes;

	/**
	 * The cached value of the '{@link #getBufferPattern() <em>Buffer Pattern</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> bufferPattern;

	/**
	 * The default value of the '{@link #getPingMechanism() <em>Ping Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPingMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PING_MECHANISM_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getPingMechanism() <em>Ping Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPingMechanism()
	 * @generated
	 * @ordered
	 */
	protected Integer pingMechanism = PING_MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPingMechanism() <em>Other Ping Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPingMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PING_MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPingMechanism() <em>Other Ping Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPingMechanism()
	 * @generated
	 * @ordered
	 */
	protected String otherPingMechanism = OTHER_PING_MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTargetDeviceFormat() <em>Other Target Device Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTargetDeviceFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TARGET_DEVICE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTargetDeviceFormat() <em>Other Target Device Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTargetDeviceFormat()
	 * @generated
	 * @ordered
	 */
	protected String otherTargetDeviceFormat = OTHER_TARGET_DEVICE_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCHBADiagnosticSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCHBADiagnosticSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEchoMechanism() {
		return echoMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEchoMechanism(Long newEchoMechanism) {
		Long oldEchoMechanism = echoMechanism;
		echoMechanism = newEchoMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__ECHO_MECHANISM, oldEchoMechanism, echoMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEchoMechanism() {
		return otherEchoMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEchoMechanism(String newOtherEchoMechanism) {
		String oldOtherEchoMechanism = otherEchoMechanism;
		otherEchoMechanism = newOtherEchoMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_ECHO_MECHANISM, oldOtherEchoMechanism, otherEchoMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetDeviceFormat() {
		return targetDeviceFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDeviceFormat(String newTargetDeviceFormat) {
		String oldTargetDeviceFormat = targetDeviceFormat;
		targetDeviceFormat = newTargetDeviceFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE_FORMAT, oldTargetDeviceFormat, targetDeviceFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetDevice() {
		return targetDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDevice(String newTargetDevice) {
		String oldTargetDevice = targetDevice;
		targetDevice = newTargetDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE, oldTargetDevice, targetDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLUN() {
		return lun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLUN(Long newLUN) {
		Long oldLUN = lun;
		lun = newLUN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__LUN, oldLUN, lun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getBufferSizes() {
		if (bufferSizes == null) {
			bufferSizes = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_SIZES);
		}
		return bufferSizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getBufferPattern() {
		if (bufferPattern == null) {
			bufferPattern = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_PATTERN);
		}
		return bufferPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPingMechanism() {
		return pingMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPingMechanism(Integer newPingMechanism) {
		Integer oldPingMechanism = pingMechanism;
		pingMechanism = newPingMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__PING_MECHANISM, oldPingMechanism, pingMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPingMechanism() {
		return otherPingMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPingMechanism(String newOtherPingMechanism) {
		String oldOtherPingMechanism = otherPingMechanism;
		otherPingMechanism = newOtherPingMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_PING_MECHANISM, oldOtherPingMechanism, otherPingMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTargetDeviceFormat() {
		return otherTargetDeviceFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTargetDeviceFormat(String newOtherTargetDeviceFormat) {
		String oldOtherTargetDeviceFormat = otherTargetDeviceFormat;
		otherTargetDeviceFormat = newOtherTargetDeviceFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_TARGET_DEVICE_FORMAT, oldOtherTargetDeviceFormat, otherTargetDeviceFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__ECHO_MECHANISM:
				return getEchoMechanism();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_ECHO_MECHANISM:
				return getOtherEchoMechanism();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE_FORMAT:
				return getTargetDeviceFormat();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE:
				return getTargetDevice();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__LUN:
				return getLUN();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_SIZES:
				return getBufferSizes();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_PATTERN:
				return getBufferPattern();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__PING_MECHANISM:
				return getPingMechanism();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_PING_MECHANISM:
				return getOtherPingMechanism();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_TARGET_DEVICE_FORMAT:
				return getOtherTargetDeviceFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__ECHO_MECHANISM:
				setEchoMechanism((Long)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_ECHO_MECHANISM:
				setOtherEchoMechanism((String)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE_FORMAT:
				setTargetDeviceFormat((String)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE:
				setTargetDevice((String)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__LUN:
				setLUN((Long)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_SIZES:
				getBufferSizes().clear();
				getBufferSizes().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_PATTERN:
				getBufferPattern().clear();
				getBufferPattern().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__PING_MECHANISM:
				setPingMechanism((Integer)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_PING_MECHANISM:
				setOtherPingMechanism((String)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_TARGET_DEVICE_FORMAT:
				setOtherTargetDeviceFormat((String)newValue);
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
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__ECHO_MECHANISM:
				setEchoMechanism(ECHO_MECHANISM_EDEFAULT);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_ECHO_MECHANISM:
				setOtherEchoMechanism(OTHER_ECHO_MECHANISM_EDEFAULT);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE_FORMAT:
				setTargetDeviceFormat(TARGET_DEVICE_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE:
				setTargetDevice(TARGET_DEVICE_EDEFAULT);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__LUN:
				setLUN(LUN_EDEFAULT);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_SIZES:
				getBufferSizes().clear();
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_PATTERN:
				getBufferPattern().clear();
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__PING_MECHANISM:
				setPingMechanism(PING_MECHANISM_EDEFAULT);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_PING_MECHANISM:
				setOtherPingMechanism(OTHER_PING_MECHANISM_EDEFAULT);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_TARGET_DEVICE_FORMAT:
				setOtherTargetDeviceFormat(OTHER_TARGET_DEVICE_FORMAT_EDEFAULT);
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
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__ECHO_MECHANISM:
				return ECHO_MECHANISM_EDEFAULT == null ? echoMechanism != null : !ECHO_MECHANISM_EDEFAULT.equals(echoMechanism);
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_ECHO_MECHANISM:
				return OTHER_ECHO_MECHANISM_EDEFAULT == null ? otherEchoMechanism != null : !OTHER_ECHO_MECHANISM_EDEFAULT.equals(otherEchoMechanism);
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE_FORMAT:
				return TARGET_DEVICE_FORMAT_EDEFAULT == null ? targetDeviceFormat != null : !TARGET_DEVICE_FORMAT_EDEFAULT.equals(targetDeviceFormat);
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__TARGET_DEVICE:
				return TARGET_DEVICE_EDEFAULT == null ? targetDevice != null : !TARGET_DEVICE_EDEFAULT.equals(targetDevice);
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__LUN:
				return LUN_EDEFAULT == null ? lun != null : !LUN_EDEFAULT.equals(lun);
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_SIZES:
				return bufferSizes != null && !bufferSizes.isEmpty();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__BUFFER_PATTERN:
				return bufferPattern != null && !bufferPattern.isEmpty();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__PING_MECHANISM:
				return PING_MECHANISM_EDEFAULT == null ? pingMechanism != null : !PING_MECHANISM_EDEFAULT.equals(pingMechanism);
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_PING_MECHANISM:
				return OTHER_PING_MECHANISM_EDEFAULT == null ? otherPingMechanism != null : !OTHER_PING_MECHANISM_EDEFAULT.equals(otherPingMechanism);
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA__OTHER_TARGET_DEVICE_FORMAT:
				return OTHER_TARGET_DEVICE_FORMAT_EDEFAULT == null ? otherTargetDeviceFormat != null : !OTHER_TARGET_DEVICE_FORMAT_EDEFAULT.equals(otherTargetDeviceFormat);
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
		result.append(" (EchoMechanism: ");
		result.append(echoMechanism);
		result.append(", OtherEchoMechanism: ");
		result.append(otherEchoMechanism);
		result.append(", TargetDeviceFormat: ");
		result.append(targetDeviceFormat);
		result.append(", TargetDevice: ");
		result.append(targetDevice);
		result.append(", LUN: ");
		result.append(lun);
		result.append(", BufferSizes: ");
		result.append(bufferSizes);
		result.append(", BufferPattern: ");
		result.append(bufferPattern);
		result.append(", PingMechanism: ");
		result.append(pingMechanism);
		result.append(", OtherPingMechanism: ");
		result.append(otherPingMechanism);
		result.append(", OtherTargetDeviceFormat: ");
		result.append(otherTargetDeviceFormat);
		result.append(')');
		return result.toString();
	}

} //CIM_FCHBADiagnosticSettingDataImpl
