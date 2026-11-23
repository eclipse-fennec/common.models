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
 * A representation of the model object '<em><b>CIM Video Head Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VideoHeadResolution describes the various video modes that a VideoHead can support. Video modes are defined by the possible horizontal and vertical resolutions, refresh rate, scan mode and number of colors settings supported by a Controller. The actual resolutions, etc. that are in use, are the values specified in the VideoHead object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VideoHeadResolution#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHeadResolution#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHeadResolution#getRefreshRate <em>Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHeadResolution#getMinRefreshRate <em>Min Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHeadResolution#getMaxRefreshRate <em>Max Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHeadResolution#getScanMode <em>Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHeadResolution#getOtherScanMode <em>Other Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoHeadResolution#getNumberOfColors <em>Number Of Colors</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VideoHeadResolution()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::Device::Controller' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VideoHeadResolution extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Horizontal Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitor's horizontal resolution in Pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Resolution</em>' attribute.
	 * @see #setHorizontalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHeadResolution_HorizontalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Pixels' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.2\"]' ModelCorrespondence='[\"CIM_VideoHead.CurrentHorizontalResolution\"]' PUnit='pixel'"
	 * @generated
	 */
	Long getHorizontalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHeadResolution#getHorizontalResolution <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Resolution</em>' attribute.
	 * @see #getHorizontalResolution()
	 * @generated
	 */
	void setHorizontalResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Vertical Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitor's vertical resolution in Pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Resolution</em>' attribute.
	 * @see #setVerticalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHeadResolution_VerticalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Pixels' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.3\"]' ModelCorrespondence='[\"CIM_VideoHead.CurrentVerticalResolution\"]' PUnit='pixel'"
	 * @generated
	 */
	Long getVerticalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHeadResolution#getVerticalResolution <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Resolution</em>' attribute.
	 * @see #getVerticalResolution()
	 * @generated
	 */
	void setVerticalResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitor's refresh rate in Hertz. If a range of rates is supported, use the MinRefreshRate and MaxRefreshRate properties, and set RefreshRate (this property) to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Rate</em>' attribute.
	 * @see #setRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHeadResolution_RefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.4\"]' ModelCorrespondence='[\"CIM_VideoHead.CurrentRefreshRate\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHeadResolution#getRefreshRate <em>Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Rate</em>' attribute.
	 * @see #getRefreshRate()
	 * @generated
	 */
	void setRefreshRate(Long value);

	/**
	 * Returns the value of the '<em><b>Min Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitor's minimum refresh rate in Hertz, when a range of rates is supported at the specified resolutions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Refresh Rate</em>' attribute.
	 * @see #setMinRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHeadResolution_MinRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.6\"]' ModelCorrespondence='[\"CIM_VideoHead.MinRefreshRate\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getMinRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHeadResolution#getMinRefreshRate <em>Min Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Refresh Rate</em>' attribute.
	 * @see #getMinRefreshRate()
	 * @generated
	 */
	void setMinRefreshRate(Long value);

	/**
	 * Returns the value of the '<em><b>Max Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitor's maximum refresh rate in Hertz, when a range of rates is supported at the specified resolutions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Refresh Rate</em>' attribute.
	 * @see #setMaxRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHeadResolution_MaxRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.7\"]' ModelCorrespondence='[\"CIM_VideoHead.MaxRefreshRate\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getMaxRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHeadResolution#getMaxRefreshRate <em>Max Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Refresh Rate</em>' attribute.
	 * @see #getMaxRefreshRate()
	 * @generated
	 */
	void setMaxRefreshRate(Long value);

	/**
	 * Returns the value of the '<em><b>Scan Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer indicating whether the monitor operates in interlaced (value=5) or non-interlaced (4) mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Mode</em>' attribute.
	 * @see #setScanMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHeadResolution_ScanMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Not Supported\",\"Non-Interlaced Operation\",\"Interlaced Operation\"]' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.5\"]' ModelCorrespondence='[\"CIM_VideoHead.CurrentScanMode\",\"CIM_VideoHeadResolution.OtherScanMode\"]'"
	 * @generated
	 */
	Integer getScanMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHeadResolution#getScanMode <em>Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Mode</em>' attribute.
	 * @see #getScanMode()
	 * @generated
	 */
	void setScanMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Scan Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the scan mode when the instance's ScanMode property is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Scan Mode</em>' attribute.
	 * @see #setOtherScanMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHeadResolution_OtherScanMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_VideoHead.OtherCurrentScanMode\",\"CIM_VideoHeadResolution.ScanMode\"]'"
	 * @generated
	 */
	String getOtherScanMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHeadResolution#getOtherScanMode <em>Other Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Scan Mode</em>' attribute.
	 * @see #getOtherScanMode()
	 * @generated
	 */
	void setOtherScanMode(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of colors supported at the current resolutions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Colors</em>' attribute.
	 * @see #setNumberOfColors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoHeadResolution_NumberOfColors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_VideoHead.CurrentNumberOfColors\"]'"
	 * @generated
	 */
	Long getNumberOfColors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoHeadResolution#getNumberOfColors <em>Number Of Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Colors</em>' attribute.
	 * @see #getNumberOfColors()
	 * @generated
	 */
	void setNumberOfColors(Long value);

} // CIM_VideoHeadResolution
