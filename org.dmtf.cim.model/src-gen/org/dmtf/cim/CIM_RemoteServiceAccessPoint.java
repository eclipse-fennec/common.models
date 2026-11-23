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
 * A representation of the model object '<em><b>CIM Remote Service Access Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RemoteServiceAccessPoint describes access or addressing information or a combination of this information for a remote connection that is known to a local network element. This information is scoped or contained by the local network element, because this is the context in which the connection is remote. 
 * The relevance of the remote access point and information on its use are described by subclassing RemoteServiceAccessPoint or by associating to it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getAccessInfo <em>Access Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getInfoFormat <em>Info Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getOtherInfoFormatDescription <em>Other Info Format Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getAccessContext <em>Access Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getOtherAccessContext <em>Other Access Context</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RemoteServiceAccessPoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::Core::Service' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_RemoteServiceAccessPoint extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Access Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access or addressing information or a combination of this information for a remote connection. This information can be a host name, network address, or similar information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Info</em>' attribute.
	 * @see #setAccessInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteServiceAccessPoint_AccessInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RemoteServiceAccessPoint.InfoFormat\"]'"
	 * @generated
	 */
	String getAccessInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getAccessInfo <em>Access Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Info</em>' attribute.
	 * @see #getAccessInfo()
	 * @generated
	 */
	void setAccessInfo(String value);

	/**
	 * Returns the value of the '<em><b>Info Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer that describes the format and interpretation of the AccessInfo property.
	 * 206'Parameterized URL'- a URL containing ${parameterName} strings. Those strings are intended to be replaced in their entirety by the value of the named parameter. The interpretation of such parameters is not defined by this subclass. 
	 * As an example use: If a parameter named 'CompanyURL' has a value of 'www.DMTF.org' and the value of AccessInfo was 'http:\${CompanyURL}', then the resultant URL is intended to be 'http:\www.dmtf.org'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Info Format</em>' attribute.
	 * @see #setInfoFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteServiceAccessPoint_InfoFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"100\",\"101\",\"102\",\"103\",\"104\",\"200\",\"201\",\"202\",\"203\",\"204\",\"205\",\"206\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Host Name\",\"IPv4 Address\",\"IPv6 Address\",\"IPX Address\",\"DECnet Address\",\"SNA Address\",\"Autonomous System Number\",\"MPLS Label\",\"IPv4 Subnet Address\",\"IPv6 Subnet Address\",\"IPv4 Address Range\",\"IPv6 Address Range\",\"Dial String\",\"Ethernet Address\",\"Token Ring Address\",\"ATM Address\",\"Frame Relay Address\",\"URL\",\"FQDN\",\"User FQDN\",\"DER ASN1 DN\",\"DER ASN1 GN\",\"Key ID\",\"Parameterized URL\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_RemoteServiceAccessPoint.OtherInfoFormatDescription\"]'"
	 * @generated
	 */
	Integer getInfoFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getInfoFormat <em>Info Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Format</em>' attribute.
	 * @see #getInfoFormat()
	 * @generated
	 */
	void setInfoFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Info Format Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the format when the property InfoFormat is set to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Info Format Description</em>' attribute.
	 * @see #setOtherInfoFormatDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteServiceAccessPoint_OtherInfoFormatDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RemoteServiceAccessPoint.InfoFormat\"]'"
	 * @generated
	 */
	String getOtherInfoFormatDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getOtherInfoFormatDescription <em>Other Info Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Info Format Description</em>' attribute.
	 * @see #getOtherInfoFormatDescription()
	 * @generated
	 */
	void setOtherInfoFormatDescription(String value);

	/**
	 * Returns the value of the '<em><b>Access Context</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AccessContext property identifies the role this RemoteServiceAccessPoint is playing in the hosting system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Context</em>' attribute.
	 * @see #setAccessContext(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteServiceAccessPoint_AccessContext()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Default Gateway\",\"DNS Server\",\"SNMP Trap Destination\",\"MPLS Tunnel Destination\",\"DHCP Server\",\"SMTP Server\",\"LDAP Server\",\"Network Time Protocol (NTP) Server\",\"Management Service\",\"internet Storage Name Service (iSNS)\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_RemoteServiceAccessPoint.OtherAccessContext\"]'"
	 * @generated
	 */
	Integer getAccessContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getAccessContext <em>Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Context</em>' attribute.
	 * @see #getAccessContext()
	 * @generated
	 */
	void setAccessContext(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Access Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the AccessContext property contains a value of 1, "Other" then this is a free form string providing more information about the role of RemoteServiceAccessPoint in the hosting system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Access Context</em>' attribute.
	 * @see #setOtherAccessContext(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteServiceAccessPoint_OtherAccessContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RemoteServiceAccessPoint.AccessContext\"]'"
	 * @generated
	 */
	String getOtherAccessContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteServiceAccessPoint#getOtherAccessContext <em>Other Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Access Context</em>' attribute.
	 * @see #getOtherAccessContext()
	 * @generated
	 */
	void setOtherAccessContext(String value);

} // CIM_RemoteServiceAccessPoint
