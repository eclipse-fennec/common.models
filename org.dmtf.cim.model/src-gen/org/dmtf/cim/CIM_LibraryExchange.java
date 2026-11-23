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
 * A representation of the model object '<em><b>CIM Library Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LibraryExchange indicates that two StorageLibraries are connected through their InterLibraryPorts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LibraryExchange#getCurrentlyAccessingPort <em>Currently Accessing Port</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LibraryExchange()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' override.Antecedent='CIM_InterLibraryPort REF' override.Antecedent.Description='The InterLibraryPort of one StorageLibrary.' override.Dependent='CIM_InterLibraryPort REF' override.Dependent.Description='The InterLibraryPort of the connected Library.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LibraryExchange extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Currently Accessing Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating whether the Antecedent (value=1), Dependent (value=2), or neither Library (value=3) currently has access to the Port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currently Accessing Port</em>' attribute.
	 * @see #setCurrentlyAccessingPort(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LibraryExchange_CurrentlyAccessingPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Antecedent\",\"Dependent\",\"Neither\"]'"
	 * @generated
	 */
	Integer getCurrentlyAccessingPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LibraryExchange#getCurrentlyAccessingPort <em>Currently Accessing Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currently Accessing Port</em>' attribute.
	 * @see #getCurrentlyAccessingPort()
	 * @generated
	 */
	void setCurrentlyAccessingPort(Integer value);

} // CIM_LibraryExchange
