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

import org.dmtf.cim.CIM_DiskDriveDiagnosticServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Disk Drive Diagnostic Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticServiceCapabilitiesImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticServiceCapabilitiesImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticServiceCapabilitiesImpl#getDataSizes <em>Data Sizes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticServiceCapabilitiesImpl#getDataPatterns <em>Data Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiskDriveDiagnosticServiceCapabilitiesImpl extends CIM_DiagnosticServiceCapabilitiesImpl implements CIM_DiskDriveDiagnosticServiceCapabilities {
	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected Boolean region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected Boolean seed = SEED_EDEFAULT;

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
	protected CIM_DiskDriveDiagnosticServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiskDriveDiagnosticServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(Boolean newRegion) {
		Boolean oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSeed() {
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeed(Boolean newSeed) {
		Boolean oldSeed = seed;
		seed = newSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getDataSizes() {
		if (dataSizes == null) {
			dataSizes = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_SIZES);
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
			dataPatterns = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_PATTERNS);
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__REGION:
				return getRegion();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__SEED:
				return getSeed();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_SIZES:
				return getDataSizes();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_PATTERNS:
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__REGION:
				setRegion((Boolean)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__SEED:
				setSeed((Boolean)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_SIZES:
				getDataSizes().clear();
				getDataSizes().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_PATTERNS:
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__SEED:
				setSeed(SEED_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_SIZES:
				getDataSizes().clear();
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_PATTERNS:
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__SEED:
				return SEED_EDEFAULT == null ? seed != null : !SEED_EDEFAULT.equals(seed);
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_SIZES:
				return dataSizes != null && !dataSizes.isEmpty();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES__DATA_PATTERNS:
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
		result.append(" (Region: ");
		result.append(region);
		result.append(", Seed: ");
		result.append(seed);
		result.append(", DataSizes: ");
		result.append(dataSizes);
		result.append(", DataPatterns: ");
		result.append(dataPatterns);
		result.append(')');
		return result.toString();
	}

} //CIM_DiskDriveDiagnosticServiceCapabilitiesImpl
