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

import org.dmtf.cim.CIM_ServiceServiceDependency;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Service Service Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceServiceDependencyImpl#getTypeOfDependency <em>Type Of Dependency</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceServiceDependencyImpl#getRestartService <em>Restart Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ServiceServiceDependencyImpl extends CIM_ProvidesServiceToElementImpl implements CIM_ServiceServiceDependency {
	/**
	 * The default value of the '{@link #getTypeOfDependency() <em>Type Of Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfDependency()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_DEPENDENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfDependency() <em>Type Of Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfDependency()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfDependency = TYPE_OF_DEPENDENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestartService() <em>Restart Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartService()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RESTART_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestartService() <em>Restart Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartService()
	 * @generated
	 * @ordered
	 */
	protected Boolean restartService = RESTART_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ServiceServiceDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ServiceServiceDependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfDependency() {
		return typeOfDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfDependency(Integer newTypeOfDependency) {
		Integer oldTypeOfDependency = typeOfDependency;
		typeOfDependency = newTypeOfDependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__TYPE_OF_DEPENDENCY, oldTypeOfDependency, typeOfDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRestartService() {
		return restartService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestartService(Boolean newRestartService) {
		Boolean oldRestartService = restartService;
		restartService = newRestartService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__RESTART_SERVICE, oldRestartService, restartService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__TYPE_OF_DEPENDENCY:
				return getTypeOfDependency();
			case CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__RESTART_SERVICE:
				return getRestartService();
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
			case CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__TYPE_OF_DEPENDENCY:
				setTypeOfDependency((Integer)newValue);
				return;
			case CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__RESTART_SERVICE:
				setRestartService((Boolean)newValue);
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
			case CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__TYPE_OF_DEPENDENCY:
				setTypeOfDependency(TYPE_OF_DEPENDENCY_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__RESTART_SERVICE:
				setRestartService(RESTART_SERVICE_EDEFAULT);
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
			case CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__TYPE_OF_DEPENDENCY:
				return TYPE_OF_DEPENDENCY_EDEFAULT == null ? typeOfDependency != null : !TYPE_OF_DEPENDENCY_EDEFAULT.equals(typeOfDependency);
			case CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY__RESTART_SERVICE:
				return RESTART_SERVICE_EDEFAULT == null ? restartService != null : !RESTART_SERVICE_EDEFAULT.equals(restartService);
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
		result.append(" (TypeOfDependency: ");
		result.append(typeOfDependency);
		result.append(", RestartService: ");
		result.append(restartService);
		result.append(')');
		return result.toString();
	}

} //CIM_ServiceServiceDependencyImpl
