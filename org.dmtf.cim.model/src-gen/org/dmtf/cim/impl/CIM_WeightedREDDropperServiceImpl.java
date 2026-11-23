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

import org.dmtf.cim.CIM_WeightedREDDropperService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Weighted RED Dropper Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WeightedREDDropperServiceImpl#getDropMetric <em>Drop Metric</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WeightedREDDropperServiceImpl#getOtherDropMetric <em>Other Drop Metric</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WeightedREDDropperServiceImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WeightedREDDropperServiceImpl extends CIM_DropperServiceImpl implements CIM_WeightedREDDropperService {
	/**
	 * The default value of the '{@link #getDropMetric() <em>Drop Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropMetric()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DROP_METRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDropMetric() <em>Drop Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropMetric()
	 * @generated
	 * @ordered
	 */
	protected Integer dropMetric = DROP_METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherDropMetric() <em>Other Drop Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDropMetric()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DROP_METRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDropMetric() <em>Other Drop Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDropMetric()
	 * @generated
	 * @ordered
	 */
	protected String otherDropMetric = OTHER_DROP_METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Float WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Float weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WeightedREDDropperServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WeightedREDDropperService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDropMetric() {
		return dropMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDropMetric(Integer newDropMetric) {
		Integer oldDropMetric = dropMetric;
		dropMetric = newDropMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__DROP_METRIC, oldDropMetric, dropMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDropMetric() {
		return otherDropMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDropMetric(String newOtherDropMetric) {
		String oldOtherDropMetric = otherDropMetric;
		otherDropMetric = newOtherDropMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__OTHER_DROP_METRIC, oldOtherDropMetric, otherDropMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(Float newWeight) {
		Float oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__DROP_METRIC:
				return getDropMetric();
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__OTHER_DROP_METRIC:
				return getOtherDropMetric();
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__WEIGHT:
				return getWeight();
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
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__DROP_METRIC:
				setDropMetric((Integer)newValue);
				return;
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__OTHER_DROP_METRIC:
				setOtherDropMetric((String)newValue);
				return;
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__WEIGHT:
				setWeight((Float)newValue);
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
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__DROP_METRIC:
				setDropMetric(DROP_METRIC_EDEFAULT);
				return;
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__OTHER_DROP_METRIC:
				setOtherDropMetric(OTHER_DROP_METRIC_EDEFAULT);
				return;
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__DROP_METRIC:
				return DROP_METRIC_EDEFAULT == null ? dropMetric != null : !DROP_METRIC_EDEFAULT.equals(dropMetric);
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__OTHER_DROP_METRIC:
				return OTHER_DROP_METRIC_EDEFAULT == null ? otherDropMetric != null : !OTHER_DROP_METRIC_EDEFAULT.equals(otherDropMetric);
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
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
		result.append(" (DropMetric: ");
		result.append(dropMetric);
		result.append(", OtherDropMetric: ");
		result.append(otherDropMetric);
		result.append(", Weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //CIM_WeightedREDDropperServiceImpl
