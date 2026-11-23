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
 * A representation of the model object '<em><b>CIM Device Error Counts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DeviceErrorCounts is a statistical class containing error- related counters for a LogicalDevice. The types of errors are defined by CCITT (Rec X.733) and ISO (IEC 10164-4). Note that the CIM_DeviceErrorCountData class uses a simplified naming or identity algorithm as compared to this class. DeviceErrorCounts is not deprecated because its naming algorithm is still in use in various implementations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorCounts#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorCounts#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorCounts#getDeviceCreationClassName <em>Device Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorCounts#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorCounts#getIndeterminateErrorCount <em>Indeterminate Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorCounts#getCriticalErrorCount <em>Critical Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorCounts#getMajorErrorCount <em>Major Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorCounts#getMinorErrorCount <em>Minor Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorCounts#getWarningCount <em>Warning Count</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::DeviceElements' override.Name='string' override.Name.Key='true' override.Name.Description='The inherited Name serves as part of the key for the DeviceErrorCounts instance. The object is scoped by the LogicalDevice to which the statistics apply.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,DeviceCreationClassName,DeviceID,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceErrorCounts extends CIM_StatisticalInformation {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName of the scoping System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_LogicalDevice.SystemCreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorCounts#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name of the scoping System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_LogicalDevice.SystemName'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorCounts#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Device Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName of the scoping Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Creation Class Name</em>' attribute.
	 * @see #setDeviceCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts_DeviceCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_LogicalDevice.CreationClassName'"
	 * @generated
	 */
	String getDeviceCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorCounts#getDeviceCreationClassName <em>Device Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Creation Class Name</em>' attribute.
	 * @see #getDeviceCreationClassName()
	 * @generated
	 */
	void setDeviceCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ID of the scoping Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see #setDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts_DeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' Propagated='CIM_LogicalDevice.DeviceID'"
	 * @generated
	 */
	String getDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorCounts#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>Indeterminate Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of the indeterminate errors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indeterminate Error Count</em>' attribute.
	 * @see #setIndeterminateErrorCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts_IndeterminateErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getIndeterminateErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorCounts#getIndeterminateErrorCount <em>Indeterminate Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indeterminate Error Count</em>' attribute.
	 * @see #getIndeterminateErrorCount()
	 * @generated
	 */
	void setIndeterminateErrorCount(Long value);

	/**
	 * Returns the value of the '<em><b>Critical Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of the critical errors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Critical Error Count</em>' attribute.
	 * @see #setCriticalErrorCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts_CriticalErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIF.DMTF|Operational State|006.7\"]'"
	 * @generated
	 */
	Long getCriticalErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorCounts#getCriticalErrorCount <em>Critical Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Error Count</em>' attribute.
	 * @see #getCriticalErrorCount()
	 * @generated
	 */
	void setCriticalErrorCount(Long value);

	/**
	 * Returns the value of the '<em><b>Major Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of the major errors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Major Error Count</em>' attribute.
	 * @see #setMajorErrorCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts_MajorErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIF.DMTF|Operational State|006.8\"]'"
	 * @generated
	 */
	Long getMajorErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorCounts#getMajorErrorCount <em>Major Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Error Count</em>' attribute.
	 * @see #getMajorErrorCount()
	 * @generated
	 */
	void setMajorErrorCount(Long value);

	/**
	 * Returns the value of the '<em><b>Minor Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of the minor errors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minor Error Count</em>' attribute.
	 * @see #setMinorErrorCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts_MinorErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMinorErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorCounts#getMinorErrorCount <em>Minor Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Error Count</em>' attribute.
	 * @see #getMinorErrorCount()
	 * @generated
	 */
	void setMinorErrorCount(Long value);

	/**
	 * Returns the value of the '<em><b>Warning Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of the warnings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warning Count</em>' attribute.
	 * @see #setWarningCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorCounts_WarningCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIF.DMTF|Operational State|006.9\"]'"
	 * @generated
	 */
	Long getWarningCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorCounts#getWarningCount <em>Warning Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Count</em>' attribute.
	 * @see #getWarningCount()
	 * @generated
	 */
	void setWarningCount(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to reset the error and warning counters. The method takes one parameter as input, an integer that indicates which counter to reset. For this input parameter, 0 indicates all, 1 indicates a reset of the indeterminate error counter, 2 the critical error counter, 3 the major error counter, 4 the minor error counter, and 5 the warning counter. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the instrumentation of the LogicalDevice, which tabulates the errors and warnings, can also reset its internal processing and counters. 
	 * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * @param SelectedCounter The counter to reset.
	 * <!-- end-model-doc -->
	 * @model SelectedCounterAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"All\",\"Indeterminate Error Counter\",\"Critical Error Counter\",\"Major Error Counter\",\"Minor Error Counter\",\"Warning Counter\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ResetCounter(Integer SelectedCounter);

} // CIM_DeviceErrorCounts
