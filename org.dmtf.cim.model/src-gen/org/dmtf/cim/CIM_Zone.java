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
 * A representation of the model object '<em><b>CIM Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Zone is a group of Ports, Endpoints, Nodes, Zones, and NamedAddressCollections that are managed collectively by the same domain. The managing domain is indicated by the HostedCollection association. For Fibre Channel, a Zone indicates a set of members that are participating together in the fabric.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Zone#getActive <em>Active</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Zone#getZoneType <em>Zone Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Zone#getOtherZoneTypeDescription <em>Other Zone Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Zone#getZoneSubType <em>Zone Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Zone#getOtherZoneSubTypeDescription <em>Other Zone Sub Type Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Zone()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.46.0' UMLPackagePath='CIM::Device::FC' override.ElementName='string' override.ElementName.Required='true' override.ElementName.Write='true' override.ElementName.Description='A user-friendly name for the Zone that is unique within the AdminDomain.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_Zone extends CIM_ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that this Zone is currently active (that is, under enforcement of a fabric). This property can be used to distinguish between a Zone that is currently active and a snapshot of a Zone (with the same InstanceName) that is for "offline" editing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Zone_Active()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Zone#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Zone Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of zoning to be enforced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone Type</em>' attribute.
	 * @see #setZoneType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Zone_ZoneType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Default\",\"Protocol\",\"Peer User\",\"Peer Target\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_Zone.OtherZoneTypeDescription\"]'"
	 * @generated
	 */
	Integer getZoneType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Zone#getZoneType <em>Zone Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Type</em>' attribute.
	 * @see #getZoneType()
	 * @generated
	 */
	void setZoneType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Zone Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the ZoneType when the ZoneType value is 1 "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Zone Type Description</em>' attribute.
	 * @see #setOtherZoneTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Zone_OtherZoneTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Zone.ZoneType\"]'"
	 * @generated
	 */
	String getOtherZoneTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Zone#getOtherZoneTypeDescription <em>Other Zone Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Zone Type Description</em>' attribute.
	 * @see #getOtherZoneTypeDescription()
	 * @generated
	 */
	void setOtherZoneTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Zone Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific clarification to be used when the ProtocolType has an enumeration that requires it. Specifically, if ProtocolType is "Protocol", then SubType is the Fibre Channel FC4 type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone Sub Type</em>' attribute.
	 * @see #setZoneSubType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Zone_ZoneSubType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"SCSI\",\"VI\",\"IP\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_Zone.OtherZoneSubTypeDescription\"]'"
	 * @generated
	 */
	Integer getZoneSubType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Zone#getZoneSubType <em>Zone Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Sub Type</em>' attribute.
	 * @see #getZoneSubType()
	 * @generated
	 */
	void setZoneSubType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Zone Sub Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the ZoneSubType when the ZoneSubType value is 1 "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Zone Sub Type Description</em>' attribute.
	 * @see #setOtherZoneSubTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Zone_OtherZoneSubTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Zone.ZoneSubType\"]'"
	 * @generated
	 */
	String getOtherZoneSubTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Zone#getOtherZoneSubTypeDescription <em>Other Zone Sub Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Zone Sub Type Description</em>' attribute.
	 * @see #getOtherZoneSubTypeDescription()
	 * @generated
	 */
	void setOtherZoneSubTypeDescription(String value);

} // CIM_Zone
