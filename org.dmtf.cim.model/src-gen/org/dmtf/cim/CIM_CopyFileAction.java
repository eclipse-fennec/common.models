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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Copy File Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CopyFileAction specifies the files to be moved or copied to a new location. The to/from information for the copy is specified using either the ToDirectorySpecification/ FromDirectorySpecification or the ToDirectoryAction/ FromDirectoryAction associations. The first set is used when the source and/or the target are to exist before any Actions are taken. The second set is used when the source and/or target are created as a part of a previous Action (specified using the association, ActionSequence).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CopyFileAction#getSource <em>Source</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CopyFileAction#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CopyFileAction#getDeleteAfterCopy <em>Delete After Copy</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CopyFileAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,ActionID'"
 * @generated
 */
@ProviderType
public interface CIM_CopyFileAction extends CIM_FileAction {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CopyFileAction_Source()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='1024'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CopyFileAction#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The destination directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CopyFileAction_Destination()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='1024'"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CopyFileAction#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Delete After Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the file should be deleted after being copied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete After Copy</em>' attribute.
	 * @see #setDeleteAfterCopy(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CopyFileAction_DeleteAfterCopy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getDeleteAfterCopy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CopyFileAction#getDeleteAfterCopy <em>Delete After Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete After Copy</em>' attribute.
	 * @see #getDeleteAfterCopy()
	 * @generated
	 */
	void setDeleteAfterCopy(Boolean value);

} // CIM_CopyFileAction
