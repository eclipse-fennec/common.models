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
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                 
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Revision History Entry</b>
 *   : An entry in a sequential list of revisions to the containing document, expected to be in reverse chronological order (i.e. latest first).
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Revision#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Revision#getPublished <em>Published</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Revision#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Revision#getVersion <em>Version</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Revision#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Revision#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Revision#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Revision#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRevision()
 * @model extendedMetaData="name='revision_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Revision extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                          
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Document Title</b>
	 *   : A name given to the document revision, which may be used by a tool for display and navigation.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(MarkupLineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRevision_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupLineDatatype getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Revision#getTitle <em>Title</em>}' containment reference.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRevision_Published()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalMetadataPublishedFIELD"
	 *        extendedMetaData="kind='element' name='published' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPublished();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Revision#getPublished <em>Published</em>}' attribute.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRevision_LastModified()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalMetadataLastModifiedFIELD"
	 *        extendedMetaData="kind='element' name='last-modified' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastModified();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Revision#getLastModified <em>Last Modified</em>}' attribute.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRevision_Version()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalMetadataVersionFIELD" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Revision#getVersion <em>Version</em>}' attribute.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRevision_OscalVersion()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalMetadataOscalVersionFIELD"
	 *        extendedMetaData="kind='element' name='oscal-version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOscalVersion();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Revision#getOscalVersion <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscal Version</em>' attribute.
	 * @see #getOscalVersion()
	 * @generated
	 */
	void setOscalVersion(String value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRevision_Prop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getProp();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRevision_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRevision_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Revision#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

} // Revision
