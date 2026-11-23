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

import org.dmtf.cim.CIM_ArchitectureCheck;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Architecture Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ArchitectureCheckImpl#getArchitectureType <em>Architecture Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ArchitectureCheckImpl extends CIM_CheckImpl implements CIM_ArchitectureCheck {
	/**
	 * The default value of the '{@link #getArchitectureType() <em>Architecture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ARCHITECTURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitectureType() <em>Architecture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureType()
	 * @generated
	 * @ordered
	 */
	protected Integer architectureType = ARCHITECTURE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ArchitectureCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ArchitectureCheck();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getArchitectureType() {
		return architectureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchitectureType(Integer newArchitectureType) {
		Integer oldArchitectureType = architectureType;
		architectureType = newArchitectureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ARCHITECTURE_CHECK__ARCHITECTURE_TYPE, oldArchitectureType, architectureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ARCHITECTURE_CHECK__ARCHITECTURE_TYPE:
				return getArchitectureType();
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
			case CimPackage.CIM_ARCHITECTURE_CHECK__ARCHITECTURE_TYPE:
				setArchitectureType((Integer)newValue);
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
			case CimPackage.CIM_ARCHITECTURE_CHECK__ARCHITECTURE_TYPE:
				setArchitectureType(ARCHITECTURE_TYPE_EDEFAULT);
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
			case CimPackage.CIM_ARCHITECTURE_CHECK__ARCHITECTURE_TYPE:
				return ARCHITECTURE_TYPE_EDEFAULT == null ? architectureType != null : !ARCHITECTURE_TYPE_EDEFAULT.equals(architectureType);
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
		result.append(" (ArchitectureType: ");
		result.append(architectureType);
		result.append(')');
		return result.toString();
	}

} //CIM_ArchitectureCheckImpl
