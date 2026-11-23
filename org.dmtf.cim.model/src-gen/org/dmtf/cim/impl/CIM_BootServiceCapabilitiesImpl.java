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

import org.dmtf.cim.CIM_BootServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Boot Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BootServiceCapabilitiesImpl#getBootConfigCapabilities <em>Boot Config Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BootServiceCapabilitiesImpl#getOtherBootConfigCapabilities <em>Other Boot Config Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BootServiceCapabilitiesImpl#getBootStringsSupported <em>Boot Strings Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BootServiceCapabilitiesImpl#getBootCapabilitiesSupported <em>Boot Capabilities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BootServiceCapabilitiesImpl#getOtherBootCapabilitiesSupported <em>Other Boot Capabilities Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BootServiceCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_BootServiceCapabilities {
	/**
	 * The cached value of the '{@link #getBootConfigCapabilities() <em>Boot Config Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootConfigCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> bootConfigCapabilities;

	/**
	 * The cached value of the '{@link #getOtherBootConfigCapabilities() <em>Other Boot Config Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherBootConfigCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherBootConfigCapabilities;

	/**
	 * The cached value of the '{@link #getBootStringsSupported() <em>Boot Strings Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootStringsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> bootStringsSupported;

	/**
	 * The cached value of the '{@link #getBootCapabilitiesSupported() <em>Boot Capabilities Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootCapabilitiesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> bootCapabilitiesSupported;

	/**
	 * The cached value of the '{@link #getOtherBootCapabilitiesSupported() <em>Other Boot Capabilities Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherBootCapabilitiesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherBootCapabilitiesSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BootServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BootServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getBootConfigCapabilities() {
		if (bootConfigCapabilities == null) {
			bootConfigCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CONFIG_CAPABILITIES);
		}
		return bootConfigCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherBootConfigCapabilities() {
		if (otherBootConfigCapabilities == null) {
			otherBootConfigCapabilities = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CONFIG_CAPABILITIES);
		}
		return otherBootConfigCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getBootStringsSupported() {
		if (bootStringsSupported == null) {
			bootStringsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_STRINGS_SUPPORTED);
		}
		return bootStringsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getBootCapabilitiesSupported() {
		if (bootCapabilitiesSupported == null) {
			bootCapabilitiesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CAPABILITIES_SUPPORTED);
		}
		return bootCapabilitiesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherBootCapabilitiesSupported() {
		if (otherBootCapabilitiesSupported == null) {
			otherBootCapabilitiesSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CAPABILITIES_SUPPORTED);
		}
		return otherBootCapabilitiesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CONFIG_CAPABILITIES:
				return getBootConfigCapabilities();
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CONFIG_CAPABILITIES:
				return getOtherBootConfigCapabilities();
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_STRINGS_SUPPORTED:
				return getBootStringsSupported();
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CAPABILITIES_SUPPORTED:
				return getBootCapabilitiesSupported();
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CAPABILITIES_SUPPORTED:
				return getOtherBootCapabilitiesSupported();
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
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CONFIG_CAPABILITIES:
				getBootConfigCapabilities().clear();
				getBootConfigCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CONFIG_CAPABILITIES:
				getOtherBootConfigCapabilities().clear();
				getOtherBootConfigCapabilities().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_STRINGS_SUPPORTED:
				getBootStringsSupported().clear();
				getBootStringsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CAPABILITIES_SUPPORTED:
				getBootCapabilitiesSupported().clear();
				getBootCapabilitiesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CAPABILITIES_SUPPORTED:
				getOtherBootCapabilitiesSupported().clear();
				getOtherBootCapabilitiesSupported().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CONFIG_CAPABILITIES:
				getBootConfigCapabilities().clear();
				return;
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CONFIG_CAPABILITIES:
				getOtherBootConfigCapabilities().clear();
				return;
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_STRINGS_SUPPORTED:
				getBootStringsSupported().clear();
				return;
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CAPABILITIES_SUPPORTED:
				getBootCapabilitiesSupported().clear();
				return;
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CAPABILITIES_SUPPORTED:
				getOtherBootCapabilitiesSupported().clear();
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
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CONFIG_CAPABILITIES:
				return bootConfigCapabilities != null && !bootConfigCapabilities.isEmpty();
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CONFIG_CAPABILITIES:
				return otherBootConfigCapabilities != null && !otherBootConfigCapabilities.isEmpty();
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_STRINGS_SUPPORTED:
				return bootStringsSupported != null && !bootStringsSupported.isEmpty();
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__BOOT_CAPABILITIES_SUPPORTED:
				return bootCapabilitiesSupported != null && !bootCapabilitiesSupported.isEmpty();
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES__OTHER_BOOT_CAPABILITIES_SUPPORTED:
				return otherBootCapabilitiesSupported != null && !otherBootCapabilitiesSupported.isEmpty();
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
		result.append(" (BootConfigCapabilities: ");
		result.append(bootConfigCapabilities);
		result.append(", OtherBootConfigCapabilities: ");
		result.append(otherBootConfigCapabilities);
		result.append(", BootStringsSupported: ");
		result.append(bootStringsSupported);
		result.append(", BootCapabilitiesSupported: ");
		result.append(bootCapabilitiesSupported);
		result.append(", OtherBootCapabilitiesSupported: ");
		result.append(otherBootCapabilitiesSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_BootServiceCapabilitiesImpl
