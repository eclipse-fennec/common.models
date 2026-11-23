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
 * A representation of the model object '<em><b>CIM Zone Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ZoneCapabilities exposes the capabilities for zoning of an AdminDomain.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ZoneCapabilities#getZoneNameMaxLen <em>Zone Name Max Len</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneCapabilities#getZoneNameFormat <em>Zone Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZoneSets <em>Max Num Zone Sets</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZone <em>Max Num Zone</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZoneMembers <em>Max Num Zone Members</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZonesPerZoneSet <em>Max Num Zones Per Zone Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZoneAliases <em>Max Num Zone Aliases</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneCapabilities#getSupportedConnectivityMemberTypes <em>Supported Connectivity Member Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneCapabilities#getOtherSupportedConnectivityMemberTypes <em>Other Supported Connectivity Member Types</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.46.0' UMLPackagePath='CIM::Device::FC' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ZoneCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Zone Name Max Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum length for the Zone Name that the AdminDomain is capable of supporting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone Name Max Len</em>' attribute.
	 * @see #setZoneNameMaxLen(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities_ZoneNameMaxLen()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getZoneNameMaxLen();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneCapabilities#getZoneNameMaxLen <em>Zone Name Max Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Name Max Len</em>' attribute.
	 * @see #getZoneNameMaxLen()
	 * @generated
	 */
	void setZoneNameMaxLen(Long value);

	/**
	 * Returns the value of the '<em><b>Zone Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ZoneNameFormat supported by the AdminDomain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone Name Format</em>' attribute.
	 * @see #setZoneNameFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities_ZoneNameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Numeric\",\"Alpha Numeric\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getZoneNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneCapabilities#getZoneNameFormat <em>Zone Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Name Format</em>' attribute.
	 * @see #getZoneNameFormat()
	 * @generated
	 */
	void setZoneNameFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Num Zone Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of ZoneSets that the AdminDomain is capable of supporting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Num Zone Sets</em>' attribute.
	 * @see #setMaxNumZoneSets(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities_MaxNumZoneSets()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxNumZoneSets();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZoneSets <em>Max Num Zone Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Zone Sets</em>' attribute.
	 * @see #getMaxNumZoneSets()
	 * @generated
	 */
	void setMaxNumZoneSets(Long value);

	/**
	 * Returns the value of the '<em><b>Max Num Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of Zones that the AdminDomain is capable of supporting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Num Zone</em>' attribute.
	 * @see #setMaxNumZone(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities_MaxNumZone()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxNumZone();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZone <em>Max Num Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Zone</em>' attribute.
	 * @see #getMaxNumZone()
	 * @generated
	 */
	void setMaxNumZone(Long value);

	/**
	 * Returns the value of the '<em><b>Max Num Zone Members</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of ZoneMembers that the AdminDomain is capable of supporting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Num Zone Members</em>' attribute.
	 * @see #setMaxNumZoneMembers(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities_MaxNumZoneMembers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxNumZoneMembers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZoneMembers <em>Max Num Zone Members</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Zone Members</em>' attribute.
	 * @see #getMaxNumZoneMembers()
	 * @generated
	 */
	void setMaxNumZoneMembers(Long value);

	/**
	 * Returns the value of the '<em><b>Max Num Zones Per Zone Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of Zones per ZoneSet that the AdminDomain is capable of supporting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Num Zones Per Zone Set</em>' attribute.
	 * @see #setMaxNumZonesPerZoneSet(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities_MaxNumZonesPerZoneSet()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxNumZonesPerZoneSet();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZonesPerZoneSet <em>Max Num Zones Per Zone Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Zones Per Zone Set</em>' attribute.
	 * @see #getMaxNumZonesPerZoneSet()
	 * @generated
	 */
	void setMaxNumZonesPerZoneSet(Long value);

	/**
	 * Returns the value of the '<em><b>Max Num Zone Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of ZoneAliases that the AdminDomain is capable of supporting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Num Zone Aliases</em>' attribute.
	 * @see #setMaxNumZoneAliases(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities_MaxNumZoneAliases()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxNumZoneAliases();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneCapabilities#getMaxNumZoneAliases <em>Max Num Zone Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Zone Aliases</em>' attribute.
	 * @see #getMaxNumZoneAliases()
	 * @generated
	 */
	void setMaxNumZoneAliases(Long value);

	/**
	 * Returns the value of the '<em><b>Supported Connectivity Member Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers that describe the supported Zone Member Types. For example, a vendor supporting only Permanent Address and Network Address as Zone Member Types would need to return an array of 2 elements, with the values 2 & 3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Connectivity Member Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities_SupportedConnectivityMemberTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Permanent Address\",\"Network Address\",\"Switch Port ID\",\"Logical Port Group\",\"Connectivity Collection\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<Integer> getSupportedConnectivityMemberTypes();

	/**
	 * Returns the value of the '<em><b>Other Supported Connectivity Member Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In case one of the array elements for SupportedConnectivityMemberTypes has a value of 1, i.e Other, then this array lists the Other Supported Connectivity Member Types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Connectivity Member Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneCapabilities_OtherSupportedConnectivityMemberTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOtherSupportedConnectivityMemberTypes();

} // CIM_ZoneCapabilities
