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
 * A representation of the model object '<em><b>CIM Video Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_VideoController class has been deprecated in lieu of CIM_DisplayController. Deprecated description: Capabilities and management of the VideoController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getVideoProcessor <em>Video Processor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getVideoMemoryType <em>Video Memory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getNumberOfVideoPages <em>Number Of Video Pages</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getMaxMemorySupported <em>Max Memory Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getAcceleratorCapabilities <em>Accelerator Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getCurrentBitsPerPixel <em>Current Bits Per Pixel</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getCurrentHorizontalResolution <em>Current Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getCurrentVerticalResolution <em>Current Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getMaxRefreshRate <em>Max Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getMinRefreshRate <em>Min Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getCurrentRefreshRate <em>Current Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getCurrentScanMode <em>Current Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getCurrentNumberOfRows <em>Current Number Of Rows</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getCurrentNumberOfColumns <em>Current Number Of Columns</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoController#getCurrentNumberOfColors <em>Current Number Of Colors</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VideoController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_DisplayController,CIM_VideoHead\"]' Version='2.10.0' UMLPackagePath='CIM::Device::Controller' override.Description='string' override.Description.Deprecated='[\"No value\"]' override.Description.MappingStrings='[\"MIF.DMTF|Video|004.18\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_VideoController extends CIM_Controller {
	/**
	 * Returns the value of the '<em><b>Video Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the video processor or Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Video Processor</em>' attribute.
	 * @see #setVideoProcessor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_VideoProcessor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_DisplayController.VideoProcessor\"]'"
	 * @generated
	 */
	String getVideoProcessor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getVideoProcessor <em>Video Processor</em>}' attribute.
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
	 * An integer enumeration that indicates the type of video memory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Video Memory Type</em>' attribute.
	 * @see #setVideoMemoryType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_VideoMemoryType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_DisplayController.VideoMemoryType\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\"]' Values='[\"Other\",\"Unknown\",\"VRAM\",\"DRAM\",\"SRAM\",\"WRAM\",\"EDO RAM\",\"Burst Synchronous DRAM\",\"Pipelined Burst SRAM\",\"CDRAM\",\"3DRAM\",\"SDRAM\",\"SGRAM\"]' MappingStrings='[\"MIF.DMTF|Video|004.6\"]'"
	 * @generated
	 */
	Integer getVideoMemoryType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getVideoMemoryType <em>Video Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Memory Type</em>' attribute.
	 * @see #getVideoMemoryType()
	 * @generated
	 */
	void setVideoMemoryType(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Video Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of video pages that are supported given the current resolutions and available memory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Video Pages</em>' attribute.
	 * @see #setNumberOfVideoPages(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_NumberOfVideoPages()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_DisplayController.NumberOfVideoPages\"]'"
	 * @generated
	 */
	Long getNumberOfVideoPages();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getNumberOfVideoPages <em>Number Of Video Pages</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_MaxMemorySupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_DisplayController.MaxMemorySupported\"]' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getMaxMemorySupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getMaxMemorySupported <em>Max Memory Supported</em>}' attribute.
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
	 * An array of integers that indicates the graphics and 3D capabilities of the VideoController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accelerator Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_AcceleratorCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_DisplayController.AcceleratorCapabilities\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Graphics Accelerator\",\"3D Accelerator\",\"PCI Fast Write\",\"MultiMonitor Support\",\"PCI Mastering\",\"Second Monochrome Adapter Support\",\"Large Memory Address Support\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_VideoController.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getAcceleratorCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings that provides more detailed explanations for any of the video Accelerator features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_DisplayController.CapabilityDescriptions\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_VideoController.AcceleratorCapabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Current Bits Per Pixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bits used to display each pixel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Bits Per Pixel</em>' attribute.
	 * @see #setCurrentBitsPerPixel(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_CurrentBitsPerPixel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHead.CurrentBitsPerPixel\"]' Units='Bits' MappingStrings='[\"MIF.DMTF|Video|004.12\"]' PUnit='bit'"
	 * @generated
	 */
	Long getCurrentBitsPerPixel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getCurrentBitsPerPixel <em>Current Bits Per Pixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Bits Per Pixel</em>' attribute.
	 * @see #getCurrentBitsPerPixel()
	 * @generated
	 */
	void setCurrentBitsPerPixel(Long value);

	/**
	 * Returns the value of the '<em><b>Current Horizontal Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current number of horizontal pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Horizontal Resolution</em>' attribute.
	 * @see #setCurrentHorizontalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_CurrentHorizontalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHead.CurrentHorizontalResolution\"]' Units='Pixels' MappingStrings='[\"MIF.DMTF|Video|004.11\"]' PUnit='pixel'"
	 * @generated
	 */
	Long getCurrentHorizontalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getCurrentHorizontalResolution <em>Current Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Horizontal Resolution</em>' attribute.
	 * @see #getCurrentHorizontalResolution()
	 * @generated
	 */
	void setCurrentHorizontalResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Current Vertical Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current number of vertical pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Vertical Resolution</em>' attribute.
	 * @see #setCurrentVerticalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_CurrentVerticalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHead.CurrentVerticalResolution\"]' Units='Pixels' MappingStrings='[\"MIF.DMTF|Video|004.10\"]' PUnit='pixel'"
	 * @generated
	 */
	Long getCurrentVerticalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getCurrentVerticalResolution <em>Current Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Vertical Resolution</em>' attribute.
	 * @see #getCurrentVerticalResolution()
	 * @generated
	 */
	void setCurrentVerticalResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Max Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum refresh rate of the VideoController in hertz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Refresh Rate</em>' attribute.
	 * @see #setMaxRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_MaxRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHead.MaxRefreshRate\"]' Units='Hertz' MappingStrings='[\"MIF.DMTF|Video|004.5\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getMaxRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getMaxRefreshRate <em>Max Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Refresh Rate</em>' attribute.
	 * @see #getMaxRefreshRate()
	 * @generated
	 */
	void setMaxRefreshRate(Long value);

	/**
	 * Returns the value of the '<em><b>Min Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum refresh rate of the Video Controller in hertz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Refresh Rate</em>' attribute.
	 * @see #setMinRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_MinRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHead.MinRefreshRate\"]' Units='Hertz' MappingStrings='[\"MIF.DMTF|Video|004.4\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getMinRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getMinRefreshRate <em>Min Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Refresh Rate</em>' attribute.
	 * @see #getMinRefreshRate()
	 * @generated
	 */
	void setMinRefreshRate(Long value);

	/**
	 * Returns the value of the '<em><b>Current Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current refresh rate in hertz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Refresh Rate</em>' attribute.
	 * @see #setCurrentRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_CurrentRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHead.CurrentRefreshRate\"]' Units='Hertz' MappingStrings='[\"MIF.DMTF|Video|004.15\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getCurrentRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getCurrentRefreshRate <em>Current Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Refresh Rate</em>' attribute.
	 * @see #getCurrentRefreshRate()
	 * @generated
	 */
	void setCurrentRefreshRate(Long value);

	/**
	 * Returns the value of the '<em><b>Current Scan Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current scan mode. "Interlaced" (value=3) or "Non Interlaced" (value=4) can be defined using this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Scan Mode</em>' attribute.
	 * @see #setCurrentScanMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_CurrentScanMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_VideoHead.CurrentScanMode\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Unknown\",\"Interlaced\",\"Non Interlaced\"]' MappingStrings='[\"MIF.DMTF|Video|004.8\"]'"
	 * @generated
	 */
	Integer getCurrentScanMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getCurrentScanMode <em>Current Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Scan Mode</em>' attribute.
	 * @see #getCurrentScanMode()
	 * @generated
	 */
	void setCurrentScanMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If in character mode, the number of rows for this Video Controller. Otherwise, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Number Of Rows</em>' attribute.
	 * @see #setCurrentNumberOfRows(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_CurrentNumberOfRows()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHead.CurrentNumberOfRows\"]' MappingStrings='[\"MIF.DMTF|Video|004.13\"]'"
	 * @generated
	 */
	Long getCurrentNumberOfRows();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getCurrentNumberOfRows <em>Current Number Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Number Of Rows</em>' attribute.
	 * @see #getCurrentNumberOfRows()
	 * @generated
	 */
	void setCurrentNumberOfRows(Long value);

	/**
	 * Returns the value of the '<em><b>Current Number Of Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If in character mode, the number of columns for this VideoController. Otherwise, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Number Of Columns</em>' attribute.
	 * @see #setCurrentNumberOfColumns(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_CurrentNumberOfColumns()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHead.CurrentNumberOfColumns\"]' MappingStrings='[\"MIF.DMTF|Video|004.14\"]'"
	 * @generated
	 */
	Long getCurrentNumberOfColumns();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getCurrentNumberOfColumns <em>Current Number Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Number Of Columns</em>' attribute.
	 * @see #getCurrentNumberOfColumns()
	 * @generated
	 */
	void setCurrentNumberOfColumns(Long value);

	/**
	 * Returns the value of the '<em><b>Current Number Of Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of colors that are supported at the current resolutions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Number Of Colors</em>' attribute.
	 * @see #setCurrentNumberOfColors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoController_CurrentNumberOfColors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_VideoHead.CurrentNumberOfColors\"]'"
	 * @generated
	 */
	Long getCurrentNumberOfColors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoController#getCurrentNumberOfColors <em>Current Number Of Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Number Of Colors</em>' attribute.
	 * @see #getCurrentNumberOfColors()
	 * @generated
	 */
	void setCurrentNumberOfColors(Long value);

} // CIM_VideoController
