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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.SecurityImpactLevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Impact Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SecurityImpactLevelImpl#getSecurityObjectiveConfidentiality <em>Security Objective Confidentiality</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SecurityImpactLevelImpl#getSecurityObjectiveIntegrity <em>Security Objective Integrity</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SecurityImpactLevelImpl#getSecurityObjectiveAvailability <em>Security Objective Availability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityImpactLevelImpl extends MinimalEObjectImpl.Container implements SecurityImpactLevel {
	/**
	 * The default value of the '{@link #getSecurityObjectiveConfidentiality() <em>Security Objective Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityObjectiveConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_OBJECTIVE_CONFIDENTIALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityObjectiveConfidentiality() <em>Security Objective Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityObjectiveConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected String securityObjectiveConfidentiality = SECURITY_OBJECTIVE_CONFIDENTIALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityObjectiveIntegrity() <em>Security Objective Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityObjectiveIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_OBJECTIVE_INTEGRITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityObjectiveIntegrity() <em>Security Objective Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityObjectiveIntegrity()
	 * @generated
	 * @ordered
	 */
	protected String securityObjectiveIntegrity = SECURITY_OBJECTIVE_INTEGRITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityObjectiveAvailability() <em>Security Objective Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityObjectiveAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_OBJECTIVE_AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityObjectiveAvailability() <em>Security Objective Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityObjectiveAvailability()
	 * @generated
	 * @ordered
	 */
	protected String securityObjectiveAvailability = SECURITY_OBJECTIVE_AVAILABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityImpactLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getSecurityImpactLevel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityObjectiveConfidentiality() {
		return securityObjectiveConfidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityObjectiveConfidentiality(String newSecurityObjectiveConfidentiality) {
		String oldSecurityObjectiveConfidentiality = securityObjectiveConfidentiality;
		securityObjectiveConfidentiality = newSecurityObjectiveConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_CONFIDENTIALITY, oldSecurityObjectiveConfidentiality, securityObjectiveConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityObjectiveIntegrity() {
		return securityObjectiveIntegrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityObjectiveIntegrity(String newSecurityObjectiveIntegrity) {
		String oldSecurityObjectiveIntegrity = securityObjectiveIntegrity;
		securityObjectiveIntegrity = newSecurityObjectiveIntegrity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_INTEGRITY, oldSecurityObjectiveIntegrity, securityObjectiveIntegrity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityObjectiveAvailability() {
		return securityObjectiveAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityObjectiveAvailability(String newSecurityObjectiveAvailability) {
		String oldSecurityObjectiveAvailability = securityObjectiveAvailability;
		securityObjectiveAvailability = newSecurityObjectiveAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_AVAILABILITY, oldSecurityObjectiveAvailability, securityObjectiveAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_CONFIDENTIALITY:
				return getSecurityObjectiveConfidentiality();
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_INTEGRITY:
				return getSecurityObjectiveIntegrity();
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_AVAILABILITY:
				return getSecurityObjectiveAvailability();
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
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_CONFIDENTIALITY:
				setSecurityObjectiveConfidentiality((String)newValue);
				return;
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_INTEGRITY:
				setSecurityObjectiveIntegrity((String)newValue);
				return;
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_AVAILABILITY:
				setSecurityObjectiveAvailability((String)newValue);
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
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_CONFIDENTIALITY:
				setSecurityObjectiveConfidentiality(SECURITY_OBJECTIVE_CONFIDENTIALITY_EDEFAULT);
				return;
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_INTEGRITY:
				setSecurityObjectiveIntegrity(SECURITY_OBJECTIVE_INTEGRITY_EDEFAULT);
				return;
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_AVAILABILITY:
				setSecurityObjectiveAvailability(SECURITY_OBJECTIVE_AVAILABILITY_EDEFAULT);
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
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_CONFIDENTIALITY:
				return SECURITY_OBJECTIVE_CONFIDENTIALITY_EDEFAULT == null ? securityObjectiveConfidentiality != null : !SECURITY_OBJECTIVE_CONFIDENTIALITY_EDEFAULT.equals(securityObjectiveConfidentiality);
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_INTEGRITY:
				return SECURITY_OBJECTIVE_INTEGRITY_EDEFAULT == null ? securityObjectiveIntegrity != null : !SECURITY_OBJECTIVE_INTEGRITY_EDEFAULT.equals(securityObjectiveIntegrity);
			case OSCALPackage.SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_AVAILABILITY:
				return SECURITY_OBJECTIVE_AVAILABILITY_EDEFAULT == null ? securityObjectiveAvailability != null : !SECURITY_OBJECTIVE_AVAILABILITY_EDEFAULT.equals(securityObjectiveAvailability);
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
		result.append(" (securityObjectiveConfidentiality: ");
		result.append(securityObjectiveConfidentiality);
		result.append(", securityObjectiveIntegrity: ");
		result.append(securityObjectiveIntegrity);
		result.append(", securityObjectiveAvailability: ");
		result.append(securityObjectiveAvailability);
		result.append(')');
		return result.toString();
	}

} //SecurityImpactLevelImpl
