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

import org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Disk Partition Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationCapabilitiesImpl#getPartitionStyle <em>Partition Style</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationCapabilitiesImpl#getValidSubPartitionStyles <em>Valid Sub Partition Styles</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationCapabilitiesImpl#getOtherValidSubPartitionStyles <em>Other Valid Sub Partition Styles</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationCapabilitiesImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationCapabilitiesImpl#getMaxNumberOfPartitions <em>Max Number Of Partitions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationCapabilitiesImpl#getMaxCapacity <em>Max Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationCapabilitiesImpl#getOverlapAllowed <em>Overlap Allowed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationCapabilitiesImpl#getPartitionTableSize <em>Partition Table Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiskPartitionConfigurationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_DiskPartitionConfigurationCapabilities {
	/**
	 * The default value of the '{@link #getPartitionStyle() <em>Partition Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionStyle()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARTITION_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionStyle() <em>Partition Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionStyle()
	 * @generated
	 * @ordered
	 */
	protected Integer partitionStyle = PARTITION_STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidSubPartitionStyles() <em>Valid Sub Partition Styles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidSubPartitionStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> validSubPartitionStyles;

	/**
	 * The cached value of the '{@link #getOtherValidSubPartitionStyles() <em>Other Valid Sub Partition Styles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherValidSubPartitionStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherValidSubPartitionStyles;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberOfPartitions() <em>Max Number Of Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfPartitions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_NUMBER_OF_PARTITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberOfPartitions() <em>Max Number Of Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfPartitions()
	 * @generated
	 * @ordered
	 */
	protected Integer maxNumberOfPartitions = MAX_NUMBER_OF_PARTITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCapacity() <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCapacity() <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long maxCapacity = MAX_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverlapAllowed() <em>Overlap Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlapAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OVERLAP_ALLOWED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getOverlapAllowed() <em>Overlap Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlapAllowed()
	 * @generated
	 * @ordered
	 */
	protected Boolean overlapAllowed = OVERLAP_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionTableSize() <em>Partition Table Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionTableSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long PARTITION_TABLE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionTableSize() <em>Partition Table Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionTableSize()
	 * @generated
	 * @ordered
	 */
	protected Long partitionTableSize = PARTITION_TABLE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousActions() <em>Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiskPartitionConfigurationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiskPartitionConfigurationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPartitionStyle() {
		return partitionStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartitionStyle(Integer newPartitionStyle) {
		Integer oldPartitionStyle = partitionStyle;
		partitionStyle = newPartitionStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_STYLE, oldPartitionStyle, partitionStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getValidSubPartitionStyles() {
		if (validSubPartitionStyles == null) {
			validSubPartitionStyles = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VALID_SUB_PARTITION_STYLES);
		}
		return validSubPartitionStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherValidSubPartitionStyles() {
		if (otherValidSubPartitionStyles == null) {
			otherValidSubPartitionStyles = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OTHER_VALID_SUB_PARTITION_STYLES);
		}
		return otherValidSubPartitionStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(Integer newVersion) {
		Integer oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxNumberOfPartitions() {
		return maxNumberOfPartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumberOfPartitions(Integer newMaxNumberOfPartitions) {
		Integer oldMaxNumberOfPartitions = maxNumberOfPartitions;
		maxNumberOfPartitions = newMaxNumberOfPartitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_NUMBER_OF_PARTITIONS, oldMaxNumberOfPartitions, maxNumberOfPartitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCapacity(Long newMaxCapacity) {
		Long oldMaxCapacity = maxCapacity;
		maxCapacity = newMaxCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_CAPACITY, oldMaxCapacity, maxCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOverlapAllowed() {
		return overlapAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverlapAllowed(Boolean newOverlapAllowed) {
		Boolean oldOverlapAllowed = overlapAllowed;
		overlapAllowed = newOverlapAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OVERLAP_ALLOWED, oldOverlapAllowed, overlapAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPartitionTableSize() {
		return partitionTableSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartitionTableSize(Long newPartitionTableSize) {
		Long oldPartitionTableSize = partitionTableSize;
		partitionTableSize = newPartitionTableSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_TABLE_SIZE, oldPartitionTableSize, partitionTableSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousActions() {
		if (supportedSynchronousActions == null) {
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_STYLE:
				return getPartitionStyle();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VALID_SUB_PARTITION_STYLES:
				return getValidSubPartitionStyles();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OTHER_VALID_SUB_PARTITION_STYLES:
				return getOtherValidSubPartitionStyles();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VERSION:
				return getVersion();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_NUMBER_OF_PARTITIONS:
				return getMaxNumberOfPartitions();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_CAPACITY:
				return getMaxCapacity();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OVERLAP_ALLOWED:
				return getOverlapAllowed();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_TABLE_SIZE:
				return getPartitionTableSize();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
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
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_STYLE:
				setPartitionStyle((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VALID_SUB_PARTITION_STYLES:
				getValidSubPartitionStyles().clear();
				getValidSubPartitionStyles().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OTHER_VALID_SUB_PARTITION_STYLES:
				getOtherValidSubPartitionStyles().clear();
				getOtherValidSubPartitionStyles().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VERSION:
				setVersion((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_NUMBER_OF_PARTITIONS:
				setMaxNumberOfPartitions((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_CAPACITY:
				setMaxCapacity((Long)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OVERLAP_ALLOWED:
				setOverlapAllowed((Boolean)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_TABLE_SIZE:
				setPartitionTableSize((Long)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_STYLE:
				setPartitionStyle(PARTITION_STYLE_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VALID_SUB_PARTITION_STYLES:
				getValidSubPartitionStyles().clear();
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OTHER_VALID_SUB_PARTITION_STYLES:
				getOtherValidSubPartitionStyles().clear();
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_NUMBER_OF_PARTITIONS:
				setMaxNumberOfPartitions(MAX_NUMBER_OF_PARTITIONS_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_CAPACITY:
				setMaxCapacity(MAX_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OVERLAP_ALLOWED:
				setOverlapAllowed(OVERLAP_ALLOWED_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_TABLE_SIZE:
				setPartitionTableSize(PARTITION_TABLE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
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
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_STYLE:
				return PARTITION_STYLE_EDEFAULT == null ? partitionStyle != null : !PARTITION_STYLE_EDEFAULT.equals(partitionStyle);
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VALID_SUB_PARTITION_STYLES:
				return validSubPartitionStyles != null && !validSubPartitionStyles.isEmpty();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OTHER_VALID_SUB_PARTITION_STYLES:
				return otherValidSubPartitionStyles != null && !otherValidSubPartitionStyles.isEmpty();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_NUMBER_OF_PARTITIONS:
				return MAX_NUMBER_OF_PARTITIONS_EDEFAULT == null ? maxNumberOfPartitions != null : !MAX_NUMBER_OF_PARTITIONS_EDEFAULT.equals(maxNumberOfPartitions);
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__MAX_CAPACITY:
				return MAX_CAPACITY_EDEFAULT == null ? maxCapacity != null : !MAX_CAPACITY_EDEFAULT.equals(maxCapacity);
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__OVERLAP_ALLOWED:
				return OVERLAP_ALLOWED_EDEFAULT == null ? overlapAllowed != null : !OVERLAP_ALLOWED_EDEFAULT.equals(overlapAllowed);
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__PARTITION_TABLE_SIZE:
				return PARTITION_TABLE_SIZE_EDEFAULT == null ? partitionTableSize != null : !PARTITION_TABLE_SIZE_EDEFAULT.equals(partitionTableSize);
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
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
		result.append(" (PartitionStyle: ");
		result.append(partitionStyle);
		result.append(", ValidSubPartitionStyles: ");
		result.append(validSubPartitionStyles);
		result.append(", OtherValidSubPartitionStyles: ");
		result.append(otherValidSubPartitionStyles);
		result.append(", Version: ");
		result.append(version);
		result.append(", MaxNumberOfPartitions: ");
		result.append(maxNumberOfPartitions);
		result.append(", MaxCapacity: ");
		result.append(maxCapacity);
		result.append(", OverlapAllowed: ");
		result.append(overlapAllowed);
		result.append(", PartitionTableSize: ");
		result.append(partitionTableSize);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(')');
		return result.toString();
	}

} //CIM_DiskPartitionConfigurationCapabilitiesImpl
