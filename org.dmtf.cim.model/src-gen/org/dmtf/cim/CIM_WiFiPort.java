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
 * A representation of the model object '<em><b>CIM Wi Fi Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WiFiPort is the logical representation of wireless local area network communications hardware that conforms to the IEEE 802.11 series of specifications. It embodies properties at the lowest layers of a network stack, such as the antennas used for transmission and reception, the address permanently embedded into the hardware, and the operational bandwidth of the device.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WiFiPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Device::Ports' override.Speed='uint64' override.Speed.Description='The data rate at which the current PPDU (PLCP (Physical Layer Convergence Protocol) Protocol Data Unit) was received. This value is encoded in the first 4 bits of the PLCP header in each PLCP frame.' override.MaxSpeed='uint64' override.MaxSpeed.Description='Shall contain the maximum bandwidth relative to the current operating mode specified in PortType. For example, shall contain 11000000 if PortType contains 71 (\"802.11b\").' override.PortType='uint16' override.PortType.Description='PortType shall contain the specific 802.11 operating mode that is currently enabled on the Port. All modes are specified in' override.PortType.ValueMap='[\"0\",\"1\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"..\",\"16000..65535\"]' override.PortType.Values='[\"Unknown\",\"Other\",\"802.11a\",\"802.11b\",\"802.11g\",\"802.11n (Wi-Fi 4)\",\"802.11ac (Wi-Fi 5)\",\"802.11ax (Wi-Fi 6)\",\"802.11ax (Wi-Fi 6E)\",\"802.11be (Wi-Fi 7)\",\"DMTF Reserved\",\"Vendor Reserved\"]' override.PermanentAddress='string' override.PermanentAddress.Description='IEEE 802 EUI-48 MAC address, formatted as twelve hexadecimal digits (for example, \"010203040506\"), with each pair representing one of the six octets of the MAC address in \"canonical\" bit order. (Therefore, the Group address bit is found in the low order bit of the first character of the string.)' override.NetworkAddresses='string[]' override.NetworkAddresses.Description='IEEE 802 EUI-48 MAC addresses, each formatted as twelve hexadecimal digits (for example, \"010203040506\"), with each pair representing one of the six octets of the MAC address in \"canonical\" bit order. (Therefore, the Group address bit is found in the low order bit of the first character of the string.)' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_WiFiPort extends CIM_NetworkPort {
} // CIM_WiFiPort
