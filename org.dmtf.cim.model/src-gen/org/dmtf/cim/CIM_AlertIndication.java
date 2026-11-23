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
 * A representation of the model object '<em><b>CIM Alert Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concrete superclass for CIM Alert notifications. An AlertIndication is a specialized type of CIM_Indication that contains information about the severity, cause, recommended actions and other data of a real world event. This event and its data may or may not be modeled in the CIM class hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getDescription <em>Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getAlertingManagedElement <em>Alerting Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getAlertingElementFormat <em>Alerting Element Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getOtherAlertingElementFormat <em>Other Alerting Element Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getAlertType <em>Alert Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getOtherAlertType <em>Other Alert Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getProbableCause <em>Probable Cause</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getProbableCauseDescription <em>Probable Cause Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getTrending <em>Trending</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getRecommendedActions <em>Recommended Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getEventID <em>Event ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getEventTime <em>Event Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getMessage <em>Message</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getMessageArguments <em>Message Arguments</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlertIndication#getOwningEntity <em>Owning Entity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.27.0' UMLPackagePath='CIM::Event' override.PerceivedSeverity='uint16' override.PerceivedSeverity.Required='true' override.PerceivedSeverity.Description='An enumerated value that describes the severity of the Alert Indication from the notifier\'s point of view: \n1 - Other, by CIM convention, is used to indicate that the Severity\'s value can be found in the OtherSeverity property. \n3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. \n4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. \n5 - Major should be used to indicate action is needed NOW. \n6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). \n7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it\'s too late to take remedial action. \n2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the AlertIndication is purely informational or its severity is simply unknown.' override.PerceivedSeverity.ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' override.PerceivedSeverity.Values='[\"Unknown\",\"Other\",\"Information\",\"Degraded/Warning\",\"Minor\",\"Major\",\"Critical\",\"Fatal/NonRecoverable\"]' override.PerceivedSeverity.MappingStrings='[\"Recommendation.ITU|X733.Perceived severity\"]'"
 * @generated
 */
@ProviderType
public interface CIM_AlertIndication extends CIM_ProcessIndication {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description of the Indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_Description()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"Recommendation.ITU|X733.Additional text\"]'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Alerting Managed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifying information of the entity (ie, the instance) for which this Indication is generated. The property contains the path of an instance, encoded as a string parameter - if the instance is modeled in the CIM Schema. If not a CIM instance, the property contains some identifying string that names the entity for which the Alert is generated. The path or identifying string is formatted per the AlertingElementFormat property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alerting Managed Element</em>' attribute.
	 * @see #setAlertingManagedElement(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_AlertingManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AlertIndication.AlertingElementFormat\"]'"
	 * @generated
	 */
	String getAlertingManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getAlertingManagedElement <em>Alerting Managed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alerting Managed Element</em>' attribute.
	 * @see #getAlertingManagedElement()
	 * @generated
	 */
	void setAlertingManagedElement(String value);

	/**
	 * Returns the value of the '<em><b>Alerting Element Format</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the AlertingManagedElement property is interpretable based upon the value of this property. Values are defined as: 
	 * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
	 * 1 - Other. The format is defined by the value of the OtherAlertingElementFormat property. 
	 * 2 - CIMObjectPath. The format is a CIMObjectPath, with format <NamespacePath>:<ClassName>.<Prop1>="<Value1>", <Prop2>="<Value2>", . . . specifying an instance in the CIM Schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alerting Element Format</em>' attribute.
	 * @see #setAlertingElementFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_AlertingElementFormat()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Other\",\"CIMObjectPath\"]' ModelCorrespondence='[\"CIM_AlertIndication.AlertingManagedElement\",\"CIM_AlertIndication.OtherAlertingElementFormat\"]'"
	 * @generated
	 */
	Integer getAlertingElementFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getAlertingElementFormat <em>Alerting Element Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alerting Element Format</em>' attribute.
	 * @see #getAlertingElementFormat()
	 * @generated
	 */
	void setAlertingElementFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Alerting Element Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string defining "Other" values for AlertingElementFormat. This value MUST be set to a non NULL value when AlertingElementFormat is set to a value of 1 ("Other"). For all other values of AlertingElementFormat, the value of this string must be set to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Alerting Element Format</em>' attribute.
	 * @see #setOtherAlertingElementFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_OtherAlertingElementFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AlertIndication.AlertingElementFormat\"]'"
	 * @generated
	 */
	String getOtherAlertingElementFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getOtherAlertingElementFormat <em>Other Alerting Element Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Alerting Element Format</em>' attribute.
	 * @see #getOtherAlertingElementFormat()
	 * @generated
	 */
	void setOtherAlertingElementFormat(String value);

	/**
	 * Returns the value of the '<em><b>Alert Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primary classification of the Indication. The following values are defined: 
	 * 1 - Other. The Indication's OtherAlertType property conveys its classification. Use of "Other" in an enumeration is a standard CIM convention. It means that the current Indication does not fit into the categories described by this enumeration. 
	 * 2 - Communications Alert. An Indication of this type is principally associated with the procedures and/or processes required to convey information from one point to another. 
	 * 3 - Quality of Service Alert. An Indication of this type is principally associated with a degradation or errors in the performance or function of an entity. 
	 * 4 - Processing Error. An Indication of this type is principally associated with a software or processing fault. 
	 * 5 - Device Alert. An Indication of this type is principally associated with an equipment or hardware fault. 
	 * 6 - Environmental Alert. An Indication of this type is principally associated with a condition relating to an enclosure in which the hardware resides, or other environmental considerations. 
	 * 7 - Model Change. The Indication addresses changes in the Information Model. For example, it may embed a Lifecycle Indication to convey the specific model change being alerted. 
	 * 8 - Security Alert. An Indication of this type is associated with security violations, detection of viruses, and similar issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alert Type</em>' attribute.
	 * @see #setAlertType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_AlertType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Other\",\"Communications Alert\",\"Quality of Service Alert\",\"Processing Error\",\"Device Alert\",\"Environmental Alert\",\"Model Change\",\"Security Alert\"]' MappingStrings='[\"Recommendation.ITU|X733.Event type\"]'"
	 * @generated
	 */
	Integer getAlertType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getAlertType <em>Alert Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alert Type</em>' attribute.
	 * @see #getAlertType()
	 * @generated
	 */
	void setAlertType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Alert Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Alert type - used when the AlertType property is set to 1, "Other State Change".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Alert Type</em>' attribute.
	 * @see #setOtherAlertType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_OtherAlertType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AlertIndication.AlertType\"]'"
	 * @generated
	 */
	String getOtherAlertType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getOtherAlertType <em>Other Alert Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Alert Type</em>' attribute.
	 * @see #getOtherAlertType()
	 * @generated
	 */
	void setOtherAlertType(String value);

	/**
	 * Returns the value of the '<em><b>Probable Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that describes the probable cause of the situation which resulted in the AlertIndication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probable Cause</em>' attribute.
	 * @see #setProbableCause(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_ProbableCause()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"112\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123\",\"124\",\"125\",\"126\",\"127\",\"128\",\"129\",\"130\"]' Values='[\"Unknown\",\"Other\",\"Adapter/Card Error\",\"Application Subsystem Failure\",\"Bandwidth Reduced\",\"Connection Establishment Error\",\"Communications Protocol Error\",\"Communications Subsystem Failure\",\"Configuration/Customization Error\",\"Congestion\",\"Corrupt Data\",\"CPU Cycles Limit Exceeded\",\"Dataset/Modem Error\",\"Degraded Signal\",\"DTE-DCE Interface Error\",\"Enclosure Door Open\",\"Equipment Malfunction\",\"Excessive Vibration\",\"File Format Error\",\"Fire Detected\",\"Flood Detected\",\"Framing Error\",\"HVAC Problem\",\"Humidity Unacceptable\",\"I/O Device Error\",\"Input Device Error\",\"LAN Error\",\"Non-Toxic Leak Detected\",\"Local Node Transmission Error\",\"Loss of Frame\",\"Loss of Signal\",\"Material Supply Exhausted\",\"Multiplexer Problem\",\"Out of Memory\",\"Output Device Error\",\"Performance Degraded\",\"Power Problem\",\"Pressure Unacceptable\",\"Processor Problem (Internal Machine Error)\",\"Pump Failure\",\"Queue Size Exceeded\",\"Receive Failure\",\"Receiver Failure\",\"Remote Node Transmission Error\",\"Resource at or Nearing Capacity\",\"Response Time Excessive\",\"Retransmission Rate Excessive\",\"Software Error\",\"Software Program Abnormally Terminated\",\"Software Program Error (Incorrect Results)\",\"Storage Capacity Problem\",\"Temperature Unacceptable\",\"Threshold Crossed\",\"Timing Problem\",\"Toxic Leak Detected\",\"Transmit Failure\",\"Transmitter Failure\",\"Underlying Resource Unavailable\",\"Version MisMatch\",\"Previous Alert Cleared\",\"Login Attempts Failed\",\"Software Virus Detected\",\"Hardware Security Breached\",\"Denial of Service Detected\",\"Security Credential MisMatch\",\"Unauthorized Access\",\"Alarm Received\",\"Loss of Pointer\",\"Payload Mismatch\",\"Transmission Error\",\"Excessive Error Rate\",\"Trace Problem\",\"Element Unavailable\",\"Element Missing\",\"Loss of Multi Frame\",\"Broadcast Channel Failure\",\"Invalid Message Received\",\"Routing Failure\",\"Backplane Failure\",\"Identifier Duplication\",\"Protection Path Failure\",\"Sync Loss or Mismatch\",\"Terminal Problem\",\"Real Time Clock Failure\",\"Antenna Failure\",\"Battery Charging Failure\",\"Disk Failure\",\"Frequency Hopping Failure\",\"Loss of Redundancy\",\"Power Supply Failure\",\"Signal Quality Problem\",\"Battery Discharging\",\"Battery Failure\",\"Commercial Power Problem\",\"Fan Failure\",\"Engine Failure\",\"Sensor Failure\",\"Fuse Failure\",\"Generator Failure\",\"Low Battery\",\"Low Fuel\",\"Low Water\",\"Explosive Gas\",\"High Winds\",\"Ice Buildup\",\"Smoke\",\"Memory Mismatch\",\"Out of CPU Cycles\",\"Software Environment Problem\",\"Software Download Failure\",\"Element Reinitialized\",\"Timeout\",\"Logging Problems\",\"Leak Detected\",\"Protection Mechanism Failure\",\"Protecting Resource Failure\",\"Database Inconsistency\",\"Authentication Failure\",\"Breach of Confidentiality\",\"Cable Tamper\",\"Delayed Information\",\"Duplicate Information\",\"Information Missing\",\"Information Modification\",\"Information Out of Sequence\",\"Key Expired\",\"Non-Repudiation Failure\",\"Out of Hours Activity\",\"Out of Service\",\"Procedural Error\",\"Unexpected Information\"]' MappingStrings='[\"Recommendation.ITU|X733.Probable cause\",\"Recommendation.ITU|M3100.probableCause\",\"ITU-IANA-ALARM-TC\"]' ModelCorrespondence='[\"CIM_AlertIndication.ProbableCauseDescription\",\"CIM_AlertIndication.EventID\",\"CIM_AlertIndication.EventTime\"]'"
	 * @generated
	 */
	Integer getProbableCause();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getProbableCause <em>Probable Cause</em>}' attribute.
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
	 * Provides additional information related to the ProbableCause.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probable Cause Description</em>' attribute.
	 * @see #setProbableCauseDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_ProbableCauseDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AlertIndication.ProbableCause\"]'"
	 * @generated
	 */
	String getProbableCauseDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getProbableCauseDescription <em>Probable Cause Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probable Cause Description</em>' attribute.
	 * @see #getProbableCauseDescription()
	 * @generated
	 */
	void setProbableCauseDescription(String value);

	/**
	 * Returns the value of the '<em><b>Trending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides information on trending - trending up, down or no change.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trending</em>' attribute.
	 * @see #setTrending(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_Trending()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Not Applicable\",\"Trending Up\",\"Trending Down\",\"No Change\"]' MappingStrings='[\"Recommendation.ITU|X733.TrendIndication\"]'"
	 * @generated
	 */
	Integer getTrending();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getTrending <em>Trending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trending</em>' attribute.
	 * @see #getTrending()
	 * @generated
	 */
	void setTrending(Integer value);

	/**
	 * Returns the value of the '<em><b>Recommended Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free form descriptions of the recommended actions to take to resolve the cause of the notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommended Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_RecommendedActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"Recommendation.ITU|X733.Proposed repair actions\"]'"
	 * @generated
	 */
	EList<String> getRecommendedActions();

	/**
	 * Returns the value of the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An instrumentation or provider specific value that describes the underlying "real-world" event represented by the Indication. Two Indications with the same, non NULL EventID value are considered, by the creating entity, to represent the same event. The comparison of two EventID values is only defined for Alert Indications with identical, non NULL values of SystemCreateClassName, SystemName and ProviderName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event ID</em>' attribute.
	 * @see #setEventID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_EventID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AlertIndication.ProbableCause\"]'"
	 * @generated
	 */
	String getEventID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getEventID <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event ID</em>' attribute.
	 * @see #getEventID()
	 * @generated
	 */
	void setEventID(String value);

	/**
	 * Returns the value of the '<em><b>Event Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time and date the underlying event was first detected. If specified, this property MUST be set to NULL if the creating entity is not capable of providing this information. This value is based on the notion of local date and time of the Managed System Element generating the Indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Time</em>' attribute.
	 * @see #setEventTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_EventTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_AlertIndication.ProbableCause\"]'"
	 * @generated
	 */
	String getEventTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getEventTime <em>Event Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Time</em>' attribute.
	 * @see #getEventTime()
	 * @generated
	 */
	void setEventTime(String value);

	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CreationClassName for the Provider generating this Indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * The scoping System's Name for the Provider generating this Indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the Provider generating this Indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_ProviderName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formatted message. This message is constructed by combining some or all of the dynamic elements specified in the MessageArguments property with the static elements uniquely identified by the MessageID in a message registry or other catalog associated with the OwningEntity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_Message()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AlertIndication.MessageID\",\"CIM_AlertIndication.MessageArguments\"]'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getMessage <em>Message</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_MessageArguments()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_AlertIndication.Message\",\"CIM_AlertIndication.MessageID\"]'"
	 * @generated
	 */
	EList<String> getMessageArguments();

	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that uniquely identifies, within the scope of the OwningEntity, the format of the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message ID</em>' attribute.
	 * @see #setMessageID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_MessageID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AlertIndication.Message\",\"CIM_AlertIndication.MessageArguments\"]'"
	 * @generated
	 */
	String getMessageID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getMessageID <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' attribute.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(String value);

	/**
	 * Returns the value of the '<em><b>Owning Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that uniquely identifies the entity that owns the definition of the format of the Message described in this instance. OwningEntity MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Entity</em>' attribute.
	 * @see #setOwningEntity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertIndication_OwningEntity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOwningEntity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertIndication#getOwningEntity <em>Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Entity</em>' attribute.
	 * @see #getOwningEntity()
	 * @generated
	 */
	void setOwningEntity(String value);

} // CIM_AlertIndication
