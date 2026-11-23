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

import org.dmtf.cim.CIM_DirectorySpecification;
import org.dmtf.cim.CIM_DirectorySpecificationFile;
import org.dmtf.cim.CIM_FileSpecification;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Directory Specification File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DirectorySpecificationFileImpl#getDirectorySpecification <em>Directory Specification</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DirectorySpecificationFileImpl#getFileSpecification <em>File Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DirectorySpecificationFileImpl extends MinimalEObjectImpl.Container implements CIM_DirectorySpecificationFile {
	/**
	 * The cached value of the '{@link #getDirectorySpecification() <em>Directory Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectorySpecification()
	 * @generated
	 * @ordered
	 */
	protected CIM_DirectorySpecification directorySpecification;

	/**
	 * The cached value of the '{@link #getFileSpecification() <em>File Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSpecification()
	 * @generated
	 * @ordered
	 */
	protected CIM_FileSpecification fileSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DirectorySpecificationFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DirectorySpecificationFile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DirectorySpecification getDirectorySpecification() {
		if (directorySpecification != null && directorySpecification.eIsProxy()) {
			InternalEObject oldDirectorySpecification = (InternalEObject)directorySpecification;
			directorySpecification = (CIM_DirectorySpecification)eResolveProxy(oldDirectorySpecification);
			if (directorySpecification != oldDirectorySpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__DIRECTORY_SPECIFICATION, oldDirectorySpecification, directorySpecification));
			}
		}
		return directorySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_DirectorySpecification basicGetDirectorySpecification() {
		return directorySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectorySpecification(CIM_DirectorySpecification newDirectorySpecification) {
		CIM_DirectorySpecification oldDirectorySpecification = directorySpecification;
		directorySpecification = newDirectorySpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__DIRECTORY_SPECIFICATION, oldDirectorySpecification, directorySpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSpecification getFileSpecification() {
		if (fileSpecification != null && fileSpecification.eIsProxy()) {
			InternalEObject oldFileSpecification = (InternalEObject)fileSpecification;
			fileSpecification = (CIM_FileSpecification)eResolveProxy(oldFileSpecification);
			if (fileSpecification != oldFileSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__FILE_SPECIFICATION, oldFileSpecification, fileSpecification));
			}
		}
		return fileSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_FileSpecification basicGetFileSpecification() {
		return fileSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSpecification(CIM_FileSpecification newFileSpecification) {
		CIM_FileSpecification oldFileSpecification = fileSpecification;
		fileSpecification = newFileSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__FILE_SPECIFICATION, oldFileSpecification, fileSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__DIRECTORY_SPECIFICATION:
				if (resolve) return getDirectorySpecification();
				return basicGetDirectorySpecification();
			case CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__FILE_SPECIFICATION:
				if (resolve) return getFileSpecification();
				return basicGetFileSpecification();
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
			case CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__DIRECTORY_SPECIFICATION:
				setDirectorySpecification((CIM_DirectorySpecification)newValue);
				return;
			case CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__FILE_SPECIFICATION:
				setFileSpecification((CIM_FileSpecification)newValue);
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
			case CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__DIRECTORY_SPECIFICATION:
				setDirectorySpecification((CIM_DirectorySpecification)null);
				return;
			case CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__FILE_SPECIFICATION:
				setFileSpecification((CIM_FileSpecification)null);
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
			case CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__DIRECTORY_SPECIFICATION:
				return directorySpecification != null;
			case CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE__FILE_SPECIFICATION:
				return fileSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_DirectorySpecificationFileImpl
