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

import org.dmtf.cim.CIM_UnixDirectory;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unix Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixDirectoryImpl#getFileSizeBits <em>File Size Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnixDirectoryImpl extends CIM_DirectoryImpl implements CIM_UnixDirectory {
	/**
	 * The default value of the '{@link #getFileSizeBits() <em>File Size Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSizeBits()
	 * @generated
	 * @ordered
	 */
	protected static final Long FILE_SIZE_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSizeBits() <em>File Size Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSizeBits()
	 * @generated
	 * @ordered
	 */
	protected Long fileSizeBits = FILE_SIZE_BITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnixDirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnixDirectory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFileSizeBits() {
		return fileSizeBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSizeBits(Long newFileSizeBits) {
		Long oldFileSizeBits = fileSizeBits;
		fileSizeBits = newFileSizeBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_DIRECTORY__FILE_SIZE_BITS, oldFileSizeBits, fileSizeBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_DIRECTORY__FILE_SIZE_BITS:
				return getFileSizeBits();
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
			case CimPackage.CIM_UNIX_DIRECTORY__FILE_SIZE_BITS:
				setFileSizeBits((Long)newValue);
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
			case CimPackage.CIM_UNIX_DIRECTORY__FILE_SIZE_BITS:
				setFileSizeBits(FILE_SIZE_BITS_EDEFAULT);
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
			case CimPackage.CIM_UNIX_DIRECTORY__FILE_SIZE_BITS:
				return FILE_SIZE_BITS_EDEFAULT == null ? fileSizeBits != null : !FILE_SIZE_BITS_EDEFAULT.equals(fileSizeBits);
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
		result.append(" (FileSizeBits: ");
		result.append(fileSizeBits);
		result.append(')');
		return result.toString();
	}

} //CIM_UnixDirectoryImpl
