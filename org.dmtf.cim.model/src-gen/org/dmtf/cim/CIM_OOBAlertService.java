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
 * A representation of the model object '<em><b>CIM OOB Alert Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This Service is implemented by a LogicalDevice (e.g. a NetworkAdapter or Modem) that is capable of sending alert messages to a remote destination. The alert messages reflect the state of one or more ManagedSystemElements. The Elements for which alert messages are forwarded, are defined by enumerating the ProvidesServiceToElement association for the Service. Out of Band (OOB) refers to the mechanisms in use when normal OS-based management mechanisms are not possible. This occurs when the OS is down or not functioning properly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getDestinationType <em>Destination Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getOtherDestinationTypeDescription <em>Other Destination Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getMessageFormat <em>Message Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getOtherMessageFormatDescription <em>Other Message Format Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getOnlySendsFixedMessage <em>Only Sends Fixed Message</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getFixedPartOfMessage <em>Fixed Part Of Message</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getDestinationIsAckCapable <em>Destination Is Ack Capable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getRetryCount <em>Retry Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getPresenceHeartbeatCapable <em>Presence Heartbeat Capable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OOBAlertService#getEnablePresenceHeartbeats <em>Enable Presence Heartbeats</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::Boot' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OOBAlertService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Destination Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the alert destination. For example, the alert may be received by an application listening on a UDP Port on a remote destination, or could be sent to a pager (values 4 or 2, respectively).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Type</em>' attribute.
	 * @see #setDestinationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_DestinationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Pager\",\"TCP Port\",\"UDP Port\"]' ModelCorrespondence='[\"CIM_OOBAlertService.OtherDestinationTypeDescription\"]'"
	 * @generated
	 */
	Integer getDestinationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getDestinationType <em>Destination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Type</em>' attribute.
	 * @see #getDestinationType()
	 * @generated
	 */
	void setDestinationType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Destination Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the alert DestinationType. This is used when the DestinationType is set to "Other" (value=1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Destination Type Description</em>' attribute.
	 * @see #setOtherDestinationTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_OtherDestinationTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_OOBAlertService.DestinationType\"]'"
	 * @generated
	 */
	String getOtherDestinationTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getOtherDestinationTypeDescription <em>Other Destination Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Destination Type Description</em>' attribute.
	 * @see #getOtherDestinationTypeDescription()
	 * @generated
	 */
	void setOtherDestinationTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Destination Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The address where this Service sends the alerts. The format of this address depends on the DestinationType. For example, if the DestinationType is a UDP Port (value=4), then this property contains a string identifying the IP address of the Port (for example, 111.222.333.444:4567). If DestinationType is a pager (value=2), then the address is a Pager number (for example, 18002257654).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Address</em>' attribute.
	 * @see #setDestinationAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_DestinationAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDestinationAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getDestinationAddress <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Address</em>' attribute.
	 * @see #getDestinationAddress()
	 * @generated
	 */
	void setDestinationAddress(String value);

	/**
	 * Returns the value of the '<em><b>Message Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the Alert Message sent by the Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Format</em>' attribute.
	 * @see #setMessageFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_MessageFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Numeric\",\"AlphaNumeric\",\"Free Form Text\",\"Platform Event Trap\"]' ModelCorrespondence='[\"CIM_OOBAlertService.OtherMessageFormatDescription\"]'"
	 * @generated
	 */
	Integer getMessageFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getMessageFormat <em>Message Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Format</em>' attribute.
	 * @see #getMessageFormat()
	 * @generated
	 */
	void setMessageFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Message Format Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the format of the alert message used by the Service when the AlertMessageFormat property is set to "Other" (value=1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Message Format Description</em>' attribute.
	 * @see #setOtherMessageFormatDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_OtherMessageFormatDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_OOBAlertService.MessageFormat\"]'"
	 * @generated
	 */
	String getOtherMessageFormatDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getOtherMessageFormatDescription <em>Other Message Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Message Format Description</em>' attribute.
	 * @see #getOtherMessageFormatDescription()
	 * @generated
	 */
	void setOtherMessageFormatDescription(String value);

	/**
	 * Returns the value of the '<em><b>Only Sends Fixed Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the AlertService only uses a fixed message to send an alert, then this flag should be set to TRUE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Only Sends Fixed Message</em>' attribute.
	 * @see #setOnlySendsFixedMessage(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_OnlySendsFixedMessage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getOnlySendsFixedMessage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getOnlySendsFixedMessage <em>Only Sends Fixed Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Sends Fixed Message</em>' attribute.
	 * @see #getOnlySendsFixedMessage()
	 * @generated
	 */
	void setOnlySendsFixedMessage(Boolean value);

	/**
	 * Returns the value of the '<em><b>Fixed Part Of Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AlertService may require some fixed data to send as part of the message. This may include things like the address or name of the System. This string contains the complete message when the property, OnlySendsFixedMessage, is set to TRUE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Part Of Message</em>' attribute.
	 * @see #setFixedPartOfMessage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_FixedPartOfMessage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFixedPartOfMessage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getFixedPartOfMessage <em>Fixed Part Of Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Part Of Message</em>' attribute.
	 * @see #getFixedPartOfMessage()
	 * @generated
	 */
	void setFixedPartOfMessage(String value);

	/**
	 * Returns the value of the '<em><b>Destination Is Ack Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the destination is capable of sending an acknowledgement to the alert, then this flag is set to TRUE. The format of the acknowledgement is determined by the DestinationType and the MessageFormat.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Is Ack Capable</em>' attribute.
	 * @see #setDestinationIsAckCapable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_DestinationIsAckCapable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getDestinationIsAckCapable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getDestinationIsAckCapable <em>Destination Is Ack Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Is Ack Capable</em>' attribute.
	 * @see #getDestinationIsAckCapable()
	 * @generated
	 */
	void setDestinationIsAckCapable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AlertService may retry and send an alert more than once. The RetryCount identifies how often the operation will be repeated. If DestinationIsAckCapable is set to TRUE, then the retry will only be done if an Ack is not received. Otherwise, the retries are done unconditionally.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Count</em>' attribute.
	 * @see #setRetryCount(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_RetryCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRetryCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getRetryCount <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Count</em>' attribute.
	 * @see #getRetryCount()
	 * @generated
	 */
	void setRetryCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interval between each successive retry, in seconds. If DestinationIsAckCapable is set to TRUE, then this interval is used as a timeout interval, before the next retry is done.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Interval</em>' attribute.
	 * @see #setRetryInterval(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_RetryInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Integer getRetryInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Interval</em>' attribute.
	 * @see #getRetryInterval()
	 * @generated
	 */
	void setRetryInterval(Integer value);

	/**
	 * Returns the value of the '<em><b>Presence Heartbeat Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the OOB Alerting service is capable of sending Presence heart beat messages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presence Heartbeat Capable</em>' attribute.
	 * @see #setPresenceHeartbeatCapable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_PresenceHeartbeatCapable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Read='true'"
	 * @generated
	 */
	Boolean getPresenceHeartbeatCapable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getPresenceHeartbeatCapable <em>Presence Heartbeat Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence Heartbeat Capable</em>' attribute.
	 * @see #getPresenceHeartbeatCapable()
	 * @generated
	 */
	void setPresenceHeartbeatCapable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Presence Heartbeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When set to true causes the OOBAlertService to send Presence heart beat messages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Presence Heartbeats</em>' attribute.
	 * @see #setEnablePresenceHeartbeats(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertService_EnablePresenceHeartbeats()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_OOBAlertService.PresenceHeartbeatCapable\"]'"
	 * @generated
	 */
	Boolean getEnablePresenceHeartbeats();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OOBAlertService#getEnablePresenceHeartbeats <em>Enable Presence Heartbeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Presence Heartbeats</em>' attribute.
	 * @see #getEnablePresenceHeartbeats()
	 * @generated
	 */
	void setEnablePresenceHeartbeats(Boolean value);

} // CIM_OOBAlertService
