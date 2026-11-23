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

import org.dmtf.cim.CIM_ProtocolController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Protocol Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerImpl#getMaxUnitsControlled <em>Max Units Controlled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_ProtocolControllerImpl extends CIM_LogicalDeviceImpl implements CIM_ProtocolController {
	/**
	 * The default value of the '{@link #getMaxUnitsControlled() <em>Max Units Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnitsControlled()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_UNITS_CONTROLLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxUnitsControlled() <em>Max Units Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnitsControlled()
	 * @generated
	 * @ordered
	 */
	protected Long maxUnitsControlled = MAX_UNITS_CONTROLLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProtocolControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProtocolController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxUnitsControlled() {
		return maxUnitsControlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxUnitsControlled(Long newMaxUnitsControlled) {
		Long oldMaxUnitsControlled = maxUnitsControlled;
		maxUnitsControlled = newMaxUnitsControlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER__MAX_UNITS_CONTROLLED, oldMaxUnitsControlled, maxUnitsControlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROTOCOL_CONTROLLER__MAX_UNITS_CONTROLLED:
				return getMaxUnitsControlled();
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER__MAX_UNITS_CONTROLLED:
				setMaxUnitsControlled((Long)newValue);
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER__MAX_UNITS_CONTROLLED:
				setMaxUnitsControlled(MAX_UNITS_CONTROLLED_EDEFAULT);
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER__MAX_UNITS_CONTROLLED:
				return MAX_UNITS_CONTROLLED_EDEFAULT == null ? maxUnitsControlled != null : !MAX_UNITS_CONTROLLED_EDEFAULT.equals(maxUnitsControlled);
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
		result.append(" (MaxUnitsControlled: ");
		result.append(maxUnitsControlled);
		result.append(')');
		return result.toString();
	}

} //CIM_ProtocolControllerImpl
