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
import gov.nist.csrc.ns.oscal.InventoryItem;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.PoamLocalDefinitions;
import gov.nist.csrc.ns.oscal.SystemComponent;

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
 * An implementation of the model object '<em><b>Poam Local Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamLocalDefinitionsImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamLocalDefinitionsImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamLocalDefinitionsImpl#getAssessmentAssets <em>Assessment Assets</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamLocalDefinitionsImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoamLocalDefinitionsImpl extends MinimalEObjectImpl.Container implements PoamLocalDefinitions {
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
	 * The cached value of the '{@link #getInventoryItem() <em>Inventory Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItem()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryItem> inventoryItem;

	/**
	 * The cached value of the '{@link #getAssessmentAssets() <em>Assessment Assets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAssets()
	 * @generated
	 * @ordered
	 */
	protected AssessmentAssets assessmentAssets;

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
	protected PoamLocalDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getPoamLocalDefinitions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<SystemComponent>(SystemComponent.class, this, OSCALPackage.POAM_LOCAL_DEFINITIONS__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InventoryItem> getInventoryItem() {
		if (inventoryItem == null) {
			inventoryItem = new EObjectContainmentEList<InventoryItem>(InventoryItem.class, this, OSCALPackage.POAM_LOCAL_DEFINITIONS__INVENTORY_ITEM);
		}
		return inventoryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAssets getAssessmentAssets() {
		return assessmentAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessmentAssets(AssessmentAssets newAssessmentAssets, NotificationChain msgs) {
		AssessmentAssets oldAssessmentAssets = assessmentAssets;
		assessmentAssets = newAssessmentAssets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS, oldAssessmentAssets, newAssessmentAssets);
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
	public void setAssessmentAssets(AssessmentAssets newAssessmentAssets) {
		if (newAssessmentAssets != assessmentAssets) {
			NotificationChain msgs = null;
			if (assessmentAssets != null)
				msgs = ((InternalEObject)assessmentAssets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS, null, msgs);
			if (newAssessmentAssets != null)
				msgs = ((InternalEObject)newAssessmentAssets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS, null, msgs);
			msgs = basicSetAssessmentAssets(newAssessmentAssets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS, newAssessmentAssets, newAssessmentAssets));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_LOCAL_DEFINITIONS__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				return ((InternalEList<?>)getInventoryItem()).basicRemove(otherEnd, msgs);
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				return basicSetAssessmentAssets(null, msgs);
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
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__COMPONENT:
				return getComponent();
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				return getInventoryItem();
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				return getAssessmentAssets();
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__REMARKS:
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
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends SystemComponent>)newValue);
				return;
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				getInventoryItem().clear();
				getInventoryItem().addAll((Collection<? extends InventoryItem>)newValue);
				return;
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				setAssessmentAssets((AssessmentAssets)newValue);
				return;
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__REMARKS:
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
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__COMPONENT:
				getComponent().clear();
				return;
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				getInventoryItem().clear();
				return;
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				setAssessmentAssets((AssessmentAssets)null);
				return;
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__REMARKS:
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
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__COMPONENT:
				return component != null && !component.isEmpty();
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				return inventoryItem != null && !inventoryItem.isEmpty();
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				return assessmentAssets != null;
			case OSCALPackage.POAM_LOCAL_DEFINITIONS__REMARKS:
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

} //PoamLocalDefinitionsImpl
