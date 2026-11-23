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

import org.dmtf.cim.CIM_VendorPolicyCondition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Vendor Policy Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VendorPolicyConditionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VendorPolicyConditionImpl#getConstraintEncoding <em>Constraint Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VendorPolicyConditionImpl extends CIM_PolicyConditionImpl implements CIM_VendorPolicyCondition {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraint;

	/**
	 * The default value of the '{@link #getConstraintEncoding() <em>Constraint Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintEncoding() <em>Constraint Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintEncoding()
	 * @generated
	 * @ordered
	 */
	protected String constraintEncoding = CONSTRAINT_ENCODING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VendorPolicyConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VendorPolicyCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConstraint() {
		if (constraint == null) {
			constraint = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintEncoding() {
		return constraintEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintEncoding(String newConstraintEncoding) {
		String oldConstraintEncoding = constraintEncoding;
		constraintEncoding = newConstraintEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT_ENCODING, oldConstraintEncoding, constraintEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT:
				return getConstraint();
			case CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT_ENCODING:
				return getConstraintEncoding();
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
			case CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT_ENCODING:
				setConstraintEncoding((String)newValue);
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
			case CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT:
				getConstraint().clear();
				return;
			case CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT_ENCODING:
				setConstraintEncoding(CONSTRAINT_ENCODING_EDEFAULT);
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
			case CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case CimPackage.CIM_VENDOR_POLICY_CONDITION__CONSTRAINT_ENCODING:
				return CONSTRAINT_ENCODING_EDEFAULT == null ? constraintEncoding != null : !CONSTRAINT_ENCODING_EDEFAULT.equals(constraintEncoding);
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
		result.append(" (Constraint: ");
		result.append(constraint);
		result.append(", ConstraintEncoding: ");
		result.append(constraintEncoding);
		result.append(')');
		return result.toString();
	}

} //CIM_VendorPolicyConditionImpl
