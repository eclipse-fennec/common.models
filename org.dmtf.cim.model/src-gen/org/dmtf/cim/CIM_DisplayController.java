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
 * A representation of the model object '<em><b>CIM Display Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the DisplayController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DisplayController#getVideoProcessor <em>Video Processor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DisplayController#getVideoMemoryType <em>Video Memory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DisplayController#getOtherVideoMemoryType <em>Other Video Memory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DisplayController#getNumberOfVideoPages <em>Number Of Video Pages</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DisplayController#getMaxMemorySupported <em>Max Memory Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DisplayController#getAcceleratorCapabilities <em>Accelerator Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DisplayController#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DisplayController#getOtherVideoArchitecture <em>Other Video Architecture</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DisplayController#getVideoArchitecture <em>Video Architecture</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::Device::Controller' override.Description='string' override.Description.MappingStrings='[\"MIF.DMTF|Video|004.18\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_DisplayController extends CIM_Controller {
	/**
	 * Returns the value of the '<em><b>Video Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing the video processor/Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Video Processor</em>' attribute.
	 * @see #setVideoProcessor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController_VideoProcessor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVideoProcessor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DisplayController#getVideoProcessor <em>Video Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Processor</em>' attribute.
	 * @see #getVideoProcessor()
	 * @generated
	 */
	void setVideoProcessor(String value);

	/**
	 * Returns the value of the '<em><b>Video Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration indicating the type of video memory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Video Memory Type</em>' attribute.
	 * @see #setVideoMemoryType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController_VideoMemoryType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\"]' Values='[\"Unknown\",\"Other\",\"VRAM\",\"DRAM\",\"SRAM\",\"WRAM\",\"EDO RAM\",\"Burst Synchronous DRAM\",\"Pipelined Burst SRAM\",\"CDRAM\",\"3DRAM\",\"SDRAM\",\"SGRAM\"]' MappingStrings='[\"MIF.DMTF|Video|004.6\"]' ModelCorrespondence='[\"CIM_DisplayController.OtherVideoMemoryType\"]'"
	 * @generated
	 */
	Integer getVideoMemoryType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DisplayController#getVideoMemoryType <em>Video Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Memory Type</em>' attribute.
	 * @see #getVideoMemoryType()
	 * @generated
	 */
	void setVideoMemoryType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Video Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the video memory type when the instance's VideoMemoryType property is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Video Memory Type</em>' attribute.
	 * @see #setOtherVideoMemoryType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController_OtherVideoMemoryType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DisplayController.VideoMemoryType\"]'"
	 * @generated
	 */
	String getOtherVideoMemoryType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DisplayController#getOtherVideoMemoryType <em>Other Video Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Video Memory Type</em>' attribute.
	 * @see #getOtherVideoMemoryType()
	 * @generated
	 */
	void setOtherVideoMemoryType(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Video Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of video pages supported given the current resolutions and available memory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Video Pages</em>' attribute.
	 * @see #setNumberOfVideoPages(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController_NumberOfVideoPages()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getNumberOfVideoPages();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DisplayController#getNumberOfVideoPages <em>Number Of Video Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Video Pages</em>' attribute.
	 * @see #getNumberOfVideoPages()
	 * @generated
	 */
	void setNumberOfVideoPages(Long value);

	/**
	 * Returns the value of the '<em><b>Max Memory Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum amount of memory supported in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Memory Supported</em>' attribute.
	 * @see #setMaxMemorySupported(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController_MaxMemorySupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getMaxMemorySupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DisplayController#getMaxMemorySupported <em>Max Memory Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Memory Supported</em>' attribute.
	 * @see #getMaxMemorySupported()
	 * @generated
	 */
	void setMaxMemorySupported(Long value);

	/**
	 * Returns the value of the '<em><b>Accelerator Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the graphics and 3D capabilities of the DisplayController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accelerator Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController_AcceleratorCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Graphics Accelerator\",\"3D Accelerator\",\"PCI Fast Write\",\"MultiMonitor Support\",\"PCI Mastering\",\"Second Monochrome Adapter Support\",\"Large Memory Address Support\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DisplayController.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getAcceleratorCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing more detailed explanations for any of the video Accelerator features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DisplayController.AcceleratorCapabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Other Video Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the video architecture type when the instance's VideoArchitecture property is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Video Architecture</em>' attribute.
	 * @see #setOtherVideoArchitecture(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController_OtherVideoArchitecture()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DisplayController.VideoArchitecture\"]'"
	 * @generated
	 */
	String getOtherVideoArchitecture();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DisplayController#getOtherVideoArchitecture <em>Other Video Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Video Architecture</em>' attribute.
	 * @see #getOtherVideoArchitecture()
	 * @generated
	 */
	void setOtherVideoArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Video Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration indicating the display controllers video architecture used to generate the video signal. Usually, a dedicated video processor generates the video signal in accordance with the specified architecture.It is an indicator of the maximum resolution capability of the display controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Video Architecture</em>' attribute.
	 * @see #setVideoArchitecture(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DisplayController_VideoArchitecture()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"160\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"CGA\",\"EGA\",\"VGA\",\"SVGA\",\"MDA\",\"HGC\",\"MCGA\",\"8514A\",\"XGA\",\"Linear Frame Buffer\",\"PC-98\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getVideoArchitecture();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DisplayController#getVideoArchitecture <em>Video Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Architecture</em>' attribute.
	 * @see #getVideoArchitecture()
	 * @generated
	 */
	void setVideoArchitecture(Integer value);

} // CIM_DisplayController
