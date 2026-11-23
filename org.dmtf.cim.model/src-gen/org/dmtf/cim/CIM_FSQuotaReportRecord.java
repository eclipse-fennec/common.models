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
 * A representation of the model object '<em><b>CIM FS Quota Report Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of this class represent one line in a filesystem quota report. All properties in it are optional except the amount used and the entity the number applies to. 
 * Filesystem quota reports are descriptions of the current state of the system. On a working system, no two complete quota reports will ever be the same. 
 * On systems which support default quotas, quota reports may be quite large, as they must report on every user/group in the system. A cursor mechanism is provided to make it possible to retrieve records a batch at a time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getHardLimit <em>Hard Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getSoftLimit <em>Soft Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getSoftLimitGracePeriod <em>Soft Limit Grace Period</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getActive <em>Active</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getMonitored <em>Monitored</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getQuotaType <em>Quota Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getAmountUsed <em>Amount Used</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getTreeName <em>Tree Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getPrincipalID <em>Principal ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getFileSystem <em>File System</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.45.0' UMLPackagePath='CIM::System::FileServices'"
 * @generated
 */
@ProviderType
public interface CIM_FSQuotaReportRecord extends CIM_ReportRecord {
	/**
	 * Returns the value of the '<em><b>Hard Limit</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hard limit for the quota that generated this record, corresponding to the ResourceType in the same position in the ResourceType array. What it means when this limit is exceeded is system dependent. Some filesystems fail all further writes, for example, while others do not fail until the file is closed. This property is optional and may therefore be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hard Limit</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_HardLimit()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FSQuotaReportRecord.ResourceType\"]'"
	 * @generated
	 */
	EList<Long> getHardLimit();

	/**
	 * Returns the value of the '<em><b>Soft Limit</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The soft limit for the quota that generated this record. What it means when this limit is exceeded is system dependent. Some filesystems treat it as a warning threshold, for example, while others merely collect it as a statistic. This property is optional and may therefore be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soft Limit</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_SoftLimit()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FSQuotaReportRecord.ResourceType\"]'"
	 * @generated
	 */
	EList<Long> getSoftLimit();

	/**
	 * Returns the value of the '<em><b>Soft Limit Grace Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some systems automatically convert soft limits into hard limits after the soft limit has been exceeded for some period of time. If present, this DateTime value specifies the length of this grace period. This property is optional and may therefore be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soft Limit Grace Period</em>' attribute.
	 * @see #setSoftLimitGracePeriod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_SoftLimitGracePeriod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getSoftLimitGracePeriod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getSoftLimitGracePeriod <em>Soft Limit Grace Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Limit Grace Period</em>' attribute.
	 * @see #getSoftLimitGracePeriod()
	 * @generated
	 */
	void setSoftLimitGracePeriod(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not thresholds on this quota are being enforced. Sometimes quota systems are used simply to track usage, and in this case the records in a quota report will report an inactive quota.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_Active()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Monitored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not thresholds on this quota are being monitored. If a system reports quotas that aren't being monitored, this value may be false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitored</em>' attribute.
	 * @see #setMonitored(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_Monitored()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMonitored();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getMonitored <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored</em>' attribute.
	 * @see #getMonitored()
	 * @generated
	 */
	void setMonitored(Boolean value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of resource whose consumption is being managed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_ResourceType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Bytes\",\"Files\",\"Directories\",\"Files+Directories\",\"Inodes\",\"Reserved\",\"Vendor Defined\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FSQuotaReportRecord.SoftLimit\",\"CIM_FSQuotaReportRecord.HardLimit\"]'"
	 * @generated
	 */
	EList<Integer> getResourceType();

	/**
	 * Returns the value of the '<em><b>Quota Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of quota being monitored. Quotas are set either on users or groups or trees, or on users on a specific tree or groups on a specific tree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quota Type</em>' attribute.
	 * @see #setQuotaType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_QuotaType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"User\",\"Group\",\"Tree\",\"User-Tree\",\"Group-Tree\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getQuotaType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getQuotaType <em>Quota Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota Type</em>' attribute.
	 * @see #getQuotaType()
	 * @generated
	 */
	void setQuotaType(Integer value);

	/**
	 * Returns the value of the '<em><b>Amount Used</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of resource used by the indicated principal in the indicated container and tree at the time the report was taken. This number is given on a best effort basis, and may never exactly match the current status of the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Used</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_AmountUsed()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FSQuotaReportRecord.ResourceType\"]'"
	 * @generated
	 */
	EList<Long> getAmountUsed();

	/**
	 * Returns the value of the '<em><b>Tree Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tree (as represented by a pathname) over which the quota is monitored. This property may be NULL, indicating that the quota is over the entire FileSystem specified in the entry, or the entire ComputerSystem whose InstanceID and ElementName are cited, if no filesystem is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tree Name</em>' attribute.
	 * @see #setTreeName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_TreeName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getTreeName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getTreeName <em>Tree Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Name</em>' attribute.
	 * @see #getTreeName()
	 * @generated
	 */
	void setTreeName(String value);

	/**
	 * Returns the value of the '<em><b>Principal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UID/GID/SID or name of the principal, if PrincipalType is 'User' or 'Group'. This property MUST be NULL if the quota in question is a Tree quota.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal ID</em>' attribute.
	 * @see #setPrincipalID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_PrincipalID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPrincipalID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getPrincipalID <em>Principal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal ID</em>' attribute.
	 * @see #getPrincipalID()
	 * @generated
	 */
	void setPrincipalID(String value);

	/**
	 * Returns the value of the '<em><b>File System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name of the FileSystem over which this quota is monitored. This property is optional and may therefore be NULL. However, providers SHOULD populate this property whenever possible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File System</em>' attribute.
	 * @see #setFileSystem(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaReportRecord_FileSystem()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFileSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaReportRecord#getFileSystem <em>File System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System</em>' attribute.
	 * @see #getFileSystem()
	 * @generated
	 */
	void setFileSystem(String value);

} // CIM_FSQuotaReportRecord
