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
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Directory Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DirectorySpecificationImpl#getDirectoryType <em>Directory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DirectorySpecificationImpl#getDirectoryPath <em>Directory Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DirectorySpecificationImpl extends CIM_CheckImpl implements CIM_DirectorySpecification {
	/**
	 * The default value of the '{@link #getDirectoryType() <em>Directory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRECTORY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectoryType() <em>Directory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryType()
	 * @generated
	 * @ordered
	 */
	protected Integer directoryType = DIRECTORY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectoryPath() <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectoryPath() <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryPath()
	 * @generated
	 * @ordered
	 */
	protected String directoryPath = DIRECTORY_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DirectorySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DirectorySpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDirectoryType() {
		return directoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectoryType(Integer newDirectoryType) {
		Integer oldDirectoryType = directoryType;
		directoryType = newDirectoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_TYPE, oldDirectoryType, directoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirectoryPath() {
		return directoryPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectoryPath(String newDirectoryPath) {
		String oldDirectoryPath = directoryPath;
		directoryPath = newDirectoryPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_PATH, oldDirectoryPath, directoryPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_TYPE:
				return getDirectoryType();
			case CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_PATH:
				return getDirectoryPath();
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
			case CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_TYPE:
				setDirectoryType((Integer)newValue);
				return;
			case CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_PATH:
				setDirectoryPath((String)newValue);
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
			case CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_TYPE:
				setDirectoryType(DIRECTORY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_PATH:
				setDirectoryPath(DIRECTORY_PATH_EDEFAULT);
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
			case CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_TYPE:
				return DIRECTORY_TYPE_EDEFAULT == null ? directoryType != null : !DIRECTORY_TYPE_EDEFAULT.equals(directoryType);
			case CimPackage.CIM_DIRECTORY_SPECIFICATION__DIRECTORY_PATH:
				return DIRECTORY_PATH_EDEFAULT == null ? directoryPath != null : !DIRECTORY_PATH_EDEFAULT.equals(directoryPath);
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
		result.append(" (DirectoryType: ");
		result.append(directoryType);
		result.append(", DirectoryPath: ");
		result.append(directoryPath);
		result.append(')');
		return result.toString();
	}

} //CIM_DirectorySpecificationImpl
