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

import org.dmtf.cim.CIM_SNMPTrapTarget;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SNMP Trap Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapTargetImpl#getNotificationMessage <em>Notification Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapTargetImpl#getSNMPVersion <em>SNMP Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapTargetImpl#getCommunityString <em>Community String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SNMPTrapTargetImpl extends CIM_RemotePortImpl implements CIM_SNMPTrapTarget {
	/**
	 * The default value of the '{@link #getNotificationMessage() <em>Notification Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationMessage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NOTIFICATION_MESSAGE_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getNotificationMessage() <em>Notification Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationMessage()
	 * @generated
	 * @ordered
	 */
	protected Integer notificationMessage = NOTIFICATION_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSNMPVersion() <em>SNMP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSNMPVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SNMP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSNMPVersion() <em>SNMP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSNMPVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer snmpVersion = SNMP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunityString() <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunityString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNITY_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunityString() <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunityString()
	 * @generated
	 * @ordered
	 */
	protected String communityString = COMMUNITY_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SNMPTrapTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SNMPTrapTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNotificationMessage() {
		return notificationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationMessage(Integer newNotificationMessage) {
		Integer oldNotificationMessage = notificationMessage;
		notificationMessage = newNotificationMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE, oldNotificationMessage, notificationMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSNMPVersion() {
		return snmpVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSNMPVersion(Integer newSNMPVersion) {
		Integer oldSNMPVersion = snmpVersion;
		snmpVersion = newSNMPVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_TRAP_TARGET__SNMP_VERSION, oldSNMPVersion, snmpVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunityString() {
		return communityString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunityString(String newCommunityString) {
		String oldCommunityString = communityString;
		communityString = newCommunityString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_TRAP_TARGET__COMMUNITY_STRING, oldCommunityString, communityString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE:
				return getNotificationMessage();
			case CimPackage.CIM_SNMP_TRAP_TARGET__SNMP_VERSION:
				return getSNMPVersion();
			case CimPackage.CIM_SNMP_TRAP_TARGET__COMMUNITY_STRING:
				return getCommunityString();
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
			case CimPackage.CIM_SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE:
				setNotificationMessage((Integer)newValue);
				return;
			case CimPackage.CIM_SNMP_TRAP_TARGET__SNMP_VERSION:
				setSNMPVersion((Integer)newValue);
				return;
			case CimPackage.CIM_SNMP_TRAP_TARGET__COMMUNITY_STRING:
				setCommunityString((String)newValue);
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
			case CimPackage.CIM_SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE:
				setNotificationMessage(NOTIFICATION_MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_SNMP_TRAP_TARGET__SNMP_VERSION:
				setSNMPVersion(SNMP_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SNMP_TRAP_TARGET__COMMUNITY_STRING:
				setCommunityString(COMMUNITY_STRING_EDEFAULT);
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
			case CimPackage.CIM_SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE:
				return NOTIFICATION_MESSAGE_EDEFAULT == null ? notificationMessage != null : !NOTIFICATION_MESSAGE_EDEFAULT.equals(notificationMessage);
			case CimPackage.CIM_SNMP_TRAP_TARGET__SNMP_VERSION:
				return SNMP_VERSION_EDEFAULT == null ? snmpVersion != null : !SNMP_VERSION_EDEFAULT.equals(snmpVersion);
			case CimPackage.CIM_SNMP_TRAP_TARGET__COMMUNITY_STRING:
				return COMMUNITY_STRING_EDEFAULT == null ? communityString != null : !COMMUNITY_STRING_EDEFAULT.equals(communityString);
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
		result.append(" (NotificationMessage: ");
		result.append(notificationMessage);
		result.append(", SNMPVersion: ");
		result.append(snmpVersion);
		result.append(", CommunityString: ");
		result.append(communityString);
		result.append(')');
		return result.toString();
	}

} //CIM_SNMPTrapTargetImpl
