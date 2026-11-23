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

import org.dmtf.cim.CIM_CLPCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM CLP Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPCapabilitiesImpl#getCLPVersions <em>CLP Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPCapabilitiesImpl#getSMMEAddressVersions <em>SMME Address Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CLPCapabilitiesImpl extends CIM_ProtocolServiceCapabilitiesImpl implements CIM_CLPCapabilities {
	/**
	 * The cached value of the '{@link #getCLPVersions() <em>CLP Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLPVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> clpVersions;

	/**
	 * The cached value of the '{@link #getSMMEAddressVersions() <em>SMME Address Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMMEAddressVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> smmeAddressVersions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CLPCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CLPCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCLPVersions() {
		if (clpVersions == null) {
			clpVersions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_CLP_CAPABILITIES__CLP_VERSIONS);
		}
		return clpVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSMMEAddressVersions() {
		if (smmeAddressVersions == null) {
			smmeAddressVersions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_CLP_CAPABILITIES__SMME_ADDRESS_VERSIONS);
		}
		return smmeAddressVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CLP_CAPABILITIES__CLP_VERSIONS:
				return getCLPVersions();
			case CimPackage.CIM_CLP_CAPABILITIES__SMME_ADDRESS_VERSIONS:
				return getSMMEAddressVersions();
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
			case CimPackage.CIM_CLP_CAPABILITIES__CLP_VERSIONS:
				getCLPVersions().clear();
				getCLPVersions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_CLP_CAPABILITIES__SMME_ADDRESS_VERSIONS:
				getSMMEAddressVersions().clear();
				getSMMEAddressVersions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_CLP_CAPABILITIES__CLP_VERSIONS:
				getCLPVersions().clear();
				return;
			case CimPackage.CIM_CLP_CAPABILITIES__SMME_ADDRESS_VERSIONS:
				getSMMEAddressVersions().clear();
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
			case CimPackage.CIM_CLP_CAPABILITIES__CLP_VERSIONS:
				return clpVersions != null && !clpVersions.isEmpty();
			case CimPackage.CIM_CLP_CAPABILITIES__SMME_ADDRESS_VERSIONS:
				return smmeAddressVersions != null && !smmeAddressVersions.isEmpty();
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
		result.append(" (CLPVersions: ");
		result.append(clpVersions);
		result.append(", SMMEAddressVersions: ");
		result.append(smmeAddressVersions);
		result.append(')');
		return result.toString();
	}

} //CIM_CLPCapabilitiesImpl
