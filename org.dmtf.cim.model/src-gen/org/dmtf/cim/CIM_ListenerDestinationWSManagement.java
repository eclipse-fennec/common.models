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
 * A representation of the model object '<em><b>CIM Listener Destination WS Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ListenerDestinationWSManagement describes the destination for CIM indications to be delivered via WS-Management.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getDestinationEndTo <em>Destination End To</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getContentEncoding <em>Content Encoding</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getDeliveryMode <em>Delivery Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getHeartbeat <em>Heartbeat</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getSendBookmark <em>Send Bookmark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getDeliveryAuth <em>Delivery Auth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getPolyMorphismMode <em>Poly Morphism Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Event' override.Destination='string' override.Destination.Required='true' override.Destination.Description='The destination URL defined in the WS-Eventing Subscribe message. This must match the wsa:Address element in the wse:NotifyTo EPR. The value may be the WS-Addressing anonymous URI if the subscription uses or employs a Pull mode.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ListenerDestinationWSManagement extends CIM_ListenerDestination {
	/**
	 * Returns the value of the '<em><b>Destination End To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Separate To address for notice of abnormal subscription termination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination End To</em>' attribute.
	 * @see #setDestinationEndTo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement_DestinationEndTo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDestinationEndTo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getDestinationEndTo <em>Destination End To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination End To</em>' attribute.
	 * @see #getDestinationEndTo()
	 * @generated
	 */
	void setDestinationEndTo(String value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the events contain localized content, the service should accept a subscription with this Locale block acting as a hint. The language of the event message is encoded in an xml:lang attribute using RFC 3066 language codes. The service should attempt to localize any descriptive content to the specified language when delivering such events.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement_Locale()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

	/**
	 * Returns the value of the '<em><b>Content Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This block acts as a hint to indicate how the delivered events should be encoded. The two standard tokens defined for this purpose are "UTF-8" or "UTF-16", although other encoding formats may be specified if necessary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Encoding</em>' attribute.
	 * @see #setContentEncoding(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement_ContentEncoding()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getContentEncoding();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getContentEncoding <em>Content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Encoding</em>' attribute.
	 * @see #getContentEncoding()
	 * @generated
	 */
	void setContentEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Delivery Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method by which the service is to deliver events to the client. Values are as follows. Push (2): the event is sent to the destination address; depending on the protocol, delivery may not be guaranteed. PushWithAck (3): the service sends the event and waits for a specific acknowledgment message from the subscriber. Events (4): the service collects events into batches and sends the batches to the subscriber. Pull (5): the service collects the events into batches and the subscriber pulls each batch from the service using wxf:Pull.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Mode</em>' attribute.
	 * @see #setDeliveryMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement_DeliveryMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32787..\"]' Values='[\"Push\",\"PushWithAck\",\"Events\",\"Pull\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getDeliveryMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getDeliveryMode <em>Delivery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Mode</em>' attribute.
	 * @see #getDeliveryMode()
	 * @generated
	 */
	void setDeliveryMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Heartbeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies how often heartbeat events are added to the event stream at the specified interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heartbeat</em>' attribute.
	 * @see #setHeartbeat(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement_Heartbeat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds'"
	 * @generated
	 */
	Long getHeartbeat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getHeartbeat <em>Heartbeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heartbeat</em>' attribute.
	 * @see #getHeartbeat()
	 * @generated
	 */
	void setHeartbeat(Long value);

	/**
	 * Returns the value of the '<em><b>Send Bookmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property element that instructs the service to send a bookmark with each event. Bookmarks apply to all delivery modes. The bookmark is a token which represents an abstract pointer in the event stream, but whether it points to the last delivered event or the last event plus one (the upcoming event) makes no difference since the token is supplied to the same implementation during a subsequent wse:Subscribe operation. The service may thus attach any service-specific meaning and structure to the bookmark with no change to the client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Bookmark</em>' attribute.
	 * @see #setSendBookmark(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement_SendBookmark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSendBookmark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getSendBookmark <em>Send Bookmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Bookmark</em>' attribute.
	 * @see #getSendBookmark()
	 * @generated
	 */
	void setSendBookmark(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element may contain a duration that indicates the maximum amount of time the service should allow to elapse while batching EVENT bodies. That is, this time may not be exceeded between the encoding of the first event in the batch and the dispatching of the batch for delivery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement_MaxTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds'"
	 * @generated
	 */
	Long getMaxTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(Long value);

	/**
	 * Returns the value of the '<em><b>Delivery Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URI identifying the WS-Management security profile to be used by the service (acting as publisher) when authenticating to the event sink (consumer) at event delivery time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Auth</em>' attribute.
	 * @see #setDeliveryAuth(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement_DeliveryAuth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDeliveryAuth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getDeliveryAuth <em>Delivery Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Auth</em>' attribute.
	 * @see #getDeliveryAuth()
	 * @generated
	 */
	void setDeliveryAuth(String value);

	/**
	 * Returns the value of the '<em><b>Poly Morphism Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the treatment of Indication subclasses, whether subclasses are to be included and with what set of properties. Valid values are: None, IncludeSubclassProperties, and ExcludeSubclassProperties. Using None, only instances of the parent class are included in the output (event stream). For other modes, subclass instances are included with the sets of properties stated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Poly Morphism Mode</em>' attribute.
	 * @see #setPolyMorphismMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationWSManagement_PolyMorphismMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"..\"]' Values='[\"None\",\"IncludeSubclassProperties\",\"ExcludeSubclassProperties\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getPolyMorphismMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestinationWSManagement#getPolyMorphismMode <em>Poly Morphism Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poly Morphism Mode</em>' attribute.
	 * @see #getPolyMorphismMode()
	 * @generated
	 */
	void setPolyMorphismMode(Integer value);

} // CIM_ListenerDestinationWSManagement
