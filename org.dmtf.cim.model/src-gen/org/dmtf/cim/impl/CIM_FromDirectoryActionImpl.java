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

import org.dmtf.cim.CIM_DirectoryAction;
import org.dmtf.cim.CIM_FileAction;
import org.dmtf.cim.CIM_FromDirectoryAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM From Directory Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FromDirectoryActionImpl#getSourceDirectory <em>Source Directory</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FromDirectoryActionImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FromDirectoryActionImpl extends MinimalEObjectImpl.Container implements CIM_FromDirectoryAction {
	/**
	 * The cached value of the '{@link #getSourceDirectory() <em>Source Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDirectory()
	 * @generated
	 * @ordered
	 */
	protected CIM_DirectoryAction sourceDirectory;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected CIM_FileAction fileName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FromDirectoryActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FromDirectoryAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DirectoryAction getSourceDirectory() {
		if (sourceDirectory != null && sourceDirectory.eIsProxy()) {
			InternalEObject oldSourceDirectory = (InternalEObject)sourceDirectory;
			sourceDirectory = (CIM_DirectoryAction)eResolveProxy(oldSourceDirectory);
			if (sourceDirectory != oldSourceDirectory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_FROM_DIRECTORY_ACTION__SOURCE_DIRECTORY, oldSourceDirectory, sourceDirectory));
			}
		}
		return sourceDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_DirectoryAction basicGetSourceDirectory() {
		return sourceDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceDirectory(CIM_DirectoryAction newSourceDirectory) {
		CIM_DirectoryAction oldSourceDirectory = sourceDirectory;
		sourceDirectory = newSourceDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FROM_DIRECTORY_ACTION__SOURCE_DIRECTORY, oldSourceDirectory, sourceDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileAction getFileName() {
		if (fileName != null && fileName.eIsProxy()) {
			InternalEObject oldFileName = (InternalEObject)fileName;
			fileName = (CIM_FileAction)eResolveProxy(oldFileName);
			if (fileName != oldFileName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_FROM_DIRECTORY_ACTION__FILE_NAME, oldFileName, fileName));
			}
		}
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_FileAction basicGetFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(CIM_FileAction newFileName) {
		CIM_FileAction oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FROM_DIRECTORY_ACTION__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FROM_DIRECTORY_ACTION__SOURCE_DIRECTORY:
				if (resolve) return getSourceDirectory();
				return basicGetSourceDirectory();
			case CimPackage.CIM_FROM_DIRECTORY_ACTION__FILE_NAME:
				if (resolve) return getFileName();
				return basicGetFileName();
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
			case CimPackage.CIM_FROM_DIRECTORY_ACTION__SOURCE_DIRECTORY:
				setSourceDirectory((CIM_DirectoryAction)newValue);
				return;
			case CimPackage.CIM_FROM_DIRECTORY_ACTION__FILE_NAME:
				setFileName((CIM_FileAction)newValue);
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
			case CimPackage.CIM_FROM_DIRECTORY_ACTION__SOURCE_DIRECTORY:
				setSourceDirectory((CIM_DirectoryAction)null);
				return;
			case CimPackage.CIM_FROM_DIRECTORY_ACTION__FILE_NAME:
				setFileName((CIM_FileAction)null);
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
			case CimPackage.CIM_FROM_DIRECTORY_ACTION__SOURCE_DIRECTORY:
				return sourceDirectory != null;
			case CimPackage.CIM_FROM_DIRECTORY_ACTION__FILE_NAME:
				return fileName != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_FromDirectoryActionImpl
