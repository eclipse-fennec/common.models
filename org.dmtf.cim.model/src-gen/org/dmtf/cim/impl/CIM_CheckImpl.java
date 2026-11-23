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

import org.dmtf.cim.CIM_Check;
import org.dmtf.cim.CIM_ComputerSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CheckImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CheckImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CheckImpl#getSoftwareElementState <em>Software Element State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CheckImpl#getSoftwareElementID <em>Software Element ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CheckImpl#getTargetOperatingSystem <em>Target Operating System</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CheckImpl#getCheckID <em>Check ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CheckImpl#getCheckMode <em>Check Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_CheckImpl extends CIM_ManagedElementImpl implements CIM_Check {
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
	 * The default value of the '{@link #getCheckID() <em>Check ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckID()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckID() <em>Check ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckID()
	 * @generated
	 * @ordered
	 */
	protected String checkID = CHECK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckMode() <em>Check Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckMode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CHECK_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckMode() <em>Check Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckMode()
	 * @generated
	 * @ordered
	 */
	protected Boolean checkMode = CHECK_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Check();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHECK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHECK__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_STATE, oldSoftwareElementState, softwareElementState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_ID, oldSoftwareElementID, softwareElementID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHECK__TARGET_OPERATING_SYSTEM, oldTargetOperatingSystem, targetOperatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCheckID() {
		return checkID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckID(String newCheckID) {
		String oldCheckID = checkID;
		checkID = newCheckID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHECK__CHECK_ID, oldCheckID, checkID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCheckMode() {
		return checkMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckMode(Boolean newCheckMode) {
		Boolean oldCheckMode = checkMode;
		checkMode = newCheckMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHECK__CHECK_MODE, oldCheckMode, checkMode));
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
			case CimPackage.CIM_CHECK__NAME:
				return getName();
			case CimPackage.CIM_CHECK__VERSION:
				return getVersion();
			case CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_STATE:
				return getSoftwareElementState();
			case CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_ID:
				return getSoftwareElementID();
			case CimPackage.CIM_CHECK__TARGET_OPERATING_SYSTEM:
				return getTargetOperatingSystem();
			case CimPackage.CIM_CHECK__CHECK_ID:
				return getCheckID();
			case CimPackage.CIM_CHECK__CHECK_MODE:
				return getCheckMode();
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
			case CimPackage.CIM_CHECK__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_CHECK__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState((Integer)newValue);
				return;
			case CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID((String)newValue);
				return;
			case CimPackage.CIM_CHECK__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem((Integer)newValue);
				return;
			case CimPackage.CIM_CHECK__CHECK_ID:
				setCheckID((String)newValue);
				return;
			case CimPackage.CIM_CHECK__CHECK_MODE:
				setCheckMode((Boolean)newValue);
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
			case CimPackage.CIM_CHECK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_CHECK__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState(SOFTWARE_ELEMENT_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID(SOFTWARE_ELEMENT_ID_EDEFAULT);
				return;
			case CimPackage.CIM_CHECK__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem(TARGET_OPERATING_SYSTEM_EDEFAULT);
				return;
			case CimPackage.CIM_CHECK__CHECK_ID:
				setCheckID(CHECK_ID_EDEFAULT);
				return;
			case CimPackage.CIM_CHECK__CHECK_MODE:
				setCheckMode(CHECK_MODE_EDEFAULT);
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
			case CimPackage.CIM_CHECK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_CHECK__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_STATE:
				return SOFTWARE_ELEMENT_STATE_EDEFAULT == null ? softwareElementState != null : !SOFTWARE_ELEMENT_STATE_EDEFAULT.equals(softwareElementState);
			case CimPackage.CIM_CHECK__SOFTWARE_ELEMENT_ID:
				return SOFTWARE_ELEMENT_ID_EDEFAULT == null ? softwareElementID != null : !SOFTWARE_ELEMENT_ID_EDEFAULT.equals(softwareElementID);
			case CimPackage.CIM_CHECK__TARGET_OPERATING_SYSTEM:
				return TARGET_OPERATING_SYSTEM_EDEFAULT == null ? targetOperatingSystem != null : !TARGET_OPERATING_SYSTEM_EDEFAULT.equals(targetOperatingSystem);
			case CimPackage.CIM_CHECK__CHECK_ID:
				return CHECK_ID_EDEFAULT == null ? checkID != null : !CHECK_ID_EDEFAULT.equals(checkID);
			case CimPackage.CIM_CHECK__CHECK_MODE:
				return CHECK_MODE_EDEFAULT == null ? checkMode != null : !CHECK_MODE_EDEFAULT.equals(checkMode);
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
			case CimPackage.CIM_CHECK___INVOKE:
				return Invoke();
			case CimPackage.CIM_CHECK___INVOKE_ON_SYSTEM__CIM_COMPUTERSYSTEM:
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
		result.append(", CheckID: ");
		result.append(checkID);
		result.append(", CheckMode: ");
		result.append(checkMode);
		result.append(')');
		return result.toString();
	}

} //CIM_CheckImpl
