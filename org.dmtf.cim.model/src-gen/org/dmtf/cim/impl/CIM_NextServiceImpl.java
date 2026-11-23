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

import org.dmtf.cim.CIM_ConditioningService;
import org.dmtf.cim.CIM_NextService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Next Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextServiceImpl#getPrecedingService <em>Preceding Service</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextServiceImpl#getFollowingService <em>Following Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NextServiceImpl extends MinimalEObjectImpl.Container implements CIM_NextService {
	/**
	 * The cached value of the '{@link #getPrecedingService() <em>Preceding Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingService()
	 * @generated
	 * @ordered
	 */
	protected CIM_ConditioningService precedingService;

	/**
	 * The cached value of the '{@link #getFollowingService() <em>Following Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingService()
	 * @generated
	 * @ordered
	 */
	protected CIM_ConditioningService followingService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NextServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NextService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConditioningService getPrecedingService() {
		if (precedingService != null && precedingService.eIsProxy()) {
			InternalEObject oldPrecedingService = (InternalEObject)precedingService;
			precedingService = (CIM_ConditioningService)eResolveProxy(oldPrecedingService);
			if (precedingService != oldPrecedingService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_NEXT_SERVICE__PRECEDING_SERVICE, oldPrecedingService, precedingService));
			}
		}
		return precedingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ConditioningService basicGetPrecedingService() {
		return precedingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecedingService(CIM_ConditioningService newPrecedingService) {
		CIM_ConditioningService oldPrecedingService = precedingService;
		precedingService = newPrecedingService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_SERVICE__PRECEDING_SERVICE, oldPrecedingService, precedingService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConditioningService getFollowingService() {
		if (followingService != null && followingService.eIsProxy()) {
			InternalEObject oldFollowingService = (InternalEObject)followingService;
			followingService = (CIM_ConditioningService)eResolveProxy(oldFollowingService);
			if (followingService != oldFollowingService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_NEXT_SERVICE__FOLLOWING_SERVICE, oldFollowingService, followingService));
			}
		}
		return followingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ConditioningService basicGetFollowingService() {
		return followingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollowingService(CIM_ConditioningService newFollowingService) {
		CIM_ConditioningService oldFollowingService = followingService;
		followingService = newFollowingService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_SERVICE__FOLLOWING_SERVICE, oldFollowingService, followingService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NEXT_SERVICE__PRECEDING_SERVICE:
				if (resolve) return getPrecedingService();
				return basicGetPrecedingService();
			case CimPackage.CIM_NEXT_SERVICE__FOLLOWING_SERVICE:
				if (resolve) return getFollowingService();
				return basicGetFollowingService();
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
			case CimPackage.CIM_NEXT_SERVICE__PRECEDING_SERVICE:
				setPrecedingService((CIM_ConditioningService)newValue);
				return;
			case CimPackage.CIM_NEXT_SERVICE__FOLLOWING_SERVICE:
				setFollowingService((CIM_ConditioningService)newValue);
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
			case CimPackage.CIM_NEXT_SERVICE__PRECEDING_SERVICE:
				setPrecedingService((CIM_ConditioningService)null);
				return;
			case CimPackage.CIM_NEXT_SERVICE__FOLLOWING_SERVICE:
				setFollowingService((CIM_ConditioningService)null);
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
			case CimPackage.CIM_NEXT_SERVICE__PRECEDING_SERVICE:
				return precedingService != null;
			case CimPackage.CIM_NEXT_SERVICE__FOLLOWING_SERVICE:
				return followingService != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_NextServiceImpl
