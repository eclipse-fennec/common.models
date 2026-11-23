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
 * A representation of the model object '<em><b>CIM Label Reader Stat Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistics for a LabelReader, related to read successes, failures and retries. The element whose statistics are described is associated using the relationship, ElementStatisticalData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LabelReaderStatData#getScanSuccesses <em>Scan Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LabelReaderStatData#getScanFailures <em>Scan Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LabelReaderStatData#getScanRetries <em>Scan Retries</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LabelReaderStatData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Device::StorageLib' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LabelReaderStatData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Scan Successes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successful physical label scans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Successes</em>' attribute.
	 * @see #setScanSuccesses(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LabelReaderStatData_ScanSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getScanSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LabelReaderStatData#getScanSuccesses <em>Scan Successes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Successes</em>' attribute.
	 * @see #getScanSuccesses()
	 * @generated
	 */
	void setScanSuccesses(Long value);

	/**
	 * Returns the value of the '<em><b>Scan Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of failed physical label scans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Failures</em>' attribute.
	 * @see #setScanFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LabelReaderStatData_ScanFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getScanFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LabelReaderStatData#getScanFailures <em>Scan Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Failures</em>' attribute.
	 * @see #getScanFailures()
	 * @generated
	 */
	void setScanFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Scan Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of retried physical label scans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Retries</em>' attribute.
	 * @see #setScanRetries(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LabelReaderStatData_ScanRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getScanRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LabelReaderStatData#getScanRetries <em>Scan Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Retries</em>' attribute.
	 * @see #getScanRetries()
	 * @generated
	 */
	void setScanRetries(Long value);

} // CIM_LabelReaderStatData
