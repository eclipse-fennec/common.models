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
 * A representation of the model object '<em><b>CIM Binds To LAN Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association makes explicit the dependency of a SAP or ProtocolEndpoint on an underlying LANEndpoint, on the same system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BindsToLANEndpoint#getFrameType <em>Frame Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BindsToLANEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.Antecedent='CIM_LANEndpoint REF' override.Antecedent.Description='The underlying LANEndpoint, which is depended upon.' override.Dependent='CIM_ServiceAccessPoint REF' override.Dependent.Description='The AccessPoint or ProtocolEndpoint dependent on the LANEndpoint.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_BindsToLANEndpoint extends CIM_BindsTo {
	/**
	 * Returns the value of the '<em><b>Frame Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This describes the framing method for the upper layer SAP or Endpoint that is bound to the LANEndpoint. Note: "Raw802.3" is only known to be used with the IPX protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame Type</em>' attribute.
	 * @see #setFrameType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BindsToLANEndpoint_FrameType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Ethernet\",\"802.2\",\"SNAP\",\"Raw802.3\"]'"
	 * @generated
	 */
	Integer getFrameType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BindsToLANEndpoint#getFrameType <em>Frame Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Type</em>' attribute.
	 * @see #getFrameType()
	 * @generated
	 */
	void setFrameType(Integer value);

} // CIM_BindsToLANEndpoint
