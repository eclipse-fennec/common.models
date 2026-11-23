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
 * A representation of the model object '<em><b>CIM Base Metric Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each CIM_BaseMetricValue object represents the instance value of a metric. Since the gathering of metric information can involve large quantities of information there may be many instances of this class. The use of this class as an instrumentation source may be inefficient unless the rate of metrics are known. The length of time a CIM_BaseMetricValue instance exists after the metric information is captured is not defined and is implementation dependent. 
 * Most metric data values change over time. There are two ways of mapping this into CIM_BaseMetricValue objects: The value for the next point in time may use the same object and just change its properties (such as the value or timestamp), or the existing objects remain unchanged and a new object is created for the new point in time. The first method is typically used for snapshot data and the second method for historical data. Which method is used, is indicated by the Volatile property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricValue#getMetricDefinitionId <em>Metric Definition Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricValue#getMeasuredElementName <em>Measured Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricValue#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricValue#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricValue#getMetricValue <em>Metric Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricValue#getBreakdownDimension <em>Breakdown Dimension</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricValue#getBreakdownValue <em>Breakdown Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricValue#getVolatile <em>Volatile</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricValue()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Metrics::BaseMetric' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n: \nWhere and are separated by a colon \':\', and where MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between and . \nis chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BaseMetricValue extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Metric Definition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The key of the BaseMetricDefinition instance for this CIM_BaseMetricValue instance value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metric Definition Id</em>' attribute.
	 * @see #setMetricDefinitionId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricValue_MetricDefinitionId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_BaseMetricDefinition.Id\"]'"
	 * @generated
	 */
	String getMetricDefinitionId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricValue#getMetricDefinitionId <em>Metric Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Definition Id</em>' attribute.
	 * @see #getMetricDefinitionId()
	 * @generated
	 */
	void setMetricDefinitionId(String value);

	/**
	 * Returns the value of the '<em><b>Measured Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A descriptive name for the element to which the metric value belongs (i.e., the measured element). This property is required by behavior if there is no association defined to a ManagedElement, but may be used in other cases to provide supplemental information. This allows metrics to be captured independently of any ManagedElement. An example is where a metric value belongs to a combination of elements, such as the input and output ports of the traffic in a switch. If there are multiple ManagedElements associated with the metric value, then usually there is one that naturally belongs to the metric value and that one should be used to create the supplemental information. The property is not meant to be used as a foreign key to search on the measured element. Instead, the association to the ManagedElement should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measured Element Name</em>' attribute.
	 * @see #setMeasuredElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricValue_MeasuredElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getMeasuredElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricValue#getMeasuredElementName <em>Measured Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Element Name</em>' attribute.
	 * @see #getMeasuredElementName()
	 * @generated
	 */
	void setMeasuredElementName(String value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the time when the value of a metric instance is computed. Note that this is different from the time when the instance is created. For a given CIM_BaseMetricValue instance, the TimeStamp changes whenever a new measurement snapshot is taken if Volatile is true. A managmenet application may establish a time series of metric data by retrieving the instances of CIM_BaseMetricValue and sorting them according to their TimeStamp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricValue_TimeStamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_BaseMetricDefinition.TimeScope\",\"CIM_BaseMetricValue.Duration\"]'"
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricValue#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property that represents the time duration over which this metric value is valid. This property should not exist for timestamps that apply only to a point in time but should be defined for values that are considered valid for a certain time period (ex. sampling). If the "Duration" property exists and is nonNull, the TimeStamp is to be considered the end of the interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricValue_Duration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_BaseMetricDefinition.TimeScope\",\"CIM_BaseMetricValue.TimeStamp\"]'"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricValue#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Metric Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the metric represented as a string. Its original data type is specified in CIM_BaseMetricDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metric Value</em>' attribute.
	 * @see #setMetricValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricValue_MetricValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getMetricValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricValue#getMetricValue <em>Metric Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Value</em>' attribute.
	 * @see #getMetricValue()
	 * @generated
	 */
	void setMetricValue(String value);

	/**
	 * Returns the value of the '<em><b>Breakdown Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, specifies one BreakdownDimension from the BreakdownDimensions array defined in the associated CIM_ BaseMetricDefinition. This is the dimension along which this set of metric values is broken down. For a description of the concept, see the class CIM_BaseMetricDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Breakdown Dimension</em>' attribute.
	 * @see #setBreakdownDimension(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricValue_BreakdownDimension()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getBreakdownDimension();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricValue#getBreakdownDimension <em>Breakdown Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakdown Dimension</em>' attribute.
	 * @see #getBreakdownDimension()
	 * @generated
	 */
	void setBreakdownDimension(String value);

	/**
	 * Returns the value of the '<em><b>Breakdown Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a value of the BreakdownDimension property defined for this metric value instance. For instance, if the BreakdownDimension is "TransactionName", this property could name the actual transaction to which this particular metric value applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Breakdown Value</em>' attribute.
	 * @see #setBreakdownValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricValue_BreakdownValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getBreakdownValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricValue#getBreakdownValue <em>Breakdown Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakdown Value</em>' attribute.
	 * @see #getBreakdownValue()
	 * @generated
	 */
	void setBreakdownValue(String value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, Volatile indicates that the value for the next point in time may use the same object and just change its properties (such as the value or timestamp). If false, the existing objects remain unchanged and a new object is created for the new point in time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricValue_Volatile()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getVolatile();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricValue#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #getVolatile()
	 * @generated
	 */
	void setVolatile(Boolean value);

} // CIM_BaseMetricValue
