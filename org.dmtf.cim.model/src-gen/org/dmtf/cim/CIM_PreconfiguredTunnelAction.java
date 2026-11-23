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
 * A representation of the model object '<em><b>CIM Preconfigured Tunnel Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PreconfiguredTunnelAction is used to create tunnel-mode SAs using preconfigured, hard-wired algorithms and keys. Note that the SPI for a preconfigured SA action is contained in the association, TransformOfPreconfiguredAction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PreconfiguredTunnelAction#getDFHandling <em>DF Handling</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PreconfiguredTunnelAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|PreconfiguredTunnelAction\"]' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_PreconfiguredTunnelAction extends CIM_PreconfiguredSAAction {
	/**
	 * Returns the value of the '<em><b>DF Handling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DFHandling controls how the Don't Fragment bit is managed by the tunnel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DF Handling</em>' attribute.
	 * @see #setDFHandling(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PreconfiguredTunnelAction_DFHandling()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Copy from Internal to External IP Header\",\"Set DF Bit in External Header to 1\",\"Set DF Bit in External Header to 0\"]' MappingStrings='[\"IPSP Policy Model.IETF|PreconfiguredTunnelAction.DFHandling\"]' ModelCorrespondence='[\"CIM_IPsecSAEndpoint.DFHandling\"]'"
	 * @generated
	 */
	Integer getDFHandling();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PreconfiguredTunnelAction#getDFHandling <em>DF Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DF Handling</em>' attribute.
	 * @see #getDFHandling()
	 * @generated
	 */
	void setDFHandling(Integer value);

} // CIM_PreconfiguredTunnelAction
