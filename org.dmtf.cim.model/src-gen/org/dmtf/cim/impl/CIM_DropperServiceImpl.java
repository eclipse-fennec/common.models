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

import org.dmtf.cim.CIM_DropperService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Dropper Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DropperServiceImpl#getDropperType <em>Dropper Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DropperServiceImpl#getOtherDropperType <em>Other Dropper Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DropperServiceImpl#getAlwaysDrop <em>Always Drop</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DropperServiceImpl#getDropFrom <em>Drop From</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DropperServiceImpl#getDropStartMetric <em>Drop Start Metric</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DropperServiceImpl#getDropMaintainMetric <em>Drop Maintain Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DropperServiceImpl extends CIM_ConditioningServiceImpl implements CIM_DropperService {
	/**
	 * The default value of the '{@link #getDropperType() <em>Dropper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropperType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DROPPER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDropperType() <em>Dropper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropperType()
	 * @generated
	 * @ordered
	 */
	protected Integer dropperType = DROPPER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherDropperType() <em>Other Dropper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDropperType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DROPPER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDropperType() <em>Other Dropper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDropperType()
	 * @generated
	 * @ordered
	 */
	protected String otherDropperType = OTHER_DROPPER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlwaysDrop() <em>Always Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlwaysDrop()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALWAYS_DROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlwaysDrop() <em>Always Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlwaysDrop()
	 * @generated
	 * @ordered
	 */
	protected Integer alwaysDrop = ALWAYS_DROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDropFrom() <em>Drop From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DROP_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDropFrom() <em>Drop From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropFrom()
	 * @generated
	 * @ordered
	 */
	protected Integer dropFrom = DROP_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDropStartMetric() <em>Drop Start Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropStartMetric()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DROP_START_METRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDropStartMetric() <em>Drop Start Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropStartMetric()
	 * @generated
	 * @ordered
	 */
	protected Integer dropStartMetric = DROP_START_METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDropMaintainMetric() <em>Drop Maintain Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropMaintainMetric()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DROP_MAINTAIN_METRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDropMaintainMetric() <em>Drop Maintain Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropMaintainMetric()
	 * @generated
	 * @ordered
	 */
	protected Integer dropMaintainMetric = DROP_MAINTAIN_METRIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DropperServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DropperService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDropperType() {
		return dropperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDropperType(Integer newDropperType) {
		Integer oldDropperType = dropperType;
		dropperType = newDropperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DROPPER_SERVICE__DROPPER_TYPE, oldDropperType, dropperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDropperType() {
		return otherDropperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDropperType(String newOtherDropperType) {
		String oldOtherDropperType = otherDropperType;
		otherDropperType = newOtherDropperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DROPPER_SERVICE__OTHER_DROPPER_TYPE, oldOtherDropperType, otherDropperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAlwaysDrop() {
		return alwaysDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlwaysDrop(Integer newAlwaysDrop) {
		Integer oldAlwaysDrop = alwaysDrop;
		alwaysDrop = newAlwaysDrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DROPPER_SERVICE__ALWAYS_DROP, oldAlwaysDrop, alwaysDrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDropFrom() {
		return dropFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDropFrom(Integer newDropFrom) {
		Integer oldDropFrom = dropFrom;
		dropFrom = newDropFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DROPPER_SERVICE__DROP_FROM, oldDropFrom, dropFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDropStartMetric() {
		return dropStartMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDropStartMetric(Integer newDropStartMetric) {
		Integer oldDropStartMetric = dropStartMetric;
		dropStartMetric = newDropStartMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DROPPER_SERVICE__DROP_START_METRIC, oldDropStartMetric, dropStartMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDropMaintainMetric() {
		return dropMaintainMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDropMaintainMetric(Integer newDropMaintainMetric) {
		Integer oldDropMaintainMetric = dropMaintainMetric;
		dropMaintainMetric = newDropMaintainMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DROPPER_SERVICE__DROP_MAINTAIN_METRIC, oldDropMaintainMetric, dropMaintainMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DROPPER_SERVICE__DROPPER_TYPE:
				return getDropperType();
			case CimPackage.CIM_DROPPER_SERVICE__OTHER_DROPPER_TYPE:
				return getOtherDropperType();
			case CimPackage.CIM_DROPPER_SERVICE__ALWAYS_DROP:
				return getAlwaysDrop();
			case CimPackage.CIM_DROPPER_SERVICE__DROP_FROM:
				return getDropFrom();
			case CimPackage.CIM_DROPPER_SERVICE__DROP_START_METRIC:
				return getDropStartMetric();
			case CimPackage.CIM_DROPPER_SERVICE__DROP_MAINTAIN_METRIC:
				return getDropMaintainMetric();
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
			case CimPackage.CIM_DROPPER_SERVICE__DROPPER_TYPE:
				setDropperType((Integer)newValue);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__OTHER_DROPPER_TYPE:
				setOtherDropperType((String)newValue);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__ALWAYS_DROP:
				setAlwaysDrop((Integer)newValue);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__DROP_FROM:
				setDropFrom((Integer)newValue);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__DROP_START_METRIC:
				setDropStartMetric((Integer)newValue);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__DROP_MAINTAIN_METRIC:
				setDropMaintainMetric((Integer)newValue);
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
			case CimPackage.CIM_DROPPER_SERVICE__DROPPER_TYPE:
				setDropperType(DROPPER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__OTHER_DROPPER_TYPE:
				setOtherDropperType(OTHER_DROPPER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__ALWAYS_DROP:
				setAlwaysDrop(ALWAYS_DROP_EDEFAULT);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__DROP_FROM:
				setDropFrom(DROP_FROM_EDEFAULT);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__DROP_START_METRIC:
				setDropStartMetric(DROP_START_METRIC_EDEFAULT);
				return;
			case CimPackage.CIM_DROPPER_SERVICE__DROP_MAINTAIN_METRIC:
				setDropMaintainMetric(DROP_MAINTAIN_METRIC_EDEFAULT);
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
			case CimPackage.CIM_DROPPER_SERVICE__DROPPER_TYPE:
				return DROPPER_TYPE_EDEFAULT == null ? dropperType != null : !DROPPER_TYPE_EDEFAULT.equals(dropperType);
			case CimPackage.CIM_DROPPER_SERVICE__OTHER_DROPPER_TYPE:
				return OTHER_DROPPER_TYPE_EDEFAULT == null ? otherDropperType != null : !OTHER_DROPPER_TYPE_EDEFAULT.equals(otherDropperType);
			case CimPackage.CIM_DROPPER_SERVICE__ALWAYS_DROP:
				return ALWAYS_DROP_EDEFAULT == null ? alwaysDrop != null : !ALWAYS_DROP_EDEFAULT.equals(alwaysDrop);
			case CimPackage.CIM_DROPPER_SERVICE__DROP_FROM:
				return DROP_FROM_EDEFAULT == null ? dropFrom != null : !DROP_FROM_EDEFAULT.equals(dropFrom);
			case CimPackage.CIM_DROPPER_SERVICE__DROP_START_METRIC:
				return DROP_START_METRIC_EDEFAULT == null ? dropStartMetric != null : !DROP_START_METRIC_EDEFAULT.equals(dropStartMetric);
			case CimPackage.CIM_DROPPER_SERVICE__DROP_MAINTAIN_METRIC:
				return DROP_MAINTAIN_METRIC_EDEFAULT == null ? dropMaintainMetric != null : !DROP_MAINTAIN_METRIC_EDEFAULT.equals(dropMaintainMetric);
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
		result.append(" (DropperType: ");
		result.append(dropperType);
		result.append(", OtherDropperType: ");
		result.append(otherDropperType);
		result.append(", AlwaysDrop: ");
		result.append(alwaysDrop);
		result.append(", DropFrom: ");
		result.append(dropFrom);
		result.append(", DropStartMetric: ");
		result.append(dropStartMetric);
		result.append(", DropMaintainMetric: ");
		result.append(dropMaintainMetric);
		result.append(')');
		return result.toString();
	}

} //CIM_DropperServiceImpl
