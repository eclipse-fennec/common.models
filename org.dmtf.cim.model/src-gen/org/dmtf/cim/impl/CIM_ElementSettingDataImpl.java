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

import org.dmtf.cim.CIM_ElementSettingData;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_SettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Element Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSettingDataImpl#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSettingDataImpl#getSettingData <em>Setting Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSettingDataImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSettingDataImpl#getIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSettingDataImpl#getIsNext <em>Is Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ElementSettingDataImpl extends MinimalEObjectImpl.Container implements CIM_ElementSettingData {
	/**
	 * The cached value of the '{@link #getManagedElement() <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement managedElement;

	/**
	 * The cached value of the '{@link #getSettingData() <em>Setting Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingData()
	 * @generated
	 * @ordered
	 */
	protected CIM_SettingData settingData;

	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IS_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsCurrent() <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IS_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCurrent() <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCurrent()
	 * @generated
	 * @ordered
	 */
	protected Integer isCurrent = IS_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNext() <em>Is Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNext()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IS_NEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNext() <em>Is Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNext()
	 * @generated
	 * @ordered
	 */
	protected Integer isNext = IS_NEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ElementSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ElementSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getManagedElement() {
		if (managedElement != null && managedElement.eIsProxy()) {
			InternalEObject oldManagedElement = (InternalEObject)managedElement;
			managedElement = (CIM_ManagedElement)eResolveProxy(oldManagedElement);
			if (managedElement != oldManagedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_SETTING_DATA__MANAGED_ELEMENT, oldManagedElement, managedElement));
			}
		}
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetManagedElement() {
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagedElement(CIM_ManagedElement newManagedElement) {
		CIM_ManagedElement oldManagedElement = managedElement;
		managedElement = newManagedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_SETTING_DATA__MANAGED_ELEMENT, oldManagedElement, managedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SettingData getSettingData() {
		if (settingData != null && settingData.eIsProxy()) {
			InternalEObject oldSettingData = (InternalEObject)settingData;
			settingData = (CIM_SettingData)eResolveProxy(oldSettingData);
			if (settingData != oldSettingData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_SETTING_DATA__SETTING_DATA, oldSettingData, settingData));
			}
		}
		return settingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_SettingData basicGetSettingData() {
		return settingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSettingData(CIM_SettingData newSettingData) {
		CIM_SettingData oldSettingData = settingData;
		settingData = newSettingData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_SETTING_DATA__SETTING_DATA, oldSettingData, settingData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(Integer newIsDefault) {
		Integer oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_SETTING_DATA__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIsCurrent() {
		return isCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCurrent(Integer newIsCurrent) {
		Integer oldIsCurrent = isCurrent;
		isCurrent = newIsCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_SETTING_DATA__IS_CURRENT, oldIsCurrent, isCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIsNext() {
		return isNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNext(Integer newIsNext) {
		Integer oldIsNext = isNext;
		isNext = newIsNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_SETTING_DATA__IS_NEXT, oldIsNext, isNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ELEMENT_SETTING_DATA__MANAGED_ELEMENT:
				if (resolve) return getManagedElement();
				return basicGetManagedElement();
			case CimPackage.CIM_ELEMENT_SETTING_DATA__SETTING_DATA:
				if (resolve) return getSettingData();
				return basicGetSettingData();
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_DEFAULT:
				return getIsDefault();
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_CURRENT:
				return getIsCurrent();
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_NEXT:
				return getIsNext();
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
			case CimPackage.CIM_ELEMENT_SETTING_DATA__MANAGED_ELEMENT:
				setManagedElement((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__SETTING_DATA:
				setSettingData((CIM_SettingData)newValue);
				return;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_DEFAULT:
				setIsDefault((Integer)newValue);
				return;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_CURRENT:
				setIsCurrent((Integer)newValue);
				return;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_NEXT:
				setIsNext((Integer)newValue);
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
			case CimPackage.CIM_ELEMENT_SETTING_DATA__MANAGED_ELEMENT:
				setManagedElement((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__SETTING_DATA:
				setSettingData((CIM_SettingData)null);
				return;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_CURRENT:
				setIsCurrent(IS_CURRENT_EDEFAULT);
				return;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_NEXT:
				setIsNext(IS_NEXT_EDEFAULT);
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
			case CimPackage.CIM_ELEMENT_SETTING_DATA__MANAGED_ELEMENT:
				return managedElement != null;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__SETTING_DATA:
				return settingData != null;
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_DEFAULT:
				return IS_DEFAULT_EDEFAULT == null ? isDefault != null : !IS_DEFAULT_EDEFAULT.equals(isDefault);
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_CURRENT:
				return IS_CURRENT_EDEFAULT == null ? isCurrent != null : !IS_CURRENT_EDEFAULT.equals(isCurrent);
			case CimPackage.CIM_ELEMENT_SETTING_DATA__IS_NEXT:
				return IS_NEXT_EDEFAULT == null ? isNext != null : !IS_NEXT_EDEFAULT.equals(isNext);
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
		result.append(" (IsDefault: ");
		result.append(isDefault);
		result.append(", IsCurrent: ");
		result.append(isCurrent);
		result.append(", IsNext: ");
		result.append(isNext);
		result.append(')');
		return result.toString();
	}

} //CIM_ElementSettingDataImpl
