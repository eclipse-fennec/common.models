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

import org.dmtf.cim.CIM_SynchronizationAspect;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Synchronization Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getSyncType <em>Sync Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getConsistencyEnabled <em>Consistency Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getConsistencyType <em>Consistency Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getCopyStatus <em>Copy Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getCopyMethodology <em>Copy Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getWhenPointInTime <em>When Point In Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getAutoDelete <em>Auto Delete</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getTimeBeforeRemoval <em>Time Before Removal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizationAspectImpl#getSyncState <em>Sync State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SynchronizationAspectImpl extends CIM_SettingDataImpl implements CIM_SynchronizationAspect {
	/**
	 * The default value of the '{@link #getSyncType() <em>Sync Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SYNC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyncType() <em>Sync Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncType()
	 * @generated
	 * @ordered
	 */
	protected Integer syncType = SYNC_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getCopyStatus() <em>Copy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyStatus() <em>Copy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer copyStatus = COPY_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyMethodology() <em>Copy Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyMethodology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_METHODOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyMethodology() <em>Copy Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyMethodology()
	 * @generated
	 * @ordered
	 */
	protected Integer copyMethodology = COPY_METHODOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhenPointInTime() <em>When Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPointInTime()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_POINT_IN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenPointInTime() <em>When Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPointInTime()
	 * @generated
	 * @ordered
	 */
	protected String whenPointInTime = WHEN_POINT_IN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected String sourceElement = SOURCE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoDelete() <em>Auto Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDelete()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_DELETE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAutoDelete() <em>Auto Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDelete()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoDelete = AUTO_DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeBeforeRemoval() <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_BEFORE_REMOVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeBeforeRemoval() <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 * @ordered
	 */
	protected String timeBeforeRemoval = TIME_BEFORE_REMOVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncState() <em>Sync State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SYNC_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyncState() <em>Sync State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncState()
	 * @generated
	 * @ordered
	 */
	protected Integer syncState = SYNC_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SynchronizationAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SynchronizationAspect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSyncType() {
		return syncType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncType(Integer newSyncType) {
		Integer oldSyncType = syncType;
		syncType = newSyncType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_TYPE, oldSyncType, syncType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_ENABLED, oldConsistencyEnabled, consistencyEnabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_TYPE, oldConsistencyType, consistencyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyStatus() {
		return copyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyStatus(Integer newCopyStatus) {
		Integer oldCopyStatus = copyStatus;
		copyStatus = newCopyStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_STATUS, oldCopyStatus, copyStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyMethodology() {
		return copyMethodology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyMethodology(Integer newCopyMethodology) {
		Integer oldCopyMethodology = copyMethodology;
		copyMethodology = newCopyMethodology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_METHODOLOGY, oldCopyMethodology, copyMethodology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhenPointInTime() {
		return whenPointInTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhenPointInTime(String newWhenPointInTime) {
		String oldWhenPointInTime = whenPointInTime;
		whenPointInTime = newWhenPointInTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__WHEN_POINT_IN_TIME, oldWhenPointInTime, whenPointInTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceElement(String newSourceElement) {
		String oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__SOURCE_ELEMENT, oldSourceElement, sourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoDelete() {
		return autoDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoDelete(Boolean newAutoDelete) {
		Boolean oldAutoDelete = autoDelete;
		autoDelete = newAutoDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__AUTO_DELETE, oldAutoDelete, autoDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeBeforeRemoval() {
		return timeBeforeRemoval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeBeforeRemoval(String newTimeBeforeRemoval) {
		String oldTimeBeforeRemoval = timeBeforeRemoval;
		timeBeforeRemoval = newTimeBeforeRemoval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__TIME_BEFORE_REMOVAL, oldTimeBeforeRemoval, timeBeforeRemoval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSyncState() {
		return syncState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncState(Integer newSyncState) {
		Integer oldSyncState = syncState;
		syncState = newSyncState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_STATE, oldSyncState, syncState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_TYPE:
				return getSyncType();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_ENABLED:
				return getConsistencyEnabled();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_TYPE:
				return getConsistencyType();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_STATUS:
				return getCopyStatus();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_METHODOLOGY:
				return getCopyMethodology();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__WHEN_POINT_IN_TIME:
				return getWhenPointInTime();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SOURCE_ELEMENT:
				return getSourceElement();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__AUTO_DELETE:
				return getAutoDelete();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__TIME_BEFORE_REMOVAL:
				return getTimeBeforeRemoval();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_STATE:
				return getSyncState();
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
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_TYPE:
				setSyncType((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_ENABLED:
				setConsistencyEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_TYPE:
				setConsistencyType((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_STATUS:
				setCopyStatus((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_METHODOLOGY:
				setCopyMethodology((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__WHEN_POINT_IN_TIME:
				setWhenPointInTime((String)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SOURCE_ELEMENT:
				setSourceElement((String)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__AUTO_DELETE:
				setAutoDelete((Boolean)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__TIME_BEFORE_REMOVAL:
				setTimeBeforeRemoval((String)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_STATE:
				setSyncState((Integer)newValue);
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
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_TYPE:
				setSyncType(SYNC_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_ENABLED:
				setConsistencyEnabled(CONSISTENCY_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_TYPE:
				setConsistencyType(CONSISTENCY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_STATUS:
				setCopyStatus(COPY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_METHODOLOGY:
				setCopyMethodology(COPY_METHODOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__WHEN_POINT_IN_TIME:
				setWhenPointInTime(WHEN_POINT_IN_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SOURCE_ELEMENT:
				setSourceElement(SOURCE_ELEMENT_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__AUTO_DELETE:
				setAutoDelete(AUTO_DELETE_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__TIME_BEFORE_REMOVAL:
				setTimeBeforeRemoval(TIME_BEFORE_REMOVAL_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_STATE:
				setSyncState(SYNC_STATE_EDEFAULT);
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
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_TYPE:
				return SYNC_TYPE_EDEFAULT == null ? syncType != null : !SYNC_TYPE_EDEFAULT.equals(syncType);
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_ENABLED:
				return CONSISTENCY_ENABLED_EDEFAULT == null ? consistencyEnabled != null : !CONSISTENCY_ENABLED_EDEFAULT.equals(consistencyEnabled);
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__CONSISTENCY_TYPE:
				return CONSISTENCY_TYPE_EDEFAULT == null ? consistencyType != null : !CONSISTENCY_TYPE_EDEFAULT.equals(consistencyType);
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_STATUS:
				return COPY_STATUS_EDEFAULT == null ? copyStatus != null : !COPY_STATUS_EDEFAULT.equals(copyStatus);
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__COPY_METHODOLOGY:
				return COPY_METHODOLOGY_EDEFAULT == null ? copyMethodology != null : !COPY_METHODOLOGY_EDEFAULT.equals(copyMethodology);
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__WHEN_POINT_IN_TIME:
				return WHEN_POINT_IN_TIME_EDEFAULT == null ? whenPointInTime != null : !WHEN_POINT_IN_TIME_EDEFAULT.equals(whenPointInTime);
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SOURCE_ELEMENT:
				return SOURCE_ELEMENT_EDEFAULT == null ? sourceElement != null : !SOURCE_ELEMENT_EDEFAULT.equals(sourceElement);
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__AUTO_DELETE:
				return AUTO_DELETE_EDEFAULT == null ? autoDelete != null : !AUTO_DELETE_EDEFAULT.equals(autoDelete);
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__TIME_BEFORE_REMOVAL:
				return TIME_BEFORE_REMOVAL_EDEFAULT == null ? timeBeforeRemoval != null : !TIME_BEFORE_REMOVAL_EDEFAULT.equals(timeBeforeRemoval);
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT__SYNC_STATE:
				return SYNC_STATE_EDEFAULT == null ? syncState != null : !SYNC_STATE_EDEFAULT.equals(syncState);
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
		result.append(" (SyncType: ");
		result.append(syncType);
		result.append(", ConsistencyEnabled: ");
		result.append(consistencyEnabled);
		result.append(", ConsistencyType: ");
		result.append(consistencyType);
		result.append(", CopyStatus: ");
		result.append(copyStatus);
		result.append(", CopyMethodology: ");
		result.append(copyMethodology);
		result.append(", WhenPointInTime: ");
		result.append(whenPointInTime);
		result.append(", SourceElement: ");
		result.append(sourceElement);
		result.append(", AutoDelete: ");
		result.append(autoDelete);
		result.append(", TimeBeforeRemoval: ");
		result.append(timeBeforeRemoval);
		result.append(", SyncState: ");
		result.append(syncState);
		result.append(')');
		return result.toString();
	}

} //CIM_SynchronizationAspectImpl
