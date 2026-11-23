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
 * A representation of the model object '<em><b>CIM Label Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LabelReaders represent hardware capable of scanning or reading a physical label or the NonVolatileMemory on a PhysicalMedia. Examples of labels include barcode and OCR tags.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LabelReader#getSupportedFormats <em>Supported Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LabelReader#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LabelReader()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_LabelReader extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Supported Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers describing the formats of the labels that can be read or scanned by the LabelReader. The values specified for this property correspond to those defined for CIM_PhysicalMedia.LabelFormats.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Formats</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LabelReader_SupportedFormats()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Barcode\",\"Radio Frequency Identification\",\"OCR (Optical Character Recognition)\",\"MICR (Magnetic Ink Character Recognition)\",\"7 Character Barcode\",\"9 Character Barcode\"]' ModelCorrespondence='[\"CIM_PhysicalMedia.LabelFormats\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedFormats();

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The technology used by the LabelReader. One entry of the Values array requires some explanation - "Memory Reader". The latter describes the ability to access memory in a PhysicalMedia's packaging (for example, memory on an AIT tape). The existence of this Memory is indicated by the MemoryWithMedia association on the physical side, or by AssociatedMemory on the logical side.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LabelReader_Technology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"Laser\",\"Infrared\",\"RF\",\"Camera\",\"Memory Reader\"]'"
	 * @generated
	 */
	Integer getTechnology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LabelReader#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Integer value);

} // CIM_LabelReader
