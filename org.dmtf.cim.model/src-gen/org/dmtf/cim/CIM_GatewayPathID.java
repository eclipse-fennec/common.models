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
 * A representation of the model object '<em><b>CIM Gateway Path ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * GatewayPathID extends StorageHardwareID to name a path segment defined by the end identities, HardwareID and GatewayID. The purpose is to describe Identity to allow access control to be applied to a particular path segment. Think of the element identified by GatewayPathID as a Gateway between a non-trusted world and a trusted world.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_GatewayPathID#getGatewayID <em>Gateway ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GatewayPathID#getGatewayIDType <em>Gateway ID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GatewayPathID#getOtherGatewayIDType <em>Other Gateway ID Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_GatewayPathID()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::User::StorageHardwareID' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_GatewayPathID extends CIM_StorageHardwareID {
	/**
	 * Returns the value of the '<em><b>Gateway ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ID representing the Gateway for a path segment from the element identified in the HardwareID property to the Gateway.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gateway ID</em>' attribute.
	 * @see #setGatewayID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_GatewayPathID_GatewayID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_GatewayPathID.GatewayIDType\",\"CIM_GatewayPathID.OtherGatewayIDType\"]'"
	 * @generated
	 */
	String getGatewayID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GatewayPathID#getGatewayID <em>Gateway ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway ID</em>' attribute.
	 * @see #getGatewayID()
	 * @generated
	 */
	void setGatewayID(String value);

	/**
	 * Returns the value of the '<em><b>Gateway ID Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the ID property. iSCSI GatewayIDs may use one of three iSCSI formats - iqn, eui, or naa. This three letter format is the name prefix; so a single iSCSI type is provided here, the prefix can be used to further refine the format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gateway ID Type</em>' attribute.
	 * @see #setGatewayIDType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_GatewayPathID_GatewayIDType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"PortWWN\",\"NodeWWN\",\"Hostname\",\"iSCSI Name\"]' ModelCorrespondence='[\"CIM_GatewayPathID.GatewayID\"]'"
	 * @generated
	 */
	Integer getGatewayIDType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GatewayPathID#getGatewayIDType <em>Gateway ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway ID Type</em>' attribute.
	 * @see #getGatewayIDType()
	 * @generated
	 */
	void setGatewayIDType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Gateway ID Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gateway ID type when Gateway IDType is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Gateway ID Type</em>' attribute.
	 * @see #setOtherGatewayIDType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_GatewayPathID_OtherGatewayIDType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_GatewayPathID.GatewayID\"]'"
	 * @generated
	 */
	String getOtherGatewayIDType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GatewayPathID#getOtherGatewayIDType <em>Other Gateway ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Gateway ID Type</em>' attribute.
	 * @see #getOtherGatewayIDType()
	 * @generated
	 */
	void setOtherGatewayIDType(String value);

} // CIM_GatewayPathID
