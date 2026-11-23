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

import org.dmtf.cim.CIM_OperatingSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Operating System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getOSType <em>OS Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getLastBootUpTime <em>Last Boot Up Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getLocalDateTime <em>Local Date Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getCurrentTimeZone <em>Current Time Zone</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getNumberOfLicensedUsers <em>Number Of Licensed Users</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getNumberOfUsers <em>Number Of Users</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getNumberOfProcesses <em>Number Of Processes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getMaxNumberOfProcesses <em>Max Number Of Processes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getTotalSwapSpaceSize <em>Total Swap Space Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getTotalVirtualMemorySize <em>Total Virtual Memory Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getFreeVirtualMemory <em>Free Virtual Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getFreePhysicalMemory <em>Free Physical Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getTotalVisibleMemorySize <em>Total Visible Memory Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getSizeStoredInPagingFiles <em>Size Stored In Paging Files</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getFreeSpaceInPagingFiles <em>Free Space In Paging Files</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getMaxProcessMemorySize <em>Max Process Memory Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getDistributed <em>Distributed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemImpl#getMaxProcessesPerUser <em>Max Processes Per User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OperatingSystemImpl extends CIM_EnabledLogicalElementImpl implements CIM_OperatingSystem {
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
	 * The default value of the '{@link #getOSType() <em>OS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOSType() <em>OS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSType()
	 * @generated
	 * @ordered
	 */
	protected Integer osType = OS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getLastBootUpTime() <em>Last Boot Up Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastBootUpTime()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_BOOT_UP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastBootUpTime() <em>Last Boot Up Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastBootUpTime()
	 * @generated
	 * @ordered
	 */
	protected String lastBootUpTime = LAST_BOOT_UP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalDateTime() <em>Local Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalDateTime() <em>Local Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDateTime()
	 * @generated
	 * @ordered
	 */
	protected String localDateTime = LOCAL_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentTimeZone() <em>Current Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_TIME_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentTimeZone() <em>Current Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTimeZone()
	 * @generated
	 * @ordered
	 */
	protected Integer currentTimeZone = CURRENT_TIME_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfLicensedUsers() <em>Number Of Licensed Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLicensedUsers()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_LICENSED_USERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfLicensedUsers() <em>Number Of Licensed Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLicensedUsers()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfLicensedUsers = NUMBER_OF_LICENSED_USERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfUsers() <em>Number Of Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfUsers()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_USERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfUsers() <em>Number Of Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfUsers()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfUsers = NUMBER_OF_USERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfProcesses() <em>Number Of Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcesses()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_PROCESSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfProcesses() <em>Number Of Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcesses()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfProcesses = NUMBER_OF_PROCESSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberOfProcesses() <em>Max Number Of Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfProcesses()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUMBER_OF_PROCESSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberOfProcesses() <em>Max Number Of Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfProcesses()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumberOfProcesses = MAX_NUMBER_OF_PROCESSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalSwapSpaceSize() <em>Total Swap Space Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSwapSpaceSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_SWAP_SPACE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalSwapSpaceSize() <em>Total Swap Space Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSwapSpaceSize()
	 * @generated
	 * @ordered
	 */
	protected Long totalSwapSpaceSize = TOTAL_SWAP_SPACE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalVirtualMemorySize() <em>Total Virtual Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalVirtualMemorySize()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_VIRTUAL_MEMORY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalVirtualMemorySize() <em>Total Virtual Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalVirtualMemorySize()
	 * @generated
	 * @ordered
	 */
	protected Long totalVirtualMemorySize = TOTAL_VIRTUAL_MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreeVirtualMemory() <em>Free Virtual Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeVirtualMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_VIRTUAL_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreeVirtualMemory() <em>Free Virtual Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeVirtualMemory()
	 * @generated
	 * @ordered
	 */
	protected Long freeVirtualMemory = FREE_VIRTUAL_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreePhysicalMemory() <em>Free Physical Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePhysicalMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_PHYSICAL_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreePhysicalMemory() <em>Free Physical Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePhysicalMemory()
	 * @generated
	 * @ordered
	 */
	protected Long freePhysicalMemory = FREE_PHYSICAL_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalVisibleMemorySize() <em>Total Visible Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalVisibleMemorySize()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_VISIBLE_MEMORY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalVisibleMemorySize() <em>Total Visible Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalVisibleMemorySize()
	 * @generated
	 * @ordered
	 */
	protected Long totalVisibleMemorySize = TOTAL_VISIBLE_MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeStoredInPagingFiles() <em>Size Stored In Paging Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeStoredInPagingFiles()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIZE_STORED_IN_PAGING_FILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeStoredInPagingFiles() <em>Size Stored In Paging Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeStoredInPagingFiles()
	 * @generated
	 * @ordered
	 */
	protected Long sizeStoredInPagingFiles = SIZE_STORED_IN_PAGING_FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreeSpaceInPagingFiles() <em>Free Space In Paging Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeSpaceInPagingFiles()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_SPACE_IN_PAGING_FILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreeSpaceInPagingFiles() <em>Free Space In Paging Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeSpaceInPagingFiles()
	 * @generated
	 * @ordered
	 */
	protected Long freeSpaceInPagingFiles = FREE_SPACE_IN_PAGING_FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxProcessMemorySize() <em>Max Process Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProcessMemorySize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_PROCESS_MEMORY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxProcessMemorySize() <em>Max Process Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProcessMemorySize()
	 * @generated
	 * @ordered
	 */
	protected Long maxProcessMemorySize = MAX_PROCESS_MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistributed() <em>Distributed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DISTRIBUTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistributed() <em>Distributed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributed()
	 * @generated
	 * @ordered
	 */
	protected Boolean distributed = DISTRIBUTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxProcessesPerUser() <em>Max Processes Per User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProcessesPerUser()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_PROCESSES_PER_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxProcessesPerUser() <em>Max Processes Per User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProcessesPerUser()
	 * @generated
	 * @ordered
	 */
	protected Long maxProcessesPerUser = MAX_PROCESSES_PER_USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OperatingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OperatingSystem();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__CS_NAME, oldCSName, csName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOSType() {
		return osType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOSType(Integer newOSType) {
		Integer oldOSType = osType;
		osType = newOSType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__OS_TYPE, oldOSType, osType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastBootUpTime() {
		return lastBootUpTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastBootUpTime(String newLastBootUpTime) {
		String oldLastBootUpTime = lastBootUpTime;
		lastBootUpTime = newLastBootUpTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__LAST_BOOT_UP_TIME, oldLastBootUpTime, lastBootUpTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalDateTime() {
		return localDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalDateTime(String newLocalDateTime) {
		String oldLocalDateTime = localDateTime;
		localDateTime = newLocalDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__LOCAL_DATE_TIME, oldLocalDateTime, localDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentTimeZone() {
		return currentTimeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentTimeZone(Integer newCurrentTimeZone) {
		Integer oldCurrentTimeZone = currentTimeZone;
		currentTimeZone = newCurrentTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__CURRENT_TIME_ZONE, oldCurrentTimeZone, currentTimeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfLicensedUsers() {
		return numberOfLicensedUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfLicensedUsers(Long newNumberOfLicensedUsers) {
		Long oldNumberOfLicensedUsers = numberOfLicensedUsers;
		numberOfLicensedUsers = newNumberOfLicensedUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_LICENSED_USERS, oldNumberOfLicensedUsers, numberOfLicensedUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfUsers() {
		return numberOfUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfUsers(Long newNumberOfUsers) {
		Long oldNumberOfUsers = numberOfUsers;
		numberOfUsers = newNumberOfUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_USERS, oldNumberOfUsers, numberOfUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfProcesses() {
		return numberOfProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfProcesses(Long newNumberOfProcesses) {
		Long oldNumberOfProcesses = numberOfProcesses;
		numberOfProcesses = newNumberOfProcesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_PROCESSES, oldNumberOfProcesses, numberOfProcesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumberOfProcesses() {
		return maxNumberOfProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumberOfProcesses(Long newMaxNumberOfProcesses) {
		Long oldMaxNumberOfProcesses = maxNumberOfProcesses;
		maxNumberOfProcesses = newMaxNumberOfProcesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__MAX_NUMBER_OF_PROCESSES, oldMaxNumberOfProcesses, maxNumberOfProcesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalSwapSpaceSize() {
		return totalSwapSpaceSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalSwapSpaceSize(Long newTotalSwapSpaceSize) {
		Long oldTotalSwapSpaceSize = totalSwapSpaceSize;
		totalSwapSpaceSize = newTotalSwapSpaceSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__TOTAL_SWAP_SPACE_SIZE, oldTotalSwapSpaceSize, totalSwapSpaceSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalVirtualMemorySize() {
		return totalVirtualMemorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalVirtualMemorySize(Long newTotalVirtualMemorySize) {
		Long oldTotalVirtualMemorySize = totalVirtualMemorySize;
		totalVirtualMemorySize = newTotalVirtualMemorySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VIRTUAL_MEMORY_SIZE, oldTotalVirtualMemorySize, totalVirtualMemorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFreeVirtualMemory() {
		return freeVirtualMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreeVirtualMemory(Long newFreeVirtualMemory) {
		Long oldFreeVirtualMemory = freeVirtualMemory;
		freeVirtualMemory = newFreeVirtualMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__FREE_VIRTUAL_MEMORY, oldFreeVirtualMemory, freeVirtualMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFreePhysicalMemory() {
		return freePhysicalMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreePhysicalMemory(Long newFreePhysicalMemory) {
		Long oldFreePhysicalMemory = freePhysicalMemory;
		freePhysicalMemory = newFreePhysicalMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__FREE_PHYSICAL_MEMORY, oldFreePhysicalMemory, freePhysicalMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalVisibleMemorySize() {
		return totalVisibleMemorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalVisibleMemorySize(Long newTotalVisibleMemorySize) {
		Long oldTotalVisibleMemorySize = totalVisibleMemorySize;
		totalVisibleMemorySize = newTotalVisibleMemorySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VISIBLE_MEMORY_SIZE, oldTotalVisibleMemorySize, totalVisibleMemorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSizeStoredInPagingFiles() {
		return sizeStoredInPagingFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeStoredInPagingFiles(Long newSizeStoredInPagingFiles) {
		Long oldSizeStoredInPagingFiles = sizeStoredInPagingFiles;
		sizeStoredInPagingFiles = newSizeStoredInPagingFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__SIZE_STORED_IN_PAGING_FILES, oldSizeStoredInPagingFiles, sizeStoredInPagingFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFreeSpaceInPagingFiles() {
		return freeSpaceInPagingFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreeSpaceInPagingFiles(Long newFreeSpaceInPagingFiles) {
		Long oldFreeSpaceInPagingFiles = freeSpaceInPagingFiles;
		freeSpaceInPagingFiles = newFreeSpaceInPagingFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__FREE_SPACE_IN_PAGING_FILES, oldFreeSpaceInPagingFiles, freeSpaceInPagingFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxProcessMemorySize() {
		return maxProcessMemorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxProcessMemorySize(Long newMaxProcessMemorySize) {
		Long oldMaxProcessMemorySize = maxProcessMemorySize;
		maxProcessMemorySize = newMaxProcessMemorySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESS_MEMORY_SIZE, oldMaxProcessMemorySize, maxProcessMemorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDistributed() {
		return distributed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistributed(Boolean newDistributed) {
		Boolean oldDistributed = distributed;
		distributed = newDistributed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__DISTRIBUTED, oldDistributed, distributed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxProcessesPerUser() {
		return maxProcessesPerUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxProcessesPerUser(Long newMaxProcessesPerUser) {
		Long oldMaxProcessesPerUser = maxProcessesPerUser;
		maxProcessesPerUser = newMaxProcessesPerUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESSES_PER_USER, oldMaxProcessesPerUser, maxProcessesPerUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Reboot() {
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
	public Long Shutdown() {
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
			case CimPackage.CIM_OPERATING_SYSTEM__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.CIM_OPERATING_SYSTEM__CS_NAME:
				return getCSName();
			case CimPackage.CIM_OPERATING_SYSTEM__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_OPERATING_SYSTEM__OS_TYPE:
				return getOSType();
			case CimPackage.CIM_OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.CIM_OPERATING_SYSTEM__VERSION:
				return getVersion();
			case CimPackage.CIM_OPERATING_SYSTEM__LAST_BOOT_UP_TIME:
				return getLastBootUpTime();
			case CimPackage.CIM_OPERATING_SYSTEM__LOCAL_DATE_TIME:
				return getLocalDateTime();
			case CimPackage.CIM_OPERATING_SYSTEM__CURRENT_TIME_ZONE:
				return getCurrentTimeZone();
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_LICENSED_USERS:
				return getNumberOfLicensedUsers();
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_USERS:
				return getNumberOfUsers();
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_PROCESSES:
				return getNumberOfProcesses();
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_NUMBER_OF_PROCESSES:
				return getMaxNumberOfProcesses();
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_SWAP_SPACE_SIZE:
				return getTotalSwapSpaceSize();
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VIRTUAL_MEMORY_SIZE:
				return getTotalVirtualMemorySize();
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_VIRTUAL_MEMORY:
				return getFreeVirtualMemory();
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_PHYSICAL_MEMORY:
				return getFreePhysicalMemory();
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VISIBLE_MEMORY_SIZE:
				return getTotalVisibleMemorySize();
			case CimPackage.CIM_OPERATING_SYSTEM__SIZE_STORED_IN_PAGING_FILES:
				return getSizeStoredInPagingFiles();
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_SPACE_IN_PAGING_FILES:
				return getFreeSpaceInPagingFiles();
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESS_MEMORY_SIZE:
				return getMaxProcessMemorySize();
			case CimPackage.CIM_OPERATING_SYSTEM__DISTRIBUTED:
				return getDistributed();
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESSES_PER_USER:
				return getMaxProcessesPerUser();
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
			case CimPackage.CIM_OPERATING_SYSTEM__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__OS_TYPE:
				setOSType((Integer)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__LAST_BOOT_UP_TIME:
				setLastBootUpTime((String)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__LOCAL_DATE_TIME:
				setLocalDateTime((String)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__CURRENT_TIME_ZONE:
				setCurrentTimeZone((Integer)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_LICENSED_USERS:
				setNumberOfLicensedUsers((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_USERS:
				setNumberOfUsers((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_PROCESSES:
				setNumberOfProcesses((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_NUMBER_OF_PROCESSES:
				setMaxNumberOfProcesses((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_SWAP_SPACE_SIZE:
				setTotalSwapSpaceSize((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VIRTUAL_MEMORY_SIZE:
				setTotalVirtualMemorySize((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_VIRTUAL_MEMORY:
				setFreeVirtualMemory((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_PHYSICAL_MEMORY:
				setFreePhysicalMemory((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VISIBLE_MEMORY_SIZE:
				setTotalVisibleMemorySize((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__SIZE_STORED_IN_PAGING_FILES:
				setSizeStoredInPagingFiles((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_SPACE_IN_PAGING_FILES:
				setFreeSpaceInPagingFiles((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESS_MEMORY_SIZE:
				setMaxProcessMemorySize((Long)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__DISTRIBUTED:
				setDistributed((Boolean)newValue);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESSES_PER_USER:
				setMaxProcessesPerUser((Long)newValue);
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
			case CimPackage.CIM_OPERATING_SYSTEM__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__OS_TYPE:
				setOSType(OS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__LAST_BOOT_UP_TIME:
				setLastBootUpTime(LAST_BOOT_UP_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__LOCAL_DATE_TIME:
				setLocalDateTime(LOCAL_DATE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__CURRENT_TIME_ZONE:
				setCurrentTimeZone(CURRENT_TIME_ZONE_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_LICENSED_USERS:
				setNumberOfLicensedUsers(NUMBER_OF_LICENSED_USERS_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_USERS:
				setNumberOfUsers(NUMBER_OF_USERS_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_PROCESSES:
				setNumberOfProcesses(NUMBER_OF_PROCESSES_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_NUMBER_OF_PROCESSES:
				setMaxNumberOfProcesses(MAX_NUMBER_OF_PROCESSES_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_SWAP_SPACE_SIZE:
				setTotalSwapSpaceSize(TOTAL_SWAP_SPACE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VIRTUAL_MEMORY_SIZE:
				setTotalVirtualMemorySize(TOTAL_VIRTUAL_MEMORY_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_VIRTUAL_MEMORY:
				setFreeVirtualMemory(FREE_VIRTUAL_MEMORY_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_PHYSICAL_MEMORY:
				setFreePhysicalMemory(FREE_PHYSICAL_MEMORY_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VISIBLE_MEMORY_SIZE:
				setTotalVisibleMemorySize(TOTAL_VISIBLE_MEMORY_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__SIZE_STORED_IN_PAGING_FILES:
				setSizeStoredInPagingFiles(SIZE_STORED_IN_PAGING_FILES_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_SPACE_IN_PAGING_FILES:
				setFreeSpaceInPagingFiles(FREE_SPACE_IN_PAGING_FILES_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESS_MEMORY_SIZE:
				setMaxProcessMemorySize(MAX_PROCESS_MEMORY_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__DISTRIBUTED:
				setDistributed(DISTRIBUTED_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESSES_PER_USER:
				setMaxProcessesPerUser(MAX_PROCESSES_PER_USER_EDEFAULT);
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
			case CimPackage.CIM_OPERATING_SYSTEM__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.CIM_OPERATING_SYSTEM__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.CIM_OPERATING_SYSTEM__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_OPERATING_SYSTEM__OS_TYPE:
				return OS_TYPE_EDEFAULT == null ? osType != null : !OS_TYPE_EDEFAULT.equals(osType);
			case CimPackage.CIM_OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.CIM_OPERATING_SYSTEM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_OPERATING_SYSTEM__LAST_BOOT_UP_TIME:
				return LAST_BOOT_UP_TIME_EDEFAULT == null ? lastBootUpTime != null : !LAST_BOOT_UP_TIME_EDEFAULT.equals(lastBootUpTime);
			case CimPackage.CIM_OPERATING_SYSTEM__LOCAL_DATE_TIME:
				return LOCAL_DATE_TIME_EDEFAULT == null ? localDateTime != null : !LOCAL_DATE_TIME_EDEFAULT.equals(localDateTime);
			case CimPackage.CIM_OPERATING_SYSTEM__CURRENT_TIME_ZONE:
				return CURRENT_TIME_ZONE_EDEFAULT == null ? currentTimeZone != null : !CURRENT_TIME_ZONE_EDEFAULT.equals(currentTimeZone);
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_LICENSED_USERS:
				return NUMBER_OF_LICENSED_USERS_EDEFAULT == null ? numberOfLicensedUsers != null : !NUMBER_OF_LICENSED_USERS_EDEFAULT.equals(numberOfLicensedUsers);
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_USERS:
				return NUMBER_OF_USERS_EDEFAULT == null ? numberOfUsers != null : !NUMBER_OF_USERS_EDEFAULT.equals(numberOfUsers);
			case CimPackage.CIM_OPERATING_SYSTEM__NUMBER_OF_PROCESSES:
				return NUMBER_OF_PROCESSES_EDEFAULT == null ? numberOfProcesses != null : !NUMBER_OF_PROCESSES_EDEFAULT.equals(numberOfProcesses);
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_NUMBER_OF_PROCESSES:
				return MAX_NUMBER_OF_PROCESSES_EDEFAULT == null ? maxNumberOfProcesses != null : !MAX_NUMBER_OF_PROCESSES_EDEFAULT.equals(maxNumberOfProcesses);
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_SWAP_SPACE_SIZE:
				return TOTAL_SWAP_SPACE_SIZE_EDEFAULT == null ? totalSwapSpaceSize != null : !TOTAL_SWAP_SPACE_SIZE_EDEFAULT.equals(totalSwapSpaceSize);
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VIRTUAL_MEMORY_SIZE:
				return TOTAL_VIRTUAL_MEMORY_SIZE_EDEFAULT == null ? totalVirtualMemorySize != null : !TOTAL_VIRTUAL_MEMORY_SIZE_EDEFAULT.equals(totalVirtualMemorySize);
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_VIRTUAL_MEMORY:
				return FREE_VIRTUAL_MEMORY_EDEFAULT == null ? freeVirtualMemory != null : !FREE_VIRTUAL_MEMORY_EDEFAULT.equals(freeVirtualMemory);
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_PHYSICAL_MEMORY:
				return FREE_PHYSICAL_MEMORY_EDEFAULT == null ? freePhysicalMemory != null : !FREE_PHYSICAL_MEMORY_EDEFAULT.equals(freePhysicalMemory);
			case CimPackage.CIM_OPERATING_SYSTEM__TOTAL_VISIBLE_MEMORY_SIZE:
				return TOTAL_VISIBLE_MEMORY_SIZE_EDEFAULT == null ? totalVisibleMemorySize != null : !TOTAL_VISIBLE_MEMORY_SIZE_EDEFAULT.equals(totalVisibleMemorySize);
			case CimPackage.CIM_OPERATING_SYSTEM__SIZE_STORED_IN_PAGING_FILES:
				return SIZE_STORED_IN_PAGING_FILES_EDEFAULT == null ? sizeStoredInPagingFiles != null : !SIZE_STORED_IN_PAGING_FILES_EDEFAULT.equals(sizeStoredInPagingFiles);
			case CimPackage.CIM_OPERATING_SYSTEM__FREE_SPACE_IN_PAGING_FILES:
				return FREE_SPACE_IN_PAGING_FILES_EDEFAULT == null ? freeSpaceInPagingFiles != null : !FREE_SPACE_IN_PAGING_FILES_EDEFAULT.equals(freeSpaceInPagingFiles);
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESS_MEMORY_SIZE:
				return MAX_PROCESS_MEMORY_SIZE_EDEFAULT == null ? maxProcessMemorySize != null : !MAX_PROCESS_MEMORY_SIZE_EDEFAULT.equals(maxProcessMemorySize);
			case CimPackage.CIM_OPERATING_SYSTEM__DISTRIBUTED:
				return DISTRIBUTED_EDEFAULT == null ? distributed != null : !DISTRIBUTED_EDEFAULT.equals(distributed);
			case CimPackage.CIM_OPERATING_SYSTEM__MAX_PROCESSES_PER_USER:
				return MAX_PROCESSES_PER_USER_EDEFAULT == null ? maxProcessesPerUser != null : !MAX_PROCESSES_PER_USER_EDEFAULT.equals(maxProcessesPerUser);
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
			case CimPackage.CIM_OPERATING_SYSTEM___REBOOT:
				return Reboot();
			case CimPackage.CIM_OPERATING_SYSTEM___SHUTDOWN:
				return Shutdown();
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
		result.append(" (CSCreationClassName: ");
		result.append(csCreationClassName);
		result.append(", CSName: ");
		result.append(csName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", OSType: ");
		result.append(osType);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", Version: ");
		result.append(version);
		result.append(", LastBootUpTime: ");
		result.append(lastBootUpTime);
		result.append(", LocalDateTime: ");
		result.append(localDateTime);
		result.append(", CurrentTimeZone: ");
		result.append(currentTimeZone);
		result.append(", NumberOfLicensedUsers: ");
		result.append(numberOfLicensedUsers);
		result.append(", NumberOfUsers: ");
		result.append(numberOfUsers);
		result.append(", NumberOfProcesses: ");
		result.append(numberOfProcesses);
		result.append(", MaxNumberOfProcesses: ");
		result.append(maxNumberOfProcesses);
		result.append(", TotalSwapSpaceSize: ");
		result.append(totalSwapSpaceSize);
		result.append(", TotalVirtualMemorySize: ");
		result.append(totalVirtualMemorySize);
		result.append(", FreeVirtualMemory: ");
		result.append(freeVirtualMemory);
		result.append(", FreePhysicalMemory: ");
		result.append(freePhysicalMemory);
		result.append(", TotalVisibleMemorySize: ");
		result.append(totalVisibleMemorySize);
		result.append(", SizeStoredInPagingFiles: ");
		result.append(sizeStoredInPagingFiles);
		result.append(", FreeSpaceInPagingFiles: ");
		result.append(freeSpaceInPagingFiles);
		result.append(", MaxProcessMemorySize: ");
		result.append(maxProcessMemorySize);
		result.append(", Distributed: ");
		result.append(distributed);
		result.append(", MaxProcessesPerUser: ");
		result.append(maxProcessesPerUser);
		result.append(')');
		return result.toString();
	}

} //CIM_OperatingSystemImpl
