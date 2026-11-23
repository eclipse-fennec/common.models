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

import org.dmtf.cim.CIM_StorageDefect;
import org.dmtf.cim.CIM_StorageError;
import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Defect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageDefectImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageDefectImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageDefectImpl extends MinimalEObjectImpl.Container implements CIM_StorageDefect {
	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected CIM_StorageExtent extent;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected CIM_StorageError error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageDefectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageDefect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageExtent getExtent() {
		if (extent != null && extent.eIsProxy()) {
			InternalEObject oldExtent = (InternalEObject)extent;
			extent = (CIM_StorageExtent)eResolveProxy(oldExtent);
			if (extent != oldExtent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_STORAGE_DEFECT__EXTENT, oldExtent, extent));
			}
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_StorageExtent basicGetExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtent(CIM_StorageExtent newExtent) {
		CIM_StorageExtent oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_DEFECT__EXTENT, oldExtent, extent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageError getError() {
		if (error != null && error.eIsProxy()) {
			InternalEObject oldError = (InternalEObject)error;
			error = (CIM_StorageError)eResolveProxy(oldError);
			if (error != oldError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_STORAGE_DEFECT__ERROR, oldError, error));
			}
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_StorageError basicGetError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setError(CIM_StorageError newError) {
		CIM_StorageError oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_DEFECT__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_DEFECT__EXTENT:
				if (resolve) return getExtent();
				return basicGetExtent();
			case CimPackage.CIM_STORAGE_DEFECT__ERROR:
				if (resolve) return getError();
				return basicGetError();
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
			case CimPackage.CIM_STORAGE_DEFECT__EXTENT:
				setExtent((CIM_StorageExtent)newValue);
				return;
			case CimPackage.CIM_STORAGE_DEFECT__ERROR:
				setError((CIM_StorageError)newValue);
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
			case CimPackage.CIM_STORAGE_DEFECT__EXTENT:
				setExtent((CIM_StorageExtent)null);
				return;
			case CimPackage.CIM_STORAGE_DEFECT__ERROR:
				setError((CIM_StorageError)null);
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
			case CimPackage.CIM_STORAGE_DEFECT__EXTENT:
				return extent != null;
			case CimPackage.CIM_STORAGE_DEFECT__ERROR:
				return error != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_StorageDefectImpl
