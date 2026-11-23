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

import java.util.Collection;

import org.dmtf.cim.CIM_UnixProcess;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unix Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessImpl#getParentProcessID <em>Parent Process ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessImpl#getRealUserID <em>Real User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessImpl#getProcessGroupID <em>Process Group ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessImpl#getProcessSessionID <em>Process Session ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessImpl#getProcessTTY <em>Process TTY</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessImpl#getModulePath <em>Module Path</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessImpl#getProcessNiceValue <em>Process Nice Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessImpl#getProcessWaitingForEvent <em>Process Waiting For Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnixProcessImpl extends CIM_ProcessImpl implements CIM_UnixProcess {
	/**
	 * The default value of the '{@link #getParentProcessID() <em>Parent Process ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProcessID()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_PROCESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentProcessID() <em>Parent Process ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProcessID()
	 * @generated
	 * @ordered
	 */
	protected String parentProcessID = PARENT_PROCESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealUserID() <em>Real User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealUserID()
	 * @generated
	 * @ordered
	 */
	protected static final Long REAL_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealUserID() <em>Real User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealUserID()
	 * @generated
	 * @ordered
	 */
	protected Long realUserID = REAL_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessGroupID() <em>Process Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROCESS_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessGroupID() <em>Process Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessGroupID()
	 * @generated
	 * @ordered
	 */
	protected Long processGroupID = PROCESS_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessSessionID() <em>Process Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessSessionID()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROCESS_SESSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessSessionID() <em>Process Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessSessionID()
	 * @generated
	 * @ordered
	 */
	protected Long processSessionID = PROCESS_SESSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessTTY() <em>Process TTY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessTTY()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_TTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessTTY() <em>Process TTY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessTTY()
	 * @generated
	 * @ordered
	 */
	protected String processTTY = PROCESS_TTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getModulePath() <em>Module Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulePath()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulePath() <em>Module Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulePath()
	 * @generated
	 * @ordered
	 */
	protected String modulePath = MODULE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * The default value of the '{@link #getProcessNiceValue() <em>Process Nice Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNiceValue()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROCESS_NICE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessNiceValue() <em>Process Nice Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNiceValue()
	 * @generated
	 * @ordered
	 */
	protected Long processNiceValue = PROCESS_NICE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessWaitingForEvent() <em>Process Waiting For Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessWaitingForEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_WAITING_FOR_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessWaitingForEvent() <em>Process Waiting For Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessWaitingForEvent()
	 * @generated
	 * @ordered
	 */
	protected String processWaitingForEvent = PROCESS_WAITING_FOR_EVENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnixProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnixProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentProcessID() {
		return parentProcessID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentProcessID(String newParentProcessID) {
		String oldParentProcessID = parentProcessID;
		parentProcessID = newParentProcessID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS__PARENT_PROCESS_ID, oldParentProcessID, parentProcessID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRealUserID() {
		return realUserID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealUserID(Long newRealUserID) {
		Long oldRealUserID = realUserID;
		realUserID = newRealUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS__REAL_USER_ID, oldRealUserID, realUserID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProcessGroupID() {
		return processGroupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessGroupID(Long newProcessGroupID) {
		Long oldProcessGroupID = processGroupID;
		processGroupID = newProcessGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS__PROCESS_GROUP_ID, oldProcessGroupID, processGroupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProcessSessionID() {
		return processSessionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessSessionID(Long newProcessSessionID) {
		Long oldProcessSessionID = processSessionID;
		processSessionID = newProcessSessionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS__PROCESS_SESSION_ID, oldProcessSessionID, processSessionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessTTY() {
		return processTTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessTTY(String newProcessTTY) {
		String oldProcessTTY = processTTY;
		processTTY = newProcessTTY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS__PROCESS_TTY, oldProcessTTY, processTTY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModulePath() {
		return modulePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModulePath(String newModulePath) {
		String oldModulePath = modulePath;
		modulePath = newModulePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS__MODULE_PATH, oldModulePath, modulePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_UNIX_PROCESS__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProcessNiceValue() {
		return processNiceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessNiceValue(Long newProcessNiceValue) {
		Long oldProcessNiceValue = processNiceValue;
		processNiceValue = newProcessNiceValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS__PROCESS_NICE_VALUE, oldProcessNiceValue, processNiceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessWaitingForEvent() {
		return processWaitingForEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessWaitingForEvent(String newProcessWaitingForEvent) {
		String oldProcessWaitingForEvent = processWaitingForEvent;
		processWaitingForEvent = newProcessWaitingForEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS__PROCESS_WAITING_FOR_EVENT, oldProcessWaitingForEvent, processWaitingForEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_PROCESS__PARENT_PROCESS_ID:
				return getParentProcessID();
			case CimPackage.CIM_UNIX_PROCESS__REAL_USER_ID:
				return getRealUserID();
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_GROUP_ID:
				return getProcessGroupID();
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_SESSION_ID:
				return getProcessSessionID();
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_TTY:
				return getProcessTTY();
			case CimPackage.CIM_UNIX_PROCESS__MODULE_PATH:
				return getModulePath();
			case CimPackage.CIM_UNIX_PROCESS__PARAMETERS:
				return getParameters();
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_NICE_VALUE:
				return getProcessNiceValue();
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_WAITING_FOR_EVENT:
				return getProcessWaitingForEvent();
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
			case CimPackage.CIM_UNIX_PROCESS__PARENT_PROCESS_ID:
				setParentProcessID((String)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS__REAL_USER_ID:
				setRealUserID((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_GROUP_ID:
				setProcessGroupID((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_SESSION_ID:
				setProcessSessionID((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_TTY:
				setProcessTTY((String)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS__MODULE_PATH:
				setModulePath((String)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_NICE_VALUE:
				setProcessNiceValue((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_WAITING_FOR_EVENT:
				setProcessWaitingForEvent((String)newValue);
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
			case CimPackage.CIM_UNIX_PROCESS__PARENT_PROCESS_ID:
				setParentProcessID(PARENT_PROCESS_ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS__REAL_USER_ID:
				setRealUserID(REAL_USER_ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_GROUP_ID:
				setProcessGroupID(PROCESS_GROUP_ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_SESSION_ID:
				setProcessSessionID(PROCESS_SESSION_ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_TTY:
				setProcessTTY(PROCESS_TTY_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS__MODULE_PATH:
				setModulePath(MODULE_PATH_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PARAMETERS:
				getParameters().clear();
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_NICE_VALUE:
				setProcessNiceValue(PROCESS_NICE_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_WAITING_FOR_EVENT:
				setProcessWaitingForEvent(PROCESS_WAITING_FOR_EVENT_EDEFAULT);
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
			case CimPackage.CIM_UNIX_PROCESS__PARENT_PROCESS_ID:
				return PARENT_PROCESS_ID_EDEFAULT == null ? parentProcessID != null : !PARENT_PROCESS_ID_EDEFAULT.equals(parentProcessID);
			case CimPackage.CIM_UNIX_PROCESS__REAL_USER_ID:
				return REAL_USER_ID_EDEFAULT == null ? realUserID != null : !REAL_USER_ID_EDEFAULT.equals(realUserID);
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_GROUP_ID:
				return PROCESS_GROUP_ID_EDEFAULT == null ? processGroupID != null : !PROCESS_GROUP_ID_EDEFAULT.equals(processGroupID);
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_SESSION_ID:
				return PROCESS_SESSION_ID_EDEFAULT == null ? processSessionID != null : !PROCESS_SESSION_ID_EDEFAULT.equals(processSessionID);
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_TTY:
				return PROCESS_TTY_EDEFAULT == null ? processTTY != null : !PROCESS_TTY_EDEFAULT.equals(processTTY);
			case CimPackage.CIM_UNIX_PROCESS__MODULE_PATH:
				return MODULE_PATH_EDEFAULT == null ? modulePath != null : !MODULE_PATH_EDEFAULT.equals(modulePath);
			case CimPackage.CIM_UNIX_PROCESS__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_NICE_VALUE:
				return PROCESS_NICE_VALUE_EDEFAULT == null ? processNiceValue != null : !PROCESS_NICE_VALUE_EDEFAULT.equals(processNiceValue);
			case CimPackage.CIM_UNIX_PROCESS__PROCESS_WAITING_FOR_EVENT:
				return PROCESS_WAITING_FOR_EVENT_EDEFAULT == null ? processWaitingForEvent != null : !PROCESS_WAITING_FOR_EVENT_EDEFAULT.equals(processWaitingForEvent);
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
		result.append(" (ParentProcessID: ");
		result.append(parentProcessID);
		result.append(", RealUserID: ");
		result.append(realUserID);
		result.append(", ProcessGroupID: ");
		result.append(processGroupID);
		result.append(", ProcessSessionID: ");
		result.append(processSessionID);
		result.append(", ProcessTTY: ");
		result.append(processTTY);
		result.append(", ModulePath: ");
		result.append(modulePath);
		result.append(", Parameters: ");
		result.append(parameters);
		result.append(", ProcessNiceValue: ");
		result.append(processNiceValue);
		result.append(", ProcessWaitingForEvent: ");
		result.append(processWaitingForEvent);
		result.append(')');
		return result.toString();
	}

} //CIM_UnixProcessImpl
