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
 * A representation of the model object '<em><b>CIM Flat Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the FlatPanel LogicalDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FlatPanel#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FlatPanel#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FlatPanel#getScanMode <em>Scan Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FlatPanel#getDisplayType <em>Display Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FlatPanel#getLightSource <em>Light Source</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FlatPanel#getSupportsColor <em>Supports Color</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FlatPanel()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.23.0' UMLPackagePath='CIM::Device::UserDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_FlatPanel extends CIM_Display {
	/**
	 * Returns the value of the '<em><b>Horizontal Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FlatPanel's horizontal resolution in Pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Resolution</em>' attribute.
	 * @see #setHorizontalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FlatPanel_HorizontalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Pixels' PUnit='pixel'"
	 * @generated
	 */
	Long getHorizontalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FlatPanel#getHorizontalResolution <em>Horizontal Resolution</em>}' attribute.
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
	 * FlatPanel's vertical resolution in Pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Resolution</em>' attribute.
	 * @see #setVerticalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FlatPanel_VerticalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Pixels' PUnit='pixel'"
	 * @generated
	 */
	Long getVerticalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FlatPanel#getVerticalResolution <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Resolution</em>' attribute.
	 * @see #getVerticalResolution()
	 * @generated
	 */
	void setVerticalResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Scan Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A FlatPanel's scan mode indicating either single (value=2) or dual scan (3).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Mode</em>' attribute.
	 * @see #setScanMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FlatPanel_ScanMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"Single Scan\",\"Dual Scan\"]'"
	 * @generated
	 */
	Integer getScanMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FlatPanel#getScanMode <em>Scan Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Mode</em>' attribute.
	 * @see #getScanMode()
	 * @generated
	 */
	void setScanMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Display Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration describing the type of flat panel display.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Type</em>' attribute.
	 * @see #setDisplayType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FlatPanel_DisplayType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Passive Matrix LCD\",\"Active Matrix LCD\",\"Cholesteric LCD\",\"Field Emission Display\",\"Electro Luminescent Display\",\"Gas Plasma\",\"LED\"]'"
	 * @generated
	 */
	Integer getDisplayType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FlatPanel#getDisplayType <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Type</em>' attribute.
	 * @see #getDisplayType()
	 * @generated
	 */
	void setDisplayType(Integer value);

	/**
	 * Returns the value of the '<em><b>Light Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the display illumination type. For example, backlit (value=2) or reflective (4) can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Light Source</em>' attribute.
	 * @see #setLightSource(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FlatPanel_LightSource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Backlit\",\"Edgelit\",\"Reflective\"]'"
	 * @generated
	 */
	Integer getLightSource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FlatPanel#getLightSource <em>Light Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Source</em>' attribute.
	 * @see #getLightSource()
	 * @generated
	 */
	void setLightSource(Integer value);

	/**
	 * Returns the value of the '<em><b>Supports Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the FlatPanel supports color display.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Color</em>' attribute.
	 * @see #setSupportsColor(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FlatPanel_SupportsColor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSupportsColor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FlatPanel#getSupportsColor <em>Supports Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Color</em>' attribute.
	 * @see #getSupportsColor()
	 * @generated
	 */
	void setSupportsColor(Boolean value);

} // CIM_FlatPanel
