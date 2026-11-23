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
 * A representation of the model object '<em><b>CIM FCHBA Diagnostic Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being used in the FC HBA Diagnostics Profile to pass in optional parameters when running certain tests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getEchoMechanism <em>Echo Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getOtherEchoMechanism <em>Other Echo Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getTargetDeviceFormat <em>Target Device Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getTargetDevice <em>Target Device</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getLUN <em>LUN</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getBufferSizes <em>Buffer Sizes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getBufferPattern <em>Buffer Pattern</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getPingMechanism <em>Ping Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getOtherPingMechanism <em>Other Ping Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getOtherTargetDeviceFormat <em>Other Target Device Format</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::Diagnostics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCHBADiagnosticSettingData extends CIM_DiagnosticSettingData {
	/**
	 * Returns the value of the '<em><b>Echo Mechanism</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used by a client for the Echo test to specify one of the following Echo test types. FC Echo can be used to implement the Echo test against many FC devices. CT Pass Through allows SCSI read/write buffer commands to be used to implement Echo against SCSI or SAS devices attached to the SAN. FC Trace Route requires support for HBA_SendCTPassThruV2 while FC Test requires support for SMHBA_SendTEST. Both require HBAAPI library and SM-HBA suppoort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Echo Mechanism</em>' attribute.
	 * @see #setEchoMechanism(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_EchoMechanism()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"FC Echo\",\"SCSI read/write buffer\",\"FC Trace Route\",\"FC Test\"]' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.OtherEchoMechanism\",\"CIM_FCHBADiagnosticSettingData.LUN\"]'"
	 * @generated
	 */
	Long getEchoMechanism();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getEchoMechanism <em>Echo Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echo Mechanism</em>' attribute.
	 * @see #getEchoMechanism()
	 * @generated
	 */
	void setEchoMechanism(Long value);

	/**
	 * Returns the value of the '<em><b>Other Echo Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If EchoMechanism has a value of 1 (Other), this property is Mandatory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Echo Mechanism</em>' attribute.
	 * @see #setOtherEchoMechanism(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_OtherEchoMechanism()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.EchoMechanism\"]'"
	 * @generated
	 */
	String getOtherEchoMechanism();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getOtherEchoMechanism <em>Other Echo Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Echo Mechanism</em>' attribute.
	 * @see #getOtherEchoMechanism()
	 * @generated
	 */
	void setOtherEchoMechanism(String value);

	/**
	 * Returns the value of the '<em><b>Target Device Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the format of the TargetDevice value which is a string formatted as ASCII characters representing hexadecimal digits. The only characters to be used shall be 0 - 9 and A - F. Leading zeros are permitted. WWPNs shall contain 16 characters. FC port addresses shall contain 6 characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Device Format</em>' attribute.
	 * @see #setTargetDeviceFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_TargetDeviceFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"WWPN\",\"FC Port\"]' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.TargetDevice\",\"CIM_FCHBADiagnosticSettingData.OtherTargetDeviceFormat\"]'"
	 * @generated
	 */
	String getTargetDeviceFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getTargetDeviceFormat <em>Target Device Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Device Format</em>' attribute.
	 * @see #getTargetDeviceFormat()
	 * @generated
	 */
	void setTargetDeviceFormat(String value);

	/**
	 * Returns the value of the '<em><b>Target Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the target device Address. The format of this property is based on the value of the TargetDeviceFormat property. The string is formatted as ASCII characters representing hexadecimal digits. The only characters to be used shall be 0 - 9 and A - F. Leading zeros are permitted. WWPNs shall contain 16 characters. FC port addresses shall contain 6 characters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Device</em>' attribute.
	 * @see #setTargetDevice(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_TargetDevice()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.TargetDeviceFormat\",\"CIM_FCHBADiagnosticSettingData.OtherTargetDeviceFormat\"]'"
	 * @generated
	 */
	String getTargetDevice();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getTargetDevice <em>Target Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Device</em>' attribute.
	 * @see #getTargetDevice()
	 * @generated
	 */
	void setTargetDevice(String value);

	/**
	 * Returns the value of the '<em><b>LUN</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is mandatory when the EchoMechanism property has the value of 3 (SCSI read/write buffer). This property is used by the client to specify which LUN they are targeting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LUN</em>' attribute.
	 * @see #setLUN(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_LUN()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.EchoMechanism\"]'"
	 * @generated
	 */
	Long getLUN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getLUN <em>LUN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LUN</em>' attribute.
	 * @see #getLUN()
	 * @generated
	 */
	void setLUN(Long value);

	/**
	 * Returns the value of the '<em><b>Buffer Sizes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array property is used by a client for some FC HBA tests to specify the data buffer sizes to be used during the test. The vendor-defined default value is advertised using the default instance of CIM_FCHBADiagnosticSettingData. If no value is specified by the client, then the vendor-defined default value will be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Sizes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_BufferSizes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ModelCorrespondence='[\"CIM_FCHBADiagnosticServiceCapabilities.BufferSizesSupported\"]'"
	 * @generated
	 */
	EList<Long> getBufferSizes();

	/**
	 * Returns the value of the '<em><b>Buffer Pattern</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This octet array property is used by a client for several FC HBA tests to specify the data pattern to be used by the test. If the buffer pattern is smaller than BufferSize, then the pattern will be repeated as necessary to fill the buffer. If the buffer pattern is larger than BufferSize, then the pattern will be truncated. The vendor-defined default value is advertised using the default instance of CIM_FCHBADiagnosticSettingData. If no value is specified by the client, then the vendor-defined default pattern will be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Pattern</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_BufferPattern()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ModelCorrespondence='[\"CIM_FCHBADiagnosticServiceCapabilities.MaxPatternSizeSupported\"]'"
	 * @generated
	 */
	EList<Integer> getBufferPattern();

	/**
	 * Returns the value of the '<em><b>Ping Mechanism</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used by a client for the Ping test. The mechanism used depends upon the capabilities of the device being tested. Clients may not know which mechanism is appropriate for a particular device. Therefore, providers shall have a mode where every mechanism is tried in succession until one is successful or all have been tried.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ping Mechanism</em>' attribute.
	 * @see #setPingMechanism(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_PingMechanism()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Use All\",\"FC Echo\",\"SCSI Inquiry\"]' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.OtherPingMechanism\"]'"
	 * @generated
	 */
	Integer getPingMechanism();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getPingMechanism <em>Ping Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ping Mechanism</em>' attribute.
	 * @see #getPingMechanism()
	 * @generated
	 */
	void setPingMechanism(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Ping Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If PingMechanism has a value of 1 (Other), this property is Mandatory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Ping Mechanism</em>' attribute.
	 * @see #setOtherPingMechanism(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_OtherPingMechanism()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.PingMechanism\"]'"
	 * @generated
	 */
	String getOtherPingMechanism();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getOtherPingMechanism <em>Other Ping Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Ping Mechanism</em>' attribute.
	 * @see #getOtherPingMechanism()
	 * @generated
	 */
	void setOtherPingMechanism(String value);

	/**
	 * Returns the value of the '<em><b>Other Target Device Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If TargetDeviceFormat has a value of 1 (Other), this property is Mandatory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Target Device Format</em>' attribute.
	 * @see #setOtherTargetDeviceFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticSettingData_OtherTargetDeviceFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.TargetDeviceFormat\",\"CIM_FCHBADiagnosticSettingData.TargetDevice\"]'"
	 * @generated
	 */
	String getOtherTargetDeviceFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticSettingData#getOtherTargetDeviceFormat <em>Other Target Device Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Target Device Format</em>' attribute.
	 * @see #getOtherTargetDeviceFormat()
	 * @generated
	 */
	void setOtherTargetDeviceFormat(String value);

} // CIM_FCHBADiagnosticSettingData
