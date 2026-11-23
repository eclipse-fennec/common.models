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
 * A representation of the model object '<em><b>CIM Media Physical Stat Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistics related to reading physical labels and picks/puts at a specific StorageMediaLocation, or for a specific piece of PhysicalMedia. Although the same class is used to represent this data, at the instance level the object holds information for the Location (independent of the Media), OR for the Media (independent of its StorageMediaLocation). This class is deprecated in lieu of MediaPhysicalStatData, to take advantage of the simplified key structure defined there.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getScanSuccesses <em>Scan Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getScanFailures <em>Scan Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getScanRetries <em>Scan Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPickSuccesses <em>Pick Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPickFailures <em>Pick Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPickRetries <em>Pick Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPutSuccesses <em>Put Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPutFailures <em>Put Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPutRetries <em>Put Retries</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_MediaPhysicalStatData\"]' Version='2.7.0' UMLPackagePath='CIM::Physical::StoragePackage' keys='PhysicalCreationClassName,Tag,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_MediaPhysicalStatInfo extends CIM_PhysicalStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Scan Successes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successful physical label scans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Successes</em>' attribute.
	 * @see #setScanSuccesses(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo_ScanSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MediaPhysicalStatData.ScanSuccesses\"]' Counter='true'"
	 * @generated
	 */
	Long getScanSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getScanSuccesses <em>Scan Successes</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo_ScanFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MediaPhysicalStatData.ScanFailures\"]' Counter='true'"
	 * @generated
	 */
	Long getScanFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getScanFailures <em>Scan Failures</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo_ScanRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MediaPhysicalStatData.ScanRetries\"]' Counter='true'"
	 * @generated
	 */
	Long getScanRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getScanRetries <em>Scan Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Retries</em>' attribute.
	 * @see #getScanRetries()
	 * @generated
	 */
	void setScanRetries(Long value);

	/**
	 * Returns the value of the '<em><b>Pick Successes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successful picks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pick Successes</em>' attribute.
	 * @see #setPickSuccesses(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo_PickSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MediaPhysicalStatData.PickSuccesses\"]' Counter='true'"
	 * @generated
	 */
	Long getPickSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPickSuccesses <em>Pick Successes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Successes</em>' attribute.
	 * @see #getPickSuccesses()
	 * @generated
	 */
	void setPickSuccesses(Long value);

	/**
	 * Returns the value of the '<em><b>Pick Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of failed picks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pick Failures</em>' attribute.
	 * @see #setPickFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo_PickFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MediaPhysicalStatData.PickFailures\"]' Counter='true'"
	 * @generated
	 */
	Long getPickFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPickFailures <em>Pick Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Failures</em>' attribute.
	 * @see #getPickFailures()
	 * @generated
	 */
	void setPickFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Pick Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of retried picks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pick Retries</em>' attribute.
	 * @see #setPickRetries(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo_PickRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MediaPhysicalStatData.PickRetries\"]' Counter='true'"
	 * @generated
	 */
	Long getPickRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPickRetries <em>Pick Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Retries</em>' attribute.
	 * @see #getPickRetries()
	 * @generated
	 */
	void setPickRetries(Long value);

	/**
	 * Returns the value of the '<em><b>Put Successes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successful puts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Put Successes</em>' attribute.
	 * @see #setPutSuccesses(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo_PutSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MediaPhysicalStatData.PutSuccesses\"]' Counter='true'"
	 * @generated
	 */
	Long getPutSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPutSuccesses <em>Put Successes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put Successes</em>' attribute.
	 * @see #getPutSuccesses()
	 * @generated
	 */
	void setPutSuccesses(Long value);

	/**
	 * Returns the value of the '<em><b>Put Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of failed puts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Put Failures</em>' attribute.
	 * @see #setPutFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo_PutFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MediaPhysicalStatData.PutFailures\"]' Counter='true'"
	 * @generated
	 */
	Long getPutFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPutFailures <em>Put Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put Failures</em>' attribute.
	 * @see #getPutFailures()
	 * @generated
	 */
	void setPutFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Put Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of retried puts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Put Retries</em>' attribute.
	 * @see #setPutRetries(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatInfo_PutRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MediaPhysicalStatData.PutRetries\"]' Counter='true'"
	 * @generated
	 */
	Long getPutRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatInfo#getPutRetries <em>Put Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put Retries</em>' attribute.
	 * @see #getPutRetries()
	 * @generated
	 */
	void setPutRetries(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1-3 reset the scan-related counters, 4-6 reset the 'pick'-related counters, and 7-9 reset the 'put'-related counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Element's instrumentation can also reset its internal processing and counters. The set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier on the method.
	 * @param SelectedCounter The counter to reset.
	 * <!-- end-model-doc -->
	 * @model SelectedCounterAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"All\",\"Scan Successes\",\"Scan Failures\",\"Scan Retries\",\"Pick Successes\",\"Pick Failures\",\"Pick Retries\",\"Put Successes\",\"Put Failures\",\"Put Retries\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_StatisticalData.ResetSelectedStats\"]'"
	 * @generated
	 */
	Long ResetCounter(Integer SelectedCounter);

} // CIM_MediaPhysicalStatInfo
