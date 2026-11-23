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

import org.dmtf.cim.CIM_Directory;
import org.dmtf.cim.CIM_Export;
import org.dmtf.cim.CIM_LocalFileSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportImpl#getLocalFS <em>Local FS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportImpl#getExportedDirectoryName <em>Exported Directory Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ExportImpl extends MinimalEObjectImpl.Container implements CIM_Export {
	/**
	 * The cached value of the '{@link #getLocalFS() <em>Local FS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFS()
	 * @generated
	 * @ordered
	 */
	protected CIM_LocalFileSystem localFS;

	/**
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected CIM_Directory directory;

	/**
	 * The default value of the '{@link #getExportedDirectoryName() <em>Exported Directory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedDirectoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTED_DIRECTORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExportedDirectoryName() <em>Exported Directory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedDirectoryName()
	 * @generated
	 * @ordered
	 */
	protected String exportedDirectoryName = EXPORTED_DIRECTORY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ExportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Export();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LocalFileSystem getLocalFS() {
		if (localFS != null && localFS.eIsProxy()) {
			InternalEObject oldLocalFS = (InternalEObject)localFS;
			localFS = (CIM_LocalFileSystem)eResolveProxy(oldLocalFS);
			if (localFS != oldLocalFS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_EXPORT__LOCAL_FS, oldLocalFS, localFS));
			}
		}
		return localFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_LocalFileSystem basicGetLocalFS() {
		return localFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalFS(CIM_LocalFileSystem newLocalFS) {
		CIM_LocalFileSystem oldLocalFS = localFS;
		localFS = newLocalFS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORT__LOCAL_FS, oldLocalFS, localFS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Directory getDirectory() {
		if (directory != null && directory.eIsProxy()) {
			InternalEObject oldDirectory = (InternalEObject)directory;
			directory = (CIM_Directory)eResolveProxy(oldDirectory);
			if (directory != oldDirectory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_EXPORT__DIRECTORY, oldDirectory, directory));
			}
		}
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Directory basicGetDirectory() {
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectory(CIM_Directory newDirectory) {
		CIM_Directory oldDirectory = directory;
		directory = newDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORT__DIRECTORY, oldDirectory, directory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExportedDirectoryName() {
		return exportedDirectoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExportedDirectoryName(String newExportedDirectoryName) {
		String oldExportedDirectoryName = exportedDirectoryName;
		exportedDirectoryName = newExportedDirectoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORT__EXPORTED_DIRECTORY_NAME, oldExportedDirectoryName, exportedDirectoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_EXPORT__LOCAL_FS:
				if (resolve) return getLocalFS();
				return basicGetLocalFS();
			case CimPackage.CIM_EXPORT__DIRECTORY:
				if (resolve) return getDirectory();
				return basicGetDirectory();
			case CimPackage.CIM_EXPORT__EXPORTED_DIRECTORY_NAME:
				return getExportedDirectoryName();
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
			case CimPackage.CIM_EXPORT__LOCAL_FS:
				setLocalFS((CIM_LocalFileSystem)newValue);
				return;
			case CimPackage.CIM_EXPORT__DIRECTORY:
				setDirectory((CIM_Directory)newValue);
				return;
			case CimPackage.CIM_EXPORT__EXPORTED_DIRECTORY_NAME:
				setExportedDirectoryName((String)newValue);
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
			case CimPackage.CIM_EXPORT__LOCAL_FS:
				setLocalFS((CIM_LocalFileSystem)null);
				return;
			case CimPackage.CIM_EXPORT__DIRECTORY:
				setDirectory((CIM_Directory)null);
				return;
			case CimPackage.CIM_EXPORT__EXPORTED_DIRECTORY_NAME:
				setExportedDirectoryName(EXPORTED_DIRECTORY_NAME_EDEFAULT);
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
			case CimPackage.CIM_EXPORT__LOCAL_FS:
				return localFS != null;
			case CimPackage.CIM_EXPORT__DIRECTORY:
				return directory != null;
			case CimPackage.CIM_EXPORT__EXPORTED_DIRECTORY_NAME:
				return EXPORTED_DIRECTORY_NAME_EDEFAULT == null ? exportedDirectoryName != null : !EXPORTED_DIRECTORY_NAME_EDEFAULT.equals(exportedDirectoryName);
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
		result.append(" (ExportedDirectoryName: ");
		result.append(exportedDirectoryName);
		result.append(')');
		return result.toString();
	}

} //CIM_ExportImpl
