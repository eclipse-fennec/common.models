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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Provenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mapping Provenance</b>
 *   : Describes requirements, incompatibilities and gaps that are identified between a target and source in a mapping item.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getConfidenceScore <em>Confidence Score</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getMappingDescription <em>Mapping Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getMatchingRationale <em>Matching Rationale</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getMethod <em>Method</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MappingProvenance#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance()
 * @model extendedMetaData="name='oscal-mapping-common-mapping-provenance-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MappingProvenance extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidence Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence Score</em>' containment reference.
	 * @see #setConfidenceScore(ConfidenceScore)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_ConfidenceScore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidence-score' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidenceScore getConfidenceScore();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getConfidenceScore <em>Confidence Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence Score</em>' containment reference.
	 * @see #getConfidenceScore()
	 * @generated
	 */
	void setConfidenceScore(ConfidenceScore value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Coverage)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Coverage value);

	/**
	 * Returns the value of the '<em><b>Mapping Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mapping Description</b>
	 *   : Description of the context and intended use of the mapping set.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping Description</em>' attribute.
	 * @see #setMappingDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_MappingDescription()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='mapping-description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMappingDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getMappingDescription <em>Mapping Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Description</em>' attribute.
	 * @see #getMappingDescription()
	 * @generated
	 */
	void setMappingDescription(String value);

	/**
	 * Returns the value of the '<em><b>Responsible Party</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ResponsibleParty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Party</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_ResponsibleParty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible-party' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='responsible-parties'"
	 * @generated
	 */
	EList<ResponsibleParty> getResponsibleParty();

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Matching Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Matching</b>
	 *   : The method used for relating controls within the mapping. The supported methods are aligned with the NIST Interagency Report (IR) 8477, Section 4.3 Set Theory Relationship Mapping.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Matching Rationale</em>' attribute.
	 * @see #setMatchingRationale(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_MatchingRationale()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='matching-rationale'"
	 * @generated
	 */
	String getMatchingRationale();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getMatchingRationale <em>Matching Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Rationale</em>' attribute.
	 * @see #getMatchingRationale()
	 * @generated
	 */
	void setMatchingRationale(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Method</b>
	 *   : The method used to complete the overall mapping.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_Method()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Status</b>
	 *   : The current status of this mapping document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMappingProvenance_Status()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // MappingProvenance
