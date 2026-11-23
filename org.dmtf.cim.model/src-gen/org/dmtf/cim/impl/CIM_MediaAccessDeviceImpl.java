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

import org.dmtf.cim.CIM_MediaAccessDevice;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Media Access Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getErrorMethodology <em>Error Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getCompressionMethod <em>Compression Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getNumberOfMediaSupported <em>Number Of Media Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getMaxMediaSize <em>Max Media Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getDefaultBlockSize <em>Default Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getMaxBlockSize <em>Max Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getMinBlockSize <em>Min Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getNeedsCleaning <em>Needs Cleaning</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getMediaIsLocked <em>Media Is Locked</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getLastCleaned <em>Last Cleaned</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getMaxAccessTime <em>Max Access Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getUncompressedDataRate <em>Uncompressed Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getLoadTime <em>Load Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getUnloadTime <em>Unload Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getMountCount <em>Mount Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getTimeOfLastMount <em>Time Of Last Mount</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getTotalMountTime <em>Total Mount Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getUnitsDescription <em>Units Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getMaxUnitsBeforeCleaning <em>Max Units Before Cleaning</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaAccessDeviceImpl#getUnitsUsed <em>Units Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MediaAccessDeviceImpl extends CIM_LogicalDeviceImpl implements CIM_MediaAccessDevice {
	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The default value of the '{@link #getErrorMethodology() <em>Error Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMethodology()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_METHODOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorMethodology() <em>Error Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMethodology()
	 * @generated
	 * @ordered
	 */
	protected String errorMethodology = ERROR_METHODOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressionMethod() <em>Compression Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionMethod() <em>Compression Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionMethod()
	 * @generated
	 * @ordered
	 */
	protected String compressionMethod = COMPRESSION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfMediaSupported() <em>Number Of Media Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMediaSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_MEDIA_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfMediaSupported() <em>Number Of Media Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMediaSupported()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfMediaSupported = NUMBER_OF_MEDIA_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxMediaSize() <em>Max Media Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMediaSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_MEDIA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxMediaSize() <em>Max Media Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMediaSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxMediaSize = MAX_MEDIA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultBlockSize() <em>Default Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFAULT_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultBlockSize() <em>Default Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long defaultBlockSize = DEFAULT_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBlockSize() <em>Max Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxBlockSize() <em>Max Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxBlockSize = MAX_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinBlockSize() <em>Min Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinBlockSize() <em>Min Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long minBlockSize = MIN_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeedsCleaning() <em>Needs Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsCleaning()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEEDS_CLEANING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeedsCleaning() <em>Needs Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsCleaning()
	 * @generated
	 * @ordered
	 */
	protected Boolean needsCleaning = NEEDS_CLEANING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaIsLocked() <em>Media Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaIsLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MEDIA_IS_LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaIsLocked() <em>Media Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaIsLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean mediaIsLocked = MEDIA_IS_LOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECURITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Integer security = SECURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastCleaned() <em>Last Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCleaned()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_CLEANED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastCleaned() <em>Last Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCleaned()
	 * @generated
	 * @ordered
	 */
	protected String lastCleaned = LAST_CLEANED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAccessTime() <em>Max Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAccessTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_ACCESS_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAccessTime() <em>Max Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAccessTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxAccessTime = MAX_ACCESS_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUncompressedDataRate() <em>Uncompressed Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncompressedDataRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNCOMPRESSED_DATA_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUncompressedDataRate() <em>Uncompressed Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncompressedDataRate()
	 * @generated
	 * @ordered
	 */
	protected Long uncompressedDataRate = UNCOMPRESSED_DATA_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadTime() <em>Load Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOAD_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadTime() <em>Load Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadTime()
	 * @generated
	 * @ordered
	 */
	protected Long loadTime = LOAD_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnloadTime() <em>Unload Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNLOAD_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnloadTime() <em>Unload Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadTime()
	 * @generated
	 * @ordered
	 */
	protected Long unloadTime = UNLOAD_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMountCount() <em>Mount Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long MOUNT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMountCount() <em>Mount Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountCount()
	 * @generated
	 * @ordered
	 */
	protected Long mountCount = MOUNT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfLastMount() <em>Time Of Last Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastMount()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_LAST_MOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastMount() <em>Time Of Last Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastMount()
	 * @generated
	 * @ordered
	 */
	protected String timeOfLastMount = TIME_OF_LAST_MOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalMountTime() <em>Total Mount Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMountTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_MOUNT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalMountTime() <em>Total Mount Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMountTime()
	 * @generated
	 * @ordered
	 */
	protected Long totalMountTime = TOTAL_MOUNT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsDescription() <em>Units Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsDescription() <em>Units Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsDescription()
	 * @generated
	 * @ordered
	 */
	protected String unitsDescription = UNITS_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxUnitsBeforeCleaning() <em>Max Units Before Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnitsBeforeCleaning()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_UNITS_BEFORE_CLEANING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxUnitsBeforeCleaning() <em>Max Units Before Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnitsBeforeCleaning()
	 * @generated
	 * @ordered
	 */
	protected Long maxUnitsBeforeCleaning = MAX_UNITS_BEFORE_CLEANING_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsUsed() <em>Units Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsUsed()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNITS_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsUsed() <em>Units Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsUsed()
	 * @generated
	 * @ordered
	 */
	protected Long unitsUsed = UNITS_USED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MediaAccessDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MediaAccessDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorMethodology() {
		return errorMethodology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorMethodology(String newErrorMethodology) {
		String oldErrorMethodology = errorMethodology;
		errorMethodology = newErrorMethodology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__ERROR_METHODOLOGY, oldErrorMethodology, errorMethodology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompressionMethod() {
		return compressionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionMethod(String newCompressionMethod) {
		String oldCompressionMethod = compressionMethod;
		compressionMethod = newCompressionMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__COMPRESSION_METHOD, oldCompressionMethod, compressionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfMediaSupported() {
		return numberOfMediaSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfMediaSupported(Long newNumberOfMediaSupported) {
		Long oldNumberOfMediaSupported = numberOfMediaSupported;
		numberOfMediaSupported = newNumberOfMediaSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__NUMBER_OF_MEDIA_SUPPORTED, oldNumberOfMediaSupported, numberOfMediaSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxMediaSize() {
		return maxMediaSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxMediaSize(Long newMaxMediaSize) {
		Long oldMaxMediaSize = maxMediaSize;
		maxMediaSize = newMaxMediaSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_MEDIA_SIZE, oldMaxMediaSize, maxMediaSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDefaultBlockSize() {
		return defaultBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultBlockSize(Long newDefaultBlockSize) {
		Long oldDefaultBlockSize = defaultBlockSize;
		defaultBlockSize = newDefaultBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__DEFAULT_BLOCK_SIZE, oldDefaultBlockSize, defaultBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxBlockSize() {
		return maxBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxBlockSize(Long newMaxBlockSize) {
		Long oldMaxBlockSize = maxBlockSize;
		maxBlockSize = newMaxBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_BLOCK_SIZE, oldMaxBlockSize, maxBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinBlockSize() {
		return minBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinBlockSize(Long newMinBlockSize) {
		Long oldMinBlockSize = minBlockSize;
		minBlockSize = newMinBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__MIN_BLOCK_SIZE, oldMinBlockSize, minBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNeedsCleaning() {
		return needsCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsCleaning(Boolean newNeedsCleaning) {
		Boolean oldNeedsCleaning = needsCleaning;
		needsCleaning = newNeedsCleaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__NEEDS_CLEANING, oldNeedsCleaning, needsCleaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMediaIsLocked() {
		return mediaIsLocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaIsLocked(Boolean newMediaIsLocked) {
		Boolean oldMediaIsLocked = mediaIsLocked;
		mediaIsLocked = newMediaIsLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__MEDIA_IS_LOCKED, oldMediaIsLocked, mediaIsLocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(Integer newSecurity) {
		Integer oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastCleaned() {
		return lastCleaned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastCleaned(String newLastCleaned) {
		String oldLastCleaned = lastCleaned;
		lastCleaned = newLastCleaned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__LAST_CLEANED, oldLastCleaned, lastCleaned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxAccessTime() {
		return maxAccessTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAccessTime(Long newMaxAccessTime) {
		Long oldMaxAccessTime = maxAccessTime;
		maxAccessTime = newMaxAccessTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_ACCESS_TIME, oldMaxAccessTime, maxAccessTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUncompressedDataRate() {
		return uncompressedDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUncompressedDataRate(Long newUncompressedDataRate) {
		Long oldUncompressedDataRate = uncompressedDataRate;
		uncompressedDataRate = newUncompressedDataRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNCOMPRESSED_DATA_RATE, oldUncompressedDataRate, uncompressedDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLoadTime() {
		return loadTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadTime(Long newLoadTime) {
		Long oldLoadTime = loadTime;
		loadTime = newLoadTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__LOAD_TIME, oldLoadTime, loadTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnloadTime() {
		return unloadTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnloadTime(Long newUnloadTime) {
		Long oldUnloadTime = unloadTime;
		unloadTime = newUnloadTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNLOAD_TIME, oldUnloadTime, unloadTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMountCount() {
		return mountCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMountCount(Long newMountCount) {
		Long oldMountCount = mountCount;
		mountCount = newMountCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__MOUNT_COUNT, oldMountCount, mountCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfLastMount() {
		return timeOfLastMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfLastMount(String newTimeOfLastMount) {
		String oldTimeOfLastMount = timeOfLastMount;
		timeOfLastMount = newTimeOfLastMount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__TIME_OF_LAST_MOUNT, oldTimeOfLastMount, timeOfLastMount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalMountTime() {
		return totalMountTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalMountTime(Long newTotalMountTime) {
		Long oldTotalMountTime = totalMountTime;
		totalMountTime = newTotalMountTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__TOTAL_MOUNT_TIME, oldTotalMountTime, totalMountTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnitsDescription() {
		return unitsDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsDescription(String newUnitsDescription) {
		String oldUnitsDescription = unitsDescription;
		unitsDescription = newUnitsDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_DESCRIPTION, oldUnitsDescription, unitsDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxUnitsBeforeCleaning() {
		return maxUnitsBeforeCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxUnitsBeforeCleaning(Long newMaxUnitsBeforeCleaning) {
		Long oldMaxUnitsBeforeCleaning = maxUnitsBeforeCleaning;
		maxUnitsBeforeCleaning = newMaxUnitsBeforeCleaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_UNITS_BEFORE_CLEANING, oldMaxUnitsBeforeCleaning, maxUnitsBeforeCleaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnitsUsed() {
		return unitsUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsUsed(Long newUnitsUsed) {
		Long oldUnitsUsed = unitsUsed;
		unitsUsed = newUnitsUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_USED, oldUnitsUsed, unitsUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long LockMedia(Boolean Lock) {
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
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__ERROR_METHODOLOGY:
				return getErrorMethodology();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__COMPRESSION_METHOD:
				return getCompressionMethod();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__NUMBER_OF_MEDIA_SUPPORTED:
				return getNumberOfMediaSupported();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_MEDIA_SIZE:
				return getMaxMediaSize();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__DEFAULT_BLOCK_SIZE:
				return getDefaultBlockSize();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_BLOCK_SIZE:
				return getMaxBlockSize();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MIN_BLOCK_SIZE:
				return getMinBlockSize();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__NEEDS_CLEANING:
				return getNeedsCleaning();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MEDIA_IS_LOCKED:
				return getMediaIsLocked();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__SECURITY:
				return getSecurity();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__LAST_CLEANED:
				return getLastCleaned();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_ACCESS_TIME:
				return getMaxAccessTime();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNCOMPRESSED_DATA_RATE:
				return getUncompressedDataRate();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__LOAD_TIME:
				return getLoadTime();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNLOAD_TIME:
				return getUnloadTime();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MOUNT_COUNT:
				return getMountCount();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__TIME_OF_LAST_MOUNT:
				return getTimeOfLastMount();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__TOTAL_MOUNT_TIME:
				return getTotalMountTime();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_DESCRIPTION:
				return getUnitsDescription();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_UNITS_BEFORE_CLEANING:
				return getMaxUnitsBeforeCleaning();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_USED:
				return getUnitsUsed();
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
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__ERROR_METHODOLOGY:
				setErrorMethodology((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__COMPRESSION_METHOD:
				setCompressionMethod((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__NUMBER_OF_MEDIA_SUPPORTED:
				setNumberOfMediaSupported((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_MEDIA_SIZE:
				setMaxMediaSize((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__DEFAULT_BLOCK_SIZE:
				setDefaultBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_BLOCK_SIZE:
				setMaxBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MIN_BLOCK_SIZE:
				setMinBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__NEEDS_CLEANING:
				setNeedsCleaning((Boolean)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MEDIA_IS_LOCKED:
				setMediaIsLocked((Boolean)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__SECURITY:
				setSecurity((Integer)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__LAST_CLEANED:
				setLastCleaned((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_ACCESS_TIME:
				setMaxAccessTime((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNCOMPRESSED_DATA_RATE:
				setUncompressedDataRate((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__LOAD_TIME:
				setLoadTime((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNLOAD_TIME:
				setUnloadTime((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MOUNT_COUNT:
				setMountCount((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__TIME_OF_LAST_MOUNT:
				setTimeOfLastMount((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__TOTAL_MOUNT_TIME:
				setTotalMountTime((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_DESCRIPTION:
				setUnitsDescription((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_UNITS_BEFORE_CLEANING:
				setMaxUnitsBeforeCleaning((Long)newValue);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_USED:
				setUnitsUsed((Long)newValue);
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
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__ERROR_METHODOLOGY:
				setErrorMethodology(ERROR_METHODOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__COMPRESSION_METHOD:
				setCompressionMethod(COMPRESSION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__NUMBER_OF_MEDIA_SUPPORTED:
				setNumberOfMediaSupported(NUMBER_OF_MEDIA_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_MEDIA_SIZE:
				setMaxMediaSize(MAX_MEDIA_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__DEFAULT_BLOCK_SIZE:
				setDefaultBlockSize(DEFAULT_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_BLOCK_SIZE:
				setMaxBlockSize(MAX_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MIN_BLOCK_SIZE:
				setMinBlockSize(MIN_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__NEEDS_CLEANING:
				setNeedsCleaning(NEEDS_CLEANING_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MEDIA_IS_LOCKED:
				setMediaIsLocked(MEDIA_IS_LOCKED_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__LAST_CLEANED:
				setLastCleaned(LAST_CLEANED_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_ACCESS_TIME:
				setMaxAccessTime(MAX_ACCESS_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNCOMPRESSED_DATA_RATE:
				setUncompressedDataRate(UNCOMPRESSED_DATA_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__LOAD_TIME:
				setLoadTime(LOAD_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNLOAD_TIME:
				setUnloadTime(UNLOAD_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MOUNT_COUNT:
				setMountCount(MOUNT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__TIME_OF_LAST_MOUNT:
				setTimeOfLastMount(TIME_OF_LAST_MOUNT_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__TOTAL_MOUNT_TIME:
				setTotalMountTime(TOTAL_MOUNT_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_DESCRIPTION:
				setUnitsDescription(UNITS_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_UNITS_BEFORE_CLEANING:
				setMaxUnitsBeforeCleaning(MAX_UNITS_BEFORE_CLEANING_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_USED:
				setUnitsUsed(UNITS_USED_EDEFAULT);
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
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__ERROR_METHODOLOGY:
				return ERROR_METHODOLOGY_EDEFAULT == null ? errorMethodology != null : !ERROR_METHODOLOGY_EDEFAULT.equals(errorMethodology);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__COMPRESSION_METHOD:
				return COMPRESSION_METHOD_EDEFAULT == null ? compressionMethod != null : !COMPRESSION_METHOD_EDEFAULT.equals(compressionMethod);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__NUMBER_OF_MEDIA_SUPPORTED:
				return NUMBER_OF_MEDIA_SUPPORTED_EDEFAULT == null ? numberOfMediaSupported != null : !NUMBER_OF_MEDIA_SUPPORTED_EDEFAULT.equals(numberOfMediaSupported);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_MEDIA_SIZE:
				return MAX_MEDIA_SIZE_EDEFAULT == null ? maxMediaSize != null : !MAX_MEDIA_SIZE_EDEFAULT.equals(maxMediaSize);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__DEFAULT_BLOCK_SIZE:
				return DEFAULT_BLOCK_SIZE_EDEFAULT == null ? defaultBlockSize != null : !DEFAULT_BLOCK_SIZE_EDEFAULT.equals(defaultBlockSize);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_BLOCK_SIZE:
				return MAX_BLOCK_SIZE_EDEFAULT == null ? maxBlockSize != null : !MAX_BLOCK_SIZE_EDEFAULT.equals(maxBlockSize);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MIN_BLOCK_SIZE:
				return MIN_BLOCK_SIZE_EDEFAULT == null ? minBlockSize != null : !MIN_BLOCK_SIZE_EDEFAULT.equals(minBlockSize);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__NEEDS_CLEANING:
				return NEEDS_CLEANING_EDEFAULT == null ? needsCleaning != null : !NEEDS_CLEANING_EDEFAULT.equals(needsCleaning);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MEDIA_IS_LOCKED:
				return MEDIA_IS_LOCKED_EDEFAULT == null ? mediaIsLocked != null : !MEDIA_IS_LOCKED_EDEFAULT.equals(mediaIsLocked);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__LAST_CLEANED:
				return LAST_CLEANED_EDEFAULT == null ? lastCleaned != null : !LAST_CLEANED_EDEFAULT.equals(lastCleaned);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_ACCESS_TIME:
				return MAX_ACCESS_TIME_EDEFAULT == null ? maxAccessTime != null : !MAX_ACCESS_TIME_EDEFAULT.equals(maxAccessTime);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNCOMPRESSED_DATA_RATE:
				return UNCOMPRESSED_DATA_RATE_EDEFAULT == null ? uncompressedDataRate != null : !UNCOMPRESSED_DATA_RATE_EDEFAULT.equals(uncompressedDataRate);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__LOAD_TIME:
				return LOAD_TIME_EDEFAULT == null ? loadTime != null : !LOAD_TIME_EDEFAULT.equals(loadTime);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNLOAD_TIME:
				return UNLOAD_TIME_EDEFAULT == null ? unloadTime != null : !UNLOAD_TIME_EDEFAULT.equals(unloadTime);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MOUNT_COUNT:
				return MOUNT_COUNT_EDEFAULT == null ? mountCount != null : !MOUNT_COUNT_EDEFAULT.equals(mountCount);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__TIME_OF_LAST_MOUNT:
				return TIME_OF_LAST_MOUNT_EDEFAULT == null ? timeOfLastMount != null : !TIME_OF_LAST_MOUNT_EDEFAULT.equals(timeOfLastMount);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__TOTAL_MOUNT_TIME:
				return TOTAL_MOUNT_TIME_EDEFAULT == null ? totalMountTime != null : !TOTAL_MOUNT_TIME_EDEFAULT.equals(totalMountTime);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_DESCRIPTION:
				return UNITS_DESCRIPTION_EDEFAULT == null ? unitsDescription != null : !UNITS_DESCRIPTION_EDEFAULT.equals(unitsDescription);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__MAX_UNITS_BEFORE_CLEANING:
				return MAX_UNITS_BEFORE_CLEANING_EDEFAULT == null ? maxUnitsBeforeCleaning != null : !MAX_UNITS_BEFORE_CLEANING_EDEFAULT.equals(maxUnitsBeforeCleaning);
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE__UNITS_USED:
				return UNITS_USED_EDEFAULT == null ? unitsUsed != null : !UNITS_USED_EDEFAULT.equals(unitsUsed);
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
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE___LOCK_MEDIA__BOOLEAN:
				return LockMedia((Boolean)arguments.get(0));
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
		result.append(" (Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", ErrorMethodology: ");
		result.append(errorMethodology);
		result.append(", CompressionMethod: ");
		result.append(compressionMethod);
		result.append(", NumberOfMediaSupported: ");
		result.append(numberOfMediaSupported);
		result.append(", MaxMediaSize: ");
		result.append(maxMediaSize);
		result.append(", DefaultBlockSize: ");
		result.append(defaultBlockSize);
		result.append(", MaxBlockSize: ");
		result.append(maxBlockSize);
		result.append(", MinBlockSize: ");
		result.append(minBlockSize);
		result.append(", NeedsCleaning: ");
		result.append(needsCleaning);
		result.append(", MediaIsLocked: ");
		result.append(mediaIsLocked);
		result.append(", Security: ");
		result.append(security);
		result.append(", LastCleaned: ");
		result.append(lastCleaned);
		result.append(", MaxAccessTime: ");
		result.append(maxAccessTime);
		result.append(", UncompressedDataRate: ");
		result.append(uncompressedDataRate);
		result.append(", LoadTime: ");
		result.append(loadTime);
		result.append(", UnloadTime: ");
		result.append(unloadTime);
		result.append(", MountCount: ");
		result.append(mountCount);
		result.append(", TimeOfLastMount: ");
		result.append(timeOfLastMount);
		result.append(", TotalMountTime: ");
		result.append(totalMountTime);
		result.append(", UnitsDescription: ");
		result.append(unitsDescription);
		result.append(", MaxUnitsBeforeCleaning: ");
		result.append(maxUnitsBeforeCleaning);
		result.append(", UnitsUsed: ");
		result.append(unitsUsed);
		result.append(')');
		return result.toString();
	}

} //CIM_MediaAccessDeviceImpl
