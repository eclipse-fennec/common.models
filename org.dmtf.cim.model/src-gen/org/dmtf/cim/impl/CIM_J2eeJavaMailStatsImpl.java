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

import org.dmtf.cim.CIM_J2eeJavaMailStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Java Mail Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJavaMailStatsImpl#getSentMailCount <em>Sent Mail Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeJavaMailStatsImpl extends CIM_J2eeStatisticImpl implements CIM_J2eeJavaMailStats {
	/**
	 * The default value of the '{@link #getSentMailCount() <em>Sent Mail Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentMailCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long SENT_MAIL_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSentMailCount() <em>Sent Mail Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentMailCount()
	 * @generated
	 * @ordered
	 */
	protected Long sentMailCount = SENT_MAIL_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeJavaMailStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeJavaMailStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSentMailCount() {
		return sentMailCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSentMailCount(Long newSentMailCount) {
		Long oldSentMailCount = sentMailCount;
		sentMailCount = newSentMailCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JAVA_MAIL_STATS__SENT_MAIL_COUNT, oldSentMailCount, sentMailCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_JAVA_MAIL_STATS__SENT_MAIL_COUNT:
				return getSentMailCount();
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
			case CimPackage.CIM_J2EE_JAVA_MAIL_STATS__SENT_MAIL_COUNT:
				setSentMailCount((Long)newValue);
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
			case CimPackage.CIM_J2EE_JAVA_MAIL_STATS__SENT_MAIL_COUNT:
				setSentMailCount(SENT_MAIL_COUNT_EDEFAULT);
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
			case CimPackage.CIM_J2EE_JAVA_MAIL_STATS__SENT_MAIL_COUNT:
				return SENT_MAIL_COUNT_EDEFAULT == null ? sentMailCount != null : !SENT_MAIL_COUNT_EDEFAULT.equals(sentMailCount);
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
		result.append(" (SentMailCount: ");
		result.append(sentMailCount);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeJavaMailStatsImpl
