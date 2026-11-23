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
 * A representation of the model object '<em><b>CIM IP Headers Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IPHeadersFilter contains the most commonly required properties for performing filtering on IP, TCP or UDP headers. Properties not present in an instance of the IPHeadersFilter are treated as 'all values'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrIPVersion <em>Hdr IP Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrSrcAddress <em>Hdr Src Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrSrcAddressEndOfRange <em>Hdr Src Address End Of Range</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrSrcMask <em>Hdr Src Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrDestAddress <em>Hdr Dest Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrDestAddressEndOfRange <em>Hdr Dest Address End Of Range</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrDestMask <em>Hdr Dest Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrProtocolID <em>Hdr Protocol ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrSrcPortStart <em>Hdr Src Port Start</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrSrcPortEnd <em>Hdr Src Port End</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrDestPortStart <em>Hdr Dest Port Start</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrDestPortEnd <em>Hdr Dest Port End</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrDSCP <em>Hdr DSCP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrFlowLabel <em>Hdr Flow Label</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Network::Filtering' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPHeadersFilter extends CIM_FilterEntryBase {
	/**
	 * Returns the value of the '<em><b>Hdr IP Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrIPVersion identifies the version of the IP addresses for IP header filters. It is also used to determine the sizes of the OctetStrings in the six properties HdrSrcAddress, HdrSrcAddressEndOfRange, HdrSrcMask, HdrDestAddress, HdrDestAddressEndOfRange and HdrDestMask, as follows: 
	 * ipv4(4): OctetString(SIZE (4)) 
	 * ipv6(6): OctetString(SIZE (16|20)), 
	 * depending on whether a scope identifier is present. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider IP version in selecting matching packets, i.e., IP version matches for all values. In this case, the HdrSrcAddress, HdrSrcAddressEndOfRange, HdrSrcMask, HdrDestAddress, HdrDestAddressEndOfRange and HdrDestMask must also be not present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr IP Version</em>' attribute.
	 * @see #setHdrIPVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrIPVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"4\",\"6\"]' Values='[\"IPv4\",\"IPv6\"]' ModelCorrespondence='[\"CIM_IPHeadersFilter.HdrSrcAddress\",\"CIM_IPHeadersFilter.HdrSrcAddressEndOfRange\",\"CIM_IPHeadersFilter.HdrSrcMask\",\"CIM_IPHeadersFilter.HdrDestAddress\",\"CIM_IPHeadersFilter.HdrDestAddressEndOfRange\",\"CIM_IPHeadersFilter.HdrDestMask\"]'"
	 * @generated
	 */
	Integer getHdrIPVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrIPVersion <em>Hdr IP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr IP Version</em>' attribute.
	 * @see #getHdrIPVersion()
	 * @generated
	 */
	void setHdrIPVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Hdr Src Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrSrcAddress is an OctetString, of a size determined by the value of the HdrIPVersion property, representing a source IP address. When there is no HdrSrcAddressEndOfRange value, this value is compared to the source address in the IP header, subject to the mask represented in the HdrSrcMask property. (Note that the mask is ANDed with the address.) When there is a HdrSrcAddressEndOfRange value, this value is the start of the specified range (i.e., the HdrSrcAddress is lower than the HdrSrcAddressEndOfRange) that is compared to the source address in the IP header and matches on any value in the range. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrSrcAddress in selecting matching packets, i.e., HdrSrcAddress matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Src Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrSrcAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' ModelCorrespondence='[\"CIM_IPHeadersFilter.HdrIPVersion\"]'"
	 * @generated
	 */
	EList<Integer> getHdrSrcAddress();

	/**
	 * Returns the value of the '<em><b>Hdr Src Address End Of Range</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrSrcAddressEndOfRange is an OctetString, of a size determined by the value of the HdrIPVersion property, representing the end of a range of source IP addresses (inclusive), where the start of the range is the HdrSrcAddress property value. 
	 * 
	 * If a value for HdrSrcAddress is not provided, then this property also MUST NOT be provided. If a value for this property is provided, then HdrSrcMask MUST NOT be provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Src Address End Of Range</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrSrcAddressEndOfRange()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' ModelCorrespondence='[\"CIM_IPHeadersFilter.HdrIPVersion\"]'"
	 * @generated
	 */
	EList<Integer> getHdrSrcAddressEndOfRange();

	/**
	 * Returns the value of the '<em><b>Hdr Src Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrSrcMask is an OctetString, of a size determined by the value of the HdrIPVersion property, representing a mask to be used in comparing the source address in the IP header with the value represented in the HdrSrcAddress property. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrSrcMask in selecting matching packets, i.e., the value of the HdrSrcAddress or the source address range must match the source address in the packet exactly. If a value for this property is provided, then HdrSrcAddressEndOfRange MUST NOT be provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Src Mask</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrSrcMask()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' ModelCorrespondence='[\"CIM_IPHeadersFilter.HdrIPVersion\"]'"
	 * @generated
	 */
	EList<Integer> getHdrSrcMask();

	/**
	 * Returns the value of the '<em><b>Hdr Dest Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrDestAddress is an OctetString, of a size determined by the value of the HdrIPVersion property, representing a destination IP address. When there is no HdrDestAddressEndOfRange value, this value is compared to the destination address in the IP header, subject to the mask represented in the HdrDestMask property. (Note that the mask is ANDed with the address.) When there is a HdrDestAddressEndOfRange value, this value is the start of the specified range (i.e., the HdrDestAddress is lower than the HdrDestAddressEndOfRange) that is compared to the source address in the IP header and matches on any value in the range. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrDestAddress in selecting matching packets, i.e., HdrDestAddress matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Dest Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrDestAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' ModelCorrespondence='[\"CIM_IPHeadersFilter.HdrIPVersion\"]'"
	 * @generated
	 */
	EList<Integer> getHdrDestAddress();

	/**
	 * Returns the value of the '<em><b>Hdr Dest Address End Of Range</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrDestAddressEndOfRange is an OctetString, of a size determined by the value of the HdrIPVersion property, representing the end of a range of destination IP addresses (inclusive), where the start of the range is the HdrDestAddress property value. 
	 * 
	 * If a value for HdrDestAddress is not provided, then this property also MUST NOT be provided. If a value for this property is provided, then HdrDestMask MUST NOT be provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Dest Address End Of Range</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrDestAddressEndOfRange()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' ModelCorrespondence='[\"CIM_IPHeadersFilter.HdrIPVersion\"]'"
	 * @generated
	 */
	EList<Integer> getHdrDestAddressEndOfRange();

	/**
	 * Returns the value of the '<em><b>Hdr Dest Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrDestMask is an OctetString, of a size determined by the value of the HdrIPVersion property, representing a mask to be used in comparing the destination address in the IP header with the value represented in the HdrDestAddress property. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrDestMask in selecting matching packets, i.e., the value of the HdrDestAddress or the destination address range must match the destination address in the packet exactly. If a value for this property is provided, then HdrDestAddressEndOfRange MUST NOT be provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Dest Mask</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrDestMask()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' ModelCorrespondence='[\"CIM_IPHeadersFilter.HdrIPVersion\"]'"
	 * @generated
	 */
	EList<Integer> getHdrDestMask();

	/**
	 * Returns the value of the '<em><b>Hdr Protocol ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrProtocolID is an 8-bit unsigned integer, representing an IP protocol type. This value is compared to the Protocol field in the IP header. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrProtocolID in selecting matching packets, i.e., HdrProtocolID matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Protocol ID</em>' attribute.
	 * @see #setHdrProtocolID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrProtocolID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getHdrProtocolID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrProtocolID <em>Hdr Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Protocol ID</em>' attribute.
	 * @see #getHdrProtocolID()
	 * @generated
	 */
	void setHdrProtocolID(Integer value);

	/**
	 * Returns the value of the '<em><b>Hdr Src Port Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrSrcPortStart represents the lower end of a range of UDP or TCP source ports. The upper end of the range is represented by the HdrSrcPortEnd property. The value of HdrSrcPortStart MUST be no greater than the value of HdrSrcPortEnd. 
	 * 
	 * A source port filter is evaluated by testing whether the source port identified in the IP header falls within the range of values between HdrSrcPortStart and HdrSrcPortEnd, INCLUDING these two end points. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrSrcPortStart in selecting matching packets, i.e., there is no lower bound in matching source port values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Src Port Start</em>' attribute.
	 * @see #setHdrSrcPortStart(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrSrcPortStart()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getHdrSrcPortStart();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrSrcPortStart <em>Hdr Src Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Src Port Start</em>' attribute.
	 * @see #getHdrSrcPortStart()
	 * @generated
	 */
	void setHdrSrcPortStart(Integer value);

	/**
	 * Returns the value of the '<em><b>Hdr Src Port End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrSrcPortEnd represents the upper end of a range of UDP or TCP source ports. The lower end of the range is represented by the HdrSrcPortStart property. The value of HdrSrcPortEnd MUST be no less than the value of HdrSrcPortStart. A single port is indicated by equal values for HdrSrcPortStart and HdrSrcPortEnd. 
	 * 
	 * A source port filter is evaluated by testing whether the source port identified in the IP header falls within the range of values between HdrSrcPortStart and HdrSrcPortEnd, INCLUDING these two end points. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrSrcPortEnd in selecting matching packets, i.e., there is no upper bound in matching source port values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Src Port End</em>' attribute.
	 * @see #setHdrSrcPortEnd(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrSrcPortEnd()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getHdrSrcPortEnd();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrSrcPortEnd <em>Hdr Src Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Src Port End</em>' attribute.
	 * @see #getHdrSrcPortEnd()
	 * @generated
	 */
	void setHdrSrcPortEnd(Integer value);

	/**
	 * Returns the value of the '<em><b>Hdr Dest Port Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrDestPortStart represents the lower end of a range of UDP or TCP destination ports. The upper end of the range is represented by the HdrDestPortEnd property. The value of HdrDestPortStart MUST be no greater than the value of HdrDestPortEnd. A single port is indicated by equal values for HdrDestPortStart and HdrDestPortEnd. 
	 * 
	 * A destination port filter is evaluated by testing whether the destination port identified in the IP header falls within the range of values between HdrDestPortStart and HdrDestPortEnd, INCLUDING these two end points. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrDestPortStart in selecting matching packets, i.e., there is no lower bound in matching destination port values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Dest Port Start</em>' attribute.
	 * @see #setHdrDestPortStart(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrDestPortStart()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getHdrDestPortStart();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrDestPortStart <em>Hdr Dest Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Dest Port Start</em>' attribute.
	 * @see #getHdrDestPortStart()
	 * @generated
	 */
	void setHdrDestPortStart(Integer value);

	/**
	 * Returns the value of the '<em><b>Hdr Dest Port End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrDestPortEnd represents the upper end of a range of UDP or TCP destination ports. The lower end of the range is represented by the HdrDestPortStart property. The value of HdrDestPortEnd MUST be no less than the value of HdrDestPortStart. A single port is indicated by equal values for HdrDestPortStart and HdrDestPortEnd. 
	 * 
	 * A destination port filter is evaluated by testing whether the destination port identified in the IP header falls within the range of values between HdrDestPortStart and HdrDestPortEnd, INCLUDING these two end points. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrDestPortEnd in selecting matching packets, i.e., there is no upper bound in matching destination port values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Dest Port End</em>' attribute.
	 * @see #setHdrDestPortEnd(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrDestPortEnd()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getHdrDestPortEnd();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPHeadersFilter#getHdrDestPortEnd <em>Hdr Dest Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Dest Port End</em>' attribute.
	 * @see #getHdrDestPortEnd()
	 * @generated
	 */
	void setHdrDestPortEnd(Integer value);

	/**
	 * Returns the value of the '<em><b>Hdr DSCP</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HdrDSCP is defined as a set of discrete DiffServ code points, with no inherent structure. There is no semantically significant relationship between different HdrDSCPs. Consequently, there is no provision for specifying a range of HdrDSCPs. 
	 * 
	 * Since, in IPv4, the HdrDSCP field may contain bits to be interpreted as the TOS IP Precedence, this property is also used to filter on IP Precedence. Similarly, the IPv6 Traffic Class field is also filtered using the value(s) in this property. 
	 * 
	 * HdrDSCP is defined as an array, to provide the ability to specify several discrete DSCPs in a single instance of IPHeadersFilter, that would be OR'ed together to define the filter criteria. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrDSCP in selecting matching packets, i.e., HdrDSCP matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr DSCP</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrDSCP()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' MaxValue='63'"
	 * @generated
	 */
	EList<Integer> getHdrDSCP();

	/**
	 * Returns the value of the '<em><b>Hdr Flow Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 20-bit Flow Label field in the IPv6 header may be used by a source to label sequences of packets for which it requests special handling by the IPv6 devices, such as non-default quality of service or 'real-time' service. In the filter, this 20-bit string is encoded in a 24-bit octetstring by right-adjusting the value and padding on the left with b'0000'. 
	 * 
	 * If a value for this property is not provided, then the filter does not consider HdrFlowLabel in selecting matching packets, i.e., HdrFlowLabel matches for all values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdr Flow Label</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPHeadersFilter_HdrFlowLabel()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getHdrFlowLabel();

} // CIM_IPHeadersFilter
