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

import org.dmtf.cim.CIM_PeerIDPayloadFilterEntry;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Peer ID Payload Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PeerIDPayloadFilterEntryImpl#getMatchIdentityType <em>Match Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PeerIDPayloadFilterEntryImpl#getMatchIdentityValue <em>Match Identity Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PeerIDPayloadFilterEntryImpl extends CIM_FilterEntryBaseImpl implements CIM_PeerIDPayloadFilterEntry {
	/**
	 * The default value of the '{@link #getMatchIdentityType() <em>Match Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchIdentityType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MATCH_IDENTITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchIdentityType() <em>Match Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchIdentityType()
	 * @generated
	 * @ordered
	 */
	protected Integer matchIdentityType = MATCH_IDENTITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchIdentityValue() <em>Match Identity Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchIdentityValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_IDENTITY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchIdentityValue() <em>Match Identity Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchIdentityValue()
	 * @generated
	 * @ordered
	 */
	protected String matchIdentityValue = MATCH_IDENTITY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PeerIDPayloadFilterEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PeerIDPayloadFilterEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMatchIdentityType() {
		return matchIdentityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchIdentityType(Integer newMatchIdentityType) {
		Integer oldMatchIdentityType = matchIdentityType;
		matchIdentityType = newMatchIdentityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_TYPE, oldMatchIdentityType, matchIdentityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatchIdentityValue() {
		return matchIdentityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchIdentityValue(String newMatchIdentityValue) {
		String oldMatchIdentityValue = matchIdentityValue;
		matchIdentityValue = newMatchIdentityValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_VALUE, oldMatchIdentityValue, matchIdentityValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_TYPE:
				return getMatchIdentityType();
			case CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_VALUE:
				return getMatchIdentityValue();
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
			case CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_TYPE:
				setMatchIdentityType((Integer)newValue);
				return;
			case CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_VALUE:
				setMatchIdentityValue((String)newValue);
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
			case CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_TYPE:
				setMatchIdentityType(MATCH_IDENTITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_VALUE:
				setMatchIdentityValue(MATCH_IDENTITY_VALUE_EDEFAULT);
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
			case CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_TYPE:
				return MATCH_IDENTITY_TYPE_EDEFAULT == null ? matchIdentityType != null : !MATCH_IDENTITY_TYPE_EDEFAULT.equals(matchIdentityType);
			case CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY__MATCH_IDENTITY_VALUE:
				return MATCH_IDENTITY_VALUE_EDEFAULT == null ? matchIdentityValue != null : !MATCH_IDENTITY_VALUE_EDEFAULT.equals(matchIdentityValue);
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
		result.append(" (MatchIdentityType: ");
		result.append(matchIdentityType);
		result.append(", MatchIdentityValue: ");
		result.append(matchIdentityValue);
		result.append(')');
		return result.toString();
	}

} //CIM_PeerIDPayloadFilterEntryImpl
