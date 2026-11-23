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

import org.dmtf.cim.CIM_InitiatorTargetLogicalUnitPath;
import org.dmtf.cim.CIM_LogicalDevice;
import org.dmtf.cim.CIM_ProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Initiator Target Logical Unit Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_InitiatorTargetLogicalUnitPathImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InitiatorTargetLogicalUnitPathImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InitiatorTargetLogicalUnitPathImpl#getLogicalUnit <em>Logical Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InitiatorTargetLogicalUnitPathImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_InitiatorTargetLogicalUnitPathImpl extends MinimalEObjectImpl.Container implements CIM_InitiatorTargetLogicalUnitPath {
	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected CIM_ProtocolEndpoint initiator;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CIM_ProtocolEndpoint target;

	/**
	 * The cached value of the '{@link #getLogicalUnit() <em>Logical Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalUnit()
	 * @generated
	 * @ordered
	 */
	protected CIM_LogicalDevice logicalUnit;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final Long STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected Long state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_InitiatorTargetLogicalUnitPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_InitiatorTargetLogicalUnitPath();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolEndpoint getInitiator() {
		if (initiator != null && initiator.eIsProxy()) {
			InternalEObject oldInitiator = (InternalEObject)initiator;
			initiator = (CIM_ProtocolEndpoint)eResolveProxy(oldInitiator);
			if (initiator != oldInitiator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__INITIATOR, oldInitiator, initiator));
			}
		}
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ProtocolEndpoint basicGetInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitiator(CIM_ProtocolEndpoint newInitiator) {
		CIM_ProtocolEndpoint oldInitiator = initiator;
		initiator = newInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__INITIATOR, oldInitiator, initiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolEndpoint getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (CIM_ProtocolEndpoint)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ProtocolEndpoint basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(CIM_ProtocolEndpoint newTarget) {
		CIM_ProtocolEndpoint oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalDevice getLogicalUnit() {
		if (logicalUnit != null && logicalUnit.eIsProxy()) {
			InternalEObject oldLogicalUnit = (InternalEObject)logicalUnit;
			logicalUnit = (CIM_LogicalDevice)eResolveProxy(oldLogicalUnit);
			if (logicalUnit != oldLogicalUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT, oldLogicalUnit, logicalUnit));
			}
		}
		return logicalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_LogicalDevice basicGetLogicalUnit() {
		return logicalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalUnit(CIM_LogicalDevice newLogicalUnit) {
		CIM_LogicalDevice oldLogicalUnit = logicalUnit;
		logicalUnit = newLogicalUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT, oldLogicalUnit, logicalUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(Long newState) {
		Long oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__INITIATOR:
				if (resolve) return getInitiator();
				return basicGetInitiator();
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT:
				if (resolve) return getLogicalUnit();
				return basicGetLogicalUnit();
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__STATE:
				return getState();
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
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__INITIATOR:
				setInitiator((CIM_ProtocolEndpoint)newValue);
				return;
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__TARGET:
				setTarget((CIM_ProtocolEndpoint)newValue);
				return;
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT:
				setLogicalUnit((CIM_LogicalDevice)newValue);
				return;
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__STATE:
				setState((Long)newValue);
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
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__INITIATOR:
				setInitiator((CIM_ProtocolEndpoint)null);
				return;
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__TARGET:
				setTarget((CIM_ProtocolEndpoint)null);
				return;
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT:
				setLogicalUnit((CIM_LogicalDevice)null);
				return;
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__STATE:
				setState(STATE_EDEFAULT);
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
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__INITIATOR:
				return initiator != null;
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__TARGET:
				return target != null;
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__LOGICAL_UNIT:
				return logicalUnit != null;
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
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
		result.append(" (State: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //CIM_InitiatorTargetLogicalUnitPathImpl
