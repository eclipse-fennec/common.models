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
package org.dmtf.cim;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Local Access Available To FS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between ComputerSystem that has local access to a File System.The LocalAccessPoint property is the name used by the File Server to identify the File System. Sometimes referred to as a mount-point, for many Unix-based systems, it will be a qualified full pathname. For Windows systems it could also be the drive letter used for the LogicalDisk that the filesystem is resident on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LocalAccessAvailableToFS#getFileServer <em>File Server</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocalAccessAvailableToFS#getFileSystem <em>File System</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocalAccessAvailableToFS#getLocalAccessPoint <em>Local Access Point</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LocalAccessAvailableToFS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.45.0' UMLPackagePath='CIM::System::FileElements' keys='FileServer,FileSystem'"
 * @generated
 */
@ProviderType
public interface CIM_LocalAccessAvailableToFS extends EObject {
	/**
	 * Returns the value of the '<em><b>File Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Computer System that acts as a File Server and haslocal access to the FileSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Server</em>' reference.
	 * @see #setFileServer(CIM_ComputerSystem)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocalAccessAvailableToFS_FileServer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_ComputerSystem getFileServer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocalAccessAvailableToFS#getFileServer <em>File Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Server</em>' reference.
	 * @see #getFileServer()
	 * @generated
	 */
	void setFileServer(CIM_ComputerSystem value);

	/**
	 * Returns the value of the '<em><b>File System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FileSystem that is made locally accessible to the File Server ComputerSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File System</em>' reference.
	 * @see #setFileSystem(CIM_LocalFileSystem)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocalAccessAvailableToFS_FileSystem()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LocalFileSystem REF' Key='true'"
	 * @generated
	 */
	CIM_LocalFileSystem getFileSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocalAccessAvailableToFS#getFileSystem <em>File System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System</em>' reference.
	 * @see #getFileSystem()
	 * @generated
	 */
	void setFileSystem(CIM_LocalFileSystem value);

	/**
	 * Returns the value of the '<em><b>Local Access Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LocalAccessPoint property specifies a path to the FileSystem that provides a unique name for the FileSystem relative to the ComputerSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Access Point</em>' attribute.
	 * @see #setLocalAccessPoint(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocalAccessAvailableToFS_LocalAccessPoint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getLocalAccessPoint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocalAccessAvailableToFS#getLocalAccessPoint <em>Local Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Access Point</em>' attribute.
	 * @see #getLocalAccessPoint()
	 * @generated
	 */
	void setLocalAccessPoint(String value);

} // CIM_LocalAccessAvailableToFS
