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

import org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SCSI Initiator Target Logical Unit Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInitiatorTargetLogicalUnitPathImpl#getOSDeviceName <em>OS Device Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInitiatorTargetLogicalUnitPathImpl#getAdministrativeWeight <em>Administrative Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInitiatorTargetLogicalUnitPathImpl#getAdministrativeOverride <em>Administrative Override</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInitiatorTargetLogicalUnitPathImpl#getLogicalUnitNumber <em>Logical Unit Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SCSIInitiatorTargetLogicalUnitPathImpl extends CIM_InitiatorTargetLogicalUnitPathImpl implements CIM_SCSIInitiatorTargetLogicalUnitPath {
	/**
	 * The default value of the '{@link #getOSDeviceName() <em>OS Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOSDeviceName() <em>OS Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String osDeviceName = OS_DEVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdministrativeWeight() <em>Administrative Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Long ADMINISTRATIVE_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdministrativeWeight() <em>Administrative Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeWeight()
	 * @generated
	 * @ordered
	 */
	protected Long administrativeWeight = ADMINISTRATIVE_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdministrativeOverride() <em>Administrative Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeOverride()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADMINISTRATIVE_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdministrativeOverride() <em>Administrative Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeOverride()
	 * @generated
	 * @ordered
	 */
	protected Integer administrativeOverride = ADMINISTRATIVE_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalUnitNumber() <em>Logical Unit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalUnitNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOGICAL_UNIT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalUnitNumber() <em>Logical Unit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalUnitNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer logicalUnitNumber = LOGICAL_UNIT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SCSIInitiatorTargetLogicalUnitPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SCSIInitiatorTargetLogicalUnitPath();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOSDeviceName() {
		return osDeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOSDeviceName(String newOSDeviceName) {
		String oldOSDeviceName = osDeviceName;
		osDeviceName = newOSDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__OS_DEVICE_NAME, oldOSDeviceName, osDeviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAdministrativeWeight() {
		return administrativeWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdministrativeWeight(Long newAdministrativeWeight) {
		Long oldAdministrativeWeight = administrativeWeight;
		administrativeWeight = newAdministrativeWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_WEIGHT, oldAdministrativeWeight, administrativeWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAdministrativeOverride() {
		return administrativeOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdministrativeOverride(Integer newAdministrativeOverride) {
		Integer oldAdministrativeOverride = administrativeOverride;
		administrativeOverride = newAdministrativeOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_OVERRIDE, oldAdministrativeOverride, administrativeOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLogicalUnitNumber() {
		return logicalUnitNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalUnitNumber(Integer newLogicalUnitNumber) {
		Integer oldLogicalUnitNumber = logicalUnitNumber;
		logicalUnitNumber = newLogicalUnitNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT_NUMBER, oldLogicalUnitNumber, logicalUnitNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__OS_DEVICE_NAME:
				return getOSDeviceName();
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_WEIGHT:
				return getAdministrativeWeight();
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_OVERRIDE:
				return getAdministrativeOverride();
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT_NUMBER:
				return getLogicalUnitNumber();
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
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__OS_DEVICE_NAME:
				setOSDeviceName((String)newValue);
				return;
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_WEIGHT:
				setAdministrativeWeight((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_OVERRIDE:
				setAdministrativeOverride((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT_NUMBER:
				setLogicalUnitNumber((Integer)newValue);
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
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__OS_DEVICE_NAME:
				setOSDeviceName(OS_DEVICE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_WEIGHT:
				setAdministrativeWeight(ADMINISTRATIVE_WEIGHT_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_OVERRIDE:
				setAdministrativeOverride(ADMINISTRATIVE_OVERRIDE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT_NUMBER:
				setLogicalUnitNumber(LOGICAL_UNIT_NUMBER_EDEFAULT);
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
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__OS_DEVICE_NAME:
				return OS_DEVICE_NAME_EDEFAULT == null ? osDeviceName != null : !OS_DEVICE_NAME_EDEFAULT.equals(osDeviceName);
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_WEIGHT:
				return ADMINISTRATIVE_WEIGHT_EDEFAULT == null ? administrativeWeight != null : !ADMINISTRATIVE_WEIGHT_EDEFAULT.equals(administrativeWeight);
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__ADMINISTRATIVE_OVERRIDE:
				return ADMINISTRATIVE_OVERRIDE_EDEFAULT == null ? administrativeOverride != null : !ADMINISTRATIVE_OVERRIDE_EDEFAULT.equals(administrativeOverride);
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT_NUMBER:
				return LOGICAL_UNIT_NUMBER_EDEFAULT == null ? logicalUnitNumber != null : !LOGICAL_UNIT_NUMBER_EDEFAULT.equals(logicalUnitNumber);
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
		result.append(" (OSDeviceName: ");
		result.append(osDeviceName);
		result.append(", AdministrativeWeight: ");
		result.append(administrativeWeight);
		result.append(", AdministrativeOverride: ");
		result.append(administrativeOverride);
		result.append(", LogicalUnitNumber: ");
		result.append(logicalUnitNumber);
		result.append(')');
		return result.toString();
	}

} //CIM_SCSIInitiatorTargetLogicalUnitPathImpl
