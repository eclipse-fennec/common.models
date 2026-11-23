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
 * A representation of the model object '<em><b>CIM Opaque Management Data Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_OpaqueManagementDataCapabilities describes the capabilities of CIM_OpaqueManagementDataService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getMaxAvailableStorage <em>Max Available Storage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getMaxReadLength <em>Max Read Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getMaxWriteLength <em>Max Write Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getSupportedExportURISchemes <em>Supported Export URI Schemes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getSupportedImportURISchemes <em>Supported Import URI Schemes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getSupportedMethods <em>Supported Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getTruncationSupported <em>Truncation Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getMaxInstancesSupported <em>Max Instances Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.23.0' UMLPackagePath='CIM::Core::OpaqueManagementData' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_OpaqueManagementDataCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Max Available Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of bytes of opaque management data storage managed by the associated CIM_OpaqueManagementDataService, and hence the maximum value of the AvailableStorage property in the associated CIM_OpaqueManagementDataService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Available Storage</em>' attribute.
	 * @see #setMaxAvailableStorage(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataCapabilities_MaxAvailableStorage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_OpaqueManagementDataService.AvailableStorage\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxAvailableStorage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getMaxAvailableStorage <em>Max Available Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Available Storage</em>' attribute.
	 * @see #getMaxAvailableStorage()
	 * @generated
	 */
	void setMaxAvailableStorage(Long value);

	/**
	 * Returns the value of the '<em><b>Max Read Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxReadLength indicates the maximum value that the service supports in the Length parameter of the ReadOpaqueManagementData method. Larger extents can be read by successively invoking ReadOpaqueManagementData on chunks of the data and reassembling them in the management client. When this is done, the LockOpaqueManagementData method should be used to prevent modification of the data by other clients between successive reads.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Read Length</em>' attribute.
	 * @see #setMaxReadLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataCapabilities_MaxReadLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte'"
	 * @generated
	 */
	Long getMaxReadLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getMaxReadLength <em>Max Read Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Read Length</em>' attribute.
	 * @see #getMaxReadLength()
	 * @generated
	 */
	void setMaxReadLength(Long value);

	/**
	 * Returns the value of the '<em><b>Max Write Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxWriteLength indicates the maximum value that the service supports in the Length parameter of the WriteOpaqueManagementData method. Larger extents can be written by successively invoking WriteOpaqueManagementData on chunks of the data and reassembling them in the management client. When this is done, the LockOpaqueManagementData method should be used to prevent modification of the data by other clients between successive writes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Write Length</em>' attribute.
	 * @see #setMaxWriteLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataCapabilities_MaxWriteLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte'"
	 * @generated
	 */
	Long getMaxWriteLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getMaxWriteLength <em>Max Write Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Write Length</em>' attribute.
	 * @see #getMaxWriteLength()
	 * @generated
	 */
	void setMaxWriteLength(Long value);

	/**
	 * Returns the value of the '<em><b>Supported Export URI Schemes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property lists the URI schemes supported by OpaqueManagementDataService.ExportOpaqueManagementDataToURI().
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Export URI Schemes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataCapabilities_SupportedExportURISchemes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"data\",\"file\",\"ftp\",\"http\",\"https\",\"nfs\",\"tftp\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedExportURISchemes();

	/**
	 * Returns the value of the '<em><b>Supported Import URI Schemes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property lists the URI schemes supported by OpaqueManagementDataService.ImportOpaqueManagementDataFromURI().
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Import URI Schemes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataCapabilities_SupportedImportURISchemes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"data\",\"file\",\"ftp\",\"http\",\"https\",\"nfs\",\"tftp\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedImportURISchemes();

	/**
	 * Returns the value of the '<em><b>Supported Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property advertises the methods that are supported by the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataCapabilities_SupportedMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x80..\"]' Values='[\"Other\",\"Create\",\"Read\",\"ExportToURI\",\"Write\",\"ImportFromURI\",\"Lock\",\"ReassignOwnership\",\"AssignAccess\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedMethods();

	/**
	 * Returns the value of the '<em><b>Truncation Supported</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TruncationSupported indicates whether the associated CIM_OpaqueManagementDataService allows a client to truncate the data in a CIM_OpaqueManagementData instance by reducing the value of its DataSize property.
	 * If TruncationSupported = true, then the Service shall support reduction of the value of CIM_OpaqueManagementData.DataSize
	 * .If TruncationSupported = false or is null, then the Service shall not support reduction of the value of CIM_OpaqueManagementData.DataSize
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Truncation Supported</em>' attribute.
	 * @see #setTruncationSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataCapabilities_TruncationSupported()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getTruncationSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getTruncationSupported <em>Truncation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truncation Supported</em>' attribute.
	 * @see #getTruncationSupported()
	 * @generated
	 */
	void setTruncationSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Instances Supported</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxInstancesSupported shall indicate the maximum number of opaque management data instances that may exist within the scope of the CIM_OpaqueManagementDataService and managed by the associated instance of the CIM_OpaqueManagementDataService. A value of zero shall indicate that the maximum number of instances is unknown or that the maximum number of instances is not enforced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Instances Supported</em>' attribute.
	 * @see #setMaxInstancesSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataCapabilities_MaxInstancesSupported()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaxInstancesSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementDataCapabilities#getMaxInstancesSupported <em>Max Instances Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instances Supported</em>' attribute.
	 * @see #getMaxInstancesSupported()
	 * @generated
	 */
	void setMaxInstancesSupported(Integer value);

} // CIM_OpaqueManagementDataCapabilities
