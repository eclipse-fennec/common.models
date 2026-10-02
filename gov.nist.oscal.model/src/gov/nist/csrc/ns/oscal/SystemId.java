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
 * A representation of the model object '<em><b>System Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Identification</b>
 *   : A human-oriented, globally unique identifier with cross-instance scope that can be used to reference this system identification property elsewhere in this or other OSCAL instances. When referencing an externally defined system identification, the system identification must be used in the context of the external / imported OSCAL instance (e.g., uri-reference). This string should be assigned per-subject, which means it should be consistently used to identify the same system across revisions of the document.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemId#getValue <em>Value</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemId#getIdentifierType <em>Identifier Type</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemId()
 * @model extendedMetaData="name='oscal-implementation-common-system-id-FIELD' kind='simple'"
 * @generated
 */
@ProviderType
public interface SystemId extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemId_Value()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="name=':0' kind='simple'"
	 *        annotation="http://eclipse.org/fennec/codec key='id'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemId#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Identification System Type</b>
	 *   : Identifies the identification system from which the provided identifier was assigned. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier Type</em>' attribute.
	 * @see #setIdentifierType(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemId_IdentifierType()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIDatatype"
	 *        extendedMetaData="kind='attribute' name='identifier-type'"
	 * @generated
	 */
	String getIdentifierType();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemId#getIdentifierType <em>Identifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Type</em>' attribute.
	 * @see #getIdentifierType()
	 * @generated
	 */
	void setIdentifierType(String value);

} // SystemId
