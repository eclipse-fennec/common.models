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
 * A representation of the model object '<em><b>Security Impact Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Security Impact Level</b>
 *   : The overall level of expected impact resulting from unauthorized disclosure, modification, or loss of access to information.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveConfidentiality <em>Security Objective Confidentiality</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveIntegrity <em>Security Objective Integrity</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveAvailability <em>Security Objective Availability</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSecurityImpactLevel()
 * @model extendedMetaData="name='oscal-ssp-security-impact-level-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SecurityImpactLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Objective Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Objective Confidentiality</em>' attribute.
	 * @see #setSecurityObjectiveConfidentiality(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSecurityImpactLevel_SecurityObjectiveConfidentiality()
	 * @model dataType="gov.nist.csrc.ns.oscal.SecurityObjectiveConfidentialityType" required="true"
	 *        extendedMetaData="kind='element' name='security-objective-confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityObjectiveConfidentiality();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveConfidentiality <em>Security Objective Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Objective Confidentiality</em>' attribute.
	 * @see #getSecurityObjectiveConfidentiality()
	 * @generated
	 */
	void setSecurityObjectiveConfidentiality(String value);

	/**
	 * Returns the value of the '<em><b>Security Objective Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Objective Integrity</em>' attribute.
	 * @see #setSecurityObjectiveIntegrity(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSecurityImpactLevel_SecurityObjectiveIntegrity()
	 * @model dataType="gov.nist.csrc.ns.oscal.SecurityObjectiveIntegrityType" required="true"
	 *        extendedMetaData="kind='element' name='security-objective-integrity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityObjectiveIntegrity();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveIntegrity <em>Security Objective Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Objective Integrity</em>' attribute.
	 * @see #getSecurityObjectiveIntegrity()
	 * @generated
	 */
	void setSecurityObjectiveIntegrity(String value);

	/**
	 * Returns the value of the '<em><b>Security Objective Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Objective Availability</em>' attribute.
	 * @see #setSecurityObjectiveAvailability(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSecurityImpactLevel_SecurityObjectiveAvailability()
	 * @model dataType="gov.nist.csrc.ns.oscal.SecurityObjectiveAvailabilityType" required="true"
	 *        extendedMetaData="kind='element' name='security-objective-availability' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityObjectiveAvailability();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveAvailability <em>Security Objective Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Objective Availability</em>' attribute.
	 * @see #getSecurityObjectiveAvailability()
	 * @generated
	 */
	void setSecurityObjectiveAvailability(String value);

} // SecurityImpactLevel
