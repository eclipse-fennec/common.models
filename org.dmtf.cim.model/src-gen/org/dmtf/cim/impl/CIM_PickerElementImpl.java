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

import org.dmtf.cim.CIM_PickerElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Picker Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PickerElementImpl#getMaxPickTime <em>Max Pick Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PickerElementImpl#getMaxPutTime <em>Max Put Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PickerElementImpl#getCellLocation <em>Cell Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PickerElementImpl extends CIM_MediaTransferDeviceImpl implements CIM_PickerElement {
	/**
	 * The default value of the '{@link #getMaxPickTime() <em>Max Pick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPickTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_PICK_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPickTime() <em>Max Pick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPickTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxPickTime = MAX_PICK_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPutTime() <em>Max Put Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPutTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_PUT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPutTime() <em>Max Put Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPutTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxPutTime = MAX_PUT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellLocation() <em>Cell Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellLocation() <em>Cell Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellLocation()
	 * @generated
	 * @ordered
	 */
	protected String cellLocation = CELL_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PickerElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PickerElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxPickTime() {
		return maxPickTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPickTime(Long newMaxPickTime) {
		Long oldMaxPickTime = maxPickTime;
		maxPickTime = newMaxPickTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PICKER_ELEMENT__MAX_PICK_TIME, oldMaxPickTime, maxPickTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxPutTime() {
		return maxPutTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPutTime(Long newMaxPutTime) {
		Long oldMaxPutTime = maxPutTime;
		maxPutTime = newMaxPutTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PICKER_ELEMENT__MAX_PUT_TIME, oldMaxPutTime, maxPutTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCellLocation() {
		return cellLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellLocation(String newCellLocation) {
		String oldCellLocation = cellLocation;
		cellLocation = newCellLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PICKER_ELEMENT__CELL_LOCATION, oldCellLocation, cellLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PICKER_ELEMENT__MAX_PICK_TIME:
				return getMaxPickTime();
			case CimPackage.CIM_PICKER_ELEMENT__MAX_PUT_TIME:
				return getMaxPutTime();
			case CimPackage.CIM_PICKER_ELEMENT__CELL_LOCATION:
				return getCellLocation();
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
			case CimPackage.CIM_PICKER_ELEMENT__MAX_PICK_TIME:
				setMaxPickTime((Long)newValue);
				return;
			case CimPackage.CIM_PICKER_ELEMENT__MAX_PUT_TIME:
				setMaxPutTime((Long)newValue);
				return;
			case CimPackage.CIM_PICKER_ELEMENT__CELL_LOCATION:
				setCellLocation((String)newValue);
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
			case CimPackage.CIM_PICKER_ELEMENT__MAX_PICK_TIME:
				setMaxPickTime(MAX_PICK_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_PICKER_ELEMENT__MAX_PUT_TIME:
				setMaxPutTime(MAX_PUT_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_PICKER_ELEMENT__CELL_LOCATION:
				setCellLocation(CELL_LOCATION_EDEFAULT);
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
			case CimPackage.CIM_PICKER_ELEMENT__MAX_PICK_TIME:
				return MAX_PICK_TIME_EDEFAULT == null ? maxPickTime != null : !MAX_PICK_TIME_EDEFAULT.equals(maxPickTime);
			case CimPackage.CIM_PICKER_ELEMENT__MAX_PUT_TIME:
				return MAX_PUT_TIME_EDEFAULT == null ? maxPutTime != null : !MAX_PUT_TIME_EDEFAULT.equals(maxPutTime);
			case CimPackage.CIM_PICKER_ELEMENT__CELL_LOCATION:
				return CELL_LOCATION_EDEFAULT == null ? cellLocation != null : !CELL_LOCATION_EDEFAULT.equals(cellLocation);
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
		result.append(" (MaxPickTime: ");
		result.append(maxPickTime);
		result.append(", MaxPutTime: ");
		result.append(maxPutTime);
		result.append(", CellLocation: ");
		result.append(cellLocation);
		result.append(')');
		return result.toString();
	}

} //CIM_PickerElementImpl
