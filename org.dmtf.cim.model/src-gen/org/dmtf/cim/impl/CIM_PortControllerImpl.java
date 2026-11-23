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

import org.dmtf.cim.CIM_PortController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Port Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PortControllerImpl#getControllerType <em>Controller Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PortControllerImpl#getOtherControllerType <em>Other Controller Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PortControllerImpl#getControllerVersion <em>Controller Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PortControllerImpl extends CIM_ControllerImpl implements CIM_PortController {
	/**
	 * The default value of the '{@link #getControllerType() <em>Controller Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTROLLER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerType() <em>Controller Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerType()
	 * @generated
	 * @ordered
	 */
	protected Integer controllerType = CONTROLLER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherControllerType() <em>Other Controller Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherControllerType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CONTROLLER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherControllerType() <em>Other Controller Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherControllerType()
	 * @generated
	 * @ordered
	 */
	protected String otherControllerType = OTHER_CONTROLLER_TYPE_EDEFAULT;

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
	protected CIM_PortControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PortController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getControllerType() {
		return controllerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControllerType(Integer newControllerType) {
		Integer oldControllerType = controllerType;
		controllerType = newControllerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_TYPE, oldControllerType, controllerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherControllerType() {
		return otherControllerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherControllerType(String newOtherControllerType) {
		String oldOtherControllerType = otherControllerType;
		otherControllerType = newOtherControllerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PORT_CONTROLLER__OTHER_CONTROLLER_TYPE, oldOtherControllerType, otherControllerType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_VERSION, oldControllerVersion, controllerVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_TYPE:
				return getControllerType();
			case CimPackage.CIM_PORT_CONTROLLER__OTHER_CONTROLLER_TYPE:
				return getOtherControllerType();
			case CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_VERSION:
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
			case CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_TYPE:
				setControllerType((Integer)newValue);
				return;
			case CimPackage.CIM_PORT_CONTROLLER__OTHER_CONTROLLER_TYPE:
				setOtherControllerType((String)newValue);
				return;
			case CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_VERSION:
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
			case CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_TYPE:
				setControllerType(CONTROLLER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PORT_CONTROLLER__OTHER_CONTROLLER_TYPE:
				setOtherControllerType(OTHER_CONTROLLER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_VERSION:
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
			case CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_TYPE:
				return CONTROLLER_TYPE_EDEFAULT == null ? controllerType != null : !CONTROLLER_TYPE_EDEFAULT.equals(controllerType);
			case CimPackage.CIM_PORT_CONTROLLER__OTHER_CONTROLLER_TYPE:
				return OTHER_CONTROLLER_TYPE_EDEFAULT == null ? otherControllerType != null : !OTHER_CONTROLLER_TYPE_EDEFAULT.equals(otherControllerType);
			case CimPackage.CIM_PORT_CONTROLLER__CONTROLLER_VERSION:
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
		result.append(" (ControllerType: ");
		result.append(controllerType);
		result.append(", OtherControllerType: ");
		result.append(otherControllerType);
		result.append(", ControllerVersion: ");
		result.append(controllerVersion);
		result.append(')');
		return result.toString();
	}

} //CIM_PortControllerImpl
