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
 * A representation of the model object '<em><b>CIM File Server Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the Capabilities of a FileServer. An instance of FileServerConfigurationCapabilities is associated with a FileServerConfigurationService using ElementCapabilities. FileServerConfigurationCapabilities specifies the combination of properties that a FileServerConfigurationService can support for creating, modifying, and deleting different types of Fileservers and the support for managing these as jobs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getSynchronousMethodsSupported <em>Synchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getAsynchronousMethodsSupported <em>Asynchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureCIFS <em>Can Configure CIFS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureNFS <em>Can Configure NFS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureNIS <em>Can Configure NIS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureDNS <em>Can Configure DNS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureNetworkVLAN <em>Can Configure Network VLAN</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileServerConfigurationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileServerConfigurationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Synchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of methods of this Service that are supported as synchronous methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerConfigurationCapabilities_SynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"CreateFileServer\",\"DeleteFileServer\",\"ModifyFileServer\",\"AddIPInterface\",\"ModifyIPInterface\",\"DeleteIPInterface\",\"CreateGoalSettings\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSynchronousMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Asynchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of methods of this Service that are supported as asynchronous methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asynchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerConfigurationCapabilities_AsynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"CreateFileServer\",\"DeleteFileServer\",\"ModifyFileServer\",\"AddIPInterface\",\"ModifyIPInterface\",\"DeleteIPInterface\",\"CreateGoalSettings\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getAsynchronousMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Can Configure CIFS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that CIFS settings can be configured. False indicates CIFS settings are read only
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Configure CIFS</em>' attribute.
	 * @see #setCanConfigureCIFS(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerConfigurationCapabilities_CanConfigureCIFS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCanConfigureCIFS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureCIFS <em>Can Configure CIFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Configure CIFS</em>' attribute.
	 * @see #getCanConfigureCIFS()
	 * @generated
	 */
	void setCanConfigureCIFS(Boolean value);

	/**
	 * Returns the value of the '<em><b>Can Configure NFS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that NFS settings can be configured. False indicates NFS settings are read only
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Configure NFS</em>' attribute.
	 * @see #setCanConfigureNFS(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerConfigurationCapabilities_CanConfigureNFS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCanConfigureNFS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureNFS <em>Can Configure NFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Configure NFS</em>' attribute.
	 * @see #getCanConfigureNFS()
	 * @generated
	 */
	void setCanConfigureNFS(Boolean value);

	/**
	 * Returns the value of the '<em><b>Can Configure NIS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that NIS settings can be configured. False indicates NIS settings are read only
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Configure NIS</em>' attribute.
	 * @see #setCanConfigureNIS(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerConfigurationCapabilities_CanConfigureNIS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCanConfigureNIS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureNIS <em>Can Configure NIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Configure NIS</em>' attribute.
	 * @see #getCanConfigureNIS()
	 * @generated
	 */
	void setCanConfigureNIS(Boolean value);

	/**
	 * Returns the value of the '<em><b>Can Configure DNS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that DNS settings can be configured. False indicates DNS settings are read only
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Configure DNS</em>' attribute.
	 * @see #setCanConfigureDNS(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerConfigurationCapabilities_CanConfigureDNS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCanConfigureDNS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureDNS <em>Can Configure DNS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Configure DNS</em>' attribute.
	 * @see #getCanConfigureDNS()
	 * @generated
	 */
	void setCanConfigureDNS(Boolean value);

	/**
	 * Returns the value of the '<em><b>Can Configure Network VLAN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that Network VLAN tagging settings can be configured. False indicates Network VLAN settings are read only
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Configure Network VLAN</em>' attribute.
	 * @see #setCanConfigureNetworkVLAN(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerConfigurationCapabilities_CanConfigureNetworkVLAN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCanConfigureNetworkVLAN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerConfigurationCapabilities#getCanConfigureNetworkVLAN <em>Can Configure Network VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Configure Network VLAN</em>' attribute.
	 * @see #getCanConfigureNetworkVLAN()
	 * @generated
	 */
	void setCanConfigureNetworkVLAN(Boolean value);

} // CIM_FileServerConfigurationCapabilities
