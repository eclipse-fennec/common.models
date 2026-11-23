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
 * A representation of the model object '<em><b>CIM AGP Software Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AGPSoftwareFeature adds two attributes to SoftwareFeature to represent the capabilities of an AGP device driver. An instance of this class would be associated with the Driver's SoftwareElement using the SoftwareFeatureSoftware Elements relationship. The driver's SoftwareElement is associated with the AGPVideoController via the Device Software relationship.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AGPSoftwareFeature#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPSoftwareFeature#getCharacteristicDescriptions <em>Characteristic Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AGPSoftwareFeature()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::BIOS' keys='IdentifyingNumber,ProductName,Vendor,Version,Name'"
 * @generated
 */
@ProviderType
public interface CIM_AGPSoftwareFeature extends CIM_SoftwareFeature {
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating various capabilities and characteristics of the AGPVideoController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPSoftwareFeature_Characteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"OS support\",\"Hardware Acceleration\",\"Hardware Blit\",\"OpenGL Support\",\"Cache Coherency\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AGPSoftwareFeature.CharacteristicDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Characteristic Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing more detailed explanations for any of the features indicated in the Characteristics array. Each entry in this array is related to the Characteristics array entry located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPSoftwareFeature_CharacteristicDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AGPSoftwareFeature.Characteristics\"]'"
	 * @generated
	 */
	EList<String> getCharacteristicDescriptions();

} // CIM_AGPSoftwareFeature
