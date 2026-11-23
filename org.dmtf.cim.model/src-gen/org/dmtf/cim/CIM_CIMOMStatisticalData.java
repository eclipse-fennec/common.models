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
 * A representation of the model object '<em><b>CIM CIMOM Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CIMOMStatisticalData provides statistical data about the performance of the CIM Object Manager. Each object of this class provides elapsed time and size data for a particular type of CIM operation. All operations of that type, regardless of the CIM operations protocol being used, are accumulated in one object and covers the CIM operations issued by all clients of the Object Manager scoping the instance. Batched CIM operations are accumulated into a separate operation type for "Batched". The counters in this class SHOULD be implemented such that they always increment and naturally wrap around when their numerical limit is exceeded. A client that calculates the difference of two snapshots of a counter at the beginning and end of a measurement interval should get the correct result, even if there was a wrap-around in between obtaining the two snapshots. (Two or more wrap arounds will result in wrong data being calculated.) The gathering of the data can be controlled through the property, CIM_ObjectManager.GatherStatisticalData. The time interval to which the statistical data applies, ends at the current time and therefore includes the most current CIM operations. The interval starts when the statistical data gathering was last turned on for the Object Manager.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getOtherOperationType <em>Other Operation Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getNumberOfOperations <em>Number Of Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getCimomElapsedTime <em>Cimom Elapsed Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getProviderElapsedTime <em>Provider Elapsed Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getRequestSize <em>Request Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getResponseSize <em>Response Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CIMOMStatisticalData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Interop' override.InstanceID='string' override.InstanceID.Description='The InstanceID property opaquely identifies a unique instance of CIMOMStatisticalData and MUST be unique within a namespace. In order to ensure uniqueness, the value of InstanceID MUST be constructed in the following manner: \nCIM&lt;ID&gt; \nThe &lt;ID&gt; MUST include a CIM Object Manager specified unique identifier.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CIMOMStatisticalData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OperationType property identifies the type of CIM operation for which data is reported in this instance. Batched CIM operations (consisting of multiple simple CIM operations) are reported against the "Batched" type only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see #setOperationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMOMStatisticalData_OperationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\"]' Values='[\"Unknown\",\"Other\",\"Batched\",\"GetClass\",\"GetInstance\",\"DeleteClass\",\"DeleteInstance\",\"CreateClass\",\"CreateInstance\",\"ModifyClass\",\"ModifyInstance\",\"EnumerateClasses\",\"EnumerateClassNames\",\"EnumerateInstances\",\"EnumerateInstanceNames\",\"ExecQuery\",\"Associators\",\"AssociatorNames\",\"References\",\"ReferenceNames\",\"GetProperty\",\"SetProperty\",\"GetQualifier\",\"SetQualifier\",\"DeleteQualifier\",\"EnumerateQualifiers\",\"IndicationDelivery\"]' ModelCorrespondence='[\"CIM_CIMOMStatisticalData.OtherOperationType\"]'"
	 * @generated
	 */
	Integer getOperationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OtherOperationType property identifies the operation if the OperationType property has a value of 1 ("Other"). For all other values of OperationType, the property is NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Operation Type</em>' attribute.
	 * @see #setOtherOperationType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMOMStatisticalData_OtherOperationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_CIMOMStatisticalData.OperationType\"]'"
	 * @generated
	 */
	String getOtherOperationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getOtherOperationType <em>Other Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Operation Type</em>' attribute.
	 * @see #getOtherOperationType()
	 * @generated
	 */
	void setOtherOperationType(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NumberOfOperations property contains the number of CIM operations of the specified type. This property can be used to calculate average values per CIM operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Operations</em>' attribute.
	 * @see #setNumberOfOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMOMStatisticalData_NumberOfOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' Counter='true'"
	 * @generated
	 */
	Long getNumberOfOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getNumberOfOperations <em>Number Of Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Operations</em>' attribute.
	 * @see #getNumberOfOperations()
	 * @generated
	 */
	void setNumberOfOperations(Long value);

	/**
	 * Returns the value of the '<em><b>Cimom Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CimomElapsedTime property contains the elapsed time spent in the CIM Object Manager for this operation type, not counting the elapsed time spent in providers and the underlying instrumentation. The measurement points for this property SHOULD be at the transport layer interface on the network side, and at the provider interface on the instrumentation side of the CIM Object Manager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cimom Elapsed Time</em>' attribute.
	 * @see #setCimomElapsedTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMOMStatisticalData_CimomElapsedTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Required='true'"
	 * @generated
	 */
	String getCimomElapsedTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getCimomElapsedTime <em>Cimom Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cimom Elapsed Time</em>' attribute.
	 * @see #getCimomElapsedTime()
	 * @generated
	 */
	void setCimomElapsedTime(String value);

	/**
	 * Returns the value of the '<em><b>Provider Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ProviderElapsedTime property contains the elapsed time spent in all providers involved with this operation type, including the underlying instrumentation. The measurement point for this property SHOULD be from the provider interface of the CIM Object Manager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Elapsed Time</em>' attribute.
	 * @see #setProviderElapsedTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMOMStatisticalData_ProviderElapsedTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Required='true'"
	 * @generated
	 */
	String getProviderElapsedTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getProviderElapsedTime <em>Provider Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Elapsed Time</em>' attribute.
	 * @see #getProviderElapsedTime()
	 * @generated
	 */
	void setProviderElapsedTime(String value);

	/**
	 * Returns the value of the '<em><b>Request Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RequestSize property contains the size of the operation requests sent to the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Size</em>' attribute.
	 * @see #setRequestSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMOMStatisticalData_RequestSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true' PUnit='byte'"
	 * @generated
	 */
	Long getRequestSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getRequestSize <em>Request Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Size</em>' attribute.
	 * @see #getRequestSize()
	 * @generated
	 */
	void setRequestSize(Long value);

	/**
	 * Returns the value of the '<em><b>Response Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResponseSize property contains the size of the operation responses sent back from the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Size</em>' attribute.
	 * @see #setResponseSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMOMStatisticalData_ResponseSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true' PUnit='byte'"
	 * @generated
	 */
	Long getResponseSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMOMStatisticalData#getResponseSize <em>Response Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Size</em>' attribute.
	 * @see #getResponseSize()
	 * @generated
	 */
	void setResponseSize(Long value);

} // CIM_CIMOMStatisticalData
