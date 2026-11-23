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
 * A representation of the model object '<em><b>CIM Unix Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UnixDirectory is a type of File that logically groups UnixFiles 'contained' in it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnixDirectory#getFileSizeBits <em>File Size Bits</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnixDirectory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::Unix' keys='CSCreationClassName,CSName,FSCreationClassName,FSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_UnixDirectory extends CIM_Directory {
	/**
	 * Returns the value of the '<em><b>File Size Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum number of bits needed to represent the maximum size of a Unix file allowed in the specified directory, as a signed integer value. Thus, a value of 32 indicates a maximum size of 2**31 bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Size Bits</em>' attribute.
	 * @see #setFileSizeBits(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixDirectory_FileSizeBits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bits' MinValue='32' MappingStrings='[\"POSIX.TOG|pathconf|_PC_FILESIZEBITS\"]' PUnit='bit'"
	 * @generated
	 */
	Long getFileSizeBits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixDirectory#getFileSizeBits <em>File Size Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size Bits</em>' attribute.
	 * @see #getFileSizeBits()
	 * @generated
	 */
	void setFileSizeBits(Long value);

} // CIM_UnixDirectory
