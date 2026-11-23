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

import org.dmtf.cim.CIM_UnixLocalFileSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unix Local File System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixLocalFileSystemImpl#getFreeInodes <em>Free Inodes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixLocalFileSystemImpl#getTotalInodes <em>Total Inodes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixLocalFileSystemImpl#getFSReservedCapacity <em>FS Reserved Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnixLocalFileSystemImpl extends CIM_LocalFileSystemImpl implements CIM_UnixLocalFileSystem {
	/**
	 * The default value of the '{@link #getFreeInodes() <em>Free Inodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeInodes()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_INODES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreeInodes() <em>Free Inodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeInodes()
	 * @generated
	 * @ordered
	 */
	protected Long freeInodes = FREE_INODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalInodes() <em>Total Inodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalInodes()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_INODES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalInodes() <em>Total Inodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalInodes()
	 * @generated
	 * @ordered
	 */
	protected Long totalInodes = TOTAL_INODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFSReservedCapacity() <em>FS Reserved Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSReservedCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long FS_RESERVED_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFSReservedCapacity() <em>FS Reserved Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSReservedCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long fsReservedCapacity = FS_RESERVED_CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnixLocalFileSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnixLocalFileSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFreeInodes() {
		return freeInodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreeInodes(Long newFreeInodes) {
		Long oldFreeInodes = freeInodes;
		freeInodes = newFreeInodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FREE_INODES, oldFreeInodes, freeInodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalInodes() {
		return totalInodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalInodes(Long newTotalInodes) {
		Long oldTotalInodes = totalInodes;
		totalInodes = newTotalInodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__TOTAL_INODES, oldTotalInodes, totalInodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFSReservedCapacity() {
		return fsReservedCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFSReservedCapacity(Long newFSReservedCapacity) {
		Long oldFSReservedCapacity = fsReservedCapacity;
		fsReservedCapacity = newFSReservedCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FS_RESERVED_CAPACITY, oldFSReservedCapacity, fsReservedCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FREE_INODES:
				return getFreeInodes();
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__TOTAL_INODES:
				return getTotalInodes();
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FS_RESERVED_CAPACITY:
				return getFSReservedCapacity();
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
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FREE_INODES:
				setFreeInodes((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__TOTAL_INODES:
				setTotalInodes((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FS_RESERVED_CAPACITY:
				setFSReservedCapacity((Long)newValue);
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
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FREE_INODES:
				setFreeInodes(FREE_INODES_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__TOTAL_INODES:
				setTotalInodes(TOTAL_INODES_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FS_RESERVED_CAPACITY:
				setFSReservedCapacity(FS_RESERVED_CAPACITY_EDEFAULT);
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
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FREE_INODES:
				return FREE_INODES_EDEFAULT == null ? freeInodes != null : !FREE_INODES_EDEFAULT.equals(freeInodes);
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__TOTAL_INODES:
				return TOTAL_INODES_EDEFAULT == null ? totalInodes != null : !TOTAL_INODES_EDEFAULT.equals(totalInodes);
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM__FS_RESERVED_CAPACITY:
				return FS_RESERVED_CAPACITY_EDEFAULT == null ? fsReservedCapacity != null : !FS_RESERVED_CAPACITY_EDEFAULT.equals(fsReservedCapacity);
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
		result.append(" (FreeInodes: ");
		result.append(freeInodes);
		result.append(", TotalInodes: ");
		result.append(totalInodes);
		result.append(", FSReservedCapacity: ");
		result.append(fsReservedCapacity);
		result.append(')');
		return result.toString();
	}

} //CIM_UnixLocalFileSystemImpl
