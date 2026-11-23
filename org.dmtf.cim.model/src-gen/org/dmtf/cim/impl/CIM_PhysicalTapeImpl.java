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

import org.dmtf.cim.CIM_PhysicalTape;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Tape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalTapeImpl#getTapeLength <em>Tape Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalTapeImpl#getUnloadAnywhere <em>Unload Anywhere</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalTapeImpl#getIsBasedOnDisk <em>Is Based On Disk</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalTapeImpl#getOtherUsageDescription <em>Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalTapeImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalTapeImpl extends CIM_PhysicalMediaImpl implements CIM_PhysicalTape {
	/**
	 * The default value of the '{@link #getTapeLength() <em>Tape Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeLength()
	 * @generated
	 * @ordered
	 */
	protected static final Float TAPE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTapeLength() <em>Tape Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeLength()
	 * @generated
	 * @ordered
	 */
	protected Float tapeLength = TAPE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnloadAnywhere() <em>Unload Anywhere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadAnywhere()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNLOAD_ANYWHERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnloadAnywhere() <em>Unload Anywhere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadAnywhere()
	 * @generated
	 * @ordered
	 */
	protected Boolean unloadAnywhere = UNLOAD_ANYWHERE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsBasedOnDisk() <em>Is Based On Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBasedOnDisk()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BASED_ON_DISK_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsBasedOnDisk() <em>Is Based On Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBasedOnDisk()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBasedOnDisk = IS_BASED_ON_DISK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherUsageDescription() <em>Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_USAGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherUsageDescription() <em>Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherUsageDescription = OTHER_USAGE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer usage = USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalTapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalTape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getTapeLength() {
		return tapeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTapeLength(Float newTapeLength) {
		Float oldTapeLength = tapeLength;
		tapeLength = newTapeLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_TAPE__TAPE_LENGTH, oldTapeLength, tapeLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUnloadAnywhere() {
		return unloadAnywhere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnloadAnywhere(Boolean newUnloadAnywhere) {
		Boolean oldUnloadAnywhere = unloadAnywhere;
		unloadAnywhere = newUnloadAnywhere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_TAPE__UNLOAD_ANYWHERE, oldUnloadAnywhere, unloadAnywhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsBasedOnDisk() {
		return isBasedOnDisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBasedOnDisk(Boolean newIsBasedOnDisk) {
		Boolean oldIsBasedOnDisk = isBasedOnDisk;
		isBasedOnDisk = newIsBasedOnDisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_TAPE__IS_BASED_ON_DISK, oldIsBasedOnDisk, isBasedOnDisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherUsageDescription() {
		return otherUsageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherUsageDescription(String newOtherUsageDescription) {
		String oldOtherUsageDescription = otherUsageDescription;
		otherUsageDescription = newOtherUsageDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_TAPE__OTHER_USAGE_DESCRIPTION, oldOtherUsageDescription, otherUsageDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsage(Integer newUsage) {
		Integer oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_TAPE__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_TAPE__TAPE_LENGTH:
				return getTapeLength();
			case CimPackage.CIM_PHYSICAL_TAPE__UNLOAD_ANYWHERE:
				return getUnloadAnywhere();
			case CimPackage.CIM_PHYSICAL_TAPE__IS_BASED_ON_DISK:
				return getIsBasedOnDisk();
			case CimPackage.CIM_PHYSICAL_TAPE__OTHER_USAGE_DESCRIPTION:
				return getOtherUsageDescription();
			case CimPackage.CIM_PHYSICAL_TAPE__USAGE:
				return getUsage();
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
			case CimPackage.CIM_PHYSICAL_TAPE__TAPE_LENGTH:
				setTapeLength((Float)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_TAPE__UNLOAD_ANYWHERE:
				setUnloadAnywhere((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_TAPE__IS_BASED_ON_DISK:
				setIsBasedOnDisk((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_TAPE__OTHER_USAGE_DESCRIPTION:
				setOtherUsageDescription((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_TAPE__USAGE:
				setUsage((Integer)newValue);
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
			case CimPackage.CIM_PHYSICAL_TAPE__TAPE_LENGTH:
				setTapeLength(TAPE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_TAPE__UNLOAD_ANYWHERE:
				setUnloadAnywhere(UNLOAD_ANYWHERE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_TAPE__IS_BASED_ON_DISK:
				setIsBasedOnDisk(IS_BASED_ON_DISK_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_TAPE__OTHER_USAGE_DESCRIPTION:
				setOtherUsageDescription(OTHER_USAGE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_TAPE__USAGE:
				setUsage(USAGE_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_TAPE__TAPE_LENGTH:
				return TAPE_LENGTH_EDEFAULT == null ? tapeLength != null : !TAPE_LENGTH_EDEFAULT.equals(tapeLength);
			case CimPackage.CIM_PHYSICAL_TAPE__UNLOAD_ANYWHERE:
				return UNLOAD_ANYWHERE_EDEFAULT == null ? unloadAnywhere != null : !UNLOAD_ANYWHERE_EDEFAULT.equals(unloadAnywhere);
			case CimPackage.CIM_PHYSICAL_TAPE__IS_BASED_ON_DISK:
				return IS_BASED_ON_DISK_EDEFAULT == null ? isBasedOnDisk != null : !IS_BASED_ON_DISK_EDEFAULT.equals(isBasedOnDisk);
			case CimPackage.CIM_PHYSICAL_TAPE__OTHER_USAGE_DESCRIPTION:
				return OTHER_USAGE_DESCRIPTION_EDEFAULT == null ? otherUsageDescription != null : !OTHER_USAGE_DESCRIPTION_EDEFAULT.equals(otherUsageDescription);
			case CimPackage.CIM_PHYSICAL_TAPE__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
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
		result.append(" (TapeLength: ");
		result.append(tapeLength);
		result.append(", UnloadAnywhere: ");
		result.append(unloadAnywhere);
		result.append(", IsBasedOnDisk: ");
		result.append(isBasedOnDisk);
		result.append(", OtherUsageDescription: ");
		result.append(otherUsageDescription);
		result.append(", Usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalTapeImpl
