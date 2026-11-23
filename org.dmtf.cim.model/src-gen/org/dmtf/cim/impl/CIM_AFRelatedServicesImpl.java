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

import org.dmtf.cim.CIM_AFRelatedServices;
import org.dmtf.cim.CIM_AFService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM AF Related Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AFRelatedServicesImpl#getAFLowerDropPrecedence <em>AF Lower Drop Precedence</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AFRelatedServicesImpl#getAFHigherDropPrecedence <em>AF Higher Drop Precedence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AFRelatedServicesImpl extends MinimalEObjectImpl.Container implements CIM_AFRelatedServices {
	/**
	 * The cached value of the '{@link #getAFLowerDropPrecedence() <em>AF Lower Drop Precedence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFLowerDropPrecedence()
	 * @generated
	 * @ordered
	 */
	protected CIM_AFService afLowerDropPrecedence;

	/**
	 * The cached value of the '{@link #getAFHigherDropPrecedence() <em>AF Higher Drop Precedence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFHigherDropPrecedence()
	 * @generated
	 * @ordered
	 */
	protected CIM_AFService afHigherDropPrecedence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AFRelatedServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AFRelatedServices();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AFService getAFLowerDropPrecedence() {
		if (afLowerDropPrecedence != null && afLowerDropPrecedence.eIsProxy()) {
			InternalEObject oldAFLowerDropPrecedence = (InternalEObject)afLowerDropPrecedence;
			afLowerDropPrecedence = (CIM_AFService)eResolveProxy(oldAFLowerDropPrecedence);
			if (afLowerDropPrecedence != oldAFLowerDropPrecedence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_AF_RELATED_SERVICES__AF_LOWER_DROP_PRECEDENCE, oldAFLowerDropPrecedence, afLowerDropPrecedence));
			}
		}
		return afLowerDropPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_AFService basicGetAFLowerDropPrecedence() {
		return afLowerDropPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAFLowerDropPrecedence(CIM_AFService newAFLowerDropPrecedence) {
		CIM_AFService oldAFLowerDropPrecedence = afLowerDropPrecedence;
		afLowerDropPrecedence = newAFLowerDropPrecedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AF_RELATED_SERVICES__AF_LOWER_DROP_PRECEDENCE, oldAFLowerDropPrecedence, afLowerDropPrecedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AFService getAFHigherDropPrecedence() {
		if (afHigherDropPrecedence != null && afHigherDropPrecedence.eIsProxy()) {
			InternalEObject oldAFHigherDropPrecedence = (InternalEObject)afHigherDropPrecedence;
			afHigherDropPrecedence = (CIM_AFService)eResolveProxy(oldAFHigherDropPrecedence);
			if (afHigherDropPrecedence != oldAFHigherDropPrecedence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_AF_RELATED_SERVICES__AF_HIGHER_DROP_PRECEDENCE, oldAFHigherDropPrecedence, afHigherDropPrecedence));
			}
		}
		return afHigherDropPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_AFService basicGetAFHigherDropPrecedence() {
		return afHigherDropPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAFHigherDropPrecedence(CIM_AFService newAFHigherDropPrecedence) {
		CIM_AFService oldAFHigherDropPrecedence = afHigherDropPrecedence;
		afHigherDropPrecedence = newAFHigherDropPrecedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AF_RELATED_SERVICES__AF_HIGHER_DROP_PRECEDENCE, oldAFHigherDropPrecedence, afHigherDropPrecedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AF_RELATED_SERVICES__AF_LOWER_DROP_PRECEDENCE:
				if (resolve) return getAFLowerDropPrecedence();
				return basicGetAFLowerDropPrecedence();
			case CimPackage.CIM_AF_RELATED_SERVICES__AF_HIGHER_DROP_PRECEDENCE:
				if (resolve) return getAFHigherDropPrecedence();
				return basicGetAFHigherDropPrecedence();
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
			case CimPackage.CIM_AF_RELATED_SERVICES__AF_LOWER_DROP_PRECEDENCE:
				setAFLowerDropPrecedence((CIM_AFService)newValue);
				return;
			case CimPackage.CIM_AF_RELATED_SERVICES__AF_HIGHER_DROP_PRECEDENCE:
				setAFHigherDropPrecedence((CIM_AFService)newValue);
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
			case CimPackage.CIM_AF_RELATED_SERVICES__AF_LOWER_DROP_PRECEDENCE:
				setAFLowerDropPrecedence((CIM_AFService)null);
				return;
			case CimPackage.CIM_AF_RELATED_SERVICES__AF_HIGHER_DROP_PRECEDENCE:
				setAFHigherDropPrecedence((CIM_AFService)null);
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
			case CimPackage.CIM_AF_RELATED_SERVICES__AF_LOWER_DROP_PRECEDENCE:
				return afLowerDropPrecedence != null;
			case CimPackage.CIM_AF_RELATED_SERVICES__AF_HIGHER_DROP_PRECEDENCE:
				return afHigherDropPrecedence != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_AFRelatedServicesImpl
