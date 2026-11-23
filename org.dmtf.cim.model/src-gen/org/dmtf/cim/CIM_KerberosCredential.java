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
 * A representation of the model object '<em><b>CIM Kerberos Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CIM_KerberosCredential represents a credential issued by a particular Kerberos Key Distribution Center (KDC) to establish an identity, as the result of a successful authentication process. There are two types of tickets that a KDC may issue - a TicketGranting ticket, which is used to protect and authenticate communications between an entity and the KDC, and a Session ticket, which the KDC issues to two entities to allow them to communicate with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_KerberosCredential#getAccessesService <em>Accesses Service</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_KerberosCredential#getRemoteID <em>Remote ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_KerberosCredential#getTicketType <em>Ticket Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_KerberosCredential()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::User::Kerberos' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the organizational entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_KerberosCredential extends CIM_Credential {
	/**
	 * Returns the value of the '<em><b>Accesses Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the service for which this ticket is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accesses Service</em>' attribute.
	 * @see #setAccessesService(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_KerberosCredential_AccessesService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getAccessesService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_KerberosCredential#getAccessesService <em>Accesses Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accesses Service</em>' attribute.
	 * @see #getAccessesService()
	 * @generated
	 */
	void setAccessesService(String value);

	/**
	 * Returns the value of the '<em><b>Remote ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RemoteID is the name by which the user is known at the KDC security service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote ID</em>' attribute.
	 * @see #setRemoteID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_KerberosCredential_RemoteID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getRemoteID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_KerberosCredential#getRemoteID <em>Remote ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote ID</em>' attribute.
	 * @see #getRemoteID()
	 * @generated
	 */
	void setRemoteID(String value);

	/**
	 * Returns the value of the '<em><b>Ticket Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Type of CIM_KerberosCredential is used to indicate whether the ticket in question was issued by the Kerberos Key Distribution Center (KDC) to support ongoing communication between the Users Access and the KDC ("TicketGranting"), or was issued by the KDC to support ongoing communication between two Users Access entities ("Session").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ticket Type</em>' attribute.
	 * @see #setTicketType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_KerberosCredential_TicketType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\"]' Values='[\"Session\",\"TicketGranting\"]'"
	 * @generated
	 */
	Integer getTicketType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_KerberosCredential#getTicketType <em>Ticket Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket Type</em>' attribute.
	 * @see #getTicketType()
	 * @generated
	 */
	void setTicketType(Integer value);

} // CIM_KerberosCredential
