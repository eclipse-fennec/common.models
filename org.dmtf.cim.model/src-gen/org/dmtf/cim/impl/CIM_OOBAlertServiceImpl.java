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

import org.dmtf.cim.CIM_OOBAlertService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM OOB Alert Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getDestinationType <em>Destination Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getOtherDestinationTypeDescription <em>Other Destination Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getMessageFormat <em>Message Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getOtherMessageFormatDescription <em>Other Message Format Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getOnlySendsFixedMessage <em>Only Sends Fixed Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getFixedPartOfMessage <em>Fixed Part Of Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getDestinationIsAckCapable <em>Destination Is Ack Capable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getRetryCount <em>Retry Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getPresenceHeartbeatCapable <em>Presence Heartbeat Capable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OOBAlertServiceImpl#getEnablePresenceHeartbeats <em>Enable Presence Heartbeats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OOBAlertServiceImpl extends CIM_ServiceImpl implements CIM_OOBAlertService {
	/**
	 * The default value of the '{@link #getDestinationType() <em>Destination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESTINATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationType() <em>Destination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationType()
	 * @generated
	 * @ordered
	 */
	protected Integer destinationType = DESTINATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherDestinationTypeDescription() <em>Other Destination Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDestinationTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DESTINATION_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDestinationTypeDescription() <em>Other Destination Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDestinationTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherDestinationTypeDescription = OTHER_DESTINATION_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected String destinationAddress = DESTINATION_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageFormat() <em>Message Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MESSAGE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageFormat() <em>Message Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer messageFormat = MESSAGE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherMessageFormatDescription() <em>Other Message Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMessageFormatDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_MESSAGE_FORMAT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherMessageFormatDescription() <em>Other Message Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMessageFormatDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherMessageFormatDescription = OTHER_MESSAGE_FORMAT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnlySendsFixedMessage() <em>Only Sends Fixed Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlySendsFixedMessage()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONLY_SENDS_FIXED_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnlySendsFixedMessage() <em>Only Sends Fixed Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlySendsFixedMessage()
	 * @generated
	 * @ordered
	 */
	protected Boolean onlySendsFixedMessage = ONLY_SENDS_FIXED_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedPartOfMessage() <em>Fixed Part Of Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPartOfMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_PART_OF_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedPartOfMessage() <em>Fixed Part Of Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPartOfMessage()
	 * @generated
	 * @ordered
	 */
	protected String fixedPartOfMessage = FIXED_PART_OF_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationIsAckCapable() <em>Destination Is Ack Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationIsAckCapable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DESTINATION_IS_ACK_CAPABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationIsAckCapable() <em>Destination Is Ack Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationIsAckCapable()
	 * @generated
	 * @ordered
	 */
	protected Boolean destinationIsAckCapable = DESTINATION_IS_ACK_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RETRY_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected Integer retryCount = RETRY_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RETRY_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer retryInterval = RETRY_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresenceHeartbeatCapable() <em>Presence Heartbeat Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenceHeartbeatCapable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRESENCE_HEARTBEAT_CAPABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresenceHeartbeatCapable() <em>Presence Heartbeat Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenceHeartbeatCapable()
	 * @generated
	 * @ordered
	 */
	protected Boolean presenceHeartbeatCapable = PRESENCE_HEARTBEAT_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnablePresenceHeartbeats() <em>Enable Presence Heartbeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablePresenceHeartbeats()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_PRESENCE_HEARTBEATS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnablePresenceHeartbeats() <em>Enable Presence Heartbeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablePresenceHeartbeats()
	 * @generated
	 * @ordered
	 */
	protected Boolean enablePresenceHeartbeats = ENABLE_PRESENCE_HEARTBEATS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OOBAlertServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OOBAlertService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDestinationType() {
		return destinationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationType(Integer newDestinationType) {
		Integer oldDestinationType = destinationType;
		destinationType = newDestinationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_TYPE, oldDestinationType, destinationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDestinationTypeDescription() {
		return otherDestinationTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDestinationTypeDescription(String newOtherDestinationTypeDescription) {
		String oldOtherDestinationTypeDescription = otherDestinationTypeDescription;
		otherDestinationTypeDescription = newOtherDestinationTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_DESTINATION_TYPE_DESCRIPTION, oldOtherDestinationTypeDescription, otherDestinationTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationAddress(String newDestinationAddress) {
		String oldDestinationAddress = destinationAddress;
		destinationAddress = newDestinationAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_ADDRESS, oldDestinationAddress, destinationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMessageFormat() {
		return messageFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageFormat(Integer newMessageFormat) {
		Integer oldMessageFormat = messageFormat;
		messageFormat = newMessageFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__MESSAGE_FORMAT, oldMessageFormat, messageFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherMessageFormatDescription() {
		return otherMessageFormatDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherMessageFormatDescription(String newOtherMessageFormatDescription) {
		String oldOtherMessageFormatDescription = otherMessageFormatDescription;
		otherMessageFormatDescription = newOtherMessageFormatDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_MESSAGE_FORMAT_DESCRIPTION, oldOtherMessageFormatDescription, otherMessageFormatDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnlySendsFixedMessage() {
		return onlySendsFixedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnlySendsFixedMessage(Boolean newOnlySendsFixedMessage) {
		Boolean oldOnlySendsFixedMessage = onlySendsFixedMessage;
		onlySendsFixedMessage = newOnlySendsFixedMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__ONLY_SENDS_FIXED_MESSAGE, oldOnlySendsFixedMessage, onlySendsFixedMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedPartOfMessage() {
		return fixedPartOfMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedPartOfMessage(String newFixedPartOfMessage) {
		String oldFixedPartOfMessage = fixedPartOfMessage;
		fixedPartOfMessage = newFixedPartOfMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__FIXED_PART_OF_MESSAGE, oldFixedPartOfMessage, fixedPartOfMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDestinationIsAckCapable() {
		return destinationIsAckCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationIsAckCapable(Boolean newDestinationIsAckCapable) {
		Boolean oldDestinationIsAckCapable = destinationIsAckCapable;
		destinationIsAckCapable = newDestinationIsAckCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_IS_ACK_CAPABLE, oldDestinationIsAckCapable, destinationIsAckCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRetryCount() {
		return retryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryCount(Integer newRetryCount) {
		Integer oldRetryCount = retryCount;
		retryCount = newRetryCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_COUNT, oldRetryCount, retryCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRetryInterval() {
		return retryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryInterval(Integer newRetryInterval) {
		Integer oldRetryInterval = retryInterval;
		retryInterval = newRetryInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_INTERVAL, oldRetryInterval, retryInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPresenceHeartbeatCapable() {
		return presenceHeartbeatCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresenceHeartbeatCapable(Boolean newPresenceHeartbeatCapable) {
		Boolean oldPresenceHeartbeatCapable = presenceHeartbeatCapable;
		presenceHeartbeatCapable = newPresenceHeartbeatCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__PRESENCE_HEARTBEAT_CAPABLE, oldPresenceHeartbeatCapable, presenceHeartbeatCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnablePresenceHeartbeats() {
		return enablePresenceHeartbeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnablePresenceHeartbeats(Boolean newEnablePresenceHeartbeats) {
		Boolean oldEnablePresenceHeartbeats = enablePresenceHeartbeats;
		enablePresenceHeartbeats = newEnablePresenceHeartbeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OOB_ALERT_SERVICE__ENABLE_PRESENCE_HEARTBEATS, oldEnablePresenceHeartbeats, enablePresenceHeartbeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_TYPE:
				return getDestinationType();
			case CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_DESTINATION_TYPE_DESCRIPTION:
				return getOtherDestinationTypeDescription();
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_ADDRESS:
				return getDestinationAddress();
			case CimPackage.CIM_OOB_ALERT_SERVICE__MESSAGE_FORMAT:
				return getMessageFormat();
			case CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_MESSAGE_FORMAT_DESCRIPTION:
				return getOtherMessageFormatDescription();
			case CimPackage.CIM_OOB_ALERT_SERVICE__ONLY_SENDS_FIXED_MESSAGE:
				return getOnlySendsFixedMessage();
			case CimPackage.CIM_OOB_ALERT_SERVICE__FIXED_PART_OF_MESSAGE:
				return getFixedPartOfMessage();
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_IS_ACK_CAPABLE:
				return getDestinationIsAckCapable();
			case CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_COUNT:
				return getRetryCount();
			case CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_INTERVAL:
				return getRetryInterval();
			case CimPackage.CIM_OOB_ALERT_SERVICE__PRESENCE_HEARTBEAT_CAPABLE:
				return getPresenceHeartbeatCapable();
			case CimPackage.CIM_OOB_ALERT_SERVICE__ENABLE_PRESENCE_HEARTBEATS:
				return getEnablePresenceHeartbeats();
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
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_TYPE:
				setDestinationType((Integer)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_DESTINATION_TYPE_DESCRIPTION:
				setOtherDestinationTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_ADDRESS:
				setDestinationAddress((String)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__MESSAGE_FORMAT:
				setMessageFormat((Integer)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_MESSAGE_FORMAT_DESCRIPTION:
				setOtherMessageFormatDescription((String)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__ONLY_SENDS_FIXED_MESSAGE:
				setOnlySendsFixedMessage((Boolean)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__FIXED_PART_OF_MESSAGE:
				setFixedPartOfMessage((String)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_IS_ACK_CAPABLE:
				setDestinationIsAckCapable((Boolean)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_COUNT:
				setRetryCount((Integer)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_INTERVAL:
				setRetryInterval((Integer)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__PRESENCE_HEARTBEAT_CAPABLE:
				setPresenceHeartbeatCapable((Boolean)newValue);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__ENABLE_PRESENCE_HEARTBEATS:
				setEnablePresenceHeartbeats((Boolean)newValue);
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
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_TYPE:
				setDestinationType(DESTINATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_DESTINATION_TYPE_DESCRIPTION:
				setOtherDestinationTypeDescription(OTHER_DESTINATION_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_ADDRESS:
				setDestinationAddress(DESTINATION_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__MESSAGE_FORMAT:
				setMessageFormat(MESSAGE_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_MESSAGE_FORMAT_DESCRIPTION:
				setOtherMessageFormatDescription(OTHER_MESSAGE_FORMAT_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__ONLY_SENDS_FIXED_MESSAGE:
				setOnlySendsFixedMessage(ONLY_SENDS_FIXED_MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__FIXED_PART_OF_MESSAGE:
				setFixedPartOfMessage(FIXED_PART_OF_MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_IS_ACK_CAPABLE:
				setDestinationIsAckCapable(DESTINATION_IS_ACK_CAPABLE_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_COUNT:
				setRetryCount(RETRY_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_INTERVAL:
				setRetryInterval(RETRY_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__PRESENCE_HEARTBEAT_CAPABLE:
				setPresenceHeartbeatCapable(PRESENCE_HEARTBEAT_CAPABLE_EDEFAULT);
				return;
			case CimPackage.CIM_OOB_ALERT_SERVICE__ENABLE_PRESENCE_HEARTBEATS:
				setEnablePresenceHeartbeats(ENABLE_PRESENCE_HEARTBEATS_EDEFAULT);
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
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_TYPE:
				return DESTINATION_TYPE_EDEFAULT == null ? destinationType != null : !DESTINATION_TYPE_EDEFAULT.equals(destinationType);
			case CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_DESTINATION_TYPE_DESCRIPTION:
				return OTHER_DESTINATION_TYPE_DESCRIPTION_EDEFAULT == null ? otherDestinationTypeDescription != null : !OTHER_DESTINATION_TYPE_DESCRIPTION_EDEFAULT.equals(otherDestinationTypeDescription);
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_ADDRESS:
				return DESTINATION_ADDRESS_EDEFAULT == null ? destinationAddress != null : !DESTINATION_ADDRESS_EDEFAULT.equals(destinationAddress);
			case CimPackage.CIM_OOB_ALERT_SERVICE__MESSAGE_FORMAT:
				return MESSAGE_FORMAT_EDEFAULT == null ? messageFormat != null : !MESSAGE_FORMAT_EDEFAULT.equals(messageFormat);
			case CimPackage.CIM_OOB_ALERT_SERVICE__OTHER_MESSAGE_FORMAT_DESCRIPTION:
				return OTHER_MESSAGE_FORMAT_DESCRIPTION_EDEFAULT == null ? otherMessageFormatDescription != null : !OTHER_MESSAGE_FORMAT_DESCRIPTION_EDEFAULT.equals(otherMessageFormatDescription);
			case CimPackage.CIM_OOB_ALERT_SERVICE__ONLY_SENDS_FIXED_MESSAGE:
				return ONLY_SENDS_FIXED_MESSAGE_EDEFAULT == null ? onlySendsFixedMessage != null : !ONLY_SENDS_FIXED_MESSAGE_EDEFAULT.equals(onlySendsFixedMessage);
			case CimPackage.CIM_OOB_ALERT_SERVICE__FIXED_PART_OF_MESSAGE:
				return FIXED_PART_OF_MESSAGE_EDEFAULT == null ? fixedPartOfMessage != null : !FIXED_PART_OF_MESSAGE_EDEFAULT.equals(fixedPartOfMessage);
			case CimPackage.CIM_OOB_ALERT_SERVICE__DESTINATION_IS_ACK_CAPABLE:
				return DESTINATION_IS_ACK_CAPABLE_EDEFAULT == null ? destinationIsAckCapable != null : !DESTINATION_IS_ACK_CAPABLE_EDEFAULT.equals(destinationIsAckCapable);
			case CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_COUNT:
				return RETRY_COUNT_EDEFAULT == null ? retryCount != null : !RETRY_COUNT_EDEFAULT.equals(retryCount);
			case CimPackage.CIM_OOB_ALERT_SERVICE__RETRY_INTERVAL:
				return RETRY_INTERVAL_EDEFAULT == null ? retryInterval != null : !RETRY_INTERVAL_EDEFAULT.equals(retryInterval);
			case CimPackage.CIM_OOB_ALERT_SERVICE__PRESENCE_HEARTBEAT_CAPABLE:
				return PRESENCE_HEARTBEAT_CAPABLE_EDEFAULT == null ? presenceHeartbeatCapable != null : !PRESENCE_HEARTBEAT_CAPABLE_EDEFAULT.equals(presenceHeartbeatCapable);
			case CimPackage.CIM_OOB_ALERT_SERVICE__ENABLE_PRESENCE_HEARTBEATS:
				return ENABLE_PRESENCE_HEARTBEATS_EDEFAULT == null ? enablePresenceHeartbeats != null : !ENABLE_PRESENCE_HEARTBEATS_EDEFAULT.equals(enablePresenceHeartbeats);
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
		result.append(" (DestinationType: ");
		result.append(destinationType);
		result.append(", OtherDestinationTypeDescription: ");
		result.append(otherDestinationTypeDescription);
		result.append(", DestinationAddress: ");
		result.append(destinationAddress);
		result.append(", MessageFormat: ");
		result.append(messageFormat);
		result.append(", OtherMessageFormatDescription: ");
		result.append(otherMessageFormatDescription);
		result.append(", OnlySendsFixedMessage: ");
		result.append(onlySendsFixedMessage);
		result.append(", FixedPartOfMessage: ");
		result.append(fixedPartOfMessage);
		result.append(", DestinationIsAckCapable: ");
		result.append(destinationIsAckCapable);
		result.append(", RetryCount: ");
		result.append(retryCount);
		result.append(", RetryInterval: ");
		result.append(retryInterval);
		result.append(", PresenceHeartbeatCapable: ");
		result.append(presenceHeartbeatCapable);
		result.append(", EnablePresenceHeartbeats: ");
		result.append(enablePresenceHeartbeats);
		result.append(')');
		return result.toString();
	}

} //CIM_OOBAlertServiceImpl
