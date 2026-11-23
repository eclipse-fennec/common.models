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

import org.dmtf.cim.CIM_AvailableDiagnosticService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Available Diagnostic Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AvailableDiagnosticServiceImpl#getEstimatedDurationOfService <em>Estimated Duration Of Service</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AvailableDiagnosticServiceImpl#getEstimatedDurationQualifier <em>Estimated Duration Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AvailableDiagnosticServiceImpl extends CIM_ServiceAvailableToElementImpl implements CIM_AvailableDiagnosticService {
	/**
	 * The default value of the '{@link #getEstimatedDurationOfService() <em>Estimated Duration Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDurationOfService()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ESTIMATED_DURATION_OF_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedDurationOfService() <em>Estimated Duration Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDurationOfService()
	 * @generated
	 * @ordered
	 */
	protected Integer estimatedDurationOfService = ESTIMATED_DURATION_OF_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedDurationQualifier() <em>Estimated Duration Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDurationQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final Long ESTIMATED_DURATION_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedDurationQualifier() <em>Estimated Duration Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDurationQualifier()
	 * @generated
	 * @ordered
	 */
	protected Long estimatedDurationQualifier = ESTIMATED_DURATION_QUALIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AvailableDiagnosticServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AvailableDiagnosticService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEstimatedDurationOfService() {
		return estimatedDurationOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDurationOfService(Integer newEstimatedDurationOfService) {
		Integer oldEstimatedDurationOfService = estimatedDurationOfService;
		estimatedDurationOfService = newEstimatedDurationOfService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_OF_SERVICE, oldEstimatedDurationOfService, estimatedDurationOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEstimatedDurationQualifier() {
		return estimatedDurationQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDurationQualifier(Long newEstimatedDurationQualifier) {
		Long oldEstimatedDurationQualifier = estimatedDurationQualifier;
		estimatedDurationQualifier = newEstimatedDurationQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_QUALIFIER, oldEstimatedDurationQualifier, estimatedDurationQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_OF_SERVICE:
				return getEstimatedDurationOfService();
			case CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_QUALIFIER:
				return getEstimatedDurationQualifier();
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
			case CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_OF_SERVICE:
				setEstimatedDurationOfService((Integer)newValue);
				return;
			case CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_QUALIFIER:
				setEstimatedDurationQualifier((Long)newValue);
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
			case CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_OF_SERVICE:
				setEstimatedDurationOfService(ESTIMATED_DURATION_OF_SERVICE_EDEFAULT);
				return;
			case CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_QUALIFIER:
				setEstimatedDurationQualifier(ESTIMATED_DURATION_QUALIFIER_EDEFAULT);
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
			case CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_OF_SERVICE:
				return ESTIMATED_DURATION_OF_SERVICE_EDEFAULT == null ? estimatedDurationOfService != null : !ESTIMATED_DURATION_OF_SERVICE_EDEFAULT.equals(estimatedDurationOfService);
			case CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE__ESTIMATED_DURATION_QUALIFIER:
				return ESTIMATED_DURATION_QUALIFIER_EDEFAULT == null ? estimatedDurationQualifier != null : !ESTIMATED_DURATION_QUALIFIER_EDEFAULT.equals(estimatedDurationQualifier);
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
		result.append(" (EstimatedDurationOfService: ");
		result.append(estimatedDurationOfService);
		result.append(", EstimatedDurationQualifier: ");
		result.append(estimatedDurationQualifier);
		result.append(')');
		return result.toString();
	}

} //CIM_AvailableDiagnosticServiceImpl
