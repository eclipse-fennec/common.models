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

import org.dmtf.cim.CIM_AbstractIndicationSubscription;
import org.dmtf.cim.CIM_ListenerDestination;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Abstract Indication Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getOnFatalErrorPolicy <em>On Fatal Error Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getOtherOnFatalErrorPolicy <em>Other On Fatal Error Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getFailureTriggerTimeInterval <em>Failure Trigger Time Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getSubscriptionState <em>Subscription State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getOtherSubscriptionState <em>Other Subscription State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getTimeOfLastStateChange <em>Time Of Last State Change</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getSubscriptionDuration <em>Subscription Duration</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getSubscriptionStartTime <em>Subscription Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getSubscriptionTimeRemaining <em>Subscription Time Remaining</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getRepeatNotificationPolicy <em>Repeat Notification Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getOtherRepeatNotificationPolicy <em>Other Repeat Notification Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getRepeatNotificationInterval <em>Repeat Notification Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getRepeatNotificationGap <em>Repeat Notification Gap</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getRepeatNotificationCount <em>Repeat Notification Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getSubscriptionInfo <em>Subscription Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getAlertOnStateChange <em>Alert On State Change</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getLastIndicationIdentifier <em>Last Indication Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractIndicationSubscriptionImpl#getLastIndicationProductionDateTime <em>Last Indication Production Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_AbstractIndicationSubscriptionImpl extends MinimalEObjectImpl.Container implements CIM_AbstractIndicationSubscription {
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement filter;

	/**
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected CIM_ListenerDestination handler;

	/**
	 * The default value of the '{@link #getOnFatalErrorPolicy() <em>On Fatal Error Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFatalErrorPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ON_FATAL_ERROR_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnFatalErrorPolicy() <em>On Fatal Error Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFatalErrorPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer onFatalErrorPolicy = ON_FATAL_ERROR_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherOnFatalErrorPolicy() <em>Other On Fatal Error Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherOnFatalErrorPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ON_FATAL_ERROR_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherOnFatalErrorPolicy() <em>Other On Fatal Error Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherOnFatalErrorPolicy()
	 * @generated
	 * @ordered
	 */
	protected String otherOnFatalErrorPolicy = OTHER_ON_FATAL_ERROR_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureTriggerTimeInterval() <em>Failure Trigger Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureTriggerTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long FAILURE_TRIGGER_TIME_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureTriggerTimeInterval() <em>Failure Trigger Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureTriggerTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected Long failureTriggerTimeInterval = FAILURE_TRIGGER_TIME_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionState() <em>Subscription State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUBSCRIPTION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionState() <em>Subscription State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionState()
	 * @generated
	 * @ordered
	 */
	protected Integer subscriptionState = SUBSCRIPTION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSubscriptionState() <em>Other Subscription State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSubscriptionState()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SUBSCRIPTION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSubscriptionState() <em>Other Subscription State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSubscriptionState()
	 * @generated
	 * @ordered
	 */
	protected String otherSubscriptionState = OTHER_SUBSCRIPTION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfLastStateChange() <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_LAST_STATE_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastStateChange() <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 * @ordered
	 */
	protected String timeOfLastStateChange = TIME_OF_LAST_STATE_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionDuration() <em>Subscription Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Long SUBSCRIPTION_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionDuration() <em>Subscription Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionDuration()
	 * @generated
	 * @ordered
	 */
	protected Long subscriptionDuration = SUBSCRIPTION_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionStartTime() <em>Subscription Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionStartTime() <em>Subscription Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionStartTime()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionStartTime = SUBSCRIPTION_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionTimeRemaining() <em>Subscription Time Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTimeRemaining()
	 * @generated
	 * @ordered
	 */
	protected static final Long SUBSCRIPTION_TIME_REMAINING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionTimeRemaining() <em>Subscription Time Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTimeRemaining()
	 * @generated
	 * @ordered
	 */
	protected Long subscriptionTimeRemaining = SUBSCRIPTION_TIME_REMAINING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatNotificationPolicy() <em>Repeat Notification Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatNotificationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REPEAT_NOTIFICATION_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatNotificationPolicy() <em>Repeat Notification Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatNotificationPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer repeatNotificationPolicy = REPEAT_NOTIFICATION_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherRepeatNotificationPolicy() <em>Other Repeat Notification Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRepeatNotificationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_REPEAT_NOTIFICATION_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherRepeatNotificationPolicy() <em>Other Repeat Notification Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRepeatNotificationPolicy()
	 * @generated
	 * @ordered
	 */
	protected String otherRepeatNotificationPolicy = OTHER_REPEAT_NOTIFICATION_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatNotificationInterval() <em>Repeat Notification Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatNotificationInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long REPEAT_NOTIFICATION_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatNotificationInterval() <em>Repeat Notification Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatNotificationInterval()
	 * @generated
	 * @ordered
	 */
	protected Long repeatNotificationInterval = REPEAT_NOTIFICATION_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatNotificationGap() <em>Repeat Notification Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatNotificationGap()
	 * @generated
	 * @ordered
	 */
	protected static final Long REPEAT_NOTIFICATION_GAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatNotificationGap() <em>Repeat Notification Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatNotificationGap()
	 * @generated
	 * @ordered
	 */
	protected Long repeatNotificationGap = REPEAT_NOTIFICATION_GAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatNotificationCount() <em>Repeat Notification Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatNotificationCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REPEAT_NOTIFICATION_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatNotificationCount() <em>Repeat Notification Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatNotificationCount()
	 * @generated
	 * @ordered
	 */
	protected Integer repeatNotificationCount = REPEAT_NOTIFICATION_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionInfo() <em>Subscription Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionInfo() <em>Subscription Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionInfo()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionInfo = SUBSCRIPTION_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlertOnStateChange() <em>Alert On State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertOnStateChange()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALERT_ON_STATE_CHANGE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAlertOnStateChange() <em>Alert On State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertOnStateChange()
	 * @generated
	 * @ordered
	 */
	protected Boolean alertOnStateChange = ALERT_ON_STATE_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastIndicationIdentifier() <em>Last Indication Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastIndicationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_INDICATION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastIndicationIdentifier() <em>Last Indication Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastIndicationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String lastIndicationIdentifier = LAST_INDICATION_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastIndicationProductionDateTime() <em>Last Indication Production Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastIndicationProductionDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_INDICATION_PRODUCTION_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastIndicationProductionDateTime() <em>Last Indication Production Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastIndicationProductionDateTime()
	 * @generated
	 * @ordered
	 */
	protected String lastIndicationProductionDateTime = LAST_INDICATION_PRODUCTION_DATE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AbstractIndicationSubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AbstractIndicationSubscription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getFilter() {
		if (filter != null && filter.eIsProxy()) {
			InternalEObject oldFilter = (InternalEObject)filter;
			filter = (CIM_ManagedElement)eResolveProxy(oldFilter);
			if (filter != oldFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FILTER, oldFilter, filter));
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(CIM_ManagedElement newFilter) {
		CIM_ManagedElement oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ListenerDestination getHandler() {
		if (handler != null && handler.eIsProxy()) {
			InternalEObject oldHandler = (InternalEObject)handler;
			handler = (CIM_ListenerDestination)eResolveProxy(oldHandler);
			if (handler != oldHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__HANDLER, oldHandler, handler));
			}
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ListenerDestination basicGetHandler() {
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandler(CIM_ListenerDestination newHandler) {
		CIM_ListenerDestination oldHandler = handler;
		handler = newHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__HANDLER, oldHandler, handler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOnFatalErrorPolicy() {
		return onFatalErrorPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnFatalErrorPolicy(Integer newOnFatalErrorPolicy) {
		Integer oldOnFatalErrorPolicy = onFatalErrorPolicy;
		onFatalErrorPolicy = newOnFatalErrorPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ON_FATAL_ERROR_POLICY, oldOnFatalErrorPolicy, onFatalErrorPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherOnFatalErrorPolicy() {
		return otherOnFatalErrorPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherOnFatalErrorPolicy(String newOtherOnFatalErrorPolicy) {
		String oldOtherOnFatalErrorPolicy = otherOnFatalErrorPolicy;
		otherOnFatalErrorPolicy = newOtherOnFatalErrorPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_ON_FATAL_ERROR_POLICY, oldOtherOnFatalErrorPolicy, otherOnFatalErrorPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFailureTriggerTimeInterval() {
		return failureTriggerTimeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureTriggerTimeInterval(Long newFailureTriggerTimeInterval) {
		Long oldFailureTriggerTimeInterval = failureTriggerTimeInterval;
		failureTriggerTimeInterval = newFailureTriggerTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FAILURE_TRIGGER_TIME_INTERVAL, oldFailureTriggerTimeInterval, failureTriggerTimeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSubscriptionState() {
		return subscriptionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionState(Integer newSubscriptionState) {
		Integer oldSubscriptionState = subscriptionState;
		subscriptionState = newSubscriptionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_STATE, oldSubscriptionState, subscriptionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSubscriptionState() {
		return otherSubscriptionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSubscriptionState(String newOtherSubscriptionState) {
		String oldOtherSubscriptionState = otherSubscriptionState;
		otherSubscriptionState = newOtherSubscriptionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_SUBSCRIPTION_STATE, oldOtherSubscriptionState, otherSubscriptionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfLastStateChange() {
		return timeOfLastStateChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfLastStateChange(String newTimeOfLastStateChange) {
		String oldTimeOfLastStateChange = timeOfLastStateChange;
		timeOfLastStateChange = newTimeOfLastStateChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__TIME_OF_LAST_STATE_CHANGE, oldTimeOfLastStateChange, timeOfLastStateChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSubscriptionDuration() {
		return subscriptionDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionDuration(Long newSubscriptionDuration) {
		Long oldSubscriptionDuration = subscriptionDuration;
		subscriptionDuration = newSubscriptionDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_DURATION, oldSubscriptionDuration, subscriptionDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionStartTime() {
		return subscriptionStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionStartTime(String newSubscriptionStartTime) {
		String oldSubscriptionStartTime = subscriptionStartTime;
		subscriptionStartTime = newSubscriptionStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_START_TIME, oldSubscriptionStartTime, subscriptionStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSubscriptionTimeRemaining() {
		return subscriptionTimeRemaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionTimeRemaining(Long newSubscriptionTimeRemaining) {
		Long oldSubscriptionTimeRemaining = subscriptionTimeRemaining;
		subscriptionTimeRemaining = newSubscriptionTimeRemaining;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_TIME_REMAINING, oldSubscriptionTimeRemaining, subscriptionTimeRemaining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRepeatNotificationPolicy() {
		return repeatNotificationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatNotificationPolicy(Integer newRepeatNotificationPolicy) {
		Integer oldRepeatNotificationPolicy = repeatNotificationPolicy;
		repeatNotificationPolicy = newRepeatNotificationPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_POLICY, oldRepeatNotificationPolicy, repeatNotificationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherRepeatNotificationPolicy() {
		return otherRepeatNotificationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherRepeatNotificationPolicy(String newOtherRepeatNotificationPolicy) {
		String oldOtherRepeatNotificationPolicy = otherRepeatNotificationPolicy;
		otherRepeatNotificationPolicy = newOtherRepeatNotificationPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_REPEAT_NOTIFICATION_POLICY, oldOtherRepeatNotificationPolicy, otherRepeatNotificationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRepeatNotificationInterval() {
		return repeatNotificationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatNotificationInterval(Long newRepeatNotificationInterval) {
		Long oldRepeatNotificationInterval = repeatNotificationInterval;
		repeatNotificationInterval = newRepeatNotificationInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_INTERVAL, oldRepeatNotificationInterval, repeatNotificationInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRepeatNotificationGap() {
		return repeatNotificationGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatNotificationGap(Long newRepeatNotificationGap) {
		Long oldRepeatNotificationGap = repeatNotificationGap;
		repeatNotificationGap = newRepeatNotificationGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_GAP, oldRepeatNotificationGap, repeatNotificationGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRepeatNotificationCount() {
		return repeatNotificationCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatNotificationCount(Integer newRepeatNotificationCount) {
		Integer oldRepeatNotificationCount = repeatNotificationCount;
		repeatNotificationCount = newRepeatNotificationCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_COUNT, oldRepeatNotificationCount, repeatNotificationCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionInfo() {
		return subscriptionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionInfo(String newSubscriptionInfo) {
		String oldSubscriptionInfo = subscriptionInfo;
		subscriptionInfo = newSubscriptionInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_INFO, oldSubscriptionInfo, subscriptionInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAlertOnStateChange() {
		return alertOnStateChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlertOnStateChange(Boolean newAlertOnStateChange) {
		Boolean oldAlertOnStateChange = alertOnStateChange;
		alertOnStateChange = newAlertOnStateChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ALERT_ON_STATE_CHANGE, oldAlertOnStateChange, alertOnStateChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastIndicationIdentifier() {
		return lastIndicationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastIndicationIdentifier(String newLastIndicationIdentifier) {
		String oldLastIndicationIdentifier = lastIndicationIdentifier;
		lastIndicationIdentifier = newLastIndicationIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_IDENTIFIER, oldLastIndicationIdentifier, lastIndicationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastIndicationProductionDateTime() {
		return lastIndicationProductionDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastIndicationProductionDateTime(String newLastIndicationProductionDateTime) {
		String oldLastIndicationProductionDateTime = lastIndicationProductionDateTime;
		lastIndicationProductionDateTime = newLastIndicationProductionDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_PRODUCTION_DATE_TIME, oldLastIndicationProductionDateTime, lastIndicationProductionDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FILTER:
				if (resolve) return getFilter();
				return basicGetFilter();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__HANDLER:
				if (resolve) return getHandler();
				return basicGetHandler();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ON_FATAL_ERROR_POLICY:
				return getOnFatalErrorPolicy();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_ON_FATAL_ERROR_POLICY:
				return getOtherOnFatalErrorPolicy();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FAILURE_TRIGGER_TIME_INTERVAL:
				return getFailureTriggerTimeInterval();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_STATE:
				return getSubscriptionState();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_SUBSCRIPTION_STATE:
				return getOtherSubscriptionState();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__TIME_OF_LAST_STATE_CHANGE:
				return getTimeOfLastStateChange();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_DURATION:
				return getSubscriptionDuration();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_START_TIME:
				return getSubscriptionStartTime();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_TIME_REMAINING:
				return getSubscriptionTimeRemaining();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_POLICY:
				return getRepeatNotificationPolicy();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_REPEAT_NOTIFICATION_POLICY:
				return getOtherRepeatNotificationPolicy();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_INTERVAL:
				return getRepeatNotificationInterval();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_GAP:
				return getRepeatNotificationGap();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_COUNT:
				return getRepeatNotificationCount();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_INFO:
				return getSubscriptionInfo();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ALERT_ON_STATE_CHANGE:
				return getAlertOnStateChange();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_IDENTIFIER:
				return getLastIndicationIdentifier();
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_PRODUCTION_DATE_TIME:
				return getLastIndicationProductionDateTime();
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
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FILTER:
				setFilter((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__HANDLER:
				setHandler((CIM_ListenerDestination)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ON_FATAL_ERROR_POLICY:
				setOnFatalErrorPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_ON_FATAL_ERROR_POLICY:
				setOtherOnFatalErrorPolicy((String)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FAILURE_TRIGGER_TIME_INTERVAL:
				setFailureTriggerTimeInterval((Long)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_STATE:
				setSubscriptionState((Integer)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_SUBSCRIPTION_STATE:
				setOtherSubscriptionState((String)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__TIME_OF_LAST_STATE_CHANGE:
				setTimeOfLastStateChange((String)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_DURATION:
				setSubscriptionDuration((Long)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_START_TIME:
				setSubscriptionStartTime((String)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_TIME_REMAINING:
				setSubscriptionTimeRemaining((Long)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_POLICY:
				setRepeatNotificationPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_REPEAT_NOTIFICATION_POLICY:
				setOtherRepeatNotificationPolicy((String)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_INTERVAL:
				setRepeatNotificationInterval((Long)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_GAP:
				setRepeatNotificationGap((Long)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_COUNT:
				setRepeatNotificationCount((Integer)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_INFO:
				setSubscriptionInfo((String)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ALERT_ON_STATE_CHANGE:
				setAlertOnStateChange((Boolean)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_IDENTIFIER:
				setLastIndicationIdentifier((String)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_PRODUCTION_DATE_TIME:
				setLastIndicationProductionDateTime((String)newValue);
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
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FILTER:
				setFilter((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__HANDLER:
				setHandler((CIM_ListenerDestination)null);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ON_FATAL_ERROR_POLICY:
				setOnFatalErrorPolicy(ON_FATAL_ERROR_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_ON_FATAL_ERROR_POLICY:
				setOtherOnFatalErrorPolicy(OTHER_ON_FATAL_ERROR_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FAILURE_TRIGGER_TIME_INTERVAL:
				setFailureTriggerTimeInterval(FAILURE_TRIGGER_TIME_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_STATE:
				setSubscriptionState(SUBSCRIPTION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_SUBSCRIPTION_STATE:
				setOtherSubscriptionState(OTHER_SUBSCRIPTION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__TIME_OF_LAST_STATE_CHANGE:
				setTimeOfLastStateChange(TIME_OF_LAST_STATE_CHANGE_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_DURATION:
				setSubscriptionDuration(SUBSCRIPTION_DURATION_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_START_TIME:
				setSubscriptionStartTime(SUBSCRIPTION_START_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_TIME_REMAINING:
				setSubscriptionTimeRemaining(SUBSCRIPTION_TIME_REMAINING_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_POLICY:
				setRepeatNotificationPolicy(REPEAT_NOTIFICATION_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_REPEAT_NOTIFICATION_POLICY:
				setOtherRepeatNotificationPolicy(OTHER_REPEAT_NOTIFICATION_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_INTERVAL:
				setRepeatNotificationInterval(REPEAT_NOTIFICATION_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_GAP:
				setRepeatNotificationGap(REPEAT_NOTIFICATION_GAP_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_COUNT:
				setRepeatNotificationCount(REPEAT_NOTIFICATION_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_INFO:
				setSubscriptionInfo(SUBSCRIPTION_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ALERT_ON_STATE_CHANGE:
				setAlertOnStateChange(ALERT_ON_STATE_CHANGE_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_IDENTIFIER:
				setLastIndicationIdentifier(LAST_INDICATION_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_PRODUCTION_DATE_TIME:
				setLastIndicationProductionDateTime(LAST_INDICATION_PRODUCTION_DATE_TIME_EDEFAULT);
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
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FILTER:
				return filter != null;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__HANDLER:
				return handler != null;
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ON_FATAL_ERROR_POLICY:
				return ON_FATAL_ERROR_POLICY_EDEFAULT == null ? onFatalErrorPolicy != null : !ON_FATAL_ERROR_POLICY_EDEFAULT.equals(onFatalErrorPolicy);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_ON_FATAL_ERROR_POLICY:
				return OTHER_ON_FATAL_ERROR_POLICY_EDEFAULT == null ? otherOnFatalErrorPolicy != null : !OTHER_ON_FATAL_ERROR_POLICY_EDEFAULT.equals(otherOnFatalErrorPolicy);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__FAILURE_TRIGGER_TIME_INTERVAL:
				return FAILURE_TRIGGER_TIME_INTERVAL_EDEFAULT == null ? failureTriggerTimeInterval != null : !FAILURE_TRIGGER_TIME_INTERVAL_EDEFAULT.equals(failureTriggerTimeInterval);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_STATE:
				return SUBSCRIPTION_STATE_EDEFAULT == null ? subscriptionState != null : !SUBSCRIPTION_STATE_EDEFAULT.equals(subscriptionState);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_SUBSCRIPTION_STATE:
				return OTHER_SUBSCRIPTION_STATE_EDEFAULT == null ? otherSubscriptionState != null : !OTHER_SUBSCRIPTION_STATE_EDEFAULT.equals(otherSubscriptionState);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__TIME_OF_LAST_STATE_CHANGE:
				return TIME_OF_LAST_STATE_CHANGE_EDEFAULT == null ? timeOfLastStateChange != null : !TIME_OF_LAST_STATE_CHANGE_EDEFAULT.equals(timeOfLastStateChange);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_DURATION:
				return SUBSCRIPTION_DURATION_EDEFAULT == null ? subscriptionDuration != null : !SUBSCRIPTION_DURATION_EDEFAULT.equals(subscriptionDuration);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_START_TIME:
				return SUBSCRIPTION_START_TIME_EDEFAULT == null ? subscriptionStartTime != null : !SUBSCRIPTION_START_TIME_EDEFAULT.equals(subscriptionStartTime);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_TIME_REMAINING:
				return SUBSCRIPTION_TIME_REMAINING_EDEFAULT == null ? subscriptionTimeRemaining != null : !SUBSCRIPTION_TIME_REMAINING_EDEFAULT.equals(subscriptionTimeRemaining);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_POLICY:
				return REPEAT_NOTIFICATION_POLICY_EDEFAULT == null ? repeatNotificationPolicy != null : !REPEAT_NOTIFICATION_POLICY_EDEFAULT.equals(repeatNotificationPolicy);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__OTHER_REPEAT_NOTIFICATION_POLICY:
				return OTHER_REPEAT_NOTIFICATION_POLICY_EDEFAULT == null ? otherRepeatNotificationPolicy != null : !OTHER_REPEAT_NOTIFICATION_POLICY_EDEFAULT.equals(otherRepeatNotificationPolicy);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_INTERVAL:
				return REPEAT_NOTIFICATION_INTERVAL_EDEFAULT == null ? repeatNotificationInterval != null : !REPEAT_NOTIFICATION_INTERVAL_EDEFAULT.equals(repeatNotificationInterval);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_GAP:
				return REPEAT_NOTIFICATION_GAP_EDEFAULT == null ? repeatNotificationGap != null : !REPEAT_NOTIFICATION_GAP_EDEFAULT.equals(repeatNotificationGap);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__REPEAT_NOTIFICATION_COUNT:
				return REPEAT_NOTIFICATION_COUNT_EDEFAULT == null ? repeatNotificationCount != null : !REPEAT_NOTIFICATION_COUNT_EDEFAULT.equals(repeatNotificationCount);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__SUBSCRIPTION_INFO:
				return SUBSCRIPTION_INFO_EDEFAULT == null ? subscriptionInfo != null : !SUBSCRIPTION_INFO_EDEFAULT.equals(subscriptionInfo);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__ALERT_ON_STATE_CHANGE:
				return ALERT_ON_STATE_CHANGE_EDEFAULT == null ? alertOnStateChange != null : !ALERT_ON_STATE_CHANGE_EDEFAULT.equals(alertOnStateChange);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_IDENTIFIER:
				return LAST_INDICATION_IDENTIFIER_EDEFAULT == null ? lastIndicationIdentifier != null : !LAST_INDICATION_IDENTIFIER_EDEFAULT.equals(lastIndicationIdentifier);
			case CimPackage.CIM_ABSTRACT_INDICATION_SUBSCRIPTION__LAST_INDICATION_PRODUCTION_DATE_TIME:
				return LAST_INDICATION_PRODUCTION_DATE_TIME_EDEFAULT == null ? lastIndicationProductionDateTime != null : !LAST_INDICATION_PRODUCTION_DATE_TIME_EDEFAULT.equals(lastIndicationProductionDateTime);
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
		result.append(" (OnFatalErrorPolicy: ");
		result.append(onFatalErrorPolicy);
		result.append(", OtherOnFatalErrorPolicy: ");
		result.append(otherOnFatalErrorPolicy);
		result.append(", FailureTriggerTimeInterval: ");
		result.append(failureTriggerTimeInterval);
		result.append(", SubscriptionState: ");
		result.append(subscriptionState);
		result.append(", OtherSubscriptionState: ");
		result.append(otherSubscriptionState);
		result.append(", TimeOfLastStateChange: ");
		result.append(timeOfLastStateChange);
		result.append(", SubscriptionDuration: ");
		result.append(subscriptionDuration);
		result.append(", SubscriptionStartTime: ");
		result.append(subscriptionStartTime);
		result.append(", SubscriptionTimeRemaining: ");
		result.append(subscriptionTimeRemaining);
		result.append(", RepeatNotificationPolicy: ");
		result.append(repeatNotificationPolicy);
		result.append(", OtherRepeatNotificationPolicy: ");
		result.append(otherRepeatNotificationPolicy);
		result.append(", RepeatNotificationInterval: ");
		result.append(repeatNotificationInterval);
		result.append(", RepeatNotificationGap: ");
		result.append(repeatNotificationGap);
		result.append(", RepeatNotificationCount: ");
		result.append(repeatNotificationCount);
		result.append(", SubscriptionInfo: ");
		result.append(subscriptionInfo);
		result.append(", AlertOnStateChange: ");
		result.append(alertOnStateChange);
		result.append(", LastIndicationIdentifier: ");
		result.append(lastIndicationIdentifier);
		result.append(", LastIndicationProductionDateTime: ");
		result.append(lastIndicationProductionDateTime);
		result.append(')');
		return result.toString();
	}

} //CIM_AbstractIndicationSubscriptionImpl
