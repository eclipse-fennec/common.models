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
 * A representation of the model object '<em><b>CIM Virtual Ethernet Switch Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_VirtualEthernetSwitchSettingData specializes CIM_VirtualSystemSettingDatato add the specific properties required to define a virtual Ethernet bridge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VirtualEthernetSwitchSettingData#getVLANConnection <em>VLAN Connection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualEthernetSwitchSettingData#getAssociatedResourcePool <em>Associated Resource Pool</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualEthernetSwitchSettingData#getMaxNumMACAddress <em>Max Num MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualEthernetSwitchSettingData#getEVBMode <em>EVB Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualEthernetSwitchSettingData#getOtherEVBMode <em>Other EVB Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualEthernetSwitchSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.0' UMLPackagePath='CIM::Core::Virtualization' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualEthernetSwitchSettingData extends CIM_VirtualSystemSettingData {
	/**
	 * Returns the value of the '<em><b>VLAN Connection</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of VLANs identified by these VIDs that this bridge can access
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VLAN Connection</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualEthernetSwitchSettingData_VLANConnection()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getVLANConnection();

	/**
	 * Returns the value of the '<em><b>Associated Resource Pool</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of host resource pools to be associated or that are currently associated with the Ethernet bridge for the purpose of the allocation of Ethernet connections between a virtual system and an Ethernet bridge Each non-Null value of the AssoicatedResourcePool property shall conform to the production WBEM_URI_UntypedInstancePath as defined in DSP0207
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Resource Pool</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualEthernetSwitchSettingData_AssociatedResourcePool()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getAssociatedResourcePool();

	/**
	 * Returns the value of the '<em><b>Max Num MAC Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the number of unique MAC addresses that can be learned by the bridge to support MAC Address Learning, as defined in the IEEE 802.1D standard or in a VLAN-aware bridge this property specifies the number of MAC,VID pairs learned by the bridge to support learning as definded in the IEEE 802.1Q standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Num MAC Address</em>' attribute.
	 * @see #setMaxNumMACAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualEthernetSwitchSettingData_MaxNumMACAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxNumMACAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualEthernetSwitchSettingData#getMaxNumMACAddress <em>Max Num MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num MAC Address</em>' attribute.
	 * @see #getMaxNumMACAddress()
	 * @generated
	 */
	void setMaxNumMACAddress(Long value);

	/**
	 * Returns the value of the '<em><b>EVB Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the Ethernet virtual bridge mode that this bridge is operating in. The value 2(VEB) indicates that the associated port on the adjacent bridge is not configured for Reflective Relay and 3 (VEPA) indicates that the associated port on the adjacent bridge is configured for Reflective Relay as defined in IEEE 802.1Qbg. The value 4 (Direct) indicates that a bridge is directly connected to or is part of a hardware Ethernet NIC. The value 5 (S-VLAN Component) indicates that this is an S-VLAN component as defined in IEEE 802.1Qbg.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EVB Mode</em>' attribute.
	 * @see #setEVBMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualEthernetSwitchSettingData_EVBMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Other\",\"VEB\",\"VEPA\",\"Direct\",\"S-VLAN Component\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_VirtualEthernetSwitchSettingData.OtherEVBMode\"]'"
	 * @generated
	 */
	Integer getEVBMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualEthernetSwitchSettingData#getEVBMode <em>EVB Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EVB Mode</em>' attribute.
	 * @see #getEVBMode()
	 * @generated
	 */
	void setEVBMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Other EVB Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that shall describe the EVBMode when a well defined value is not available and EVBMode matches 1 (Other). This property should be set to null when the EVBMode is set to any other value than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other EVB Mode</em>' attribute.
	 * @see #setOtherEVBMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualEthernetSwitchSettingData_OtherEVBMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_VirtualEthernetSwitchSettingData.EVBMode\"]'"
	 * @generated
	 */
	String getOtherEVBMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualEthernetSwitchSettingData#getOtherEVBMode <em>Other EVB Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other EVB Mode</em>' attribute.
	 * @see #getOtherEVBMode()
	 * @generated
	 */
	void setOtherEVBMode(String value);

} // CIM_VirtualEthernetSwitchSettingData
