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

import org.dmtf.cim.CIM_SoftwareElementVersionCheck;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Software Element Version Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementVersionCheckImpl#getSoftwareElementName <em>Software Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementVersionCheckImpl#getLowerSoftwareElementVersion <em>Lower Software Element Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementVersionCheckImpl#getUpperSoftwareElementVersion <em>Upper Software Element Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementVersionCheckImpl#getSoftwareElementStateDesired <em>Software Element State Desired</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementVersionCheckImpl#getTargetOperatingSystemDesired <em>Target Operating System Desired</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SoftwareElementVersionCheckImpl extends CIM_CheckImpl implements CIM_SoftwareElementVersionCheck {
	/**
	 * The default value of the '{@link #getSoftwareElementName() <em>Software Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareElementName() <em>Software Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementName()
	 * @generated
	 * @ordered
	 */
	protected String softwareElementName = SOFTWARE_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerSoftwareElementVersion() <em>Lower Software Element Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerSoftwareElementVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_SOFTWARE_ELEMENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerSoftwareElementVersion() <em>Lower Software Element Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerSoftwareElementVersion()
	 * @generated
	 * @ordered
	 */
	protected String lowerSoftwareElementVersion = LOWER_SOFTWARE_ELEMENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperSoftwareElementVersion() <em>Upper Software Element Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperSoftwareElementVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_SOFTWARE_ELEMENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperSoftwareElementVersion() <em>Upper Software Element Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperSoftwareElementVersion()
	 * @generated
	 * @ordered
	 */
	protected String upperSoftwareElementVersion = UPPER_SOFTWARE_ELEMENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareElementStateDesired() <em>Software Element State Desired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementStateDesired()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SOFTWARE_ELEMENT_STATE_DESIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareElementStateDesired() <em>Software Element State Desired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementStateDesired()
	 * @generated
	 * @ordered
	 */
	protected Integer softwareElementStateDesired = SOFTWARE_ELEMENT_STATE_DESIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetOperatingSystemDesired() <em>Target Operating System Desired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystemDesired()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_OPERATING_SYSTEM_DESIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetOperatingSystemDesired() <em>Target Operating System Desired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystemDesired()
	 * @generated
	 * @ordered
	 */
	protected Integer targetOperatingSystemDesired = TARGET_OPERATING_SYSTEM_DESIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SoftwareElementVersionCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SoftwareElementVersionCheck();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftwareElementName() {
		return softwareElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareElementName(String newSoftwareElementName) {
		String oldSoftwareElementName = softwareElementName;
		softwareElementName = newSoftwareElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_NAME, oldSoftwareElementName, softwareElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLowerSoftwareElementVersion() {
		return lowerSoftwareElementVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerSoftwareElementVersion(String newLowerSoftwareElementVersion) {
		String oldLowerSoftwareElementVersion = lowerSoftwareElementVersion;
		lowerSoftwareElementVersion = newLowerSoftwareElementVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__LOWER_SOFTWARE_ELEMENT_VERSION, oldLowerSoftwareElementVersion, lowerSoftwareElementVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpperSoftwareElementVersion() {
		return upperSoftwareElementVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperSoftwareElementVersion(String newUpperSoftwareElementVersion) {
		String oldUpperSoftwareElementVersion = upperSoftwareElementVersion;
		upperSoftwareElementVersion = newUpperSoftwareElementVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__UPPER_SOFTWARE_ELEMENT_VERSION, oldUpperSoftwareElementVersion, upperSoftwareElementVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSoftwareElementStateDesired() {
		return softwareElementStateDesired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareElementStateDesired(Integer newSoftwareElementStateDesired) {
		Integer oldSoftwareElementStateDesired = softwareElementStateDesired;
		softwareElementStateDesired = newSoftwareElementStateDesired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_STATE_DESIRED, oldSoftwareElementStateDesired, softwareElementStateDesired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTargetOperatingSystemDesired() {
		return targetOperatingSystemDesired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetOperatingSystemDesired(Integer newTargetOperatingSystemDesired) {
		Integer oldTargetOperatingSystemDesired = targetOperatingSystemDesired;
		targetOperatingSystemDesired = newTargetOperatingSystemDesired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__TARGET_OPERATING_SYSTEM_DESIRED, oldTargetOperatingSystemDesired, targetOperatingSystemDesired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_NAME:
				return getSoftwareElementName();
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__LOWER_SOFTWARE_ELEMENT_VERSION:
				return getLowerSoftwareElementVersion();
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__UPPER_SOFTWARE_ELEMENT_VERSION:
				return getUpperSoftwareElementVersion();
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_STATE_DESIRED:
				return getSoftwareElementStateDesired();
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__TARGET_OPERATING_SYSTEM_DESIRED:
				return getTargetOperatingSystemDesired();
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
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_NAME:
				setSoftwareElementName((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__LOWER_SOFTWARE_ELEMENT_VERSION:
				setLowerSoftwareElementVersion((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__UPPER_SOFTWARE_ELEMENT_VERSION:
				setUpperSoftwareElementVersion((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_STATE_DESIRED:
				setSoftwareElementStateDesired((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__TARGET_OPERATING_SYSTEM_DESIRED:
				setTargetOperatingSystemDesired((Integer)newValue);
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
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_NAME:
				setSoftwareElementName(SOFTWARE_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__LOWER_SOFTWARE_ELEMENT_VERSION:
				setLowerSoftwareElementVersion(LOWER_SOFTWARE_ELEMENT_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__UPPER_SOFTWARE_ELEMENT_VERSION:
				setUpperSoftwareElementVersion(UPPER_SOFTWARE_ELEMENT_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_STATE_DESIRED:
				setSoftwareElementStateDesired(SOFTWARE_ELEMENT_STATE_DESIRED_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__TARGET_OPERATING_SYSTEM_DESIRED:
				setTargetOperatingSystemDesired(TARGET_OPERATING_SYSTEM_DESIRED_EDEFAULT);
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
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_NAME:
				return SOFTWARE_ELEMENT_NAME_EDEFAULT == null ? softwareElementName != null : !SOFTWARE_ELEMENT_NAME_EDEFAULT.equals(softwareElementName);
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__LOWER_SOFTWARE_ELEMENT_VERSION:
				return LOWER_SOFTWARE_ELEMENT_VERSION_EDEFAULT == null ? lowerSoftwareElementVersion != null : !LOWER_SOFTWARE_ELEMENT_VERSION_EDEFAULT.equals(lowerSoftwareElementVersion);
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__UPPER_SOFTWARE_ELEMENT_VERSION:
				return UPPER_SOFTWARE_ELEMENT_VERSION_EDEFAULT == null ? upperSoftwareElementVersion != null : !UPPER_SOFTWARE_ELEMENT_VERSION_EDEFAULT.equals(upperSoftwareElementVersion);
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__SOFTWARE_ELEMENT_STATE_DESIRED:
				return SOFTWARE_ELEMENT_STATE_DESIRED_EDEFAULT == null ? softwareElementStateDesired != null : !SOFTWARE_ELEMENT_STATE_DESIRED_EDEFAULT.equals(softwareElementStateDesired);
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK__TARGET_OPERATING_SYSTEM_DESIRED:
				return TARGET_OPERATING_SYSTEM_DESIRED_EDEFAULT == null ? targetOperatingSystemDesired != null : !TARGET_OPERATING_SYSTEM_DESIRED_EDEFAULT.equals(targetOperatingSystemDesired);
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
		result.append(" (SoftwareElementName: ");
		result.append(softwareElementName);
		result.append(", LowerSoftwareElementVersion: ");
		result.append(lowerSoftwareElementVersion);
		result.append(", UpperSoftwareElementVersion: ");
		result.append(upperSoftwareElementVersion);
		result.append(", SoftwareElementStateDesired: ");
		result.append(softwareElementStateDesired);
		result.append(", TargetOperatingSystemDesired: ");
		result.append(targetOperatingSystemDesired);
		result.append(')');
		return result.toString();
	}

} //CIM_SoftwareElementVersionCheckImpl
