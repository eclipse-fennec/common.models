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
 * A representation of the model object '<em><b>Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Information Type</b>
 *   : Contains details about one information type that is stored, processed, or transmitted by the system, such as privacy information, and those defined in NIST SP 800-60.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.InformationType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InformationType#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InformationType#getCategorization <em>Categorization</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InformationType#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InformationType#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InformationType#getConfidentialityImpact <em>Confidentiality Impact</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InformationType#getIntegrityImpact <em>Integrity Impact</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InformationType#getAvailabilityImpact <em>Availability Impact</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InformationType#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType()
 * @model extendedMetaData="name='information-type_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InformationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">title field</b>
	 *   : A human readable name for the information type. This title should be meaningful within the context of the system.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType_Title()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupLineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.InformationType#getTitle <em>Title</em>}' attribute.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Information Type Description</b>
	 *   : A summary of how this information type is used within the system.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.InformationType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Categorization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Categorization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorization</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType_Categorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='categorization' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='categorizations'"
	 * @generated
	 */
	EList<Categorization> getCategorization();

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Confidentiality Impact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality Impact</em>' containment reference.
	 * @see #setConfidentialityImpact(Impact)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType_ConfidentialityImpact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality-impact' namespace='##targetNamespace'"
	 * @generated
	 */
	Impact getConfidentialityImpact();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.InformationType#getConfidentialityImpact <em>Confidentiality Impact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality Impact</em>' containment reference.
	 * @see #getConfidentialityImpact()
	 * @generated
	 */
	void setConfidentialityImpact(Impact value);

	/**
	 * Returns the value of the '<em><b>Integrity Impact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity Impact</em>' containment reference.
	 * @see #setIntegrityImpact(Impact)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType_IntegrityImpact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='integrity-impact' namespace='##targetNamespace'"
	 * @generated
	 */
	Impact getIntegrityImpact();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.InformationType#getIntegrityImpact <em>Integrity Impact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity Impact</em>' containment reference.
	 * @see #getIntegrityImpact()
	 * @generated
	 */
	void setIntegrityImpact(Impact value);

	/**
	 * Returns the value of the '<em><b>Availability Impact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Impact</em>' containment reference.
	 * @see #setAvailabilityImpact(Impact)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType_AvailabilityImpact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availability-impact' namespace='##targetNamespace'"
	 * @generated
	 */
	Impact getAvailabilityImpact();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.InformationType#getAvailabilityImpact <em>Availability Impact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Impact</em>' containment reference.
	 * @see #getAvailabilityImpact()
	 * @generated
	 */
	void setAvailabilityImpact(Impact value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Information Type Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this information type elsewhere in this or other OSCAL instances. The locally defined UUID of the information type can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInformationType_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.InformationType#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // InformationType
