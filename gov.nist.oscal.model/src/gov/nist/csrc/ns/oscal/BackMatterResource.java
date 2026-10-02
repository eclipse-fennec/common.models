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
 * A representation of the model object '<em><b>Back Matter Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Resource</b>
 *   : A resource associated with content in the containing document instance. A resource may be directly included in the document using base64 encoding or may point to one or more equivalent internet resources.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.BackMatterResource#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.BackMatterResource#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.BackMatterResource#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.BackMatterResource#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.BackMatterResource#getCitation <em>Citation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.BackMatterResource#getRlink <em>Rlink</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.BackMatterResource#getBase64 <em>Base64</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.BackMatterResource#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.BackMatterResource#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource()
 * @model extendedMetaData="name='resource_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BackMatterResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Resource Title</b>
	 *   : An optional name given to the resource, which may be used by a tool for display and navigation.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(MarkupLineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupLineDatatype getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getTitle <em>Title</em>}' containment reference.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Resource Description</b>
	 *   : An optional short summary of the resource used to indicate the purpose of the resource.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getDescription <em>Description</em>}' containment reference.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource_Prop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='props'"
	 * @generated
	 */
	EList<Property> getProp();

	/**
	 * Returns the value of the '<em><b>Document Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.DocumentId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Id</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource_DocumentId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='document-id' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='document-ids'"
	 * @generated
	 */
	EList<DocumentId> getDocumentId();

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(Citation)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource_Citation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citation' namespace='##targetNamespace'"
	 * @generated
	 */
	Citation getCitation();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(Citation value);

	/**
	 * Returns the value of the '<em><b>Rlink</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Rlink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rlink</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource_Rlink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rlink' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='rlinks'"
	 * @generated
	 */
	EList<Rlink> getRlink();

	/**
	 * Returns the value of the '<em><b>Base64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64</em>' containment reference.
	 * @see #setBase64(Base64)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource_Base64()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='base64' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64 getBase64();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getBase64 <em>Base64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64</em>' containment reference.
	 * @see #getBase64()
	 * @generated
	 */
	void setBase64(Base64 value);

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getRemarks <em>Remarks</em>}' containment reference.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Resource Universally Unique Identifier</b>
	 *   : A unique identifier for a resource.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBackMatterResource_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // BackMatterResource
