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
 * A representation of the model object '<em><b>CIM Source Routing Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SourceRoutingService represents the capability of a switch to participate in the source routing of frames received at its ports. It is a system-level Service that provides and supports local switching only. The SourceRouting Service is aggregated into a higher level SwitchService through the SwitchServiceSourceRouting association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SourceRoutingService#getBridgeLfMode <em>Bridge Lf Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SourceRoutingService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SourceRoutingService extends CIM_ForwardingService {
	/**
	 * Returns the value of the '<em><b>Bridge Lf Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the bridge operates using older 3 bit length negotiation fields or the newer 6 bit length field in its RIF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Lf Mode</em>' attribute.
	 * @see #setBridgeLfMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SourceRoutingService_BridgeLfMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"Mode3\",\"Mode6\"]' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrBridgeLfMode\"]'"
	 * @generated
	 */
	Integer getBridgeLfMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SourceRoutingService#getBridgeLfMode <em>Bridge Lf Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Lf Mode</em>' attribute.
	 * @see #getBridgeLfMode()
	 * @generated
	 */
	void setBridgeLfMode(Integer value);

} // CIM_SourceRoutingService
