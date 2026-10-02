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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Within Date Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                    
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">On Date Range Condition</b>
 *   : The task is intended to occur within the specified date range.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.WithinDateRange#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.WithinDateRange#getEnd <em>End</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.WithinDateRange#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getWithinDateRange()
 * @model extendedMetaData="name='within-date-range_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WithinDateRange extends EObject {
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getWithinDateRange_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.WithinDateRange#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                       
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">End Date Condition</b>
	 *   : The task must occur on or before the specified date.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getWithinDateRange_End()
	 * @model dataType="gov.nist.csrc.ns.oscal.DateTimeWithTimezoneDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='end'"
	 * @generated
	 */
	XMLGregorianCalendar getEnd();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.WithinDateRange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                       
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Start Date Condition</b>
	 *   : The task must occur on or after the specified date.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getWithinDateRange_Start()
	 * @model dataType="gov.nist.csrc.ns.oscal.DateTimeWithTimezoneDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='start'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.WithinDateRange#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(XMLGregorianCalendar value);

} // WithinDateRange
