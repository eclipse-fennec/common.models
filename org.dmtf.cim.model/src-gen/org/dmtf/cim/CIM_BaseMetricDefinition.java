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
 * A representation of the model object '<em><b>CIM Base Metric Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_BaseMetricDefinition represents the definitional aspects of a metric, i.e., a definition template containing meta data about a new metric. Since CIM_BaseMetricDefinition does not capture metric instance information, it does not contain the value of the metric. The associated class CIM_BaseMetricValue holds the metric value and encapsulates its runtime behavior. The purpose of CIM_BaseMetricDefinition is to provide a convenient mechanism for introducing a new metric definition at runtime and capturing its instance values in a separate class. This mechanism is targeted specifically at CIM users who would like to enhance existing CIM schemas by introducing domain-specific metrics that are not captured in the existing CIM schemas. In addition, vendors of managed resources may make use of this mechanism if a small subset of a potentially large and heterogeneous amount of performance-related data needs to be exposed, based on the context in which the data is captured. Additional meta data for a metric can be provided by subclassing from CIM_BaseMetricDefinition. The CIM_BaseMetricDefinition should be associated with the CIM_ManagedElement(s) to which it applies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getId <em>Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getCalculable <em>Calculable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getUnits <em>Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getProgrammaticUnits <em>Programmatic Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getBreakdownDimensions <em>Breakdown Dimensions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getIsContinuous <em>Is Continuous</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getTimeScope <em>Time Scope</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BaseMetricDefinition#getGatheringType <em>Gathering Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Metrics::BaseMetric' keys='Id'"
 * @generated
 */
