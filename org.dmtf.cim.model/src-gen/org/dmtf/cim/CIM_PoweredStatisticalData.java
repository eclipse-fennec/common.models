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
 * A representation of the model object '<em><b>CIM Powered Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistical information related to the powered-on time of a Managed Element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PoweredStatisticalData#getPowerOnHours <em>Power On Hours</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PoweredStatisticalData#getTotalPowerOnHours <em>Total Power On Hours</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PoweredStatisticalData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::PowerMgmt' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PoweredStatisticalData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Power On Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of consecutive time that the managed element has been powered on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power On Hours</em>' attribute.
	 * @see #setPowerOnHours(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PoweredStatisticalData_PowerOnHours()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getPowerOnHours();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PoweredStatisticalData#getPowerOnHours <em>Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power On Hours</em>' attribute.
	 * @see #getPowerOnHours()
	 * @generated
	 */
	void setPowerOnHours(String value);

	/**
	 * Returns the value of the '<em><b>Total Power On Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount of time that the managed element has been powered on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Power On Hours</em>' attribute.
	 * @see #setTotalPowerOnHours(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PoweredStatisticalData_TotalPowerOnHours()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTotalPowerOnHours();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PoweredStatisticalData#getTotalPowerOnHours <em>Total Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Power On Hours</em>' attribute.
	 * @see #getTotalPowerOnHours()
	 * @generated
	 */
	void setTotalPowerOnHours(String value);

} // CIM_PoweredStatisticalData
