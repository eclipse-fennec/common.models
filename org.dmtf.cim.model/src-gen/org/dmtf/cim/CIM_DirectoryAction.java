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
 * A representation of the model object '<em><b>CIM Directory Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DirectoryAction is an abstract class used to manage directories. The creation of directories is handled by CreateDirectoryAction and removal is handled by RemoveDirectoryAction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DirectoryAction#getDirectoryName <em>Directory Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DirectoryAction()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,ActionID'"
 * @generated
 */
@ProviderType
public interface CIM_DirectoryAction extends CIM_Action {
	/**
	 * Returns the value of the '<em><b>Directory Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the directory being managed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directory Name</em>' attribute.
	 * @see #setDirectoryName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DirectoryAction_DirectoryName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='1024'"
	 * @generated
	 */
	String getDirectoryName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DirectoryAction#getDirectoryName <em>Directory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Name</em>' attribute.
	 * @see #getDirectoryName()
	 * @generated
	 */
	void setDirectoryName(String value);

} // CIM_DirectoryAction
