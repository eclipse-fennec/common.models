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
 * A representation of the model object '<em><b>CIM Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each instance of the CIM_Process class represents a single instance of a running program. A user of the OperatingSystem will typically see a Process as an application or task. Within an OperatingSystem, a Process is defined by a workspace of memory resources and environmental settings that are allocated to it. On a multitasking System, this workspace prevents intrusion of resources by other Processes. Additionally, a Process can execute as multiple Threads, all which run within the same workspace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Process#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getOSCreationClassName <em>OS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getOSName <em>OS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getExecutionState <em>Execution State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getOtherExecutionDescription <em>Other Execution Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getTerminationDate <em>Termination Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getKernelModeTime <em>Kernel Mode Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getUserModeTime <em>User Mode Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Process#getWorkingSetSize <em>Working Set Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Process()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::System::Processing' override.Name='string' override.Name.Description='The name of the process.' override.Name.MappingStrings='[\"MIF.DMTF|Process Information|001.6\"]' keys='CSCreationClassName,CSName,OSCreationClassName,OSName,CreationClassName,Handle'"
 * @generated
 */
@ProviderType
public interface CIM_Process extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_OperatingSystem.CSCreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #getCSCreationClassName()
	 * @generated
	 */
	void setCSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>CS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Name</em>' attribute.
	 * @see #setCSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_OperatingSystem.CSName'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getCSName <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Name</em>' attribute.
	 * @see #getCSName()
	 * @generated
	 */
	void setCSName(String value);

	/**
	 * Returns the value of the '<em><b>OS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping OperatingSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OS Creation Class Name</em>' attribute.
	 * @see #setOSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_OSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_OperatingSystem.CreationClassName'"
	 * @generated
	 */
	String getOSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getOSCreationClassName <em>OS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Creation Class Name</em>' attribute.
	 * @see #getOSCreationClassName()
	 * @generated
	 */
	void setOSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>OS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping OperatingSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OS Name</em>' attribute.
	 * @see #setOSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_OSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_OperatingSystem.Name'"
	 * @generated
	 */
	String getOSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getOSName <em>OS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Name</em>' attribute.
	 * @see #getOSName()
	 * @generated
	 */
	void setOSName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string used to identify the Process. A Process ID is a kind of Process Handle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_Handle()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' MappingStrings='[\"MIF.DMTF|Process Information|001.1\"]'"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Priority indicates the urgency or importance of execution of a Process. Lower values reflect more favorable process scheduling. If a priority is not defined for a Process, a value of 0 should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Process Information|001.10\"]'"
	 * @generated
	 */
	Long getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Long value);

	/**
	 * Returns the value of the '<em><b>Execution State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current operating condition of the Process. Values include ready (2), running (3), and blocked (4), among others. The majority of the enumerated values are obvious. However, a few require additional explanation: 
	 * 7 (Terminated) describes that a process has naturally completed 
	 * 8 (Stopped) describes that a process has been prematurely 'stopped' by a user or other request 
	 * 10 (Ready but Relinquished Processor) describes that a process is in the Ready state, but has voluntarily relinquished execution time to other processes. For example, this state may indicate a problem when the relinquishing process is not handling items on its queues. If these semantics cannot be detected, the process should report its state as 2 ("Ready"). 
	 * 11 (Hung) indicates that a process is not responding and should therefore not be given further execution time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution State</em>' attribute.
	 * @see #setExecutionState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_ExecutionState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"Unknown\",\"Other\",\"Ready\",\"Running\",\"Blocked\",\"Suspended Blocked\",\"Suspended Ready\",\"Terminated\",\"Stopped\",\"Growing\",\"Ready But Relinquished Processor\",\"Hung\"]' MappingStrings='[\"MIF.DMTF|Process Information|001.9\",\"MIF.UNIX|Process Information|13.9\"]'"
	 * @generated
	 */
	Integer getExecutionState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getExecutionState <em>Execution State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution State</em>' attribute.
	 * @see #getExecutionState()
	 * @generated
	 */
	void setExecutionState(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Execution Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the state - used when the instance's ExecutionState property is set to 1 ("Other"). Other ExecutionDescription should be set to NULL when the Execution State property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Execution Description</em>' attribute.
	 * @see #setOtherExecutionDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_OtherExecutionDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherExecutionDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getOtherExecutionDescription <em>Other Execution Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Execution Description</em>' attribute.
	 * @see #getOtherExecutionDescription()
	 * @generated
	 */
	void setOtherExecutionDescription(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that the Process began executing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_CreationDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

	/**
	 * Returns the value of the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that the Process was stopped or terminated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Termination Date</em>' attribute.
	 * @see #setTerminationDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_TerminationDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTerminationDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getTerminationDate <em>Termination Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Date</em>' attribute.
	 * @see #getTerminationDate()
	 * @generated
	 */
	void setTerminationDate(String value);

	/**
	 * Returns the value of the '<em><b>Kernel Mode Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in kernel mode, in milliseconds. If this information is not available, or if the operating system does not distinguish between time in kernel and in user mode, a value of 0 should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kernel Mode Time</em>' attribute.
	 * @see #setKernelModeTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_KernelModeTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliSeconds' MappingStrings='[\"MIF.DMTF|Process Information|001.13\"]' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getKernelModeTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getKernelModeTime <em>Kernel Mode Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Mode Time</em>' attribute.
	 * @see #getKernelModeTime()
	 * @generated
	 */
	void setKernelModeTime(Long value);

	/**
	 * Returns the value of the '<em><b>User Mode Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in user mode, in milliseconds. If this information is not available, a value of 0 should be used. If the operating system does not distinguish between time in kernel mode and user mode, the time should be returned in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Mode Time</em>' attribute.
	 * @see #setUserModeTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_UserModeTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliSeconds' MappingStrings='[\"MIF.DMTF|Process Information|001.14\"]' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getUserModeTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getUserModeTime <em>User Mode Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Mode Time</em>' attribute.
	 * @see #getUserModeTime()
	 * @generated
	 */
	void setUserModeTime(Long value);

	/**
	 * Returns the value of the '<em><b>Working Set Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of memory in bytes that a Process needs to execute efficiently, for an OperatingSystem that uses page-based memory management. If an insufficient amount of memory is available (< working set size), thrashing will occur. If this information is not known, NULL or 0 should be entered. If this data is provided, it could be monitored to understand a Process' changing memory requirements as execution proceeds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Working Set Size</em>' attribute.
	 * @see #setWorkingSetSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Process_WorkingSetSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Gauge='true' PUnit='byte'"
	 * @generated
	 */
	Long getWorkingSetSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Process#getWorkingSetSize <em>Working Set Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Set Size</em>' attribute.
	 * @see #getWorkingSetSize()
	 * @generated
	 */
	void setWorkingSetSize(Long value);

} // CIM_Process
