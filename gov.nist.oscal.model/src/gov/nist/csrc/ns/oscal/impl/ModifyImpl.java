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

import gov.nist.csrc.ns.oscal.Alter;
import gov.nist.csrc.ns.oscal.Modify;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.ProfileSetParameter;

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
 * An implementation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ModifyImpl#getSetParameter <em>Set Parameter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ModifyImpl#getAlter <em>Alter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyImpl extends MinimalEObjectImpl.Container implements Modify {
	/**
	 * The cached value of the '{@link #getSetParameter() <em>Set Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileSetParameter> setParameter;

	/**
	 * The cached value of the '{@link #getAlter() <em>Alter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlter()
	 * @generated
	 * @ordered
	 */
	protected EList<Alter> alter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getModify();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProfileSetParameter> getSetParameter() {
		if (setParameter == null) {
			setParameter = new EObjectContainmentEList<ProfileSetParameter>(ProfileSetParameter.class, this, OSCALPackage.MODIFY__SET_PARAMETER);
		}
		return setParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Alter> getAlter() {
		if (alter == null) {
			alter = new EObjectContainmentEList<Alter>(Alter.class, this, OSCALPackage.MODIFY__ALTER);
		}
		return alter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.MODIFY__SET_PARAMETER:
				return ((InternalEList<?>)getSetParameter()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MODIFY__ALTER:
				return ((InternalEList<?>)getAlter()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.MODIFY__SET_PARAMETER:
				return getSetParameter();
			case OSCALPackage.MODIFY__ALTER:
				return getAlter();
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
			case OSCALPackage.MODIFY__SET_PARAMETER:
				getSetParameter().clear();
				getSetParameter().addAll((Collection<? extends ProfileSetParameter>)newValue);
				return;
			case OSCALPackage.MODIFY__ALTER:
				getAlter().clear();
				getAlter().addAll((Collection<? extends Alter>)newValue);
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
			case OSCALPackage.MODIFY__SET_PARAMETER:
				getSetParameter().clear();
				return;
			case OSCALPackage.MODIFY__ALTER:
				getAlter().clear();
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
			case OSCALPackage.MODIFY__SET_PARAMETER:
				return setParameter != null && !setParameter.isEmpty();
			case OSCALPackage.MODIFY__ALTER:
				return alter != null && !alter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModifyImpl
