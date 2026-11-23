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

import org.dmtf.cim.CIM_DeviceSoftware;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Device Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceSoftwareImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceSoftwareImpl#getPurposeDescription <em>Purpose Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceSoftwareImpl#getLoadedOnDevice <em>Loaded On Device</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceSoftwareImpl#getUpgradeableOnDevice <em>Upgradeable On Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DeviceSoftwareImpl extends CIM_DependencyImpl implements CIM_DeviceSoftware {
	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Integer purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurposeDescription() <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurposeDescription() <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeDescription()
	 * @generated
	 * @ordered
	 */
	protected String purposeDescription = PURPOSE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadedOnDevice() <em>Loaded On Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedOnDevice()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOADED_ON_DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadedOnDevice() <em>Loaded On Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedOnDevice()
	 * @generated
	 * @ordered
	 */
	protected Boolean loadedOnDevice = LOADED_ON_DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpgradeableOnDevice() <em>Upgradeable On Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeableOnDevice()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UPGRADEABLE_ON_DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpgradeableOnDevice() <em>Upgradeable On Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeableOnDevice()
	 * @generated
	 * @ordered
	 */
	protected Boolean upgradeableOnDevice = UPGRADEABLE_ON_DEVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DeviceSoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DeviceSoftware();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(Integer newPurpose) {
		Integer oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurposeDescription() {
		return purposeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurposeDescription(String newPurposeDescription) {
		String oldPurposeDescription = purposeDescription;
		purposeDescription = newPurposeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE_DESCRIPTION, oldPurposeDescription, purposeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLoadedOnDevice() {
		return loadedOnDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadedOnDevice(Boolean newLoadedOnDevice) {
		Boolean oldLoadedOnDevice = loadedOnDevice;
		loadedOnDevice = newLoadedOnDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_SOFTWARE__LOADED_ON_DEVICE, oldLoadedOnDevice, loadedOnDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUpgradeableOnDevice() {
		return upgradeableOnDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpgradeableOnDevice(Boolean newUpgradeableOnDevice) {
		Boolean oldUpgradeableOnDevice = upgradeableOnDevice;
		upgradeableOnDevice = newUpgradeableOnDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_SOFTWARE__UPGRADEABLE_ON_DEVICE, oldUpgradeableOnDevice, upgradeableOnDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE:
				return getPurpose();
			case CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE_DESCRIPTION:
				return getPurposeDescription();
			case CimPackage.CIM_DEVICE_SOFTWARE__LOADED_ON_DEVICE:
				return getLoadedOnDevice();
			case CimPackage.CIM_DEVICE_SOFTWARE__UPGRADEABLE_ON_DEVICE:
				return getUpgradeableOnDevice();
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
			case CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE:
				setPurpose((Integer)newValue);
				return;
			case CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE_DESCRIPTION:
				setPurposeDescription((String)newValue);
				return;
			case CimPackage.CIM_DEVICE_SOFTWARE__LOADED_ON_DEVICE:
				setLoadedOnDevice((Boolean)newValue);
				return;
			case CimPackage.CIM_DEVICE_SOFTWARE__UPGRADEABLE_ON_DEVICE:
				setUpgradeableOnDevice((Boolean)newValue);
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
			case CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE_DESCRIPTION:
				setPurposeDescription(PURPOSE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_SOFTWARE__LOADED_ON_DEVICE:
				setLoadedOnDevice(LOADED_ON_DEVICE_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_SOFTWARE__UPGRADEABLE_ON_DEVICE:
				setUpgradeableOnDevice(UPGRADEABLE_ON_DEVICE_EDEFAULT);
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
			case CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case CimPackage.CIM_DEVICE_SOFTWARE__PURPOSE_DESCRIPTION:
				return PURPOSE_DESCRIPTION_EDEFAULT == null ? purposeDescription != null : !PURPOSE_DESCRIPTION_EDEFAULT.equals(purposeDescription);
			case CimPackage.CIM_DEVICE_SOFTWARE__LOADED_ON_DEVICE:
				return LOADED_ON_DEVICE_EDEFAULT == null ? loadedOnDevice != null : !LOADED_ON_DEVICE_EDEFAULT.equals(loadedOnDevice);
			case CimPackage.CIM_DEVICE_SOFTWARE__UPGRADEABLE_ON_DEVICE:
				return UPGRADEABLE_ON_DEVICE_EDEFAULT == null ? upgradeableOnDevice != null : !UPGRADEABLE_ON_DEVICE_EDEFAULT.equals(upgradeableOnDevice);
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
		result.append(" (Purpose: ");
		result.append(purpose);
		result.append(", PurposeDescription: ");
		result.append(purposeDescription);
		result.append(", LoadedOnDevice: ");
		result.append(loadedOnDevice);
		result.append(", UpgradeableOnDevice: ");
		result.append(upgradeableOnDevice);
		result.append(')');
		return result.toString();
	}

} //CIM_DeviceSoftwareImpl
