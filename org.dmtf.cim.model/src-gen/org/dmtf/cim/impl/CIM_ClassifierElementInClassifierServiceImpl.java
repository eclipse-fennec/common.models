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

import org.dmtf.cim.CIM_ClassifierElementInClassifierService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Classifier Element In Classifier Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ClassifierElementInClassifierServiceImpl#getClassifierOrder <em>Classifier Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ClassifierElementInClassifierServiceImpl extends CIM_ServiceComponentImpl implements CIM_ClassifierElementInClassifierService {
	/**
	 * The default value of the '{@link #getClassifierOrder() <em>Classifier Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASSIFIER_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierOrder() <em>Classifier Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierOrder()
	 * @generated
	 * @ordered
	 */
	protected Long classifierOrder = CLASSIFIER_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ClassifierElementInClassifierServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ClassifierElementInClassifierService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClassifierOrder() {
		return classifierOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassifierOrder(Long newClassifierOrder) {
		Long oldClassifierOrder = classifierOrder;
		classifierOrder = newClassifierOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLASSIFIER_ELEMENT_IN_CLASSIFIER_SERVICE__CLASSIFIER_ORDER, oldClassifierOrder, classifierOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CLASSIFIER_ELEMENT_IN_CLASSIFIER_SERVICE__CLASSIFIER_ORDER:
				return getClassifierOrder();
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
			case CimPackage.CIM_CLASSIFIER_ELEMENT_IN_CLASSIFIER_SERVICE__CLASSIFIER_ORDER:
				setClassifierOrder((Long)newValue);
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
			case CimPackage.CIM_CLASSIFIER_ELEMENT_IN_CLASSIFIER_SERVICE__CLASSIFIER_ORDER:
				setClassifierOrder(CLASSIFIER_ORDER_EDEFAULT);
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
			case CimPackage.CIM_CLASSIFIER_ELEMENT_IN_CLASSIFIER_SERVICE__CLASSIFIER_ORDER:
				return CLASSIFIER_ORDER_EDEFAULT == null ? classifierOrder != null : !CLASSIFIER_ORDER_EDEFAULT.equals(classifierOrder);
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
		result.append(" (ClassifierOrder: ");
		result.append(classifierOrder);
		result.append(')');
		return result.toString();
	}

} //CIM_ClassifierElementInClassifierServiceImpl
