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

import gov.nist.csrc.ns.oscal.MarkupLineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.ParameterSelection;

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
 * An implementation of the model object '<em><b>Parameter Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterSelectionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterSelectionImpl#getHowMany <em>How Many</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterSelectionImpl extends MinimalEObjectImpl.Container implements ParameterSelection {
	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<MarkupLineDatatype> choice;

	/**
	 * The default value of the '{@link #getHowMany() <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowMany()
	 * @generated
	 * @ordered
	 */
	protected static final String HOW_MANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHowMany() <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowMany()
	 * @generated
	 * @ordered
	 */
	protected String howMany = HOW_MANY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getParameterSelection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupLineDatatype> getChoice() {
		if (choice == null) {
			choice = new EObjectContainmentEList<MarkupLineDatatype>(MarkupLineDatatype.class, this, OSCALPackage.PARAMETER_SELECTION__CHOICE);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHowMany() {
		return howMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHowMany(String newHowMany) {
		String oldHowMany = howMany;
		howMany = newHowMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARAMETER_SELECTION__HOW_MANY, oldHowMany, howMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.PARAMETER_SELECTION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.PARAMETER_SELECTION__CHOICE:
				return getChoice();
			case OSCALPackage.PARAMETER_SELECTION__HOW_MANY:
				return getHowMany();
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
			case OSCALPackage.PARAMETER_SELECTION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends MarkupLineDatatype>)newValue);
				return;
			case OSCALPackage.PARAMETER_SELECTION__HOW_MANY:
				setHowMany((String)newValue);
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
			case OSCALPackage.PARAMETER_SELECTION__CHOICE:
				getChoice().clear();
				return;
			case OSCALPackage.PARAMETER_SELECTION__HOW_MANY:
				setHowMany(HOW_MANY_EDEFAULT);
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
			case OSCALPackage.PARAMETER_SELECTION__CHOICE:
				return choice != null && !choice.isEmpty();
			case OSCALPackage.PARAMETER_SELECTION__HOW_MANY:
				return HOW_MANY_EDEFAULT == null ? howMany != null : !HOW_MANY_EDEFAULT.equals(howMany);
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
		result.append(" (howMany: ");
		result.append(howMany);
		result.append(')');
		return result.toString();
	}

} //ParameterSelectionImpl
