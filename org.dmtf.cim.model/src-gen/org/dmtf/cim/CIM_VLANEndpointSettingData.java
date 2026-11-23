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
 * A representation of the model object '<em><b>CIM VLAN Endpoint Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The VLAN configuration data for an endpoint. Note that certain properties only apply based on the value in the VLANEndpoint. OperationalEndpointMode property. If it is set to trunking mode then NativeVLAN, PruneEligibleVLANList, DefaultVLAN and TrunkedVLANList are applicable. If it is set to in access mode, then AccessVLAN is applicable. An instance of this class is associated to the endpoint to which it applies using ElementSettingData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpointSettingData#getPruneEligibleVLANList <em>Prune Eligible VLAN List</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpointSettingData#getNativeVLAN <em>Native VLAN</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpointSettingData#getDefaultVLAN <em>Default VLAN</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpointSettingData#getTrunkedVLANList <em>Trunked VLAN List</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANEndpointSettingData#getAccessVLAN <em>Access VLAN</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::Network::VLAN' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VLANEndpointSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Prune Eligible VLAN List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a VLAN Id is part of this array, then the system MAY prune that VLAN on the related trunk endpoint/port. This property is applicable only when the endpoint is operating in trunking mode (determined by examining the OperationalEndpointMode property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prune Eligible VLAN List</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointSettingData_PruneEligibleVLANList()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ModelCorrespondence='[\"CIM_VLANEndpoint.OperationalEndpointMode\"]'"
	 * @generated
	 */
	EList<Integer> getPruneEligibleVLANList();

	/**
	 * Returns the value of the '<em><b>Native VLAN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VLAN Id that is used to tag untagged traffic received on this trunk endpoint/port. This property is applicable only when the endpoint is operating in trunking mode (determined by examining the SwitchEndpointMode property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Native VLAN</em>' attribute.
	 * @see #setNativeVLAN(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointSettingData_NativeVLAN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_VLANEndpoint.OperationalEndpointMode\"]'"
	 * @generated
	 */
	Integer getNativeVLAN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpointSettingData#getNativeVLAN <em>Native VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native VLAN</em>' attribute.
	 * @see #getNativeVLAN()
	 * @generated
	 */
	void setNativeVLAN(Integer value);

	/**
	 * Returns the value of the '<em><b>Default VLAN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default value for the native VLAN on this trunk endpoint/port. This property is applicable only when the endpoint is operating in trunking mode (determined by examining the OperationalEndpointMode property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default VLAN</em>' attribute.
	 * @see #setDefaultVLAN(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointSettingData_DefaultVLAN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_VLANEndpoint.OperationalEndpointMode\"]'"
	 * @generated
	 */
	Integer getDefaultVLAN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpointSettingData#getDefaultVLAN <em>Default VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default VLAN</em>' attribute.
	 * @see #getDefaultVLAN()
	 * @generated
	 */
	void setDefaultVLAN(Integer value);

	/**
	 * Returns the value of the '<em><b>Trunked VLAN List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a VLAN Id is part of this array, then the system MAY trunk the traffic on the related endpoint/port. This property is applicable only when the endpoint is operating in trunking mode (determined by examining the OperationalEndpointMode property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trunked VLAN List</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointSettingData_TrunkedVLANList()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ModelCorrespondence='[\"CIM_VLANEndpoint.OperationalEndpointMode\"]'"
	 * @generated
	 */
	EList<Integer> getTrunkedVLANList();

	/**
	 * Returns the value of the '<em><b>Access VLAN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The access VLAN for the referenced VLANEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access VLAN</em>' attribute.
	 * @see #setAccessVLAN(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANEndpointSettingData_AccessVLAN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_VLANEndpoint.OperationalEndpointMode\"]'"
	 * @generated
	 */
	Integer getAccessVLAN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANEndpointSettingData#getAccessVLAN <em>Access VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access VLAN</em>' attribute.
	 * @see #getAccessVLAN()
	 * @generated
	 */
	void setAccessVLAN(Integer value);

} // CIM_VLANEndpointSettingData
