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

import org.dmtf.cim.CIM_USBPort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM USB Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBPortImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBPortImpl#getSuspended <em>Suspended</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBPortImpl#getOvercurrent <em>Overcurrent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_USBPortImpl extends CIM_LogicalPortImpl implements CIM_USBPort {
	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected Integer power = POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUSPENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspended()
	 * @generated
	 * @ordered
	 */
	protected Boolean suspended = SUSPENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOvercurrent() <em>Overcurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvercurrent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OVERCURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvercurrent() <em>Overcurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvercurrent()
	 * @generated
	 * @ordered
	 */
	protected Boolean overcurrent = OVERCURRENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_USBPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_USBPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPower(Integer newPower) {
		Integer oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_PORT__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSuspended() {
		return suspended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuspended(Boolean newSuspended) {
		Boolean oldSuspended = suspended;
		suspended = newSuspended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_PORT__SUSPENDED, oldSuspended, suspended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOvercurrent() {
		return overcurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOvercurrent(Boolean newOvercurrent) {
		Boolean oldOvercurrent = overcurrent;
		overcurrent = newOvercurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_PORT__OVERCURRENT, oldOvercurrent, overcurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_USB_PORT__POWER:
				return getPower();
			case CimPackage.CIM_USB_PORT__SUSPENDED:
				return getSuspended();
			case CimPackage.CIM_USB_PORT__OVERCURRENT:
				return getOvercurrent();
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
			case CimPackage.CIM_USB_PORT__POWER:
				setPower((Integer)newValue);
				return;
			case CimPackage.CIM_USB_PORT__SUSPENDED:
				setSuspended((Boolean)newValue);
				return;
			case CimPackage.CIM_USB_PORT__OVERCURRENT:
				setOvercurrent((Boolean)newValue);
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
			case CimPackage.CIM_USB_PORT__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case CimPackage.CIM_USB_PORT__SUSPENDED:
				setSuspended(SUSPENDED_EDEFAULT);
				return;
			case CimPackage.CIM_USB_PORT__OVERCURRENT:
				setOvercurrent(OVERCURRENT_EDEFAULT);
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
			case CimPackage.CIM_USB_PORT__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case CimPackage.CIM_USB_PORT__SUSPENDED:
				return SUSPENDED_EDEFAULT == null ? suspended != null : !SUSPENDED_EDEFAULT.equals(suspended);
			case CimPackage.CIM_USB_PORT__OVERCURRENT:
				return OVERCURRENT_EDEFAULT == null ? overcurrent != null : !OVERCURRENT_EDEFAULT.equals(overcurrent);
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
		result.append(" (Power: ");
		result.append(power);
		result.append(", Suspended: ");
		result.append(suspended);
		result.append(", Overcurrent: ");
		result.append(overcurrent);
		result.append(')');
		return result.toString();
	}

} //CIM_USBPortImpl
