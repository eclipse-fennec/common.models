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

import org.dmtf.cim.CIM_UnitOfWork;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unit Of Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkImpl#getUoWDefId <em>Uo WDef Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkImpl#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkImpl#getTraceLevel <em>Trace Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkImpl#getMutualContextId <em>Mutual Context Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnitOfWorkImpl extends CIM_ManagedElementImpl implements CIM_UnitOfWork {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUoWDefId() <em>Uo WDef Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUoWDefId()
	 * @generated
	 * @ordered
	 */
	protected static final String UO_WDEF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUoWDefId() <em>Uo WDef Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUoWDefId()
	 * @generated
	 * @ordered
	 */
	protected String uoWDefId = UO_WDEF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String ELAPSED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected String elapsedTime = ELAPSED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceLevel() <em>Trace Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Long TRACE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceLevel() <em>Trace Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLevel()
	 * @generated
	 * @ordered
	 */
	protected Long traceLevel = TRACE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMutualContextId() <em>Mutual Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualContextId()
	 * @generated
	 * @ordered
	 */
	protected static final String MUTUAL_CONTEXT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMutualContextId() <em>Mutual Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualContextId()
	 * @generated
	 * @ordered
	 */
	protected String mutualContextId = MUTUAL_CONTEXT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnitOfWorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnitOfWork();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		Long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUoWDefId() {
		return uoWDefId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUoWDefId(String newUoWDefId) {
		String oldUoWDefId = uoWDefId;
		uoWDefId = newUoWDefId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK__UO_WDEF_ID, oldUoWDefId, uoWDefId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(String newStartTime) {
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElapsedTime(String newElapsedTime) {
		String oldElapsedTime = elapsedTime;
		elapsedTime = newElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK__ELAPSED_TIME, oldElapsedTime, elapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Integer newStatus) {
		Integer oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTraceLevel() {
		return traceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraceLevel(Long newTraceLevel) {
		Long oldTraceLevel = traceLevel;
		traceLevel = newTraceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK__TRACE_LEVEL, oldTraceLevel, traceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMutualContextId() {
		return mutualContextId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutualContextId(String newMutualContextId) {
		String oldMutualContextId = mutualContextId;
		mutualContextId = newMutualContextId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK__MUTUAL_CONTEXT_ID, oldMutualContextId, mutualContextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIT_OF_WORK__ID:
				return getId();
			case CimPackage.CIM_UNIT_OF_WORK__UO_WDEF_ID:
				return getUoWDefId();
			case CimPackage.CIM_UNIT_OF_WORK__USER_NAME:
				return getUserName();
			case CimPackage.CIM_UNIT_OF_WORK__START_TIME:
				return getStartTime();
			case CimPackage.CIM_UNIT_OF_WORK__ELAPSED_TIME:
				return getElapsedTime();
			case CimPackage.CIM_UNIT_OF_WORK__STATUS:
				return getStatus();
			case CimPackage.CIM_UNIT_OF_WORK__TRACE_LEVEL:
				return getTraceLevel();
			case CimPackage.CIM_UNIT_OF_WORK__MUTUAL_CONTEXT_ID:
				return getMutualContextId();
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
			case CimPackage.CIM_UNIT_OF_WORK__ID:
				setId((Long)newValue);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__UO_WDEF_ID:
				setUoWDefId((String)newValue);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__USER_NAME:
				setUserName((String)newValue);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__START_TIME:
				setStartTime((String)newValue);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__ELAPSED_TIME:
				setElapsedTime((String)newValue);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__STATUS:
				setStatus((Integer)newValue);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__TRACE_LEVEL:
				setTraceLevel((Long)newValue);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__MUTUAL_CONTEXT_ID:
				setMutualContextId((String)newValue);
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
			case CimPackage.CIM_UNIT_OF_WORK__ID:
				setId(ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__UO_WDEF_ID:
				setUoWDefId(UO_WDEF_ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__ELAPSED_TIME:
				setElapsedTime(ELAPSED_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__TRACE_LEVEL:
				setTraceLevel(TRACE_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_UNIT_OF_WORK__MUTUAL_CONTEXT_ID:
				setMutualContextId(MUTUAL_CONTEXT_ID_EDEFAULT);
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
			case CimPackage.CIM_UNIT_OF_WORK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CimPackage.CIM_UNIT_OF_WORK__UO_WDEF_ID:
				return UO_WDEF_ID_EDEFAULT == null ? uoWDefId != null : !UO_WDEF_ID_EDEFAULT.equals(uoWDefId);
			case CimPackage.CIM_UNIT_OF_WORK__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case CimPackage.CIM_UNIT_OF_WORK__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CimPackage.CIM_UNIT_OF_WORK__ELAPSED_TIME:
				return ELAPSED_TIME_EDEFAULT == null ? elapsedTime != null : !ELAPSED_TIME_EDEFAULT.equals(elapsedTime);
			case CimPackage.CIM_UNIT_OF_WORK__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case CimPackage.CIM_UNIT_OF_WORK__TRACE_LEVEL:
				return TRACE_LEVEL_EDEFAULT == null ? traceLevel != null : !TRACE_LEVEL_EDEFAULT.equals(traceLevel);
			case CimPackage.CIM_UNIT_OF_WORK__MUTUAL_CONTEXT_ID:
				return MUTUAL_CONTEXT_ID_EDEFAULT == null ? mutualContextId != null : !MUTUAL_CONTEXT_ID_EDEFAULT.equals(mutualContextId);
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
		result.append(" (Id: ");
		result.append(id);
		result.append(", UoWDefId: ");
		result.append(uoWDefId);
		result.append(", UserName: ");
		result.append(userName);
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(", ElapsedTime: ");
		result.append(elapsedTime);
		result.append(", Status: ");
		result.append(status);
		result.append(", TraceLevel: ");
		result.append(traceLevel);
		result.append(", MutualContextId: ");
		result.append(mutualContextId);
		result.append(')');
		return result.toString();
	}

} //CIM_UnitOfWorkImpl
