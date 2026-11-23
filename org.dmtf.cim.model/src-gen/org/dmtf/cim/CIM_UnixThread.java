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
 * A representation of the model object '<em><b>CIM Unix Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Threads represent the ability to execute units of a Process or task in parallel. A UnixThread inherits from the superclass, CIM_Thread, which is weak to the Process. The values used are defined in sched.h and psched.h.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getSchedPolicy <em>Sched Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getOtherSchedPolicy <em>Other Sched Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getGuardSize <em>Guard Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getDetachState <em>Detach State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getInheritSched <em>Inherit Sched</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getContentionScope <em>Contention Scope</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getStackSize <em>Stack Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getConcurrencyLevel <em>Concurrency Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getCancelState <em>Cancel State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixThread#getCancelType <em>Cancel Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::Unix' keys='CSCreationClassName,CSName,OSCreationClassName,OSName,ProcessCreationClassName,ProcessHandle,CreationClassName,Handle'"
 * @generated
 */
@ProviderType
public interface CIM_UnixThread extends CIM_Thread {
	/**
	 * Returns the value of the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the thread's scheduling policy. Set to "Other" when using OtherSchedPolicy to specifiy additional values. "Other" represents SCHED_OTHER as defined in sched.h.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sched Policy</em>' attribute.
	 * @see #setSchedPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_SchedPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"SCHED_FIFO\",\"SCHED_RR\"]' ModelCorrespondence='[\"CIM_UnixThread.OtherSchedPolicy\"]'"
	 * @generated
	 */
	Integer getSchedPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getSchedPolicy <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Policy</em>' attribute.
	 * @see #getSchedPolicy()
	 * @generated
	 */
	void setSchedPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the thread's scheduling policy when SchedPolicy is set to "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Sched Policy</em>' attribute.
	 * @see #setOtherSchedPolicy(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_OtherSchedPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_UnixThread.SchedPolicy\"]'"
	 * @generated
	 */
	String getOtherSchedPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getOtherSchedPolicy <em>Other Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Sched Policy</em>' attribute.
	 * @see #getOtherSchedPolicy()
	 * @generated
	 */
	void setOtherSchedPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Guard Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the size of the guard area for a created thread's stack.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard Size</em>' attribute.
	 * @see #setGuardSize(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_GuardSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getGuardSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getGuardSize <em>Guard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Size</em>' attribute.
	 * @see #getGuardSize()
	 * @generated
	 */
	void setGuardSize(String value);

	/**
	 * Returns the value of the '<em><b>Detach State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the creation state of the thread.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detach State</em>' attribute.
	 * @see #setDetachState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_DetachState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"PTHREAD_CREATE_DETACHED\",\"PTHREAD_CREATE_JOINABLE\"]'"
	 * @generated
	 */
	Integer getDetachState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getDetachState <em>Detach State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detach State</em>' attribute.
	 * @see #getDetachState()
	 * @generated
	 */
	void setDetachState(Integer value);

	/**
	 * Returns the value of the '<em><b>Inherit Sched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the scheduling attributes are to be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherit Sched</em>' attribute.
	 * @see #setInheritSched(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_InheritSched()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"PTHREAD_INHERIT_SCHED\",\"PTHREAD_EXPLICIT_SCHED\"]'"
	 * @generated
	 */
	Integer getInheritSched();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getInheritSched <em>Inherit Sched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit Sched</em>' attribute.
	 * @see #getInheritSched()
	 * @generated
	 */
	void setInheritSched(Integer value);

	/**
	 * Returns the value of the '<em><b>Contention Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the contention scope of the thread.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contention Scope</em>' attribute.
	 * @see #setContentionScope(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_ContentionScope()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"PTHREAD_SCOPE_SYSTEM\",\"PTHREAD_SCOPE_PROCESS\"]'"
	 * @generated
	 */
	Integer getContentionScope();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getContentionScope <em>Contention Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contention Scope</em>' attribute.
	 * @see #getContentionScope()
	 * @generated
	 */
	void setContentionScope(Integer value);

	/**
	 * Returns the value of the '<em><b>Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the size of storage to be used for the thread's stack.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stack Size</em>' attribute.
	 * @see #setStackSize(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_StackSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getStackSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getStackSize <em>Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Size</em>' attribute.
	 * @see #getStackSize()
	 * @generated
	 */
	void setStackSize(String value);

	/**
	 * Returns the value of the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the thread's concurrency level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concurrency Level</em>' attribute.
	 * @see #setConcurrencyLevel(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_ConcurrencyLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getConcurrencyLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getConcurrencyLevel <em>Concurrency Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency Level</em>' attribute.
	 * @see #getConcurrencyLevel()
	 * @generated
	 */
	void setConcurrencyLevel(Long value);

	/**
	 * Returns the value of the '<em><b>Cancel State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the thread's cancelability state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cancel State</em>' attribute.
	 * @see #setCancelState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_CancelState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"PTHREAD_CANCEL_ENABLE\",\"PTHREAD_CANCEL_DISABLE\"]'"
	 * @generated
	 */
	Integer getCancelState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getCancelState <em>Cancel State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel State</em>' attribute.
	 * @see #getCancelState()
	 * @generated
	 */
	void setCancelState(Integer value);

	/**
	 * Returns the value of the '<em><b>Cancel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the thread's cancelability type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cancel Type</em>' attribute.
	 * @see #setCancelType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixThread_CancelType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"PTHREAD_CANCEL_DEFERRED\",\"PTHREAD_CANCEL_ASYNCHRONOUS\"]'"
	 * @generated
	 */
	Integer getCancelType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixThread#getCancelType <em>Cancel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Type</em>' attribute.
	 * @see #getCancelType()
	 * @generated
	 */
	void setCancelType(Integer value);

} // CIM_UnixThread
