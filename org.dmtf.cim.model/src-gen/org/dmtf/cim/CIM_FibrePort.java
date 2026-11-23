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
 * A representation of the model object '<em><b>CIM Fibre Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the FibrePort class is deprecated because FibreChannel Adapter has been deprecated in lieu of FCPort and this class overlaps with FCPort. The new FCPort class should be used in lieu of both FibreChannelAdapter and FibrePort. 
 * Deprecated description: FibrePort describes the capabilities and management aspects of a Fibre Channel Port Device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getAddressIdentifier <em>Address Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getSupportedPortTypes <em>Supported Port Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getPortTypeVersions <em>Port Type Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getEnabledPortTypes <em>Enabled Port Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getEnabledVersions <em>Enabled Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getCurrentPortType <em>Current Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getCurrentVersion <em>Current Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getAliasAddresses <em>Alias Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getLossOfSignalCounter <em>Loss Of Signal Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getLossOfSyncCounter <em>Loss Of Sync Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getCRCErrors <em>CRC Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getInvalidTransmissionWords <em>Invalid Transmission Words</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getFramesTooShort <em>Frames Too Short</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getFramesTooLong <em>Frames Too Long</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getElasticityBufferUnderruns <em>Elasticity Buffer Underruns</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getElasticityBufferOverruns <em>Elasticity Buffer Overruns</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getReceiverTransmitterTimeout <em>Receiver Transmitter Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getBypassedState <em>Bypassed State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePort#getConnectedMedia <em>Connected Media</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_FCPort\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_FibrePort extends CIM_LogicalPort {
	/**
	 * Returns the value of the '<em><b>Address Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: An address value that is used to identify the source (S_ID) or destination (D_ID) of a frame. The FC-SW standard includes a table of special address identifier values and their meanings. Consult the FC-SW documentation for additional information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Identifier</em>' attribute.
	 * @see #setAddressIdentifier(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_AddressIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_FCPort.PermanentAddress\"]'"
	 * @generated
	 */
	Long getAddressIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getAddressIdentifier <em>Address Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Identifier</em>' attribute.
	 * @see #getAddressIdentifier()
	 * @generated
	 */
	void setAddressIdentifier(Long value);

	/**
	 * Returns the value of the '<em><b>Supported Port Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: An array that indicates the modes in which the Port can operate. PortType values describe the role and behavior of the Fibre Channel entity: "N" = Node Port, "NL" = Node Port supporting FC arbitrated loop, "E" = Expansion Port connecting fabric elements (for example, FC switches), "F"=Fabric (element) Port, "FL"=Fabric (element) Port supporting FC arbitrated loop, and "B"=Bridge Port. PortTypes are defined in the ANSI X3 standards. 
	 * 
	 * A particular mode can be listed multiple times in the SupportedPortTypes array in order to define that multiple, unique version levels are supported. Version information is defined in the PortTypeVersions property. Note, each entry of the SupportedPortTypes array is related to the entry in PortTypeVersions that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Port Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_SupportedPortTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"N\",\"NL-Private\",\"NL-Public\",\"E\",\"F\",\"FL\",\"B\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FibrePort.PortTypeVersions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedPortTypes();

	/**
	 * Returns the value of the '<em><b>Port Type Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Version information for each of the SupportedPortTypes. A particular PortType (mode) can be listed multiple times in the SupportedPortTypes array in order to define multiple, unique version levels. Note, each entry of this array is related to the entry in SupportedPortTypes that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Type Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_PortTypeVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FibrePort.SupportedPortTypes\"]'"
	 * @generated
	 */
	EList<String> getPortTypeVersions();

	/**
	 * Returns the value of the '<em><b>Enabled Port Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The specific modes currently enabled for the Port. The values are equal to, or a subset of the values in the Supported PortTypes array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Port Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_EnabledPortTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"N\",\"NL-Private\",\"NL-Public\",\"E\",\"F\",\"FL\",\"B\"]' ModelCorrespondence='[\"CIM_FibrePort.SupportedPortTypes\",\"CIM_FibrePort.EnabledVersions\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledPortTypes();

	/**
	 * Returns the value of the '<em><b>Enabled Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Version information for each of the EnabledPortTypes. A particular PortType (mode) might be listed multiple times in the EnabledPortTypes array in order to define multiple, unique version levels. Note, each entry of this array is related to the entry in EnabledPortTypes that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_EnabledVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FibrePort.EnabledPortTypes\"]'"
	 * @generated
	 */
	EList<String> getEnabledVersions();

	/**
	 * Returns the value of the '<em><b>Current Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The specific mode in which the Port is currently running. The value is one of the entries in the EnabledPortTypes array. The current port type or mode is dependent on the fibre technology. For example, in a public loop network, you might indicate a port type of "FL" (value=6) or "NL" (value=2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Port Type</em>' attribute.
	 * @see #setCurrentPortType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_CurrentPortType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_FCPort.PortType\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"N\",\"NL-Private\",\"NL-Public\",\"E\",\"F\",\"FL\",\"B\"]' ModelCorrespondence='[\"CIM_FibrePort.EnabledPortTypes\",\"CIM_FibrePort.CurrentVersion\"]'"
	 * @generated
	 */
	Integer getCurrentPortType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getCurrentPortType <em>Current Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Port Type</em>' attribute.
	 * @see #getCurrentPortType()
	 * @generated
	 */
	void setCurrentPortType(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Version information for the CurrentPortType that is active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Version</em>' attribute.
	 * @see #setCurrentVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_CurrentVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' ModelCorrespondence='[\"CIM_FibrePort.CurrentPortType\"]'"
	 * @generated
	 */
	String getCurrentVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getCurrentVersion <em>Current Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Version</em>' attribute.
	 * @see #getCurrentVersion()
	 * @generated
	 */
	void setCurrentVersion(String value);

	/**
	 * Returns the value of the '<em><b>Alias Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: One or more address identifiers that can be recognized by the Port, in addition to its port-specific identifier. Multicast or hunt group addresses that are recognized by the Port would be identified in this array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_AliasAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Deprecated='[\"CIM_FCPort.NetworkAddresses\"]'"
	 * @generated
	 */
	EList<Long> getAliasAddresses();

	/**
	 * Returns the value of the '<em><b>Loss Of Signal Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of times that the signal has been lost on the Port since the last reset of the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loss Of Signal Counter</em>' attribute.
	 * @see #setLossOfSignalCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_LossOfSignalCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.LossOfSignalCounter\"]' Counter='true'"
	 * @generated
	 */
	Long getLossOfSignalCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getLossOfSignalCounter <em>Loss Of Signal Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Of Signal Counter</em>' attribute.
	 * @see #getLossOfSignalCounter()
	 * @generated
	 */
	void setLossOfSignalCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Loss Of Sync Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of times that synchronization has been lost on the Port since the last reset of the Device. Synchronization is assumed lost after a timeout period that is identified by the Receiver TransmitterTimeout property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loss Of Sync Counter</em>' attribute.
	 * @see #setLossOfSyncCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_LossOfSyncCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.LossOfSyncCounter\"]' Counter='true'"
	 * @generated
	 */
	Long getLossOfSyncCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getLossOfSyncCounter <em>Loss Of Sync Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Of Sync Counter</em>' attribute.
	 * @see #getLossOfSyncCounter()
	 * @generated
	 */
	void setLossOfSyncCounter(Long value);

	/**
	 * Returns the value of the '<em><b>CRC Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of times that the CRC in a frame does not match the CRC computed by the receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRC Errors</em>' attribute.
	 * @see #setCRCErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_CRCErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.CRCErrors\"]' Counter='true'"
	 * @generated
	 */
	Long getCRCErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getCRCErrors <em>CRC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRC Errors</em>' attribute.
	 * @see #getCRCErrors()
	 * @generated
	 */
	void setCRCErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Invalid Transmission Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of transmission words that had an 8b10b code violation in one or more of its characters, had a K28.5 in its second, third, or fourth character positions, or was an ordered set that had an incorrect Beginning Running Disparity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invalid Transmission Words</em>' attribute.
	 * @see #setInvalidTransmissionWords(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_InvalidTransmissionWords()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.InvalidTransmissionWords\"]' Counter='true'"
	 * @generated
	 */
	Long getInvalidTransmissionWords();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getInvalidTransmissionWords <em>Invalid Transmission Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Transmission Words</em>' attribute.
	 * @see #getInvalidTransmissionWords()
	 * @generated
	 */
	void setInvalidTransmissionWords(Long value);

	/**
	 * Returns the value of the '<em><b>Frames Too Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of frames that were received that were shorter than 28 octets. The value of 28 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes. The count does not include SOF/EOF bytes that are not data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames Too Short</em>' attribute.
	 * @see #setFramesTooShort(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_FramesTooShort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.FramesTooShort\"]' Counter='true'"
	 * @generated
	 */
	Long getFramesTooShort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getFramesTooShort <em>Frames Too Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames Too Short</em>' attribute.
	 * @see #getFramesTooShort()
	 * @generated
	 */
	void setFramesTooShort(Long value);

	/**
	 * Returns the value of the '<em><b>Frames Too Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of frames that were received that were longer than 2140 octets. The value of 2140 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes and 2112 bytes of payload.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames Too Long</em>' attribute.
	 * @see #setFramesTooLong(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_FramesTooLong()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.FramesTooLong\"]' Counter='true'"
	 * @generated
	 */
	Long getFramesTooLong();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getFramesTooLong <em>Frames Too Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames Too Long</em>' attribute.
	 * @see #getFramesTooLong()
	 * @generated
	 */
	void setFramesTooLong(Long value);

	/**
	 * Returns the value of the '<em><b>Elasticity Buffer Underruns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that a fill word could not be inserted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and might indicate a configuration error or that a device is out of spec.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elasticity Buffer Underruns</em>' attribute.
	 * @see #setElasticityBufferUnderruns(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_ElasticityBufferUnderruns()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getElasticityBufferUnderruns();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getElasticityBufferUnderruns <em>Elasticity Buffer Underruns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elasticity Buffer Underruns</em>' attribute.
	 * @see #getElasticityBufferUnderruns()
	 * @generated
	 */
	void setElasticityBufferUnderruns(Long value);

	/**
	 * Returns the value of the '<em><b>Elasticity Buffer Overruns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that a fill word could not be deleted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and might indicate a configuration error or a device out of spec.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elasticity Buffer Overruns</em>' attribute.
	 * @see #setElasticityBufferOverruns(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_ElasticityBufferOverruns()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getElasticityBufferOverruns();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getElasticityBufferOverruns <em>Elasticity Buffer Overruns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elasticity Buffer Overruns</em>' attribute.
	 * @see #getElasticityBufferOverruns()
	 * @generated
	 */
	void setElasticityBufferOverruns(Long value);

	/**
	 * Returns the value of the '<em><b>Receiver Transmitter Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Timeout value in milliseconds that is used to determine when loss of synchronization has occurred. The typical default is 100 msec.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Transmitter Timeout</em>' attribute.
	 * @see #setReceiverTransmitterTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_ReceiverTransmitterTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Units='Milliseconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getReceiverTransmitterTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getReceiverTransmitterTimeout <em>Receiver Transmitter Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Transmitter Timeout</em>' attribute.
	 * @see #getReceiverTransmitterTimeout()
	 * @generated
	 */
	void setReceiverTransmitterTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Bypassed State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Indication of whether the Port is currently bypassed (value=2) or not (value=1). A value of 3 ("Forced Insert") describes that the Port is forced active, when it would otherwise be "Bypassed".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bypassed State</em>' attribute.
	 * @see #setBypassedState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_BypassedState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Not Bypassed\",\"Bypassed\",\"Forced Insert\"]'"
	 * @generated
	 */
	Integer getBypassedState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getBypassedState <em>Bypassed State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bypassed State</em>' attribute.
	 * @see #getBypassedState()
	 * @generated
	 */
	void setBypassedState(Integer value);

	/**
	 * Returns the value of the '<em><b>Connected Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The type of cabling as sensed by the Port. Not all Fibre Ports are capable of providing this information. In this case, a value of 0, "Unknown", will be returned. Also, when single or multi-mode fiber cabling cannot be distinguished, the more general value 4, "Fiber-optic" can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Media</em>' attribute.
	 * @see #setConnectedMedia(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePort_ConnectedMedia()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"No Media\",\"Copper/Twinaxial\",\"Fiber-optic\",\"Fiber Single Mode\",\"Fiber Multimode\"]'"
	 * @generated
	 */
	Integer getConnectedMedia();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePort#getConnectedMedia <em>Connected Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Media</em>' attribute.
	 * @see #getConnectedMedia()
	 * @generated
	 */
	void setConnectedMedia(Integer value);

} // CIM_FibrePort
