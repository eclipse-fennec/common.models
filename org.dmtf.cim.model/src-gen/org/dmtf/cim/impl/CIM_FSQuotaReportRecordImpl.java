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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_FSQuotaReportRecord;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FS Quota Report Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getHardLimit <em>Hard Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getSoftLimit <em>Soft Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getSoftLimitGracePeriod <em>Soft Limit Grace Period</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getMonitored <em>Monitored</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getQuotaType <em>Quota Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getAmountUsed <em>Amount Used</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getTreeName <em>Tree Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getPrincipalID <em>Principal ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaReportRecordImpl#getFileSystem <em>File System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FSQuotaReportRecordImpl extends CIM_ReportRecordImpl implements CIM_FSQuotaReportRecord {
	/**
	 * The cached value of the '{@link #getHardLimit() <em>Hard Limit</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardLimit()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> hardLimit;

	/**
	 * The cached value of the '{@link #getSoftLimit() <em>Soft Limit</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftLimit()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> softLimit;

	/**
	 * The default value of the '{@link #getSoftLimitGracePeriod() <em>Soft Limit Grace Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftLimitGracePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFT_LIMIT_GRACE_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftLimitGracePeriod() <em>Soft Limit Grace Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftLimitGracePeriod()
	 * @generated
	 * @ordered
	 */
	protected String softLimitGracePeriod = SOFT_LIMIT_GRACE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected Boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitored()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MONITORED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitored()
	 * @generated
	 * @ordered
	 */
	protected Boolean monitored = MONITORED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> resourceType;

	/**
	 * The default value of the '{@link #getQuotaType() <em>Quota Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUOTA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuotaType() <em>Quota Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaType()
	 * @generated
	 * @ordered
	 */
	protected Integer quotaType = QUOTA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAmountUsed() <em>Amount Used</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> amountUsed;

	/**
	 * The default value of the '{@link #getTreeName() <em>Tree Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TREE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreeName() <em>Tree Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeName()
	 * @generated
	 * @ordered
	 */
	protected String treeName = TREE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipalID() <em>Principal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINCIPAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrincipalID() <em>Principal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalID()
	 * @generated
	 * @ordered
	 */
	protected String principalID = PRINCIPAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSystem() <em>File System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSystem() <em>File System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystem()
	 * @generated
	 * @ordered
	 */
	protected String fileSystem = FILE_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FSQuotaReportRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FSQuotaReportRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getHardLimit() {
		if (hardLimit == null) {
			hardLimit = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__HARD_LIMIT);
		}
		return hardLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getSoftLimit() {
		if (softLimit == null) {
			softLimit = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT);
		}
		return softLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftLimitGracePeriod() {
		return softLimitGracePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftLimitGracePeriod(String newSoftLimitGracePeriod) {
		String oldSoftLimitGracePeriod = softLimitGracePeriod;
		softLimitGracePeriod = newSoftLimitGracePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT_GRACE_PERIOD, oldSoftLimitGracePeriod, softLimitGracePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(Boolean newActive) {
		Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMonitored() {
		return monitored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitored(Boolean newMonitored) {
		Boolean oldMonitored = monitored;
		monitored = newMonitored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__MONITORED, oldMonitored, monitored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getResourceType() {
		if (resourceType == null) {
			resourceType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__RESOURCE_TYPE);
		}
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getQuotaType() {
		return quotaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuotaType(Integer newQuotaType) {
		Integer oldQuotaType = quotaType;
		quotaType = newQuotaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__QUOTA_TYPE, oldQuotaType, quotaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getAmountUsed() {
		if (amountUsed == null) {
			amountUsed = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__AMOUNT_USED);
		}
		return amountUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTreeName() {
		return treeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreeName(String newTreeName) {
		String oldTreeName = treeName;
		treeName = newTreeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__TREE_NAME, oldTreeName, treeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrincipalID() {
		return principalID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrincipalID(String newPrincipalID) {
		String oldPrincipalID = principalID;
		principalID = newPrincipalID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__PRINCIPAL_ID, oldPrincipalID, principalID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileSystem() {
		return fileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSystem(String newFileSystem) {
		String oldFileSystem = fileSystem;
		fileSystem = newFileSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_REPORT_RECORD__FILE_SYSTEM, oldFileSystem, fileSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__HARD_LIMIT:
				return getHardLimit();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT:
				return getSoftLimit();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT_GRACE_PERIOD:
				return getSoftLimitGracePeriod();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__ACTIVE:
				return getActive();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__MONITORED:
				return getMonitored();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__RESOURCE_TYPE:
				return getResourceType();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__QUOTA_TYPE:
				return getQuotaType();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__AMOUNT_USED:
				return getAmountUsed();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__TREE_NAME:
				return getTreeName();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__PRINCIPAL_ID:
				return getPrincipalID();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__FILE_SYSTEM:
				return getFileSystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__HARD_LIMIT:
				getHardLimit().clear();
				getHardLimit().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT:
				getSoftLimit().clear();
				getSoftLimit().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT_GRACE_PERIOD:
				setSoftLimitGracePeriod((String)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__MONITORED:
				setMonitored((Boolean)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__RESOURCE_TYPE:
				getResourceType().clear();
				getResourceType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__QUOTA_TYPE:
				setQuotaType((Integer)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__AMOUNT_USED:
				getAmountUsed().clear();
				getAmountUsed().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__TREE_NAME:
				setTreeName((String)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__PRINCIPAL_ID:
				setPrincipalID((String)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__FILE_SYSTEM:
				setFileSystem((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__HARD_LIMIT:
				getHardLimit().clear();
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT:
				getSoftLimit().clear();
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT_GRACE_PERIOD:
				setSoftLimitGracePeriod(SOFT_LIMIT_GRACE_PERIOD_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__MONITORED:
				setMonitored(MONITORED_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__RESOURCE_TYPE:
				getResourceType().clear();
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__QUOTA_TYPE:
				setQuotaType(QUOTA_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__AMOUNT_USED:
				getAmountUsed().clear();
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__TREE_NAME:
				setTreeName(TREE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__PRINCIPAL_ID:
				setPrincipalID(PRINCIPAL_ID_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__FILE_SYSTEM:
				setFileSystem(FILE_SYSTEM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__HARD_LIMIT:
				return hardLimit != null && !hardLimit.isEmpty();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT:
				return softLimit != null && !softLimit.isEmpty();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__SOFT_LIMIT_GRACE_PERIOD:
				return SOFT_LIMIT_GRACE_PERIOD_EDEFAULT == null ? softLimitGracePeriod != null : !SOFT_LIMIT_GRACE_PERIOD_EDEFAULT.equals(softLimitGracePeriod);
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__ACTIVE:
				return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT.equals(active);
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__MONITORED:
				return MONITORED_EDEFAULT == null ? monitored != null : !MONITORED_EDEFAULT.equals(monitored);
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__RESOURCE_TYPE:
				return resourceType != null && !resourceType.isEmpty();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__QUOTA_TYPE:
				return QUOTA_TYPE_EDEFAULT == null ? quotaType != null : !QUOTA_TYPE_EDEFAULT.equals(quotaType);
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__AMOUNT_USED:
				return amountUsed != null && !amountUsed.isEmpty();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__TREE_NAME:
				return TREE_NAME_EDEFAULT == null ? treeName != null : !TREE_NAME_EDEFAULT.equals(treeName);
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__PRINCIPAL_ID:
				return PRINCIPAL_ID_EDEFAULT == null ? principalID != null : !PRINCIPAL_ID_EDEFAULT.equals(principalID);
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD__FILE_SYSTEM:
				return FILE_SYSTEM_EDEFAULT == null ? fileSystem != null : !FILE_SYSTEM_EDEFAULT.equals(fileSystem);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (HardLimit: ");
		result.append(hardLimit);
		result.append(", SoftLimit: ");
		result.append(softLimit);
		result.append(", SoftLimitGracePeriod: ");
		result.append(softLimitGracePeriod);
		result.append(", Active: ");
		result.append(active);
		result.append(", Monitored: ");
		result.append(monitored);
		result.append(", ResourceType: ");
		result.append(resourceType);
		result.append(", QuotaType: ");
		result.append(quotaType);
		result.append(", AmountUsed: ");
		result.append(amountUsed);
		result.append(", TreeName: ");
		result.append(treeName);
		result.append(", PrincipalID: ");
		result.append(principalID);
		result.append(", FileSystem: ");
		result.append(fileSystem);
		result.append(')');
		return result.toString();
	}

} //CIM_FSQuotaReportRecordImpl
