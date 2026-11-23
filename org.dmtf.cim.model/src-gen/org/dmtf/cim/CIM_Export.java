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
 * A representation of the model object '<em><b>CIM Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a LocalFileSystem and its Directories indicating that the specified Directories are available for mount. When exporting an entire FileSystem, the Directory should reference the topmost directory of the FileSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Export#getLocalFS <em>Local FS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Export#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Export#getExportedDirectoryName <em>Exported Directory Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Export()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::FileElements' keys='LocalFS,Directory'"
 * @generated
 */
@ProviderType
public interface CIM_Export extends EObject {
	/**
	 * Returns the value of the '<em><b>Local FS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LocalFileSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local FS</em>' reference.
	 * @see #setLocalFS(CIM_LocalFileSystem)
	 * @see org.dmtf.cim.CimPackage#getCIM_Export_LocalFS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LocalFileSystem REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_LocalFileSystem getLocalFS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Export#getLocalFS <em>Local FS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local FS</em>' reference.
	 * @see #getLocalFS()
	 * @generated
	 */
	void setLocalFS(CIM_LocalFileSystem value);

	/**
	 * Returns the value of the '<em><b>Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Directory exported for mount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directory</em>' reference.
	 * @see #setDirectory(CIM_Directory)
	 * @see org.dmtf.cim.CimPackage#getCIM_Export_Directory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Directory REF' Key='true'"
	 * @generated
	 */
	CIM_Directory getDirectory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Export#getDirectory <em>Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' reference.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(CIM_Directory value);

	/**
	 * Returns the value of the '<em><b>Exported Directory Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name under which the Directory is exported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exported Directory Name</em>' attribute.
	 * @see #setExportedDirectoryName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Export_ExportedDirectoryName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getExportedDirectoryName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Export#getExportedDirectoryName <em>Exported Directory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported Directory Name</em>' attribute.
	 * @see #getExportedDirectoryName()
	 * @generated
	 */
	void setExportedDirectoryName(String value);

} // CIM_Export
