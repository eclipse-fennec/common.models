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
 * A representation of the model object '<em><b>CIM Registered Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RegisteredProfile describes a set of CIM Schema classes with required properties and/or methods, necessary to manage a real-world entity or to support a usage scenario, in an interoperable fashion. RegisteredProfiles can be defined by the DMTF or other standards organizations. Note that this class should not be confused with CIM_Profile, which collects SettingData instances, to be applied as a 'configuration profile' for an element. 
 * A RegisteredProfile is a named 'standard' for CIM-based management of a particular System, subsystem, Service or other entity, for a specified set of uses. It is a complete, standalone definition, as opposed to the subclass RegisteredSubProfile, which requires a scoping profile for context. 
 * The uses for a RegisteredProfile or SubProfile MUST be specified in the document that defines the profile. Examples of Profiles are to manage various aspects of an Operating System, Storage Array, or Database. The name of the profile is defined and scoped by its authoring organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RegisteredProfile#getImplementedFeatures <em>Implemented Features</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredProfile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.39.0' UMLPackagePath='CIM::Interop' override.SpecificationType='uint16' override.SpecificationType.Description='If this property has a value other than null, the value shall be 2' override.SpecificationType.ValueMap='[\"2\"]' override.SpecificationType.Values='[\"Profile\"]' override.SpecificationType.ModelCorrespondence='[\"CIM_RegisteredSpecification.OtherSpecificationType\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_RegisteredProfile extends CIM_RegisteredSpecification {
	/**
	 * Returns the value of the '<em><b>Implemented Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Profiles may gather a set of provisions together that are implemented, (or not implemented), as a whole by a conformant implementation. Such sets are known as profile features.
	 * If a profile does not define features, then this property shall be null. 
	 * If not null, an implementation shall put the profile defined feature name of each implemented feature in a separate entry of this array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implemented Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredProfile_ImplementedFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getImplementedFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to close a session to enumerate central and scoping class instances.
	 * @param EnumerationContext The EnumerationContext parameter is the enumeration context value representing the enumeration session to be used.
	 * <!-- end-model-doc -->
	 * @model EnumerationContextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_RegisteredProfile.GetCentralInstances\"]' ValueMap='[\"0\",\"1\",\"..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Long CloseConformantInstances(String EnumerationContext);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to establish and open a session to enumerate central and scoping class instances of this registered profile instance and optionally to retrieve a first set of such instances.
	 * @param ResultClass NULL, or a class name that acts as a filter to select only those central or scoping instances that a kind of the specified class. This is useful to select particular subclasses or to select a particular instances when more than one is defined for a profile.
	 * @param IncludedPropertyList NULL, or unordered set of property names, acting as a restricting filter on the properties included in the returned instance. An empty list specifies to return no properties. The instance path shall always be returned.
	 * @param OperationTimeout
	 *   The operation timeout is the minimum time the CIM Server shall maintain the open enumeration session after the last OpenConformantInstances or PullConformantInstances invocation, (unless the enumeration session was closed during that last invocation). If the operation timeout is exceeded, the enumeration session may be closed at any time, releasing any possibly allocated resources related to the enumeration session. 
	 *   An OperationTimeout of 0 means that there is no operation timeout, i.e. the enumeration session is never closed based on time.
	 *   If OperationTimeout is NULL, the operation timeout is implementation dependent. 
	 *   All other values for OperationTimeout specify the operation timeout in seconds.
	 *   The implementation may restrict the set of allowable values for OperationTimeout. This specifically includes the possibility to not allow 0 (no timeout).
	 *   If the specified value is not an allowable value, the method shall return failure with return code CIM_ERR_INVALID_OPERATION_TIMEOUT.
	 * @param ContinueOnError
	 *   TRUE requests continuation on error. Continuation on error is the ability to resume an enumeration session successfully after an invocation of this method that returned an error. A conformant implementation may support continuation on error.
	 *   If ContinueOnError is true and the method does not support continuation on error, it shall return failure with return code CIM_ERR_CONTINUATION_ON_ERROR_NOT_SUPPORTED 
	 *   If the implementation supports continuation on error, it shall support it as follows: If ContinueOnErroris true, the enumeration session shall remain open when this or a subsequent PullConformantInstances invocation returns failure, and any subsequent successful PullConformantInstances operations process the set of instances that would have remained if the failing invocation had been successful, subject to the consistency rules defined for pulled enumerations, see DSP0223.
	 *   If ContinueOnError is false, the enumeration session shall be closed when this method returns failure.
	 * @param MaxObjectCount The MaxObjectCount input parameter defines the maximum number of elements that may be returned by this Pull operation. Any uint32 number is valid, including 0. The implementation may deliver any number of elements up to MaxObjectCount but shall not deliver more than MaxObjectCount.elements. The CIM Client may use a MaxObjectCount value of 0 as a means of restarting the OperationTimeout for the enumeration session, while it wishes to not retrieve any elements.
	 * @param EnumerationContext
	 *   The EnumerationContext parameter is the enumeration context value representing the enumeration session to be used.
	 *   If the session is closed as a result of this invocation, the output EnumerationContext shall be NULL. Otherwise, the output EnumerationContext shall provide the information necessary for a subsequent PullConformantInstances call.
	 * @param EndOfSequence The EndOfSequence output parameter indicates to the CIM Client whether the enumeration session is exhausted. If EndOfSequence is true upon successful completion of this invocation, no more elements are available and the implmeentation shall close the enumeration session, releasing any possibly allocated resources related to the enumeration session. If EndOfSequence is false, there may be additional elements available and implementation shall not close the enumeration session.
	 * @param InstanceType On successful completion, an array corresponding to the InstanceWithPathList that indicates whether the entry is a scoping instance, a central instance, or both.
	 * @param InstanceWithPathList On successful completion, an correlated, but unordered set of the enumerated instances and their addresses, with a number of entries from 0, up to a maximum defined by MaxObjectCount, that meet the criteria defined in the Open operation that established this enumeration session. Note that returning no entries in the array does not imply that the enumeration session has been exhausted. Only the EndOfSequence output parameter indicates whether the enumeration session has been exhausted.
	 * <!-- end-model-doc -->
	 * @model ResultClassAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" IncludedPropertyListUnique="false" IncludedPropertyListMany="true"
	 *        IncludedPropertyListAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" OperationTimeoutAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'" ContinueOnErrorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" MaxObjectCountAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'" EnumerationContextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='false' Out='true'" EndOfSequenceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='false' Out='true'" InstanceTypeUnique="false" InstanceTypeMany="true"
	 *        InstanceTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='false' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"..\"]' Values='[\"Central Instance\",\"Scoping Instance\",\"Central and Scoping Instance\",\"DMTF Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RegisteredProfile.OpenConformantInstances(InstanceWithPathList)\"]'" InstanceWithPathListUnique="false" InstanceWithPathListMany="true"
	 *        InstanceWithPathListAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true' EmbeddedInstance='CIM_ManagedElement' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RegisteredProfile.OpenConformantInstances(InstanceType)\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_RegisteredProfile.GetCentralInstances\"]' ValueMap='[\"0\",\"1\",\"22\",\"26\",\"..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"CIM_ERR_INVALID_OPERATION_TIMEOUT\",\"CIM_ERR_CONTINUATION_ON_ERROR_NOT_SUPPORTED\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Long OpenConformantInstances(String ResultClass, EList<String> IncludedPropertyList, Long OperationTimeout, Boolean ContinueOnError, Long MaxObjectCount, String EnumerationContext, Boolean EndOfSequence, EList<Integer> InstanceType, EList<String> InstanceWithPathList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to continue enumeration central class instances in the context of a session established by OpenConformantInstances.
	 * @param MaxObjectCount The MaxObjectCount input parameter defines the maximum number of elements that may be returned by this method. Any uint32 number is valid, including 0. The implementation may deliver any number of elements up to MaxObjectCount but shall not deliver more than MaxObjectCount elements. The CIM Client may use a MaxObjectCount value of 0 as a means of restarting the OperationTimeout for the enumeration session, while it wishes to not retrieve any elements.
	 * @param EnumerationContext
	 *   The EnumerationContext parameter is the enumeration context value representing the enumeration session to be used.
	 *   On input, it shall be the EnumerationContext ouput value from the previous invocation of OpenConformantInstances or PullConformantInstances within an open enumeration session.If the session is closed as a result of this invocation, the output EnumerationContext shall be NULL. Otherwise, the output EnumerationContext shall provide the information necessary for a subsequent PullConformantInstances call.
	 * @param EndOfSequence The EndOfSequence output parameter indicates to the CIM Client whether the enumeration session is exhausted. If EndOfSequence is true upon successful completion of this method, no more elements are available and the enumeration session shall be closed, releasing any possibly allocated resources related to the enumeration session. If EndOfSequence is false, there may be additional elements available and enumeration session shall be remain open unless there is an error in which case, ContinueOnError governs whether or not the session is closed or not.
	 * @param InstanceType On successful completion, an array corresponding to the InstanceWithPathList that indicates whether the entry is a scoping instance, a central instance, or both.
	 * @param InstanceWithPathList On successful completion, a correlated, but unordered set of the enumerated instances and their addresses, with a number of entries from 0, up to a maximum defined by MaxObjectCount, that meet the criteria defined in the OpenConformantInstances operation that established this enumeration session. Note that returning no entries in the array does not imply that the enumeration session has been exhausted. Only the EndOfSequence output parameter indicates whether the enumeration session has been exhausted.
	 * <!-- end-model-doc -->
	 * @model MaxObjectCountAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'" EnumerationContextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" EndOfSequenceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='false' Out='true'" InstanceTypeUnique="false" InstanceTypeMany="true"
	 *        InstanceTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='false' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"..\"]' Values='[\"Central Instance\",\"Scoping Instance\",\"Central and Scoping Instance\",\"DMTF Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RegisteredProfile.PullConformantInstances(InstanceWithPathList)\"]'" InstanceWithPathListUnique="false" InstanceWithPathListMany="true"
	 *        InstanceWithPathListAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true' EmbeddedInstance='CIM_ManagedElement' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RegisteredProfile.PullConformantInstances(InstanceType)\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_RegisteredProfile.GetCentralInstances\"]' ValueMap='[\"0\",\"1\",\"21\",\"..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"CIM_ERR_INVALID_ENUMERATION_CONTEXT\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Long PullConformantInstances(Long MaxObjectCount, String EnumerationContext, Boolean EndOfSequence, EList<Integer> InstanceType, EList<String> InstanceWithPathList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetCentralInstances will get all the references of the central instances for the profile represented by this instance. If this method completes without an error, it shall return 0, otherwise it shall return an error with zero or more CIM_Error instances.
	 * @param CentralInstances The CentralInstances output parameter will include zero or more references to central instances for the profile.
	 * <!-- end-model-doc -->
	 * @model CentralInstancesUnique="false" CentralInstancesMany="true"
	 *        CentralInstancesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\"]' Values='[\"Completed with no error\"]'"
	 * @generated
	 */
	Integer GetCentralInstances(EList<CIM_ManagedElement> CentralInstances);

} // CIM_RegisteredProfile
