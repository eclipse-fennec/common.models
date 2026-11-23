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

import org.dmtf.cim.CIM_USBHub;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM USB Hub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBHubImpl#getGangSwitched <em>Gang Switched</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBHubImpl#getNumberOfPorts <em>Number Of Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_USBHubImpl extends CIM_USBDeviceImpl implements CIM_USBHub {
	/**
	 * The default value of the '{@link #getGangSwitched() <em>Gang Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGangSwitched()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GANG_SWITCHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGangSwitched() <em>Gang Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGangSwitched()
	 * @generated
	 * @ordered
	 */
	protected Boolean gangSwitched = GANG_SWITCHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPorts() <em>Number Of Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPorts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfPorts() <em>Number Of Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPorts()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfPorts = NUMBER_OF_PORTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_USBHubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_USBHub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getGangSwitched() {
		return gangSwitched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGangSwitched(Boolean newGangSwitched) {
		Boolean oldGangSwitched = gangSwitched;
		gangSwitched = newGangSwitched;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_HUB__GANG_SWITCHED, oldGangSwitched, gangSwitched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfPorts() {
		return numberOfPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfPorts(Integer newNumberOfPorts) {
		Integer oldNumberOfPorts = numberOfPorts;
		numberOfPorts = newNumberOfPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_HUB__NUMBER_OF_PORTS, oldNumberOfPorts, numberOfPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_USB_HUB__GANG_SWITCHED:
				return getGangSwitched();
			case CimPackage.CIM_USB_HUB__NUMBER_OF_PORTS:
				return getNumberOfPorts();
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
			case CimPackage.CIM_USB_HUB__GANG_SWITCHED:
				setGangSwitched((Boolean)newValue);
				return;
			case CimPackage.CIM_USB_HUB__NUMBER_OF_PORTS:
				setNumberOfPorts((Integer)newValue);
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
			case CimPackage.CIM_USB_HUB__GANG_SWITCHED:
				setGangSwitched(GANG_SWITCHED_EDEFAULT);
				return;
			case CimPackage.CIM_USB_HUB__NUMBER_OF_PORTS:
				setNumberOfPorts(NUMBER_OF_PORTS_EDEFAULT);
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
			case CimPackage.CIM_USB_HUB__GANG_SWITCHED:
				return GANG_SWITCHED_EDEFAULT == null ? gangSwitched != null : !GANG_SWITCHED_EDEFAULT.equals(gangSwitched);
			case CimPackage.CIM_USB_HUB__NUMBER_OF_PORTS:
				return NUMBER_OF_PORTS_EDEFAULT == null ? numberOfPorts != null : !NUMBER_OF_PORTS_EDEFAULT.equals(numberOfPorts);
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
		result.append(" (GangSwitched: ");
		result.append(gangSwitched);
		result.append(", NumberOfPorts: ");
		result.append(numberOfPorts);
		result.append(')');
		return result.toString();
	}

} //CIM_USBHubImpl
