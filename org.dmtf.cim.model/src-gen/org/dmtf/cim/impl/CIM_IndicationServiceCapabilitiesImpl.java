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

import org.dmtf.cim.CIM_IndicationServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Indication Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceCapabilitiesImpl#getFilterCreationEnabledIsSettable <em>Filter Creation Enabled Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceCapabilitiesImpl#getDeliveryRetryAttemptsIsSettable <em>Delivery Retry Attempts Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceCapabilitiesImpl#getDeliveryRetryIntervalIsSettable <em>Delivery Retry Interval Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceCapabilitiesImpl#getSubscriptionRemovalActionIsSettable <em>Subscription Removal Action Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceCapabilitiesImpl#getSubscriptionRemovalTimeIntervalIsSettable <em>Subscription Removal Time Interval Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceCapabilitiesImpl#getMaxListenerDestinations <em>Max Listener Destinations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceCapabilitiesImpl#getMaxActiveSubscriptions <em>Max Active Subscriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationServiceCapabilitiesImpl#getSubscriptionsPersisted <em>Subscriptions Persisted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IndicationServiceCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_IndicationServiceCapabilities {
	/**
	 * The default value of the '{@link #getFilterCreationEnabledIsSettable() <em>Filter Creation Enabled Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterCreationEnabledIsSettable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FILTER_CREATION_ENABLED_IS_SETTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterCreationEnabledIsSettable() <em>Filter Creation Enabled Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterCreationEnabledIsSettable()
	 * @generated
	 * @ordered
	 */
	protected Boolean filterCreationEnabledIsSettable = FILTER_CREATION_ENABLED_IS_SETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryRetryAttemptsIsSettable() <em>Delivery Retry Attempts Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryRetryAttemptsIsSettable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryRetryAttemptsIsSettable() <em>Delivery Retry Attempts Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryRetryAttemptsIsSettable()
	 * @generated
	 * @ordered
	 */
	protected Boolean deliveryRetryAttemptsIsSettable = DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryRetryIntervalIsSettable() <em>Delivery Retry Interval Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryRetryIntervalIsSettable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELIVERY_RETRY_INTERVAL_IS_SETTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryRetryIntervalIsSettable() <em>Delivery Retry Interval Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryRetryIntervalIsSettable()
	 * @generated
	 * @ordered
	 */
	protected Boolean deliveryRetryIntervalIsSettable = DELIVERY_RETRY_INTERVAL_IS_SETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionRemovalActionIsSettable() <em>Subscription Removal Action Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionRemovalActionIsSettable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionRemovalActionIsSettable() <em>Subscription Removal Action Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionRemovalActionIsSettable()
	 * @generated
	 * @ordered
	 */
	protected Boolean subscriptionRemovalActionIsSettable = SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionRemovalTimeIntervalIsSettable() <em>Subscription Removal Time Interval Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionRemovalTimeIntervalIsSettable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionRemovalTimeIntervalIsSettable() <em>Subscription Removal Time Interval Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionRemovalTimeIntervalIsSettable()
	 * @generated
	 * @ordered
	 */
	protected Boolean subscriptionRemovalTimeIntervalIsSettable = SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxListenerDestinations() <em>Max Listener Destinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxListenerDestinations()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_LISTENER_DESTINATIONS_EDEFAULT = Long.valueOf(1L);

	/**
	 * The cached value of the '{@link #getMaxListenerDestinations() <em>Max Listener Destinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxListenerDestinations()
	 * @generated
	 * @ordered
	 */
	protected Long maxListenerDestinations = MAX_LISTENER_DESTINATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxActiveSubscriptions() <em>Max Active Subscriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActiveSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_ACTIVE_SUBSCRIPTIONS_EDEFAULT = Long.valueOf(1L);

	/**
	 * The cached value of the '{@link #getMaxActiveSubscriptions() <em>Max Active Subscriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActiveSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected Long maxActiveSubscriptions = MAX_ACTIVE_SUBSCRIPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionsPersisted() <em>Subscriptions Persisted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionsPersisted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUBSCRIPTIONS_PERSISTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSubscriptionsPersisted() <em>Subscriptions Persisted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionsPersisted()
	 * @generated
	 * @ordered
	 */
	protected Boolean subscriptionsPersisted = SUBSCRIPTIONS_PERSISTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IndicationServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IndicationServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFilterCreationEnabledIsSettable() {
		return filterCreationEnabledIsSettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterCreationEnabledIsSettable(Boolean newFilterCreationEnabledIsSettable) {
		Boolean oldFilterCreationEnabledIsSettable = filterCreationEnabledIsSettable;
		filterCreationEnabledIsSettable = newFilterCreationEnabledIsSettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__FILTER_CREATION_ENABLED_IS_SETTABLE, oldFilterCreationEnabledIsSettable, filterCreationEnabledIsSettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeliveryRetryAttemptsIsSettable() {
		return deliveryRetryAttemptsIsSettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryRetryAttemptsIsSettable(Boolean newDeliveryRetryAttemptsIsSettable) {
		Boolean oldDeliveryRetryAttemptsIsSettable = deliveryRetryAttemptsIsSettable;
		deliveryRetryAttemptsIsSettable = newDeliveryRetryAttemptsIsSettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE, oldDeliveryRetryAttemptsIsSettable, deliveryRetryAttemptsIsSettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeliveryRetryIntervalIsSettable() {
		return deliveryRetryIntervalIsSettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryRetryIntervalIsSettable(Boolean newDeliveryRetryIntervalIsSettable) {
		Boolean oldDeliveryRetryIntervalIsSettable = deliveryRetryIntervalIsSettable;
		deliveryRetryIntervalIsSettable = newDeliveryRetryIntervalIsSettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_INTERVAL_IS_SETTABLE, oldDeliveryRetryIntervalIsSettable, deliveryRetryIntervalIsSettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSubscriptionRemovalActionIsSettable() {
		return subscriptionRemovalActionIsSettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionRemovalActionIsSettable(Boolean newSubscriptionRemovalActionIsSettable) {
		Boolean oldSubscriptionRemovalActionIsSettable = subscriptionRemovalActionIsSettable;
		subscriptionRemovalActionIsSettable = newSubscriptionRemovalActionIsSettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE, oldSubscriptionRemovalActionIsSettable, subscriptionRemovalActionIsSettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSubscriptionRemovalTimeIntervalIsSettable() {
		return subscriptionRemovalTimeIntervalIsSettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionRemovalTimeIntervalIsSettable(Boolean newSubscriptionRemovalTimeIntervalIsSettable) {
		Boolean oldSubscriptionRemovalTimeIntervalIsSettable = subscriptionRemovalTimeIntervalIsSettable;
		subscriptionRemovalTimeIntervalIsSettable = newSubscriptionRemovalTimeIntervalIsSettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE, oldSubscriptionRemovalTimeIntervalIsSettable, subscriptionRemovalTimeIntervalIsSettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxListenerDestinations() {
		return maxListenerDestinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxListenerDestinations(Long newMaxListenerDestinations) {
		Long oldMaxListenerDestinations = maxListenerDestinations;
		maxListenerDestinations = newMaxListenerDestinations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_LISTENER_DESTINATIONS, oldMaxListenerDestinations, maxListenerDestinations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxActiveSubscriptions() {
		return maxActiveSubscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxActiveSubscriptions(Long newMaxActiveSubscriptions) {
		Long oldMaxActiveSubscriptions = maxActiveSubscriptions;
		maxActiveSubscriptions = newMaxActiveSubscriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_ACTIVE_SUBSCRIPTIONS, oldMaxActiveSubscriptions, maxActiveSubscriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSubscriptionsPersisted() {
		return subscriptionsPersisted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionsPersisted(Boolean newSubscriptionsPersisted) {
		Boolean oldSubscriptionsPersisted = subscriptionsPersisted;
		subscriptionsPersisted = newSubscriptionsPersisted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTIONS_PERSISTED, oldSubscriptionsPersisted, subscriptionsPersisted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__FILTER_CREATION_ENABLED_IS_SETTABLE:
				return getFilterCreationEnabledIsSettable();
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE:
				return getDeliveryRetryAttemptsIsSettable();
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_INTERVAL_IS_SETTABLE:
				return getDeliveryRetryIntervalIsSettable();
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE:
				return getSubscriptionRemovalActionIsSettable();
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE:
				return getSubscriptionRemovalTimeIntervalIsSettable();
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_LISTENER_DESTINATIONS:
				return getMaxListenerDestinations();
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_ACTIVE_SUBSCRIPTIONS:
				return getMaxActiveSubscriptions();
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTIONS_PERSISTED:
				return getSubscriptionsPersisted();
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
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__FILTER_CREATION_ENABLED_IS_SETTABLE:
				setFilterCreationEnabledIsSettable((Boolean)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE:
				setDeliveryRetryAttemptsIsSettable((Boolean)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_INTERVAL_IS_SETTABLE:
				setDeliveryRetryIntervalIsSettable((Boolean)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE:
				setSubscriptionRemovalActionIsSettable((Boolean)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE:
				setSubscriptionRemovalTimeIntervalIsSettable((Boolean)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_LISTENER_DESTINATIONS:
				setMaxListenerDestinations((Long)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_ACTIVE_SUBSCRIPTIONS:
				setMaxActiveSubscriptions((Long)newValue);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTIONS_PERSISTED:
				setSubscriptionsPersisted((Boolean)newValue);
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
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__FILTER_CREATION_ENABLED_IS_SETTABLE:
				setFilterCreationEnabledIsSettable(FILTER_CREATION_ENABLED_IS_SETTABLE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE:
				setDeliveryRetryAttemptsIsSettable(DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_INTERVAL_IS_SETTABLE:
				setDeliveryRetryIntervalIsSettable(DELIVERY_RETRY_INTERVAL_IS_SETTABLE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE:
				setSubscriptionRemovalActionIsSettable(SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE:
				setSubscriptionRemovalTimeIntervalIsSettable(SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_LISTENER_DESTINATIONS:
				setMaxListenerDestinations(MAX_LISTENER_DESTINATIONS_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_ACTIVE_SUBSCRIPTIONS:
				setMaxActiveSubscriptions(MAX_ACTIVE_SUBSCRIPTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTIONS_PERSISTED:
				setSubscriptionsPersisted(SUBSCRIPTIONS_PERSISTED_EDEFAULT);
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
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__FILTER_CREATION_ENABLED_IS_SETTABLE:
				return FILTER_CREATION_ENABLED_IS_SETTABLE_EDEFAULT == null ? filterCreationEnabledIsSettable != null : !FILTER_CREATION_ENABLED_IS_SETTABLE_EDEFAULT.equals(filterCreationEnabledIsSettable);
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE:
				return DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE_EDEFAULT == null ? deliveryRetryAttemptsIsSettable != null : !DELIVERY_RETRY_ATTEMPTS_IS_SETTABLE_EDEFAULT.equals(deliveryRetryAttemptsIsSettable);
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__DELIVERY_RETRY_INTERVAL_IS_SETTABLE:
				return DELIVERY_RETRY_INTERVAL_IS_SETTABLE_EDEFAULT == null ? deliveryRetryIntervalIsSettable != null : !DELIVERY_RETRY_INTERVAL_IS_SETTABLE_EDEFAULT.equals(deliveryRetryIntervalIsSettable);
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE:
				return SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE_EDEFAULT == null ? subscriptionRemovalActionIsSettable != null : !SUBSCRIPTION_REMOVAL_ACTION_IS_SETTABLE_EDEFAULT.equals(subscriptionRemovalActionIsSettable);
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE:
				return SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE_EDEFAULT == null ? subscriptionRemovalTimeIntervalIsSettable != null : !SUBSCRIPTION_REMOVAL_TIME_INTERVAL_IS_SETTABLE_EDEFAULT.equals(subscriptionRemovalTimeIntervalIsSettable);
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_LISTENER_DESTINATIONS:
				return MAX_LISTENER_DESTINATIONS_EDEFAULT == null ? maxListenerDestinations != null : !MAX_LISTENER_DESTINATIONS_EDEFAULT.equals(maxListenerDestinations);
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__MAX_ACTIVE_SUBSCRIPTIONS:
				return MAX_ACTIVE_SUBSCRIPTIONS_EDEFAULT == null ? maxActiveSubscriptions != null : !MAX_ACTIVE_SUBSCRIPTIONS_EDEFAULT.equals(maxActiveSubscriptions);
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES__SUBSCRIPTIONS_PERSISTED:
				return SUBSCRIPTIONS_PERSISTED_EDEFAULT == null ? subscriptionsPersisted != null : !SUBSCRIPTIONS_PERSISTED_EDEFAULT.equals(subscriptionsPersisted);
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
		result.append(" (FilterCreationEnabledIsSettable: ");
		result.append(filterCreationEnabledIsSettable);
		result.append(", DeliveryRetryAttemptsIsSettable: ");
		result.append(deliveryRetryAttemptsIsSettable);
		result.append(", DeliveryRetryIntervalIsSettable: ");
		result.append(deliveryRetryIntervalIsSettable);
		result.append(", SubscriptionRemovalActionIsSettable: ");
		result.append(subscriptionRemovalActionIsSettable);
		result.append(", SubscriptionRemovalTimeIntervalIsSettable: ");
		result.append(subscriptionRemovalTimeIntervalIsSettable);
		result.append(", MaxListenerDestinations: ");
		result.append(maxListenerDestinations);
		result.append(", MaxActiveSubscriptions: ");
		result.append(maxActiveSubscriptions);
		result.append(", SubscriptionsPersisted: ");
		result.append(subscriptionsPersisted);
		result.append(')');
		return result.toString();
	}

} //CIM_IndicationServiceCapabilitiesImpl
