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

import org.dmtf.cim.CIM_X509Certificate;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM X509 Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getAltSubject <em>Alt Subject</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getPublicKeySize <em>Public Key Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getIsValid <em>Is Valid</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getPublicKeyAlgorithm <em>Public Key Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getKeyUsage <em>Key Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getExtendedKeyUsage <em>Extended Key Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getPathLengthConstraint <em>Path Length Constraint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getEncodedCertificate <em>Encoded Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getExtensionID <em>Extension ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getExtensionValue <em>Extension Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getIsCritical <em>Is Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getIssuerUniqueID <em>Issuer Unique ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getSubjectUniqueID <em>Subject Unique ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CertificateImpl#getTrustedRootCertificate <em>Trusted Root Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_X509CertificateImpl extends CIM_X509InfrastructureImpl implements CIM_X509Certificate {
	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltSubject() <em>Alt Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAltSubject() <em>Alt Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltSubject()
	 * @generated
	 * @ordered
	 */
	protected String altSubject = ALT_SUBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected EList<String> publicKey;

	/**
	 * The default value of the '{@link #getPublicKeySize() <em>Public Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKeySize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PUBLIC_KEY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicKeySize() <em>Public Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKeySize()
	 * @generated
	 * @ordered
	 */
	protected Integer publicKeySize = PUBLIC_KEY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsValid()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VALID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsValid()
	 * @generated
	 * @ordered
	 */
	protected Boolean isValid = IS_VALID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serialNumber;

	/**
	 * The default value of the '{@link #getPublicKeyAlgorithm() <em>Public Key Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKeyAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PUBLIC_KEY_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicKeyAlgorithm() <em>Public Key Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKeyAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Integer publicKeyAlgorithm = PUBLIC_KEY_ALGORITHM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyUsage() <em>Key Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> keyUsage;

	/**
	 * The cached value of the '{@link #getExtendedKeyUsage() <em>Extended Key Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedKeyUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extendedKeyUsage;

	/**
	 * The default value of the '{@link #getPathLengthConstraint() <em>Path Length Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLengthConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_LENGTH_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathLengthConstraint() <em>Path Length Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLengthConstraint()
	 * @generated
	 * @ordered
	 */
	protected Integer pathLengthConstraint = PATH_LENGTH_CONSTRAINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEncodedCertificate() <em>Encoded Certificate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> encodedCertificate;

	/**
	 * The cached value of the '{@link #getExtensionID() <em>Extension ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extensionID;

	/**
	 * The cached value of the '{@link #getExtensionValue() <em>Extension Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extensionValue;

	/**
	 * The cached value of the '{@link #getIsCritical() <em>Is Critical</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCritical()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> isCritical;

	/**
	 * The default value of the '{@link #getIssuerUniqueID() <em>Issuer Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerUniqueID()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuerUniqueID() <em>Issuer Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerUniqueID()
	 * @generated
	 * @ordered
	 */
	protected String issuerUniqueID = ISSUER_UNIQUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubjectUniqueID() <em>Subject Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectUniqueID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectUniqueID() <em>Subject Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectUniqueID()
	 * @generated
	 * @ordered
	 */
	protected String subjectUniqueID = SUBJECT_UNIQUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrustedRootCertificate() <em>Trusted Root Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedRootCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRUSTED_ROOT_CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustedRootCertificate() <em>Trusted Root Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedRootCertificate()
	 * @generated
	 * @ordered
	 */
	protected Boolean trustedRootCertificate = TRUSTED_ROOT_CERTIFICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_X509CertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_X509Certificate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CERTIFICATE__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAltSubject() {
		return altSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltSubject(String newAltSubject) {
		String oldAltSubject = altSubject;
		altSubject = newAltSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CERTIFICATE__ALT_SUBJECT, oldAltSubject, altSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPublicKey() {
		if (publicKey == null) {
			publicKey = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY);
		}
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPublicKeySize() {
		return publicKeySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicKeySize(Integer newPublicKeySize) {
		Integer oldPublicKeySize = publicKeySize;
		publicKeySize = newPublicKeySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_SIZE, oldPublicKeySize, publicKeySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsValid() {
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsValid(Boolean newIsValid) {
		Boolean oldIsValid = isValid;
		isValid = newIsValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CERTIFICATE__IS_VALID, oldIsValid, isValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSerialNumber() {
		if (serialNumber == null) {
			serialNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_CERTIFICATE__SERIAL_NUMBER);
		}
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPublicKeyAlgorithm() {
		return publicKeyAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicKeyAlgorithm(Integer newPublicKeyAlgorithm) {
		Integer oldPublicKeyAlgorithm = publicKeyAlgorithm;
		publicKeyAlgorithm = newPublicKeyAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_ALGORITHM, oldPublicKeyAlgorithm, publicKeyAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getKeyUsage() {
		if (keyUsage == null) {
			keyUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_X509_CERTIFICATE__KEY_USAGE);
		}
		return keyUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getExtendedKeyUsage() {
		if (extendedKeyUsage == null) {
			extendedKeyUsage = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_CERTIFICATE__EXTENDED_KEY_USAGE);
		}
		return extendedKeyUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathLengthConstraint() {
		return pathLengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathLengthConstraint(Integer newPathLengthConstraint) {
		Integer oldPathLengthConstraint = pathLengthConstraint;
		pathLengthConstraint = newPathLengthConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CERTIFICATE__PATH_LENGTH_CONSTRAINT, oldPathLengthConstraint, pathLengthConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEncodedCertificate() {
		if (encodedCertificate == null) {
			encodedCertificate = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_CERTIFICATE__ENCODED_CERTIFICATE);
		}
		return encodedCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getExtensionID() {
		if (extensionID == null) {
			extensionID = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_CERTIFICATE__EXTENSION_ID);
		}
		return extensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getExtensionValue() {
		if (extensionValue == null) {
			extensionValue = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509_CERTIFICATE__EXTENSION_VALUE);
		}
		return extensionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getIsCritical() {
		if (isCritical == null) {
			isCritical = new EDataTypeEList<Boolean>(Boolean.class, this, CimPackage.CIM_X509_CERTIFICATE__IS_CRITICAL);
		}
		return isCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssuerUniqueID() {
		return issuerUniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuerUniqueID(String newIssuerUniqueID) {
		String oldIssuerUniqueID = issuerUniqueID;
		issuerUniqueID = newIssuerUniqueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CERTIFICATE__ISSUER_UNIQUE_ID, oldIssuerUniqueID, issuerUniqueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectUniqueID() {
		return subjectUniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectUniqueID(String newSubjectUniqueID) {
		String oldSubjectUniqueID = subjectUniqueID;
		subjectUniqueID = newSubjectUniqueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CERTIFICATE__SUBJECT_UNIQUE_ID, oldSubjectUniqueID, subjectUniqueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTrustedRootCertificate() {
		return trustedRootCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrustedRootCertificate(Boolean newTrustedRootCertificate) {
		Boolean oldTrustedRootCertificate = trustedRootCertificate;
		trustedRootCertificate = newTrustedRootCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CERTIFICATE__TRUSTED_ROOT_CERTIFICATE, oldTrustedRootCertificate, trustedRootCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_X509_CERTIFICATE__SUBJECT:
				return getSubject();
			case CimPackage.CIM_X509_CERTIFICATE__ALT_SUBJECT:
				return getAltSubject();
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY:
				return getPublicKey();
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_SIZE:
				return getPublicKeySize();
			case CimPackage.CIM_X509_CERTIFICATE__IS_VALID:
				return getIsValid();
			case CimPackage.CIM_X509_CERTIFICATE__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_ALGORITHM:
				return getPublicKeyAlgorithm();
			case CimPackage.CIM_X509_CERTIFICATE__KEY_USAGE:
				return getKeyUsage();
			case CimPackage.CIM_X509_CERTIFICATE__EXTENDED_KEY_USAGE:
				return getExtendedKeyUsage();
			case CimPackage.CIM_X509_CERTIFICATE__PATH_LENGTH_CONSTRAINT:
				return getPathLengthConstraint();
			case CimPackage.CIM_X509_CERTIFICATE__ENCODED_CERTIFICATE:
				return getEncodedCertificate();
			case CimPackage.CIM_X509_CERTIFICATE__EXTENSION_ID:
				return getExtensionID();
			case CimPackage.CIM_X509_CERTIFICATE__EXTENSION_VALUE:
				return getExtensionValue();
			case CimPackage.CIM_X509_CERTIFICATE__IS_CRITICAL:
				return getIsCritical();
			case CimPackage.CIM_X509_CERTIFICATE__ISSUER_UNIQUE_ID:
				return getIssuerUniqueID();
			case CimPackage.CIM_X509_CERTIFICATE__SUBJECT_UNIQUE_ID:
				return getSubjectUniqueID();
			case CimPackage.CIM_X509_CERTIFICATE__TRUSTED_ROOT_CERTIFICATE:
				return getTrustedRootCertificate();
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
			case CimPackage.CIM_X509_CERTIFICATE__SUBJECT:
				setSubject((String)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__ALT_SUBJECT:
				setAltSubject((String)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY:
				getPublicKey().clear();
				getPublicKey().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_SIZE:
				setPublicKeySize((Integer)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__SERIAL_NUMBER:
				getSerialNumber().clear();
				getSerialNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_ALGORITHM:
				setPublicKeyAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__KEY_USAGE:
				getKeyUsage().clear();
				getKeyUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__EXTENDED_KEY_USAGE:
				getExtendedKeyUsage().clear();
				getExtendedKeyUsage().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__PATH_LENGTH_CONSTRAINT:
				setPathLengthConstraint((Integer)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__ENCODED_CERTIFICATE:
				getEncodedCertificate().clear();
				getEncodedCertificate().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__EXTENSION_ID:
				getExtensionID().clear();
				getExtensionID().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__EXTENSION_VALUE:
				getExtensionValue().clear();
				getExtensionValue().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__IS_CRITICAL:
				getIsCritical().clear();
				getIsCritical().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__ISSUER_UNIQUE_ID:
				setIssuerUniqueID((String)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__SUBJECT_UNIQUE_ID:
				setSubjectUniqueID((String)newValue);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__TRUSTED_ROOT_CERTIFICATE:
				setTrustedRootCertificate((Boolean)newValue);
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
			case CimPackage.CIM_X509_CERTIFICATE__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__ALT_SUBJECT:
				setAltSubject(ALT_SUBJECT_EDEFAULT);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY:
				getPublicKey().clear();
				return;
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_SIZE:
				setPublicKeySize(PUBLIC_KEY_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__SERIAL_NUMBER:
				getSerialNumber().clear();
				return;
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_ALGORITHM:
				setPublicKeyAlgorithm(PUBLIC_KEY_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__KEY_USAGE:
				getKeyUsage().clear();
				return;
			case CimPackage.CIM_X509_CERTIFICATE__EXTENDED_KEY_USAGE:
				getExtendedKeyUsage().clear();
				return;
			case CimPackage.CIM_X509_CERTIFICATE__PATH_LENGTH_CONSTRAINT:
				setPathLengthConstraint(PATH_LENGTH_CONSTRAINT_EDEFAULT);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__ENCODED_CERTIFICATE:
				getEncodedCertificate().clear();
				return;
			case CimPackage.CIM_X509_CERTIFICATE__EXTENSION_ID:
				getExtensionID().clear();
				return;
			case CimPackage.CIM_X509_CERTIFICATE__EXTENSION_VALUE:
				getExtensionValue().clear();
				return;
			case CimPackage.CIM_X509_CERTIFICATE__IS_CRITICAL:
				getIsCritical().clear();
				return;
			case CimPackage.CIM_X509_CERTIFICATE__ISSUER_UNIQUE_ID:
				setIssuerUniqueID(ISSUER_UNIQUE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__SUBJECT_UNIQUE_ID:
				setSubjectUniqueID(SUBJECT_UNIQUE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_X509_CERTIFICATE__TRUSTED_ROOT_CERTIFICATE:
				setTrustedRootCertificate(TRUSTED_ROOT_CERTIFICATE_EDEFAULT);
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
			case CimPackage.CIM_X509_CERTIFICATE__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case CimPackage.CIM_X509_CERTIFICATE__ALT_SUBJECT:
				return ALT_SUBJECT_EDEFAULT == null ? altSubject != null : !ALT_SUBJECT_EDEFAULT.equals(altSubject);
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY:
				return publicKey != null && !publicKey.isEmpty();
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_SIZE:
				return PUBLIC_KEY_SIZE_EDEFAULT == null ? publicKeySize != null : !PUBLIC_KEY_SIZE_EDEFAULT.equals(publicKeySize);
			case CimPackage.CIM_X509_CERTIFICATE__IS_VALID:
				return IS_VALID_EDEFAULT == null ? isValid != null : !IS_VALID_EDEFAULT.equals(isValid);
			case CimPackage.CIM_X509_CERTIFICATE__SERIAL_NUMBER:
				return serialNumber != null && !serialNumber.isEmpty();
			case CimPackage.CIM_X509_CERTIFICATE__PUBLIC_KEY_ALGORITHM:
				return PUBLIC_KEY_ALGORITHM_EDEFAULT == null ? publicKeyAlgorithm != null : !PUBLIC_KEY_ALGORITHM_EDEFAULT.equals(publicKeyAlgorithm);
			case CimPackage.CIM_X509_CERTIFICATE__KEY_USAGE:
				return keyUsage != null && !keyUsage.isEmpty();
			case CimPackage.CIM_X509_CERTIFICATE__EXTENDED_KEY_USAGE:
				return extendedKeyUsage != null && !extendedKeyUsage.isEmpty();
			case CimPackage.CIM_X509_CERTIFICATE__PATH_LENGTH_CONSTRAINT:
				return PATH_LENGTH_CONSTRAINT_EDEFAULT == null ? pathLengthConstraint != null : !PATH_LENGTH_CONSTRAINT_EDEFAULT.equals(pathLengthConstraint);
			case CimPackage.CIM_X509_CERTIFICATE__ENCODED_CERTIFICATE:
				return encodedCertificate != null && !encodedCertificate.isEmpty();
			case CimPackage.CIM_X509_CERTIFICATE__EXTENSION_ID:
				return extensionID != null && !extensionID.isEmpty();
			case CimPackage.CIM_X509_CERTIFICATE__EXTENSION_VALUE:
				return extensionValue != null && !extensionValue.isEmpty();
			case CimPackage.CIM_X509_CERTIFICATE__IS_CRITICAL:
				return isCritical != null && !isCritical.isEmpty();
			case CimPackage.CIM_X509_CERTIFICATE__ISSUER_UNIQUE_ID:
				return ISSUER_UNIQUE_ID_EDEFAULT == null ? issuerUniqueID != null : !ISSUER_UNIQUE_ID_EDEFAULT.equals(issuerUniqueID);
			case CimPackage.CIM_X509_CERTIFICATE__SUBJECT_UNIQUE_ID:
				return SUBJECT_UNIQUE_ID_EDEFAULT == null ? subjectUniqueID != null : !SUBJECT_UNIQUE_ID_EDEFAULT.equals(subjectUniqueID);
			case CimPackage.CIM_X509_CERTIFICATE__TRUSTED_ROOT_CERTIFICATE:
				return TRUSTED_ROOT_CERTIFICATE_EDEFAULT == null ? trustedRootCertificate != null : !TRUSTED_ROOT_CERTIFICATE_EDEFAULT.equals(trustedRootCertificate);
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
		result.append(" (Subject: ");
		result.append(subject);
		result.append(", AltSubject: ");
		result.append(altSubject);
		result.append(", PublicKey: ");
		result.append(publicKey);
		result.append(", PublicKeySize: ");
		result.append(publicKeySize);
		result.append(", IsValid: ");
		result.append(isValid);
		result.append(", SerialNumber: ");
		result.append(serialNumber);
		result.append(", PublicKeyAlgorithm: ");
		result.append(publicKeyAlgorithm);
		result.append(", KeyUsage: ");
		result.append(keyUsage);
		result.append(", ExtendedKeyUsage: ");
		result.append(extendedKeyUsage);
		result.append(", PathLengthConstraint: ");
		result.append(pathLengthConstraint);
		result.append(", EncodedCertificate: ");
		result.append(encodedCertificate);
		result.append(", ExtensionID: ");
		result.append(extensionID);
		result.append(", ExtensionValue: ");
		result.append(extensionValue);
		result.append(", IsCritical: ");
		result.append(isCritical);
		result.append(", IssuerUniqueID: ");
		result.append(issuerUniqueID);
		result.append(", SubjectUniqueID: ");
		result.append(subjectUniqueID);
		result.append(", TrustedRootCertificate: ");
		result.append(trustedRootCertificate);
		result.append(')');
		return result.toString();
	}

} //CIM_X509CertificateImpl
