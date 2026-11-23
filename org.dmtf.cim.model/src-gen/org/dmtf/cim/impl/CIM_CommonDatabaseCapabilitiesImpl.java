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

import org.dmtf.cim.CIM_CommonDatabaseCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Common Database Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CommonDatabaseCapabilitiesImpl#getRecoverabilityOptions <em>Recoverability Options</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CommonDatabaseCapabilitiesImpl#getOtherRecoverabilityOptions <em>Other Recoverability Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CommonDatabaseCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_CommonDatabaseCapabilities {
	/**
	 * The cached value of the '{@link #getRecoverabilityOptions() <em>Recoverability Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoverabilityOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> recoverabilityOptions;

	/**
	 * The cached value of the '{@link #getOtherRecoverabilityOptions() <em>Other Recoverability Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecoverabilityOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherRecoverabilityOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CommonDatabaseCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CommonDatabaseCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRecoverabilityOptions() {
		if (recoverabilityOptions == null) {
			recoverabilityOptions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__RECOVERABILITY_OPTIONS);
		}
		return recoverabilityOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherRecoverabilityOptions() {
		if (otherRecoverabilityOptions == null) {
			otherRecoverabilityOptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__OTHER_RECOVERABILITY_OPTIONS);
		}
		return otherRecoverabilityOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__RECOVERABILITY_OPTIONS:
				return getRecoverabilityOptions();
			case CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__OTHER_RECOVERABILITY_OPTIONS:
				return getOtherRecoverabilityOptions();
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
			case CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__RECOVERABILITY_OPTIONS:
				getRecoverabilityOptions().clear();
				getRecoverabilityOptions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__OTHER_RECOVERABILITY_OPTIONS:
				getOtherRecoverabilityOptions().clear();
				getOtherRecoverabilityOptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__RECOVERABILITY_OPTIONS:
				getRecoverabilityOptions().clear();
				return;
			case CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__OTHER_RECOVERABILITY_OPTIONS:
				getOtherRecoverabilityOptions().clear();
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
			case CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__RECOVERABILITY_OPTIONS:
				return recoverabilityOptions != null && !recoverabilityOptions.isEmpty();
			case CimPackage.CIM_COMMON_DATABASE_CAPABILITIES__OTHER_RECOVERABILITY_OPTIONS:
				return otherRecoverabilityOptions != null && !otherRecoverabilityOptions.isEmpty();
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
		result.append(" (RecoverabilityOptions: ");
		result.append(recoverabilityOptions);
		result.append(", OtherRecoverabilityOptions: ");
		result.append(otherRecoverabilityOptions);
		result.append(')');
		return result.toString();
	}

} //CIM_CommonDatabaseCapabilitiesImpl
