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
 * A representation of the model object '<em><b>CIM Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Service is a LogicalElement that represents the availability of functionality that can be managed. This functionality may be provided by a seperately modeled entity such as a LogicalDevice or a SoftwareFeature, or both. The modeled Service typically provides only functionality required for management of itself or the elements it affects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Service#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Service#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Service#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Service#getPrimaryOwnerName <em>Primary Owner Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Service#getPrimaryOwnerContact <em>Primary Owner Contact</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Service#getStartMode <em>Start Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Service#getStarted <em>Started</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Service#getLoSID <em>Lo SID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Service#getLoSOrgID <em>Lo SOrg ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Service()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' ClassConstraint='[\"inv: LoSID &lt;&gt; null implies LoSOrgID &lt;&gt; null\"]' UMLPackagePath='CIM::Core::Service' override.Name='string' override.Name.Key='true' override.Name.Description='The Name property uniquely identifies the Service and provides an indication of the functionality that is managed. This functionality is described in more detail in the Description property of the object.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Service extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName of the scoping System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Service_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Service#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Service_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Service#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass that is used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Service_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Service#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Owner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the primary owner for the service, if one is defined. The primary owner is the initial support contact for the Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Owner Name</em>' attribute.
	 * @see #setPrimaryOwnerName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Service_PrimaryOwnerName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MaxLen='64' MappingStrings='[\"MIF.DMTF|General Information|001.3\"]'"
	 * @generated
	 */
	String getPrimaryOwnerName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Service#getPrimaryOwnerName <em>Primary Owner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Owner Name</em>' attribute.
	 * @see #getPrimaryOwnerName()
	 * @generated
	 */
	void setPrimaryOwnerName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Owner Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that provides information on how the primary owner of the Service can be reached (for example, phone number, e-mail address, and so on).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Owner Contact</em>' attribute.
	 * @see #setPrimaryOwnerContact(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Service_PrimaryOwnerContact()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MaxLen='256' MappingStrings='[\"MIF.DMTF|General Information|001.4\"]'"
	 * @generated
	 */
	String getPrimaryOwnerContact();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Service#getPrimaryOwnerContact <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Owner Contact</em>' attribute.
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 */
	void setPrimaryOwnerContact(String value);

	/**
	 * Returns the value of the '<em><b>Start Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated in lieu of the EnabledDefault property that is inherited from EnabledLogicalElement. The EnabledLogicalElement addresses the same semantics. The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property. To remain compatible with those implementations, StartMode was grandfathered into the schema. Use of the deprecated qualifier allows the maintenance of the existing property but also permits an improved, clarified definition using EnabledDefault. 
	 * Deprecated description: StartMode is a string value that indicates whether the Service is automatically started by a System, an Operating System, and so on, or is started only upon request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Mode</em>' attribute.
	 * @see #setStartMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Service_StartMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_Service.EnabledDefault\"]' ValueMap='[\"Automatic\",\"Manual\"]' MaxLen='10'"
	 * @generated
	 */
	String getStartMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Service#getStartMode <em>Start Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Mode</em>' attribute.
	 * @see #getStartMode()
	 * @generated
	 */
	void setStartMode(String value);

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Started is a Boolean that indicates whether the Service has been started (TRUE), or stopped (FALSE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Service_Started()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getStarted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Service#getStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #getStarted()
	 * @generated
	 */
	void setStarted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Lo SID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not Null, the CIM_Service instance represents a line of service, as defined by ITIL, identified by the value of LoSID, which must be unique in the context of an unique identifier for an Organization specified in LoSOrgID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lo SID</em>' attribute.
	 * @see #setLoSID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Service_LoSID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Service.LoSOrgID\"]'"
	 * @generated
	 */
	String getLoSID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Service#getLoSID <em>Lo SID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lo SID</em>' attribute.
	 * @see #getLoSID()
	 * @generated
	 */
	void setLoSID(String value);

	/**
	 * Returns the value of the '<em><b>Lo SOrg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not null, this CIM_Service instance represents an ITIL line of service and the value of LoSOrgID shall be a unique identifier for the organization that defines the value of LoSID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lo SOrg ID</em>' attribute.
	 * @see #setLoSOrgID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Service_LoSOrgID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Service.LoSID\"]'"
	 * @generated
	 */
	String getLoSOrgID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Service#getLoSOrgID <em>Lo SOrg ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lo SOrg ID</em>' attribute.
	 * @see #getLoSOrgID()
	 * @generated
	 */
	void setLoSOrgID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StartService method places the Service in the started state. Note that the function of this method overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (such as a persisted value) of the last state request. Invoking the StartService method should set the RequestedState property appropriately. The method returns an integer value of 0 if the Service was successfully started, 1 if the request is not supported, and any other number to indicate an error. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are translated can also be specified in the subclass as a Values array qualifier. 
	 * 
	 * Note: The semantics of this method overlap with the RequestStateChange method that is inherited from EnabledLogicalElement. This method is maintained because it has been widely implemented, and its simple "start" semantics are convenient to use.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_Service.RequestStateChange\"]'"
	 * @generated
	 */
	Long StartService();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StopService method places the Service in the stopped state. Note that the function of this method overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (such as a persisted value) of the last state request. Invoking the StopService method should set the RequestedState property appropriately. The method returns an integer value of 0 if the Service was successfully stopped, 1 if the request is not supported, and any other number to indicate an error. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are translated can also be specified in the subclass as a Values array qualifier. 
	 * 
	 * Note: The semantics of this method overlap with the RequestStateChange method that is inherited from EnabledLogicalElement. This method is maintained because it has been widely implemented, and its simple "stop" semantics are convenient to use.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_Service.RequestStateChange\"]'"
	 * @generated
	 */
	Long StopService();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to change relative sequence in which order the ManagedElements associated to the Service through CIM_ServiceAffectsElement association are affected. In the case when the Service represents an interface for client to execute extrinsic methods and when it is used for grouping of the managed elements that could be affected, the ordering represents the relevant priority of the affected managed elements with respect to each other. 
	 * An ordered array of ManagedElement instances is passed to this method, where each ManagedElement instance shall be already be associated with this Service instance via CIM_ServiceAffectsElement association. If one of the ManagedElements is not associated to the Service through CIM_ServiceAffectsElement association, the implementation shall return a value of 2 ("Error Occured"). 
	 * Upon successful execution of this method, if the AssignedSequence parameter is NULL, the value of the AssignedSequence property on each instance of CIM_ServiceAffectsElement shall be updated such that the values of AssignedSequence properties shall be monotonically increasing in correlation with the position of the referenced ManagedElement instance in the ManagedElements input parameter. That is, the first position in the array shall have the lowest value for AssignedSequence. The second position shall have the second lowest value, and so on. Upon successful execution, if the AssignedSequence parameter is not NULL, the value of the AssignedSequence property of each instance of CIM_ServiceAffectsElement referencing the ManagedElement instance in the ManagedElements array shall be assigned the value of the corresponding index of the AssignedSequence parameter array. For ManagedElements instances which are associated with the Service instance via CIM_ServiceAffectsElement and are not present in the ManagedElements parameter array, the AssignedSequence property on the CIM_ServiceAffects association shall be assigned a value of 0.
	 * @param ManagedElements An array of ManagedElements.
	 * @param AssignedSequence An array of integers representing AssignedSequence for the ManagedElement in the corresponding index of the ManagedElements parameter.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model ManagedElementsUnique="false" ManagedElementsMany="true"
	 *        ManagedElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]' Required='true'" AssignedSequenceUnique="false" AssignedSequenceMany="true"
	 *        AssignedSequenceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ChangeAffectedElementsAssignedSequence(EList<CIM_ManagedElement> ManagedElements, EList<Integer> AssignedSequence, CIM_ConcreteJob Job);

} // CIM_Service
