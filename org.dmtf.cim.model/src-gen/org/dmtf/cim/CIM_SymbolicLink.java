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
 * A representation of the model object '<em><b>CIM Symbolic Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a special type of LogicalFile that represents a Symbolic Link. This convention is useful for some operating systems that want to represent a single file in multiple places or a single file that is represented via multiple names.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SymbolicLink#getTargetFile <em>Target File</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SymbolicLink()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::FileElements' keys='CSCreationClassName,CSName,FSCreationClassName,FSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SymbolicLink extends CIM_LogicalFile {
	/**
	 * Returns the value of the '<em><b>Target File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target file of the symbolic link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target File</em>' attribute.
	 * @see #setTargetFile(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SymbolicLink_TargetFile()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getTargetFile();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SymbolicLink#getTargetFile <em>Target File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target File</em>' attribute.
	 * @see #getTargetFile()
	 * @generated
	 */
	void setTargetFile(String value);

} // CIM_SymbolicLink
