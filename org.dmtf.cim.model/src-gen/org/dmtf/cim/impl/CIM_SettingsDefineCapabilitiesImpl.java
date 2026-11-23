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

import org.dmtf.cim.CIM_SettingsDefineCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Settings Define Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingsDefineCapabilitiesImpl#getPropertyPolicy <em>Property Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingsDefineCapabilitiesImpl#getValueRole <em>Value Role</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingsDefineCapabilitiesImpl#getValueRange <em>Value Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SettingsDefineCapabilitiesImpl extends CIM_ComponentImpl implements CIM_SettingsDefineCapabilities {
	/**
	 * The default value of the '{@link #getPropertyPolicy() <em>Property Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROPERTY_POLICY_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getPropertyPolicy() <em>Property Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer propertyPolicy = PROPERTY_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueRole() <em>Value Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRole()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_ROLE_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getValueRole() <em>Value Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRole()
	 * @generated
	 * @ordered
	 */
	protected Integer valueRole = VALUE_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueRange() <em>Value Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRange()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_RANGE_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getValueRange() <em>Value Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRange()
	 * @generated
	 * @ordered
	 */
	protected Integer valueRange = VALUE_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SettingsDefineCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SettingsDefineCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPropertyPolicy() {
		return propertyPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyPolicy(Integer newPropertyPolicy) {
		Integer oldPropertyPolicy = propertyPolicy;
		propertyPolicy = newPropertyPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__PROPERTY_POLICY, oldPropertyPolicy, propertyPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getValueRole() {
		return valueRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueRole(Integer newValueRole) {
		Integer oldValueRole = valueRole;
		valueRole = newValueRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_ROLE, oldValueRole, valueRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getValueRange() {
		return valueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueRange(Integer newValueRange) {
		Integer oldValueRange = valueRange;
		valueRange = newValueRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_RANGE, oldValueRange, valueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__PROPERTY_POLICY:
				return getPropertyPolicy();
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_ROLE:
				return getValueRole();
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_RANGE:
				return getValueRange();
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
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__PROPERTY_POLICY:
				setPropertyPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_ROLE:
				setValueRole((Integer)newValue);
				return;
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_RANGE:
				setValueRange((Integer)newValue);
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
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__PROPERTY_POLICY:
				setPropertyPolicy(PROPERTY_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_ROLE:
				setValueRole(VALUE_ROLE_EDEFAULT);
				return;
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_RANGE:
				setValueRange(VALUE_RANGE_EDEFAULT);
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
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__PROPERTY_POLICY:
				return PROPERTY_POLICY_EDEFAULT == null ? propertyPolicy != null : !PROPERTY_POLICY_EDEFAULT.equals(propertyPolicy);
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_ROLE:
				return VALUE_ROLE_EDEFAULT == null ? valueRole != null : !VALUE_ROLE_EDEFAULT.equals(valueRole);
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES__VALUE_RANGE:
				return VALUE_RANGE_EDEFAULT == null ? valueRange != null : !VALUE_RANGE_EDEFAULT.equals(valueRange);
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
		result.append(" (PropertyPolicy: ");
		result.append(propertyPolicy);
		result.append(", ValueRole: ");
		result.append(valueRole);
		result.append(", ValueRange: ");
		result.append(valueRange);
		result.append(')');
		return result.toString();
	}

} //CIM_SettingsDefineCapabilitiesImpl
