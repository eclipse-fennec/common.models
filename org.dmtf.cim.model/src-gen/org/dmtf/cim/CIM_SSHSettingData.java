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
 * A representation of the model object '<em><b>CIM SSH Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A representation of the SettingData of an SSH endpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getEnabledSSHVersions <em>Enabled SSH Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getOtherEnabledSSHVersion <em>Other Enabled SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getSSHVersion <em>SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getOtherSSHVersion <em>Other SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getEnabledEncryptionAlgorithms <em>Enabled Encryption Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getOtherEnabledEncryptionAlgorithm <em>Other Enabled Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getOtherEncryptionAlgorithm <em>Other Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getIdleTimeout <em>Idle Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getKeepAlive <em>Keep Alive</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getForwardX11 <em>Forward X11</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SSHSettingData#getCompression <em>Compression</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::ConsoleProtocols' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SSHSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Enabled SSH Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the version or versions of SSH protocol that will be enabled for the SSH endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled SSH Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_EnabledSSHVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"SSHv1\",\"SSHv2\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_SSHSettingData.OtherEnabledSSHVersion\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledSSHVersions();

	/**
	 * Returns the value of the '<em><b>Other Enabled SSH Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the EnabledSSHVersions property contains a value of 1, "Other" then this is a free form string providing more information about the SSH protocol. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Enabled SSH Version</em>' attribute.
	 * @see #setOtherEnabledSSHVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_OtherEnabledSSHVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_SSHSettingData.EnabledSSHVersions\"]'"
	 * @generated
	 */
	String getOtherEnabledSSHVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHSettingData#getOtherEnabledSSHVersion <em>Other Enabled SSH Version</em>}' attribute.
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
	 * The version of SSH that will be in use if this SettingData is applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SSH Version</em>' attribute.
	 * @see #setSSHVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_SSHVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"SSHv1\",\"SSHv2\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_SSHSettingData.OtherSSHVersion\",\"CIM_SSHSettingData.EnabledSSHVersions\"]'"
	 * @generated
	 */
	Integer getSSHVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHSettingData#getSSHVersion <em>SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSH Version</em>' attribute.
	 * @see #getSSHVersion()
	 * @generated
	 */
	void setSSHVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Other SSH Version</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the CurrentSSHVersion property is set to 1, "Other" then this is a free form string providing more information about the current SSH protocol. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other SSH Version</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_OtherSSHVersion()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SSHSettingData.SSHVersion\",\"CIM_SSHSettingData.OtherEnabledSSHVersion\"]'"
	 * @generated
	 */
	EList<String> getOtherSSHVersion();

	/**
	 * Returns the value of the '<em><b>Enabled Encryption Algorithms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the encryption algorithms that are enabled for this SSH service. Its possible for an encryption algorithm to be supported and not currently enabled to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Encryption Algorithms</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_EnabledEncryptionAlgorithms()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"DES\",\"DES3\",\"RC4\",\"IDEA\",\"SKIPJACK\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SSHSettingData.OtherEnabledEncryptionAlgorithm\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_OtherEnabledEncryptionAlgorithm()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SSHProtocolEndpoint.EnabledEncryptionAlgorithms\"]'"
	 * @generated
	 */
	EList<String> getOtherEnabledEncryptionAlgorithm();

	/**
	 * Returns the value of the '<em><b>Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encryption algorithm that will be in use if this SettingData is applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #setEncryptionAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_EncryptionAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\"]' Values='[\"Unknown\",\"Other\",\"DES\",\"DES3\",\"RC4\",\"IDEA\",\"SKIPJACK\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_SSHSettingData.OtherEncryptionAlgorithm\",\"CIM_SSHProtocolEndpoint.EnabledEncryptionAlgorithms\"]'"
	 * @generated
	 */
	Integer getEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHSettingData#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 */
	void setEncryptionAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the EncryptionAlgorithm property is set 1, "Other" then this is a free form string providing more information about the encryption algorithm in use. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Encryption Algorithm</em>' attribute.
	 * @see #setOtherEncryptionAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_OtherEncryptionAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_SSHSettingData.EncryptionAlgorithm\",\"CIM_SSHSettingData.OtherEnabledEncryptionAlgorithm\"]'"
	 * @generated
	 */
	String getOtherEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHSettingData#getOtherEncryptionAlgorithm <em>Other Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Encryption Algorithm</em>' attribute.
	 * @see #getOtherEncryptionAlgorithm()
	 * @generated
	 */
	void setOtherEncryptionAlgorithm(String value);

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
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_IdleTimeout()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getIdleTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHSettingData#getIdleTimeout <em>Idle Timeout</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_KeepAlive()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getKeepAlive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHSettingData#getKeepAlive <em>Keep Alive</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_ForwardX11()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getForwardX11();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHSettingData#getForwardX11 <em>Forward X11</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SSHSettingData_Compression()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getCompression();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SSHSettingData#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(Boolean value);

} // CIM_SSHSettingData
