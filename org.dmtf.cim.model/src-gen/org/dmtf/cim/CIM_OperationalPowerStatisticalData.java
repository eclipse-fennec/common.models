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
 * A representation of the model object '<em><b>CIM Operational Power Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of StatisticalData which identifies power attributes of a storage system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OperationalPowerStatisticalData#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperationalPowerStatisticalData#getMilliwatts <em>Milliwatts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperationalPowerStatisticalData#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerStatisticalData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Power' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_OperationalPowerStatisticalData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the role that the element played for which this power statistics record was collected. Generally, the ElementTypes defined here have the following meaning in the context of this class: 2, "Computer System": Cumulative statistics for the storage system. In the case of a complex system with multiple component Computer Systems, these are the statistics for the top-level aggregate Computer System. 10, "Disk Drive": Statistics for a DiskDrive. 201, "PDU": Sgtatistics for a PDU. 202, "Power Supply": Statistics for a Power Supply. 203 "Fan": Statistics for a fan. 204, "CPU": Statistics for a CPU. 205, "RAID Group": Statistics for all the disks in a RAID Group. 206, "Disk Tray": Statistics for Disk Tray. 207, "Controller": Statistics for a controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerStatisticalData_ElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"10\",\"201\",\"202\",\"203\",\"204\",\"205\",\"206\",\"207\",\"..\",\"0x8000..\"]' Values='[\"Computer System\",\"Disk Drive\",\"PDU\",\"Power Supply\",\"Fan\",\"CPU\",\"RAID Group\",\"Disk Tray\",\"Controller\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperationalPowerStatisticalData#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>Milliwatts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current value in Milliwats of the power consumed by the element refereced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Milliwatts</em>' attribute.
	 * @see #setMilliwatts(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerStatisticalData_Milliwatts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliWatts' Counter='true' PUnit='watt * 10^-3'"
	 * @generated
	 */
	Long getMilliwatts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperationalPowerStatisticalData#getMilliwatts <em>Milliwatts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milliwatts</em>' attribute.
	 * @see #getMilliwatts()
	 * @generated
	 */
	void setMilliwatts(Long value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of decimal places of accuracy of the Milliwatt attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerStatisticalData_Precision()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getPrecision();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperationalPowerStatisticalData#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Long value);

} // CIM_OperationalPowerStatisticalData
