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
 * A representation of the model object '<em><b>CIM Disk Drive Diagnostic Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class specializes CIM_DiagnosticTest to define the tests specific to disk drives.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticTest#getDiskDriveTestType <em>Disk Drive Test Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticTest#getOtherDiskDriveTestType <em>Other Disk Drive Test Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticTest()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::Diagnostics' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DiskDriveDiagnosticTest extends CIM_DiagnosticTest {
	/**
	 * Returns the value of the '<em><b>Disk Drive Test Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptions for each Disk Drive test type are below: * "Short Self-Test" (value=2) is specified for the test that performs a small set of vendor-specific tests to verify that the disk is operating properly. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2) and Media Verify (value=6). * "Extended Self-Test" (value=3) is specified for the tests that performs an extended set of vendor-specific tests to verify that the disk is operating properly. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2) and Media Verify (value=6). * "Selective Self-Test" (value=4) is specified for the test that performs an extended set of vendor-specific tests to verify that the disk is operating properly, but limited to a specific LBA range of the disk. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2) and Media Verify (value=6). * "Sequential Read" (value=5) is specified for the test that performs a read operation from all disk sectors in sequential order. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2) and Media Verify (value=6). * "Random Read" (value=6) is specified for the test that performs a read operation from disk sectors in random order. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2) and Media Verify (value=6). * "Sequential Read-Write-Read Compare" (value=7) is specified for the test that verifies that read and write operations are performed properly for a selected LBA range. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2) and Media Verify (value=6). * "Random Read-Write-Read Compare" (value=8) is specified for the test that verifies that read and write operations are performed properly for a selected LBA range. Disk sectors are tested in random order. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2) and Media Verify (value=6). * "Sequential Internal Verify" (value=9) is specified for the test that verifies the ability to perform read and verify operations from track to track and head to head in sequential order for a selected LBA range. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2) and Media Verify (value=6). * "Status" (value=10) is specified for the test that returns information that relative health of the disk drive based upon internal analysis of failure statistics. CIM_DiagnosticTest.TestTypes shall be set to Health Check (value=4). * "Grown Defects" (value=11) is specified for the test that retrieves statistics (such as the number of remapped sectors) collected by the disk drive regarding its sector remap mechanism. CIM_DiagnosticTest.TestTypes shall be set to Stress (value=4). * "4K Alignment" (value=12) is specified for the test that verifies that blocks can be properly aligned on 4K boundaries. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2). * "Power Management" (value=13) is specified for the test that verify that all system interface for cables and connectors are working properly. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2). * "Performance" (value=14) is specified for the test that verifies that the disk operates within the vendor/product specific performance ranges for data read operation transfer rates, sequential seek times and random seek times. * "Conveyance" (value=15) is specified for testing for damage in transit. CIM_DiagnosticTest.TestTypes shall be set to Functional (value=2) and Stress (value=6).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Drive Test Type</em>' attribute.
	 * @see #setDiskDriveTestType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticTest_DiskDriveTestType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Short Self-Test\",\"Extended Self-Test\",\"Selective Self-Test\",\"Sequential Read\",\"Random Read\",\"Sequential Read-Write-Read Compare\",\"Random Read-Write-Read Compare\",\"Sequential Internal Verify\",\"Status\",\"Grown Defects\",\"4K Alignment\",\"Power Management\",\"Performance\",\"Conveyance\",\"Vendor Reserved\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticTest.OtherDiskDriveTestType\"]'"
	 * @generated
	 */
	Integer getDiskDriveTestType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveDiagnosticTest#getDiskDriveTestType <em>Disk Drive Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Drive Test Type</em>' attribute.
	 * @see #getDiskDriveTestType()
	 * @generated
	 */
	void setDiskDriveTestType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Disk Drive Test Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the test when the DiskDriveTestType property is set to 1 ("Other"). This property must be set to null when DiskDriveTestType is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Disk Drive Test Type</em>' attribute.
	 * @see #setOtherDiskDriveTestType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticTest_OtherDiskDriveTestType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticTest.DiskDriveTestType\"]'"
	 * @generated
	 */
	String getOtherDiskDriveTestType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveDiagnosticTest#getOtherDiskDriveTestType <em>Other Disk Drive Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Disk Drive Test Type</em>' attribute.
	 * @see #getOtherDiskDriveTestType()
	 * @generated
	 */
	void setOtherDiskDriveTestType(String value);

} // CIM_DiskDriveDiagnosticTest
