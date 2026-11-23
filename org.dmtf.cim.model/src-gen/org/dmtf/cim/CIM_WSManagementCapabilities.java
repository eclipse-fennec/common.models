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
 * A representation of the model object '<em><b>CIM WS Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WS-Management Capabiltiies. For more information see the WS-Management specification, DSP0226.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WSManagementCapabilities#getXPathFeatures <em>XPath Features</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WSManagementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.38.0' UMLPackagePath='CIM::Interop::WBEMProtocol' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_WSManagementCapabilities extends CIM_WBEMProtocolServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>XPath Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of XPath features supported by an Object Manager or Provider associated via ElementCapabilities. For more information refer to the WS-Management Specification, DSP0226 1.0, Annex D "XPath Support".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPath Features</em>' attribute.
	 * @see #setXPathFeatures(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WSManagementCapabilities_XPathFeatures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\"]' Values='[\"Level 1 with basic node selector support and no filtering\",\"Level 2 with basic filtering support\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getXPathFeatures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WSManagementCapabilities#getXPathFeatures <em>XPath Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPath Features</em>' attribute.
	 * @see #getXPathFeatures()
	 * @generated
	 */
	void setXPathFeatures(Integer value);

} // CIM_WSManagementCapabilities
