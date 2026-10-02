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
 * A representation of the model object '<em><b>Mitigating Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mitigating Factor</b>
 *   : Describes an existing mitigating factor that may affect the overall determination of the risk, with an optional link to an implementation statement in the SSP.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getImplementationUuid <em>Implementation Uuid</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMitigatingFactor()
 * @model extendedMetaData="name='mitigating-factor_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MitigatingFactor extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mitigating Factor Description</b>
	 *   : A human-readable description of this mitigating factor.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMitigatingFactor_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMitigatingFactor_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMitigatingFactor_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SubjectReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMitigatingFactor_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='subjects'"
	 * @generated
	 */
	EList<SubjectReference> getSubject();

	/**
	 * Returns the value of the '<em><b>Implementation Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Implementation UUID</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this implementation statement elsewhere in this or other OSCAL instancess. The locally defined UUID of the implementation statement can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Uuid</em>' attribute.
	 * @see #setImplementationUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMitigatingFactor_ImplementationUuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype"
	 *        extendedMetaData="kind='attribute' name='implementation-uuid'"
	 * @generated
	 */
	String getImplementationUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getImplementationUuid <em>Implementation Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Uuid</em>' attribute.
	 * @see #getImplementationUuid()
	 * @generated
	 */
	void setImplementationUuid(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mitigating Factor Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this mitigating factor elsewhere in this or other OSCAL instances. The locally defined UUID of the mitigating factor can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMitigatingFactor_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // MitigatingFactor
