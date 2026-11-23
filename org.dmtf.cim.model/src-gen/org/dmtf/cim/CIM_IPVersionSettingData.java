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
 * A representation of the model object '<em><b>CIM IP Version Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This SettingData instance represents an IP version. This instance can be associated to one or more CIM_ManagedElements (Eg. CIM_ComputerSystem or CIM_IPNetworkConnection) to respresent the IP version. The properties of the CIM_ElementSettingData can be used show the IPVersions that are configured as default, current or Next boot.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPVersionSettingData#getProtocolIFType <em>Protocol IF Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPVersionSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.32.0' UMLPackagePath='CIM::Network::IP' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IPVersionSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Protocol IF Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the IP version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol IF Type</em>' attribute.
	 * @see #setProtocolIFType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPVersionSettingData_ProtocolIFType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"..\",\"4096\",\"4097\",\"32768..\"]' Values='[\"Unknown\",\"DMTF Reserved\",\"IPv4\",\"IPv6\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ProtocolEndpoint.ProtocolIFType\"]'"
	 * @generated
	 */
	Integer getProtocolIFType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPVersionSettingData#getProtocolIFType <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol IF Type</em>' attribute.
	 * @see #getProtocolIFType()
	 * @generated
	 */
	void setProtocolIFType(Integer value);

} // CIM_IPVersionSettingData
