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

import org.dmtf.cim.CIM_LaunchInContextCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Launch In Context Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextCapabilitiesImpl#getMaxRestrictionListSize <em>Max Restriction List Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextCapabilitiesImpl#getMaxLaunchPoints <em>Max Launch Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LaunchInContextCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_LaunchInContextCapabilities {
	/**
	 * The default value of the '{@link #getMaxRestrictionListSize() <em>Max Restriction List Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRestrictionListSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_RESTRICTION_LIST_SIZE_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getMaxRestrictionListSize() <em>Max Restriction List Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRestrictionListSize()
	 * @generated
	 * @ordered
	 */
	protected Integer maxRestrictionListSize = MAX_RESTRICTION_LIST_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLaunchPoints() <em>Max Launch Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLaunchPoints()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LAUNCH_POINTS_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getMaxLaunchPoints() <em>Max Launch Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLaunchPoints()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLaunchPoints = MAX_LAUNCH_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LaunchInContextCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LaunchInContextCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxRestrictionListSize() {
		return maxRestrictionListSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRestrictionListSize(Integer newMaxRestrictionListSize) {
		Integer oldMaxRestrictionListSize = maxRestrictionListSize;
		maxRestrictionListSize = newMaxRestrictionListSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_RESTRICTION_LIST_SIZE, oldMaxRestrictionListSize, maxRestrictionListSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxLaunchPoints() {
		return maxLaunchPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLaunchPoints(Integer newMaxLaunchPoints) {
		Integer oldMaxLaunchPoints = maxLaunchPoints;
		maxLaunchPoints = newMaxLaunchPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_LAUNCH_POINTS, oldMaxLaunchPoints, maxLaunchPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_RESTRICTION_LIST_SIZE:
				return getMaxRestrictionListSize();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_LAUNCH_POINTS:
				return getMaxLaunchPoints();
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
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_RESTRICTION_LIST_SIZE:
				setMaxRestrictionListSize((Integer)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_LAUNCH_POINTS:
				setMaxLaunchPoints((Integer)newValue);
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
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_RESTRICTION_LIST_SIZE:
				setMaxRestrictionListSize(MAX_RESTRICTION_LIST_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_LAUNCH_POINTS:
				setMaxLaunchPoints(MAX_LAUNCH_POINTS_EDEFAULT);
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
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_RESTRICTION_LIST_SIZE:
				return MAX_RESTRICTION_LIST_SIZE_EDEFAULT == null ? maxRestrictionListSize != null : !MAX_RESTRICTION_LIST_SIZE_EDEFAULT.equals(maxRestrictionListSize);
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES__MAX_LAUNCH_POINTS:
				return MAX_LAUNCH_POINTS_EDEFAULT == null ? maxLaunchPoints != null : !MAX_LAUNCH_POINTS_EDEFAULT.equals(maxLaunchPoints);
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
		result.append(" (MaxRestrictionListSize: ");
		result.append(maxRestrictionListSize);
		result.append(", MaxLaunchPoints: ");
		result.append(maxLaunchPoints);
		result.append(')');
		return result.toString();
	}

} //CIM_LaunchInContextCapabilitiesImpl
