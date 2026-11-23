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

import org.dmtf.cim.CIM_CollectionOfMSEs;
import org.dmtf.cim.CIM_ManagedSystemElement;
import org.dmtf.cim.CIM_Setting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingImpl#getSettingID <em>Setting ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_SettingImpl extends CIM_ManagedElementImpl implements CIM_Setting {
	/**
	 * The default value of the '{@link #getSettingID() <em>Setting ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingID()
	 * @generated
	 * @ordered
	 */
	protected static final String SETTING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSettingID() <em>Setting ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingID()
	 * @generated
	 * @ordered
	 */
	protected String settingID = SETTING_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Setting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSettingID() {
		return settingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSettingID(String newSettingID) {
		String oldSettingID = settingID;
		settingID = newSettingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING__SETTING_ID, oldSettingID, settingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long VerifyOKToApplyToMSE(CIM_ManagedSystemElement MSE, String TimeToApply, String MustBeCompletedBy) {
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
	public Long ApplyToMSE(CIM_ManagedSystemElement MSE, String TimeToApply, String MustBeCompletedBy) {
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
	public Long VerifyOKToApplyToCollection(CIM_CollectionOfMSEs Collection, String TimeToApply, String MustBeCompletedBy, EList<String> CanNotApply) {
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
	public Long ApplyToCollection(CIM_CollectionOfMSEs Collection, String TimeToApply, Boolean ContinueOnError, String MustBeCompletedBy, EList<String> CanNotApply) {
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
	public Long VerifyOKToApplyIncrementalChangeToMSE(CIM_ManagedSystemElement MSE, String TimeToApply, String MustBeCompletedBy, EList<String> PropertiesToApply) {
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
	public Long ApplyIncrementalChangeToMSE(CIM_ManagedSystemElement MSE, String TimeToApply, String MustBeCompletedBy, EList<String> PropertiesToApply) {
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
	public Long VerifyOKToApplyIncrementalChangeToCollection(CIM_CollectionOfMSEs Collection, String TimeToApply, String MustBeCompletedBy, EList<String> PropertiesToApply, EList<String> CanNotApply) {
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
	public Long ApplyIncrementalChangeToCollection(CIM_CollectionOfMSEs Collection, String TimeToApply, Boolean ContinueOnError, String MustBeCompletedBy, EList<String> PropertiesToApply, EList<String> CanNotApply) {
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
			case CimPackage.CIM_SETTING__SETTING_ID:
				return getSettingID();
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
			case CimPackage.CIM_SETTING__SETTING_ID:
				setSettingID((String)newValue);
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
			case CimPackage.CIM_SETTING__SETTING_ID:
				setSettingID(SETTING_ID_EDEFAULT);
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
			case CimPackage.CIM_SETTING__SETTING_ID:
				return SETTING_ID_EDEFAULT == null ? settingID != null : !SETTING_ID_EDEFAULT.equals(settingID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_SETTING___VERIFY_OK_TO_APPLY_TO_MSE__CIM_MANAGEDSYSTEMELEMENT_STRING_STRING:
				return VerifyOKToApplyToMSE((CIM_ManagedSystemElement)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CimPackage.CIM_SETTING___APPLY_TO_MSE__CIM_MANAGEDSYSTEMELEMENT_STRING_STRING:
				return ApplyToMSE((CIM_ManagedSystemElement)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CimPackage.CIM_SETTING___VERIFY_OK_TO_APPLY_TO_COLLECTION__CIM_COLLECTIONOFMSES_STRING_STRING_ELIST:
				return VerifyOKToApplyToCollection((CIM_CollectionOfMSEs)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (EList<String>)arguments.get(3));
			case CimPackage.CIM_SETTING___APPLY_TO_COLLECTION__CIM_COLLECTIONOFMSES_STRING_BOOLEAN_STRING_ELIST:
				return ApplyToCollection((CIM_CollectionOfMSEs)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2), (String)arguments.get(3), (EList<String>)arguments.get(4));
			case CimPackage.CIM_SETTING___VERIFY_OK_TO_APPLY_INCREMENTAL_CHANGE_TO_MSE__CIM_MANAGEDSYSTEMELEMENT_STRING_STRING_ELIST:
				return VerifyOKToApplyIncrementalChangeToMSE((CIM_ManagedSystemElement)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (EList<String>)arguments.get(3));
			case CimPackage.CIM_SETTING___APPLY_INCREMENTAL_CHANGE_TO_MSE__CIM_MANAGEDSYSTEMELEMENT_STRING_STRING_ELIST:
				return ApplyIncrementalChangeToMSE((CIM_ManagedSystemElement)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (EList<String>)arguments.get(3));
			case CimPackage.CIM_SETTING___VERIFY_OK_TO_APPLY_INCREMENTAL_CHANGE_TO_COLLECTION__CIM_COLLECTIONOFMSES_STRING_STRING_ELIST_ELIST:
				return VerifyOKToApplyIncrementalChangeToCollection((CIM_CollectionOfMSEs)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (EList<String>)arguments.get(3), (EList<String>)arguments.get(4));
			case CimPackage.CIM_SETTING___APPLY_INCREMENTAL_CHANGE_TO_COLLECTION__CIM_COLLECTIONOFMSES_STRING_BOOLEAN_STRING_ELIST_ELIST:
				return ApplyIncrementalChangeToCollection((CIM_CollectionOfMSEs)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2), (String)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5));
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
		result.append(" (SettingID: ");
		result.append(settingID);
		result.append(')');
		return result.toString();
	}

} //CIM_SettingImpl
