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
 * A representation of the model object '<em><b>CIM Redirection Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RedirectionServiceCapabilities describes the capabilities of the associated RedirectionService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RedirectionServiceCapabilities#getSharingModeSupported <em>Sharing Mode Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RedirectionServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::ConsoleProtocols' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_RedirectionServiceCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Sharing Mode Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SharingModeSupported indicates the possible values to which the SharingMode of the associated RedirectionService can be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sharing Mode Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_RedirectionServiceCapabilities_SharingModeSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"..\"]' Values='[\"Unknown\",\"Exclusive\",\"Shared\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSharingModeSupported();

} // CIM_RedirectionServiceCapabilities
