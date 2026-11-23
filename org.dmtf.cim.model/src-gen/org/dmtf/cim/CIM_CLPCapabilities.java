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
 * A representation of the model object '<em><b>CIM CLP Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of ProtocolServiceCapabilities that defines the capabilities of a CLPService. An instance of CLPCapabilities is associated with a ProtocolService using ElementCapabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CLPCapabilities#getCLPVersions <em>CLP Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPCapabilities#getSMMEAddressVersions <em>SMME Address Versions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CLPCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CLPCapabilities extends CIM_ProtocolServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>CLP Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CLPVersion is an array of strings that specifies the versions of the SM CLP Specification, DMTF document DSP0214, that the CLP service supports. The format of the version string follows the conventions noted in DMTF document DSP4004 in current and historical versions of the document. Thus the version string format is "m.n.ud s" where m is the string value of the major version identifier in numeric form, n is the string value of the minor version identifier in numeric form , u is the optional string value of the update (errata or coordination changes) in numeric form, d is the optional draft in alphabetic form and s is one of the following string values in alphabetic form: "Work In Progress", "Draft Standard", "DMTF Standard", "Preliminary Standard" or "Final Standard".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CLP Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPCapabilities_CLPVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCLPVersions();

	/**
	 * Returns the value of the '<em><b>SMME Address Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SMMEAddressVersion is an array of strings that specify the versions of the Server Management Managed Element Address Specification, DMTF document DSP0215, that the CLP service supports. The format of the version string follows the conventions noted in DMTF document DSP4004 in current and historical versions of the document. Thus the version string format is "m.n.ud s" where m is the string value of the major version identifier in numeric form, n is the string value of the minor version identifier in numeric form , u is the optional string value of the update (errata or coordination changes) in numeric form, d is the optional draft in alphabetic form and s is one of the following string values in alphabetic form: "Work In Progress", "Draft Standard", "Preliminary Standard" or "Final Standard".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SMME Address Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPCapabilities_SMMEAddressVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSMMEAddressVersions();

} // CIM_CLPCapabilities
