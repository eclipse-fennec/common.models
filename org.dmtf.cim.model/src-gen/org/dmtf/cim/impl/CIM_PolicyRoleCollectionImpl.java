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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_PolicyRoleCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Policy Role Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRoleCollectionImpl#getPolicyRole <em>Policy Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PolicyRoleCollectionImpl extends CIM_SystemSpecificCollectionImpl implements CIM_PolicyRoleCollection {
	/**
	 * The default value of the '{@link #getPolicyRole() <em>Policy Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRole()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyRole() <em>Policy Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRole()
	 * @generated
	 * @ordered
	 */
	protected String policyRole = POLICY_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PolicyRoleCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PolicyRoleCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyRole() {
		return policyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyRole(String newPolicyRole) {
		String oldPolicyRole = policyRole;
		policyRole = newPolicyRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_ROLE_COLLECTION__POLICY_ROLE, oldPolicyRole, policyRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ActivatePolicySet(CIM_ManagedElement Element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long DeactivatePolicySet(CIM_ManagedElement Element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POLICY_ROLE_COLLECTION__POLICY_ROLE:
				return getPolicyRole();
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
			case CimPackage.CIM_POLICY_ROLE_COLLECTION__POLICY_ROLE:
				setPolicyRole((String)newValue);
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
			case CimPackage.CIM_POLICY_ROLE_COLLECTION__POLICY_ROLE:
				setPolicyRole(POLICY_ROLE_EDEFAULT);
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
			case CimPackage.CIM_POLICY_ROLE_COLLECTION__POLICY_ROLE:
				return POLICY_ROLE_EDEFAULT == null ? policyRole != null : !POLICY_ROLE_EDEFAULT.equals(policyRole);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_POLICY_ROLE_COLLECTION___ACTIVATE_POLICY_SET__CIM_MANAGEDELEMENT:
				return ActivatePolicySet((CIM_ManagedElement)arguments.get(0));
			case CimPackage.CIM_POLICY_ROLE_COLLECTION___DEACTIVATE_POLICY_SET__CIM_MANAGEDELEMENT:
				return DeactivatePolicySet((CIM_ManagedElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (PolicyRole: ");
		result.append(policyRole);
		result.append(')');
		return result.toString();
	}

} //CIM_PolicyRoleCollectionImpl
