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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Error is a specialized class that contains information about the severity, cause, recommended actions and other data related to the failure of a CIM Operation. Instances of this type MAY be included as part of the response to a CIM Operation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Error#getErrorType <em>Error Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getOtherErrorType <em>Other Error Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getOwningEntity <em>Owning Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getMessage <em>Message</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getMessageArguments <em>Message Arguments</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getPerceivedSeverity <em>Perceived Severity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getProbableCause <em>Probable Cause</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getProbableCauseDescription <em>Probable Cause Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getRecommendedActions <em>Recommended Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getErrorSource <em>Error Source</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getErrorSourceFormat <em>Error Source Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getOtherErrorSourceFormat <em>Other Error Source Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getCIMStatusCode <em>CIM Status Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Error#getCIMStatusCodeDescription <em>CIM Status Code Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Error()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.22.1' Exception='true' UMLPackagePath='CIM::Interop'"
 * @generated
 */
@ProviderType
public interface CIM_Error extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primary classification of the error. The following values are defined: 
	 * 2 - Communications Error. Errors of this type are principally associated with the procedures and/or processes required to convey information from one point to another. 
	 * 3 - Quality of Service Error. Errors of this type are principally associated with failures that result in reduced functionality or performance. 
	 * 4 - Software Error. Error of this type are principally associated with a software or processing fault. 
	 * 5 - Hardware Error. Errors of this type are principally associated with an equipment or hardware failure. 
	 * 6 - Environmental Error. Errors of this type are principally associated with a failure condition relating the to facility, or other environmental considerations. 
	 * 7 - Security Error. Errors of this type are associated with security violations, detection of viruses, and similar issues. 
	 * 8 - Oversubscription Error. Errors of this type are principally associated with the failure to allocate sufficient resources to complete the operation. 
	 * 9 - Unavailable Resource Error. Errors of this type are principally associated with the failure to access a required resource. 
	 * 10 -Unsupported Operation Error. Errors of this type are principally associated with requests that are not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Type</em>' attribute.
	 * @see #setErrorType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_ErrorType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\"]' Values='[\"Unknown\",\"Other\",\"Communications Error\",\"Quality of Service Error\",\"Software Error\",\"Hardware Error\",\"Environmental Error\",\"Security Error\",\"Oversubscription Error\",\"Unavailable Resource Error\",\"Unsupported Operation Error\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_Error.OtherErrorType\"]'"
	 * @generated
	 */
	Integer getErrorType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getErrorType <em>Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Type</em>' attribute.
	 * @see #getErrorType()
	 * @generated
	 */
	void setErrorType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Error Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing the ErrorType when 1, "Other", is specified as the ErrorType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Error Type</em>' attribute.
	 * @see #setOtherErrorType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_OtherErrorType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Error.ErrorType\"]'"
	 * @generated
	 */
	String getOtherErrorType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getOtherErrorType <em>Other Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Error Type</em>' attribute.
	 * @see #getOtherErrorType()
	 * @generated
	 */
	void setOtherErrorType(String value);

	/**
	 * Returns the value of the '<em><b>Owning Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that uniquely identifies the entity that owns the definition of the format of the Message described in this instance. OwningEntity MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Entity</em>' attribute.
	 * @see #setOwningEntity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_OwningEntity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOwningEntity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getOwningEntity <em>Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Entity</em>' attribute.
	 * @see #getOwningEntity()
	 * @generated
	 */
	void setOwningEntity(String value);

	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An opaque string that uniquely identifies, within the scope of the OwningEntity, the format of the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message ID</em>' attribute.
	 * @see #setMessageID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_MessageID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_Error.Message\",\"CIM_Error.MessageArguments\"]'"
	 * @generated
	 */
	String getMessageID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getMessageID <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' attribute.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formatted message. This message is constructed by combining some or all of the dynamic elements specified in the MessageArguments property with the static elements uniquely identified by the MessageID in a message registry or other catalog associated with the OwningEntity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_Message()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Error.MessageID\",\"CIM_Error.MessageArguments\"]'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Message Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array containing the dynamic content of the message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Arguments</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_MessageArguments()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_Error.MessageID\",\"CIM_Error.Message\"]'"
	 * @generated
	 */
	EList<String> getMessageArguments();

	/**
	 * Returns the value of the '<em><b>Perceived Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
	 * 0 - the Perceived Severity of the indication is unknown or indeterminate. 
	 * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
	 * 2 - Information should be used when providing an informative response. 
	 * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
	 * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
	 * 5 - Major should be used to indicate action is needed NOW. 
	 * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
	 * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
	 * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Error is purely informational or its severity is simply unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Perceived Severity</em>' attribute.
	 * @see #setPerceivedSeverity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_PerceivedSeverity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\"]' Values='[\"Unknown\",\"Other\",\"Information\",\"Degraded/Warning\",\"Minor\",\"Major\",\"Critical\",\"Fatal/NonRecoverable\",\"DMTF Reserved\"]' MappingStrings='[\"Recommendation.ITU|X733.Perceived severity\"]'"
	 * @generated
	 */
	Integer getPerceivedSeverity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getPerceivedSeverity <em>Perceived Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perceived Severity</em>' attribute.
	 * @see #getPerceivedSeverity()
	 * @generated
	 */
	void setPerceivedSeverity(Integer value);

	/**
	 * Returns the value of the '<em><b>Probable Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that describes the probable cause of the error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probable Cause</em>' attribute.
	 * @see #setProbableCause(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_ProbableCause()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"112\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123\",\"124\",\"125\",\"126\",\"127\",\"128\",\"129\",\"130\",\"..\"]' Values='[\"Unknown\",\"Other\",\"Adapter/Card Error\",\"Application Subsystem Failure\",\"Bandwidth Reduced\",\"Connection Establishment Error\",\"Communications Protocol Error\",\"Communications Subsystem Failure\",\"Configuration/Customization Error\",\"Congestion\",\"Corrupt Data\",\"CPU Cycles Limit Exceeded\",\"Dataset/Modem Error\",\"Degraded Signal\",\"DTE-DCE Interface Error\",\"Enclosure Door Open\",\"Equipment Malfunction\",\"Excessive Vibration\",\"File Format Error\",\"Fire Detected\",\"Flood Detected\",\"Framing Error\",\"HVAC Problem\",\"Humidity Unacceptable\",\"I/O Device Error\",\"Input Device Error\",\"LAN Error\",\"Non-Toxic Leak Detected\",\"Local Node Transmission Error\",\"Loss of Frame\",\"Loss of Signal\",\"Material Supply Exhausted\",\"Multiplexer Problem\",\"Out of Memory\",\"Output Device Error\",\"Performance Degraded\",\"Power Problem\",\"Pressure Unacceptable\",\"Processor Problem (Internal Machine Error)\",\"Pump Failure\",\"Queue Size Exceeded\",\"Receive Failure\",\"Receiver Failure\",\"Remote Node Transmission Error\",\"Resource at or Nearing Capacity\",\"Response Time Excessive\",\"Retransmission Rate Excessive\",\"Software Error\",\"Software Program Abnormally Terminated\",\"Software Program Error (Incorrect Results)\",\"Storage Capacity Problem\",\"Temperature Unacceptable\",\"Threshold Crossed\",\"Timing Problem\",\"Toxic Leak Detected\",\"Transmit Failure\",\"Transmitter Failure\",\"Underlying Resource Unavailable\",\"Version Mismatch\",\"Previous Alert Cleared\",\"Login Attempts Failed\",\"Software Virus Detected\",\"Hardware Security Breached\",\"Denial of Service Detected\",\"Security Credential Mismatch\",\"Unauthorized Access\",\"Alarm Received\",\"Loss of Pointer\",\"Payload Mismatch\",\"Transmission Error\",\"Excessive Error Rate\",\"Trace Problem\",\"Element Unavailable\",\"Element Missing\",\"Loss of Multi Frame\",\"Broadcast Channel Failure\",\"Invalid Message Received\",\"Routing Failure\",\"Backplane Failure\",\"Identifier Duplication\",\"Protection Path Failure\",\"Sync Loss or Mismatch\",\"Terminal Problem\",\"Real Time Clock Failure\",\"Antenna Failure\",\"Battery Charging Failure\",\"Disk Failure\",\"Frequency Hopping Failure\",\"Loss of Redundancy\",\"Power Supply Failure\",\"Signal Quality Problem\",\"Battery Discharging\",\"Battery Failure\",\"Commercial Power Problem\",\"Fan Failure\",\"Engine Failure\",\"Sensor Failure\",\"Fuse Failure\",\"Generator Failure\",\"Low Battery\",\"Low Fuel\",\"Low Water\",\"Explosive Gas\",\"High Winds\",\"Ice Buildup\",\"Smoke\",\"Memory Mismatch\",\"Out of CPU Cycles\",\"Software Environment Problem\",\"Software Download Failure\",\"Element Reinitialized\",\"Timeout\",\"Logging Problems\",\"Leak Detected\",\"Protection Mechanism Failure\",\"Protecting Resource Failure\",\"Database Inconsistency\",\"Authentication Failure\",\"Breach of Confidentiality\",\"Cable Tamper\",\"Delayed Information\",\"Duplicate Information\",\"Information Missing\",\"Information Modification\",\"Information Out of Sequence\",\"Key Expired\",\"Non-Repudiation Failure\",\"Out of Hours Activity\",\"Out of Service\",\"Procedural Error\",\"Unexpected Information\",\"DMTF Reserved\"]' MappingStrings='[\"Recommendation.ITU|X733.Probable cause\",\"Recommendation.ITU|M3100.probableCause\",\"ITU-IANA-ALARM-TC\"]' ModelCorrespondence='[\"CIM_Error.ProbableCauseDescription\"]'"
	 * @generated
	 */
	Integer getProbableCause();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getProbableCause <em>Probable Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probable Cause</em>' attribute.
	 * @see #getProbableCause()
	 * @generated
	 */
	void setProbableCause(Integer value);

	/**
	 * Returns the value of the '<em><b>Probable Cause Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing the probable cause of the error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probable Cause Description</em>' attribute.
	 * @see #setProbableCauseDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_ProbableCauseDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Error.ProbableCause\"]'"
	 * @generated
	 */
	String getProbableCauseDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getProbableCauseDescription <em>Probable Cause Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probable Cause Description</em>' attribute.
	 * @see #getProbableCauseDescription()
	 * @generated
	 */
	void setProbableCauseDescription(String value);

	/**
	 * Returns the value of the '<em><b>Recommended Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing recommended actions to take to resolve the error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommended Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_RecommendedActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getRecommendedActions();

	/**
	 * Returns the value of the '<em><b>Error Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifying information of the entity (i.e., the instance) generating the error. If this entity is modeled in the CIM Schema, this property contains the path of the instance encoded as a string parameter. If not modeled, the property contains some identifying string that names the entity that generated the error. The path or identifying string is formatted per the ErrorSourceFormat property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Source</em>' attribute.
	 * @see #setErrorSource(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_ErrorSource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Error.ErrorSourceFormat\"]'"
	 * @generated
	 */
	String getErrorSource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getErrorSource <em>Error Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Source</em>' attribute.
	 * @see #getErrorSource()
	 * @generated
	 */
	void setErrorSource(String value);

	/**
	 * Returns the value of the '<em><b>Error Source Format</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the ErrorSource property is interpretable based on the value of this property. Values are defined as: 
	 * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
	 * 1 - Other. The format is defined by the value of the OtherErrorSourceFormat property.2 - CIMObjectPath. A CIM Object Path as defined in the CIM Infrastructure specification. Note: CIM 2.5 and earlier used the term object names.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Source Format</em>' attribute.
	 * @see #setErrorSourceFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_ErrorSourceFormat()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\"]' Values='[\"Unknown\",\"Other\",\"CIMObjectPath\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_Error.ErrorSource\",\"CIM_Error.OtherErrorSourceFormat\"]'"
	 * @generated
	 */
	Integer getErrorSourceFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getErrorSourceFormat <em>Error Source Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Source Format</em>' attribute.
	 * @see #getErrorSourceFormat()
	 * @generated
	 */
	void setErrorSourceFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Error Source Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string defining "Other" values for ErrorSourceFormat. This value MUST be set to a non NULL value when ErrorSourceFormat is set to a value of 1 ("Other"). For all other values of ErrorSourceFormat, the value of this string must be set to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Error Source Format</em>' attribute.
	 * @see #setOtherErrorSourceFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_OtherErrorSourceFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Error.ErrorSourceFormat\"]'"
	 * @generated
	 */
	String getOtherErrorSourceFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getOtherErrorSourceFormat <em>Other Error Source Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Error Source Format</em>' attribute.
	 * @see #getOtherErrorSourceFormat()
	 * @generated
	 */
	void setOtherErrorSourceFormat(String value);

	/**
	 * Returns the value of the '<em><b>CIM Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CIM status code that characterizes this instance. 
	 * This property defines the status codes that MAY be return by a conforming CIM Server or Listener. Note that not all status codes are valid for each operation. The specification for each operation SHOULD define the status codes that may be returned by that operation. 
	 * The following values for CIM status code are defined: 
	 * 1 - CIM_ERR_FAILED. A general error occurred that is not covered by a more specific error code. 
	 * 2 - CIM_ERR_ACCESS_DENIED. Access to a CIM resource was not available to the client. 
	 * 3 - CIM_ERR_INVALID_NAMESPACE. The target namespace does not exist. 
	 * 4 - CIM_ERR_INVALID_PARAMETER. One or more parameter values passed to the method were invalid. 
	 * 5 - CIM_ERR_INVALID_CLASS. The specified Class does not exist. 
	 * 6 - CIM_ERR_NOT_FOUND. The requested object could not be found. 
	 * 7 - CIM_ERR_NOT_SUPPORTED. The requested operation is not supported. 
	 * 8 - CIM_ERR_CLASS_HAS_CHILDREN. Operation cannot be carried out on this class since it has instances. 
	 * 9 - CIM_ERR_CLASS_HAS_INSTANCES. Operation cannot be carried out on this class since it has instances. 
	 * 10 - CIM_ERR_INVALID_SUPERCLASS. Operation cannot be carried out since the specified superclass does not exist. 
	 * 11 - CIM_ERR_ALREADY_EXISTS. Operation cannot be carried out because an object already exists. 
	 * 12 - CIM_ERR_NO_SUCH_PROPERTY. The specified Property does not exist. 
	 * 13 - CIM_ERR_TYPE_MISMATCH. The value supplied is incompatible with the type. 
	 * 14 - CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED. The query language is not recognized or supported. 
	 * 15 - CIM_ERR_INVALID_QUERY. The query is not valid for the specified query language. 
	 * 16 - CIM_ERR_METHOD_NOT_AVAILABLE. The extrinsic Method could not be executed. 
	 * 17 - CIM_ERR_METHOD_NOT_FOUND. The specified extrinsic Method does not exist. 
	 * 18 - CIM_ERR_UNEXPECTED_RESPONSE. The returned response to the asynchronous operation was not expected. 
	 * 19 - CIM_ERR_INVALID_RESPONSE_DESTINATION. The specified destination for the asynchronous response is not valid. 
	 * 20 - CIM_ERR_NAMESPACE_NOT_EMPTY. The specified Namespace is not empty.
	 * 21 - CIM_ERR_INVALID_ENUMERATION_CONTEXT. The enumeration context supplied is not valid.
	 * 22 - CIM_ERR_INVALID_OPERATION_TIMEOUT. The specified Namespace is not empty.
	 * 23 - CIM_ERR_PULL_HAS_BEEN_ABANDONED. The specified Namespace is not empty.
	 * 24 - CIM_ERR_PULL_CANNOT_BE_ABANDONED. The attempt to abandon a pull operation has failed.
	 * 25 - CIM_ERR_FILTERED_ENUMERATION_NOT_SUPPORTED. Filtered Enumeratrions are not supported.
	 * 26 - CIM_ERR_CONTINUATION_ON_ERROR_NOT_SUPPORTED. Continue on error is not supported.
	 * 27 - CIM_ERR_SERVER_LIMITS_EXCEEDED. The WBEM Server limits have been exceeded (e.g. memory, connections, ...).
	 * 28 - CIM_ERR_SERVER_IS_SHUTTING_DOWN. The WBEM Server is shutting down.
	 * 29 - CIM_ERR_QUERY_FEATURE_NOT_SUPPORTED. The specified Query Feature is not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CIM Status Code</em>' attribute.
	 * @see #setCIMStatusCode(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_CIMStatusCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"..\"]' Values='[\"CIM_ERR_FAILED\",\"CIM_ERR_ACCESS_DENIED\",\"CIM_ERR_INVALID_NAMESPACE\",\"CIM_ERR_INVALID_PARAMETER\",\"CIM_ERR_INVALID_CLASS\",\"CIM_ERR_NOT_FOUND\",\"CIM_ERR_NOT_SUPPORTED\",\"CIM_ERR_CLASS_HAS_CHILDREN\",\"CIM_ERR_CLASS_HAS_INSTANCES\",\"CIM_ERR_INVALID_SUPERCLASS\",\"CIM_ERR_ALREADY_EXISTS\",\"CIM_ERR_NO_SUCH_PROPERTY\",\"CIM_ERR_TYPE_MISMATCH\",\"CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED\",\"CIM_ERR_INVALID_QUERY\",\"CIM_ERR_METHOD_NOT_AVAILABLE\",\"CIM_ERR_METHOD_NOT_FOUND\",\"CIM_ERR_UNEXPECTED_RESPONSE\",\"CIM_ERR_INVALID_RESPONSE_DESTINATION\",\"CIM_ERR_NAMESPACE_NOT_EMPTY\",\"CIM_ERR_INVALID_ENUMERATION_CONTEXT\",\"CIM_ERR_INVALID_OPERATION_TIMEOUT\",\"CIM_ERR_PULL_HAS_BEEN_ABANDONED\",\"CIM_ERR_PULL_CANNOT_BE_ABANDONED\",\"CIM_ERR_FILTERED_ENUMERATION_NOT_SUPPORTED\",\"CIM_ERR_CONTINUATION_ON_ERROR_NOT_SUPPORTED\",\"CIM_ERR_SERVER_LIMITS_EXCEEDED\",\"CIM_ERR_SERVER_IS_SHUTTING_DOWN\",\"CIM_ERR_QUERY_FEATURE_NOT_SUPPORTED\",\"DMTF Reserved\"]' MappingStrings='[\"DSP0201.DMTF|ERROR.CODE|2.3\",\"DSP0200.DMTF|CIMError|1.3\"]' ModelCorrespondence='[\"CIM_Error.CIMStatusCodeDescription\"]'"
	 * @generated
	 */
	Long getCIMStatusCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getCIMStatusCode <em>CIM Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CIM Status Code</em>' attribute.
	 * @see #getCIMStatusCode()
	 * @generated
	 */
	void setCIMStatusCode(Long value);

	/**
	 * Returns the value of the '<em><b>CIM Status Code Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string containing a human-readable description of CIMStatusCode. This description MAY extend, but MUST be consistent with, the definition of CIMStatusCode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CIM Status Code Description</em>' attribute.
	 * @see #setCIMStatusCodeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Error_CIMStatusCodeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"DSP0201.DMTF|ERROR.DESCRIPTION|2.3\",\"DSP0200.DMTF|CIMError|1.3\"]' ModelCorrespondence='[\"CIM_Error.CIMStatusCode\"]'"
	 * @generated
	 */
	String getCIMStatusCodeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Error#getCIMStatusCodeDescription <em>CIM Status Code Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CIM Status Code Description</em>' attribute.
	 * @see #getCIMStatusCodeDescription()
	 * @generated
	 */
	void setCIMStatusCodeDescription(String value);

} // CIM_Error
