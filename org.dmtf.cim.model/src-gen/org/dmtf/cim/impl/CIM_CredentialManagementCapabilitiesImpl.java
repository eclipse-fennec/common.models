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

import org.dmtf.cim.CIM_CredentialManagementCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Credential Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CredentialManagementCapabilitiesImpl#getSupportedMethods <em>Supported Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CredentialManagementCapabilitiesImpl#getCumulativePrivilegeMethodology <em>Cumulative Privilege Methodology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CredentialManagementCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_CredentialManagementCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedMethods() <em>Supported Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedMethods;

	/**
	 * The default value of the '{@link #getCumulativePrivilegeMethodology() <em>Cumulative Privilege Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulativePrivilegeMethodology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CUMULATIVE_PRIVILEGE_METHODOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCumulativePrivilegeMethodology() <em>Cumulative Privilege Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulativePrivilegeMethodology()
	 * @generated
	 * @ordered
	 */
	protected Integer cumulativePrivilegeMethodology = CUMULATIVE_PRIVILEGE_METHODOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CredentialManagementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CredentialManagementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedMethods() {
		if (supportedMethods == null) {
			supportedMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS);
		}
		return supportedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCumulativePrivilegeMethodology() {
		return cumulativePrivilegeMethodology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCumulativePrivilegeMethodology(Integer newCumulativePrivilegeMethodology) {
		Integer oldCumulativePrivilegeMethodology = cumulativePrivilegeMethodology;
		cumulativePrivilegeMethodology = newCumulativePrivilegeMethodology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__CUMULATIVE_PRIVILEGE_METHODOLOGY, oldCumulativePrivilegeMethodology, cumulativePrivilegeMethodology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				return getSupportedMethods();
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__CUMULATIVE_PRIVILEGE_METHODOLOGY:
				return getCumulativePrivilegeMethodology();
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
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
				getSupportedMethods().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__CUMULATIVE_PRIVILEGE_METHODOLOGY:
				setCumulativePrivilegeMethodology((Integer)newValue);
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
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
				return;
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__CUMULATIVE_PRIVILEGE_METHODOLOGY:
				setCumulativePrivilegeMethodology(CUMULATIVE_PRIVILEGE_METHODOLOGY_EDEFAULT);
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
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				return supportedMethods != null && !supportedMethods.isEmpty();
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES__CUMULATIVE_PRIVILEGE_METHODOLOGY:
				return CUMULATIVE_PRIVILEGE_METHODOLOGY_EDEFAULT == null ? cumulativePrivilegeMethodology != null : !CUMULATIVE_PRIVILEGE_METHODOLOGY_EDEFAULT.equals(cumulativePrivilegeMethodology);
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
		result.append(" (SupportedMethods: ");
		result.append(supportedMethods);
		result.append(", CumulativePrivilegeMethodology: ");
		result.append(cumulativePrivilegeMethodology);
		result.append(')');
		return result.toString();
	}

} //CIM_CredentialManagementCapabilitiesImpl
