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

import org.dmtf.cim.CIM_USBController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM USB Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBControllerImpl#getUSBVersion <em>USB Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBControllerImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBControllerImpl#getControllerVersion <em>Controller Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_USBControllerImpl extends CIM_ControllerImpl implements CIM_USBController {
	/**
	 * The default value of the '{@link #getUSBVersion() <em>USB Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSBVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USB_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUSBVersion() <em>USB Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSBVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer usbVersion = USB_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTERFACE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected Integer interfaceType = INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getControllerVersion() <em>Controller Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTROLLER_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerVersion() <em>Controller Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer controllerVersion = CONTROLLER_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_USBControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_USBController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUSBVersion() {
		return usbVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUSBVersion(Integer newUSBVersion) {
		Integer oldUSBVersion = usbVersion;
		usbVersion = newUSBVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_CONTROLLER__USB_VERSION, oldUSBVersion, usbVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInterfaceType() {
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceType(Integer newInterfaceType) {
		Integer oldInterfaceType = interfaceType;
		interfaceType = newInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_CONTROLLER__INTERFACE_TYPE, oldInterfaceType, interfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getControllerVersion() {
		return controllerVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControllerVersion(Integer newControllerVersion) {
		Integer oldControllerVersion = controllerVersion;
		controllerVersion = newControllerVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_CONTROLLER__CONTROLLER_VERSION, oldControllerVersion, controllerVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_USB_CONTROLLER__USB_VERSION:
				return getUSBVersion();
			case CimPackage.CIM_USB_CONTROLLER__INTERFACE_TYPE:
				return getInterfaceType();
			case CimPackage.CIM_USB_CONTROLLER__CONTROLLER_VERSION:
				return getControllerVersion();
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
			case CimPackage.CIM_USB_CONTROLLER__USB_VERSION:
				setUSBVersion((Integer)newValue);
				return;
			case CimPackage.CIM_USB_CONTROLLER__INTERFACE_TYPE:
				setInterfaceType((Integer)newValue);
				return;
			case CimPackage.CIM_USB_CONTROLLER__CONTROLLER_VERSION:
				setControllerVersion((Integer)newValue);
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
			case CimPackage.CIM_USB_CONTROLLER__USB_VERSION:
				setUSBVersion(USB_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_USB_CONTROLLER__INTERFACE_TYPE:
				setInterfaceType(INTERFACE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_USB_CONTROLLER__CONTROLLER_VERSION:
				setControllerVersion(CONTROLLER_VERSION_EDEFAULT);
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
			case CimPackage.CIM_USB_CONTROLLER__USB_VERSION:
				return USB_VERSION_EDEFAULT == null ? usbVersion != null : !USB_VERSION_EDEFAULT.equals(usbVersion);
			case CimPackage.CIM_USB_CONTROLLER__INTERFACE_TYPE:
				return INTERFACE_TYPE_EDEFAULT == null ? interfaceType != null : !INTERFACE_TYPE_EDEFAULT.equals(interfaceType);
			case CimPackage.CIM_USB_CONTROLLER__CONTROLLER_VERSION:
				return CONTROLLER_VERSION_EDEFAULT == null ? controllerVersion != null : !CONTROLLER_VERSION_EDEFAULT.equals(controllerVersion);
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
		result.append(" (USBVersion: ");
		result.append(usbVersion);
		result.append(", InterfaceType: ");
		result.append(interfaceType);
		result.append(", ControllerVersion: ");
		result.append(controllerVersion);
		result.append(')');
		return result.toString();
	}

} //CIM_USBControllerImpl
