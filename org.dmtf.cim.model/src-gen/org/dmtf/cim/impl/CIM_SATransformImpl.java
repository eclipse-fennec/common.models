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

import org.dmtf.cim.CIM_SATransform;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SA Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SATransformImpl#getMaxLifetimeSeconds <em>Max Lifetime Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SATransformImpl#getMaxLifetimeKilobytes <em>Max Lifetime Kilobytes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SATransformImpl#getVendorID <em>Vendor ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_SATransformImpl extends CIM_ScopedSettingDataImpl implements CIM_SATransform {
	/**
	 * The default value of the '{@link #getMaxLifetimeSeconds() <em>Max Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifetimeSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_LIFETIME_SECONDS_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getMaxLifetimeSeconds() <em>Max Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifetimeSeconds()
	 * @generated
	 * @ordered
	 */
	protected Long maxLifetimeSeconds = MAX_LIFETIME_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLifetimeKilobytes() <em>Max Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifetimeKilobytes()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_LIFETIME_KILOBYTES_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getMaxLifetimeKilobytes() <em>Max Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifetimeKilobytes()
	 * @generated
	 * @ordered
	 */
	protected Long maxLifetimeKilobytes = MAX_LIFETIME_KILOBYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected String vendorID = VENDOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SATransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SATransform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxLifetimeSeconds() {
		return maxLifetimeSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifetimeSeconds(Long newMaxLifetimeSeconds) {
		Long oldMaxLifetimeSeconds = maxLifetimeSeconds;
		maxLifetimeSeconds = newMaxLifetimeSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_SECONDS, oldMaxLifetimeSeconds, maxLifetimeSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxLifetimeKilobytes() {
		return maxLifetimeKilobytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifetimeKilobytes(Long newMaxLifetimeKilobytes) {
		Long oldMaxLifetimeKilobytes = maxLifetimeKilobytes;
		maxLifetimeKilobytes = newMaxLifetimeKilobytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_KILOBYTES, oldMaxLifetimeKilobytes, maxLifetimeKilobytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorID() {
		return vendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorID(String newVendorID) {
		String oldVendorID = vendorID;
		vendorID = newVendorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_TRANSFORM__VENDOR_ID, oldVendorID, vendorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_SECONDS:
				return getMaxLifetimeSeconds();
			case CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_KILOBYTES:
				return getMaxLifetimeKilobytes();
			case CimPackage.CIM_SA_TRANSFORM__VENDOR_ID:
				return getVendorID();
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
			case CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_SECONDS:
				setMaxLifetimeSeconds((Long)newValue);
				return;
			case CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_KILOBYTES:
				setMaxLifetimeKilobytes((Long)newValue);
				return;
			case CimPackage.CIM_SA_TRANSFORM__VENDOR_ID:
				setVendorID((String)newValue);
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
			case CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_SECONDS:
				setMaxLifetimeSeconds(MAX_LIFETIME_SECONDS_EDEFAULT);
				return;
			case CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_KILOBYTES:
				setMaxLifetimeKilobytes(MAX_LIFETIME_KILOBYTES_EDEFAULT);
				return;
			case CimPackage.CIM_SA_TRANSFORM__VENDOR_ID:
				setVendorID(VENDOR_ID_EDEFAULT);
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
			case CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_SECONDS:
				return MAX_LIFETIME_SECONDS_EDEFAULT == null ? maxLifetimeSeconds != null : !MAX_LIFETIME_SECONDS_EDEFAULT.equals(maxLifetimeSeconds);
			case CimPackage.CIM_SA_TRANSFORM__MAX_LIFETIME_KILOBYTES:
				return MAX_LIFETIME_KILOBYTES_EDEFAULT == null ? maxLifetimeKilobytes != null : !MAX_LIFETIME_KILOBYTES_EDEFAULT.equals(maxLifetimeKilobytes);
			case CimPackage.CIM_SA_TRANSFORM__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorID != null : !VENDOR_ID_EDEFAULT.equals(vendorID);
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
		result.append(" (MaxLifetimeSeconds: ");
		result.append(maxLifetimeSeconds);
		result.append(", MaxLifetimeKilobytes: ");
		result.append(maxLifetimeKilobytes);
		result.append(", VendorID: ");
		result.append(vendorID);
		result.append(')');
		return result.toString();
	}

} //CIM_SATransformImpl
