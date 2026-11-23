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
 * A representation of the model object '<em><b>CIM Indication Service Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An IndicationService is a Service of the CIM Object Manager that is responsible for delivering indications. The following are available settings for the Indication Service. The following describes a possible configuration of settings for the associated Indication Service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getFilterCreationEnabled <em>Filter Creation Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getDeliveryRetryAttempts <em>Delivery Retry Attempts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getDeliveryRetryInterval <em>Delivery Retry Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getSubscriptionRemovalAction <em>Subscription Removal Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getSubscriptionRemovalTimeInterval <em>Subscription Removal Time Interval</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.20.0' UMLPackagePath='CIM::Event' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IndicationServiceSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Filter Creation Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FilterCreationEnabled property controls whether or not clients can create indication filters. If this value is set to false, only the indication filters that exist can be subscribed to. If this value is true clients may attempt to create filters.
	 * Note that implementations may preset this setting and not allow this value to be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Creation Enabled</em>' attribute.
	 * @see #setFilterCreationEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceSettingData_FilterCreationEnabled()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getFilterCreationEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getFilterCreationEnabled <em>Filter Creation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Creation Enabled</em>' attribute.
	 * @see #getFilterCreationEnabled()
	 * @generated
	 */
	void setFilterCreationEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delivery Retry Attempts</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the number of retries that the indication service will try to deliver an indication to a particular listener destination. This does not effect the original delivery attempt, thus if set to 0, it will only try to deliver the indication once. Note that implementations may preset this setting and not allow this value to be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Retry Attempts</em>' attribute.
	 * @see #setDeliveryRetryAttempts(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceSettingData_DeliveryRetryAttempts()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='0' ModelCorrespondence='[\"CIM_IndicationServiceSettingData.DeliveryRetryInterval\"]'"
	 * @generated
	 */
	Integer getDeliveryRetryAttempts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getDeliveryRetryAttempts <em>Delivery Retry Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Retry Attempts</em>' attribute.
	 * @see #getDeliveryRetryAttempts()
	 * @generated
	 */
	void setDeliveryRetryAttempts(Integer value);

	/**
	 * Returns the value of the '<em><b>Delivery Retry Interval</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the minimal time interval in seconds for the indication service to use before delivering an indication to a particular listener destination that previously failed. The implementation may take longer due to QoS or other processing. Note that implementations may preset this setting and not allow this value to be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Retry Interval</em>' attribute.
	 * @see #setDeliveryRetryInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceSettingData_DeliveryRetryInterval()
	 * @model default="30"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' ModelCorrespondence='[\"CIM_IndicationServiceSettingData.DeliveryRetryAttempts\"]' PUnit='second'"
	 * @generated
	 */
	Long getDeliveryRetryInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getDeliveryRetryInterval <em>Delivery Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Retry Interval</em>' attribute.
	 * @see #getDeliveryRetryInterval()
	 * @generated
	 */
	void setDeliveryRetryInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Subscription Removal Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the removal action for subscriptions that have two failed indication deliveries without any successful indication deliveries in between and the time between the failed deliveries exceeded the timeout defined in the SubscriptionRemovalTimeInterval property. "Remove" defines the subscription is to be removed. 
	 * "Disable" indicates that subscription removal process isnot being enforced.
	 * "Ignore" indicates that the removal action is temporarily not enforced.
	 * Implementations may preset this setting and not allow this value to be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Removal Action</em>' attribute.
	 * @see #setSubscriptionRemovalAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceSettingData_SubscriptionRemovalAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"..\"]' Values='[\"Remove\",\"Disable\",\"Ignore\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_IndicationServiceSettingData.SubscriptionRemovalTimeInterval\"]'"
	 * @generated
	 */
	Integer getSubscriptionRemovalAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getSubscriptionRemovalAction <em>Subscription Removal Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Removal Action</em>' attribute.
	 * @see #getSubscriptionRemovalAction()
	 * @generated
	 */
	void setSubscriptionRemovalAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Subscription Removal Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum time between two failed indication deliveries without any successful indication deliveries in between before the SubscriptionRemovalPolicy goes into effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Removal Time Interval</em>' attribute.
	 * @see #setSubscriptionRemovalTimeInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationServiceSettingData_SubscriptionRemovalTimeInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' ModelCorrespondence='[\"CIM_IndicationServiceSettingData.SubscriptionRemovalAction\"]' PUnit='second'"
	 * @generated
	 */
	Long getSubscriptionRemovalTimeInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationServiceSettingData#getSubscriptionRemovalTimeInterval <em>Subscription Removal Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Removal Time Interval</em>' attribute.
	 * @see #getSubscriptionRemovalTimeInterval()
	 * @generated
	 */
	void setSubscriptionRemovalTimeInterval(Long value);

} // CIM_IndicationServiceSettingData
