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

import org.dmtf.cim.CIM_FCSwitchSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FC Switch Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCSwitchSettingsImpl#getPreferredDomainID <em>Preferred Domain ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCSwitchSettingsImpl#getDomainIDLocked <em>Domain ID Locked</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCSwitchSettingsImpl#getPrincipalPriority <em>Principal Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCSwitchSettingsImpl extends CIM_SettingDataImpl implements CIM_FCSwitchSettings {
	/**
	 * The default value of the '{@link #getPreferredDomainID() <em>Preferred Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredDomainID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PREFERRED_DOMAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredDomainID() <em>Preferred Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredDomainID()
	 * @generated
	 * @ordered
	 */
	protected Integer preferredDomainID = PREFERRED_DOMAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainIDLocked() <em>Domain ID Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainIDLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DOMAIN_ID_LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainIDLocked() <em>Domain ID Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainIDLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean domainIDLocked = DOMAIN_ID_LOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipalPriority() <em>Principal Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRINCIPAL_PRIORITY_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getPrincipalPriority() <em>Principal Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer principalPriority = PRINCIPAL_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCSwitchSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCSwitchSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPreferredDomainID() {
		return preferredDomainID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredDomainID(Integer newPreferredDomainID) {
		Integer oldPreferredDomainID = preferredDomainID;
		preferredDomainID = newPreferredDomainID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_SWITCH_SETTINGS__PREFERRED_DOMAIN_ID, oldPreferredDomainID, preferredDomainID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDomainIDLocked() {
		return domainIDLocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainIDLocked(Boolean newDomainIDLocked) {
		Boolean oldDomainIDLocked = domainIDLocked;
		domainIDLocked = newDomainIDLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_SWITCH_SETTINGS__DOMAIN_ID_LOCKED, oldDomainIDLocked, domainIDLocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrincipalPriority() {
		return principalPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrincipalPriority(Integer newPrincipalPriority) {
		Integer oldPrincipalPriority = principalPriority;
		principalPriority = newPrincipalPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_SWITCH_SETTINGS__PRINCIPAL_PRIORITY, oldPrincipalPriority, principalPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FC_SWITCH_SETTINGS__PREFERRED_DOMAIN_ID:
				return getPreferredDomainID();
			case CimPackage.CIM_FC_SWITCH_SETTINGS__DOMAIN_ID_LOCKED:
				return getDomainIDLocked();
			case CimPackage.CIM_FC_SWITCH_SETTINGS__PRINCIPAL_PRIORITY:
				return getPrincipalPriority();
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
			case CimPackage.CIM_FC_SWITCH_SETTINGS__PREFERRED_DOMAIN_ID:
				setPreferredDomainID((Integer)newValue);
				return;
			case CimPackage.CIM_FC_SWITCH_SETTINGS__DOMAIN_ID_LOCKED:
				setDomainIDLocked((Boolean)newValue);
				return;
			case CimPackage.CIM_FC_SWITCH_SETTINGS__PRINCIPAL_PRIORITY:
				setPrincipalPriority((Integer)newValue);
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
			case CimPackage.CIM_FC_SWITCH_SETTINGS__PREFERRED_DOMAIN_ID:
				setPreferredDomainID(PREFERRED_DOMAIN_ID_EDEFAULT);
				return;
			case CimPackage.CIM_FC_SWITCH_SETTINGS__DOMAIN_ID_LOCKED:
				setDomainIDLocked(DOMAIN_ID_LOCKED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_SWITCH_SETTINGS__PRINCIPAL_PRIORITY:
				setPrincipalPriority(PRINCIPAL_PRIORITY_EDEFAULT);
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
			case CimPackage.CIM_FC_SWITCH_SETTINGS__PREFERRED_DOMAIN_ID:
				return PREFERRED_DOMAIN_ID_EDEFAULT == null ? preferredDomainID != null : !PREFERRED_DOMAIN_ID_EDEFAULT.equals(preferredDomainID);
			case CimPackage.CIM_FC_SWITCH_SETTINGS__DOMAIN_ID_LOCKED:
				return DOMAIN_ID_LOCKED_EDEFAULT == null ? domainIDLocked != null : !DOMAIN_ID_LOCKED_EDEFAULT.equals(domainIDLocked);
			case CimPackage.CIM_FC_SWITCH_SETTINGS__PRINCIPAL_PRIORITY:
				return PRINCIPAL_PRIORITY_EDEFAULT == null ? principalPriority != null : !PRINCIPAL_PRIORITY_EDEFAULT.equals(principalPriority);
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
		result.append(" (PreferredDomainID: ");
		result.append(preferredDomainID);
		result.append(", DomainIDLocked: ");
		result.append(domainIDLocked);
		result.append(", PrincipalPriority: ");
		result.append(principalPriority);
		result.append(')');
		return result.toString();
	}

} //CIM_FCSwitchSettingsImpl
