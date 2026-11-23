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

import org.dmtf.cim.CIM_VirtualSystemMigrationSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual System Migration Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemMigrationSettingDataImpl#getMigrationType <em>Migration Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemMigrationSettingDataImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemMigrationSettingDataImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemMigrationSettingDataImpl#getBandwidthUnit <em>Bandwidth Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemMigrationSettingDataImpl#getOtherTransportType <em>Other Transport Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemMigrationSettingDataImpl#getTransportType <em>Transport Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VirtualSystemMigrationSettingDataImpl extends CIM_SettingDataImpl implements CIM_VirtualSystemMigrationSettingData {
	/**
	 * The default value of the '{@link #getMigrationType() <em>Migration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIGRATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMigrationType() <em>Migration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationType()
	 * @generated
	 * @ordered
	 */
	protected Integer migrationType = MIGRATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BANDWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected Integer bandwidth = BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidthUnit() <em>Bandwidth Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String BANDWIDTH_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandwidthUnit() <em>Bandwidth Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthUnit()
	 * @generated
	 * @ordered
	 */
	protected String bandwidthUnit = BANDWIDTH_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTransportType() <em>Other Transport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTransportType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TRANSPORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTransportType() <em>Other Transport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTransportType()
	 * @generated
	 * @ordered
	 */
	protected String otherTransportType = OTHER_TRANSPORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransportType() <em>Transport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRANSPORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransportType() <em>Transport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportType()
	 * @generated
	 * @ordered
	 */
	protected Integer transportType = TRANSPORT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualSystemMigrationSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualSystemMigrationSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMigrationType() {
		return migrationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMigrationType(Integer newMigrationType) {
		Integer oldMigrationType = migrationType;
		migrationType = newMigrationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__MIGRATION_TYPE, oldMigrationType, migrationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Integer newPriority) {
		Integer oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBandwidth() {
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBandwidth(Integer newBandwidth) {
		Integer oldBandwidth = bandwidth;
		bandwidth = newBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH, oldBandwidth, bandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBandwidthUnit() {
		return bandwidthUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBandwidthUnit(String newBandwidthUnit) {
		String oldBandwidthUnit = bandwidthUnit;
		bandwidthUnit = newBandwidthUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH_UNIT, oldBandwidthUnit, bandwidthUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTransportType() {
		return otherTransportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTransportType(String newOtherTransportType) {
		String oldOtherTransportType = otherTransportType;
		otherTransportType = newOtherTransportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__OTHER_TRANSPORT_TYPE, oldOtherTransportType, otherTransportType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTransportType() {
		return transportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransportType(Integer newTransportType) {
		Integer oldTransportType = transportType;
		transportType = newTransportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__TRANSPORT_TYPE, oldTransportType, transportType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__MIGRATION_TYPE:
				return getMigrationType();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__PRIORITY:
				return getPriority();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH:
				return getBandwidth();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH_UNIT:
				return getBandwidthUnit();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__OTHER_TRANSPORT_TYPE:
				return getOtherTransportType();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__TRANSPORT_TYPE:
				return getTransportType();
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__MIGRATION_TYPE:
				setMigrationType((Integer)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH:
				setBandwidth((Integer)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH_UNIT:
				setBandwidthUnit((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__OTHER_TRANSPORT_TYPE:
				setOtherTransportType((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__TRANSPORT_TYPE:
				setTransportType((Integer)newValue);
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__MIGRATION_TYPE:
				setMigrationType(MIGRATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH:
				setBandwidth(BANDWIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH_UNIT:
				setBandwidthUnit(BANDWIDTH_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__OTHER_TRANSPORT_TYPE:
				setOtherTransportType(OTHER_TRANSPORT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__TRANSPORT_TYPE:
				setTransportType(TRANSPORT_TYPE_EDEFAULT);
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__MIGRATION_TYPE:
				return MIGRATION_TYPE_EDEFAULT == null ? migrationType != null : !MIGRATION_TYPE_EDEFAULT.equals(migrationType);
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH:
				return BANDWIDTH_EDEFAULT == null ? bandwidth != null : !BANDWIDTH_EDEFAULT.equals(bandwidth);
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__BANDWIDTH_UNIT:
				return BANDWIDTH_UNIT_EDEFAULT == null ? bandwidthUnit != null : !BANDWIDTH_UNIT_EDEFAULT.equals(bandwidthUnit);
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__OTHER_TRANSPORT_TYPE:
				return OTHER_TRANSPORT_TYPE_EDEFAULT == null ? otherTransportType != null : !OTHER_TRANSPORT_TYPE_EDEFAULT.equals(otherTransportType);
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA__TRANSPORT_TYPE:
				return TRANSPORT_TYPE_EDEFAULT == null ? transportType != null : !TRANSPORT_TYPE_EDEFAULT.equals(transportType);
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
		result.append(" (MigrationType: ");
		result.append(migrationType);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", Bandwidth: ");
		result.append(bandwidth);
		result.append(", BandwidthUnit: ");
		result.append(bandwidthUnit);
		result.append(", OtherTransportType: ");
		result.append(otherTransportType);
		result.append(", TransportType: ");
		result.append(transportType);
		result.append(')');
		return result.toString();
	}

} //CIM_VirtualSystemMigrationSettingDataImpl
