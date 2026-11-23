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
 * A representation of the model object '<em><b>CIM Media Physical Stat Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistics related to reading physical labels and picks/puts at a specific StorageMediaLocation, or for a specific piece of PhysicalMedia. The same class is used to represent this data - whether for a Location (independent of the Media), OR for the Media (independent of its StorageMediaLocation). The element whose statistics are described is associated using the relationship, ElementStatisticalData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getScanSuccesses <em>Scan Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getScanFailures <em>Scan Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getScanRetries <em>Scan Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPickSuccesses <em>Pick Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPickFailures <em>Pick Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPickRetries <em>Pick Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPutSuccesses <em>Put Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPutFailures <em>Put Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPutRetries <em>Put Retries</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Physical::StoragePackage' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_MediaPhysicalStatData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Scan Successes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successful physical label scans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Successes</em>' attribute.
	 * @see #setScanSuccesses(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData_ScanSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getScanSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getScanSuccesses <em>Scan Successes</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData_ScanFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getScanFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getScanFailures <em>Scan Failures</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData_ScanRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getScanRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getScanRetries <em>Scan Retries</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData_PickSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPickSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPickSuccesses <em>Pick Successes</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData_PickFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPickFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPickFailures <em>Pick Failures</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData_PickRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPickRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPickRetries <em>Pick Retries</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData_PutSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPutSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPutSuccesses <em>Put Successes</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData_PutFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPutFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPutFailures <em>Put Failures</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPhysicalStatData_PutRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPutRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPhysicalStatData#getPutRetries <em>Put Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put Retries</em>' attribute.
	 * @see #getPutRetries()
	 * @generated
	 */
	void setPutRetries(Long value);

} // CIM_MediaPhysicalStatData
