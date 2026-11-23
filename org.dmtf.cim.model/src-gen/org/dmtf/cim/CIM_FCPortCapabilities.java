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
 * A representation of the model object '<em><b>CIM FC Port Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FibreChannel port control and configuration capabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCPortCapabilities#getRequestedTypesSupported <em>Requested Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortCapabilities#getMaxNPIVLogins <em>Max NPIV Logins</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortCapabilities#getNPIVSupported <em>NPIV Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCPortCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::FC' ModelCorrespondence='[\"CIM_FCPortSettings.RequestedType\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCPortCapabilities extends CIM_NetworkPortCapabilities {
	/**
	 * Returns the value of the '<em><b>Requested Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of supported port types that can be configured on FCPortSettings.RequestedType. 
	 * RequestedType acts as a filter on the enabled port types that a port may auto-negotiate during port login. 
	 * "G" = Port may only act as an expansion port (E), or a fabric port (F). "GL" = Port may only act an an expansion port (E), a fabric port (F), or a fabric port supporting FC arbitrated loop (FL). "E" = Port may only act as an expansion port (E) connecting fabric elements. "F" = Port may only act as a fabric port (F). "FX" = Port may only act as a fabric port (F), or a fabric port supporting FC arbitrated loop (FL). "B" = Port may only act as a bridge port (B). "NX" = Port may only act as a node port (N) or a node port supporting FC arbitrated loop (NL). "N" = Port may only act as a Node port. "NL" = Port may only act as a Node Port supporting FC arbitrated loop. "NX" = Port may only act as a node port (N) or a node port supporting FC arbitrated loop (NL).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortCapabilities_RequestedTypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"16000..65535\"]' Values='[\"G\",\"GL\",\"E\",\"F\",\"FX\",\"B\",\"NX\",\"N\",\"NL\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_PORT_CONFIG_CAPS_T.ConfigurablePortTypes\"]' ModelCorrespondence='[\"CIM_FCPortSettings.RequestedType\"]'"
	 * @generated
	 */
	EList<Integer> getRequestedTypesSupported();

	/**
	 * Returns the value of the '<em><b>Max NPIV Logins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of NPIV logins supported on the fibre channel port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max NPIV Logins</em>' attribute.
	 * @see #setMaxNPIVLogins(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortCapabilities_MaxNPIVLogins()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaxNPIVLogins();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortCapabilities#getMaxNPIVLogins <em>Max NPIV Logins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max NPIV Logins</em>' attribute.
	 * @see #getMaxNPIVLogins()
	 * @generated
	 */
	void setMaxNPIVLogins(Integer value);

	/**
	 * Returns the value of the '<em><b>NPIV Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag indicating whether NPIV is support on the fibre channel port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NPIV Supported</em>' attribute.
	 * @see #setNPIVSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortCapabilities_NPIVSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getNPIVSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortCapabilities#getNPIVSupported <em>NPIV Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NPIV Supported</em>' attribute.
	 * @see #getNPIVSupported()
	 * @generated
	 */
	void setNPIVSupported(Boolean value);

} // CIM_FCPortCapabilities
