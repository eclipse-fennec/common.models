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
 * A representation of the model object '<em><b>CIM iSCSI Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an iSCSI-specific SCSIProtocolEndpoint. ConnectionType MUST be 'iSCSI'. 
 * An iSCSIProtocolEndpoint represents an iSCSI port, which is the usage of a subset of network portals (TCP+IP ProtocolEndpoints) in a Portal Group by an iSCSI node. The BindsTo associations from iSCSIProtocolEndpoint to TCPProtocolEndpoints makes this relationship explicit. 
 * For an iSCSI target, the Identifier property (the Target Portal Group Tag) makes the relationship unique. 
 * For an iSCSI initiator, the session identifier makes the initiator port unique within the node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIProtocolEndpoint#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.37.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.Name='string' override.Name.Description='The format of Name is based on the ConnectionType property. For iSCSI, the Name property of an SCSIProtocolEndpoint MUST contain the iSCSI port name as described in the iSCSI RFC (currently http://www.ietf.org/rfc/rfc3720.xt) - &lt; iSCSI node name&gt; + ,\',i,\' + ISID for initiators, &lt; iSCSI node name&gt; + \',t,\' + TPGT for targets, where &lt;iSCSI node name&gt; can be any of the standard iSCSI name namespaces (eg. iqn, eui); and includes the namespace prefix. The target portal group tag must conform to the regular expression \"^[0-9A-F]{16}$\".' override.Name.MaxLen='256' override.Name.ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.ConnectionType\",\"CIM_SCSIProtocolEndpoint.OtherConnectionType\"]' override.Role='uint16' override.Role.Description='For iSCSI, each SCSIProtocolEndpoint MUST act as either a target or an initiator endpoint.' override.Role.ValueMap='[\"2\",\"3\"]' override.Role.Values='[\"Initiator\",\"Target\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSIProtocolEndpoint extends CIM_SCSIProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an Initiator PE, Identifier MUST contain the ISID, if this is a Target PE, Identifier MUST contain the Target Portal Group Tag (TGPT). Each iSCSIProtocolEndpoint associated to a common SCSIProtocolController (iSCSI node) MUST have a unique Identifier. This field is formatted as 12 hexadecimal digits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIProtocolEndpoint_Identifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' MaxLen='13'"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIProtocolEndpoint#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

} // CIM_iSCSIProtocolEndpoint
