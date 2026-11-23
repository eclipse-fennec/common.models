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

import org.dmtf.cim.CIM_VirtualSystemSnapshotServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual System Snapshot Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSnapshotServiceCapabilitiesImpl#getSynchronousMethodsSupported <em>Synchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSnapshotServiceCapabilitiesImpl#getAynchronousMethodsSupported <em>Aynchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSnapshotServiceCapabilitiesImpl#getSnapshotTypesSupported <em>Snapshot Types Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VirtualSystemSnapshotServiceCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_VirtualSystemSnapshotServiceCapabilities {
	/**
	 * The cached value of the '{@link #getSynchronousMethodsSupported() <em>Synchronous Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> synchronousMethodsSupported;

	/**
	 * The cached value of the '{@link #getAynchronousMethodsSupported() <em>Aynchronous Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAynchronousMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> aynchronousMethodsSupported;

	/**
	 * The cached value of the '{@link #getSnapshotTypesSupported() <em>Snapshot Types Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshotTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> snapshotTypesSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualSystemSnapshotServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualSystemSnapshotServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSynchronousMethodsSupported() {
		if (synchronousMethodsSupported == null) {
			synchronousMethodsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED);
		}
		return synchronousMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAynchronousMethodsSupported() {
		if (aynchronousMethodsSupported == null) {
			aynchronousMethodsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__AYNCHRONOUS_METHODS_SUPPORTED);
		}
		return aynchronousMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSnapshotTypesSupported() {
		if (snapshotTypesSupported == null) {
			snapshotTypesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SNAPSHOT_TYPES_SUPPORTED);
		}
		return snapshotTypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				return getSynchronousMethodsSupported();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__AYNCHRONOUS_METHODS_SUPPORTED:
				return getAynchronousMethodsSupported();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SNAPSHOT_TYPES_SUPPORTED:
				return getSnapshotTypesSupported();
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				getSynchronousMethodsSupported().clear();
				getSynchronousMethodsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__AYNCHRONOUS_METHODS_SUPPORTED:
				getAynchronousMethodsSupported().clear();
				getAynchronousMethodsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SNAPSHOT_TYPES_SUPPORTED:
				getSnapshotTypesSupported().clear();
				getSnapshotTypesSupported().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				getSynchronousMethodsSupported().clear();
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__AYNCHRONOUS_METHODS_SUPPORTED:
				getAynchronousMethodsSupported().clear();
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SNAPSHOT_TYPES_SUPPORTED:
				getSnapshotTypesSupported().clear();
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				return synchronousMethodsSupported != null && !synchronousMethodsSupported.isEmpty();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__AYNCHRONOUS_METHODS_SUPPORTED:
				return aynchronousMethodsSupported != null && !aynchronousMethodsSupported.isEmpty();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES__SNAPSHOT_TYPES_SUPPORTED:
				return snapshotTypesSupported != null && !snapshotTypesSupported.isEmpty();
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
		result.append(" (SynchronousMethodsSupported: ");
		result.append(synchronousMethodsSupported);
		result.append(", AynchronousMethodsSupported: ");
		result.append(aynchronousMethodsSupported);
		result.append(", SnapshotTypesSupported: ");
		result.append(snapshotTypesSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_VirtualSystemSnapshotServiceCapabilitiesImpl
