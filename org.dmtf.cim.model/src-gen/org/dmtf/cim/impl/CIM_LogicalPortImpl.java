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

import org.dmtf.cim.CIM_LogicalPort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortImpl#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortImpl#getRequestedSpeed <em>Requested Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortImpl#getUsageRestriction <em>Usage Restriction</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortImpl#getOtherPortType <em>Other Port Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogicalPortImpl extends CIM_LogicalDeviceImpl implements CIM_LogicalPort {
	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long maxSpeed = MAX_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestedSpeed() <em>Requested Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUESTED_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestedSpeed() <em>Requested Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long requestedSpeed = REQUESTED_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageRestriction() <em>Usage Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRestriction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USAGE_RESTRICTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageRestriction() <em>Usage Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRestriction()
	 * @generated
	 * @ordered
	 */
	protected Integer usageRestriction = USAGE_RESTRICTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected Integer portType = PORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPortType() <em>Other Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPortType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPortType() <em>Other Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPortType()
	 * @generated
	 * @ordered
	 */
	protected String otherPortType = OTHER_PORT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(Long newSpeed) {
		Long oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSpeed(Long newMaxSpeed) {
		Long oldMaxSpeed = maxSpeed;
		maxSpeed = newMaxSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT__MAX_SPEED, oldMaxSpeed, maxSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRequestedSpeed() {
		return requestedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedSpeed(Long newRequestedSpeed) {
		Long oldRequestedSpeed = requestedSpeed;
		requestedSpeed = newRequestedSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT__REQUESTED_SPEED, oldRequestedSpeed, requestedSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUsageRestriction() {
		return usageRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageRestriction(Integer newUsageRestriction) {
		Integer oldUsageRestriction = usageRestriction;
		usageRestriction = newUsageRestriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT__USAGE_RESTRICTION, oldUsageRestriction, usageRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortType(Integer newPortType) {
		Integer oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPortType() {
		return otherPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPortType(String newOtherPortType) {
		String oldOtherPortType = otherPortType;
		otherPortType = newOtherPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT__OTHER_PORT_TYPE, oldOtherPortType, otherPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_PORT__SPEED:
				return getSpeed();
			case CimPackage.CIM_LOGICAL_PORT__MAX_SPEED:
				return getMaxSpeed();
			case CimPackage.CIM_LOGICAL_PORT__REQUESTED_SPEED:
				return getRequestedSpeed();
			case CimPackage.CIM_LOGICAL_PORT__USAGE_RESTRICTION:
				return getUsageRestriction();
			case CimPackage.CIM_LOGICAL_PORT__PORT_TYPE:
				return getPortType();
			case CimPackage.CIM_LOGICAL_PORT__OTHER_PORT_TYPE:
				return getOtherPortType();
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
			case CimPackage.CIM_LOGICAL_PORT__SPEED:
				setSpeed((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT__MAX_SPEED:
				setMaxSpeed((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT__REQUESTED_SPEED:
				setRequestedSpeed((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT__USAGE_RESTRICTION:
				setUsageRestriction((Integer)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT__PORT_TYPE:
				setPortType((Integer)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT__OTHER_PORT_TYPE:
				setOtherPortType((String)newValue);
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
			case CimPackage.CIM_LOGICAL_PORT__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT__MAX_SPEED:
				setMaxSpeed(MAX_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT__REQUESTED_SPEED:
				setRequestedSpeed(REQUESTED_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT__USAGE_RESTRICTION:
				setUsageRestriction(USAGE_RESTRICTION_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT__PORT_TYPE:
				setPortType(PORT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT__OTHER_PORT_TYPE:
				setOtherPortType(OTHER_PORT_TYPE_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_PORT__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case CimPackage.CIM_LOGICAL_PORT__MAX_SPEED:
				return MAX_SPEED_EDEFAULT == null ? maxSpeed != null : !MAX_SPEED_EDEFAULT.equals(maxSpeed);
			case CimPackage.CIM_LOGICAL_PORT__REQUESTED_SPEED:
				return REQUESTED_SPEED_EDEFAULT == null ? requestedSpeed != null : !REQUESTED_SPEED_EDEFAULT.equals(requestedSpeed);
			case CimPackage.CIM_LOGICAL_PORT__USAGE_RESTRICTION:
				return USAGE_RESTRICTION_EDEFAULT == null ? usageRestriction != null : !USAGE_RESTRICTION_EDEFAULT.equals(usageRestriction);
			case CimPackage.CIM_LOGICAL_PORT__PORT_TYPE:
				return PORT_TYPE_EDEFAULT == null ? portType != null : !PORT_TYPE_EDEFAULT.equals(portType);
			case CimPackage.CIM_LOGICAL_PORT__OTHER_PORT_TYPE:
				return OTHER_PORT_TYPE_EDEFAULT == null ? otherPortType != null : !OTHER_PORT_TYPE_EDEFAULT.equals(otherPortType);
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
		result.append(" (Speed: ");
		result.append(speed);
		result.append(", MaxSpeed: ");
		result.append(maxSpeed);
		result.append(", RequestedSpeed: ");
		result.append(requestedSpeed);
		result.append(", UsageRestriction: ");
		result.append(usageRestriction);
		result.append(", PortType: ");
		result.append(portType);
		result.append(", OtherPortType: ");
		result.append(otherPortType);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalPortImpl
