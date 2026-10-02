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
 * A representation of the model object '<em><b>Port Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Port Range</b>
 *   : Where applicable this is the transport layer protocol port range an IPv4-based or IPv6-based service uses.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.PortRange#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PortRange#getEnd <em>End</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PortRange#getStart <em>Start</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PortRange#getTransport <em>Transport</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPortRange()
 * @model extendedMetaData="name='oscal-implementation-common-port-range-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PortRange extends EObject {
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPortRange_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PortRange#getRemarks <em>Remarks</em>}' attribute.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">End</b>
	 *   : Indicates the ending port number in a port range for a transport layer protocol
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(BigInteger)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPortRange_End()
	 * @model dataType="gov.nist.csrc.ns.oscal.NonNegativeIntegerDatatype"
	 *        extendedMetaData="kind='attribute' name='end'"
	 * @generated
	 */
	BigInteger getEnd();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PortRange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Start</b>
	 *   : Indicates the starting port number in a port range for a transport layer protocol
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(BigInteger)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPortRange_Start()
	 * @model dataType="gov.nist.csrc.ns.oscal.NonNegativeIntegerDatatype"
	 *        extendedMetaData="kind='attribute' name='start'"
	 * @generated
	 */
	BigInteger getStart();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PortRange#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Transport</b>
	 *   : Indicates the transport type.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport</em>' attribute.
	 * @see #setTransport(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPortRange_Transport()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='transport'"
	 * @generated
	 */
	String getTransport();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PortRange#getTransport <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' attribute.
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(String value);

} // PortRange
