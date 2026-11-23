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

import org.dmtf.cim.CIM_StorageLibrary;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageLibraryImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageLibraryImpl#getOverfilled <em>Overfilled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageLibraryImpl#getAuditNeeded <em>Audit Needed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageLibraryImpl#getAuditInProgress <em>Audit In Progress</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageLibraryImpl#getMaxAuditTime <em>Max Audit Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageLibraryImpl#getAutomated <em>Automated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageLibraryImpl#getRoboticsEnabled <em>Robotics Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageLibraryImpl extends CIM_SystemImpl implements CIM_StorageLibrary {
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
	 * The default value of the '{@link #getOverfilled() <em>Overfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverfilled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OVERFILLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverfilled() <em>Overfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverfilled()
	 * @generated
	 * @ordered
	 */
	protected Boolean overfilled = OVERFILLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuditNeeded() <em>Audit Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUDIT_NEEDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuditNeeded() <em>Audit Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditNeeded()
	 * @generated
	 * @ordered
	 */
	protected Boolean auditNeeded = AUDIT_NEEDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuditInProgress() <em>Audit In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUDIT_IN_PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuditInProgress() <em>Audit In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditInProgress()
	 * @generated
	 * @ordered
	 */
	protected Boolean auditInProgress = AUDIT_IN_PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAuditTime() <em>Max Audit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAuditTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_AUDIT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAuditTime() <em>Max Audit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAuditTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxAuditTime = MAX_AUDIT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomated() <em>Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTOMATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomated() <em>Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomated()
	 * @generated
	 * @ordered
	 */
	protected Boolean automated = AUTOMATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoboticsEnabled() <em>Robotics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoboticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ROBOTICS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoboticsEnabled() <em>Robotics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoboticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean roboticsEnabled = ROBOTICS_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageLibrary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_LIBRARY__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOverfilled() {
		return overfilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverfilled(Boolean newOverfilled) {
		Boolean oldOverfilled = overfilled;
		overfilled = newOverfilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_LIBRARY__OVERFILLED, oldOverfilled, overfilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAuditNeeded() {
		return auditNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditNeeded(Boolean newAuditNeeded) {
		Boolean oldAuditNeeded = auditNeeded;
		auditNeeded = newAuditNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_LIBRARY__AUDIT_NEEDED, oldAuditNeeded, auditNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAuditInProgress() {
		return auditInProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditInProgress(Boolean newAuditInProgress) {
		Boolean oldAuditInProgress = auditInProgress;
		auditInProgress = newAuditInProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_LIBRARY__AUDIT_IN_PROGRESS, oldAuditInProgress, auditInProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxAuditTime() {
		return maxAuditTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAuditTime(Long newMaxAuditTime) {
		Long oldMaxAuditTime = maxAuditTime;
		maxAuditTime = newMaxAuditTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_LIBRARY__MAX_AUDIT_TIME, oldMaxAuditTime, maxAuditTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutomated() {
		return automated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomated(Boolean newAutomated) {
		Boolean oldAutomated = automated;
		automated = newAutomated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_LIBRARY__AUTOMATED, oldAutomated, automated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRoboticsEnabled() {
		return roboticsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoboticsEnabled(Boolean newRoboticsEnabled) {
		Boolean oldRoboticsEnabled = roboticsEnabled;
		roboticsEnabled = newRoboticsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_LIBRARY__ROBOTICS_ENABLED, oldRoboticsEnabled, roboticsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long EnableRobotics(Boolean Enable) {
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
			case CimPackage.CIM_STORAGE_LIBRARY__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_STORAGE_LIBRARY__OVERFILLED:
				return getOverfilled();
			case CimPackage.CIM_STORAGE_LIBRARY__AUDIT_NEEDED:
				return getAuditNeeded();
			case CimPackage.CIM_STORAGE_LIBRARY__AUDIT_IN_PROGRESS:
				return getAuditInProgress();
			case CimPackage.CIM_STORAGE_LIBRARY__MAX_AUDIT_TIME:
				return getMaxAuditTime();
			case CimPackage.CIM_STORAGE_LIBRARY__AUTOMATED:
				return getAutomated();
			case CimPackage.CIM_STORAGE_LIBRARY__ROBOTICS_ENABLED:
				return getRoboticsEnabled();
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
			case CimPackage.CIM_STORAGE_LIBRARY__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__OVERFILLED:
				setOverfilled((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__AUDIT_NEEDED:
				setAuditNeeded((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__AUDIT_IN_PROGRESS:
				setAuditInProgress((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__MAX_AUDIT_TIME:
				setMaxAuditTime((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__AUTOMATED:
				setAutomated((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__ROBOTICS_ENABLED:
				setRoboticsEnabled((Boolean)newValue);
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
			case CimPackage.CIM_STORAGE_LIBRARY__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__OVERFILLED:
				setOverfilled(OVERFILLED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__AUDIT_NEEDED:
				setAuditNeeded(AUDIT_NEEDED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__AUDIT_IN_PROGRESS:
				setAuditInProgress(AUDIT_IN_PROGRESS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__MAX_AUDIT_TIME:
				setMaxAuditTime(MAX_AUDIT_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__AUTOMATED:
				setAutomated(AUTOMATED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY__ROBOTICS_ENABLED:
				setRoboticsEnabled(ROBOTICS_ENABLED_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_LIBRARY__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_STORAGE_LIBRARY__OVERFILLED:
				return OVERFILLED_EDEFAULT == null ? overfilled != null : !OVERFILLED_EDEFAULT.equals(overfilled);
			case CimPackage.CIM_STORAGE_LIBRARY__AUDIT_NEEDED:
				return AUDIT_NEEDED_EDEFAULT == null ? auditNeeded != null : !AUDIT_NEEDED_EDEFAULT.equals(auditNeeded);
			case CimPackage.CIM_STORAGE_LIBRARY__AUDIT_IN_PROGRESS:
				return AUDIT_IN_PROGRESS_EDEFAULT == null ? auditInProgress != null : !AUDIT_IN_PROGRESS_EDEFAULT.equals(auditInProgress);
			case CimPackage.CIM_STORAGE_LIBRARY__MAX_AUDIT_TIME:
				return MAX_AUDIT_TIME_EDEFAULT == null ? maxAuditTime != null : !MAX_AUDIT_TIME_EDEFAULT.equals(maxAuditTime);
			case CimPackage.CIM_STORAGE_LIBRARY__AUTOMATED:
				return AUTOMATED_EDEFAULT == null ? automated != null : !AUTOMATED_EDEFAULT.equals(automated);
			case CimPackage.CIM_STORAGE_LIBRARY__ROBOTICS_ENABLED:
				return ROBOTICS_ENABLED_EDEFAULT == null ? roboticsEnabled != null : !ROBOTICS_ENABLED_EDEFAULT.equals(roboticsEnabled);
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
			case CimPackage.CIM_STORAGE_LIBRARY___ENABLE_ROBOTICS__BOOLEAN:
				return EnableRobotics((Boolean)arguments.get(0));
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
		result.append(", Overfilled: ");
		result.append(overfilled);
		result.append(", AuditNeeded: ");
		result.append(auditNeeded);
		result.append(", AuditInProgress: ");
		result.append(auditInProgress);
		result.append(", MaxAuditTime: ");
		result.append(maxAuditTime);
		result.append(", Automated: ");
		result.append(automated);
		result.append(", RoboticsEnabled: ");
		result.append(roboticsEnabled);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageLibraryImpl
