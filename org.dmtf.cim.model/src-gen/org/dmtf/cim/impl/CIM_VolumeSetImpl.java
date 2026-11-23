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

import org.dmtf.cim.CIM_VolumeSet;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Volume Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeSetImpl#getPSExtentStripeLength <em>PS Extent Stripe Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeSetImpl#getPSExtentInterleaveDepth <em>PS Extent Interleave Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeSetImpl#getVolumeStatus <em>Volume Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VolumeSetImpl extends CIM_StorageVolumeImpl implements CIM_VolumeSet {
	/**
	 * The default value of the '{@link #getPSExtentStripeLength() <em>PS Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSExtentStripeLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long PS_EXTENT_STRIPE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPSExtentStripeLength() <em>PS Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSExtentStripeLength()
	 * @generated
	 * @ordered
	 */
	protected Long psExtentStripeLength = PS_EXTENT_STRIPE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPSExtentInterleaveDepth() <em>PS Extent Interleave Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSExtentInterleaveDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Long PS_EXTENT_INTERLEAVE_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPSExtentInterleaveDepth() <em>PS Extent Interleave Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSExtentInterleaveDepth()
	 * @generated
	 * @ordered
	 */
	protected Long psExtentInterleaveDepth = PS_EXTENT_INTERLEAVE_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumeStatus() <em>Volume Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VOLUME_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumeStatus() <em>Volume Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer volumeStatus = VOLUME_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VolumeSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VolumeSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPSExtentStripeLength() {
		return psExtentStripeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPSExtentStripeLength(Long newPSExtentStripeLength) {
		Long oldPSExtentStripeLength = psExtentStripeLength;
		psExtentStripeLength = newPSExtentStripeLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_SET__PS_EXTENT_STRIPE_LENGTH, oldPSExtentStripeLength, psExtentStripeLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPSExtentInterleaveDepth() {
		return psExtentInterleaveDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPSExtentInterleaveDepth(Long newPSExtentInterleaveDepth) {
		Long oldPSExtentInterleaveDepth = psExtentInterleaveDepth;
		psExtentInterleaveDepth = newPSExtentInterleaveDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_SET__PS_EXTENT_INTERLEAVE_DEPTH, oldPSExtentInterleaveDepth, psExtentInterleaveDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVolumeStatus() {
		return volumeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeStatus(Integer newVolumeStatus) {
		Integer oldVolumeStatus = volumeStatus;
		volumeStatus = newVolumeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_SET__VOLUME_STATUS, oldVolumeStatus, volumeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VOLUME_SET__PS_EXTENT_STRIPE_LENGTH:
				return getPSExtentStripeLength();
			case CimPackage.CIM_VOLUME_SET__PS_EXTENT_INTERLEAVE_DEPTH:
				return getPSExtentInterleaveDepth();
			case CimPackage.CIM_VOLUME_SET__VOLUME_STATUS:
				return getVolumeStatus();
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
			case CimPackage.CIM_VOLUME_SET__PS_EXTENT_STRIPE_LENGTH:
				setPSExtentStripeLength((Long)newValue);
				return;
			case CimPackage.CIM_VOLUME_SET__PS_EXTENT_INTERLEAVE_DEPTH:
				setPSExtentInterleaveDepth((Long)newValue);
				return;
			case CimPackage.CIM_VOLUME_SET__VOLUME_STATUS:
				setVolumeStatus((Integer)newValue);
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
			case CimPackage.CIM_VOLUME_SET__PS_EXTENT_STRIPE_LENGTH:
				setPSExtentStripeLength(PS_EXTENT_STRIPE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_SET__PS_EXTENT_INTERLEAVE_DEPTH:
				setPSExtentInterleaveDepth(PS_EXTENT_INTERLEAVE_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_SET__VOLUME_STATUS:
				setVolumeStatus(VOLUME_STATUS_EDEFAULT);
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
			case CimPackage.CIM_VOLUME_SET__PS_EXTENT_STRIPE_LENGTH:
				return PS_EXTENT_STRIPE_LENGTH_EDEFAULT == null ? psExtentStripeLength != null : !PS_EXTENT_STRIPE_LENGTH_EDEFAULT.equals(psExtentStripeLength);
			case CimPackage.CIM_VOLUME_SET__PS_EXTENT_INTERLEAVE_DEPTH:
				return PS_EXTENT_INTERLEAVE_DEPTH_EDEFAULT == null ? psExtentInterleaveDepth != null : !PS_EXTENT_INTERLEAVE_DEPTH_EDEFAULT.equals(psExtentInterleaveDepth);
			case CimPackage.CIM_VOLUME_SET__VOLUME_STATUS:
				return VOLUME_STATUS_EDEFAULT == null ? volumeStatus != null : !VOLUME_STATUS_EDEFAULT.equals(volumeStatus);
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
		result.append(" (PSExtentStripeLength: ");
		result.append(psExtentStripeLength);
		result.append(", PSExtentInterleaveDepth: ");
		result.append(psExtentInterleaveDepth);
		result.append(", VolumeStatus: ");
		result.append(volumeStatus);
		result.append(')');
		return result.toString();
	}

} //CIM_VolumeSetImpl
