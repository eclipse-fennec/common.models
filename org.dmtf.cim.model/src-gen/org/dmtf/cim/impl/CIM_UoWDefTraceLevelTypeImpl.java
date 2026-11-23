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

import org.dmtf.cim.CIM_TraceLevelType;
import org.dmtf.cim.CIM_UnitOfWorkDefinition;
import org.dmtf.cim.CIM_UoWDefTraceLevelType;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Uo WDef Trace Level Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UoWDefTraceLevelTypeImpl#getTraceLevelType <em>Trace Level Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UoWDefTraceLevelTypeImpl#getUoWDefn <em>Uo WDefn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UoWDefTraceLevelTypeImpl extends MinimalEObjectImpl.Container implements CIM_UoWDefTraceLevelType {
	/**
	 * The cached value of the '{@link #getTraceLevelType() <em>Trace Level Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLevelType()
	 * @generated
	 * @ordered
	 */
	protected CIM_TraceLevelType traceLevelType;

	/**
	 * The cached value of the '{@link #getUoWDefn() <em>Uo WDefn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUoWDefn()
	 * @generated
	 * @ordered
	 */
	protected CIM_UnitOfWorkDefinition uoWDefn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UoWDefTraceLevelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UoWDefTraceLevelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TraceLevelType getTraceLevelType() {
		if (traceLevelType != null && traceLevelType.eIsProxy()) {
			InternalEObject oldTraceLevelType = (InternalEObject)traceLevelType;
			traceLevelType = (CIM_TraceLevelType)eResolveProxy(oldTraceLevelType);
			if (traceLevelType != oldTraceLevelType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__TRACE_LEVEL_TYPE, oldTraceLevelType, traceLevelType));
			}
		}
		return traceLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_TraceLevelType basicGetTraceLevelType() {
		return traceLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraceLevelType(CIM_TraceLevelType newTraceLevelType) {
		CIM_TraceLevelType oldTraceLevelType = traceLevelType;
		traceLevelType = newTraceLevelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__TRACE_LEVEL_TYPE, oldTraceLevelType, traceLevelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnitOfWorkDefinition getUoWDefn() {
		if (uoWDefn != null && uoWDefn.eIsProxy()) {
			InternalEObject oldUoWDefn = (InternalEObject)uoWDefn;
			uoWDefn = (CIM_UnitOfWorkDefinition)eResolveProxy(oldUoWDefn);
			if (uoWDefn != oldUoWDefn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__UO_WDEFN, oldUoWDefn, uoWDefn));
			}
		}
		return uoWDefn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_UnitOfWorkDefinition basicGetUoWDefn() {
		return uoWDefn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUoWDefn(CIM_UnitOfWorkDefinition newUoWDefn) {
		CIM_UnitOfWorkDefinition oldUoWDefn = uoWDefn;
		uoWDefn = newUoWDefn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__UO_WDEFN, oldUoWDefn, uoWDefn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__TRACE_LEVEL_TYPE:
				if (resolve) return getTraceLevelType();
				return basicGetTraceLevelType();
			case CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__UO_WDEFN:
				if (resolve) return getUoWDefn();
				return basicGetUoWDefn();
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
			case CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__TRACE_LEVEL_TYPE:
				setTraceLevelType((CIM_TraceLevelType)newValue);
				return;
			case CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__UO_WDEFN:
				setUoWDefn((CIM_UnitOfWorkDefinition)newValue);
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
			case CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__TRACE_LEVEL_TYPE:
				setTraceLevelType((CIM_TraceLevelType)null);
				return;
			case CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__UO_WDEFN:
				setUoWDefn((CIM_UnitOfWorkDefinition)null);
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
			case CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__TRACE_LEVEL_TYPE:
				return traceLevelType != null;
			case CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE__UO_WDEFN:
				return uoWDefn != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_UoWDefTraceLevelTypeImpl
