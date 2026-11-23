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
 * A representation of the model object '<em><b>CIM Zone Membership Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ZoneMembershipSettingData provides the identification criteria for possible Zone and ZoneAlias members.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ZoneMembershipSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::FC' override.ConnectivityMemberType='uint16' override.ConnectivityMemberType.Description='ConnectivityMemberType specifies the type of identification used in the ConnectivityMemberID field. For Fibre Channel, several of the enumerated values require additional explanation: \n* A ConnectivityMemberType equal to 2 (Permanent Address) indicates that an NxPort WWN value should be specified in the related ConnectivityMemberID property. \n* A ConnectivityMemberType of 3 (Network Address) indicates that an NxPort Address ID value should be specified in the related ConnectivityMemberID property. \n* A ConnectivityMemberType of 4 (Switch Port ID) indicates that a Domain or Port Number value should be specified in the related ConnectivityMemberID property. \n* A ConnectivityMemberType of 5 (Logical Port Group) indicates that a Node WWN value should be specified in the related ConnectivityMemberID property.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ZoneMembershipSettingData extends CIM_ConnectivityMembershipSettingData {
} // CIM_ZoneMembershipSettingData
