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
 * A representation of the model object '<em><b>CIM Unix Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each instance of the CIM_UnixProcess class represents a single instance of a running program. A user of the Operating System will typically see a Process as an application or task. Within an OperatingSystem, a Process is defined by a workspace of memory resources and environmental settings that are allocated to it. On a multitasking System, this workspace prevents intrusion of resources by other Processes. Additionally, a Process can execute as multiple Threads, all which run within the same workspace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcess#getParentProcessID <em>Parent Process ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcess#getRealUserID <em>Real User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcess#getProcessGroupID <em>Process Group ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcess#getProcessSessionID <em>Process Session ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcess#getProcessTTY <em>Process TTY</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcess#getModulePath <em>Module Path</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcess#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcess#getProcessNiceValue <em>Process Nice Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcess#getProcessWaitingForEvent <em>Process Waiting For Event</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::System::Unix' keys='CSCreationClassName,CSName,OSCreationClassName,OSName,CreationClassName,Handle'"
 * @generated
 */
@ProviderType
public interface CIM_UnixProcess extends CIM_Process {
	/**
	 * Returns the value of the '<em><b>Parent Process ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent process ID of this executing process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Process ID</em>' attribute.
	 * @see #setParentProcessID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess_ParentProcessID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' MappingStrings='[\"MIF.DMTF|Process Information|001.2\"]'"
	 * @generated
	 */
	String getParentProcessID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcess#getParentProcessID <em>Parent Process ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Process ID</em>' attribute.
	 * @see #getParentProcessID()
	 * @generated
	 */
	void setParentProcessID(String value);

	/**
	 * Returns the value of the '<em><b>Real User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Real User ID of this currently executing process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real User ID</em>' attribute.
	 * @see #setRealUserID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess_RealUserID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' MappingStrings='[\"MIF.DMTF|Process Information|001.4\"]'"
	 * @generated
	 */
	Long getRealUserID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcess#getRealUserID <em>Real User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real User ID</em>' attribute.
	 * @see #getRealUserID()
	 * @generated
	 */
	void setRealUserID(Long value);

	/**
	 * Returns the value of the '<em><b>Process Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Group ID of this currently executing process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Group ID</em>' attribute.
	 * @see #setProcessGroupID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess_ProcessGroupID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' MappingStrings='[\"MIF.DMTF|Process Information|001.2\"]'"
	 * @generated
	 */
	Long getProcessGroupID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcess#getProcessGroupID <em>Process Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Group ID</em>' attribute.
	 * @see #getProcessGroupID()
	 * @generated
	 */
	void setProcessGroupID(Long value);

	/**
	 * Returns the value of the '<em><b>Process Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If part of a group of processes are under the control of a session leader, this property holds the session ID for the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Session ID</em>' attribute.
	 * @see #setProcessSessionID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess_ProcessSessionID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getProcessSessionID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcess#getProcessSessionID <em>Process Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Session ID</em>' attribute.
	 * @see #getProcessSessionID()
	 * @generated
	 */
	void setProcessSessionID(Long value);

	/**
	 * Returns the value of the '<em><b>Process TTY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TTY currently associated with this process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process TTY</em>' attribute.
	 * @see #setProcessTTY(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess_ProcessTTY()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|Process Information|001.5\"]'"
	 * @generated
	 */
	String getProcessTTY();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcess#getProcessTTY <em>Process TTY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process TTY</em>' attribute.
	 * @see #getProcessTTY()
	 * @generated
	 */
	void setProcessTTY(String value);

	/**
	 * Returns the value of the '<em><b>Module Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The executing process's command path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Path</em>' attribute.
	 * @see #setModulePath(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess_ModulePath()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|Process Information|001.7\"]'"
	 * @generated
	 */
	String getModulePath();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcess#getModulePath <em>Module Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Path</em>' attribute.
	 * @see #getModulePath()
	 * @generated
	 */
	void setModulePath(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operating system parameters provided to the executing process. These are the argv[] values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess_Parameters()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"MIF.DMTF|Process Information|001.8\"]'"
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Process Nice Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The process's 'nice' value. A process 'nice' value of 0 reflects high priority, while increasing values reflect lower priorities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Nice Value</em>' attribute.
	 * @see #setProcessNiceValue(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess_ProcessNiceValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Process Information|001.11\"]'"
	 * @generated
	 */
	Long getProcessNiceValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcess#getProcessNiceValue <em>Process Nice Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Nice Value</em>' attribute.
	 * @see #getProcessNiceValue()
	 * @generated
	 */
	void setProcessNiceValue(Long value);

	/**
	 * Returns the value of the '<em><b>Process Waiting For Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the event this process is currently sleeping for. The precise nature of this string is implementation defined, but is typically the address of a system data structure that will be modified when the event occurs. This string only has meaning when the ExecutionState is "Blocked" or "SuspendedBlocked".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Waiting For Event</em>' attribute.
	 * @see #setProcessWaitingForEvent(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcess_ProcessWaitingForEvent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Process.ExecutionState\"]'"
	 * @generated
	 */
	String getProcessWaitingForEvent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcess#getProcessWaitingForEvent <em>Process Waiting For Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Waiting For Event</em>' attribute.
	 * @see #getProcessWaitingForEvent()
	 * @generated
	 */
	void setProcessWaitingForEvent(String value);

} // CIM_UnixProcess