@ProviderType
public interface CIM_BaseMetricDefinition extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that uniquely identifies the metric definition. The use of OSF UUID/GUIDs is recommended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_Id()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the metric. This name does not have to be unique, but should be descriptive and may contain blanks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of the metric. For example, "boolean" (value=1) or "datetime" (=3) may be specified. These types represent the datatypes defined for CIM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_DataType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\"]' Values='[\"boolean\",\"char16\",\"datetime\",\"real32\",\"real64\",\"sint16\",\"sint32\",\"sint64\",\"sint8\",\"string\",\"uint16\",\"uint32\",\"uint64\",\"uint8\"]'"
	 * @generated
	 */
	Integer getDataType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Integer value);

	/**
	 * Returns the value of the '<em><b>Calculable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that describes the characteristics of the metric, for purposes of performing calculations. The property can take one of the following values: 
	 * 1="Non-calculable" -> a string. Arithmetic makes no sense. 
	 * 2="Summable" -> It is reasonable to sum this value over many instances of e.g., UnitOfWork, such as the number of files processed in a backup job. For example, if each backup job is a UnitOfWork, and each job backs up 27,000 files on average, then it makes sense to say that 100 backup jobs processed 2,700,000 files. 
	 * 3="Non-summable" -> It does not make sense to sum this value over many instances of UnitOfWork. An example would be a metric that measures the queue length when a job arrives at a server. If each job is a UnitOfWork, and the average queue length when each job arrives is 33, it does not make sense to say that the queue length for 100 jobs is 3300. It does make sense to say that the mean is 33.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculable</em>' attribute.
	 * @see #setCalculable(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_Calculable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Non-calculable\",\"Summable\",\"Non-summable\"]'"
	 * @generated
	 */
	Integer getCalculable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getCalculable <em>Calculable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculable</em>' attribute.
	 * @see #getCalculable()
	 * @generated
	 */
	void setCalculable(Integer value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the specific units of a value. Examples are Bytes, Packets, Jobs, Files, Milliseconds, and Amps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_Units()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

	/**
	 * Returns the value of the '<em><b>Programmatic Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the specific units of a value. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Programmatic Units</em>' attribute.
	 * @see #setProgrammaticUnits(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_ProgrammaticUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getProgrammaticUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getProgrammaticUnits <em>Programmatic Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programmatic Units</em>' attribute.
	 * @see #getProgrammaticUnits()
	 * @generated
	 */
	void setProgrammaticUnits(String value);

	/**
	 * Returns the value of the '<em><b>Breakdown Dimensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines one or more strings that can be used to refine (break down) queries against the BaseMetricValues along a certain dimension. An example is a transaction name, allowing the break down of the total value for all transactions into a set of values, one for each transaction name. Other examples might be application system or user group name. The strings are free format and should be meaningful to the end users of the metric data. The strings indicate which break down dimensions are supported for this metric definition, by the underlying instrumentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Breakdown Dimensions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_BreakdownDimensions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getBreakdownDimensions();

	/**
	 * Returns the value of the '<em><b>Is Continuous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IsContinuous indicates whether or not the metric value is continuous or scalar. Performance metrics are an example of a linear metric. Examples of non-linear metrics include error codes or operational states. Continuous metrics can be compared using the "greater than" relation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Continuous</em>' attribute.
	 * @see #setIsContinuous(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_IsContinuous()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsContinuous();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getIsContinuous <em>Is Continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Continuous</em>' attribute.
	 * @see #getIsContinuous()
	 * @generated
	 */
	void setIsContinuous(Boolean value);

	/**
	 * Returns the value of the '<em><b>Change Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChangeType indicates how the metric value changes, in the form of typical combinations of finer grain attributes such as direction change, minimum and maximum values, and wrapping semantics. 
	 * 0="Unknown": The metric designer did not qualify the ChangeType. 
	 * 2="N/A": If the "IsContinuous" property is "false", ChangeType does not make sense and MUST be is set to "N/A". 
	 * 3="Counter": The metric is a counter metric. These have non-negative integer values which increase monotonically until reaching the maximum representable number and then wrap around and start increasing from 0. Such counters, also known as rollover counters, can be used for instance to count the number of network errors or the number of transactions processed. The only way for a client application to keep track of wrap arounds is to retrieve the value of the counter in appropriately short intervals. 
	 * 4="Gauge": The metric is a gauge metric. These have integer or float values that can increase and decrease arbitrarily. A gauge MUST NOT wrap when reaching the minimum or maximum representable number, instead, the value "sticks" at that number. Minimum or maximum values inside of the representable value range at which the metric value "sticks", may or may not be defined. 
	 * Vendors may extend this property in the vendor reserved range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Type</em>' attribute.
	 * @see #setChangeType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_ChangeType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"N/A\",\"Counter\",\"Gauge\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_BaseMetricDefinition.IsContinuous\"]'"
	 * @generated
	 */
	Integer getChangeType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Type</em>' attribute.
	 * @see #getChangeType()
	 * @generated
	 */
	void setChangeType(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TimeScope indicates the time scope to which the metric value applies. 
	 * 0="Unknown" indicates the time scope was not qualified by the metric designer, or is unknown to the provider. 
	 * 2="Point" indicates that the metric applies to a point in time. On the corresponding BaseMetricValue instances, TimeStamp specifies the point in time and Duration is always 0. 
	 * 3="Interval" indicates that the metric applies to a time interval. On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval and Duration specifies its duration. 
	 * 4="StartupInterval" indicates that the metric applies to a time interval that began at the startup of the measured resource (i.e. the ManagedElement associated by MetricDefForMe). On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval. If Duration is 0, this indicates that the startup time of the measured resource is unknown. Else, Duration specifies the duration between startup of the resource and TimeStamp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Scope</em>' attribute.
	 * @see #setTimeScope(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_TimeScope()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Point\",\"Interval\",\"StartupInterval\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_BaseMetricValue.TimeStamp\",\"CIM_BaseMetricValue.Duration\"]'"
	 * @generated
	 */
	Integer getTimeScope();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getTimeScope <em>Time Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Scope</em>' attribute.
	 * @see #getTimeScope()
	 * @generated
	 */
	void setTimeScope(Integer value);

	/**
	 * Returns the value of the '<em><b>Gathering Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GatheringType indicates how the metric values are gathered by the underlying instrumentation. This allows the client application to choose the right metric for the purpose. 
	 * 0="Unknown": Indicates that the GatheringType is not known. 
	 * 2="OnChange": Indicates that the CIM metric values get updated immediately when the values inside of the measured resource change. The values of OnChange metrics truly reflect the current situation within the resource at any time. An example is the number of logged on users that gets updated immediately as users log on and off. 
	 * 3="Periodic": Indicates that the CIM metric values get updated periodically. For instance, to a client application, a metric value applying to the current time will appear constant during each gathering interval, and then jumps to the new value at the end of each gathering interval. 
	 * 4="OnRequest": Indicates that the CIM metric value is determined each time a client application reads it. The values of OnRequest metrics truly return the current situation within the resource if somebody asks for it. However, they do not change "unobserved", and therefore subscribing for value changes of OnRequest metrics is NOT RECOMMENDED.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gathering Type</em>' attribute.
	 * @see #setGatheringType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BaseMetricDefinition_GatheringType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"OnChange\",\"Periodic\",\"OnRequest\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getGatheringType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BaseMetricDefinition#getGatheringType <em>Gathering Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gathering Type</em>' attribute.
	 * @see #getGatheringType()
	 * @generated
	 */
	void setGatheringType(Integer value);

} // CIM_BaseMetricDefinition
