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

import org.dmtf.cim.CIM_DiskDriveDiagnosticSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Disk Drive Diagnostic Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticSettingDataImpl#getLBAStart <em>LBA Start</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticSettingDataImpl#getLBAEnd <em>LBA End</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticSettingDataImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticSettingDataImpl#getDataSizes <em>Data Sizes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticSettingDataImpl#getDataPatterns <em>Data Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiskDriveDiagnosticSettingDataImpl extends CIM_DiagnosticSettingDataImpl implements CIM_DiskDriveDiagnosticSettingData {
	/**
	 * The default value of the '{@link #getLBAStart() <em>LBA Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAStart()
	 * @generated
	 * @ordered
	 */
	protected static final Long LBA_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLBAStart() <em>LBA Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAStart()
	 * @generated
	 * @ordered
	 */
	protected Long lbaStart = LBA_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getLBAEnd() <em>LBA End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Long LBA_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLBAEnd() <em>LBA End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAEnd()
	 * @generated
	 * @ordered
	 */
	protected Long lbaEnd = LBA_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long SEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected Long seed = SEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataSizes() <em>Data Sizes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSizes()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> dataSizes;

	/**
	 * The cached value of the '{@link #getDataPatterns() <em>Data Patterns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiskDriveDiagnosticSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiskDriveDiagnosticSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLBAStart() {
		return lbaStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLBAStart(Long newLBAStart) {
		Long oldLBAStart = lbaStart;
		lbaStart = newLBAStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_START, oldLBAStart, lbaStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLBAEnd() {
		return lbaEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLBAEnd(Long newLBAEnd) {
		Long oldLBAEnd = lbaEnd;
		lbaEnd = newLBAEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_END, oldLBAEnd, lbaEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSeed() {
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeed(Long newSeed) {
		Long oldSeed = seed;
		seed = newSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getDataSizes() {
		if (dataSizes == null) {
			dataSizes = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_SIZES);
		}
		return dataSizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDataPatterns() {
		if (dataPatterns == null) {
			dataPatterns = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_PATTERNS);
		}
		return dataPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_START:
				return getLBAStart();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_END:
				return getLBAEnd();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__SEED:
				return getSeed();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_SIZES:
				return getDataSizes();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_PATTERNS:
				return getDataPatterns();
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_START:
				setLBAStart((Long)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_END:
				setLBAEnd((Long)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__SEED:
				setSeed((Long)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_SIZES:
				getDataSizes().clear();
				getDataSizes().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_PATTERNS:
				getDataPatterns().clear();
				getDataPatterns().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_START:
				setLBAStart(LBA_START_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_END:
				setLBAEnd(LBA_END_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__SEED:
				setSeed(SEED_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_SIZES:
				getDataSizes().clear();
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_PATTERNS:
				getDataPatterns().clear();
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_START:
				return LBA_START_EDEFAULT == null ? lbaStart != null : !LBA_START_EDEFAULT.equals(lbaStart);
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__LBA_END:
				return LBA_END_EDEFAULT == null ? lbaEnd != null : !LBA_END_EDEFAULT.equals(lbaEnd);
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__SEED:
				return SEED_EDEFAULT == null ? seed != null : !SEED_EDEFAULT.equals(seed);
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_SIZES:
				return dataSizes != null && !dataSizes.isEmpty();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA__DATA_PATTERNS:
				return dataPatterns != null && !dataPatterns.isEmpty();
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
		result.append(" (LBAStart: ");
		result.append(lbaStart);
		result.append(", LBAEnd: ");
		result.append(lbaEnd);
		result.append(", Seed: ");
		result.append(seed);
		result.append(", DataSizes: ");
		result.append(dataSizes);
		result.append(", DataPatterns: ");
		result.append(dataPatterns);
		result.append(')');
		return result.toString();
	}

} //CIM_DiskDriveDiagnosticSettingDataImpl
