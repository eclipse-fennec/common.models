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
package gov.nist.csrc.ns.oscal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Identified Risk</b>
 *   : An identified risk.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getStatus <em>Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getThreatId <em>Threat Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getCharacterization <em>Characterization</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getMitigatingFactor <em>Mitigating Factor</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getResponse <em>Response</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getRiskLog <em>Risk Log</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getRelatedObservation <em>Related Observation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Risk#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk()
 * @model extendedMetaData="name='oscal-assessment-common-risk-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Risk extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Risk Title</b>
	 *   : The title for this risk.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Title()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupLineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Risk#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Risk Description</b>
	 *   : A human-readable summary of the identified risk, to include a statement of how the risk impacts the system.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Risk#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Risk Statement</b>
	 *   : An summary of impact for how the risk affects the system.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Statement()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='statement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Risk#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Prop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='props'"
	 * @generated
	 */
	EList<Property> getProp();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Status()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalAssessmentCommonRiskStatusFIELD" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Risk#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Origin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='origins'"
	 * @generated
	 */
	EList<Origin> getOrigin();

	/**
	 * Returns the value of the '<em><b>Threat Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ThreatId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Id</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_ThreatId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='threat-id' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='threat-ids'"
	 * @generated
	 */
	EList<ThreatId> getThreatId();

	/**
	 * Returns the value of the '<em><b>Characterization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Characterization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characterization</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Characterization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characterization' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='characterizations'"
	 * @generated
	 */
	EList<Characterization> getCharacterization();

	/**
	 * Returns the value of the '<em><b>Mitigating Factor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MitigatingFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigating Factor</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_MitigatingFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mitigating-factor' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='mitigating-factors'"
	 * @generated
	 */
	EList<MitigatingFactor> getMitigatingFactor();

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Deadline()
	 * @model dataType="gov.nist.csrc.ns.oscal.DeadlineType"
	 *        extendedMetaData="kind='element' name='deadline' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDeadline();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Risk#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Response}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='remediations'"
	 * @generated
	 */
	EList<Response> getResponse();

	/**
	 * Returns the value of the '<em><b>Risk Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Log</em>' containment reference.
	 * @see #setRiskLog(RiskLog)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_RiskLog()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='risk-log' namespace='##targetNamespace'"
	 * @generated
	 */
	RiskLog getRiskLog();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Risk#getRiskLog <em>Risk Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Log</em>' containment reference.
	 * @see #getRiskLog()
	 * @generated
	 */
	void setRiskLog(RiskLog value);

	/**
	 * Returns the value of the '<em><b>Related Observation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.RelatedObservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Observation</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_RelatedObservation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related-observation' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='related-observations'"
	 * @generated
	 */
	EList<RelatedObservation> getRelatedObservation();

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Risk Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this risk elsewhere in this or other OSCAL instances. The locally defined UUID of the risk can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRisk_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Risk#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Risk
