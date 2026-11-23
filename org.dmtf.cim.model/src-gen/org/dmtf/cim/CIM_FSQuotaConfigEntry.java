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
 * A representation of the model object '<em><b>CIM FS Quota Config Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of this class represent single lines in a quota system configuration file. The user, group, tree and filesystem that the quota applies to are discovered by following associations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getHardLimit <em>Hard Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getSoftLimit <em>Soft Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getSoftLimitGracePeriod <em>Soft Limit Grace Period</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getActive <em>Active</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getQuotaType <em>Quota Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getTreeName <em>Tree Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getPrincipalID <em>Principal ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getFileSystem <em>File System</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileSystem' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='An opaque identifier for the entry. Some systems assign a unique identifier to quota entries, while others will have to concatenate several partial keys to achieve uniqueness.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FSQuotaConfigEntry extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Hard Limit</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hard limit for this quota. What it means when this limit is exceeded is system dependent. This property is optional and may therefore be NULL. If it is NULL, the system MUST NOT attach a hard quota to the combination of ManagedElement, tree and principal specified by this quota entry, as a result of setting it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hard Limit</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_HardLimit()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FSQuotaConfigEntry.ResourceType\"]'"
	 * @generated
	 */
	EList<Long> getHardLimit();

	/**
	 * Returns the value of the '<em><b>Soft Limit</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The soft limit for this quota. What it means when this limit is exceeded is system dependent. This property is optional and may therefore be NULL. If it is NULL, the system MUST NOT attach a soft quota to the combination of ManagedElement, tree and principal specified by this quota entry, as a result of setting it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soft Limit</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_SoftLimit()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FSQuotaConfigEntry.ResourceType\"]'"
	 * @generated
	 */
	EList<Long> getSoftLimit();

	/**
	 * Returns the value of the '<em><b>Soft Limit Grace Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some systems automatically convert soft limits into hard limits after the soft limit has been exceeded for some period of time. If present, this DateTime value specifies the length of this grace period. This property is optional and may therefore be NULL. A system that does not support this property MUST return an error upon an attempt to set it. See the discussion in the FSQuotaManagementService class MOF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soft Limit Grace Period</em>' attribute.
	 * @see #setSoftLimitGracePeriod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_SoftLimitGracePeriod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getSoftLimitGracePeriod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getSoftLimitGracePeriod <em>Soft Limit Grace Period</em>}' attribute.
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
	 * Whether or not tracking is being done against this quota entry. Some systems do not allow turning quotas on and off per entry. This property is therefore optional and may therefore be NULL. A system that does not support this property MUST return an error upon an attempt to set it. See the discussion in the FSQuotaManagementService class MOF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_Active()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not thresholds on this quota are being enforced. Sometimes quota systems are used simply to track usage, and in this case the records in a quota report will report a monitor-only quota. This property is optional and may therefore be NULL. A system that does not support this property MUST return an error upon an attempt to set it. See the discussion in the FSQuotaManagementService class MOF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitor</em>' attribute.
	 * @see #setMonitor(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_Monitor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMonitor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getMonitor <em>Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor</em>' attribute.
	 * @see #getMonitor()
	 * @generated
	 */
	void setMonitor(Boolean value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of resource whose consumption is being managed. More than one resource type may be specified in a given quota entry. A system that does not support a type given in this property MUST return an error upon an attempt to set it. See the discussion in the FSQuotaManagementService class MOF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_ResourceType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Bytes\",\"Files\",\"Directories\",\"Files+Directories\",\"Inodes\",\"Reserved\",\"Vendor Defined\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FSQuotaConfigEntry.SoftLimit\",\"CIM_FSQuotaConfigEntry.HardLimit\"]'"
	 * @generated
	 */
	EList<Integer> getResourceType();

	/**
	 * Returns the value of the '<em><b>Quota Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of quota to create. Quotas are set either on users or groups or trees, in the filesystem world. A system that does not support a value given for this property MUST return an error upon an attempt to set it. See the discussion in the FSQuotaManagementService class MOF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quota Type</em>' attribute.
	 * @see #setQuotaType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_QuotaType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"User\",\"Group\",\"Tree\",\"User-tree\",\"Group-tree\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getQuotaType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getQuotaType <em>Quota Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota Type</em>' attribute.
	 * @see #getQuotaType()
	 * @generated
	 */
	void setQuotaType(Integer value);

	/**
	 * Returns the value of the '<em><b>Tree Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tree (as represented by a pathname) over which the quota is monitored. This property may be NULL, indicating that the quota is over the entire ManagedElement whose InstanceID and ElementName are cited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tree Name</em>' attribute.
	 * @see #setTreeName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_TreeName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getTreeName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getTreeName <em>Tree Name</em>}' attribute.
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
	 * The UID/GID/SID of the principal, if PrincipalType is 'User' or 'Group'. This property MUST be NULL if the quota in question is a Tree quota.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal ID</em>' attribute.
	 * @see #setPrincipalID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_PrincipalID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPrincipalID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getPrincipalID <em>Principal ID</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_FileSystem()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFileSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getFileSystem <em>File System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System</em>' attribute.
	 * @see #getFileSystem()
	 * @generated
	 */
	void setFileSystem(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not this is a default quota. A default user quota applies to every user not governed by a specific quota entry, within the scope of the associated ManagedElement. A default group quota applies to every group not governed by a specific quota entry. Default quotas MUST NOT be associated to an FSDomainIdentity instance. A system that does not support default quotas MUST return an error upon an attempt to set one. See the discussion in the FSQuotaManagementService class MOF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaConfigEntry_Default()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaConfigEntry#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Boolean value);

} // CIM_FSQuotaConfigEntry
