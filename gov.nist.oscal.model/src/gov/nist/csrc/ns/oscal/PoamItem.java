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
 * A representation of the model object '<em><b>Poam Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">POA&amp;M Item</b>
 *   : Describes an individual POA&amp;M item.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getRelatedFinding <em>Related Finding</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getRelatedObservation <em>Related Observation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getAssociatedRisk <em>Associated Risk</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PoamItem#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem()
 * @model extendedMetaData="name='oscal-poam-poam-item-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PoamItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">POA&amp;M Item Title</b>
	 *   : The title or name for this POA&amp;M item .
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(MarkupLineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupLineDatatype getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PoamItem#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLineDatatype value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">POA&amp;M Item Description</b>
	 *   : A human-readable description of POA&amp;M item.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PoamItem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.PoamItemOrigin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='origins'"
	 * @generated
	 */
	EList<PoamItemOrigin> getOrigin();

	/**
	 * Returns the value of the '<em><b>Related Finding</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.RelatedFinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Finding</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_RelatedFinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related-finding' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='related-findings'"
	 * @generated
	 */
	EList<RelatedFinding> getRelatedFinding();

	/**
	 * Returns the value of the '<em><b>Related Observation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.RelatedObservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Observation</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_RelatedObservation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related-observation' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='related-observations'"
	 * @generated
	 */
	EList<RelatedObservation> getRelatedObservation();

	/**
	 * Returns the value of the '<em><b>Associated Risk</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.AssociatedRisk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Risk</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_AssociatedRisk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associated-risk' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='related-risks'"
	 * @generated
	 */
	EList<AssociatedRisk> getAssociatedRisk();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PoamItem#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">POA&amp;M Item Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with instance scope that can be used to reference this POA&amp;M item entry in this OSCAL instance. This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPoamItem_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PoamItem#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // PoamItem
