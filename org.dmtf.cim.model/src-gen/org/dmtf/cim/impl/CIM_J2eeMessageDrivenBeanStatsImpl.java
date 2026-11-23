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

import org.dmtf.cim.CIM_J2eeMessageDrivenBeanStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Message Driven Bean Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeMessageDrivenBeanStatsImpl#getMessageCount <em>Message Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeMessageDrivenBeanStatsImpl extends CIM_J2eeEJBStatsImpl implements CIM_J2eeMessageDrivenBeanStats {
	/**
	 * The default value of the '{@link #getMessageCount() <em>Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long MESSAGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageCount() <em>Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageCount()
	 * @generated
	 * @ordered
	 */
	protected Long messageCount = MESSAGE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeMessageDrivenBeanStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeMessageDrivenBeanStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMessageCount() {
		return messageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageCount(Long newMessageCount) {
		Long oldMessageCount = messageCount;
		messageCount = newMessageCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_MESSAGE_DRIVEN_BEAN_STATS__MESSAGE_COUNT, oldMessageCount, messageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_MESSAGE_DRIVEN_BEAN_STATS__MESSAGE_COUNT:
				return getMessageCount();
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
			case CimPackage.CIM_J2EE_MESSAGE_DRIVEN_BEAN_STATS__MESSAGE_COUNT:
				setMessageCount((Long)newValue);
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
			case CimPackage.CIM_J2EE_MESSAGE_DRIVEN_BEAN_STATS__MESSAGE_COUNT:
				setMessageCount(MESSAGE_COUNT_EDEFAULT);
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
			case CimPackage.CIM_J2EE_MESSAGE_DRIVEN_BEAN_STATS__MESSAGE_COUNT:
				return MESSAGE_COUNT_EDEFAULT == null ? messageCount != null : !MESSAGE_COUNT_EDEFAULT.equals(messageCount);
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
		result.append(" (MessageCount: ");
		result.append(messageCount);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeMessageDrivenBeanStatsImpl
