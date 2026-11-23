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

import org.dmtf.cim.CIM_SCSIController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SCSI Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIControllerImpl#getProtectionManagement <em>Protection Management</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIControllerImpl#getMaxDataWidth <em>Max Data Width</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIControllerImpl#getMaxTransferRate <em>Max Transfer Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIControllerImpl#getControllerTimeouts <em>Controller Timeouts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIControllerImpl#getSignalCapabilities <em>Signal Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SCSIControllerImpl extends CIM_ControllerImpl implements CIM_SCSIController {
	/**
	 * The default value of the '{@link #getProtectionManagement() <em>Protection Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionManagement()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTECTION_MANAGEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectionManagement() <em>Protection Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionManagement()
	 * @generated
	 * @ordered
	 */
	protected Integer protectionManagement = PROTECTION_MANAGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDataWidth() <em>Max Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_DATA_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDataWidth() <em>Max Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataWidth()
	 * @generated
	 * @ordered
	 */
	protected Long maxDataWidth = MAX_DATA_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTransferRate() <em>Max Transfer Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTransferRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_TRANSFER_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTransferRate() <em>Max Transfer Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTransferRate()
	 * @generated
	 * @ordered
	 */
	protected Long maxTransferRate = MAX_TRANSFER_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getControllerTimeouts() <em>Controller Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerTimeouts()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONTROLLER_TIMEOUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerTimeouts() <em>Controller Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerTimeouts()
	 * @generated
	 * @ordered
	 */
	protected Long controllerTimeouts = CONTROLLER_TIMEOUTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignalCapabilities() <em>Signal Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> signalCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SCSIControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SCSIController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtectionManagement() {
		return protectionManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtectionManagement(Integer newProtectionManagement) {
		Integer oldProtectionManagement = protectionManagement;
		protectionManagement = newProtectionManagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_CONTROLLER__PROTECTION_MANAGEMENT, oldProtectionManagement, protectionManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxDataWidth() {
		return maxDataWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDataWidth(Long newMaxDataWidth) {
		Long oldMaxDataWidth = maxDataWidth;
		maxDataWidth = newMaxDataWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_CONTROLLER__MAX_DATA_WIDTH, oldMaxDataWidth, maxDataWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxTransferRate() {
		return maxTransferRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTransferRate(Long newMaxTransferRate) {
		Long oldMaxTransferRate = maxTransferRate;
		maxTransferRate = newMaxTransferRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_CONTROLLER__MAX_TRANSFER_RATE, oldMaxTransferRate, maxTransferRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getControllerTimeouts() {
		return controllerTimeouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControllerTimeouts(Long newControllerTimeouts) {
		Long oldControllerTimeouts = controllerTimeouts;
		controllerTimeouts = newControllerTimeouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_CONTROLLER__CONTROLLER_TIMEOUTS, oldControllerTimeouts, controllerTimeouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSignalCapabilities() {
		if (signalCapabilities == null) {
			signalCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SCSI_CONTROLLER__SIGNAL_CAPABILITIES);
		}
		return signalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCSI_CONTROLLER__PROTECTION_MANAGEMENT:
				return getProtectionManagement();
			case CimPackage.CIM_SCSI_CONTROLLER__MAX_DATA_WIDTH:
				return getMaxDataWidth();
			case CimPackage.CIM_SCSI_CONTROLLER__MAX_TRANSFER_RATE:
				return getMaxTransferRate();
			case CimPackage.CIM_SCSI_CONTROLLER__CONTROLLER_TIMEOUTS:
				return getControllerTimeouts();
			case CimPackage.CIM_SCSI_CONTROLLER__SIGNAL_CAPABILITIES:
				return getSignalCapabilities();
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
			case CimPackage.CIM_SCSI_CONTROLLER__PROTECTION_MANAGEMENT:
				setProtectionManagement((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_CONTROLLER__MAX_DATA_WIDTH:
				setMaxDataWidth((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_CONTROLLER__MAX_TRANSFER_RATE:
				setMaxTransferRate((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_CONTROLLER__CONTROLLER_TIMEOUTS:
				setControllerTimeouts((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_CONTROLLER__SIGNAL_CAPABILITIES:
				getSignalCapabilities().clear();
				getSignalCapabilities().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_SCSI_CONTROLLER__PROTECTION_MANAGEMENT:
				setProtectionManagement(PROTECTION_MANAGEMENT_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_CONTROLLER__MAX_DATA_WIDTH:
				setMaxDataWidth(MAX_DATA_WIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_CONTROLLER__MAX_TRANSFER_RATE:
				setMaxTransferRate(MAX_TRANSFER_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_CONTROLLER__CONTROLLER_TIMEOUTS:
				setControllerTimeouts(CONTROLLER_TIMEOUTS_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_CONTROLLER__SIGNAL_CAPABILITIES:
				getSignalCapabilities().clear();
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
			case CimPackage.CIM_SCSI_CONTROLLER__PROTECTION_MANAGEMENT:
				return PROTECTION_MANAGEMENT_EDEFAULT == null ? protectionManagement != null : !PROTECTION_MANAGEMENT_EDEFAULT.equals(protectionManagement);
			case CimPackage.CIM_SCSI_CONTROLLER__MAX_DATA_WIDTH:
				return MAX_DATA_WIDTH_EDEFAULT == null ? maxDataWidth != null : !MAX_DATA_WIDTH_EDEFAULT.equals(maxDataWidth);
			case CimPackage.CIM_SCSI_CONTROLLER__MAX_TRANSFER_RATE:
				return MAX_TRANSFER_RATE_EDEFAULT == null ? maxTransferRate != null : !MAX_TRANSFER_RATE_EDEFAULT.equals(maxTransferRate);
			case CimPackage.CIM_SCSI_CONTROLLER__CONTROLLER_TIMEOUTS:
				return CONTROLLER_TIMEOUTS_EDEFAULT == null ? controllerTimeouts != null : !CONTROLLER_TIMEOUTS_EDEFAULT.equals(controllerTimeouts);
			case CimPackage.CIM_SCSI_CONTROLLER__SIGNAL_CAPABILITIES:
				return signalCapabilities != null && !signalCapabilities.isEmpty();
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
		result.append(" (ProtectionManagement: ");
		result.append(protectionManagement);
		result.append(", MaxDataWidth: ");
		result.append(maxDataWidth);
		result.append(", MaxTransferRate: ");
		result.append(maxTransferRate);
		result.append(", ControllerTimeouts: ");
		result.append(controllerTimeouts);
		result.append(", SignalCapabilities: ");
		result.append(signalCapabilities);
		result.append(')');
		return result.toString();
	}

} //CIM_SCSIControllerImpl
