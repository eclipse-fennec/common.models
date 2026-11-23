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
 * A representation of the model object '<em><b>CIM BIOS Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class extends the CIM_BIOSAttribute base class definition to provide informational detail for enumeration data types. Enumerations are single-selection lists with a finite set of entities. Example enumerations might include "Power-On Self Test: Enable, Disable" or "Standby Timeout: 15 minutes, 30 minutes, 45 minutes, Never".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BIOSEnumeration#getPossibleValues <em>Possible Values</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSEnumeration#getPossibleValuesDescription <em>Possible Values Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSEnumeration()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::BIOS' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSEnumeration extends CIM_BIOSAttribute {
	/**
	 * Returns the value of the '<em><b>Possible Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings containing possible value definitions for the Attribute. The first element SHOULD not be NULL and there SHOULD be no NULL or empty string elements intermixed with populated array element values. A Value of NULL SHALL indicate an element's value is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible Values</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSEnumeration_PossibleValues()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' ArrayType='indexed' ModelCorrespondence='[\"CIM_BIOSEnumeration.PossibleValuesDescription\"]'"
	 * @generated
	 */
	EList<String> getPossibleValues();

	/**
	 * Returns the value of the '<em><b>Possible Values Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing explanations and details behind the entries in the CIM_BIOSEnumeration.PossibleValues array. Note that each entry of this array is related to the entry in PossibleValues array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible Values Description</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSEnumeration_PossibleValuesDescription()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='indexed' ModelCorrespondence='[\"CIM_BIOSEnumeration.PossibleValues\"]'"
	 * @generated
	 */
	EList<String> getPossibleValuesDescription();

} // CIM_BIOSEnumeration
