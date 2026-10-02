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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>At Frequency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                    
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Frequency Condition</b>
 *   : The task is intended to occur at the specified frequency.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.AtFrequency#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AtFrequency#getPeriod <em>Period</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AtFrequency#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAtFrequency()
 * @model extendedMetaData="name='at-frequency_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AtFrequency extends EObject {
	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                          
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAtFrequency_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AtFrequency#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                       
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Period</b>
	 *   : The task must occur after the specified period has elapsed.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(BigInteger)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAtFrequency_Period()
	 * @model dataType="gov.nist.csrc.ns.oscal.PositiveIntegerDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='period'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AtFrequency#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                       
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Time Unit</b>
	 *   : The unit of time for the period.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAtFrequency_Unit()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='unit'"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AtFrequency#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // AtFrequency
