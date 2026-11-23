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

import org.dmtf.cim.CIM_DatabaseResourceStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Database Resource Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseResourceStatisticsImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseResourceStatisticsImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseResourceStatisticsImpl#getHighwater <em>Highwater</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseResourceStatisticsImpl#getFailures <em>Failures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DatabaseResourceStatisticsImpl extends CIM_StatisticalDataImpl implements CIM_DatabaseResourceStatistics {
	/**
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected Long current = CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected Long limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighwater() <em>Highwater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighwater()
	 * @generated
	 * @ordered
	 */
	protected static final Long HIGHWATER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHighwater() <em>Highwater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighwater()
	 * @generated
	 * @ordered
	 */
	protected Long highwater = HIGHWATER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailures() <em>Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailures() <em>Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailures()
	 * @generated
	 * @ordered
	 */
	protected Long failures = FAILURES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DatabaseResourceStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DatabaseResourceStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrent(Long newCurrent) {
		Long oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(Long newLimit) {
		Long oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHighwater() {
		return highwater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighwater(Long newHighwater) {
		Long oldHighwater = highwater;
		highwater = newHighwater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__HIGHWATER, oldHighwater, highwater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFailures() {
		return failures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailures(Long newFailures) {
		Long oldFailures = failures;
		failures = newFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__FAILURES, oldFailures, failures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__CURRENT:
				return getCurrent();
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__LIMIT:
				return getLimit();
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__HIGHWATER:
				return getHighwater();
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__FAILURES:
				return getFailures();
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
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__CURRENT:
				setCurrent((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__LIMIT:
				setLimit((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__HIGHWATER:
				setHighwater((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__FAILURES:
				setFailures((Long)newValue);
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
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__HIGHWATER:
				setHighwater(HIGHWATER_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__FAILURES:
				setFailures(FAILURES_EDEFAULT);
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
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__CURRENT:
				return CURRENT_EDEFAULT == null ? current != null : !CURRENT_EDEFAULT.equals(current);
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__LIMIT:
				return LIMIT_EDEFAULT == null ? limit != null : !LIMIT_EDEFAULT.equals(limit);
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__HIGHWATER:
				return HIGHWATER_EDEFAULT == null ? highwater != null : !HIGHWATER_EDEFAULT.equals(highwater);
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS__FAILURES:
				return FAILURES_EDEFAULT == null ? failures != null : !FAILURES_EDEFAULT.equals(failures);
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
		result.append(" (Current: ");
		result.append(current);
		result.append(", Limit: ");
		result.append(limit);
		result.append(", Highwater: ");
		result.append(highwater);
		result.append(", Failures: ");
		result.append(failures);
		result.append(')');
		return result.toString();
	}

} //CIM_DatabaseResourceStatisticsImpl
