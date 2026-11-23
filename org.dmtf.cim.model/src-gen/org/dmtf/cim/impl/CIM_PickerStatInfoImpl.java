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

import org.dmtf.cim.CIM_PickerStatInfo;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Picker Stat Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PickerStatInfoImpl#getPickSuccesses <em>Pick Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PickerStatInfoImpl#getPickFailures <em>Pick Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PickerStatInfoImpl#getPickRetries <em>Pick Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PickerStatInfoImpl#getPutSuccesses <em>Put Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PickerStatInfoImpl#getPutFailures <em>Put Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PickerStatInfoImpl#getPutRetries <em>Put Retries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PickerStatInfoImpl extends CIM_DeviceStatisticalInformationImpl implements CIM_PickerStatInfo {
	/**
	 * The default value of the '{@link #getPickSuccesses() <em>Pick Successes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickSuccesses()
	 * @generated
	 * @ordered
	 */
	protected static final Long PICK_SUCCESSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPickSuccesses() <em>Pick Successes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickSuccesses()
	 * @generated
	 * @ordered
	 */
	protected Long pickSuccesses = PICK_SUCCESSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPickFailures() <em>Pick Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long PICK_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPickFailures() <em>Pick Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickFailures()
	 * @generated
	 * @ordered
	 */
	protected Long pickFailures = PICK_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPickRetries() <em>Pick Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickRetries()
	 * @generated
	 * @ordered
	 */
	protected static final Long PICK_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPickRetries() <em>Pick Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickRetries()
	 * @generated
	 * @ordered
	 */
	protected Long pickRetries = PICK_RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPutSuccesses() <em>Put Successes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPutSuccesses()
	 * @generated
	 * @ordered
	 */
	protected static final Long PUT_SUCCESSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPutSuccesses() <em>Put Successes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPutSuccesses()
	 * @generated
	 * @ordered
	 */
	protected Long putSuccesses = PUT_SUCCESSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPutFailures() <em>Put Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPutFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long PUT_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPutFailures() <em>Put Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPutFailures()
	 * @generated
	 * @ordered
	 */
	protected Long putFailures = PUT_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPutRetries() <em>Put Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPutRetries()
	 * @generated
	 * @ordered
	 */
	protected static final Long PUT_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPutRetries() <em>Put Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPutRetries()
	 * @generated
	 * @ordered
	 */
	protected Long putRetries = PUT_RETRIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PickerStatInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PickerStatInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPickSuccesses() {
		return pickSuccesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPickSuccesses(Long newPickSuccesses) {
		Long oldPickSuccesses = pickSuccesses;
		pickSuccesses = newPickSuccesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PICKER_STAT_INFO__PICK_SUCCESSES, oldPickSuccesses, pickSuccesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPickFailures() {
		return pickFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPickFailures(Long newPickFailures) {
		Long oldPickFailures = pickFailures;
		pickFailures = newPickFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PICKER_STAT_INFO__PICK_FAILURES, oldPickFailures, pickFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPickRetries() {
		return pickRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPickRetries(Long newPickRetries) {
		Long oldPickRetries = pickRetries;
		pickRetries = newPickRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PICKER_STAT_INFO__PICK_RETRIES, oldPickRetries, pickRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPutSuccesses() {
		return putSuccesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPutSuccesses(Long newPutSuccesses) {
		Long oldPutSuccesses = putSuccesses;
		putSuccesses = newPutSuccesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PICKER_STAT_INFO__PUT_SUCCESSES, oldPutSuccesses, putSuccesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPutFailures() {
		return putFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPutFailures(Long newPutFailures) {
		Long oldPutFailures = putFailures;
		putFailures = newPutFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PICKER_STAT_INFO__PUT_FAILURES, oldPutFailures, putFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPutRetries() {
		return putRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPutRetries(Long newPutRetries) {
		Long oldPutRetries = putRetries;
		putRetries = newPutRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PICKER_STAT_INFO__PUT_RETRIES, oldPutRetries, putRetries));
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
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_SUCCESSES:
				return getPickSuccesses();
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_FAILURES:
				return getPickFailures();
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_RETRIES:
				return getPickRetries();
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_SUCCESSES:
				return getPutSuccesses();
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_FAILURES:
				return getPutFailures();
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_RETRIES:
				return getPutRetries();
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
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_SUCCESSES:
				setPickSuccesses((Long)newValue);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_FAILURES:
				setPickFailures((Long)newValue);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_RETRIES:
				setPickRetries((Long)newValue);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_SUCCESSES:
				setPutSuccesses((Long)newValue);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_FAILURES:
				setPutFailures((Long)newValue);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_RETRIES:
				setPutRetries((Long)newValue);
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
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_SUCCESSES:
				setPickSuccesses(PICK_SUCCESSES_EDEFAULT);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_FAILURES:
				setPickFailures(PICK_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_RETRIES:
				setPickRetries(PICK_RETRIES_EDEFAULT);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_SUCCESSES:
				setPutSuccesses(PUT_SUCCESSES_EDEFAULT);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_FAILURES:
				setPutFailures(PUT_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_RETRIES:
				setPutRetries(PUT_RETRIES_EDEFAULT);
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
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_SUCCESSES:
				return PICK_SUCCESSES_EDEFAULT == null ? pickSuccesses != null : !PICK_SUCCESSES_EDEFAULT.equals(pickSuccesses);
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_FAILURES:
				return PICK_FAILURES_EDEFAULT == null ? pickFailures != null : !PICK_FAILURES_EDEFAULT.equals(pickFailures);
			case CimPackage.CIM_PICKER_STAT_INFO__PICK_RETRIES:
				return PICK_RETRIES_EDEFAULT == null ? pickRetries != null : !PICK_RETRIES_EDEFAULT.equals(pickRetries);
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_SUCCESSES:
				return PUT_SUCCESSES_EDEFAULT == null ? putSuccesses != null : !PUT_SUCCESSES_EDEFAULT.equals(putSuccesses);
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_FAILURES:
				return PUT_FAILURES_EDEFAULT == null ? putFailures != null : !PUT_FAILURES_EDEFAULT.equals(putFailures);
			case CimPackage.CIM_PICKER_STAT_INFO__PUT_RETRIES:
				return PUT_RETRIES_EDEFAULT == null ? putRetries != null : !PUT_RETRIES_EDEFAULT.equals(putRetries);
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
			case CimPackage.CIM_PICKER_STAT_INFO___RESET_COUNTER__INTEGER:
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
		result.append(" (PickSuccesses: ");
		result.append(pickSuccesses);
		result.append(", PickFailures: ");
		result.append(pickFailures);
		result.append(", PickRetries: ");
		result.append(pickRetries);
		result.append(", PutSuccesses: ");
		result.append(putSuccesses);
		result.append(", PutFailures: ");
		result.append(putFailures);
		result.append(", PutRetries: ");
		result.append(putRetries);
		result.append(')');
		return result.toString();
	}

} //CIM_PickerStatInfoImpl
