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
 * A representation of the model object '<em><b>CIM CIFS Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIFSSettingData is a derived class of Settingdata that specifies CIFS specific properties for a Fileserver.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getUseTCPOnly <em>Use TCP Only</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getNETBIOSName <em>NETBIOS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getWINSIP <em>WINSIP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getAuthenticationDomain <em>Authentication Domain</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getAuthenticationMode <em>Authentication Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getUseKerberos <em>Use Kerberos</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getUseOpportunisticLocking <em>Use Opportunistic Locking</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getSMBSigningOnly <em>SMB Signing Only</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getClientsConnectAnonymously <em>Clients Connect Anonymously</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getJoinDomainAnonymously <em>Join Domain Anonymously</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getDomainControllerUser <em>Domain Controller User</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getDomainControllerPassword <em>Domain Controller Password</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getCIFSDomainController <em>CIFS Domain Controller</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getCASupported <em>CA Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getMultiChannelSupported <em>Multi Channel Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIFSSettingData#getProtocolVersions <em>Protocol Versions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileServerServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CIFSSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that CIFS is enabled for a FileServer. False indicates CIFS is disabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_Enabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The charset that will be used by a Fileserver for CIFS processing. The default is Standard-ASCII.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_Charset()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"0x8000..\"]' Values='[\"Standard-ASCII\",\"IBM-437\",\"IBM-480\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getCharset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(Integer value);

	/**
	 * Returns the value of the '<em><b>Use TCP Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that only TCP transport connections are allowed. False indicates both TCP and Netbios transport connections are allowed. The default is to allow both TCP and Netbios.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use TCP Only</em>' attribute.
	 * @see #setUseTCPOnly(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_UseTCPOnly()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getUseTCPOnly();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getUseTCPOnly <em>Use TCP Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use TCP Only</em>' attribute.
	 * @see #getUseTCPOnly()
	 * @generated
	 */
	void setUseTCPOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>NETBIOS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TThe NetBIOS name of the FileServer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NETBIOS Name</em>' attribute.
	 * @see #setNETBIOSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_NETBIOSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getNETBIOSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getNETBIOSName <em>NETBIOS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NETBIOS Name</em>' attribute.
	 * @see #getNETBIOSName()
	 * @generated
	 */
	void setNETBIOSName(String value);

	/**
	 * Returns the value of the '<em><b>WINSIP</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of IP Addresses of Windows Internet Name Servers. The address type can be either IP4 or IP6.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WINSIP</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_WINSIP()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getWINSIP();

	/**
	 * Returns the value of the '<em><b>Authentication Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of CIFS domain to which the File Server is joined. Represents either the NTLM domain or the ActiveDirectory domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Domain</em>' attribute.
	 * @see #setAuthenticationDomain(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_AuthenticationDomain()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAuthenticationDomain();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getAuthenticationDomain <em>Authentication Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Domain</em>' attribute.
	 * @see #getAuthenticationDomain()
	 * @generated
	 */
	void setAuthenticationDomain(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if authentication is to be performed against NTLM or ActiveDirectory domains. Valid values are NTLM or ActiveDirectory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Mode</em>' attribute.
	 * @see #setAuthenticationMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_AuthenticationMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\"]' Values='[\"NTLM\",\"Active Directory\"]'"
	 * @generated
	 */
	Integer getAuthenticationMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getAuthenticationMode <em>Authentication Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Mode</em>' attribute.
	 * @see #getAuthenticationMode()
	 * @generated
	 */
	void setAuthenticationMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Use Kerberos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines how ActiveDirectory authentication is performed. True indicates that ActiveDirectory authentication will use Kerberos. False indicates not to limit authentication to Kerberos only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Kerberos</em>' attribute.
	 * @see #setUseKerberos(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_UseKerberos()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getUseKerberos();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getUseKerberos <em>Use Kerberos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Kerberos</em>' attribute.
	 * @see #getUseKerberos()
	 * @generated
	 */
	void setUseKerberos(Boolean value);

	/**
	 * Returns the value of the '<em><b>Use Opportunistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that CIFS opportunistic locking should be performed False indicates to not use oportunistic locking.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Opportunistic Locking</em>' attribute.
	 * @see #setUseOpportunisticLocking(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_UseOpportunisticLocking()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getUseOpportunisticLocking();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getUseOpportunisticLocking <em>Use Opportunistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Opportunistic Locking</em>' attribute.
	 * @see #getUseOpportunisticLocking()
	 * @generated
	 */
	void setUseOpportunisticLocking(Boolean value);

	/**
	 * Returns the value of the '<em><b>SMB Signing Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This boolean determines if CIFS clients are allowed to connect if they use SMB signing for security. True indicates that CIFS clients are required to use SMB signing. False indicates that clients do not have to use SMB signing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SMB Signing Only</em>' attribute.
	 * @see #setSMBSigningOnly(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_SMBSigningOnly()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSMBSigningOnly();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getSMBSigningOnly <em>SMB Signing Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SMB Signing Only</em>' attribute.
	 * @see #getSMBSigningOnly()
	 * @generated
	 */
	void setSMBSigningOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Clients Connect Anonymously</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This boolean dictates if the FileServer joins the CIFS Domain Controller anonymously or if a user and password are required. True indicates to join anonymously. False indicates to use the DomainControllerUser and DomainControllerPassword to join.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clients Connect Anonymously</em>' attribute.
	 * @see #setClientsConnectAnonymously(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_ClientsConnectAnonymously()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getClientsConnectAnonymously();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getClientsConnectAnonymously <em>Clients Connect Anonymously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clients Connect Anonymously</em>' attribute.
	 * @see #getClientsConnectAnonymously()
	 * @generated
	 */
	void setClientsConnectAnonymously(Boolean value);

	/**
	 * Returns the value of the '<em><b>Join Domain Anonymously</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This boolean dictates if the FileServer joins the CIFS Domain Controller anonymously or if a user and password are required. True indicates to join anonymously. False indicates to use the DomainControllerUser and DomainControllerPassword to join.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Join Domain Anonymously</em>' attribute.
	 * @see #setJoinDomainAnonymously(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_JoinDomainAnonymously()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getJoinDomainAnonymously();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getJoinDomainAnonymously <em>Join Domain Anonymously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Domain Anonymously</em>' attribute.
	 * @see #getJoinDomainAnonymously()
	 * @generated
	 */
	void setJoinDomainAnonymously(Boolean value);

	/**
	 * Returns the value of the '<em><b>Domain Controller User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User name to use when the Fileserver joins the CIFS Domain Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Controller User</em>' attribute.
	 * @see #setDomainControllerUser(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_DomainControllerUser()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDomainControllerUser();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getDomainControllerUser <em>Domain Controller User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Controller User</em>' attribute.
	 * @see #getDomainControllerUser()
	 * @generated
	 */
	void setDomainControllerUser(String value);

	/**
	 * Returns the value of the '<em><b>Domain Controller Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Password to use when the Fileserver joins the CIFS Domain Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Controller Password</em>' attribute.
	 * @see #setDomainControllerPassword(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_DomainControllerPassword()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDomainControllerPassword();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getDomainControllerPassword <em>Domain Controller Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Controller Password</em>' attribute.
	 * @see #getDomainControllerPassword()
	 * @generated
	 */
	void setDomainControllerPassword(String value);

	/**
	 * Returns the value of the '<em><b>CIFS Domain Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the CIFS Domain Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CIFS Domain Controller</em>' attribute.
	 * @see #setCIFSDomainController(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_CIFSDomainController()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCIFSDomainController();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getCIFSDomainController <em>CIFS Domain Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CIFS Domain Controller</em>' attribute.
	 * @see #getCIFSDomainController()
	 * @generated
	 */
	void setCIFSDomainController(String value);

	/**
	 * Returns the value of the '<em><b>CA Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to CIFS/SMB shares only. If it is true, it means that "Continuous Availability" is supported for CIFS shares. Continuous Availability (CA) - Client/Server mediated recovery from network and server failure with application transparency. Like Multi-Channel IO, this feature is somewhat analogous to capabilities available in NFSv4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CA Supported</em>' attribute.
	 * @see #setCASupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_CASupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCASupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getCASupported <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CA Supported</em>' attribute.
	 * @see #getCASupported()
	 * @generated
	 */
	void setCASupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Multi Channel Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to CIFS/SMB protocol only. If it is true, it means that "Multi-Channel" feature is supported for CIFS/SMB. Multi-Channel (MPIO) - Provides the ability to access multiple Ethernet links as a logical pool supporting multiple SMB sessions and providing native bandwidth aggregation, link failover, MPIO intelligence. This feature enables the use of multiple physical network interfaces in an SMB 2.2 client and server. This enhancement in SMB 2.2 provides capabilities analogous to those currently available in NFSv4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Channel Supported</em>' attribute.
	 * @see #setMultiChannelSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_MultiChannelSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMultiChannelSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIFSSettingData#getMultiChannelSupported <em>Multi Channel Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Channel Supported</em>' attribute.
	 * @see #getMultiChannelSupported()
	 * @generated
	 */
	void setMultiChannelSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Protocol Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings listing the versions of the CIFS file sharing protocol supported by the File Server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Versions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CIFSSettingData_ProtocolVersions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.ProtocolVersions\",\"CIM_ExportedFileShareCapabilities.FileSharingProtocol\"]'"
	 * @generated
	 */
	EList<String> getProtocolVersions();

} // CIM_CIFSSettingData
