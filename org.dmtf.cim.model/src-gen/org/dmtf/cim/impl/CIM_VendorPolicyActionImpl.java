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

import org.dmtf.cim.CIM_VendorPolicyAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Vendor Policy Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VendorPolicyActionImpl#getActionData <em>Action Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VendorPolicyActionImpl#getActionEncoding <em>Action Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VendorPolicyActionImpl extends CIM_PolicyActionImpl implements CIM_VendorPolicyAction {
	/**
	 * The cached value of the '{@link #getActionData() <em>Action Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionData()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actionData;

	/**
	 * The default value of the '{@link #getActionEncoding() <em>Action Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionEncoding() <em>Action Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionEncoding()
	 * @generated
	 * @ordered
	 */
	protected String actionEncoding = ACTION_ENCODING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VendorPolicyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VendorPolicyAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getActionData() {
		if (actionData == null) {
			actionData = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_DATA);
		}
		return actionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionEncoding() {
		return actionEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionEncoding(String newActionEncoding) {
		String oldActionEncoding = actionEncoding;
		actionEncoding = newActionEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_ENCODING, oldActionEncoding, actionEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_DATA:
				return getActionData();
			case CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_ENCODING:
				return getActionEncoding();
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
			case CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_DATA:
				getActionData().clear();
				getActionData().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_ENCODING:
				setActionEncoding((String)newValue);
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
			case CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_DATA:
				getActionData().clear();
				return;
			case CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_ENCODING:
				setActionEncoding(ACTION_ENCODING_EDEFAULT);
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
			case CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_DATA:
				return actionData != null && !actionData.isEmpty();
			case CimPackage.CIM_VENDOR_POLICY_ACTION__ACTION_ENCODING:
				return ACTION_ENCODING_EDEFAULT == null ? actionEncoding != null : !ACTION_ENCODING_EDEFAULT.equals(actionEncoding);
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
		result.append(" (ActionData: ");
		result.append(actionData);
		result.append(", ActionEncoding: ");
		result.append(actionEncoding);
		result.append(')');
		return result.toString();
	}

} //CIM_VendorPolicyActionImpl
