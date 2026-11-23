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
 * A representation of the model object '<em><b>CIM Opaque Management Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from StorageExtent that describes opaque management data in managed systems. The structure and semantics of opaque management data, which may be standardized or proprietary, are assumed to be known by at least one management client, but need not be known by the CIM server. The UntransformedDataFormat property identifies the structure and semantics of the data.
 * Opaque management data are typically stored in non-volatile memory that is accessible to the server. Management clients are able to read and write opaque data, to manage their lifetime, and to configure the access rights associated with them. The non-volatile storage is often used as a mailbox, with local management agents producing data for consumption by remote management clients, or vice versa.
 * This class is not intended as a general-purpose opaque alternative to any existing or planned CIM classes. It is expressly intended for the mailbox usage model described above.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementData#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementData#getLastAccessed <em>Last Accessed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementData#getWriteLimited <em>Write Limited</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementData#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementData#getDataSize <em>Data Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::OpaqueManagementData' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_OpaqueManagementData extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of bytes of opaque management data that the instance may contain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementData_MaxSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte'"
	 * @generated
	 */
	Long getMaxSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementData#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(Long value);

	/**
	 * Returns the value of the '<em><b>Last Accessed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when the opaque management data was last accessed. Any operation on the OpaqueManagementData instance constitutes access. This property shall be NULL if it is not supported by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Accessed</em>' attribute.
	 * @see #setLastAccessed(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementData_LastAccessed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastAccessed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementData#getLastAccessed <em>Last Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Accessed</em>' attribute.
	 * @see #getLastAccessed()
	 * @generated
	 */
	void setLastAccessed(String value);

	/**
	 * Returns the value of the '<em><b>Write Limited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the data are stored on a medium that has a limited number of write/erase cycles (e.g., flash memory).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Limited</em>' attribute.
	 * @see #setWriteLimited(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementData_WriteLimited()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\"]' Values='[\"Unknown\",\"Not write-limited\",\"Write-limited\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getWriteLimited();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementData#getWriteLimited <em>Write Limited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Limited</em>' attribute.
	 * @see #getWriteLimited()
	 * @generated
	 */
	void setWriteLimited(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the format of the opaque management data. A free-form string that shall only be set by an authorized client, and shall not be changed by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Format</em>' attribute.
	 * @see #setDataFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementData_DataFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDataFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementData#getDataFormat <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format</em>' attribute.
	 * @see #getDataFormat()
	 * @generated
	 */
	void setDataFormat(String value);

	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bytes of opaque management data in the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Size</em>' attribute.
	 * @see #setDataSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementData_DataSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte'"
	 * @generated
	 */
	Long getDataSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementData#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size</em>' attribute.
	 * @see #getDataSize()
	 * @generated
	 */
	void setDataSize(Long value);

} // CIM_OpaqueManagementData
