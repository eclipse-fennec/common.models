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

import java.util.Collection;

import org.dmtf.cim.CIM_DHCPProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM DHCP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPProtocolEndpointImpl#getClientState <em>Client State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPProtocolEndpointImpl#getRenewalTime <em>Renewal Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPProtocolEndpointImpl#getRebindingTime <em>Rebinding Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPProtocolEndpointImpl#getLeaseTime <em>Lease Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPProtocolEndpointImpl#getLeaseObtained <em>Lease Obtained</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPProtocolEndpointImpl#getLeaseExpires <em>Lease Expires</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPProtocolEndpointImpl#getOptionsReceived <em>Options Received</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DHCPProtocolEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_DHCPProtocolEndpoint {
	/**
	 * The default value of the '{@link #getClientState() <em>Client State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLIENT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientState() <em>Client State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientState()
	 * @generated
	 * @ordered
	 */
	protected Integer clientState = CLIENT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenewalTime() <em>Renewal Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenewalTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long RENEWAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRenewalTime() <em>Renewal Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenewalTime()
	 * @generated
	 * @ordered
	 */
	protected Long renewalTime = RENEWAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRebindingTime() <em>Rebinding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebindingTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long REBINDING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRebindingTime() <em>Rebinding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebindingTime()
	 * @generated
	 * @ordered
	 */
	protected Long rebindingTime = REBINDING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaseTime() <em>Lease Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long LEASE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaseTime() <em>Lease Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaseTime()
	 * @generated
	 * @ordered
	 */
	protected Long leaseTime = LEASE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaseObtained() <em>Lease Obtained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaseObtained()
	 * @generated
	 * @ordered
	 */
	protected static final String LEASE_OBTAINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaseObtained() <em>Lease Obtained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaseObtained()
	 * @generated
	 * @ordered
	 */
	protected String leaseObtained = LEASE_OBTAINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaseExpires() <em>Lease Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaseExpires()
	 * @generated
	 * @ordered
	 */
	protected static final String LEASE_EXPIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaseExpires() <em>Lease Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaseExpires()
	 * @generated
	 * @ordered
	 */
	protected String leaseExpires = LEASE_EXPIRES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionsReceived() <em>Options Received</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsReceived()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> optionsReceived;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DHCPProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DHCPProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getClientState() {
		return clientState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientState(Integer newClientState) {
		Integer oldClientState = clientState;
		clientState = newClientState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__CLIENT_STATE, oldClientState, clientState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRenewalTime() {
		return renewalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenewalTime(Long newRenewalTime) {
		Long oldRenewalTime = renewalTime;
		renewalTime = newRenewalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__RENEWAL_TIME, oldRenewalTime, renewalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRebindingTime() {
		return rebindingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRebindingTime(Long newRebindingTime) {
		Long oldRebindingTime = rebindingTime;
		rebindingTime = newRebindingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__REBINDING_TIME, oldRebindingTime, rebindingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLeaseTime() {
		return leaseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaseTime(Long newLeaseTime) {
		Long oldLeaseTime = leaseTime;
		leaseTime = newLeaseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_TIME, oldLeaseTime, leaseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLeaseObtained() {
		return leaseObtained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaseObtained(String newLeaseObtained) {
		String oldLeaseObtained = leaseObtained;
		leaseObtained = newLeaseObtained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_OBTAINED, oldLeaseObtained, leaseObtained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLeaseExpires() {
		return leaseExpires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaseExpires(String newLeaseExpires) {
		String oldLeaseExpires = leaseExpires;
		leaseExpires = newLeaseExpires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_EXPIRES, oldLeaseExpires, leaseExpires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getOptionsReceived() {
		if (optionsReceived == null) {
			optionsReceived = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__OPTIONS_RECEIVED);
		}
		return optionsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__CLIENT_STATE:
				return getClientState();
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__RENEWAL_TIME:
				return getRenewalTime();
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__REBINDING_TIME:
				return getRebindingTime();
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_TIME:
				return getLeaseTime();
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_OBTAINED:
				return getLeaseObtained();
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_EXPIRES:
				return getLeaseExpires();
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__OPTIONS_RECEIVED:
				return getOptionsReceived();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__CLIENT_STATE:
				setClientState((Integer)newValue);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__RENEWAL_TIME:
				setRenewalTime((Long)newValue);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__REBINDING_TIME:
				setRebindingTime((Long)newValue);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_TIME:
				setLeaseTime((Long)newValue);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_OBTAINED:
				setLeaseObtained((String)newValue);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_EXPIRES:
				setLeaseExpires((String)newValue);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__OPTIONS_RECEIVED:
				getOptionsReceived().clear();
				getOptionsReceived().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__CLIENT_STATE:
				setClientState(CLIENT_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__RENEWAL_TIME:
				setRenewalTime(RENEWAL_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__REBINDING_TIME:
				setRebindingTime(REBINDING_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_TIME:
				setLeaseTime(LEASE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_OBTAINED:
				setLeaseObtained(LEASE_OBTAINED_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_EXPIRES:
				setLeaseExpires(LEASE_EXPIRES_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__OPTIONS_RECEIVED:
				getOptionsReceived().clear();
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
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__CLIENT_STATE:
				return CLIENT_STATE_EDEFAULT == null ? clientState != null : !CLIENT_STATE_EDEFAULT.equals(clientState);
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__RENEWAL_TIME:
				return RENEWAL_TIME_EDEFAULT == null ? renewalTime != null : !RENEWAL_TIME_EDEFAULT.equals(renewalTime);
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__REBINDING_TIME:
				return REBINDING_TIME_EDEFAULT == null ? rebindingTime != null : !REBINDING_TIME_EDEFAULT.equals(rebindingTime);
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_TIME:
				return LEASE_TIME_EDEFAULT == null ? leaseTime != null : !LEASE_TIME_EDEFAULT.equals(leaseTime);
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_OBTAINED:
				return LEASE_OBTAINED_EDEFAULT == null ? leaseObtained != null : !LEASE_OBTAINED_EDEFAULT.equals(leaseObtained);
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__LEASE_EXPIRES:
				return LEASE_EXPIRES_EDEFAULT == null ? leaseExpires != null : !LEASE_EXPIRES_EDEFAULT.equals(leaseExpires);
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT__OPTIONS_RECEIVED:
				return optionsReceived != null && !optionsReceived.isEmpty();
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
		result.append(" (ClientState: ");
		result.append(clientState);
		result.append(", RenewalTime: ");
		result.append(renewalTime);
		result.append(", RebindingTime: ");
		result.append(rebindingTime);
		result.append(", LeaseTime: ");
		result.append(leaseTime);
		result.append(", LeaseObtained: ");
		result.append(leaseObtained);
		result.append(", LeaseExpires: ");
		result.append(leaseExpires);
		result.append(", OptionsReceived: ");
		result.append(optionsReceived);
		result.append(')');
		return result.toString();
	}

} //CIM_DHCPProtocolEndpointImpl
