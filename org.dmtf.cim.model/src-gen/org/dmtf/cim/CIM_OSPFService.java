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
 * A representation of the model object '<em><b>CIM OSPF Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to represent the basic operation of OSPF. It is derived from the RouteCalculationService, the superclass of all routing protocols.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OSPFService#getRunningMOSPF <em>Running MOSPF</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFService#getIsInterAreaMulticastForwarder <em>Is Inter Area Multicast Forwarder</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFService#getIsInterAsMulticastForwarder <em>Is Inter As Multicast Forwarder</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFService#getExitOverflowInterval <em>Exit Overflow Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFService#getRFC1583Compatibility <em>RFC1583 Compatibility</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OSPFService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::OSPF' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OSPFService extends CIM_RouteCalculationService {
	/**
	 * Returns the value of the '<em><b>Running MOSPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute indicates whether this router is running MOSPF (multicast enhancements to OSPF) or not, see B.1 in RFC 1584. This attribute only can be true, when the SupportMOSPF property in OSPFService Capabilities is also true. If SupportMOSPF is false, then this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running MOSPF</em>' attribute.
	 * @see #setRunningMOSPF(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFService_RunningMOSPF()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfMulticastExtensions\"]'"
	 * @generated
	 */
	Boolean getRunningMOSPF();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFService#getRunningMOSPF <em>Running MOSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running MOSPF</em>' attribute.
	 * @see #getRunningMOSPF()
	 * @generated
	 */
	void setRunningMOSPF(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Inter Area Multicast Forwarder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute indicates whether this router will forward multicast datagrams between OSPF areas or not, see B.1 in RFC 1584.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Inter Area Multicast Forwarder</em>' attribute.
	 * @see #setIsInterAreaMulticastForwarder(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFService_IsInterAreaMulticastForwarder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfMulticastExtensions\"]'"
	 * @generated
	 */
	Boolean getIsInterAreaMulticastForwarder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFService#getIsInterAreaMulticastForwarder <em>Is Inter Area Multicast Forwarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inter Area Multicast Forwarder</em>' attribute.
	 * @see #getIsInterAreaMulticastForwarder()
	 * @generated
	 */
	void setIsInterAreaMulticastForwarder(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Inter As Multicast Forwarder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute indicates whether this router will forward multicast datagrams between Autonomous Systems or not, see B.1 in RFC 1584.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Inter As Multicast Forwarder</em>' attribute.
	 * @see #setIsInterAsMulticastForwarder(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFService_IsInterAsMulticastForwarder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfMulticastExtensions\"]'"
	 * @generated
	 */
	Boolean getIsInterAsMulticastForwarder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFService#getIsInterAsMulticastForwarder <em>Is Inter As Multicast Forwarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inter As Multicast Forwarder</em>' attribute.
	 * @see #getIsInterAsMulticastForwarder()
	 * @generated
	 */
	void setIsInterAsMulticastForwarder(Boolean value);

	/**
	 * Returns the value of the '<em><b>Exit Overflow Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of seconds that, after entering OverflowState, a router will attempt to leave OverflowState. When set to 0, the router will not leave OverflowState until restarted, see 2.1 in RFC 1765.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Overflow Interval</em>' attribute.
	 * @see #setExitOverflowInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFService_ExitOverflowInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfExitOverflowInterval\"]' PUnit='second'"
	 * @generated
	 */
	Long getExitOverflowInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFService#getExitOverflowInterval <em>Exit Overflow Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Overflow Interval</em>' attribute.
	 * @see #getExitOverflowInterval()
	 * @generated
	 */
	void setExitOverflowInterval(Long value);

	/**
	 * Returns the value of the '<em><b>RFC1583 Compatibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls the preference rules used in choosing among multiple AS-external-LSAs advertising the same destination. When set to TRUE, the preference rules remain those specified by RFC 1583. When set to FALSE, the preference rules are those stated in RFC 2328, which prevent routing loops when AS-external-LSAs for the same destination have been originated from different areas. See C.1 in RFC2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RFC1583 Compatibility</em>' attribute.
	 * @see #setRFC1583Compatibility(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFService_RFC1583Compatibility()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRFC1583Compatibility();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFService#getRFC1583Compatibility <em>RFC1583 Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RFC1583 Compatibility</em>' attribute.
	 * @see #getRFC1583Compatibility()
	 * @generated
	 */
	void setRFC1583Compatibility(Boolean value);

} // CIM_OSPFService
