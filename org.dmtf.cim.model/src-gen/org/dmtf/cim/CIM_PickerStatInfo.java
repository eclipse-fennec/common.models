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
 * A representation of the model object '<em><b>CIM Picker Stat Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistics for a PickerElement, related to pick/put successes, retries and failures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PickerStatInfo#getPickSuccesses <em>Pick Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PickerStatInfo#getPickFailures <em>Pick Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PickerStatInfo#getPickRetries <em>Pick Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PickerStatInfo#getPutSuccesses <em>Put Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PickerStatInfo#getPutFailures <em>Put Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PickerStatInfo#getPutRetries <em>Put Retries</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PickerStatInfo()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' keys='SystemCreationClassName,SystemName,DeviceCreationClassName,DeviceID,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PickerStatInfo extends CIM_DeviceStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Pick Successes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successful picks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pick Successes</em>' attribute.
	 * @see #setPickSuccesses(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PickerStatInfo_PickSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPickSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PickerStatInfo#getPickSuccesses <em>Pick Successes</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_PickerStatInfo_PickFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPickFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PickerStatInfo#getPickFailures <em>Pick Failures</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_PickerStatInfo_PickRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPickRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PickerStatInfo#getPickRetries <em>Pick Retries</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_PickerStatInfo_PutSuccesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPutSuccesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PickerStatInfo#getPutSuccesses <em>Put Successes</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_PickerStatInfo_PutFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPutFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PickerStatInfo#getPutFailures <em>Put Failures</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_PickerStatInfo_PutRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPutRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PickerStatInfo#getPutRetries <em>Put Retries</em>}' attribute.
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
	 * Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1-3 reset the 'pick'-related counters, and 4-6 reset the 'put'- related counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation can also reset its internal pocessing and counters. 
	 * In a subclass, the set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can be specified as a Values array qualifier.
	 * @param SelectedCounter This parameter indicates the counter to reset.
	 * <!-- end-model-doc -->
	 * @model SelectedCounterAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"All\",\"Pick Successes\",\"Pick Failures\",\"Pick Retries\",\"Put Successes\",\"Put Failures\",\"Put Retries\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ResetCounter(Integer SelectedCounter);

} // CIM_PickerStatInfo
