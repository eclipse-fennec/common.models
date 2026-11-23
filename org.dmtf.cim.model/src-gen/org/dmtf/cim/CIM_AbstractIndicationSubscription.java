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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Abstract Indication Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getOnFatalErrorPolicy <em>On Fatal Error Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getOtherOnFatalErrorPolicy <em>Other On Fatal Error Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getFailureTriggerTimeInterval <em>Failure Trigger Time Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionState <em>Subscription State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getOtherSubscriptionState <em>Other Subscription State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getTimeOfLastStateChange <em>Time Of Last State Change</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionDuration <em>Subscription Duration</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionStartTime <em>Subscription Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionTimeRemaining <em>Subscription Time Remaining</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getRepeatNotificationPolicy <em>Repeat Notification Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getOtherRepeatNotificationPolicy <em>Other Repeat Notification Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getRepeatNotificationInterval <em>Repeat Notification Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getRepeatNotificationGap <em>Repeat Notification Gap</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getRepeatNotificationCount <em>Repeat Notification Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionInfo <em>Subscription Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getAlertOnStateChange <em>Alert On State Change</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getLastIndicationIdentifier <em>Last Indication Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getLastIndicationProductionDateTime <em>Last Indication Production Date Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Event' keys='Filter,Handler'"
 * @generated
 */
@ProviderType
public interface CIM_AbstractIndicationSubscription extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Filter that defines the criteria and data of the possible Indications of this subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_Filter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getFilter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Handler addressing delivery of the possible Indications of this subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler</em>' reference.
	 * @see #setHandler(CIM_ListenerDestination)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_Handler()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ListenerDestination REF' Key='true'"
	 * @generated
	 */
	CIM_ListenerDestination getHandler();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getHandler <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(CIM_ListenerDestination value);

	/**
	 * Returns the value of the '<em><b>On Fatal Error Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the desired behavior for a subscription when a fatal error occurs in one of the Indication processing subcomponents (e.g., Indication processor, Indication or instance provider, or Indication handler) and the Indication cannot be successfully sent. Specifically, a failure implies that some aspect of Indication generation, processing or dispatch is no longer functioning and Indications may be lost. If the value of OnFatalErrorPolicy is 2 ("Ignore") or not set (NULL), the subscription MUST continue to be processed in a 'best effort' mode. This mode of operation can lead to unpredictable, and potentially misleading results, because Indications may be lost. If the value is 3 ("Disable"), the subscription MUST be disabled. With this policy, no new Indications will be generated or dispatched until the subscription is explicitly enabled. This is accomplished via the property, SubscriptionState. If the value is 4 ("Remove"), the subscription MUST be deleted. Selecting this policy has the same effect as issuing a DeleteInstance operation on this subscription instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Fatal Error Policy</em>' attribute.
	 * @see #setOnFatalErrorPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_OnFatalErrorPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Ignore\",\"Disable\",\"Remove\"]'"
	 * @generated
	 */
	Integer getOnFatalErrorPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getOnFatalErrorPolicy <em>On Fatal Error Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Fatal Error Policy</em>' attribute.
	 * @see #getOnFatalErrorPolicy()
	 * @generated
	 */
	void setOnFatalErrorPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Other On Fatal Error Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string defining "Other" values for OnFatalErrorPolicy. This value MUST be set to a non NULL value when OnFatalErrorPolicy is set to a value of 1 ("Other"). For all other values, the OtherOnFatalErrorPolicy MUST be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other On Fatal Error Policy</em>' attribute.
	 * @see #setOtherOnFatalErrorPolicy(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_OtherOnFatalErrorPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherOnFatalErrorPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getOtherOnFatalErrorPolicy <em>Other On Fatal Error Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other On Fatal Error Policy</em>' attribute.
	 * @see #getOtherOnFatalErrorPolicy()
	 * @generated
	 */
	void setOtherOnFatalErrorPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Failure Trigger Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FailureTriggerTimeInterval is used by the client to specify a recommended minimum delay before the OnFatalErrorPolicy is implemented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Trigger Time Interval</em>' attribute.
	 * @see #setFailureTriggerTimeInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_FailureTriggerTimeInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getFailureTriggerTimeInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getFailureTriggerTimeInterval <em>Failure Trigger Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Trigger Time Interval</em>' attribute.
	 * @see #getFailureTriggerTimeInterval()
	 * @generated
	 */
	void setFailureTriggerTimeInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Subscription State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current processing state of the subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription State</em>' attribute.
	 * @see #setSubscriptionState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_SubscriptionState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Enabled Degraded\",\"Disabled\"]'"
	 * @generated
	 */
	Integer getSubscriptionState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionState <em>Subscription State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription State</em>' attribute.
	 * @see #getSubscriptionState()
	 * @generated
	 */
	void setSubscriptionState(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Subscription State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string defining "Other" values for SubscriptionState. This value MUST be set to a non NULL value when SubscriptionState is set to a value of 1 ("Other"). For all other values, the OtherSubscriptionState MUST be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Subscription State</em>' attribute.
	 * @see #setOtherSubscriptionState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_OtherSubscriptionState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherSubscriptionState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getOtherSubscriptionState <em>Other Subscription State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Subscription State</em>' attribute.
	 * @see #getOtherSubscriptionState()
	 * @generated
	 */
	void setOtherSubscriptionState(String value);

	/**
	 * Returns the value of the '<em><b>Time Of Last State Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and time of the last state change. This value is based on the notion of local date and time of the Managed System Element running the Indication processing subcomponents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last State Change</em>' attribute.
	 * @see #setTimeOfLastStateChange(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_TimeOfLastStateChange()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastStateChange();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getTimeOfLastStateChange <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last State Change</em>' attribute.
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 */
	void setTimeOfLastStateChange(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionDuration defines the desired length of the subscription. Indications generated after the duration of the subscription has exceeded SubscriptionDuration MUST NOT be sent. The duration of a subscription MAY be changed by modifying this property. An expired subscription MAY be deleted and MUST NOT be modified. If the value of SubscriptionDuration is not set, the subscription MUST be treated as having no expiration date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Duration</em>' attribute.
	 * @see #setSubscriptionDuration(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_SubscriptionDuration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getSubscriptionDuration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionDuration <em>Subscription Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Duration</em>' attribute.
	 * @see #getSubscriptionDuration()
	 * @generated
	 */
	void setSubscriptionDuration(Long value);

	/**
	 * Returns the value of the '<em><b>Subscription Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionStartTime is the time the subscription was started. The value of this property is computed based on the notion of date and time of the ManagedSystemElement running the Indication processing subcomponents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Start Time</em>' attribute.
	 * @see #setSubscriptionStartTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_SubscriptionStartTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getSubscriptionStartTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionStartTime <em>Subscription Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Start Time</em>' attribute.
	 * @see #getSubscriptionStartTime()
	 * @generated
	 */
	void setSubscriptionStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Time Remaining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionTimeRemaining is a computed value that provides a snapshot of the time remaining in the Subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Time Remaining</em>' attribute.
	 * @see #setSubscriptionTimeRemaining(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_SubscriptionTimeRemaining()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getSubscriptionTimeRemaining();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionTimeRemaining <em>Subscription Time Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Time Remaining</em>' attribute.
	 * @see #getSubscriptionTimeRemaining()
	 * @generated
	 */
	void setSubscriptionTimeRemaining(Long value);

	/**
	 * Returns the value of the '<em><b>Repeat Notification Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RepeatNotificationPolicy property defines the desired behavior for handling Indications that report the occurrence of the same underlying event (e.g., the disk is still generating I/O errors and has not yet been repaired). The defined semantics for the RepeatNotificationCount, RepeatNotificationInterval, and RepeatNotificationGap properties depend on the value of RepeatNotificationPolicy, but values for these properties MUST be set if the property is defined for the selected policy. If the value of RepeatNotificationPolicy is 0 ("Unknown") or not set, no special processing for repeat Indications is defined by the subscription. The semantics associated with the handling of repeat Indications MAY be defined by the Indication processing subcomponents. If the value of RepeatNotificationPolicy is 2 ("None"), special processing of repeat Indications MUST NOT be performed. If the value is 3 ("Suppress") the first RepeatNotificationCount Indications, describing the same event, MUST be sent and all subsequent Indications for this event suppressed for the remainder of the time interval RepeatNotificationInterval. A new interval starts when the next Indication for this event is received. If the value of RepeatNotificationPolicy is 4 ("Delay") and an Indication is received, this Indication MUST be suppressed if, including this Indication, RepeatNoticationCount or fewer Indications for this event have been received during the prior time interval defined by RepeatNotificationInterval. If this Indication is the RepeatNotificationCount + 1 Indication, this Indication MUST be sent and all subsequent Indications for this event ignored until the RepeatNotificationGap has elapsed. A RepeatNotificationInterval MAY NOT overlap a RepeatNotificationGap time interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Notification Policy</em>' attribute.
	 * @see #setRepeatNotificationPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_RepeatNotificationPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"None\",\"Suppress\",\"Delay\"]'"
	 * @generated
	 */
	Integer getRepeatNotificationPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getRepeatNotificationPolicy <em>Repeat Notification Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Notification Policy</em>' attribute.
	 * @see #getRepeatNotificationPolicy()
	 * @generated
	 */
	void setRepeatNotificationPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Repeat Notification Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string defining "Other" values for RepeatNotificationPolicy. This value MUST be set to a non NULL value when RepeatNotificationPolicy is set to a value of 1 ("Other"). For all other values, the OtherRepeatNotificationPolicy MUST be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Repeat Notification Policy</em>' attribute.
	 * @see #setOtherRepeatNotificationPolicy(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_OtherRepeatNotificationPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherRepeatNotificationPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getOtherRepeatNotificationPolicy <em>Other Repeat Notification Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Repeat Notification Policy</em>' attribute.
	 * @see #getOtherRepeatNotificationPolicy()
	 * @generated
	 */
	void setOtherRepeatNotificationPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Repeat Notification Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the time interval for the repeat notification policy calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Notification Interval</em>' attribute.
	 * @see #setRepeatNotificationInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_RepeatNotificationInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getRepeatNotificationInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getRepeatNotificationInterval <em>Repeat Notification Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Notification Interval</em>' attribute.
	 * @see #getRepeatNotificationInterval()
	 * @generated
	 */
	void setRepeatNotificationInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Repeat Notification Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the gap interval for the repeat notification policy calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Notification Gap</em>' attribute.
	 * @see #setRepeatNotificationGap(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_RepeatNotificationGap()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getRepeatNotificationGap();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getRepeatNotificationGap <em>Repeat Notification Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Notification Gap</em>' attribute.
	 * @see #getRepeatNotificationGap()
	 * @generated
	 */
	void setRepeatNotificationGap(Long value);

	/**
	 * Returns the value of the '<em><b>Repeat Notification Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the count property for the repeat notification policy calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Notification Count</em>' attribute.
	 * @see #setRepeatNotificationCount(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_RepeatNotificationCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRepeatNotificationCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getRepeatNotificationCount <em>Repeat Notification Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Notification Count</em>' attribute.
	 * @see #getRepeatNotificationCount()
	 * @generated
	 */
	void setRepeatNotificationCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Subscription Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subscription identification information. May be used by the client or protocol to store subscription identification information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Info</em>' attribute.
	 * @see #setSubscriptionInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_SubscriptionInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true'"
	 * @generated
	 */
	String getSubscriptionInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getSubscriptionInfo <em>Subscription Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Info</em>' attribute.
	 * @see #getSubscriptionInfo()
	 * @generated
	 */
	void setSubscriptionInfo(String value);

	/**
	 * Returns the value of the '<em><b>Alert On State Change</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to TRUE if a Listener should receive an IndicationSubscriptionAlert if a state change affects the subscription. Otherwise it is set to FALSE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alert On State Change</em>' attribute.
	 * @see #setAlertOnStateChange(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_AlertOnStateChange()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAlertOnStateChange();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getAlertOnStateChange <em>Alert On State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alert On State Change</em>' attribute.
	 * @see #getAlertOnStateChange()
	 * @generated
	 */
	void setAlertOnStateChange(Boolean value);

	/**
	 * Returns the value of the '<em><b>Last Indication Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IndicationIdentifier for the last indication produced for this indication subscription.This property shall be updated when the indication is produced regardless if the indication was delivered to its destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Indication Identifier</em>' attribute.
	 * @see #setLastIndicationIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_LastIndicationIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Indication.IndicationIdentifier\"]'"
	 * @generated
	 */
	String getLastIndicationIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getLastIndicationIdentifier <em>Last Indication Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Indication Identifier</em>' attribute.
	 * @see #getLastIndicationIdentifier()
	 * @generated
	 */
	void setLastIndicationIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Last Indication Production Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time of the last time an indication was produced for this subscription. This property shall be updated when the indication is produced regardless if the indication was delivered to its destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Indication Production Date Time</em>' attribute.
	 * @see #setLastIndicationProductionDateTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractIndicationSubscription_LastIndicationProductionDateTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_Indication.IndicationTime\"]'"
	 * @generated
	 */
	String getLastIndicationProductionDateTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractIndicationSubscription#getLastIndicationProductionDateTime <em>Last Indication Production Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Indication Production Date Time</em>' attribute.
	 * @see #getLastIndicationProductionDateTime()
	 * @generated
	 */
	void setLastIndicationProductionDateTime(String value);

} // CIM_AbstractIndicationSubscription
