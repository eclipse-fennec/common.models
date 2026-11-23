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
 * A representation of the model object '<em><b>CIM Storage Defect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The StorageDefect aggregation collects the StorageErrors for a StorageExtent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageDefect#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageDefect#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageDefect()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' keys='Extent,Error'"
 * @generated
 */
@ProviderType
public interface CIM_StorageDefect extends EObject {
	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Extent reference defines the StorageExtent on which the errors occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(CIM_StorageExtent)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageDefect_Extent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF' Key='true' Aggregate='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_StorageExtent getExtent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageDefect#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(CIM_StorageExtent value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error references the Error object, defining the starting and ending addresses that are 'mapped out' of the Storage Extent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' reference.
	 * @see #setError(CIM_StorageError)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageDefect_Error()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageError REF' Key='true' Weak='true'"
	 * @generated
	 */
	CIM_StorageError getError();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageDefect#getError <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(CIM_StorageError value);

} // CIM_StorageDefect
