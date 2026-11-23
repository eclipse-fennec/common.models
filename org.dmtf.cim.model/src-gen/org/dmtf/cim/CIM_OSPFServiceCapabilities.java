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
 * A representation of the model object '<em><b>CIM OSPF Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OSPFServiceCapabilities class represents the capabilities of an OSPF service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OSPFServiceCapabilities#getSupportNSSA <em>Support NSSA</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFServiceCapabilities#getSupportOnDemand <em>Support On Demand</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFServiceCapabilities#getSupportMOSPF <em>Support MOSPF</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OSPFServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::OSPF' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_OSPFServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Support NSSA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute indicates whether this router supports NSSA ("not-so-stubby") areas or not, see RFC 1587.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support NSSA</em>' attribute.
	 * @see #setSupportNSSA(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFServiceCapabilities_SupportNSSA()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSupportNSSA();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFServiceCapabilities#getSupportNSSA <em>Support NSSA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support NSSA</em>' attribute.
	 * @see #getSupportNSSA()
	 * @generated
	 */
	void setSupportNSSA(Boolean value);

	/**
	 * Returns the value of the '<em><b>Support On Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute indicates whether this router supports on-demand circuits or not, see RFC 1793.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support On Demand</em>' attribute.
	 * @see #setSupportOnDemand(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFServiceCapabilities_SupportOnDemand()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfDemandExtensions\"]'"
	 * @generated
	 */
	Boolean getSupportOnDemand();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFServiceCapabilities#getSupportOnDemand <em>Support On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support On Demand</em>' attribute.
	 * @see #getSupportOnDemand()
	 * @generated
	 */
	void setSupportOnDemand(Boolean value);

	/**
	 * Returns the value of the '<em><b>Support MOSPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute indicates whether this router supports MOSPF (multicast enhancements to OSPF) or not, see B.1 in RFC 1584.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support MOSPF</em>' attribute.
	 * @see #setSupportMOSPF(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFServiceCapabilities_SupportMOSPF()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfMulticastExtensions\"]'"
	 * @generated
	 */
	Boolean getSupportMOSPF();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFServiceCapabilities#getSupportMOSPF <em>Support MOSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support MOSPF</em>' attribute.
	 * @see #getSupportMOSPF()
	 * @generated
	 */
	void setSupportMOSPF(Boolean value);

} // CIM_OSPFServiceCapabilities
