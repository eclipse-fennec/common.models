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

import org.dmtf.cim.CIM_ActsAsSpare;
import org.dmtf.cim.CIM_ManagedSystemElement;
import org.dmtf.cim.CIM_SpareGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Acts As Spare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActsAsSpareImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActsAsSpareImpl#getSpare <em>Spare</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActsAsSpareImpl#getHotStandby <em>Hot Standby</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ActsAsSpareImpl extends MinimalEObjectImpl.Container implements CIM_ActsAsSpare {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected CIM_SpareGroup group;

	/**
	 * The cached value of the '{@link #getSpare() <em>Spare</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpare()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedSystemElement spare;

	/**
	 * The default value of the '{@link #getHotStandby() <em>Hot Standby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotStandby()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HOT_STANDBY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHotStandby() <em>Hot Standby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotStandby()
	 * @generated
	 * @ordered
	 */
	protected Boolean hotStandby = HOT_STANDBY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ActsAsSpareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ActsAsSpare();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SpareGroup getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (CIM_SpareGroup)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ACTS_AS_SPARE__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_SpareGroup basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(CIM_SpareGroup newGroup) {
		CIM_SpareGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTS_AS_SPARE__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedSystemElement getSpare() {
		if (spare != null && spare.eIsProxy()) {
			InternalEObject oldSpare = (InternalEObject)spare;
			spare = (CIM_ManagedSystemElement)eResolveProxy(oldSpare);
			if (spare != oldSpare) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ACTS_AS_SPARE__SPARE, oldSpare, spare));
			}
		}
		return spare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedSystemElement basicGetSpare() {
		return spare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpare(CIM_ManagedSystemElement newSpare) {
		CIM_ManagedSystemElement oldSpare = spare;
		spare = newSpare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTS_AS_SPARE__SPARE, oldSpare, spare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHotStandby() {
		return hotStandby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHotStandby(Boolean newHotStandby) {
		Boolean oldHotStandby = hotStandby;
		hotStandby = newHotStandby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTS_AS_SPARE__HOT_STANDBY, oldHotStandby, hotStandby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ACTS_AS_SPARE__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case CimPackage.CIM_ACTS_AS_SPARE__SPARE:
				if (resolve) return getSpare();
				return basicGetSpare();
			case CimPackage.CIM_ACTS_AS_SPARE__HOT_STANDBY:
				return getHotStandby();
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
			case CimPackage.CIM_ACTS_AS_SPARE__GROUP:
				setGroup((CIM_SpareGroup)newValue);
				return;
			case CimPackage.CIM_ACTS_AS_SPARE__SPARE:
				setSpare((CIM_ManagedSystemElement)newValue);
				return;
			case CimPackage.CIM_ACTS_AS_SPARE__HOT_STANDBY:
				setHotStandby((Boolean)newValue);
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
			case CimPackage.CIM_ACTS_AS_SPARE__GROUP:
				setGroup((CIM_SpareGroup)null);
				return;
			case CimPackage.CIM_ACTS_AS_SPARE__SPARE:
				setSpare((CIM_ManagedSystemElement)null);
				return;
			case CimPackage.CIM_ACTS_AS_SPARE__HOT_STANDBY:
				setHotStandby(HOT_STANDBY_EDEFAULT);
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
			case CimPackage.CIM_ACTS_AS_SPARE__GROUP:
				return group != null;
			case CimPackage.CIM_ACTS_AS_SPARE__SPARE:
				return spare != null;
			case CimPackage.CIM_ACTS_AS_SPARE__HOT_STANDBY:
				return HOT_STANDBY_EDEFAULT == null ? hotStandby != null : !HOT_STANDBY_EDEFAULT.equals(hotStandby);
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
		result.append(" (HotStandby: ");
		result.append(hotStandby);
		result.append(')');
		return result.toString();
	}

} //CIM_ActsAsSpareImpl
