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
 * A representation of the model object '<em><b>CIM Video BIOS Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VideoBIOSFeature represents the capabilities of the low-level software that is used to bring up, configure and use a ComputerSystem's VideoController and Display.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VideoBIOSFeature#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoBIOSFeature#getCharacteristicDescriptions <em>Characteristic Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VideoBIOSFeature()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::BIOS' keys='IdentifyingNumber,ProductName,Vendor,Version,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VideoBIOSFeature extends CIM_SoftwareFeature {
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that specify the features supported by the VideoBIOS. For example, one could indicate support for VESA power management (value=6) or video BIOS shadowing (8). The value, 3, is not valid in the CIM Schema since in DMI it represents that no BIOS Features are supported. In this case, the object should not be instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoBIOSFeature_Characteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Other\",\"Unknown\",\"Undefined\",\"Standard Video BIOS\",\"VESA BIOS Extensions Supported\",\"VESA Power Management Supported\",\"VESA Display Data Channel Supported\",\"Video BIOS Shadowing Allowed\",\"Video BIOS Upgradeable\"]' ArrayType='Indexed' MappingStrings='[\"MIF.DMTF|Video BIOS Characteristic|001.3\"]' ModelCorrespondence='[\"CIM_VideoBIOSFeature.CharacteristicDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Characteristic Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing more detailed explanations for any of the VideoBIOS features indicated in the Characteristics array. Note, each entry of this array is related to the entry in the Characteristics array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoBIOSFeature_CharacteristicDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIF.DMTF|Video BIOS Characteristic|001.4\"]' ModelCorrespondence='[\"CIM_VideoBIOSFeature.Characteristics\"]'"
	 * @generated
	 */
	EList<String> getCharacteristicDescriptions();

} // CIM_VideoBIOSFeature
