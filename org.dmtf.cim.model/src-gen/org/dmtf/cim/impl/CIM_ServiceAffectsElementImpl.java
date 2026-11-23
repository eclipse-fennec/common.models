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

import java.util.Collection;

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_Service;
import org.dmtf.cim.CIM_ServiceAffectsElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Service Affects Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAffectsElementImpl#getAffectedElement <em>Affected Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAffectsElementImpl#getAffectingElement <em>Affecting Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAffectsElementImpl#getElementEffects <em>Element Effects</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAffectsElementImpl#getOtherElementEffectsDescriptions <em>Other Element Effects Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAffectsElementImpl#getAssignedSequence <em>Assigned Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ServiceAffectsElementImpl extends MinimalEObjectImpl.Container implements CIM_ServiceAffectsElement {
	/**
	 * The cached value of the '{@link #getAffectedElement() <em>Affected Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement affectedElement;

	/**
	 * The cached value of the '{@link #getAffectingElement() <em>Affecting Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectingElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_Service affectingElement;

	/**
	 * The cached value of the '{@link #getElementEffects() <em>Element Effects</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> elementEffects;

	/**
	 * The cached value of the '{@link #getOtherElementEffectsDescriptions() <em>Other Element Effects Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherElementEffectsDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherElementEffectsDescriptions;

	/**
	 * The default value of the '{@link #getAssignedSequence() <em>Assigned Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedSequence()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ASSIGNED_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedSequence() <em>Assigned Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedSequence()
	 * @generated
	 * @ordered
	 */
	protected Integer assignedSequence = ASSIGNED_SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ServiceAffectsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ServiceAffectsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getAffectedElement() {
		if (affectedElement != null && affectedElement.eIsProxy()) {
			InternalEObject oldAffectedElement = (InternalEObject)affectedElement;
			affectedElement = (CIM_ManagedElement)eResolveProxy(oldAffectedElement);
			if (affectedElement != oldAffectedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTED_ELEMENT, oldAffectedElement, affectedElement));
			}
		}
		return affectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetAffectedElement() {
		return affectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffectedElement(CIM_ManagedElement newAffectedElement) {
		CIM_ManagedElement oldAffectedElement = affectedElement;
		affectedElement = newAffectedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTED_ELEMENT, oldAffectedElement, affectedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Service getAffectingElement() {
		if (affectingElement != null && affectingElement.eIsProxy()) {
			InternalEObject oldAffectingElement = (InternalEObject)affectingElement;
			affectingElement = (CIM_Service)eResolveProxy(oldAffectingElement);
			if (affectingElement != oldAffectingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTING_ELEMENT, oldAffectingElement, affectingElement));
			}
		}
		return affectingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Service basicGetAffectingElement() {
		return affectingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffectingElement(CIM_Service newAffectingElement) {
		CIM_Service oldAffectingElement = affectingElement;
		affectingElement = newAffectingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTING_ELEMENT, oldAffectingElement, affectingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getElementEffects() {
		if (elementEffects == null) {
			elementEffects = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ELEMENT_EFFECTS);
		}
		return elementEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherElementEffectsDescriptions() {
		if (otherElementEffectsDescriptions == null) {
			otherElementEffectsDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__OTHER_ELEMENT_EFFECTS_DESCRIPTIONS);
		}
		return otherElementEffectsDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAssignedSequence() {
		return assignedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedSequence(Integer newAssignedSequence) {
		Integer oldAssignedSequence = assignedSequence;
		assignedSequence = newAssignedSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ASSIGNED_SEQUENCE, oldAssignedSequence, assignedSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTED_ELEMENT:
				if (resolve) return getAffectedElement();
				return basicGetAffectedElement();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTING_ELEMENT:
				if (resolve) return getAffectingElement();
				return basicGetAffectingElement();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ELEMENT_EFFECTS:
				return getElementEffects();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__OTHER_ELEMENT_EFFECTS_DESCRIPTIONS:
				return getOtherElementEffectsDescriptions();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ASSIGNED_SEQUENCE:
				return getAssignedSequence();
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
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTED_ELEMENT:
				setAffectedElement((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTING_ELEMENT:
				setAffectingElement((CIM_Service)newValue);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ELEMENT_EFFECTS:
				getElementEffects().clear();
				getElementEffects().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__OTHER_ELEMENT_EFFECTS_DESCRIPTIONS:
				getOtherElementEffectsDescriptions().clear();
				getOtherElementEffectsDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ASSIGNED_SEQUENCE:
				setAssignedSequence((Integer)newValue);
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
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTED_ELEMENT:
				setAffectedElement((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTING_ELEMENT:
				setAffectingElement((CIM_Service)null);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ELEMENT_EFFECTS:
				getElementEffects().clear();
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__OTHER_ELEMENT_EFFECTS_DESCRIPTIONS:
				getOtherElementEffectsDescriptions().clear();
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ASSIGNED_SEQUENCE:
				setAssignedSequence(ASSIGNED_SEQUENCE_EDEFAULT);
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
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTED_ELEMENT:
				return affectedElement != null;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__AFFECTING_ELEMENT:
				return affectingElement != null;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ELEMENT_EFFECTS:
				return elementEffects != null && !elementEffects.isEmpty();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__OTHER_ELEMENT_EFFECTS_DESCRIPTIONS:
				return otherElementEffectsDescriptions != null && !otherElementEffectsDescriptions.isEmpty();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT__ASSIGNED_SEQUENCE:
				return ASSIGNED_SEQUENCE_EDEFAULT == null ? assignedSequence != null : !ASSIGNED_SEQUENCE_EDEFAULT.equals(assignedSequence);
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
		result.append(" (ElementEffects: ");
		result.append(elementEffects);
		result.append(", OtherElementEffectsDescriptions: ");
		result.append(otherElementEffectsDescriptions);
		result.append(", AssignedSequence: ");
		result.append(assignedSequence);
		result.append(')');
		return result.toString();
	}

} //CIM_ServiceAffectsElementImpl
