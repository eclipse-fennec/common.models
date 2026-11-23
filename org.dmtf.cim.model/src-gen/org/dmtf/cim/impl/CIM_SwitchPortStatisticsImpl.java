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

import org.dmtf.cim.CIM_SwitchPortStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Switch Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortStatisticsImpl#getDelayExceededDiscards <em>Delay Exceeded Discards</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortStatisticsImpl#getMtuExceededDiscards <em>Mtu Exceeded Discards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SwitchPortStatisticsImpl extends CIM_SAPStatisticalInformationImpl implements CIM_SwitchPortStatistics {
	/**
	 * The default value of the '{@link #getDelayExceededDiscards() <em>Delay Exceeded Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayExceededDiscards()
	 * @generated
	 * @ordered
	 */
	protected static final Long DELAY_EXCEEDED_DISCARDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelayExceededDiscards() <em>Delay Exceeded Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayExceededDiscards()
	 * @generated
	 * @ordered
	 */
	protected Long delayExceededDiscards = DELAY_EXCEEDED_DISCARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMtuExceededDiscards() <em>Mtu Exceeded Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtuExceededDiscards()
	 * @generated
	 * @ordered
	 */
	protected static final Long MTU_EXCEEDED_DISCARDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMtuExceededDiscards() <em>Mtu Exceeded Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtuExceededDiscards()
	 * @generated
	 * @ordered
	 */
	protected Long mtuExceededDiscards = MTU_EXCEEDED_DISCARDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SwitchPortStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SwitchPortStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDelayExceededDiscards() {
		return delayExceededDiscards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelayExceededDiscards(Long newDelayExceededDiscards) {
		Long oldDelayExceededDiscards = delayExceededDiscards;
		delayExceededDiscards = newDelayExceededDiscards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_STATISTICS__DELAY_EXCEEDED_DISCARDS, oldDelayExceededDiscards, delayExceededDiscards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMtuExceededDiscards() {
		return mtuExceededDiscards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMtuExceededDiscards(Long newMtuExceededDiscards) {
		Long oldMtuExceededDiscards = mtuExceededDiscards;
		mtuExceededDiscards = newMtuExceededDiscards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_STATISTICS__MTU_EXCEEDED_DISCARDS, oldMtuExceededDiscards, mtuExceededDiscards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SWITCH_PORT_STATISTICS__DELAY_EXCEEDED_DISCARDS:
				return getDelayExceededDiscards();
			case CimPackage.CIM_SWITCH_PORT_STATISTICS__MTU_EXCEEDED_DISCARDS:
				return getMtuExceededDiscards();
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
			case CimPackage.CIM_SWITCH_PORT_STATISTICS__DELAY_EXCEEDED_DISCARDS:
				setDelayExceededDiscards((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_STATISTICS__MTU_EXCEEDED_DISCARDS:
				setMtuExceededDiscards((Long)newValue);
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
			case CimPackage.CIM_SWITCH_PORT_STATISTICS__DELAY_EXCEEDED_DISCARDS:
				setDelayExceededDiscards(DELAY_EXCEEDED_DISCARDS_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_STATISTICS__MTU_EXCEEDED_DISCARDS:
				setMtuExceededDiscards(MTU_EXCEEDED_DISCARDS_EDEFAULT);
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
			case CimPackage.CIM_SWITCH_PORT_STATISTICS__DELAY_EXCEEDED_DISCARDS:
				return DELAY_EXCEEDED_DISCARDS_EDEFAULT == null ? delayExceededDiscards != null : !DELAY_EXCEEDED_DISCARDS_EDEFAULT.equals(delayExceededDiscards);
			case CimPackage.CIM_SWITCH_PORT_STATISTICS__MTU_EXCEEDED_DISCARDS:
				return MTU_EXCEEDED_DISCARDS_EDEFAULT == null ? mtuExceededDiscards != null : !MTU_EXCEEDED_DISCARDS_EDEFAULT.equals(mtuExceededDiscards);
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
		result.append(" (DelayExceededDiscards: ");
		result.append(delayExceededDiscards);
		result.append(", MtuExceededDiscards: ");
		result.append(mtuExceededDiscards);
		result.append(')');
		return result.toString();
	}

} //CIM_SwitchPortStatisticsImpl
