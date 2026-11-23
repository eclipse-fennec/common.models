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
 * A representation of the model object '<em><b>CIM Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Indication is the abstract root class for all notifications about changes in schema, objects and their data, and about events detected by providers and instrumentation. Subclasses represent specific types of notifications. 
 * 
 * To receive an Indication, a consumer (or subscriber) must create an instance of CIM_IndicationFilter describing the criteria of the notification, an instance of CIM_ListenerDestination describing the delivery of the notification, and an instance of CIM_IndicationSubscription associating the Filter and Handler.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Indication#getIndicationIdentifier <em>Indication Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Indication#getCorrelatedIndications <em>Correlated Indications</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Indication#getIndicationTime <em>Indication Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Indication#getPerceivedSeverity <em>Perceived Severity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Indication#getOtherSeverity <em>Other Severity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Indication#getIndicationFilterName <em>Indication Filter Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Indication#getSequenceContext <em>Sequence Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Indication#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Indication()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Abstract='true' Version='2.24.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_Indication extends EObject {
	/**
	 * Returns the value of the '<em><b>Indication Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array.To ensure uniqueness, the value of IndicationIdentifier should be constructed using the following "preferred" algorithm: 
	 * <OrgID>:<LocalID> 
	 * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IndicationIdentifier or that is a recognized ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in IndicationIdentifier must appear between <OrgID> and <LocalID>. 
	 * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. 
	 * If the above "preferred" algorithm is not used, the defining entity should assure that the resulting IndicationIdentifier is not re-used across any IndicationIdentifiers that are produced by this or other providers for the NameSpace of this instance. 
	 * For DMTF-defined instances, the "preferred" algorithm should be used with the <OrgID> set to CIM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication Identifier</em>' attribute.
	 * @see #setIndicationIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Indication_IndicationIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"Recommendation.ITU|X733.Notification identifier\"]'"
	 * @generated
	 */
	String getIndicationIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Indication#getIndicationIdentifier <em>Indication Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indication Identifier</em>' attribute.
	 * @see #getIndicationIdentifier()
	 * @generated
	 */
	void setIndicationIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Correlated Indications</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correlated Indications</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Indication_CorrelatedIndications()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"Recommendation.ITU|X733.Correlated notifications\"]' ModelCorrespondence='[\"CIM_Indication.IndicationIdentifier\"]'"
	 * @generated
	 */
	EList<String> getCorrelatedIndications();

	/**
	 * Returns the value of the '<em><b>Indication Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determining this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication Time</em>' attribute.
	 * @see #setIndicationTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Indication_IndicationTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getIndicationTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Indication#getIndicationTime <em>Indication Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indication Time</em>' attribute.
	 * @see #getIndicationTime()
	 * @generated
	 */
	void setIndicationTime(String value);

	/**
	 * Returns the value of the '<em><b>Perceived Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
	 * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
	 * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
	 * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
	 * 5 - Major should be used to indicate action is needed NOW. 
	 * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
	 * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
	 * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Indication is purely informational or its severity is simply unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Perceived Severity</em>' attribute.
	 * @see #setPerceivedSeverity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Indication_PerceivedSeverity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\"]' Values='[\"Unknown\",\"Other\",\"Information\",\"Degraded/Warning\",\"Minor\",\"Major\",\"Critical\",\"Fatal/NonRecoverable\",\"DMTF Reserved\"]' MappingStrings='[\"Recommendation.ITU|X733.Perceived severity\"]'"
	 * @generated
	 */
	Integer getPerceivedSeverity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Indication#getPerceivedSeverity <em>Perceived Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perceived Severity</em>' attribute.
	 * @see #getPerceivedSeverity()
	 * @generated
	 */
	void setPerceivedSeverity(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds the value of the user defined severity value when 'PerceivedSeverity' is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Severity</em>' attribute.
	 * @see #setOtherSeverity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Indication_OtherSeverity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AlertIndication.PerceivedSeverity\"]'"
	 * @generated
	 */
	String getOtherSeverity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Indication#getOtherSeverity <em>Other Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Severity</em>' attribute.
	 * @see #getOtherSeverity()
	 * @generated
	 */
	void setOtherSeverity(String value);

	/**
	 * Returns the value of the '<em><b>Indication Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the indication filter that selects this indication and causes it to be sent. This property is to be filled out by the indication sending service. The value shall be correlatable with the Name property of the instance of CIM_IndicationFilter describing the criteria of the indication. The value of the IndicationFilterName should be formatted using the following algorithm: < OrgID > : < LocalID >, where < OrgID > and < LocalID > are separated by a colon (:) and < OrgID > shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the value or that is a registered ID assigned to the business entity by a recognized global authority. In addition, to ensure uniqueness, < OrgID > shall not contain a colon (:).When using this algorithm, the first colon to appear in the value shall appear between < OrgID > and < LocalID >. < LocalID > is chosen by the business entity and shall be used uniquely.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication Filter Name</em>' attribute.
	 * @see #setIndicationFilterName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Indication_IndicationFilterName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IndicationFilter.Name\"]'"
	 * @generated
	 */
	String getIndicationFilterName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Indication#getIndicationFilterName <em>Indication Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indication Filter Name</em>' attribute.
	 * @see #getIndicationFilterName()
	 * @generated
	 */
	void setIndicationFilterName(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence context portion of a sequence identifier for the indication. The sequence number portion of the sequence identifier is provided by the SequenceNumber property. The combination of both property values represents the sequence identifier for the indication.
	 * The sequence identifier for the indication enables a CIM listener to identify duplicate indications when the CIM service attempts the delivery retry of indications, to reorder indications that arrive out-of-order, and to detect lost indications.
	 * If a CIM service does not support sequence identifiers for indications, this property shall be NULL.
	 * If a CIM service supports sequence identifiers for indications, this property shall be maintained by the CIM service for each registered listener destination, and its value shall uniquely identify the CIM service and the indication service within the CIM service such that restarts of the CIM service and deregistration of listener destinations to the CIM service cause the value to change, without reusing earlier values for a sufficiently long time.
	 * When retrying the delivery of an indication, this property shall have the same value as in the original delivery.
	 * To guarantee this uniqueness, the property value should be constructed using the following format (defined in ABNF): sequence-context = indication-service-name "#" cim-service-start-id "#" listener-destination-creation-time
	 * Where: indication-service-name is the value of the Name property of the CIM_IndicationService instance responsible for delivering the indication. cim-service-start-id is an identifier that uniquely identifies the CIM service start, for example via a timestamp of the start time, or via a counter that increases for each start or restart. listener-destination-creation-time is a timestamp of the creation time of the CIM_ListenerDestination instance representing the listener destination.
	 * Since this format is only a recommendation, CIM clients shall treat the value as an opaque identifier for the sequence context and shall not rely on this format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Context</em>' attribute.
	 * @see #setSequenceContext(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Indication_SequenceContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Indication.SequenceNumber\"]'"
	 * @generated
	 */
	String getSequenceContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Indication#getSequenceContext <em>Sequence Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Context</em>' attribute.
	 * @see #getSequenceContext()
	 * @generated
	 */
	void setSequenceContext(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number portion of a sequence identifier for the indication. The sequence context portion of the sequence identifier is provided by the SequenceContext property. The combination of both property values represents the sequence identifier for the indication.
	 * The sequence identifier for the indication enables a CIM listener to identify duplicate indications when the CIM service attempts the delivery retry of indications, to reorder indications that arrive out-of-order, and to detect lost indications.
	 * If a CIM service does not support sequence identifiers for indications, this property shall be NULL.
	 * If a CIM service supports sequence identifiers for indications, this property shall be maintained by the CIM service for each registered listener destination, and its value shall uniquely identify the indication within the sequence context provided by SequenceContext. It shall start at 0 whenever the sequence context string changes. Otherwise, it shall be increased by 1 for every new indication to that listener destination, and it shall wrap to 0 when the value range is exceeded.
	 * When retrying the delivery of an indication, this property shall have the same value as in the original delivery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Indication_SequenceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint64' ModelCorrespondence='[\"CIM_Indication.SequenceContext\"]'"
	 * @generated
	 */
	Long getSequenceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Indication#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(Long value);

} // CIM_Indication
