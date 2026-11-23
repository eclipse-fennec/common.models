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

import org.dmtf.prs.PRS_Problem;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_ProblemImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ProblemImpl#getImpact <em>Impact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_ProblemImpl extends PRS_SolutionElementImpl implements PRS_Problem {
	/**
	 * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LIKELIHOOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected Integer likelihood = LIKELIHOOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IMPACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected Integer impact = IMPACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_ProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLikelihood() {
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLikelihood(Integer newLikelihood) {
		Integer oldLikelihood = likelihood;
		likelihood = newLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_PROBLEM__LIKELIHOOD, oldLikelihood, likelihood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getImpact() {
		return impact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpact(Integer newImpact) {
		Integer oldImpact = impact;
		impact = newImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_PROBLEM__IMPACT, oldImpact, impact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_PROBLEM__LIKELIHOOD:
				return getLikelihood();
			case PrsPackage.PRS_PROBLEM__IMPACT:
				return getImpact();
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
			case PrsPackage.PRS_PROBLEM__LIKELIHOOD:
				setLikelihood((Integer)newValue);
				return;
			case PrsPackage.PRS_PROBLEM__IMPACT:
				setImpact((Integer)newValue);
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
			case PrsPackage.PRS_PROBLEM__LIKELIHOOD:
				setLikelihood(LIKELIHOOD_EDEFAULT);
				return;
			case PrsPackage.PRS_PROBLEM__IMPACT:
				setImpact(IMPACT_EDEFAULT);
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
			case PrsPackage.PRS_PROBLEM__LIKELIHOOD:
				return LIKELIHOOD_EDEFAULT == null ? likelihood != null : !LIKELIHOOD_EDEFAULT.equals(likelihood);
			case PrsPackage.PRS_PROBLEM__IMPACT:
				return IMPACT_EDEFAULT == null ? impact != null : !IMPACT_EDEFAULT.equals(impact);
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
		result.append(" (Likelihood: ");
		result.append(likelihood);
		result.append(", Impact: ");
		result.append(impact);
		result.append(')');
		return result.toString();
	}

} //PRS_ProblemImpl
