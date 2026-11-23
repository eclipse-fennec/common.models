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
 * A representation of the model object '<em><b>CIM Label Reader Stat Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistics for a LabelReader, related to read successes, failures and retries.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LabelReaderStatInfo#getScanSuccesses <em>Scan Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LabelReaderStatInfo#getScanFailures <em>Scan Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LabelReaderStatInfo#getScanRetries <em>Scan Retries</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LabelReaderStatInfo()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' keys='SystemCreationClassName,SystemName,DeviceCreationClassName,DeviceID,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_LabelReaderStatInfo extends CIM_DeviceStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Scan Successes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successful physical label scans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Successes</em>' attribute.
	 * @see #setScanSuccesses(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LabelReaderStatInfo_ScanSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getScanSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LabelReaderStatInfo#getScanSuccesses <em>Scan Successes</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_LabelReaderStatInfo_ScanFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getScanFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LabelReaderStatInfo#getScanFailures <em>Scan Failures</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_LabelReaderStatInfo_ScanRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getScanRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LabelReaderStatInfo#getScanRetries <em>Scan Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Retries</em>' attribute.
	 * @see #getScanRetries()
	 * @generated
	 */
	void setScanRetries(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1 resets the "Scan Successes" counter, 2 resets the "Scan Failures" counter, and 3 resets the "Scan Retries" counter. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation can also reset its internal processing and counters. 
	 * In a subclass, the set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can be specified as a Values array qualifier.
	 * @param SelectedCounter The counter to reset.
	 * <!-- end-model-doc -->
	 * @model SelectedCounterAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"All\",\"Scan Successes\",\"Scan Failures\",\"Scan Retries\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ResetCounter(Integer SelectedCounter);

} // CIM_LabelReaderStatInfo
