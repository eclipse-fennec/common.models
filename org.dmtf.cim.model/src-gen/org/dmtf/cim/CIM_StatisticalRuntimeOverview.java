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
 * A representation of the model object '<em><b>CIM Statistical Runtime Overview</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents statistical data and metrics that characterize the application as a whole. It exists only once per application system instance and provides primarily raw data for the monitoring of service levels. Therefore, the metrics presented are only a summary or overview of the application system behavior at a certain point of time. Instances are only available if the concerned application is running. Therefore, an instance of ApplicationSystem MUST exist when the instance of this class is created.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalRuntimeOverview#getLastActivity <em>Last Activity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalRuntimeOverview#getNumberOfActiveRequests <em>Number Of Active Requests</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalRuntimeOverview#getNumberOfActiveRequestors <em>Number Of Active Requestors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalRuntimeOverview#getAverageResponseTime <em>Average Response Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalRuntimeOverview()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::AppRuntime' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StatisticalRuntimeOverview extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Last Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time (date and time) when the most recent inbound activity was observed for the application. A value of all zeros indicates that no inbound activity has taken place since the application was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Activity</em>' attribute.
	 * @see #setLastActivity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalRuntimeOverview_LastActivity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastActivity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalRuntimeOverview#getLastActivity <em>Last Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Activity</em>' attribute.
	 * @see #getLastActivity()
	 * @generated
	 */
	void setLastActivity(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Active Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of requests currently being served. This is not the count of open connections! Very often it reflects the number of current user requests. Note that the semantics of a request are general enough to characterize the entire application system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Active Requests</em>' attribute.
	 * @see #setNumberOfActiveRequests(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalRuntimeOverview_NumberOfActiveRequests()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getNumberOfActiveRequests();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalRuntimeOverview#getNumberOfActiveRequests <em>Number Of Active Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Active Requests</em>' attribute.
	 * @see #getNumberOfActiveRequests()
	 * @generated
	 */
	void setNumberOfActiveRequests(Long value);

	/**
	 * Returns the value of the '<em><b>Number Of Active Requestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of active requestors in the application system. It may differ from the number of active requests (greater if a requestor has issued multiple requests, smaller if some of the requestors have no request running at the considered point in time). Very often it reflects the number of user logged on to the application system or the number of sessions being served by the system. 
	 * Note that the semantics of a requestor are general enough to characterize the entire application system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Active Requestors</em>' attribute.
	 * @see #setNumberOfActiveRequestors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalRuntimeOverview_NumberOfActiveRequestors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getNumberOfActiveRequestors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalRuntimeOverview#getNumberOfActiveRequestors <em>Number Of Active Requestors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Active Requestors</em>' attribute.
	 * @see #getNumberOfActiveRequestors()
	 * @generated
	 */
	void setNumberOfActiveRequestors(Long value);

	/**
	 * Returns the value of the '<em><b>Average Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average response time is the mean of a number of requests captured between StatisticTime and a close point in time in the past. This interval or duration, that the average depends on, is defined by the underlying implementation such that it still has a reasonable proximity to one point in time. The term average is not focused on averaging a number of requests but averaging a period of time. Therefore, the average does not relate to more than a couple of minutes and, consequently, AverageResponseTime has the notion of the response time at the point in time of StatisticTime. If the interval is too great, AverageResponseTime becomes meaningless for monitoring. If no response time can be determined, the value is 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Response Time</em>' attribute.
	 * @see #setAverageResponseTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalRuntimeOverview_AverageResponseTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getAverageResponseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalRuntimeOverview#getAverageResponseTime <em>Average Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Response Time</em>' attribute.
	 * @see #getAverageResponseTime()
	 * @generated
	 */
	void setAverageResponseTime(Long value);

} // CIM_StatisticalRuntimeOverview
