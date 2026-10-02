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
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Mapping</b>
 *   : A mapping between two target resources.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getSourceResource <em>Source Resource</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getTargetResource <em>Target Resource</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getMap <em>Map</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getMappingDescription <em>Mapping Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getSourceGapSummary <em>Source Gap Summary</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getTargetGapSummary <em>Target Gap Summary</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getConfidenceScore <em>Confidence Score</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getMatchingRationale <em>Matching Rationale</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getMethod <em>Method</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getStatus <em>Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Mapping#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping()
 * @model extendedMetaData="name='oscal-mapping-common-mapping-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Resource</em>' containment reference.
	 * @see #setSourceResource(MappingResourceReference)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_SourceResource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source-resource' namespace='##targetNamespace'"
	 * @generated
	 */
	MappingResourceReference getSourceResource();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getSourceResource <em>Source Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Resource</em>' containment reference.
	 * @see #getSourceResource()
	 * @generated
	 */
	void setSourceResource(MappingResourceReference value);

	/**
	 * Returns the value of the '<em><b>Target Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Resource</em>' containment reference.
	 * @see #setTargetResource(MappingResourceReference)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_TargetResource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target-resource' namespace='##targetNamespace'"
	 * @generated
	 */
	MappingResourceReference getTargetResource();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getTargetResource <em>Target Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Resource</em>' containment reference.
	 * @see #getTargetResource()
	 * @generated
	 */
	void setTargetResource(MappingResourceReference value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MapEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_Map()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='maps'"
	 * @generated
	 */
	EList<MapEntry> getMap();

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference.
	 * @see #setRemarks(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Mapping Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mapping Description</b>
	 *   : Description of the context and intended use of the mapping set.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping Description</em>' containment reference.
	 * @see #setMappingDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_MappingDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapping-description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getMappingDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getMappingDescription <em>Mapping Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Description</em>' containment reference.
	 * @see #getMappingDescription()
	 * @generated
	 */
	void setMappingDescription(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Source Gap Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Gap Summary</em>' containment reference.
	 * @see #setSourceGapSummary(GapSummary)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_SourceGapSummary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source-gap-summary' namespace='##targetNamespace'"
	 * @generated
	 */
	GapSummary getSourceGapSummary();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getSourceGapSummary <em>Source Gap Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Gap Summary</em>' containment reference.
	 * @see #getSourceGapSummary()
	 * @generated
	 */
	void setSourceGapSummary(GapSummary value);

	/**
	 * Returns the value of the '<em><b>Target Gap Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Gap Summary</em>' containment reference.
	 * @see #setTargetGapSummary(GapSummary)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_TargetGapSummary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target-gap-summary' namespace='##targetNamespace'"
	 * @generated
	 */
	GapSummary getTargetGapSummary();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getTargetGapSummary <em>Target Gap Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Gap Summary</em>' containment reference.
	 * @see #getTargetGapSummary()
	 * @generated
	 */
	void setTargetGapSummary(GapSummary value);

	/**
	 * Returns the value of the '<em><b>Confidence Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence Score</em>' containment reference.
	 * @see #setConfidenceScore(ConfidenceScore)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_ConfidenceScore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidence-score' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidenceScore getConfidenceScore();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getConfidenceScore <em>Confidence Score</em>}' containment reference.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Coverage value);

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_MatchingRationale()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="kind='attribute' name='matching-rationale'"
	 * @generated
	 */
	String getMatchingRationale();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getMatchingRationale <em>Matching Rationale</em>}' attribute.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_Method()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getMethod <em>Method</em>}' attribute.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_Status()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mapping Universally Unique Identifier</b>
	 *   : A  machine-oriented, globally unique identifier with  cross-instance scope that can be used to reference this mapping definition elsewhere in this or other OSCAL instances. The locally defined UUID of the  mapping can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned  per-subject, which means it should be consistently used to identify the same mapping across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapping_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Mapping#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Mapping
