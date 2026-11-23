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
 * A representation of the model object '<em><b>CIM Power Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a representation of logical properties of a generic power source. Any logical device that has an aspect of producing power and thus effectively being a power source may be represented by this class or the subclass of this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PowerSource#getRatedMaxOutputPower <em>Rated Max Output Power</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSource#getOutputPowerUnits <em>Output Power Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSource#getIsACOutput <em>Is AC Output</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PowerSource()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::Device::CoolingAndPower' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PowerSource extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Rated Max Output Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum amount of power that may be drawn within the rating of the PowerSource. The units of the value shall be described by the OutputPowerUnits property. A value of zero shall indicate 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rated Max Output Power</em>' attribute.
	 * @see #setRatedMaxOutputPower(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSource_RatedMaxOutputPower()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_PowerSource.OutputPowerUnits\"]'"
	 * @generated
	 */
	Long getRatedMaxOutputPower();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSource#getRatedMaxOutputPower <em>Rated Max Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Max Output Power</em>' attribute.
	 * @see #getRatedMaxOutputPower()
	 * @generated
	 */
	void setRatedMaxOutputPower(Long value);

	/**
	 * Returns the value of the '<em><b>Output Power Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the programatic units for the MaxOutputPower property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Power Units</em>' attribute.
	 * @see #setOutputPowerUnits(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSource_OutputPowerUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PowerSource.RatedMaxOutputPower\"]' IsPUnit='true'"
	 * @generated
	 */
	String getOutputPowerUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSource#getOutputPowerUnits <em>Output Power Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Power Units</em>' attribute.
	 * @see #getOutputPowerUnits()
	 * @generated
	 */
	void setOutputPowerUnits(String value);

	/**
	 * Returns the value of the '<em><b>Is AC Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value of true shall indicate the output from the PowerSource is alternating current (AC). A value of false shall indicate the output from the PowerSource is direct current (DC).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is AC Output</em>' attribute.
	 * @see #setIsACOutput(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSource_IsACOutput()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsACOutput();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSource#getIsACOutput <em>Is AC Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is AC Output</em>' attribute.
	 * @see #getIsACOutput()
	 * @generated
	 */
	void setIsACOutput(Boolean value);

} // CIM_PowerSource
