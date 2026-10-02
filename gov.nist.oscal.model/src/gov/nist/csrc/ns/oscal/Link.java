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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Link</b>
 *   : A reference to a local or remote resource, that has a specific relation to the containing object.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Link#getText <em>Text</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Link#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Link#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Link#getRel <em>Rel</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Link#getResourceFragment <em>Resource Fragment</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLink()
 * @model extendedMetaData="name='oscal-metadata-link-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Link Text</b>
	 *   : A textual label to associate with the link, which may be used for presentation in a tool.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(MarkupLineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLink_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupLineDatatype getText();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Link#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(MarkupLineDatatype value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Hypertext Reference</b>
	 *   : A resolvable URL reference to a resource.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLink_Href()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIReferenceDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Link#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Media Type</b>
	 *   : A label that indicates the nature of a resource, as a data serialization or format.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLink_MediaType()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="kind='attribute' name='media-type'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Link#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Link Relation Type</b>
	 *   : Describes the type of relationship provided by the link's hypertext reference. This can be an indicator of the link's purpose.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLink_Rel()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='rel'"
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Link#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Resource Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Resource Fragment</b>
	 *   : In case where the href points to a back-matter/resource, this value will indicate the URI fragment to append to any rlink associated with the resource. This value MUST be URI encoded.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Fragment</em>' attribute.
	 * @see #setResourceFragment(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLink_ResourceFragment()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="kind='attribute' name='resource-fragment'"
	 * @generated
	 */
	String getResourceFragment();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Link#getResourceFragment <em>Resource Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Fragment</em>' attribute.
	 * @see #getResourceFragment()
	 * @generated
	 */
	void setResourceFragment(String value);

} // Link
