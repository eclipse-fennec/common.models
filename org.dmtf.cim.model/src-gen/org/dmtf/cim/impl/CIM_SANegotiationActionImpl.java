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

import org.dmtf.cim.CIM_SANegotiationAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SA Negotiation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SANegotiationActionImpl#getMinLifetimeSeconds <em>Min Lifetime Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SANegotiationActionImpl#getIdleDurationSeconds <em>Idle Duration Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SANegotiationActionImpl#getMinLifetimeKilobytes <em>Min Lifetime Kilobytes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_SANegotiationActionImpl extends CIM_SAActionImpl implements CIM_SANegotiationAction {
	/**
	 * The default value of the '{@link #getMinLifetimeSeconds() <em>Min Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLifetimeSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_LIFETIME_SECONDS_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getMinLifetimeSeconds() <em>Min Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLifetimeSeconds()
	 * @generated
	 * @ordered
	 */
	protected Long minLifetimeSeconds = MIN_LIFETIME_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdleDurationSeconds() <em>Idle Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleDurationSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final Long IDLE_DURATION_SECONDS_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getIdleDurationSeconds() <em>Idle Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleDurationSeconds()
	 * @generated
	 * @ordered
	 */
	protected Long idleDurationSeconds = IDLE_DURATION_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLifetimeKilobytes() <em>Min Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLifetimeKilobytes()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_LIFETIME_KILOBYTES_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getMinLifetimeKilobytes() <em>Min Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLifetimeKilobytes()
	 * @generated
	 * @ordered
	 */
	protected Long minLifetimeKilobytes = MIN_LIFETIME_KILOBYTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SANegotiationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SANegotiationAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinLifetimeSeconds() {
		return minLifetimeSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLifetimeSeconds(Long newMinLifetimeSeconds) {
		Long oldMinLifetimeSeconds = minLifetimeSeconds;
		minLifetimeSeconds = newMinLifetimeSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_SECONDS, oldMinLifetimeSeconds, minLifetimeSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIdleDurationSeconds() {
		return idleDurationSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdleDurationSeconds(Long newIdleDurationSeconds) {
		Long oldIdleDurationSeconds = idleDurationSeconds;
		idleDurationSeconds = newIdleDurationSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_NEGOTIATION_ACTION__IDLE_DURATION_SECONDS, oldIdleDurationSeconds, idleDurationSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinLifetimeKilobytes() {
		return minLifetimeKilobytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLifetimeKilobytes(Long newMinLifetimeKilobytes) {
		Long oldMinLifetimeKilobytes = minLifetimeKilobytes;
		minLifetimeKilobytes = newMinLifetimeKilobytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_KILOBYTES, oldMinLifetimeKilobytes, minLifetimeKilobytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_SECONDS:
				return getMinLifetimeSeconds();
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__IDLE_DURATION_SECONDS:
				return getIdleDurationSeconds();
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_KILOBYTES:
				return getMinLifetimeKilobytes();
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
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_SECONDS:
				setMinLifetimeSeconds((Long)newValue);
				return;
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__IDLE_DURATION_SECONDS:
				setIdleDurationSeconds((Long)newValue);
				return;
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_KILOBYTES:
				setMinLifetimeKilobytes((Long)newValue);
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
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_SECONDS:
				setMinLifetimeSeconds(MIN_LIFETIME_SECONDS_EDEFAULT);
				return;
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__IDLE_DURATION_SECONDS:
				setIdleDurationSeconds(IDLE_DURATION_SECONDS_EDEFAULT);
				return;
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_KILOBYTES:
				setMinLifetimeKilobytes(MIN_LIFETIME_KILOBYTES_EDEFAULT);
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
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_SECONDS:
				return MIN_LIFETIME_SECONDS_EDEFAULT == null ? minLifetimeSeconds != null : !MIN_LIFETIME_SECONDS_EDEFAULT.equals(minLifetimeSeconds);
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__IDLE_DURATION_SECONDS:
				return IDLE_DURATION_SECONDS_EDEFAULT == null ? idleDurationSeconds != null : !IDLE_DURATION_SECONDS_EDEFAULT.equals(idleDurationSeconds);
			case CimPackage.CIM_SA_NEGOTIATION_ACTION__MIN_LIFETIME_KILOBYTES:
				return MIN_LIFETIME_KILOBYTES_EDEFAULT == null ? minLifetimeKilobytes != null : !MIN_LIFETIME_KILOBYTES_EDEFAULT.equals(minLifetimeKilobytes);
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
		result.append(" (MinLifetimeSeconds: ");
		result.append(minLifetimeSeconds);
		result.append(", IdleDurationSeconds: ");
		result.append(idleDurationSeconds);
		result.append(", MinLifetimeKilobytes: ");
		result.append(minLifetimeKilobytes);
		result.append(')');
		return result.toString();
	}

} //CIM_SANegotiationActionImpl
