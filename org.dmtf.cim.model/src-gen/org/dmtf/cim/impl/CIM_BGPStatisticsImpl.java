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

import org.dmtf.cim.CIM_BGPStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPStatisticsImpl#getInUpdates <em>In Updates</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPStatisticsImpl#getOutUpdates <em>Out Updates</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPStatisticsImpl#getInTotalMessages <em>In Total Messages</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPStatisticsImpl#getOutTotalMessages <em>Out Total Messages</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPStatisticsImpl#getLastError <em>Last Error</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPStatisticsImpl#getFsmEstablishedTransitions <em>Fsm Established Transitions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPStatisticsImpl#getFsmEstablishedTime <em>Fsm Established Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPStatisticsImpl#getInUpdateElapsedTime <em>In Update Elapsed Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPStatisticsImpl extends CIM_ServiceStatisticalInformationImpl implements CIM_BGPStatistics {
	/**
	 * The default value of the '{@link #getInUpdates() <em>In Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInUpdates()
	 * @generated
	 * @ordered
	 */
	protected static final Long IN_UPDATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInUpdates() <em>In Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInUpdates()
	 * @generated
	 * @ordered
	 */
	protected Long inUpdates = IN_UPDATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutUpdates() <em>Out Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutUpdates()
	 * @generated
	 * @ordered
	 */
	protected static final Long OUT_UPDATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutUpdates() <em>Out Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutUpdates()
	 * @generated
	 * @ordered
	 */
	protected Long outUpdates = OUT_UPDATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInTotalMessages() <em>In Total Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTotalMessages()
	 * @generated
	 * @ordered
	 */
	protected static final Long IN_TOTAL_MESSAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInTotalMessages() <em>In Total Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTotalMessages()
	 * @generated
	 * @ordered
	 */
	protected Long inTotalMessages = IN_TOTAL_MESSAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutTotalMessages() <em>Out Total Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutTotalMessages()
	 * @generated
	 * @ordered
	 */
	protected static final Long OUT_TOTAL_MESSAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutTotalMessages() <em>Out Total Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutTotalMessages()
	 * @generated
	 * @ordered
	 */
	protected Long outTotalMessages = OUT_TOTAL_MESSAGES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLastError() <em>Last Error</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastError()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> lastError;

	/**
	 * The default value of the '{@link #getFsmEstablishedTransitions() <em>Fsm Established Transitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsmEstablishedTransitions()
	 * @generated
	 * @ordered
	 */
	protected static final Long FSM_ESTABLISHED_TRANSITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFsmEstablishedTransitions() <em>Fsm Established Transitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsmEstablishedTransitions()
	 * @generated
	 * @ordered
	 */
	protected Long fsmEstablishedTransitions = FSM_ESTABLISHED_TRANSITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFsmEstablishedTime() <em>Fsm Established Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsmEstablishedTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long FSM_ESTABLISHED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFsmEstablishedTime() <em>Fsm Established Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsmEstablishedTime()
	 * @generated
	 * @ordered
	 */
	protected Long fsmEstablishedTime = FSM_ESTABLISHED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInUpdateElapsedTime() <em>In Update Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInUpdateElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long IN_UPDATE_ELAPSED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInUpdateElapsedTime() <em>In Update Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInUpdateElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected Long inUpdateElapsedTime = IN_UPDATE_ELAPSED_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInUpdates() {
		return inUpdates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInUpdates(Long newInUpdates) {
		Long oldInUpdates = inUpdates;
		inUpdates = newInUpdates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_STATISTICS__IN_UPDATES, oldInUpdates, inUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOutUpdates() {
		return outUpdates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutUpdates(Long newOutUpdates) {
		Long oldOutUpdates = outUpdates;
		outUpdates = newOutUpdates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_STATISTICS__OUT_UPDATES, oldOutUpdates, outUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInTotalMessages() {
		return inTotalMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInTotalMessages(Long newInTotalMessages) {
		Long oldInTotalMessages = inTotalMessages;
		inTotalMessages = newInTotalMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_STATISTICS__IN_TOTAL_MESSAGES, oldInTotalMessages, inTotalMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOutTotalMessages() {
		return outTotalMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutTotalMessages(Long newOutTotalMessages) {
		Long oldOutTotalMessages = outTotalMessages;
		outTotalMessages = newOutTotalMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_STATISTICS__OUT_TOTAL_MESSAGES, oldOutTotalMessages, outTotalMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLastError() {
		if (lastError == null) {
			lastError = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_BGP_STATISTICS__LAST_ERROR);
		}
		return lastError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFsmEstablishedTransitions() {
		return fsmEstablishedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFsmEstablishedTransitions(Long newFsmEstablishedTransitions) {
		Long oldFsmEstablishedTransitions = fsmEstablishedTransitions;
		fsmEstablishedTransitions = newFsmEstablishedTransitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TRANSITIONS, oldFsmEstablishedTransitions, fsmEstablishedTransitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFsmEstablishedTime() {
		return fsmEstablishedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFsmEstablishedTime(Long newFsmEstablishedTime) {
		Long oldFsmEstablishedTime = fsmEstablishedTime;
		fsmEstablishedTime = newFsmEstablishedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TIME, oldFsmEstablishedTime, fsmEstablishedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInUpdateElapsedTime() {
		return inUpdateElapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInUpdateElapsedTime(Long newInUpdateElapsedTime) {
		Long oldInUpdateElapsedTime = inUpdateElapsedTime;
		inUpdateElapsedTime = newInUpdateElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_STATISTICS__IN_UPDATE_ELAPSED_TIME, oldInUpdateElapsedTime, inUpdateElapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_STATISTICS__IN_UPDATES:
				return getInUpdates();
			case CimPackage.CIM_BGP_STATISTICS__OUT_UPDATES:
				return getOutUpdates();
			case CimPackage.CIM_BGP_STATISTICS__IN_TOTAL_MESSAGES:
				return getInTotalMessages();
			case CimPackage.CIM_BGP_STATISTICS__OUT_TOTAL_MESSAGES:
				return getOutTotalMessages();
			case CimPackage.CIM_BGP_STATISTICS__LAST_ERROR:
				return getLastError();
			case CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TRANSITIONS:
				return getFsmEstablishedTransitions();
			case CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TIME:
				return getFsmEstablishedTime();
			case CimPackage.CIM_BGP_STATISTICS__IN_UPDATE_ELAPSED_TIME:
				return getInUpdateElapsedTime();
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
			case CimPackage.CIM_BGP_STATISTICS__IN_UPDATES:
				setInUpdates((Long)newValue);
				return;
			case CimPackage.CIM_BGP_STATISTICS__OUT_UPDATES:
				setOutUpdates((Long)newValue);
				return;
			case CimPackage.CIM_BGP_STATISTICS__IN_TOTAL_MESSAGES:
				setInTotalMessages((Long)newValue);
				return;
			case CimPackage.CIM_BGP_STATISTICS__OUT_TOTAL_MESSAGES:
				setOutTotalMessages((Long)newValue);
				return;
			case CimPackage.CIM_BGP_STATISTICS__LAST_ERROR:
				getLastError().clear();
				getLastError().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TRANSITIONS:
				setFsmEstablishedTransitions((Long)newValue);
				return;
			case CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TIME:
				setFsmEstablishedTime((Long)newValue);
				return;
			case CimPackage.CIM_BGP_STATISTICS__IN_UPDATE_ELAPSED_TIME:
				setInUpdateElapsedTime((Long)newValue);
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
			case CimPackage.CIM_BGP_STATISTICS__IN_UPDATES:
				setInUpdates(IN_UPDATES_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_STATISTICS__OUT_UPDATES:
				setOutUpdates(OUT_UPDATES_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_STATISTICS__IN_TOTAL_MESSAGES:
				setInTotalMessages(IN_TOTAL_MESSAGES_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_STATISTICS__OUT_TOTAL_MESSAGES:
				setOutTotalMessages(OUT_TOTAL_MESSAGES_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_STATISTICS__LAST_ERROR:
				getLastError().clear();
				return;
			case CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TRANSITIONS:
				setFsmEstablishedTransitions(FSM_ESTABLISHED_TRANSITIONS_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TIME:
				setFsmEstablishedTime(FSM_ESTABLISHED_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_STATISTICS__IN_UPDATE_ELAPSED_TIME:
				setInUpdateElapsedTime(IN_UPDATE_ELAPSED_TIME_EDEFAULT);
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
			case CimPackage.CIM_BGP_STATISTICS__IN_UPDATES:
				return IN_UPDATES_EDEFAULT == null ? inUpdates != null : !IN_UPDATES_EDEFAULT.equals(inUpdates);
			case CimPackage.CIM_BGP_STATISTICS__OUT_UPDATES:
				return OUT_UPDATES_EDEFAULT == null ? outUpdates != null : !OUT_UPDATES_EDEFAULT.equals(outUpdates);
			case CimPackage.CIM_BGP_STATISTICS__IN_TOTAL_MESSAGES:
				return IN_TOTAL_MESSAGES_EDEFAULT == null ? inTotalMessages != null : !IN_TOTAL_MESSAGES_EDEFAULT.equals(inTotalMessages);
			case CimPackage.CIM_BGP_STATISTICS__OUT_TOTAL_MESSAGES:
				return OUT_TOTAL_MESSAGES_EDEFAULT == null ? outTotalMessages != null : !OUT_TOTAL_MESSAGES_EDEFAULT.equals(outTotalMessages);
			case CimPackage.CIM_BGP_STATISTICS__LAST_ERROR:
				return lastError != null && !lastError.isEmpty();
			case CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TRANSITIONS:
				return FSM_ESTABLISHED_TRANSITIONS_EDEFAULT == null ? fsmEstablishedTransitions != null : !FSM_ESTABLISHED_TRANSITIONS_EDEFAULT.equals(fsmEstablishedTransitions);
			case CimPackage.CIM_BGP_STATISTICS__FSM_ESTABLISHED_TIME:
				return FSM_ESTABLISHED_TIME_EDEFAULT == null ? fsmEstablishedTime != null : !FSM_ESTABLISHED_TIME_EDEFAULT.equals(fsmEstablishedTime);
			case CimPackage.CIM_BGP_STATISTICS__IN_UPDATE_ELAPSED_TIME:
				return IN_UPDATE_ELAPSED_TIME_EDEFAULT == null ? inUpdateElapsedTime != null : !IN_UPDATE_ELAPSED_TIME_EDEFAULT.equals(inUpdateElapsedTime);
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
		result.append(" (InUpdates: ");
		result.append(inUpdates);
		result.append(", OutUpdates: ");
		result.append(outUpdates);
		result.append(", InTotalMessages: ");
		result.append(inTotalMessages);
		result.append(", OutTotalMessages: ");
		result.append(outTotalMessages);
		result.append(", LastError: ");
		result.append(lastError);
		result.append(", FsmEstablishedTransitions: ");
		result.append(fsmEstablishedTransitions);
		result.append(", FsmEstablishedTime: ");
		result.append(fsmEstablishedTime);
		result.append(", InUpdateElapsedTime: ");
		result.append(inUpdateElapsedTime);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPStatisticsImpl
