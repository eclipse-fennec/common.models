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
 * A representation of the model object '<em><b>CIM SCSI Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SCSIProtocolEndpoint represents the protocol (command) aspects of a logical SCSI port, independent of the connection/transport. SCSIProtocolEndpoint is either directly or indirectly associated to one or more instances of LogicalPort (via DeviceSAPImplementation) depending on the underlying transport. Indirect associations aggregate one or more LogicalPorts using intermediate ProtocolEndpoints (iSCSI, etc). SCSIProtocolEndpoint is also associated to a SCSIProtocolController, representing the SCSI device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SCSIProtocolEndpoint#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIProtocolEndpoint#getRole <em>Role</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIProtocolEndpoint#getTargetRelativePortNumber <em>Target Relative Port Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIProtocolEndpoint#getOtherConnectionType <em>Other Connection Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSIProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.Name='string' override.Name.Description='The SCSI identifier for the target or initiator device, in the format appropriate for the ConnectionType. If a ConnectionType specific subclass is defined, the subclass may override Name to define the format. For other ConnectionTypes, the format (and content) should match that of PermamnentAddress of the corresponding LogicalPort.' override.Name.MaxLen='256' override.Name.MappingStrings='[\"SPC.INCITS-T10 |Protocol Specific Parameters | Name\"]' override.Name.ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.ConnectionType\",\"CIM_SCSIProtocolEndpoint.OtherConnectionType\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SCSIProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The supported connection type for this endpoint. The connection type may be needed before the port(s) are associated and also is used in some SCSI commands.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see #setConnectionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIProtocolEndpoint_ConnectionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Other\",\"Fibre Channel\",\"Parallel SCSI\",\"SSA\",\"IEEE 1394\",\"RDMA\",\"iSCSI\",\"SAS\",\"ADT\"]' MappingStrings='[\"SPC.INCITS-T10 | Protocol Identifier | Values\"]' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.Name\",\"CIM_SCSIProtocolEndpoint.OtherConnectionType\"]'"
	 * @generated
	 */
	Integer getConnectionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIProtocolEndpoint#getConnectionType <em>Connection Type</em>}' attribute.
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
	 * For iSCSI, each SCSIProtocolEndpoint MUST act as either a target or an initiator endpoint. Other transports allow a SCSI PE to act as both an initiator and target endpoint. This property indicates which role this ProtocolEndpoint implements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIProtocolEndpoint_Role()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Initiator\",\"Target\",\"Both Initiator and Target\"]'"
	 * @generated
	 */
	Integer getRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIProtocolEndpoint#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Relative Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For ports on a target device, the port number, relative to the storage system. 0 is reserved by T10, 1 is port A, 2 is port B, etc. These numbers are used in SCSI commands that operate on target port groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Relative Port Number</em>' attribute.
	 * @see #setTargetRelativePortNumber(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIProtocolEndpoint_TargetRelativePortNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='1' MappingStrings='[\"SPC.INCITS-T10 | RelativeTargetPort | IdentifierFormat\"]'"
	 * @generated
	 */
	Long getTargetRelativePortNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIProtocolEndpoint#getTargetRelativePortNumber <em>Target Relative Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Relative Port Number</em>' attribute.
	 * @see #getTargetRelativePortNumber()
	 * @generated
	 */
	void setTargetRelativePortNumber(Long value);

	/**
	 * Returns the value of the '<em><b>Other Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection type, if ConnectionType is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Connection Type</em>' attribute.
	 * @see #setOtherConnectionType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIProtocolEndpoint_OtherConnectionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.Name\",\"CIM_SCSIProtocolEndpoint.ConnectionType\"]'"
	 * @generated
	 */
	String getOtherConnectionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIProtocolEndpoint#getOtherConnectionType <em>Other Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Connection Type</em>' attribute.
	 * @see #getOtherConnectionType()
	 * @generated
	 */
	void setOtherConnectionType(String value);

} // CIM_SCSIProtocolEndpoint
