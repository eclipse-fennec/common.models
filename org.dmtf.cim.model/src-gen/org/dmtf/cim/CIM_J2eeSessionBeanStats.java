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
 * A representation of the model object '<em><b>CIM J2ee Session Bean Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The J2eeSessionBeanStats class is a base class that defines the performance statistics that are provided by both stateful and stateless session beans.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeSessionBeanStats#getMethodReadyCount <em>Method Ready Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeSessionBeanStats#getMethodReadyLowWaterMark <em>Method Ready Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeSessionBeanStats#getMethodReadyHighWaterMark <em>Method Ready High Water Mark</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeSessionBeanStats()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeSessionBeanStats extends CIM_J2eeEJBStats {
	/**
	 * Returns the value of the '<em><b>Method Ready Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bean instances in the method-ready state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Ready Count</em>' attribute.
	 * @see #setMethodReadyCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeSessionBeanStats_MethodReadyCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.14.1.1 getMethodReadyCount|V1.0\"]'"
	 * @generated
	 */
	Long getMethodReadyCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeSessionBeanStats#getMethodReadyCount <em>Method Ready Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Ready Count</em>' attribute.
	 * @see #getMethodReadyCount()
	 * @generated
	 */
	void setMethodReadyCount(Long value);

	/**
	 * Returns the value of the '<em><b>Method Ready Low Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lowest number of bean instances in the method-ready state since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Ready Low Water Mark</em>' attribute.
	 * @see #setMethodReadyLowWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeSessionBeanStats_MethodReadyLowWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.2 getLowWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getMethodReadyLowWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeSessionBeanStats#getMethodReadyLowWaterMark <em>Method Ready Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Ready Low Water Mark</em>' attribute.
	 * @see #getMethodReadyLowWaterMark()
	 * @generated
	 */
	void setMethodReadyLowWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Method Ready High Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The highest number of bean instances in the method-ready state since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Ready High Water Mark</em>' attribute.
	 * @see #setMethodReadyHighWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeSessionBeanStats_MethodReadyHighWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.1 getHighWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getMethodReadyHighWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeSessionBeanStats#getMethodReadyHighWaterMark <em>Method Ready High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Ready High Water Mark</em>' attribute.
	 * @see #getMethodReadyHighWaterMark()
	 * @generated
	 */
	void setMethodReadyHighWaterMark(Long value);

} // CIM_J2eeSessionBeanStats
