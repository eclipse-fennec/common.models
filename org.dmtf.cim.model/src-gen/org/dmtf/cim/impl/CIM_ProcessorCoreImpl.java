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

import org.dmtf.cim.CIM_ProcessorCore;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Processor Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorCoreImpl#getCoreEnabledState <em>Core Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorCoreImpl#getLoadPercentage <em>Load Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProcessorCoreImpl extends CIM_EnabledLogicalElementImpl implements CIM_ProcessorCore {
	/**
	 * The default value of the '{@link #getCoreEnabledState() <em>Core Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CORE_ENABLED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoreEnabledState() <em>Core Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreEnabledState()
	 * @generated
	 * @ordered
	 */
	protected Integer coreEnabledState = CORE_ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadPercentage() <em>Load Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOAD_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadPercentage() <em>Load Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadPercentage()
	 * @generated
	 * @ordered
	 */
	protected Integer loadPercentage = LOAD_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProcessorCoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProcessorCore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCoreEnabledState() {
		return coreEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoreEnabledState(Integer newCoreEnabledState) {
		Integer oldCoreEnabledState = coreEnabledState;
		coreEnabledState = newCoreEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR_CORE__CORE_ENABLED_STATE, oldCoreEnabledState, coreEnabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLoadPercentage() {
		return loadPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadPercentage(Integer newLoadPercentage) {
		Integer oldLoadPercentage = loadPercentage;
		loadPercentage = newLoadPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR_CORE__LOAD_PERCENTAGE, oldLoadPercentage, loadPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROCESSOR_CORE__CORE_ENABLED_STATE:
				return getCoreEnabledState();
			case CimPackage.CIM_PROCESSOR_CORE__LOAD_PERCENTAGE:
				return getLoadPercentage();
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
			case CimPackage.CIM_PROCESSOR_CORE__CORE_ENABLED_STATE:
				setCoreEnabledState((Integer)newValue);
				return;
			case CimPackage.CIM_PROCESSOR_CORE__LOAD_PERCENTAGE:
				setLoadPercentage((Integer)newValue);
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
			case CimPackage.CIM_PROCESSOR_CORE__CORE_ENABLED_STATE:
				setCoreEnabledState(CORE_ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR_CORE__LOAD_PERCENTAGE:
				setLoadPercentage(LOAD_PERCENTAGE_EDEFAULT);
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
			case CimPackage.CIM_PROCESSOR_CORE__CORE_ENABLED_STATE:
				return CORE_ENABLED_STATE_EDEFAULT == null ? coreEnabledState != null : !CORE_ENABLED_STATE_EDEFAULT.equals(coreEnabledState);
			case CimPackage.CIM_PROCESSOR_CORE__LOAD_PERCENTAGE:
				return LOAD_PERCENTAGE_EDEFAULT == null ? loadPercentage != null : !LOAD_PERCENTAGE_EDEFAULT.equals(loadPercentage);
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
		result.append(" (CoreEnabledState: ");
		result.append(coreEnabledState);
		result.append(", LoadPercentage: ");
		result.append(loadPercentage);
		result.append(')');
		return result.toString();
	}

} //CIM_ProcessorCoreImpl
