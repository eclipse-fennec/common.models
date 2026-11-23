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
 * A representation of the model object '<em><b>CIM J2ee Connection Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The J2eeConnectionStats class defines the performance statistics that are provided by a connection. JCA and JDBC connection statistics are represented by this class. The semantics are determined by the class to which the ConnectionStats instance is associated via the CIM_ElementStatisticalData association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionStats#getWaitTime <em>Wait Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionStats#getWaitTimeMaxTime <em>Wait Time Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionStats#getWaitTimeMinTime <em>Wait Time Min Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionStats#getWaitTimeTotalTime <em>Wait Time Total Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionStats#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionStats#getUseTimeMaxTime <em>Use Time Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionStats#getUseTimeMinTime <em>Use Time Min Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeConnectionStats#getUseTimeTotalTime <em>Use Time Total Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeConnectionStats extends CIM_J2eeStatistic {
	/**
	 * Returns the value of the '<em><b>Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time spent waiting for a connection to be available. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait Time</em>' attribute.
	 * @see #setWaitTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionStats_WaitTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.19.1.3 getWaitTime|V1.0\"]'"
	 * @generated
	 */
	String getWaitTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionStats#getWaitTime <em>Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Time</em>' attribute.
	 * @see #getWaitTime()
	 * @generated
	 */
	void setWaitTime(String value);

	/**
	 * Returns the value of the '<em><b>Wait Time Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum amount of time spent waiting for a connection to be available since the beginning of this measurement. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait Time Max Time</em>' attribute.
	 * @see #setWaitTimeMaxTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionStats_WaitTimeMaxTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.2 getMaxTime|V1.0\"]'"
	 * @generated
	 */
	String getWaitTimeMaxTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionStats#getWaitTimeMaxTime <em>Wait Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Time Max Time</em>' attribute.
	 * @see #getWaitTimeMaxTime()
	 * @generated
	 */
	void setWaitTimeMaxTime(String value);

	/**
	 * Returns the value of the '<em><b>Wait Time Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum amount of time spent waiting for a connection to be available since the beginning of this measurement. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait Time Min Time</em>' attribute.
	 * @see #setWaitTimeMinTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionStats_WaitTimeMinTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.3 getMinTime|V1.0\"]'"
	 * @generated
	 */
	String getWaitTimeMinTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionStats#getWaitTimeMinTime <em>Wait Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Time Min Time</em>' attribute.
	 * @see #getWaitTimeMinTime()
	 * @generated
	 */
	void setWaitTimeMinTime(String value);

	/**
	 * Returns the value of the '<em><b>Wait Time Total Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount of time spent waiting for a connection to be available since the beginning of this measurement. Dividing WaitTimeTotalTime by WaitTime will provide the average time spent waiting for a connection. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait Time Total Time</em>' attribute.
	 * @see #setWaitTimeTotalTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionStats_WaitTimeTotalTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.4 getTotalTime|V1.0\"]'"
	 * @generated
	 */
	String getWaitTimeTotalTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionStats#getWaitTimeTotalTime <em>Wait Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Time Total Time</em>' attribute.
	 * @see #getWaitTimeTotalTime()
	 * @generated
	 */
	void setWaitTimeTotalTime(String value);

	/**
	 * Returns the value of the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time spent using a connection. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Time</em>' attribute.
	 * @see #setUseTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionStats_UseTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.19.1.3 getUseTime|V1.0\"]'"
	 * @generated
	 */
	String getUseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionStats#getUseTime <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time</em>' attribute.
	 * @see #getUseTime()
	 * @generated
	 */
	void setUseTime(String value);

	/**
	 * Returns the value of the '<em><b>Use Time Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum amount of time spent using a connection since the beginning of this measurement. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Time Max Time</em>' attribute.
	 * @see #setUseTimeMaxTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionStats_UseTimeMaxTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.2 getMaxTime|V1.0\"]'"
	 * @generated
	 */
	String getUseTimeMaxTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionStats#getUseTimeMaxTime <em>Use Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time Max Time</em>' attribute.
	 * @see #getUseTimeMaxTime()
	 * @generated
	 */
	void setUseTimeMaxTime(String value);

	/**
	 * Returns the value of the '<em><b>Use Time Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum amount of time spent using a connection since the beginning of this measurement. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Time Min Time</em>' attribute.
	 * @see #setUseTimeMinTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionStats_UseTimeMinTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.3 getMinTime|V1.0\"]'"
	 * @generated
	 */
	String getUseTimeMinTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionStats#getUseTimeMinTime <em>Use Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time Min Time</em>' attribute.
	 * @see #getUseTimeMinTime()
	 * @generated
	 */
	void setUseTimeMinTime(String value);

	/**
	 * Returns the value of the '<em><b>Use Time Total Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount of time spent using a connection since the beginning of this measurement. Dividing UseTimeTotalTime by UseTime will provide the average time spent using a connection. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Time Total Time</em>' attribute.
	 * @see #setUseTimeTotalTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionStats_UseTimeTotalTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.4 getTotalTime|V1.0\"]'"
	 * @generated
	 */
	String getUseTimeTotalTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeConnectionStats#getUseTimeTotalTime <em>Use Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time Total Time</em>' attribute.
	 * @see #getUseTimeTotalTime()
	 * @generated
	 */
	void setUseTimeTotalTime(String value);

} // CIM_J2eeConnectionStats
