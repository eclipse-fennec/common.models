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
 * A representation of the model object '<em><b>CIM From Directory Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FromDirectoryAction association identifies the source directory for a FileAction. When this association is used, the assumption is that the source directory was created by a previous Action. This association cannot co-exist with a FromDirectorySpecification association, since a FileAction can only involve a single source directory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FromDirectoryAction#getSourceDirectory <em>Source Directory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FromDirectoryAction#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FromDirectoryAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='SourceDirectory,FileName'"
 * @generated
 */
@ProviderType
public interface CIM_FromDirectoryAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source directory of the Action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Directory</em>' reference.
	 * @see #setSourceDirectory(CIM_DirectoryAction)
	 * @see org.dmtf.cim.CimPackage#getCIM_FromDirectoryAction_SourceDirectory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DirectoryAction REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_DirectoryAction getSourceDirectory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FromDirectoryAction#getSourceDirectory <em>Source Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Directory</em>' reference.
	 * @see #getSourceDirectory()
	 * @generated
	 */
	void setSourceDirectory(CIM_DirectoryAction value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Action against the directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' reference.
	 * @see #setFileName(CIM_FileAction)
	 * @see org.dmtf.cim.CimPackage#getCIM_FromDirectoryAction_FileName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileAction REF' Key='true'"
	 * @generated
	 */
	CIM_FileAction getFileName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FromDirectoryAction#getFileName <em>File Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' reference.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(CIM_FileAction value);

} // CIM_FromDirectoryAction
