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

import org.dmtf.cim.CIM_LocalizationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Localization Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocalizationCapabilitiesImpl#getSupportedInputLocales <em>Supported Input Locales</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocalizationCapabilitiesImpl#getSupportedOutputLocales <em>Supported Output Locales</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LocalizationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_LocalizationCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedInputLocales() <em>Supported Input Locales</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedInputLocales()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedInputLocales;

	/**
	 * The cached value of the '{@link #getSupportedOutputLocales() <em>Supported Output Locales</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedOutputLocales()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedOutputLocales;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LocalizationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LocalizationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedInputLocales() {
		if (supportedInputLocales == null) {
			supportedInputLocales = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_INPUT_LOCALES);
		}
		return supportedInputLocales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedOutputLocales() {
		if (supportedOutputLocales == null) {
			supportedOutputLocales = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_OUTPUT_LOCALES);
		}
		return supportedOutputLocales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_INPUT_LOCALES:
				return getSupportedInputLocales();
			case CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_OUTPUT_LOCALES:
				return getSupportedOutputLocales();
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
			case CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_INPUT_LOCALES:
				getSupportedInputLocales().clear();
				getSupportedInputLocales().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_OUTPUT_LOCALES:
				getSupportedOutputLocales().clear();
				getSupportedOutputLocales().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_INPUT_LOCALES:
				getSupportedInputLocales().clear();
				return;
			case CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_OUTPUT_LOCALES:
				getSupportedOutputLocales().clear();
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
			case CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_INPUT_LOCALES:
				return supportedInputLocales != null && !supportedInputLocales.isEmpty();
			case CimPackage.CIM_LOCALIZATION_CAPABILITIES__SUPPORTED_OUTPUT_LOCALES:
				return supportedOutputLocales != null && !supportedOutputLocales.isEmpty();
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
		result.append(" (SupportedInputLocales: ");
		result.append(supportedInputLocales);
		result.append(", SupportedOutputLocales: ");
		result.append(supportedOutputLocales);
		result.append(')');
		return result.toString();
	}

} //CIM_LocalizationCapabilitiesImpl
