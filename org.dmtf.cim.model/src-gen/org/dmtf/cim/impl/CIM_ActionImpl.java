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

import org.dmtf.cim.CIM_Action;
import org.dmtf.cim.CIM_ComputerSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActionImpl#getSoftwareElementState <em>Software Element State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActionImpl#getSoftwareElementID <em>Software Element ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActionImpl#getTargetOperatingSystem <em>Target Operating System</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActionImpl#getActionID <em>Action ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActionImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_ActionImpl extends CIM_ManagedElementImpl implements CIM_Action {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareElementState() <em>Software Element State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SOFTWARE_ELEMENT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareElementState() <em>Software Element State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementState()
	 * @generated
	 * @ordered
	 */
	protected Integer softwareElementState = SOFTWARE_ELEMENT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareElementID() <em>Software Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareElementID() <em>Software Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementID()
	 * @generated
	 * @ordered
	 */
	protected String softwareElementID = SOFTWARE_ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetOperatingSystem() <em>Target Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_OPERATING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetOperatingSystem() <em>Target Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected Integer targetOperatingSystem = TARGET_OPERATING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionID() <em>Action ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionID() <em>Action ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionID()
	 * @generated
	 * @ordered
	 */
	protected String actionID = ACTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Integer direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Action();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSoftwareElementState() {
		return softwareElementState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareElementState(Integer newSoftwareElementState) {
		Integer oldSoftwareElementState = softwareElementState;
		softwareElementState = newSoftwareElementState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_STATE, oldSoftwareElementState, softwareElementState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftwareElementID() {
		return softwareElementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareElementID(String newSoftwareElementID) {
		String oldSoftwareElementID = softwareElementID;
		softwareElementID = newSoftwareElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_ID, oldSoftwareElementID, softwareElementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTargetOperatingSystem() {
		return targetOperatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetOperatingSystem(Integer newTargetOperatingSystem) {
		Integer oldTargetOperatingSystem = targetOperatingSystem;
		targetOperatingSystem = newTargetOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTION__TARGET_OPERATING_SYSTEM, oldTargetOperatingSystem, targetOperatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionID() {
		return actionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionID(String newActionID) {
		String oldActionID = actionID;
		actionID = newActionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTION__ACTION_ID, oldActionID, actionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(Integer newDirection) {
		Integer oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTION__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Invoke() {
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
	public Long InvokeOnSystem(CIM_ComputerSystem TargetSystem) {
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
			case CimPackage.CIM_ACTION__NAME:
				return getName();
			case CimPackage.CIM_ACTION__VERSION:
				return getVersion();
			case CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_STATE:
				return getSoftwareElementState();
			case CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_ID:
				return getSoftwareElementID();
			case CimPackage.CIM_ACTION__TARGET_OPERATING_SYSTEM:
				return getTargetOperatingSystem();
			case CimPackage.CIM_ACTION__ACTION_ID:
				return getActionID();
			case CimPackage.CIM_ACTION__DIRECTION:
				return getDirection();
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
			case CimPackage.CIM_ACTION__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_ACTION__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState((Integer)newValue);
				return;
			case CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID((String)newValue);
				return;
			case CimPackage.CIM_ACTION__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem((Integer)newValue);
				return;
			case CimPackage.CIM_ACTION__ACTION_ID:
				setActionID((String)newValue);
				return;
			case CimPackage.CIM_ACTION__DIRECTION:
				setDirection((Integer)newValue);
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
			case CimPackage.CIM_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ACTION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState(SOFTWARE_ELEMENT_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID(SOFTWARE_ELEMENT_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ACTION__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem(TARGET_OPERATING_SYSTEM_EDEFAULT);
				return;
			case CimPackage.CIM_ACTION__ACTION_ID:
				setActionID(ACTION_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ACTION__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case CimPackage.CIM_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_ACTION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_STATE:
				return SOFTWARE_ELEMENT_STATE_EDEFAULT == null ? softwareElementState != null : !SOFTWARE_ELEMENT_STATE_EDEFAULT.equals(softwareElementState);
			case CimPackage.CIM_ACTION__SOFTWARE_ELEMENT_ID:
				return SOFTWARE_ELEMENT_ID_EDEFAULT == null ? softwareElementID != null : !SOFTWARE_ELEMENT_ID_EDEFAULT.equals(softwareElementID);
			case CimPackage.CIM_ACTION__TARGET_OPERATING_SYSTEM:
				return TARGET_OPERATING_SYSTEM_EDEFAULT == null ? targetOperatingSystem != null : !TARGET_OPERATING_SYSTEM_EDEFAULT.equals(targetOperatingSystem);
			case CimPackage.CIM_ACTION__ACTION_ID:
				return ACTION_ID_EDEFAULT == null ? actionID != null : !ACTION_ID_EDEFAULT.equals(actionID);
			case CimPackage.CIM_ACTION__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
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
			case CimPackage.CIM_ACTION___INVOKE:
				return Invoke();
			case CimPackage.CIM_ACTION___INVOKE_ON_SYSTEM__CIM_COMPUTERSYSTEM:
				return InvokeOnSystem((CIM_ComputerSystem)arguments.get(0));
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Version: ");
		result.append(version);
		result.append(", SoftwareElementState: ");
		result.append(softwareElementState);
		result.append(", SoftwareElementID: ");
		result.append(softwareElementID);
		result.append(", TargetOperatingSystem: ");
		result.append(targetOperatingSystem);
		result.append(", ActionID: ");
		result.append(actionID);
		result.append(", Direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //CIM_ActionImpl
