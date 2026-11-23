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

import org.dmtf.cim.CIM_TapeDriveResourceUsage;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Tape Drive Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TapeDriveResourceUsageImpl#getReadSpeed <em>Read Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TapeDriveResourceUsageImpl#getWriteSpeed <em>Write Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TapeDriveResourceUsageImpl extends CIM_StatisticalDataImpl implements CIM_TapeDriveResourceUsage {
	/**
	 * The default value of the '{@link #getReadSpeed() <em>Read Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Float READ_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadSpeed() <em>Read Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadSpeed()
	 * @generated
	 * @ordered
	 */
	protected Float readSpeed = READ_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteSpeed() <em>Write Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Float WRITE_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteSpeed() <em>Write Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteSpeed()
	 * @generated
	 * @ordered
	 */
	protected Float writeSpeed = WRITE_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TapeDriveResourceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TapeDriveResourceUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getReadSpeed() {
		return readSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadSpeed(Float newReadSpeed) {
		Float oldReadSpeed = readSpeed;
		readSpeed = newReadSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__READ_SPEED, oldReadSpeed, readSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWriteSpeed() {
		return writeSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteSpeed(Float newWriteSpeed) {
		Float oldWriteSpeed = writeSpeed;
		writeSpeed = newWriteSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__WRITE_SPEED, oldWriteSpeed, writeSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__READ_SPEED:
				return getReadSpeed();
			case CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__WRITE_SPEED:
				return getWriteSpeed();
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
			case CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__READ_SPEED:
				setReadSpeed((Float)newValue);
				return;
			case CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__WRITE_SPEED:
				setWriteSpeed((Float)newValue);
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
			case CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__READ_SPEED:
				setReadSpeed(READ_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__WRITE_SPEED:
				setWriteSpeed(WRITE_SPEED_EDEFAULT);
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
			case CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__READ_SPEED:
				return READ_SPEED_EDEFAULT == null ? readSpeed != null : !READ_SPEED_EDEFAULT.equals(readSpeed);
			case CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE__WRITE_SPEED:
				return WRITE_SPEED_EDEFAULT == null ? writeSpeed != null : !WRITE_SPEED_EDEFAULT.equals(writeSpeed);
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
		result.append(" (ReadSpeed: ");
		result.append(readSpeed);
		result.append(", WriteSpeed: ");
		result.append(writeSpeed);
		result.append(')');
		return result.toString();
	}

} //CIM_TapeDriveResourceUsageImpl
