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
 * A representation of the model object '<em><b>CIM Connectivity Membership Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ConnectivityMembershipSettingData provides the identification criteria for possible members of a ConnectivityCollection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ConnectivityMembershipSettingData#getConnectivityMemberType <em>Connectivity Member Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConnectivityMembershipSettingData#getOtherConnectivityMemberType <em>Other Connectivity Member Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConnectivityMembershipSettingData#getConnectivityMemberID <em>Connectivity Member ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConnectivityMembershipSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::Collections' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ConnectivityMembershipSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Connectivity Member Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConnectivityMemberType specifies the type of identification used in the ConnectivityMemberID field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectivity Member Type</em>' attribute.
	 * @see #setConnectivityMemberType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConnectivityMembershipSettingData_ConnectivityMemberType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Permanent Address\",\"Network Address\",\"Switch Port ID\",\"Logical Port Group\",\"Connectivity Collection\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ConnectivityMembershipSettingData.ConnectivityMemberID\",\"CIM_ConnectivityMembershipSettingData.OtherConnectivityMemberType\"]'"
	 * @generated
	 */
	Integer getConnectivityMemberType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConnectivityMembershipSettingData#getConnectivityMemberType <em>Connectivity Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Member Type</em>' attribute.
	 * @see #getConnectivityMemberType()
	 * @generated
	 */
	void setConnectivityMemberType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Connectivity Member Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the type of identification used in the ConnectivityMemberID field, when ConnectivityMemberType is 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Connectivity Member Type</em>' attribute.
	 * @see #setOtherConnectivityMemberType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConnectivityMembershipSettingData_OtherConnectivityMemberType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ConnectivityMembershipSettingData.ConnectivityMemberType\"]'"
	 * @generated
	 */
	String getOtherConnectivityMemberType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConnectivityMembershipSettingData#getOtherConnectivityMemberType <em>Other Connectivity Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Connectivity Member Type</em>' attribute.
	 * @see #getOtherConnectivityMemberType()
	 * @generated
	 */
	void setOtherConnectivityMemberType(String value);

	/**
	 * Returns the value of the '<em><b>Connectivity Member ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identification of the member, based on the type specified by ConnectivityMemberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectivity Member ID</em>' attribute.
	 * @see #setConnectivityMemberID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConnectivityMembershipSettingData_ConnectivityMemberID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_ConnectivityMembershipSettingData.ConnectivityMemberType\"]'"
	 * @generated
	 */
	String getConnectivityMemberID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConnectivityMembershipSettingData#getConnectivityMemberID <em>Connectivity Member ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Member ID</em>' attribute.
	 * @see #getConnectivityMemberID()
	 * @generated
	 */
	void setConnectivityMemberID(String value);

} // CIM_ConnectivityMembershipSettingData
