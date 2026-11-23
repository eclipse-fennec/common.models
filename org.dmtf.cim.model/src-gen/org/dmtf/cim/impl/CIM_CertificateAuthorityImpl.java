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

import org.dmtf.cim.CIM_CertificateAuthority;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Certificate Authority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateAuthorityImpl#getCAPolicyStatement <em>CA Policy Statement</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateAuthorityImpl#getCRL <em>CRL</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateAuthorityImpl#getCRLDistributionPoint <em>CRL Distribution Point</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateAuthorityImpl#getCADistinguishedName <em>CA Distinguished Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateAuthorityImpl#getCRLRefreshFrequency <em>CRL Refresh Frequency</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateAuthorityImpl#getMaxChainLength <em>Max Chain Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CertificateAuthorityImpl extends CIM_CredentialManagementServiceImpl implements CIM_CertificateAuthority {
	/**
	 * The default value of the '{@link #getCAPolicyStatement() <em>CA Policy Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAPolicyStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_POLICY_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCAPolicyStatement() <em>CA Policy Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAPolicyStatement()
	 * @generated
	 * @ordered
	 */
	protected String caPolicyStatement = CA_POLICY_STATEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCRL() <em>CRL</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRL()
	 * @generated
	 * @ordered
	 */
	protected EList<String> crl;

	/**
	 * The cached value of the '{@link #getCRLDistributionPoint() <em>CRL Distribution Point</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRLDistributionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<String> crlDistributionPoint;

	/**
	 * The default value of the '{@link #getCADistinguishedName() <em>CA Distinguished Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCADistinguishedName()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_DISTINGUISHED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCADistinguishedName() <em>CA Distinguished Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCADistinguishedName()
	 * @generated
	 * @ordered
	 */
	protected String caDistinguishedName = CA_DISTINGUISHED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCRLRefreshFrequency() <em>CRL Refresh Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRLRefreshFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CRL_REFRESH_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCRLRefreshFrequency() <em>CRL Refresh Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRLRefreshFrequency()
	 * @generated
	 * @ordered
	 */
	protected Integer crlRefreshFrequency = CRL_REFRESH_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxChainLength() <em>Max Chain Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxChainLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CHAIN_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxChainLength() <em>Max Chain Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxChainLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maxChainLength = MAX_CHAIN_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CertificateAuthorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CertificateAuthority();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCAPolicyStatement() {
		return caPolicyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCAPolicyStatement(String newCAPolicyStatement) {
		String oldCAPolicyStatement = caPolicyStatement;
		caPolicyStatement = newCAPolicyStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_POLICY_STATEMENT, oldCAPolicyStatement, caPolicyStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCRL() {
		if (crl == null) {
			crl = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL);
		}
		return crl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCRLDistributionPoint() {
		if (crlDistributionPoint == null) {
			crlDistributionPoint = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_DISTRIBUTION_POINT);
		}
		return crlDistributionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCADistinguishedName() {
		return caDistinguishedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCADistinguishedName(String newCADistinguishedName) {
		String oldCADistinguishedName = caDistinguishedName;
		caDistinguishedName = newCADistinguishedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_DISTINGUISHED_NAME, oldCADistinguishedName, caDistinguishedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCRLRefreshFrequency() {
		return crlRefreshFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCRLRefreshFrequency(Integer newCRLRefreshFrequency) {
		Integer oldCRLRefreshFrequency = crlRefreshFrequency;
		crlRefreshFrequency = newCRLRefreshFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_REFRESH_FREQUENCY, oldCRLRefreshFrequency, crlRefreshFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxChainLength() {
		return maxChainLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxChainLength(Integer newMaxChainLength) {
		Integer oldMaxChainLength = maxChainLength;
		maxChainLength = newMaxChainLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CERTIFICATE_AUTHORITY__MAX_CHAIN_LENGTH, oldMaxChainLength, maxChainLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_POLICY_STATEMENT:
				return getCAPolicyStatement();
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL:
				return getCRL();
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_DISTRIBUTION_POINT:
				return getCRLDistributionPoint();
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_DISTINGUISHED_NAME:
				return getCADistinguishedName();
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_REFRESH_FREQUENCY:
				return getCRLRefreshFrequency();
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__MAX_CHAIN_LENGTH:
				return getMaxChainLength();
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
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_POLICY_STATEMENT:
				setCAPolicyStatement((String)newValue);
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL:
				getCRL().clear();
				getCRL().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_DISTRIBUTION_POINT:
				getCRLDistributionPoint().clear();
				getCRLDistributionPoint().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_DISTINGUISHED_NAME:
				setCADistinguishedName((String)newValue);
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_REFRESH_FREQUENCY:
				setCRLRefreshFrequency((Integer)newValue);
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__MAX_CHAIN_LENGTH:
				setMaxChainLength((Integer)newValue);
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
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_POLICY_STATEMENT:
				setCAPolicyStatement(CA_POLICY_STATEMENT_EDEFAULT);
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL:
				getCRL().clear();
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_DISTRIBUTION_POINT:
				getCRLDistributionPoint().clear();
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_DISTINGUISHED_NAME:
				setCADistinguishedName(CA_DISTINGUISHED_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_REFRESH_FREQUENCY:
				setCRLRefreshFrequency(CRL_REFRESH_FREQUENCY_EDEFAULT);
				return;
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__MAX_CHAIN_LENGTH:
				setMaxChainLength(MAX_CHAIN_LENGTH_EDEFAULT);
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
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_POLICY_STATEMENT:
				return CA_POLICY_STATEMENT_EDEFAULT == null ? caPolicyStatement != null : !CA_POLICY_STATEMENT_EDEFAULT.equals(caPolicyStatement);
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL:
				return crl != null && !crl.isEmpty();
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_DISTRIBUTION_POINT:
				return crlDistributionPoint != null && !crlDistributionPoint.isEmpty();
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CA_DISTINGUISHED_NAME:
				return CA_DISTINGUISHED_NAME_EDEFAULT == null ? caDistinguishedName != null : !CA_DISTINGUISHED_NAME_EDEFAULT.equals(caDistinguishedName);
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__CRL_REFRESH_FREQUENCY:
				return CRL_REFRESH_FREQUENCY_EDEFAULT == null ? crlRefreshFrequency != null : !CRL_REFRESH_FREQUENCY_EDEFAULT.equals(crlRefreshFrequency);
			case CimPackage.CIM_CERTIFICATE_AUTHORITY__MAX_CHAIN_LENGTH:
				return MAX_CHAIN_LENGTH_EDEFAULT == null ? maxChainLength != null : !MAX_CHAIN_LENGTH_EDEFAULT.equals(maxChainLength);
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
		result.append(" (CAPolicyStatement: ");
		result.append(caPolicyStatement);
		result.append(", CRL: ");
		result.append(crl);
		result.append(", CRLDistributionPoint: ");
		result.append(crlDistributionPoint);
		result.append(", CADistinguishedName: ");
		result.append(caDistinguishedName);
		result.append(", CRLRefreshFrequency: ");
		result.append(crlRefreshFrequency);
		result.append(", MaxChainLength: ");
		result.append(maxChainLength);
		result.append(')');
		return result.toString();
	}

} //CIM_CertificateAuthorityImpl
