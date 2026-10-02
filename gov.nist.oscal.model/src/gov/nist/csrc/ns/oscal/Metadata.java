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
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Document Metadata</b>
 *   : Provides information about the containing document, and defines concepts that are shared across the document.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getPublished <em>Published</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getVersion <em>Version</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getParty <em>Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getAction <em>Action</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Metadata#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata()
 * @model extendedMetaData="name='oscal-metadata-metadata-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Metadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Document Title</b>
	 *   : A name given to the document, which may be used by a tool for display and navigation.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(MarkupLineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupLineDatatype getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Metadata#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLineDatatype value);

	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Published()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalMetadataPublishedFIELD"
	 *        extendedMetaData="kind='element' name='published' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPublished();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Metadata#getPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #getPublished()
	 * @generated
	 */
	void setPublished(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_LastModified()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalMetadataLastModifiedFIELD" required="true"
	 *        extendedMetaData="kind='element' name='last-modified' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastModified();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Metadata#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Version()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalMetadataVersionFIELD" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Metadata#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscal Version</em>' attribute.
	 * @see #setOscalVersion(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_OscalVersion()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalMetadataOscalVersionFIELD" required="true"
	 *        extendedMetaData="kind='element' name='oscal-version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOscalVersion();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Metadata#getOscalVersion <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscal Version</em>' attribute.
	 * @see #getOscalVersion()
	 * @generated
	 */
	void setOscalVersion(String value);

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">revisions</b>
	 *   : A group of 'revision' elements
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revisions</em>' containment reference.
	 * @see #setRevisions(Revisions)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Revisions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revisions' namespace='##targetNamespace'"
	 * @generated
	 */
	Revisions getRevisions();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Metadata#getRevisions <em>Revisions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revisions</em>' containment reference.
	 * @see #getRevisions()
	 * @generated
	 */
	void setRevisions(Revisions value);

	/**
	 * Returns the value of the '<em><b>Document Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.DocumentId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Id</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_DocumentId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='document-id' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='document-ids'"
	 * @generated
	 */
	EList<DocumentId> getDocumentId();

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='roles'"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='locations'"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Party}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Party()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='party' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='parties'"
	 * @generated
	 */
	EList<Party> getParty();

	/**
	 * Returns the value of the '<em><b>Responsible Party</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ResponsibleParty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Party</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_ResponsibleParty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible-party' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='responsible-parties'"
	 * @generated
	 */
	EList<ResponsibleParty> getResponsibleParty();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='actions'"
	 * @generated
	 */
	EList<Action> getAction();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMetadata_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Metadata#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

} // Metadata
