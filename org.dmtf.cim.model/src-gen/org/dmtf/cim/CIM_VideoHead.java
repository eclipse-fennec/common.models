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
 * A representation of the model object '<em><b>CIM Video Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VideoHead represents one head of the CIM_DisplayController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getCurrentBitsPerPixel <em>Current Bits Per Pixel</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getCurrentHorizontalResolution <em>Current Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getCurrentVerticalResolution <em>Current Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getMaxRefreshRate <em>Max Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getMinRefreshRate <em>Min Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getCurrentRefreshRate <em>Current Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getCurrentScanMode <em>Current Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getOtherCurrentScanMode <em>Other Current Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getCurrentNumberOfRows <em>Current Number Of Rows</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getCurrentNumberOfColumns <em>Current Number Of Columns</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHead#getCurrentNumberOfColors <em>Current Number Of Colors</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_VideoHead extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Current Bits Per Pixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bits used to display each pixel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Bits Per Pixel</em>' attribute.
	 * @see #setCurrentBitsPerPixel(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_CurrentBitsPerPixel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits' MappingStrings='[\"MIF.DMTF|Video|004.12\"]' PUnit='bit'"
	 * @generated
	 */
	Long getCurrentBitsPerPixel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getCurrentBitsPerPixel <em>Current Bits Per Pixel</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_CurrentHorizontalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Pixels' MappingStrings='[\"MIF.DMTF|Video|004.11\"]' ModelCorrespondence='[\"CIM_VideoHeadResolution.HorizontalResolution\"]' PUnit='pixel'"
	 * @generated
	 */
	Long getCurrentHorizontalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getCurrentHorizontalResolution <em>Current Horizontal Resolution</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_CurrentVerticalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Pixels' MappingStrings='[\"MIF.DMTF|Video|004.10\"]' ModelCorrespondence='[\"CIM_VideoHeadResolution.VerticalResolution\"]' PUnit='pixel'"
	 * @generated
	 */
	Long getCurrentVerticalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getCurrentVerticalResolution <em>Current Vertical Resolution</em>}' attribute.
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
	 * Maximum refresh rate of the DisplayController in Hertz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Refresh Rate</em>' attribute.
	 * @see #setMaxRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_MaxRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Video|004.5\"]' ModelCorrespondence='[\"CIM_VideoHeadResolution.MaxRefreshRate\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getMaxRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getMaxRefreshRate <em>Max Refresh Rate</em>}' attribute.
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
	 * Minimum refresh rate of the Video Controller in Hertz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Refresh Rate</em>' attribute.
	 * @see #setMinRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_MinRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Video|004.4\"]' ModelCorrespondence='[\"CIM_VideoHeadResolution.MinRefreshRate\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getMinRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getMinRefreshRate <em>Min Refresh Rate</em>}' attribute.
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
	 * Current refresh rate in Hertz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Refresh Rate</em>' attribute.
	 * @see #setCurrentRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_CurrentRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Video|004.15\"]' ModelCorrespondence='[\"CIM_VideoHeadResolution.RefreshRate\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getCurrentRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getCurrentRefreshRate <em>Current Refresh Rate</em>}' attribute.
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
	 * Current scan mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Scan Mode</em>' attribute.
	 * @see #setCurrentScanMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_CurrentScanMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Not Supported\",\"Non-Interlaced Operation\",\"Interlaced Operation\"]' MappingStrings='[\"MIF.DMTF|Video|004.8\"]' ModelCorrespondence='[\"CIM_VideoHead.OtherCurrentScanMode\",\"CIM_VideoHeadResolution.ScanMode\"]'"
	 * @generated
	 */
	Integer getCurrentScanMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getCurrentScanMode <em>Current Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Scan Mode</em>' attribute.
	 * @see #getCurrentScanMode()
	 * @generated
	 */
	void setCurrentScanMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Current Scan Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the current scan mode when the instance's CurrentScanMode property is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Current Scan Mode</em>' attribute.
	 * @see #setOtherCurrentScanMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_OtherCurrentScanMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_VideoHead.CurrentScanMode\",\"CIM_VideoHeadResolution.OtherScanMode\"]'"
	 * @generated
	 */
	String getOtherCurrentScanMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getOtherCurrentScanMode <em>Other Current Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Current Scan Mode</em>' attribute.
	 * @see #getOtherCurrentScanMode()
	 * @generated
	 */
	void setOtherCurrentScanMode(String value);

	/**
	 * Returns the value of the '<em><b>Current Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If in character mode, number of rows for this Video Controller. Otherwise, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Number Of Rows</em>' attribute.
	 * @see #setCurrentNumberOfRows(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_CurrentNumberOfRows()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Video|004.13\"]'"
	 * @generated
	 */
	Long getCurrentNumberOfRows();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getCurrentNumberOfRows <em>Current Number Of Rows</em>}' attribute.
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
	 * If in character mode, number of columns for this DisplayController. Otherwise, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Number Of Columns</em>' attribute.
	 * @see #setCurrentNumberOfColumns(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_CurrentNumberOfColumns()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Video|004.14\"]'"
	 * @generated
	 */
	Long getCurrentNumberOfColumns();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getCurrentNumberOfColumns <em>Current Number Of Columns</em>}' attribute.
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
	 * Number of colors supported at the current resolutions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Number Of Colors</em>' attribute.
	 * @see #setCurrentNumberOfColors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHead_CurrentNumberOfColors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_VideoHeadResolution.NumberOfColors\"]'"
	 * @generated
	 */
	Long getCurrentNumberOfColors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHead#getCurrentNumberOfColors <em>Current Number Of Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Number Of Colors</em>' attribute.
	 * @see #getCurrentNumberOfColors()
	 * @generated
	 */
	void setCurrentNumberOfColors(Long value);

} // CIM_VideoHead
