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

import org.dmtf.cim.CIM_DiskDrive;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Disk Drive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveImpl#getDiskType <em>Disk Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveImpl#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveImpl#getFormFactor <em>Form Factor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveImpl#getInterconnectSpeed <em>Interconnect Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveImpl#getInterconnectType <em>Interconnect Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveImpl#getOtherInterconnectType <em>Other Interconnect Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveImpl#getRPM <em>RPM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiskDriveImpl extends CIM_MediaAccessDeviceImpl implements CIM_DiskDrive {
	/**
	 * The default value of the '{@link #getDiskType() <em>Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskType() <em>Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskType()
	 * @generated
	 * @ordered
	 */
	protected Integer diskType = DISK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENCRYPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected Integer encryption = ENCRYPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormFactor() <em>Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FORM_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormFactor() <em>Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFactor()
	 * @generated
	 * @ordered
	 */
	protected Integer formFactor = FORM_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterconnectSpeed() <em>Interconnect Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long INTERCONNECT_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterconnectSpeed() <em>Interconnect Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long interconnectSpeed = INTERCONNECT_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterconnectType() <em>Interconnect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTERCONNECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterconnectType() <em>Interconnect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectType()
	 * @generated
	 * @ordered
	 */
	protected Integer interconnectType = INTERCONNECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherInterconnectType() <em>Other Interconnect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInterconnectType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_INTERCONNECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherInterconnectType() <em>Other Interconnect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInterconnectType()
	 * @generated
	 * @ordered
	 */
	protected String otherInterconnectType = OTHER_INTERCONNECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRPM() <em>RPM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPM()
	 * @generated
	 * @ordered
	 */
	protected static final Long RPM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRPM() <em>RPM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPM()
	 * @generated
	 * @ordered
	 */
	protected Long rpm = RPM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiskDriveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiskDrive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDiskType() {
		return diskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiskType(Integer newDiskType) {
		Integer oldDiskType = diskType;
		diskType = newDiskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE__DISK_TYPE, oldDiskType, diskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEncryption() {
		return encryption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryption(Integer newEncryption) {
		Integer oldEncryption = encryption;
		encryption = newEncryption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE__ENCRYPTION, oldEncryption, encryption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFormFactor() {
		return formFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormFactor(Integer newFormFactor) {
		Integer oldFormFactor = formFactor;
		formFactor = newFormFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE__FORM_FACTOR, oldFormFactor, formFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInterconnectSpeed() {
		return interconnectSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterconnectSpeed(Long newInterconnectSpeed) {
		Long oldInterconnectSpeed = interconnectSpeed;
		interconnectSpeed = newInterconnectSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE__INTERCONNECT_SPEED, oldInterconnectSpeed, interconnectSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInterconnectType() {
		return interconnectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterconnectType(Integer newInterconnectType) {
		Integer oldInterconnectType = interconnectType;
		interconnectType = newInterconnectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE__INTERCONNECT_TYPE, oldInterconnectType, interconnectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherInterconnectType() {
		return otherInterconnectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherInterconnectType(String newOtherInterconnectType) {
		String oldOtherInterconnectType = otherInterconnectType;
		otherInterconnectType = newOtherInterconnectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE__OTHER_INTERCONNECT_TYPE, oldOtherInterconnectType, otherInterconnectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRPM() {
		return rpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRPM(Long newRPM) {
		Long oldRPM = rpm;
		rpm = newRPM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE__RPM, oldRPM, rpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISK_DRIVE__DISK_TYPE:
				return getDiskType();
			case CimPackage.CIM_DISK_DRIVE__ENCRYPTION:
				return getEncryption();
			case CimPackage.CIM_DISK_DRIVE__FORM_FACTOR:
				return getFormFactor();
			case CimPackage.CIM_DISK_DRIVE__INTERCONNECT_SPEED:
				return getInterconnectSpeed();
			case CimPackage.CIM_DISK_DRIVE__INTERCONNECT_TYPE:
				return getInterconnectType();
			case CimPackage.CIM_DISK_DRIVE__OTHER_INTERCONNECT_TYPE:
				return getOtherInterconnectType();
			case CimPackage.CIM_DISK_DRIVE__RPM:
				return getRPM();
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
			case CimPackage.CIM_DISK_DRIVE__DISK_TYPE:
				setDiskType((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE__ENCRYPTION:
				setEncryption((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE__FORM_FACTOR:
				setFormFactor((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE__INTERCONNECT_SPEED:
				setInterconnectSpeed((Long)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE__INTERCONNECT_TYPE:
				setInterconnectType((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE__OTHER_INTERCONNECT_TYPE:
				setOtherInterconnectType((String)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE__RPM:
				setRPM((Long)newValue);
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
			case CimPackage.CIM_DISK_DRIVE__DISK_TYPE:
				setDiskType(DISK_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE__ENCRYPTION:
				setEncryption(ENCRYPTION_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE__FORM_FACTOR:
				setFormFactor(FORM_FACTOR_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE__INTERCONNECT_SPEED:
				setInterconnectSpeed(INTERCONNECT_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE__INTERCONNECT_TYPE:
				setInterconnectType(INTERCONNECT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE__OTHER_INTERCONNECT_TYPE:
				setOtherInterconnectType(OTHER_INTERCONNECT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE__RPM:
				setRPM(RPM_EDEFAULT);
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
			case CimPackage.CIM_DISK_DRIVE__DISK_TYPE:
				return DISK_TYPE_EDEFAULT == null ? diskType != null : !DISK_TYPE_EDEFAULT.equals(diskType);
			case CimPackage.CIM_DISK_DRIVE__ENCRYPTION:
				return ENCRYPTION_EDEFAULT == null ? encryption != null : !ENCRYPTION_EDEFAULT.equals(encryption);
			case CimPackage.CIM_DISK_DRIVE__FORM_FACTOR:
				return FORM_FACTOR_EDEFAULT == null ? formFactor != null : !FORM_FACTOR_EDEFAULT.equals(formFactor);
			case CimPackage.CIM_DISK_DRIVE__INTERCONNECT_SPEED:
				return INTERCONNECT_SPEED_EDEFAULT == null ? interconnectSpeed != null : !INTERCONNECT_SPEED_EDEFAULT.equals(interconnectSpeed);
			case CimPackage.CIM_DISK_DRIVE__INTERCONNECT_TYPE:
				return INTERCONNECT_TYPE_EDEFAULT == null ? interconnectType != null : !INTERCONNECT_TYPE_EDEFAULT.equals(interconnectType);
			case CimPackage.CIM_DISK_DRIVE__OTHER_INTERCONNECT_TYPE:
				return OTHER_INTERCONNECT_TYPE_EDEFAULT == null ? otherInterconnectType != null : !OTHER_INTERCONNECT_TYPE_EDEFAULT.equals(otherInterconnectType);
			case CimPackage.CIM_DISK_DRIVE__RPM:
				return RPM_EDEFAULT == null ? rpm != null : !RPM_EDEFAULT.equals(rpm);
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
		result.append(" (DiskType: ");
		result.append(diskType);
		result.append(", Encryption: ");
		result.append(encryption);
		result.append(", FormFactor: ");
		result.append(formFactor);
		result.append(", InterconnectSpeed: ");
		result.append(interconnectSpeed);
		result.append(", InterconnectType: ");
		result.append(interconnectType);
		result.append(", OtherInterconnectType: ");
		result.append(otherInterconnectType);
		result.append(", RPM: ");
		result.append(rpm);
		result.append(')');
		return result.toString();
	}

} //CIM_DiskDriveImpl
