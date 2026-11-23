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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Storage Library Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities of Storage Library systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageLibraryCapabilities#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageLibraryCapabilities#getMaxAuditTime <em>Max Audit Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibraryCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageLib' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageLibraryCapabilities extends CIM_ImplementationCapabilities {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities of the Storage Library. For example, whether it can perform automatic cleaning of the MediaAccessDevices contained in it (value=2) or that Front Panel is lockable (value=4).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibraryCapabilities_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Automatic Cleaning\",\"Manual Operation\",\"Front Panel Lockable\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Max Audit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum time in seconds that it takes for the Media Library to perform a complete audit of each StorageMedia Location, to determine the absence or presence of a Physical Media. If automated support is not provided, then this property's value is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Audit Time</em>' attribute.
	 * @see #setMaxAuditTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibraryCapabilities_MaxAuditTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getMaxAuditTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageLibraryCapabilities#getMaxAuditTime <em>Max Audit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Audit Time</em>' attribute.
	 * @see #getMaxAuditTime()
	 * @generated
	 */
	void setMaxAuditTime(Long value);

} // CIM_StorageLibraryCapabilities
