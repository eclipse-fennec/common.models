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
 * A representation of the model object '<em><b>CIM To Directory Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ToDirectoryAction association identifies the target directory for a FileAction. When this association is used, the assumption is that the target directory was created by a previous Action. This association cannot co-exist with a ToDirectorySpecification association, since a FileAction can only involve a single target directory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ToDirectoryAction#getDestinationDirectory <em>Destination Directory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ToDirectoryAction#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ToDirectoryAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='DestinationDirectory,FileName'"
 * @generated
 */
@ProviderType
public interface CIM_ToDirectoryAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Destination Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The destination directory of the Action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Directory</em>' reference.
	 * @see #setDestinationDirectory(CIM_DirectoryAction)
	 * @see org.dmtf.cim.CimPackage#getCIM_ToDirectoryAction_DestinationDirectory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DirectoryAction REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_DirectoryAction getDestinationDirectory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ToDirectoryAction#getDestinationDirectory <em>Destination Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Directory</em>' reference.
	 * @see #getDestinationDirectory()
	 * @generated
	 */
	void setDestinationDirectory(CIM_DirectoryAction value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Action against the directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' reference.
	 * @see #setFileName(CIM_CopyFileAction)
	 * @see org.dmtf.cim.CimPackage#getCIM_ToDirectoryAction_FileName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_CopyFileAction REF' Key='true'"
	 * @generated
	 */
	CIM_CopyFileAction getFileName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ToDirectoryAction#getFileName <em>File Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' reference.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(CIM_CopyFileAction value);

} // CIM_ToDirectoryAction
