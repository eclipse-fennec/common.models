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

import org.dmtf.cim.CIM_MediaAccessStatData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Media Access Stat Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessStatDataImpl#getReadOperations <em>Read Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessStatDataImpl#getUnrecoverableReadOperations <em>Unrecoverable Read Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessStatDataImpl#getWriteOperations <em>Write Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessStatDataImpl#getUnrecoverableWriteOperations <em>Unrecoverable Write Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessStatDataImpl#getRecoveredReadOperations <em>Recovered Read Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessStatDataImpl#getRecoveredWriteOperations <em>Recovered Write Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessStatDataImpl#getRecoveredSeekOperations <em>Recovered Seek Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessStatDataImpl#getUnrecoverableSeekOperations <em>Unrecoverable Seek Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MediaAccessStatDataImpl extends CIM_StatisticalDataImpl implements CIM_MediaAccessStatData {
	/**
	 * The default value of the '{@link #getReadOperations() <em>Read Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOperations() <em>Read Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOperations()
	 * @generated
	 * @ordered
	 */
	protected Long readOperations = READ_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnrecoverableReadOperations() <em>Unrecoverable Read Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnrecoverableReadOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNRECOVERABLE_READ_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnrecoverableReadOperations() <em>Unrecoverable Read Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnrecoverableReadOperations()
	 * @generated
	 * @ordered
	 */
	protected Long unrecoverableReadOperations = UNRECOVERABLE_READ_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteOperations() <em>Write Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteOperations() <em>Write Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteOperations()
	 * @generated
	 * @ordered
	 */
	protected Long writeOperations = WRITE_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnrecoverableWriteOperations() <em>Unrecoverable Write Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnrecoverableWriteOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNRECOVERABLE_WRITE_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnrecoverableWriteOperations() <em>Unrecoverable Write Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnrecoverableWriteOperations()
	 * @generated
	 * @ordered
	 */
	protected Long unrecoverableWriteOperations = UNRECOVERABLE_WRITE_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveredReadOperations() <em>Recovered Read Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveredReadOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECOVERED_READ_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecoveredReadOperations() <em>Recovered Read Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveredReadOperations()
	 * @generated
	 * @ordered
	 */
	protected Long recoveredReadOperations = RECOVERED_READ_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveredWriteOperations() <em>Recovered Write Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveredWriteOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECOVERED_WRITE_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecoveredWriteOperations() <em>Recovered Write Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveredWriteOperations()
	 * @generated
	 * @ordered
	 */
	protected Long recoveredWriteOperations = RECOVERED_WRITE_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveredSeekOperations() <em>Recovered Seek Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveredSeekOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECOVERED_SEEK_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecoveredSeekOperations() <em>Recovered Seek Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveredSeekOperations()
	 * @generated
	 * @ordered
	 */
	protected Long recoveredSeekOperations = RECOVERED_SEEK_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnrecoverableSeekOperations() <em>Unrecoverable Seek Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnrecoverableSeekOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNRECOVERABLE_SEEK_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnrecoverableSeekOperations() <em>Unrecoverable Seek Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnrecoverableSeekOperations()
	 * @generated
	 * @ordered
	 */
	protected Long unrecoverableSeekOperations = UNRECOVERABLE_SEEK_OPERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MediaAccessStatDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MediaAccessStatData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadOperations() {
		return readOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOperations(Long newReadOperations) {
		Long oldReadOperations = readOperations;
		readOperations = newReadOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__READ_OPERATIONS, oldReadOperations, readOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnrecoverableReadOperations() {
		return unrecoverableReadOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnrecoverableReadOperations(Long newUnrecoverableReadOperations) {
		Long oldUnrecoverableReadOperations = unrecoverableReadOperations;
		unrecoverableReadOperations = newUnrecoverableReadOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_READ_OPERATIONS, oldUnrecoverableReadOperations, unrecoverableReadOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteOperations() {
		return writeOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteOperations(Long newWriteOperations) {
		Long oldWriteOperations = writeOperations;
		writeOperations = newWriteOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__WRITE_OPERATIONS, oldWriteOperations, writeOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnrecoverableWriteOperations() {
		return unrecoverableWriteOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnrecoverableWriteOperations(Long newUnrecoverableWriteOperations) {
		Long oldUnrecoverableWriteOperations = unrecoverableWriteOperations;
		unrecoverableWriteOperations = newUnrecoverableWriteOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_WRITE_OPERATIONS, oldUnrecoverableWriteOperations, unrecoverableWriteOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRecoveredReadOperations() {
		return recoveredReadOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecoveredReadOperations(Long newRecoveredReadOperations) {
		Long oldRecoveredReadOperations = recoveredReadOperations;
		recoveredReadOperations = newRecoveredReadOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_READ_OPERATIONS, oldRecoveredReadOperations, recoveredReadOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRecoveredWriteOperations() {
		return recoveredWriteOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecoveredWriteOperations(Long newRecoveredWriteOperations) {
		Long oldRecoveredWriteOperations = recoveredWriteOperations;
		recoveredWriteOperations = newRecoveredWriteOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_WRITE_OPERATIONS, oldRecoveredWriteOperations, recoveredWriteOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRecoveredSeekOperations() {
		return recoveredSeekOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecoveredSeekOperations(Long newRecoveredSeekOperations) {
		Long oldRecoveredSeekOperations = recoveredSeekOperations;
		recoveredSeekOperations = newRecoveredSeekOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_SEEK_OPERATIONS, oldRecoveredSeekOperations, recoveredSeekOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnrecoverableSeekOperations() {
		return unrecoverableSeekOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnrecoverableSeekOperations(Long newUnrecoverableSeekOperations) {
		Long oldUnrecoverableSeekOperations = unrecoverableSeekOperations;
		unrecoverableSeekOperations = newUnrecoverableSeekOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_SEEK_OPERATIONS, oldUnrecoverableSeekOperations, unrecoverableSeekOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__READ_OPERATIONS:
				return getReadOperations();
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_READ_OPERATIONS:
				return getUnrecoverableReadOperations();
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__WRITE_OPERATIONS:
				return getWriteOperations();
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_WRITE_OPERATIONS:
				return getUnrecoverableWriteOperations();
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_READ_OPERATIONS:
				return getRecoveredReadOperations();
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_WRITE_OPERATIONS:
				return getRecoveredWriteOperations();
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_SEEK_OPERATIONS:
				return getRecoveredSeekOperations();
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_SEEK_OPERATIONS:
				return getUnrecoverableSeekOperations();
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
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__READ_OPERATIONS:
				setReadOperations((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_READ_OPERATIONS:
				setUnrecoverableReadOperations((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__WRITE_OPERATIONS:
				setWriteOperations((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_WRITE_OPERATIONS:
				setUnrecoverableWriteOperations((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_READ_OPERATIONS:
				setRecoveredReadOperations((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_WRITE_OPERATIONS:
				setRecoveredWriteOperations((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_SEEK_OPERATIONS:
				setRecoveredSeekOperations((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_SEEK_OPERATIONS:
				setUnrecoverableSeekOperations((Long)newValue);
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
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__READ_OPERATIONS:
				setReadOperations(READ_OPERATIONS_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_READ_OPERATIONS:
				setUnrecoverableReadOperations(UNRECOVERABLE_READ_OPERATIONS_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__WRITE_OPERATIONS:
				setWriteOperations(WRITE_OPERATIONS_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_WRITE_OPERATIONS:
				setUnrecoverableWriteOperations(UNRECOVERABLE_WRITE_OPERATIONS_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_READ_OPERATIONS:
				setRecoveredReadOperations(RECOVERED_READ_OPERATIONS_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_WRITE_OPERATIONS:
				setRecoveredWriteOperations(RECOVERED_WRITE_OPERATIONS_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_SEEK_OPERATIONS:
				setRecoveredSeekOperations(RECOVERED_SEEK_OPERATIONS_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_SEEK_OPERATIONS:
				setUnrecoverableSeekOperations(UNRECOVERABLE_SEEK_OPERATIONS_EDEFAULT);
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
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__READ_OPERATIONS:
				return READ_OPERATIONS_EDEFAULT == null ? readOperations != null : !READ_OPERATIONS_EDEFAULT.equals(readOperations);
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_READ_OPERATIONS:
				return UNRECOVERABLE_READ_OPERATIONS_EDEFAULT == null ? unrecoverableReadOperations != null : !UNRECOVERABLE_READ_OPERATIONS_EDEFAULT.equals(unrecoverableReadOperations);
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__WRITE_OPERATIONS:
				return WRITE_OPERATIONS_EDEFAULT == null ? writeOperations != null : !WRITE_OPERATIONS_EDEFAULT.equals(writeOperations);
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_WRITE_OPERATIONS:
				return UNRECOVERABLE_WRITE_OPERATIONS_EDEFAULT == null ? unrecoverableWriteOperations != null : !UNRECOVERABLE_WRITE_OPERATIONS_EDEFAULT.equals(unrecoverableWriteOperations);
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_READ_OPERATIONS:
				return RECOVERED_READ_OPERATIONS_EDEFAULT == null ? recoveredReadOperations != null : !RECOVERED_READ_OPERATIONS_EDEFAULT.equals(recoveredReadOperations);
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_WRITE_OPERATIONS:
				return RECOVERED_WRITE_OPERATIONS_EDEFAULT == null ? recoveredWriteOperations != null : !RECOVERED_WRITE_OPERATIONS_EDEFAULT.equals(recoveredWriteOperations);
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__RECOVERED_SEEK_OPERATIONS:
				return RECOVERED_SEEK_OPERATIONS_EDEFAULT == null ? recoveredSeekOperations != null : !RECOVERED_SEEK_OPERATIONS_EDEFAULT.equals(recoveredSeekOperations);
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA__UNRECOVERABLE_SEEK_OPERATIONS:
				return UNRECOVERABLE_SEEK_OPERATIONS_EDEFAULT == null ? unrecoverableSeekOperations != null : !UNRECOVERABLE_SEEK_OPERATIONS_EDEFAULT.equals(unrecoverableSeekOperations);
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
		result.append(" (ReadOperations: ");
		result.append(readOperations);
		result.append(", UnrecoverableReadOperations: ");
		result.append(unrecoverableReadOperations);
		result.append(", WriteOperations: ");
		result.append(writeOperations);
		result.append(", UnrecoverableWriteOperations: ");
		result.append(unrecoverableWriteOperations);
		result.append(", RecoveredReadOperations: ");
		result.append(recoveredReadOperations);
		result.append(", RecoveredWriteOperations: ");
		result.append(recoveredWriteOperations);
		result.append(", RecoveredSeekOperations: ");
		result.append(recoveredSeekOperations);
		result.append(", UnrecoverableSeekOperations: ");
		result.append(unrecoverableSeekOperations);
		result.append(')');
		return result.toString();
	}

} //CIM_MediaAccessStatDataImpl
