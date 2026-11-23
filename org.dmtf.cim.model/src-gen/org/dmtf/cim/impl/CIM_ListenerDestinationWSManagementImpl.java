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

import org.dmtf.cim.CIM_ListenerDestinationWSManagement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Listener Destination WS Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationWSManagementImpl#getDestinationEndTo <em>Destination End To</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationWSManagementImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationWSManagementImpl#getContentEncoding <em>Content Encoding</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationWSManagementImpl#getDeliveryMode <em>Delivery Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationWSManagementImpl#getHeartbeat <em>Heartbeat</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationWSManagementImpl#getSendBookmark <em>Send Bookmark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationWSManagementImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationWSManagementImpl#getDeliveryAuth <em>Delivery Auth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationWSManagementImpl#getPolyMorphismMode <em>Poly Morphism Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ListenerDestinationWSManagementImpl extends CIM_ListenerDestinationImpl implements CIM_ListenerDestinationWSManagement {
	/**
	 * The default value of the '{@link #getDestinationEndTo() <em>Destination End To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationEndTo()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_END_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationEndTo() <em>Destination End To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationEndTo()
	 * @generated
	 * @ordered
	 */
	protected String destinationEndTo = DESTINATION_END_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentEncoding() <em>Content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentEncoding() <em>Content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentEncoding()
	 * @generated
	 * @ordered
	 */
	protected String contentEncoding = CONTENT_ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryMode() <em>Delivery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELIVERY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryMode() <em>Delivery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryMode()
	 * @generated
	 * @ordered
	 */
	protected Integer deliveryMode = DELIVERY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeartbeat() <em>Heartbeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeat()
	 * @generated
	 * @ordered
	 */
	protected static final Long HEARTBEAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeartbeat() <em>Heartbeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeat()
	 * @generated
	 * @ordered
	 */
	protected Long heartbeat = HEARTBEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendBookmark() <em>Send Bookmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendBookmark()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SEND_BOOKMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendBookmark() <em>Send Bookmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendBookmark()
	 * @generated
	 * @ordered
	 */
	protected Boolean sendBookmark = SEND_BOOKMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryAuth() <em>Delivery Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAuth()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_AUTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryAuth() <em>Delivery Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAuth()
	 * @generated
	 * @ordered
	 */
	protected String deliveryAuth = DELIVERY_AUTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolyMorphismMode() <em>Poly Morphism Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyMorphismMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POLY_MORPHISM_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolyMorphismMode() <em>Poly Morphism Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyMorphismMode()
	 * @generated
	 * @ordered
	 */
	protected Integer polyMorphismMode = POLY_MORPHISM_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ListenerDestinationWSManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ListenerDestinationWSManagement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationEndTo() {
		return destinationEndTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationEndTo(String newDestinationEndTo) {
		String oldDestinationEndTo = destinationEndTo;
		destinationEndTo = newDestinationEndTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DESTINATION_END_TO, oldDestinationEndTo, destinationEndTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentEncoding() {
		return contentEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentEncoding(String newContentEncoding) {
		String oldContentEncoding = contentEncoding;
		contentEncoding = newContentEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__CONTENT_ENCODING, oldContentEncoding, contentEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeliveryMode() {
		return deliveryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryMode(Integer newDeliveryMode) {
		Integer oldDeliveryMode = deliveryMode;
		deliveryMode = newDeliveryMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_MODE, oldDeliveryMode, deliveryMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHeartbeat() {
		return heartbeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeartbeat(Long newHeartbeat) {
		Long oldHeartbeat = heartbeat;
		heartbeat = newHeartbeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__HEARTBEAT, oldHeartbeat, heartbeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSendBookmark() {
		return sendBookmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendBookmark(Boolean newSendBookmark) {
		Boolean oldSendBookmark = sendBookmark;
		sendBookmark = newSendBookmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__SEND_BOOKMARK, oldSendBookmark, sendBookmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxTime() {
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTime(Long newMaxTime) {
		Long oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliveryAuth() {
		return deliveryAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryAuth(String newDeliveryAuth) {
		String oldDeliveryAuth = deliveryAuth;
		deliveryAuth = newDeliveryAuth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_AUTH, oldDeliveryAuth, deliveryAuth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPolyMorphismMode() {
		return polyMorphismMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolyMorphismMode(Integer newPolyMorphismMode) {
		Integer oldPolyMorphismMode = polyMorphismMode;
		polyMorphismMode = newPolyMorphismMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__POLY_MORPHISM_MODE, oldPolyMorphismMode, polyMorphismMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DESTINATION_END_TO:
				return getDestinationEndTo();
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__LOCALE:
				return getLocale();
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__CONTENT_ENCODING:
				return getContentEncoding();
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_MODE:
				return getDeliveryMode();
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__HEARTBEAT:
				return getHeartbeat();
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__SEND_BOOKMARK:
				return getSendBookmark();
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__MAX_TIME:
				return getMaxTime();
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_AUTH:
				return getDeliveryAuth();
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__POLY_MORPHISM_MODE:
				return getPolyMorphismMode();
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
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DESTINATION_END_TO:
				setDestinationEndTo((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__LOCALE:
				setLocale((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__CONTENT_ENCODING:
				setContentEncoding((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_MODE:
				setDeliveryMode((Integer)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__HEARTBEAT:
				setHeartbeat((Long)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__SEND_BOOKMARK:
				setSendBookmark((Boolean)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__MAX_TIME:
				setMaxTime((Long)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_AUTH:
				setDeliveryAuth((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__POLY_MORPHISM_MODE:
				setPolyMorphismMode((Integer)newValue);
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
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DESTINATION_END_TO:
				setDestinationEndTo(DESTINATION_END_TO_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__LOCALE:
				setLocale(LOCALE_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__CONTENT_ENCODING:
				setContentEncoding(CONTENT_ENCODING_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_MODE:
				setDeliveryMode(DELIVERY_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__HEARTBEAT:
				setHeartbeat(HEARTBEAT_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__SEND_BOOKMARK:
				setSendBookmark(SEND_BOOKMARK_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_AUTH:
				setDeliveryAuth(DELIVERY_AUTH_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__POLY_MORPHISM_MODE:
				setPolyMorphismMode(POLY_MORPHISM_MODE_EDEFAULT);
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
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DESTINATION_END_TO:
				return DESTINATION_END_TO_EDEFAULT == null ? destinationEndTo != null : !DESTINATION_END_TO_EDEFAULT.equals(destinationEndTo);
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__CONTENT_ENCODING:
				return CONTENT_ENCODING_EDEFAULT == null ? contentEncoding != null : !CONTENT_ENCODING_EDEFAULT.equals(contentEncoding);
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_MODE:
				return DELIVERY_MODE_EDEFAULT == null ? deliveryMode != null : !DELIVERY_MODE_EDEFAULT.equals(deliveryMode);
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__HEARTBEAT:
				return HEARTBEAT_EDEFAULT == null ? heartbeat != null : !HEARTBEAT_EDEFAULT.equals(heartbeat);
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__SEND_BOOKMARK:
				return SEND_BOOKMARK_EDEFAULT == null ? sendBookmark != null : !SEND_BOOKMARK_EDEFAULT.equals(sendBookmark);
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__MAX_TIME:
				return MAX_TIME_EDEFAULT == null ? maxTime != null : !MAX_TIME_EDEFAULT.equals(maxTime);
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__DELIVERY_AUTH:
				return DELIVERY_AUTH_EDEFAULT == null ? deliveryAuth != null : !DELIVERY_AUTH_EDEFAULT.equals(deliveryAuth);
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT__POLY_MORPHISM_MODE:
				return POLY_MORPHISM_MODE_EDEFAULT == null ? polyMorphismMode != null : !POLY_MORPHISM_MODE_EDEFAULT.equals(polyMorphismMode);
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
		result.append(" (DestinationEndTo: ");
		result.append(destinationEndTo);
		result.append(", Locale: ");
		result.append(locale);
		result.append(", ContentEncoding: ");
		result.append(contentEncoding);
		result.append(", DeliveryMode: ");
		result.append(deliveryMode);
		result.append(", Heartbeat: ");
		result.append(heartbeat);
		result.append(", SendBookmark: ");
		result.append(sendBookmark);
		result.append(", MaxTime: ");
		result.append(maxTime);
		result.append(", DeliveryAuth: ");
		result.append(deliveryAuth);
		result.append(", PolyMorphismMode: ");
		result.append(polyMorphismMode);
		result.append(')');
		return result.toString();
	}

} //CIM_ListenerDestinationWSManagementImpl
