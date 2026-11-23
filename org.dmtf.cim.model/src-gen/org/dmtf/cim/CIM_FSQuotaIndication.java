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
 * A representation of the model object '<em><b>CIM FS Quota Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An FSQuotaIndication signals all quota threshold crossing events surfaced by the underlying instrumentation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaIndication#getIdentityID <em>Identity ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaIndication#getEntryID <em>Entry ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaIndication#getPath <em>Path</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaIndication#getWhichLimit <em>Which Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaIndication#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaIndication#getQuotaType <em>Quota Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaIndication#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaIndication#getAmountUsed <em>Amount Used</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaIndication#getFileSystem <em>File System</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.45.0' UMLPackagePath='CIM::System::FileSystem'"
 * @generated
 */
@ProviderType
public interface CIM_FSQuotaIndication extends CIM_ProcessIndication {
	/**
	 * Returns the value of the '<em><b>Identity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the FSDomainIdentity involved in causing the event. If there is none, NULL MUST be passed in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity ID</em>' attribute.
	 * @see #setIdentityID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication_IdentityID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FSDomainIdentity.InstanceID\"]'"
	 * @generated
	 */
	String getIdentityID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaIndication#getIdentityID <em>Identity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity ID</em>' attribute.
	 * @see #getIdentityID()
	 * @generated
	 */
	void setIdentityID(String value);

	/**
	 * Returns the value of the '<em><b>Entry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the FSQuotaConfigEntry involved in causing the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry ID</em>' attribute.
	 * @see #setEntryID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication_EntryID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEntryID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaIndication#getEntryID <em>Entry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry ID</em>' attribute.
	 * @see #getEntryID()
	 * @generated
	 */
	void setEntryID(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the tree involved in causing the event. If this is NULL or the empty string, it indicates the root of the FileSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication_Path()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaIndication#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Which Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which threshold has been crossed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Which Limit</em>' attribute.
	 * @see #setWhichLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication_WhichLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"..\",\"65536..\"]' Values='[\"Hard\",\"Soft\",\"Monitor\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long getWhichLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaIndication#getWhichLimit <em>Which Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Which Limit</em>' attribute.
	 * @see #getWhichLimit()
	 * @generated
	 */
	void setWhichLimit(Long value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which type of resource usage is involved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see #setResourceType(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication_ResourceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Bytes\",\"Files\",\"Directories\",\"Files+Directories\",\"Inodes\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long getResourceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaIndication#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(Long value);

	/**
	 * Returns the value of the '<em><b>Quota Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of quota that triggered the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quota Type</em>' attribute.
	 * @see #setQuotaType(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication_QuotaType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"65536..\"]' Values='[\"User\",\"Group\",\"Tree\",\"User-Tree\",\"Group-Tree\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long getQuotaType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaIndication#getQuotaType <em>Quota Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota Type</em>' attribute.
	 * @see #getQuotaType()
	 * @generated
	 */
	void setQuotaType(Long value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quota limit that was crossed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication_Limit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaIndication#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(Long value);

	/**
	 * Returns the value of the '<em><b>Amount Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of the resource actually used at present. This parameter is optional and may be missing or NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Used</em>' attribute.
	 * @see #setAmountUsed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication_AmountUsed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getAmountUsed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaIndication#getAmountUsed <em>Amount Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Used</em>' attribute.
	 * @see #getAmountUsed()
	 * @generated
	 */
	void setAmountUsed(Long value);

	/**
	 * Returns the value of the '<em><b>File System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name of the FileSystem in which the event occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File System</em>' attribute.
	 * @see #setFileSystem(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaIndication_FileSystem()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFileSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaIndication#getFileSystem <em>File System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System</em>' attribute.
	 * @see #getFileSystem()
	 * @generated
	 */
	void setFileSystem(String value);

} // CIM_FSQuotaIndication
