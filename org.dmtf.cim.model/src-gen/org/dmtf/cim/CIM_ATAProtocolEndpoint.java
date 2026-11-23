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
 * A representation of the model object '<em><b>CIM ATA Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ATAProtocolEndpoint represents the protocol (command) aspects of a logical ATA port, independent of the connection/transport. ATAProtocolEndpoint is either directly or indirectly associated to one or more instances of LogicalPort depending on the underlying transport.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ATAProtocolEndpoint#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ATAProtocolEndpoint#getRole <em>Role</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ATAProtocolEndpoint#getOtherConnectionType <em>Other Connection Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ATAProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.Name='string' override.Name.Key='true' override.Name.Description='The ATA identifier for the target or initiator device, in the format appropriate for the ConnectionType. If a ConnectionType specific subclass is defined, the subclass may override Name to define the format. For other ConnectionTypes, the format (and content) should match that of PermanentAddress of the corresponding port if the port is is subclassed from NetworkPort.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ATAProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The supported connection type for this endpoint. The connection type may be needed before the port(s) are associated and also is used in some ATA commands.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see #setConnectionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ATAProtocolEndpoint_ConnectionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"ATA\",\"SATA\"]'"
	 * @generated
	 */
	Integer getConnectionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ATAProtocolEndpoint#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(Integer value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates which role this ProtocolEndpoint implements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ATAProtocolEndpoint_Role()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Initiator\",\"Target\",\"Both Initiator and Target\"]'"
	 * @generated
	 */
	Integer getRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ATAProtocolEndpoint#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection type, if ConnectionType is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Connection Type</em>' attribute.
	 * @see #setOtherConnectionType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ATAProtocolEndpoint_OtherConnectionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherConnectionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ATAProtocolEndpoint#getOtherConnectionType <em>Other Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Connection Type</em>' attribute.
	 * @see #getOtherConnectionType()
	 * @generated
	 */
	void setOtherConnectionType(String value);

} // CIM_ATAProtocolEndpoint
