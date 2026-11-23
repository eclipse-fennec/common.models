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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_Fan;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Fan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FanImpl#getVariableSpeed <em>Variable Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FanImpl#getDesiredSpeed <em>Desired Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FanImpl#getControlMode <em>Control Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FanImpl#getControlModesSupported <em>Control Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FanImpl#getDesiredControlMode <em>Desired Control Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FanImpl extends CIM_CoolingDeviceImpl implements CIM_Fan {
	/**
	 * The default value of the '{@link #getVariableSpeed() <em>Variable Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VARIABLE_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableSpeed() <em>Variable Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSpeed()
	 * @generated
	 * @ordered
	 */
	protected Boolean variableSpeed = VARIABLE_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesiredSpeed() <em>Desired Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long DESIRED_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredSpeed() <em>Desired Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long desiredSpeed = DESIRED_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlMode() <em>Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTROL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlMode() <em>Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlMode()
	 * @generated
	 * @ordered
	 */
	protected Integer controlMode = CONTROL_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlModesSupported() <em>Control Modes Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlModesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> controlModesSupported;

	/**
	 * The default value of the '{@link #getDesiredControlMode() <em>Desired Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESIRED_CONTROL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredControlMode() <em>Desired Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredControlMode()
	 * @generated
	 * @ordered
	 */
	protected Integer desiredControlMode = DESIRED_CONTROL_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Fan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getVariableSpeed() {
		return variableSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableSpeed(Boolean newVariableSpeed) {
		Boolean oldVariableSpeed = variableSpeed;
		variableSpeed = newVariableSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FAN__VARIABLE_SPEED, oldVariableSpeed, variableSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDesiredSpeed() {
		return desiredSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredSpeed(Long newDesiredSpeed) {
		Long oldDesiredSpeed = desiredSpeed;
		desiredSpeed = newDesiredSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FAN__DESIRED_SPEED, oldDesiredSpeed, desiredSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getControlMode() {
		return controlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlMode(Integer newControlMode) {
		Integer oldControlMode = controlMode;
		controlMode = newControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FAN__CONTROL_MODE, oldControlMode, controlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getControlModesSupported() {
		if (controlModesSupported == null) {
			controlModesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FAN__CONTROL_MODES_SUPPORTED);
		}
		return controlModesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDesiredControlMode() {
		return desiredControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredControlMode(Integer newDesiredControlMode) {
		Integer oldDesiredControlMode = desiredControlMode;
		desiredControlMode = newDesiredControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FAN__DESIRED_CONTROL_MODE, oldDesiredControlMode, desiredControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetSpeed(Long DesiredSpeed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FAN__VARIABLE_SPEED:
				return getVariableSpeed();
			case CimPackage.CIM_FAN__DESIRED_SPEED:
				return getDesiredSpeed();
			case CimPackage.CIM_FAN__CONTROL_MODE:
				return getControlMode();
			case CimPackage.CIM_FAN__CONTROL_MODES_SUPPORTED:
				return getControlModesSupported();
			case CimPackage.CIM_FAN__DESIRED_CONTROL_MODE:
				return getDesiredControlMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FAN__VARIABLE_SPEED:
				setVariableSpeed((Boolean)newValue);
				return;
			case CimPackage.CIM_FAN__DESIRED_SPEED:
				setDesiredSpeed((Long)newValue);
				return;
			case CimPackage.CIM_FAN__CONTROL_MODE:
				setControlMode((Integer)newValue);
				return;
			case CimPackage.CIM_FAN__CONTROL_MODES_SUPPORTED:
				getControlModesSupported().clear();
				getControlModesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FAN__DESIRED_CONTROL_MODE:
				setDesiredControlMode((Integer)newValue);
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
			case CimPackage.CIM_FAN__VARIABLE_SPEED:
				setVariableSpeed(VARIABLE_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_FAN__DESIRED_SPEED:
				setDesiredSpeed(DESIRED_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_FAN__CONTROL_MODE:
				setControlMode(CONTROL_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_FAN__CONTROL_MODES_SUPPORTED:
				getControlModesSupported().clear();
				return;
			case CimPackage.CIM_FAN__DESIRED_CONTROL_MODE:
				setDesiredControlMode(DESIRED_CONTROL_MODE_EDEFAULT);
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
			case CimPackage.CIM_FAN__VARIABLE_SPEED:
				return VARIABLE_SPEED_EDEFAULT == null ? variableSpeed != null : !VARIABLE_SPEED_EDEFAULT.equals(variableSpeed);
			case CimPackage.CIM_FAN__DESIRED_SPEED:
				return DESIRED_SPEED_EDEFAULT == null ? desiredSpeed != null : !DESIRED_SPEED_EDEFAULT.equals(desiredSpeed);
			case CimPackage.CIM_FAN__CONTROL_MODE:
				return CONTROL_MODE_EDEFAULT == null ? controlMode != null : !CONTROL_MODE_EDEFAULT.equals(controlMode);
			case CimPackage.CIM_FAN__CONTROL_MODES_SUPPORTED:
				return controlModesSupported != null && !controlModesSupported.isEmpty();
			case CimPackage.CIM_FAN__DESIRED_CONTROL_MODE:
				return DESIRED_CONTROL_MODE_EDEFAULT == null ? desiredControlMode != null : !DESIRED_CONTROL_MODE_EDEFAULT.equals(desiredControlMode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_FAN___SET_SPEED__LONG:
				return SetSpeed((Long)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (VariableSpeed: ");
		result.append(variableSpeed);
		result.append(", DesiredSpeed: ");
		result.append(desiredSpeed);
		result.append(", ControlMode: ");
		result.append(controlMode);
		result.append(", ControlModesSupported: ");
		result.append(controlModesSupported);
		result.append(", DesiredControlMode: ");
		result.append(desiredControlMode);
		result.append(')');
		return result.toString();
	}

} //CIM_FanImpl
