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
 * A representation of the model object '<em><b>Threat Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Threat ID</b>
 *   : A pointer, by ID, to an externally-defined threat.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ThreatId#getValue <em>Value</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ThreatId#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ThreatId#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getThreatId()
 * @model extendedMetaData="name='oscal-assessment-common-threat-id-FIELD' kind='simple'"
 * @generated
 */
@ProviderType
public interface ThreatId extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getThreatId_Value()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIDatatype"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ThreatId#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Threat Information Resource Reference</b>
	 *   : An optional location for the threat data, from which this ID originates.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getThreatId_Href()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIReferenceDatatype"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ThreatId#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Threat Type Identification System</b>
	 *   : Specifies the source of the threat information.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getThreatId_System()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='system'"
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ThreatId#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

} // ThreatId
