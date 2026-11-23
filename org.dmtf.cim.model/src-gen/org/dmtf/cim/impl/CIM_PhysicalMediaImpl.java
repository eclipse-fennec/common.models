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

import org.dmtf.cim.CIM_PhysicalMedia;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getMediaDescription <em>Media Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getWriteProtectOn <em>Write Protect On</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getCleanerMedia <em>Cleaner Media</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getMediaSize <em>Media Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getMaxMounts <em>Max Mounts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getMountCount <em>Mount Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getDualSided <em>Dual Sided</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getPhysicalLabels <em>Physical Labels</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getLabelStates <em>Label States</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getLabelFormats <em>Label Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getTimeOfLastMount <em>Time Of Last Mount</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaImpl#getTotalMountTime <em>Total Mount Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalMediaImpl extends CIM_PhysicalComponentImpl implements CIM_PhysicalMedia {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected Integer mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaDescription() <em>Media Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaDescription() <em>Media Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaDescription()
	 * @generated
	 * @ordered
	 */
	protected String mediaDescription = MEDIA_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteProtectOn() <em>Write Protect On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteProtectOn()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WRITE_PROTECT_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteProtectOn() <em>Write Protect On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteProtectOn()
	 * @generated
	 * @ordered
	 */
	protected Boolean writeProtectOn = WRITE_PROTECT_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getCleanerMedia() <em>Cleaner Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleanerMedia()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CLEANER_MEDIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCleanerMedia() <em>Cleaner Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleanerMedia()
	 * @generated
	 * @ordered
	 */
	protected Boolean cleanerMedia = CLEANER_MEDIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaSize() <em>Media Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaSize()
	 * @generated
	 * @ordered
	 */
	protected static final Float MEDIA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaSize() <em>Media Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaSize()
	 * @generated
	 * @ordered
	 */
	protected Float mediaSize = MEDIA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxMounts() <em>Max Mounts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMounts()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_MOUNTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxMounts() <em>Max Mounts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMounts()
	 * @generated
	 * @ordered
	 */
	protected Long maxMounts = MAX_MOUNTS_EDEFAULT;

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
	 * The default value of the '{@link #getDualSided() <em>Dual Sided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDualSided()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DUAL_SIDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDualSided() <em>Dual Sided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDualSided()
	 * @generated
	 * @ordered
	 */
	protected Boolean dualSided = DUAL_SIDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhysicalLabels() <em>Physical Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> physicalLabels;

	/**
	 * The cached value of the '{@link #getLabelStates() <em>Label States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> labelStates;

	/**
	 * The cached value of the '{@link #getLabelFormats() <em>Label Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> labelFormats;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalMedia();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(Long newCapacity) {
		Long oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaType(Integer newMediaType) {
		Integer oldMediaType = mediaType;
		mediaType = newMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_TYPE, oldMediaType, mediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediaDescription() {
		return mediaDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaDescription(String newMediaDescription) {
		String oldMediaDescription = mediaDescription;
		mediaDescription = newMediaDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_DESCRIPTION, oldMediaDescription, mediaDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWriteProtectOn() {
		return writeProtectOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteProtectOn(Boolean newWriteProtectOn) {
		Boolean oldWriteProtectOn = writeProtectOn;
		writeProtectOn = newWriteProtectOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__WRITE_PROTECT_ON, oldWriteProtectOn, writeProtectOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCleanerMedia() {
		return cleanerMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCleanerMedia(Boolean newCleanerMedia) {
		Boolean oldCleanerMedia = cleanerMedia;
		cleanerMedia = newCleanerMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__CLEANER_MEDIA, oldCleanerMedia, cleanerMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getMediaSize() {
		return mediaSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaSize(Float newMediaSize) {
		Float oldMediaSize = mediaSize;
		mediaSize = newMediaSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_SIZE, oldMediaSize, mediaSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxMounts() {
		return maxMounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxMounts(Long newMaxMounts) {
		Long oldMaxMounts = maxMounts;
		maxMounts = newMaxMounts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__MAX_MOUNTS, oldMaxMounts, maxMounts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__MOUNT_COUNT, oldMountCount, mountCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDualSided() {
		return dualSided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDualSided(Boolean newDualSided) {
		Boolean oldDualSided = dualSided;
		dualSided = newDualSided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__DUAL_SIDED, oldDualSided, dualSided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPhysicalLabels() {
		if (physicalLabels == null) {
			physicalLabels = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_MEDIA__PHYSICAL_LABELS);
		}
		return physicalLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLabelStates() {
		if (labelStates == null) {
			labelStates = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_MEDIA__LABEL_STATES);
		}
		return labelStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLabelFormats() {
		if (labelFormats == null) {
			labelFormats = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_MEDIA__LABEL_FORMATS);
		}
		return labelFormats;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__TIME_OF_LAST_MOUNT, oldTimeOfLastMount, timeOfLastMount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA__TOTAL_MOUNT_TIME, oldTotalMountTime, totalMountTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_MEDIA__CAPACITY:
				return getCapacity();
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_TYPE:
				return getMediaType();
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_DESCRIPTION:
				return getMediaDescription();
			case CimPackage.CIM_PHYSICAL_MEDIA__WRITE_PROTECT_ON:
				return getWriteProtectOn();
			case CimPackage.CIM_PHYSICAL_MEDIA__CLEANER_MEDIA:
				return getCleanerMedia();
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_SIZE:
				return getMediaSize();
			case CimPackage.CIM_PHYSICAL_MEDIA__MAX_MOUNTS:
				return getMaxMounts();
			case CimPackage.CIM_PHYSICAL_MEDIA__MOUNT_COUNT:
				return getMountCount();
			case CimPackage.CIM_PHYSICAL_MEDIA__DUAL_SIDED:
				return getDualSided();
			case CimPackage.CIM_PHYSICAL_MEDIA__PHYSICAL_LABELS:
				return getPhysicalLabels();
			case CimPackage.CIM_PHYSICAL_MEDIA__LABEL_STATES:
				return getLabelStates();
			case CimPackage.CIM_PHYSICAL_MEDIA__LABEL_FORMATS:
				return getLabelFormats();
			case CimPackage.CIM_PHYSICAL_MEDIA__TIME_OF_LAST_MOUNT:
				return getTimeOfLastMount();
			case CimPackage.CIM_PHYSICAL_MEDIA__TOTAL_MOUNT_TIME:
				return getTotalMountTime();
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
			case CimPackage.CIM_PHYSICAL_MEDIA__CAPACITY:
				setCapacity((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_TYPE:
				setMediaType((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_DESCRIPTION:
				setMediaDescription((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__WRITE_PROTECT_ON:
				setWriteProtectOn((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__CLEANER_MEDIA:
				setCleanerMedia((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_SIZE:
				setMediaSize((Float)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MAX_MOUNTS:
				setMaxMounts((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MOUNT_COUNT:
				setMountCount((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__DUAL_SIDED:
				setDualSided((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__PHYSICAL_LABELS:
				getPhysicalLabels().clear();
				getPhysicalLabels().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__LABEL_STATES:
				getLabelStates().clear();
				getLabelStates().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__LABEL_FORMATS:
				getLabelFormats().clear();
				getLabelFormats().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__TIME_OF_LAST_MOUNT:
				setTimeOfLastMount((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__TOTAL_MOUNT_TIME:
				setTotalMountTime((Long)newValue);
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
			case CimPackage.CIM_PHYSICAL_MEDIA__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_TYPE:
				setMediaType(MEDIA_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_DESCRIPTION:
				setMediaDescription(MEDIA_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__WRITE_PROTECT_ON:
				setWriteProtectOn(WRITE_PROTECT_ON_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__CLEANER_MEDIA:
				setCleanerMedia(CLEANER_MEDIA_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_SIZE:
				setMediaSize(MEDIA_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MAX_MOUNTS:
				setMaxMounts(MAX_MOUNTS_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__MOUNT_COUNT:
				setMountCount(MOUNT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__DUAL_SIDED:
				setDualSided(DUAL_SIDED_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__PHYSICAL_LABELS:
				getPhysicalLabels().clear();
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__LABEL_STATES:
				getLabelStates().clear();
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__LABEL_FORMATS:
				getLabelFormats().clear();
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__TIME_OF_LAST_MOUNT:
				setTimeOfLastMount(TIME_OF_LAST_MOUNT_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA__TOTAL_MOUNT_TIME:
				setTotalMountTime(TOTAL_MOUNT_TIME_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_MEDIA__CAPACITY:
				return CAPACITY_EDEFAULT == null ? capacity != null : !CAPACITY_EDEFAULT.equals(capacity);
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_TYPE:
				return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_DESCRIPTION:
				return MEDIA_DESCRIPTION_EDEFAULT == null ? mediaDescription != null : !MEDIA_DESCRIPTION_EDEFAULT.equals(mediaDescription);
			case CimPackage.CIM_PHYSICAL_MEDIA__WRITE_PROTECT_ON:
				return WRITE_PROTECT_ON_EDEFAULT == null ? writeProtectOn != null : !WRITE_PROTECT_ON_EDEFAULT.equals(writeProtectOn);
			case CimPackage.CIM_PHYSICAL_MEDIA__CLEANER_MEDIA:
				return CLEANER_MEDIA_EDEFAULT == null ? cleanerMedia != null : !CLEANER_MEDIA_EDEFAULT.equals(cleanerMedia);
			case CimPackage.CIM_PHYSICAL_MEDIA__MEDIA_SIZE:
				return MEDIA_SIZE_EDEFAULT == null ? mediaSize != null : !MEDIA_SIZE_EDEFAULT.equals(mediaSize);
			case CimPackage.CIM_PHYSICAL_MEDIA__MAX_MOUNTS:
				return MAX_MOUNTS_EDEFAULT == null ? maxMounts != null : !MAX_MOUNTS_EDEFAULT.equals(maxMounts);
			case CimPackage.CIM_PHYSICAL_MEDIA__MOUNT_COUNT:
				return MOUNT_COUNT_EDEFAULT == null ? mountCount != null : !MOUNT_COUNT_EDEFAULT.equals(mountCount);
			case CimPackage.CIM_PHYSICAL_MEDIA__DUAL_SIDED:
				return DUAL_SIDED_EDEFAULT == null ? dualSided != null : !DUAL_SIDED_EDEFAULT.equals(dualSided);
			case CimPackage.CIM_PHYSICAL_MEDIA__PHYSICAL_LABELS:
				return physicalLabels != null && !physicalLabels.isEmpty();
			case CimPackage.CIM_PHYSICAL_MEDIA__LABEL_STATES:
				return labelStates != null && !labelStates.isEmpty();
			case CimPackage.CIM_PHYSICAL_MEDIA__LABEL_FORMATS:
				return labelFormats != null && !labelFormats.isEmpty();
			case CimPackage.CIM_PHYSICAL_MEDIA__TIME_OF_LAST_MOUNT:
				return TIME_OF_LAST_MOUNT_EDEFAULT == null ? timeOfLastMount != null : !TIME_OF_LAST_MOUNT_EDEFAULT.equals(timeOfLastMount);
			case CimPackage.CIM_PHYSICAL_MEDIA__TOTAL_MOUNT_TIME:
				return TOTAL_MOUNT_TIME_EDEFAULT == null ? totalMountTime != null : !TOTAL_MOUNT_TIME_EDEFAULT.equals(totalMountTime);
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
		result.append(" (Capacity: ");
		result.append(capacity);
		result.append(", MediaType: ");
		result.append(mediaType);
		result.append(", MediaDescription: ");
		result.append(mediaDescription);
		result.append(", WriteProtectOn: ");
		result.append(writeProtectOn);
		result.append(", CleanerMedia: ");
		result.append(cleanerMedia);
		result.append(", MediaSize: ");
		result.append(mediaSize);
		result.append(", MaxMounts: ");
		result.append(maxMounts);
		result.append(", MountCount: ");
		result.append(mountCount);
		result.append(", DualSided: ");
		result.append(dualSided);
		result.append(", PhysicalLabels: ");
		result.append(physicalLabels);
		result.append(", LabelStates: ");
		result.append(labelStates);
		result.append(", LabelFormats: ");
		result.append(labelFormats);
		result.append(", TimeOfLastMount: ");
		result.append(timeOfLastMount);
		result.append(", TotalMountTime: ");
		result.append(totalMountTime);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalMediaImpl
