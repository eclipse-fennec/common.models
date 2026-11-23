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

import org.dmtf.cim.CIM_SignedCredential;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Signed Credential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SignedCredentialImpl#getIssuerName <em>Issuer Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SignedCredentialImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SignedCredentialImpl#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SignedCredentialImpl#getOtherSignatureAlgorithm <em>Other Signature Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SignedCredentialImpl#getSignatureAlgorithmOID <em>Signature Algorithm OID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SignedCredentialImpl extends CIM_CredentialImpl implements CIM_SignedCredential {
	/**
	 * The default value of the '{@link #getIssuerName() <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerName()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuerName() <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerName()
	 * @generated
	 * @ordered
	 */
	protected String issuerName = ISSUER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> signature;

	/**
	 * The default value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIGNATURE_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Integer signatureAlgorithm = SIGNATURE_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSignatureAlgorithm() <em>Other Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SIGNATURE_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSignatureAlgorithm() <em>Other Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String otherSignatureAlgorithm = OTHER_SIGNATURE_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureAlgorithmOID() <em>Signature Algorithm OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithmOID()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ALGORITHM_OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureAlgorithmOID() <em>Signature Algorithm OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithmOID()
	 * @generated
	 * @ordered
	 */
	protected String signatureAlgorithmOID = SIGNATURE_ALGORITHM_OID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SignedCredentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SignedCredential();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssuerName() {
		return issuerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuerName(String newIssuerName) {
		String oldIssuerName = issuerName;
		issuerName = newIssuerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SIGNED_CREDENTIAL__ISSUER_NAME, oldIssuerName, issuerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSignature() {
		if (signature == null) {
			signature = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureAlgorithm(Integer newSignatureAlgorithm) {
		Integer oldSignatureAlgorithm = signatureAlgorithm;
		signatureAlgorithm = newSignatureAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM, oldSignatureAlgorithm, signatureAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSignatureAlgorithm() {
		return otherSignatureAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSignatureAlgorithm(String newOtherSignatureAlgorithm) {
		String oldOtherSignatureAlgorithm = otherSignatureAlgorithm;
		otherSignatureAlgorithm = newOtherSignatureAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SIGNED_CREDENTIAL__OTHER_SIGNATURE_ALGORITHM, oldOtherSignatureAlgorithm, otherSignatureAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureAlgorithmOID() {
		return signatureAlgorithmOID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureAlgorithmOID(String newSignatureAlgorithmOID) {
		String oldSignatureAlgorithmOID = signatureAlgorithmOID;
		signatureAlgorithmOID = newSignatureAlgorithmOID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM_OID, oldSignatureAlgorithmOID, signatureAlgorithmOID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SIGNED_CREDENTIAL__ISSUER_NAME:
				return getIssuerName();
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE:
				return getSignature();
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM:
				return getSignatureAlgorithm();
			case CimPackage.CIM_SIGNED_CREDENTIAL__OTHER_SIGNATURE_ALGORITHM:
				return getOtherSignatureAlgorithm();
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM_OID:
				return getSignatureAlgorithmOID();
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
			case CimPackage.CIM_SIGNED_CREDENTIAL__ISSUER_NAME:
				setIssuerName((String)newValue);
				return;
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE:
				getSignature().clear();
				getSignature().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_SIGNED_CREDENTIAL__OTHER_SIGNATURE_ALGORITHM:
				setOtherSignatureAlgorithm((String)newValue);
				return;
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM_OID:
				setSignatureAlgorithmOID((String)newValue);
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
			case CimPackage.CIM_SIGNED_CREDENTIAL__ISSUER_NAME:
				setIssuerName(ISSUER_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE:
				getSignature().clear();
				return;
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm(SIGNATURE_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_SIGNED_CREDENTIAL__OTHER_SIGNATURE_ALGORITHM:
				setOtherSignatureAlgorithm(OTHER_SIGNATURE_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM_OID:
				setSignatureAlgorithmOID(SIGNATURE_ALGORITHM_OID_EDEFAULT);
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
			case CimPackage.CIM_SIGNED_CREDENTIAL__ISSUER_NAME:
				return ISSUER_NAME_EDEFAULT == null ? issuerName != null : !ISSUER_NAME_EDEFAULT.equals(issuerName);
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE:
				return signature != null && !signature.isEmpty();
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM:
				return SIGNATURE_ALGORITHM_EDEFAULT == null ? signatureAlgorithm != null : !SIGNATURE_ALGORITHM_EDEFAULT.equals(signatureAlgorithm);
			case CimPackage.CIM_SIGNED_CREDENTIAL__OTHER_SIGNATURE_ALGORITHM:
				return OTHER_SIGNATURE_ALGORITHM_EDEFAULT == null ? otherSignatureAlgorithm != null : !OTHER_SIGNATURE_ALGORITHM_EDEFAULT.equals(otherSignatureAlgorithm);
			case CimPackage.CIM_SIGNED_CREDENTIAL__SIGNATURE_ALGORITHM_OID:
				return SIGNATURE_ALGORITHM_OID_EDEFAULT == null ? signatureAlgorithmOID != null : !SIGNATURE_ALGORITHM_OID_EDEFAULT.equals(signatureAlgorithmOID);
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
		result.append(" (IssuerName: ");
		result.append(issuerName);
		result.append(", Signature: ");
		result.append(signature);
		result.append(", SignatureAlgorithm: ");
		result.append(signatureAlgorithm);
		result.append(", OtherSignatureAlgorithm: ");
		result.append(otherSignatureAlgorithm);
		result.append(", SignatureAlgorithmOID: ");
		result.append(signatureAlgorithmOID);
		result.append(')');
		return result.toString();
	}

} //CIM_SignedCredentialImpl
