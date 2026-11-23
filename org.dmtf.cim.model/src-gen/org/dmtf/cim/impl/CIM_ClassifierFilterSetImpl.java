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

import org.dmtf.cim.CIM_ClassifierFilterSet;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Classifier Filter Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ClassifierFilterSetImpl#getFilterListPosition <em>Filter List Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ClassifierFilterSetImpl extends CIM_DependencyImpl implements CIM_ClassifierFilterSet {
	/**
	 * The default value of the '{@link #getFilterListPosition() <em>Filter List Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterListPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FILTER_LIST_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterListPosition() <em>Filter List Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterListPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer filterListPosition = FILTER_LIST_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ClassifierFilterSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ClassifierFilterSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFilterListPosition() {
		return filterListPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterListPosition(Integer newFilterListPosition) {
		Integer oldFilterListPosition = filterListPosition;
		filterListPosition = newFilterListPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLASSIFIER_FILTER_SET__FILTER_LIST_POSITION, oldFilterListPosition, filterListPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CLASSIFIER_FILTER_SET__FILTER_LIST_POSITION:
				return getFilterListPosition();
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
			case CimPackage.CIM_CLASSIFIER_FILTER_SET__FILTER_LIST_POSITION:
				setFilterListPosition((Integer)newValue);
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
			case CimPackage.CIM_CLASSIFIER_FILTER_SET__FILTER_LIST_POSITION:
				setFilterListPosition(FILTER_LIST_POSITION_EDEFAULT);
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
			case CimPackage.CIM_CLASSIFIER_FILTER_SET__FILTER_LIST_POSITION:
				return FILTER_LIST_POSITION_EDEFAULT == null ? filterListPosition != null : !FILTER_LIST_POSITION_EDEFAULT.equals(filterListPosition);
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
		result.append(" (FilterListPosition: ");
		result.append(filterListPosition);
		result.append(')');
		return result.toString();
	}

} //CIM_ClassifierFilterSetImpl
