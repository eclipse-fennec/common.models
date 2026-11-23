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
 * A representation of the model object '<em><b>CIM J2ee Servlet Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeServletStats class defines the performance statistics that are provided by a Servlet component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeServletStats#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeServletStats#getServletTimeMaxTime <em>Servlet Time Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeServletStats#getServiceTimeMinTime <em>Service Time Min Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeServletStats#getServletTimeTotalTime <em>Servlet Time Total Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServletStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeServletStats extends CIM_J2eeStatistic {
	/**
	 * Returns the value of the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The execution time of the servlet's service method. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Time</em>' attribute.
	 * @see #setServiceTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServletStats_ServiceTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.32.1.1 getServiceTime|V1.0\"]'"
	 * @generated
	 */
	String getServiceTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeServletStats#getServiceTime <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Time</em>' attribute.
	 * @see #getServiceTime()
	 * @generated
	 */
	void setServiceTime(String value);

	/**
	 * Returns the value of the '<em><b>Servlet Time Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum execution time of the servlet's service method since the beginning of this measurement. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Servlet Time Max Time</em>' attribute.
	 * @see #setServletTimeMaxTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServletStats_ServletTimeMaxTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.2 getMaxTime|V1.0\"]'"
	 * @generated
	 */
	String getServletTimeMaxTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeServletStats#getServletTimeMaxTime <em>Servlet Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Time Max Time</em>' attribute.
	 * @see #getServletTimeMaxTime()
	 * @generated
	 */
	void setServletTimeMaxTime(String value);

	/**
	 * Returns the value of the '<em><b>Service Time Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum execution time of the servlet's service method since the beginning of this measurement. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Time Min Time</em>' attribute.
	 * @see #setServiceTimeMinTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServletStats_ServiceTimeMinTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.3 getMinTime|V1.0\"]'"
	 * @generated
	 */
	String getServiceTimeMinTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeServletStats#getServiceTimeMinTime <em>Service Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Time Min Time</em>' attribute.
	 * @see #getServiceTimeMinTime()
	 * @generated
	 */
	void setServiceTimeMinTime(String value);

	/**
	 * Returns the value of the '<em><b>Servlet Time Total Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total execution time of the servlet's service method since the beginning of this measurement. Dividing ServletTimeTotalTime by ServletTime will provide the average time spent executing the servlet's service method. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Servlet Time Total Time</em>' attribute.
	 * @see #setServletTimeTotalTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServletStats_ServletTimeTotalTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.4 getTotalTime|V1.0\"]'"
	 * @generated
	 */
	String getServletTimeTotalTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeServletStats#getServletTimeTotalTime <em>Servlet Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Time Total Time</em>' attribute.
	 * @see #getServletTimeTotalTime()
	 * @generated
	 */
	void setServletTimeTotalTime(String value);

} // CIM_J2eeServletStats
