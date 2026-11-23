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
 * A representation of the model object '<em><b>CIM Wake Up Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WakeUpService allows a UnitaryComputerSystem to be woken up from a low power sleep state. This Service is implemented by a LogicalDevice (e.g. NetworkAdapter or Modem) that is capable of receiving wakeup messages, and notifying the System.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WakeUpService#getWakeUpType <em>Wake Up Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WakeUpService#getOtherWakeUpTypeDescription <em>Other Wake Up Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WakeUpService#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WakeUpService#getFilterData <em>Filter Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WakeUpService#getOtherFilterTypeDescription <em>Other Filter Type Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WakeUpService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::System::Boot' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_WakeUpService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Wake Up Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Type of the WakeUp Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wake Up Type</em>' attribute.
	 * @see #setWakeUpType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WakeUpService_WakeUpType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Wake On LAN - Magic Packet\",\"Wake on LAN - Packet Filtering\",\"Wake On Ring\"]' ModelCorrespondence='[\"CIM_WakeUpService.OtherWakeUpTypeDescription\"]'"
	 * @generated
	 */
	Integer getWakeUpType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WakeUpService#getWakeUpType <em>Wake Up Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wake Up Type</em>' attribute.
	 * @see #getWakeUpType()
	 * @generated
	 */
	void setWakeUpType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Wake Up Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the type of WakeUpService used when WakeUpType is set to "Other" (value=1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Wake Up Type Description</em>' attribute.
	 * @see #setOtherWakeUpTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WakeUpService_OtherWakeUpTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_WakeUpService.WakeUpType\"]'"
	 * @generated
	 */
	String getOtherWakeUpTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WakeUpService#getOtherWakeUpTypeDescription <em>Other Wake Up Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Wake Up Type Description</em>' attribute.
	 * @see #getOtherWakeUpTypeDescription()
	 * @generated
	 */
	void setOtherWakeUpTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The filter type on the packets/messages that trigger the WakeUpService. This field is only used when the WakeUp Type is set to "Wake On LAN - Packet Filtering" (value =3).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Type</em>' attribute.
	 * @see #setFilterType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WakeUpService_FilterType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"ARP Broadcast\",\"Neighbor Discovery Multicast\",\"IP Packet with Directed MAC Address\",\"IPX Diagnostic Responder\",\"NBT Name Query\",\"Binary Match\"]' ModelCorrespondence='[\"CIM_WakeUpService.OtherFilterTypeDescription\"]'"
	 * @generated
	 */
	Integer getFilterType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WakeUpService#getFilterType <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Type</em>' attribute.
	 * @see #getFilterType()
	 * @generated
	 */
	void setFilterType(Integer value);

	/**
	 * Returns the value of the '<em><b>Filter Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The binary data that is used to compare the contents of the received packet. This is used when the FilterType is set to "Binary Match" (value=7). This could also be used when the FilterType is set to "Other" (value=1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Data</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WakeUpService_FilterData()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getFilterData();

	/**
	 * Returns the value of the '<em><b>Other Filter Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the format of the FilterType used by the Service when the FilterType is set to "Other" (value=1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Filter Type Description</em>' attribute.
	 * @see #setOtherFilterTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WakeUpService_OtherFilterTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_WakeUpService.FilterType\"]'"
	 * @generated
	 */
	String getOtherFilterTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WakeUpService#getOtherFilterTypeDescription <em>Other Filter Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Filter Type Description</em>' attribute.
	 * @see #getOtherFilterTypeDescription()
	 * @generated
	 */
	void setOtherFilterTypeDescription(String value);

} // CIM_WakeUpService
