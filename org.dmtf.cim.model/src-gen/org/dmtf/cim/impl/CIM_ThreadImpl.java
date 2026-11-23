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

import org.dmtf.cim.CIM_Thread;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getOSCreationClassName <em>OS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getOSName <em>OS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getProcessCreationClassName <em>Process Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getProcessHandle <em>Process Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getExecutionState <em>Execution State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getKernelModeTime <em>Kernel Mode Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThreadImpl#getUserModeTime <em>User Mode Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ThreadImpl extends CIM_EnabledLogicalElementImpl implements CIM_Thread {
	/**
	 * The default value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String csCreationClassName = CS_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected String csName = CS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOSCreationClassName() <em>OS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOSCreationClassName() <em>OS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String osCreationClassName = OS_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOSName() <em>OS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSName()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOSName() <em>OS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSName()
	 * @generated
	 * @ordered
	 */
	protected String osName = OS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessCreationClassName() <em>Process Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessCreationClassName() <em>Process Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String processCreationClassName = PROCESS_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessHandle() <em>Process Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_HANDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessHandle() <em>Process Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessHandle()
	 * @generated
	 * @ordered
	 */
	protected String processHandle = PROCESS_HANDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected String handle = HANDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Long priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionState() <em>Execution State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXECUTION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionState() <em>Execution State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionState()
	 * @generated
	 * @ordered
	 */
	protected Integer executionState = EXECUTION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKernelModeTime() <em>Kernel Mode Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelModeTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long KERNEL_MODE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKernelModeTime() <em>Kernel Mode Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelModeTime()
	 * @generated
	 * @ordered
	 */
	protected Long kernelModeTime = KERNEL_MODE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserModeTime() <em>User Mode Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserModeTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long USER_MODE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserModeTime() <em>User Mode Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserModeTime()
	 * @generated
	 * @ordered
	 */
	protected Long userModeTime = USER_MODE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Thread();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSCreationClassName() {
		return csCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSCreationClassName(String newCSCreationClassName) {
		String oldCSCreationClassName = csCreationClassName;
		csCreationClassName = newCSCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSName() {
		return csName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSName(String newCSName) {
		String oldCSName = csName;
		csName = newCSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__CS_NAME, oldCSName, csName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOSCreationClassName() {
		return osCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOSCreationClassName(String newOSCreationClassName) {
		String oldOSCreationClassName = osCreationClassName;
		osCreationClassName = newOSCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__OS_CREATION_CLASS_NAME, oldOSCreationClassName, osCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOSName() {
		return osName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOSName(String newOSName) {
		String oldOSName = osName;
		osName = newOSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__OS_NAME, oldOSName, osName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessCreationClassName() {
		return processCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessCreationClassName(String newProcessCreationClassName) {
		String oldProcessCreationClassName = processCreationClassName;
		processCreationClassName = newProcessCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__PROCESS_CREATION_CLASS_NAME, oldProcessCreationClassName, processCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessHandle() {
		return processHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessHandle(String newProcessHandle) {
		String oldProcessHandle = processHandle;
		processHandle = newProcessHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__PROCESS_HANDLE, oldProcessHandle, processHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandle() {
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandle(String newHandle) {
		String oldHandle = handle;
		handle = newHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__HANDLE, oldHandle, handle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Long newPriority) {
		Long oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExecutionState() {
		return executionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionState(Integer newExecutionState) {
		Integer oldExecutionState = executionState;
		executionState = newExecutionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__EXECUTION_STATE, oldExecutionState, executionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getKernelModeTime() {
		return kernelModeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKernelModeTime(Long newKernelModeTime) {
		Long oldKernelModeTime = kernelModeTime;
		kernelModeTime = newKernelModeTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__KERNEL_MODE_TIME, oldKernelModeTime, kernelModeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUserModeTime() {
		return userModeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserModeTime(Long newUserModeTime) {
		Long oldUserModeTime = userModeTime;
		userModeTime = newUserModeTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THREAD__USER_MODE_TIME, oldUserModeTime, userModeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_THREAD__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.CIM_THREAD__CS_NAME:
				return getCSName();
			case CimPackage.CIM_THREAD__OS_CREATION_CLASS_NAME:
				return getOSCreationClassName();
			case CimPackage.CIM_THREAD__OS_NAME:
				return getOSName();
			case CimPackage.CIM_THREAD__PROCESS_CREATION_CLASS_NAME:
				return getProcessCreationClassName();
			case CimPackage.CIM_THREAD__PROCESS_HANDLE:
				return getProcessHandle();
			case CimPackage.CIM_THREAD__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_THREAD__HANDLE:
				return getHandle();
			case CimPackage.CIM_THREAD__PRIORITY:
				return getPriority();
			case CimPackage.CIM_THREAD__EXECUTION_STATE:
				return getExecutionState();
			case CimPackage.CIM_THREAD__KERNEL_MODE_TIME:
				return getKernelModeTime();
			case CimPackage.CIM_THREAD__USER_MODE_TIME:
				return getUserModeTime();
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
			case CimPackage.CIM_THREAD__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_THREAD__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.CIM_THREAD__OS_CREATION_CLASS_NAME:
				setOSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_THREAD__OS_NAME:
				setOSName((String)newValue);
				return;
			case CimPackage.CIM_THREAD__PROCESS_CREATION_CLASS_NAME:
				setProcessCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_THREAD__PROCESS_HANDLE:
				setProcessHandle((String)newValue);
				return;
			case CimPackage.CIM_THREAD__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_THREAD__HANDLE:
				setHandle((String)newValue);
				return;
			case CimPackage.CIM_THREAD__PRIORITY:
				setPriority((Long)newValue);
				return;
			case CimPackage.CIM_THREAD__EXECUTION_STATE:
				setExecutionState((Integer)newValue);
				return;
			case CimPackage.CIM_THREAD__KERNEL_MODE_TIME:
				setKernelModeTime((Long)newValue);
				return;
			case CimPackage.CIM_THREAD__USER_MODE_TIME:
				setUserModeTime((Long)newValue);
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
			case CimPackage.CIM_THREAD__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__OS_CREATION_CLASS_NAME:
				setOSCreationClassName(OS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__OS_NAME:
				setOSName(OS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__PROCESS_CREATION_CLASS_NAME:
				setProcessCreationClassName(PROCESS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__PROCESS_HANDLE:
				setProcessHandle(PROCESS_HANDLE_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__HANDLE:
				setHandle(HANDLE_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__EXECUTION_STATE:
				setExecutionState(EXECUTION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__KERNEL_MODE_TIME:
				setKernelModeTime(KERNEL_MODE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_THREAD__USER_MODE_TIME:
				setUserModeTime(USER_MODE_TIME_EDEFAULT);
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
			case CimPackage.CIM_THREAD__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.CIM_THREAD__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.CIM_THREAD__OS_CREATION_CLASS_NAME:
				return OS_CREATION_CLASS_NAME_EDEFAULT == null ? osCreationClassName != null : !OS_CREATION_CLASS_NAME_EDEFAULT.equals(osCreationClassName);
			case CimPackage.CIM_THREAD__OS_NAME:
				return OS_NAME_EDEFAULT == null ? osName != null : !OS_NAME_EDEFAULT.equals(osName);
			case CimPackage.CIM_THREAD__PROCESS_CREATION_CLASS_NAME:
				return PROCESS_CREATION_CLASS_NAME_EDEFAULT == null ? processCreationClassName != null : !PROCESS_CREATION_CLASS_NAME_EDEFAULT.equals(processCreationClassName);
			case CimPackage.CIM_THREAD__PROCESS_HANDLE:
				return PROCESS_HANDLE_EDEFAULT == null ? processHandle != null : !PROCESS_HANDLE_EDEFAULT.equals(processHandle);
			case CimPackage.CIM_THREAD__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_THREAD__HANDLE:
				return HANDLE_EDEFAULT == null ? handle != null : !HANDLE_EDEFAULT.equals(handle);
			case CimPackage.CIM_THREAD__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CimPackage.CIM_THREAD__EXECUTION_STATE:
				return EXECUTION_STATE_EDEFAULT == null ? executionState != null : !EXECUTION_STATE_EDEFAULT.equals(executionState);
			case CimPackage.CIM_THREAD__KERNEL_MODE_TIME:
				return KERNEL_MODE_TIME_EDEFAULT == null ? kernelModeTime != null : !KERNEL_MODE_TIME_EDEFAULT.equals(kernelModeTime);
			case CimPackage.CIM_THREAD__USER_MODE_TIME:
				return USER_MODE_TIME_EDEFAULT == null ? userModeTime != null : !USER_MODE_TIME_EDEFAULT.equals(userModeTime);
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
		result.append(" (CSCreationClassName: ");
		result.append(csCreationClassName);
		result.append(", CSName: ");
		result.append(csName);
		result.append(", OSCreationClassName: ");
		result.append(osCreationClassName);
		result.append(", OSName: ");
		result.append(osName);
		result.append(", ProcessCreationClassName: ");
		result.append(processCreationClassName);
		result.append(", ProcessHandle: ");
		result.append(processHandle);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", Handle: ");
		result.append(handle);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", ExecutionState: ");
		result.append(executionState);
		result.append(", KernelModeTime: ");
		result.append(kernelModeTime);
		result.append(", UserModeTime: ");
		result.append(userModeTime);
		result.append(')');
		return result.toString();
	}

} //CIM_ThreadImpl
