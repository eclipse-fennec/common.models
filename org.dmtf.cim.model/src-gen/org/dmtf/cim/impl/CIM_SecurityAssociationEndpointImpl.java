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

import org.dmtf.cim.CIM_SecurityAssociationEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Security Association Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SecurityAssociationEndpointImpl#getLifetimeSeconds <em>Lifetime Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SecurityAssociationEndpointImpl#getRefreshThresholdSecondsPercentage <em>Refresh Threshold Seconds Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SecurityAssociationEndpointImpl#getIdleDurationSeconds <em>Idle Duration Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SecurityAssociationEndpointImpl#getLifetimeKilobytes <em>Lifetime Kilobytes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SecurityAssociationEndpointImpl#getRefreshThresholdKbytesPercentage <em>Refresh Threshold Kbytes Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SecurityAssociationEndpointImpl#getPacketLoggingActive <em>Packet Logging Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SecurityAssociationEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_SecurityAssociationEndpoint {
	/**
	 * The default value of the '{@link #getLifetimeSeconds() <em>Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetimeSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final Long LIFETIME_SECONDS_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getLifetimeSeconds() <em>Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetimeSeconds()
	 * @generated
	 * @ordered
	 */
	protected Long lifetimeSeconds = LIFETIME_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshThresholdSecondsPercentage() <em>Refresh Threshold Seconds Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshThresholdSecondsPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshThresholdSecondsPercentage() <em>Refresh Threshold Seconds Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshThresholdSecondsPercentage()
	 * @generated
	 * @ordered
	 */
	protected Integer refreshThresholdSecondsPercentage = REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdleDurationSeconds() <em>Idle Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleDurationSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final Long IDLE_DURATION_SECONDS_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getIdleDurationSeconds() <em>Idle Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleDurationSeconds()
	 * @generated
	 * @ordered
	 */
	protected Long idleDurationSeconds = IDLE_DURATION_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifetimeKilobytes() <em>Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetimeKilobytes()
	 * @generated
	 * @ordered
	 */
	protected static final Long LIFETIME_KILOBYTES_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getLifetimeKilobytes() <em>Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetimeKilobytes()
	 * @generated
	 * @ordered
	 */
	protected Long lifetimeKilobytes = LIFETIME_KILOBYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshThresholdKbytesPercentage() <em>Refresh Threshold Kbytes Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshThresholdKbytesPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshThresholdKbytesPercentage() <em>Refresh Threshold Kbytes Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshThresholdKbytesPercentage()
	 * @generated
	 * @ordered
	 */
	protected Integer refreshThresholdKbytesPercentage = REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketLoggingActive() <em>Packet Logging Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketLoggingActive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PACKET_LOGGING_ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketLoggingActive() <em>Packet Logging Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketLoggingActive()
	 * @generated
	 * @ordered
	 */
	protected Boolean packetLoggingActive = PACKET_LOGGING_ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SecurityAssociationEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SecurityAssociationEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLifetimeSeconds() {
		return lifetimeSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifetimeSeconds(Long newLifetimeSeconds) {
		Long oldLifetimeSeconds = lifetimeSeconds;
		lifetimeSeconds = newLifetimeSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_SECONDS, oldLifetimeSeconds, lifetimeSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRefreshThresholdSecondsPercentage() {
		return refreshThresholdSecondsPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshThresholdSecondsPercentage(Integer newRefreshThresholdSecondsPercentage) {
		Integer oldRefreshThresholdSecondsPercentage = refreshThresholdSecondsPercentage;
		refreshThresholdSecondsPercentage = newRefreshThresholdSecondsPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_SECONDS_PERCENTAGE, oldRefreshThresholdSecondsPercentage, refreshThresholdSecondsPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIdleDurationSeconds() {
		return idleDurationSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdleDurationSeconds(Long newIdleDurationSeconds) {
		Long oldIdleDurationSeconds = idleDurationSeconds;
		idleDurationSeconds = newIdleDurationSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__IDLE_DURATION_SECONDS, oldIdleDurationSeconds, idleDurationSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLifetimeKilobytes() {
		return lifetimeKilobytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifetimeKilobytes(Long newLifetimeKilobytes) {
		Long oldLifetimeKilobytes = lifetimeKilobytes;
		lifetimeKilobytes = newLifetimeKilobytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_KILOBYTES, oldLifetimeKilobytes, lifetimeKilobytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRefreshThresholdKbytesPercentage() {
		return refreshThresholdKbytesPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshThresholdKbytesPercentage(Integer newRefreshThresholdKbytesPercentage) {
		Integer oldRefreshThresholdKbytesPercentage = refreshThresholdKbytesPercentage;
		refreshThresholdKbytesPercentage = newRefreshThresholdKbytesPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_KBYTES_PERCENTAGE, oldRefreshThresholdKbytesPercentage, refreshThresholdKbytesPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPacketLoggingActive() {
		return packetLoggingActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPacketLoggingActive(Boolean newPacketLoggingActive) {
		Boolean oldPacketLoggingActive = packetLoggingActive;
		packetLoggingActive = newPacketLoggingActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__PACKET_LOGGING_ACTIVE, oldPacketLoggingActive, packetLoggingActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_SECONDS:
				return getLifetimeSeconds();
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_SECONDS_PERCENTAGE:
				return getRefreshThresholdSecondsPercentage();
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__IDLE_DURATION_SECONDS:
				return getIdleDurationSeconds();
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_KILOBYTES:
				return getLifetimeKilobytes();
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_KBYTES_PERCENTAGE:
				return getRefreshThresholdKbytesPercentage();
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__PACKET_LOGGING_ACTIVE:
				return getPacketLoggingActive();
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
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_SECONDS:
				setLifetimeSeconds((Long)newValue);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_SECONDS_PERCENTAGE:
				setRefreshThresholdSecondsPercentage((Integer)newValue);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__IDLE_DURATION_SECONDS:
				setIdleDurationSeconds((Long)newValue);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_KILOBYTES:
				setLifetimeKilobytes((Long)newValue);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_KBYTES_PERCENTAGE:
				setRefreshThresholdKbytesPercentage((Integer)newValue);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__PACKET_LOGGING_ACTIVE:
				setPacketLoggingActive((Boolean)newValue);
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
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_SECONDS:
				setLifetimeSeconds(LIFETIME_SECONDS_EDEFAULT);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_SECONDS_PERCENTAGE:
				setRefreshThresholdSecondsPercentage(REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__IDLE_DURATION_SECONDS:
				setIdleDurationSeconds(IDLE_DURATION_SECONDS_EDEFAULT);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_KILOBYTES:
				setLifetimeKilobytes(LIFETIME_KILOBYTES_EDEFAULT);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_KBYTES_PERCENTAGE:
				setRefreshThresholdKbytesPercentage(REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT);
				return;
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__PACKET_LOGGING_ACTIVE:
				setPacketLoggingActive(PACKET_LOGGING_ACTIVE_EDEFAULT);
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
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_SECONDS:
				return LIFETIME_SECONDS_EDEFAULT == null ? lifetimeSeconds != null : !LIFETIME_SECONDS_EDEFAULT.equals(lifetimeSeconds);
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_SECONDS_PERCENTAGE:
				return REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT == null ? refreshThresholdSecondsPercentage != null : !REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT.equals(refreshThresholdSecondsPercentage);
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__IDLE_DURATION_SECONDS:
				return IDLE_DURATION_SECONDS_EDEFAULT == null ? idleDurationSeconds != null : !IDLE_DURATION_SECONDS_EDEFAULT.equals(idleDurationSeconds);
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__LIFETIME_KILOBYTES:
				return LIFETIME_KILOBYTES_EDEFAULT == null ? lifetimeKilobytes != null : !LIFETIME_KILOBYTES_EDEFAULT.equals(lifetimeKilobytes);
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__REFRESH_THRESHOLD_KBYTES_PERCENTAGE:
				return REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT == null ? refreshThresholdKbytesPercentage != null : !REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT.equals(refreshThresholdKbytesPercentage);
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT__PACKET_LOGGING_ACTIVE:
				return PACKET_LOGGING_ACTIVE_EDEFAULT == null ? packetLoggingActive != null : !PACKET_LOGGING_ACTIVE_EDEFAULT.equals(packetLoggingActive);
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
		result.append(" (LifetimeSeconds: ");
		result.append(lifetimeSeconds);
		result.append(", RefreshThresholdSecondsPercentage: ");
		result.append(refreshThresholdSecondsPercentage);
		result.append(", IdleDurationSeconds: ");
		result.append(idleDurationSeconds);
		result.append(", LifetimeKilobytes: ");
		result.append(lifetimeKilobytes);
		result.append(", RefreshThresholdKbytesPercentage: ");
		result.append(refreshThresholdKbytesPercentage);
		result.append(", PacketLoggingActive: ");
		result.append(packetLoggingActive);
		result.append(')');
		return result.toString();
	}

} //CIM_SecurityAssociationEndpointImpl
