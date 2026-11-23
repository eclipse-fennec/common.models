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
 * A representation of the model object '<em><b>CIM FC Switch Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ComputerSystem that supports FC Switch capabilities and can be configured using the FCSwitchConfig class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCSwitchSettings#getPreferredDomainID <em>Preferred Domain ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCSwitchSettings#getDomainIDLocked <em>Domain ID Locked</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCSwitchSettings#getPrincipalPriority <em>Principal Priority</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.11.0' UMLPackagePath='CIM::Device::FC' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCSwitchSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Preferred Domain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred domainID for the switch. If DomainIDLocked is true, then this property will be the required DomainID for the switch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Domain ID</em>' attribute.
	 * @see #setPreferredDomainID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchSettings_PreferredDomainID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' MinValue='1' MaxValue='239' MappingStrings='[\"FC-SWAPI.INCITS-T11|UcUnitConfigGetDomainID\",\"GC-GS.INCITS-T11|InterconnectElement|DomainIdentifier\"]' ModelCorrespondence='[\"CIM_FCSwitchSettings.DomainIDLocked\"]'"
	 * @generated
	 */
	Integer getPreferredDomainID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCSwitchSettings#getPreferredDomainID <em>Preferred Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Domain ID</em>' attribute.
	 * @see #getPreferredDomainID()
	 * @generated
	 */
	void setPreferredDomainID(Integer value);

	/**
	 * Returns the value of the '<em><b>Domain ID Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates if the switch can negotiate a new domainID when the configured domainID is unavailable. If this value is true, a domainID conflict will cause the fabric merge process to fail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain ID Locked</em>' attribute.
	 * @see #setDomainIDLocked(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchSettings_DomainIDLocked()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' MappingStrings='[\"FC-SWAPI.INCITS-T11|UcUnitConfigGetDomainIDLocked\"]' ModelCorrespondence='[\"CIM_FCSwitchSettings.PreferredDomainID\"]'"
	 * @generated
	 */
	Boolean getDomainIDLocked();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCSwitchSettings#getDomainIDLocked <em>Domain ID Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain ID Locked</em>' attribute.
	 * @see #getDomainIDLocked()
	 * @generated
	 */
	void setDomainIDLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>Principal Priority</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value affects the selection of a principal switch within the fabric. The value indirectly corresponds to the FC-FS switch_priority value used during principal switch selection. 
	 * - Principal: Attempt to become the principal switch in the fabric. 
	 * - Subordinate: Attempt not to become the principal switch in the fabric. 
	 * - Any: No preference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal Priority</em>' attribute.
	 * @see #setPrincipalPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCSwitchSettings_PrincipalPriority()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Principal\",\"Subordinate\",\"Any\"]' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_PRINCIPAL_PRIORITY_T\"]'"
	 * @generated
	 */
	Integer getPrincipalPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCSwitchSettings#getPrincipalPriority <em>Principal Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal Priority</em>' attribute.
	 * @see #getPrincipalPriority()
	 * @generated
	 */
	void setPrincipalPriority(Integer value);

} // CIM_FCSwitchSettings
