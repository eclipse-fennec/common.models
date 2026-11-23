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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_TierDomain;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Tier Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierDomainImpl#getDataMovement <em>Data Movement</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierDomainImpl#getDataMovementState <em>Data Movement State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TierDomainImpl extends CIM_AdminDomainImpl implements CIM_TierDomain {
	/**
	 * The default value of the '{@link #getDataMovement() <em>Data Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMovement()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_MOVEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataMovement() <em>Data Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMovement()
	 * @generated
	 * @ordered
	 */
	protected Integer dataMovement = DATA_MOVEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataMovementState() <em>Data Movement State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMovementState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_MOVEMENT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataMovementState() <em>Data Movement State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMovementState()
	 * @generated
	 * @ordered
	 */
	protected Integer dataMovementState = DATA_MOVEMENT_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TierDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TierDomain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataMovement() {
		return dataMovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataMovement(Integer newDataMovement) {
		Integer oldDataMovement = dataMovement;
		dataMovement = newDataMovement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT, oldDataMovement, dataMovement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataMovementState() {
		return dataMovementState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataMovementState(Integer newDataMovementState) {
		Integer oldDataMovementState = dataMovementState;
		dataMovementState = newDataMovementState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT_STATE, oldDataMovementState, dataMovementState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RequestDataMovementStateChange(Integer RequestedState, Integer ProvisioningType, String TimeoutPeriod, String StartTime, String DataMovementInterval) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT:
				return getDataMovement();
			case CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT_STATE:
				return getDataMovementState();
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
			case CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT:
				setDataMovement((Integer)newValue);
				return;
			case CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT_STATE:
				setDataMovementState((Integer)newValue);
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
			case CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT:
				setDataMovement(DATA_MOVEMENT_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT_STATE:
				setDataMovementState(DATA_MOVEMENT_STATE_EDEFAULT);
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
			case CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT:
				return DATA_MOVEMENT_EDEFAULT == null ? dataMovement != null : !DATA_MOVEMENT_EDEFAULT.equals(dataMovement);
			case CimPackage.CIM_TIER_DOMAIN__DATA_MOVEMENT_STATE:
				return DATA_MOVEMENT_STATE_EDEFAULT == null ? dataMovementState != null : !DATA_MOVEMENT_STATE_EDEFAULT.equals(dataMovementState);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_TIER_DOMAIN___REQUEST_DATA_MOVEMENT_STATE_CHANGE__INTEGER_INTEGER_STRING_STRING_STRING:
				return RequestDataMovementStateChange((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (DataMovement: ");
		result.append(dataMovement);
		result.append(", DataMovementState: ");
		result.append(dataMovementState);
		result.append(')');
		return result.toString();
	}

} //CIM_TierDomainImpl
