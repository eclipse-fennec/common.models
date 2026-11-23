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
 * A representation of the model object '<em><b>CIM Network Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_NetworkAdpater class has been deprecated in lieu of CIM_NetworkPort. CIM_NetworkPort better reflects that the hardware of a single port is described and managed. 
 * Deprecated description: NetworkAdapter is an Abstract class that defines general networking hardware concepts (for example, PermanentAddress or Speed of operation).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapter#getPermanentAddress <em>Permanent Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapter#getNetworkAddresses <em>Network Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapter#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapter#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapter#getFullDuplex <em>Full Duplex</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapter#getAutoSense <em>Auto Sense</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapter#getOctetsTransmitted <em>Octets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapter#getOctetsReceived <em>Octets Received</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapter()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_NetworkPort\"]' Abstract='true' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkAdapter extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Permanent Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: PermanentAddress defines the network address that is hardcoded into an adapter. This 'hardcoded' address might be changed through a firmware upgrade or software configuration. If so, this field should be updated when the change is made. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permanent Address</em>' attribute.
	 * @see #setPermanentAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapter_PermanentAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NetworkPort.PermanentAddress\"]' MaxLen='64' MappingStrings='[\"MIF.DMTF|Network Adapter 802 Port|001.2\"]'"
	 * @generated
	 */
	String getPermanentAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkAdapter#getPermanentAddress <em>Permanent Address</em>}' attribute.
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
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: An array of strings that indicates the network addresses for an adapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapter_NetworkAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_NetworkPort.NetworkAddresses\"]' ArrayType='Indexed' MaxLen='64' MappingStrings='[\"MIF.DMTF|Network Adapter 802 Port|001.3\"]'"
	 * @generated
	 */
	EList<String> getNetworkAddresses();

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: An estimate of the current bandwidth in Bits per Second. For Adapters that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapter_Speed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_NetworkPort.Speed\"]' Units='Bits per Second' MappingStrings='[\"MIB.IETF|RFC1213-MIB.ifSpeed\",\"MIF.DMTF|Network Adapter 802 Port|001.5\"]' PUnit='bit / second'"
	 * @generated
	 */
	Long getSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkAdapter#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The maximum speed, in Bits per Second, for the Network Adapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Speed</em>' attribute.
	 * @see #setMaxSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapter_MaxSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_NetworkPort.MaxSpeed\"]' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getMaxSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkAdapter#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Full Duplex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A Boolean that indicates that the Adapter is operating in full duplex mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Duplex</em>' attribute.
	 * @see #setFullDuplex(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapter_FullDuplex()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_NetworkPort.FullDuplex\"]'"
	 * @generated
	 */
	Boolean getFullDuplex();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkAdapter#getFullDuplex <em>Full Duplex</em>}' attribute.
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
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A Boolean that indicates whether the NetworkAdapter is capable of automatically determining the speed or other communications characteristics of the attached network media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Sense</em>' attribute.
	 * @see #setAutoSense(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapter_AutoSense()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_NetworkPort.AutoSense\"]'"
	 * @generated
	 */
	Boolean getAutoSense();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkAdapter#getAutoSense <em>Auto Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Sense</em>' attribute.
	 * @see #getAutoSense()
	 * @generated
	 */
	void setAutoSense(Boolean value);

	/**
	 * Returns the value of the '<em><b>Octets Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. The replacement is CIM_NetworkPortStatistics.BytesTransmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Octets Transmitted</em>' attribute.
	 * @see #setOctetsTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapter_OctetsTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_NetworkPortStatistics.BytesTransmitted\"]' Counter='true' MappingStrings='[\"MIB.IETF|RFC1213-MIB.ifOutOctets\",\"MIF.DMTF|Network Adapter 802 Port|001.7\"]'"
	 * @generated
	 */
	Long getOctetsTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkAdapter#getOctetsTransmitted <em>Octets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Octets Transmitted</em>' attribute.
	 * @see #getOctetsTransmitted()
	 * @generated
	 */
	void setOctetsTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Octets Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of OctetsReceived is deprecated. The replacement is CIM_NetworkPortStatistics.BytesReceived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Octets Received</em>' attribute.
	 * @see #setOctetsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapter_OctetsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_NetworkPortStatistics.BytesReceived\"]' Counter='true' MappingStrings='[\"MIB.IETF|RFC1213-MIB.ifInOctets\",\"MIF.DMTF|Network Adapter 802 Port|001.9\"]'"
	 * @generated
	 */
	Long getOctetsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkAdapter#getOctetsReceived <em>Octets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Octets Received</em>' attribute.
	 * @see #getOctetsReceived()
	 * @generated
	 */
	void setOctetsReceived(Long value);

} // CIM_NetworkAdapter
