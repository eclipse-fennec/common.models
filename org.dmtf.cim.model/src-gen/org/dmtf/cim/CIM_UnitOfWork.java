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
 * A representation of the model object '<em><b>CIM Unit Of Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each instance of UnitOfWork identifies a transaction that is either in-process or already completed. Because instances of 'in-process' UnitsOfWork can be very short-lived and there can be a great number of active ones, use of this class as an instrumentation source for determining response time may be incorrect or inefficient, unless the rate and duration of the UnitsOfWork are known. The intended use is to respond to queries about currently active or recently completed UnitsOfWork. The length of time that a UnitOfWork instance exists after the UnitOfWork completes is not defined and should be assumed to be implementation-dependent. This class is weak to its definition (CIM_UnitOfWorkDefintion).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWork#getId <em>Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWork#getUoWDefId <em>Uo WDef Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWork#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWork#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWork#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWork#getStatus <em>Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWork#getTraceLevel <em>Trace Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWork#getMutualContextId <em>Mutual Context Id</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWork()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Description='string' override.Description.Description='Since UnitOfWork is designed to be an extremely lightweight object, it is recommended that this property not be used. The Description specified for the instance\'s associated CIM_UnitOfWorkDefintion should apply.' keys='Id,UoWDefId'"
 * @generated
 */
@ProviderType
public interface CIM_UnitOfWork extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the UnitOfWork, within the context of the UnitOfWorkDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWork_Id()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint64' Key='true'"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWork#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Uo WDef Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 16 byte value that uniquely identifies the UnitOfWork Definition. The use of OSF UUID/GUIDs is recommended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uo WDef Id</em>' attribute.
	 * @see #setUoWDefId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWork_UoWDefId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='16' Propagated='CIM_UnitOfWorkDefinition.Id'"
	 * @generated
	 */
	String getUoWDefId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWork#getUoWDefId <em>Uo WDef Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uo WDef Id</em>' attribute.
	 * @see #getUoWDefId()
	 * @generated
	 */
	void setUoWDefId(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the user who initiated the UnitOfWork. This may be a real user's login name or a logical name representing an application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWork_UserName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWork#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the UnitOfWork was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWork_StartTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWork#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elapsed time since the UnitOfWork was started. Upon completion of the UnitOfWork, this property contains the total amount of time taken in processing the entire UnitOfWork.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elapsed Time</em>' attribute.
	 * @see #setElapsedTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWork_ElapsedTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getElapsedTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWork#getElapsedTime <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed Time</em>' attribute.
	 * @see #getElapsedTime()
	 * @generated
	 */
	void setElapsedTime(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration identifing the status of the UnitOfWork. Most of the property values are self-explanatory, but a few need additional text: 
	 * 3="Completed" - Should be used to represent a 'completed' transaction whose status ('good', 'failed' or 'aborted') is unknown. 
	 * 6="Completed Aborted" - Should be used when a UnitOfWork has completed but was not allowed to end normally. An example would be when the Stop or Back buttons are selected from a web browser, before a page is fully loaded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWork_Status()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Active\",\"Suspended\",\"Completed\",\"Completed Good\",\"Completed Failed\",\"Completed Aborted\"]'"
	 * @generated
	 */
	Integer getStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWork#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Trace Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the granularity at which traces are written for this particular instance of UnitOfWork. Traces allow providing more detailed information on the course of the execution of the UnitOfWork than just the status and the elapsed time. The trace level does not indicate where the traces are found (i.e. in which file or CIM instances). TraceLevel cannot be set (i.e. written) since an instance of UnitOfWork only publishes information. So, the application code that executes the unit of work must receive the desired trace level by its caller (e.g. the parent module, the user or some remote system that initiates the unit of work). 
	 * If its value is 0, no traces are available. If its value is > 0, traces are available. Except 0, the possible values and their semantics are implementation dependent. Two instances of UnitOfWork (even with the same definition) may have different trace levels since the desired or required granularity of traces may be dependent on the execution context (detection of an error, analysis of an error, etc.) of the unit of work. 
	 * The trace level can be encoded as a bit map (each individual bit indicates a certain trace type and/or level of detail) or numbers (that are further defined by a value map). No encoding scheme is imposed since no general rules or standards exist and in consequence, application developers could reuse their existing trace level scheme.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Level</em>' attribute.
	 * @see #setTraceLevel(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWork_TraceLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getTraceLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWork#getTraceLevel <em>Trace Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Level</em>' attribute.
	 * @see #getTraceLevel()
	 * @generated
	 */
	void setTraceLevel(Long value);

	/**
	 * Returns the value of the '<em><b>Mutual Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that uniquely identifies the mutual context of UnitOfWork instances. The context is defined as an individual action that several UnitOfWork instances participate in. The use of Ids such as OSF UUID/GUIDs is recommended, although some implementations may require longer Ids. (This is the reason why no maxlen(16) qualifier has been used.) 
	 * MutualContextId explicitly identifies the context for instances of UnitOfWork, that is otherwise provided implicitly by SubUoW association instances. In addition, one can query directly (i.e. without following the associations) for UnitOfWork instances that participate in some individual action (i.e., the mutual context). If no mutual context is needed or if it is not supported by the implementation, the value is NULL. 
	 * Note that the MutualContextId value is to be transferred internally between the participating UnitOfWork implementations such that each UnitOfWork instance implementation receives its value from its predecessor/parent or initially creates the value if it is the first instance of the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutual Context Id</em>' attribute.
	 * @see #setMutualContextId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWork_MutualContextId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getMutualContextId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWork#getMutualContextId <em>Mutual Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutual Context Id</em>' attribute.
	 * @see #getMutualContextId()
	 * @generated
	 */
	void setMutualContextId(String value);

} // CIM_UnitOfWork
