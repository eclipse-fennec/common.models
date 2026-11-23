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
 * A representation of the model object '<em><b>CIM SSH Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A representation of a communications endpoint where an SSH server can be accessed using the SSH protocol.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getEnabledSSHVersions <em>Enabled SSH Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getOtherEnabledSSHVersion <em>Other Enabled SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getSSHVersion <em>SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getOtherSSHVersion <em>Other SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getEnabledEncryptionAlgorithms <em>Enabled Encryption Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getOtherEnabledEncryptionAlgorithm <em>Other Enabled Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getOtherEncryptionAlgorithm <em>Other Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getIdleTimeout <em>Idle Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getKeepAlive <em>Keep Alive</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getForwardX11 <em>Forward X11</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getCompression <em>Compression</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::ConsoleProtocols' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SSHProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Enabled SSH Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the version or versions of SSH protocol that are enabled for the SSH service. Its possible for versions to be supported for a service and not currently enabled for use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled SSH Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_EnabledSSHVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"SSHv1\",\"SSHv2\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SSHProtocolEndpoint.OtherEnabledSSHVersion\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledSSHVersions();

	/**
	 * Returns the value of the '<em><b>Other Enabled SSH Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the EnabledSSHVersions property is set to 1, "Other" then this is a free form string providing more information about the SSH protocol. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Enabled SSH Version</em>' attribute.
	 * @see #setOtherEnabledSSHVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_OtherEnabledSSHVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SSHProtocolEndpoint.EnabledSSHVersions\"]'"
	 * @generated
	 */
	String getOtherEnabledSSHVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getOtherEnabledSSHVersion <em>Other Enabled SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled SSH Version</em>' attribute.
	 * @see #getOtherEnabledSSHVersion()
	 * @generated
	 */
	void setOtherEnabledSSHVersion(String value);

	/**
	 * Returns the value of the '<em><b>SSH Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of SSH in use for this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SSH Version</em>' attribute.
	 * @see #setSSHVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_SSHVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\"]' Values='[\"Unknown\",\"Other\",\"SSHv1\",\"SSHv2\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_SSHProtocolEndpoint.OtherSSHVersion\",\"CIM_SSHProtocolEndpoint.EnabledSSHVersions\"]'"
	 * @generated
	 */
	Integer getSSHVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getSSHVersion <em>SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSH Version</em>' attribute.
	 * @see #getSSHVersion()
	 * @generated
	 */
	void setSSHVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Other SSH Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the SSHVersion property is set to 1, "Other" then this is a free form string providing more information about the current SSH protocol. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other SSH Version</em>' attribute.
	 * @see #setOtherSSHVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_OtherSSHVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_SSHProtocolEndpoint.SSHVersion\",\"CIM_SSHProtocolEndpoint.OtherEnabledSSHVersion\"]'"
	 * @generated
	 */
	String getOtherSSHVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getOtherSSHVersion <em>Other SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other SSH Version</em>' attribute.
	 * @see #getOtherSSHVersion()
	 * @generated
	 */
	void setOtherSSHVersion(String value);

	/**
	 * Returns the value of the '<em><b>Enabled Encryption Algorithms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the encryption algorithms that are enabled for this SSH service. Its possible for an encryption algorithm to be supported by an SSH service and not be enabled to be used. One of the enabled algorithms will actually be in use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Encryption Algorithms</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_EnabledEncryptionAlgorithms()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"DES\",\"DES3\",\"RC4\",\"IDEA\",\"SKIPJACK\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SSHProtocolEndpoint.OtherEnabledEncryptionAlgorithm\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledEncryptionAlgorithms();

	/**
	 * Returns the value of the '<em><b>Other Enabled Encryption Algorithm</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the EnabledEncryptionAlgorithms property is set 1, "Other" this property contains a free form string providing more information about supported algorithms. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Enabled Encryption Algorithm</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_OtherEnabledEncryptionAlgorithm()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SSHProtocolEndpoint.EnabledEncryptionAlgorithms\"]'"
	 * @generated
	 */
	EList<String> getOtherEnabledEncryptionAlgorithm();

	/**
	 * Returns the value of the '<em><b>Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encryption algorithm currently in use for this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #setEncryptionAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_EncryptionAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\"]' Values='[\"Unknown\",\"Other\",\"DES\",\"DES3\",\"RC4\",\"IDEA\",\"SKIPJACK\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_SSHProtocolEndpoint.OtherEncryptionAlgorithm\",\"CIM_SSHProtocolEndpoint.EnabledEncryptionAlgorithms\"]'"
	 * @generated
	 */
	Integer getEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 */
	void setEncryptionAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Encryption Algorithm</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the EncryptionAlgorithm property is set to 1, "Other" then this is a free form string providing more information about the current encryption algorithm. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Encryption Algorithm</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_OtherEncryptionAlgorithm()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SSHProtocolEndpoint.EncryptionAlgorithm\",\"CIM_SSHProtocolEndpoint.OtherEnabledEncryptionAlgorithm\"]'"
	 * @generated
	 */
	EList<String> getOtherEncryptionAlgorithm();

	/**
	 * Returns the value of the '<em><b>Idle Timeout</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IdleTimeout specifies how long the connection can be idle before the connection is terminated. The default value, 0, indicates that there is no idle timeout period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idle Timeout</em>' attribute.
	 * @see #setIdleTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_IdleTimeout()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getIdleTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getIdleTimeout <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Timeout</em>' attribute.
	 * @see #getIdleTimeout()
	 * @generated
	 */
	void setIdleTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Keep Alive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this property is true, the SSH keep alive timer is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keep Alive</em>' attribute.
	 * @see #setKeepAlive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_KeepAlive()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getKeepAlive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getKeepAlive <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive</em>' attribute.
	 * @see #getKeepAlive()
	 * @generated
	 */
	void setKeepAlive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Forward X11</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this property is true, the SSH X11 forwarding mode is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forward X11</em>' attribute.
	 * @see #setForwardX11(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_ForwardX11()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getForwardX11();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getForwardX11 <em>Forward X11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward X11</em>' attribute.
	 * @see #getForwardX11()
	 * @generated
	 */
	void setForwardX11(Boolean value);

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this property is true, SSH compression is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see #setCompression(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHProtocolEndpoint_Compression()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getCompression();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHProtocolEndpoint#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(Boolean value);

} // CIM_SSHProtocolEndpoint
