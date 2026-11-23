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
 * A representation of the model object '<em><b>CIM BIOS Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BIOSServiceCapabilities advertises to a client the methods that are supported by CIM_BIOSService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BIOSServiceCapabilities#getMethodsSupported <em>Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSServiceCapabilities#getSupportedPasswordAlgorithms <em>Supported Password Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSServiceCapabilities#getSupportedPasswordEncodings <em>Supported Password Encodings</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property advertises the methods that are supported by the service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSServiceCapabilities_MethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"65536..4294967295\"]' Values='[\"SetBIOSAttribute\",\"RestoreBIOSDefaults\",\"SetBIOSAttributeEmbeddedInstance\",\"ReadRawBIOSData\",\"WriteRawBIOSData\",\"SetBIOSAttributes\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Long> getMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Supported Password Algorithms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transformation algorithm, if any, used to protect passwords before use in the protocol. For instance, Kerberos doesn&apos;t store passwords as the shared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Password Algorithms</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSServiceCapabilities_SupportedPasswordAlgorithms()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_SharedSecret.Algorithm\"]'"
	 * @generated
	 */
	EList<String> getSupportedPasswordAlgorithms();

	/**
	 * Returns the value of the '<em><b>Supported Password Encodings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies encoding the BIOS supports for denoting password parameter strings. Encoding defines the format that a password string is being passed into the BIOS or set with. "kbd" denotes a string in hexadecimal format containing keyboard scan code input. An example of a password structured in this format would be "321539191E1F1F11181320", which is the representation of "my password" in US English keyboard scan codes. "ascii" denotes clear text that shall comply with the ASCII character set. Character encodings from " " (decimal 32) to "~" (decimal 126) are supported. An example would be "my password". "pin" denotes that only numeric input in ASCII text is allowed for the password instance. An example would be "1234".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Password Encodings</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSServiceCapabilities_SupportedPasswordEncodings()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"65536..4294967295\"]' Values='[\"ascii\",\"kbd\",\"pin\",\"UTF16\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_BIOSPassword.PasswordEncoding\"]'"
	 * @generated
	 */
	EList<Long> getSupportedPasswordEncodings();

} // CIM_BIOSServiceCapabilities
