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
 * A representation of the model object '<em><b>CIM J2ee Connection Pool Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The J2eeConnectionPoolStats class defines the performance statistics that are provided by a connection pool. JCA and JDBC connection pool statistics are represented by this class. The semantics are determined by the class to which the ConnectionStats instance is associated via the CIM_ElementStatisticalData association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getCloseCount <em>Close Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getCreateCount <em>Create Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSize <em>Free Pool Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSizeUpperBound <em>Free Pool Size Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSizeLowerBound <em>Free Pool Size Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSizeLowWaterMark <em>Free Pool Size Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSizeHighWaterMark <em>Free Pool Size High Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSizeUpperBound <em>Pool Size Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSizeLowerBound <em>Pool Size Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSizeLowWaterMark <em>Pool Size Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSizeHighWaterMark <em>Pool Size High Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCount <em>Waiting Thread Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCountUpperBound <em>Waiting Thread Count Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCountLowerBound <em>Waiting Thread Count Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCountLowWaterMark <em>Waiting Thread Count Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCountHighWaterMark <em>Waiting Thread Count High Water Mark</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeConnectionPoolStats extends CIM_J2eeConnectionStats {
	/**
	 * Returns the value of the '<em><b>Close Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of connections closed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Close Count</em>' attribute.
	 * @see #setCloseCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_CloseCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.20.1.1 getCloseCount|V1.0\"]'"
	 * @generated
	 */
	Long getCloseCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getCloseCount <em>Close Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Count</em>' attribute.
	 * @see #getCloseCount()
	 * @generated
	 */
	void setCloseCount(Long value);

	/**
	 * Returns the value of the '<em><b>Create Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of connections created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Create Count</em>' attribute.
	 * @see #setCreateCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_CreateCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.20.1.2 getCreateCount|V1.0\"]'"
	 * @generated
	 */
	Long getCreateCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getCreateCount <em>Create Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Count</em>' attribute.
	 * @see #getCreateCount()
	 * @generated
	 */
	void setCreateCount(Long value);

	/**
	 * Returns the value of the '<em><b>Free Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of free connections in the pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Pool Size</em>' attribute.
	 * @see #setFreePoolSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_FreePoolSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Gauge='true' MappingStrings='[\"JSR77.JCP|JSR77.6.20.1.3 getFreePoolSize|V1.0\"]'"
	 * @generated
	 */
	Long getFreePoolSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSize <em>Free Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Pool Size</em>' attribute.
	 * @see #getFreePoolSize()
	 * @generated
	 */
	void setFreePoolSize(Long value);

	/**
	 * Returns the value of the '<em><b>Free Pool Size Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper limit for the number of free connections in the pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Pool Size Upper Bound</em>' attribute.
	 * @see #setFreePoolSizeUpperBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_FreePoolSizeUpperBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.8.1.1 getUpperBound|V1.0\"]'"
	 * @generated
	 */
	Long getFreePoolSizeUpperBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSizeUpperBound <em>Free Pool Size Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Pool Size Upper Bound</em>' attribute.
	 * @see #getFreePoolSizeUpperBound()
	 * @generated
	 */
	void setFreePoolSizeUpperBound(Long value);

	/**
	 * Returns the value of the '<em><b>Free Pool Size Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower limit for the number of free connections in the pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Pool Size Lower Bound</em>' attribute.
	 * @see #setFreePoolSizeLowerBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_FreePoolSizeLowerBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.8.1.2 getLowerBound|V1.0\"]'"
	 * @generated
	 */
	Long getFreePoolSizeLowerBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSizeLowerBound <em>Free Pool Size Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Pool Size Lower Bound</em>' attribute.
	 * @see #getFreePoolSizeLowerBound()
	 * @generated
	 */
	void setFreePoolSizeLowerBound(Long value);

	/**
	 * Returns the value of the '<em><b>Free Pool Size Low Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lowest number of free connections in the pool since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Pool Size Low Water Mark</em>' attribute.
	 * @see #setFreePoolSizeLowWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_FreePoolSizeLowWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.2 getLowWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getFreePoolSizeLowWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSizeLowWaterMark <em>Free Pool Size Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Pool Size Low Water Mark</em>' attribute.
	 * @see #getFreePoolSizeLowWaterMark()
	 * @generated
	 */
	void setFreePoolSizeLowWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Free Pool Size High Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The highest number of free connections in the pool since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Pool Size High Water Mark</em>' attribute.
	 * @see #setFreePoolSizeHighWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_FreePoolSizeHighWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.1 getHighWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getFreePoolSizeHighWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getFreePoolSizeHighWaterMark <em>Free Pool Size High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Pool Size High Water Mark</em>' attribute.
	 * @see #getFreePoolSizeHighWaterMark()
	 * @generated
	 */
	void setFreePoolSizeHighWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the connection pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pool Size</em>' attribute.
	 * @see #setPoolSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_PoolSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Gauge='true' MappingStrings='[\"JSR77.JCP|JSR77.6.20.1.4 getPoolSize|V1.0\"]'"
	 * @generated
	 */
	Long getPoolSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSize <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size</em>' attribute.
	 * @see #getPoolSize()
	 * @generated
	 */
	void setPoolSize(Long value);

	/**
	 * Returns the value of the '<em><b>Pool Size Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper limit for the size of the connection pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pool Size Upper Bound</em>' attribute.
	 * @see #setPoolSizeUpperBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_PoolSizeUpperBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.8.1.1 getUpperBound|V1.0\"]'"
	 * @generated
	 */
	Long getPoolSizeUpperBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSizeUpperBound <em>Pool Size Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size Upper Bound</em>' attribute.
	 * @see #getPoolSizeUpperBound()
	 * @generated
	 */
	void setPoolSizeUpperBound(Long value);

	/**
	 * Returns the value of the '<em><b>Pool Size Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower limit for the size of the connection pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pool Size Lower Bound</em>' attribute.
	 * @see #setPoolSizeLowerBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_PoolSizeLowerBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.8.1.2 getLowerBound|V1.0\"]'"
	 * @generated
	 */
	Long getPoolSizeLowerBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSizeLowerBound <em>Pool Size Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size Lower Bound</em>' attribute.
	 * @see #getPoolSizeLowerBound()
	 * @generated
	 */
	void setPoolSizeLowerBound(Long value);

	/**
	 * Returns the value of the '<em><b>Pool Size Low Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lowest size of the connection pool since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pool Size Low Water Mark</em>' attribute.
	 * @see #setPoolSizeLowWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_PoolSizeLowWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.2 getLowWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getPoolSizeLowWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSizeLowWaterMark <em>Pool Size Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size Low Water Mark</em>' attribute.
	 * @see #getPoolSizeLowWaterMark()
	 * @generated
	 */
	void setPoolSizeLowWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Pool Size High Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The largest size of the connection pool since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pool Size High Water Mark</em>' attribute.
	 * @see #setPoolSizeHighWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_PoolSizeHighWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.1 getHighWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getPoolSizeHighWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getPoolSizeHighWaterMark <em>Pool Size High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size High Water Mark</em>' attribute.
	 * @see #getPoolSizeHighWaterMark()
	 * @generated
	 */
	void setPoolSizeHighWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Waiting Thread Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of threads waiting for a connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Waiting Thread Count</em>' attribute.
	 * @see #setWaitingThreadCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_WaitingThreadCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Gauge='true' MappingStrings='[\"JSR77.JCP|JSR77.6.20.1.5 getWaitingThreadCount|V1.0\"]'"
	 * @generated
	 */
	Long getWaitingThreadCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCount <em>Waiting Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Thread Count</em>' attribute.
	 * @see #getWaitingThreadCount()
	 * @generated
	 */
	void setWaitingThreadCount(Long value);

	/**
	 * Returns the value of the '<em><b>Waiting Thread Count Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper limit for the number of threads waiting for a connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Waiting Thread Count Upper Bound</em>' attribute.
	 * @see #setWaitingThreadCountUpperBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_WaitingThreadCountUpperBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.8.1.1 getUpperBound|V1.0\"]'"
	 * @generated
	 */
	Long getWaitingThreadCountUpperBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCountUpperBound <em>Waiting Thread Count Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Thread Count Upper Bound</em>' attribute.
	 * @see #getWaitingThreadCountUpperBound()
	 * @generated
	 */
	void setWaitingThreadCountUpperBound(Long value);

	/**
	 * Returns the value of the '<em><b>Waiting Thread Count Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower limit for the number of threads waiting for a connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Waiting Thread Count Lower Bound</em>' attribute.
	 * @see #setWaitingThreadCountLowerBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_WaitingThreadCountLowerBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.8.1.2 getLowerBound|V1.0\"]'"
	 * @generated
	 */
	Long getWaitingThreadCountLowerBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCountLowerBound <em>Waiting Thread Count Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Thread Count Lower Bound</em>' attribute.
	 * @see #getWaitingThreadCountLowerBound()
	 * @generated
	 */
	void setWaitingThreadCountLowerBound(Long value);

	/**
	 * Returns the value of the '<em><b>Waiting Thread Count Low Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lowest number of threads waiting for a connection since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Waiting Thread Count Low Water Mark</em>' attribute.
	 * @see #setWaitingThreadCountLowWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_WaitingThreadCountLowWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.2 getLowWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getWaitingThreadCountLowWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCountLowWaterMark <em>Waiting Thread Count Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Thread Count Low Water Mark</em>' attribute.
	 * @see #getWaitingThreadCountLowWaterMark()
	 * @generated
	 */
	void setWaitingThreadCountLowWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Waiting Thread Count High Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The highest number of threads waiting for a connection since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Waiting Thread Count High Water Mark</em>' attribute.
	 * @see #setWaitingThreadCountHighWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionPoolStats_WaitingThreadCountHighWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.1 getHighWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getWaitingThreadCountHighWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionPoolStats#getWaitingThreadCountHighWaterMark <em>Waiting Thread Count High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Thread Count High Water Mark</em>' attribute.
	 * @see #getWaitingThreadCountHighWaterMark()
	 * @generated
	 */
	void setWaitingThreadCountHighWaterMark(Long value);

} // CIM_J2eeConnectionPoolStats
