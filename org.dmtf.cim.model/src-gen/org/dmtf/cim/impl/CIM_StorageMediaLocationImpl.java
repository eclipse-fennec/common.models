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

import org.dmtf.cim.CIM_StorageMediaLocation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Media Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageMediaLocationImpl#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageMediaLocationImpl#getMediaTypesSupported <em>Media Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageMediaLocationImpl#getMediaSizesSupported <em>Media Sizes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageMediaLocationImpl#getMediaCapacity <em>Media Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageMediaLocationImpl#getTypeDescriptions <em>Type Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageMediaLocationImpl extends CIM_PackageLocationImpl implements CIM_StorageMediaLocation {
	/**
	 * The default value of the '{@link #getLocationType() <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationType() <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected Integer locationType = LOCATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMediaTypesSupported() <em>Media Types Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> mediaTypesSupported;

	/**
	 * The cached value of the '{@link #getMediaSizesSupported() <em>Media Sizes Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaSizesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> mediaSizesSupported;

	/**
	 * The default value of the '{@link #getMediaCapacity() <em>Media Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long MEDIA_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaCapacity() <em>Media Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long mediaCapacity = MEDIA_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeDescriptions() <em>Type Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> typeDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageMediaLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageMediaLocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocationType() {
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationType(Integer newLocationType) {
		Integer oldLocationType = locationType;
		locationType = newLocationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_MEDIA_LOCATION__LOCATION_TYPE, oldLocationType, locationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMediaTypesSupported() {
		if (mediaTypesSupported == null) {
			mediaTypesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_TYPES_SUPPORTED);
		}
		return mediaTypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Float> getMediaSizesSupported() {
		if (mediaSizesSupported == null) {
			mediaSizesSupported = new EDataTypeEList<Float>(Float.class, this, CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_SIZES_SUPPORTED);
		}
		return mediaSizesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMediaCapacity() {
		return mediaCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaCapacity(Long newMediaCapacity) {
		Long oldMediaCapacity = mediaCapacity;
		mediaCapacity = newMediaCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_CAPACITY, oldMediaCapacity, mediaCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTypeDescriptions() {
		if (typeDescriptions == null) {
			typeDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_STORAGE_MEDIA_LOCATION__TYPE_DESCRIPTIONS);
		}
		return typeDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__LOCATION_TYPE:
				return getLocationType();
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_TYPES_SUPPORTED:
				return getMediaTypesSupported();
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_SIZES_SUPPORTED:
				return getMediaSizesSupported();
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_CAPACITY:
				return getMediaCapacity();
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__TYPE_DESCRIPTIONS:
				return getTypeDescriptions();
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
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__LOCATION_TYPE:
				setLocationType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_TYPES_SUPPORTED:
				getMediaTypesSupported().clear();
				getMediaTypesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_SIZES_SUPPORTED:
				getMediaSizesSupported().clear();
				getMediaSizesSupported().addAll((Collection<? extends Float>)newValue);
				return;
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_CAPACITY:
				setMediaCapacity((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__TYPE_DESCRIPTIONS:
				getTypeDescriptions().clear();
				getTypeDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__LOCATION_TYPE:
				setLocationType(LOCATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_TYPES_SUPPORTED:
				getMediaTypesSupported().clear();
				return;
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_SIZES_SUPPORTED:
				getMediaSizesSupported().clear();
				return;
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_CAPACITY:
				setMediaCapacity(MEDIA_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__TYPE_DESCRIPTIONS:
				getTypeDescriptions().clear();
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
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__LOCATION_TYPE:
				return LOCATION_TYPE_EDEFAULT == null ? locationType != null : !LOCATION_TYPE_EDEFAULT.equals(locationType);
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_TYPES_SUPPORTED:
				return mediaTypesSupported != null && !mediaTypesSupported.isEmpty();
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_SIZES_SUPPORTED:
				return mediaSizesSupported != null && !mediaSizesSupported.isEmpty();
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__MEDIA_CAPACITY:
				return MEDIA_CAPACITY_EDEFAULT == null ? mediaCapacity != null : !MEDIA_CAPACITY_EDEFAULT.equals(mediaCapacity);
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION__TYPE_DESCRIPTIONS:
				return typeDescriptions != null && !typeDescriptions.isEmpty();
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
		result.append(" (LocationType: ");
		result.append(locationType);
		result.append(", MediaTypesSupported: ");
		result.append(mediaTypesSupported);
		result.append(", MediaSizesSupported: ");
		result.append(mediaSizesSupported);
		result.append(", MediaCapacity: ");
		result.append(mediaCapacity);
		result.append(", TypeDescriptions: ");
		result.append(typeDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageMediaLocationImpl
