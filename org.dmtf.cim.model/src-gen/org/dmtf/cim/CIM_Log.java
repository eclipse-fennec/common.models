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
 * A representation of the model object '<em><b>CIM Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Log represents any type of event, error or informational register or chronicle. The object describes the existence of the log and its characteristics. Log does not dictate the form of the data represented or how records/messages are stored in the log and/or accessed. Subclasses will define the appropriate methods and behavior.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Log#getMaxNumberOfRecords <em>Max Number Of Records</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Log#getCurrentNumberOfRecords <em>Current Number Of Records</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Log#getOverwritePolicy <em>Overwrite Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Log#getLogState <em>Log State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Log()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' UMLPackagePath='CIM::System::Logs'"
 * @generated
 */
@ProviderType
public interface CIM_Log extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Max Number Of Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of records that can be captured in the Log. If undefined, a value of zero should be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Of Records</em>' attribute.
	 * @see #setMaxNumberOfRecords(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Log_MaxNumberOfRecords()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getMaxNumberOfRecords();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Log#getMaxNumberOfRecords <em>Max Number Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Records</em>' attribute.
	 * @see #getMaxNumberOfRecords()
	 * @generated
	 */
	void setMaxNumberOfRecords(Long value);

	/**
	 * Returns the value of the '<em><b>Current Number Of Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current number of records in the Log.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Number Of Records</em>' attribute.
	 * @see #setCurrentNumberOfRecords(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Log_CurrentNumberOfRecords()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Gauge='true'"
	 * @generated
	 */
	Long getCurrentNumberOfRecords();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Log#getCurrentNumberOfRecords <em>Current Number Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Number Of Records</em>' attribute.
	 * @see #getCurrentNumberOfRecords()
	 * @generated
	 */
	void setCurrentNumberOfRecords(Long value);

	/**
	 * Returns the value of the '<em><b>Overwrite Policy</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OverwritePolicy is an integer enumeration that indicates whether the log, represented by the CIM_Log subclasses, can overwrite its entries.Unknown (0) indicates the log's overwrite policy is unknown. 
	 * Wraps when Full (2) indicates that the log overwrites its entries with new entries when the log has reached its maximum capacity. 
	 * Never Overwrites (7) indicates that the log never overwrites its entries by the new entries.
	 * Archives (8) indicates that the logging is never interupted, and the log archives old entries using an algorithm such as reaching a specific threshold on number of entries to archive a specific number of old ones to free space for new entries. The archived entries may not be readily retreived through the enumeration of log entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overwrite Policy</em>' attribute.
	 * @see #setOverwritePolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Log_OverwritePolicy()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Wraps When Full\",\"Never Overwrites\",\"Archives\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getOverwritePolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Log#getOverwritePolicy <em>Overwrite Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overwrite Policy</em>' attribute.
	 * @see #getOverwritePolicy()
	 * @generated
	 */
	void setOverwritePolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Log State</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LogState is an integer enumeration that indicates the current state of a log represented by CIM_Log subclasses. LogState is to be used in conjunction with the EnabledState property to fully describe the current state of the log. The following text briefly summarizes the various log states: 
	 * Unknown (0) indicates the state of the log is unknown. 
	 * Normal (2) indicates that the log is or could be executing logging commands, will process any queued log entries, and will queue new logging requests. 
	 * Erasing (3) indicates that the log is being erased. 
	 * Not Applicable (4) indicates the log does not support representing a log state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log State</em>' attribute.
	 * @see #setLogState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Log_LogState()
	 * @model default="4"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Normal\",\"Erasing\",\"Not Applicable\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	Integer getLogState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Log#getLogState <em>Log State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log State</em>' attribute.
	 * @see #getLogState()
	 * @generated
	 */
	void setLogState(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the Log be cleared of all entries. 
	 * The return value should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value, as indicated by the ValueMap/Values qualifiers, if an error occurred.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..0x0FFF\",\"0x1000..0x7FFF\",\"0x8000..\"]' Values='[\"Completed with no error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long ClearLog();

} // CIM_Log
