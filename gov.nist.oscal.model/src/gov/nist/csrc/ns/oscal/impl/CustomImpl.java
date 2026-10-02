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

import gov.nist.csrc.ns.oscal.Custom;
import gov.nist.csrc.ns.oscal.InsertControls;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.ProfileGroup;

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
 * An implementation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CustomImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CustomImpl#getInsertControls <em>Insert Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomImpl extends MinimalEObjectImpl.Container implements Custom {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileGroup> group;

	/**
	 * The cached value of the '{@link #getInsertControls() <em>Insert Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertControls()
	 * @generated
	 * @ordered
	 */
	protected EList<InsertControls> insertControls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getCustom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProfileGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<ProfileGroup>(ProfileGroup.class, this, OSCALPackage.CUSTOM__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InsertControls> getInsertControls() {
		if (insertControls == null) {
			insertControls = new EObjectContainmentEList<InsertControls>(InsertControls.class, this, OSCALPackage.CUSTOM__INSERT_CONTROLS);
		}
		return insertControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.CUSTOM__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CUSTOM__INSERT_CONTROLS:
				return ((InternalEList<?>)getInsertControls()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.CUSTOM__GROUP:
				return getGroup();
			case OSCALPackage.CUSTOM__INSERT_CONTROLS:
				return getInsertControls();
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
			case OSCALPackage.CUSTOM__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends ProfileGroup>)newValue);
				return;
			case OSCALPackage.CUSTOM__INSERT_CONTROLS:
				getInsertControls().clear();
				getInsertControls().addAll((Collection<? extends InsertControls>)newValue);
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
			case OSCALPackage.CUSTOM__GROUP:
				getGroup().clear();
				return;
			case OSCALPackage.CUSTOM__INSERT_CONTROLS:
				getInsertControls().clear();
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
			case OSCALPackage.CUSTOM__GROUP:
				return group != null && !group.isEmpty();
			case OSCALPackage.CUSTOM__INSERT_CONTROLS:
				return insertControls != null && !insertControls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomImpl
