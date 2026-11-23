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

import org.dmtf.cim.CIM_ElementSoftwareIdentity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Element Software Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSoftwareIdentityImpl#getUpgradeCondition <em>Upgrade Condition</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSoftwareIdentityImpl#getOtherUpgradeCondition <em>Other Upgrade Condition</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSoftwareIdentityImpl#getElementSoftwareStatus <em>Element Software Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ElementSoftwareIdentityImpl extends CIM_DependencyImpl implements CIM_ElementSoftwareIdentity {
	/**
	 * The default value of the '{@link #getUpgradeCondition() <em>Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeCondition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPGRADE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpgradeCondition() <em>Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeCondition()
	 * @generated
	 * @ordered
	 */
	protected Integer upgradeCondition = UPGRADE_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherUpgradeCondition() <em>Other Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUpgradeCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_UPGRADE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherUpgradeCondition() <em>Other Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUpgradeCondition()
	 * @generated
	 * @ordered
	 */
	protected String otherUpgradeCondition = OTHER_UPGRADE_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementSoftwareStatus() <em>Element Software Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSoftwareStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> elementSoftwareStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ElementSoftwareIdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ElementSoftwareIdentity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpgradeCondition() {
		return upgradeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpgradeCondition(Integer newUpgradeCondition) {
		Integer oldUpgradeCondition = upgradeCondition;
		upgradeCondition = newUpgradeCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION, oldUpgradeCondition, upgradeCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherUpgradeCondition() {
		return otherUpgradeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherUpgradeCondition(String newOtherUpgradeCondition) {
		String oldOtherUpgradeCondition = otherUpgradeCondition;
		otherUpgradeCondition = newOtherUpgradeCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION, oldOtherUpgradeCondition, otherUpgradeCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getElementSoftwareStatus() {
		if (elementSoftwareStatus == null) {
			elementSoftwareStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS);
		}
		return elementSoftwareStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION:
				return getUpgradeCondition();
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION:
				return getOtherUpgradeCondition();
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS:
				return getElementSoftwareStatus();
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
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION:
				setUpgradeCondition((Integer)newValue);
				return;
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION:
				setOtherUpgradeCondition((String)newValue);
				return;
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS:
				getElementSoftwareStatus().clear();
				getElementSoftwareStatus().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION:
				setUpgradeCondition(UPGRADE_CONDITION_EDEFAULT);
				return;
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION:
				setOtherUpgradeCondition(OTHER_UPGRADE_CONDITION_EDEFAULT);
				return;
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS:
				getElementSoftwareStatus().clear();
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
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION:
				return UPGRADE_CONDITION_EDEFAULT == null ? upgradeCondition != null : !UPGRADE_CONDITION_EDEFAULT.equals(upgradeCondition);
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION:
				return OTHER_UPGRADE_CONDITION_EDEFAULT == null ? otherUpgradeCondition != null : !OTHER_UPGRADE_CONDITION_EDEFAULT.equals(otherUpgradeCondition);
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS:
				return elementSoftwareStatus != null && !elementSoftwareStatus.isEmpty();
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
		result.append(" (UpgradeCondition: ");
		result.append(upgradeCondition);
		result.append(", OtherUpgradeCondition: ");
		result.append(otherUpgradeCondition);
		result.append(", ElementSoftwareStatus: ");
		result.append(elementSoftwareStatus);
		result.append(')');
		return result.toString();
	}

} //CIM_ElementSoftwareIdentityImpl
