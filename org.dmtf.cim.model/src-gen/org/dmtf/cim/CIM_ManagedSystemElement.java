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
 * A representation of the model object '<em><b>CIM Managed System Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ManagedSystemElement is the base class for the System Element hierarchy. Any distinguishable component of a System is a candidate for inclusion in this class. Examples of system components include: 
 * - software components such as application servers, databases, and applications 
 * - operating system components such as files, processes, and threads 
 * - device components such as disk drives, controllers, processors, and printers 
 * - physical components such as chips and cards.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getInstallDate <em>Install Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getStatusDescriptions <em>Status Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getHealthState <em>Health State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getCommunicationStatus <em>Communication Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getDetailedStatus <em>Detailed Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getOperatingStatus <em>Operating Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedSystemElement#getPrimaryStatus <em>Primary Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.28.0' UMLPackagePath='CIM::Core::CoreElements'"
 * @generated
 */
@ProviderType
public interface CIM_ManagedSystemElement extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Install Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A datetime value that indicates when the object was installed. Lack of a value does not indicate that the object is not installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Install Date</em>' attribute.
	 * @see #setInstallDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_InstallDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIF.DMTF|ComponentID|001.5\"]'"
	 * @generated
	 */
	String getInstallDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedSystemElement#getInstallDate <em>Install Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Date</em>' attribute.
	 * @see #getInstallDate()
	 * @generated
	 */
	void setInstallDate(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name property defines the label by which the object is known. When subclassed, the Name property can be overridden to be a Key property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='1024'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedSystemElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current statuses of the element. Various operational statuses are defined. Many of the enumeration's values are self-explanatory. However, a few are not and are described here in more detail. 
	 * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
	 * "Predictive Failure" indicates that an element is functioning nominally but predicting a failure in the near future. 
	 * "In Service" describes an element being configured, maintained, cleaned, or otherwise administered. 
	 * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
	 * "Lost Communication" indicates that the ManagedSystem Element is known to exist and has been contacted successfully in the past, but is currently unreachable. 
	 * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
	 * "Dormant" indicates that the element is inactive or quiesced. 
	 * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems. 
	 * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
	 * "Power Mode" indicates that the element has additional power model information contained in the Associated PowerManagementService association. 
	 * "Relocating" indicates the element is being relocated.
	 * OperationalStatus replaces the Status property on ManagedSystemElement to provide a consistent approach to enumerations, to address implementation needs for an array property, and to provide a migration path from today's environment to the future. This change was not made earlier because it required the deprecated qualifier. Due to the widespread use of the existing Status property in management applications, it is strongly recommended that providers or instrumentation provide both the Status and OperationalStatus properties. Further, the first value of OperationalStatus should contain the primary status for the element. When instrumented, Status (because it is single-valued) should also provide the primary status of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operational Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_OperationalStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"OK\",\"Degraded\",\"Stressed\",\"Predictive Failure\",\"Error\",\"Non-Recoverable Error\",\"Starting\",\"Stopping\",\"Stopped\",\"In Service\",\"No Contact\",\"Lost Communication\",\"Aborted\",\"Dormant\",\"Supporting Entity in Error\",\"Completed\",\"Power Mode\",\"Relocating\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ManagedSystemElement.StatusDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getOperationalStatus();

	/**
	 * Returns the value of the '<em><b>Status Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strings describing the various OperationalStatus array values. For example, if "Stopping" is the value assigned to OperationalStatus, then this property may contain an explanation as to why an object is being stopped. Note that entries in this array are correlated with those at the same array index in OperationalStatus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_StatusDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ManagedSystemElement.OperationalStatus\"]'"
	 * @generated
	 */
	EList<String> getStatusDescriptions();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string indicating the current status of the object. Various operational and non-operational statuses are defined. This property is deprecated in lieu of OperationalStatus, which includes the same semantics in its enumeration. This change is made for 3 reasons: 
	 * 1) Status is more correctly defined as an array. This definition overcomes the limitation of describing status using a single value, when it is really a multi-valued property (for example, an element might be OK AND Stopped. 
	 * 2) A MaxLen of 10 is too restrictive and leads to unclear enumerated values. 
	 * 3) The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property and did not want to modify their code. Therefore, Status was grandfathered into the Schema. Use of the deprecated qualifier allows the maintenance of the existing property, but also permits an improved definition using OperationalStatus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_Status()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_ManagedSystemElement.OperationalStatus\"]' ValueMap='[\"OK\",\"Error\",\"Degraded\",\"Unknown\",\"Pred Fail\",\"Starting\",\"Stopping\",\"Service\",\"Stressed\",\"NonRecover\",\"No Contact\",\"Lost Comm\",\"Stopped\"]' MaxLen='10'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedSystemElement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Health State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current health of the element. This attribute expresses the health of this element but not necessarily that of its subcomponents. The possible values are 0 to 30, where 5 means the element is entirely healthy and 30 means the element is completely non-functional. The following continuum is defined: 
	 * "Non-recoverable Error" (30) - The element has completely failed, and recovery is not possible. All functionality provided by this element has been lost. 
	 * "Critical Failure" (25) - The element is non-functional and recovery might not be possible. 
	 * "Major Failure" (20) - The element is failing. It is possible that some or all of the functionality of this component is degraded or not working. 
	 * "Minor Failure" (15) - All functionality is available but some might be degraded. 
	 * "Degraded/Warning" (10) - The element is in working order and all functionality is provided. However, the element is not working to the best of its abilities. For example, the element might not be operating at optimal performance or it might be reporting recoverable errors. 
	 * "OK" (5) - The element is fully functional and is operating within normal operational parameters and without error. 
	 * "Unknown" (0) - The implementation cannot report on HealthState at this time. 
	 * DMTF has reserved the unused portion of the continuum for additional HealthStates in the future.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Health State</em>' attribute.
	 * @see #setHealthState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_HealthState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"5\",\"10\",\"15\",\"20\",\"25\",\"30\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"OK\",\"Degraded/Warning\",\"Minor failure\",\"Major failure\",\"Critical failure\",\"Non-recoverable error\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getHealthState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedSystemElement#getHealthState <em>Health State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health State</em>' attribute.
	 * @see #getHealthState()
	 * @generated
	 */
	void setHealthState(Integer value);

	/**
	 * Returns the value of the '<em><b>Communication Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationStatus indicates the ability of the instrumentation to communicate with the underlying ManagedElement. CommunicationStatus consists of one of the following values: Unknown, None, Communication OK, Lost Communication, or No Contact. 
	 * A Null return indicates the implementation (provider) does not implement this property. 
	 * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
	 * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
	 * "Communication OK " indicates communication is established with the element, but does not convey any quality of service. 
	 * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
	 * "Lost Communication" indicates that the Managed Element is known to exist and has been contacted successfully in the past, but is currently unreachable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Status</em>' attribute.
	 * @see #setCommunicationStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_CommunicationStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Not Available\",\"Communication OK\",\"Lost Communication\",\"No Contact\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getCommunicationStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedSystemElement#getCommunicationStatus <em>Communication Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Status</em>' attribute.
	 * @see #getCommunicationStatus()
	 * @generated
	 */
	void setCommunicationStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Detailed Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DetailedStatus compliments PrimaryStatus with additional status detail. It consists of one of the following values: Not Available, No Additional Information, Stressed, Predictive Failure, Error, Non-Recoverable Error, SupportingEntityInError. Detailed status is used to expand upon the PrimaryStatus of the element. 
	 * A Null return indicates the implementation (provider) does not implement this property. 
	 * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
	 * "No Additional Information" indicates that the element is functioning normally as indicated by PrimaryStatus = "OK". 
	 * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
	 * "Predictive Failure" indicates that an element is functioning normally but a failure is predicted in the near future. 
	 * "Non-Recoverable Error " indicates that this element is in an error condition that requires human intervention. 
	 * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Status</em>' attribute.
	 * @see #setDetailedStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_DetailedStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Not Available\",\"No Additional Information\",\"Stressed\",\"Predictive Failure\",\"Non-Recoverable Error\",\"Supporting Entity in Error\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.PrimaryStatus\",\"CIM_ManagedSystemElement.HealthState\"]'"
	 * @generated
	 */
	Integer getDetailedStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedSystemElement#getDetailedStatus <em>Detailed Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Status</em>' attribute.
	 * @see #getDetailedStatus()
	 * @generated
	 */
	void setDetailedStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Operating Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperatingStatus provides a current status value for the operational condition of the element and can be used for providing more detail with respect to the value of EnabledState. It can also provide the transitional states when an element is transitioning from one state to another, such as when an element is transitioning between EnabledState and RequestedState, as well as other transitional conditions.
	 * OperatingStatus consists of one of the following values: Unknown, Not Available, In Service, Starting, Stopping, Stopped, Aborted, Dormant, Completed, Migrating, Emmigrating, Immigrating, Snapshotting. Shutting Down, In Test 
	 * A Null return indicates the implementation (provider) does not implement this property. 
	 * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
	 * "None" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
	 * "Servicing" describes an element being configured, maintained, cleaned, or otherwise administered. 
	 * "Starting" describes an element being initialized. 
	 * "Stopping" describes an element being brought to an orderly stop. 
	 * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
	 * "Dormant" indicates that the element is inactive or quiesced. 
	 * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded in the PrimaryStatus so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
	 * "Migrating" element is being moved between host elements. 
	 * "Immigrating" element is being moved to new host element. 
	 * "Emigrating" element is being moved away from host element. 
	 * "Shutting Down" describes an element being brought to an abrupt stop. 
	 * "In Test" element is performing test functions. 
	 * "Transitioning" describes an element that is between states, that is, it is not fully available in either its previous state or its next state. This value should be used if other values indicating a transition to a specific state are not applicable.
	 * "In Service" describes an element that is in service and operational.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operating Status</em>' attribute.
	 * @see #setOperatingStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_OperatingStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Not Available\",\"Servicing\",\"Starting\",\"Stopping\",\"Stopped\",\"Aborted\",\"Dormant\",\"Completed\",\"Migrating\",\"Emigrating\",\"Immigrating\",\"Snapshotting\",\"Shutting Down\",\"In Test\",\"Transitioning\",\"In Service\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	Integer getOperatingStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedSystemElement#getOperatingStatus <em>Operating Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Status</em>' attribute.
	 * @see #getOperatingStatus()
	 * @generated
	 */
	void setOperatingStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Primary Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PrimaryStatus provides a high level status value, intended to align with Red-Yellow-Green type representation of status. It should be used in conjunction with DetailedStatus to provide high level and detailed health status of the ManagedElement and its subcomponents. 
	 * PrimaryStatus consists of one of the following values: Unknown, OK, Degraded or Error. "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
	 * "OK" indicates the ManagedElement is functioning normally. 
	 * "Degraded" indicates the ManagedElement is functioning below normal. 
	 * "Error" indicates the ManagedElement is in an Error condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Status</em>' attribute.
	 * @see #setPrimaryStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedSystemElement_PrimaryStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"OK\",\"Degraded\",\"Error\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.DetailedStatus\",\"CIM_ManagedSystemElement.HealthState\"]'"
	 * @generated
	 */
	Integer getPrimaryStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedSystemElement#getPrimaryStatus <em>Primary Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Status</em>' attribute.
	 * @see #getPrimaryStatus()
	 * @generated
	 */
	void setPrimaryStatus(Integer value);

} // CIM_ManagedSystemElement
