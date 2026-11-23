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
package org.dmtf.prs.impl;

import org.dmtf.cim.impl.CIM_ManagedElementImpl;

import org.dmtf.prs.PRS_ExchangeElement;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Exchange Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_ExchangeElementImpl#getPRSUniqueName <em>PRS Unique Name</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ExchangeElementImpl#getDirtyFlag <em>Dirty Flag</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PRS_ExchangeElementImpl extends CIM_ManagedElementImpl implements PRS_ExchangeElement {
	/**
	 * The default value of the '{@link #getPRSUniqueName() <em>PRS Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRSUniqueName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRS_UNIQUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPRSUniqueName() <em>PRS Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRSUniqueName()
	 * @generated
	 * @ordered
	 */
	protected String prsUniqueName = PRS_UNIQUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirtyFlag() <em>Dirty Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirtyFlag()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRTY_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirtyFlag() <em>Dirty Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirtyFlag()
	 * @generated
	 * @ordered
	 */
	protected Integer dirtyFlag = DIRTY_FLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_ExchangeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_EXCHANGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPRSUniqueName() {
		return prsUniqueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPRSUniqueName(String newPRSUniqueName) {
		String oldPRSUniqueName = prsUniqueName;
		prsUniqueName = newPRSUniqueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME, oldPRSUniqueName, prsUniqueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDirtyFlag() {
		return dirtyFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirtyFlag(Integer newDirtyFlag) {
		Integer oldDirtyFlag = dirtyFlag;
		dirtyFlag = newDirtyFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_EXCHANGE_ELEMENT__DIRTY_FLAG, oldDirtyFlag, dirtyFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME:
				return getPRSUniqueName();
			case PrsPackage.PRS_EXCHANGE_ELEMENT__DIRTY_FLAG:
				return getDirtyFlag();
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
			case PrsPackage.PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME:
				setPRSUniqueName((String)newValue);
				return;
			case PrsPackage.PRS_EXCHANGE_ELEMENT__DIRTY_FLAG:
				setDirtyFlag((Integer)newValue);
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
			case PrsPackage.PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME:
				setPRSUniqueName(PRS_UNIQUE_NAME_EDEFAULT);
				return;
			case PrsPackage.PRS_EXCHANGE_ELEMENT__DIRTY_FLAG:
				setDirtyFlag(DIRTY_FLAG_EDEFAULT);
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
			case PrsPackage.PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME:
				return PRS_UNIQUE_NAME_EDEFAULT == null ? prsUniqueName != null : !PRS_UNIQUE_NAME_EDEFAULT.equals(prsUniqueName);
			case PrsPackage.PRS_EXCHANGE_ELEMENT__DIRTY_FLAG:
				return DIRTY_FLAG_EDEFAULT == null ? dirtyFlag != null : !DIRTY_FLAG_EDEFAULT.equals(dirtyFlag);
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
		result.append(" (PRSUniqueName: ");
		result.append(prsUniqueName);
		result.append(", DirtyFlag: ");
		result.append(dirtyFlag);
		result.append(')');
		return result.toString();
	}

} //PRS_ExchangeElementImpl
