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

import org.dmtf.cim.CIM_CASignsPublicKeyCertificate;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM CA Signs Public Key Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CASignsPublicKeyCertificateImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CASignsPublicKeyCertificateImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CASignsPublicKeyCertificateImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CASignsPublicKeyCertificateImpl#getCRLDistributionPoint <em>CRL Distribution Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CASignsPublicKeyCertificateImpl extends CIM_ManagedCredentialImpl implements CIM_CASignsPublicKeyCertificate {
	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected String expires = EXPIRES_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CASignsPublicKeyCertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CASignsPublicKeyCertificate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSignature() {
		if (signature == null) {
			signature = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpires() {
		return expires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpires(String newExpires) {
		String oldExpires = expires;
		expires = newExpires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__EXPIRES, oldExpires, expires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCRLDistributionPoint() {
		if (crlDistributionPoint == null) {
			crlDistributionPoint = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__CRL_DISTRIBUTION_POINT);
		}
		return crlDistributionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SIGNATURE:
				return getSignature();
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__EXPIRES:
				return getExpires();
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__CRL_DISTRIBUTION_POINT:
				return getCRLDistributionPoint();
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
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SIGNATURE:
				getSignature().clear();
				getSignature().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__EXPIRES:
				setExpires((String)newValue);
				return;
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__CRL_DISTRIBUTION_POINT:
				getCRLDistributionPoint().clear();
				getCRLDistributionPoint().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SIGNATURE:
				getSignature().clear();
				return;
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
				return;
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__CRL_DISTRIBUTION_POINT:
				getCRLDistributionPoint().clear();
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
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__SIGNATURE:
				return signature != null && !signature.isEmpty();
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__EXPIRES:
				return EXPIRES_EDEFAULT == null ? expires != null : !EXPIRES_EDEFAULT.equals(expires);
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE__CRL_DISTRIBUTION_POINT:
				return crlDistributionPoint != null && !crlDistributionPoint.isEmpty();
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
		result.append(" (SerialNumber: ");
		result.append(serialNumber);
		result.append(", Signature: ");
		result.append(signature);
		result.append(", Expires: ");
		result.append(expires);
		result.append(", CRLDistributionPoint: ");
		result.append(crlDistributionPoint);
		result.append(')');
		return result.toString();
	}

} //CIM_CASignsPublicKeyCertificateImpl
