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

import org.dmtf.cim.CIM_StorageVolume;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getCUImage <em>CU Image</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getCanDelete <em>Can Delete</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getEmulatedDevice <em>Emulated Device</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getExtentType <em>Extent Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getNumExtentsMigrating <em>Num Extents Migrating</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getRelativePerformanceOrder <em>Relative Performance Order</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getRelativePerformanceOrderSet <em>Relative Performance Order Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getStorageTieringSelection <em>Storage Tiering Selection</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getSubsystemID <em>Subsystem ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageVolumeImpl#getThinlyProvisioned <em>Thinly Provisioned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageVolumeImpl extends CIM_StorageExtentImpl implements CIM_StorageVolume {
	/**
	 * The default value of the '{@link #getCUImage() <em>CU Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUImage()
	 * @generated
	 * @ordered
	 */
	protected static final String CU_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCUImage() <em>CU Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUImage()
	 * @generated
	 * @ordered
	 */
	protected String cuImage = CU_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanDelete() <em>Can Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanDelete()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_DELETE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCanDelete() <em>Can Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanDelete()
	 * @generated
	 * @ordered
	 */
	protected Boolean canDelete = CAN_DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmulatedDevice() <em>Emulated Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmulatedDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String EMULATED_DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmulatedDevice() <em>Emulated Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmulatedDevice()
	 * @generated
	 * @ordered
	 */
	protected String emulatedDevice = EMULATED_DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtentType() <em>Extent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtentType() <em>Extent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentType()
	 * @generated
	 * @ordered
	 */
	protected Integer extentType = EXTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumExtentsMigrating() <em>Num Extents Migrating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumExtentsMigrating()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUM_EXTENTS_MIGRATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumExtentsMigrating() <em>Num Extents Migrating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumExtentsMigrating()
	 * @generated
	 * @ordered
	 */
	protected Long numExtentsMigrating = NUM_EXTENTS_MIGRATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativePerformanceOrder() <em>Relative Performance Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_PERFORMANCE_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrder() <em>Relative Performance Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrder()
	 * @generated
	 * @ordered
	 */
	protected Integer relativePerformanceOrder = RELATIVE_PERFORMANCE_ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrderSet() <em>Relative Performance Order Set</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderSet()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> relativePerformanceOrderSet;

	/**
	 * The default value of the '{@link #getStorageTieringSelection() <em>Storage Tiering Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageTieringSelection()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_TIERING_SELECTION_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getStorageTieringSelection() <em>Storage Tiering Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageTieringSelection()
	 * @generated
	 * @ordered
	 */
	protected Integer storageTieringSelection = STORAGE_TIERING_SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubsystemID() <em>Subsystem ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubsystemID() <em>Subsystem ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemID()
	 * @generated
	 * @ordered
	 */
	protected String subsystemID = SUBSYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinlyProvisioned() <em>Thinly Provisioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinlyProvisioned()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean THINLY_PROVISIONED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getThinlyProvisioned() <em>Thinly Provisioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinlyProvisioned()
	 * @generated
	 * @ordered
	 */
	protected Boolean thinlyProvisioned = THINLY_PROVISIONED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageVolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageVolume();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCUImage() {
		return cuImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCUImage(String newCUImage) {
		String oldCUImage = cuImage;
		cuImage = newCUImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_VOLUME__CU_IMAGE, oldCUImage, cuImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanDelete() {
		return canDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanDelete(Boolean newCanDelete) {
		Boolean oldCanDelete = canDelete;
		canDelete = newCanDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_VOLUME__CAN_DELETE, oldCanDelete, canDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmulatedDevice() {
		return emulatedDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmulatedDevice(String newEmulatedDevice) {
		String oldEmulatedDevice = emulatedDevice;
		emulatedDevice = newEmulatedDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_VOLUME__EMULATED_DEVICE, oldEmulatedDevice, emulatedDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExtentType() {
		return extentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentType(Integer newExtentType) {
		Integer oldExtentType = extentType;
		extentType = newExtentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_VOLUME__EXTENT_TYPE, oldExtentType, extentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumExtentsMigrating() {
		return numExtentsMigrating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumExtentsMigrating(Long newNumExtentsMigrating) {
		Long oldNumExtentsMigrating = numExtentsMigrating;
		numExtentsMigrating = newNumExtentsMigrating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_VOLUME__NUM_EXTENTS_MIGRATING, oldNumExtentsMigrating, numExtentsMigrating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativePerformanceOrder() {
		return relativePerformanceOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePerformanceOrder(Integer newRelativePerformanceOrder) {
		Integer oldRelativePerformanceOrder = relativePerformanceOrder;
		relativePerformanceOrder = newRelativePerformanceOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER, oldRelativePerformanceOrder, relativePerformanceOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRelativePerformanceOrderSet() {
		if (relativePerformanceOrderSet == null) {
			relativePerformanceOrderSet = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER_SET);
		}
		return relativePerformanceOrderSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStorageTieringSelection() {
		return storageTieringSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageTieringSelection(Integer newStorageTieringSelection) {
		Integer oldStorageTieringSelection = storageTieringSelection;
		storageTieringSelection = newStorageTieringSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_VOLUME__STORAGE_TIERING_SELECTION, oldStorageTieringSelection, storageTieringSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubsystemID() {
		return subsystemID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsystemID(String newSubsystemID) {
		String oldSubsystemID = subsystemID;
		subsystemID = newSubsystemID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_VOLUME__SUBSYSTEM_ID, oldSubsystemID, subsystemID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getThinlyProvisioned() {
		return thinlyProvisioned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinlyProvisioned(Boolean newThinlyProvisioned) {
		Boolean oldThinlyProvisioned = thinlyProvisioned;
		thinlyProvisioned = newThinlyProvisioned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_VOLUME__THINLY_PROVISIONED, oldThinlyProvisioned, thinlyProvisioned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_VOLUME__CU_IMAGE:
				return getCUImage();
			case CimPackage.CIM_STORAGE_VOLUME__CAN_DELETE:
				return getCanDelete();
			case CimPackage.CIM_STORAGE_VOLUME__EMULATED_DEVICE:
				return getEmulatedDevice();
			case CimPackage.CIM_STORAGE_VOLUME__EXTENT_TYPE:
				return getExtentType();
			case CimPackage.CIM_STORAGE_VOLUME__NUM_EXTENTS_MIGRATING:
				return getNumExtentsMigrating();
			case CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER:
				return getRelativePerformanceOrder();
			case CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER_SET:
				return getRelativePerformanceOrderSet();
			case CimPackage.CIM_STORAGE_VOLUME__STORAGE_TIERING_SELECTION:
				return getStorageTieringSelection();
			case CimPackage.CIM_STORAGE_VOLUME__SUBSYSTEM_ID:
				return getSubsystemID();
			case CimPackage.CIM_STORAGE_VOLUME__THINLY_PROVISIONED:
				return getThinlyProvisioned();
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
			case CimPackage.CIM_STORAGE_VOLUME__CU_IMAGE:
				setCUImage((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__CAN_DELETE:
				setCanDelete((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__EMULATED_DEVICE:
				setEmulatedDevice((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__EXTENT_TYPE:
				setExtentType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__NUM_EXTENTS_MIGRATING:
				setNumExtentsMigrating((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER:
				setRelativePerformanceOrder((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER_SET:
				getRelativePerformanceOrderSet().clear();
				getRelativePerformanceOrderSet().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__STORAGE_TIERING_SELECTION:
				setStorageTieringSelection((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__SUBSYSTEM_ID:
				setSubsystemID((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__THINLY_PROVISIONED:
				setThinlyProvisioned((Boolean)newValue);
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
			case CimPackage.CIM_STORAGE_VOLUME__CU_IMAGE:
				setCUImage(CU_IMAGE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__CAN_DELETE:
				setCanDelete(CAN_DELETE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__EMULATED_DEVICE:
				setEmulatedDevice(EMULATED_DEVICE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__EXTENT_TYPE:
				setExtentType(EXTENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__NUM_EXTENTS_MIGRATING:
				setNumExtentsMigrating(NUM_EXTENTS_MIGRATING_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER:
				setRelativePerformanceOrder(RELATIVE_PERFORMANCE_ORDER_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER_SET:
				getRelativePerformanceOrderSet().clear();
				return;
			case CimPackage.CIM_STORAGE_VOLUME__STORAGE_TIERING_SELECTION:
				setStorageTieringSelection(STORAGE_TIERING_SELECTION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__SUBSYSTEM_ID:
				setSubsystemID(SUBSYSTEM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_VOLUME__THINLY_PROVISIONED:
				setThinlyProvisioned(THINLY_PROVISIONED_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_VOLUME__CU_IMAGE:
				return CU_IMAGE_EDEFAULT == null ? cuImage != null : !CU_IMAGE_EDEFAULT.equals(cuImage);
			case CimPackage.CIM_STORAGE_VOLUME__CAN_DELETE:
				return CAN_DELETE_EDEFAULT == null ? canDelete != null : !CAN_DELETE_EDEFAULT.equals(canDelete);
			case CimPackage.CIM_STORAGE_VOLUME__EMULATED_DEVICE:
				return EMULATED_DEVICE_EDEFAULT == null ? emulatedDevice != null : !EMULATED_DEVICE_EDEFAULT.equals(emulatedDevice);
			case CimPackage.CIM_STORAGE_VOLUME__EXTENT_TYPE:
				return EXTENT_TYPE_EDEFAULT == null ? extentType != null : !EXTENT_TYPE_EDEFAULT.equals(extentType);
			case CimPackage.CIM_STORAGE_VOLUME__NUM_EXTENTS_MIGRATING:
				return NUM_EXTENTS_MIGRATING_EDEFAULT == null ? numExtentsMigrating != null : !NUM_EXTENTS_MIGRATING_EDEFAULT.equals(numExtentsMigrating);
			case CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER:
				return RELATIVE_PERFORMANCE_ORDER_EDEFAULT == null ? relativePerformanceOrder != null : !RELATIVE_PERFORMANCE_ORDER_EDEFAULT.equals(relativePerformanceOrder);
			case CimPackage.CIM_STORAGE_VOLUME__RELATIVE_PERFORMANCE_ORDER_SET:
				return relativePerformanceOrderSet != null && !relativePerformanceOrderSet.isEmpty();
			case CimPackage.CIM_STORAGE_VOLUME__STORAGE_TIERING_SELECTION:
				return STORAGE_TIERING_SELECTION_EDEFAULT == null ? storageTieringSelection != null : !STORAGE_TIERING_SELECTION_EDEFAULT.equals(storageTieringSelection);
			case CimPackage.CIM_STORAGE_VOLUME__SUBSYSTEM_ID:
				return SUBSYSTEM_ID_EDEFAULT == null ? subsystemID != null : !SUBSYSTEM_ID_EDEFAULT.equals(subsystemID);
			case CimPackage.CIM_STORAGE_VOLUME__THINLY_PROVISIONED:
				return THINLY_PROVISIONED_EDEFAULT == null ? thinlyProvisioned != null : !THINLY_PROVISIONED_EDEFAULT.equals(thinlyProvisioned);
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
		result.append(" (CUImage: ");
		result.append(cuImage);
		result.append(", CanDelete: ");
		result.append(canDelete);
		result.append(", EmulatedDevice: ");
		result.append(emulatedDevice);
		result.append(", ExtentType: ");
		result.append(extentType);
		result.append(", NumExtentsMigrating: ");
		result.append(numExtentsMigrating);
		result.append(", RelativePerformanceOrder: ");
		result.append(relativePerformanceOrder);
		result.append(", RelativePerformanceOrderSet: ");
		result.append(relativePerformanceOrderSet);
		result.append(", StorageTieringSelection: ");
		result.append(storageTieringSelection);
		result.append(", SubsystemID: ");
		result.append(subsystemID);
		result.append(", ThinlyProvisioned: ");
		result.append(thinlyProvisioned);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageVolumeImpl
