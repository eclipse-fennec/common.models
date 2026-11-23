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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Kerberos Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CIM_KerberosTicket represents a credential issued by a particular Kerberos Key Distribution Center (KDC) to establish an identity, as the result of a successful authentication process. There are two types of tickets that a KDC may issue - a TicketGranting ticket, which is used to protect and authenticate communications between an entity and the KDC, and a Session ticket, which the KDC issues to two entities to allow them to communicate with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_KerberosTicket#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_KerberosTicket#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_KerberosTicket#getServiceCreationClassName <em>Service Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_KerberosTicket#getServiceName <em>Service Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_KerberosTicket()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::User::Kerberos' override.AccessesService='string' override.AccessesService.Required='true' override.AccessesService.Description='The name of the service for which this ticket is used.' override.AccessesService.MaxLen='256' override.RemoteID='string' override.RemoteID.Required='true' override.RemoteID.Description='RemoteID is the name by which the user is known at the KDC security service.' override.RemoteID.MaxLen='256' override.TicketType='uint16' override.TicketType.Description='The Type of CIM_KerberosTicket is used to indicate whether the ticket in question was issued by the Kerberos Key Distribution Center (KDC) to support ongoing communication between the Users Access and the KDC (\"TicketGranting\"), or was issued by the KDC to support ongoing communication between two Users Access entities (\"Session\").' override.TicketType.ValueMap='[\"0\",\"1\"]' override.TicketType.Values='[\"Session\",\"TicketGranting\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_KerberosTicket extends CIM_KerberosCredential {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CCN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_KerberosTicket_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_KerberosCredential.InstanceID\"]' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_KerberosTicket#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_KerberosTicket_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_KerberosCredential.InstanceID\"]' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_KerberosTicket#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Service Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Service's CCN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Creation Class Name</em>' attribute.
	 * @see #setServiceCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_KerberosTicket_ServiceCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_KerberosCredential.InstanceID\"]' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getServiceCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_KerberosTicket#getServiceCreationClassName <em>Service Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Creation Class Name</em>' attribute.
	 * @see #getServiceCreationClassName()
	 * @generated
	 */
	void setServiceCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Service's Name. The Kerberos KDC Realm of CIM_KerberosTicket is used to record the security authority, or Realm, name so that tickets issued by different Realms can be separately managed and enumerated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_KerberosTicket_ServiceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_KerberosCredential.InstanceID\"]' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_KerberosTicket#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

} // CIM_KerberosTicket
