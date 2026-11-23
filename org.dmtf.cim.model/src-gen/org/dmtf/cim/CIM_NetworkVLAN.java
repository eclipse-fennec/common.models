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
 * A representation of the model object '<em><b>CIM Network VLAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of NetworkVLAN represents a collection of VLANSwitchEndpoints and/or VLANEndstationEndpoints which are members of the VLAN. There SHOULD be an instance of NetworkVLAN for every VLAN available in a switch. For example, in a switch with port-based VLANs, if there are 16 VLANs to which ports can be assigned (VLAN 1 through VLAN 16), there SHOULD be an instance of NetworkVLAN for each of VLAN 1 through VLAN 16.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkVLAN#getVLANId <em>VLAN Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkVLAN#getSAIdentifier <em>SA Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkVLAN#getTransmissionSize <em>Transmission Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkVLAN#getTypeOfMedia <em>Type Of Media</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkVLAN#getOtherTypeDescription <em>Other Type Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkVLAN()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.26.0' UMLPackagePath='CIM::Network::VLAN' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkVLAN extends CIM_ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>VLAN Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 12-bit VLAN ID used in the VLAN Tag header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VLAN Id</em>' attribute.
	 * @see #setVLANId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkVLAN_VLANId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' MaxValue='4094' MappingStrings='[\"MIB.IETF|Q-BRIDGE-MIB.VlanId\"]'"
	 * @generated
	 */
	Integer getVLANId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkVLAN#getVLANId <em>VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VLAN Id</em>' attribute.
	 * @see #getVLANId()
	 * @generated
	 */
	void setVLANId(Integer value);

	/**
	 * Returns the value of the '<em><b>SA Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the 802.10 SAID field which would be used for this VLAN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SA Identifier</em>' attribute.
	 * @see #setSAIdentifier(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkVLAN_SAIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getSAIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkVLAN#getSAIdentifier <em>SA Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SA Identifier</em>' attribute.
	 * @see #getSAIdentifier()
	 * @generated
	 */
	void setSAIdentifier(Long value);

	/**
	 * Returns the value of the '<em><b>Transmission Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property is set to a positive integer when the value of the MTU for all members (switch endpoints/endstationendpoints of the VLAN is the same, otherwise is set to -1 and the Transmission size is set on each of the individual endpoints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmission Size</em>' attribute.
	 * @see #setTransmissionSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkVLAN_TransmissionSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32'"
	 * @generated
	 */
	Integer getTransmissionSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkVLAN#getTransmissionSize <em>Transmission Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Size</em>' attribute.
	 * @see #getTransmissionSize()
	 * @generated
	 */
	void setTransmissionSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Type Of Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines/restricts the media type of the VLAN. This information is also needed when a VLAN is not yet associated to any end point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Media</em>' attribute.
	 * @see #setTypeOfMedia(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkVLAN_TypeOfMedia()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5..16000\",\"..\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Ethernet\",\"FDDI\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_NetworkVLAN.OtherTypeDescription\"]'"
	 * @generated
	 */
	Integer getTypeOfMedia();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkVLAN#getTypeOfMedia <em>Type Of Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Media</em>' attribute.
	 * @see #getTypeOfMedia()
	 * @generated
	 */
	void setTypeOfMedia(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of media that is supported by this VLAN, when the value of the Type property is set to 1 (i.e., "Other"). This property should be set to NULL when the Type property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkVLAN_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_NetworkVLAN.TypeOfMedia\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkVLAN#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

} // CIM_NetworkVLAN
