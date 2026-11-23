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
 * A representation of the model object '<em><b>CIM J2ee Entity Bean Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The J2eeEntityBeanStats class defines the performance statistics that are provided by entity beans.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getReadyCount <em>Ready Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getReadyLowWaterMark <em>Ready Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getReadyHighWaterMark <em>Ready High Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getPooledCount <em>Pooled Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getPooledLowWaterMark <em>Pooled Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getPooledHighWaterMark <em>Pooled High Water Mark</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEntityBeanStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeEntityBeanStats extends CIM_J2eeEJBStats {
	/**
	 * Returns the value of the '<em><b>Ready Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bean instances in the ready state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ready Count</em>' attribute.
	 * @see #setReadyCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEntityBeanStats_ReadyCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.12.1.1 getReadyCount|V1.0\"]'"
	 * @generated
	 */
	Long getReadyCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getReadyCount <em>Ready Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ready Count</em>' attribute.
	 * @see #getReadyCount()
	 * @generated
	 */
	void setReadyCount(Long value);

	/**
	 * Returns the value of the '<em><b>Ready Low Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lowest number of bean instances in the ready state since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ready Low Water Mark</em>' attribute.
	 * @see #setReadyLowWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEntityBeanStats_ReadyLowWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.2 getLowWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getReadyLowWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getReadyLowWaterMark <em>Ready Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ready Low Water Mark</em>' attribute.
	 * @see #getReadyLowWaterMark()
	 * @generated
	 */
	void setReadyLowWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Ready High Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The highest number of bean instances in the ready state since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ready High Water Mark</em>' attribute.
	 * @see #setReadyHighWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEntityBeanStats_ReadyHighWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.1 getHighWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getReadyHighWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getReadyHighWaterMark <em>Ready High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ready High Water Mark</em>' attribute.
	 * @see #getReadyHighWaterMark()
	 * @generated
	 */
	void setReadyHighWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Pooled Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bean instances in the pooled state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pooled Count</em>' attribute.
	 * @see #setPooledCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEntityBeanStats_PooledCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.12.1.2 getPooledCount|V1.0\"]'"
	 * @generated
	 */
	Long getPooledCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getPooledCount <em>Pooled Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pooled Count</em>' attribute.
	 * @see #getPooledCount()
	 * @generated
	 */
	void setPooledCount(Long value);

	/**
	 * Returns the value of the '<em><b>Pooled Low Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lowest number of bean instances in the pooled state since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pooled Low Water Mark</em>' attribute.
	 * @see #setPooledLowWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEntityBeanStats_PooledLowWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.2 getLowWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getPooledLowWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getPooledLowWaterMark <em>Pooled Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pooled Low Water Mark</em>' attribute.
	 * @see #getPooledLowWaterMark()
	 * @generated
	 */
	void setPooledLowWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Pooled High Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The highest number of bean instances in the pooled state since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pooled High Water Mark</em>' attribute.
	 * @see #setPooledHighWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEntityBeanStats_PooledHighWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.1 getHighWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getPooledHighWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeEntityBeanStats#getPooledHighWaterMark <em>Pooled High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pooled High Water Mark</em>' attribute.
	 * @see #getPooledHighWaterMark()
	 * @generated
	 */
	void setPooledHighWaterMark(Long value);

} // CIM_J2eeEntityBeanStats
