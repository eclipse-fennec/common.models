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

import org.dmtf.cim.CIM_FileSystemGroupSynchronized;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Group Synchronized</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemGroupSynchronizedImpl#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemGroupSynchronizedImpl#getConsistencyEnabled <em>Consistency Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemGroupSynchronizedImpl#getConsistencyType <em>Consistency Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemGroupSynchronizedImpl#getConsistencyState <em>Consistency State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemGroupSynchronizedImpl#getConsistencyStatus <em>Consistency Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSystemGroupSynchronizedImpl extends CIM_SynchronizedImpl implements CIM_FileSystemGroupSynchronized {
	/**
	 * The default value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected String relationshipName = RELATIONSHIP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistencyEnabled() <em>Consistency Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONSISTENCY_ENABLED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getConsistencyEnabled() <em>Consistency Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean consistencyEnabled = CONSISTENCY_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistencyType() <em>Consistency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONSISTENCY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsistencyType() <em>Consistency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyType()
	 * @generated
	 * @ordered
	 */
	protected Integer consistencyType = CONSISTENCY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistencyState() <em>Consistency State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONSISTENCY_STATE_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getConsistencyState() <em>Consistency State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyState()
	 * @generated
	 * @ordered
	 */
	protected Integer consistencyState = CONSISTENCY_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistencyStatus() <em>Consistency Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONSISTENCY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsistencyStatus() <em>Consistency Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer consistencyStatus = CONSISTENCY_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemGroupSynchronizedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemGroupSynchronized();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelationshipName() {
		return relationshipName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipName(String newRelationshipName) {
		String oldRelationshipName = relationshipName;
		relationshipName = newRelationshipName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__RELATIONSHIP_NAME, oldRelationshipName, relationshipName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConsistencyEnabled() {
		return consistencyEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsistencyEnabled(Boolean newConsistencyEnabled) {
		Boolean oldConsistencyEnabled = consistencyEnabled;
		consistencyEnabled = newConsistencyEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_ENABLED, oldConsistencyEnabled, consistencyEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConsistencyType() {
		return consistencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsistencyType(Integer newConsistencyType) {
		Integer oldConsistencyType = consistencyType;
		consistencyType = newConsistencyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_TYPE, oldConsistencyType, consistencyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConsistencyState() {
		return consistencyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsistencyState(Integer newConsistencyState) {
		Integer oldConsistencyState = consistencyState;
		consistencyState = newConsistencyState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATE, oldConsistencyState, consistencyState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConsistencyStatus() {
		return consistencyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsistencyStatus(Integer newConsistencyStatus) {
		Integer oldConsistencyStatus = consistencyStatus;
		consistencyStatus = newConsistencyStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATUS, oldConsistencyStatus, consistencyStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__RELATIONSHIP_NAME:
				return getRelationshipName();
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_ENABLED:
				return getConsistencyEnabled();
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_TYPE:
				return getConsistencyType();
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATE:
				return getConsistencyState();
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATUS:
				return getConsistencyStatus();
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
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__RELATIONSHIP_NAME:
				setRelationshipName((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_ENABLED:
				setConsistencyEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_TYPE:
				setConsistencyType((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATE:
				setConsistencyState((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATUS:
				setConsistencyStatus((Integer)newValue);
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
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__RELATIONSHIP_NAME:
				setRelationshipName(RELATIONSHIP_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_ENABLED:
				setConsistencyEnabled(CONSISTENCY_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_TYPE:
				setConsistencyType(CONSISTENCY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATE:
				setConsistencyState(CONSISTENCY_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATUS:
				setConsistencyStatus(CONSISTENCY_STATUS_EDEFAULT);
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
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__RELATIONSHIP_NAME:
				return RELATIONSHIP_NAME_EDEFAULT == null ? relationshipName != null : !RELATIONSHIP_NAME_EDEFAULT.equals(relationshipName);
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_ENABLED:
				return CONSISTENCY_ENABLED_EDEFAULT == null ? consistencyEnabled != null : !CONSISTENCY_ENABLED_EDEFAULT.equals(consistencyEnabled);
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_TYPE:
				return CONSISTENCY_TYPE_EDEFAULT == null ? consistencyType != null : !CONSISTENCY_TYPE_EDEFAULT.equals(consistencyType);
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATE:
				return CONSISTENCY_STATE_EDEFAULT == null ? consistencyState != null : !CONSISTENCY_STATE_EDEFAULT.equals(consistencyState);
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED__CONSISTENCY_STATUS:
				return CONSISTENCY_STATUS_EDEFAULT == null ? consistencyStatus != null : !CONSISTENCY_STATUS_EDEFAULT.equals(consistencyStatus);
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
		result.append(" (RelationshipName: ");
		result.append(relationshipName);
		result.append(", ConsistencyEnabled: ");
		result.append(consistencyEnabled);
		result.append(", ConsistencyType: ");
		result.append(consistencyType);
		result.append(", ConsistencyState: ");
		result.append(consistencyState);
		result.append(", ConsistencyStatus: ");
		result.append(consistencyStatus);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSystemGroupSynchronizedImpl
