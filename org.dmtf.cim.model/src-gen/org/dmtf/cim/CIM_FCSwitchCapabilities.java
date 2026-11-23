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
 * A representation of the model object '<em><b>CIM FC Switch Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FibreChannel switch control and configuration capabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getDomainIDConfigureable <em>Domain ID Configureable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getMinDomainID <em>Min Domain ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getMaxDomainID <em>Max Domain ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getDomainIDLockedSupported <em>Domain ID Locked Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getPrincipalPrioritiesSupported <em>Principal Priorities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getNPIVSupported <em>NPIV Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::FC' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCSwitchCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Domain ID Configureable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates whether the DomainID setting can be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain ID Configureable</em>' attribute.
	 * @see #setDomainIDConfigureable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchCapabilities_DomainIDConfigureable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_UNIT_CONFIG_CAPS_T|EditDomainID\"]' ModelCorrespondence='[\"CIM_FCSwitchSettings.PreferredDomainID\"]'"
	 * @generated
	 */
	Boolean getDomainIDConfigureable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getDomainIDConfigureable <em>Domain ID Configureable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain ID Configureable</em>' attribute.
	 * @see #getDomainIDConfigureable()
	 * @generated
	 */
	void setDomainIDConfigureable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Min Domain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum DomainID value supported by the switch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Domain ID</em>' attribute.
	 * @see #setMinDomainID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchCapabilities_MinDomainID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='1' MaxValue='239' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_UNIT_CONFIG_CAPS_T|MinDomainID\"]' ModelCorrespondence='[\"CIM_FCSwitchSettings.PreferredDomainID\"]'"
	 * @generated
	 */
	Integer getMinDomainID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getMinDomainID <em>Min Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Domain ID</em>' attribute.
	 * @see #getMinDomainID()
	 * @generated
	 */
	void setMinDomainID(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Domain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum DomainID value supported by the switch. This value must be greater than or equal to MinDomainID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Domain ID</em>' attribute.
	 * @see #setMaxDomainID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchCapabilities_MaxDomainID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='1' MaxValue='239' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_UNIT_CONFIG_CAPS_T|MaxDomainID\"]' ModelCorrespondence='[\"CIM_FCSwitchSettings.PreferredDomainID\"]'"
	 * @generated
	 */
	Integer getMaxDomainID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getMaxDomainID <em>Max Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Domain ID</em>' attribute.
	 * @see #getMaxDomainID()
	 * @generated
	 */
	void setMaxDomainID(Integer value);

	/**
	 * Returns the value of the '<em><b>Domain ID Locked Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates whether the DomainIDLocked setting can be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain ID Locked Supported</em>' attribute.
	 * @see #setDomainIDLockedSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchCapabilities_DomainIDLockedSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_UNIT_CONFIG_CAPS_T|EditDomainIDLocked\"]' ModelCorrespondence='[\"CIM_FCSwitchSettings.DomainIDLocked\"]'"
	 * @generated
	 */
	Boolean getDomainIDLockedSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getDomainIDLockedSupported <em>Domain ID Locked Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain ID Locked Supported</em>' attribute.
	 * @see #getDomainIDLockedSupported()
	 * @generated
	 */
	void setDomainIDLockedSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Principal Priorities Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array contains the principal priority settings that are supported by the switch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal Priorities Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchCapabilities_PrincipalPrioritiesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"Principal\",\"Subordinate\",\"Any\",\"Not Applicable\"]' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_UNIT_CONFIG_CAPS_T|SupportedSwitchPriorities\"]' ModelCorrespondence='[\"CIM_FCSwitchSettings.PrincipalPriority\"]'"
	 * @generated
	 */
	EList<Integer> getPrincipalPrioritiesSupported();

	/**
	 * Returns the value of the '<em><b>NPIV Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag indicating whether NPIV is supported on the fibre channel switch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NPIV Supported</em>' attribute.
	 * @see #setNPIVSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchCapabilities_NPIVSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getNPIVSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCSwitchCapabilities#getNPIVSupported <em>NPIV Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NPIV Supported</em>' attribute.
	 * @see #getNPIVSupported()
	 * @generated
	 */
	void setNPIVSupported(Boolean value);

} // CIM_FCSwitchCapabilities
