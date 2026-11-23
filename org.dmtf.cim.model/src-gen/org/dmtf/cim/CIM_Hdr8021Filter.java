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
 * A representation of the model object '<em><b>CIM Hdr8021 Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 8021Filter allows 802.1.source and destination MAC addresses, as well as the 802.1 protocol ID, priority, and VLAN identifier fields, to be expressed in a single object to classify and identify traffic.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrSrcMACAddr8021 <em>Hdr Src MAC Addr8021</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrSrcMACMask8021 <em>Hdr Src MAC Mask8021</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrDestMACAddr8021 <em>Hdr Dest MAC Addr8021</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrDestMACMask8021 <em>Hdr Dest MAC Mask8021</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrProtocolID8021 <em>Hdr Protocol ID8021</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrPriorityValue8021 <em>Hdr Priority Value8021</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrVLANID8021 <em>Hdr VLANID8021</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021Filter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::Filtering' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Hdr8021Filter extends CIM_FilterEntryBase {
	/**
	 * Returns the value of the '<em><b>Hdr Src MAC Addr8021</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an OctetString of size 6, representing a 48-bit source MAC address in canonical format. This value is compared to the SourceAddress field in the MAC header, subject to the mask represented in the 8021HdrSrcMACMask property. If a value for this property is not provided, then the filter does not consider 8021HdrSrcMACAddr in selecting matching packets, i.e., 8021HdrSrcMACAddr matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Src MAC Addr8021</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021Filter_HdrSrcMACAddr8021()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getHdrSrcMACAddr8021();

	/**
	 * Returns the value of the '<em><b>Hdr Src MAC Mask8021</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an OctetString of size 6, representing a 48-bit mask to be used in comparing the SourceAddress field in the MAC header with the value represented in the 8021HdrSrcMACAddr property. If a value for this property is not provided, then the filter does not consider 8021HdrSrcMACMask in selecting matching packets, i.e., the value of 8021HdrSrcMACAddr must match the source MAC address in the packet exactly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Src MAC Mask8021</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021Filter_HdrSrcMACMask8021()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getHdrSrcMACMask8021();

	/**
	 * Returns the value of the '<em><b>Hdr Dest MAC Addr8021</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an OctetString of size 6, representing a 48-bit destination MAC address in canonical format. This value is compared to the DestinationAddress field in the MAC header, subject to the mask represented in the 8021HdrDestMACMask property. If a value for this property is not provided, then the filter does not consider 8021HdrDestMACAddr in selecting matching packets, i.e., 8021HdrDestMACAddr matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Dest MAC Addr8021</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021Filter_HdrDestMACAddr8021()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getHdrDestMACAddr8021();

	/**
	 * Returns the value of the '<em><b>Hdr Dest MAC Mask8021</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an OctetString of size 6, representing a 48-bit mask to be used in comparing the DestinationAddress field in the MAC header with the value represented in the 8021HdrDestMACAddr property. If a value for this property is not provided, then the filter does not consider 8021HdrDestMACMask in selecting matching packets, i.e., the value of 8021HdrDestMACAddr must match the destination MAC address in the packet exactly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Dest MAC Mask8021</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021Filter_HdrDestMACMask8021()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getHdrDestMACMask8021();

	/**
	 * Returns the value of the '<em><b>Hdr Protocol ID8021</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 16-bit unsigned integer, representing an Ethernet protocol type. This value is compared to the Ethernet Type field in the 802.3 MAC header. If a value for this property is not provided, then the filter does not consider 8021HdrProtocolID in selecting matching packets, i.e., 8021HdrProtocolID matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Protocol ID8021</em>' attribute.
	 * @see #setHdrProtocolID8021(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021Filter_HdrProtocolID8021()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getHdrProtocolID8021();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrProtocolID8021 <em>Hdr Protocol ID8021</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Protocol ID8021</em>' attribute.
	 * @see #getHdrProtocolID8021()
	 * @generated
	 */
	void setHdrProtocolID8021(Integer value);

	/**
	 * Returns the value of the '<em><b>Hdr Priority Value8021</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an 8-bit unsigned integer, representing an 802.1Q priority. This value is compared to the Priority field in the 802.1Q header. Since the 802.1Q Priority field consists of 3 bits, the values for this property are limited to the range 0..7. If a value for this property is not provided, then the filter does not consider 8021HdrPriorityValue in selecting matching packets, i.e., 8021HdrPriorityValue matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Priority Value8021</em>' attribute.
	 * @see #setHdrPriorityValue8021(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021Filter_HdrPriorityValue8021()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='0' MaxValue='7'"
	 * @generated
	 */
	Integer getHdrPriorityValue8021();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrPriorityValue8021 <em>Hdr Priority Value8021</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Priority Value8021</em>' attribute.
	 * @see #getHdrPriorityValue8021()
	 * @generated
	 */
	void setHdrPriorityValue8021(Integer value);

	/**
	 * Returns the value of the '<em><b>Hdr VLANID8021</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an 32-bit unsigned integer, representing an 802.1Q VLAN Identifier. This value is compared to the VLAN ID field in the 802.1Q header. Since the 802.1Q VLAN ID field consists of 12 bits, the values for this property are limited to the range 0..4095. If a value for this property is not provided, then the filter does not consider 8021HdrVLANID in selecting matching packets, i.e., 8021HdrVLANID matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr VLANID8021</em>' attribute.
	 * @see #setHdrVLANID8021(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021Filter_HdrVLANID8021()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='4095'"
	 * @generated
	 */
	Long getHdrVLANID8021();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Hdr8021Filter#getHdrVLANID8021 <em>Hdr VLANID8021</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr VLANID8021</em>' attribute.
	 * @see #getHdrVLANID8021()
	 * @generated
	 */
	void setHdrVLANID8021(Long value);

} // CIM_Hdr8021Filter
