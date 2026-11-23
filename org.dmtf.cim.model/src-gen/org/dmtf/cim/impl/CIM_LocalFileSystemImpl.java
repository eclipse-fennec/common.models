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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_LocalFileSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Local File System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocalFileSystemImpl#getDirectoryServiceUsage <em>Directory Service Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocalFileSystemImpl#getLocalAccessDefinitionRequired <em>Local Access Definition Required</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocalFileSystemImpl#getMultipleDisksSupported <em>Multiple Disks Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocalFileSystemImpl#getPathNameSeparatorString <em>Path Name Separator String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LocalFileSystemImpl extends CIM_FileSystemImpl implements CIM_LocalFileSystem {
	/**
	 * The default value of the '{@link #getDirectoryServiceUsage() <em>Directory Service Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryServiceUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRECTORY_SERVICE_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectoryServiceUsage() <em>Directory Service Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryServiceUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer directoryServiceUsage = DIRECTORY_SERVICE_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalAccessDefinitionRequired() <em>Local Access Definition Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAccessDefinitionRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCAL_ACCESS_DEFINITION_REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalAccessDefinitionRequired() <em>Local Access Definition Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAccessDefinitionRequired()
	 * @generated
	 * @ordered
	 */
	protected Integer localAccessDefinitionRequired = LOCAL_ACCESS_DEFINITION_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleDisksSupported() <em>Multiple Disks Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleDisksSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MULTIPLE_DISKS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipleDisksSupported() <em>Multiple Disks Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleDisksSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer multipleDisksSupported = MULTIPLE_DISKS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathNameSeparatorString() <em>Path Name Separator String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathNameSeparatorString()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_NAME_SEPARATOR_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathNameSeparatorString() <em>Path Name Separator String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathNameSeparatorString()
	 * @generated
	 * @ordered
	 */
	protected String pathNameSeparatorString = PATH_NAME_SEPARATOR_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LocalFileSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LocalFileSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDirectoryServiceUsage() {
		return directoryServiceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectoryServiceUsage(Integer newDirectoryServiceUsage) {
		Integer oldDirectoryServiceUsage = directoryServiceUsage;
		directoryServiceUsage = newDirectoryServiceUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCAL_FILE_SYSTEM__DIRECTORY_SERVICE_USAGE, oldDirectoryServiceUsage, directoryServiceUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocalAccessDefinitionRequired() {
		return localAccessDefinitionRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalAccessDefinitionRequired(Integer newLocalAccessDefinitionRequired) {
		Integer oldLocalAccessDefinitionRequired = localAccessDefinitionRequired;
		localAccessDefinitionRequired = newLocalAccessDefinitionRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCAL_FILE_SYSTEM__LOCAL_ACCESS_DEFINITION_REQUIRED, oldLocalAccessDefinitionRequired, localAccessDefinitionRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMultipleDisksSupported() {
		return multipleDisksSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleDisksSupported(Integer newMultipleDisksSupported) {
		Integer oldMultipleDisksSupported = multipleDisksSupported;
		multipleDisksSupported = newMultipleDisksSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCAL_FILE_SYSTEM__MULTIPLE_DISKS_SUPPORTED, oldMultipleDisksSupported, multipleDisksSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathNameSeparatorString() {
		return pathNameSeparatorString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathNameSeparatorString(String newPathNameSeparatorString) {
		String oldPathNameSeparatorString = pathNameSeparatorString;
		pathNameSeparatorString = newPathNameSeparatorString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCAL_FILE_SYSTEM__PATH_NAME_SEPARATOR_STRING, oldPathNameSeparatorString, pathNameSeparatorString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetFileProperties(String DirectoryName, String Handle, Long NumberOfFiles, EList<String> FileRecs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__DIRECTORY_SERVICE_USAGE:
				return getDirectoryServiceUsage();
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__LOCAL_ACCESS_DEFINITION_REQUIRED:
				return getLocalAccessDefinitionRequired();
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__MULTIPLE_DISKS_SUPPORTED:
				return getMultipleDisksSupported();
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__PATH_NAME_SEPARATOR_STRING:
				return getPathNameSeparatorString();
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
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__DIRECTORY_SERVICE_USAGE:
				setDirectoryServiceUsage((Integer)newValue);
				return;
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__LOCAL_ACCESS_DEFINITION_REQUIRED:
				setLocalAccessDefinitionRequired((Integer)newValue);
				return;
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__MULTIPLE_DISKS_SUPPORTED:
				setMultipleDisksSupported((Integer)newValue);
				return;
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__PATH_NAME_SEPARATOR_STRING:
				setPathNameSeparatorString((String)newValue);
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
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__DIRECTORY_SERVICE_USAGE:
				setDirectoryServiceUsage(DIRECTORY_SERVICE_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__LOCAL_ACCESS_DEFINITION_REQUIRED:
				setLocalAccessDefinitionRequired(LOCAL_ACCESS_DEFINITION_REQUIRED_EDEFAULT);
				return;
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__MULTIPLE_DISKS_SUPPORTED:
				setMultipleDisksSupported(MULTIPLE_DISKS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__PATH_NAME_SEPARATOR_STRING:
				setPathNameSeparatorString(PATH_NAME_SEPARATOR_STRING_EDEFAULT);
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
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__DIRECTORY_SERVICE_USAGE:
				return DIRECTORY_SERVICE_USAGE_EDEFAULT == null ? directoryServiceUsage != null : !DIRECTORY_SERVICE_USAGE_EDEFAULT.equals(directoryServiceUsage);
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__LOCAL_ACCESS_DEFINITION_REQUIRED:
				return LOCAL_ACCESS_DEFINITION_REQUIRED_EDEFAULT == null ? localAccessDefinitionRequired != null : !LOCAL_ACCESS_DEFINITION_REQUIRED_EDEFAULT.equals(localAccessDefinitionRequired);
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__MULTIPLE_DISKS_SUPPORTED:
				return MULTIPLE_DISKS_SUPPORTED_EDEFAULT == null ? multipleDisksSupported != null : !MULTIPLE_DISKS_SUPPORTED_EDEFAULT.equals(multipleDisksSupported);
			case CimPackage.CIM_LOCAL_FILE_SYSTEM__PATH_NAME_SEPARATOR_STRING:
				return PATH_NAME_SEPARATOR_STRING_EDEFAULT == null ? pathNameSeparatorString != null : !PATH_NAME_SEPARATOR_STRING_EDEFAULT.equals(pathNameSeparatorString);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_LOCAL_FILE_SYSTEM___GET_FILE_PROPERTIES__STRING_STRING_LONG_ELIST:
				return GetFileProperties((String)arguments.get(0), (String)arguments.get(1), (Long)arguments.get(2), (EList<String>)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (DirectoryServiceUsage: ");
		result.append(directoryServiceUsage);
		result.append(", LocalAccessDefinitionRequired: ");
		result.append(localAccessDefinitionRequired);
		result.append(", MultipleDisksSupported: ");
		result.append(multipleDisksSupported);
		result.append(", PathNameSeparatorString: ");
		result.append(pathNameSeparatorString);
		result.append(')');
		return result.toString();
	}

} //CIM_LocalFileSystemImpl
