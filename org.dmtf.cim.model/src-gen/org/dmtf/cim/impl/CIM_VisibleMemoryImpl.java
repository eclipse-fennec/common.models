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

import org.dmtf.cim.CIM_VisibleMemory;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Visible Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VisibleMemoryImpl#getAccessGranularity <em>Access Granularity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VisibleMemoryImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VisibleMemoryImpl#getProcessAffinity <em>Process Affinity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VisibleMemoryImpl extends CIM_MemoryImpl implements CIM_VisibleMemory {
	/**
	 * The default value of the '{@link #getAccessGranularity() <em>Access Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_GRANULARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessGranularity() <em>Access Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessGranularity()
	 * @generated
	 * @ordered
	 */
	protected Integer accessGranularity = ACCESS_GRANULARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected Integer replication = REPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessAffinity() <em>Process Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessAffinity()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_AFFINITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessAffinity() <em>Process Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessAffinity()
	 * @generated
	 * @ordered
	 */
	protected String processAffinity = PROCESS_AFFINITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VisibleMemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VisibleMemory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessGranularity() {
		return accessGranularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessGranularity(Integer newAccessGranularity) {
		Integer oldAccessGranularity = accessGranularity;
		accessGranularity = newAccessGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VISIBLE_MEMORY__ACCESS_GRANULARITY, oldAccessGranularity, accessGranularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReplication() {
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplication(Integer newReplication) {
		Integer oldReplication = replication;
		replication = newReplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VISIBLE_MEMORY__REPLICATION, oldReplication, replication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessAffinity() {
		return processAffinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessAffinity(String newProcessAffinity) {
		String oldProcessAffinity = processAffinity;
		processAffinity = newProcessAffinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VISIBLE_MEMORY__PROCESS_AFFINITY, oldProcessAffinity, processAffinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VISIBLE_MEMORY__ACCESS_GRANULARITY:
				return getAccessGranularity();
			case CimPackage.CIM_VISIBLE_MEMORY__REPLICATION:
				return getReplication();
			case CimPackage.CIM_VISIBLE_MEMORY__PROCESS_AFFINITY:
				return getProcessAffinity();
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
			case CimPackage.CIM_VISIBLE_MEMORY__ACCESS_GRANULARITY:
				setAccessGranularity((Integer)newValue);
				return;
			case CimPackage.CIM_VISIBLE_MEMORY__REPLICATION:
				setReplication((Integer)newValue);
				return;
			case CimPackage.CIM_VISIBLE_MEMORY__PROCESS_AFFINITY:
				setProcessAffinity((String)newValue);
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
			case CimPackage.CIM_VISIBLE_MEMORY__ACCESS_GRANULARITY:
				setAccessGranularity(ACCESS_GRANULARITY_EDEFAULT);
				return;
			case CimPackage.CIM_VISIBLE_MEMORY__REPLICATION:
				setReplication(REPLICATION_EDEFAULT);
				return;
			case CimPackage.CIM_VISIBLE_MEMORY__PROCESS_AFFINITY:
				setProcessAffinity(PROCESS_AFFINITY_EDEFAULT);
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
			case CimPackage.CIM_VISIBLE_MEMORY__ACCESS_GRANULARITY:
				return ACCESS_GRANULARITY_EDEFAULT == null ? accessGranularity != null : !ACCESS_GRANULARITY_EDEFAULT.equals(accessGranularity);
			case CimPackage.CIM_VISIBLE_MEMORY__REPLICATION:
				return REPLICATION_EDEFAULT == null ? replication != null : !REPLICATION_EDEFAULT.equals(replication);
			case CimPackage.CIM_VISIBLE_MEMORY__PROCESS_AFFINITY:
				return PROCESS_AFFINITY_EDEFAULT == null ? processAffinity != null : !PROCESS_AFFINITY_EDEFAULT.equals(processAffinity);
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
		result.append(" (AccessGranularity: ");
		result.append(accessGranularity);
		result.append(", Replication: ");
		result.append(replication);
		result.append(", ProcessAffinity: ");
		result.append(processAffinity);
		result.append(')');
		return result.toString();
	}

} //CIM_VisibleMemoryImpl
