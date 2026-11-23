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
 * A representation of the model object '<em><b>CIM File Server Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FileServerSettings is a derived class of Settingdata that specifies general properties for a Fileserver. It also serves as the main Settings object for a Fileserver that is associated with the other Fileserver properties via theConcreteComponent association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileServerSettings#getHostLookupOrder <em>Host Lookup Order</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerSettings#getUserLoginLookupOrder <em>User Login Lookup Order</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerSettings#getNFSCIFSAccountMapping <em>NFSCIFS Account Mapping</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileServerSettings#getAccountMappingDomain <em>Account Mapping Domain</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileServerSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileServerSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Host Lookup Order</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of lookup service names that specifies the order of services to use when resolving host names. UploadedFile refers to a file of host names that has been previously uploaded to the FileServer.If None is specified, then any other service names will be ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Lookup Order</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerSettings_HostLookupOrder()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"None\",\"DNS\",\"NIS\",\"UploadedFile\",\"Reserved\",\"Vendor Defined\"]' ArrayType='Ordered'"
	 * @generated
	 */
	EList<Integer> getHostLookupOrder();

	/**
	 * Returns the value of the '<em><b>User Login Lookup Order</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of lookup service names that specifies the order of services to use when resolving user names and passwords. UploadedFile refers to a file of user names and passwords that has been previously uploaded to the FileServer. If None is specified, then any other service names will be ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Login Lookup Order</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerSettings_UserLoginLookupOrder()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"None\",\"DNS\",\"NIS\",\"UploadedFile\",\"Reserved\",\"Vendor Defined\"]' ArrayType='Ordered'"
	 * @generated
	 */
	EList<Integer> getUserLoginLookupOrder();

	/**
	 * Returns the value of the '<em><b>NFSCIFS Account Mapping</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls the mapping of accounts between NFS and CIFS. If set to None (the default), no account mapping will be performed by the FileServer. If set to All, account mapping will be performed for all CIFS domains.If set to Domain, account mapping will be done for only those users in the domainspecified by AccountMappingDomain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NFSCIFS Account Mapping</em>' attribute.
	 * @see #setNFSCIFSAccountMapping(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerSettings_NFSCIFSAccountMapping()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"None\",\"All\",\"Domain\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getNFSCIFSAccountMapping();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerSettings#getNFSCIFSAccountMapping <em>NFSCIFS Account Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NFSCIFS Account Mapping</em>' attribute.
	 * @see #getNFSCIFSAccountMapping()
	 * @generated
	 */
	void setNFSCIFSAccountMapping(Integer value);

	/**
	 * Returns the value of the '<em><b>Account Mapping Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If NFSCIFSAccountMapping= 2 (Domain), then this property will contain the name of the CIFS domain to use for NFS to CIFS account mapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account Mapping Domain</em>' attribute.
	 * @see #setAccountMappingDomain(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileServerSettings_AccountMappingDomain()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAccountMappingDomain();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileServerSettings#getAccountMappingDomain <em>Account Mapping Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Mapping Domain</em>' attribute.
	 * @see #getAccountMappingDomain()
	 * @generated
	 */
	void setAccountMappingDomain(String value);

} // CIM_FileServerSettings
