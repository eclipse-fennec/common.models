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
 * A representation of the model object '<em><b>CIM Application System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ApplicationSystem class represents an application or a software system that supports a particular business function and that can be managed as an independent unit. Such a system can be decomposed into its functional components using the CIM_SoftwareFeature class. The Features for a particular application or software system are located using the CIM_ApplicationSystemSoftwareFeature association. The features are part of the deployment-oriented aspects of the application system. 
 * With regard to the application runtime aspects, the ApplicationSystem class also represents the core class of the Application Systems' sub-model which of the application runtime model. Its role in the systems sub-model is a) the root node of the containment hierarchy of the application elements (at runtime) as services, components, sub-systems, etc., b) the place for runtime overview information such as response time or system status, c) runtime control of the entire application (e.g., start/stop), and d) the main entry point to the navigation through and drill-down into the runtime model. 
 * The lifetime of an instance of this class is not limited to the application instance it represents. Even if the application is not running, the ApplicationSystem object can report properties that have values (e.g., the name of the application or the current status). Note that it is also possible to define the lifetime of the objects through the lifetime of the application instances. 
 * Through ApplicationSystemDependency, non-containment relationships can be expressed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ApplicationSystem#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ApplicationSystem#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ApplicationSystem#getServingStatus <em>Serving Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ApplicationSystem#getLastServingStatusUpdate <em>Last Serving Status Update</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::DeploymentModel' override.EnabledState='uint16' override.EnabledState.Description='EnabledState is an integer enumeration that indicates the enabled/disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down and starting are transient states between enabled and disabled. \nIn contrast to the original version defined higher in the inheritance hierarchy (EnabledLogicalElement), EnabledState is simplified. It reflects the notion of an execution status tailored to applications and represents a summary of the original property. It allows simplified and efficient determination of whether the application is started, stopped or in transition between either of these states. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. \nThe mapping to MSE.OperationalStatus is as follows: \nExecutionStatus &lt;- MSE.OperationalStatus \nUnknown &lt;- Unknown, No Contact, Lost Communication, \nEither of the values &lt;- Other \nEnabled (started) &lt;- OK, Degraded, Stressed, Predictive Failure, In Service, Dormant, Supporting Entity in Error, Completed \nEnabled or Disabled (Started or Stopped) &lt;- Error, Non-Recoverable Error \nStarting &lt;- Starting \nShutting Down (Stopping) &lt;- Stopping \nDisabled (Stopped) &lt;- Stopped, Aborted. \nThe mapping to the original EnabledState property is as follows: \nUnknown &lt;- Unknown, Not Applicable \nEither of the values &lt;-Other \nEnabled &lt;- Enabled, Enabled but Offline, In Test, Deferred, Quiesce \nDisabled &lt;- Disabled \nShuttingDown &lt;- ShuttingDown \nStarting &lt;- Starting.' override.EnabledState.ValueMap='[\"0\",\"2\",\"3\",\"4\",\"10\",\"11..32767\",\"32768..65535\"]' override.EnabledState.Values='[\"Unknown\",\"Enabled\",\"Disabled\",\"Shutting Down\",\"Starting\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ApplicationSystem extends CIM_System {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distribution describes how the application system is distributed with respect to its underlying servers. In general, the application system is distributed or local. This property indicates whether the application system is running on one or multiple servers. This can be determined without having to query for associated servers represented by ComputerSystems. Distributed systems also introduce a virtual notion to themselves. Note that a distributed application system is not tangible but virtual. Only its contained local systems can be found as processes or threads, and can therefore be regarded as tangible. The distributed system remains a named, virtual entity, that scopes strongly bound constituents and allows the application to be managed in its entirety. 
	 * The property is needed to help root cause analysis and operations, especially when these are automated, in order to clearly know that more than one executed application - most likely the local application systems - is affected by the management task. This is particularly true if the contained application systems provide uniform functionality like webserver or application server farms. 
	 * To express constraints between distributed and local system, this class must be derived and appropriate associations must be defined. 
	 * This property should not be confused with the Roles[] property defined in System. The latter is reserved for administrator assigned roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distribution</em>' attribute.
	 * @see #setDistribution(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystem_Distribution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Distributed\",\"Local\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getDistribution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ApplicationSystem#getDistribution <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' attribute.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(Integer value);

	/**
	 * Returns the value of the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time (date and time) when the application system was last started. If the application system is in a state other the state Enabled (i.e., started and running) this value is not meaningful and the property value MUST be set to all zeros. 
	 * StartupTime is preferably the point in time when the application is available to the user. Instead, if the provider and/or the instrumentation cannot determine the point in time the application becomes available, the point in time can be used at which the underlying operating system reports successful launch of the application. If no value can be provided the property value MUST be set to all zeros.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Startup Time</em>' attribute.
	 * @see #setStartupTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystem_StartupTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getStartupTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ApplicationSystem#getStartupTime <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Time</em>' attribute.
	 * @see #getStartupTime()
	 * @generated
	 */
	void setStartupTime(String value);

	/**
	 * Returns the value of the '<em><b>Serving Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServingStatus is a summary of MSE.OperationalStatus. It allows simplified and efficient determination of whether the application is providing service or has stopped doing so for various reasons like errors, shutdown, abort, etc. Therefore, no transitional values are provided. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. Therefore, ServingStatus is suited to provide summary information for monitoring purposes and service level management. 
	 * The mapping to MSE.OperationalStatus is as follows: 
	 * ServingStatus <- MSE.OperationalStatus 
	 * Unknown <- Unknown, No Contact, Lost Communication 
	 * Either of the values <- Other 
	 * Serving <- OK, Degraded, Stressed, Predictive Failure, Completed 
	 * Not Serving <- Error, Non-Recoverable Error, Starting, Stopping, Stopped, In Service, Aborted, Dormant, Supporting Entity in Error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serving Status</em>' attribute.
	 * @see #setServingStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystem_ServingStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"5..4096\",\"4097..65535\"]' Values='[\"Unknown\",\"Serving\",\"Not Serving\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.OperationalStatus\"]'"
	 * @generated
	 */
	Integer getServingStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ApplicationSystem#getServingStatus <em>Serving Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serving Status</em>' attribute.
	 * @see #getServingStatus()
	 * @generated
	 */
	void setServingStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Serving Status Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time at which the ServingStatus property was last updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Serving Status Update</em>' attribute.
	 * @see #setLastServingStatusUpdate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystem_LastServingStatusUpdate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_ApplicationSystem.ServingStatus\"]'"
	 * @generated
	 */
	String getLastServingStatusUpdate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ApplicationSystem#getLastServingStatusUpdate <em>Last Serving Status Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Serving Status Update</em>' attribute.
	 * @see #getLastServingStatusUpdate()
	 * @generated
	 */
	void setLastServingStatusUpdate(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StartApplication() starts an application system. The ApplicationSystem object must have been created prior to the invocation of this method. It is up to the implementation of the method to define which of the contained or dependent sub-elements are to be started and in which order their startup may occur. 
	 * Since a system startup can extend over long periods of time (several minutes is not unusual for complex distributed applications), the method can be implemented synchronously or asynchronously. In both cases EnabledState and RequestedState reflect the current state of the application and the desired state (Enabled) respectively. The exact nature of the errors during the startup cannot be determined in the asynchronous case. The method must return one of the following values: 
	 * Unspecified Error: If no return code can be identified 
	 * Completed with No Error: successful invocation 
	 * Start Already in Progress: application still being started 
	 * Failed:Indicates errors upon execution.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Unspecified Error\",\"Completed with No Error\",\"Start Already in Progress\",\"Failed\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ApplicationSystem.EnabledState\",\"CIM_ApplicationSystem.RequestedState\"]'"
	 * @generated
	 */
	Integer StartApplication();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StopApplication() allows for stopping/shutting down an application system. It is up to the implementation of the method to define which of the contained or dependent sub-elements are to be stopped and in which order their stop has to occur. 
	 * Since a system shutdown can last considerable time (several minutes is not necessarily unusual for complex distributed applications), the method can be implemented synchronously or asynchronously. In both cases EnabledState and RequestedState reflect the current state of the application and the desired state (Disabled) respectively. The exact nature of the errors during the stop cannot be determined in the asynchronous case. The method must return one of the following: 
	 * Unspecified Error: If no return code can be identified 
	 * Completed with No Error: successful invocation 
	 * Stop Already in Process: application is shutting down 
	 * Failed: Indicates errors upon execution.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Unspecified Error\",\"Completed with No Error\",\"Stop Already in Process\",\"Failed\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ApplicationSystem.EnabledState\",\"CIM_ApplicationSystem.RequestedState\"]'"
	 * @generated
	 */
	Integer StopApplication();

} // CIM_ApplicationSystem
