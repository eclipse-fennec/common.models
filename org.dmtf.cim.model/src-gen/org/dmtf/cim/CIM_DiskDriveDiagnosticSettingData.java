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
 * A representation of the model object '<em><b>CIM Disk Drive Diagnostic Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class define the additional settings to be used for disk drive diagnostic tests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticSettingData#getLBAStart <em>LBA Start</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticSettingData#getLBAEnd <em>LBA End</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticSettingData#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticSettingData#getDataSizes <em>Data Sizes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticSettingData#getDataPatterns <em>Data Patterns</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::Diagnostics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiskDriveDiagnosticSettingData extends CIM_DiagnosticSettingData {
	/**
	 * Returns the value of the '<em><b>LBA Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the ending Logical Block Address for disk diagnostics that test a specific region of the disk. If NULL is specified, then the diagnostic ends with the last disk sector. To specify the entire disk, both LBAStart and LBAEnd must be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LBA Start</em>' attribute.
	 * @see #setLBAStart(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticSettingData_LBAStart()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticServiceCapabilities.Region\"]'"
	 * @generated
	 */
	Long getLBAStart();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveDiagnosticSettingData#getLBAStart <em>LBA Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LBA Start</em>' attribute.
	 * @see #getLBAStart()
	 * @generated
	 */
	void setLBAStart(Long value);

	/**
	 * Returns the value of the '<em><b>LBA End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the ending Logical Block Address for disk diagnostics that test a specific region of the disk. If NULL is specified, then the diagnostic ends with the last disk sector. To specify the entire disk, both LBAStart and LBAEnd must be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LBA End</em>' attribute.
	 * @see #setLBAEnd(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticSettingData_LBAEnd()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticServiceCapabilities.Region\"]'"
	 * @generated
	 */
	Long getLBAEnd();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveDiagnosticSettingData#getLBAEnd <em>LBA End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LBA End</em>' attribute.
	 * @see #getLBAEnd()
	 * @generated
	 */
	void setLBAEnd(Long value);

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the seed that initiates the random number sequence used by the test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seed</em>' attribute.
	 * @see #setSeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticSettingData_Seed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticServiceCapabilities.Seed\"]'"
	 * @generated
	 */
	Long getSeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveDiagnosticSettingData#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(Long value);

	/**
	 * Returns the value of the '<em><b>Data Sizes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array property is used by a client for the tests shown in Table 5 to specify the data buffer sizes to be used for read or write operations by the diagnostic test. If this property is NULL, then the default size of 512 bytes is used.
	 * The vendor-defined default value(s) is optionally advertised by the provider using the default instance of CIM_DiskDriveDiagnosticSettingData.
	 * Test behavior depends upon the combination of values in the DataPatterns and DataSizes array properties. The client may choose to specify that one or both of these array properties be NULL, have a single value, or have multiple values. However, certain restrictions apply. Both properties can be NULL but if one property has a value then the other property must also have a value.
	 * If both properties are NULL, then the vendor defined combination of data patterns and data sizes are used by the diagnostic test. 
	 * If both properties have values, then they shall have the same number of values because the diagnostic test shall treat them as value pairs. That is, the test is run first using the first value in DataSizes and the first value in DataPatterns, then the test is run a second time using the second value in DataSizes and the second value in DataPatterns, and so on. However, neither element of the value pair can be NULL.
	 * If CIM_DiskDriveDiagnosticServiceCapabilities.DataSizes has values, a client can only specify one or more of those values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Sizes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticSettingData_DataSizes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticSettingData.DataPatterns\",\"CIM_DiskDriveDiagnosticServiceCapabilities.DataSizes\"]' PUnit='Bytes'"
	 * @generated
	 */
	EList<Long> getDataSizes();

	/**
	 * Returns the value of the '<em><b>Data Patterns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array property specifies the data patterns written by the disk diagnostic. If NULL, then the the vendor-specific data pattern(s) is used. A data pattern is a string interpreted as a 16-digit hex value. For example, a data pattern of all ones would be FFFFFFFFFFFFFFFF while alternating ones and zeros would be 5555555555555555 or AAAAAAAAAAAAAAAA . The pattern will be repeated as necessary to fill the data buffer.
	 * If CIM_DiskDriveDiagnosticServiceCapabilities.DataPatterns has values, a client can only specify one or more of those values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Patterns</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticSettingData_DataPatterns()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticSettingData.DataSizes\",\"CIM_DiskDriveDiagnosticServiceCapabilities.DataPatterns\"]'"
	 * @generated
	 */
	EList<String> getDataPatterns();

} // CIM_DiskDriveDiagnosticSettingData
