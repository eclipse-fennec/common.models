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

import org.dmtf.cim.CIM_Zone;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneImpl#getZoneType <em>Zone Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneImpl#getOtherZoneTypeDescription <em>Other Zone Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneImpl#getZoneSubType <em>Zone Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneImpl#getOtherZoneSubTypeDescription <em>Other Zone Sub Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ZoneImpl extends CIM_ConnectivityCollectionImpl implements CIM_Zone {
	/**
	 * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected Boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZoneType() <em>Zone Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ZONE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneType() <em>Zone Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneType()
	 * @generated
	 * @ordered
	 */
	protected Integer zoneType = ZONE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherZoneTypeDescription() <em>Other Zone Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherZoneTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ZONE_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherZoneTypeDescription() <em>Other Zone Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherZoneTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherZoneTypeDescription = OTHER_ZONE_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZoneSubType() <em>Zone Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneSubType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ZONE_SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneSubType() <em>Zone Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneSubType()
	 * @generated
	 * @ordered
	 */
	protected Integer zoneSubType = ZONE_SUB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherZoneSubTypeDescription() <em>Other Zone Sub Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherZoneSubTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ZONE_SUB_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherZoneSubTypeDescription() <em>Other Zone Sub Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherZoneSubTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherZoneSubTypeDescription = OTHER_ZONE_SUB_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Zone();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(Boolean newActive) {
		Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getZoneType() {
		return zoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoneType(Integer newZoneType) {
		Integer oldZoneType = zoneType;
		zoneType = newZoneType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE__ZONE_TYPE, oldZoneType, zoneType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherZoneTypeDescription() {
		return otherZoneTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherZoneTypeDescription(String newOtherZoneTypeDescription) {
		String oldOtherZoneTypeDescription = otherZoneTypeDescription;
		otherZoneTypeDescription = newOtherZoneTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE__OTHER_ZONE_TYPE_DESCRIPTION, oldOtherZoneTypeDescription, otherZoneTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getZoneSubType() {
		return zoneSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoneSubType(Integer newZoneSubType) {
		Integer oldZoneSubType = zoneSubType;
		zoneSubType = newZoneSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE__ZONE_SUB_TYPE, oldZoneSubType, zoneSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherZoneSubTypeDescription() {
		return otherZoneSubTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherZoneSubTypeDescription(String newOtherZoneSubTypeDescription) {
		String oldOtherZoneSubTypeDescription = otherZoneSubTypeDescription;
		otherZoneSubTypeDescription = newOtherZoneSubTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE__OTHER_ZONE_SUB_TYPE_DESCRIPTION, oldOtherZoneSubTypeDescription, otherZoneSubTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ZONE__ACTIVE:
				return getActive();
			case CimPackage.CIM_ZONE__ZONE_TYPE:
				return getZoneType();
			case CimPackage.CIM_ZONE__OTHER_ZONE_TYPE_DESCRIPTION:
				return getOtherZoneTypeDescription();
			case CimPackage.CIM_ZONE__ZONE_SUB_TYPE:
				return getZoneSubType();
			case CimPackage.CIM_ZONE__OTHER_ZONE_SUB_TYPE_DESCRIPTION:
				return getOtherZoneSubTypeDescription();
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
			case CimPackage.CIM_ZONE__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case CimPackage.CIM_ZONE__ZONE_TYPE:
				setZoneType((Integer)newValue);
				return;
			case CimPackage.CIM_ZONE__OTHER_ZONE_TYPE_DESCRIPTION:
				setOtherZoneTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_ZONE__ZONE_SUB_TYPE:
				setZoneSubType((Integer)newValue);
				return;
			case CimPackage.CIM_ZONE__OTHER_ZONE_SUB_TYPE_DESCRIPTION:
				setOtherZoneSubTypeDescription((String)newValue);
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
			case CimPackage.CIM_ZONE__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE__ZONE_TYPE:
				setZoneType(ZONE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE__OTHER_ZONE_TYPE_DESCRIPTION:
				setOtherZoneTypeDescription(OTHER_ZONE_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE__ZONE_SUB_TYPE:
				setZoneSubType(ZONE_SUB_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE__OTHER_ZONE_SUB_TYPE_DESCRIPTION:
				setOtherZoneSubTypeDescription(OTHER_ZONE_SUB_TYPE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_ZONE__ACTIVE:
				return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT.equals(active);
			case CimPackage.CIM_ZONE__ZONE_TYPE:
				return ZONE_TYPE_EDEFAULT == null ? zoneType != null : !ZONE_TYPE_EDEFAULT.equals(zoneType);
			case CimPackage.CIM_ZONE__OTHER_ZONE_TYPE_DESCRIPTION:
				return OTHER_ZONE_TYPE_DESCRIPTION_EDEFAULT == null ? otherZoneTypeDescription != null : !OTHER_ZONE_TYPE_DESCRIPTION_EDEFAULT.equals(otherZoneTypeDescription);
			case CimPackage.CIM_ZONE__ZONE_SUB_TYPE:
				return ZONE_SUB_TYPE_EDEFAULT == null ? zoneSubType != null : !ZONE_SUB_TYPE_EDEFAULT.equals(zoneSubType);
			case CimPackage.CIM_ZONE__OTHER_ZONE_SUB_TYPE_DESCRIPTION:
				return OTHER_ZONE_SUB_TYPE_DESCRIPTION_EDEFAULT == null ? otherZoneSubTypeDescription != null : !OTHER_ZONE_SUB_TYPE_DESCRIPTION_EDEFAULT.equals(otherZoneSubTypeDescription);
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
		result.append(" (Active: ");
		result.append(active);
		result.append(", ZoneType: ");
		result.append(zoneType);
		result.append(", OtherZoneTypeDescription: ");
		result.append(otherZoneTypeDescription);
		result.append(", ZoneSubType: ");
		result.append(zoneSubType);
		result.append(", OtherZoneSubTypeDescription: ");
		result.append(otherZoneSubTypeDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_ZoneImpl
