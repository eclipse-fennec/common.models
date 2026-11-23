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

import org.dmtf.cim.CIM_Notary;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Notary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NotaryImpl#getComparitors <em>Comparitors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NotaryImpl#getSealProtocol <em>Seal Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NotaryImpl#getCharterIssued <em>Charter Issued</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NotaryImpl#getCharterExpired <em>Charter Expired</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NotaryImpl extends CIM_CredentialManagementServiceImpl implements CIM_Notary {
	/**
	 * The default value of the '{@link #getComparitors() <em>Comparitors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparitors()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMPARITORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparitors() <em>Comparitors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparitors()
	 * @generated
	 * @ordered
	 */
	protected Integer comparitors = COMPARITORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSealProtocol() <em>Seal Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String SEAL_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSealProtocol() <em>Seal Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealProtocol()
	 * @generated
	 * @ordered
	 */
	protected String sealProtocol = SEAL_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharterIssued() <em>Charter Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharterIssued()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARTER_ISSUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharterIssued() <em>Charter Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharterIssued()
	 * @generated
	 * @ordered
	 */
	protected String charterIssued = CHARTER_ISSUED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharterExpired() <em>Charter Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharterExpired()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARTER_EXPIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharterExpired() <em>Charter Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharterExpired()
	 * @generated
	 * @ordered
	 */
	protected String charterExpired = CHARTER_EXPIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NotaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Notary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getComparitors() {
		return comparitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparitors(Integer newComparitors) {
		Integer oldComparitors = comparitors;
		comparitors = newComparitors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NOTARY__COMPARITORS, oldComparitors, comparitors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSealProtocol() {
		return sealProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSealProtocol(String newSealProtocol) {
		String oldSealProtocol = sealProtocol;
		sealProtocol = newSealProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NOTARY__SEAL_PROTOCOL, oldSealProtocol, sealProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharterIssued() {
		return charterIssued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharterIssued(String newCharterIssued) {
		String oldCharterIssued = charterIssued;
		charterIssued = newCharterIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NOTARY__CHARTER_ISSUED, oldCharterIssued, charterIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharterExpired() {
		return charterExpired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharterExpired(String newCharterExpired) {
		String oldCharterExpired = charterExpired;
		charterExpired = newCharterExpired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NOTARY__CHARTER_EXPIRED, oldCharterExpired, charterExpired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NOTARY__COMPARITORS:
				return getComparitors();
			case CimPackage.CIM_NOTARY__SEAL_PROTOCOL:
				return getSealProtocol();
			case CimPackage.CIM_NOTARY__CHARTER_ISSUED:
				return getCharterIssued();
			case CimPackage.CIM_NOTARY__CHARTER_EXPIRED:
				return getCharterExpired();
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
			case CimPackage.CIM_NOTARY__COMPARITORS:
				setComparitors((Integer)newValue);
				return;
			case CimPackage.CIM_NOTARY__SEAL_PROTOCOL:
				setSealProtocol((String)newValue);
				return;
			case CimPackage.CIM_NOTARY__CHARTER_ISSUED:
				setCharterIssued((String)newValue);
				return;
			case CimPackage.CIM_NOTARY__CHARTER_EXPIRED:
				setCharterExpired((String)newValue);
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
			case CimPackage.CIM_NOTARY__COMPARITORS:
				setComparitors(COMPARITORS_EDEFAULT);
				return;
			case CimPackage.CIM_NOTARY__SEAL_PROTOCOL:
				setSealProtocol(SEAL_PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_NOTARY__CHARTER_ISSUED:
				setCharterIssued(CHARTER_ISSUED_EDEFAULT);
				return;
			case CimPackage.CIM_NOTARY__CHARTER_EXPIRED:
				setCharterExpired(CHARTER_EXPIRED_EDEFAULT);
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
			case CimPackage.CIM_NOTARY__COMPARITORS:
				return COMPARITORS_EDEFAULT == null ? comparitors != null : !COMPARITORS_EDEFAULT.equals(comparitors);
			case CimPackage.CIM_NOTARY__SEAL_PROTOCOL:
				return SEAL_PROTOCOL_EDEFAULT == null ? sealProtocol != null : !SEAL_PROTOCOL_EDEFAULT.equals(sealProtocol);
			case CimPackage.CIM_NOTARY__CHARTER_ISSUED:
				return CHARTER_ISSUED_EDEFAULT == null ? charterIssued != null : !CHARTER_ISSUED_EDEFAULT.equals(charterIssued);
			case CimPackage.CIM_NOTARY__CHARTER_EXPIRED:
				return CHARTER_EXPIRED_EDEFAULT == null ? charterExpired != null : !CHARTER_EXPIRED_EDEFAULT.equals(charterExpired);
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
		result.append(" (Comparitors: ");
		result.append(comparitors);
		result.append(", SealProtocol: ");
		result.append(sealProtocol);
		result.append(", CharterIssued: ");
		result.append(charterIssued);
		result.append(", CharterExpired: ");
		result.append(charterExpired);
		result.append(')');
		return result.toString();
	}

} //CIM_NotaryImpl
