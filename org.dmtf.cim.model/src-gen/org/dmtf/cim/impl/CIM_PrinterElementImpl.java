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

import org.dmtf.cim.CIM_PrinterElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Printer Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterElementImpl#getSNMPRowId <em>SNMP Row Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_PrinterElementImpl extends CIM_LogicalElementImpl implements CIM_PrinterElement {
	/**
	 * The default value of the '{@link #getSNMPRowId() <em>SNMP Row Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSNMPRowId()
	 * @generated
	 * @ordered
	 */
	protected static final Long SNMP_ROW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSNMPRowId() <em>SNMP Row Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSNMPRowId()
	 * @generated
	 * @ordered
	 */
	protected Long snmpRowId = SNMP_ROW_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrinterElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrinterElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSNMPRowId() {
		return snmpRowId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSNMPRowId(Long newSNMPRowId) {
		Long oldSNMPRowId = snmpRowId;
		snmpRowId = newSNMPRowId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER_ELEMENT__SNMP_ROW_ID, oldSNMPRowId, snmpRowId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINTER_ELEMENT__SNMP_ROW_ID:
				return getSNMPRowId();
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
			case CimPackage.CIM_PRINTER_ELEMENT__SNMP_ROW_ID:
				setSNMPRowId((Long)newValue);
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
			case CimPackage.CIM_PRINTER_ELEMENT__SNMP_ROW_ID:
				setSNMPRowId(SNMP_ROW_ID_EDEFAULT);
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
			case CimPackage.CIM_PRINTER_ELEMENT__SNMP_ROW_ID:
				return SNMP_ROW_ID_EDEFAULT == null ? snmpRowId != null : !SNMP_ROW_ID_EDEFAULT.equals(snmpRowId);
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
		result.append(" (SNMPRowId: ");
		result.append(snmpRowId);
		result.append(')');
		return result.toString();
	}

} //CIM_PrinterElementImpl
