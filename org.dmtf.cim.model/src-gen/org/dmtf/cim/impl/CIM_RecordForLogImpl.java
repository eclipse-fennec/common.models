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

import org.dmtf.cim.CIM_RecordForLog;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Record For Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RecordForLogImpl#getRecordFormat <em>Record Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RecordForLogImpl#getRecordData <em>Record Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RecordForLogImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RecordForLogImpl#getPerceivedSeverity <em>Perceived Severity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_RecordForLogImpl extends CIM_ManagedElementImpl implements CIM_RecordForLog {
	/**
	 * The default value of the '{@link #getRecordFormat() <em>Record Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordFormat() <em>Record Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordFormat()
	 * @generated
	 * @ordered
	 */
	protected String recordFormat = RECORD_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordData() <em>Record Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordData()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordData() <em>Record Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordData()
	 * @generated
	 * @ordered
	 */
	protected String recordData = RECORD_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerceivedSeverity() <em>Perceived Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceivedSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCEIVED_SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerceivedSeverity() <em>Perceived Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceivedSeverity()
	 * @generated
	 * @ordered
	 */
	protected Integer perceivedSeverity = PERCEIVED_SEVERITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RecordForLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RecordForLog();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordFormat() {
		return recordFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordFormat(String newRecordFormat) {
		String oldRecordFormat = recordFormat;
		recordFormat = newRecordFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RECORD_FOR_LOG__RECORD_FORMAT, oldRecordFormat, recordFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordData() {
		return recordData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordData(String newRecordData) {
		String oldRecordData = recordData;
		recordData = newRecordData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RECORD_FOR_LOG__RECORD_DATA, oldRecordData, recordData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RECORD_FOR_LOG__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPerceivedSeverity() {
		return perceivedSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerceivedSeverity(Integer newPerceivedSeverity) {
		Integer oldPerceivedSeverity = perceivedSeverity;
		perceivedSeverity = newPerceivedSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RECORD_FOR_LOG__PERCEIVED_SEVERITY, oldPerceivedSeverity, perceivedSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RECORD_FOR_LOG__RECORD_FORMAT:
				return getRecordFormat();
			case CimPackage.CIM_RECORD_FOR_LOG__RECORD_DATA:
				return getRecordData();
			case CimPackage.CIM_RECORD_FOR_LOG__LOCALE:
				return getLocale();
			case CimPackage.CIM_RECORD_FOR_LOG__PERCEIVED_SEVERITY:
				return getPerceivedSeverity();
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
			case CimPackage.CIM_RECORD_FOR_LOG__RECORD_FORMAT:
				setRecordFormat((String)newValue);
				return;
			case CimPackage.CIM_RECORD_FOR_LOG__RECORD_DATA:
				setRecordData((String)newValue);
				return;
			case CimPackage.CIM_RECORD_FOR_LOG__LOCALE:
				setLocale((String)newValue);
				return;
			case CimPackage.CIM_RECORD_FOR_LOG__PERCEIVED_SEVERITY:
				setPerceivedSeverity((Integer)newValue);
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
			case CimPackage.CIM_RECORD_FOR_LOG__RECORD_FORMAT:
				setRecordFormat(RECORD_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_RECORD_FOR_LOG__RECORD_DATA:
				setRecordData(RECORD_DATA_EDEFAULT);
				return;
			case CimPackage.CIM_RECORD_FOR_LOG__LOCALE:
				setLocale(LOCALE_EDEFAULT);
				return;
			case CimPackage.CIM_RECORD_FOR_LOG__PERCEIVED_SEVERITY:
				setPerceivedSeverity(PERCEIVED_SEVERITY_EDEFAULT);
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
			case CimPackage.CIM_RECORD_FOR_LOG__RECORD_FORMAT:
				return RECORD_FORMAT_EDEFAULT == null ? recordFormat != null : !RECORD_FORMAT_EDEFAULT.equals(recordFormat);
			case CimPackage.CIM_RECORD_FOR_LOG__RECORD_DATA:
				return RECORD_DATA_EDEFAULT == null ? recordData != null : !RECORD_DATA_EDEFAULT.equals(recordData);
			case CimPackage.CIM_RECORD_FOR_LOG__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
			case CimPackage.CIM_RECORD_FOR_LOG__PERCEIVED_SEVERITY:
				return PERCEIVED_SEVERITY_EDEFAULT == null ? perceivedSeverity != null : !PERCEIVED_SEVERITY_EDEFAULT.equals(perceivedSeverity);
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
		result.append(" (RecordFormat: ");
		result.append(recordFormat);
		result.append(", RecordData: ");
		result.append(recordData);
		result.append(", Locale: ");
		result.append(locale);
		result.append(", PerceivedSeverity: ");
		result.append(perceivedSeverity);
		result.append(')');
		return result.toString();
	}

} //CIM_RecordForLogImpl
