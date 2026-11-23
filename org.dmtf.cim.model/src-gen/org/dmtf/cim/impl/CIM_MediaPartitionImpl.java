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

import org.dmtf.cim.CIM_MediaPartition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Media Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaPartitionImpl#getBootable <em>Bootable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaPartitionImpl#getAllocatable <em>Allocatable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaPartitionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaPartitionImpl#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaPartitionImpl#getSignatureState <em>Signature State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaPartitionImpl#getExtendable <em>Extendable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MediaPartitionImpl extends CIM_StorageExtentImpl implements CIM_MediaPartition {
	/**
	 * The default value of the '{@link #getBootable() <em>Bootable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBootable() <em>Bootable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootable()
	 * @generated
	 * @ordered
	 */
	protected Boolean bootable = BOOTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllocatable() <em>Allocatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOCATABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocatable() <em>Allocatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatable()
	 * @generated
	 * @ordered
	 */
	protected Boolean allocatable = ALLOCATABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String signatureAlgorithm = SIGNATURE_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureState() <em>Signature State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureState()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureState() <em>Signature State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureState()
	 * @generated
	 * @ordered
	 */
	protected String signatureState = SIGNATURE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendable() <em>Extendable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXTENDABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendable() <em>Extendable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendable()
	 * @generated
	 * @ordered
	 */
	protected Boolean extendable = EXTENDABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MediaPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MediaPartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBootable() {
		return bootable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBootable(Boolean newBootable) {
		Boolean oldBootable = bootable;
		bootable = newBootable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_PARTITION__BOOTABLE, oldBootable, bootable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllocatable() {
		return allocatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocatable(Boolean newAllocatable) {
		Boolean oldAllocatable = allocatable;
		allocatable = newAllocatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_PARTITION__ALLOCATABLE, oldAllocatable, allocatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_PARTITION__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureAlgorithm(String newSignatureAlgorithm) {
		String oldSignatureAlgorithm = signatureAlgorithm;
		signatureAlgorithm = newSignatureAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_ALGORITHM, oldSignatureAlgorithm, signatureAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureState() {
		return signatureState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureState(String newSignatureState) {
		String oldSignatureState = signatureState;
		signatureState = newSignatureState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_STATE, oldSignatureState, signatureState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExtendable() {
		return extendable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendable(Boolean newExtendable) {
		Boolean oldExtendable = extendable;
		extendable = newExtendable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_PARTITION__EXTENDABLE, oldExtendable, extendable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEDIA_PARTITION__BOOTABLE:
				return getBootable();
			case CimPackage.CIM_MEDIA_PARTITION__ALLOCATABLE:
				return getAllocatable();
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE:
				return getSignature();
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_ALGORITHM:
				return getSignatureAlgorithm();
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_STATE:
				return getSignatureState();
			case CimPackage.CIM_MEDIA_PARTITION__EXTENDABLE:
				return getExtendable();
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
			case CimPackage.CIM_MEDIA_PARTITION__BOOTABLE:
				setBootable((Boolean)newValue);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__ALLOCATABLE:
				setAllocatable((Boolean)newValue);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE:
				setSignature((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_STATE:
				setSignatureState((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__EXTENDABLE:
				setExtendable((Boolean)newValue);
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
			case CimPackage.CIM_MEDIA_PARTITION__BOOTABLE:
				setBootable(BOOTABLE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__ALLOCATABLE:
				setAllocatable(ALLOCATABLE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm(SIGNATURE_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_STATE:
				setSignatureState(SIGNATURE_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_PARTITION__EXTENDABLE:
				setExtendable(EXTENDABLE_EDEFAULT);
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
			case CimPackage.CIM_MEDIA_PARTITION__BOOTABLE:
				return BOOTABLE_EDEFAULT == null ? bootable != null : !BOOTABLE_EDEFAULT.equals(bootable);
			case CimPackage.CIM_MEDIA_PARTITION__ALLOCATABLE:
				return ALLOCATABLE_EDEFAULT == null ? allocatable != null : !ALLOCATABLE_EDEFAULT.equals(allocatable);
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_ALGORITHM:
				return SIGNATURE_ALGORITHM_EDEFAULT == null ? signatureAlgorithm != null : !SIGNATURE_ALGORITHM_EDEFAULT.equals(signatureAlgorithm);
			case CimPackage.CIM_MEDIA_PARTITION__SIGNATURE_STATE:
				return SIGNATURE_STATE_EDEFAULT == null ? signatureState != null : !SIGNATURE_STATE_EDEFAULT.equals(signatureState);
			case CimPackage.CIM_MEDIA_PARTITION__EXTENDABLE:
				return EXTENDABLE_EDEFAULT == null ? extendable != null : !EXTENDABLE_EDEFAULT.equals(extendable);
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
		result.append(" (Bootable: ");
		result.append(bootable);
		result.append(", Allocatable: ");
		result.append(allocatable);
		result.append(", Signature: ");
		result.append(signature);
		result.append(", SignatureAlgorithm: ");
		result.append(signatureAlgorithm);
		result.append(", SignatureState: ");
		result.append(signatureState);
		result.append(", Extendable: ");
		result.append(extendable);
		result.append(')');
		return result.toString();
	}

} //CIM_MediaPartitionImpl
