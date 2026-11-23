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
 * A representation of the model object '<em><b>CIM Desktop Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the DesktopMonitor (CRT) LogicalDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DesktopMonitor#getDisplayType <em>Display Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DesktopMonitor#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DesktopMonitor#getScreenHeight <em>Screen Height</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DesktopMonitor#getScreenWidth <em>Screen Width</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DesktopMonitor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::UserDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_DesktopMonitor extends CIM_Display {
	/**
	 * Returns the value of the '<em><b>Display Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of DesktopMonitor or CRT. For example, multiscan color or monochrome monitors (values 2 or 3, respectively) can be indicated in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Type</em>' attribute.
	 * @see #setDisplayType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DesktopMonitor_DisplayType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Multiscan Color\",\"Multiscan Monochrome\",\"Fixed Frequency Color\",\"Fixed Frequency Monochrome\"]'"
	 * @generated
	 */
	Integer getDisplayType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DesktopMonitor#getDisplayType <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Type</em>' attribute.
	 * @see #getDisplayType()
	 * @generated
	 */
	void setDisplayType(Integer value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitor's bandwidth in MHertz. If unknown, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DesktopMonitor_Bandwidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MegaHertz' PUnit='hertz * 10^6'"
	 * @generated
	 */
	Long getBandwidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DesktopMonitor#getBandwidth <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' attribute.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(Long value);

	/**
	 * Returns the value of the '<em><b>Screen Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The logical height of the Display in screen coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Screen Height</em>' attribute.
	 * @see #setScreenHeight(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DesktopMonitor_ScreenHeight()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getScreenHeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DesktopMonitor#getScreenHeight <em>Screen Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Height</em>' attribute.
	 * @see #getScreenHeight()
	 * @generated
	 */
	void setScreenHeight(Long value);

	/**
	 * Returns the value of the '<em><b>Screen Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The logical width of the Display in screen coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Screen Width</em>' attribute.
	 * @see #setScreenWidth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DesktopMonitor_ScreenWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getScreenWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DesktopMonitor#getScreenWidth <em>Screen Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Width</em>' attribute.
	 * @see #getScreenWidth()
	 * @generated
	 */
	void setScreenWidth(Long value);

} // CIM_DesktopMonitor
