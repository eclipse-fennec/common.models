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
 * A representation of the model object '<em><b>CIM CIMXML Communication Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class specializes ObjectManagerCommunicationMechanism, adding properties specific to the CIM-XML protocol (XML encoding and CIM Operations).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getCIMXMLProtocolVersion <em>CIMXML Protocol Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getCIMValidated <em>CIM Validated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationClosureOnExceedingServerLimitsSupported <em>Pulled Enumeration Closure On Exceeding Server Limits Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationContinuationOnErrorSupported <em>Pulled Enumeration Continuation On Error Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationMaximumOperationTimeout <em>Pulled Enumeration Maximum Operation Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationMinimumOperationTimeout <em>Pulled Enumeration Minimum Operation Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationNoOperationTimeoutSupported <em>Pulled Enumeration No Operation Timeout Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCommunicationMechanism()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_CIMXMLCapabilities\"]' Version='2.45.0' UMLPackagePath='CIM::Interop' override.CommunicationMechanism='uint16' override.CommunicationMechanism.Deprecated='[\"CIM_ProtocolService.Protocol\"]' override.CommunicationMechanism.Required='true' override.CommunicationMechanism.Description='The only valid CommunicationMechanism for this subclass is CIM-XML.' override.CommunicationMechanism.ValueMap='[\"2\"]' override.CommunicationMechanism.Values='[\"CIM-XML\"]' override.Version='string' override.Version.Deprecated='[\"CIM_WBEMProtocolServiceCapabilities.WBEMProtocolVersionsSupported\"]' override.Version.Required='true' override.Version.Description='Enumeration describing the CIM-XML protocol version supported by the ObjectManager.' override.Version.ValueMap='[\"1.0\",\"1.1\",\"1.2\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_CIMXMLCommunicationMechanism extends CIM_ObjectManagerCommunicationMechanism {
	/**
	 * Returns the value of the '<em><b>CIMXML Protocol Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration describing the CIM-XML protocol version supported by the ObjectManager. It is deprecated in lieu of a more general, inherited property (Version).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CIMXML Protocol Version</em>' attribute.
	 * @see #setCIMXMLProtocolVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCommunicationMechanism_CIMXMLProtocolVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_CIMXMLCommunicationMechanism.Version\"]' Required='true' ValueMap='[\"0\",\"1\"]' Values='[\"Unknown\",\"1.0\"]'"
	 * @generated
	 */
	Integer getCIMXMLProtocolVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getCIMXMLProtocolVersion <em>CIMXML Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CIMXML Protocol Version</em>' attribute.
	 * @see #getCIMXMLProtocolVersion()
	 * @generated
	 */
	void setCIMXMLProtocolVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>CIM Validated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes whether the CIM Server is strictly validating (validates the XML document against the DTD) or not (loosely validating).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CIM Validated</em>' attribute.
	 * @see #setCIMValidated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCommunicationMechanism_CIMValidated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]' Required='true'"
	 * @generated
	 */
	Boolean getCIMValidated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getCIMValidated <em>CIM Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CIM Validated</em>' attribute.
	 * @see #getCIMValidated()
	 * @generated
	 */
	void setCIMValidated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Pulled Enumeration Closure On Exceeding Server Limits Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the ObjectManager supports closure of Pulled Enumeration sessions based upon exceeding server limits, as defined in DSP0200 (CIM Operations over HTTP). This property MUST NOT be NULL if the 'Pulled Read' functional profile is supported by the ObjectManager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pulled Enumeration Closure On Exceeding Server Limits Supported</em>' attribute.
	 * @see #setPulledEnumerationClosureOnExceedingServerLimitsSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCommunicationMechanism_PulledEnumerationClosureOnExceedingServerLimitsSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.FunctionalProfilesSupported\"]'"
	 * @generated
	 */
	Boolean getPulledEnumerationClosureOnExceedingServerLimitsSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationClosureOnExceedingServerLimitsSupported <em>Pulled Enumeration Closure On Exceeding Server Limits Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulled Enumeration Closure On Exceeding Server Limits Supported</em>' attribute.
	 * @see #getPulledEnumerationClosureOnExceedingServerLimitsSupported()
	 * @generated
	 */
	void setPulledEnumerationClosureOnExceedingServerLimitsSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Pulled Enumeration Continuation On Error Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the ObjectManager supports continuation on error for Pulled Enumerations, as defined in DSP0200 (CIM Operations over HTTP). This property MUST NOT be NULL if the 'Pulled Read' functional profile is supported by the ObjectManager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pulled Enumeration Continuation On Error Supported</em>' attribute.
	 * @see #setPulledEnumerationContinuationOnErrorSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCommunicationMechanism_PulledEnumerationContinuationOnErrorSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.FunctionalProfilesSupported\"]'"
	 * @generated
	 */
	Boolean getPulledEnumerationContinuationOnErrorSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationContinuationOnErrorSupported <em>Pulled Enumeration Continuation On Error Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulled Enumeration Continuation On Error Supported</em>' attribute.
	 * @see #getPulledEnumerationContinuationOnErrorSupported()
	 * @generated
	 */
	void setPulledEnumerationContinuationOnErrorSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Pulled Enumeration Maximum Operation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum operation timeout allowed by the ObjectManager to be specified for Pulled Enumerations, in seconds. The maximum boundary is considered inclusive, i.e. any actual value less than or equal to this property's value is allowed. The concept of an operation timeout for Pulled Enumerations is defined in DSP0200 (CIM Operations over HTTP). This property MUST NOT be NULL if the 'Pulled Read' functional profile is supported by the ObjectManager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pulled Enumeration Maximum Operation Timeout</em>' attribute.
	 * @see #setPulledEnumerationMaximumOperationTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCommunicationMechanism_PulledEnumerationMaximumOperationTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.FunctionalProfilesSupported\",\"CIM_CIMXMLCommunicationMechanism.PulledEnumerationNoOperationTimeoutSupported\",\"CIM_CIMXMLCommunicationMechanism.PulledEnumerationMinimumOperationTimeout\"]'"
	 * @generated
	 */
	Long getPulledEnumerationMaximumOperationTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationMaximumOperationTimeout <em>Pulled Enumeration Maximum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulled Enumeration Maximum Operation Timeout</em>' attribute.
	 * @see #getPulledEnumerationMaximumOperationTimeout()
	 * @generated
	 */
	void setPulledEnumerationMaximumOperationTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Pulled Enumeration Minimum Operation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the minimum operation timeout allowed by the ObjectManager to be specified for Pulled Enumerations, in seconds. The minimum boundary is considered inclusive, i.e. any actual value greater than or equal to this property's value is allowed. The concept of an operation timeout for Pulled Enumerations is defined in DSP0200 (CIM Operations over HTTP). This property MUST NOT be NULL if the 'Pulled Read' functional profile is supported by the ObjectManager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pulled Enumeration Minimum Operation Timeout</em>' attribute.
	 * @see #setPulledEnumerationMinimumOperationTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCommunicationMechanism_PulledEnumerationMinimumOperationTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.FunctionalProfilesSupported\",\"CIM_CIMXMLCommunicationMechanism.PulledEnumerationNoOperationTimeoutSupported\",\"CIM_CIMXMLCommunicationMechanism.PulledEnumerationMaximumOperationTimeout\"]'"
	 * @generated
	 */
	Long getPulledEnumerationMinimumOperationTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationMinimumOperationTimeout <em>Pulled Enumeration Minimum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulled Enumeration Minimum Operation Timeout</em>' attribute.
	 * @see #getPulledEnumerationMinimumOperationTimeout()
	 * @generated
	 */
	void setPulledEnumerationMinimumOperationTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Pulled Enumeration No Operation Timeout Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether it is allowed by the ObjectManager to specify the special value 0 (indicating no timeout) for the operation timeout for Pulled Enumerations. This property takes precedence over the properties PulledEnumerationMinimumOperationTimeout and PulledEnumerationMaximumOperationTimeout. The concept of an operation timeout for Pulled Enumerations is defined in DSP0200 (CIM Operations over HTTP). This property MUST NOT be NULL if the 'Pulled Read' functional profile is supported by the ObjectManager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pulled Enumeration No Operation Timeout Supported</em>' attribute.
	 * @see #setPulledEnumerationNoOperationTimeoutSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCommunicationMechanism_PulledEnumerationNoOperationTimeoutSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_ObjectManagerCommunicationMechanism.FunctionalProfilesSupported\",\"CIM_CIMXMLCommunicationMechanism.PulledEnumerationMinimumOperationTimeout\",\"CIM_CIMXMLCommunicationMechanism.PulledEnumerationMaximumOperationTimeout\"]'"
	 * @generated
	 */
	Boolean getPulledEnumerationNoOperationTimeoutSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMXMLCommunicationMechanism#getPulledEnumerationNoOperationTimeoutSupported <em>Pulled Enumeration No Operation Timeout Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulled Enumeration No Operation Timeout Supported</em>' attribute.
	 * @see #getPulledEnumerationNoOperationTimeoutSupported()
	 * @generated
	 */
	void setPulledEnumerationNoOperationTimeoutSupported(Boolean value);

} // CIM_CIMXMLCommunicationMechanism
