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

import org.dmtf.cim.CIM_VolumeSetBasedOnPSExtent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Volume Set Based On PS Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeSetBasedOnPSExtentImpl#getLBAsMappedByDecrementing <em>LB As Mapped By Decrementing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeSetBasedOnPSExtentImpl#getLBAMappingIncludesCheckData <em>LBA Mapping Includes Check Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VolumeSetBasedOnPSExtentImpl extends CIM_BasedOnImpl implements CIM_VolumeSetBasedOnPSExtent {
	/**
	 * The default value of the '{@link #getLBAsMappedByDecrementing() <em>LB As Mapped By Decrementing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAsMappedByDecrementing()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLBAsMappedByDecrementing() <em>LB As Mapped By Decrementing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAsMappedByDecrementing()
	 * @generated
	 * @ordered
	 */
	protected Boolean lbAsMappedByDecrementing = LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLBAMappingIncludesCheckData() <em>LBA Mapping Includes Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAMappingIncludesCheckData()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLBAMappingIncludesCheckData() <em>LBA Mapping Includes Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAMappingIncludesCheckData()
	 * @generated
	 * @ordered
	 */
	protected Boolean lbaMappingIncludesCheckData = LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VolumeSetBasedOnPSExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VolumeSetBasedOnPSExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLBAsMappedByDecrementing() {
		return lbAsMappedByDecrementing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLBAsMappedByDecrementing(Boolean newLBAsMappedByDecrementing) {
		Boolean oldLBAsMappedByDecrementing = lbAsMappedByDecrementing;
		lbAsMappedByDecrementing = newLBAsMappedByDecrementing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LB_AS_MAPPED_BY_DECREMENTING, oldLBAsMappedByDecrementing, lbAsMappedByDecrementing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLBAMappingIncludesCheckData() {
		return lbaMappingIncludesCheckData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLBAMappingIncludesCheckData(Boolean newLBAMappingIncludesCheckData) {
		Boolean oldLBAMappingIncludesCheckData = lbaMappingIncludesCheckData;
		lbaMappingIncludesCheckData = newLBAMappingIncludesCheckData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LBA_MAPPING_INCLUDES_CHECK_DATA, oldLBAMappingIncludesCheckData, lbaMappingIncludesCheckData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LB_AS_MAPPED_BY_DECREMENTING:
				return getLBAsMappedByDecrementing();
			case CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LBA_MAPPING_INCLUDES_CHECK_DATA:
				return getLBAMappingIncludesCheckData();
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
			case CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LB_AS_MAPPED_BY_DECREMENTING:
				setLBAsMappedByDecrementing((Boolean)newValue);
				return;
			case CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LBA_MAPPING_INCLUDES_CHECK_DATA:
				setLBAMappingIncludesCheckData((Boolean)newValue);
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
			case CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LB_AS_MAPPED_BY_DECREMENTING:
				setLBAsMappedByDecrementing(LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LBA_MAPPING_INCLUDES_CHECK_DATA:
				setLBAMappingIncludesCheckData(LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT);
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
			case CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LB_AS_MAPPED_BY_DECREMENTING:
				return LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT == null ? lbAsMappedByDecrementing != null : !LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT.equals(lbAsMappedByDecrementing);
			case CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT__LBA_MAPPING_INCLUDES_CHECK_DATA:
				return LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT == null ? lbaMappingIncludesCheckData != null : !LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT.equals(lbaMappingIncludesCheckData);
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
		result.append(" (LBAsMappedByDecrementing: ");
		result.append(lbAsMappedByDecrementing);
		result.append(", LBAMappingIncludesCheckData: ");
		result.append(lbaMappingIncludesCheckData);
		result.append(')');
		return result.toString();
	}

} //CIM_VolumeSetBasedOnPSExtentImpl
