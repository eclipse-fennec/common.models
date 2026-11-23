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

import org.dmtf.cim.CIM_TokenRingPort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Token Ring Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingPortImpl#getMaxDataSize <em>Max Data Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingPortImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingPortImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingPortImpl#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingPortImpl#getOtherEnabledCapabilities <em>Other Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingPortImpl#getRingStatus <em>Ring Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingPortImpl#getRingState <em>Ring State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingPortImpl#getRingOpenStatus <em>Ring Open Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingPortImpl#getRingSpeed <em>Ring Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TokenRingPortImpl extends CIM_NetworkPortImpl implements CIM_TokenRingPort {
	/**
	 * The default value of the '{@link #getMaxDataSize() <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_DATA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDataSize() <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxDataSize = MAX_DATA_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The cached value of the '{@link #getEnabledCapabilities() <em>Enabled Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledCapabilities;

	/**
	 * The cached value of the '{@link #getOtherEnabledCapabilities() <em>Other Enabled Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherEnabledCapabilities;

	/**
	 * The default value of the '{@link #getRingStatus() <em>Ring Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Long RING_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRingStatus() <em>Ring Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingStatus()
	 * @generated
	 * @ordered
	 */
	protected Long ringStatus = RING_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRingState() <em>Ring State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RING_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRingState() <em>Ring State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingState()
	 * @generated
	 * @ordered
	 */
	protected Integer ringState = RING_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRingOpenStatus() <em>Ring Open Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingOpenStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RING_OPEN_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRingOpenStatus() <em>Ring Open Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingOpenStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer ringOpenStatus = RING_OPEN_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRingSpeed() <em>Ring Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RING_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRingSpeed() <em>Ring Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingSpeed()
	 * @generated
	 * @ordered
	 */
	protected Integer ringSpeed = RING_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TokenRingPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TokenRingPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxDataSize() {
		return maxDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDataSize(Long newMaxDataSize) {
		Long oldMaxDataSize = maxDataSize;
		maxDataSize = newMaxDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_PORT__MAX_DATA_SIZE, oldMaxDataSize, maxDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TOKEN_RING_PORT__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_TOKEN_RING_PORT__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledCapabilities() {
		if (enabledCapabilities == null) {
			enabledCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TOKEN_RING_PORT__ENABLED_CAPABILITIES);
		}
		return enabledCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherEnabledCapabilities() {
		if (otherEnabledCapabilities == null) {
			otherEnabledCapabilities = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_TOKEN_RING_PORT__OTHER_ENABLED_CAPABILITIES);
		}
		return otherEnabledCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRingStatus() {
		return ringStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRingStatus(Long newRingStatus) {
		Long oldRingStatus = ringStatus;
		ringStatus = newRingStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_PORT__RING_STATUS, oldRingStatus, ringStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRingState() {
		return ringState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRingState(Integer newRingState) {
		Integer oldRingState = ringState;
		ringState = newRingState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_PORT__RING_STATE, oldRingState, ringState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRingOpenStatus() {
		return ringOpenStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRingOpenStatus(Integer newRingOpenStatus) {
		Integer oldRingOpenStatus = ringOpenStatus;
		ringOpenStatus = newRingOpenStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_PORT__RING_OPEN_STATUS, oldRingOpenStatus, ringOpenStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRingSpeed() {
		return ringSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRingSpeed(Integer newRingSpeed) {
		Integer oldRingSpeed = ringSpeed;
		ringSpeed = newRingSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_PORT__RING_SPEED, oldRingSpeed, ringSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TOKEN_RING_PORT__MAX_DATA_SIZE:
				return getMaxDataSize();
			case CimPackage.CIM_TOKEN_RING_PORT__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_TOKEN_RING_PORT__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_TOKEN_RING_PORT__ENABLED_CAPABILITIES:
				return getEnabledCapabilities();
			case CimPackage.CIM_TOKEN_RING_PORT__OTHER_ENABLED_CAPABILITIES:
				return getOtherEnabledCapabilities();
			case CimPackage.CIM_TOKEN_RING_PORT__RING_STATUS:
				return getRingStatus();
			case CimPackage.CIM_TOKEN_RING_PORT__RING_STATE:
				return getRingState();
			case CimPackage.CIM_TOKEN_RING_PORT__RING_OPEN_STATUS:
				return getRingOpenStatus();
			case CimPackage.CIM_TOKEN_RING_PORT__RING_SPEED:
				return getRingSpeed();
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
			case CimPackage.CIM_TOKEN_RING_PORT__MAX_DATA_SIZE:
				setMaxDataSize((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				getEnabledCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__OTHER_ENABLED_CAPABILITIES:
				getOtherEnabledCapabilities().clear();
				getOtherEnabledCapabilities().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__RING_STATUS:
				setRingStatus((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__RING_STATE:
				setRingState((Integer)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__RING_OPEN_STATUS:
				setRingOpenStatus((Integer)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__RING_SPEED:
				setRingSpeed((Integer)newValue);
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
			case CimPackage.CIM_TOKEN_RING_PORT__MAX_DATA_SIZE:
				setMaxDataSize(MAX_DATA_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__OTHER_ENABLED_CAPABILITIES:
				getOtherEnabledCapabilities().clear();
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__RING_STATUS:
				setRingStatus(RING_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__RING_STATE:
				setRingState(RING_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__RING_OPEN_STATUS:
				setRingOpenStatus(RING_OPEN_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_PORT__RING_SPEED:
				setRingSpeed(RING_SPEED_EDEFAULT);
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
			case CimPackage.CIM_TOKEN_RING_PORT__MAX_DATA_SIZE:
				return MAX_DATA_SIZE_EDEFAULT == null ? maxDataSize != null : !MAX_DATA_SIZE_EDEFAULT.equals(maxDataSize);
			case CimPackage.CIM_TOKEN_RING_PORT__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_TOKEN_RING_PORT__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_TOKEN_RING_PORT__ENABLED_CAPABILITIES:
				return enabledCapabilities != null && !enabledCapabilities.isEmpty();
			case CimPackage.CIM_TOKEN_RING_PORT__OTHER_ENABLED_CAPABILITIES:
				return otherEnabledCapabilities != null && !otherEnabledCapabilities.isEmpty();
			case CimPackage.CIM_TOKEN_RING_PORT__RING_STATUS:
				return RING_STATUS_EDEFAULT == null ? ringStatus != null : !RING_STATUS_EDEFAULT.equals(ringStatus);
			case CimPackage.CIM_TOKEN_RING_PORT__RING_STATE:
				return RING_STATE_EDEFAULT == null ? ringState != null : !RING_STATE_EDEFAULT.equals(ringState);
			case CimPackage.CIM_TOKEN_RING_PORT__RING_OPEN_STATUS:
				return RING_OPEN_STATUS_EDEFAULT == null ? ringOpenStatus != null : !RING_OPEN_STATUS_EDEFAULT.equals(ringOpenStatus);
			case CimPackage.CIM_TOKEN_RING_PORT__RING_SPEED:
				return RING_SPEED_EDEFAULT == null ? ringSpeed != null : !RING_SPEED_EDEFAULT.equals(ringSpeed);
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
		result.append(" (MaxDataSize: ");
		result.append(maxDataSize);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", EnabledCapabilities: ");
		result.append(enabledCapabilities);
		result.append(", OtherEnabledCapabilities: ");
		result.append(otherEnabledCapabilities);
		result.append(", RingStatus: ");
		result.append(ringStatus);
		result.append(", RingState: ");
		result.append(ringState);
		result.append(", RingOpenStatus: ");
		result.append(ringOpenStatus);
		result.append(", RingSpeed: ");
		result.append(ringSpeed);
		result.append(')');
		return result.toString();
	}

} //CIM_TokenRingPortImpl
