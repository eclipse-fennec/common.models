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
 * A representation of the model object '<em><b>CIM Remove Directory Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RemoveDirectoryAction removes directories from the computer system that defines the Action's environment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RemoveDirectoryAction#getMustBeEmpty <em>Must Be Empty</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RemoveDirectoryAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,ActionID'"
 * @generated
 */
@ProviderType
public interface CIM_RemoveDirectoryAction extends CIM_DirectoryAction {
	/**
	 * Returns the value of the '<em><b>Must Be Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean property indicating that the directory must be empty in order to be removed. If this condition is not satisfied, then the Invoke methods return an error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Be Empty</em>' attribute.
	 * @see #setMustBeEmpty(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoveDirectoryAction_MustBeEmpty()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMustBeEmpty();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoveDirectoryAction#getMustBeEmpty <em>Must Be Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Be Empty</em>' attribute.
	 * @see #getMustBeEmpty()
	 * @generated
	 */
	void setMustBeEmpty(Boolean value);

} // CIM_RemoveDirectoryAction
