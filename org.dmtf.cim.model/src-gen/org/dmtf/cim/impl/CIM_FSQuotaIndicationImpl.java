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

import org.dmtf.cim.CIM_FSQuotaIndication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FS Quota Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaIndicationImpl#getIdentityID <em>Identity ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaIndicationImpl#getEntryID <em>Entry ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaIndicationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaIndicationImpl#getWhichLimit <em>Which Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaIndicationImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaIndicationImpl#getQuotaType <em>Quota Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaIndicationImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaIndicationImpl#getAmountUsed <em>Amount Used</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaIndicationImpl#getFileSystem <em>File System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FSQuotaIndicationImpl extends CIM_ProcessIndicationImpl implements CIM_FSQuotaIndication {
	/**
	 * The default value of the '{@link #getIdentityID() <em>Identity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityID()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentityID() <em>Identity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityID()
	 * @generated
	 * @ordered
	 */
	protected String identityID = IDENTITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryID() <em>Entry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryID()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryID() <em>Entry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryID()
	 * @generated
	 * @ordered
	 */
	protected String entryID = ENTRY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhichLimit() <em>Which Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhichLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long WHICH_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhichLimit() <em>Which Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhichLimit()
	 * @generated
	 * @ordered
	 */
	protected Long whichLimit = WHICH_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected Long resourceType = RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuotaType() <em>Quota Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaType()
	 * @generated
	 * @ordered
	 */
	protected static final Long QUOTA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuotaType() <em>Quota Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaType()
	 * @generated
	 * @ordered
	 */
	protected Long quotaType = QUOTA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected Long limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountUsed() <em>Amount Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountUsed()
	 * @generated
	 * @ordered
	 */
	protected static final Long AMOUNT_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmountUsed() <em>Amount Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountUsed()
	 * @generated
	 * @ordered
	 */
	protected Long amountUsed = AMOUNT_USED_EDEFAULT;

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
	protected CIM_FSQuotaIndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FSQuotaIndication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentityID() {
		return identityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentityID(String newIdentityID) {
		String oldIdentityID = identityID;
		identityID = newIdentityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_INDICATION__IDENTITY_ID, oldIdentityID, identityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntryID() {
		return entryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryID(String newEntryID) {
		String oldEntryID = entryID;
		entryID = newEntryID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_INDICATION__ENTRY_ID, oldEntryID, entryID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_INDICATION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWhichLimit() {
		return whichLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhichLimit(Long newWhichLimit) {
		Long oldWhichLimit = whichLimit;
		whichLimit = newWhichLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_INDICATION__WHICH_LIMIT, oldWhichLimit, whichLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(Long newResourceType) {
		Long oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_INDICATION__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getQuotaType() {
		return quotaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuotaType(Long newQuotaType) {
		Long oldQuotaType = quotaType;
		quotaType = newQuotaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_INDICATION__QUOTA_TYPE, oldQuotaType, quotaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(Long newLimit) {
		Long oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_INDICATION__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAmountUsed() {
		return amountUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountUsed(Long newAmountUsed) {
		Long oldAmountUsed = amountUsed;
		amountUsed = newAmountUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_INDICATION__AMOUNT_USED, oldAmountUsed, amountUsed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_INDICATION__FILE_SYSTEM, oldFileSystem, fileSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FS_QUOTA_INDICATION__IDENTITY_ID:
				return getIdentityID();
			case CimPackage.CIM_FS_QUOTA_INDICATION__ENTRY_ID:
				return getEntryID();
			case CimPackage.CIM_FS_QUOTA_INDICATION__PATH:
				return getPath();
			case CimPackage.CIM_FS_QUOTA_INDICATION__WHICH_LIMIT:
				return getWhichLimit();
			case CimPackage.CIM_FS_QUOTA_INDICATION__RESOURCE_TYPE:
				return getResourceType();
			case CimPackage.CIM_FS_QUOTA_INDICATION__QUOTA_TYPE:
				return getQuotaType();
			case CimPackage.CIM_FS_QUOTA_INDICATION__LIMIT:
				return getLimit();
			case CimPackage.CIM_FS_QUOTA_INDICATION__AMOUNT_USED:
				return getAmountUsed();
			case CimPackage.CIM_FS_QUOTA_INDICATION__FILE_SYSTEM:
				return getFileSystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FS_QUOTA_INDICATION__IDENTITY_ID:
				setIdentityID((String)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__ENTRY_ID:
				setEntryID((String)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__PATH:
				setPath((String)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__WHICH_LIMIT:
				setWhichLimit((Long)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__RESOURCE_TYPE:
				setResourceType((Long)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__QUOTA_TYPE:
				setQuotaType((Long)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__LIMIT:
				setLimit((Long)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__AMOUNT_USED:
				setAmountUsed((Long)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__FILE_SYSTEM:
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
			case CimPackage.CIM_FS_QUOTA_INDICATION__IDENTITY_ID:
				setIdentityID(IDENTITY_ID_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__ENTRY_ID:
				setEntryID(ENTRY_ID_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__WHICH_LIMIT:
				setWhichLimit(WHICH_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__QUOTA_TYPE:
				setQuotaType(QUOTA_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__AMOUNT_USED:
				setAmountUsed(AMOUNT_USED_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_INDICATION__FILE_SYSTEM:
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
			case CimPackage.CIM_FS_QUOTA_INDICATION__IDENTITY_ID:
				return IDENTITY_ID_EDEFAULT == null ? identityID != null : !IDENTITY_ID_EDEFAULT.equals(identityID);
			case CimPackage.CIM_FS_QUOTA_INDICATION__ENTRY_ID:
				return ENTRY_ID_EDEFAULT == null ? entryID != null : !ENTRY_ID_EDEFAULT.equals(entryID);
			case CimPackage.CIM_FS_QUOTA_INDICATION__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CimPackage.CIM_FS_QUOTA_INDICATION__WHICH_LIMIT:
				return WHICH_LIMIT_EDEFAULT == null ? whichLimit != null : !WHICH_LIMIT_EDEFAULT.equals(whichLimit);
			case CimPackage.CIM_FS_QUOTA_INDICATION__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? resourceType != null : !RESOURCE_TYPE_EDEFAULT.equals(resourceType);
			case CimPackage.CIM_FS_QUOTA_INDICATION__QUOTA_TYPE:
				return QUOTA_TYPE_EDEFAULT == null ? quotaType != null : !QUOTA_TYPE_EDEFAULT.equals(quotaType);
			case CimPackage.CIM_FS_QUOTA_INDICATION__LIMIT:
				return LIMIT_EDEFAULT == null ? limit != null : !LIMIT_EDEFAULT.equals(limit);
			case CimPackage.CIM_FS_QUOTA_INDICATION__AMOUNT_USED:
				return AMOUNT_USED_EDEFAULT == null ? amountUsed != null : !AMOUNT_USED_EDEFAULT.equals(amountUsed);
			case CimPackage.CIM_FS_QUOTA_INDICATION__FILE_SYSTEM:
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
		result.append(" (IdentityID: ");
		result.append(identityID);
		result.append(", EntryID: ");
		result.append(entryID);
		result.append(", Path: ");
		result.append(path);
		result.append(", WhichLimit: ");
		result.append(whichLimit);
		result.append(", ResourceType: ");
		result.append(resourceType);
		result.append(", QuotaType: ");
		result.append(quotaType);
		result.append(", Limit: ");
		result.append(limit);
		result.append(", AmountUsed: ");
		result.append(amountUsed);
		result.append(", FileSystem: ");
		result.append(fileSystem);
		result.append(')');
		return result.toString();
	}

} //CIM_FSQuotaIndicationImpl
