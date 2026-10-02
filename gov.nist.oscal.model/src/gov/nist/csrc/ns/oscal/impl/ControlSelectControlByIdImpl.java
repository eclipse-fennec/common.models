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

import gov.nist.csrc.ns.oscal.ControlSelectControlById;
import gov.nist.csrc.ns.oscal.Matching;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Select Control By Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectControlByIdImpl#getWithId <em>With Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectControlByIdImpl#getMatching <em>Matching</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectControlByIdImpl#getWithChildControls <em>With Child Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSelectControlByIdImpl extends MinimalEObjectImpl.Container implements ControlSelectControlById {
	/**
	 * The cached value of the '{@link #getWithId() <em>With Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> withId;

	/**
	 * The cached value of the '{@link #getMatching() <em>Matching</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatching()
	 * @generated
	 * @ordered
	 */
	protected EList<Matching> matching;

	/**
	 * The default value of the '{@link #getWithChildControls() <em>With Child Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithChildControls()
	 * @generated
	 * @ordered
	 */
	protected static final String WITH_CHILD_CONTROLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithChildControls() <em>With Child Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithChildControls()
	 * @generated
	 * @ordered
	 */
	protected String withChildControls = WITH_CHILD_CONTROLS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSelectControlByIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getControlSelectControlById();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getWithId() {
		if (withId == null) {
			withId = new EDataTypeEList<String>(String.class, this, OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_ID);
		}
		return withId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Matching> getMatching() {
		if (matching == null) {
			matching = new EObjectContainmentEList<Matching>(Matching.class, this, OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__MATCHING);
		}
		return matching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWithChildControls() {
		return withChildControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWithChildControls(String newWithChildControls) {
		String oldWithChildControls = withChildControls;
		withChildControls = newWithChildControls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_CHILD_CONTROLS, oldWithChildControls, withChildControls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__MATCHING:
				return ((InternalEList<?>)getMatching()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_ID:
				return getWithId();
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__MATCHING:
				return getMatching();
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_CHILD_CONTROLS:
				return getWithChildControls();
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
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_ID:
				getWithId().clear();
				getWithId().addAll((Collection<? extends String>)newValue);
				return;
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__MATCHING:
				getMatching().clear();
				getMatching().addAll((Collection<? extends Matching>)newValue);
				return;
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_CHILD_CONTROLS:
				setWithChildControls((String)newValue);
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
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_ID:
				getWithId().clear();
				return;
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__MATCHING:
				getMatching().clear();
				return;
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_CHILD_CONTROLS:
				setWithChildControls(WITH_CHILD_CONTROLS_EDEFAULT);
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
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_ID:
				return withId != null && !withId.isEmpty();
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__MATCHING:
				return matching != null && !matching.isEmpty();
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID__WITH_CHILD_CONTROLS:
				return WITH_CHILD_CONTROLS_EDEFAULT == null ? withChildControls != null : !WITH_CHILD_CONTROLS_EDEFAULT.equals(withChildControls);
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
		result.append(" (withId: ");
		result.append(withId);
		result.append(", withChildControls: ");
		result.append(withChildControls);
		result.append(')');
		return result.toString();
	}

} //ControlSelectControlByIdImpl
