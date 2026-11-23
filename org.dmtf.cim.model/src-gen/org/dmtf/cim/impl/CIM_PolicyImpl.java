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

import org.dmtf.cim.CIM_Policy;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyImpl#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyImpl#getPolicyKeywords <em>Policy Keywords</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_PolicyImpl extends CIM_ManagedElementImpl implements CIM_Policy {
	/**
	 * The default value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
	protected String commonName = COMMON_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPolicyKeywords() <em>Policy Keywords</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> policyKeywords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Policy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommonName() {
		return commonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommonName(String newCommonName) {
		String oldCommonName = commonName;
		commonName = newCommonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY__COMMON_NAME, oldCommonName, commonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPolicyKeywords() {
		if (policyKeywords == null) {
			policyKeywords = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_POLICY__POLICY_KEYWORDS);
		}
		return policyKeywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POLICY__COMMON_NAME:
				return getCommonName();
			case CimPackage.CIM_POLICY__POLICY_KEYWORDS:
				return getPolicyKeywords();
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
			case CimPackage.CIM_POLICY__COMMON_NAME:
				setCommonName((String)newValue);
				return;
			case CimPackage.CIM_POLICY__POLICY_KEYWORDS:
				getPolicyKeywords().clear();
				getPolicyKeywords().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_POLICY__COMMON_NAME:
				setCommonName(COMMON_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY__POLICY_KEYWORDS:
				getPolicyKeywords().clear();
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
			case CimPackage.CIM_POLICY__COMMON_NAME:
				return COMMON_NAME_EDEFAULT == null ? commonName != null : !COMMON_NAME_EDEFAULT.equals(commonName);
			case CimPackage.CIM_POLICY__POLICY_KEYWORDS:
				return policyKeywords != null && !policyKeywords.isEmpty();
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
		result.append(" (CommonName: ");
		result.append(commonName);
		result.append(", PolicyKeywords: ");
		result.append(policyKeywords);
		result.append(')');
		return result.toString();
	}

} //CIM_PolicyImpl
