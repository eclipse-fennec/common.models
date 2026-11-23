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
 * A representation of the model object '<em><b>CIM Device Error Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DeviceErrorData is a statistical class that contains error- related counters for a LogicalDevice. The types of errors are defined by CCITT (Rec X.733) and ISO (IEC 10164-4). The element, whose statistics are described, is associated using the relationship, ElementStatisticalData. Note that this class uses a simplified identity or naming algorithm over CIM_DeviceErrorCounts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorData#getIndeterminateErrorCount <em>Indeterminate Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorData#getCriticalErrorCount <em>Critical Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorData#getMajorErrorCount <em>Major Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorData#getMinorErrorCount <em>Minor Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorData#getWarningCount <em>Warning Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorData#getLastErrorCode <em>Last Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceErrorData#getErrorDescription <em>Error Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::DeviceElements' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceErrorData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Indeterminate Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of the indeterminate errors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indeterminate Error Count</em>' attribute.
	 * @see #setIndeterminateErrorCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorData_IndeterminateErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getIndeterminateErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorData#getIndeterminateErrorCount <em>Indeterminate Error Count</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorData_CriticalErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIF.DMTF|Operational State|006.7\"]'"
	 * @generated
	 */
	Long getCriticalErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorData#getCriticalErrorCount <em>Critical Error Count</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorData_MajorErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIF.DMTF|Operational State|006.8\"]'"
	 * @generated
	 */
	Long getMajorErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorData#getMajorErrorCount <em>Major Error Count</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorData_MinorErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMinorErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorData#getMinorErrorCount <em>Minor Error Count</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorData_WarningCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIF.DMTF|Operational State|006.9\"]'"
	 * @generated
	 */
	Long getWarningCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorData#getWarningCount <em>Warning Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Count</em>' attribute.
	 * @see #getWarningCount()
	 * @generated
	 */
	void setWarningCount(Long value);

	/**
	 * Returns the value of the '<em><b>Last Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LastErrorCode captures the last error code reported by the LogicalDevice. While the device is in this error condition, then the OperationalStatus of the LogicalDevice should not reflect an 'Okay' status. When this error condition is cleared, then the OperationalStatus of the LogicalDevice should report an 'Okay' status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Error Code</em>' attribute.
	 * @see #setLastErrorCode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorData_LastErrorCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getLastErrorCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorData#getLastErrorCode <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Error Code</em>' attribute.
	 * @see #getLastErrorCode()
	 * @generated
	 */
	void setLastErrorCode(String value);

	/**
	 * Returns the value of the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ErrorDescription is a free-form string that supplies more information about the error recorded in LastErrorCode, and information on any corrective actions that might be taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Description</em>' attribute.
	 * @see #setErrorDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceErrorData_ErrorDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getErrorDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceErrorData#getErrorDescription <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Description</em>' attribute.
	 * @see #getErrorDescription()
	 * @generated
	 */
	void setErrorDescription(String value);

} // CIM_DeviceErrorData
