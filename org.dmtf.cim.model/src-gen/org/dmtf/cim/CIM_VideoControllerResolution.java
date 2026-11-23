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
 * A representation of the model object '<em><b>CIM Video Controller Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_VideoControllerResolutionclass has been deprecated in lieu of CIM_VideoHeadResolution. 
 * Deprecated description: 
 * VideoControllerResolution describes the various video modes that a VideoController can support. Video modes are defined by the possible horizontal and vertical resolutions, refresh rate, scan mode, and number of color settings that are supported by a Controller. The actual resolutions and so on that are in use are the values specified in the VideoController object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VideoControllerResolution#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoControllerResolution#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoControllerResolution#getRefreshRate <em>Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoControllerResolution#getMinRefreshRate <em>Min Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoControllerResolution#getMaxRefreshRate <em>Max Refresh Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoControllerResolution#getScanMode <em>Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoControllerResolution#getNumberOfColors <em>Number Of Colors</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VideoControllerResolution()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_VideoHeadResolution\"]' Version='2.10.0' UMLPackagePath='CIM::Device::Controller' override.SettingID='string' override.SettingID.Deprecated='[\"No value\"]' override.SettingID.Key='true' override.SettingID.Description='The inherited SettingID serves as part of the key for a VideoControllerResolution instance.' override.SettingID.MaxLen='256' keys='SettingID'"
 * @generated
 */
@ProviderType
public interface CIM_VideoControllerResolution extends CIM_Setting {
	/**
	 * Returns the value of the '<em><b>Horizontal Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The horizontal resolution of the Controller in Pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Resolution</em>' attribute.
	 * @see #setHorizontalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoControllerResolution_HorizontalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHeadResolution.HorizontalResolution\"]' Units='Pixels' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.2\"]' ModelCorrespondence='[\"CIM_VideoController.CurrentHorizontalResolution\"]' PUnit='pixel'"
	 * @generated
	 */
	Long getHorizontalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoControllerResolution#getHorizontalResolution <em>Horizontal Resolution</em>}' attribute.
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
	 * The vertical resolution of the Controller in Pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Resolution</em>' attribute.
	 * @see #setVerticalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoControllerResolution_VerticalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHeadResolution.VerticalResolution\"]' Units='Pixels' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.3\"]' ModelCorrespondence='[\"CIM_VideoController.CurrentVerticalResolution\"]' PUnit='pixel'"
	 * @generated
	 */
	Long getVerticalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoControllerResolution#getVerticalResolution <em>Vertical Resolution</em>}' attribute.
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
	 * Refresh rate in hertz. If a range of rates is supported, use the MinRefreshRate and MaxRefreshRate properties, and set RefreshRate (this property) to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Rate</em>' attribute.
	 * @see #setRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoControllerResolution_RefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHeadResolution.RefreshRate\"]' Units='Hertz' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.4\"]' ModelCorrespondence='[\"CIM_VideoController.CurrentRefreshRate\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoControllerResolution#getRefreshRate <em>Refresh Rate</em>}' attribute.
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
	 * Minimum refresh rate in hertz, when a range of rates is supported at the specified resolutions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Refresh Rate</em>' attribute.
	 * @see #setMinRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoControllerResolution_MinRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHeadResolution.MinRefreshRate\"]' Units='Hertz' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.6\"]' ModelCorrespondence='[\"CIM_VideoController.MinRefreshRate\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getMinRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoControllerResolution#getMinRefreshRate <em>Min Refresh Rate</em>}' attribute.
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
	 * Maximum refresh rate in hertz, when a range of rates is supported at the specified resolutions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Refresh Rate</em>' attribute.
	 * @see #setMaxRefreshRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoControllerResolution_MaxRefreshRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_VideoHeadResolution.MaxRefreshRate\"]' Units='Hertz' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.7\"]' ModelCorrespondence='[\"CIM_VideoController.MaxRefreshRate\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getMaxRefreshRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoControllerResolution#getMaxRefreshRate <em>Max Refresh Rate</em>}' attribute.
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
	 * Integer that indicates whether the Controller operates in interlaced (value=5) or non-interlaced (value=4) mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Mode</em>' attribute.
	 * @see #setScanMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoControllerResolution_ScanMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_VideoHeadResolution.ScanMode\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"Not Supported\",\"Non-Interlaced Operation\",\"Interlaced Operation\"]' MappingStrings='[\"MIF.DMTF|Monitor Resolutions|002.5\"]' ModelCorrespondence='[\"CIM_VideoController.CurrentScanMode\"]'"
	 * @generated
	 */
	Integer getScanMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoControllerResolution#getScanMode <em>Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Mode</em>' attribute.
	 * @see #getScanMode()
	 * @generated
	 */
	void setScanMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of colors that are supported at the current resolutions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Colors</em>' attribute.
	 * @see #setNumberOfColors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoControllerResolution_NumberOfColors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_VideoHeadResolution.NumberOfColors\"]' ModelCorrespondence='[\"CIM_VideoController.CurrentNumberOfColors\"]'"
	 * @generated
	 */
	Long getNumberOfColors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoControllerResolution#getNumberOfColors <em>Number Of Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Colors</em>' attribute.
	 * @see #getNumberOfColors()
	 * @generated
	 */
	void setNumberOfColors(Long value);

} // CIM_VideoControllerResolution
