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

import org.dmtf.cim.CIM_StorageProcessorAffinity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Processor Affinity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProcessorAffinityImpl#getIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProcessorAffinityImpl#getIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageProcessorAffinityImpl extends CIM_DependencyImpl implements CIM_StorageProcessorAffinity {
	/**
	 * The default value of the '{@link #getIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PRIMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPrimary = IS_PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageProcessorAffinityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageProcessorAffinity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsPrimary() {
		return isPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPrimary(Boolean newIsPrimary) {
		Boolean oldIsPrimary = isPrimary;
		isPrimary = newIsPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_PRIMARY, oldIsPrimary, isPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(Boolean newIsActive) {
		Boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_PRIMARY:
				return getIsPrimary();
			case CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_ACTIVE:
				return getIsActive();
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
			case CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_PRIMARY:
				setIsPrimary((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_ACTIVE:
				setIsActive((Boolean)newValue);
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
			case CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_PRIMARY:
				setIsPrimary(IS_PRIMARY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_PRIMARY:
				return IS_PRIMARY_EDEFAULT == null ? isPrimary != null : !IS_PRIMARY_EDEFAULT.equals(isPrimary);
			case CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY__IS_ACTIVE:
				return IS_ACTIVE_EDEFAULT == null ? isActive != null : !IS_ACTIVE_EDEFAULT.equals(isActive);
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
		result.append(" (IsPrimary: ");
		result.append(isPrimary);
		result.append(", IsActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageProcessorAffinityImpl
