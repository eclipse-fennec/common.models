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

import org.dmtf.cim.CIM_IndicationService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Indication Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceImpl#getFilterCreationEnabled <em>Filter Creation Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceImpl#getDeliveryRetryAttempts <em>Delivery Retry Attempts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceImpl#getDeliveryRetryInterval <em>Delivery Retry Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceImpl#getSubscriptionRemovalAction <em>Subscription Removal Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceImpl#getSubscriptionRemovalTimeInterval <em>Subscription Removal Time Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IndicationServiceImpl extends CIM_ServiceImpl implements CIM_IndicationService {
	/**
	 * The default value of the '{@link #getFilterCreationEnabled() <em>Filter Creation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterCreationEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FILTER_CREATION_ENABLED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getFilterCreationEnabled() <em>Filter Creation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterCreationEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean filterCreationEnabled = FILTER_CREATION_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryRetryAttempts() <em>Delivery Retry Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryRetryAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELIVERY_RETRY_ATTEMPTS_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getDeliveryRetryAttempts() <em>Delivery Retry Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryRetryAttempts()
	 * @generated
	 * @ordered
	 */
	protected Integer deliveryRetryAttempts = DELIVERY_RETRY_ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryRetryInterval() <em>Delivery Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long DELIVERY_RETRY_INTERVAL_EDEFAULT = Long.valueOf(30L);

	/**
	 * The cached value of the '{@link #getDeliveryRetryInterval() <em>Delivery Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected Long deliveryRetryInterval = DELIVERY_RETRY_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionRemovalAction() <em>Subscription Removal Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionRemovalAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUBSCRIPTION_REMOVAL_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionRemovalAction() <em>Subscription Removal Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionRemovalAction()
	 * @generated
	 * @ordered
	 */
	protected Integer subscriptionRemovalAction = SUBSCRIPTION_REMOVAL_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionRemovalTimeInterval() <em>Subscription Removal Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionRemovalTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long SUBSCRIPTION_REMOVAL_TIME_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionRemovalTimeInterval() <em>Subscription Removal Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionRemovalTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected Long subscriptionRemovalTimeInterval = SUBSCRIPTION_REMOVAL_TIME_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IndicationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IndicationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFilterCreationEnabled() {
		return filterCreationEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterCreationEnabled(Boolean newFilterCreationEnabled) {
		Boolean oldFilterCreationEnabled = filterCreationEnabled;
		filterCreationEnabled = newFilterCreationEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE__FILTER_CREATION_ENABLED, oldFilterCreationEnabled, filterCreationEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeliveryRetryAttempts() {
		return deliveryRetryAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryRetryAttempts(Integer newDeliveryRetryAttempts) {
		Integer oldDeliveryRetryAttempts = deliveryRetryAttempts;
		deliveryRetryAttempts = newDeliveryRetryAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_ATTEMPTS, oldDeliveryRetryAttempts, deliveryRetryAttempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDeliveryRetryInterval() {
		return deliveryRetryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryRetryInterval(Long newDeliveryRetryInterval) {
		Long oldDeliveryRetryInterval = deliveryRetryInterval;
		deliveryRetryInterval = newDeliveryRetryInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_INTERVAL, oldDeliveryRetryInterval, deliveryRetryInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSubscriptionRemovalAction() {
		return subscriptionRemovalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionRemovalAction(Integer newSubscriptionRemovalAction) {
		Integer oldSubscriptionRemovalAction = subscriptionRemovalAction;
		subscriptionRemovalAction = newSubscriptionRemovalAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_ACTION, oldSubscriptionRemovalAction, subscriptionRemovalAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSubscriptionRemovalTimeInterval() {
		return subscriptionRemovalTimeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionRemovalTimeInterval(Long newSubscriptionRemovalTimeInterval) {
		Long oldSubscriptionRemovalTimeInterval = subscriptionRemovalTimeInterval;
		subscriptionRemovalTimeInterval = newSubscriptionRemovalTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_TIME_INTERVAL, oldSubscriptionRemovalTimeInterval, subscriptionRemovalTimeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INDICATION_SERVICE__FILTER_CREATION_ENABLED:
				return getFilterCreationEnabled();
			case CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_ATTEMPTS:
				return getDeliveryRetryAttempts();
			case CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_INTERVAL:
				return getDeliveryRetryInterval();
			case CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_ACTION:
				return getSubscriptionRemovalAction();
			case CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_TIME_INTERVAL:
				return getSubscriptionRemovalTimeInterval();
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
			case CimPackage.CIM_INDICATION_SERVICE__FILTER_CREATION_ENABLED:
				setFilterCreationEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_ATTEMPTS:
				setDeliveryRetryAttempts((Integer)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_INTERVAL:
				setDeliveryRetryInterval((Long)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_ACTION:
				setSubscriptionRemovalAction((Integer)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_TIME_INTERVAL:
				setSubscriptionRemovalTimeInterval((Long)newValue);
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
			case CimPackage.CIM_INDICATION_SERVICE__FILTER_CREATION_ENABLED:
				setFilterCreationEnabled(FILTER_CREATION_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_ATTEMPTS:
				setDeliveryRetryAttempts(DELIVERY_RETRY_ATTEMPTS_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_INTERVAL:
				setDeliveryRetryInterval(DELIVERY_RETRY_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_ACTION:
				setSubscriptionRemovalAction(SUBSCRIPTION_REMOVAL_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_TIME_INTERVAL:
				setSubscriptionRemovalTimeInterval(SUBSCRIPTION_REMOVAL_TIME_INTERVAL_EDEFAULT);
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
			case CimPackage.CIM_INDICATION_SERVICE__FILTER_CREATION_ENABLED:
				return FILTER_CREATION_ENABLED_EDEFAULT == null ? filterCreationEnabled != null : !FILTER_CREATION_ENABLED_EDEFAULT.equals(filterCreationEnabled);
			case CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_ATTEMPTS:
				return DELIVERY_RETRY_ATTEMPTS_EDEFAULT == null ? deliveryRetryAttempts != null : !DELIVERY_RETRY_ATTEMPTS_EDEFAULT.equals(deliveryRetryAttempts);
			case CimPackage.CIM_INDICATION_SERVICE__DELIVERY_RETRY_INTERVAL:
				return DELIVERY_RETRY_INTERVAL_EDEFAULT == null ? deliveryRetryInterval != null : !DELIVERY_RETRY_INTERVAL_EDEFAULT.equals(deliveryRetryInterval);
			case CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_ACTION:
				return SUBSCRIPTION_REMOVAL_ACTION_EDEFAULT == null ? subscriptionRemovalAction != null : !SUBSCRIPTION_REMOVAL_ACTION_EDEFAULT.equals(subscriptionRemovalAction);
			case CimPackage.CIM_INDICATION_SERVICE__SUBSCRIPTION_REMOVAL_TIME_INTERVAL:
				return SUBSCRIPTION_REMOVAL_TIME_INTERVAL_EDEFAULT == null ? subscriptionRemovalTimeInterval != null : !SUBSCRIPTION_REMOVAL_TIME_INTERVAL_EDEFAULT.equals(subscriptionRemovalTimeInterval);
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
		result.append(" (FilterCreationEnabled: ");
		result.append(filterCreationEnabled);
		result.append(", DeliveryRetryAttempts: ");
		result.append(deliveryRetryAttempts);
		result.append(", DeliveryRetryInterval: ");
		result.append(deliveryRetryInterval);
		result.append(", SubscriptionRemovalAction: ");
		result.append(subscriptionRemovalAction);
		result.append(", SubscriptionRemovalTimeInterval: ");
		result.append(subscriptionRemovalTimeInterval);
		result.append(')');
		return result.toString();
	}

} //CIM_IndicationServiceImpl
