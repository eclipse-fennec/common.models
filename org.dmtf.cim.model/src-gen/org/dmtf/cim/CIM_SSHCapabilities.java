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
 * A representation of the model object '<em><b>CIM SSH Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of ProtocolServiceCapabilities that defines the capabilities of an SSH Service. An instance of CIM_SSHCapabilities is associated with an instance of CIM_ProtocolService via the CIM_ElementCapabilities association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SSHCapabilities#getSupportedSSHVersions <em>Supported SSH Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHCapabilities#getOtherSupportedSSHVersion <em>Other Supported SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHCapabilities#getSupportedEncryptionAlgorithms <em>Supported Encryption Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHCapabilities#getOtherSupportedEncryptionAlgorithm <em>Other Supported Encryption Algorithm</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SSHCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::ConsoleProtocols' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SSHCapabilities extends CIM_ProtocolServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>Supported SSH Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the version or versions of SSH protocol that the SSH service supports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported SSH Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHCapabilities_SupportedSSHVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"SSHv1\",\"SSHv2\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SSHCapabilities.OtherSupportedSSHVersion\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSSHVersions();

	/**
	 * Returns the value of the '<em><b>Other Supported SSH Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the SupportedSSHVersions property is set to 1, "Other" then free form string providing more information about supported SSH protocols. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported SSH Version</em>' attribute.
	 * @see #setOtherSupportedSSHVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHCapabilities_OtherSupportedSSHVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SSHCapabilities.SupportedSSHVersions\"]'"
	 * @generated
	 */
	String getOtherSupportedSSHVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHCapabilities#getOtherSupportedSSHVersion <em>Other Supported SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Supported SSH Version</em>' attribute.
	 * @see #getOtherSupportedSSHVersion()
	 * @generated
	 */
	void setOtherSupportedSSHVersion(String value);

	/**
	 * Returns the value of the '<em><b>Supported Encryption Algorithms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the encryption algorithms that the SSH service supports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Encryption Algorithms</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHCapabilities_SupportedEncryptionAlgorithms()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"DES\",\"DES3\",\"RC4\",\"IDEA\",\"SKIPJACK\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SSHCapabilities.OtherSupportedEncryptionAlgorithm\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedEncryptionAlgorithms();

	/**
	 * Returns the value of the '<em><b>Other Supported Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the SupportedEncryptionAlgorithms property is set to 1, "Other" then free form string providing more information about supported algorithms. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Encryption Algorithm</em>' attribute.
	 * @see #setOtherSupportedEncryptionAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHCapabilities_OtherSupportedEncryptionAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SSHCapabilities.SupportedEncryptionAlgorithms\"]'"
	 * @generated
	 */
	String getOtherSupportedEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHCapabilities#getOtherSupportedEncryptionAlgorithm <em>Other Supported Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Supported Encryption Algorithm</em>' attribute.
	 * @see #getOtherSupportedEncryptionAlgorithm()
	 * @generated
	 */
	void setOtherSupportedEncryptionAlgorithm(String value);

} // CIM_SSHCapabilities
