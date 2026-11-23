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
 * A representation of the model object '<em><b>CIM Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Threads represent the ability to execute units of a Process or task in parallel. A Process can have many Threads, each of which is weak to the Process.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getOSCreationClassName <em>OS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getOSName <em>OS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getProcessCreationClassName <em>Process Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getProcessHandle <em>Process Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getExecutionState <em>Execution State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getKernelModeTime <em>Kernel Mode Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Thread#getUserModeTime <em>User Mode Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Thread()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::System::Processing' keys='CSCreationClassName,CSName,OSCreationClassName,OSName,ProcessCreationClassName,ProcessHandle,CreationClassName,Handle'"
 * @generated
 */
@ProviderType
public interface CIM_Thread extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.CSCreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.CSName'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getCSName <em>CS Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_OSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.OSCreationClassName'"
	 * @generated
	 */
	String getOSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getOSCreationClassName <em>OS Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_OSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.OSName'"
	 * @generated
	 */
	String getOSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getOSName <em>OS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Name</em>' attribute.
	 * @see #getOSName()
	 * @generated
	 */
	void setOSName(String value);

	/**
	 * Returns the value of the '<em><b>Process Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Process' CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Creation Class Name</em>' attribute.
	 * @see #setProcessCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_ProcessCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.CreationClassName'"
	 * @generated
	 */
	String getProcessCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getProcessCreationClassName <em>Process Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Creation Class Name</em>' attribute.
	 * @see #getProcessCreationClassName()
	 * @generated
	 */
	void setProcessCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Process Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Process' Handle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Handle</em>' attribute.
	 * @see #setProcessHandle(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_ProcessHandle()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.Handle'"
	 * @generated
	 */
	String getProcessHandle();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getProcessHandle <em>Process Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Handle</em>' attribute.
	 * @see #getProcessHandle()
	 * @generated
	 */
	void setProcessHandle(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allow all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getCreationClassName <em>Creation Class Name</em>}' attribute.
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
	 * A string used to identify the Thread.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_Handle()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getHandle <em>Handle</em>}' attribute.
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
	 * Priority indicates the urgency or importance of execution of a Thread. A Thread may have a different priority than its owning Process. If this information is not available for a Thread, a value of 0 should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getPriority <em>Priority</em>}' attribute.
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
	 * Indicates the current operating condition of the Thread. Values include ready (2), running (3), and blocked (4), among others. The majority of the enumerated values are obvious. However, a few require additional explanation: 
	 * 7 (Ready but Relinquished Processor) describes that a thread is in the Ready state, but has voluntarily relinquished execution time to other threads. For example, this state may indicate a problem when the relinquishing thread is not handling items on its queues. If these semantics cannot be detected, the thread should report its state as 2 ("Ready"). 
	 * 8 (Hung) indicates that a thread is not responding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution State</em>' attribute.
	 * @see #setExecutionState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_ExecutionState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Ready\",\"Running\",\"Blocked\",\"Suspended Blocked\",\"Suspended Ready\",\"Ready But Relinquished Processor\",\"Hung\"]'"
	 * @generated
	 */
	Integer getExecutionState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getExecutionState <em>Execution State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution State</em>' attribute.
	 * @see #getExecutionState()
	 * @generated
	 */
	void setExecutionState(Integer value);

	/**
	 * Returns the value of the '<em><b>Kernel Mode Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in kernel mode, in milliseconds. If this information is not available, a value of 0 should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kernel Mode Time</em>' attribute.
	 * @see #setKernelModeTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_KernelModeTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getKernelModeTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getKernelModeTime <em>Kernel Mode Time</em>}' attribute.
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
	 * Time in user mode, in milliseconds. If this information is not available, a value of 0 should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Mode Time</em>' attribute.
	 * @see #setUserModeTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Thread_UserModeTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getUserModeTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Thread#getUserModeTime <em>User Mode Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Mode Time</em>' attribute.
	 * @see #getUserModeTime()
	 * @generated
	 */
	void setUserModeTime(Long value);

} // CIM_Thread
