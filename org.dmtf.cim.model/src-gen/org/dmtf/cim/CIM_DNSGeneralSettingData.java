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
 * A representation of the model object '<em><b>CIM DNS General Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DNSGeneralSettingData class represents the system wide configuration options for the DNS client. Therefore, these configuration parameters are scoped to a computer system and are applicable to all of the network interfaces of the scoping system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DNSGeneralSettingData#getAppendPrimarySuffixes <em>Append Primary Suffixes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSGeneralSettingData#getAppendParentSuffixes <em>Append Parent Suffixes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSGeneralSettingData#getDNSSuffixesToAppend <em>DNS Suffixes To Append</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DNSGeneralSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.14.0' UMLPackagePath='CIM::Network::DNS' override.AddressOrigin='uint16' override.AddressOrigin.Description='AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint. This is independent of the DNS configuration, thus this property has the value of 2 (\"Not Applicable\")' override.AddressOrigin.ValueMap='[\"0..1\",\"2\",\"3..32767\",\"32768..\"]' override.AddressOrigin.Values='[\"DMTF Reserved\",\"Not Applicable\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DNSGeneralSettingData extends CIM_IPAssignmentSettingData {
	/**
	 * Returns the value of the '<em><b>Append Primary Suffixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the client should automatically append the primary domain suffix to target names prior to attempting to resolve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Append Primary Suffixes</em>' attribute.
	 * @see #setAppendPrimarySuffixes(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSGeneralSettingData_AppendPrimarySuffixes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' ModelCorrespondence='[\"CIM_DNSProtocolEndpoint.AppendPrimarySuffixes\"]'"
	 * @generated
	 */
	Boolean getAppendPrimarySuffixes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSGeneralSettingData#getAppendPrimarySuffixes <em>Append Primary Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append Primary Suffixes</em>' attribute.
	 * @see #getAppendPrimarySuffixes()
	 * @generated
	 */
	void setAppendPrimarySuffixes(Boolean value);

	/**
	 * Returns the value of the '<em><b>Append Parent Suffixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the client should automatically append the parent domain suffix to target names prior to attempting to resolve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Append Parent Suffixes</em>' attribute.
	 * @see #setAppendParentSuffixes(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSGeneralSettingData_AppendParentSuffixes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' ModelCorrespondence='[\"CIM_DNSProtocolEndpoint.AppendParentSuffixes\"]'"
	 * @generated
	 */
	Boolean getAppendParentSuffixes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSGeneralSettingData#getAppendParentSuffixes <em>Append Parent Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append Parent Suffixes</em>' attribute.
	 * @see #getAppendParentSuffixes()
	 * @generated
	 */
	void setAppendParentSuffixes(Boolean value);

	/**
	 * Returns the value of the '<em><b>DNS Suffixes To Append</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DNS suffixes to append when attempting to resolve a hostname.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DNS Suffixes To Append</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSGeneralSettingData_DNSSuffixesToAppend()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ModelCorrespondence='[\"CIM_DNSProtocolEndpoint.DNSSuffixesToAppend\"]'"
	 * @generated
	 */
	EList<String> getDNSSuffixesToAppend();

} // CIM_DNSGeneralSettingData
