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

import org.dmtf.cim.CIM_OSPFProtocolEndpointBase;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM OSPF Protocol Endpoint Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFProtocolEndpointBaseImpl#getTransitDelay <em>Transit Delay</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFProtocolEndpointBaseImpl#getRetransmitInterval <em>Retransmit Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFProtocolEndpointBaseImpl#getAuthType <em>Auth Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFProtocolEndpointBaseImpl#getOtherAuthType <em>Other Auth Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFProtocolEndpointBaseImpl#getAuthKey <em>Auth Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OSPFProtocolEndpointBaseImpl extends CIM_ProtocolEndpointImpl implements CIM_OSPFProtocolEndpointBase {
	/**
	 * The default value of the '{@link #getTransitDelay() <em>Transit Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRANSIT_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitDelay() <em>Transit Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitDelay()
	 * @generated
	 * @ordered
	 */
	protected Integer transitDelay = TRANSIT_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetransmitInterval() <em>Retransmit Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmitInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RETRANSMIT_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetransmitInterval() <em>Retransmit Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmitInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer retransmitInterval = RETRANSMIT_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthType() <em>Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTH_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthType() <em>Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthType()
	 * @generated
	 * @ordered
	 */
	protected Integer authType = AUTH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAuthType() <em>Other Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAuthType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_AUTH_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAuthType() <em>Other Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAuthType()
	 * @generated
	 * @ordered
	 */
	protected String otherAuthType = OTHER_AUTH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthKey() <em>Auth Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthKey()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthKey() <em>Auth Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthKey()
	 * @generated
	 * @ordered
	 */
	protected String authKey = AUTH_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OSPFProtocolEndpointBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OSPFProtocolEndpointBase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTransitDelay() {
		return transitDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitDelay(Integer newTransitDelay) {
		Integer oldTransitDelay = transitDelay;
		transitDelay = newTransitDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY, oldTransitDelay, transitDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRetransmitInterval() {
		return retransmitInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetransmitInterval(Integer newRetransmitInterval) {
		Integer oldRetransmitInterval = retransmitInterval;
		retransmitInterval = newRetransmitInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL, oldRetransmitInterval, retransmitInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAuthType() {
		return authType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthType(Integer newAuthType) {
		Integer oldAuthType = authType;
		authType = newAuthType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE, oldAuthType, authType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAuthType() {
		return otherAuthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAuthType(String newOtherAuthType) {
		String oldOtherAuthType = otherAuthType;
		otherAuthType = newOtherAuthType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE, oldOtherAuthType, otherAuthType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthKey() {
		return authKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthKey(String newAuthKey) {
		String oldAuthKey = authKey;
		authKey = newAuthKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY, oldAuthKey, authKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY:
				return getTransitDelay();
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL:
				return getRetransmitInterval();
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE:
				return getAuthType();
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE:
				return getOtherAuthType();
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY:
				return getAuthKey();
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
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY:
				setTransitDelay((Integer)newValue);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL:
				setRetransmitInterval((Integer)newValue);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE:
				setAuthType((Integer)newValue);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE:
				setOtherAuthType((String)newValue);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY:
				setAuthKey((String)newValue);
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
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY:
				setTransitDelay(TRANSIT_DELAY_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL:
				setRetransmitInterval(RETRANSMIT_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE:
				setAuthType(AUTH_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE:
				setOtherAuthType(OTHER_AUTH_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY:
				setAuthKey(AUTH_KEY_EDEFAULT);
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
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY:
				return TRANSIT_DELAY_EDEFAULT == null ? transitDelay != null : !TRANSIT_DELAY_EDEFAULT.equals(transitDelay);
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL:
				return RETRANSMIT_INTERVAL_EDEFAULT == null ? retransmitInterval != null : !RETRANSMIT_INTERVAL_EDEFAULT.equals(retransmitInterval);
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE:
				return AUTH_TYPE_EDEFAULT == null ? authType != null : !AUTH_TYPE_EDEFAULT.equals(authType);
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE:
				return OTHER_AUTH_TYPE_EDEFAULT == null ? otherAuthType != null : !OTHER_AUTH_TYPE_EDEFAULT.equals(otherAuthType);
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY:
				return AUTH_KEY_EDEFAULT == null ? authKey != null : !AUTH_KEY_EDEFAULT.equals(authKey);
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
		result.append(" (TransitDelay: ");
		result.append(transitDelay);
		result.append(", RetransmitInterval: ");
		result.append(retransmitInterval);
		result.append(", AuthType: ");
		result.append(authType);
		result.append(", OtherAuthType: ");
		result.append(otherAuthType);
		result.append(", AuthKey: ");
		result.append(authKey);
		result.append(')');
		return result.toString();
	}

} //CIM_OSPFProtocolEndpointBaseImpl
