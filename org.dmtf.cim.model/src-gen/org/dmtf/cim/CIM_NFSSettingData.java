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
 * A representation of the model object '<em><b>CIM NFS Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The NFSSettingData is a derived class of Settingdata that specifies NFS specific properties for a Fileserver.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NFSSettingData#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFSSettingData#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFSSettingData#getMaximumTCPConnections <em>Maximum TCP Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFSSettingData#getPort <em>Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFSSettingData#getNonNFSuid <em>Non NF Suid</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFSSettingData#getNonNFSgid <em>Non NF Sgid</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFSSettingData#getUseReservedPorts <em>Use Reserved Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFSSettingData#getOnlyRootChown <em>Only Root Chown</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NFSSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileSystem' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NFSSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that NFS is enabled for a FileServer. False indicates NFS is disabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFSSettingData_Enabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFSSettingData#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The charset that will be used by a Fileserver for NFS processing. The default is ISO-8859-1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFSSettingData_Charset()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"0x8000..\"]' Values='[\"Standard-ASCII\",\"UTF8\",\"ISO-8859-1\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getCharset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFSSettingData#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum TCP Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This specifies the number of concurrent TCP connections that are allowed for the NFS protocol. If set to 0, then TCP will be disabled for NFS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum TCP Connections</em>' attribute.
	 * @see #setMaximumTCPConnections(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFSSettingData_MaximumTCPConnections()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumTCPConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFSSettingData#getMaximumTCPConnections <em>Maximum TCP Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum TCP Connections</em>' attribute.
	 * @see #getMaximumTCPConnections()
	 * @generated
	 */
	void setMaximumTCPConnections(Integer value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"2049"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port the File Server listens for mount requests. The default is 2049.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFSSettingData_Port()
	 * @model default="2049"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFSSettingData#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Non NF Suid</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User ID to use for requests from non-NFS access. The default is -1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non NF Suid</em>' attribute.
	 * @see #setNonNFSuid(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFSSettingData_NonNFSuid()
	 * @model default="-1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint16'"
	 * @generated
	 */
	Integer getNonNFSuid();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFSSettingData#getNonNFSuid <em>Non NF Suid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non NF Suid</em>' attribute.
	 * @see #getNonNFSuid()
	 * @generated
	 */
	void setNonNFSuid(Integer value);

	/**
	 * Returns the value of the '<em><b>Non NF Sgid</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UGroup ID to use for requests from non-NFS access. The default is -1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non NF Sgid</em>' attribute.
	 * @see #setNonNFSgid(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFSSettingData_NonNFSgid()
	 * @model default="-1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint16'"
	 * @generated
	 */
	Integer getNonNFSgid();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFSSettingData#getNonNFSgid <em>Non NF Sgid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non NF Sgid</em>' attribute.
	 * @see #getNonNFSgid()
	 * @generated
	 */
	void setNonNFSgid(Integer value);

	/**
	 * Returns the value of the '<em><b>Use Reserved Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This boolean specifies that the File Server will only allow NFS mount requests from client machine TCP/IP ports less than 1024. True allows mount requests from ports less than 1024 False allows mount requests from any client port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Reserved Ports</em>' attribute.
	 * @see #setUseReservedPorts(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFSSettingData_UseReservedPorts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getUseReservedPorts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFSSettingData#getUseReservedPorts <em>Use Reserved Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Reserved Ports</em>' attribute.
	 * @see #getUseReservedPorts()
	 * @generated
	 */
	void setUseReservedPorts(Boolean value);

	/**
	 * Returns the value of the '<em><b>Only Root Chown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This boolean specifies if the root user is allowed to issue chown (change ownership) requests. True indicates that only root users may issue chown request. False indicates that any user may issue chown requests
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Only Root Chown</em>' attribute.
	 * @see #setOnlyRootChown(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFSSettingData_OnlyRootChown()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getOnlyRootChown();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFSSettingData#getOnlyRootChown <em>Only Root Chown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Root Chown</em>' attribute.
	 * @see #getOnlyRootChown()
	 * @generated
	 */
	void setOnlyRootChown(Boolean value);

} // CIM_NFSSettingData
