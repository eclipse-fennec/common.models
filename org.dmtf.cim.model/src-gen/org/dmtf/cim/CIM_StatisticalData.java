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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_StatisticalData is a root class for any arbitrary collection of statistical data and/or metrics applicable to one or more ManagedElements. These statistics MUST represent the most recent observations and MUST NOT be provided if irrelevant or stale. Note that this class uses a simplified naming/identity algorithm as compared to CIM_StatisticalInformation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalData#getStartStatisticTime <em>Start Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalData#getStatisticTime <em>Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalData#getSampleInterval <em>Sample Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalData#getRateIntervalEndTime <em>Rate Interval End Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticalData#getRateIntervalStartTime <em>Rate Interval Start Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalData()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Core::Statistics' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' override.ElementName='string' override.ElementName.Required='true' override.ElementName.Description='The user friendly name for this instance of StatisticalData. In addition, the user friendly name can be used as a index property for a search of query. (Note: Name does not have to be unique within a namespace.)' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StatisticalData extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Start Statistic Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time, relative to managed element where the statistic was collected, when the first measurement was taken. If the statistic is reset, the StartStatisticTime is the time when the reset was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Statistic Time</em>' attribute.
	 * @see #setStartStatisticTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalData_StartStatisticTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getStartStatisticTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalData#getStartStatisticTime <em>Start Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Statistic Time</em>' attribute.
	 * @see #getStartStatisticTime()
	 * @generated
	 */
	void setStartStatisticTime(String value);

	/**
	 * Returns the value of the '<em><b>Statistic Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time the most recent measurement was taken, relative to the managed element where the statistic was collected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statistic Time</em>' attribute.
	 * @see #setStatisticTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalData_StatisticTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getStatisticTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalData#getStatisticTime <em>Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistic Time</em>' attribute.
	 * @see #getStatisticTime()
	 * @generated
	 */
	void setStatisticTime(String value);

	/**
	 * Returns the value of the '<em><b>Sample Interval</b></em>' attribute.
	 * The default value is <code>"00000000000000.000000:000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some statistics are sampled at consistent time intervals. This property provides the sample interval so that client applications can determine the minimum time that new statistics should be pulled. If the statistics are not sampled at consistent time intervals, this property must be set to a zero time interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sample Interval</em>' attribute.
	 * @see #setSampleInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalData_SampleInterval()
	 * @model default="00000000000000.000000:000"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getSampleInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalData#getSampleInterval <em>Sample Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Interval</em>' attribute.
	 * @see #getSampleInterval()
	 * @generated
	 */
	void setSampleInterval(String value);

	/**
	 * Returns the value of the '<em><b>Rate Interval End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end time for the rate data interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Interval End Time</em>' attribute.
	 * @see #setRateIntervalEndTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalData_RateIntervalEndTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getRateIntervalEndTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalData#getRateIntervalEndTime <em>Rate Interval End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Interval End Time</em>' attribute.
	 * @see #getRateIntervalEndTime()
	 * @generated
	 */
	void setRateIntervalEndTime(String value);

	/**
	 * Returns the value of the '<em><b>Rate Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start time for the rate data interval. Rate indicates the number of data points per second - for example, number of read I/Os per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Interval Start Time</em>' attribute.
	 * @see #setRateIntervalStartTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticalData_RateIntervalStartTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getRateIntervalStartTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticalData#getRateIntervalStartTime <em>Rate Interval Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Interval Start Time</em>' attribute.
	 * @see #getRateIntervalStartTime()
	 * @generated
	 */
	void setRateIntervalStartTime(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to reset one or more of the instance's statistics. The method takes one parameter as input - an array of strings indicating which statistics to reset. If all the statistics in the instance should be reset, the first element of the array MUST be set to "All" or "ALL". If one or more individual statistics should be reset, the corresponding property names are entered into the elements of the array. 
	 * The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the StatisticalInformation's provider/ instrumentation, which calculates the statistics, can reset its internal processing, counters, etc. 
	 * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param SelectedStatistics Array of strings indicating which statistics to reset.
	 * <!-- end-model-doc -->
	 * @model SelectedStatisticsUnique="false" SelectedStatisticsMany="true"
	 *        SelectedStatisticsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ResetSelectedStats(EList<String> SelectedStatistics);

} // CIM_StatisticalData
