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
 * A representation of the model object '<em><b>CIM Call Based Modem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CallBasedModem is the superclass for grouping the numerous types of call-based modems. The POTSModem is a type of call- based Modem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getFallbackEnabled <em>Fallback Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getCompressionSupported <em>Compression Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getOtherCompressionDescription <em>Other Compression Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getCompressionInfo <em>Compression Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getOtherCompressionInfoDescription <em>Other Compression Info Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getModulationSupported <em>Modulation Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getOtherModulationDescription <em>Other Modulation Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getModulationScheme <em>Modulation Scheme</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getOtherSchemeDescription <em>Other Scheme Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getErrorControlSupported <em>Error Control Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getOtherErrorControlDescription <em>Other Error Control Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getErrorControlInfo <em>Error Control Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getOtherErrorControlInfoDescription <em>Other Error Control Info Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getTimeOfLastReset <em>Time Of Last Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getCallSpeed <em>Call Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getCallStatus <em>Call Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getCharsSent <em>Chars Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getCharsReceived <em>Chars Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getCharsLost <em>Chars Lost</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getBlocksSent <em>Blocks Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getBlocksResent <em>Blocks Resent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getBlocksReceived <em>Blocks Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getBlockErrors <em>Block Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getCallLength <em>Call Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CallBasedModem#getNumberDialed <em>Number Dialed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.10.0' UMLPackagePath='CIM::Device::Modems' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_CallBasedModem extends CIM_Modem {
	/**
	 * Returns the value of the '<em><b>Fallback Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether online fallback is enabled so that it can be negotiated by the Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fallback Enabled</em>' attribute.
	 * @see #setFallbackEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_FallbackEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getFallbackEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getFallbackEnabled <em>Fallback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fallback Enabled</em>' attribute.
	 * @see #getFallbackEnabled()
	 * @generated
	 */
	void setFallbackEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Compression Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array that enumerates all the compression protocols that are supported by the Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_CompressionSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Unknown\",\"Other\",\"No Compression\",\"MNP 5\",\"V.42bis\",\"MNP 3\",\"MNP 4\",\"V.58\",\"PEP\",\"HST\"]' ModelCorrespondence='[\"CIM_CallBasedModem.OtherCompressionDescription\"]'"
	 * @generated
	 */
	EList<Integer> getCompressionSupported();

	/**
	 * Returns the value of the '<em><b>Other Compression Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the compression type when "Other " (value=1) is defined in the CompressionSupported array. If there are multiple "Other" types, then combine their descriptions into a single string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Compression Description</em>' attribute.
	 * @see #setOtherCompressionDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_OtherCompressionDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_CallBasedModem.CompressionSupported\"]'"
	 * @generated
	 */
	String getOtherCompressionDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getOtherCompressionDescription <em>Other Compression Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Compression Description</em>' attribute.
	 * @see #getOtherCompressionDescription()
	 * @generated
	 */
	void setOtherCompressionDescription(String value);

	/**
	 * Returns the value of the '<em><b>Compression Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the current data compression characteristics of the Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Info</em>' attribute.
	 * @see #setCompressionInfo(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_CompressionInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Unknown\",\"Other\",\"No Compression\",\"MNP 5\",\"V.42bis\",\"MNP 3\",\"MNP 4\",\"V.58\",\"PEP\",\"HST\"]' ModelCorrespondence='[\"CIM_CallBasedModem.CompressionSupported\",\"CIM_CallBasedModem.OtherCompressionInfoDescription\"]'"
	 * @generated
	 */
	Integer getCompressionInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getCompressionInfo <em>Compression Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Info</em>' attribute.
	 * @see #getCompressionInfo()
	 * @generated
	 */
	void setCompressionInfo(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Compression Info Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the current compression type when "Other" (value=1) is specified in the CompressionInfo property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Compression Info Description</em>' attribute.
	 * @see #setOtherCompressionInfoDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_OtherCompressionInfoDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_CallBasedModem.CompressionInfo\"]'"
	 * @generated
	 */
	String getOtherCompressionInfoDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getOtherCompressionInfoDescription <em>Other Compression Info Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Compression Info Description</em>' attribute.
	 * @see #getOtherCompressionInfoDescription()
	 * @generated
	 */
	void setOtherCompressionInfoDescription(String value);

	/**
	 * Returns the value of the '<em><b>Modulation Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array that enumerates all the modulation protocols that are supported by the Modem. The beginning entries in the Values qualifier array are mapped from the CIM_POTSModem ModulationScheme property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modulation Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_ModulationSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\"]' Values='[\"Unknown\",\"Other\",\"Not Supported\",\"Bell 103\",\"Bell 212A\",\"V.22bis\",\"V.32\",\"V.32bis\",\"V.terbo\",\"V.FC\",\"V.34\",\"V.34bis\",\"V.17 (G3 Fax Call)\",\"V.21\",\"V.22\",\"V.23 Constant Carrier (1200/75)\",\"V.23 Switched Carrier (Half Duplex)\",\"V.26bis\",\"V.26ter\",\"V.27ter (G3 Fax Call)\",\"V.29 HD (G3 Fax Call)\",\"V.34 HD (G3 Fax Call)\",\"V.90 Issue 1 (Asymmetric)\",\"V.90 Issue 2 (Symmetric)\",\"V.58\",\"X2\",\"K56FLEX\",\"V.Fast\",\"PEP\",\"HST\"]' ModelCorrespondence='[\"CIM_CallBasedModem.OtherModulationDescription\"]'"
	 * @generated
	 */
	EList<Integer> getModulationSupported();

	/**
	 * Returns the value of the '<em><b>Other Modulation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the current modulation type when "Other" (value=1) is specified in the ModulationSupported property. If there are multiple "Other" types, then combine their descriptions into a single string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Modulation Description</em>' attribute.
	 * @see #setOtherModulationDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_OtherModulationDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_CallBasedModem.ModulationSupported\"]'"
	 * @generated
	 */
	String getOtherModulationDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getOtherModulationDescription <em>Other Modulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Modulation Description</em>' attribute.
	 * @see #getOtherModulationDescription()
	 * @generated
	 */
	void setOtherModulationDescription(String value);

	/**
	 * Returns the value of the '<em><b>Modulation Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the current modulation scheme of the Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modulation Scheme</em>' attribute.
	 * @see #setModulationScheme(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_ModulationScheme()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\"]' Values='[\"Unknown\",\"Other\",\"Not Supported\",\"Bell 103\",\"Bell 212A\",\"V.22bis\",\"V.32\",\"V.32bis\",\"V.terbo\",\"V.FC\",\"V.34\",\"V.34bis\",\"V.17 (G3 Fax Call)\",\"V.21\",\"V.22\",\"V.23 Constant Carrier (1200/75)\",\"V.23 Switched Carrier (Half Duplex)\",\"V.26bis\",\"V.26ter\",\"V.27ter (G3 Fax Call)\",\"V.29 HD (G3 Fax Call)\",\"V.34 HD (G3 Fax Call)\",\"V.90 Issue 1 (Asymmetric)\",\"V.90 Issue 2 (Symmetric)\",\"V.58\",\"X2\",\"K56FLEX\",\"V.Fast\",\"PEP\",\"HST\"]' ModelCorrespondence='[\"CIM_CallBasedModem.ModulationSupported\",\"CIM_CallBasedModem.OtherSchemeDescription\"]'"
	 * @generated
	 */
	Integer getModulationScheme();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getModulationScheme <em>Modulation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Scheme</em>' attribute.
	 * @see #getModulationScheme()
	 * @generated
	 */
	void setModulationScheme(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Scheme Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the current modulation type when "Other" (value=1) is specified in the ModulationScheme property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Scheme Description</em>' attribute.
	 * @see #setOtherSchemeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_OtherSchemeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_CallBasedModem.ModulationScheme\"]'"
	 * @generated
	 */
	String getOtherSchemeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getOtherSchemeDescription <em>Other Scheme Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Scheme Description</em>' attribute.
	 * @see #getOtherSchemeDescription()
	 * @generated
	 */
	void setOtherSchemeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Error Control Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array that enumerates the error control protocols that are supported by the Modem. The beginning entries in the Values qualifier array are mapped from the CIM_POTSModem ErrorControlInfo property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Control Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_ErrorControlSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\"]' Values='[\"Unknown\",\"Other\",\"No Error Correction\",\"MNP 4\",\"LAPM\",\"V.58\",\"ECP Enhanced Cellular Protocol\",\"ETC Enhanced Throughput Cellular\",\"MNP 1\",\"MNP 2\",\"MNP 3\",\"MNP10\",\"PEP\",\"HST\"]' ModelCorrespondence='[\"CIM_CallBasedModem.OtherErrorControlDescription\"]'"
	 * @generated
	 */
	EList<Integer> getErrorControlSupported();

	/**
	 * Returns the value of the '<em><b>Other Error Control Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the error control type when "Other" (value= 1) is specified in the ErrorControlSupported property. If there are multiple "Other" types, then combine their descriptions into a single string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Error Control Description</em>' attribute.
	 * @see #setOtherErrorControlDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_OtherErrorControlDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_CallBasedModem.ErrorControlSupported\"]'"
	 * @generated
	 */
	String getOtherErrorControlDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getOtherErrorControlDescription <em>Other Error Control Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Error Control Description</em>' attribute.
	 * @see #getOtherErrorControlDescription()
	 * @generated
	 */
	void setOtherErrorControlDescription(String value);

	/**
	 * Returns the value of the '<em><b>Error Control Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the current error correction characteristics of the Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Control Info</em>' attribute.
	 * @see #setErrorControlInfo(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_ErrorControlInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\"]' Values='[\"Unknown\",\"Other\",\"No Error Correction\",\"MNP 4\",\"LAPM\",\"V.58\",\"ECP Enhanced Cellular Protocol\",\"ETC Enhanced Throughput Cellular\",\"MNP 1\",\"MNP 2\",\"MNP 3\",\"MNP10\",\"PEP\",\"HST\"]' ModelCorrespondence='[\"CIM_CallBasedModem.ErrorControlSupported\",\"CIM_CallBasedModem.OtherErrorControlInfoDescription\"]'"
	 * @generated
	 */
	Integer getErrorControlInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getErrorControlInfo <em>Error Control Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Control Info</em>' attribute.
	 * @see #getErrorControlInfo()
	 * @generated
	 */
	void setErrorControlInfo(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Error Control Info Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the error control when "Other" (value=1) is defined as the value of the ErrorControlInfo property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Error Control Info Description</em>' attribute.
	 * @see #setOtherErrorControlInfoDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_OtherErrorControlInfoDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_CallBasedModem.ErrorControlInfo\"]'"
	 * @generated
	 */
	String getOtherErrorControlInfoDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getOtherErrorControlInfoDescription <em>Other Error Control Info Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Error Control Info Description</em>' attribute.
	 * @see #getOtherErrorControlInfoDescription()
	 * @generated
	 */
	void setOtherErrorControlInfoDescription(String value);

	/**
	 * Returns the value of the '<em><b>Time Of Last Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of the last reset of the Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last Reset</em>' attribute.
	 * @see #setTimeOfLastReset(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_TimeOfLastReset()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastReset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getTimeOfLastReset <em>Time Of Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last Reset</em>' attribute.
	 * @see #getTimeOfLastReset()
	 * @generated
	 */
	void setTimeOfLastReset(String value);

	/**
	 * Returns the value of the '<em><b>Call Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate at which the receiver and transmitter are or were last cooperating, on a call, before disconnection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Call Speed</em>' attribute.
	 * @see #setCallSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_CallSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getCallSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getCallSpeed <em>Call Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Speed</em>' attribute.
	 * @see #getCallSpeed()
	 * @generated
	 */
	void setCallSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Call Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the Modem. For example, information regarding modem negotiation or whether the modem is connected (values 8 and 9, respectively) can be conveyed in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Call Status</em>' attribute.
	 * @see #setCallStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_CallStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"Unknown\",\"Other\",\"Offline\",\"On Hook\",\"Dialing\",\"Waiting for Answer\",\"Ringing\",\"Modem Detected\",\"Negotiating\",\"Online\",\"Error\"]'"
	 * @generated
	 */
	Integer getCallStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getCallStatus <em>Call Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Status</em>' attribute.
	 * @see #getCallStatus()
	 * @generated
	 */
	void setCallStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Chars Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total number of characters sent by the Device on the last or current call. A call in-progress is indicated by the CallStatus property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chars Sent</em>' attribute.
	 * @see #setCharsSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_CharsSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getCharsSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getCharsSent <em>Chars Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chars Sent</em>' attribute.
	 * @see #getCharsSent()
	 * @generated
	 */
	void setCharsSent(Long value);

	/**
	 * Returns the value of the '<em><b>Chars Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total number of characters received by the Device on the last or current call. A call in-progress is indicated by the CallStatus property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chars Received</em>' attribute.
	 * @see #setCharsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_CharsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getCharsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getCharsReceived <em>Chars Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chars Received</em>' attribute.
	 * @see #getCharsReceived()
	 * @generated
	 */
	void setCharsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Chars Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total number of characters lost by the Device on the last or current call. A call in-progress is indicated by the CallStatus property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chars Lost</em>' attribute.
	 * @see #setCharsLost(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_CharsLost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getCharsLost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getCharsLost <em>Chars Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chars Lost</em>' attribute.
	 * @see #getCharsLost()
	 * @generated
	 */
	void setCharsLost(Long value);

	/**
	 * Returns the value of the '<em><b>Blocks Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total number of blocks sent by the Device on the last or current call. A call in-progress is indicated by the CallStatus property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocks Sent</em>' attribute.
	 * @see #setBlocksSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_BlocksSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getBlocksSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getBlocksSent <em>Blocks Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocks Sent</em>' attribute.
	 * @see #getBlocksSent()
	 * @generated
	 */
	void setBlocksSent(Long value);

	/**
	 * Returns the value of the '<em><b>Blocks Resent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total number of blocks resent by the Device on the last or current call. A call in-progress is indicated by the CallStatus property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocks Resent</em>' attribute.
	 * @see #setBlocksResent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_BlocksResent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getBlocksResent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getBlocksResent <em>Blocks Resent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocks Resent</em>' attribute.
	 * @see #getBlocksResent()
	 * @generated
	 */
	void setBlocksResent(Long value);

	/**
	 * Returns the value of the '<em><b>Blocks Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total number of blocks received by the Device on the last or current call. A call in-progress is indicated by the CallStatus property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocks Received</em>' attribute.
	 * @see #setBlocksReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_BlocksReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getBlocksReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getBlocksReceived <em>Blocks Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocks Received</em>' attribute.
	 * @see #getBlocksReceived()
	 * @generated
	 */
	void setBlocksReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Block Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total number of block errors seen by the Device on the last or current call. A call in-progress is indicated by the CallStatus property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Errors</em>' attribute.
	 * @see #setBlockErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_BlockErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getBlockErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getBlockErrors <em>Block Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Errors</em>' attribute.
	 * @see #getBlockErrors()
	 * @generated
	 */
	void setBlockErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Call Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the last or current call. A call in-progress is indicated by the CallStatus property. The 'interval' format of the datetime data type should be used for the property value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Call Length</em>' attribute.
	 * @see #setCallLength(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_CallLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCallLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getCallLength <em>Call Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Length</em>' attribute.
	 * @see #getCallLength()
	 * @generated
	 */
	void setCallLength(String value);

	/**
	 * Returns the value of the '<em><b>Number Dialed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Last or current number dialed to which the statistics apply, or NULL if the call was incoming.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Dialed</em>' attribute.
	 * @see #setNumberDialed(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CallBasedModem_NumberDialed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getNumberDialed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CallBasedModem#getNumberDialed <em>Number Dialed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Dialed</em>' attribute.
	 * @see #getNumberDialed()
	 * @generated
	 */
	void setNumberDialed(String value);

} // CIM_CallBasedModem
