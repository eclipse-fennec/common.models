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

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_Service;
import org.dmtf.cim.CIM_ServiceAvailableToElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Service Available To Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAvailableToElementImpl#getServiceProvided <em>Service Provided</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAvailableToElementImpl#getUserOfService <em>User Of Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ServiceAvailableToElementImpl extends MinimalEObjectImpl.Container implements CIM_ServiceAvailableToElement {
	/**
	 * The cached value of the '{@link #getServiceProvided() <em>Service Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvided()
	 * @generated
	 * @ordered
	 */
	protected CIM_Service serviceProvided;

	/**
	 * The cached value of the '{@link #getUserOfService() <em>User Of Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserOfService()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement userOfService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ServiceAvailableToElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ServiceAvailableToElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Service getServiceProvided() {
		if (serviceProvided != null && serviceProvided.eIsProxy()) {
			InternalEObject oldServiceProvided = (InternalEObject)serviceProvided;
			serviceProvided = (CIM_Service)eResolveProxy(oldServiceProvided);
			if (serviceProvided != oldServiceProvided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__SERVICE_PROVIDED, oldServiceProvided, serviceProvided));
			}
		}
		return serviceProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Service basicGetServiceProvided() {
		return serviceProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceProvided(CIM_Service newServiceProvided) {
		CIM_Service oldServiceProvided = serviceProvided;
		serviceProvided = newServiceProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__SERVICE_PROVIDED, oldServiceProvided, serviceProvided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getUserOfService() {
		if (userOfService != null && userOfService.eIsProxy()) {
			InternalEObject oldUserOfService = (InternalEObject)userOfService;
			userOfService = (CIM_ManagedElement)eResolveProxy(oldUserOfService);
			if (userOfService != oldUserOfService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__USER_OF_SERVICE, oldUserOfService, userOfService));
			}
		}
		return userOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetUserOfService() {
		return userOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserOfService(CIM_ManagedElement newUserOfService) {
		CIM_ManagedElement oldUserOfService = userOfService;
		userOfService = newUserOfService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__USER_OF_SERVICE, oldUserOfService, userOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__SERVICE_PROVIDED:
				if (resolve) return getServiceProvided();
				return basicGetServiceProvided();
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__USER_OF_SERVICE:
				if (resolve) return getUserOfService();
				return basicGetUserOfService();
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
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__SERVICE_PROVIDED:
				setServiceProvided((CIM_Service)newValue);
				return;
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__USER_OF_SERVICE:
				setUserOfService((CIM_ManagedElement)newValue);
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
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__SERVICE_PROVIDED:
				setServiceProvided((CIM_Service)null);
				return;
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__USER_OF_SERVICE:
				setUserOfService((CIM_ManagedElement)null);
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
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__SERVICE_PROVIDED:
				return serviceProvided != null;
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT__USER_OF_SERVICE:
				return userOfService != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_ServiceAvailableToElementImpl
