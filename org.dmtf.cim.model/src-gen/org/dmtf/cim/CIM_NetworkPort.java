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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Network Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NetworkPort is the logical representation of network communications hardware such as a physical connector and the setup or operation of the network chips, at the lowest layers of a network stack.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getOtherNetworkPortType <em>Other Network Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getLinkTechnology <em>Link Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getOtherLinkTechnology <em>Other Link Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getPermanentAddress <em>Permanent Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getNetworkAddresses <em>Network Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getFullDuplex <em>Full Duplex</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getAutoSense <em>Auto Sense</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getSupportedMaximumTransmissionUnit <em>Supported Maximum Transmission Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPort#getActiveMaximumTransmissionUnit <em>Active Maximum Transmission Unit</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Ports' override.Speed='uint64' override.Speed.Description='The current bandwidth of the Port in Bits per Second. For ports that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.' override.Speed.Units='Bits per Second' override.Speed.MappingStrings='[\"MIB.IETF|MIB-II.ifSpeed\",\"MIF.DMTF|Network Adapter 802 Port|001.5\"]' override.Speed.PUnit='bit / second' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPort extends CIM_LogicalPort {
	/**
	 * Returns the value of the '<em><b>Other Network Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property is deprecated in lieu of CIM_LogicalPort.PortType. 
	 * Deprecated description: The type of module, when PortType is set to 1 ("Other".)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Network Port Type</em>' attribute.
	 * @see #setOtherNetworkPortType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_OtherNetworkPortType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NetworkPort.OtherPortType\"]' ModelCorrespondence='[\"CIM_LogicalPort.PortType\"]'"
	 * @generated
	 */
	String getOtherNetworkPortType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPort#getOtherNetworkPortType <em>Other Network Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Network Port Type</em>' attribute.
	 * @see #getOtherNetworkPortType()
	 * @generated
	 */
	void setOtherNetworkPortType(String value);

	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NetworkPorts are often numbered relative to either a logical module or a network element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see #setPortNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_PortNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPortNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPort#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Link Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration of the types of links. When set to 1 ("Other"), the related property OtherLinkTechnology contains a string description of the type of link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Technology</em>' attribute.
	 * @see #setLinkTechnology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_LinkTechnology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"Unknown\",\"Other\",\"Ethernet\",\"IB\",\"FC\",\"FDDI\",\"ATM\",\"Token Ring\",\"Frame Relay\",\"Infrared\",\"BlueTooth\",\"Wireless LAN\"]' ModelCorrespondence='[\"CIM_NetworkPort.OtherLinkTechnology\"]'"
	 * @generated
	 */
	Integer getLinkTechnology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPort#getLinkTechnology <em>Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Technology</em>' attribute.
	 * @see #getLinkTechnology()
	 * @generated
	 */
	void setLinkTechnology(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Link Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string value that describes LinkTechnology when it is set to 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Link Technology</em>' attribute.
	 * @see #setOtherLinkTechnology(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_OtherLinkTechnology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_NetworkPort.LinkTechnology\"]'"
	 * @generated
	 */
	String getOtherLinkTechnology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPort#getOtherLinkTechnology <em>Other Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Link Technology</em>' attribute.
	 * @see #getOtherLinkTechnology()
	 * @generated
	 */
	void setOtherLinkTechnology(String value);

	/**
	 * Returns the value of the '<em><b>Permanent Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PermanentAddress defines the network address that is hardcoded into a port. This 'hardcoded' address can be changed using a firmware upgrade or a software configuration. When this change is made, the field should be updated at the same time. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permanent Address</em>' attribute.
	 * @see #setPermanentAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_PermanentAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' MappingStrings='[\"MIF.DMTF|Network Adapter 802 Port|001.2\"]'"
	 * @generated
	 */
	String getPermanentAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPort#getPermanentAddress <em>Permanent Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permanent Address</em>' attribute.
	 * @see #getPermanentAddress()
	 * @generated
	 */
	void setPermanentAddress(String value);

	/**
	 * Returns the value of the '<em><b>Network Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings that indicates the network addresses for the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_NetworkAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='64' MappingStrings='[\"MIF.DMTF|Network Adapter 802 Port|001.3\"]'"
	 * @generated
	 */
	EList<String> getNetworkAddresses();

	/**
	 * Returns the value of the '<em><b>Full Duplex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates that the port is operating in full duplex mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Duplex</em>' attribute.
	 * @see #setFullDuplex(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_FullDuplex()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getFullDuplex();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPort#getFullDuplex <em>Full Duplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Duplex</em>' attribute.
	 * @see #getFullDuplex()
	 * @generated
	 */
	void setFullDuplex(Boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean that indicates whether the NetworkPort is capable of automatically determining the speed or other communications characteristics of the attached network media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Sense</em>' attribute.
	 * @see #setAutoSense(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_AutoSense()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAutoSense();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPort#getAutoSense <em>Auto Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Sense</em>' attribute.
	 * @see #getAutoSense()
	 * @generated
	 */
	void setAutoSense(Boolean value);

	/**
	 * Returns the value of the '<em><b>Supported Maximum Transmission Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum transmission unit (MTU) that can be supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Maximum Transmission Unit</em>' attribute.
	 * @see #setSupportedMaximumTransmissionUnit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_SupportedMaximumTransmissionUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getSupportedMaximumTransmissionUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPort#getSupportedMaximumTransmissionUnit <em>Supported Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Maximum Transmission Unit</em>' attribute.
	 * @see #getSupportedMaximumTransmissionUnit()
	 * @generated
	 */
	void setSupportedMaximumTransmissionUnit(Long value);

	/**
	 * Returns the value of the '<em><b>Active Maximum Transmission Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The active or negotiated maximum transmission unit (MTU) that can be supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Maximum Transmission Unit</em>' attribute.
	 * @see #setActiveMaximumTransmissionUnit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPort_ActiveMaximumTransmissionUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getActiveMaximumTransmissionUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPort#getActiveMaximumTransmissionUnit <em>Active Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Maximum Transmission Unit</em>' attribute.
	 * @see #getActiveMaximumTransmissionUnit()
	 * @generated
	 */
	void setActiveMaximumTransmissionUnit(Long value);

} // CIM_NetworkPort
