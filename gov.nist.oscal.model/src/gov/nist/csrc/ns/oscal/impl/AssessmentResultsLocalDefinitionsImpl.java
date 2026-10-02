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

import gov.nist.csrc.ns.oscal.Activity;
import gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions;
import gov.nist.csrc.ns.oscal.LocalObjective;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Results Local Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsLocalDefinitionsImpl#getObjectivesAndMethods <em>Objectives And Methods</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsLocalDefinitionsImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsLocalDefinitionsImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentResultsLocalDefinitionsImpl extends MinimalEObjectImpl.Container implements AssessmentResultsLocalDefinitions {
	/**
	 * The cached value of the '{@link #getObjectivesAndMethods() <em>Objectives And Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectivesAndMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalObjective> objectivesAndMethods;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentResultsLocalDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getAssessmentResultsLocalDefinitions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalObjective> getObjectivesAndMethods() {
		if (objectivesAndMethods == null) {
			objectivesAndMethods = new EObjectContainmentEList<LocalObjective>(LocalObjective.class, this, OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__OBJECTIVES_AND_METHODS);
		}
		return objectivesAndMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<Activity>(Activity.class, this, OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__OBJECTIVES_AND_METHODS:
				return ((InternalEList<?>)getObjectivesAndMethods()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__OBJECTIVES_AND_METHODS:
				return getObjectivesAndMethods();
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__ACTIVITY:
				return getActivity();
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__REMARKS:
				return getRemarks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__OBJECTIVES_AND_METHODS:
				getObjectivesAndMethods().clear();
				getObjectivesAndMethods().addAll((Collection<? extends LocalObjective>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__REMARKS:
				setRemarks((String)newValue);
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
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__OBJECTIVES_AND_METHODS:
				getObjectivesAndMethods().clear();
				return;
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__ACTIVITY:
				getActivity().clear();
				return;
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
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
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__OBJECTIVES_AND_METHODS:
				return objectivesAndMethods != null && !objectivesAndMethods.isEmpty();
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
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
		result.append(" (remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //AssessmentResultsLocalDefinitionsImpl
