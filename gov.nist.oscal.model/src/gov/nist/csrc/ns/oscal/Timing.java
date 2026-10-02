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
 * A representation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Event Timing</b>
 *   : The timing under which the task is intended to occur.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Timing#getOnDate <em>On Date</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Timing#getWithinDateRange <em>Within Date Range</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Timing#getAtFrequency <em>At Frequency</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getTiming()
 * @model extendedMetaData="name='timing_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Timing extends EObject {
	/**
	 * Returns the value of the '<em><b>On Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Date</em>' containment reference.
	 * @see #setOnDate(OnDate)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getTiming_OnDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='on-date' namespace='##targetNamespace'"
	 * @generated
	 */
	OnDate getOnDate();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Timing#getOnDate <em>On Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Date</em>' containment reference.
	 * @see #getOnDate()
	 * @generated
	 */
	void setOnDate(OnDate value);

	/**
	 * Returns the value of the '<em><b>Within Date Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Within Date Range</em>' containment reference.
	 * @see #setWithinDateRange(WithinDateRange)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getTiming_WithinDateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='within-date-range' namespace='##targetNamespace'"
	 * @generated
	 */
	WithinDateRange getWithinDateRange();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Timing#getWithinDateRange <em>Within Date Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within Date Range</em>' containment reference.
	 * @see #getWithinDateRange()
	 * @generated
	 */
	void setWithinDateRange(WithinDateRange value);

	/**
	 * Returns the value of the '<em><b>At Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Frequency</em>' containment reference.
	 * @see #setAtFrequency(AtFrequency)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getTiming_AtFrequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='at-frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	AtFrequency getAtFrequency();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Timing#getAtFrequency <em>At Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Frequency</em>' containment reference.
	 * @see #getAtFrequency()
	 * @generated
	 */
	void setAtFrequency(AtFrequency value);

} // Timing
