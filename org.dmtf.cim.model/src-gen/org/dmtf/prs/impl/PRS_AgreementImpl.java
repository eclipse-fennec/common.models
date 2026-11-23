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
package org.dmtf.prs.impl;

import org.dmtf.prs.PRS_Agreement;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_AgreementImpl#getContractID <em>Contract ID</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AgreementImpl#getAgreementType <em>Agreement Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_AgreementImpl extends PRS_ExchangeElementImpl implements PRS_Agreement {
	/**
	 * The default value of the '{@link #getContractID() <em>Contract ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContractID() <em>Contract ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractID()
	 * @generated
	 * @ordered
	 */
	protected String contractID = CONTRACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgreementType() <em>Agreement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementType()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementType() <em>Agreement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementType()
	 * @generated
	 * @ordered
	 */
	protected String agreementType = AGREEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_AgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContractID() {
		return contractID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContractID(String newContractID) {
		String oldContractID = contractID;
		contractID = newContractID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_AGREEMENT__CONTRACT_ID, oldContractID, contractID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementType() {
		return agreementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementType(String newAgreementType) {
		String oldAgreementType = agreementType;
		agreementType = newAgreementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_AGREEMENT__AGREEMENT_TYPE, oldAgreementType, agreementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_AGREEMENT__CONTRACT_ID:
				return getContractID();
			case PrsPackage.PRS_AGREEMENT__AGREEMENT_TYPE:
				return getAgreementType();
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
			case PrsPackage.PRS_AGREEMENT__CONTRACT_ID:
				setContractID((String)newValue);
				return;
			case PrsPackage.PRS_AGREEMENT__AGREEMENT_TYPE:
				setAgreementType((String)newValue);
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
			case PrsPackage.PRS_AGREEMENT__CONTRACT_ID:
				setContractID(CONTRACT_ID_EDEFAULT);
				return;
			case PrsPackage.PRS_AGREEMENT__AGREEMENT_TYPE:
				setAgreementType(AGREEMENT_TYPE_EDEFAULT);
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
			case PrsPackage.PRS_AGREEMENT__CONTRACT_ID:
				return CONTRACT_ID_EDEFAULT == null ? contractID != null : !CONTRACT_ID_EDEFAULT.equals(contractID);
			case PrsPackage.PRS_AGREEMENT__AGREEMENT_TYPE:
				return AGREEMENT_TYPE_EDEFAULT == null ? agreementType != null : !AGREEMENT_TYPE_EDEFAULT.equals(agreementType);
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
		result.append(" (ContractID: ");
		result.append(contractID);
		result.append(", AgreementType: ");
		result.append(agreementType);
		result.append(')');
		return result.toString();
	}

} //PRS_AgreementImpl
