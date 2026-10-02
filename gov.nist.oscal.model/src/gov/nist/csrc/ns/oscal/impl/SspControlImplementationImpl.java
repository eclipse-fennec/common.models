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

import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.SetParameter;
import gov.nist.csrc.ns.oscal.SspControlImplementation;
import gov.nist.csrc.ns.oscal.SspImplementedRequirement;

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
 * An implementation of the model object '<em><b>Ssp Control Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspControlImplementationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspControlImplementationImpl#getSetParameter <em>Set Parameter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspControlImplementationImpl#getImplementedRequirement <em>Implemented Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SspControlImplementationImpl extends MinimalEObjectImpl.Container implements SspControlImplementation {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype description;

	/**
	 * The cached value of the '{@link #getSetParameter() <em>Set Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<SetParameter> setParameter;

	/**
	 * The cached value of the '{@link #getImplementedRequirement() <em>Implemented Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<SspImplementedRequirement> implementedRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SspControlImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getSspControlImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(MarkupMultilineDatatype newDescription, NotificationChain msgs) {
		MarkupMultilineDatatype oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SSP_CONTROL_IMPLEMENTATION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(MarkupMultilineDatatype newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SSP_CONTROL_IMPLEMENTATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SSP_CONTROL_IMPLEMENTATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SSP_CONTROL_IMPLEMENTATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetParameter> getSetParameter() {
		if (setParameter == null) {
			setParameter = new EObjectContainmentEList<SetParameter>(SetParameter.class, this, OSCALPackage.SSP_CONTROL_IMPLEMENTATION__SET_PARAMETER);
		}
		return setParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SspImplementedRequirement> getImplementedRequirement() {
		if (implementedRequirement == null) {
			implementedRequirement = new EObjectContainmentEList<SspImplementedRequirement>(SspImplementedRequirement.class, this, OSCALPackage.SSP_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT);
		}
		return implementedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				return ((InternalEList<?>)getSetParameter()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				return ((InternalEList<?>)getImplementedRequirement()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__DESCRIPTION:
				return getDescription();
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				return getSetParameter();
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				return getImplementedRequirement();
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
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				getSetParameter().clear();
				getSetParameter().addAll((Collection<? extends SetParameter>)newValue);
				return;
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				getImplementedRequirement().clear();
				getImplementedRequirement().addAll((Collection<? extends SspImplementedRequirement>)newValue);
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
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				getSetParameter().clear();
				return;
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				getImplementedRequirement().clear();
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
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__DESCRIPTION:
				return description != null;
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				return setParameter != null && !setParameter.isEmpty();
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				return implementedRequirement != null && !implementedRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SspControlImplementationImpl
