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

import gov.nist.csrc.ns.oscal.AssessmentAssets;
import gov.nist.csrc.ns.oscal.AssessmentPlatform;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.SystemComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Assets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentAssetsImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentAssetsImpl#getAssessmentPlatform <em>Assessment Platform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentAssetsImpl extends MinimalEObjectImpl.Container implements AssessmentAssets {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponent> component;

	/**
	 * The cached value of the '{@link #getAssessmentPlatform() <em>Assessment Platform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList<AssessmentPlatform> assessmentPlatform;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentAssetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getAssessmentAssets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<SystemComponent>(SystemComponent.class, this, OSCALPackage.ASSESSMENT_ASSETS__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentPlatform> getAssessmentPlatform() {
		if (assessmentPlatform == null) {
			assessmentPlatform = new EObjectContainmentEList<AssessmentPlatform>(AssessmentPlatform.class, this, OSCALPackage.ASSESSMENT_ASSETS__ASSESSMENT_PLATFORM);
		}
		return assessmentPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_ASSETS__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_ASSETS__ASSESSMENT_PLATFORM:
				return ((InternalEList<?>)getAssessmentPlatform()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.ASSESSMENT_ASSETS__COMPONENT:
				return getComponent();
			case OSCALPackage.ASSESSMENT_ASSETS__ASSESSMENT_PLATFORM:
				return getAssessmentPlatform();
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
			case OSCALPackage.ASSESSMENT_ASSETS__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends SystemComponent>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_ASSETS__ASSESSMENT_PLATFORM:
				getAssessmentPlatform().clear();
				getAssessmentPlatform().addAll((Collection<? extends AssessmentPlatform>)newValue);
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
			case OSCALPackage.ASSESSMENT_ASSETS__COMPONENT:
				getComponent().clear();
				return;
			case OSCALPackage.ASSESSMENT_ASSETS__ASSESSMENT_PLATFORM:
				getAssessmentPlatform().clear();
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
			case OSCALPackage.ASSESSMENT_ASSETS__COMPONENT:
				return component != null && !component.isEmpty();
			case OSCALPackage.ASSESSMENT_ASSETS__ASSESSMENT_PLATFORM:
				return assessmentPlatform != null && !assessmentPlatform.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssessmentAssetsImpl
