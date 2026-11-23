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

import org.dmtf.cim.CIM_UnixProcessStatisticalInformation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unix Process Statistical Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getOSCreationClassName <em>OS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getOSName <em>OS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getProcessCreationClassName <em>Process Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getCPUTime <em>CPU Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getRealText <em>Real Text</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getRealData <em>Real Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getRealStack <em>Real Stack</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getVirtualText <em>Virtual Text</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getVirtualData <em>Virtual Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getVirtualStack <em>Virtual Stack</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getVirtualMemoryMappedFileSize <em>Virtual Memory Mapped File Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getVirtualSharedMemory <em>Virtual Shared Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getCpuTimeDeadChildren <em>Cpu Time Dead Children</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixProcessStatisticalInformationImpl#getSystemTimeDeadChildren <em>System Time Dead Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnixProcessStatisticalInformationImpl extends CIM_StatisticalInformationImpl implements CIM_UnixProcessStatisticalInformation {
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
	 * The default value of the '{@link #getCPUTime() <em>CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long CPU_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPUTime() <em>CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUTime()
	 * @generated
	 * @ordered
	 */
	protected Long cpuTime = CPU_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealText() <em>Real Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealText()
	 * @generated
	 * @ordered
	 */
	protected static final Long REAL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealText() <em>Real Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealText()
	 * @generated
	 * @ordered
	 */
	protected Long realText = REAL_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealData() <em>Real Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealData()
	 * @generated
	 * @ordered
	 */
	protected static final Long REAL_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealData() <em>Real Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealData()
	 * @generated
	 * @ordered
	 */
	protected Long realData = REAL_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealStack() <em>Real Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealStack()
	 * @generated
	 * @ordered
	 */
	protected static final Long REAL_STACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealStack() <em>Real Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealStack()
	 * @generated
	 * @ordered
	 */
	protected Long realStack = REAL_STACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualText() <em>Virtual Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualText()
	 * @generated
	 * @ordered
	 */
	protected static final Long VIRTUAL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualText() <em>Virtual Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualText()
	 * @generated
	 * @ordered
	 */
	protected Long virtualText = VIRTUAL_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualData() <em>Virtual Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualData()
	 * @generated
	 * @ordered
	 */
	protected static final Long VIRTUAL_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualData() <em>Virtual Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualData()
	 * @generated
	 * @ordered
	 */
	protected Long virtualData = VIRTUAL_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualStack() <em>Virtual Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualStack()
	 * @generated
	 * @ordered
	 */
	protected static final Long VIRTUAL_STACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualStack() <em>Virtual Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualStack()
	 * @generated
	 * @ordered
	 */
	protected Long virtualStack = VIRTUAL_STACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualMemoryMappedFileSize() <em>Virtual Memory Mapped File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualMemoryMappedFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long VIRTUAL_MEMORY_MAPPED_FILE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualMemoryMappedFileSize() <em>Virtual Memory Mapped File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualMemoryMappedFileSize()
	 * @generated
	 * @ordered
	 */
	protected Long virtualMemoryMappedFileSize = VIRTUAL_MEMORY_MAPPED_FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualSharedMemory() <em>Virtual Shared Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSharedMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Long VIRTUAL_SHARED_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualSharedMemory() <em>Virtual Shared Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSharedMemory()
	 * @generated
	 * @ordered
	 */
	protected Long virtualSharedMemory = VIRTUAL_SHARED_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuTimeDeadChildren() <em>Cpu Time Dead Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuTimeDeadChildren()
	 * @generated
	 * @ordered
	 */
	protected static final Long CPU_TIME_DEAD_CHILDREN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuTimeDeadChildren() <em>Cpu Time Dead Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuTimeDeadChildren()
	 * @generated
	 * @ordered
	 */
	protected Long cpuTimeDeadChildren = CPU_TIME_DEAD_CHILDREN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemTimeDeadChildren() <em>System Time Dead Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemTimeDeadChildren()
	 * @generated
	 * @ordered
	 */
	protected static final Long SYSTEM_TIME_DEAD_CHILDREN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemTimeDeadChildren() <em>System Time Dead Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemTimeDeadChildren()
	 * @generated
	 * @ordered
	 */
	protected Long systemTimeDeadChildren = SYSTEM_TIME_DEAD_CHILDREN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnixProcessStatisticalInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnixProcessStatisticalInformation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_NAME, oldCSName, csName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_CREATION_CLASS_NAME, oldOSCreationClassName, osCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_NAME, oldOSName, osName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__HANDLE, oldHandle, handle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__PROCESS_CREATION_CLASS_NAME, oldProcessCreationClassName, processCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCPUTime() {
		return cpuTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCPUTime(Long newCPUTime) {
		Long oldCPUTime = cpuTime;
		cpuTime = newCPUTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME, oldCPUTime, cpuTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRealText() {
		return realText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealText(Long newRealText) {
		Long oldRealText = realText;
		realText = newRealText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_TEXT, oldRealText, realText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRealData() {
		return realData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealData(Long newRealData) {
		Long oldRealData = realData;
		realData = newRealData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_DATA, oldRealData, realData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRealStack() {
		return realStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealStack(Long newRealStack) {
		Long oldRealStack = realStack;
		realStack = newRealStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_STACK, oldRealStack, realStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVirtualText() {
		return virtualText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualText(Long newVirtualText) {
		Long oldVirtualText = virtualText;
		virtualText = newVirtualText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_TEXT, oldVirtualText, virtualText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVirtualData() {
		return virtualData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualData(Long newVirtualData) {
		Long oldVirtualData = virtualData;
		virtualData = newVirtualData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_DATA, oldVirtualData, virtualData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVirtualStack() {
		return virtualStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualStack(Long newVirtualStack) {
		Long oldVirtualStack = virtualStack;
		virtualStack = newVirtualStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_STACK, oldVirtualStack, virtualStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVirtualMemoryMappedFileSize() {
		return virtualMemoryMappedFileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualMemoryMappedFileSize(Long newVirtualMemoryMappedFileSize) {
		Long oldVirtualMemoryMappedFileSize = virtualMemoryMappedFileSize;
		virtualMemoryMappedFileSize = newVirtualMemoryMappedFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_MEMORY_MAPPED_FILE_SIZE, oldVirtualMemoryMappedFileSize, virtualMemoryMappedFileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVirtualSharedMemory() {
		return virtualSharedMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualSharedMemory(Long newVirtualSharedMemory) {
		Long oldVirtualSharedMemory = virtualSharedMemory;
		virtualSharedMemory = newVirtualSharedMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_SHARED_MEMORY, oldVirtualSharedMemory, virtualSharedMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCpuTimeDeadChildren() {
		return cpuTimeDeadChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpuTimeDeadChildren(Long newCpuTimeDeadChildren) {
		Long oldCpuTimeDeadChildren = cpuTimeDeadChildren;
		cpuTimeDeadChildren = newCpuTimeDeadChildren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME_DEAD_CHILDREN, oldCpuTimeDeadChildren, cpuTimeDeadChildren));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSystemTimeDeadChildren() {
		return systemTimeDeadChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemTimeDeadChildren(Long newSystemTimeDeadChildren) {
		Long oldSystemTimeDeadChildren = systemTimeDeadChildren;
		systemTimeDeadChildren = newSystemTimeDeadChildren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__SYSTEM_TIME_DEAD_CHILDREN, oldSystemTimeDeadChildren, systemTimeDeadChildren));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_NAME:
				return getCSName();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_CREATION_CLASS_NAME:
				return getOSCreationClassName();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_NAME:
				return getOSName();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__HANDLE:
				return getHandle();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__PROCESS_CREATION_CLASS_NAME:
				return getProcessCreationClassName();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME:
				return getCPUTime();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_TEXT:
				return getRealText();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_DATA:
				return getRealData();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_STACK:
				return getRealStack();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_TEXT:
				return getVirtualText();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_DATA:
				return getVirtualData();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_STACK:
				return getVirtualStack();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_MEMORY_MAPPED_FILE_SIZE:
				return getVirtualMemoryMappedFileSize();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_SHARED_MEMORY:
				return getVirtualSharedMemory();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME_DEAD_CHILDREN:
				return getCpuTimeDeadChildren();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__SYSTEM_TIME_DEAD_CHILDREN:
				return getSystemTimeDeadChildren();
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
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_CREATION_CLASS_NAME:
				setOSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_NAME:
				setOSName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__HANDLE:
				setHandle((String)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__PROCESS_CREATION_CLASS_NAME:
				setProcessCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME:
				setCPUTime((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_TEXT:
				setRealText((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_DATA:
				setRealData((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_STACK:
				setRealStack((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_TEXT:
				setVirtualText((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_DATA:
				setVirtualData((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_STACK:
				setVirtualStack((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_MEMORY_MAPPED_FILE_SIZE:
				setVirtualMemoryMappedFileSize((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_SHARED_MEMORY:
				setVirtualSharedMemory((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME_DEAD_CHILDREN:
				setCpuTimeDeadChildren((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__SYSTEM_TIME_DEAD_CHILDREN:
				setSystemTimeDeadChildren((Long)newValue);
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
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_CREATION_CLASS_NAME:
				setOSCreationClassName(OS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_NAME:
				setOSName(OS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__HANDLE:
				setHandle(HANDLE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__PROCESS_CREATION_CLASS_NAME:
				setProcessCreationClassName(PROCESS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME:
				setCPUTime(CPU_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_TEXT:
				setRealText(REAL_TEXT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_DATA:
				setRealData(REAL_DATA_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_STACK:
				setRealStack(REAL_STACK_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_TEXT:
				setVirtualText(VIRTUAL_TEXT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_DATA:
				setVirtualData(VIRTUAL_DATA_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_STACK:
				setVirtualStack(VIRTUAL_STACK_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_MEMORY_MAPPED_FILE_SIZE:
				setVirtualMemoryMappedFileSize(VIRTUAL_MEMORY_MAPPED_FILE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_SHARED_MEMORY:
				setVirtualSharedMemory(VIRTUAL_SHARED_MEMORY_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME_DEAD_CHILDREN:
				setCpuTimeDeadChildren(CPU_TIME_DEAD_CHILDREN_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__SYSTEM_TIME_DEAD_CHILDREN:
				setSystemTimeDeadChildren(SYSTEM_TIME_DEAD_CHILDREN_EDEFAULT);
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
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_CREATION_CLASS_NAME:
				return OS_CREATION_CLASS_NAME_EDEFAULT == null ? osCreationClassName != null : !OS_CREATION_CLASS_NAME_EDEFAULT.equals(osCreationClassName);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__OS_NAME:
				return OS_NAME_EDEFAULT == null ? osName != null : !OS_NAME_EDEFAULT.equals(osName);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__HANDLE:
				return HANDLE_EDEFAULT == null ? handle != null : !HANDLE_EDEFAULT.equals(handle);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__PROCESS_CREATION_CLASS_NAME:
				return PROCESS_CREATION_CLASS_NAME_EDEFAULT == null ? processCreationClassName != null : !PROCESS_CREATION_CLASS_NAME_EDEFAULT.equals(processCreationClassName);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME:
				return CPU_TIME_EDEFAULT == null ? cpuTime != null : !CPU_TIME_EDEFAULT.equals(cpuTime);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_TEXT:
				return REAL_TEXT_EDEFAULT == null ? realText != null : !REAL_TEXT_EDEFAULT.equals(realText);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_DATA:
				return REAL_DATA_EDEFAULT == null ? realData != null : !REAL_DATA_EDEFAULT.equals(realData);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__REAL_STACK:
				return REAL_STACK_EDEFAULT == null ? realStack != null : !REAL_STACK_EDEFAULT.equals(realStack);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_TEXT:
				return VIRTUAL_TEXT_EDEFAULT == null ? virtualText != null : !VIRTUAL_TEXT_EDEFAULT.equals(virtualText);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_DATA:
				return VIRTUAL_DATA_EDEFAULT == null ? virtualData != null : !VIRTUAL_DATA_EDEFAULT.equals(virtualData);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_STACK:
				return VIRTUAL_STACK_EDEFAULT == null ? virtualStack != null : !VIRTUAL_STACK_EDEFAULT.equals(virtualStack);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_MEMORY_MAPPED_FILE_SIZE:
				return VIRTUAL_MEMORY_MAPPED_FILE_SIZE_EDEFAULT == null ? virtualMemoryMappedFileSize != null : !VIRTUAL_MEMORY_MAPPED_FILE_SIZE_EDEFAULT.equals(virtualMemoryMappedFileSize);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__VIRTUAL_SHARED_MEMORY:
				return VIRTUAL_SHARED_MEMORY_EDEFAULT == null ? virtualSharedMemory != null : !VIRTUAL_SHARED_MEMORY_EDEFAULT.equals(virtualSharedMemory);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__CPU_TIME_DEAD_CHILDREN:
				return CPU_TIME_DEAD_CHILDREN_EDEFAULT == null ? cpuTimeDeadChildren != null : !CPU_TIME_DEAD_CHILDREN_EDEFAULT.equals(cpuTimeDeadChildren);
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION__SYSTEM_TIME_DEAD_CHILDREN:
				return SYSTEM_TIME_DEAD_CHILDREN_EDEFAULT == null ? systemTimeDeadChildren != null : !SYSTEM_TIME_DEAD_CHILDREN_EDEFAULT.equals(systemTimeDeadChildren);
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
		result.append(", Handle: ");
		result.append(handle);
		result.append(", ProcessCreationClassName: ");
		result.append(processCreationClassName);
		result.append(", CPUTime: ");
		result.append(cpuTime);
		result.append(", RealText: ");
		result.append(realText);
		result.append(", RealData: ");
		result.append(realData);
		result.append(", RealStack: ");
		result.append(realStack);
		result.append(", VirtualText: ");
		result.append(virtualText);
		result.append(", VirtualData: ");
		result.append(virtualData);
		result.append(", VirtualStack: ");
		result.append(virtualStack);
		result.append(", VirtualMemoryMappedFileSize: ");
		result.append(virtualMemoryMappedFileSize);
		result.append(", VirtualSharedMemory: ");
		result.append(virtualSharedMemory);
		result.append(", CpuTimeDeadChildren: ");
		result.append(cpuTimeDeadChildren);
		result.append(", SystemTimeDeadChildren: ");
		result.append(systemTimeDeadChildren);
		result.append(')');
		return result.toString();
	}

} //CIM_UnixProcessStatisticalInformationImpl
