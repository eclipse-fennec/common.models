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

import org.dmtf.cim.CIM_StorageProtectionSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Protection Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionSettingImpl#getProtectionControlled <em>Protection Controlled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionSettingImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionSettingImpl#getInquiryProtection <em>Inquiry Protection</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionSettingImpl#getDenyAsCopyTarget <em>Deny As Copy Target</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionSettingImpl#getLUNMappingConfigurable <em>LUN Mapping Configurable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionSettingImpl#getProtectionExpirationSpecified <em>Protection Expiration Specified</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionSettingImpl#getRemainingProtectionTime <em>Remaining Protection Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageProtectionSettingImpl extends CIM_SettingDataImpl implements CIM_StorageProtectionSetting {
	/**
	 * The default value of the '{@link #getProtectionControlled() <em>Protection Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionControlled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PROTECTION_CONTROLLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectionControlled() <em>Protection Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionControlled()
	 * @generated
	 * @ordered
	 */
	protected Boolean protectionControlled = PROTECTION_CONTROLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer access = ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInquiryProtection() <em>Inquiry Protection</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInquiryProtection()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> inquiryProtection;

	/**
	 * The default value of the '{@link #getDenyAsCopyTarget() <em>Deny As Copy Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenyAsCopyTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DENY_AS_COPY_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDenyAsCopyTarget() <em>Deny As Copy Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenyAsCopyTarget()
	 * @generated
	 * @ordered
	 */
	protected Boolean denyAsCopyTarget = DENY_AS_COPY_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getLUNMappingConfigurable() <em>LUN Mapping Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLUNMappingConfigurable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LUN_MAPPING_CONFIGURABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLUNMappingConfigurable() <em>LUN Mapping Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLUNMappingConfigurable()
	 * @generated
	 * @ordered
	 */
	protected Boolean lunMappingConfigurable = LUN_MAPPING_CONFIGURABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtectionExpirationSpecified() <em>Protection Expiration Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionExpirationSpecified()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTECTION_EXPIRATION_SPECIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectionExpirationSpecified() <em>Protection Expiration Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionExpirationSpecified()
	 * @generated
	 * @ordered
	 */
	protected Integer protectionExpirationSpecified = PROTECTION_EXPIRATION_SPECIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingProtectionTime() <em>Remaining Protection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingProtectionTime()
	 * @generated
	 * @ordered
	 */
	protected static final String REMAINING_PROTECTION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingProtectionTime() <em>Remaining Protection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingProtectionTime()
	 * @generated
	 * @ordered
	 */
	protected String remainingProtectionTime = REMAINING_PROTECTION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageProtectionSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageProtectionSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getProtectionControlled() {
		return protectionControlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtectionControlled(Boolean newProtectionControlled) {
		Boolean oldProtectionControlled = protectionControlled;
		protectionControlled = newProtectionControlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_CONTROLLED, oldProtectionControlled, protectionControlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccess(Integer newAccess) {
		Integer oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_PROTECTION_SETTING__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getInquiryProtection() {
		if (inquiryProtection == null) {
			inquiryProtection = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_PROTECTION_SETTING__INQUIRY_PROTECTION);
		}
		return inquiryProtection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDenyAsCopyTarget() {
		return denyAsCopyTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDenyAsCopyTarget(Boolean newDenyAsCopyTarget) {
		Boolean oldDenyAsCopyTarget = denyAsCopyTarget;
		denyAsCopyTarget = newDenyAsCopyTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_PROTECTION_SETTING__DENY_AS_COPY_TARGET, oldDenyAsCopyTarget, denyAsCopyTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLUNMappingConfigurable() {
		return lunMappingConfigurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLUNMappingConfigurable(Boolean newLUNMappingConfigurable) {
		Boolean oldLUNMappingConfigurable = lunMappingConfigurable;
		lunMappingConfigurable = newLUNMappingConfigurable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_PROTECTION_SETTING__LUN_MAPPING_CONFIGURABLE, oldLUNMappingConfigurable, lunMappingConfigurable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtectionExpirationSpecified() {
		return protectionExpirationSpecified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtectionExpirationSpecified(Integer newProtectionExpirationSpecified) {
		Integer oldProtectionExpirationSpecified = protectionExpirationSpecified;
		protectionExpirationSpecified = newProtectionExpirationSpecified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_EXPIRATION_SPECIFIED, oldProtectionExpirationSpecified, protectionExpirationSpecified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemainingProtectionTime() {
		return remainingProtectionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingProtectionTime(String newRemainingProtectionTime) {
		String oldRemainingProtectionTime = remainingProtectionTime;
		remainingProtectionTime = newRemainingProtectionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_PROTECTION_SETTING__REMAINING_PROTECTION_TIME, oldRemainingProtectionTime, remainingProtectionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_CONTROLLED:
				return getProtectionControlled();
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__ACCESS:
				return getAccess();
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__INQUIRY_PROTECTION:
				return getInquiryProtection();
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__DENY_AS_COPY_TARGET:
				return getDenyAsCopyTarget();
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__LUN_MAPPING_CONFIGURABLE:
				return getLUNMappingConfigurable();
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_EXPIRATION_SPECIFIED:
				return getProtectionExpirationSpecified();
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__REMAINING_PROTECTION_TIME:
				return getRemainingProtectionTime();
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
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_CONTROLLED:
				setProtectionControlled((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__ACCESS:
				setAccess((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__INQUIRY_PROTECTION:
				getInquiryProtection().clear();
				getInquiryProtection().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__DENY_AS_COPY_TARGET:
				setDenyAsCopyTarget((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__LUN_MAPPING_CONFIGURABLE:
				setLUNMappingConfigurable((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_EXPIRATION_SPECIFIED:
				setProtectionExpirationSpecified((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__REMAINING_PROTECTION_TIME:
				setRemainingProtectionTime((String)newValue);
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
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_CONTROLLED:
				setProtectionControlled(PROTECTION_CONTROLLED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__INQUIRY_PROTECTION:
				getInquiryProtection().clear();
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__DENY_AS_COPY_TARGET:
				setDenyAsCopyTarget(DENY_AS_COPY_TARGET_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__LUN_MAPPING_CONFIGURABLE:
				setLUNMappingConfigurable(LUN_MAPPING_CONFIGURABLE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_EXPIRATION_SPECIFIED:
				setProtectionExpirationSpecified(PROTECTION_EXPIRATION_SPECIFIED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__REMAINING_PROTECTION_TIME:
				setRemainingProtectionTime(REMAINING_PROTECTION_TIME_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_CONTROLLED:
				return PROTECTION_CONTROLLED_EDEFAULT == null ? protectionControlled != null : !PROTECTION_CONTROLLED_EDEFAULT.equals(protectionControlled);
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__INQUIRY_PROTECTION:
				return inquiryProtection != null && !inquiryProtection.isEmpty();
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__DENY_AS_COPY_TARGET:
				return DENY_AS_COPY_TARGET_EDEFAULT == null ? denyAsCopyTarget != null : !DENY_AS_COPY_TARGET_EDEFAULT.equals(denyAsCopyTarget);
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__LUN_MAPPING_CONFIGURABLE:
				return LUN_MAPPING_CONFIGURABLE_EDEFAULT == null ? lunMappingConfigurable != null : !LUN_MAPPING_CONFIGURABLE_EDEFAULT.equals(lunMappingConfigurable);
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__PROTECTION_EXPIRATION_SPECIFIED:
				return PROTECTION_EXPIRATION_SPECIFIED_EDEFAULT == null ? protectionExpirationSpecified != null : !PROTECTION_EXPIRATION_SPECIFIED_EDEFAULT.equals(protectionExpirationSpecified);
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING__REMAINING_PROTECTION_TIME:
				return REMAINING_PROTECTION_TIME_EDEFAULT == null ? remainingProtectionTime != null : !REMAINING_PROTECTION_TIME_EDEFAULT.equals(remainingProtectionTime);
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
		result.append(" (ProtectionControlled: ");
		result.append(protectionControlled);
		result.append(", Access: ");
		result.append(access);
		result.append(", InquiryProtection: ");
		result.append(inquiryProtection);
		result.append(", DenyAsCopyTarget: ");
		result.append(denyAsCopyTarget);
		result.append(", LUNMappingConfigurable: ");
		result.append(lunMappingConfigurable);
		result.append(", ProtectionExpirationSpecified: ");
		result.append(protectionExpirationSpecified);
		result.append(", RemainingProtectionTime: ");
		result.append(remainingProtectionTime);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageProtectionSettingImpl
