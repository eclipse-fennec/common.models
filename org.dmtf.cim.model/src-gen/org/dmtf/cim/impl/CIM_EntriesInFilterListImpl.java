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

import org.dmtf.cim.CIM_EntriesInFilterList;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Entries In Filter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EntriesInFilterListImpl#getEntrySequence <em>Entry Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_EntriesInFilterListImpl extends CIM_ComponentImpl implements CIM_EntriesInFilterList {
	/**
	 * The default value of the '{@link #getEntrySequence() <em>Entry Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrySequence()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENTRY_SEQUENCE_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getEntrySequence() <em>Entry Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrySequence()
	 * @generated
	 * @ordered
	 */
	protected Integer entrySequence = ENTRY_SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EntriesInFilterListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EntriesInFilterList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEntrySequence() {
		return entrySequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntrySequence(Integer newEntrySequence) {
		Integer oldEntrySequence = entrySequence;
		entrySequence = newEntrySequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENTRIES_IN_FILTER_LIST__ENTRY_SEQUENCE, oldEntrySequence, entrySequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ENTRIES_IN_FILTER_LIST__ENTRY_SEQUENCE:
				return getEntrySequence();
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
			case CimPackage.CIM_ENTRIES_IN_FILTER_LIST__ENTRY_SEQUENCE:
				setEntrySequence((Integer)newValue);
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
			case CimPackage.CIM_ENTRIES_IN_FILTER_LIST__ENTRY_SEQUENCE:
				setEntrySequence(ENTRY_SEQUENCE_EDEFAULT);
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
			case CimPackage.CIM_ENTRIES_IN_FILTER_LIST__ENTRY_SEQUENCE:
				return ENTRY_SEQUENCE_EDEFAULT == null ? entrySequence != null : !ENTRY_SEQUENCE_EDEFAULT.equals(entrySequence);
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
		result.append(" (EntrySequence: ");
		result.append(entrySequence);
		result.append(')');
		return result.toString();
	}

} //CIM_EntriesInFilterListImpl
