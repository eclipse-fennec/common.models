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

import org.dmtf.cim.CIM_RelatedElementCausingError;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Related Element Causing Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RelatedElementCausingErrorImpl#getFailureRelationshipInitiated <em>Failure Relationship Initiated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RelatedElementCausingErrorImpl#getEffectCorrelation <em>Effect Correlation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RelatedElementCausingErrorImpl#getRanking <em>Ranking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RelatedElementCausingErrorImpl extends CIM_DependencyImpl implements CIM_RelatedElementCausingError {
	/**
	 * The default value of the '{@link #getFailureRelationshipInitiated() <em>Failure Relationship Initiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRelationshipInitiated()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_RELATIONSHIP_INITIATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureRelationshipInitiated() <em>Failure Relationship Initiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRelationshipInitiated()
	 * @generated
	 * @ordered
	 */
	protected String failureRelationshipInitiated = FAILURE_RELATIONSHIP_INITIATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectCorrelation() <em>Effect Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectCorrelation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EFFECT_CORRELATION_EDEFAULT = Integer.valueOf(10);

	/**
	 * The cached value of the '{@link #getEffectCorrelation() <em>Effect Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectCorrelation()
	 * @generated
	 * @ordered
	 */
	protected Integer effectCorrelation = EFFECT_CORRELATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRanking() <em>Ranking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanking()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RANKING_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getRanking() <em>Ranking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanking()
	 * @generated
	 * @ordered
	 */
	protected Integer ranking = RANKING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RelatedElementCausingErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RelatedElementCausingError();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFailureRelationshipInitiated() {
		return failureRelationshipInitiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureRelationshipInitiated(String newFailureRelationshipInitiated) {
		String oldFailureRelationshipInitiated = failureRelationshipInitiated;
		failureRelationshipInitiated = newFailureRelationshipInitiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__FAILURE_RELATIONSHIP_INITIATED, oldFailureRelationshipInitiated, failureRelationshipInitiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEffectCorrelation() {
		return effectCorrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectCorrelation(Integer newEffectCorrelation) {
		Integer oldEffectCorrelation = effectCorrelation;
		effectCorrelation = newEffectCorrelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__EFFECT_CORRELATION, oldEffectCorrelation, effectCorrelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRanking() {
		return ranking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRanking(Integer newRanking) {
		Integer oldRanking = ranking;
		ranking = newRanking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__RANKING, oldRanking, ranking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__FAILURE_RELATIONSHIP_INITIATED:
				return getFailureRelationshipInitiated();
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__EFFECT_CORRELATION:
				return getEffectCorrelation();
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__RANKING:
				return getRanking();
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
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__FAILURE_RELATIONSHIP_INITIATED:
				setFailureRelationshipInitiated((String)newValue);
				return;
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__EFFECT_CORRELATION:
				setEffectCorrelation((Integer)newValue);
				return;
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__RANKING:
				setRanking((Integer)newValue);
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
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__FAILURE_RELATIONSHIP_INITIATED:
				setFailureRelationshipInitiated(FAILURE_RELATIONSHIP_INITIATED_EDEFAULT);
				return;
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__EFFECT_CORRELATION:
				setEffectCorrelation(EFFECT_CORRELATION_EDEFAULT);
				return;
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__RANKING:
				setRanking(RANKING_EDEFAULT);
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
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__FAILURE_RELATIONSHIP_INITIATED:
				return FAILURE_RELATIONSHIP_INITIATED_EDEFAULT == null ? failureRelationshipInitiated != null : !FAILURE_RELATIONSHIP_INITIATED_EDEFAULT.equals(failureRelationshipInitiated);
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__EFFECT_CORRELATION:
				return EFFECT_CORRELATION_EDEFAULT == null ? effectCorrelation != null : !EFFECT_CORRELATION_EDEFAULT.equals(effectCorrelation);
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR__RANKING:
				return RANKING_EDEFAULT == null ? ranking != null : !RANKING_EDEFAULT.equals(ranking);
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
		result.append(" (FailureRelationshipInitiated: ");
		result.append(failureRelationshipInitiated);
		result.append(", EffectCorrelation: ");
		result.append(effectCorrelation);
		result.append(", Ranking: ");
		result.append(ranking);
		result.append(')');
		return result.toString();
	}

} //CIM_RelatedElementCausingErrorImpl
