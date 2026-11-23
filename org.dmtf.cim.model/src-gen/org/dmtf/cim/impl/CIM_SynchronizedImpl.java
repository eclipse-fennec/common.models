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

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_Synchronized;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Synchronized</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getSyncedElement <em>Synced Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getWhenSynced <em>When Synced</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getSyncMaintained <em>Sync Maintained</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getCopyRecoveryMode <em>Copy Recovery Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getCopyState <em>Copy State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getFailedCopyStopsHostIO <em>Failed Copy Stops Host IO</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getPercentSynced <em>Percent Synced</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getProgressStatus <em>Progress Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getRPO <em>RPO</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getRequestedCopyState <em>Requested Copy State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getSkew <em>Skew</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getSyncType <em>Sync Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getWhenActivated <em>When Activated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getWhenDeactivated <em>When Deactivated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getWhenEstablished <em>When Established</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getWhenSuspended <em>When Suspended</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SynchronizedImpl#getWhenSynchronized <em>When Synchronized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SynchronizedImpl extends MinimalEObjectImpl.Container implements CIM_Synchronized {
	/**
	 * The cached value of the '{@link #getSystemElement() <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement systemElement;

	/**
	 * The cached value of the '{@link #getSyncedElement() <em>Synced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncedElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement syncedElement;

	/**
	 * The default value of the '{@link #getWhenSynced() <em>When Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenSynced()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_SYNCED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenSynced() <em>When Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenSynced()
	 * @generated
	 * @ordered
	 */
	protected String whenSynced = WHEN_SYNCED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncMaintained() <em>Sync Maintained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncMaintained()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYNC_MAINTAINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyncMaintained() <em>Sync Maintained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncMaintained()
	 * @generated
	 * @ordered
	 */
	protected Boolean syncMaintained = SYNC_MAINTAINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyRecoveryMode() <em>Copy Recovery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRecoveryMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_RECOVERY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyRecoveryMode() <em>Copy Recovery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRecoveryMode()
	 * @generated
	 * @ordered
	 */
	protected Integer copyRecoveryMode = COPY_RECOVERY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyState() <em>Copy State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyState() <em>Copy State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyState()
	 * @generated
	 * @ordered
	 */
	protected Integer copyState = COPY_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailedCopyStopsHostIO() <em>Failed Copy Stops Host IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedCopyStopsHostIO()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FAILED_COPY_STOPS_HOST_IO_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getFailedCopyStopsHostIO() <em>Failed Copy Stops Host IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedCopyStopsHostIO()
	 * @generated
	 * @ordered
	 */
	protected Boolean failedCopyStopsHostIO = FAILED_COPY_STOPS_HOST_IO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Integer mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentSynced() <em>Percent Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentSynced()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENT_SYNCED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentSynced() <em>Percent Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentSynced()
	 * @generated
	 * @ordered
	 */
	protected Integer percentSynced = PERCENT_SYNCED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgressStatus() <em>Progress Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROGRESS_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgressStatus() <em>Progress Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer progressStatus = PROGRESS_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRPO() <em>RPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPO()
	 * @generated
	 * @ordered
	 */
	protected static final String RPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRPO() <em>RPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPO()
	 * @generated
	 * @ordered
	 */
	protected String rpo = RPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestedCopyState() <em>Requested Copy State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedCopyState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUESTED_COPY_STATE_EDEFAULT = Integer.valueOf(15);

	/**
	 * The cached value of the '{@link #getRequestedCopyState() <em>Requested Copy State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedCopyState()
	 * @generated
	 * @ordered
	 */
	protected Integer requestedCopyState = REQUESTED_COPY_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkew() <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkew()
	 * @generated
	 * @ordered
	 */
	protected static final Long SKEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkew() <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkew()
	 * @generated
	 * @ordered
	 */
	protected Long skew = SKEW_EDEFAULT;

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
	 * The default value of the '{@link #getWhenActivated() <em>When Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenActivated()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_ACTIVATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenActivated() <em>When Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenActivated()
	 * @generated
	 * @ordered
	 */
	protected String whenActivated = WHEN_ACTIVATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhenDeactivated() <em>When Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenDeactivated()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_DEACTIVATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenDeactivated() <em>When Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenDeactivated()
	 * @generated
	 * @ordered
	 */
	protected String whenDeactivated = WHEN_DEACTIVATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhenEstablished() <em>When Established</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenEstablished()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_ESTABLISHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenEstablished() <em>When Established</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenEstablished()
	 * @generated
	 * @ordered
	 */
	protected String whenEstablished = WHEN_ESTABLISHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhenSuspended() <em>When Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_SUSPENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenSuspended() <em>When Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenSuspended()
	 * @generated
	 * @ordered
	 */
	protected String whenSuspended = WHEN_SUSPENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhenSynchronized() <em>When Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_SYNCHRONIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenSynchronized() <em>When Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenSynchronized()
	 * @generated
	 * @ordered
	 */
	protected String whenSynchronized = WHEN_SYNCHRONIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SynchronizedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Synchronized();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getSystemElement() {
		if (systemElement != null && systemElement.eIsProxy()) {
			InternalEObject oldSystemElement = (InternalEObject)systemElement;
			systemElement = (CIM_ManagedElement)eResolveProxy(oldSystemElement);
			if (systemElement != oldSystemElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SYNCHRONIZED__SYSTEM_ELEMENT, oldSystemElement, systemElement));
			}
		}
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetSystemElement() {
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemElement(CIM_ManagedElement newSystemElement) {
		CIM_ManagedElement oldSystemElement = systemElement;
		systemElement = newSystemElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__SYSTEM_ELEMENT, oldSystemElement, systemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getSyncedElement() {
		if (syncedElement != null && syncedElement.eIsProxy()) {
			InternalEObject oldSyncedElement = (InternalEObject)syncedElement;
			syncedElement = (CIM_ManagedElement)eResolveProxy(oldSyncedElement);
			if (syncedElement != oldSyncedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SYNCHRONIZED__SYNCED_ELEMENT, oldSyncedElement, syncedElement));
			}
		}
		return syncedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetSyncedElement() {
		return syncedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncedElement(CIM_ManagedElement newSyncedElement) {
		CIM_ManagedElement oldSyncedElement = syncedElement;
		syncedElement = newSyncedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__SYNCED_ELEMENT, oldSyncedElement, syncedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhenSynced() {
		return whenSynced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhenSynced(String newWhenSynced) {
		String oldWhenSynced = whenSynced;
		whenSynced = newWhenSynced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCED, oldWhenSynced, whenSynced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSyncMaintained() {
		return syncMaintained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncMaintained(Boolean newSyncMaintained) {
		Boolean oldSyncMaintained = syncMaintained;
		syncMaintained = newSyncMaintained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__SYNC_MAINTAINED, oldSyncMaintained, syncMaintained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyRecoveryMode() {
		return copyRecoveryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyRecoveryMode(Integer newCopyRecoveryMode) {
		Integer oldCopyRecoveryMode = copyRecoveryMode;
		copyRecoveryMode = newCopyRecoveryMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__COPY_RECOVERY_MODE, oldCopyRecoveryMode, copyRecoveryMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyState() {
		return copyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyState(Integer newCopyState) {
		Integer oldCopyState = copyState;
		copyState = newCopyState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__COPY_STATE, oldCopyState, copyState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFailedCopyStopsHostIO() {
		return failedCopyStopsHostIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailedCopyStopsHostIO(Boolean newFailedCopyStopsHostIO) {
		Boolean oldFailedCopyStopsHostIO = failedCopyStopsHostIO;
		failedCopyStopsHostIO = newFailedCopyStopsHostIO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__FAILED_COPY_STOPS_HOST_IO, oldFailedCopyStopsHostIO, failedCopyStopsHostIO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(Integer newMode) {
		Integer oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentSynced() {
		return percentSynced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentSynced(Integer newPercentSynced) {
		Integer oldPercentSynced = percentSynced;
		percentSynced = newPercentSynced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__PERCENT_SYNCED, oldPercentSynced, percentSynced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProgressStatus() {
		return progressStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgressStatus(Integer newProgressStatus) {
		Integer oldProgressStatus = progressStatus;
		progressStatus = newProgressStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__PROGRESS_STATUS, oldProgressStatus, progressStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRPO() {
		return rpo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRPO(String newRPO) {
		String oldRPO = rpo;
		rpo = newRPO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__RPO, oldRPO, rpo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRequestedCopyState() {
		return requestedCopyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedCopyState(Integer newRequestedCopyState) {
		Integer oldRequestedCopyState = requestedCopyState;
		requestedCopyState = newRequestedCopyState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__REQUESTED_COPY_STATE, oldRequestedCopyState, requestedCopyState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSkew() {
		return skew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkew(Long newSkew) {
		Long oldSkew = skew;
		skew = newSkew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__SKEW, oldSkew, skew));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__SYNC_TYPE, oldSyncType, syncType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhenActivated() {
		return whenActivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhenActivated(String newWhenActivated) {
		String oldWhenActivated = whenActivated;
		whenActivated = newWhenActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__WHEN_ACTIVATED, oldWhenActivated, whenActivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhenDeactivated() {
		return whenDeactivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhenDeactivated(String newWhenDeactivated) {
		String oldWhenDeactivated = whenDeactivated;
		whenDeactivated = newWhenDeactivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__WHEN_DEACTIVATED, oldWhenDeactivated, whenDeactivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhenEstablished() {
		return whenEstablished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhenEstablished(String newWhenEstablished) {
		String oldWhenEstablished = whenEstablished;
		whenEstablished = newWhenEstablished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__WHEN_ESTABLISHED, oldWhenEstablished, whenEstablished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhenSuspended() {
		return whenSuspended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhenSuspended(String newWhenSuspended) {
		String oldWhenSuspended = whenSuspended;
		whenSuspended = newWhenSuspended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__WHEN_SUSPENDED, oldWhenSuspended, whenSuspended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhenSynchronized() {
		return whenSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhenSynchronized(String newWhenSynchronized) {
		String oldWhenSynchronized = whenSynchronized;
		whenSynchronized = newWhenSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCHRONIZED, oldWhenSynchronized, whenSynchronized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SYNCHRONIZED__SYSTEM_ELEMENT:
				if (resolve) return getSystemElement();
				return basicGetSystemElement();
			case CimPackage.CIM_SYNCHRONIZED__SYNCED_ELEMENT:
				if (resolve) return getSyncedElement();
				return basicGetSyncedElement();
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCED:
				return getWhenSynced();
			case CimPackage.CIM_SYNCHRONIZED__SYNC_MAINTAINED:
				return getSyncMaintained();
			case CimPackage.CIM_SYNCHRONIZED__COPY_RECOVERY_MODE:
				return getCopyRecoveryMode();
			case CimPackage.CIM_SYNCHRONIZED__COPY_STATE:
				return getCopyState();
			case CimPackage.CIM_SYNCHRONIZED__FAILED_COPY_STOPS_HOST_IO:
				return getFailedCopyStopsHostIO();
			case CimPackage.CIM_SYNCHRONIZED__MODE:
				return getMode();
			case CimPackage.CIM_SYNCHRONIZED__PERCENT_SYNCED:
				return getPercentSynced();
			case CimPackage.CIM_SYNCHRONIZED__PROGRESS_STATUS:
				return getProgressStatus();
			case CimPackage.CIM_SYNCHRONIZED__RPO:
				return getRPO();
			case CimPackage.CIM_SYNCHRONIZED__REQUESTED_COPY_STATE:
				return getRequestedCopyState();
			case CimPackage.CIM_SYNCHRONIZED__SKEW:
				return getSkew();
			case CimPackage.CIM_SYNCHRONIZED__SYNC_TYPE:
				return getSyncType();
			case CimPackage.CIM_SYNCHRONIZED__WHEN_ACTIVATED:
				return getWhenActivated();
			case CimPackage.CIM_SYNCHRONIZED__WHEN_DEACTIVATED:
				return getWhenDeactivated();
			case CimPackage.CIM_SYNCHRONIZED__WHEN_ESTABLISHED:
				return getWhenEstablished();
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SUSPENDED:
				return getWhenSuspended();
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCHRONIZED:
				return getWhenSynchronized();
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
			case CimPackage.CIM_SYNCHRONIZED__SYSTEM_ELEMENT:
				setSystemElement((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__SYNCED_ELEMENT:
				setSyncedElement((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCED:
				setWhenSynced((String)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__SYNC_MAINTAINED:
				setSyncMaintained((Boolean)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__COPY_RECOVERY_MODE:
				setCopyRecoveryMode((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__COPY_STATE:
				setCopyState((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__FAILED_COPY_STOPS_HOST_IO:
				setFailedCopyStopsHostIO((Boolean)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__MODE:
				setMode((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__PERCENT_SYNCED:
				setPercentSynced((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__PROGRESS_STATUS:
				setProgressStatus((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__RPO:
				setRPO((String)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__REQUESTED_COPY_STATE:
				setRequestedCopyState((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__SKEW:
				setSkew((Long)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__SYNC_TYPE:
				setSyncType((Integer)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_ACTIVATED:
				setWhenActivated((String)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_DEACTIVATED:
				setWhenDeactivated((String)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_ESTABLISHED:
				setWhenEstablished((String)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SUSPENDED:
				setWhenSuspended((String)newValue);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCHRONIZED:
				setWhenSynchronized((String)newValue);
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
			case CimPackage.CIM_SYNCHRONIZED__SYSTEM_ELEMENT:
				setSystemElement((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_SYNCHRONIZED__SYNCED_ELEMENT:
				setSyncedElement((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCED:
				setWhenSynced(WHEN_SYNCED_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__SYNC_MAINTAINED:
				setSyncMaintained(SYNC_MAINTAINED_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__COPY_RECOVERY_MODE:
				setCopyRecoveryMode(COPY_RECOVERY_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__COPY_STATE:
				setCopyState(COPY_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__FAILED_COPY_STOPS_HOST_IO:
				setFailedCopyStopsHostIO(FAILED_COPY_STOPS_HOST_IO_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__PERCENT_SYNCED:
				setPercentSynced(PERCENT_SYNCED_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__PROGRESS_STATUS:
				setProgressStatus(PROGRESS_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__RPO:
				setRPO(RPO_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__REQUESTED_COPY_STATE:
				setRequestedCopyState(REQUESTED_COPY_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__SKEW:
				setSkew(SKEW_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__SYNC_TYPE:
				setSyncType(SYNC_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_ACTIVATED:
				setWhenActivated(WHEN_ACTIVATED_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_DEACTIVATED:
				setWhenDeactivated(WHEN_DEACTIVATED_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_ESTABLISHED:
				setWhenEstablished(WHEN_ESTABLISHED_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SUSPENDED:
				setWhenSuspended(WHEN_SUSPENDED_EDEFAULT);
				return;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCHRONIZED:
				setWhenSynchronized(WHEN_SYNCHRONIZED_EDEFAULT);
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
			case CimPackage.CIM_SYNCHRONIZED__SYSTEM_ELEMENT:
				return systemElement != null;
			case CimPackage.CIM_SYNCHRONIZED__SYNCED_ELEMENT:
				return syncedElement != null;
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCED:
				return WHEN_SYNCED_EDEFAULT == null ? whenSynced != null : !WHEN_SYNCED_EDEFAULT.equals(whenSynced);
			case CimPackage.CIM_SYNCHRONIZED__SYNC_MAINTAINED:
				return SYNC_MAINTAINED_EDEFAULT == null ? syncMaintained != null : !SYNC_MAINTAINED_EDEFAULT.equals(syncMaintained);
			case CimPackage.CIM_SYNCHRONIZED__COPY_RECOVERY_MODE:
				return COPY_RECOVERY_MODE_EDEFAULT == null ? copyRecoveryMode != null : !COPY_RECOVERY_MODE_EDEFAULT.equals(copyRecoveryMode);
			case CimPackage.CIM_SYNCHRONIZED__COPY_STATE:
				return COPY_STATE_EDEFAULT == null ? copyState != null : !COPY_STATE_EDEFAULT.equals(copyState);
			case CimPackage.CIM_SYNCHRONIZED__FAILED_COPY_STOPS_HOST_IO:
				return FAILED_COPY_STOPS_HOST_IO_EDEFAULT == null ? failedCopyStopsHostIO != null : !FAILED_COPY_STOPS_HOST_IO_EDEFAULT.equals(failedCopyStopsHostIO);
			case CimPackage.CIM_SYNCHRONIZED__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case CimPackage.CIM_SYNCHRONIZED__PERCENT_SYNCED:
				return PERCENT_SYNCED_EDEFAULT == null ? percentSynced != null : !PERCENT_SYNCED_EDEFAULT.equals(percentSynced);
			case CimPackage.CIM_SYNCHRONIZED__PROGRESS_STATUS:
				return PROGRESS_STATUS_EDEFAULT == null ? progressStatus != null : !PROGRESS_STATUS_EDEFAULT.equals(progressStatus);
			case CimPackage.CIM_SYNCHRONIZED__RPO:
				return RPO_EDEFAULT == null ? rpo != null : !RPO_EDEFAULT.equals(rpo);
			case CimPackage.CIM_SYNCHRONIZED__REQUESTED_COPY_STATE:
				return REQUESTED_COPY_STATE_EDEFAULT == null ? requestedCopyState != null : !REQUESTED_COPY_STATE_EDEFAULT.equals(requestedCopyState);
			case CimPackage.CIM_SYNCHRONIZED__SKEW:
				return SKEW_EDEFAULT == null ? skew != null : !SKEW_EDEFAULT.equals(skew);
			case CimPackage.CIM_SYNCHRONIZED__SYNC_TYPE:
				return SYNC_TYPE_EDEFAULT == null ? syncType != null : !SYNC_TYPE_EDEFAULT.equals(syncType);
			case CimPackage.CIM_SYNCHRONIZED__WHEN_ACTIVATED:
				return WHEN_ACTIVATED_EDEFAULT == null ? whenActivated != null : !WHEN_ACTIVATED_EDEFAULT.equals(whenActivated);
			case CimPackage.CIM_SYNCHRONIZED__WHEN_DEACTIVATED:
				return WHEN_DEACTIVATED_EDEFAULT == null ? whenDeactivated != null : !WHEN_DEACTIVATED_EDEFAULT.equals(whenDeactivated);
			case CimPackage.CIM_SYNCHRONIZED__WHEN_ESTABLISHED:
				return WHEN_ESTABLISHED_EDEFAULT == null ? whenEstablished != null : !WHEN_ESTABLISHED_EDEFAULT.equals(whenEstablished);
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SUSPENDED:
				return WHEN_SUSPENDED_EDEFAULT == null ? whenSuspended != null : !WHEN_SUSPENDED_EDEFAULT.equals(whenSuspended);
			case CimPackage.CIM_SYNCHRONIZED__WHEN_SYNCHRONIZED:
				return WHEN_SYNCHRONIZED_EDEFAULT == null ? whenSynchronized != null : !WHEN_SYNCHRONIZED_EDEFAULT.equals(whenSynchronized);
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
		result.append(" (WhenSynced: ");
		result.append(whenSynced);
		result.append(", SyncMaintained: ");
		result.append(syncMaintained);
		result.append(", CopyRecoveryMode: ");
		result.append(copyRecoveryMode);
		result.append(", CopyState: ");
		result.append(copyState);
		result.append(", FailedCopyStopsHostIO: ");
		result.append(failedCopyStopsHostIO);
		result.append(", Mode: ");
		result.append(mode);
		result.append(", PercentSynced: ");
		result.append(percentSynced);
		result.append(", ProgressStatus: ");
		result.append(progressStatus);
		result.append(", RPO: ");
		result.append(rpo);
		result.append(", RequestedCopyState: ");
		result.append(requestedCopyState);
		result.append(", Skew: ");
		result.append(skew);
		result.append(", SyncType: ");
		result.append(syncType);
		result.append(", WhenActivated: ");
		result.append(whenActivated);
		result.append(", WhenDeactivated: ");
		result.append(whenDeactivated);
		result.append(", WhenEstablished: ");
		result.append(whenEstablished);
		result.append(", WhenSuspended: ");
		result.append(whenSuspended);
		result.append(", WhenSynchronized: ");
		result.append(whenSynchronized);
		result.append(')');
		return result.toString();
	}

} //CIM_SynchronizedImpl
