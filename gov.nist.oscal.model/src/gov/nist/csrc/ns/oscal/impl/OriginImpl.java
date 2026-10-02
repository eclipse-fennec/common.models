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
import gov.nist.csrc.ns.oscal.Origin;
import gov.nist.csrc.ns.oscal.OriginActor;
import gov.nist.csrc.ns.oscal.RelatedTask;

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
 * An implementation of the model object '<em><b>Origin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.OriginImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.OriginImpl#getRelatedTask <em>Related Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OriginImpl extends MinimalEObjectImpl.Container implements Origin {
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<OriginActor> actor;

	/**
	 * The cached value of the '{@link #getRelatedTask() <em>Related Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTask()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedTask> relatedTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OriginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getOrigin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OriginActor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<OriginActor>(OriginActor.class, this, OSCALPackage.ORIGIN__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedTask> getRelatedTask() {
		if (relatedTask == null) {
			relatedTask = new EObjectContainmentEList<RelatedTask>(RelatedTask.class, this, OSCALPackage.ORIGIN__RELATED_TASK);
		}
		return relatedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.ORIGIN__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ORIGIN__RELATED_TASK:
				return ((InternalEList<?>)getRelatedTask()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.ORIGIN__ACTOR:
				return getActor();
			case OSCALPackage.ORIGIN__RELATED_TASK:
				return getRelatedTask();
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
			case OSCALPackage.ORIGIN__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends OriginActor>)newValue);
				return;
			case OSCALPackage.ORIGIN__RELATED_TASK:
				getRelatedTask().clear();
				getRelatedTask().addAll((Collection<? extends RelatedTask>)newValue);
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
			case OSCALPackage.ORIGIN__ACTOR:
				getActor().clear();
				return;
			case OSCALPackage.ORIGIN__RELATED_TASK:
				getRelatedTask().clear();
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
			case OSCALPackage.ORIGIN__ACTOR:
				return actor != null && !actor.isEmpty();
			case OSCALPackage.ORIGIN__RELATED_TASK:
				return relatedTask != null && !relatedTask.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OriginImpl
