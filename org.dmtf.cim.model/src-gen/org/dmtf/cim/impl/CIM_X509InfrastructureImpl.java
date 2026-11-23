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

import org.dmtf.cim.CIM_X509Infrastructure;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM X509 Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509InfrastructureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509InfrastructureImpl#getTBSCertificate <em>TBS Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509InfrastructureImpl#getMD5Fingerprint <em>MD5 Fingerprint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509InfrastructureImpl#getSHA1Fingerprint <em>SHA1 Fingerprint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509InfrastructureImpl#getFingerprintDigestAlgorithms <em>Fingerprint Digest Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509InfrastructureImpl#getFingerprints <em>Fingerprints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_X509InfrastructureImpl extends CIM_SignedCredentialImpl implements CIM_X509Infrastructure {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTBSCertificate() <em>TBS Certificate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTBSCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tbsCertificate;

	/**
	 * The cached value of the '{@link #getMD5Fingerprint() <em>MD5 Fingerprint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMD5Fingerprint()
	 * @generated
	 * @ordered
	 */
	protected EList<String> md5Fingerprint;

	/**
	 * The cached value of the '{@link #getSHA1Fingerprint() <em>SHA1 Fingerprint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHA1Fingerprint()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sha1Fingerprint;

	/**
	 * The cached value of the '{@link #getFingerprintDigestAlgorithms() <em>Fingerprint Digest Algorithms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingerprintDigestAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> fingerprintDigestAlgorithms;

	/**
	 * The cached value of the '{@link #getFingerprints() <em>Fingerprints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingerprints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fingerprints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_X509InfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_X509Infrastructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(Integer newVersion) {
		Integer oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_INFRASTRUCTURE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTBSCertificate() {
		if (tbsCertificate == null) {
			tbsCertificate = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_INFRASTRUCTURE__TBS_CERTIFICATE);
		}
		return tbsCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMD5Fingerprint() {
		if (md5Fingerprint == null) {
			md5Fingerprint = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_INFRASTRUCTURE__MD5_FINGERPRINT);
		}
		return md5Fingerprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSHA1Fingerprint() {
		if (sha1Fingerprint == null) {
			sha1Fingerprint = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_INFRASTRUCTURE__SHA1_FINGERPRINT);
		}
		return sha1Fingerprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFingerprintDigestAlgorithms() {
		if (fingerprintDigestAlgorithms == null) {
			fingerprintDigestAlgorithms = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINT_DIGEST_ALGORITHMS);
		}
		return fingerprintDigestAlgorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFingerprints() {
		if (fingerprints == null) {
			fingerprints = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINTS);
		}
		return fingerprints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_X509_INFRASTRUCTURE__VERSION:
				return getVersion();
			case CimPackage.CIM_X509_INFRASTRUCTURE__TBS_CERTIFICATE:
				return getTBSCertificate();
			case CimPackage.CIM_X509_INFRASTRUCTURE__MD5_FINGERPRINT:
				return getMD5Fingerprint();
			case CimPackage.CIM_X509_INFRASTRUCTURE__SHA1_FINGERPRINT:
				return getSHA1Fingerprint();
			case CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINT_DIGEST_ALGORITHMS:
				return getFingerprintDigestAlgorithms();
			case CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINTS:
				return getFingerprints();
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
			case CimPackage.CIM_X509_INFRASTRUCTURE__VERSION:
				setVersion((Integer)newValue);
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__TBS_CERTIFICATE:
				getTBSCertificate().clear();
				getTBSCertificate().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__MD5_FINGERPRINT:
				getMD5Fingerprint().clear();
				getMD5Fingerprint().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__SHA1_FINGERPRINT:
				getSHA1Fingerprint().clear();
				getSHA1Fingerprint().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINT_DIGEST_ALGORITHMS:
				getFingerprintDigestAlgorithms().clear();
				getFingerprintDigestAlgorithms().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINTS:
				getFingerprints().clear();
				getFingerprints().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_X509_INFRASTRUCTURE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__TBS_CERTIFICATE:
				getTBSCertificate().clear();
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__MD5_FINGERPRINT:
				getMD5Fingerprint().clear();
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__SHA1_FINGERPRINT:
				getSHA1Fingerprint().clear();
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINT_DIGEST_ALGORITHMS:
				getFingerprintDigestAlgorithms().clear();
				return;
			case CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINTS:
				getFingerprints().clear();
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
			case CimPackage.CIM_X509_INFRASTRUCTURE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_X509_INFRASTRUCTURE__TBS_CERTIFICATE:
				return tbsCertificate != null && !tbsCertificate.isEmpty();
			case CimPackage.CIM_X509_INFRASTRUCTURE__MD5_FINGERPRINT:
				return md5Fingerprint != null && !md5Fingerprint.isEmpty();
			case CimPackage.CIM_X509_INFRASTRUCTURE__SHA1_FINGERPRINT:
				return sha1Fingerprint != null && !sha1Fingerprint.isEmpty();
			case CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINT_DIGEST_ALGORITHMS:
				return fingerprintDigestAlgorithms != null && !fingerprintDigestAlgorithms.isEmpty();
			case CimPackage.CIM_X509_INFRASTRUCTURE__FINGERPRINTS:
				return fingerprints != null && !fingerprints.isEmpty();
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
		result.append(" (Version: ");
		result.append(version);
		result.append(", TBSCertificate: ");
		result.append(tbsCertificate);
		result.append(", MD5Fingerprint: ");
		result.append(md5Fingerprint);
		result.append(", SHA1Fingerprint: ");
		result.append(sha1Fingerprint);
		result.append(", FingerprintDigestAlgorithms: ");
		result.append(fingerprintDigestAlgorithms);
		result.append(", Fingerprints: ");
		result.append(fingerprints);
		result.append(')');
		return result.toString();
	}

} //CIM_X509InfrastructureImpl
