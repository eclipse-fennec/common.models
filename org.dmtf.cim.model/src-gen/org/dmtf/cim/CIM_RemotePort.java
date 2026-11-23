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
 * A representation of the model object '<em><b>CIM Remote Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RemotePort adds port information to the access data (such as IP Address) that is specified in and inherited from RemoteServiceAccessPoint. For example, using the additional properties in this class, you could indicate that UDP Port 123 is accessed at IP Address xyz. The IP Address would be specified in the inherited AccessInfo property, while the UDP Port number would be specified in the PortInfo property of this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RemotePort#getPortInfo <em>Port Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemotePort#getPortProtocol <em>Port Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemotePort#getOtherProtocolDescription <em>Other Protocol Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RemotePort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Core::Service' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_RemotePort extends CIM_RemoteServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Port Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port information that might further specify the remote access information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Info</em>' attribute.
	 * @see #setPortInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemotePort_PortInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RemotePort.PortProtocol\"]'"
	 * @generated
	 */
	String getPortInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemotePort#getPortInfo <em>Port Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Info</em>' attribute.
	 * @see #getPortInfo()
	 * @generated
	 */
	void setPortInfo(String value);

	/**
	 * Returns the value of the '<em><b>Port Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer that describes the protocol of the port that is addressed by PortInformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Protocol</em>' attribute.
	 * @see #setPortProtocol(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemotePort_PortProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"32768..65535\"]' Values='[\"Other\",\"TCP\",\"UDP\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_RemotePort.OtherProtocolDescription\"]'"
	 * @generated
	 */
	Integer getPortProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemotePort#getPortProtocol <em>Port Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Protocol</em>' attribute.
	 * @see #getPortProtocol()
	 * @generated
	 */
	void setPortProtocol(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Protocol Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the protocol when the property PortProtocol is set to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Protocol Description</em>' attribute.
	 * @see #setOtherProtocolDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemotePort_OtherProtocolDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RemotePort.PortProtocol\"]'"
	 * @generated
	 */
	String getOtherProtocolDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemotePort#getOtherProtocolDescription <em>Other Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protocol Description</em>' attribute.
	 * @see #getOtherProtocolDescription()
	 * @generated
	 */
	void setOtherProtocolDescription(String value);

} // CIM_RemotePort
