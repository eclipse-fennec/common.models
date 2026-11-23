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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Indication Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IndicationServiceCapabilities describes whether properties on the Indication Service can be modified by a client.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getFilterCreationEnabledIsSettable <em>Filter Creation Enabled Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getDeliveryRetryAttemptsIsSettable <em>Delivery Retry Attempts Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getDeliveryRetryIntervalIsSettable <em>Delivery Retry Interval Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getSubscriptionRemovalActionIsSettable <em>Subscription Removal Action Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getSubscriptionRemovalTimeIntervalIsSettable <em>Subscription Removal Time Interval Is Settable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getMaxListenerDestinations <em>Max Listener Destinations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getMaxActiveSubscriptions <em>Max Active Subscriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getSubscriptionsPersisted <em>Subscriptions Persisted</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.20.0' UMLPackagePath='CIM::Core::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IndicationServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Filter Creation Enabled Is Settable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the FilterCreationEnabled property can be set by a client application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Creation Enabled Is Settable</em>' attribute.
	 * @see #setFilterCreationEnabledIsSettable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceCapabilities_FilterCreationEnabledIsSettable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_IndicationService.FilterCreationEnabled\"]'"
	 * @generated
	 */
	Boolean getFilterCreationEnabledIsSettable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getFilterCreationEnabledIsSettable <em>Filter Creation Enabled Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Creation Enabled Is Settable</em>' attribute.
	 * @see #getFilterCreationEnabledIsSettable()
	 * @generated
	 */
	void setFilterCreationEnabledIsSettable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delivery Retry Attempts Is Settable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the DeliveryRetryAttempts property can be set by a client application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Retry Attempts Is Settable</em>' attribute.
	 * @see #setDeliveryRetryAttemptsIsSettable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceCapabilities_DeliveryRetryAttemptsIsSettable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_IndicationService.DeliveryRetryAttempts\"]'"
	 * @generated
	 */
	Boolean getDeliveryRetryAttemptsIsSettable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getDeliveryRetryAttemptsIsSettable <em>Delivery Retry Attempts Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Retry Attempts Is Settable</em>' attribute.
	 * @see #getDeliveryRetryAttemptsIsSettable()
	 * @generated
	 */
	void setDeliveryRetryAttemptsIsSettable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delivery Retry Interval Is Settable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the DeliveryRetryInterval property can be set by a client application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Retry Interval Is Settable</em>' attribute.
	 * @see #setDeliveryRetryIntervalIsSettable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceCapabilities_DeliveryRetryIntervalIsSettable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_IndicationService.DeliveryRetryInterval\"]'"
	 * @generated
	 */
	Boolean getDeliveryRetryIntervalIsSettable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getDeliveryRetryIntervalIsSettable <em>Delivery Retry Interval Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Retry Interval Is Settable</em>' attribute.
	 * @see #getDeliveryRetryIntervalIsSettable()
	 * @generated
	 */
	void setDeliveryRetryIntervalIsSettable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Subscription Removal Action Is Settable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the SubscriptionRemovalAction property can be set by a client application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Removal Action Is Settable</em>' attribute.
	 * @see #setSubscriptionRemovalActionIsSettable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceCapabilities_SubscriptionRemovalActionIsSettable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_IndicationService.SubscriptionRemovalAction\"]'"
	 * @generated
	 */
	Boolean getSubscriptionRemovalActionIsSettable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getSubscriptionRemovalActionIsSettable <em>Subscription Removal Action Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Removal Action Is Settable</em>' attribute.
	 * @see #getSubscriptionRemovalActionIsSettable()
	 * @generated
	 */
	void setSubscriptionRemovalActionIsSettable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Subscription Removal Time Interval Is Settable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the SubscriptionRemovalTimeInterval property can be set by a client application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Removal Time Interval Is Settable</em>' attribute.
	 * @see #setSubscriptionRemovalTimeIntervalIsSettable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceCapabilities_SubscriptionRemovalTimeIntervalIsSettable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_IndicationService.SubscriptionRemovalTimeInterval\"]'"
	 * @generated
	 */
	Boolean getSubscriptionRemovalTimeIntervalIsSettable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getSubscriptionRemovalTimeIntervalIsSettable <em>Subscription Removal Time Interval Is Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Removal Time Interval Is Settable</em>' attribute.
	 * @see #getSubscriptionRemovalTimeIntervalIsSettable()
	 * @generated
	 */
	void setSubscriptionRemovalTimeIntervalIsSettable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Listener Destinations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxListenerDestinations specifies the maximum number of instances of CIM_ListenerDestination allowed by the associated CIM_IndicationService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Listener Destinations</em>' attribute.
	 * @see #setMaxListenerDestinations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceCapabilities_MaxListenerDestinations()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='1'"
	 * @generated
	 */
	Long getMaxListenerDestinations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getMaxListenerDestinations <em>Max Listener Destinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Listener Destinations</em>' attribute.
	 * @see #getMaxListenerDestinations()
	 * @generated
	 */
	void setMaxListenerDestinations(Long value);

	/**
	 * Returns the value of the '<em><b>Max Active Subscriptions</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxActiveSubscriptions specifies the maximum total number of instances of CIM_IndicationSubcription and CIM_FilterCollectionSubscription instances supported by the CIM_IndicationService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Active Subscriptions</em>' attribute.
	 * @see #setMaxActiveSubscriptions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceCapabilities_MaxActiveSubscriptions()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='1'"
	 * @generated
	 */
	Long getMaxActiveSubscriptions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getMaxActiveSubscriptions <em>Max Active Subscriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Active Subscriptions</em>' attribute.
	 * @see #getMaxActiveSubscriptions()
	 * @generated
	 */
	void setMaxActiveSubscriptions(Long value);

	/**
	 * Returns the value of the '<em><b>Subscriptions Persisted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionsPersisted indicates whether or not the IndicationService persists indication subscriptions across restarts of the service. If SubscriptionsPersisted has a value of true, the indication service shall persist indication subscriptions across restarts of service. If SubscriptionsPersisted has a value of false, the indication service shall not persist indication subscriptions across restarts of the service. A value of NULL indicates support for subscription persistence is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscriptions Persisted</em>' attribute.
	 * @see #setSubscriptionsPersisted(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceCapabilities_SubscriptionsPersisted()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSubscriptionsPersisted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceCapabilities#getSubscriptionsPersisted <em>Subscriptions Persisted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriptions Persisted</em>' attribute.
	 * @see #getSubscriptionsPersisted()
	 * @generated
	 */
	void setSubscriptionsPersisted(Boolean value);

} // CIM_IndicationServiceCapabilities
