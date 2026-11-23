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
package org.dmtf.prs.impl;

import org.dmtf.prs.PRS_Activity;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_ActivityImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ActivityImpl#getNewKeys <em>New Keys</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ActivityImpl#getDeleted <em>Deleted</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ActivityImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ActivityImpl#getLocalDate <em>Local Date</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ActivityImpl#getActionLog <em>Action Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_ActivityImpl extends PRS_ExchangeElementImpl implements PRS_Activity {
	/**
	 * The default value of the '{@link #getParameterList() <em>Parameter List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterList()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterList()
	 * @generated
	 * @ordered
	 */
	protected String parameterList = PARAMETER_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewKeys() <em>New Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewKeys()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_KEYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewKeys() <em>New Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewKeys()
	 * @generated
	 * @ordered
	 */
	protected String newKeys = NEW_KEYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleted() <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleted()
	 * @generated
	 * @ordered
	 */
	protected static final String DELETED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeleted() <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleted()
	 * @generated
	 * @ordered
	 */
	protected String deleted = DELETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected String modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalDate() <em>Local Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDate()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalDate() <em>Local Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDate()
	 * @generated
	 * @ordered
	 */
	protected String localDate = LOCAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLog() <em>Action Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLog()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLog() <em>Action Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLog()
	 * @generated
	 * @ordered
	 */
	protected String actionLog = ACTION_LOG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameterList() {
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterList(String newParameterList) {
		String oldParameterList = parameterList;
		parameterList = newParameterList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ACTIVITY__PARAMETER_LIST, oldParameterList, parameterList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewKeys() {
		return newKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewKeys(String newNewKeys) {
		String oldNewKeys = newKeys;
		newKeys = newNewKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ACTIVITY__NEW_KEYS, oldNewKeys, newKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeleted() {
		return deleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleted(String newDeleted) {
		String oldDeleted = deleted;
		deleted = newDeleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ACTIVITY__DELETED, oldDeleted, deleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModified(String newModified) {
		String oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ACTIVITY__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalDate() {
		return localDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalDate(String newLocalDate) {
		String oldLocalDate = localDate;
		localDate = newLocalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ACTIVITY__LOCAL_DATE, oldLocalDate, localDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionLog() {
		return actionLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionLog(String newActionLog) {
		String oldActionLog = actionLog;
		actionLog = newActionLog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ACTIVITY__ACTION_LOG, oldActionLog, actionLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_ACTIVITY__PARAMETER_LIST:
				return getParameterList();
			case PrsPackage.PRS_ACTIVITY__NEW_KEYS:
				return getNewKeys();
			case PrsPackage.PRS_ACTIVITY__DELETED:
				return getDeleted();
			case PrsPackage.PRS_ACTIVITY__MODIFIED:
				return getModified();
			case PrsPackage.PRS_ACTIVITY__LOCAL_DATE:
				return getLocalDate();
			case PrsPackage.PRS_ACTIVITY__ACTION_LOG:
				return getActionLog();
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
			case PrsPackage.PRS_ACTIVITY__PARAMETER_LIST:
				setParameterList((String)newValue);
				return;
			case PrsPackage.PRS_ACTIVITY__NEW_KEYS:
				setNewKeys((String)newValue);
				return;
			case PrsPackage.PRS_ACTIVITY__DELETED:
				setDeleted((String)newValue);
				return;
			case PrsPackage.PRS_ACTIVITY__MODIFIED:
				setModified((String)newValue);
				return;
			case PrsPackage.PRS_ACTIVITY__LOCAL_DATE:
				setLocalDate((String)newValue);
				return;
			case PrsPackage.PRS_ACTIVITY__ACTION_LOG:
				setActionLog((String)newValue);
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
			case PrsPackage.PRS_ACTIVITY__PARAMETER_LIST:
				setParameterList(PARAMETER_LIST_EDEFAULT);
				return;
			case PrsPackage.PRS_ACTIVITY__NEW_KEYS:
				setNewKeys(NEW_KEYS_EDEFAULT);
				return;
			case PrsPackage.PRS_ACTIVITY__DELETED:
				setDeleted(DELETED_EDEFAULT);
				return;
			case PrsPackage.PRS_ACTIVITY__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case PrsPackage.PRS_ACTIVITY__LOCAL_DATE:
				setLocalDate(LOCAL_DATE_EDEFAULT);
				return;
			case PrsPackage.PRS_ACTIVITY__ACTION_LOG:
				setActionLog(ACTION_LOG_EDEFAULT);
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
			case PrsPackage.PRS_ACTIVITY__PARAMETER_LIST:
				return PARAMETER_LIST_EDEFAULT == null ? parameterList != null : !PARAMETER_LIST_EDEFAULT.equals(parameterList);
			case PrsPackage.PRS_ACTIVITY__NEW_KEYS:
				return NEW_KEYS_EDEFAULT == null ? newKeys != null : !NEW_KEYS_EDEFAULT.equals(newKeys);
			case PrsPackage.PRS_ACTIVITY__DELETED:
				return DELETED_EDEFAULT == null ? deleted != null : !DELETED_EDEFAULT.equals(deleted);
			case PrsPackage.PRS_ACTIVITY__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case PrsPackage.PRS_ACTIVITY__LOCAL_DATE:
				return LOCAL_DATE_EDEFAULT == null ? localDate != null : !LOCAL_DATE_EDEFAULT.equals(localDate);
			case PrsPackage.PRS_ACTIVITY__ACTION_LOG:
				return ACTION_LOG_EDEFAULT == null ? actionLog != null : !ACTION_LOG_EDEFAULT.equals(actionLog);
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
		result.append(" (ParameterList: ");
		result.append(parameterList);
		result.append(", NewKeys: ");
		result.append(newKeys);
		result.append(", Deleted: ");
		result.append(deleted);
		result.append(", Modified: ");
		result.append(modified);
		result.append(", LocalDate: ");
		result.append(localDate);
		result.append(", ActionLog: ");
		result.append(actionLog);
		result.append(')');
		return result.toString();
	}

} //PRS_ActivityImpl
