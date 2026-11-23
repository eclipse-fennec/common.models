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
 * A representation of the model object '<em><b>CIM Disk Drive Diagnostic Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the permissible settings that can be used for disk drive diagnostic tests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticServiceCapabilities#getRegion <em>Region</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticServiceCapabilities#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticServiceCapabilities#getDataSizes <em>Data Sizes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDriveDiagnosticServiceCapabilities#getDataPatterns <em>Data Patterns</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::Diagnostics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiskDriveDiagnosticServiceCapabilities extends CIM_DiagnosticServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used by a provider to define whether or not the client can specify start and end disk sectors for the region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticServiceCapabilities_Region()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticSettingData.LBAStart\",\"CIM_DiskDriveDiagnosticSettingData.LBAEnd\"]'"
	 * @generated
	 */
	Boolean getRegion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveDiagnosticServiceCapabilities#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used by a provider to define whether or not the client can specify the seed for the tests that generate a random number sequence for testing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seed</em>' attribute.
	 * @see #setSeed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticServiceCapabilities_Seed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticSettingData.Seed\"]'"
	 * @generated
	 */
	Boolean getSeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDriveDiagnosticServiceCapabilities#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data Sizes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array property is used by a provider to define the list of data sizes supported by the test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Sizes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticServiceCapabilities_DataSizes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticSettingData.DataSizes\"]' PUnit='Bytes'"
	 * @generated
	 */
	EList<Long> getDataSizes();

	/**
	 * Returns the value of the '<em><b>Data Patterns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array property is used by a provider to define the list of data patterns supported by the test. A data pattern is a string interpreted as a 16-digit hex value. For example, a data pattern of all ones would be FFFFFFFFFFFFFFFF while alternating ones and zeros would be 5555555555555555 or AAAAAAAAAAAAAAAA . The pattern will be repeated as necessary to fill the specified data buffer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Patterns</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDriveDiagnosticServiceCapabilities_DataPatterns()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_DiskDriveDiagnosticSettingData.DataPatterns\"]'"
	 * @generated
	 */
	EList<String> getDataPatterns();

} // CIM_DiskDriveDiagnosticServiceCapabilities
