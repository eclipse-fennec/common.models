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
 * A representation of the model object '<em><b>CIM BIOS Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BIOSFeature represents the capabilities of the low-level software that is used to bring up and configure a Computer System.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BIOSFeature#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSFeature#getCharacteristicDescriptions <em>Characteristic Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSFeature()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::BIOS' keys='IdentifyingNumber,ProductName,Vendor,Version,Name'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSFeature extends CIM_SoftwareFeature {
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that specify the features supported by the BIOS. For example, one can specify that PnP capabilities are provided (value=9) or that infrared devices are supported (21). Values specified in the enumeration are taken from both DMI and SMBIOS (the Type 0 structure, the BIOS Characteristics and BIOS Characteristics Extension Bytes attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSFeature_Characteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"160\"]' Values='[\"Other\",\"Unknown\",\"Undefined\",\"ISA Support\",\"MCA Support\",\"EISA Support\",\"PCI Support\",\"PCMCIA Support\",\"PnP Support\",\"APM Support\",\"Upgradeable BIOS\",\"BIOS Shadowing Allowed\",\"VL VESA Support\",\"ESCD Support\",\"LS-120 Boot Support\",\"ACPI Support\",\"I2O Boot Support\",\"USB Legacy Support\",\"AGP Support\",\"PC Card\",\"IR\",\"1394\",\"I2C\",\"Smart Battery\",\"ATAPI ZIP Drive Boot Support\",\"1394 Boot Support\",\"Boot from CD\",\"Selectable Boot\",\"BIOS ROM is Socketed\",\"Boot from PCMCIA\",\"EDD Specification Support\",\"PC-98\"]' ArrayType='Indexed' MappingStrings='[\"MIF.DMTF|BIOS Characteristic|004.3\"]' ModelCorrespondence='[\"CIM_BIOSFeature.CharacteristicDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Characteristic Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing more detailed explanations for any of the BIOS features indicated in the Characteristics array. Note, each entry of this array is related to the entry in the Characteristics array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSFeature_CharacteristicDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIF.DMTF|BIOS Characteristic|004.4\"]' ModelCorrespondence='[\"CIM_BIOSFeature.Characteristics\"]'"
	 * @generated
	 */
	EList<String> getCharacteristicDescriptions();

} // CIM_BIOSFeature
