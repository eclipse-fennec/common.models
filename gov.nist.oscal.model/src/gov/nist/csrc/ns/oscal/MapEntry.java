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
 * A representation of the model object '<em><b>Map Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mapping Entry</b>
 *   : A relationship-based mapping between a source and target set consisting of members (i.e., controls, control statements) from the respective source and target.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getConfidenceScore <em>Confidence Score</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getMatchingRationale <em>Matching Rationale</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getNs <em>Ns</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MapEntry#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry()
 * @model extendedMetaData="name='oscal-mapping-common-map-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MapEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' attribute.
	 * @see #setRelationship(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Relationship()
	 * @model dataType="gov.nist.csrc.ns.oscal.RelationshipType" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRelationship();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MapEntry#getRelationship <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' attribute.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MappingItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='sources'"
	 * @generated
	 */
	EList<MappingItem> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MappingItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='targets'"
	 * @generated
	 */
	EList<MappingItem> getTarget();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.QualifierItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Qualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifier' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='qualifiers'"
	 * @generated
	 */
	EList<QualifierItem> getQualifier();

	/**
	 * Returns the value of the '<em><b>Confidence Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence Score</em>' containment reference.
	 * @see #setConfidenceScore(ConfidenceScore)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_ConfidenceScore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidence-score' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidenceScore getConfidenceScore();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MapEntry#getConfidenceScore <em>Confidence Score</em>}' containment reference.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MapEntry#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Coverage value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Link()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MapEntry#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_MatchingRationale()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="kind='attribute' name='matching-rationale'"
	 * @generated
	 */
	String getMatchingRationale();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MapEntry#getMatchingRationale <em>Matching Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Rationale</em>' attribute.
	 * @see #getMatchingRationale()
	 * @generated
	 */
	void setMatchingRationale(String value);

	/**
	 * Returns the value of the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Relationship Value Namespace</b>
	 *   : A namespace qualifying the relationship's value. This allows different organizations to associate distinct semantics for relationships with the same name.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns</em>' attribute.
	 * @see #setNs(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Ns()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIDatatype"
	 *        extendedMetaData="kind='attribute' name='ns'"
	 * @generated
	 */
	String getNs();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MapEntry#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mapping Entry Identifier</b>
	 *   : The unique identifier for the mapping entry.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMapEntry_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MapEntry#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // MapEntry
