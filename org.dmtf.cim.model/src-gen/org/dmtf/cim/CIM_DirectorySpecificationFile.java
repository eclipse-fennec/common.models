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
 * A representation of the model object '<em><b>CIM Directory Specification File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_DirectorySpecificationFile association identifies the directory that contains the file being checked in the CIM_ FileSpecification class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DirectorySpecificationFile#getDirectorySpecification <em>Directory Specification</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DirectorySpecificationFile#getFileSpecification <em>File Specification</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DirectorySpecificationFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='DirectorySpecification,FileSpecification'"
 * @generated
 */
@ProviderType
public interface CIM_DirectorySpecificationFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Directory Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The directory to be checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directory Specification</em>' reference.
	 * @see #setDirectorySpecification(CIM_DirectorySpecification)
	 * @see org.dmtf.cim.CimPackage#getCIM_DirectorySpecificationFile_DirectorySpecification()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DirectorySpecification REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_DirectorySpecification getDirectorySpecification();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DirectorySpecificationFile#getDirectorySpecification <em>Directory Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Specification</em>' reference.
	 * @see #getDirectorySpecification()
	 * @generated
	 */
	void setDirectorySpecification(CIM_DirectorySpecification value);

	/**
	 * Returns the value of the '<em><b>File Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The file to be checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Specification</em>' reference.
	 * @see #setFileSpecification(CIM_FileSpecification)
	 * @see org.dmtf.cim.CimPackage#getCIM_DirectorySpecificationFile_FileSpecification()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileSpecification REF' Key='true'"
	 * @generated
	 */
	CIM_FileSpecification getFileSpecification();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DirectorySpecificationFile#getFileSpecification <em>File Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Specification</em>' reference.
	 * @see #getFileSpecification()
	 * @generated
	 */
	void setFileSpecification(CIM_FileSpecification value);

} // CIM_DirectorySpecificationFile
