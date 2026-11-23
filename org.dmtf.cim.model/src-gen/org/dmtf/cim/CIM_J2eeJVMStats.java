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
 * A representation of the model object '<em><b>CIM J2ee JVM Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeJVMStats class defines the performance statistics that are provided by a Java VM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSize <em>Heap Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSizeUpperBound <em>Heap Size Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSizeLowerBound <em>Heap Size Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSizeLowWaterMark <em>Heap Size Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSizeHighWaterMark <em>Heap Size High Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJVMStats#getUpTime <em>Up Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVMStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.2' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJVMStats extends CIM_J2eeStatistic {
	/**
	 * Returns the value of the '<em><b>Heap Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The heap size of the JVM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heap Size</em>' attribute.
	 * @see #setHeapSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVMStats_HeapSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Gauge='true' MappingStrings='[\"JSR77.JCP|JSR77.6.31.1.1 getHeapSize|V1.0\"]' PUnit='byte'"
	 * @generated
	 */
	Long getHeapSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSize <em>Heap Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Size</em>' attribute.
	 * @see #getHeapSize()
	 * @generated
	 */
	void setHeapSize(Long value);

	/**
	 * Returns the value of the '<em><b>Heap Size Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper limit for the heap size of the JVM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heap Size Upper Bound</em>' attribute.
	 * @see #setHeapSizeUpperBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVMStats_HeapSizeUpperBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"JSR77.JCP|JSR77.6.8.1.1 getUpperBound|V1.0\"]' PUnit='byte'"
	 * @generated
	 */
	Long getHeapSizeUpperBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSizeUpperBound <em>Heap Size Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Size Upper Bound</em>' attribute.
	 * @see #getHeapSizeUpperBound()
	 * @generated
	 */
	void setHeapSizeUpperBound(Long value);

	/**
	 * Returns the value of the '<em><b>Heap Size Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower limit for the heap size of the JVM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heap Size Lower Bound</em>' attribute.
	 * @see #setHeapSizeLowerBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVMStats_HeapSizeLowerBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"JSR77.JCP|JSR77.6.8.1.2 getLowerBound|V1.0\"]' PUnit='byte'"
	 * @generated
	 */
	Long getHeapSizeLowerBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSizeLowerBound <em>Heap Size Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Size Lower Bound</em>' attribute.
	 * @see #getHeapSizeLowerBound()
	 * @generated
	 */
	void setHeapSizeLowerBound(Long value);

	/**
	 * Returns the value of the '<em><b>Heap Size Low Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The smallest size of the JVM heap since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heap Size Low Water Mark</em>' attribute.
	 * @see #setHeapSizeLowWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVMStats_HeapSizeLowWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.2 getLowWaterMark|V1.0\"]' PUnit='byte'"
	 * @generated
	 */
	Long getHeapSizeLowWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSizeLowWaterMark <em>Heap Size Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Size Low Water Mark</em>' attribute.
	 * @see #getHeapSizeLowWaterMark()
	 * @generated
	 */
	void setHeapSizeLowWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Heap Size High Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The largest size of the JVM heap since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heap Size High Water Mark</em>' attribute.
	 * @see #setHeapSizeHighWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVMStats_HeapSizeHighWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.1 getHighWaterMark|V1.0\"]' PUnit='byte'"
	 * @generated
	 */
	Long getHeapSizeHighWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJVMStats#getHeapSizeHighWaterMark <em>Heap Size High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Size High Water Mark</em>' attribute.
	 * @see #getHeapSizeHighWaterMark()
	 * @generated
	 */
	void setHeapSizeHighWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Up Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time the JVM has been running. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Up Time</em>' attribute.
	 * @see #setUpTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVMStats_UpTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.31.1.2 getUpTime|V1.0\"]'"
	 * @generated
	 */
	String getUpTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJVMStats#getUpTime <em>Up Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up Time</em>' attribute.
	 * @see #getUpTime()
	 * @generated
	 */
	void setUpTime(String value);

} // CIM_J2eeJVMStats
