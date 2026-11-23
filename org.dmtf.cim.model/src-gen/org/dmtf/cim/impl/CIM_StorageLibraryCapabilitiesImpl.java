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

import org.dmtf.cim.CIM_StorageLibraryCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Library Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageLibraryCapabilitiesImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageLibraryCapabilitiesImpl#getMaxAuditTime <em>Max Audit Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageLibraryCapabilitiesImpl extends CIM_ImplementationCapabilitiesImpl implements CIM_StorageLibraryCapabilities {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageLibraryCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageLibraryCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__CAPABILITIES);
		}
		return capabilities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__MAX_AUDIT_TIME, oldMaxAuditTime, maxAuditTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__MAX_AUDIT_TIME:
				return getMaxAuditTime();
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
			case CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__MAX_AUDIT_TIME:
				setMaxAuditTime((Long)newValue);
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
			case CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__MAX_AUDIT_TIME:
				setMaxAuditTime(MAX_AUDIT_TIME_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES__MAX_AUDIT_TIME:
				return MAX_AUDIT_TIME_EDEFAULT == null ? maxAuditTime != null : !MAX_AUDIT_TIME_EDEFAULT.equals(maxAuditTime);
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
		result.append(" (Capabilities: ");
		result.append(capabilities);
		result.append(", MaxAuditTime: ");
		result.append(maxAuditTime);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageLibraryCapabilitiesImpl
