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
 * A representation of the model object '<em><b>CIM Magazine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageMediaLocations are typically slots or spaces where removable media are located. However, a specific kind of MediaLocation is a Magazine. This entity represents a single physical container with multiple StorageMediaLocations in it. All the MediaLocations within the Magazine are added/removed together. Often, this container has a Barcode or other label for identification. This is the unique data captured in the CIM_Magazine class. Magazine's label properties are defined exactly as are labels for PhysicalMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Magazine#getPhysicalLabels <em>Physical Labels</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Magazine#getLabelStates <em>Label States</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Magazine#getLabelFormats <em>Label Formats</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Magazine()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Physical::StoragePackage' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_Magazine extends CIM_StorageMediaLocation {
	/**
	 * Returns the value of the '<em><b>Physical Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more strings on 'labels' on the Magazine. The format of the labels and their state (readable, unreadable, upside-down) are indicated in the corresponding LabelFormats and LabelStates array properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Labels</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Magazine_PhysicalLabels()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Magazine.LabelStates\",\"CIM_Magazine.LabelFormats\"]'"
	 * @generated
	 */
	EList<String> getPhysicalLabels();

	/**
	 * Returns the value of the '<em><b>Label States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers describing the states of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label States</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Magazine_LabelStates()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"OK/Readable\",\"Unreadable\",\"Upside Down\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Magazine.PhysicalLabels\"]'"
	 * @generated
	 */
	EList<Integer> getLabelStates();

	/**
	 * Returns the value of the '<em><b>Label Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers describing the formats of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Formats</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Magazine_LabelFormats()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Barcode\",\"Radio Frequency Identification\",\"OCR (Optical Character Recognition)\",\"MICR (Magnetic Ink Character Recognition)\",\"7 Character Barcode\",\"9 Character Barcode\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Magazine.PhysicalLabels\"]'"
	 * @generated
	 */
	EList<Integer> getLabelFormats();

} // CIM_Magazine
