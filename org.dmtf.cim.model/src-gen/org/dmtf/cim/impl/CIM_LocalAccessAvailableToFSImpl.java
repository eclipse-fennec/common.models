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

import org.dmtf.cim.CIM_ComputerSystem;
import org.dmtf.cim.CIM_LocalAccessAvailableToFS;
import org.dmtf.cim.CIM_LocalFileSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Local Access Available To FS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocalAccessAvailableToFSImpl#getFileServer <em>File Server</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocalAccessAvailableToFSImpl#getFileSystem <em>File System</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocalAccessAvailableToFSImpl#getLocalAccessPoint <em>Local Access Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LocalAccessAvailableToFSImpl extends MinimalEObjectImpl.Container implements CIM_LocalAccessAvailableToFS {
	/**
	 * The cached value of the '{@link #getFileServer() <em>File Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileServer()
	 * @generated
	 * @ordered
	 */
	protected CIM_ComputerSystem fileServer;

	/**
	 * The cached value of the '{@link #getFileSystem() <em>File System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystem()
	 * @generated
	 * @ordered
	 */
	protected CIM_LocalFileSystem fileSystem;

	/**
	 * The default value of the '{@link #getLocalAccessPoint() <em>Local Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAccessPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ACCESS_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalAccessPoint() <em>Local Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAccessPoint()
	 * @generated
	 * @ordered
	 */
	protected String localAccessPoint = LOCAL_ACCESS_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LocalAccessAvailableToFSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LocalAccessAvailableToFS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystem getFileServer() {
		if (fileServer != null && fileServer.eIsProxy()) {
			InternalEObject oldFileServer = (InternalEObject)fileServer;
			fileServer = (CIM_ComputerSystem)eResolveProxy(oldFileServer);
			if (fileServer != oldFileServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SERVER, oldFileServer, fileServer));
			}
		}
		return fileServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ComputerSystem basicGetFileServer() {
		return fileServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileServer(CIM_ComputerSystem newFileServer) {
		CIM_ComputerSystem oldFileServer = fileServer;
		fileServer = newFileServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SERVER, oldFileServer, fileServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LocalFileSystem getFileSystem() {
		if (fileSystem != null && fileSystem.eIsProxy()) {
			InternalEObject oldFileSystem = (InternalEObject)fileSystem;
			fileSystem = (CIM_LocalFileSystem)eResolveProxy(oldFileSystem);
			if (fileSystem != oldFileSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SYSTEM, oldFileSystem, fileSystem));
			}
		}
		return fileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_LocalFileSystem basicGetFileSystem() {
		return fileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSystem(CIM_LocalFileSystem newFileSystem) {
		CIM_LocalFileSystem oldFileSystem = fileSystem;
		fileSystem = newFileSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SYSTEM, oldFileSystem, fileSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalAccessPoint() {
		return localAccessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalAccessPoint(String newLocalAccessPoint) {
		String oldLocalAccessPoint = localAccessPoint;
		localAccessPoint = newLocalAccessPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__LOCAL_ACCESS_POINT, oldLocalAccessPoint, localAccessPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SERVER:
				if (resolve) return getFileServer();
				return basicGetFileServer();
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SYSTEM:
				if (resolve) return getFileSystem();
				return basicGetFileSystem();
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__LOCAL_ACCESS_POINT:
				return getLocalAccessPoint();
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
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SERVER:
				setFileServer((CIM_ComputerSystem)newValue);
				return;
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SYSTEM:
				setFileSystem((CIM_LocalFileSystem)newValue);
				return;
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__LOCAL_ACCESS_POINT:
				setLocalAccessPoint((String)newValue);
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
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SERVER:
				setFileServer((CIM_ComputerSystem)null);
				return;
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SYSTEM:
				setFileSystem((CIM_LocalFileSystem)null);
				return;
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__LOCAL_ACCESS_POINT:
				setLocalAccessPoint(LOCAL_ACCESS_POINT_EDEFAULT);
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
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SERVER:
				return fileServer != null;
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__FILE_SYSTEM:
				return fileSystem != null;
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS__LOCAL_ACCESS_POINT:
				return LOCAL_ACCESS_POINT_EDEFAULT == null ? localAccessPoint != null : !LOCAL_ACCESS_POINT_EDEFAULT.equals(localAccessPoint);
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
		result.append(" (LocalAccessPoint: ");
		result.append(localAccessPoint);
		result.append(')');
		return result.toString();
	}

} //CIM_LocalAccessAvailableToFSImpl
