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

import org.dmtf.cim.CIM_BIOSAttribute;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BIOS Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSAttributeImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSAttributeImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSAttributeImpl#getPendingValue <em>Pending Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSAttributeImpl#getIsOrderedList <em>Is Ordered List</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSAttributeImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BIOSAttributeImpl extends CIM_ManagedElementImpl implements CIM_BIOSAttribute {
	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> currentValue;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> defaultValue;

	/**
	 * The cached value of the '{@link #getPendingValue() <em>Pending Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> pendingValue;

	/**
	 * The default value of the '{@link #getIsOrderedList() <em>Is Ordered List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrderedList()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOrderedList() <em>Is Ordered List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrderedList()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOrderedList = IS_ORDERED_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BIOSAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BIOSAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_ATTRIBUTE__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCurrentValue() {
		if (currentValue == null) {
			currentValue = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BIOS_ATTRIBUTE__CURRENT_VALUE);
		}
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDefaultValue() {
		if (defaultValue == null) {
			defaultValue = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BIOS_ATTRIBUTE__DEFAULT_VALUE);
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPendingValue() {
		if (pendingValue == null) {
			pendingValue = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BIOS_ATTRIBUTE__PENDING_VALUE);
		}
		return pendingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsOrderedList() {
		return isOrderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOrderedList(Boolean newIsOrderedList) {
		Boolean oldIsOrderedList = isOrderedList;
		isOrderedList = newIsOrderedList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_ATTRIBUTE__IS_ORDERED_LIST, oldIsOrderedList, isOrderedList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReadOnly(Boolean newIsReadOnly) {
		Boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_ATTRIBUTE__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BIOS_ATTRIBUTE__ATTRIBUTE_NAME:
				return getAttributeName();
			case CimPackage.CIM_BIOS_ATTRIBUTE__CURRENT_VALUE:
				return getCurrentValue();
			case CimPackage.CIM_BIOS_ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case CimPackage.CIM_BIOS_ATTRIBUTE__PENDING_VALUE:
				return getPendingValue();
			case CimPackage.CIM_BIOS_ATTRIBUTE__IS_ORDERED_LIST:
				return getIsOrderedList();
			case CimPackage.CIM_BIOS_ATTRIBUTE__IS_READ_ONLY:
				return getIsReadOnly();
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
			case CimPackage.CIM_BIOS_ATTRIBUTE__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__CURRENT_VALUE:
				getCurrentValue().clear();
				getCurrentValue().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__DEFAULT_VALUE:
				getDefaultValue().clear();
				getDefaultValue().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__PENDING_VALUE:
				getPendingValue().clear();
				getPendingValue().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__IS_ORDERED_LIST:
				setIsOrderedList((Boolean)newValue);
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
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
			case CimPackage.CIM_BIOS_ATTRIBUTE__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__CURRENT_VALUE:
				getCurrentValue().clear();
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__DEFAULT_VALUE:
				getDefaultValue().clear();
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__PENDING_VALUE:
				getPendingValue().clear();
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__IS_ORDERED_LIST:
				setIsOrderedList(IS_ORDERED_LIST_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_ATTRIBUTE__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
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
			case CimPackage.CIM_BIOS_ATTRIBUTE__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case CimPackage.CIM_BIOS_ATTRIBUTE__CURRENT_VALUE:
				return currentValue != null && !currentValue.isEmpty();
			case CimPackage.CIM_BIOS_ATTRIBUTE__DEFAULT_VALUE:
				return defaultValue != null && !defaultValue.isEmpty();
			case CimPackage.CIM_BIOS_ATTRIBUTE__PENDING_VALUE:
				return pendingValue != null && !pendingValue.isEmpty();
			case CimPackage.CIM_BIOS_ATTRIBUTE__IS_ORDERED_LIST:
				return IS_ORDERED_LIST_EDEFAULT == null ? isOrderedList != null : !IS_ORDERED_LIST_EDEFAULT.equals(isOrderedList);
			case CimPackage.CIM_BIOS_ATTRIBUTE__IS_READ_ONLY:
				return IS_READ_ONLY_EDEFAULT == null ? isReadOnly != null : !IS_READ_ONLY_EDEFAULT.equals(isReadOnly);
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
		result.append(" (AttributeName: ");
		result.append(attributeName);
		result.append(", CurrentValue: ");
		result.append(currentValue);
		result.append(", DefaultValue: ");
		result.append(defaultValue);
		result.append(", PendingValue: ");
		result.append(pendingValue);
		result.append(", IsOrderedList: ");
		result.append(isOrderedList);
		result.append(", IsReadOnly: ");
		result.append(isReadOnly);
		result.append(')');
		return result.toString();
	}

} //CIM_BIOSAttributeImpl
